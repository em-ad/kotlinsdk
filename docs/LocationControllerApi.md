# LocationControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocation1**](LocationControllerApi.md#addLocation1) | **POST** /api/v1/locations | addLocation
[**deleteLocation1**](LocationControllerApi.md#deleteLocation1) | **DELETE** /api/v1/locations/{locationId} | deleteLocation
[**editLocation1**](LocationControllerApi.md#editLocation1) | **PUT** /api/v1/locations/{locationId} | editLocation
[**getLocation2**](LocationControllerApi.md#getLocation2) | **GET** /api/v1/locations/{locationId} | getLocation
[**getLocationsList2**](LocationControllerApi.md#getLocationsList2) | **GET** /api/v1/locations | getLocationsList
[**getPaginatedLocationsList**](LocationControllerApi.md#getPaginatedLocationsList) | **GET** /api/v1/locations/paginatedLocations | getPaginatedLocationsList

<a name="addLocation1"></a>
# **addLocation1**
> GetLocationDto addLocation1(body, acceptLanguage)

addLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationControllerApi()
val body : CreateLocationDto =  // CreateLocationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLocationDto = apiInstance.addLocation1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationControllerApi#addLocation1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationControllerApi#addLocation1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLocationDto**](CreateLocationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLocationDto**](GetLocationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteLocation1"></a>
# **deleteLocation1**
> deleteLocation1(locationId, acceptLanguage, deleteByChildren)

deleteLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationControllerApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val deleteByChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.deleteLocation1(locationId, acceptLanguage, deleteByChildren)
} catch (e: ClientException) {
    println("4xx response calling LocationControllerApi#deleteLocation1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationControllerApi#deleteLocation1")
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

<a name="editLocation1"></a>
# **editLocation1**
> GetLocationDto editLocation1(locationId, body, acceptLanguage)

editLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationControllerApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val body : CreateLocationDto =  // CreateLocationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLocationDto = apiInstance.editLocation1(locationId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationControllerApi#editLocation1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationControllerApi#editLocation1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **kotlin.String**| locationId |
 **body** | [**CreateLocationDto**](CreateLocationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLocationDto**](GetLocationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getLocation2"></a>
# **getLocation2**
> GetLocationDto getLocation2(locationId, acceptLanguage, byChildren)

getLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationControllerApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : GetLocationDto = apiInstance.getLocation2(locationId, acceptLanguage, byChildren)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationControllerApi#getLocation2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationControllerApi#getLocation2")
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

<a name="getLocationsList2"></a>
# **getLocationsList2**
> kotlin.Array&lt;GetListLocationDto&gt; getLocationsList2(acceptLanguage, byChildren, categoriesId, categoryTitle, city, country, description, distance, keyword, lat, lng, ownerID, propertiesId, propertyTitle, state, status, tagTitle, tagsId, title, type)

getLocationsList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
val categoriesId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val categoryTitle : kotlin.String = categoryTitle_example // kotlin.String | 
val city : kotlin.String = city_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val distance : kotlin.Double = 1.2 // kotlin.Double | 
val keyword : kotlin.String = keyword_example // kotlin.String | 
val lat : kotlin.Double = 1.2 // kotlin.Double | 
val lng : kotlin.Double = 1.2 // kotlin.Double | 
val ownerID : kotlin.String = ownerID_example // kotlin.String | 
val propertiesId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val propertyTitle : kotlin.String = propertyTitle_example // kotlin.String | 
val state : kotlin.String = state_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val tagTitle : kotlin.String = tagTitle_example // kotlin.String | 
val tagsId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val title : kotlin.String = title_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : kotlin.Array<GetListLocationDto> = apiInstance.getLocationsList2(acceptLanguage, byChildren, categoriesId, categoryTitle, city, country, description, distance, keyword, lat, lng, ownerID, propertiesId, propertyTitle, state, status, tagTitle, tagsId, title, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationControllerApi#getLocationsList2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationControllerApi#getLocationsList2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **byChildren** | **kotlin.Boolean**|  | [optional]
 **categoriesId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **categoryTitle** | **kotlin.String**|  | [optional]
 **city** | **kotlin.String**|  | [optional]
 **country** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Double**|  | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **lat** | **kotlin.Double**|  | [optional]
 **lng** | **kotlin.Double**|  | [optional]
 **ownerID** | **kotlin.String**|  | [optional]
 **propertiesId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **propertyTitle** | **kotlin.String**|  | [optional]
 **state** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional] [enum: DRAFT, PUBLISHED]
 **tagTitle** | **kotlin.String**|  | [optional]
 **tagsId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.Array&lt;GetListLocationDto&gt;**](GetListLocationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPaginatedLocationsList"></a>
# **getPaginatedLocationsList**
> Page_GetListLocationDto_ getPaginatedLocationsList(acceptLanguage, byChildren, categoriesId, categoryTitle, city, country, description, distance, keyword, lat, lng, ownerID, pageNumber, pageSize, propertiesId, propertyTitle, sort, sortKey, state, status, tagTitle, tagsId, title, type)

getPaginatedLocationsList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
val categoriesId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val categoryTitle : kotlin.String = categoryTitle_example // kotlin.String | 
val city : kotlin.String = city_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val distance : kotlin.Double = 1.2 // kotlin.Double | 
val keyword : kotlin.String = keyword_example // kotlin.String | 
val lat : kotlin.Double = 1.2 // kotlin.Double | 
val lng : kotlin.Double = 1.2 // kotlin.Double | 
val ownerID : kotlin.String = ownerID_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val propertiesId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val propertyTitle : kotlin.String = propertyTitle_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val state : kotlin.String = state_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val tagTitle : kotlin.String = tagTitle_example // kotlin.String | 
val tagsId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val title : kotlin.String = title_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : Page_GetListLocationDto_ = apiInstance.getPaginatedLocationsList(acceptLanguage, byChildren, categoriesId, categoryTitle, city, country, description, distance, keyword, lat, lng, ownerID, pageNumber, pageSize, propertiesId, propertyTitle, sort, sortKey, state, status, tagTitle, tagsId, title, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationControllerApi#getPaginatedLocationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationControllerApi#getPaginatedLocationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **byChildren** | **kotlin.Boolean**|  | [optional]
 **categoriesId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **categoryTitle** | **kotlin.String**|  | [optional]
 **city** | **kotlin.String**|  | [optional]
 **country** | **kotlin.String**|  | [optional]
 **description** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Double**|  | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **lat** | **kotlin.Double**|  | [optional]
 **lng** | **kotlin.Double**|  | [optional]
 **ownerID** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **propertiesId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **propertyTitle** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **state** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional] [enum: DRAFT, PUBLISHED]
 **tagTitle** | **kotlin.String**|  | [optional]
 **tagsId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional]

### Return type

[**Page_GetListLocationDto_**](Page_GetListLocationDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

