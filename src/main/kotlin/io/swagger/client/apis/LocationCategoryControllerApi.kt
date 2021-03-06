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

import io.swagger.client.models.LocationCategoryDto
import io.swagger.client.models.LocationCategoryResultDto
import io.swagger.client.models.Page_LocationCategoryResultDto_

import io.swagger.client.infrastructure.*

class LocationCategoryControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * addCategory
     * 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return LocationCategoryResultDto
     */
    @Suppress("UNCHECKED_CAST")
    fun addCategory1(body: LocationCategoryDto? = null, acceptLanguage: kotlin.String? = null): LocationCategoryResultDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/locations/categories", headers = localVariableHeaders
        )
        val response = request<LocationCategoryResultDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LocationCategoryResultDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * categoriesList
     * 
     * @param acceptLanguage language (optional)
     * @param ids  (optional)
     * @param isRoot  (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param parentId  (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @param type  (optional)
     * @return Page_LocationCategoryResultDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun categoriesList(acceptLanguage: kotlin.String? = null, ids: kotlin.Array<kotlin.String>? = null, isRoot: kotlin.Boolean? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, parentId: kotlin.String? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null, type: kotlin.String? = null): Page_LocationCategoryResultDto_ {
        val localVariableQuery: MultiValueMap = mapOf("ids" to toMultiValue(ids!!.toList(), "pipe"), "isRoot" to listOf("$isRoot"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "parentId" to listOf("$parentId"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"), "type" to listOf("$type"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/locations/categories", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_LocationCategoryResultDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_LocationCategoryResultDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * deleteCategory
     * 
     * @param categoryId categoryId 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun deleteCategory1(categoryId: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/locations/categories/{categoryId}".replace("{" + "categoryId" + "}", "$categoryId"), headers = localVariableHeaders
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
     * editCategory
     * 
     * @param categoryId categoryId 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return LocationCategoryResultDto
     */
    @Suppress("UNCHECKED_CAST")
    fun editCategory1(categoryId: kotlin.String, body: LocationCategoryDto? = null, acceptLanguage: kotlin.String? = null): LocationCategoryResultDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/locations/categories/{categoryId}".replace("{" + "categoryId" + "}", "$categoryId"), headers = localVariableHeaders
        )
        val response = request<LocationCategoryResultDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LocationCategoryResultDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getCategory
     * 
     * @param categoryId categoryId 
     * @param acceptLanguage language (optional)
     * @return LocationCategoryResultDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getCategory1(categoryId: kotlin.String, acceptLanguage: kotlin.String? = null): LocationCategoryResultDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/locations/categories/{categoryId}".replace("{" + "categoryId" + "}", "$categoryId"), headers = localVariableHeaders
        )
        val response = request<LocationCategoryResultDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LocationCategoryResultDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
