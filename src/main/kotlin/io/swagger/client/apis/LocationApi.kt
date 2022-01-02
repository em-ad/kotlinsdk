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

import io.swagger.client.models.DatyarCreateLocationDto
import io.swagger.client.models.GetListLocationDto
import io.swagger.client.models.GetLocationDto

import io.swagger.client.infrastructure.*

class LocationApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * addLocation
     * 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return GetLocationDto
     */
    @Suppress("UNCHECKED_CAST")
    fun addLocation(body: DatyarCreateLocationDto? = null, acceptLanguage: kotlin.String? = null): GetLocationDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/datyar/locations", headers = localVariableHeaders
        )
        val response = request<GetLocationDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetLocationDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * deleteLocation
     * 
     * @param locationId locationId 
     * @param acceptLanguage language (optional)
     * @param deleteByChildren  (optional)
     * @return void
     */
    fun deleteLocation(locationId: kotlin.String, acceptLanguage: kotlin.String? = null, deleteByChildren: kotlin.Boolean? = null): Unit {
        val localVariableQuery: MultiValueMap = mapOf("deleteByChildren" to listOf("$deleteByChildren"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/datyar/locations/{locationId}".replace("{" + "locationId" + "}", "$locationId"), query = localVariableQuery, headers = localVariableHeaders
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
     * editLocation
     * 
     * @param locationId locationId 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return GetLocationDto
     */
    @Suppress("UNCHECKED_CAST")
    fun editLocation(locationId: kotlin.String, body: DatyarCreateLocationDto? = null, acceptLanguage: kotlin.String? = null): GetLocationDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/datyar/locations/{locationId}".replace("{" + "locationId" + "}", "$locationId"), headers = localVariableHeaders
        )
        val response = request<GetLocationDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetLocationDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getLocation
     * 
     * @param locationId locationId 
     * @param acceptLanguage language (optional)
     * @param byChildren  (optional)
     * @return GetLocationDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getLocation(locationId: kotlin.String, acceptLanguage: kotlin.String? = null, byChildren: kotlin.Boolean? = null): GetLocationDto {
        val localVariableQuery: MultiValueMap = mapOf("byChildren" to listOf("$byChildren"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/datyar/locations/{locationId}".replace("{" + "locationId" + "}", "$locationId"), query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<GetLocationDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetLocationDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getLocationsList
     * 
     * @param acceptLanguage language (optional)
     * @param categoriesId  (optional)
     * @param city  (optional)
     * @param distance  (optional)
     * @param keyword  (optional)
     * @param lat  (optional)
     * @param lng  (optional)
     * @param ownerID  (optional)
     * @param pageNumber  (optional)
     * @param pageSize  (optional)
     * @param sort  (optional)
     * @param sortKey  (optional)
     * @param state  (optional)
     * @param status  (optional)
     * @param title  (optional)
     * @param workingFrom  (optional)
     * @param workingTo  (optional)
     * @return kotlin.Array<GetListLocationDto>
     */
    @Suppress("UNCHECKED_CAST")
    fun getLocationsList(acceptLanguage: kotlin.String? = null, categoriesId: kotlin.Array<kotlin.String>? = null, city: kotlin.String? = null, distance: kotlin.Double? = null, keyword: kotlin.String? = null, lat: kotlin.Double? = null, lng: kotlin.Double? = null, ownerID: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null, state: kotlin.String? = null, status: kotlin.String? = null, title: kotlin.String? = null, workingFrom: kotlin.String? = null, workingTo: kotlin.String? = null): kotlin.Array<GetListLocationDto> {
        val localVariableQuery: MultiValueMap = mapOf("categoriesId" to toMultiValue(categoriesId!!.toList(), "pipe"), "city" to listOf("$city"), "distance" to listOf("$distance"), "keyword" to listOf("$keyword"), "lat" to listOf("$lat"), "lng" to listOf("$lng"), "ownerID" to listOf("$ownerID"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "pipe"), "state" to listOf("$state"), "status" to listOf("$status"), "title" to listOf("$title"), "workingFrom" to listOf("$workingFrom"), "workingTo" to listOf("$workingTo"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/datyar/locations", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<kotlin.Array<GetListLocationDto>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<GetListLocationDto>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
