# QueAnsControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQueAns3**](QueAnsControllerApi.md#createQueAns3) | **POST** /api/v1/faq/que-ans | create
[**deleteQueAns1**](QueAnsControllerApi.md#deleteQueAns1) | **DELETE** /api/v1/faq/que-ans/{id} | deleteQueAns
[**getAllQueAns1**](QueAnsControllerApi.md#getAllQueAns1) | **GET** /public/v1/faq/que-ans | getAllQueAns
[**getQueAns1**](QueAnsControllerApi.md#getQueAns1) | **GET** /public/v1/faq/que-ans/{id} | getQueAns
[**getQueAnsByCategoryId1**](QueAnsControllerApi.md#getQueAnsByCategoryId1) | **GET** /public/v1/faq/que-ans/category/{id} | getQueAnsByCategoryId
[**selectiveUpdateQueAnsUsingPATCH1**](QueAnsControllerApi.md#selectiveUpdateQueAnsUsingPATCH1) | **PATCH** /api/v1/faq/que-ans/{id} | update
[**updateQueAns1**](QueAnsControllerApi.md#updateQueAns1) | **PUT** /api/v1/faq/que-ans/{id} | update

<a name="createQueAns3"></a>
# **createQueAns3**
> QueAnsDto createQueAns3(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsControllerApi()
val body : QueAnsDto =  // QueAnsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsDto = apiInstance.createQueAns3(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsControllerApi#createQueAns3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsControllerApi#createQueAns3")
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

<a name="deleteQueAns1"></a>
# **deleteQueAns1**
> deleteQueAns1(id, acceptLanguage)

deleteQueAns

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteQueAns1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling QueAnsControllerApi#deleteQueAns1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsControllerApi#deleteQueAns1")
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

<a name="getAllQueAns1"></a>
# **getAllQueAns1**
> Page_QueAnsDto_ getAllQueAns1(acceptLanguage, category, pageNumber, pageSize, section, sort, sortKey, targetWord)

getAllQueAns

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val category : kotlin.String = category_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val section : kotlin.String = section_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val targetWord : kotlin.String = targetWord_example // kotlin.String | word search
try {
    val result : Page_QueAnsDto_ = apiInstance.getAllQueAns1(acceptLanguage, category, pageNumber, pageSize, section, sort, sortKey, targetWord)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsControllerApi#getAllQueAns1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsControllerApi#getAllQueAns1")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQueAns1"></a>
# **getQueAns1**
> QueAnsDto getQueAns1(id, acceptLanguage)

getQueAns

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsDto = apiInstance.getQueAns1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsControllerApi#getQueAns1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsControllerApi#getQueAns1")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQueAnsByCategoryId1"></a>
# **getQueAnsByCategoryId1**
> Page_QueAnsDto_ getQueAnsByCategoryId1(id, acceptLanguage, pageNumber, pageSize, sort, sortKey, targetWord)

getQueAnsByCategoryId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val targetWord : kotlin.String = targetWord_example // kotlin.String | word search
try {
    val result : Page_QueAnsDto_ = apiInstance.getQueAnsByCategoryId1(id, acceptLanguage, pageNumber, pageSize, sort, sortKey, targetWord)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsControllerApi#getQueAnsByCategoryId1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsControllerApi#getQueAnsByCategoryId1")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="selectiveUpdateQueAnsUsingPATCH1"></a>
# **selectiveUpdateQueAnsUsingPATCH1**
> QueAnsDto selectiveUpdateQueAnsUsingPATCH1(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : QueAnsDto =  // QueAnsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : QueAnsDto = apiInstance.selectiveUpdateQueAnsUsingPATCH1(id, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QueAnsControllerApi#selectiveUpdateQueAnsUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsControllerApi#selectiveUpdateQueAnsUsingPATCH1")
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

[**QueAnsDto**](QueAnsDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateQueAns1"></a>
# **updateQueAns1**
> updateQueAns1(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = QueAnsControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : QueAnsDto =  // QueAnsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateQueAns1(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling QueAnsControllerApi#updateQueAns1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QueAnsControllerApi#updateQueAns1")
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

