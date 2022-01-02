# ContentCategoryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCategory**](ContentCategoryControllerApi.md#addCategory) | **POST** /api/v1/contents/categories | addCategory
[**categoryList**](ContentCategoryControllerApi.md#categoryList) | **GET** /api/v1/contents/categories | categoryList
[**deleteCategory**](ContentCategoryControllerApi.md#deleteCategory) | **DELETE** /api/v1/contents/categories/{categoryId} | deleteCategory
[**editCategory**](ContentCategoryControllerApi.md#editCategory) | **PUT** /api/v1/contents/categories/{categoryId} | editCategory
[**getCategory**](ContentCategoryControllerApi.md#getCategory) | **GET** /api/v1/contents/categories/{categoryId} | getCategory
[**getCategoryTree**](ContentCategoryControllerApi.md#getCategoryTree) | **GET** /api/v1/contents/categories/tree | getCategoryTree
[**getListWithSub**](ContentCategoryControllerApi.md#getListWithSub) | **GET** /api/v1/contents/categories/all | getListWithSub

<a name="addCategory"></a>
# **addCategory**
> CategoryDto addCategory(body, acceptLanguage)

addCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentCategoryControllerApi()
val body : CategoryDto =  // CategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : CategoryDto = apiInstance.addCategory(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentCategoryControllerApi#addCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentCategoryControllerApi#addCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryDto**](CategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**CategoryDto**](CategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="categoryList"></a>
# **categoryList**
> Page_CategoryDto_ categoryList(pageNumber, pageSize, sort, acceptLanguage, childEmbed, flag, sortKey, title, type)

categoryList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentCategoryControllerApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val childEmbed : kotlin.Boolean = true // kotlin.Boolean | 
val flag : kotlin.Boolean = true // kotlin.Boolean | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val title : kotlin.String = title_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : Page_CategoryDto_ = apiInstance.categoryList(pageNumber, pageSize, sort, acceptLanguage, childEmbed, flag, sortKey, title, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentCategoryControllerApi#categoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentCategoryControllerApi#categoryList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| starts from 0 |
 **pageSize** | **kotlin.Int**| must be greater than 0 | [enum: ]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [enum: ASC, DESC]
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **childEmbed** | **kotlin.Boolean**|  | [optional]
 **flag** | **kotlin.Boolean**|  | [optional]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **title** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional]

### Return type

[**Page_CategoryDto_**](Page_CategoryDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(categoryId, acceptLanguage)

deleteCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentCategoryControllerApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteCategory(categoryId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ContentCategoryControllerApi#deleteCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentCategoryControllerApi#deleteCategory")
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

<a name="editCategory"></a>
# **editCategory**
> CategoryDto editCategory(categoryId, body, acceptLanguage)

editCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentCategoryControllerApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val body : CategoryDto =  // CategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : CategoryDto = apiInstance.editCategory(categoryId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentCategoryControllerApi#editCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentCategoryControllerApi#editCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **kotlin.String**| categoryId |
 **body** | [**CategoryDto**](CategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**CategoryDto**](CategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCategory"></a>
# **getCategory**
> CategoryDto getCategory(categoryId, acceptLanguage)

getCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentCategoryControllerApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : CategoryDto = apiInstance.getCategory(categoryId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentCategoryControllerApi#getCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentCategoryControllerApi#getCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **kotlin.String**| categoryId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**CategoryDto**](CategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCategoryTree"></a>
# **getCategoryTree**
> kotlin.Array&lt;CategoryDto&gt; getCategoryTree(acceptLanguage)

getCategoryTree

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<CategoryDto> = apiInstance.getCategoryTree(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentCategoryControllerApi#getCategoryTree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentCategoryControllerApi#getCategoryTree")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;CategoryDto&gt;**](CategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getListWithSub"></a>
# **getListWithSub**
> kotlin.Array&lt;CategoryDto&gt; getListWithSub(acceptLanguage, parentId)

getListWithSub

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val parentId : kotlin.String = parentId_example // kotlin.String | 
try {
    val result : kotlin.Array<CategoryDto> = apiInstance.getListWithSub(acceptLanguage, parentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentCategoryControllerApi#getListWithSub")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentCategoryControllerApi#getListWithSub")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **parentId** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.Array&lt;CategoryDto&gt;**](CategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

