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
 * @param lawyerId 
 * @param lawyerState 
 */
data class LawyerConfirmationDto (

    val comment: kotlin.Array<kotlin.String>? = null,
    val lawyerId: kotlin.String,
    val lawyerState: LawyerConfirmationDto.LawyerState
) {
    /**
    * 
    * Values: INCOMPLETEDOCUMENTS,REGISTERED,REJECTED,VERIFIED,WAITINGFORVERIFICATION
    */
    enum class LawyerState(val value: kotlin.String){
        INCOMPLETEDOCUMENTS("INCOMPLETE_DOCUMENTS"),
        REGISTERED("REGISTERED"),
        REJECTED("REJECTED"),
        VERIFIED("VERIFIED"),
        WAITINGFORVERIFICATION("WAITING_FOR_VERIFICATION");
    }
}