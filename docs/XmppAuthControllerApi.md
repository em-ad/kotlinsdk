# XmppAuthControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeSession**](XmppAuthControllerApi.md#closeSession) | **POST** /api/v1/datyar/xmpp/auth/close/{jid} | closeSession
[**generate**](XmppAuthControllerApi.md#generate) | **GET** /api/v1/datyar/xmpp/auth/generate/{sid} | generate
[**get17**](XmppAuthControllerApi.md#get17) | **GET** /api/v1/datyar/xmpp/auth/get | get

<a name="closeSession"></a>
# **closeSession**
> closeSession(jid, acceptLanguage)

closeSession

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = XmppAuthControllerApi()
val jid : kotlin.String = jid_example // kotlin.String | jid
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.closeSession(jid, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling XmppAuthControllerApi#closeSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling XmppAuthControllerApi#closeSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jid** | **kotlin.String**| jid |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="generate"></a>
# **generate**
> AuthResponse generate(sid, acceptLanguage)

generate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = XmppAuthControllerApi()
val sid : kotlin.String = sid_example // kotlin.String | sid
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : AuthResponse = apiInstance.generate(sid, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling XmppAuthControllerApi#generate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling XmppAuthControllerApi#generate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sid** | **kotlin.String**| sid |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get17"></a>
# **get17**
> AuthInfo get17(acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = XmppAuthControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : AuthInfo = apiInstance.get17(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling XmppAuthControllerApi#get17")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling XmppAuthControllerApi#get17")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**AuthInfo**](AuthInfo.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

