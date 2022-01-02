# SessionApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelClientUsingPATCH1**](SessionApi.md#cancelClientUsingPATCH1) | **PATCH** /api/v1/datyar/sessions/cancel/{session-id} | cancelClient
[**cancelLawyerUsingPATCH1**](SessionApi.md#cancelLawyerUsingPATCH1) | **PATCH** /api/v1/datyar/sessions/cancel | cancelLawyer
[**createMessage**](SessionApi.md#createMessage) | **POST** /api/v1/datyar/sessions/create-message | createMessage
[**createSession**](SessionApi.md#createSession) | **POST** /api/v1/datyar/sessions | createSession
[**deleteMessage**](SessionApi.md#deleteMessage) | **DELETE** /api/v1/datyar/sessions/delete-message/{session-Id}/{message-Id} | deleteMessage
[**endSessionUsingPATCH1**](SessionApi.md#endSessionUsingPATCH1) | **PATCH** /api/v1/datyar/sessions/end-session/{session-id} | endSession
[**getAllLawyerOrders**](SessionApi.md#getAllLawyerOrders) | **GET** /api/v1/datyar/sessions/getAllLawyerOrders | getAllLawyerOrders
[**getAllOrders**](SessionApi.md#getAllOrders) | **GET** /api/v1/datyar/sessions/getAllOrders | getAllOrders
[**getAllUserOrders**](SessionApi.md#getAllUserOrders) | **GET** /api/v1/datyar/sessions/getAllUserOrders | getAllUserOrders
[**getCalender**](SessionApi.md#getCalender) | **GET** /api/v1/datyar/sessions/getCalender/{lawyer-Id} | getCalender
[**getLawyerOrganizationalCalendar**](SessionApi.md#getLawyerOrganizationalCalendar) | **GET** /api/v1/datyar/sessions/get-lawyer-organizational-calendar | getLawyerOrganizationalCalendar
[**getOutputDto**](SessionApi.md#getOutputDto) | **GET** /api/v1/datyar/sessions/{session-id} | getOutputDto
[**getUrgentRequests**](SessionApi.md#getUrgentRequests) | **GET** /api/v1/datyar/sessions/get-urgent-requests | getUrgentRequests
[**requestCancelUsingPATCH1**](SessionApi.md#requestCancelUsingPATCH1) | **PATCH** /api/v1/datyar/sessions/request-cancel | requestCancel
[**requestExtendUsingPATCH1**](SessionApi.md#requestExtendUsingPATCH1) | **PATCH** /api/v1/datyar/sessions/request-extend | requestExtend
[**sendMessage**](SessionApi.md#sendMessage) | **POST** /api/v1/datyar/sessions/send-message/{session-id} | sendMessage
[**setSessionStartTimeUsingPATCH1**](SessionApi.md#setSessionStartTimeUsingPATCH1) | **PATCH** /api/v1/datyar/sessions/set-start-time | setSessionStartTime

<a name="cancelClientUsingPATCH1"></a>
# **cancelClientUsingPATCH1**
> cancelClientUsingPATCH1(sessionId, acceptLanguage)

cancelClient

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | session-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.cancelClientUsingPATCH1(sessionId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#cancelClientUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#cancelClientUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| session-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelLawyerUsingPATCH1"></a>
# **cancelLawyerUsingPATCH1**
> Session cancelLawyerUsingPATCH1(body, acceptLanguage)

cancelLawyer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val body : LawyerCancellationsDto =  // LawyerCancellationsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : Session = apiInstance.cancelLawyerUsingPATCH1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#cancelLawyerUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#cancelLawyerUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LawyerCancellationsDto**](LawyerCancellationsDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**Session**](Session.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createMessage"></a>
# **createMessage**
> OutputSessionDTO createMessage(body, acceptLanguage)

createMessage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val body : CreateMessageDto =  // CreateMessageDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : OutputSessionDTO = apiInstance.createMessage(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#createMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#createMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMessageDto**](CreateMessageDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**OutputSessionDTO**](OutputSessionDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSession"></a>
# **createSession**
> Session createSession(body, acceptLanguage)

createSession

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val body : CreateSessionDto =  // CreateSessionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : Session = apiInstance.createSession(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#createSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#createSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateSessionDto**](CreateSessionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**Session**](Session.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteMessage"></a>
# **deleteMessage**
> deleteMessage(sessionId, messageId, acceptLanguage)

deleteMessage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | session-Id
val messageId : kotlin.String = messageId_example // kotlin.String | message-Id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteMessage(sessionId, messageId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#deleteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#deleteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| session-Id |
 **messageId** | **kotlin.String**| message-Id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="endSessionUsingPATCH1"></a>
# **endSessionUsingPATCH1**
> endSessionUsingPATCH1(sessionId, acceptLanguage)

endSession

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | session-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.endSessionUsingPATCH1(sessionId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#endSessionUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#endSessionUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| session-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllLawyerOrders"></a>
# **getAllLawyerOrders**
> Page_ListSessionDto_ getAllLawyerOrders(acceptLanguage, pageNumber, pageSize, sort, sortKey, state)

getAllLawyerOrders

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val state : kotlin.String = state_example // kotlin.String | 
try {
    val result : Page_ListSessionDto_ = apiInstance.getAllLawyerOrders(acceptLanguage, pageNumber, pageSize, sort, sortKey, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getAllLawyerOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getAllLawyerOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **state** | **kotlin.String**|  | [optional] [enum: CANCELED, CREATED, DONE, FINISHED_CREATED, FINISHED_RESERVED, PENDING, RESERVED, RESERVED_START_TIME_SET]

### Return type

[**Page_ListSessionDto_**](Page_ListSessionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllOrders"></a>
# **getAllOrders**
> Page_AdminSessionModel_ getAllOrders(acceptLanguage, cancellationOwner, clientFirstName, clientLastName, clientMobile, consultingType, from, isCancelRequested, isExtendRequested, lawyerFirstName, lawyerLastName, lawyerMobile, orderNumber, pageNumber, pageSize, sort, sortKey, state, to, userId, userType)

getAllOrders

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val cancellationOwner : kotlin.String = cancellationOwner_example // kotlin.String | 
val clientFirstName : kotlin.String = clientFirstName_example // kotlin.String | 
val clientLastName : kotlin.String = clientLastName_example // kotlin.String | 
val clientMobile : kotlin.String = clientMobile_example // kotlin.String | 
val consultingType : kotlin.String = consultingType_example // kotlin.String | 
val from : kotlin.String = from_example // kotlin.String | 
val isCancelRequested : kotlin.Boolean = true // kotlin.Boolean | 
val isExtendRequested : kotlin.Boolean = true // kotlin.Boolean | 
val lawyerFirstName : kotlin.String = lawyerFirstName_example // kotlin.String | 
val lawyerLastName : kotlin.String = lawyerLastName_example // kotlin.String | 
val lawyerMobile : kotlin.String = lawyerMobile_example // kotlin.String | 
val orderNumber : kotlin.String = orderNumber_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val state : kotlin.String = state_example // kotlin.String | 
val to : kotlin.String = to_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
val userType : kotlin.String = userType_example // kotlin.String | 
try {
    val result : Page_AdminSessionModel_ = apiInstance.getAllOrders(acceptLanguage, cancellationOwner, clientFirstName, clientLastName, clientMobile, consultingType, from, isCancelRequested, isExtendRequested, lawyerFirstName, lawyerLastName, lawyerMobile, orderNumber, pageNumber, pageSize, sort, sortKey, state, to, userId, userType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getAllOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getAllOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **cancellationOwner** | **kotlin.String**|  | [optional] [enum: ALL, CLIENT, LAWYER, LIST]
 **clientFirstName** | **kotlin.String**|  | [optional]
 **clientLastName** | **kotlin.String**|  | [optional]
 **clientMobile** | **kotlin.String**|  | [optional]
 **consultingType** | **kotlin.String**|  | [optional] [enum: OFFLINE, ONLINE, URGENT]
 **from** | **kotlin.String**|  | [optional]
 **isCancelRequested** | **kotlin.Boolean**|  | [optional]
 **isExtendRequested** | **kotlin.Boolean**|  | [optional]
 **lawyerFirstName** | **kotlin.String**|  | [optional]
 **lawyerLastName** | **kotlin.String**|  | [optional]
 **lawyerMobile** | **kotlin.String**|  | [optional]
 **orderNumber** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **state** | **kotlin.String**|  | [optional] [enum: CANCELED, CREATED, DONE, FINISHED_CREATED, FINISHED_RESERVED, PENDING, RESERVED, RESERVED_START_TIME_SET]
 **to** | **kotlin.String**|  | [optional]
 **userId** | **kotlin.String**|  | [optional]
 **userType** | **kotlin.String**|  | [optional] [enum: ALL, CLIENT, LAWYER, LIST]

### Return type

[**Page_AdminSessionModel_**](Page_AdminSessionModel_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUserOrders"></a>
# **getAllUserOrders**
> Page_ListSessionDto_ getAllUserOrders(acceptLanguage, pageNumber, pageSize, sort, sortKey, state)

getAllUserOrders

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val state : kotlin.String = state_example // kotlin.String | 
try {
    val result : Page_ListSessionDto_ = apiInstance.getAllUserOrders(acceptLanguage, pageNumber, pageSize, sort, sortKey, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getAllUserOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getAllUserOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **state** | **kotlin.String**|  | [optional] [enum: CANCELED, CREATED, DONE, FINISHED_CREATED, FINISHED_RESERVED, PENDING, RESERVED, RESERVED_START_TIME_SET]

### Return type

[**Page_ListSessionDto_**](Page_ListSessionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCalender"></a>
# **getCalender**
> kotlin.collections.Map&lt;kotlin.String, FinalFromToTimeModel&gt; getCalender(lawyerId, acceptLanguage)

getCalender

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val lawyerId : kotlin.String = lawyerId_example // kotlin.String | lawyer-Id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.collections.Map<kotlin.String, FinalFromToTimeModel> = apiInstance.getCalender(lawyerId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getCalender")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getCalender")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lawyerId** | **kotlin.String**| lawyer-Id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.collections.Map&lt;kotlin.String, FinalFromToTimeModel&gt;**](FinalFromToTimeModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLawyerOrganizationalCalendar"></a>
# **getLawyerOrganizationalCalendar**
> Page_OrganizationalCalendarDto_ getLawyerOrganizationalCalendar(acceptLanguage, from, pageNumber, pageSize, sort, sortKey, to)

getLawyerOrganizationalCalendar

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val from : kotlin.String = from_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val to : kotlin.String = to_example // kotlin.String | 
try {
    val result : Page_OrganizationalCalendarDto_ = apiInstance.getLawyerOrganizationalCalendar(acceptLanguage, from, pageNumber, pageSize, sort, sortKey, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getLawyerOrganizationalCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getLawyerOrganizationalCalendar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **from** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **to** | **kotlin.String**|  | [optional]

### Return type

[**Page_OrganizationalCalendarDto_**](Page_OrganizationalCalendarDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOutputDto"></a>
# **getOutputDto**
> OutputSessionDTO getOutputDto(sessionId, acceptLanguage)

getOutputDto

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | session-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : OutputSessionDTO = apiInstance.getOutputDto(sessionId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getOutputDto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getOutputDto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| session-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**OutputSessionDTO**](OutputSessionDTO.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUrgentRequests"></a>
# **getUrgentRequests**
> ListSessionDto getUrgentRequests(acceptLanguage)

getUrgentRequests

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ListSessionDto = apiInstance.getUrgentRequests(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#getUrgentRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#getUrgentRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ListSessionDto**](ListSessionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="requestCancelUsingPATCH1"></a>
# **requestCancelUsingPATCH1**
> requestCancelUsingPATCH1(body, acceptLanguage)

requestCancel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val body : CancelSessionDto =  // CancelSessionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.requestCancelUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#requestCancelUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#requestCancelUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CancelSessionDto**](CancelSessionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="requestExtendUsingPATCH1"></a>
# **requestExtendUsingPATCH1**
> requestExtendUsingPATCH1(body, acceptLanguage)

requestExtend

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val body : ExtendConsultationDto =  // ExtendConsultationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.requestExtendUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#requestExtendUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#requestExtendUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExtendConsultationDto**](ExtendConsultationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendMessage"></a>
# **sendMessage**
> sendMessage(sessionId, acceptLanguage)

sendMessage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | session-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendMessage(sessionId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#sendMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#sendMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| session-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setSessionStartTimeUsingPATCH1"></a>
# **setSessionStartTimeUsingPATCH1**
> Session setSessionStartTimeUsingPATCH1(body, acceptLanguage)

setSessionStartTime

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SessionApi()
val body : SetSessionStartTimeDto =  // SetSessionStartTimeDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : Session = apiInstance.setSessionStartTimeUsingPATCH1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#setSessionStartTimeUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#setSessionStartTimeUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetSessionStartTimeDto**](SetSessionStartTimeDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**Session**](Session.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

