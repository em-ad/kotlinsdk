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

import io.swagger.client.models.Page_AdminTicketDto_
import io.swagger.client.models.Page_TicketDto_
import io.swagger.client.models.TicketDto

import io.swagger.client.infrastructure.*

class TicketControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * state
     * change status
     * @param id id 
     * @param stateEnum stateEnum 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun changeState1(id: kotlin.String, stateEnum: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/support/tickets/state/{id}/{stateEnum}".replace("{" + "id" + "}", "$id").replace("{" + "stateEnum" + "}", "$stateEnum"), headers = localVariableHeaders
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
     * state
     * close status
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun closeState(id: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/support/tickets/state/close/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
     * create
     *  create ticket
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return TicketDto
     */
    @Suppress("UNCHECKED_CAST")
    fun createTicket(body: TicketDto? = null, acceptLanguage: kotlin.String? = null): TicketDto {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/support/tickets", headers = localVariableHeaders
        )
        val response = request<TicketDto>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as TicketDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * deleteTicket
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun deleteTicket(id: kotlin.String, acceptLanguage: kotlin.String? = null): Unit {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/support/tickets/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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
     * getSubscriberTickets
     * 
     * @param acceptLanguage language (optional)
     * @param categoryId  (optional)
     * @param content  (optional)
     * @param email  (optional)
     * @param from  (optional)
     * @param fromIso  (optional)
     * @param fullSearch another fields must be empty (optional)
     * @param keyword  (optional)
     * @param mobile  (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param section  (optional)
     * @param senderName  (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @param subject  (optional)
     * @param ticketStateEnum  (optional)
     * @param to  (optional)
     * @param toIso  (optional)
     * @return Page_TicketDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getSubscriberTickets(acceptLanguage: kotlin.String? = null, categoryId: kotlin.String? = null, content: kotlin.String? = null, email: kotlin.String? = null, from: kotlin.Long? = null, fromIso: kotlin.String? = null, fullSearch: kotlin.String? = null, keyword: kotlin.String? = null, mobile: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, section: kotlin.String? = null, senderName: kotlin.String? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null, subject: kotlin.String? = null, ticketStateEnum: kotlin.String? = null, to: kotlin.Long? = null, toIso: kotlin.String? = null): Page_TicketDto_ {
        val localVariableQuery: MultiValueMap = mapOf("categoryId" to listOf("$categoryId"), "content" to listOf("$content"), "email" to listOf("$email"), "from" to listOf("$from"), "fromIso" to listOf("$fromIso"), "fullSearch" to listOf("$fullSearch"), "keyword" to listOf("$keyword"), "mobile" to listOf("$mobile"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "section" to listOf("$section"), "senderName" to listOf("$senderName"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"), "subject" to listOf("$subject"), "ticketStateEnum" to listOf("$ticketStateEnum"), "to" to listOf("$to"), "toIso" to listOf("$toIso"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/support/tickets/get-subscriber-tickets", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_TicketDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_TicketDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getTicket
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return TicketDto
     */
    @Suppress("UNCHECKED_CAST")
    fun getTicket(id: kotlin.String, acceptLanguage: kotlin.String? = null): TicketDto {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/support/tickets/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
        )
        val response = request<TicketDto>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as TicketDto
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getTicketList
     * 
     * @param acceptLanguage language (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @return Page_TicketDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getTicketList(acceptLanguage: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null): Page_TicketDto_ {
        val localVariableQuery: MultiValueMap = mapOf("pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/support/tickets", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_TicketDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_TicketDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getTicketListForAdminPanel
     * 
     * @param acceptLanguage language (optional)
     * @param categoryId  (optional)
     * @param content  (optional)
     * @param email  (optional)
     * @param from  (optional)
     * @param fromIso  (optional)
     * @param fullSearch another fields must be empty (optional)
     * @param keyword  (optional)
     * @param mobile  (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param section  (optional)
     * @param senderName  (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @param subject  (optional)
     * @param ticketStateEnum  (optional)
     * @param to  (optional)
     * @param toIso  (optional)
     * @return Page_AdminTicketDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getTicketListForAdminPanel(acceptLanguage: kotlin.String? = null, categoryId: kotlin.String? = null, content: kotlin.String? = null, email: kotlin.String? = null, from: kotlin.Long? = null, fromIso: kotlin.String? = null, fullSearch: kotlin.String? = null, keyword: kotlin.String? = null, mobile: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, section: kotlin.String? = null, senderName: kotlin.String? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null, subject: kotlin.String? = null, ticketStateEnum: kotlin.String? = null, to: kotlin.Long? = null, toIso: kotlin.String? = null): Page_AdminTicketDto_ {
        val localVariableQuery: MultiValueMap = mapOf("categoryId" to listOf("$categoryId"), "content" to listOf("$content"), "email" to listOf("$email"), "from" to listOf("$from"), "fromIso" to listOf("$fromIso"), "fullSearch" to listOf("$fullSearch"), "keyword" to listOf("$keyword"), "mobile" to listOf("$mobile"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "section" to listOf("$section"), "senderName" to listOf("$senderName"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"), "subject" to listOf("$subject"), "ticketStateEnum" to listOf("$ticketStateEnum"), "to" to listOf("$to"), "toIso" to listOf("$toIso"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/support/tickets/admin/get", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_AdminTicketDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_AdminTicketDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getUserTickets
     * 
     * @param acceptLanguage language (optional)
     * @param categoryId  (optional)
     * @param content  (optional)
     * @param email  (optional)
     * @param from  (optional)
     * @param fromIso  (optional)
     * @param fullSearch another fields must be empty (optional)
     * @param keyword  (optional)
     * @param mobile  (optional)
     * @param pageNumber starts from 0 (optional)
     * @param pageSize must be greater than 0 (optional)
     * @param section  (optional)
     * @param senderName  (optional)
     * @param sort ASC&#x3D;ascending ,DESC&#x3D;descending (optional)
     * @param sortKey sort will be based on these words (optional)
     * @param subject  (optional)
     * @param ticketStateEnum  (optional)
     * @param to  (optional)
     * @param toIso  (optional)
     * @return Page_TicketDto_
     */
    @Suppress("UNCHECKED_CAST")
    fun getUserTickets(acceptLanguage: kotlin.String? = null, categoryId: kotlin.String? = null, content: kotlin.String? = null, email: kotlin.String? = null, from: kotlin.Long? = null, fromIso: kotlin.String? = null, fullSearch: kotlin.String? = null, keyword: kotlin.String? = null, mobile: kotlin.String? = null, pageNumber: kotlin.Int? = null, pageSize: kotlin.Int? = null, section: kotlin.String? = null, senderName: kotlin.String? = null, sort: kotlin.String? = null, sortKey: kotlin.Array<kotlin.String>? = null, subject: kotlin.String? = null, ticketStateEnum: kotlin.String? = null, to: kotlin.Long? = null, toIso: kotlin.String? = null): Page_TicketDto_ {
        val localVariableQuery: MultiValueMap = mapOf("categoryId" to listOf("$categoryId"), "content" to listOf("$content"), "email" to listOf("$email"), "from" to listOf("$from"), "fromIso" to listOf("$fromIso"), "fullSearch" to listOf("$fullSearch"), "keyword" to listOf("$keyword"), "mobile" to listOf("$mobile"), "pageNumber" to listOf("$pageNumber"), "pageSize" to listOf("$pageSize"), "section" to listOf("$section"), "senderName" to listOf("$senderName"), "sort" to listOf("$sort"), "sortKey" to toMultiValue(sortKey!!.toList(), "multi"), "subject" to listOf("$subject"), "ticketStateEnum" to listOf("$ticketStateEnum"), "to" to listOf("$to"), "toIso" to listOf("$toIso"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/support/tickets/get-user-tickets", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Page_TicketDto_>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Page_TicketDto_
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * update
     *  update Ticket
     * @param id id 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return void
     */
    fun updateTicket(id: kotlin.String, body: TicketDto? = null, acceptLanguage: kotlin.String? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/v1/support/tickets/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
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