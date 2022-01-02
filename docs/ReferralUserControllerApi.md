# ReferralUserControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReferralUser**](ReferralUserControllerApi.md#createReferralUser) | **POST** /api/v1/campaign/referral/subscriber | create
[**deleteReferralUser**](ReferralUserControllerApi.md#deleteReferralUser) | **DELETE** /api/v1/campaign/referral/subscriber/{id} | deleteReferralUser
[**getReferralUser**](ReferralUserControllerApi.md#getReferralUser) | **GET** /api/v1/campaign/referral/subscriber/{id} | getReferralUser
[**getReferralUserList**](ReferralUserControllerApi.md#getReferralUserList) | **GET** /api/v1/campaign/referral/subscriber | getReferralUserList
[**updateReferralUser**](ReferralUserControllerApi.md#updateReferralUser) | **PUT** /api/v1/campaign/referral/subscriber/{id} | Update

<a name="createReferralUser"></a>
# **createReferralUser**
> ReferralUserDto createReferralUser(acceptLanguage)

create

 create ReferralUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ReferralUserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ReferralUserDto = apiInstance.createReferralUser(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferralUserControllerApi#createReferralUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferralUserControllerApi#createReferralUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ReferralUserDto**](ReferralUserDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteReferralUser"></a>
# **deleteReferralUser**
> deleteReferralUser(id, acceptLanguage)

deleteReferralUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ReferralUserControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteReferralUser(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ReferralUserControllerApi#deleteReferralUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferralUserControllerApi#deleteReferralUser")
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

<a name="getReferralUser"></a>
# **getReferralUser**
> ReferralUserDto getReferralUser(id, acceptLanguage)

getReferralUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ReferralUserControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ReferralUserDto = apiInstance.getReferralUser(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferralUserControllerApi#getReferralUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferralUserControllerApi#getReferralUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ReferralUserDto**](ReferralUserDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getReferralUserList"></a>
# **getReferralUserList**
> Page_ReferralUserDto_ getReferralUserList(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getReferralUserList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ReferralUserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_ReferralUserDto_ = apiInstance.getReferralUserList(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferralUserControllerApi#getReferralUserList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferralUserControllerApi#getReferralUserList")
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

[**Page_ReferralUserDto_**](Page_ReferralUserDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateReferralUser"></a>
# **updateReferralUser**
> updateReferralUser(id, body, acceptLanguage)

Update

 update ReferralUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ReferralUserControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : ReferralUserDto =  // ReferralUserDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateReferralUser(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ReferralUserControllerApi#updateReferralUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferralUserControllerApi#updateReferralUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**ReferralUserDto**](ReferralUserDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

