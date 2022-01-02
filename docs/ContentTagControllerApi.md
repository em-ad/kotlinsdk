# ContentTagControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create1**](ContentTagControllerApi.md#create1) | **POST** /api/v1/contents/tags | create
[**delete2**](ContentTagControllerApi.md#delete2) | **DELETE** /api/v1/contents/tags/{id} | delete
[**get2**](ContentTagControllerApi.md#get2) | **GET** /api/v1/contents/tags/{id} | get
[**getList**](ContentTagControllerApi.md#getList) | **GET** /api/v1/contents/tags | getList
[**update1**](ContentTagControllerApi.md#update1) | **PUT** /api/v1/contents/tags/{id} | update

<a name="create1"></a>
# **create1**
> TagDto create1(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentTagControllerApi()
val body : TagDto =  // TagDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TagDto = apiInstance.create1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentTagControllerApi#create1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentTagControllerApi#create1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagDto**](TagDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TagDto**](TagDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete2"></a>
# **delete2**
> delete2(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentTagControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete2(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ContentTagControllerApi#delete2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentTagControllerApi#delete2")
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

<a name="get2"></a>
# **get2**
> TagDto get2(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentTagControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TagDto = apiInstance.get2(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentTagControllerApi#get2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentTagControllerApi#get2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TagDto**](TagDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getList"></a>
# **getList**
> Page_TagDto_ getList(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentTagControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_TagDto_ = apiInstance.getList(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentTagControllerApi#getList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentTagControllerApi#getList")
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

[**Page_TagDto_**](Page_TagDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update1"></a>
# **update1**
> update1(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentTagControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : TagDto =  // TagDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update1(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ContentTagControllerApi#update1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentTagControllerApi#update1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**TagDto**](TagDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

