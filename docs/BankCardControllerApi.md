# BankCardControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankCard**](BankCardControllerApi.md#createBankCard) | **POST** /api/v1/wallet/bank-card | create
[**deleteBankCard**](BankCardControllerApi.md#deleteBankCard) | **DELETE** /api/v1/wallet/bank-card/{id} | deleteBankCard
[**getAllBankCards**](BankCardControllerApi.md#getAllBankCards) | **GET** /api/v1/wallet/bank-card | getAllBankCards
[**getBankCard**](BankCardControllerApi.md#getBankCard) | **GET** /api/v1/wallet/bank-card/{id} | getBankCard
[**setDefaultCard**](BankCardControllerApi.md#setDefaultCard) | **PUT** /api/v1/wallet/bank-card/select/{card-id} | setDefaultCard
[**updateBankCard**](BankCardControllerApi.md#updateBankCard) | **PUT** /api/v1/wallet/bank-card/{id} | update

<a name="createBankCard"></a>
# **createBankCard**
> BankCardDto createBankCard(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankCardControllerApi()
val body : BankCardDto =  // BankCardDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : BankCardDto = apiInstance.createBankCard(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankCardControllerApi#createBankCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankCardControllerApi#createBankCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BankCardDto**](BankCardDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**BankCardDto**](BankCardDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankCard"></a>
# **deleteBankCard**
> deleteBankCard(id, acceptLanguage)

deleteBankCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankCardControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteBankCard(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling BankCardControllerApi#deleteBankCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankCardControllerApi#deleteBankCard")
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

<a name="getAllBankCards"></a>
# **getAllBankCards**
> kotlin.Array&lt;BankCardDto&gt; getAllBankCards(acceptLanguage)

getAllBankCards

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankCardControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<BankCardDto> = apiInstance.getAllBankCards(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankCardControllerApi#getAllBankCards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankCardControllerApi#getAllBankCards")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;BankCardDto&gt;**](BankCardDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankCard"></a>
# **getBankCard**
> BankCardDto getBankCard(id, acceptLanguage)

getBankCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankCardControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : BankCardDto = apiInstance.getBankCard(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankCardControllerApi#getBankCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankCardControllerApi#getBankCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**BankCardDto**](BankCardDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="setDefaultCard"></a>
# **setDefaultCard**
> setDefaultCard(cardId, acceptLanguage)

setDefaultCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankCardControllerApi()
val cardId : kotlin.String = cardId_example // kotlin.String | card-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.setDefaultCard(cardId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling BankCardControllerApi#setDefaultCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankCardControllerApi#setDefaultCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.String**| card-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateBankCard"></a>
# **updateBankCard**
> updateBankCard(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankCardControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : BankCardDto =  // BankCardDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateBankCard(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling BankCardControllerApi#updateBankCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankCardControllerApi#updateBankCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**BankCardDto**](BankCardDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

