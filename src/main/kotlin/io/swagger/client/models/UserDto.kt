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

import io.swagger.client.models.PivotalPermissionDto
import io.swagger.client.models.UserExtraInfoDto

/**
 * 
 * @param createdDate 
 * @param createdDateMilli 
 * @param deleted 
 * @param email 
 * @param emailVerifiedAt 
 * @param extraInfo 
 * @param id 
 * @param locked 
 * @param metaData 
 * @param mobile 
 * @param mobileVerifiedAt 
 * @param pivotalPermissionList 
 * @param roles 
 * @param tokens 
 * @param userStatus 
 * @param username 
 */
data class UserDto (

    val createdDate: kotlin.String? = null,
    val createdDateMilli: kotlin.Long? = null,
    val deleted: kotlin.Boolean? = null,
    val email: kotlin.String? = null,
    val emailVerifiedAt: kotlin.String? = null,
    val extraInfo: UserExtraInfoDto? = null,
    val id: kotlin.String? = null,
    val locked: kotlin.Boolean? = null,
    val metaData: kotlin.Any? = null,
    val mobile: kotlin.String? = null,
    val mobileVerifiedAt: kotlin.String? = null,
    val pivotalPermissionList: kotlin.Array<PivotalPermissionDto>? = null,
    val roles: kotlin.Array<kotlin.String>? = null,
    val tokens: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val userStatus: UserDto.UserStatus? = null,
    val username: kotlin.String? = null
) {
    /**
    * 
    * Values: ACTIVATEDBYEMAILCODE,ACTIVATEDBYEMAILLINK,ACTIVATEDBYEMAILOTP,ACTIVATEDBYOTP,ACTIVATEDBYSMSCODE,ACTIVATEDBYSMSLINK,ACTIVATEDBYSMSOTP,NOTACTIVATED,PREACTIVATEDBYEMAILCODE,PREACTIVATEDBYEMAILLINK,PREACTIVATEDBYEMAILOTP,PREACTIVATEDBYSMSCODE,PREACTIVATEDBYSMSLINK,PREACTIVATEDBYSMSOTP,REGISTEREDBYADMIN,REGISTEREDBYAPPLEONESTEP,REGISTEREDBYAPPLETWOSTEP,REGISTEREDBYFACEBOOKONESTEP,REGISTEREDBYGOOGLEONESTEP,REGISTEREDBYGOOGLETWOSTEP,REGISTEREDBYLINKEDINONESTEP,REGISTEREDBYLINKEDINTWOSTEP
    */
    enum class UserStatus(val value: kotlin.String){
        ACTIVATEDBYEMAILCODE("ACTIVATED_BY_EMAIL_CODE"),
        ACTIVATEDBYEMAILLINK("ACTIVATED_BY_EMAIL_LINK"),
        ACTIVATEDBYEMAILOTP("ACTIVATED_BY_EMAIL_OTP"),
        ACTIVATEDBYOTP("ACTIVATED_BY_OTP"),
        ACTIVATEDBYSMSCODE("ACTIVATED_BY_SMS_CODE"),
        ACTIVATEDBYSMSLINK("ACTIVATED_BY_SMS_LINK"),
        ACTIVATEDBYSMSOTP("ACTIVATED_BY_SMS_OTP"),
        NOTACTIVATED("NOT_ACTIVATED"),
        PREACTIVATEDBYEMAILCODE("PRE_ACTIVATED_BY_EMAIL_CODE"),
        PREACTIVATEDBYEMAILLINK("PRE_ACTIVATED_BY_EMAIL_LINK"),
        PREACTIVATEDBYEMAILOTP("PRE_ACTIVATED_BY_EMAIL_OTP"),
        PREACTIVATEDBYSMSCODE("PRE_ACTIVATED_BY_SMS_CODE"),
        PREACTIVATEDBYSMSLINK("PRE_ACTIVATED_BY_SMS_LINK"),
        PREACTIVATEDBYSMSOTP("PRE_ACTIVATED_BY_SMS_OTP"),
        REGISTEREDBYADMIN("REGISTERED_BY_ADMIN"),
        REGISTEREDBYAPPLEONESTEP("REGISTERED_BY_APPLE_ONE_STEP"),
        REGISTEREDBYAPPLETWOSTEP("REGISTERED_BY_APPLE_TWO_STEP"),
        REGISTEREDBYFACEBOOKONESTEP("REGISTERED_BY_FACEBOOK_ONE_STEP"),
        REGISTEREDBYGOOGLEONESTEP("REGISTERED_BY_GOOGLE_ONE_STEP"),
        REGISTEREDBYGOOGLETWOSTEP("REGISTERED_BY_GOOGLE_TWO_STEP"),
        REGISTEREDBYLINKEDINONESTEP("REGISTERED_BY_LINKED_IN_ONE_STEP"),
        REGISTEREDBYLINKEDINTWOSTEP("REGISTERED_BY_LINKED_IN_TWO_STEP");
    }
}