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
 * @param applicationType 
 * @param createdDate 
 * @param id 
 * @param link 
 * @param metaData 
 * @param packageName 
 * @param updateMode 
 * @param versionCode 
 * @param versionName 
 */
data class GetApplicationVersion (

    val applicationName: kotlin.String? = null,
    val applicationType: GetApplicationVersion.ApplicationType? = null,
    val createdDate: kotlin.String? = null,
    val id: kotlin.String? = null,
    val link: kotlin.String? = null,
    val metaData: MetaData? = null,
    val packageName: kotlin.String? = null,
    val updateMode: GetApplicationVersion.UpdateMode? = null,
    val versionCode: kotlin.String? = null,
    val versionName: kotlin.String? = null
) {
    /**
    * 
    * Values: ANDROID,IOS
    */
    enum class ApplicationType(val value: kotlin.String){
        ANDROID("ANDROID"),
        IOS("IOS");
    }
    /**
    * 
    * Values: FORCE,RECOMMENDED
    */
    enum class UpdateMode(val value: kotlin.String){
        FORCE("FORCE"),
        RECOMMENDED("RECOMMENDED");
    }
}