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

import io.swagger.client.models.MetaData

/**
 * 
 * @param applicationName 
 * @param createdDate 
 * @param createdDateMilli 
 * @param isLatest 
 * @param link 
 * @param metaData 
 * @param packageName 
 * @param updateMode 
 * @param versionCode 
 * @param versionName 
 */
data class GetLatestVersion (

    val applicationName: kotlin.String? = null,
    val createdDate: kotlin.String? = null,
    val createdDateMilli: kotlin.Long? = null,
    val isLatest: kotlin.Boolean? = null,
    val link: kotlin.String? = null,
    val metaData: MetaData? = null,
    val packageName: kotlin.String? = null,
    val updateMode: GetLatestVersion.UpdateMode? = null,
    val versionCode: kotlin.String? = null,
    val versionName: kotlin.String? = null
) {
    /**
    * 
    * Values: FORCE,RECOMMENDED
    */
    enum class UpdateMode(val value: kotlin.String){
        FORCE("FORCE"),
        RECOMMENDED("RECOMMENDED");
    }
}