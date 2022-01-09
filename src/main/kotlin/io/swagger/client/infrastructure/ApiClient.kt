package io.swagger.client.infrastructure

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.swagger.client.infrastructure.auth.ApiKeyAuth
import io.swagger.client.infrastructure.auth.HttpBasicAuth
import io.swagger.client.infrastructure.auth.OAuth
import io.swagger.client.infrastructure.auth.OAuthFlow
import okhttp3.*
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import org.apache.oltu.oauth2.client.request.OAuthClientRequest
import org.joda.time.DateTime
import org.joda.time.LocalDate
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.io.File
import java.lang.RuntimeException
import java.util.LinkedHashMap

open class ApiClient {

    private var password: String?
    private var username: String?
    private var secret: String?
    private var clientId: String?
    private var apiKey: String?
    private var sdkGrantType: SDKGrantType
    public var baseUrl: String

    private var apiAuthorizations: Map<String, Interceptor>? = null
    private var okBuilder: OkHttpClient.Builder? = null
    private var adapterBuilder: Retrofit.Builder? = null

    companion object {
        protected const val ContentType = "Content-Type"
        protected const val Accept = "Accept"
        protected const val JsonMediaType = "application/json"
        protected const val FormDataMediaType = "multipart/form-data"
        protected const val XmlMediaType = "application/xml"

        @JvmStatic
        val client: OkHttpClient = OkHttpClient()

        @JvmStatic
        var defaultHeaders: Map<String, String> by ApplicationDelegates.setOnce(mapOf(ContentType to JsonMediaType, Accept to JsonMediaType))

        @JvmStatic
        val jsonHeaders: Map<String, String> = mapOf(ContentType to JsonMediaType, Accept to JsonMediaType)
    }

    constructor(apiClientBuilder: ApiClientBuilder) {
        this.baseUrl = apiClientBuilder.baseUrl
        this.sdkGrantType = apiClientBuilder.sdkGrantType
        this.apiKey = apiClientBuilder.apiKey
        this.clientId = apiClientBuilder.clientId
        this.secret = apiClientBuilder.secret
        this.username = apiClientBuilder.username
        this.password = apiClientBuilder.password
        initializeSdkByGrantType()
    }

    private fun initializeSdkByGrantType() {
        createDefaultAdapter()
        when (sdkGrantType) {
            SDKGrantType.PUBLIC -> {
            }
            SDKGrantType.BASIC -> {

                // Helper constructor for single basic auth or password oauth2
                // String username, String password
                val auth: Interceptor = HttpBasicAuth()
                addAuthorization(sdkGrantType.name, auth)
                this.setCredentials(clientId, secret)
            }
            SDKGrantType.PASSWORD_INITIALIZE -> {

                // Helper constructor for single password oauth2
                // String authName, String clientId, String secret, String username, String password
                val auth: Interceptor = OAuth(
                    OAuthFlow.password,
                    "$baseUrl/oauth/authorize", "$baseUrl/oauth/token", ""
                )
                addAuthorization(sdkGrantType.name, auth)
                this.getTokenEndPoint()!!
                    .setClientId(clientId)
                    .setClientSecret(secret)
                    .setUsername(username)
                    .setPassword(password)
            }
            SDKGrantType.PASSWORD -> {

                // Helper constructor for single password oauth2
                // String authName, String clientId, String secret, String username, String password
                val auth: Interceptor = OAuth(
                    OAuthFlow.password,
                    "$baseUrl/oauth/authorize", "$baseUrl/oauth/token", ""
                )
                addAuthorization(sdkGrantType.name, auth)
                this.getTokenEndPoint()!!
                    .setClientId(clientId)
                    .setClientSecret(secret)
            }
            SDKGrantType.BEARERTOKEN -> {
                val auth: Interceptor = ApiKeyAuth("header", "Authorization")
                addAuthorization(sdkGrantType.name, auth)
            }
            else -> throw RuntimeException(
                "auth name \"" + sdkGrantType.name
                    .toString() + "\" not found in available auth names"
            )
        }

    }

