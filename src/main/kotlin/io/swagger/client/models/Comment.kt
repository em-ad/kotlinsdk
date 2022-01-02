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
 * @param comment 
 * @param commentStatus 
 * @param createdDate 
 * @param deleted 
 * @param id 
 * @param lastModifiedDate 
 * @param lawyerId 
 * @param rating 
 * @param userId 
 * @param version 
 */
data class Comment (

    val comment: kotlin.String? = null,
    val commentStatus: Comment.CommentStatus? = null,
    val createdDate: kotlin.String? = null,
    val deleted: kotlin.Boolean? = null,
    val id: kotlin.String? = null,
    val lastModifiedDate: kotlin.String? = null,
    val lawyerId: kotlin.String? = null,
    val rating: kotlin.Float? = null,
    val userId: kotlin.String? = null,
    val version: kotlin.Long? = null
) {
    /**
    * 
    * Values: DRAFT,PUBLISHED,REJECTED
    */
    enum class CommentStatus(val value: kotlin.String){
        DRAFT("DRAFT"),
        PUBLISHED("PUBLISHED"),
        REJECTED("REJECTED");
    }
}