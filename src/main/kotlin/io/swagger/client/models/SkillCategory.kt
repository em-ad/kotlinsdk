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
 * @param deletedAt 
 * @param id 
 * @param lastModifiedDate 
 * @param name 
 * @param new 
 * @param topicId 
 * @param topics 
 * @param version 
 */
data class SkillCategory (

    val createdDate: kotlin.String? = null,
    val deleted: kotlin.Boolean? = null,
    val deletedAt: kotlin.String? = null,
    val id: kotlin.String? = null,
    val lastModifiedDate: kotlin.String? = null,
    val name: kotlin.String? = null,
    val new: kotlin.Boolean? = null,
    val topicId: kotlin.Double? = null,
    val topics: kotlin.Array<kotlin.String>? = null,
    val version: kotlin.Long? = null
) {
}