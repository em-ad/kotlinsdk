package io.swagger.client.infrastructure.auth

import io.swagger.client.utils.PublicValues
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.apache.oltu.oauth2.client.OAuthClient
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest
import org.apache.oltu.oauth2.client.request.OAuthClientRequest
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse
import org.apache.oltu.oauth2.common.exception.OAuthProblemException
import org.apache.oltu.oauth2.common.exception.OAuthSystemException
import org.apache.oltu.oauth2.common.message.types.GrantType
import org.apache.oltu.oauth2.common.token.BasicOAuthToken
import java.io.IOException
import java.net.HttpURLConnection

class OAuth(client: OkHttpClient?, requestBuilder: OAuthClientRequest.TokenRequestBuilder) : Interceptor {
    interface AccessTokenListener {
        fun notify(token: BasicOAuthToken?)
    }

    private val oauthClient: OAuthClient
    private var tokenRequestBuilder: OAuthClientRequest.TokenRequestBuilder
    private var authenticationRequestBuilder: OAuthClientRequest.AuthenticationRequestBuilder? = null
    private var accessTokenListener: AccessTokenListener? = null

    constructor(requestBuilder: OAuthClientRequest.TokenRequestBuilder) : this(OkHttpClient(), requestBuilder) {}
    constructor(
        flow: OAuthFlow?,
        authorizationUrl: String?,
        tokenUrl: String?,
        scopes: String?
    ) : this(OAuthClientRequest.tokenLocation(tokenUrl).setScope(scopes)) {
        setFlow(flow)
        authenticationRequestBuilder = OAuthClientRequest.authorizationLocation(authorizationUrl)
    }

    fun setFlow(flow: OAuthFlow?) {
        when (flow) {
            OAuthFlow.accessCode, OAuthFlow.implicit -> tokenRequestBuilder.setGrantType(GrantType.AUTHORIZATION_CODE)
            OAuthFlow.password -> tokenRequestBuilder.setGrantType(GrantType.PASSWORD)
            OAuthFlow.application -> tokenRequestBuilder.setGrantType(GrantType.CLIENT_CREDENTIALS)
            else -> {
            }
        }
    }

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        return retryingIntercept(chain, true)
    }

    @Throws(IOException::class)
    private fun retryingIntercept(
        chain: Interceptor.Chain,
        updateTokenAndRetryOnAuthorizationFailure: Boolean
    ): Response {
        val request: Request = chain.request()

        // If the request already have an authorization (eg. Basic auth), do nothing
        if (request.header("Authorization") != null) {
            return chain.proceed(request)
        }

        // If first time, get the token
        val oAuthRequest: OAuthClientRequest
        if (accessToken == null) {
            updateAccessToken(null)
        }
        return if (accessToken != null) {
            // Build the request
            val rb: Request.Builder = request.newBuilder()
            val requestAccessToken: String? = accessToken
            oAuthRequest = try {
                OAuthBearerClientRequest(request.url.toString())
                    .setAccessToken(requestAccessToken)
                    .buildHeaderMessage()
            } catch (e: OAuthSystemException) {
                throw IOException(e)
            }
            for ((key, value) in oAuthRequest.headers.entries) {
                rb.addHeader(key, value)
            }
            rb.url(oAuthRequest.locationUri)

            //Execute the request
            val response: Response = chain.proceed(rb.build())

            // 401/403 most likely indicates that access token has expired. Unless it happens two times in a row.
            if (response != null && (response.code == HttpURLConnection.HTTP_UNAUTHORIZED || response.code == HttpURLConnection.HTTP_FORBIDDEN) && updateTokenAndRetryOnAuthorizationFailure) {
                // close old request
                response.close()

                // try to refresh new accessToken by Refresh Token
                requestAccessToken?.let {
                    if (updateAccessTokenByRefreshToken(it)) {
                        return retryingIntercept(chain, false)
                    }
                }
            }
            response
        } else {
            chain.proceed(chain.request())
        }
    }

    /*
     * Returns true if the access token has been updated
     */
    @Synchronized
    @Throws(IOException::class)
    fun updateAccessToken(requestAccessToken: String?): Boolean {
        return if (accessToken == null || accessToken == requestAccessToken) {
            try {
                val accessTokenResponse: OAuthJSONAccessTokenResponse = oauthClient.accessToken(
                    tokenRequestBuilder.buildBodyMessage()
                )
                if (accessTokenResponse != null && accessTokenResponse.getAccessToken() != null) {
                    setAccessToken(accessTokenResponse.getAccessToken())
                    refreshToken = accessTokenResponse.getRefreshToken()
                    if (accessTokenListener != null) {
                        accessTokenListener!!.notify(accessTokenResponse.getOAuthToken() as BasicOAuthToken)
                    }
                    accessToken != requestAccessToken
                } else {
                    false
                }
            } catch (e: OAuthSystemException) {
                throw IOException(e)
            } catch (e: OAuthProblemException) {
                throw IOException(e)
            }
        } else true
    }

    /*
     * This method will update access token by refresh token
     */
    @Synchronized
    @Throws(IOException::class)
    fun updateAccessTokenByRefreshToken(requestAccessToken: String): Boolean {
        return if (accessToken == null || accessToken == requestAccessToken) {
            try {
                tokenRequestBuilder
                    .setGrantType(GrantType.REFRESH_TOKEN)
                    .setRefreshToken(refreshToken)
                val accessTokenResponse: OAuthJSONAccessTokenResponse = oauthClient.accessToken(
                    tokenRequestBuilder.buildBodyMessage()
                )
                if (accessTokenResponse != null && accessTokenResponse.getAccessToken() != null) {
                    setAccessToken(accessTokenResponse.getAccessToken())
                    refreshToken = accessTokenResponse.getRefreshToken()
                    if (accessTokenListener != null) {
                        accessTokenListener!!.notify(accessTokenResponse.getOAuthToken() as BasicOAuthToken)
                    }
                    accessToken != requestAccessToken
                } else {
                    false
                }
            } catch (e: OAuthSystemException) {
                throw IOException(e)
            } catch (e: OAuthProblemException) {
                throw IOException(e)
            }
        } else true
    }

    fun registerAccessTokenListener(accessTokenListener: AccessTokenListener?) {
        this.accessTokenListener = accessTokenListener
    }

    @get:Synchronized
    val accessToken: String?
        get() = PublicValues.ACCESS_TOKEN

    @Synchronized
    fun setAccessToken(accessToken: String) {
        PublicValues.ACCESS_TOKEN = accessToken
    }

    @get:Synchronized
    @set:Synchronized
    var refreshToken: String
        get() = PublicValues.REFRESH_TOKEN
        set(refreshToken) {
            PublicValues.REFRESH_TOKEN = refreshToken
        }

    fun getTokenRequestBuilder(): OAuthClientRequest.TokenRequestBuilder {
        return tokenRequestBuilder
    }

    fun setTokenRequestBuilder(tokenRequestBuilder: OAuthClientRequest.TokenRequestBuilder) {
        this.tokenRequestBuilder = tokenRequestBuilder
    }

    fun getAuthenticationRequestBuilder(): OAuthClientRequest.AuthenticationRequestBuilder? {
        return authenticationRequestBuilder
    }

    fun setAuthenticationRequestBuilder(authenticationRequestBuilder: OAuthClientRequest.AuthenticationRequestBuilder?) {
        this.authenticationRequestBuilder = authenticationRequestBuilder
    }

    init {
        oauthClient = OAuthClient(OAuthOkHttpClient(client))
        tokenRequestBuilder = requestBuilder
    }
}