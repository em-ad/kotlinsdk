# SkillCategoryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategory**](SkillCategoryControllerApi.md#createCategory) | **POST** /api/v1/datyar/skill-category | createSkillCategory
[**deleteCategory2**](SkillCategoryControllerApi.md#deleteCategory2) | **DELETE** /api/v1/datyar/skill-category/{id} | deleteSkillCategory
[**getCategoryById**](SkillCategoryControllerApi.md#getCategoryById) | **GET** /api/v1/datyar/skill-category/{id} | get category skill 
[**getCategoryByName**](SkillCategoryControllerApi.md#getCategoryByName) | **GET** /api/v1/datyar/skill-category/with-name/{name} | get category skill 
[**getListCategory**](SkillCategoryControllerApi.md#getListCategory) | **GET** /api/v1/datyar/skill-category/list | list category skill 
[**getSmartCategory**](SkillCategoryControllerApi.md#getSmartCategory) | **POST** /api/v1/datyar/skill-category/smart-category | list category skill 
[**getSmartCategoryList**](SkillCategoryControllerApi.md#getSmartCategoryList) | **POST** /api/v1/datyar/skill-category/smart-category/list | list category skill 
[**updateCategory**](SkillCategoryControllerApi.md#updateCategory) | **PUT** /api/v1/datyar/skill-category/{id} | updateSkillCategory

<a name="createCategory"></a>
# **createCategory**
> SkillCategoryDto createCategory(body, acceptLanguage)

createSkillCategory

This api add to SkillCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val body : SkillCategoryDto =  // SkillCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SkillCategoryDto = apiInstance.createCategory(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#createCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#createCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SkillCategoryDto**](SkillCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SkillCategoryDto**](SkillCategoryDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCategory2"></a>
# **deleteCategory2**
> deleteCategory2(id, acceptLanguage)

deleteSkillCategory

This api delete to category and sub

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteCategory2(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#deleteCategory2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#deleteCategory2")
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

<a name="getCategoryById"></a>
# **getCategoryById**
> SkillCategoryModel getCategoryById(id, acceptLanguage)

get category skill 

This api get category skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SkillCategoryModel = apiInstance.getCategoryById(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#getCategoryById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#getCategoryById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SkillCategoryModel**](SkillCategoryModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCategoryByName"></a>
# **getCategoryByName**
> SkillCategoryModel getCategoryByName(name, acceptLanguage)

get category skill 

This api get category skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val name : kotlin.String = name_example // kotlin.String | name
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SkillCategoryModel = apiInstance.getCategoryByName(name, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#getCategoryByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#getCategoryByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| name |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SkillCategoryModel**](SkillCategoryModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getListCategory"></a>
# **getListCategory**
> kotlin.Array&lt;SkillCategoryModel&gt; getListCategory(acceptLanguage)

list category skill 

This api list category skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<SkillCategoryModel> = apiInstance.getListCategory(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#getListCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#getListCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;SkillCategoryModel&gt;**](SkillCategoryModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSmartCategory"></a>
# **getSmartCategory**
> SkillCategoryModel getSmartCategory(body, acceptLanguage)

list category skill 

This api list category skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val body : SmartSkillCategoryDto =  // SmartSkillCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SkillCategoryModel = apiInstance.getSmartCategory(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#getSmartCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#getSmartCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartSkillCategoryDto**](SmartSkillCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SkillCategoryModel**](SkillCategoryModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getSmartCategoryList"></a>
# **getSmartCategoryList**
> kotlin.Array&lt;SkillCategoryModel&gt; getSmartCategoryList(body, acceptLanguage)

list category skill 

This api list category skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val body : SmartSkillCategoryDto =  // SmartSkillCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<SkillCategoryModel> = apiInstance.getSmartCategoryList(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#getSmartCategoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#getSmartCategoryList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmartSkillCategoryDto**](SmartSkillCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;SkillCategoryModel&gt;**](SkillCategoryModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCategory"></a>
# **updateCategory**
> updateCategory(id, body, acceptLanguage)

updateSkillCategory

This api update skillCategory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillCategoryControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : SkillCategoryDto =  // SkillCategoryDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateCategory(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SkillCategoryControllerApi#updateCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillCategoryControllerApi#updateCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**SkillCategoryDto**](SkillCategoryDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

