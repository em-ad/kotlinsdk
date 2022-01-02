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

import io.swagger.client.models.LanguageModel

/**
 * 
 * @param city 
 * @param dateOfIssue 
 * @param degree 
 * @param languages 
 * @param licenseCode 
 * @param licenseFileId 
 * @param province 
 */
data class ProfessionalInformationDTO (

    val city: kotlin.String,
    val dateOfIssue: kotlin.String,
    val degree: ProfessionalInformationDTO.Degree? = null,
    val languages: kotlin.Array<LanguageModel>? = null,
    val licenseCode: kotlin.String,
    val licenseFileId: kotlin.String? = null,
    val province: kotlin.String
) {
    /**
    * 
    * Values: ASSOCIATE,BACHELOR,DIPLOMA,DOCTORATE,MASTER,POSTDOCTORAL
    */
    enum class Degree(val value: kotlin.String){
        ASSOCIATE("ASSOCIATE"),
        BACHELOR("BACHELOR"),
        DIPLOMA("DIPLOMA"),
        DOCTORATE("DOCTORATE"),
        MASTER("MASTER"),
        POSTDOCTORAL("POSTDOCTORAL");
    }
}