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
 * @param file file
 * @param folderName folderName
 * @param name name
 */
data class UploadFoldernameBody (

    /* file */
    val file: kotlin.Array<kotlin.Byte>,
    /* folderName */
    val folderName: kotlin.String? = null,
    /* name */
    val name: kotlin.String? = null
) {
}