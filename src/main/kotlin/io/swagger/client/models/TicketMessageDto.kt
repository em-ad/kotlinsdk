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
package io.swagger.client.models


/**
 * 
 * @param clientMessageId 
 * @param content 
 * @param createdDateIso 
 * @param createdDateMilli 
 * @param file 
 * @param fileMimeType 
 * @param fileSize 
 * @param fullName 
 * @param id 
 * @param isRead 
 * @param subscriberId 
 * @param ticketId 
 * @param userId 
 * @param userType 
 */
data class TicketMessageDto (

    val clientMessageId: kotlin.String? = null,
    val content: kotlin.String? = null,
    val createdDateIso: kotlin.String? = null,
    val createdDateMilli: kotlin.Long? = null,
    val file: kotlin.String? = null,
    val fileMimeType: kotlin.String? = null,
    val fileSize: kotlin.Long? = null,
    val fullName: kotlin.String? = null,
    val id: kotlin.String? = null,
    val isRead: kotlin.Boolean? = null,
    val subscriberId: kotlin.String? = null,
    val ticketId: kotlin.String? = null,
    val userId: kotlin.String? = null,
    val userType: kotlin.String? = null
) {
}