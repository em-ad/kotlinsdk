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

import io.swagger.client.models.TopLawyerOutputDto

import io.swagger.client.infrastructure.*

class TopLawyerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * getTopLawyers
     * 
     * @param acceptLanguage language (optional)
     * @param categoryId  (optional)
     * @param consultingType  (optional)
     * @param pageNumber  (optional)
     * @param pageSize  (optional)
     * @param province  (optional)
     * @param sort  (optional)
     * @param sortKey  (optional)
     * @return kotlin.Array<TopLawyerOutputDto>
     */
    @Suppress("UNCHECKED_CAST")
    fun getTopLawyers(acceptLanguage: kotlin.String? = null, categoryId: kotlin.String? = null, consultingType: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, province: kotlin.String? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null): kotlin.Array<TopLawyerOutputDto> {
        val localVariableQuery: MultiValueMap = mapOf("categoryId" to listOf("$categoryId"), "consultingType" to listOf("$consultingType"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "province" to listOf("$province"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "pipe"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/public/api/v1/datyar/lawyers/top-lawyer", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<kotlin.Array<TopLawyerOutputDto>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<TopLawyerOutputDto>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}