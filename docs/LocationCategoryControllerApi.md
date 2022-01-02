# LocationCategoryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCategory1**](LocationCategoryControllerApi.md#addCategory1) | **POST** /api/v1/locations/categories | addCategory
[**categoriesList**](LocationCategoryControllerApi.md#categoriesList) | **GET** /api/v1/locations/categories | categoriesList
[**deleteCategory1**](LocationCategoryControllerApi.md#deleteCategory1) | **DELETE** /api/v1/locations/categories/{categoryId} | deleteCategory
[**editCategory1**](LocationCategoryControllerApi.md#editCategory1) | **PUT** /api/v1/locations/categories/{categoryId} | editCategory
[**getCategory1**](LocationCategoryControllerApi.md#getCategory1) | **GET** /api/v1/locations/categories/{categoryId} | getCategory

<a name="addCategory1"></a>
# **addCategory1**
> LocationCategoryResultDto addCategory1(body, acceptLanguage)

addCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationCategoryControllerApi()
val body : LocationCategoryDto =  // LocationCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationCategoryResultDto = apiInstance.addCategory1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationCategoryControllerApi#addCategory1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationCategoryControllerApi#addCategory1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationCategoryDto**](LocationCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LocationCategoryResultDto**](LocationCategoryResultDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="categoriesList"></a>
# **categoriesList**
> Page_LocationCategoryResultDto_ categoriesList(acceptLanguage, ids, isRoot, pageNumber, pageSize, parentId, sort, sortKey, type)

categoriesList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val ids : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val isRoot : kotlin.Boolean = true // kotlin.Boolean | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val parentId : kotlin.String = parentId_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : Page_LocationCategoryResultDto_ = apiInstance.categoriesList(acceptLanguage, ids, isRoot, pageNumber, pageSize, parentId, sort, sortKey, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationCategoryControllerApi#categoriesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationCategoryControllerApi#categoriesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **ids** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **isRoot** | **kotlin.Boolean**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **parentId** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **type** | **kotlin.String**|  | [optional]

### Return type

[**Page_LocationCategoryResultDto_**](Page_LocationCategoryResultDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCategory1"></a>
# **deleteCategory1**
> deleteCategory1(categoryId, acceptLanguage)

deleteCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationCategoryControllerApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteCategory1(categoryId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LocationCategoryControllerApi#deleteCategory1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationCategoryControllerApi#deleteCategory1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **kotlin.String**| categoryId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="editCategory1"></a>
# **editCategory1**
> LocationCategoryResultDto editCategory1(categoryId, body, acceptLanguage)

editCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationCategoryControllerApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val body : LocationCategoryDto =  // LocationCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationCategoryResultDto = apiInstance.editCategory1(categoryId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationCategoryControllerApi#editCategory1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationCategoryControllerApi#editCategory1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **kotlin.String**| categoryId |
 **body** | [**LocationCategoryDto**](LocationCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LocationCategoryResultDto**](LocationCategoryResultDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCategory1"></a>
# **getCategory1**
> LocationCategoryResultDto getCategory1(categoryId, acceptLanguage)

getCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationCategoryControllerApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationCategoryResultDto = apiInstance.getCategory1(categoryId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationCategoryControllerApi#getCategory1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationCategoryControllerApi#getCategory1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **kotlin.String**| categoryId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LocationCategoryResultDto**](LocationCategoryResultDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

