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

import io.swagger.client.models.FromToTime

/**
 * 
 * @param date 
 * @param dayOff 
 * @param fromToTimeList 
 */
data class FinalFromToTimeModel (

    val date: kotlin.String? = null,
    val dayOff: kotlin.Boolean? = null,
    val fromToTimeList: kotlin.Array<FromToTime>? = null
) {
}