# PublicLocationControllerDeprecatedApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocation3**](PublicLocationControllerDeprecatedApi.md#getLocation3) | **GET** /public/v1/locations/{locationId} | getLocation
[**getLocationsList3**](PublicLocationControllerDeprecatedApi.md#getLocationsList3) | **GET** /public/v1/locations | getLocationsList

<a name="getLocation3"></a>
# **getLocation3**
> GetLocationDto getLocation3(locationId, acceptLanguage, byChildren)

getLocation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationControllerDeprecatedApi()
val locationId : kotlin.String = locationId_example // kotlin.String | locationId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : GetLocationDto = apiInstance.getLocation3(locationId, acceptLanguage, byChildren)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationControllerDeprecatedApi#getLocation3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationControllerDeprecatedApi#getLocation3")
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

<a name="getLocationsList3"></a>
# **getLocationsList3**
> kotlin.Array&lt;GetListLocationDto&gt; getLocationsList3(acceptLanguage, byChildren, categoriesId, categoryTitle, city, country, description, distance, keyword, lat, lng, ownerID, propertiesId, propertyTitle, state, status, tagTitle, tagsId, title, type)

getLocationsList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicLocationControllerDeprecatedApi()
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
    val result : kotlin.Array<GetListLocationDto> = apiInstance.getLocationsList3(acceptLanguage, byChildren, categoriesId, categoryTitle, city, country, description, distance, keyword, lat, lng, ownerID, propertiesId, propertyTitle, state, status, tagTitle, tagsId, title, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicLocationControllerDeprecatedApi#getLocationsList3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicLocationControllerDeprecatedApi#getLocationsList3")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

