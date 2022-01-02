# IpgTransactionControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIpgTransaction**](IpgTransactionControllerApi.md#createIpgTransaction) | **POST** /api/v1/ipg/transaction | create
[**deleteIpgTransaction**](IpgTransactionControllerApi.md#deleteIpgTransaction) | **DELETE** /api/v1/ipg/transaction/{id} | deleteIpgTransaction
[**getAllIpgTransaction**](IpgTransactionControllerApi.md#getAllIpgTransaction) | **GET** /api/v1/ipg/transaction | getAllIpgTransaction
[**getIpgTransaction**](IpgTransactionControllerApi.md#getIpgTransaction) | **GET** /api/v1/ipg/transaction/{id} | getIpgTransaction
[**updateIpgTransaction**](IpgTransactionControllerApi.md#updateIpgTransaction) | **PUT** /api/v1/ipg/transaction/{id} | update

<a name="createIpgTransaction"></a>
# **createIpgTransaction**
> TransactionDto createIpgTransaction(body, acceptLanguage)

create

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IpgTransactionControllerApi()
val body : TransactionDto =  // TransactionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TransactionDto = apiInstance.createIpgTransaction(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IpgTransactionControllerApi#createIpgTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpgTransactionControllerApi#createIpgTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransactionDto**](TransactionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TransactionDto**](TransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteIpgTransaction"></a>
# **deleteIpgTransaction**
> deleteIpgTransaction(id, acceptLanguage)

deleteIpgTransaction

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IpgTransactionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteIpgTransaction(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling IpgTransactionControllerApi#deleteIpgTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpgTransactionControllerApi#deleteIpgTransaction")
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

<a name="getAllIpgTransaction"></a>
# **getAllIpgTransaction**
> Page_TransactionDto_ getAllIpgTransaction(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllIpgTransaction

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IpgTransactionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_TransactionDto_ = apiInstance.getAllIpgTransaction(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IpgTransactionControllerApi#getAllIpgTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpgTransactionControllerApi#getAllIpgTransaction")
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

[**Page_TransactionDto_**](Page_TransactionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getIpgTransaction"></a>
# **getIpgTransaction**
> TransactionDto getIpgTransaction(id, acceptLanguage)

getIpgTransaction

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IpgTransactionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TransactionDto = apiInstance.getIpgTransaction(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IpgTransactionControllerApi#getIpgTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpgTransactionControllerApi#getIpgTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TransactionDto**](TransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateIpgTransaction"></a>
# **updateIpgTransaction**
> updateIpgTransaction(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IpgTransactionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : TransactionDto =  // TransactionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateIpgTransaction(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling IpgTransactionControllerApi#updateIpgTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IpgTransactionControllerApi#updateIpgTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**TransactionDto**](TransactionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

