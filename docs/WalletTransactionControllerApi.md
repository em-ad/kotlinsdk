# WalletTransactionControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doSubscriberTransaction**](WalletTransactionControllerApi.md#doSubscriberTransaction) | **POST** /api/v1/wallet/subscriber/transaction | doSubscriberTransaction
[**doTransaction**](WalletTransactionControllerApi.md#doTransaction) | **POST** /api/v1/wallet/transaction | doTransaction
[**doUserTransaction1**](WalletTransactionControllerApi.md#doUserTransaction1) | **POST** /api/v1/wallet/user/transaction | doUserTransaction
[**getAllSubscriberTransactions**](WalletTransactionControllerApi.md#getAllSubscriberTransactions) | **GET** /api/v1/wallet/subscriber/transaction | getAllSubscriberTransactions
[**getAllTransactions1**](WalletTransactionControllerApi.md#getAllTransactions1) | **GET** /api/v1/wallet/transaction | getAllTransactions
[**getAllUserTransactions**](WalletTransactionControllerApi.md#getAllUserTransactions) | **GET** /api/v1/wallet/user/transaction | getAllUserTransactions
[**getBalance**](WalletTransactionControllerApi.md#getBalance) | **GET** /api/v1/wallet/balance | getBalance
[**getRelatedRevenueList**](WalletTransactionControllerApi.md#getRelatedRevenueList) | **GET** /api/v1/wallet/related/revenue | getRelatedRevenueList
[**getRelatedSum**](WalletTransactionControllerApi.md#getRelatedSum) | **GET** /api/v1/wallet/related/sum | getRelatedSum
[**getUserWalletTransaction**](WalletTransactionControllerApi.md#getUserWalletTransaction) | **GET** /api/v1/wallet/user/transaction/{id} | getUserWalletTransaction
[**getWalletBalance**](WalletTransactionControllerApi.md#getWalletBalance) | **GET** /api/v1/wallet/getbalance | getWalletBalance
[**getWalletTransaction**](WalletTransactionControllerApi.md#getWalletTransaction) | **GET** /api/v1/wallet/subscriber/transaction/{id} | getWalletTransaction

<a name="doSubscriberTransaction"></a>
# **doSubscriberTransaction**
> WalletTransactionDto doSubscriberTransaction(body, acceptLanguage)

doSubscriberTransaction

don&#x27;t fill id, token, subscriberId, createdDateMilli, paymentLink, 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val body : CreateSubscriberWalletTransactionDto =  // CreateSubscriberWalletTransactionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : WalletTransactionDto = apiInstance.doSubscriberTransaction(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#doSubscriberTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#doSubscriberTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateSubscriberWalletTransactionDto**](CreateSubscriberWalletTransactionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**WalletTransactionDto**](WalletTransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="doTransaction"></a>
# **doTransaction**
> WalletTransactionDto doTransaction(body, acceptLanguage)

doTransaction

don&#x27;t fill id, token,  createdDateMilli, paymentLink, 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val body : WalletTransactionDto =  // WalletTransactionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : WalletTransactionDto = apiInstance.doTransaction(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#doTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#doTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WalletTransactionDto**](WalletTransactionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**WalletTransactionDto**](WalletTransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="doUserTransaction1"></a>
# **doUserTransaction1**
> WalletTransactionDto doUserTransaction1(body, acceptLanguage)

doUserTransaction

don&#x27;t fill id, token, userId, createdDateMilli, paymentLink, 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val body : CreateUserWalletTransactionDto =  // CreateUserWalletTransactionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : WalletTransactionDto = apiInstance.doUserTransaction1(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#doUserTransaction1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#doUserTransaction1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUserWalletTransactionDto**](CreateUserWalletTransactionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**WalletTransactionDto**](WalletTransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllSubscriberTransactions"></a>
# **getAllSubscriberTransactions**
> Page_WalletTransactionDto_ getAllSubscriberTransactions(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllSubscriberTransactions

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words (use createdDate instead of createdDateMilli)
try {
    val result : Page_WalletTransactionDto_ = apiInstance.getAllSubscriberTransactions(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getAllSubscriberTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getAllSubscriberTransactions")
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
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words (use createdDate instead of createdDateMilli) | [optional]

### Return type

[**Page_WalletTransactionDto_**](Page_WalletTransactionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllTransactions1"></a>
# **getAllTransactions1**
> Page_WalletTransactionDto_ getAllTransactions1(acceptLanguage, createdDateFrom, createdDateFromMilli, createdDateTo, createdDateToMilli, pageNumber, pageSize, sort, sortKey, state, subscriberId, userId)

getAllTransactions

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
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
    val result : Page_WalletTransactionDto_ = apiInstance.getAllTransactions1(acceptLanguage, createdDateFrom, createdDateFromMilli, createdDateTo, createdDateToMilli, pageNumber, pageSize, sort, sortKey, state, subscriberId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getAllTransactions1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getAllTransactions1")
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

[**Page_WalletTransactionDto_**](Page_WalletTransactionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUserTransactions"></a>
# **getAllUserTransactions**
> Page_WalletTransactionDto_ getAllUserTransactions(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllUserTransactions

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words (use createdDate instead of createdDateMilli)
try {
    val result : Page_WalletTransactionDto_ = apiInstance.getAllUserTransactions(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getAllUserTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getAllUserTransactions")
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
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words (use createdDate instead of createdDateMilli) | [optional]

### Return type

[**Page_WalletTransactionDto_**](Page_WalletTransactionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBalance"></a>
# **getBalance**
> BalanceResponse getBalance(acceptLanguage)

getBalance

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : BalanceResponse = apiInstance.getBalance(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRelatedRevenueList"></a>
# **getRelatedRevenueList**
> kotlin.Array&lt;RevenueDto&gt; getRelatedRevenueList(relatedIds, acceptLanguage)

getRelatedRevenueList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val relatedIds : kotlin.String = relatedIds_example // kotlin.String | relatedIds
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<RevenueDto> = apiInstance.getRelatedRevenueList(relatedIds, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getRelatedRevenueList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getRelatedRevenueList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relatedIds** | **kotlin.String**| relatedIds |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;RevenueDto&gt;**](RevenueDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRelatedSum"></a>
# **getRelatedSum**
> SumResponse getRelatedSum(relatedIds, acceptLanguage)

getRelatedSum

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val relatedIds : kotlin.String = relatedIds_example // kotlin.String | relatedIds
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SumResponse = apiInstance.getRelatedSum(relatedIds, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getRelatedSum")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getRelatedSum")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relatedIds** | **kotlin.String**| relatedIds |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SumResponse**](SumResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserWalletTransaction"></a>
# **getUserWalletTransaction**
> WalletTransactionDto getUserWalletTransaction(id, acceptLanguage)

getUserWalletTransaction

get transaction details

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : WalletTransactionDto = apiInstance.getUserWalletTransaction(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getUserWalletTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getUserWalletTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**WalletTransactionDto**](WalletTransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWalletBalance"></a>
# **getWalletBalance**
> BalanceResponse getWalletBalance(acceptLanguage)

getWalletBalance

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : BalanceResponse = apiInstance.getWalletBalance(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getWalletBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getWalletBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWalletTransaction"></a>
# **getWalletTransaction**
> WalletTransactionDto getWalletTransaction(id, acceptLanguage)

getWalletTransaction

get transaction details

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WalletTransactionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : WalletTransactionDto = apiInstance.getWalletTransaction(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletTransactionControllerApi#getWalletTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletTransactionControllerApi#getWalletTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**WalletTransactionDto**](WalletTransactionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

