# NotificationApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send**](NotificationApi.md#send) | **POST** /api/v1/datyar/notification | send

<a name="send"></a>
# **send**
> send(body, acceptLanguage)

send

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationApi()
val body : DatyarNotification =  // DatyarNotification | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.send(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationApi#send")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationApi#send")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatyarNotification**](DatyarNotification.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

