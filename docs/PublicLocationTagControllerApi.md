# PublicLocationTagControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get12**](PublicLocationTagControllerApi.md#get12) | **GET** /public/api/v1/locations/tags/{id} | get
[**getList4**](PublicLocationTagControllerApi.md#getList4) | **GET** /public/api/v1/locations/tags | getList

<a name="get12"></a>
# **get12**
> LocationTagDto get12(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationTagControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationTagDto = apiInstance.get12(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationTagControllerApi#get12")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationTagControllerApi#get12")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getList4"></a>
# **getList4**
> Page_LocationTagDto_ getList4(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationTagControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_LocationTagDto_ = apiInstance.getList4(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationTagControllerApi#getList4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationTagControllerApi#getList4")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

