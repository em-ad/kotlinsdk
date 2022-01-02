# SmsNotificationServerControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateSmsServerUsingPATCH1**](SmsNotificationServerControllerApi.md#activateSmsServerUsingPATCH1) | **PATCH** /api/v1/notification/sms-server/activate/{id} | activateSmsServer
[**createSmsServer**](SmsNotificationServerControllerApi.md#createSmsServer) | **POST** /api/v1/notification/sms-server | create
[**deleteSmsServer**](SmsNotificationServerControllerApi.md#deleteSmsServer) | **DELETE** /api/v1/notification/sms-server/{id} | deleteSmsServer
[**getAllSmsServers**](SmsNotificationServerControllerApi.md#getAllSmsServers) | **GET** /api/v1/notification/sms-server | getAllSmsServers
[**getSmsServer**](SmsNotificationServerControllerApi.md#getSmsServer) | **GET** /api/v1/notification/sms-server/{id} | getSmsServer
[**updateSmsServer**](SmsNotificationServerControllerApi.md#updateSmsServer) | **PUT** /api/v1/notification/sms-server | updateSmsServer

<a name="activateSmsServerUsingPATCH1"></a>
# **activateSmsServerUsingPATCH1**
> activateSmsServerUsingPATCH1(id, acceptLanguage)

activateSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsNotificationServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.activateSmsServerUsingPATCH1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsNotificationServerControllerApi#activateSmsServerUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsNotificationServerControllerApi#activateSmsServerUsingPATCH1")
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

<a name="createSmsServer"></a>
# **createSmsServer**
> SmsServerDto createSmsServer(body, acceptLanguage)

create

don&#x27;t fill id, (for TWILIO add username and password)

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsNotificationServerControllerApi()
val body : SmsServerDto =  // SmsServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SmsServerDto = apiInstance.createSmsServer(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsNotificationServerControllerApi#createSmsServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsNotificationServerControllerApi#createSmsServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmsServerDto**](SmsServerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SmsServerDto**](SmsServerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSmsServer"></a>
# **deleteSmsServer**
> deleteSmsServer(id, acceptLanguage)

deleteSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsNotificationServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteSmsServer(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsNotificationServerControllerApi#deleteSmsServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsNotificationServerControllerApi#deleteSmsServer")
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

<a name="getAllSmsServers"></a>
# **getAllSmsServers**
> Page_SmsServerDto_ getAllSmsServers(pageNumber, pageSize, acceptLanguage, sort, sortKey)

getAllSmsServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsNotificationServerControllerApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_SmsServerDto_ = apiInstance.getAllSmsServers(pageNumber, pageSize, acceptLanguage, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsNotificationServerControllerApi#getAllSmsServers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsNotificationServerControllerApi#getAllSmsServers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| starts from 0 | [enum: ]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [enum: ]
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_SmsServerDto_**](Page_SmsServerDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSmsServer"></a>
# **getSmsServer**
> SmsServerDto getSmsServer(id, acceptLanguage)

getSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsNotificationServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SmsServerDto = apiInstance.getSmsServer(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsNotificationServerControllerApi#getSmsServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsNotificationServerControllerApi#getSmsServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SmsServerDto**](SmsServerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSmsServer"></a>
# **updateSmsServer**
> updateSmsServer(body, acceptLanguage)

updateSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsNotificationServerControllerApi()
val body : SmsServerDto =  // SmsServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateSmsServer(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsNotificationServerControllerApi#updateSmsServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsNotificationServerControllerApi#updateSmsServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmsServerDto**](SmsServerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

