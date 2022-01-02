# MgsSubscriberControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMail**](MgsSubscriberControllerApi.md#sendMail) | **POST** /api/v1/mgs/subscriber/mail | send simple email
[**sendSms**](MgsSubscriberControllerApi.md#sendSms) | **POST** /api/v1/mgs/subscriber/sms | send simple sms

<a name="sendMail"></a>
# **sendMail**
> sendMail(body, acceptLanguage)

send simple email

 try example below 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MgsSubscriberControllerApi()
val body : SimpleMailDto =  // SimpleMailDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendMail(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MgsSubscriberControllerApi#sendMail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MgsSubscriberControllerApi#sendMail")
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

<a name="sendSms"></a>
# **sendSms**
> sendSms(body, acceptLanguage)

send simple sms

 try example below 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MgsSubscriberControllerApi()
val body : SimpleSmsDto =  // SimpleSmsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendSms(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MgsSubscriberControllerApi#sendSms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MgsSubscriberControllerApi#sendSms")
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

