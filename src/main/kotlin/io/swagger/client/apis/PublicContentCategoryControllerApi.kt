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

import io.swagger.client.infrastructure.*

class PublicContentCategoryControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * getCategory
     * 
     * @param categoryId categoryId 
     * @param acceptLanguage language (optional)
     * @return CategoryDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getCategory2(categoryId: kotlin.String, acceptLanguage: kotlin.String? = null): CategoryDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/public/v1/contents/categories/{categoryId}".replace("{" + "categoryId" + "}", "$categoryId"), headers = localVariableHeaders
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
    fun getCategoryTree1(acceptLanguage: kotlin.String? = null): kotlin.Array<CategoryDto> {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/public/v1/contents/categories/tree", headers = localVariableHeaders
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