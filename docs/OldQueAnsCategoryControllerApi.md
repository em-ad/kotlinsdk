# OldQueAnsCategoryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQueAns**](OldQueAnsCategoryControllerApi.md#createQueAns) | **POST** /api/faq/category/v1 | create
[**delete9**](OldQueAnsCategoryControllerApi.md#delete9) | **DELETE** /api/faq/category/v1/{id} | delete
[**get10**](OldQueAnsCategoryControllerApi.md#get10) | **GET** /api/faq/category/v1/{id} | get
[**getAll4**](OldQueAnsCategoryControllerApi.md#getAll4) | **GET** /api/faq/category/v1 | getAll
[**getChildCategory**](OldQueAnsCategoryControllerApi.md#getChildCategory) | **GET** /api/faq/category/v1/nodes | getChildCategory
[**update7**](OldQueAnsCategoryControllerApi.md#update7) | **PUT** /api/faq/category/v1/{id} | update

<a name="createQueAns"></a>
# **createQueAns**
> QueAnsCategoryDto createQueAns(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsCategoryControllerApi()
val body : QueAnsCategoryDto =  // QueAnsCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsCategoryDto = apiInstance.createQueAns(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsCategoryControllerApi#createQueAns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsCategoryControllerApi#createQueAns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueAnsCategoryDto**](QueAnsCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**QueAnsCategoryDto**](QueAnsCategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete9"></a>
# **delete9**
> delete9(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete9(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsCategoryControllerApi#delete9")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsCategoryControllerApi#delete9")
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

<a name="get10"></a>
# **get10**
> QueAnsCategoryDto get10(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsCategoryDto = apiInstance.get10(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsCategoryControllerApi#get10")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsCategoryControllerApi#get10")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**QueAnsCategoryDto**](QueAnsCategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll4"></a>
# **getAll4**
> Page_QueAnsCategoryDto_ getAll4(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_QueAnsCategoryDto_ = apiInstance.getAll4(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsCategoryControllerApi#getAll4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsCategoryControllerApi#getAll4")
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

[**Page_QueAnsCategoryDto_**](Page_QueAnsCategoryDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChildCategory"></a>
# **getChildCategory**
> Page_QueAnsCategoryDto_ getChildCategory(acceptLanguage, id, pageNumber, pageSize, sort, sortKey)

getChildCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val id : kotlin.String = id_example // kotlin.String | id
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_QueAnsCategoryDto_ = apiInstance.getChildCategory(acceptLanguage, id, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsCategoryControllerApi#getChildCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsCategoryControllerApi#getChildCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **id** | **kotlin.String**| id | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_QueAnsCategoryDto_**](Page_QueAnsCategoryDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update7"></a>
# **update7**
> update7(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OldQueAnsCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : QueAnsCategoryDto =  // QueAnsCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update7(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling OldQueAnsCategoryControllerApi#update7")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OldQueAnsCategoryControllerApi#update7")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**QueAnsCategoryDto**](QueAnsCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

