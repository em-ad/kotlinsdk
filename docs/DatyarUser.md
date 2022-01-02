# DatyarUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | [**kotlin.String**](.md) |  |  [optional]
**avalidUsername** | [**kotlin.String**](.md) |  |  [optional]
**createdDate** | [**kotlin.String**](.md) |  |  [optional]
**credit** | [**kotlin.Double**](.md) |  |  [optional]
**deleted** | [**kotlin.Boolean**](.md) |  |  [optional]
**deletedAt** | [**kotlin.String**](.md) |  |  [optional]
**email** | [**kotlin.String**](.md) |  |  [optional]
**emailVerifiedAt** | [**kotlin.String**](.md) |  |  [optional]
**extraInfo** | [**UserExtraInfo**](UserExtraInfo.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**lastAuthenticatedClient** | [**kotlin.String**](.md) |  |  [optional]
**lastAuthenticationMethod** | [**inline**](#LastAuthenticationMethodEnum) |  |  [optional]
**lastLogin** | [**kotlin.String**](.md) |  |  [optional]
**lastModifiedDate** | [**kotlin.String**](.md) |  |  [optional]
**lastOrder** | [**kotlin.String**](.md) |  |  [optional]
**locked** | [**kotlin.Boolean**](.md) |  |  [optional]
**metaData** | [**kotlin.Any**](.md) |  |  [optional]
**mobile** | [**kotlin.String**](.md) |  |  [optional]
**mobileVerifiedAt** | [**kotlin.String**](.md) |  |  [optional]
**new** | [**kotlin.Boolean**](.md) |  |  [optional]
**password** | [**kotlin.String**](.md) |  |  [optional]
**pivotalPermissionList** | [**kotlin.Array&lt;PivotalPermission&gt;**](PivotalPermission.md) |  |  [optional]
**professionalProfile** | [**ProfessionalProfile**](ProfessionalProfile.md) |  |  [optional]
**rate** | [**kotlin.Float**](.md) |  |  [optional]
**roles** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**tokens** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](.md) |  |  [optional]
**userStatus** | [**inline**](#UserStatusEnum) |  |  [optional]
**username** | [**kotlin.String**](.md) |  |  [optional]
**verified** | [**kotlin.Boolean**](.md) |  |  [optional]
**version** | [**kotlin.Long**](.md) |  |  [optional]

<a name="LastAuthenticationMethodEnum"></a>
## Enum: lastAuthenticationMethod
Name | Value
---- | -----
lastAuthenticationMethod | APPLE, GOOGLE, LINKEDIN, OTP

<a name="UserStatusEnum"></a>
## Enum: userStatus
Name | Value
---- | -----
userStatus | ACTIVATED_BY_EMAIL_CODE, ACTIVATED_BY_EMAIL_LINK, ACTIVATED_BY_EMAIL_OTP, ACTIVATED_BY_OTP, ACTIVATED_BY_SMS_CODE, ACTIVATED_BY_SMS_LINK, ACTIVATED_BY_SMS_OTP, NOT_ACTIVATED, PRE_ACTIVATED_BY_EMAIL_CODE, PRE_ACTIVATED_BY_EMAIL_LINK, PRE_ACTIVATED_BY_EMAIL_OTP, PRE_ACTIVATED_BY_SMS_CODE, PRE_ACTIVATED_BY_SMS_LINK, PRE_ACTIVATED_BY_SMS_OTP, REGISTERED_BY_ADMIN, REGISTERED_BY_APPLE_ONE_STEP, REGISTERED_BY_APPLE_TWO_STEP, REGISTERED_BY_FACEBOOK_ONE_STEP, REGISTERED_BY_GOOGLE_ONE_STEP, REGISTERED_BY_GOOGLE_TWO_STEP, REGISTERED_BY_LINKED_IN_ONE_STEP, REGISTERED_BY_LINKED_IN_TWO_STEP
