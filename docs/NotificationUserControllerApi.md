# NotificationUserControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMail2**](NotificationUserControllerApi.md#sendMail2) | **POST** /api/v1/notification/user/mail | send simple email
[**sendSms2**](NotificationUserControllerApi.md#sendSms2) | **POST** /api/v1/notification/user/sms | send simple sms

<a name="sendMail2"></a>
# **sendMail2**
> sendMail2(body, acceptLanguage)

send simple email

 try example below 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationUserControllerApi()
val body : SimpleMailDto =  // SimpleMailDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendMail2(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationUserControllerApi#sendMail2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationUserControllerApi#sendMail2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SimpleMailDto**](SimpleMailDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendSms2"></a>
# **sendSms2**
> sendSms2(body, acceptLanguage)

send simple sms

 try example below 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationUserControllerApi()
val body : SimpleSmsDto =  // SimpleSmsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendSms2(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling NotificationUserControllerApi#sendSms2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationUserControllerApi#sendSms2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SimpleSmsDto**](SimpleSmsDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

