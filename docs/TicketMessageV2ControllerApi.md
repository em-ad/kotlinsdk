# TicketMessageV2ControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessage1**](TicketMessageV2ControllerApi.md#createMessage1) | **POST** /api/v2/support/messages/create/ | createMessage
[**createTicketMessage1**](TicketMessageV2ControllerApi.md#createTicketMessage1) | **POST** /api/v2/support/messages/{ticketId} | createTicketMessage
[**getTicketMessageListByTicketId1**](TicketMessageV2ControllerApi.md#getTicketMessageListByTicketId1) | **GET** /api/v2/support/messages/ticket/{ticketId} | getTicketMessageListByTicketId

<a name="createMessage1"></a>
# **createMessage1**
> TicketMessageDto createMessage1(body, acceptLanguage)

createMessage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageV2ControllerApi()
val body : TicketMessageInputDto =  // TicketMessageInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TicketMessageDto = apiInstance.createMessage1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageV2ControllerApi#createMessage1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageV2ControllerApi#createMessage1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TicketMessageInputDto**](TicketMessageInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TicketMessageDto**](TicketMessageDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createTicketMessage1"></a>
# **createTicketMessage1**
> TicketMessageDto createTicketMessage1(ticketId, acceptLanguage, content, file, clientMessageId)

createTicketMessage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageV2ControllerApi()
val ticketId : kotlin.String = ticketId_example // kotlin.String | ticketId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val content : kotlin.String = content_example // kotlin.String | content
val file : kotlin.String = file_example // kotlin.String | file
val clientMessageId : kotlin.String = clientMessageId_example // kotlin.String | clientMessageId
try {
    val result : TicketMessageDto = apiInstance.createTicketMessage1(ticketId, acceptLanguage, content, file, clientMessageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageV2ControllerApi#createTicketMessage1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageV2ControllerApi#createTicketMessage1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | **kotlin.String**| ticketId |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **content** | **kotlin.String**| content | [optional]
 **file** | **kotlin.String**| file | [optional]
 **clientMessageId** | **kotlin.String**| clientMessageId | [optional]

### Return type

[**TicketMessageDto**](TicketMessageDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTicketMessageListByTicketId1"></a>
# **getTicketMessageListByTicketId1**
> Page_TicketMessageDto_ getTicketMessageListByTicketId1(ticketId, acceptLanguage, pageNumber, pageSize, sort, sortKey)

getTicketMessageListByTicketId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketMessageV2ControllerApi()
val ticketId : kotlin.String = ticketId_example // kotlin.String | ticketId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_TicketMessageDto_ = apiInstance.getTicketMessageListByTicketId1(ticketId, acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketMessageV2ControllerApi#getTicketMessageListByTicketId1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketMessageV2ControllerApi#getTicketMessageListByTicketId1")
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

