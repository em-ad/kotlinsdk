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

import io.swagger.client.models.User

/**
 * 
 * @param dailyUsage 
 * @param date 
 * @param userList 
 */
data class DailyReportDto (

    val dailyUsage: kotlin.Long? = null,
    val date: kotlin.String? = null,
    val userList: kotlin.Array<User>? = null
) {
}