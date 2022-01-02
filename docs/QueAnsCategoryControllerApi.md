# QueAnsCategoryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQueAns2**](QueAnsCategoryControllerApi.md#createQueAns2) | **POST** /api/v1/faq/category | create
[**delete11**](QueAnsCategoryControllerApi.md#delete11) | **DELETE** /api/v1/faq/category/{id} | delete
[**get14**](QueAnsCategoryControllerApi.md#get14) | **GET** /public/v1/faq/category/{id} | get
[**getAll6**](QueAnsCategoryControllerApi.md#getAll6) | **GET** /public/v1/faq/category | getAll
[**getChildCategory1**](QueAnsCategoryControllerApi.md#getChildCategory1) | **GET** /public/v1/faq/category/nodes | getChildCategory
[**update8**](QueAnsCategoryControllerApi.md#update8) | **PUT** /api/v1/faq/category/{id} | update

<a name="createQueAns2"></a>
# **createQueAns2**
> QueAnsCategoryDto createQueAns2(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsCategoryControllerApi()
val body : QueAnsCategoryDto =  // QueAnsCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsCategoryDto = apiInstance.createQueAns2(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsCategoryControllerApi#createQueAns2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsCategoryControllerApi#createQueAns2")
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

<a name="delete11"></a>
# **delete11**
> delete11(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete11(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling QueAnsCategoryControllerApi#delete11")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsCategoryControllerApi#delete11")
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

<a name="get14"></a>
# **get14**
> QueAnsCategoryDto get14(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsCategoryDto = apiInstance.get14(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsCategoryControllerApi#get14")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsCategoryControllerApi#get14")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll6"></a>
# **getAll6**
> Page_QueAnsCategoryDto_ getAll6(acceptLanguage, description, pageNumber, pageSize, section, sort, sortKey, title)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val description : kotlin.String = description_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val section : kotlin.String = section_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val title : kotlin.String = title_example // kotlin.String | 
try {
    val result : Page_QueAnsCategoryDto_ = apiInstance.getAll6(acceptLanguage, description, pageNumber, pageSize, section, sort, sortKey, title)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsCategoryControllerApi#getAll6")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsCategoryControllerApi#getAll6")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **description** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **section** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **title** | **kotlin.String**|  | [optional]

### Return type

[**Page_QueAnsCategoryDto_**](Page_QueAnsCategoryDto_.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChildCategory1"></a>
# **getChildCategory1**
> Page_QueAnsCategoryDto_ getChildCategory1(acceptLanguage, id, pageNumber, pageSize, sort, sortKey)

getChildCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val id : kotlin.String = id_example // kotlin.String | id
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_QueAnsCategoryDto_ = apiInstance.getChildCategory1(acceptLanguage, id, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsCategoryControllerApi#getChildCategory1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsCategoryControllerApi#getChildCategory1")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update8"></a>
# **update8**
> update8(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : QueAnsCategoryDto =  // QueAnsCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update8(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling QueAnsCategoryControllerApi#update8")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsCategoryControllerApi#update8")
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

