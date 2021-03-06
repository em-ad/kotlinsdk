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
 * @param academicCoefficients 
 * @param basePrice 
 * @param duration 
 * @param isExtendable 
 * @param numberOfQuestions 
 * @param predefinedMessages 
 * @param skillCoefficients 
 */
data class ConsultationPackageDto (

    val academicCoefficients: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,
    val basePrice: kotlin.Long? = null,
    val duration: kotlin.Long? = null,
    val isExtendable: kotlin.Boolean,
    val numberOfQuestions: kotlin.Int? = null,
    val predefinedMessages: kotlin.Array<kotlin.String>,
    val skillCoefficients: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>
) {
}