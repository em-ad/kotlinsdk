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
 * @param deviceId 
 * @param token 
 * @param type 
 */
data class CreatePushTokenDto (

    val deviceId: kotlin.String,
    val token: kotlin.String,
    val type: CreatePushTokenDto.Type? = null
) {
    /**
    * 
    * Values: ANDROID,IOS,UNSPECIFIED,WEB
    */
    enum class Type(val value: kotlin.String){
        ANDROID("ANDROID"),
        IOS("IOS"),
        UNSPECIFIED("UNSPECIFIED"),
        WEB("WEB");
    }
}