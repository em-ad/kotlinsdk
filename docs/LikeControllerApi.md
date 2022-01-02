# LikeControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dislike**](LikeControllerApi.md#dislike) | **DELETE** /api/v1/likes/{related-id} | dislike
[**like**](LikeControllerApi.md#like) | **POST** /api/v1/likes/{related-id} | like

<a name="dislike"></a>
# **dislike**
> dislike(relatedId, acceptLanguage)

dislike

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LikeControllerApi()
val relatedId : kotlin.String = relatedId_example // kotlin.String | related-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.dislike(relatedId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LikeControllerApi#dislike")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LikeControllerApi#dislike")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relatedId** | **kotlin.String**| related-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="like"></a>
# **like**
> like(relatedId, acceptLanguage)

like

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = LikeControllerApi()
val relatedId : kotlin.String = relatedId_example // kotlin.String | related-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.like(relatedId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling LikeControllerApi#like")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LikeControllerApi#like")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relatedId** | **kotlin.String**| related-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

