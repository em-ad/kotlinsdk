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

import io.swagger.client.models.CategoryDto
import io.swagger.client.models.Page_CategoryDto_

import io.swagger.client.infrastructure.*

class ContentCategoryControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * addCategory
     * 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return CategoryDto
     */
    @Suppress("UNCHECKED_CAST")
    fun addCategory(body: CategoryDto? = null, acceptLanguage: kotlin.String? = null): CategoryDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/contents/categories", headers = localVariableHeaders
        )
        val response = request<CategoryDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CategoryDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * categoryList
     * 
     * @param pageNumber starts from 0 
     * @param pageSize must be greater than 0 
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending 
     * @param acceptLanguage language (optional)
     * @param childEmbed  (optional)
     * @param flag  (optional)
     * @param sortKey sort will be based on these words (optional)
     * @param title  (optional)
     * @param type  (optional)
     * @return Page_CategoryDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun categoryList(pageNumber: kotlin.Int, pageSize: kotlin.Int, sort: kotlin.String, acceptLanguage: kotlin.String? = null, childEmbed: kotlin.Boolean? = null, flag: kotlin.Boolean? = null, sortKey: kotlin.Array<kotlin.String>? = null, title: kotlin.String? = null, type: kotlin.String? = null): Page_CategoryDto_ {
        val localVariableQuery: MultiValueMap = mapOf("childEmbed" to listOf("$childEmbed"), "flag" to listOf("$flag"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"), "title" to listOf("$title"), "type" to listOf("$type"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/contents/categories", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_CategoryDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_CategoryDto_
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
    fun deleteCategory(categoryId: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/contents/categories/{categoryId}".replace("{" + "categoryId" + "}", "$categoryId"), headers = localVariableHeaders
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
     * @return CategoryDto
     */
    @Suppress("UNCHECKED_CAST")
    fun editCategory(categoryId: kotlin.String, body: CategoryDto? = null, acceptLanguage: kotlin.String? = null): CategoryDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/contents/categories/{categoryId}".replace("{" + "categoryId" + "}", "$categoryId"), headers = localVariableHeaders
        )
        val response = request<CategoryDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CategoryDto
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
     * @return CategoryDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getCategory(categoryId: kotlin.String, acceptLanguage: kotlin.String? = null): CategoryDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/contents/categories/{categoryId}".replace("{" + "categoryId" + "}", "$categoryId"), headers = localVariableHeaders
        )
        val response = request<CategoryDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CategoryDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getCategoryTree
     * 
     * @param acceptLanguage language (optional)
     * @return kotlin.Array<CategoryDto>
     */
    @Suppress("UNCHECKED_CAST")
    fun getCategoryTree(acceptLanguage: kotlin.String? = null): kotlin.Array<CategoryDto> {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/contents/categories/tree", headers = localVariableHeaders
        )
        val response = request<kotlin.Array<CategoryDto>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<CategoryDto>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getListWithSub
     * 
     * @param acceptLanguage language (optional)
     * @param parentId  (optional)
     * @return kotlin.Array<CategoryDto>
     */
    @Suppress("UNCHECKED_CAST")
    fun getListWithSub(acceptLanguage: kotlin.String? = null, parentId: kotlin.String? = null): kotlin.Array<CategoryDto> {
        val localVariableQuery: MultiValueMap = mapOf("parentId" to listOf("$parentId"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/contents/categories/all", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<kotlin.Array<CategoryDto>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<CategoryDto>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
