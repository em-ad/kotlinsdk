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

import io.swagger.client.models.Page_ReferralUserDto_
import io.swagger.client.models.ReferralUserDto

import io.swagger.client.infrastructure.*

class ReferralUserControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * create
     *  create ReferralUser
     * @param acceptLanguage language (optional)
     * @return ReferralUserDto
     */
    @Suppress("UNCHECKED_CAST")
    fun createReferralUser(acceptLanguage: kotlin.String? = null): ReferralUserDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/campaign/referral/subscriber", headers = localVariableHeaders
        )
        val response = request<ReferralUserDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ReferralUserDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * deleteReferralUser
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun deleteReferralUser(id: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/campaign/referral/subscriber/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
     * getReferralUser
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return ReferralUserDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getReferralUser(id: kotlin.String, acceptLanguage: kotlin.String? = null): ReferralUserDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/campaign/referral/subscriber/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
        )
        val response = request<ReferralUserDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ReferralUserDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getReferralUserList
     * 
     * @param acceptLanguage language (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @return Page_ReferralUserDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getReferralUserList(acceptLanguage: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null): Page_ReferralUserDto_ {
        val localVariableQuery: MultiValueMap = mapOf("pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/campaign/referral/subscriber", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_ReferralUserDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_ReferralUserDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Update
     *  update ReferralUser
     * @param id id 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun updateReferralUser(id: kotlin.String, body: ReferralUserDto? = null, acceptLanguage: kotlin.String? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/campaign/referral/subscriber/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
}