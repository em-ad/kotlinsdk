# ReferralLogControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscriberLog**](ReferralLogControllerApi.md#createSubscriberLog) | **POST** /api/v1/campaign/referral/subscriberlog | create

<a name="createSubscriberLog"></a>
# **createSubscriberLog**
> createSubscriberLog(body, acceptLanguage)

create

 create SubscriberLog log

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ReferralLogControllerApi()
val body : ReferralLogInDto =  // ReferralLogInDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.createSubscriberLog(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ReferralLogControllerApi#createSubscriberLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferralLogControllerApi#createSubscriberLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReferralLogInDto**](ReferralLogInDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

