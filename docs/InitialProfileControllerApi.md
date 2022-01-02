# InitialProfileControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInitialProfile**](InitialProfileControllerApi.md#createInitialProfile) | **POST** /api/v1/datyar/initial-profile | initial profile
[**createLawyerType**](InitialProfileControllerApi.md#createLawyerType) | **POST** /api/v1/datyar/initial-profile/lawyerType | lawyerType
[**getListLawyerType**](InitialProfileControllerApi.md#getListLawyerType) | **GET** /api/v1/datyar/initial-profile/lawyer-type | ListLawyerType 
[**insertLawyersLicenceWithPhotos**](InitialProfileControllerApi.md#insertLawyersLicenceWithPhotos) | **POST** /api/v1/datyar/initial-profile/lawyers-licence | LawyersLicence
[**insertLawyersResumeAndDegree**](InitialProfileControllerApi.md#insertLawyersResumeAndDegree) | **POST** /api/v1/datyar/initial-profile/lawyers-resume-degree | Lawyers lawyers resume degree
[**insertSelectSKill**](InitialProfileControllerApi.md#insertSelectSKill) | **POST** /api/v1/datyar/initial-profile/select-skill | Select skill
[**uploadInitialProfile**](InitialProfileControllerApi.md#uploadInitialProfile) | **POST** /api/v1/datyar/initial-profile/upload-file | upload InitialProfile

<a name="createInitialProfile"></a>
# **createInitialProfile**
> User createInitialProfile(body, acceptLanguage)

initial profile

This api add to initial-profile lawyer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InitialProfileControllerApi()
val body : InitialProfileLawyerDto =  // InitialProfileLawyerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : User = apiInstance.createInitialProfile(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitialProfileControllerApi#createInitialProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitialProfileControllerApi#createInitialProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InitialProfileLawyerDto**](InitialProfileLawyerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createLawyerType"></a>
# **createLawyerType**
> ProfessionalProfileDTO createLawyerType(body, acceptLanguage)

lawyerType

This api add to lawyerType

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InitialProfileControllerApi()
val body : LawyerTypeDto =  // LawyerTypeDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.createLawyerType(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitialProfileControllerApi#createLawyerType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitialProfileControllerApi#createLawyerType")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LawyerTypeDto**](LawyerTypeDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getListLawyerType"></a>
# **getListLawyerType**
> LawyerTypeResponseModel getListLawyerType(acceptLanguage)

ListLawyerType 

This api List Lawyer Type

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InitialProfileControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LawyerTypeResponseModel = apiInstance.getListLawyerType(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitialProfileControllerApi#getListLawyerType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitialProfileControllerApi#getListLawyerType")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LawyerTypeResponseModel**](LawyerTypeResponseModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertLawyersLicenceWithPhotos"></a>
# **insertLawyersLicenceWithPhotos**
> ProfessionalProfileDTO insertLawyersLicenceWithPhotos(body, acceptLanguage)

LawyersLicence

This api add to LawyersLicence

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InitialProfileControllerApi()
val body : LawyersLicenseUploadFileDto =  // LawyersLicenseUploadFileDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.insertLawyersLicenceWithPhotos(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitialProfileControllerApi#insertLawyersLicenceWithPhotos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitialProfileControllerApi#insertLawyersLicenceWithPhotos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LawyersLicenseUploadFileDto**](LawyersLicenseUploadFileDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="insertLawyersResumeAndDegree"></a>
# **insertLawyersResumeAndDegree**
> ProfessionalProfileDTO insertLawyersResumeAndDegree(body, acceptLanguage)

Lawyers lawyers resume degree

This api add to lawyers,resume,degree

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InitialProfileControllerApi()
val body : LawyersResumeAndDegreeEducationDto =  // LawyersResumeAndDegreeEducationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.insertLawyersResumeAndDegree(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitialProfileControllerApi#insertLawyersResumeAndDegree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitialProfileControllerApi#insertLawyersResumeAndDegree")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LawyersResumeAndDegreeEducationDto**](LawyersResumeAndDegreeEducationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="insertSelectSKill"></a>
# **insertSelectSKill**
> ProfessionalProfileDTO insertSelectSKill(body, acceptLanguage)

Select skill

This api add to Select skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InitialProfileControllerApi()
val body : SelectSkillDto =  // SelectSkillDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.insertSelectSKill(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitialProfileControllerApi#insertSelectSKill")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitialProfileControllerApi#insertSelectSKill")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SelectSkillDto**](SelectSkillDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadInitialProfile"></a>
# **uploadInitialProfile**
> FileOrFolder uploadInitialProfile(name, acceptLanguage)

upload InitialProfile

This api add to uploadInitialProfile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InitialProfileControllerApi()
val name : kotlin.String = name_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.uploadInitialProfile(name, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InitialProfileControllerApi#uploadInitialProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InitialProfileControllerApi#uploadInitialProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*, multipart/form-data

