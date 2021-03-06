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
 * @param activityDuration 
 * @param avatar 
 * @param city 
 * @param commentsCount 
 * @param consultingType 
 * @param duration 
 * @param firstName 
 * @param lastName 
 * @param lawyerCategoryEnum 
 * @param lawyerGradeEnum 
 * @param numberOfConsultations 
 * @param price 
 * @param rate 
 * @param responseTime 
 * @param userId 
 */
data class Lawyer (

    val activityDuration: kotlin.Int? = null,
    val avatar: kotlin.String? = null,
    val city: kotlin.String? = null,
    val commentsCount: kotlin.Int? = null,
    val consultingType: Lawyer.ConsultingType? = null,
    val duration: kotlin.Long? = null,
    val firstName: kotlin.String? = null,
    val lastName: kotlin.String? = null,
    val lawyerCategoryEnum: kotlin.String? = null,
    val lawyerGradeEnum: kotlin.String? = null,
    val numberOfConsultations: kotlin.Int? = null,
    val price: kotlin.Long? = null,
    val rate: kotlin.Float? = null,
    val responseTime: kotlin.Long? = null,
    val userId: kotlin.String? = null
) {
    /**
    * 
    * Values: OFFLINE,ONLINE,URGENT
    */
    enum class ConsultingType(val value: kotlin.String){
        OFFLINE("OFFLINE"),
        ONLINE("ONLINE"),
        URGENT("URGENT");
    }
}