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
 * @param createdDate 
 * @param deleted 
 * @param fileSize 
 * @param fileUrl 
 * @param filename 
 * @param id 
 * @param lastModifiedDate 
 * @param messageState 
 * @param messageType 
 * @param owner 
 * @param text 
 * @param userId 
 * @param version 
 */
data class SessionMessage (

    val createdDate: kotlin.String? = null,
    val deleted: kotlin.Boolean? = null,
    val fileSize: kotlin.String? = null,
    val fileUrl: kotlin.String? = null,
    val filename: kotlin.String? = null,
    val id: kotlin.String? = null,
    val lastModifiedDate: kotlin.String? = null,
    val messageState: SessionMessage.MessageState? = null,
    val messageType: SessionMessage.MessageType? = null,
    val owner: SessionMessage.Owner? = null,
    val text: kotlin.String? = null,
    val userId: kotlin.String? = null,
    val version: kotlin.Long? = null
) {
    /**
    * 
    * Values: DRAFT,PUBLISHED
    */
    enum class MessageState(val value: kotlin.String){
        DRAFT("DRAFT"),
        PUBLISHED("PUBLISHED");
    }
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
    /**
    * 
    * Values: BOT,CLIENT,LAWYER
    */
    enum class Owner(val value: kotlin.String){
        BOT("BOT"),
        CLIENT("CLIENT"),
        LAWYER("LAWYER");
    }
}