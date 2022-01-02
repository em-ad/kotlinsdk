# PostActivationOtpControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmailOtp**](PostActivationOtpControllerApi.md#sendEmailOtp) | **POST** /api/v1/user/verification/send-email-otp | sendEmailOtp
[**sendMobileOtp**](PostActivationOtpControllerApi.md#sendMobileOtp) | **POST** /api/v1/user/verification/send-mobile-otp | sendMobileOtp
[**verifyEmail**](PostActivationOtpControllerApi.md#verifyEmail) | **POST** /api/v1/user/verification/verify-email-otp/{code} | verifyEmail
[**verifyMobile**](PostActivationOtpControllerApi.md#verifyMobile) | **POST** /api/v1/user/verification/verify-mobile-otp/{code} | verifyMobile

<a name="sendEmailOtp"></a>
# **sendEmailOtp**
> sendEmailOtp(body, acceptLanguage)

sendEmailOtp

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PostActivationOtpControllerApi()
val body : RequestEmailOtpDto =  // RequestEmailOtpDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendEmailOtp(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PostActivationOtpControllerApi#sendEmailOtp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostActivationOtpControllerApi#sendEmailOtp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestEmailOtpDto**](RequestEmailOtpDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendMobileOtp"></a>
# **sendMobileOtp**
> sendMobileOtp(body, acceptLanguage)

sendMobileOtp

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PostActivationOtpControllerApi()
val body : RequestMobileOtpDto =  // RequestMobileOtpDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.sendMobileOtp(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PostActivationOtpControllerApi#sendMobileOtp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostActivationOtpControllerApi#sendMobileOtp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestMobileOtpDto**](RequestMobileOtpDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="verifyEmail"></a>
# **verifyEmail**
> verifyEmail(code, acceptLanguage)

verifyEmail

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PostActivationOtpControllerApi()
val code : kotlin.Int = 56 // kotlin.Int | code
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.verifyEmail(code, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PostActivationOtpControllerApi#verifyEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostActivationOtpControllerApi#verifyEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.Int**| code |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="verifyMobile"></a>
# **verifyMobile**
> verifyMobile(code, acceptLanguage)

verifyMobile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PostActivationOtpControllerApi()
val code : kotlin.Int = 56 // kotlin.Int | code
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.verifyMobile(code, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PostActivationOtpControllerApi#verifyMobile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostActivationOtpControllerApi#verifyMobile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.Int**| code |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