    private fun createDefaultAdapter() {
        this.apiAuthorizations = LinkedHashMap<String, Interceptor>()

        val gson: Gson = GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
            .registerTypeAdapter(DateTime::class.java, DateTimeTypeAdapter())
            .registerTypeAdapter(LocalDate::class.java, LocalDateTypeAdapter())
            .create()

        okBuilder = OkHttpClient.Builder()

        // [DEV NOTE: Added custom code to add interceptors for authorizations]

        // [DEV NOTE: Added custom code to add interceptors for authorizations]
        for ((_, value) in (apiAuthorizations as LinkedHashMap).entries) {
            (okBuilder as OkHttpClient.Builder).addInterceptor(value)
        }

        adapterBuilder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonCustomConverterFactory.create(gson))
    }

    protected inline fun <reified T> requestBody(content: T, mediaType: String = JsonMediaType): RequestBody =
            when {
                content is File -> RequestBody.create(mediaType.toMediaTypeOrNull(), content)

                mediaType == FormDataMediaType -> {
                    var builder = FormBody.Builder()
                    // content's type *must* be Map<String, Any>
                    @Suppress("UNCHECKED_CAST")
                    (content as Map<String, String>).forEach { key, value ->
                        builder = builder.add(key, value)
                    }
                    builder.build()
                }
                mediaType == JsonMediaType -> RequestBody.create(
                        mediaType.toMediaTypeOrNull(), Serializer.moshi.adapter(T::class.java).toJson(content)
                )
                mediaType == XmlMediaType -> TODO("xml not currently supported.")

                // TODO: this should be extended with other serializers
                else -> TODO("requestBody currently only supports JSON body and File body.")
            }

    protected inline fun <reified T : Any?> responseBody(body: ResponseBody?, mediaType: String = JsonMediaType): T? {
        if (body == null) return null
        return when (mediaType) {
            JsonMediaType -> Serializer.moshi.adapter(T::class.java).fromJson(body.source())
            else -> TODO()
        }
    }

    protected inline fun <reified T : Any?> request(requestConfig: RequestConfig, body: Any? = null): ApiInfrastructureResponse<T?> {
        val httpUrl = baseUrl.toHttpUrlOrNull() ?: throw IllegalStateException("baseUrl is invalid.")

        var urlBuilder = httpUrl.newBuilder()
                .addPathSegments(requestConfig.path.trimStart('/'))

        requestConfig.query.forEach { query ->
            query.value.forEach { queryValue ->
                urlBuilder = urlBuilder.addQueryParameter(query.key, queryValue)
            }
        }

        val url = urlBuilder.build()
        val headers = requestConfig.headers + defaultHeaders

        if (headers[ContentType] ?: "" == "") {
            throw kotlin.IllegalStateException("Missing Content-Type header. This is required.")
        }

        if (headers[Accept] ?: "" == "") {
            throw kotlin.IllegalStateException("Missing Accept header. This is required.")
        }

        // TODO: support multiple contentType,accept options here.
        val contentType = (headers[ContentType] as String).substringBefore(";").toLowerCase()
        val accept = (headers[Accept] as String).substringBefore(";").toLowerCase()

        var request: Request.Builder = when (requestConfig.method) {
            RequestMethod.DELETE -> Request.Builder().url(url as String).delete()
            RequestMethod.GET -> Request.Builder().url(url as String)
            RequestMethod.HEAD -> Request.Builder().url(url as String).head()
            RequestMethod.PATCH -> Request.Builder().url(url as String).patch(requestBody(body, contentType))
            RequestMethod.PUT -> Request.Builder().url(url as String).put(requestBody(body, contentType))
            RequestMethod.POST -> Request.Builder().url(url as String).post(requestBody(body, contentType))
            RequestMethod.OPTIONS -> Request.Builder().url(url as String).method("OPTIONS", null)
        }

        headers.forEach { header -> request = request.addHeader(header.key, header.value.toString()) }

        val realRequest = request.build()
        val response = client.newCall(realRequest).execute()

        // TODO: handle specific mapping types. e.g. Map<int, Class<?>>
        when {
            response.isRedirect -> return Redirection(
                    response.code,
                    response.headers.toMultimap()
            )
            response.isInformational -> return Informational(
                    response.message,
                    response.code,
                    response.headers.toMultimap()
            )
            response.isSuccessful -> return Success(
                    responseBody(response.body, accept),
                    response.code,
                    response.headers.toMultimap()
            )
            response.isClientError -> return ClientError(
                    response.body?.string(),
                    response.code,
                    response.headers.toMultimap()
            )
            else -> return ServerError(
                    null,
                    response.body?.string(),
                    response.code,
                    response.headers.toMultimap()
            )
        }
    }

    open fun getTokenEndPoint(): OAuthClientRequest.TokenRequestBuilder? {
        for (apiAuthorization in apiAuthorizations!!.values) {
            if (apiAuthorization is OAuth) {
                val oauth: OAuth = apiAuthorization as OAuth
                return oauth.getTokenRequestBuilder()
            }
        }
        return null
    }

    open fun addAuthorization(authName: String, authorization: Interceptor) {
        if (apiAuthorizations!!.containsKey(authName)) {
            throw RuntimeException("auth name \"$authName\" already in api authorizations")
        }
        (apiAuthorizations as LinkedHashMap<String, Interceptor>)[authName] = authorization
        okBuilder?.addInterceptor(authorization)
    }

    open fun getApiAuthorizations(): Map<String, Interceptor>? {
        return apiAuthorizations
    }

    open fun setApiAuthorizations(apiAuthorizations: Map<String, Interceptor>?) {
        this.apiAuthorizations = apiAuthorizations
    }

    override fun toString(): String {
        return "ApiClient{" +
                "baseUrl='" + baseUrl + '\'' +
                ", SDKGrandType='" + sdkGrantType + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", clientId='" + clientId + '\'' +
                ", secret='" + secret + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}'
    }

    fun setCredentials(username: String?, password: String?) {
        for (apiAuthorization in apiAuthorizations!!.values) {
            if (apiAuthorization is HttpBasicAuth) {
                val basicAuth: HttpBasicAuth = apiAuthorization as HttpBasicAuth
                basicAuth.setCredentials(username, password)
                return
            }
            if (apiAuthorization is OAuth) {
                val oauth: OAuth = apiAuthorization as OAuth
                oauth.getTokenRequestBuilder().setUsername(username).setPassword(password)
                return
            }
        }
    }

    class ApiClientBuilder(public val baseUrl: String, sdkGrantType: SDKGrantType) {
        public val sdkGrantType: SDKGrantType
        public var apiKey: String? = null
        public var clientId: String? = null
        public var secret: String? = null
        public var username: String? = null
        public var password: String? = null
        fun setApiKey(apiKey: String?): ApiClientBuilder {
            this.apiKey = apiKey
            return this
        }

        fun setClientId(clientId: String?): ApiClientBuilder {
            this.clientId = clientId
            return this
        }

        fun setSecret(secret: String?): ApiClientBuilder {
            this.secret = secret
            return this
        }

        fun setUsername(username: String?): ApiClientBuilder {
            this.username = username
            return this
        }

        fun setPassword(password: String?): ApiClientBuilder {
            this.password = password
            return this
        }

        // Return the finally constructed ApiClient object
        fun build(): ApiClient {
            val apiClient = ApiClient(this)
            validateUserObject(apiClient)
            return apiClient
        }

        private fun validateUserObject(apiClient: ApiClient) {
            // Do some basic validations to check
            // if user object does not break any assumption of system
            when (apiClient.sdkGrantType) {
                SDKGrantType.PUBLIC -> {
                }
                SDKGrantType.BASIC -> {
                    val clientId: String? = apiClient.clientId
                    val secret: String? = apiClient.secret
                    if (clientId == null || secret == null) throw RuntimeException(
                        "ClientId or Secret can not be empty on \"" + sdkGrantType.name
                            .toString() + "\" GrandType!"
                    )
                }
                SDKGrantType.PASSWORD_INITIALIZE -> {
                    val clientId: String? = apiClient.clientId
                    val secret: String? = apiClient.secret
                    val username: String? = apiClient.username
                    val password: String? = apiClient.password
                    if (clientId == null || clientId.isEmpty() || secret == null || secret.isEmpty() || username == null || username.isEmpty() || password == null || password.isEmpty()) throw RuntimeException(
                        " ClientId, Secret, Username and Password can not be empty on \"" + sdkGrantType.name
                            .toString() + "\" GrandType!"
                    )
                }
                SDKGrantType.PASSWORD -> {
                    val clientId: String? = apiClient.clientId
                    val secret: String? = apiClient.secret
                    if (clientId == null || secret == null) throw RuntimeException(
                        "ClientId or Secret can not be empty on \"" + sdkGrantType.name
                            .toString() + "\" GrandType!"
                    )
                }
            }
        }

        init {
            this.sdkGrantType = sdkGrantType
        }
    }
}