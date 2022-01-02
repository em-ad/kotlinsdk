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

import io.swagger.client.models.RegisterResponseDto
import io.swagger.client.models.RegisterWithTypeDto

import io.swagger.client.infrastructure.*

class RegistrationV2ControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * register
     * examples{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_LINK\&quot;} &lt;Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_CODE\&quot;} &lt;/Br&gt;{\&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_OTP\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_LINK\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_CODE\&quot;}  &lt;/Br&gt; {\&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_OTP\&quot;} &lt;/Br&gt;
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return RegisterResponseDto
     */
    @Suppress("UNCHECKED_CAST")
    fun register1(body: RegisterWithTypeDto? = null, acceptLanguage: kotlin.String? = null): RegisterResponseDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/client/v2/user/register", headers = localVariableHeaders
        )
        val response = request<RegisterResponseDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RegisterResponseDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}