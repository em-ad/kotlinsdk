# OldNotificationControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNotification**](OldNotificationControllerApi.md#createNotification) | **POST** /api/v1/notifications/inbox | createNotification
[**delete8**](OldNotificationControllerApi.md#delete8) | **DELETE** /api/v1/notifications/inbox/admin/delete/{id} | delete
[**deleteAll**](OldNotificationControllerApi.md#deleteAll) | **DELETE** /api/v1/notifications/inbox/admin/delete/all | deleteAll
[**deleteUserNotification1**](OldNotificationControllerApi.md#deleteUserNotification1) | **DELETE** /api/v1/notifications/inbox/{id} | deleteUserNotification
[**deleteUserNotifications1**](OldNotificationControllerApi.md#deleteUserNotifications1) | **DELETE** /api/v1/notifications/inbox | deleteUserNotifications
[**getAll3**](OldNotificationControllerApi.md#getAll3) | **GET** /api/v1/notifications/inbox/admin/all | getAll
[**getAllUserNotifications**](OldNotificationControllerApi.md#getAllUserNotifications) | **GET** /api/v1/notifications/inbox | getAllUserNotifications
[**getStatus3**](OldNotificationControllerApi.md#getStatus3) | **GET** /api/v1/notifications/inbox/status | getStatus
[**getUserNotification1**](OldNotificationControllerApi.md#getUserNotification1) | **GET** /api/v1/notifications/inbox/{id} | getUserNotification
[**update6**](OldNotificationControllerApi.md#update6) | **PUT** /api/v1/notifications/inbox/admin/update/{notification-id} | update

<a name="createNotification"></a>
# **createNotification**
> createNotification(body, acceptLanguage)

createNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val body : CreateNotificationDto =  // CreateNotificationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.createNotification(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#createNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#createNotification")
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

<a name="delete8"></a>
# **delete8**
> delete8(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete8(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#delete8")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#delete8")
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

<a name="deleteAll"></a>
# **deleteAll**
> deleteAll(acceptLanguage)

deleteAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteAll(acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#deleteAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#deleteAll")
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

<a name="deleteUserNotification1"></a>
# **deleteUserNotification1**
> deleteUserNotification1(id, acceptLanguage)

deleteUserNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteUserNotification1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#deleteUserNotification1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#deleteUserNotification1")
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

<a name="deleteUserNotifications1"></a>
# **deleteUserNotifications1**
> deleteUserNotifications1(acceptLanguage)

deleteUserNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteUserNotifications1(acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#deleteUserNotifications1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#deleteUserNotifications1")
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

<a name="getAll3"></a>
# **getAll3**
> Page_GetNotificationDto_ getAll3(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetNotificationDto_ = apiInstance.getAll3(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#getAll3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#getAll3")
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

<a name="getAllUserNotifications"></a>
# **getAllUserNotifications**
> Page_GetNotificationDto_ getAllUserNotifications(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllUserNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetNotificationDto_ = apiInstance.getAllUserNotifications(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#getAllUserNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#getAllUserNotifications")
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

<a name="getStatus3"></a>
# **getStatus3**
> NotificationStatus getStatus3(acceptLanguage)

getStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : NotificationStatus = apiInstance.getStatus3(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#getStatus3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#getStatus3")
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

<a name="getUserNotification1"></a>
# **getUserNotification1**
> GetNotificationDto getUserNotification1(id, acceptLanguage)

getUserNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetNotificationDto = apiInstance.getUserNotification1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#getUserNotification1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#getUserNotification1")
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

<a name="update6"></a>
# **update6**
> update6(notificationId, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldNotificationControllerApi()
val notificationId : kotlin.String = notificationId_example // kotlin.String | notification-id
val body : UpdateNotificationDto =  // UpdateNotificationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update6(notificationId, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldNotificationControllerApi#update6")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldNotificationControllerApi#update6")
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

