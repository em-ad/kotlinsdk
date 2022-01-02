# PublicLocationTagControllerDeprecatedApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get11**](PublicLocationTagControllerDeprecatedApi.md#get11) | **GET** /public/v1/locations/tags/{id} | get
[**getList3**](PublicLocationTagControllerDeprecatedApi.md#getList3) | **GET** /public/v1/locations/tags | getList

<a name="get11"></a>
# **get11**
> LocationTagDto get11(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationTagControllerDeprecatedApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : LocationTagDto = apiInstance.get11(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationTagControllerDeprecatedApi#get11")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationTagControllerDeprecatedApi#get11")
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

<a name="getList3"></a>
# **getList3**
> Page_LocationTagDto_ getList3(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationTagControllerDeprecatedApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_LocationTagDto_ = apiInstance.getList3(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationTagControllerDeprecatedApi#getList3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationTagControllerDeprecatedApi#getList3")
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

