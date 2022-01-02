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

import io.swagger.client.models.Capability
import io.swagger.client.models.EducationalBackground
import io.swagger.client.models.LanguageModel
import io.swagger.client.models.PersonalInformation
import io.swagger.client.models.ProfessionalProfileInitialProfileDto
import io.swagger.client.models.Resume

/**
 * 
 * @param aboutMe 
 * @param address 
 * @param adminComments 
 * @param capabilities 
 * @param city 
 * @param dateOfIssue 
 * @param degree 
 * @param educationalBackground 
 * @param email 
 * @param emailVerifiedAt 
 * @param firstName 
 * @param gender 
 * @param initialProfile 
 * @param languages 
 * @param lastName 
 * @param lawyerGradeEnum 
 * @param lawyerState 
 * @param licenseCode 
 * @param licenseFileId 
 * @param mobile 
 * @param mobileVerifiedAt 
 * @param nationalCode 
 * @param numberOfSessions 
 * @param personalInformation 
 * @param profileImageUrl 
 * @param profileState 
 * @param province 
 * @param rate 
 * @param resumes 
 */
data class ProfessionalProfileDTO (

    val aboutMe: kotlin.String? = null,
    val address: kotlin.String? = null,
    val adminComments: kotlin.Array<kotlin.String>? = null,
    val capabilities: kotlin.Array<Capability>? = null,
    val city: kotlin.String? = null,
    val dateOfIssue: kotlin.String? = null,
    val degree: ProfessionalProfileDTO.Degree? = null,
    val educationalBackground: EducationalBackground? = null,
    val email: kotlin.String? = null,
    val emailVerifiedAt: kotlin.String? = null,
    val firstName: kotlin.String? = null,
    val gender: ProfessionalProfileDTO.Gender? = null,
    val initialProfile: ProfessionalProfileInitialProfileDto? = null,
    val languages: kotlin.Array<LanguageModel>? = null,
    val lastName: kotlin.String? = null,
    val lawyerGradeEnum: kotlin.String? = null,
    val lawyerState: ProfessionalProfileDTO.LawyerState? = null,
    val licenseCode: kotlin.String? = null,
    val licenseFileId: kotlin.String? = null,
    val mobile: kotlin.String? = null,
    val mobileVerifiedAt: kotlin.String? = null,
    val nationalCode: kotlin.String? = null,
    val numberOfSessions: kotlin.Int? = null,
    val personalInformation: PersonalInformation? = null,
    val profileImageUrl: kotlin.String? = null,
    val profileState: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null,
    val province: kotlin.String? = null,
    val rate: kotlin.Float? = null,
    val resumes: kotlin.Array<Resume>? = null
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
    /**
    * 
    * Values: FEMALE,MALE,NONE
    */
    enum class Gender(val value: kotlin.String){
        FEMALE("FEMALE"),
        MALE("MALE"),
        NONE("NONE");
    }
    /**
    * 
    * Values: INCOMPLETEDOCUMENTS,REGISTERED,REJECTED,VERIFIED,WAITINGFORVERIFICATION
    */
    enum class LawyerState(val value: kotlin.String){
        INCOMPLETEDOCUMENTS("INCOMPLETE_DOCUMENTS"),
        REGISTERED("REGISTERED"),
        REJECTED("REJECTED"),
        VERIFIED("VERIFIED"),
        WAITINGFORVERIFICATION("WAITING_FOR_VERIFICATION");
    }
}