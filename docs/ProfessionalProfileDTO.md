# ProfessionalProfileDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aboutMe** | [**kotlin.String**](.md) |  |  [optional]
**address** | [**kotlin.String**](.md) |  |  [optional]
**adminComments** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**capabilities** | [**kotlin.Array&lt;Capability&gt;**](Capability.md) |  |  [optional]
**city** | [**kotlin.String**](.md) |  |  [optional]
**dateOfIssue** | [**kotlin.String**](.md) |  |  [optional]
**degree** | [**inline**](#DegreeEnum) |  |  [optional]
**educationalBackground** | [**EducationalBackground**](EducationalBackground.md) |  |  [optional]
**email** | [**kotlin.String**](.md) |  |  [optional]
**emailVerifiedAt** | [**kotlin.String**](.md) |  |  [optional]
**firstName** | [**kotlin.String**](.md) |  |  [optional]
**gender** | [**inline**](#GenderEnum) |  |  [optional]
**initialProfile** | [**ProfessionalProfileInitialProfileDto**](ProfessionalProfileInitialProfileDto.md) |  |  [optional]
**languages** | [**kotlin.Array&lt;LanguageModel&gt;**](LanguageModel.md) |  |  [optional]
**lastName** | [**kotlin.String**](.md) |  |  [optional]
**lawyerGradeEnum** | [**kotlin.String**](.md) |  |  [optional]
**lawyerState** | [**inline**](#LawyerStateEnum) |  |  [optional]
**licenseCode** | [**kotlin.String**](.md) |  |  [optional]
**licenseFileId** | [**kotlin.String**](.md) |  |  [optional]
**mobile** | [**kotlin.String**](.md) |  |  [optional]
**mobileVerifiedAt** | [**kotlin.String**](.md) |  |  [optional]
**nationalCode** | [**kotlin.String**](.md) |  |  [optional]
**numberOfSessions** | [**kotlin.Int**](.md) |  |  [optional]
**personalInformation** | [**PersonalInformation**](PersonalInformation.md) |  |  [optional]
**profileImageUrl** | [**kotlin.String**](.md) |  |  [optional]
**profileState** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Boolean&gt;**](.md) |  |  [optional]
**province** | [**kotlin.String**](.md) |  |  [optional]
**rate** | [**kotlin.Float**](.md) |  |  [optional]
**resumes** | [**kotlin.Array&lt;Resume&gt;**](Resume.md) |  |  [optional]

<a name="DegreeEnum"></a>
## Enum: degree
Name | Value
---- | -----
degree | ASSOCIATE, BACHELOR, DIPLOMA, DOCTORATE, MASTER, POSTDOCTORAL

<a name="GenderEnum"></a>
## Enum: gender
Name | Value
---- | -----
gender | FEMALE, MALE, NONE

<a name="LawyerStateEnum"></a>
## Enum: lawyerState
Name | Value
---- | -----
lawyerState | INCOMPLETE_DOCUMENTS, REGISTERED, REJECTED, VERIFIED, WAITING_FOR_VERIFICATION
