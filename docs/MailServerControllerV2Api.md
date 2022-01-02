# MailServerControllerV2Api

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateMailServerUsingPATCH1**](MailServerControllerV2Api.md#activateMailServerUsingPATCH1) | **PATCH** /api/v2/notification/mail-server/{id} | activateMailServer
[**createMailServer**](MailServerControllerV2Api.md#createMailServer) | **POST** /api/v2/notification/mail-server | create
[**deleteMailServer**](MailServerControllerV2Api.md#deleteMailServer) | **DELETE** /api/v2/notification/mail-server/{id} | deleteMailServer
[**getAllMailServers**](MailServerControllerV2Api.md#getAllMailServers) | **GET** /api/v2/notification/mail-server | getAllMailServers
[**getMailServer**](MailServerControllerV2Api.md#getMailServer) | **GET** /api/v2/notification/mail-server/{id} | getMailServer
[**updateMailServer**](MailServerControllerV2Api.md#updateMailServer) | **PUT** /api/v2/notification/mail-server | updateMailServer

<a name="activateMailServerUsingPATCH1"></a>
# **activateMailServerUsingPATCH1**
> activateMailServerUsingPATCH1(id, acceptLanguage)

activateMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.activateMailServerUsingPATCH1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerV2Api#activateMailServerUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerV2Api#activateMailServerUsingPATCH1")
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

<a name="createMailServer"></a>
# **createMailServer**
> MailServerDto createMailServer(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerV2Api()
val body : MailServerDto =  // MailServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : MailServerDto = apiInstance.createMailServer(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerV2Api#createMailServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerV2Api#createMailServer")
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

<a name="deleteMailServer"></a>
# **deleteMailServer**
> deleteMailServer(id, acceptLanguage)

deleteMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteMailServer(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerV2Api#deleteMailServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerV2Api#deleteMailServer")
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

<a name="getAllMailServers"></a>
# **getAllMailServers**
> Page_MailServerDto_ getAllMailServers(pageNumber, pageSize, acceptLanguage, sort, sortKey)

getAllMailServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerV2Api()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_MailServerDto_ = apiInstance.getAllMailServers(pageNumber, pageSize, acceptLanguage, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerV2Api#getAllMailServers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerV2Api#getAllMailServers")
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

<a name="getMailServer"></a>
# **getMailServer**
> MailServerDto getMailServer(id, acceptLanguage)

getMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerV2Api()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : MailServerDto = apiInstance.getMailServer(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerV2Api#getMailServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerV2Api#getMailServer")
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

<a name="updateMailServer"></a>
# **updateMailServer**
> updateMailServer(body, acceptLanguage)

updateMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerV2Api()
val body : MailServerDto =  // MailServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateMailServer(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerV2Api#updateMailServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerV2Api#updateMailServer")
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

