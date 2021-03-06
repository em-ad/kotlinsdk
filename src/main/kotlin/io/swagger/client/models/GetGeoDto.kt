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
 * @param lat 
 * @param lng 
 * @param metaData 
 * @param tagsTitle 
 * @param type 
 */
data class GetGeoDto (

    val lat: kotlin.Double,
    val lng: kotlin.Double,
    val metaData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val tagsTitle: kotlin.Array<kotlin.String>,
    val type: kotlin.String
) {
}