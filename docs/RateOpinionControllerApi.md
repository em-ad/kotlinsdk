# RateOpinionControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addKeyUsingPATCH1**](RateOpinionControllerApi.md#addKeyUsingPATCH1) | **PATCH** /api/v1/rates/opinions/keys/add | addKey
[**create7**](RateOpinionControllerApi.md#create7) | **POST** /api/v1/rates/opinions | create
[**delete13**](RateOpinionControllerApi.md#delete13) | **DELETE** /api/v1/rates/opinions/{value-enum} | delete
[**get16**](RateOpinionControllerApi.md#get16) | **GET** /api/v1/rates/opinions/{value-enum} | get
[**getAll8**](RateOpinionControllerApi.md#getAll8) | **GET** /api/v1/rates/opinions | getAll
[**removeKeyUsingPATCH1**](RateOpinionControllerApi.md#removeKeyUsingPATCH1) | **PATCH** /api/v1/rates/opinions/keys/remove | removeKey
[**update10**](RateOpinionControllerApi.md#update10) | **PUT** /api/v1/rates/opinions/{value-enum} | update

<a name="addKeyUsingPATCH1"></a>
# **addKeyUsingPATCH1**
> addKeyUsingPATCH1(body, acceptLanguage)

addKey

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateOpinionControllerApi()
val body : KeyQueryParam =  // KeyQueryParam | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.addKeyUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateOpinionControllerApi#addKeyUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateOpinionControllerApi#addKeyUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeyQueryParam**](KeyQueryParam.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="create7"></a>
# **create7**
> create7(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateOpinionControllerApi()
val body : CreateRateOpinionDto =  // CreateRateOpinionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.create7(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateOpinionControllerApi#create7")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateOpinionControllerApi#create7")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRateOpinionDto**](CreateRateOpinionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="delete13"></a>
# **delete13**
> delete13(valueEnum, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateOpinionControllerApi()
val valueEnum : kotlin.String = valueEnum_example // kotlin.String | value-enum
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete13(valueEnum, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateOpinionControllerApi#delete13")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateOpinionControllerApi#delete13")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **valueEnum** | **kotlin.String**| value-enum | [enum: FIVE, FOUR, ONE, THREE, TWO]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get16"></a>
# **get16**
> GetRateOpinionDto get16(valueEnum, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateOpinionControllerApi()
val valueEnum : kotlin.String = valueEnum_example // kotlin.String | value-enum
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetRateOpinionDto = apiInstance.get16(valueEnum, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RateOpinionControllerApi#get16")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateOpinionControllerApi#get16")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **valueEnum** | **kotlin.String**| value-enum | [enum: FIVE, FOUR, ONE, THREE, TWO]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetRateOpinionDto**](GetRateOpinionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll8"></a>
# **getAll8**
> Page_GetRateOpinionDto_ getAll8(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateOpinionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetRateOpinionDto_ = apiInstance.getAll8(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RateOpinionControllerApi#getAll8")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateOpinionControllerApi#getAll8")
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

[**Page_GetRateOpinionDto_**](Page_GetRateOpinionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="removeKeyUsingPATCH1"></a>
# **removeKeyUsingPATCH1**
> removeKeyUsingPATCH1(body, acceptLanguage)

removeKey

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateOpinionControllerApi()
val body : KeyQueryParam =  // KeyQueryParam | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.removeKeyUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateOpinionControllerApi#removeKeyUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateOpinionControllerApi#removeKeyUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeyQueryParam**](KeyQueryParam.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="update10"></a>
# **update10**
> update10(valueEnum, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RateOpinionControllerApi()
val valueEnum : kotlin.String = valueEnum_example // kotlin.String | value-enum
val body : UpdateRateOpinionDto =  // UpdateRateOpinionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update10(valueEnum, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RateOpinionControllerApi#update10")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateOpinionControllerApi#update10")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **valueEnum** | **kotlin.String**| value-enum | [enum: FIVE, FOUR, ONE, THREE, TWO]
 **body** | [**UpdateRateOpinionDto**](UpdateRateOpinionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

