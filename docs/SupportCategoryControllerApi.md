# SupportCategoryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategory1**](SupportCategoryControllerApi.md#createCategory1) | **POST** /api/v1/support/categories | createCategory
[**deleteCategory3**](SupportCategoryControllerApi.md#deleteCategory3) | **DELETE** /api/v1/support/categories/{id} | deleteCategory
[**getCategory5**](SupportCategoryControllerApi.md#getCategory5) | **GET** /api/v1/support/categories/{id} | getCategory
[**getCategoryList**](SupportCategoryControllerApi.md#getCategoryList) | **GET** /api/v1/support/categories | getCategoryList
[**updateCategory1**](SupportCategoryControllerApi.md#updateCategory1) | **PUT** /api/v1/support/categories/{id} | updateCategory

<a name="createCategory1"></a>
# **createCategory1**
> SupportCategoryDto createCategory1(body, acceptLanguage)

createCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SupportCategoryControllerApi()
val body : SupportCategoryDto =  // SupportCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SupportCategoryDto = apiInstance.createCategory1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportCategoryControllerApi#createCategory1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportCategoryControllerApi#createCategory1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SupportCategoryDto**](SupportCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SupportCategoryDto**](SupportCategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCategory3"></a>
# **deleteCategory3**
> deleteCategory3(id, acceptLanguage)

deleteCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SupportCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteCategory3(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SupportCategoryControllerApi#deleteCategory3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportCategoryControllerApi#deleteCategory3")
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

<a name="getCategory5"></a>
# **getCategory5**
> SupportCategoryDto getCategory5(id, acceptLanguage)

getCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SupportCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SupportCategoryDto = apiInstance.getCategory5(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportCategoryControllerApi#getCategory5")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportCategoryControllerApi#getCategory5")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SupportCategoryDto**](SupportCategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCategoryList"></a>
# **getCategoryList**
> Page_SupportCategoryDto_ getCategoryList(acceptLanguage, pageNumber, pageSize, section, sort, sortKey)

getCategoryList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SupportCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val section : kotlin.String = section_example // kotlin.String | client
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_SupportCategoryDto_ = apiInstance.getCategoryList(acceptLanguage, pageNumber, pageSize, section, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportCategoryControllerApi#getCategoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportCategoryControllerApi#getCategoryList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **section** | **kotlin.String**| client | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_SupportCategoryDto_**](Page_SupportCategoryDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCategory1"></a>
# **updateCategory1**
> updateCategory1(id, body, acceptLanguage)

updateCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SupportCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : SupportCategoryDto =  // SupportCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateCategory1(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SupportCategoryControllerApi#updateCategory1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportCategoryControllerApi#updateCategory1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**SupportCategoryDto**](SupportCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

