# PublicLocationCategoryControllerDeprecatedApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoriesList1**](PublicLocationCategoryControllerDeprecatedApi.md#categoriesList1) | **GET** /public/v1/locations/categories | categoriesList
[**getCategory3**](PublicLocationCategoryControllerDeprecatedApi.md#getCategory3) | **GET** /public/v1/locations/categories/{categoryId} | getCategory

<a name="categoriesList1"></a>
# **categoriesList1**
> Page_LocationCategoryResultDto_ categoriesList1(acceptLanguage, ids, isRoot, pageNumber, pageSize, parentId, sort, sortKey, type)

categoriesList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationCategoryControllerDeprecatedApi()
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
    val result : Page_LocationCategoryResultDto_ = apiInstance.categoriesList1(acceptLanguage, ids, isRoot, pageNumber, pageSize, parentId, sort, sortKey, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationCategoryControllerDeprecatedApi#categoriesList1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationCategoryControllerDeprecatedApi#categoriesList1")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCategory3"></a>
# **getCategory3**
> LocationCategoryResultDto getCategory3(categoryId, acceptLanguage)

getCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationCategoryControllerDeprecatedApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | categoryId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationCategoryResultDto = apiInstance.getCategory3(categoryId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationCategoryControllerDeprecatedApi#getCategory3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationCategoryControllerDeprecatedApi#getCategory3")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

