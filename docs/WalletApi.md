# WalletApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkTransaction**](WalletApi.md#checkTransaction) | **GET** /api/v1/datyar/wallet/check/transaction | checkTransaction
[**checkoutChangeStateUsingPATCH1**](WalletApi.md#checkoutChangeStateUsingPATCH1) | **PATCH** /api/v1/datyar/wallet/checkout/change-state | checkoutChangeState
[**checkoutRequest**](WalletApi.md#checkoutRequest) | **POST** /api/v1/datyar/wallet/checkout/request | checkoutRequest
[**doUserTransaction**](WalletApi.md#doUserTransaction) | **POST** /api/v1/datyar/wallet/do-transaction | doUserTransaction
[**getAllCheckout**](WalletApi.md#getAllCheckout) | **GET** /api/v1/datyar/wallet/checkout | getAllCheckout
[**getAllTransactions**](WalletApi.md#getAllTransactions) | **GET** /api/v1/datyar/wallet/transaction | getAllTransactions
[**getInvoiceInformation**](WalletApi.md#getInvoiceInformation) | **GET** /api/v1/datyar/wallet/invoice | getInvoiceInformation
[**getUserCheckout**](WalletApi.md#getUserCheckout) | **GET** /api/v1/datyar/wallet/user/checkout | getUserCheckout
[**transferBalance**](WalletApi.md#transferBalance) | **POST** /api/v1/datyar/wallet/transfer-balance | transferBalance

<a name="checkTransaction"></a>
# **checkTransaction**
> TransactionResultDto checkTransaction(sessionId, acceptLanguage)

checkTransaction

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : TransactionResultDto = apiInstance.checkTransaction(sessionId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#checkTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#checkTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**|  |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**TransactionResultDto**](TransactionResultDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="checkoutChangeStateUsingPATCH1"></a>
# **checkoutChangeStateUsingPATCH1**
> checkoutChangeStateUsingPATCH1(body, acceptLanguage)

checkoutChangeState

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val body : CheckoutInputDto =  // CheckoutInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.checkoutChangeStateUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#checkoutChangeStateUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#checkoutChangeStateUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckoutInputDto**](CheckoutInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="checkoutRequest"></a>
# **checkoutRequest**
> checkoutRequest(acceptLanguage)

checkoutRequest

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.checkoutRequest(acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#checkoutRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#checkoutRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="doUserTransaction"></a>
# **doUserTransaction**
> doUserTransaction(body, acceptLanguage)

doUserTransaction

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val body : DoTransactionDto =  // DoTransactionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.doUserTransaction(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#doUserTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#doUserTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DoTransactionDto**](DoTransactionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllCheckout"></a>
# **getAllCheckout**
> Page_CheckoutOutputDto_ getAllCheckout(acceptLanguage, clientEmail, clientFirstName, clientFullName, clientLastName, clientMobileNumber, pageNumber, pageSize, sort, sortKey, state)

getAllCheckout

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val clientEmail : kotlin.String = clientEmail_example // kotlin.String | 
val clientFirstName : kotlin.String = clientFirstName_example // kotlin.String | 
val clientFullName : kotlin.String = clientFullName_example // kotlin.String | 
val clientLastName : kotlin.String = clientLastName_example // kotlin.String | 
val clientMobileNumber : kotlin.String = clientMobileNumber_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val state : kotlin.String = state_example // kotlin.String | 
try {
    val result : Page_CheckoutOutputDto_ = apiInstance.getAllCheckout(acceptLanguage, clientEmail, clientFirstName, clientFullName, clientLastName, clientMobileNumber, pageNumber, pageSize, sort, sortKey, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getAllCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getAllCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **clientEmail** | **kotlin.String**|  | [optional]
 **clientFirstName** | **kotlin.String**|  | [optional]
 **clientFullName** | **kotlin.String**|  | [optional]
 **clientLastName** | **kotlin.String**|  | [optional]
 **clientMobileNumber** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **state** | **kotlin.String**|  | [optional] [enum: CONFIRMED, FAILED, REQUESTED]

### Return type

[**Page_CheckoutOutputDto_**](Page_CheckoutOutputDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllTransactions"></a>
# **getAllTransactions**
> Page_DatyarWalletTransactionDto_ getAllTransactions(acceptLanguage, createdDateFrom, createdDateFromMilli, createdDateTo, createdDateToMilli, pageNumber, pageSize, sort, sortKey, state, subscriberId, userId)

getAllTransactions

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val createdDateFrom : kotlin.String = createdDateFrom_example // kotlin.String | 
val createdDateFromMilli : kotlin.Long = 789 // kotlin.Long | 
val createdDateTo : kotlin.String = createdDateTo_example // kotlin.String | 
val createdDateToMilli : kotlin.Long = 789 // kotlin.Long | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words (use createdDate instead of createdDateMilli)
val state : kotlin.String = state_example // kotlin.String | 
val subscriberId : kotlin.String = subscriberId_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : Page_DatyarWalletTransactionDto_ = apiInstance.getAllTransactions(acceptLanguage, createdDateFrom, createdDateFromMilli, createdDateTo, createdDateToMilli, pageNumber, pageSize, sort, sortKey, state, subscriberId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getAllTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getAllTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **createdDateFrom** | **kotlin.String**|  | [optional]
 **createdDateFromMilli** | **kotlin.Long**|  | [optional]
 **createdDateTo** | **kotlin.String**|  | [optional]
 **createdDateToMilli** | **kotlin.Long**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words (use createdDate instead of createdDateMilli) | [optional]
 **state** | **kotlin.String**|  | [optional] [enum: DONE, WAITING_FOR_IPG_RESPONSE]
 **subscriberId** | **kotlin.String**|  | [optional]
 **userId** | **kotlin.String**|  | [optional]

### Return type

[**Page_DatyarWalletTransactionDto_**](Page_DatyarWalletTransactionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceInformation"></a>
# **getInvoiceInformation**
> GetInvoiceInformationDto getInvoiceInformation(sessionId, acceptLanguage, discountCode)

getInvoiceInformation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val discountCode : kotlin.String = discountCode_example // kotlin.String | 
try {
    val result : GetInvoiceInformationDto = apiInstance.getInvoiceInformation(sessionId, acceptLanguage, discountCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getInvoiceInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getInvoiceInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**|  |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **discountCode** | **kotlin.String**|  | [optional]

### Return type

[**GetInvoiceInformationDto**](GetInvoiceInformationDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserCheckout"></a>
# **getUserCheckout**
> CheckoutOutputDto getUserCheckout(acceptLanguage)

getUserCheckout

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : CheckoutOutputDto = apiInstance.getUserCheckout(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getUserCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getUserCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**CheckoutOutputDto**](CheckoutOutputDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="transferBalance"></a>
# **transferBalance**
> transferBalance(body, acceptLanguage)

transferBalance

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletApi()
val body : TransferBalanceDto =  // TransferBalanceDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.transferBalance(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#transferBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#transferBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferBalanceDto**](TransferBalanceDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

