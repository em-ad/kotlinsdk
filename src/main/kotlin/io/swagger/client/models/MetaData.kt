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
 * @param changes New features or bug fixes
 * @param title Update title
 */
data class MetaData (

    /* New features or bug fixes */
    val changes: kotlin.Array<kotlin.String>? = null,
    /* Update title */
    val title: kotlin.String? = null
) {
}