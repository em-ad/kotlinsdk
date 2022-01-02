# SmsServerControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateSmsServerUsingPATCH3**](SmsServerControllerApi.md#activateSmsServerUsingPATCH3) | **PATCH** /api/v1/mgs/sms-server/activate/{id} | activateSmsServer
[**createSmsServer2**](SmsServerControllerApi.md#createSmsServer2) | **POST** /api/v1/mgs/sms-server | create
[**deleteSmsServer2**](SmsServerControllerApi.md#deleteSmsServer2) | **DELETE** /api/v1/mgs/sms-server/{id} | deleteSmsServer
[**getAllSmsServers2**](SmsServerControllerApi.md#getAllSmsServers2) | **GET** /api/v1/mgs/sms-server | getAllSmsServers
[**getSmsServer2**](SmsServerControllerApi.md#getSmsServer2) | **GET** /api/v1/mgs/sms-server/{id} | getSmsServer
[**updateSmsServer2**](SmsServerControllerApi.md#updateSmsServer2) | **PUT** /api/v1/mgs/sms-server | updateSmsServer

<a name="activateSmsServerUsingPATCH3"></a>
# **activateSmsServerUsingPATCH3**
> activateSmsServerUsingPATCH3(id, acceptLanguage)

activateSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.activateSmsServerUsingPATCH3(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerApi#activateSmsServerUsingPATCH3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerApi#activateSmsServerUsingPATCH3")
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

<a name="createSmsServer2"></a>
# **createSmsServer2**
> SmsServerDto createSmsServer2(body, acceptLanguage)

create

don&#x27;t fill id, (for TWILIO add username and password)

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerApi()
val body : SmsServerDto =  // SmsServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SmsServerDto = apiInstance.createSmsServer2(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerApi#createSmsServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerApi#createSmsServer2")
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

<a name="deleteSmsServer2"></a>
# **deleteSmsServer2**
> deleteSmsServer2(id, acceptLanguage)

deleteSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteSmsServer2(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerApi#deleteSmsServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerApi#deleteSmsServer2")
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

<a name="getAllSmsServers2"></a>
# **getAllSmsServers2**
> Page_SmsServerDto_ getAllSmsServers2(pageNumber, pageSize, acceptLanguage, sort, sortKey)

getAllSmsServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_SmsServerDto_ = apiInstance.getAllSmsServers2(pageNumber, pageSize, acceptLanguage, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerApi#getAllSmsServers2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerApi#getAllSmsServers2")
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

<a name="getSmsServer2"></a>
# **getSmsServer2**
> SmsServerDto getSmsServer2(id, acceptLanguage)

getSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SmsServerDto = apiInstance.getSmsServer2(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerApi#getSmsServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerApi#getSmsServer2")
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

<a name="updateSmsServer2"></a>
# **updateSmsServer2**
> updateSmsServer2(body, acceptLanguage)

updateSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerApi()
val body : SmsServerDto =  // SmsServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateSmsServer2(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerApi#updateSmsServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerApi#updateSmsServer2")
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

