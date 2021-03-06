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


import io.swagger.client.infrastructure.*

class NotificationControllerV2Api(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * send
     * 
     * @param acceptLanguage language (optional)
     * @param iDs  (optional)
     * @param createdDate  (optional)
     * @param deleted  (optional)
     * @param deletedAt  (optional)
     * @param id  (optional)
     * @param lastModifiedDate  (optional)
     * @param message  (optional)
     * @param metaData  (optional)
     * @param mobile  (optional)
     * @param new  (optional)
     * @param template  (optional)
     * @param title  (optional)
     * @param to  (optional)
     * @param types  (optional)
     * @param version  (optional)
     * @param visitedSet  (optional)
     * @return void
     */
    fun send1(acceptLanguage: kotlin.String? = null, iDs: kotlin.Array<kotlin.String>? = null, createdDate: kotlin.String? = null, deleted: kotlin.Boolean? = null, deletedAt: kotlin.String? = null, id: kotlin.String? = null, lastModifiedDate: kotlin.String? = null, message: kotlin.String? = null, metaData: kotlin.Any? = null, mobile: kotlin.String? = null, new: kotlin.Boolean? = null, template: kotlin.String? = null, title: kotlin.String? = null, to: kotlin.String? = null, types: kotlin.Array<kotlin.String>? = null, version: kotlin.Long? = null, visitedSet: kotlin.Array<kotlin.String>? = null): Unit {
        val localVariableQuery: MultiValueMap = mapOf("IDs" to toMultiValue(iDs!!.toList(), "pipe"), "createdDate" to listOf("$createdDate"), "deleted" to listOf("$deleted"), "deletedAt" to listOf("$deletedAt"), "id" to listOf("$id"), "lastModifiedDate" to listOf("$lastModifiedDate"), "message" to listOf("$message"), "metaData" to listOf("$metaData"), "mobile" to listOf("$mobile"), "new" to listOf("$new"), "template" to listOf("$template"), "title" to listOf("$title"), "to" to listOf("$to"), "types" to toMultiValue(types!!.toList(), "pipe"), "version" to listOf("$version"), "visitedSet" to toMultiValue(visitedSet!!.toList(), "pipe"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v2/notifications/send", query = localVariableQuery, headers = localVariableHeaders
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
