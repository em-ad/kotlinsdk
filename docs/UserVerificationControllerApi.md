# UserVerificationControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserEmailVerification**](UserVerificationControllerApi.md#createUserEmailVerification) | **POST** /api/v1/user/verification | createUserEmailVerification
[**verifyUserSms**](UserVerificationControllerApi.md#verifyUserSms) | **POST** /api/v1/user/verification/by-sms | verifyUserSms

<a name="createUserEmailVerification"></a>
# **createUserEmailVerification**
> createUserEmailVerification(body, acceptLanguage)

createUserEmailVerification

fill only email field

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserVerificationControllerApi()
val body : UserVerificationDto =  // UserVerificationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.createUserEmailVerification(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserVerificationControllerApi#createUserEmailVerification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserVerificationControllerApi#createUserEmailVerification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserVerificationDto**](UserVerificationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="verifyUserSms"></a>
# **verifyUserSms**
> verifyUserSms(body, acceptLanguage)

verifyUserSms

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserVerificationControllerApi()
val body : VerificationByMobileDto =  // VerificationByMobileDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.verifyUserSms(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserVerificationControllerApi#verifyUserSms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserVerificationControllerApi#verifyUserSms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerificationByMobileDto**](VerificationByMobileDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

