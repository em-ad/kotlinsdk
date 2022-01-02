# PasswordControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forget**](PasswordControllerApi.md#forget) | **POST** /client/v1/password/forget | forget
[**reset**](PasswordControllerApi.md#reset) | **POST** /client/v1/password/reset | reset

<a name="forget"></a>
# **forget**
> GenericResponseDto_object_ forget(body, acceptLanguage)

forget

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PasswordControllerApi()
val body : ForgetPasswordInputDto =  // ForgetPasswordInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GenericResponseDto_object_ = apiInstance.forget(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PasswordControllerApi#forget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PasswordControllerApi#forget")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ForgetPasswordInputDto**](ForgetPasswordInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GenericResponseDto_object_**](GenericResponseDto_object_.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="reset"></a>
# **reset**
> GenericResponseDto_object_ reset(body, acceptLanguage)

reset

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PasswordControllerApi()
val body : ResetPasswordInputDto =  // ResetPasswordInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GenericResponseDto_object_ = apiInstance.reset(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PasswordControllerApi#reset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PasswordControllerApi#reset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetPasswordInputDto**](ResetPasswordInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GenericResponseDto_object_**](GenericResponseDto_object_.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

