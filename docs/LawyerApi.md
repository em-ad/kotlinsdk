# LawyerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkInformation**](LawyerApi.md#checkInformation) | **POST** /api/v1/datyar/lawyers/check-information | checkInformation
[**create2**](LawyerApi.md#create2) | **POST** /api/v1/datyar/lawyers/create | create
[**get3**](LawyerApi.md#get3) | **GET** /api/v1/datyar/lawyers/professional-profile | get
[**get4**](LawyerApi.md#get4) | **GET** /api/v1/datyar/lawyers/get/{user-id} | get
[**getById**](LawyerApi.md#getById) | **GET** /api/v1/datyar/lawyers/professional-profile/{id} | getById
[**getCapabilityById**](LawyerApi.md#getCapabilityById) | **GET** /api/v1/datyar/lawyers/capability/{lawyerId} | getCapabilityById
[**getComments**](LawyerApi.md#getComments) | **GET** /api/v1/datyar/lawyers/comment/{lawyerId} | getComments
[**getEducationalInformationById**](LawyerApi.md#getEducationalInformationById) | **GET** /api/v1/datyar/lawyers/educational-information/{lawyerId} | getEducationalInformationById
[**getLanguages**](LawyerApi.md#getLanguages) | **GET** /api/v1/datyar/lawyers/languages | getLanguages
[**getLawyerInformation**](LawyerApi.md#getLawyerInformation) | **GET** /api/v1/datyar/lawyers/professional-profile/get/{user-id} | getLawyerInformation
[**getPersonalInformationById**](LawyerApi.md#getPersonalInformationById) | **GET** /api/v1/datyar/lawyers/personal-information/{lawyerId} | getPersonalInformationById
[**getProfessionalInformationById**](LawyerApi.md#getProfessionalInformationById) | **GET** /api/v1/datyar/lawyers/professional-information/{lawyerId} | getProfessionalInformationById
[**getResumeById**](LawyerApi.md#getResumeById) | **GET** /api/v1/datyar/lawyers/resume/{lawyerId} | getResumeById
[**lawyersList**](LawyerApi.md#lawyersList) | **GET** /api/v1/datyar/lawyers/consulting/get/{consultation-type} | lawyersList
[**lawyersListWithPackage**](LawyerApi.md#lawyersListWithPackage) | **GET** /api/v1/datyar/lawyers/consulting/{user-id} | lawyersListWithPackage
[**saveCapability**](LawyerApi.md#saveCapability) | **PUT** /api/v1/datyar/lawyers/capability | saveCapability
[**saveCapabilityById**](LawyerApi.md#saveCapabilityById) | **PUT** /api/v1/datyar/lawyers/capability/{lawyerId} | saveCapabilityById
[**saveEducationalInformation**](LawyerApi.md#saveEducationalInformation) | **PUT** /api/v1/datyar/lawyers/educational-information | saveEducationalInformation
[**saveEducationalInformationById**](LawyerApi.md#saveEducationalInformationById) | **PUT** /api/v1/datyar/lawyers/educational-information/{lawyerId} | saveEducationalInformationById
[**savePersonalInformation**](LawyerApi.md#savePersonalInformation) | **PUT** /api/v1/datyar/lawyers/personal-information | savePersonalInformation
[**savePersonalInformationById**](LawyerApi.md#savePersonalInformationById) | **PUT** /api/v1/datyar/lawyers/personal-information/{lawyerId} | savePersonalInformationById
[**saveProfessionalInformation**](LawyerApi.md#saveProfessionalInformation) | **PUT** /api/v1/datyar/lawyers/professional-information | saveProfessionalInformation
[**saveProfessionalInformation1**](LawyerApi.md#saveProfessionalInformation1) | **PUT** /api/v1/datyar/lawyers/professional-information/{lawyerId} | saveProfessionalInformation
[**saveResume**](LawyerApi.md#saveResume) | **PUT** /api/v1/datyar/lawyers/resume | saveResume
[**saveResumeById**](LawyerApi.md#saveResumeById) | **PUT** /api/v1/datyar/lawyers/resume/{lawyerId} | saveResumeById
[**updateLawyerStateUsingPATCH1**](LawyerApi.md#updateLawyerStateUsingPATCH1) | **PATCH** /api/v1/datyar/lawyers/change-state | updateLawyerState

<a name="checkInformation"></a>
# **checkInformation**
> checkInformation(acceptLanguage)

checkInformation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.checkInformation(acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#checkInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#checkInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="create2"></a>
# **create2**
> GetLawyerDto create2(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val body : CreateLawyerDto =  // CreateLawyerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLawyerDto = apiInstance.create2(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#create2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#create2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLawyerDto**](CreateLawyerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLawyerDto**](GetLawyerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="get3"></a>
# **get3**
> ProfessionalProfileDTO get3(acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.get3(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#get3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#get3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get4"></a>
# **get4**
> GetLawyerDto get4(userId, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val userId : kotlin.String = userId_example // kotlin.String | user-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLawyerDto = apiInstance.get4(userId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#get4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#get4")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| user-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLawyerDto**](GetLawyerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getById"></a>
# **getById**
> LawyerConsultingDto getById(id, acceptLanguage)

getById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LawyerConsultingDto = apiInstance.getById(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LawyerConsultingDto**](LawyerConsultingDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCapabilityById"></a>
# **getCapabilityById**
> kotlin.Array&lt;Capability&gt; getCapabilityById(lawyerId, acceptLanguage)

getCapabilityById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<Capability> = apiInstance.getCapabilityById(lawyerId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getCapabilityById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getCapabilityById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;Capability&gt;**](Capability.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getComments"></a>
# **getComments**
> Page_GetComment_ getComments(lawyerId, acceptLanguage, pageNumber, pageSize, sort, sortKey)

getComments

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : Page_GetComment_ = apiInstance.getComments(lawyerId, acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getComments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**Page_GetComment_**](Page_GetComment_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEducationalInformationById"></a>
# **getEducationalInformationById**
> EducationalBackground getEducationalInformationById(lawyerId, acceptLanguage)

getEducationalInformationById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : EducationalBackground = apiInstance.getEducationalInformationById(lawyerId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getEducationalInformationById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getEducationalInformationById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**EducationalBackground**](EducationalBackground.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLanguages"></a>
# **getLanguages**
> kotlin.Array&lt;LanguageDTO&gt; getLanguages(acceptLanguage)

getLanguages

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<LanguageDTO> = apiInstance.getLanguages(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getLanguages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getLanguages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;LanguageDTO&gt;**](LanguageDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLawyerInformation"></a>
# **getLawyerInformation**
> LawyerConsultingDto getLawyerInformation(userId, acceptLanguage)

getLawyerInformation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val userId : kotlin.String = userId_example // kotlin.String | user-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LawyerConsultingDto = apiInstance.getLawyerInformation(userId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getLawyerInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getLawyerInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| user-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LawyerConsultingDto**](LawyerConsultingDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPersonalInformationById"></a>
# **getPersonalInformationById**
> ProfessionalPersonalInformationDTORes getPersonalInformationById(lawyerId, acceptLanguage)

getPersonalInformationById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalPersonalInformationDTORes = apiInstance.getPersonalInformationById(lawyerId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getPersonalInformationById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getPersonalInformationById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalPersonalInformationDTORes**](ProfessionalPersonalInformationDTORes.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProfessionalInformationById"></a>
# **getProfessionalInformationById**
> ProfessionalProfile getProfessionalInformationById(lawyerId, acceptLanguage)

getProfessionalInformationById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfile = apiInstance.getProfessionalInformationById(lawyerId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getProfessionalInformationById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getProfessionalInformationById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfile**](ProfessionalProfile.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getResumeById"></a>
# **getResumeById**
> kotlin.Array&lt;Resume&gt; getResumeById(lawyerId, acceptLanguage)

getResumeById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<Resume> = apiInstance.getResumeById(lawyerId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#getResumeById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#getResumeById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;Resume&gt;**](Resume.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="lawyersList"></a>
# **lawyersList**
> Page_Lawyer_ lawyersList(consultationType, acceptLanguage, byPrice, byRate, categoryId, firstName, fullName, genderEnum, lastName, pageNumber, pageSize, sort, sortKey)

lawyersList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val consultationType : kotlin.String = consultationType_example // kotlin.String | consultation-type
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byPrice : kotlin.String = byPrice_example // kotlin.String | 
val byRate : kotlin.String = byRate_example // kotlin.String | 
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val firstName : kotlin.String = firstName_example // kotlin.String | 
val fullName : kotlin.String = fullName_example // kotlin.String | 
val genderEnum : kotlin.String = genderEnum_example // kotlin.String | 
val lastName : kotlin.String = lastName_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : Page_Lawyer_ = apiInstance.lawyersList(consultationType, acceptLanguage, byPrice, byRate, categoryId, firstName, fullName, genderEnum, lastName, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#lawyersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#lawyersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationType** | **kotlin.String**| consultation-type | [enum: OFFLINE, ONLINE, URGENT]
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **byPrice** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **byRate** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **categoryId** | **kotlin.String**| categoryId | [optional]
 **firstName** | **kotlin.String**|  | [optional]
 **fullName** | **kotlin.String**|  | [optional]
 **genderEnum** | **kotlin.String**|  | [optional] [enum: FEMALE, MALE, NONE]
 **lastName** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**Page_Lawyer_**](Page_Lawyer_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="lawyersListWithPackage"></a>
# **lawyersListWithPackage**
> kotlin.Array&lt;PackageProperties&gt; lawyersListWithPackage(userId, acceptLanguage, categoryId, type)

lawyersListWithPackage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val userId : kotlin.String = userId_example // kotlin.String | user-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val type : kotlin.String = type_example // kotlin.String | type
try {
    val result : kotlin.Array<PackageProperties> = apiInstance.lawyersListWithPackage(userId, acceptLanguage, categoryId, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#lawyersListWithPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#lawyersListWithPackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| user-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **categoryId** | **kotlin.String**| categoryId | [optional]
 **type** | **kotlin.String**| type | [optional] [enum: OFFLINE, ONLINE, URGENT]

### Return type

[**kotlin.Array&lt;PackageProperties&gt;**](PackageProperties.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="saveCapability"></a>
# **saveCapability**
> ProfessionalProfileDTO saveCapability(body, acceptLanguage)

saveCapability

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val body : CapabilityDto =  // CapabilityDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveCapability(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveCapability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveCapability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CapabilityDto**](CapabilityDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveCapabilityById"></a>
# **saveCapabilityById**
> ProfessionalProfileDTO saveCapabilityById(lawyerId, body, acceptLanguage)

saveCapabilityById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val body : CapabilityDto =  // CapabilityDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveCapabilityById(lawyerId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveCapabilityById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveCapabilityById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **body** | [**CapabilityDto**](CapabilityDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveEducationalInformation"></a>
# **saveEducationalInformation**
> ProfessionalProfileDTO saveEducationalInformation(body, acceptLanguage)

saveEducationalInformation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val body : EducationalBackgroundDTO =  // EducationalBackgroundDTO | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveEducationalInformation(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveEducationalInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveEducationalInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EducationalBackgroundDTO**](EducationalBackgroundDTO.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveEducationalInformationById"></a>
# **saveEducationalInformationById**
> ProfessionalProfileDTO saveEducationalInformationById(lawyerId, body, acceptLanguage)

saveEducationalInformationById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val body : EducationalBackgroundDTO =  // EducationalBackgroundDTO | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveEducationalInformationById(lawyerId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveEducationalInformationById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveEducationalInformationById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **body** | [**EducationalBackgroundDTO**](EducationalBackgroundDTO.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="savePersonalInformation"></a>
# **savePersonalInformation**
> ProfessionalProfileDTO savePersonalInformation(body, acceptLanguage)

savePersonalInformation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val body : PersonalInformationDTO =  // PersonalInformationDTO | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.savePersonalInformation(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#savePersonalInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#savePersonalInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonalInformationDTO**](PersonalInformationDTO.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="savePersonalInformationById"></a>
# **savePersonalInformationById**
> ProfessionalProfileDTO savePersonalInformationById(lawyerId, body, acceptLanguage)

savePersonalInformationById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val body : ProfessionalPersonalInformationDTOReq =  // ProfessionalPersonalInformationDTOReq | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.savePersonalInformationById(lawyerId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#savePersonalInformationById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#savePersonalInformationById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **body** | [**ProfessionalPersonalInformationDTOReq**](ProfessionalPersonalInformationDTOReq.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveProfessionalInformation"></a>
# **saveProfessionalInformation**
> ProfessionalProfileDTO saveProfessionalInformation(body, acceptLanguage)

saveProfessionalInformation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val body : ProfessionalInformationDTO =  // ProfessionalInformationDTO | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveProfessionalInformation(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveProfessionalInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveProfessionalInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProfessionalInformationDTO**](ProfessionalInformationDTO.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveProfessionalInformation1"></a>
# **saveProfessionalInformation1**
> ProfessionalProfileDTO saveProfessionalInformation1(lawyerId, body, acceptLanguage)

saveProfessionalInformation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val body : ProfessionalInformationProDTO =  // ProfessionalInformationProDTO | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveProfessionalInformation1(lawyerId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveProfessionalInformation1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveProfessionalInformation1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **body** | [**ProfessionalInformationProDTO**](ProfessionalInformationProDTO.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveResume"></a>
# **saveResume**
> ProfessionalProfileDTO saveResume(body, acceptLanguage)

saveResume

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val body : ResumeDTO =  // ResumeDTO | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveResume(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveResume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveResume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResumeDTO**](ResumeDTO.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveResumeById"></a>
# **saveResumeById**
> ProfessionalProfileDTO saveResumeById(lawyerId, body, acceptLanguage)

saveResumeById

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyerId
val body : ResumeDTO =  // ResumeDTO | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.saveResumeById(lawyerId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#saveResumeById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#saveResumeById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyerId |
 **body** | [**ResumeDTO**](ResumeDTO.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateLawyerStateUsingPATCH1"></a>
# **updateLawyerStateUsingPATCH1**
> ProfessionalProfileDTO updateLawyerStateUsingPATCH1(body, acceptLanguage)

updateLawyerState

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LawyerApi()
val body : LawyerConfirmationDto =  // LawyerConfirmationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ProfessionalProfileDTO = apiInstance.updateLawyerStateUsingPATCH1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LawyerApi#updateLawyerStateUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LawyerApi#updateLawyerStateUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LawyerConfirmationDto**](LawyerConfirmationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ProfessionalProfileDTO**](ProfessionalProfileDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

