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

import io.swagger.client.models.DailyReportDto

/**
 * 
 * @param dailyReportList 
 * @param discountCode 
 * @param totalUsageInGivenPeriod 
 */
data class UsageReportDto (

    val dailyReportList: kotlin.Array<DailyReportDto>? = null,
    val discountCode: kotlin.String? = null,
    val totalUsageInGivenPeriod: kotlin.Long? = null
) {
}