# ChargeCodeControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChargeCode**](ChargeCodeControllerApi.md#createChargeCode) | **POST** /api/v1/discount/charge-code | createChargeCode
[**deleteChargeCode**](ChargeCodeControllerApi.md#deleteChargeCode) | **DELETE** /api/v1/discount/charge-code/{id} | deleteChargeCode
[**doUserTransactionWithChargeCode**](ChargeCodeControllerApi.md#doUserTransactionWithChargeCode) | **POST** /api/v1/discount/charge-code/transaction/{chargeCode} | doUserTransactionWithChargeCode
[**getLisCharge**](ChargeCodeControllerApi.md#getLisCharge) | **GET** /api/v1/discount/charge-code | getLisCharge
[**updateChargeCodeUsingPATCH1**](ChargeCodeControllerApi.md#updateChargeCodeUsingPATCH1) | **PATCH** /api/v1/discount/charge-code/{id} | updateChargeCode

<a name="createChargeCode"></a>
# **createChargeCode**
> DiscountDto createChargeCode(body, acceptLanguage)

createChargeCode

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ChargeCodeControllerApi()
val body : ChargeDto =  // ChargeDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountDto = apiInstance.createChargeCode(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargeCodeControllerApi#createChargeCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargeCodeControllerApi#createChargeCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChargeDto**](ChargeDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountDto**](DiscountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteChargeCode"></a>
# **deleteChargeCode**
> deleteChargeCode(id, acceptLanguage)

deleteChargeCode

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ChargeCodeControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteChargeCode(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ChargeCodeControllerApi#deleteChargeCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargeCodeControllerApi#deleteChargeCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="doUserTransactionWithChargeCode"></a>
# **doUserTransactionWithChargeCode**
> WalletTransactionDto doUserTransactionWithChargeCode(chargeCode, acceptLanguage)

doUserTransactionWithChargeCode

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ChargeCodeControllerApi()
val chargeCode : kotlin.String = chargeCode_example // kotlin.String | chargeCode
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : WalletTransactionDto = apiInstance.doUserTransactionWithChargeCode(chargeCode, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargeCodeControllerApi#doUserTransactionWithChargeCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargeCodeControllerApi#doUserTransactionWithChargeCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeCode** | **kotlin.String**| chargeCode |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**WalletTransactionDto**](WalletTransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLisCharge"></a>
# **getLisCharge**
> Page_DiscountDto_ getLisCharge(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getLisCharge

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ChargeCodeControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : Page_DiscountDto_ = apiInstance.getLisCharge(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargeCodeControllerApi#getLisCharge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargeCodeControllerApi#getLisCharge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**Page_DiscountDto_**](Page_DiscountDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateChargeCodeUsingPATCH1"></a>
# **updateChargeCodeUsingPATCH1**
> updateChargeCodeUsingPATCH1(id, body, acceptLanguage)

updateChargeCode

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ChargeCodeControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : UpdateChargeDto =  // UpdateChargeDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateChargeCodeUsingPATCH1(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ChargeCodeControllerApi#updateChargeCodeUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargeCodeControllerApi#updateChargeCodeUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**UpdateChargeDto**](UpdateChargeDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

