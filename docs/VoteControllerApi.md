# VoteControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downVote**](VoteControllerApi.md#downVote) | **DELETE** /public/v1/votes/{related-id} | downVote
[**upVote**](VoteControllerApi.md#upVote) | **POST** /public/v1/votes/{related-id} | upVote

<a name="downVote"></a>
# **downVote**
> downVote(relatedId, acceptLanguage)

downVote

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = VoteControllerApi()
val relatedId : kotlin.String = relatedId_example // kotlin.String | related-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.downVote(relatedId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling VoteControllerApi#downVote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoteControllerApi#downVote")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="upVote"></a>
# **upVote**
> upVote(relatedId, acceptLanguage)

upVote

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = VoteControllerApi()
val relatedId : kotlin.String = relatedId_example // kotlin.String | related-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.upVote(relatedId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling VoteControllerApi#upVote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoteControllerApi#upVote")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

