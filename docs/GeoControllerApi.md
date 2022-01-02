# GeoControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create3**](GeoControllerApi.md#create3) | **POST** /api/v1/geo | create
[**delete4**](GeoControllerApi.md#delete4) | **DELETE** /api/v1/geo/{id} | delete
[**get7**](GeoControllerApi.md#get7) | **GET** /api/v1/geo/{id} | get
[**getList1**](GeoControllerApi.md#getList1) | **GET** /api/v1/geo | getList
[**update2**](GeoControllerApi.md#update2) | **PUT** /api/v1/geo/{id} | update

<a name="create3"></a>
# **create3**
> GetGeoDto create3(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = GeoControllerApi()
val body : CreateGeoDto =  // CreateGeoDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetGeoDto = apiInstance.create3(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeoControllerApi#create3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoControllerApi#create3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateGeoDto**](CreateGeoDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetGeoDto**](GetGeoDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete4"></a>
# **delete4**
> delete4(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = GeoControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete4(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling GeoControllerApi#delete4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoControllerApi#delete4")
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

<a name="get7"></a>
# **get7**
> GetGeoDto get7(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = GeoControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetGeoDto = apiInstance.get7(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeoControllerApi#get7")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoControllerApi#get7")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetGeoDto**](GetGeoDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getList1"></a>
# **getList1**
> kotlin.Array&lt;GetGeoDto&gt; getList1(distance, lat, lng, acceptLanguage, tagTitle, type)

getList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = GeoControllerApi()
val distance : kotlin.Double = 1.2 // kotlin.Double | 
val lat : kotlin.Double = 1.2 // kotlin.Double | 
val lng : kotlin.Double = 1.2 // kotlin.Double | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val tagTitle : kotlin.String = tagTitle_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : kotlin.Array<GetGeoDto> = apiInstance.getList1(distance, lat, lng, acceptLanguage, tagTitle, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeoControllerApi#getList1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoControllerApi#getList1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distance** | **kotlin.Double**|  |
 **lat** | **kotlin.Double**|  |
 **lng** | **kotlin.Double**|  |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **tagTitle** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.Array&lt;GetGeoDto&gt;**](GetGeoDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update2"></a>
# **update2**
> GetGeoDto update2(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = GeoControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : CreateGeoDto =  // CreateGeoDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetGeoDto = apiInstance.update2(id, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeoControllerApi#update2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeoControllerApi#update2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**CreateGeoDto**](CreateGeoDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetGeoDto**](GetGeoDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

