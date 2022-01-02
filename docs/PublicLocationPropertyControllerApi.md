# PublicLocationPropertyControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPropertiesList3**](PublicLocationPropertyControllerApi.md#getPropertiesList3) | **GET** /public/api/v1/locations/properties | getPropertiesList
[**getProperty3**](PublicLocationPropertyControllerApi.md#getProperty3) | **GET** /public/api/v1/locations/properties/{id} | getProperty

<a name="getPropertiesList3"></a>
# **getPropertiesList3**
> Page_GetLocationPropertyDto_ getPropertiesList3(acceptLanguage, ids, optionIds, pageNumber, pageSize, sort, sortKey)

getPropertiesList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationPropertyControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val ids : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val optionIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetLocationPropertyDto_ = apiInstance.getPropertiesList3(acceptLanguage, ids, optionIds, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationPropertyControllerApi#getPropertiesList3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationPropertyControllerApi#getPropertiesList3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **ids** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **optionIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_GetLocationPropertyDto_**](Page_GetLocationPropertyDto_.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProperty3"></a>
# **getProperty3**
> GetLocationPropertyDto getProperty3(id, acceptLanguage)

getProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationPropertyControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLocationPropertyDto = apiInstance.getProperty3(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationPropertyControllerApi#getProperty3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationPropertyControllerApi#getProperty3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLocationPropertyDto**](GetLocationPropertyDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

