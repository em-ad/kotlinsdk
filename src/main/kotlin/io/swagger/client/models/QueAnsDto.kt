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

import io.swagger.client.models.QueAnsCategoryDto

/**
 * 
 * @param answer 
 * @param answerList 
 * @param categories 
 * @param categoryId 
 * @param id 
 * @param priority 
 * @param question 
 * @param rate 
 * @param subject 
 * @param viewed 
 */
data class QueAnsDto (

    val answer: kotlin.String? = null,
    val answerList: kotlin.Array<kotlin.String>? = null,
    val categories: kotlin.Array<QueAnsCategoryDto>? = null,
    val categoryId: kotlin.Array<kotlin.String>? = null,
    val id: kotlin.String? = null,
    val priority: kotlin.Int? = null,
    val question: kotlin.String? = null,
    val rate: kotlin.Int? = null,
    val subject: kotlin.String? = null,
    val viewed: kotlin.Int? = null
) {
}