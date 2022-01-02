# SkillControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSkill**](SkillControllerApi.md#createSkill) | **POST** /api/v1/datyar/skill | createSkill
[**deleteObject**](SkillControllerApi.md#deleteObject) | **DELETE** /api/v1/datyar/skill/{id} | delete Skill
[**getAll9**](SkillControllerApi.md#getAll9) | **GET** /api/v1/datyar/skill | getAll
[**getAllByIds**](SkillControllerApi.md#getAllByIds) | **GET** /api/v1/datyar/skill/by-Ids | getAllByIds
[**getSkillById**](SkillControllerApi.md#getSkillById) | **GET** /api/v1/datyar/skill/{id} | get  skill 
[**getSkillByName**](SkillControllerApi.md#getSkillByName) | **GET** /api/v1/datyar/skill/with-name/{name} | get  skill 
[**updateSkill**](SkillControllerApi.md#updateSkill) | **PUT** /api/v1/datyar/skill/{id} | updateSkill

<a name="createSkill"></a>
# **createSkill**
> SkillModel createSkill(body, acceptLanguage)

createSkill

This api add to skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillControllerApi()
val body : SkillDto =  // SkillDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SkillModel = apiInstance.createSkill(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillControllerApi#createSkill")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillControllerApi#createSkill")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SkillDto**](SkillDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SkillModel**](SkillModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteObject"></a>
# **deleteObject**
> deleteObject(id, acceptLanguage)

delete Skill

This api delete to skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteObject(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SkillControllerApi#deleteObject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillControllerApi#deleteObject")
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

<a name="getAll9"></a>
# **getAll9**
> kotlin.Array&lt;SkillModel&gt; getAll9(acceptLanguage)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<SkillModel> = apiInstance.getAll9(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillControllerApi#getAll9")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillControllerApi#getAll9")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;SkillModel&gt;**](SkillModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllByIds"></a>
# **getAllByIds**
> kotlin.Array&lt;SkillModel&gt; getAllByIds(acceptLanguage, ids)

getAllByIds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val ids : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<SkillModel> = apiInstance.getAllByIds(acceptLanguage, ids)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillControllerApi#getAllByIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillControllerApi#getAllByIds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **ids** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;SkillModel&gt;**](SkillModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSkillById"></a>
# **getSkillById**
> SkillModel getSkillById(id, acceptLanguage)

get  skill 

This api get  skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SkillModel = apiInstance.getSkillById(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillControllerApi#getSkillById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillControllerApi#getSkillById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SkillModel**](SkillModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSkillByName"></a>
# **getSkillByName**
> SkillModel getSkillByName(name, acceptLanguage)

get  skill 

This api get  skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillControllerApi()
val name : kotlin.String = name_example // kotlin.String | name
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SkillModel = apiInstance.getSkillByName(name, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillControllerApi#getSkillByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillControllerApi#getSkillByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| name |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SkillModel**](SkillModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSkill"></a>
# **updateSkill**
> updateSkill(id, body, acceptLanguage)

updateSkill

This api update to skill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SkillControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : SkillDto =  // SkillDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateSkill(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling SkillControllerApi#updateSkill")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillControllerApi#updateSkill")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**SkillDto**](SkillDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

