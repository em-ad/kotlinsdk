# BankGatewayControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankGateway**](BankGatewayControllerApi.md#createBankGateway) | **POST** /api/v1/ipg/bank-gateway | create
[**delete1**](BankGatewayControllerApi.md#delete1) | **DELETE** /api/v1/ipg/bank-gateway/{id} | delete
[**get1**](BankGatewayControllerApi.md#get1) | **GET** /api/v1/ipg/bank-gateway/{id} | get
[**getAllBankGateway**](BankGatewayControllerApi.md#getAllBankGateway) | **GET** /api/v1/ipg/bank-gateway | getAllBankGateway
[**getAllEnabledBankGateway**](BankGatewayControllerApi.md#getAllEnabledBankGateway) | **GET** /api/v1/ipg/bank-gateway/enabled | getAllEnabledBankGateway
[**updateBankGateway**](BankGatewayControllerApi.md#updateBankGateway) | **PUT** /api/v1/ipg/bank-gateway/{id} | update

<a name="createBankGateway"></a>
# **createBankGateway**
> BankGatewayDto createBankGateway(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankGatewayControllerApi()
val body : BankGatewayDto =  // BankGatewayDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : BankGatewayDto = apiInstance.createBankGateway(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankGatewayControllerApi#createBankGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankGatewayControllerApi#createBankGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BankGatewayDto**](BankGatewayDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**BankGatewayDto**](BankGatewayDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete1"></a>
# **delete1**
> delete1(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankGatewayControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete1(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling BankGatewayControllerApi#delete1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankGatewayControllerApi#delete1")
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

<a name="get1"></a>
# **get1**
> BankGatewayDto get1(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankGatewayControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : BankGatewayDto = apiInstance.get1(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankGatewayControllerApi#get1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankGatewayControllerApi#get1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**BankGatewayDto**](BankGatewayDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllBankGateway"></a>
# **getAllBankGateway**
> Page_BankGatewayDto_ getAllBankGateway(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllBankGateway

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankGatewayControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_BankGatewayDto_ = apiInstance.getAllBankGateway(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankGatewayControllerApi#getAllBankGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankGatewayControllerApi#getAllBankGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_BankGatewayDto_**](Page_BankGatewayDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllEnabledBankGateway"></a>
# **getAllEnabledBankGateway**
> kotlin.Array&lt;BankGatewayDto&gt; getAllEnabledBankGateway(acceptLanguage)

getAllEnabledBankGateway

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankGatewayControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<BankGatewayDto> = apiInstance.getAllEnabledBankGateway(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankGatewayControllerApi#getAllEnabledBankGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankGatewayControllerApi#getAllEnabledBankGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;BankGatewayDto&gt;**](BankGatewayDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankGateway"></a>
# **updateBankGateway**
> updateBankGateway(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BankGatewayControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : BankGatewayDto =  // BankGatewayDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateBankGateway(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling BankGatewayControllerApi#updateBankGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankGatewayControllerApi#updateBankGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**BankGatewayDto**](BankGatewayDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

