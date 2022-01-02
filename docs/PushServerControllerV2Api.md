# PushServerControllerV2Api

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushServer1**](PushServerControllerV2Api.md#createPushServer1) | **POST** /api/v2/notification/push/server | create
[**deletePushServer1**](PushServerControllerV2Api.md#deletePushServer1) | **DELETE** /api/v2/notification/push/server/{id} | deletePushServer
[**getAllPushServers1**](PushServerControllerV2Api.md#getAllPushServers1) | **GET** /api/v2/notification/push/server | getAllPushServers
[**getPushServer1**](PushServerControllerV2Api.md#getPushServer1) | **GET** /api/v2/notification/push/server/{id} | getPushServer
[**updatePushServer1**](PushServerControllerV2Api.md#updatePushServer1) | **PUT** /api/v2/notification/push/server/{id} | update

<a name="createPushServer1"></a>
# **createPushServer1**
> PushServerDto createPushServer1(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerV2Api()
val body : PushServerDto =  // PushServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushServerDto = apiInstance.createPushServer1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerV2Api#createPushServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerV2Api#createPushServer1")
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

<a name="deletePushServer1"></a>
# **deletePushServer1**
> deletePushServer1(id, acceptLanguage)

deletePushServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deletePushServer1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerV2Api#deletePushServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerV2Api#deletePushServer1")
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

<a name="getAllPushServers1"></a>
# **getAllPushServers1**
> Page_PushServerDto_ getAllPushServers1(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllPushServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerV2Api()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_PushServerDto_ = apiInstance.getAllPushServers1(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerV2Api#getAllPushServers1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerV2Api#getAllPushServers1")
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

<a name="getPushServer1"></a>
# **getPushServer1**
> PushServerDto getPushServer1(id, acceptLanguage)

getPushServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PushServerDto = apiInstance.getPushServer1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerV2Api#getPushServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerV2Api#getPushServer1")
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

<a name="updatePushServer1"></a>
# **updatePushServer1**
> updatePushServer1(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val body : PushServerDto =  // PushServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updatePushServer1(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushServerControllerV2Api#updatePushServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushServerControllerV2Api#updatePushServer1")
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

