# PushServerControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushServer2**](PushServerControllerApi.md#createPushServer2) | **POST** /api/v1/mgs/push/server | create
[**deletePushServer2**](PushServerControllerApi.md#deletePushServer2) | **DELETE** /api/v1/mgs/push/server/{id} | deletePushServer
[**getAllPushServers2**](PushServerControllerApi.md#getAllPushServers2) | **GET** /api/v1/mgs/push/server | getAllPushServers
[**getPushServer2**](PushServerControllerApi.md#getPushServer2) | **GET** /api/v1/mgs/push/server/{id} | getPushServer
[**updatePushServer2**](PushServerControllerApi.md#updatePushServer2) | **PUT** /api/v1/mgs/push/server/{id} | update

<a name="createPushServer2"></a>
# **createPushServer2**
> PushServerDto createPushServer2(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerApi()
val body : PushServerDto =  // PushServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushServerDto = apiInstance.createPushServer2(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerApi#createPushServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerApi#createPushServer2")
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

<a name="deletePushServer2"></a>
# **deletePushServer2**
> deletePushServer2(id, acceptLanguage)

deletePushServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deletePushServer2(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerApi#deletePushServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerApi#deletePushServer2")
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

<a name="getAllPushServers2"></a>
# **getAllPushServers2**
> Page_PushServerDto_ getAllPushServers2(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllPushServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_PushServerDto_ = apiInstance.getAllPushServers2(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerApi#getAllPushServers2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerApi#getAllPushServers2")
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

<a name="getPushServer2"></a>
# **getPushServer2**
> PushServerDto getPushServer2(id, acceptLanguage)

getPushServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushServerDto = apiInstance.getPushServer2(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerApi#getPushServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerApi#getPushServer2")
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

<a name="updatePushServer2"></a>
# **updatePushServer2**
> updatePushServer2(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : PushServerDto =  // PushServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updatePushServer2(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerApi#updatePushServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerApi#updatePushServer2")
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

