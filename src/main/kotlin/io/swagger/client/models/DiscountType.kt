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
 * @param percent 
 * @param type 
 * @param value 
 */
data class DiscountType (

    val percent: kotlin.Int? = null,
    val type: DiscountType.Type? = null,
    val value: kotlin.Int? = null
) {
    /**
    * 
    * Values: CHARGE,PERCENTVALUE,PERCENT,VALUE
    */
    enum class Type(val value: kotlin.String){
        CHARGE("CHARGE"),
        PERCENTVALUE("PERCENT_VALUE"),
        PERCENT("percent"),
        VALUE("value");
    }
}