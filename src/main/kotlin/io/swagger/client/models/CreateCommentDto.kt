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
 * @param commenterEmail 
 * @param commenterName 
 * @param grecaptchaResponse 
 * @param postId 
 */
data class CreateCommentDto (

    val comment: kotlin.String,
    val commenterEmail: kotlin.String,
    val commenterName: kotlin.String,
    val grecaptchaResponse: kotlin.String? = null,
    val postId: kotlin.String
) {
}