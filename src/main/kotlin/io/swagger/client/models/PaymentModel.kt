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
 * @param cardNumber 
 * @param invoiceNumber 
 * @param paymentMethodId 
 * @param paymentToken 
 * @param referenceId 
 */
data class PaymentModel (

    val cardNumber: kotlin.String? = null,
    val invoiceNumber: kotlin.String? = null,
    val paymentMethodId: kotlin.String? = null,
    val paymentToken: kotlin.String? = null,
    val referenceId: kotlin.String? = null
) {
}