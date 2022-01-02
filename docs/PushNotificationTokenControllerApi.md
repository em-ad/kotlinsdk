# PushNotificationTokenControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushToken**](PushNotificationTokenControllerApi.md#createPushToken) | **POST** /api/v1/notification/push/token | create
[**deletePushToken**](PushNotificationTokenControllerApi.md#deletePushToken) | **DELETE** /api/v1/notification/push/token/{id} | deletePushToken
[**getAllPushTokens**](PushNotificationTokenControllerApi.md#getAllPushTokens) | **GET** /api/v1/notification/push/token | getAllPushTokens
[**getPushToken**](PushNotificationTokenControllerApi.md#getPushToken) | **GET** /api/v1/notification/push/token/{id} | getPushToken
[**send2**](PushNotificationTokenControllerApi.md#send2) | **POST** /api/v1/notification/push/token/send | create
[**updatePushToken**](PushNotificationTokenControllerApi.md#updatePushToken) | **PUT** /api/v1/notification/push/token/{id} | update

<a name="createPushToken"></a>
# **createPushToken**
> PushTokenDto createPushToken(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationTokenControllerApi()
val body : PushTokenDto =  // PushTokenDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushTokenDto = apiInstance.createPushToken(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationTokenControllerApi#createPushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationTokenControllerApi#createPushToken")
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

<a name="deletePushToken"></a>
# **deletePushToken**
> deletePushToken(id, acceptLanguage)

deletePushToken

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationTokenControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deletePushToken(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationTokenControllerApi#deletePushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationTokenControllerApi#deletePushToken")
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

<a name="getAllPushTokens"></a>
# **getAllPushTokens**
> Page_PushTokenDto_ getAllPushTokens(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllPushTokens

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationTokenControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_PushTokenDto_ = apiInstance.getAllPushTokens(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationTokenControllerApi#getAllPushTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationTokenControllerApi#getAllPushTokens")
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

<a name="getPushToken"></a>
# **getPushToken**
> PushTokenDto getPushToken(id, acceptLanguage)

getPushToken

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationTokenControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushTokenDto = apiInstance.getPushToken(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationTokenControllerApi#getPushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationTokenControllerApi#getPushToken")
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

<a name="send2"></a>
# **send2**
> kotlin.String send2(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationTokenControllerApi()
val body : PushMessageDto =  // PushMessageDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.String = apiInstance.send2(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationTokenControllerApi#send2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationTokenControllerApi#send2")
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

<a name="updatePushToken"></a>
# **updatePushToken**
> updatePushToken(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationTokenControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : PushTokenDto =  // PushTokenDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updatePushToken(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationTokenControllerApi#updatePushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationTokenControllerApi#updatePushToken")
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

