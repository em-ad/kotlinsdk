# NotificationControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create5**](NotificationControllerApi.md#create5) | **POST** /api/v1/notifications | create
[**delete7**](NotificationControllerApi.md#delete7) | **DELETE** /api/v1/notifications/{id} | delete
[**deleteAllNotifications**](NotificationControllerApi.md#deleteAllNotifications) | **DELETE** /api/v1/notifications/all | deleteAllNotifications
[**deleteSubscriberNotification**](NotificationControllerApi.md#deleteSubscriberNotification) | **DELETE** /api/v1/notifications/subscriber/{id} | deleteSubscriberNotification
[**deleteSubscriberNotifications**](NotificationControllerApi.md#deleteSubscriberNotifications) | **DELETE** /api/v1/notifications/subscriber | deleteSubscriberNotifications
[**deleteUserNotification**](NotificationControllerApi.md#deleteUserNotification) | **DELETE** /api/v1/notifications/user/{id} | deleteUserNotification
[**deleteUserNotifications**](NotificationControllerApi.md#deleteUserNotifications) | **DELETE** /api/v1/notifications/user | deleteUserNotifications
[**getAll2**](NotificationControllerApi.md#getAll2) | **GET** /api/v1/notifications | getAll
[**getAllSubscriberNotifications**](NotificationControllerApi.md#getAllSubscriberNotifications) | **GET** /api/v1/notifications/subscriber | getAllSubscriberNotifications
[**getStatus2**](NotificationControllerApi.md#getStatus2) | **GET** /api/v1/notifications/status | getStatus
[**getUserNotification**](NotificationControllerApi.md#getUserNotification) | **GET** /api/v1/notifications/{id} | getUserNotification
[**getUserNotifications1**](NotificationControllerApi.md#getUserNotifications1) | **GET** /api/v1/notifications/user | getUserNotifications
[**update5**](NotificationControllerApi.md#update5) | **PUT** /api/v1/notifications/{notification-id} | update

<a name="create5"></a>
# **create5**
> create5(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val body : CreateNotificationDto =  // CreateNotificationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.create5(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#create5")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#create5")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateNotificationDto**](CreateNotificationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="delete7"></a>
# **delete7**
> delete7(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete7(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#delete7")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#delete7")
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

<a name="deleteAllNotifications"></a>
# **deleteAllNotifications**
> deleteAllNotifications(acceptLanguage)

deleteAllNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteAllNotifications(acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#deleteAllNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#deleteAllNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSubscriberNotification"></a>
# **deleteSubscriberNotification**
> deleteSubscriberNotification(id, acceptLanguage)

deleteSubscriberNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteSubscriberNotification(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#deleteSubscriberNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#deleteSubscriberNotification")
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

<a name="deleteSubscriberNotifications"></a>
# **deleteSubscriberNotifications**
> deleteSubscriberNotifications(acceptLanguage)

deleteSubscriberNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteSubscriberNotifications(acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#deleteSubscriberNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#deleteSubscriberNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserNotification"></a>
# **deleteUserNotification**
> deleteUserNotification(id, acceptLanguage)

deleteUserNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteUserNotification(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#deleteUserNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#deleteUserNotification")
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

<a name="deleteUserNotifications"></a>
# **deleteUserNotifications**
> deleteUserNotifications(acceptLanguage)

deleteUserNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteUserNotifications(acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#deleteUserNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#deleteUserNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll2"></a>
# **getAll2**
> Page_GetNotificationDto_ getAll2(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetNotificationDto_ = apiInstance.getAll2(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#getAll2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#getAll2")
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

[**Page_GetNotificationDto_**](Page_GetNotificationDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllSubscriberNotifications"></a>
# **getAllSubscriberNotifications**
> Page_GetNotificationDto_ getAllSubscriberNotifications(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllSubscriberNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetNotificationDto_ = apiInstance.getAllSubscriberNotifications(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#getAllSubscriberNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#getAllSubscriberNotifications")
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

[**Page_GetNotificationDto_**](Page_GetNotificationDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStatus2"></a>
# **getStatus2**
> NotificationStatus getStatus2(acceptLanguage)

getStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : NotificationStatus = apiInstance.getStatus2(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#getStatus2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#getStatus2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**NotificationStatus**](NotificationStatus.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserNotification"></a>
# **getUserNotification**
> GetNotificationDto getUserNotification(id, acceptLanguage)

getUserNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetNotificationDto = apiInstance.getUserNotification(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#getUserNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#getUserNotification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetNotificationDto**](GetNotificationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserNotifications1"></a>
# **getUserNotifications1**
> Page_GetNotificationDto_ getUserNotifications1(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getUserNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetNotificationDto_ = apiInstance.getUserNotifications1(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#getUserNotifications1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#getUserNotifications1")
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

[**Page_GetNotificationDto_**](Page_GetNotificationDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update5"></a>
# **update5**
> update5(notificationId, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerApi()
val notificationId : kotlin.String = notificationId_example // kotlin.String | notification-id
val body : UpdateNotificationDto =  // UpdateNotificationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update5(notificationId, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerApi#update5")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerApi#update5")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.String**| notification-id |
 **body** | [**UpdateNotificationDto**](UpdateNotificationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

