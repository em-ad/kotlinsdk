# ContentPropertyControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProperty**](ContentPropertyControllerApi.md#createProperty) | **POST** /api/v1/contents/properties | createProperty
[**deleteProperty**](ContentPropertyControllerApi.md#deleteProperty) | **DELETE** /api/v1/contents/properties/{id} | deleteProperty
[**getPropertiesList**](ContentPropertyControllerApi.md#getPropertiesList) | **GET** /api/v1/contents/properties | getPropertiesList
[**getProperty**](ContentPropertyControllerApi.md#getProperty) | **GET** /api/v1/contents/properties/{id} | getProperty
[**updateProperty**](ContentPropertyControllerApi.md#updateProperty) | **PUT** /api/v1/contents/properties/{id} | updateProperty

<a name="createProperty"></a>
# **createProperty**
> GetContentPropertyDto createProperty(body, acceptLanguage)

createProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentPropertyControllerApi()
val body : CreatePropertyDto =  // CreatePropertyDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetContentPropertyDto = apiInstance.createProperty(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentPropertyControllerApi#createProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentPropertyControllerApi#createProperty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePropertyDto**](CreatePropertyDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetContentPropertyDto**](GetContentPropertyDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(id, acceptLanguage)

deleteProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentPropertyControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteProperty(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ContentPropertyControllerApi#deleteProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentPropertyControllerApi#deleteProperty")
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

<a name="getPropertiesList"></a>
# **getPropertiesList**
> Page_GetContentPropertyDto_ getPropertiesList(pageNumber, pageSize, sort, acceptLanguage, childEmbed, sortKey)

getPropertiesList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentPropertyControllerApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val childEmbed : kotlin.Boolean = true // kotlin.Boolean | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetContentPropertyDto_ = apiInstance.getPropertiesList(pageNumber, pageSize, sort, acceptLanguage, childEmbed, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentPropertyControllerApi#getPropertiesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentPropertyControllerApi#getPropertiesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| starts from 0 |
 **pageSize** | **kotlin.Int**| must be greater than 0 | [enum: ]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [enum: ASC, DESC]
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **childEmbed** | **kotlin.Boolean**|  | [optional]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_GetContentPropertyDto_**](Page_GetContentPropertyDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProperty"></a>
# **getProperty**
> GetContentPropertyDto getProperty(id, acceptLanguage)

getProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentPropertyControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetContentPropertyDto = apiInstance.getProperty(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentPropertyControllerApi#getProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentPropertyControllerApi#getProperty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetContentPropertyDto**](GetContentPropertyDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateProperty"></a>
# **updateProperty**
> updateProperty(id, body, acceptLanguage)

updateProperty

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentPropertyControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : CreatePropertyDto =  // CreatePropertyDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateProperty(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ContentPropertyControllerApi#updateProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentPropertyControllerApi#updateProperty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**CreatePropertyDto**](CreatePropertyDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

