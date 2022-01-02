# WalletAccountControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWalletAccount**](WalletAccountControllerApi.md#getWalletAccount) | **GET** /api/v1/wallet/account | getWalletAccount

<a name="getWalletAccount"></a>
# **getWalletAccount**
> WalletAccountDto getWalletAccount(acceptLanguage)

getWalletAccount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletAccountControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : WalletAccountDto = apiInstance.getWalletAccount(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletAccountControllerApi#getWalletAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletAccountControllerApi#getWalletAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**WalletAccountDto**](WalletAccountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

