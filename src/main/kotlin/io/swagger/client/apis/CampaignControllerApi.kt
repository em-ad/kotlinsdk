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

import io.swagger.client.models.CampaignInDto
import io.swagger.client.models.CampaignOutDto
import io.swagger.client.models.Page_CampaignOutDto_

import io.swagger.client.infrastructure.*

class CampaignControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * don’t fill id.create Campaign 
     *  create Campaign
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return CampaignOutDto
     */
    @Suppress("UNCHECKED_CAST")
    fun createCampaign(body: CampaignInDto? = null, acceptLanguage: kotlin.String? = null): CampaignOutDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/campaign/campaigns", headers = localVariableHeaders
        )
        val response = request<CampaignOutDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CampaignOutDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * deleteCampaign
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun deleteCampaign(id: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/campaign/campaigns/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
     * getCampaign
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return CampaignOutDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getCampaign(id: kotlin.String, acceptLanguage: kotlin.String? = null): CampaignOutDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/campaign/campaigns/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
        )
        val response = request<CampaignOutDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CampaignOutDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getListCampaign
     * 
     * @param acceptLanguage language (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @return Page_CampaignOutDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getListCampaign(acceptLanguage: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null): Page_CampaignOutDto_ {
        val localVariableQuery: MultiValueMap = mapOf("pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/campaign/campaigns", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_CampaignOutDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_CampaignOutDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Update
     *  update Campaign
     * @param id id 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun updateCampaign(id: kotlin.String, body: CampaignInDto? = null, acceptLanguage: kotlin.String? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/campaign/campaigns/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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