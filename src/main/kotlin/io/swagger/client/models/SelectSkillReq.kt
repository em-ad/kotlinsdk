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

import io.swagger.client.models.SkillCategoryReq
import io.swagger.client.models.SkillReq

/**
 * 
 * @param categories 
 * @param categoryIds 
 * @param skillIds 
 * @param skills 
 */
data class SelectSkillReq (

    val categories: kotlin.Array<SkillCategoryReq>? = null,
    val categoryIds: kotlin.Array<kotlin.String>? = null,
    val skillIds: kotlin.Array<kotlin.String>? = null,
    val skills: kotlin.Array<SkillReq>? = null
) {
}