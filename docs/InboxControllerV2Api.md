# InboxControllerV2Api

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete5**](InboxControllerV2Api.md#delete5) | **DELETE** /api/v2/inbox/{id} | delete
[**get8**](InboxControllerV2Api.md#get8) | **GET** /api/v2/inbox/user/{id} | get
[**getAll1**](InboxControllerV2Api.md#getAll1) | **GET** /api/v2/inbox | getAll
[**getStatus1**](InboxControllerV2Api.md#getStatus1) | **GET** /api/v2/inbox/status | getStatus
[**getUserNotifications**](InboxControllerV2Api.md#getUserNotifications) | **GET** /api/v2/inbox/user | getUserNotifications
[**update3**](InboxControllerV2Api.md#update3) | **PUT** /api/v2/inbox/{id} | update

<a name="delete5"></a>
# **delete5**
> delete5(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InboxControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete5(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerV2Api#delete5")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerV2Api#delete5")
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

<a name="get8"></a>
# **get8**
> NotificationDto get8(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InboxControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : NotificationDto = apiInstance.get8(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerV2Api#get8")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerV2Api#get8")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**NotificationDto**](NotificationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll1"></a>
# **getAll1**
> Page_NotificationDto_ getAll1(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InboxControllerV2Api()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : Page_NotificationDto_ = apiInstance.getAll1(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerV2Api#getAll1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerV2Api#getAll1")
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

### Return type

[**Page_NotificationDto_**](Page_NotificationDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStatus1"></a>
# **getStatus1**
> InboxStatus getStatus1(acceptLanguage)

getStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InboxControllerV2Api()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : InboxStatus = apiInstance.getStatus1(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerV2Api#getStatus1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerV2Api#getStatus1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**InboxStatus**](InboxStatus.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserNotifications"></a>
# **getUserNotifications**
> Page_NotificationDto_ getUserNotifications(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getUserNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InboxControllerV2Api()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : Page_NotificationDto_ = apiInstance.getUserNotifications(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerV2Api#getUserNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerV2Api#getUserNotifications")
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

### Return type

[**Page_NotificationDto_**](Page_NotificationDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update3"></a>
# **update3**
> update3(id, acceptLanguage, message, title)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = InboxControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val message : kotlin.String = message_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
try {
    apiInstance.update3(id, acceptLanguage, message, title)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerV2Api#update3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerV2Api#update3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **message** | **kotlin.String**|  | [optional]
 **title** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

