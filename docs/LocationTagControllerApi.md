# LocationTagControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create4**](LocationTagControllerApi.md#create4) | **POST** /api/v1/locations/tags | create
[**delete6**](LocationTagControllerApi.md#delete6) | **DELETE** /api/v1/locations/tags/{id} | delete
[**get9**](LocationTagControllerApi.md#get9) | **GET** /api/v1/locations/tags/{id} | get
[**getList2**](LocationTagControllerApi.md#getList2) | **GET** /api/v1/locations/tags | getList
[**update4**](LocationTagControllerApi.md#update4) | **PUT** /api/v1/locations/tags/{id} | update

<a name="create4"></a>
# **create4**
> LocationTagDto create4(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationTagControllerApi()
val body : LocationTagDto =  // LocationTagDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationTagDto = apiInstance.create4(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationTagControllerApi#create4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationTagControllerApi#create4")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationTagDto**](LocationTagDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LocationTagDto**](LocationTagDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete6"></a>
# **delete6**
> delete6(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationTagControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete6(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LocationTagControllerApi#delete6")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationTagControllerApi#delete6")
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

<a name="get9"></a>
# **get9**
> LocationTagDto get9(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationTagControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationTagDto = apiInstance.get9(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationTagControllerApi#get9")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationTagControllerApi#get9")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**LocationTagDto**](LocationTagDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getList2"></a>
# **getList2**
> Page_LocationTagDto_ getList2(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationTagControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_LocationTagDto_ = apiInstance.getList2(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationTagControllerApi#getList2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationTagControllerApi#getList2")
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

[**Page_LocationTagDto_**](Page_LocationTagDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update4"></a>
# **update4**
> update4(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationTagControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : LocationTagDto =  // LocationTagDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update4(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LocationTagControllerApi#update4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationTagControllerApi#update4")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**LocationTagDto**](LocationTagDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

