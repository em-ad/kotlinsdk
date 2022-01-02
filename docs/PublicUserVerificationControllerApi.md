# PublicUserVerificationControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyUserEmail**](PublicUserVerificationControllerApi.md#verifyUserEmail) | **GET** /client/v1/user/verification/by-email/{verificationCode} | verifyUserEmail

<a name="verifyUserEmail"></a>
# **verifyUserEmail**
> verifyUserEmail(verificationCode, acceptLanguage)

verifyUserEmail

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicUserVerificationControllerApi()
val verificationCode : kotlin.String = verificationCode_example // kotlin.String | verificationCode
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.verifyUserEmail(verificationCode, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PublicUserVerificationControllerApi#verifyUserEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicUserVerificationControllerApi#verifyUserEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verificationCode** | **kotlin.String**| verificationCode |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

