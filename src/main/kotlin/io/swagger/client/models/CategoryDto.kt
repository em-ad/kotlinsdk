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

import io.swagger.client.models.Category

/**
 * 
 * @param children 
 * @param createdDate 
 * @param description 
 * @param flag 
 * @param id 
 * @param imagePath 
 * @param parentId 
 * @param priority 
 * @param title 
 * @param type 
 */
data class CategoryDto (

    val children: kotlin.Array<Category>? = null,
    val createdDate: kotlin.String? = null,
    val description: kotlin.String,
    val flag: kotlin.Boolean? = null,
    val id: kotlin.String? = null,
    val imagePath: kotlin.String? = null,
    val parentId: kotlin.String? = null,
    val priority: kotlin.Int? = null,
    val title: kotlin.String,
    val type: kotlin.String
) {
}