# RegistrationV2ControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register1**](RegistrationV2ControllerApi.md#register1) | **POST** /client/v2/user/register | register

<a name="register1"></a>
# **register1**
> RegisterResponseDto register1(body, acceptLanguage)

register

examples{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_LINK\&quot;} &lt;Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_CODE\&quot;} &lt;/Br&gt;{\&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_OTP\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_LINK\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_CODE\&quot;}  &lt;/Br&gt; {\&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_OTP\&quot;} &lt;/Br&gt;

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationV2ControllerApi()
val body : RegisterWithTypeDto =  // RegisterWithTypeDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : RegisterResponseDto = apiInstance.register1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegistrationV2ControllerApi#register1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationV2ControllerApi#register1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegisterWithTypeDto**](RegisterWithTypeDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**RegisterResponseDto**](RegisterResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

