# PushNotificationServerControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushServer**](PushNotificationServerControllerApi.md#createPushServer) | **POST** /api/v1/notification/push/server | create
[**deletePushServer**](PushNotificationServerControllerApi.md#deletePushServer) | **DELETE** /api/v1/notification/push/server/{id} | deletePushServer
[**getAllPushServers**](PushNotificationServerControllerApi.md#getAllPushServers) | **GET** /api/v1/notification/push/server | getAllPushServers
[**getPushServer**](PushNotificationServerControllerApi.md#getPushServer) | **GET** /api/v1/notification/push/server/{id} | getPushServer
[**updatePushServer**](PushNotificationServerControllerApi.md#updatePushServer) | **PUT** /api/v1/notification/push/server/{id} | update

<a name="createPushServer"></a>
# **createPushServer**
> PushServerDto createPushServer(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationServerControllerApi()
val body : PushServerDto =  // PushServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushServerDto = apiInstance.createPushServer(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationServerControllerApi#createPushServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationServerControllerApi#createPushServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushServerDto**](PushServerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**PushServerDto**](PushServerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePushServer"></a>
# **deletePushServer**
> deletePushServer(id, acceptLanguage)

deletePushServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deletePushServer(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationServerControllerApi#deletePushServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationServerControllerApi#deletePushServer")
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

<a name="getAllPushServers"></a>
# **getAllPushServers**
> Page_PushServerDto_ getAllPushServers(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllPushServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationServerControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_PushServerDto_ = apiInstance.getAllPushServers(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationServerControllerApi#getAllPushServers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationServerControllerApi#getAllPushServers")
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

[**Page_PushServerDto_**](Page_PushServerDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPushServer"></a>
# **getPushServer**
> PushServerDto getPushServer(id, acceptLanguage)

getPushServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushServerDto = apiInstance.getPushServer(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationServerControllerApi#getPushServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationServerControllerApi#getPushServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**PushServerDto**](PushServerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updatePushServer"></a>
# **updatePushServer**
> updatePushServer(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushNotificationServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : PushServerDto =  // PushServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updatePushServer(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationServerControllerApi#updatePushServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationServerControllerApi#updatePushServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**PushServerDto**](PushServerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

