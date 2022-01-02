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

import io.swagger.client.models.DiscountSubscriberLogDtoReq
import io.swagger.client.models.DiscountSubscriberLogDtoRes
import io.swagger.client.models.DiscountSubscriberLogValidModel
import io.swagger.client.models.Page_DiscountSubscriberLogDto_
import io.swagger.client.models.UsageReportDto
import io.swagger.client.models.ValidateDiscountAmountDto

import io.swagger.client.infrastructure.*

class DiscountSubscriberLogControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * create
     *  create discount
     * @param code code 
     * @param acceptLanguage language (optional)
     * @return DiscountSubscriberLogDtoRes
     */
    @Suppress("UNCHECKED_CAST")
    fun createDiscountSubscriberLog(code: kotlin.String, acceptLanguage: kotlin.String? = null): DiscountSubscriberLogDtoRes {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/discount/discount-subscriberlog/{code}".replace("{" + "code" + "}", "$code"), headers = localVariableHeaders
        )
        val response = request<DiscountSubscriberLogDtoRes>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DiscountSubscriberLogDtoRes
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * deleteDiscountSubscriberLog
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun deleteDiscountSubscriberLog(id: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/discount/discount-subscriberlog/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
     * getDiscountLogFilter
     * 
     * @param acceptLanguage language (optional)
     * @param discountCode  (optional)
     * @param from  (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @param subscribersId  (optional)
     * @param to  (optional)
     * @return Page_DiscountSubscriberLogDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getDiscountLogFilter(acceptLanguage: kotlin.String? = null, discountCode: kotlin.String? = null, from: kotlin.Long? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null, subscribersId: kotlin.String? = null, to: kotlin.Long? = null): Page_DiscountSubscriberLogDto_ {
        val localVariableQuery: MultiValueMap = mapOf("discountCode" to listOf("$discountCode"), "from" to listOf("$from"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"), "subscribersId" to listOf("$subscribersId"), "to" to listOf("$to"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/discount/discount-subscriberlog/filter/", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_DiscountSubscriberLogDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_DiscountSubscriberLogDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getDiscountSubscriberLog
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return DiscountSubscriberLogDtoRes
     */
    @Suppress("UNCHECKED_CAST")
    fun getDiscountSubscriberLog(id: kotlin.String, acceptLanguage: kotlin.String? = null): DiscountSubscriberLogDtoRes {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/discount/discount-subscriberlog/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
        )
        val response = request<DiscountSubscriberLogDtoRes>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DiscountSubscriberLogDtoRes
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getListDiscountSubscriberLog
     * 
     * @param acceptLanguage language (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @return Page_DiscountSubscriberLogDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getListDiscountSubscriberLog(acceptLanguage: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null): Page_DiscountSubscriberLogDto_ {
        val localVariableQuery: MultiValueMap = mapOf("pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/discount/discount-subscriberlog", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_DiscountSubscriberLogDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_DiscountSubscriberLogDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getUsageReport
     * 
     * @param discountCode code 
     * @param acceptLanguage language (optional)
     * @param from Start (optional)
     * @param to End (optional)
     * @return UsageReportDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getUsageReport(discountCode: kotlin.String, acceptLanguage: kotlin.String? = null, from: kotlin.Long? = null, to: kotlin.Long? = null): UsageReportDto {
        val localVariableQuery: MultiValueMap = mapOf("discountCode" to listOf("$discountCode"), "from" to listOf("$from"), "to" to listOf("$to"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/discount/discount-subscriberlog/report/usage", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<UsageReportDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UsageReportDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getValidationSubscriber
     * 
     * @param discountCode discountCode 
     * @param acceptLanguage language (optional)
     * @return DiscountSubscriberLogValidModel
     */
    @Suppress("UNCHECKED_CAST")
    fun getValidationSubscriber(discountCode: kotlin.String, acceptLanguage: kotlin.String? = null): DiscountSubscriberLogValidModel {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/discount/discount-subscriberlog/valid/{discountCode}".replace("{" + "discountCode" + "}", "$discountCode"), headers = localVariableHeaders
        )
        val response = request<DiscountSubscriberLogValidModel>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DiscountSubscriberLogValidModel
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Update
     *  update discount
     * @param id id 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun updateDiscountSubscriberLog(id: kotlin.String, body: DiscountSubscriberLogDtoReq? = null, acceptLanguage: kotlin.String? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/discount/discount-subscriberlog/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
    /**
     * validateDiscountByCodeAndAmount
     * 
     * @param code code 
     * @param amount amount 
     * @param acceptLanguage language (optional)
     * @return ValidateDiscountAmountDto
     */
    @Suppress("UNCHECKED_CAST")
    fun validateDiscountByCodeAndAmount(code: kotlin.String, amount: kotlin.Int, acceptLanguage: kotlin.String? = null): ValidateDiscountAmountDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/discount/discount-subscriberlog/validate/{code}/{amount}".replace("{" + "code" + "}", "$code").replace("{" + "amount" + "}", "$amount"), headers = localVariableHeaders
        )
        val response = request<ValidateDiscountAmountDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ValidateDiscountAmountDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
