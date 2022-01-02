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
 * @param categoryId 
 * @param lawyerId 
 * @param packageId 
 * @param selectedDate 
 * @param selectedTime 
 * @param skillId 
 * @param type 
 */
data class CreateSessionDto (

    val categoryId: kotlin.String? = null,
    val lawyerId: kotlin.String,
    val packageId: kotlin.String,
    val selectedDate: kotlin.String? = null,
    val selectedTime: FromToTime? = null,
    val skillId: kotlin.String? = null,
    val type: CreateSessionDto.Type
) {
    /**
    * 
    * Values: OFFLINE,ONLINE,URGENT
    */
    enum class Type(val value: kotlin.String){
        OFFLINE("OFFLINE"),
        ONLINE("ONLINE"),
        URGENT("URGENT");
    }
}