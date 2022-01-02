# PushTokenControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushToken1**](PushTokenControllerApi.md#createPushToken1) | **POST** /api/v1/mgs/push/token | create
[**deletePushToken1**](PushTokenControllerApi.md#deletePushToken1) | **DELETE** /api/v1/mgs/push/token/{id} | deletePushToken
[**getAllPushTokens1**](PushTokenControllerApi.md#getAllPushTokens1) | **GET** /api/v1/mgs/push/token | getAllPushTokens
[**getPushToken1**](PushTokenControllerApi.md#getPushToken1) | **GET** /api/v1/mgs/push/token/{id} | getPushToken
[**send3**](PushTokenControllerApi.md#send3) | **POST** /api/v1/mgs/push/token/send | create
[**updatePushToken1**](PushTokenControllerApi.md#updatePushToken1) | **PUT** /api/v1/mgs/push/token/{id} | update

<a name="createPushToken1"></a>
# **createPushToken1**
> PushTokenDto createPushToken1(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerApi()
val body : PushTokenDto =  // PushTokenDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushTokenDto = apiInstance.createPushToken1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerApi#createPushToken1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerApi#createPushToken1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushTokenDto**](PushTokenDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**PushTokenDto**](PushTokenDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePushToken1"></a>
# **deletePushToken1**
> deletePushToken1(id, acceptLanguage)

deletePushToken

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deletePushToken1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerApi#deletePushToken1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerApi#deletePushToken1")
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

<a name="getAllPushTokens1"></a>
# **getAllPushTokens1**
> Page_PushTokenDto_ getAllPushTokens1(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllPushTokens

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_PushTokenDto_ = apiInstance.getAllPushTokens1(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerApi#getAllPushTokens1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerApi#getAllPushTokens1")
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

[**Page_PushTokenDto_**](Page_PushTokenDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPushToken1"></a>
# **getPushToken1**
> PushTokenDto getPushToken1(id, acceptLanguage)

getPushToken

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushTokenDto = apiInstance.getPushToken1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerApi#getPushToken1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerApi#getPushToken1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**PushTokenDto**](PushTokenDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="send3"></a>
# **send3**
> kotlin.String send3(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerApi()
val body : PushMessageDto =  // PushMessageDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.String = apiInstance.send3(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerApi#send3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerApi#send3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushMessageDto**](PushMessageDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

**kotlin.String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePushToken1"></a>
# **updatePushToken1**
> updatePushToken1(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : PushTokenDto =  // PushTokenDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updatePushToken1(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerApi#updatePushToken1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerApi#updatePushToken1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**PushTokenDto**](PushTokenDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

