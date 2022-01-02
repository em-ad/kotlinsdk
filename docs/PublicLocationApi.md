# PublicLocationApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocation1**](PublicLocationApi.md#getLocation1) | **GET** /public/api/v1/datyar/locations/{locationId} | getLocation
[**getLocationsList1**](PublicLocationApi.md#getLocationsList1) | **GET** /public/api/v1/datyar/locations | getLocationsList
[**getTestPath**](PublicLocationApi.md#getTestPath) | **GET** /public/api/v1/datyar/locations/testPath | getTestPath

<a name="getLocation1"></a>
# **getLocation1**
> GetLocationDto getLocation1(locationId, acceptLanguage, byChildren)

getLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : GetLocationDto = apiInstance.getLocation1(locationId, acceptLanguage, byChildren)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationApi#getLocation1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationApi#getLocation1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **kotlin.String**| locationId |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **byChildren** | **kotlin.Boolean**|  | [optional]

### Return type

[**GetLocationDto**](GetLocationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLocationsList1"></a>
# **getLocationsList1**
> kotlin.Array&lt;GetListLocationDto&gt; getLocationsList1(acceptLanguage, categoriesId, city, distance, keyword, lat, lng, ownerID, pageNumber, pageSize, sort, sortKey, state, status, title, workingFrom, workingTo)

getLocationsList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val categoriesId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val city : kotlin.String = city_example // kotlin.String | 
val distance : kotlin.Double = 1.2 // kotlin.Double | 
val keyword : kotlin.String = keyword_example // kotlin.String | 
val lat : kotlin.Double = 1.2 // kotlin.Double | 
val lng : kotlin.Double = 1.2 // kotlin.Double | 
val ownerID : kotlin.String = ownerID_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val state : kotlin.String = state_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val workingFrom : kotlin.String = workingFrom_example // kotlin.String | 
val workingTo : kotlin.String = workingTo_example // kotlin.String | 
try {
    val result : kotlin.Array<GetListLocationDto> = apiInstance.getLocationsList1(acceptLanguage, categoriesId, city, distance, keyword, lat, lng, ownerID, pageNumber, pageSize, sort, sortKey, state, status, title, workingFrom, workingTo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationApi#getLocationsList1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationApi#getLocationsList1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **categoriesId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **city** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Double**|  | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **lat** | **kotlin.Double**|  | [optional]
 **lng** | **kotlin.Double**|  | [optional]
 **ownerID** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **state** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional] [enum: DRAFT, PUBLISHED]
 **title** | **kotlin.String**|  | [optional]
 **workingFrom** | **kotlin.String**|  | [optional]
 **workingTo** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.Array&lt;GetListLocationDto&gt;**](GetListLocationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestPath"></a>
# **getTestPath**
> kotlin.String getTestPath(acceptLanguage)

getTestPath

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.String = apiInstance.getTestPath(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationApi#getTestPath")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationApi#getTestPath")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

