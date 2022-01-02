# LocationPropertyControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProperty1**](LocationPropertyControllerApi.md#createProperty1) | **POST** /api/v1/locations/properties | createProperty
[**deleteProperty1**](LocationPropertyControllerApi.md#deleteProperty1) | **DELETE** /api/v1/locations/properties/{id} | deleteProperty
[**getPropertiesList1**](LocationPropertyControllerApi.md#getPropertiesList1) | **GET** /api/v1/locations/properties | getPropertiesList
[**getProperty1**](LocationPropertyControllerApi.md#getProperty1) | **GET** /api/v1/locations/properties/{id} | getProperty
[**updateProperty1**](LocationPropertyControllerApi.md#updateProperty1) | **PUT** /api/v1/locations/properties/{id} | updateProperty

<a name="createProperty1"></a>
# **createProperty1**
> GetLocationPropertyDto createProperty1(body, acceptLanguage)

createProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationPropertyControllerApi()
val body : CreateLocationPropertyDto =  // CreateLocationPropertyDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLocationPropertyDto = apiInstance.createProperty1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationPropertyControllerApi#createProperty1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationPropertyControllerApi#createProperty1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLocationPropertyDto**](CreateLocationPropertyDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetLocationPropertyDto**](GetLocationPropertyDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteProperty1"></a>
# **deleteProperty1**
> deleteProperty1(id, acceptLanguage)

deleteProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationPropertyControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteProperty1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LocationPropertyControllerApi#deleteProperty1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationPropertyControllerApi#deleteProperty1")
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

<a name="getPropertiesList1"></a>
# **getPropertiesList1**
> Page_GetLocationPropertyDto_ getPropertiesList1(acceptLanguage, ids, optionIds, pageNumber, pageSize, sort, sortKey)

getPropertiesList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationPropertyControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val ids : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val optionIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetLocationPropertyDto_ = apiInstance.getPropertiesList1(acceptLanguage, ids, optionIds, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationPropertyControllerApi#getPropertiesList1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationPropertyControllerApi#getPropertiesList1")
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProperty1"></a>
# **getProperty1**
> GetLocationPropertyDto getProperty1(id, acceptLanguage)

getProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationPropertyControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetLocationPropertyDto = apiInstance.getProperty1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationPropertyControllerApi#getProperty1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationPropertyControllerApi#getProperty1")
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateProperty1"></a>
# **updateProperty1**
> updateProperty1(id, body, acceptLanguage)

updateProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LocationPropertyControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : CreateLocationPropertyDto =  // CreateLocationPropertyDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateProperty1(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LocationPropertyControllerApi#updateProperty1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationPropertyControllerApi#updateProperty1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**CreateLocationPropertyDto**](CreateLocationPropertyDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

