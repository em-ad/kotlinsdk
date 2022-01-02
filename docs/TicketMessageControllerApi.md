# TicketMessageControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTicketMessage**](TicketMessageControllerApi.md#createTicketMessage) | **POST** /api/v1/support/ticket-messages | create
[**deleteTicketMessage**](TicketMessageControllerApi.md#deleteTicketMessage) | **DELETE** /api/v1/support/ticket-messages/{id} | deleteTicketMessage
[**getTicketMessage**](TicketMessageControllerApi.md#getTicketMessage) | **GET** /api/v1/support/ticket-messages/{id} | getTicketMessage
[**getTicketMessageListByTicketId**](TicketMessageControllerApi.md#getTicketMessageListByTicketId) | **GET** /api/v1/support/ticket-messages/ticket/{ticketId} | getTicketMessageListByTicketId
[**updateTicketMessage**](TicketMessageControllerApi.md#updateTicketMessage) | **PUT** /api/v1/support/ticket-messages/{id} | Update

<a name="createTicketMessage"></a>
# **createTicketMessage**
> TicketMessageDto createTicketMessage(body, acceptLanguage)

create

 create messageTicket

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageControllerApi()
val body : TicketMessageDto =  // TicketMessageDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TicketMessageDto = apiInstance.createTicketMessage(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageControllerApi#createTicketMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageControllerApi#createTicketMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TicketMessageDto**](TicketMessageDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TicketMessageDto**](TicketMessageDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTicketMessage"></a>
# **deleteTicketMessage**
> deleteTicketMessage(id, acceptLanguage)

deleteTicketMessage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteTicketMessage(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageControllerApi#deleteTicketMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageControllerApi#deleteTicketMessage")
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

<a name="getTicketMessage"></a>
# **getTicketMessage**
> TicketMessageDto getTicketMessage(id, acceptLanguage)

getTicketMessage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TicketMessageDto = apiInstance.getTicketMessage(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageControllerApi#getTicketMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageControllerApi#getTicketMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TicketMessageDto**](TicketMessageDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTicketMessageListByTicketId"></a>
# **getTicketMessageListByTicketId**
> Page_TicketMessageDto_ getTicketMessageListByTicketId(ticketId, acceptLanguage, pageNumber, pageSize, sort, sortKey)

getTicketMessageListByTicketId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageControllerApi()
val ticketId : kotlin.String = ticketId_example // kotlin.String | ticketId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_TicketMessageDto_ = apiInstance.getTicketMessageListByTicketId(ticketId, acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageControllerApi#getTicketMessageListByTicketId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageControllerApi#getTicketMessageListByTicketId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | **kotlin.String**| ticketId |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_TicketMessageDto_**](Page_TicketMessageDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateTicketMessage"></a>
# **updateTicketMessage**
> updateTicketMessage(id, body, acceptLanguage)

Update

 update messageTicket

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : TicketMessageDto =  // TicketMessageDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateTicketMessage(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageControllerApi#updateTicketMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageControllerApi#updateTicketMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**TicketMessageDto**](TicketMessageDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

