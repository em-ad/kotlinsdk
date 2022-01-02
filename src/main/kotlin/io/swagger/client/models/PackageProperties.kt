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
 * @param consultingCost 
 * @param duration 
 * @param numberOfQuestions 
 * @param packageId 
 * @param packageType 
 * @param responseTime 
 */
data class PackageProperties (

    val consultingCost: kotlin.Long? = null,
    val duration: kotlin.Long? = null,
    val numberOfQuestions: kotlin.Int? = null,
    val packageId: kotlin.String? = null,
    val packageType: PackageProperties.PackageType? = null,
    val responseTime: kotlin.Long? = null
) {
    /**
    * 
    * Values: OFFLINE,ONLINE,URGENT
    */
    enum class PackageType(val value: kotlin.String){
        OFFLINE("OFFLINE"),
        ONLINE("ONLINE"),
        URGENT("URGENT");
    }
}