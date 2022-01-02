# MailServerControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateMailServerUsingPATCH2**](MailServerControllerApi.md#activateMailServerUsingPATCH2) | **PATCH** /api/v1/mgs/mail-server/{id} | activateMailServer
[**createMailServer1**](MailServerControllerApi.md#createMailServer1) | **POST** /api/v1/mgs/mail-server | create
[**deleteMailServer1**](MailServerControllerApi.md#deleteMailServer1) | **DELETE** /api/v1/mgs/mail-server/{id} | deleteMailServer
[**getAllMailServers1**](MailServerControllerApi.md#getAllMailServers1) | **GET** /api/v1/mgs/mail-server | getAllMailServers
[**getMailServer1**](MailServerControllerApi.md#getMailServer1) | **GET** /api/v1/mgs/mail-server/{id} | getMailServer
[**updateMailServer1**](MailServerControllerApi.md#updateMailServer1) | **PUT** /api/v1/mgs/mail-server | updateMailServer

<a name="activateMailServerUsingPATCH2"></a>
# **activateMailServerUsingPATCH2**
> activateMailServerUsingPATCH2(id, acceptLanguage)

activateMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.activateMailServerUsingPATCH2(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#activateMailServerUsingPATCH2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#activateMailServerUsingPATCH2")
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

<a name="createMailServer1"></a>
# **createMailServer1**
> MailServerDto createMailServer1(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerApi()
val body : MailServerDto =  // MailServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : MailServerDto = apiInstance.createMailServer1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#createMailServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#createMailServer1")
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

<a name="deleteMailServer1"></a>
# **deleteMailServer1**
> deleteMailServer1(id, acceptLanguage)

deleteMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteMailServer1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#deleteMailServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#deleteMailServer1")
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

<a name="getAllMailServers1"></a>
# **getAllMailServers1**
> Page_MailServerDto_ getAllMailServers1(pageNumber, pageSize, acceptLanguage, sort, sortKey)

getAllMailServers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_MailServerDto_ = apiInstance.getAllMailServers1(pageNumber, pageSize, acceptLanguage, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#getAllMailServers1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#getAllMailServers1")
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

<a name="getMailServer1"></a>
# **getMailServer1**
> MailServerDto getMailServer1(id, acceptLanguage)

getMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : MailServerDto = apiInstance.getMailServer1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#getMailServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#getMailServer1")
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

<a name="updateMailServer1"></a>
# **updateMailServer1**
> updateMailServer1(body, acceptLanguage)

updateMailServer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MailServerControllerApi()
val body : MailServerDto =  // MailServerDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateMailServer1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#updateMailServer1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#updateMailServer1")
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

