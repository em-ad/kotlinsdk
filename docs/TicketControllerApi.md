# TicketControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeState1**](TicketControllerApi.md#changeState1) | **PUT** /api/v1/support/tickets/state/{id}/{stateEnum} | state
[**closeState**](TicketControllerApi.md#closeState) | **PUT** /api/v1/support/tickets/state/close/{id} | state
[**createTicket**](TicketControllerApi.md#createTicket) | **POST** /api/v1/support/tickets | create
[**deleteTicket**](TicketControllerApi.md#deleteTicket) | **DELETE** /api/v1/support/tickets/{id} | deleteTicket
[**getSubscriberTickets**](TicketControllerApi.md#getSubscriberTickets) | **GET** /api/v1/support/tickets/get-subscriber-tickets | getSubscriberTickets
[**getTicket**](TicketControllerApi.md#getTicket) | **GET** /api/v1/support/tickets/{id} | getTicket
[**getTicketList**](TicketControllerApi.md#getTicketList) | **GET** /api/v1/support/tickets | getTicketList
[**getTicketListForAdminPanel**](TicketControllerApi.md#getTicketListForAdminPanel) | **GET** /api/v1/support/tickets/admin/get | getTicketListForAdminPanel
[**getUserTickets**](TicketControllerApi.md#getUserTickets) | **GET** /api/v1/support/tickets/get-user-tickets | getUserTickets
[**updateTicket**](TicketControllerApi.md#updateTicket) | **PUT** /api/v1/support/tickets/{id} | update

<a name="changeState1"></a>
# **changeState1**
> changeState1(id, stateEnum, acceptLanguage)

state

change status

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val stateEnum : kotlin.String = stateEnum_example // kotlin.String | stateEnum
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.changeState1(id, stateEnum, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#changeState1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#changeState1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **stateEnum** | **kotlin.String**| stateEnum | [enum: CLOSED, OPENED, PROCESSING]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="closeState"></a>
# **closeState**
> closeState(id, acceptLanguage)

state

close status

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.closeState(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#closeState")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#closeState")
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

<a name="createTicket"></a>
# **createTicket**
> TicketDto createTicket(body, acceptLanguage)

create

 create ticket

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val body : TicketDto =  // TicketDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TicketDto = apiInstance.createTicket(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#createTicket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#createTicket")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TicketDto**](TicketDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TicketDto**](TicketDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTicket"></a>
# **deleteTicket**
> deleteTicket(id, acceptLanguage)

deleteTicket

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteTicket(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#deleteTicket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#deleteTicket")
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

<a name="getSubscriberTickets"></a>
# **getSubscriberTickets**
> Page_TicketDto_ getSubscriberTickets(acceptLanguage, categoryId, content, email, from, fromIso, fullSearch, keyword, mobile, pageNumber, pageSize, section, senderName, sort, sortKey, subject, ticketStateEnum, to, toIso)

getSubscriberTickets

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val content : kotlin.String = content_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val fromIso : kotlin.String = fromIso_example // kotlin.String | 
val fullSearch : kotlin.String = fullSearch_example // kotlin.String | another fields must be empty
val keyword : kotlin.String = keyword_example // kotlin.String | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val section : kotlin.String = section_example // kotlin.String | 
val senderName : kotlin.String = senderName_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val subject : kotlin.String = subject_example // kotlin.String | 
val ticketStateEnum : kotlin.String = ticketStateEnum_example // kotlin.String | 
val to : kotlin.Long = 789 // kotlin.Long | 
val toIso : kotlin.String = toIso_example // kotlin.String | 
try {
    val result : Page_TicketDto_ = apiInstance.getSubscriberTickets(acceptLanguage, categoryId, content, email, from, fromIso, fullSearch, keyword, mobile, pageNumber, pageSize, section, senderName, sort, sortKey, subject, ticketStateEnum, to, toIso)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#getSubscriberTickets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#getSubscriberTickets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **categoryId** | **kotlin.String**|  | [optional]
 **content** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **fromIso** | **kotlin.String**|  | [optional]
 **fullSearch** | **kotlin.String**| another fields must be empty | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **section** | **kotlin.String**|  | [optional]
 **senderName** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **subject** | **kotlin.String**|  | [optional]
 **ticketStateEnum** | **kotlin.String**|  | [optional] [enum: CLOSED, OPENED, PROCESSING]
 **to** | **kotlin.Long**|  | [optional]
 **toIso** | **kotlin.String**|  | [optional]

### Return type

[**Page_TicketDto_**](Page_TicketDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTicket"></a>
# **getTicket**
> TicketDto getTicket(id, acceptLanguage)

getTicket

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TicketDto = apiInstance.getTicket(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#getTicket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#getTicket")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TicketDto**](TicketDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTicketList"></a>
# **getTicketList**
> Page_TicketDto_ getTicketList(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getTicketList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_TicketDto_ = apiInstance.getTicketList(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#getTicketList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#getTicketList")
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

[**Page_TicketDto_**](Page_TicketDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTicketListForAdminPanel"></a>
# **getTicketListForAdminPanel**
> Page_AdminTicketDto_ getTicketListForAdminPanel(acceptLanguage, categoryId, content, email, from, fromIso, fullSearch, keyword, mobile, pageNumber, pageSize, section, senderName, sort, sortKey, subject, ticketStateEnum, to, toIso)

getTicketListForAdminPanel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val content : kotlin.String = content_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val fromIso : kotlin.String = fromIso_example // kotlin.String | 
val fullSearch : kotlin.String = fullSearch_example // kotlin.String | another fields must be empty
val keyword : kotlin.String = keyword_example // kotlin.String | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val section : kotlin.String = section_example // kotlin.String | 
val senderName : kotlin.String = senderName_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val subject : kotlin.String = subject_example // kotlin.String | 
val ticketStateEnum : kotlin.String = ticketStateEnum_example // kotlin.String | 
val to : kotlin.Long = 789 // kotlin.Long | 
val toIso : kotlin.String = toIso_example // kotlin.String | 
try {
    val result : Page_AdminTicketDto_ = apiInstance.getTicketListForAdminPanel(acceptLanguage, categoryId, content, email, from, fromIso, fullSearch, keyword, mobile, pageNumber, pageSize, section, senderName, sort, sortKey, subject, ticketStateEnum, to, toIso)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#getTicketListForAdminPanel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#getTicketListForAdminPanel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **categoryId** | **kotlin.String**|  | [optional]
 **content** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **fromIso** | **kotlin.String**|  | [optional]
 **fullSearch** | **kotlin.String**| another fields must be empty | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **section** | **kotlin.String**|  | [optional]
 **senderName** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **subject** | **kotlin.String**|  | [optional]
 **ticketStateEnum** | **kotlin.String**|  | [optional] [enum: CLOSED, OPENED, PROCESSING]
 **to** | **kotlin.Long**|  | [optional]
 **toIso** | **kotlin.String**|  | [optional]

### Return type

[**Page_AdminTicketDto_**](Page_AdminTicketDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserTickets"></a>
# **getUserTickets**
> Page_TicketDto_ getUserTickets(acceptLanguage, categoryId, content, email, from, fromIso, fullSearch, keyword, mobile, pageNumber, pageSize, section, senderName, sort, sortKey, subject, ticketStateEnum, to, toIso)

getUserTickets

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val content : kotlin.String = content_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val fromIso : kotlin.String = fromIso_example // kotlin.String | 
val fullSearch : kotlin.String = fullSearch_example // kotlin.String | another fields must be empty
val keyword : kotlin.String = keyword_example // kotlin.String | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val section : kotlin.String = section_example // kotlin.String | 
val senderName : kotlin.String = senderName_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val subject : kotlin.String = subject_example // kotlin.String | 
val ticketStateEnum : kotlin.String = ticketStateEnum_example // kotlin.String | 
val to : kotlin.Long = 789 // kotlin.Long | 
val toIso : kotlin.String = toIso_example // kotlin.String | 
try {
    val result : Page_TicketDto_ = apiInstance.getUserTickets(acceptLanguage, categoryId, content, email, from, fromIso, fullSearch, keyword, mobile, pageNumber, pageSize, section, senderName, sort, sortKey, subject, ticketStateEnum, to, toIso)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#getUserTickets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#getUserTickets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **categoryId** | **kotlin.String**|  | [optional]
 **content** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **fromIso** | **kotlin.String**|  | [optional]
 **fullSearch** | **kotlin.String**| another fields must be empty | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **section** | **kotlin.String**|  | [optional]
 **senderName** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **subject** | **kotlin.String**|  | [optional]
 **ticketStateEnum** | **kotlin.String**|  | [optional] [enum: CLOSED, OPENED, PROCESSING]
 **to** | **kotlin.Long**|  | [optional]
 **toIso** | **kotlin.String**|  | [optional]

### Return type

[**Page_TicketDto_**](Page_TicketDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateTicket"></a>
# **updateTicket**
> updateTicket(id, body, acceptLanguage)

update

 update Ticket

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : TicketDto =  // TicketDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateTicket(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling TicketControllerApi#updateTicket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketControllerApi#updateTicket")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**TicketDto**](TicketDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

