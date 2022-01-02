# PublicTransactionControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processPayment**](PublicTransactionControllerApi.md#processPayment) | **GET** /public/v1/transaction/process/{token} | processPayment

<a name="processPayment"></a>
# **processPayment**
> PaymentModel processPayment(token, acceptLanguage)

processPayment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicTransactionControllerApi()
val token : kotlin.String = token_example // kotlin.String | token
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : PaymentModel = apiInstance.processPayment(token, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicTransactionControllerApi#processPayment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicTransactionControllerApi#processPayment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| token |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**PaymentModel**](PaymentModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

