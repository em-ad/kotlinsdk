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
 * @param duration 
 * @param packageId 
 * @param selectedDate 
 * @param selectedTime 
 * @param sessionStartTime 
 */
data class SessionHistory (

    val duration: kotlin.Long? = null,
    val packageId: kotlin.String? = null,
    val selectedDate: kotlin.String? = null,
    val selectedTime: FromToTime? = null,
    val sessionStartTime: kotlin.String? = null
) {
}