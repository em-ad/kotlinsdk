# NotificationMailServerControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateMailServerUsingPATCH3**](NotificationMailServerControllerApi.md#activateMailServerUsingPATCH3) | **PATCH** /api/v1/notification/mail-server/{id} | activateMailServer
[**createMailServer2**](NotificationMailServerControllerApi.md#createMailServer2) | **POST** /api/v1/notification/mail-server | create
[**deleteMailServer2**](NotificationMailServerControllerApi.md#deleteMailServer2) | **DELETE** /api/v1/notification/mail-server/{id} | deleteMailServer
[**getAllMailServers2**](NotificationMailServerControllerApi.md#getAllMailServers2) | **GET** /api/v1/notification/mail-server | getAllMailServers
[**getMailServer2**](NotificationMailServerControllerApi.md#getMailServer2) | **GET** /api/v1/notification/mail-server/{id} | getMailServer
[**updateMailServer2**](NotificationMailServerControllerApi.md#updateMailServer2) | **PUT** /api/v1/notification/mail-server | updateMailServer

<a name="activateMailServerUsingPATCH3"></a>
# **activateMailServerUsingPATCH3**
> activateMailServerUsingPATCH3(id, acceptLanguage)

activateMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationMailServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.activateMailServerUsingPATCH3(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationMailServerControllerApi#activateMailServerUsingPATCH3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationMailServerControllerApi#activateMailServerUsingPATCH3")
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

<a name="createMailServer2"></a>
# **createMailServer2**
> MailServerDto createMailServer2(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationMailServerControllerApi()
val body : MailServerDto =  // MailServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : MailServerDto = apiInstance.createMailServer2(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationMailServerControllerApi#createMailServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationMailServerControllerApi#createMailServer2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailServerDto**](MailServerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**MailServerDto**](MailServerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteMailServer2"></a>
# **deleteMailServer2**
> deleteMailServer2(id, acceptLanguage)

deleteMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationMailServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteMailServer2(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationMailServerControllerApi#deleteMailServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationMailServerControllerApi#deleteMailServer2")
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

<a name="getAllMailServers2"></a>
# **getAllMailServers2**
> Page_MailServerDto_ getAllMailServers2(pageNumber, pageSize, acceptLanguage, sort, sortKey)

getAllMailServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationMailServerControllerApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_MailServerDto_ = apiInstance.getAllMailServers2(pageNumber, pageSize, acceptLanguage, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationMailServerControllerApi#getAllMailServers2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationMailServerControllerApi#getAllMailServers2")
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

[**Page_MailServerDto_**](Page_MailServerDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMailServer2"></a>
# **getMailServer2**
> MailServerDto getMailServer2(id, acceptLanguage)

getMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationMailServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : MailServerDto = apiInstance.getMailServer2(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationMailServerControllerApi#getMailServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationMailServerControllerApi#getMailServer2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**MailServerDto**](MailServerDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateMailServer2"></a>
# **updateMailServer2**
> updateMailServer2(body, acceptLanguage)

updateMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationMailServerControllerApi()
val body : MailServerDto =  // MailServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateMailServer2(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationMailServerControllerApi#updateMailServer2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationMailServerControllerApi#updateMailServer2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailServerDto**](MailServerDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

