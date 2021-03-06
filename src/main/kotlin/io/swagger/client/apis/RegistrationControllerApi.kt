/**
 * Datyar REST APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.apis

import io.swagger.client.models.ActivationDto
import io.swagger.client.models.ActivationResponseDto
import io.swagger.client.models.RegisterWithTypeDto
import io.swagger.client.models.UserDto

import io.swagger.client.infrastructure.*

class RegistrationControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * activation
     * only one of fields \&quot;mobile\&quot; or \&quot;email\&quot; should be fill
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return ActivationResponseDto
     */
    @Suppress("UNCHECKED_CAST")
    fun activateByCode(body: ActivationDto? = null, acceptLanguage: kotlin.String? = null): ActivationResponseDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/client/v1/user/register/activate", headers = localVariableHeaders
        )
        val response = request<ActivationResponseDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ActivationResponseDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * activation
     * only one of fields \&quot;mobile\&quot; or \&quot;email\&quot; should be fill
     * @param activationCode  
     * @param registrationType  
     * @param acceptLanguage language (optional)
     * @param email  (optional)
     * @param mobile  (optional)
     * @param password  (optional)
     * @param tag  (optional)
     * @param username  (optional)
     * @return ActivationResponseDto
     */
    @Suppress("UNCHECKED_CAST")
    fun activateByLink(activationCode: kotlin.String, registrationType: kotlin.String, acceptLanguage: kotlin.String? = null, email: kotlin.String? = null, mobile: kotlin.String? = null, password: kotlin.String? = null, tag: kotlin.String? = null, username: kotlin.String? = null): ActivationResponseDto {
        val localVariableQuery: MultiValueMap = mapOf("activationCode" to listOf("$activationCode"), "email" to listOf("$email"), "mobile" to listOf("$mobile"), "password" to listOf("$password"), "registrationType" to listOf("$registrationType"), "tag" to listOf("$tag"), "username" to listOf("$username"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/client/v1/user/register/activate", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<ActivationResponseDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ActivationResponseDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * facebookRegisterByToken
     * 
     * @param acceptLanguage language (optional)
     * @param token  (optional)
     * @return UserDto
     */
    @Suppress("UNCHECKED_CAST")
    fun facebookRegisterByToken(acceptLanguage: kotlin.String? = null, token: kotlin.String? = null): UserDto {
        val localVariableQuery: MultiValueMap = mapOf("token" to listOf("$token"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/client/v1/user/register/third-party/facebook", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<UserDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UserDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * googleRegisterAccomplish
     * 
     * @param acceptLanguage language (optional)
     * @param code  (optional)
     * @param scope  (optional)
     * @param state  (optional)
     * @return UserDto
     */
    @Suppress("UNCHECKED_CAST")
    fun googleRegisterAccomplish(acceptLanguage: kotlin.String? = null, code: kotlin.String? = null, scope: kotlin.String? = null, state: kotlin.String? = null): UserDto {
        val localVariableQuery: MultiValueMap = mapOf("code" to listOf("$code"), "scope" to listOf("$scope"), "state" to listOf("$state"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/client/v1/user/register/third-party/google/accomplish", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<UserDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UserDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * googleRegisterByToken
     * 
     * @param acceptLanguage language (optional)
     * @param token  (optional)
     * @return UserDto
     */
    @Suppress("UNCHECKED_CAST")
    fun googleRegisterByToken(acceptLanguage: kotlin.String? = null, token: kotlin.String? = null): UserDto {
        val localVariableQuery: MultiValueMap = mapOf("token" to listOf("$token"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/client/v1/user/register/third-party/google", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<UserDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UserDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * linkedInRegisterAccomplish
     * 
     * @param acceptLanguage language (optional)
     * @param code  (optional)
     * @param scope  (optional)
     * @param state  (optional)
     * @return void
     */
    fun linkedInRegisterAccomplish(acceptLanguage: kotlin.String? = null, code: kotlin.String? = null, scope: kotlin.String? = null, state: kotlin.String? = null): Unit {
        val localVariableQuery: MultiValueMap = mapOf("code" to listOf("$code"), "scope" to listOf("$scope"), "state" to listOf("$state"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/client/v1/user/register/third-party/linked-in/accomplish", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * linkedInRegisterByToken
     * 
     * @param acceptLanguage language (optional)
     * @param token  (optional)
     * @return UserDto
     */
    @Suppress("UNCHECKED_CAST")
    fun linkedInRegisterByToken(acceptLanguage: kotlin.String? = null, token: kotlin.String? = null): UserDto {
        val localVariableQuery: MultiValueMap = mapOf("token" to listOf("$token"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/client/v1/user/register/third-party/linked-in", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<UserDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UserDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * registrationType
     * call this by your browser
     * @param acceptLanguage language (optional)
     * @param callbackUrl  (optional)
     * @param deviceId  (optional)
     * @param registrationType only GOOGLE_TWO_STEP and LINKED_IN allowed (optional)
     * @return void
     */
    fun redirectToThirdParty(acceptLanguage: kotlin.String? = null, callbackUrl: kotlin.String? = null, deviceId: kotlin.String? = null, registrationType: kotlin.String? = null): Unit {
        val localVariableQuery: MultiValueMap = mapOf("callbackUrl" to listOf("$callbackUrl"), "deviceId" to listOf("$deviceId"), "registrationType" to listOf("$registrationType"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/client/v1/user/register/third-party", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * register
     * examples{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_LINK\&quot;} &lt;Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_CODE\&quot;} &lt;/Br&gt;{\&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_OTP\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_LINK\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_CODE\&quot;}  &lt;/Br&gt; {\&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_OTP\&quot;} &lt;/Br&gt;
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun register(body: RegisterWithTypeDto? = null, acceptLanguage: kotlin.String? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/client/v1/user/register", headers = localVariableHeaders
        )
        val response = request<Any?>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * thirdPartyTest
     * 
     * @param acceptLanguage language (optional)
     * @param queryParams queryParams (optional)
     * @return void
     */
    fun thirdPartyTest(acceptLanguage: kotlin.String? = null, queryParams: kotlin.Any? = null): Unit {
        val localVariableQuery: MultiValueMap = mapOf("queryParams" to listOf("$queryParams"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/client/v1/user/register/third-party/test", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
