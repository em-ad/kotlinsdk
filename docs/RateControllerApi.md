# RateControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create6**](RateControllerApi.md#create6) | **POST** /api/v1/rates | create
[**createMulti**](RateControllerApi.md#createMulti) | **POST** /api/v1/rates/multi | createMulti
[**delete12**](RateControllerApi.md#delete12) | **DELETE** /api/v1/rates/{id} | delete
[**get15**](RateControllerApi.md#get15) | **GET** /api/v1/rates/{id} | get
[**getAll7**](RateControllerApi.md#getAll7) | **GET** /api/v1/rates | getAll
[**update9**](RateControllerApi.md#update9) | **PUT** /api/v1/rates/{id} | update

<a name="create6"></a>
# **create6**
> create6(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateControllerApi()
val body : CreateRateDto =  // CreateRateDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.create6(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateControllerApi#create6")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateControllerApi#create6")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRateDto**](CreateRateDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createMulti"></a>
# **createMulti**
> createMulti(body, acceptLanguage)

createMulti

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateControllerApi()
val body : CreateMultiRateDto =  // CreateMultiRateDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.createMulti(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateControllerApi#createMulti")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateControllerApi#createMulti")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMultiRateDto**](CreateMultiRateDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="delete12"></a>
# **delete12**
> delete12(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete12(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateControllerApi#delete12")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateControllerApi#delete12")
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

<a name="get15"></a>
# **get15**
> GetRateDto get15(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetRateDto = apiInstance.get15(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RateControllerApi#get15")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateControllerApi#get15")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetRateDto**](GetRateDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll7"></a>
# **getAll7**
> Page_GetRateDto_ getAll7(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetRateDto_ = apiInstance.getAll7(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RateControllerApi#getAll7")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateControllerApi#getAll7")
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

[**Page_GetRateDto_**](Page_GetRateDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update9"></a>
# **update9**
> update9(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : UpdateRateDto =  // UpdateRateDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update9(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateControllerApi#update9")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateControllerApi#update9")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**UpdateRateDto**](UpdateRateDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

