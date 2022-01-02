# OldQueAnsControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQueAns1**](OldQueAnsControllerApi.md#createQueAns1) | **POST** /api/faq/queans/v1 | create
[**deleteQueAns**](OldQueAnsControllerApi.md#deleteQueAns) | **DELETE** /api/faq/queans/v1/{id} | deleteQueAns
[**getAllQueAns**](OldQueAnsControllerApi.md#getAllQueAns) | **GET** /api/faq/queans/v1 | getAllQueAns
[**getQueAns**](OldQueAnsControllerApi.md#getQueAns) | **GET** /api/faq/queans/v1/{id} | getQueAns
[**getQueAnsByCategoryId**](OldQueAnsControllerApi.md#getQueAnsByCategoryId) | **GET** /api/faq/queans/v1/category/{id} | getQueAnsByCategoryId
[**updateQueAns**](OldQueAnsControllerApi.md#updateQueAns) | **PUT** /api/faq/queans/v1/{id} | update

<a name="createQueAns1"></a>
# **createQueAns1**
> QueAnsDto createQueAns1(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsControllerApi()
val body : QueAnsDto =  // QueAnsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsDto = apiInstance.createQueAns1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsControllerApi#createQueAns1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsControllerApi#createQueAns1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueAnsDto**](QueAnsDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**QueAnsDto**](QueAnsDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteQueAns"></a>
# **deleteQueAns**
> deleteQueAns(id, acceptLanguage)

deleteQueAns

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteQueAns(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsControllerApi#deleteQueAns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsControllerApi#deleteQueAns")
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

<a name="getAllQueAns"></a>
# **getAllQueAns**
> Page_QueAnsDto_ getAllQueAns(acceptLanguage, category, pageNumber, pageSize, section, sort, sortKey, targetWord)

getAllQueAns

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val category : kotlin.String = category_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val section : kotlin.String = section_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val targetWord : kotlin.String = targetWord_example // kotlin.String | word search
try {
    val result : Page_QueAnsDto_ = apiInstance.getAllQueAns(acceptLanguage, category, pageNumber, pageSize, section, sort, sortKey, targetWord)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsControllerApi#getAllQueAns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsControllerApi#getAllQueAns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **category** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **section** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **targetWord** | **kotlin.String**| word search | [optional]

### Return type

[**Page_QueAnsDto_**](Page_QueAnsDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQueAns"></a>
# **getQueAns**
> QueAnsDto getQueAns(id, acceptLanguage)

getQueAns

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsDto = apiInstance.getQueAns(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsControllerApi#getQueAns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsControllerApi#getQueAns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**QueAnsDto**](QueAnsDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQueAnsByCategoryId"></a>
# **getQueAnsByCategoryId**
> Page_QueAnsDto_ getQueAnsByCategoryId(id, acceptLanguage, pageNumber, pageSize, sort, sortKey, targetWord)

getQueAnsByCategoryId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val targetWord : kotlin.String = targetWord_example // kotlin.String | word search
try {
    val result : Page_QueAnsDto_ = apiInstance.getQueAnsByCategoryId(id, acceptLanguage, pageNumber, pageSize, sort, sortKey, targetWord)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsControllerApi#getQueAnsByCategoryId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsControllerApi#getQueAnsByCategoryId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **targetWord** | **kotlin.String**| word search | [optional]

### Return type

[**Page_QueAnsDto_**](Page_QueAnsDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateQueAns"></a>
# **updateQueAns**
> updateQueAns(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : QueAnsDto =  // QueAnsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateQueAns(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsControllerApi#updateQueAns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsControllerApi#updateQueAns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**QueAnsDto**](QueAnsDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

