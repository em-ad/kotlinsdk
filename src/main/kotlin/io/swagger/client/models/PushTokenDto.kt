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
 * @param id 
 * @param token 
 * @param type 
 */
data class PushTokenDto (

    val id: kotlin.String? = null,
    val token: kotlin.String? = null,
    val type: PushTokenDto.Type? = null
) {
    /**
    * 
    * Values: ANDRIOD,IOS,UNSPECIFIED,WEB
    */
    enum class Type(val value: kotlin.String){
        ANDRIOD("ANDRIOD"),
        IOS("IOS"),
        UNSPECIFIED("UNSPECIFIED"),
        WEB("WEB");
    }
}