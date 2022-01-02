# ApplicationControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addApplication**](ApplicationControllerApi.md#addApplication) | **POST** /api/v1/security-server/application | add
[**deleteApplication**](ApplicationControllerApi.md#deleteApplication) | **DELETE** /api/v1/security-server/application/{id} | deleteApplication
[**editApplication**](ApplicationControllerApi.md#editApplication) | **PUT** /api/v1/security-server/application | editApplication
[**getAllApplications**](ApplicationControllerApi.md#getAllApplications) | **GET** /api/v1/security-server/application | getAllApplications
[**getApplication**](ApplicationControllerApi.md#getApplication) | **GET** /api/v1/security-server/application/{id} | getApplication
[**getPrivileges**](ApplicationControllerApi.md#getPrivileges) | **GET** /api/v1/security-server/application/privileges | getPrivileges
[**selectiveEditAddApplicationUsingPATCH1**](ApplicationControllerApi.md#selectiveEditAddApplicationUsingPATCH1) | **PATCH** /api/v1/security-server/application/add | selectiveEditAddApplication
[**selectiveEditRemoveApplicationUsingPATCH1**](ApplicationControllerApi.md#selectiveEditRemoveApplicationUsingPATCH1) | **PATCH** /api/v1/security-server/application/remove | selectiveEditRemoveApplication

<a name="addApplication"></a>
# **addApplication**
> ApplicationDto addApplication(body, acceptLanguage)

add

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val body : ApplicationDto =  // ApplicationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ApplicationDto = apiInstance.addApplication(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#addApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#addApplication")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationDto**](ApplicationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ApplicationDto**](ApplicationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteApplication"></a>
# **deleteApplication**
> deleteApplication(id, acceptLanguage)

deleteApplication

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteApplication(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#deleteApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#deleteApplication")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="editApplication"></a>
# **editApplication**
> editApplication(body, acceptLanguage)

editApplication

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val body : ApplicationDto =  // ApplicationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.editApplication(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#editApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#editApplication")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationDto**](ApplicationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllApplications"></a>
# **getAllApplications**
> Page_ApplicationDto_ getAllApplications(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllApplications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_ApplicationDto_ = apiInstance.getAllApplications(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#getAllApplications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#getAllApplications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_ApplicationDto_**](Page_ApplicationDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApplication"></a>
# **getApplication**
> ApplicationDto getApplication(id, acceptLanguage)

getApplication

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ApplicationDto = apiInstance.getApplication(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#getApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#getApplication")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ApplicationDto**](ApplicationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPrivileges"></a>
# **getPrivileges**
> ApiPermissionDto getPrivileges(acceptLanguage)

getPrivileges

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ApiPermissionDto = apiInstance.getPrivileges(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#getPrivileges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#getPrivileges")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ApiPermissionDto**](ApiPermissionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="selectiveEditAddApplicationUsingPATCH1"></a>
# **selectiveEditAddApplicationUsingPATCH1**
> selectiveEditAddApplicationUsingPATCH1(body, acceptLanguage)

selectiveEditAddApplication

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val body : ApplicationDto =  // ApplicationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.selectiveEditAddApplicationUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#selectiveEditAddApplicationUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#selectiveEditAddApplicationUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationDto**](ApplicationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="selectiveEditRemoveApplicationUsingPATCH1"></a>
# **selectiveEditRemoveApplicationUsingPATCH1**
> selectiveEditRemoveApplicationUsingPATCH1(body, acceptLanguage)

selectiveEditRemoveApplication

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationControllerApi()
val body : ApplicationDto =  // ApplicationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.selectiveEditRemoveApplicationUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ApplicationControllerApi#selectiveEditRemoveApplicationUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationControllerApi#selectiveEditRemoveApplicationUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationDto**](ApplicationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

