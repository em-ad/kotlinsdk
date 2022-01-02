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

import io.swagger.client.models.BankGatewayDto
import io.swagger.client.models.Page_BankGatewayDto_

import io.swagger.client.infrastructure.*

class BankGatewayControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * create
     * don&#x27;t fill id
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return BankGatewayDto
     */
    @Suppress("UNCHECKED_CAST")
    fun createBankGateway(body: BankGatewayDto? = null, acceptLanguage: kotlin.String? = null): BankGatewayDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/ipg/bank-gateway", headers = localVariableHeaders
        )
        val response = request<BankGatewayDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as BankGatewayDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * delete
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun delete1(id: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/ipg/bank-gateway/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
     * get
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return BankGatewayDto
     */
    @Suppress("UNCHECKED_CAST")
    fun get1(id: kotlin.String, acceptLanguage: kotlin.String? = null): BankGatewayDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/ipg/bank-gateway/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
        )
        val response = request<BankGatewayDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as BankGatewayDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getAllBankGateway
     * 
     * @param acceptLanguage language (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @return Page_BankGatewayDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getAllBankGateway(acceptLanguage: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null): Page_BankGatewayDto_ {
        val localVariableQuery: MultiValueMap = mapOf("pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/ipg/bank-gateway", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_BankGatewayDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_BankGatewayDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getAllEnabledBankGateway
     * 
     * @param acceptLanguage language (optional)
     * @return kotlin.Array<BankGatewayDto>
     */
    @Suppress("UNCHECKED_CAST")
    fun getAllEnabledBankGateway(acceptLanguage: kotlin.String? = null): kotlin.Array<BankGatewayDto> {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/ipg/bank-gateway/enabled", headers = localVariableHeaders
        )
        val response = request<kotlin.Array<BankGatewayDto>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<BankGatewayDto>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * update
     * 
     * @param id id 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun updateBankGateway(id: kotlin.String, body: BankGatewayDto? = null, acceptLanguage: kotlin.String? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/ipg/bank-gateway/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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