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
 * @param fileSize 
 * @param fileUrl 
 * @param filename 
 * @param messageType 
 * @param sessionId 
 * @param text 
 */
data class CreateMessageDto (

    val fileSize: kotlin.String? = null,
    val fileUrl: kotlin.String? = null,
    val filename: kotlin.String? = null,
    val messageType: CreateMessageDto.MessageType,
    val sessionId: kotlin.String,
    val text: kotlin.String? = null
) {
    /**
    * 
    * Values: DOCUMENT,IMAGE,TEXT,VOICE
    */
    enum class MessageType(val value: kotlin.String){
        DOCUMENT("DOCUMENT"),
        IMAGE("IMAGE"),
        TEXT("TEXT"),
        VOICE("VOICE");
    }
}