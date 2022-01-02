# MgsUserControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMail1**](MgsUserControllerApi.md#sendMail1) | **POST** /api/v1/mgs/user/mail | send simple email
[**sendSms1**](MgsUserControllerApi.md#sendSms1) | **POST** /api/v1/mgs/user/sms | send simple sms

<a name="sendMail1"></a>
# **sendMail1**
> sendMail1(body, acceptLanguage)

send simple email

 try example below 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MgsUserControllerApi()
val body : SimpleMailDto =  // SimpleMailDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendMail1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MgsUserControllerApi#sendMail1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MgsUserControllerApi#sendMail1")
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

<a name="sendSms1"></a>
# **sendSms1**
> sendSms1(body, acceptLanguage)

send simple sms

 try example below 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MgsUserControllerApi()
val body : SimpleSmsDto =  // SimpleSmsDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendSms1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling MgsUserControllerApi#sendSms1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MgsUserControllerApi#sendSms1")
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

