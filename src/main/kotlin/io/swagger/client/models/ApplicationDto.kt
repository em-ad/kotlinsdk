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
 * @param clientIds 
 * @param id fill only for edit
 * @param name 
 * @param roles 
 * @param title 
 */
data class ApplicationDto (

    val clientIds: kotlin.Array<kotlin.String>? = null,
    /* fill only for edit */
    val id: kotlin.String? = null,
    val name: kotlin.String? = null,
    val roles: kotlin.Array<kotlin.String>? = null,
    val title: kotlin.String? = null
) {
}