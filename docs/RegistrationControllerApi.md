# RegistrationControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateByCode**](RegistrationControllerApi.md#activateByCode) | **POST** /client/v1/user/register/activate | activation
[**activateByLink**](RegistrationControllerApi.md#activateByLink) | **GET** /client/v1/user/register/activate | activation
[**facebookRegisterByToken**](RegistrationControllerApi.md#facebookRegisterByToken) | **POST** /client/v1/user/register/third-party/facebook | facebookRegisterByToken
[**googleRegisterAccomplish**](RegistrationControllerApi.md#googleRegisterAccomplish) | **GET** /client/v1/user/register/third-party/google/accomplish | googleRegisterAccomplish
[**googleRegisterByToken**](RegistrationControllerApi.md#googleRegisterByToken) | **POST** /client/v1/user/register/third-party/google | googleRegisterByToken
[**linkedInRegisterAccomplish**](RegistrationControllerApi.md#linkedInRegisterAccomplish) | **GET** /client/v1/user/register/third-party/linked-in/accomplish | linkedInRegisterAccomplish
[**linkedInRegisterByToken**](RegistrationControllerApi.md#linkedInRegisterByToken) | **POST** /client/v1/user/register/third-party/linked-in | linkedInRegisterByToken
[**redirectToThirdParty**](RegistrationControllerApi.md#redirectToThirdParty) | **GET** /client/v1/user/register/third-party | registrationType
[**register**](RegistrationControllerApi.md#register) | **POST** /client/v1/user/register | register
[**thirdPartyTest**](RegistrationControllerApi.md#thirdPartyTest) | **GET** /client/v1/user/register/third-party/test | thirdPartyTest

<a name="activateByCode"></a>
# **activateByCode**
> ActivationResponseDto activateByCode(body, acceptLanguage)

activation

only one of fields \&quot;mobile\&quot; or \&quot;email\&quot; should be fill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val body : ActivationDto =  // ActivationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ActivationResponseDto = apiInstance.activateByCode(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#activateByCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#activateByCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActivationDto**](ActivationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ActivationResponseDto**](ActivationResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="activateByLink"></a>
# **activateByLink**
> ActivationResponseDto activateByLink(activationCode, registrationType, acceptLanguage, email, mobile, password, tag, username)

activation

only one of fields \&quot;mobile\&quot; or \&quot;email\&quot; should be fill

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val activationCode : kotlin.String = activationCode_example // kotlin.String | 
val registrationType : kotlin.String = registrationType_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val email : kotlin.String = email_example // kotlin.String | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
val tag : kotlin.String = tag_example // kotlin.String | 
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : ActivationResponseDto = apiInstance.activateByLink(activationCode, registrationType, acceptLanguage, email, mobile, password, tag, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#activateByLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#activateByLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activationCode** | **kotlin.String**|  |
 **registrationType** | **kotlin.String**|  | [enum: APPLE_ONE_STEP, APPLE_TWO_STEP, EMAIL_CODE, EMAIL_LINK, EMAIL_OTP, FACEBOOK_ONE_STEP, GOOGLE_ONE_STEP, GOOGLE_TWO_STEP, LINKED_IN_ONE_STEP, LINKED_IN_TWO_STEP, SMS_CODE, SMS_LINK, SMS_OTP]
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **email** | **kotlin.String**|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **password** | **kotlin.String**|  | [optional]
 **tag** | **kotlin.String**|  | [optional]
 **username** | **kotlin.String**|  | [optional]

### Return type

[**ActivationResponseDto**](ActivationResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="facebookRegisterByToken"></a>
# **facebookRegisterByToken**
> UserDto facebookRegisterByToken(acceptLanguage, token)

facebookRegisterByToken

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : UserDto = apiInstance.facebookRegisterByToken(acceptLanguage, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#facebookRegisterByToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#facebookRegisterByToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **token** | **kotlin.String**|  | [optional]

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="googleRegisterAccomplish"></a>
# **googleRegisterAccomplish**
> UserDto googleRegisterAccomplish(acceptLanguage, code, scope, state)

googleRegisterAccomplish

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val code : kotlin.String = code_example // kotlin.String | 
val scope : kotlin.String = scope_example // kotlin.String | 
val state : kotlin.String = state_example // kotlin.String | 
try {
    val result : UserDto = apiInstance.googleRegisterAccomplish(acceptLanguage, code, scope, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#googleRegisterAccomplish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#googleRegisterAccomplish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **code** | **kotlin.String**|  | [optional]
 **scope** | **kotlin.String**|  | [optional]
 **state** | **kotlin.String**|  | [optional]

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="googleRegisterByToken"></a>
# **googleRegisterByToken**
> UserDto googleRegisterByToken(acceptLanguage, token)

googleRegisterByToken

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : UserDto = apiInstance.googleRegisterByToken(acceptLanguage, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#googleRegisterByToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#googleRegisterByToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **token** | **kotlin.String**|  | [optional]

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="linkedInRegisterAccomplish"></a>
# **linkedInRegisterAccomplish**
> linkedInRegisterAccomplish(acceptLanguage, code, scope, state)

linkedInRegisterAccomplish

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val code : kotlin.String = code_example // kotlin.String | 
val scope : kotlin.String = scope_example // kotlin.String | 
val state : kotlin.String = state_example // kotlin.String | 
try {
    apiInstance.linkedInRegisterAccomplish(acceptLanguage, code, scope, state)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#linkedInRegisterAccomplish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#linkedInRegisterAccomplish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **code** | **kotlin.String**|  | [optional]
 **scope** | **kotlin.String**|  | [optional]
 **state** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="linkedInRegisterByToken"></a>
# **linkedInRegisterByToken**
> UserDto linkedInRegisterByToken(acceptLanguage, token)

linkedInRegisterByToken

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : UserDto = apiInstance.linkedInRegisterByToken(acceptLanguage, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#linkedInRegisterByToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#linkedInRegisterByToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **token** | **kotlin.String**|  | [optional]

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="redirectToThirdParty"></a>
# **redirectToThirdParty**
> redirectToThirdParty(acceptLanguage, callbackUrl, deviceId, registrationType)

registrationType

call this by your browser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val callbackUrl : kotlin.String = callbackUrl_example // kotlin.String | 
val deviceId : kotlin.String = deviceId_example // kotlin.String | 
val registrationType : kotlin.String = registrationType_example // kotlin.String | only GOOGLE_TWO_STEP and LINKED_IN allowed
try {
    apiInstance.redirectToThirdParty(acceptLanguage, callbackUrl, deviceId, registrationType)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#redirectToThirdParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#redirectToThirdParty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **callbackUrl** | **kotlin.String**|  | [optional]
 **deviceId** | **kotlin.String**|  | [optional]
 **registrationType** | **kotlin.String**| only GOOGLE_TWO_STEP and LINKED_IN allowed | [optional] [enum: APPLE_ONE_STEP, APPLE_TWO_STEP, EMAIL_CODE, EMAIL_LINK, EMAIL_OTP, FACEBOOK_ONE_STEP, GOOGLE_ONE_STEP, GOOGLE_TWO_STEP, LINKED_IN_ONE_STEP, LINKED_IN_TWO_STEP, SMS_CODE, SMS_LINK, SMS_OTP]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="register"></a>
# **register**
> register(body, acceptLanguage)

register

examples{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_LINK\&quot;} &lt;Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_CODE\&quot;} &lt;/Br&gt;{\&quot;email\&quot;:\&quot;your_email\&quot;,\&quot;registrationType\&quot;:\&quot;EMAIL_OTP\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_LINK\&quot;} &lt;/Br&gt;{\&quot;username\&quot;:\&quot;test_username\&quot;, \&quot;password\&quot;:\&quot;test_pass\&quot;, \&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_CODE\&quot;}  &lt;/Br&gt; {\&quot;mobile\&quot;:\&quot;your_mobile_number\&quot;,\&quot;registrationType\&quot;:\&quot;SMS_OTP\&quot;} &lt;/Br&gt;

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val body : RegisterWithTypeDto =  // RegisterWithTypeDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.register(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#register")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#register")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegisterWithTypeDto**](RegisterWithTypeDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="thirdPartyTest"></a>
# **thirdPartyTest**
> thirdPartyTest(acceptLanguage, queryParams)

thirdPartyTest

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RegistrationControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val queryParams : kotlin.Any =  // kotlin.Any | queryParams
try {
    apiInstance.thirdPartyTest(acceptLanguage, queryParams)
} catch (e: ClientException) {
    println("4xx response calling RegistrationControllerApi#thirdPartyTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegistrationControllerApi#thirdPartyTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **queryParams** | [**kotlin.Any**](.md)| queryParams | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

