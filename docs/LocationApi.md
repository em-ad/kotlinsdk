# LocationApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocation**](LocationApi.md#addLocation) | **POST** /api/v1/datyar/locations | addLocation
[**deleteLocation**](LocationApi.md#deleteLocation) | **DELETE** /api/v1/datyar/locations/{locationId} | deleteLocation
[**editLocation**](LocationApi.md#editLocation) | **PUT** /api/v1/datyar/locations/{locationId} | editLocation
[**getLocation**](LocationApi.md#getLocation) | **GET** /api/v1/datyar/locations/{locationId} | getLocation
[**getLocationsList**](LocationApi.md#getLocationsList) | **GET** /api/v1/datyar/locations | getLocationsList

<a name="addLocation"></a>
# **addLocation**
> GetLocationDto addLocation(body, acceptLanguage)

addLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationApi()
val body : DatyarCreateLocationDto =  // DatyarCreateLocationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLocationDto = apiInstance.addLocation(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#addLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#addLocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatyarCreateLocationDto**](DatyarCreateLocationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLocationDto**](GetLocationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteLocation"></a>
# **deleteLocation**
> deleteLocation(locationId, acceptLanguage, deleteByChildren)

deleteLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val deleteByChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.deleteLocation(locationId, acceptLanguage, deleteByChildren)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#deleteLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#deleteLocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **kotlin.String**| locationId |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **deleteByChildren** | **kotlin.Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="editLocation"></a>
# **editLocation**
> GetLocationDto editLocation(locationId, body, acceptLanguage)

editLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val body : DatyarCreateLocationDto =  // DatyarCreateLocationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLocationDto = apiInstance.editLocation(locationId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#editLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#editLocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **kotlin.String**| locationId |
 **body** | [**DatyarCreateLocationDto**](DatyarCreateLocationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLocationDto**](GetLocationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getLocation"></a>
# **getLocation**
> GetLocationDto getLocation(locationId, acceptLanguage, byChildren)

getLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : GetLocationDto = apiInstance.getLocation(locationId, acceptLanguage, byChildren)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#getLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#getLocation")
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLocationsList"></a>
# **getLocationsList**
> kotlin.Array&lt;GetListLocationDto&gt; getLocationsList(acceptLanguage, categoriesId, city, distance, keyword, lat, lng, ownerID, pageNumber, pageSize, sort, sortKey, state, status, title, workingFrom, workingTo)

getLocationsList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationApi()
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
    val result : kotlin.Array<GetListLocationDto> = apiInstance.getLocationsList(acceptLanguage, categoriesId, city, distance, keyword, lat, lng, ownerID, pageNumber, pageSize, sort, sortKey, state, status, title, workingFrom, workingTo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#getLocationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#getLocationsList")
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

