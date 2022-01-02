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

import io.swagger.client.models.GradeDto
import io.swagger.client.models.SkillsDto
import io.swagger.client.models.TypeDto

/**
 * 
 * @param degreeFiles 
 * @param grade 
 * @param licenseCode 
 * @param licenseFiles 
 * @param resumeFiles 
 * @param skills 
 * @param type 
 */
data class ProfessionalProfileInitialProfileDto (

    val degreeFiles: kotlin.Array<kotlin.String>? = null,
    val grade: GradeDto? = null,
    val licenseCode: kotlin.String? = null,
    val licenseFiles: kotlin.Array<kotlin.String>? = null,
    val resumeFiles: kotlin.Array<kotlin.String>? = null,
    val skills: kotlin.Array<SkillsDto>? = null,
    val type: TypeDto? = null
) {
}