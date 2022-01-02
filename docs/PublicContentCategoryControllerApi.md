# PublicContentCategoryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategory2**](PublicContentCategoryControllerApi.md#getCategory2) | **GET** /public/v1/contents/categories/{categoryId} | getCategory
[**getCategoryTree1**](PublicContentCategoryControllerApi.md#getCategoryTree1) | **GET** /public/v1/contents/categories/tree | getCategoryTree

<a name="getCategory2"></a>
# **getCategory2**
> CategoryDto getCategory2(categoryId, acceptLanguage)

getCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicContentCategoryControllerApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : CategoryDto = apiInstance.getCategory2(categoryId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicContentCategoryControllerApi#getCategory2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicContentCategoryControllerApi#getCategory2")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCategoryTree1"></a>
# **getCategoryTree1**
> kotlin.Array&lt;CategoryDto&gt; getCategoryTree1(acceptLanguage)

getCategoryTree

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicContentCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<CategoryDto> = apiInstance.getCategoryTree1(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicContentCategoryControllerApi#getCategoryTree1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicContentCategoryControllerApi#getCategoryTree1")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

