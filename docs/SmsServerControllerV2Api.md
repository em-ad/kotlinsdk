# SmsServerControllerV2Api

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateSmsServerUsingPATCH2**](SmsServerControllerV2Api.md#activateSmsServerUsingPATCH2) | **PATCH** /api/v2/notification/sms-server/activate/{id} | activateSmsServer
[**createSmsServer1**](SmsServerControllerV2Api.md#createSmsServer1) | **POST** /api/v2/notification/sms-server | create
[**deleteSmsServer1**](SmsServerControllerV2Api.md#deleteSmsServer1) | **DELETE** /api/v2/notification/sms-server/{id} | deleteSmsServer
[**getAllSmsServers1**](SmsServerControllerV2Api.md#getAllSmsServers1) | **GET** /api/v2/notification/sms-server | getAllSmsServers
[**getSmsServer1**](SmsServerControllerV2Api.md#getSmsServer1) | **GET** /api/v2/notification/sms-server/{id} | getSmsServer
[**updateSmsServer1**](SmsServerControllerV2Api.md#updateSmsServer1) | **PUT** /api/v2/notification/sms-server | updateSmsServer

<a name="activateSmsServerUsingPATCH2"></a>
# **activateSmsServerUsingPATCH2**
> activateSmsServerUsingPATCH2(id, acceptLanguage)

activateSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.activateSmsServerUsingPATCH2(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerV2Api#activateSmsServerUsingPATCH2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerV2Api#activateSmsServerUsingPATCH2")
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

<a name="createSmsServer1"></a>
# **createSmsServer1**
> SmsServerDto createSmsServer1(body, acceptLanguage)

create

don&#x27;t fill id, (for TWILIO add username and password)

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerV2Api()
val body : SmsServerDto =  // SmsServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SmsServerDto = apiInstance.createSmsServer1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerV2Api#createSmsServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerV2Api#createSmsServer1")
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

<a name="deleteSmsServer1"></a>
# **deleteSmsServer1**
> deleteSmsServer1(id, acceptLanguage)

deleteSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteSmsServer1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerV2Api#deleteSmsServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerV2Api#deleteSmsServer1")
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

<a name="getAllSmsServers1"></a>
# **getAllSmsServers1**
> Page_SmsServerDto_ getAllSmsServers1(pageNumber, pageSize, acceptLanguage, sort, sortKey)

getAllSmsServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerV2Api()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_SmsServerDto_ = apiInstance.getAllSmsServers1(pageNumber, pageSize, acceptLanguage, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerV2Api#getAllSmsServers1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerV2Api#getAllSmsServers1")
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

<a name="getSmsServer1"></a>
# **getSmsServer1**
> SmsServerDto getSmsServer1(id, acceptLanguage)

getSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SmsServerDto = apiInstance.getSmsServer1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerV2Api#getSmsServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerV2Api#getSmsServer1")
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

<a name="updateSmsServer1"></a>
# **updateSmsServer1**
> updateSmsServer1(body, acceptLanguage)

updateSmsServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SmsServerControllerV2Api()
val body : SmsServerDto =  // SmsServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateSmsServer1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SmsServerControllerV2Api#updateSmsServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsServerControllerV2Api#updateSmsServer1")
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

