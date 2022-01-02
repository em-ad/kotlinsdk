# DiscountSubscriberLogControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDiscountSubscriberLog**](DiscountSubscriberLogControllerApi.md#createDiscountSubscriberLog) | **POST** /api/v1/discount/discount-subscriberlog/{code} | create
[**deleteDiscountSubscriberLog**](DiscountSubscriberLogControllerApi.md#deleteDiscountSubscriberLog) | **DELETE** /api/v1/discount/discount-subscriberlog/{id} | deleteDiscountSubscriberLog
[**getDiscountLogFilter**](DiscountSubscriberLogControllerApi.md#getDiscountLogFilter) | **GET** /api/v1/discount/discount-subscriberlog/filter/ | getDiscountLogFilter
[**getDiscountSubscriberLog**](DiscountSubscriberLogControllerApi.md#getDiscountSubscriberLog) | **GET** /api/v1/discount/discount-subscriberlog/{id} | getDiscountSubscriberLog
[**getListDiscountSubscriberLog**](DiscountSubscriberLogControllerApi.md#getListDiscountSubscriberLog) | **GET** /api/v1/discount/discount-subscriberlog | getListDiscountSubscriberLog
[**getUsageReport**](DiscountSubscriberLogControllerApi.md#getUsageReport) | **GET** /api/v1/discount/discount-subscriberlog/report/usage | getUsageReport
[**getValidationSubscriber**](DiscountSubscriberLogControllerApi.md#getValidationSubscriber) | **GET** /api/v1/discount/discount-subscriberlog/valid/{discountCode} | getValidationSubscriber
[**updateDiscountSubscriberLog**](DiscountSubscriberLogControllerApi.md#updateDiscountSubscriberLog) | **PUT** /api/v1/discount/discount-subscriberlog/{id} | Update
[**validateDiscountByCodeAndAmount**](DiscountSubscriberLogControllerApi.md#validateDiscountByCodeAndAmount) | **GET** /api/v1/discount/discount-subscriberlog/validate/{code}/{amount} | validateDiscountByCodeAndAmount

<a name="createDiscountSubscriberLog"></a>
# **createDiscountSubscriberLog**
> DiscountSubscriberLogDtoRes createDiscountSubscriberLog(code, acceptLanguage)

create

 create discount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val code : kotlin.String = code_example // kotlin.String | code
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountSubscriberLogDtoRes = apiInstance.createDiscountSubscriberLog(code, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#createDiscountSubscriberLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#createDiscountSubscriberLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| code |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountSubscriberLogDtoRes**](DiscountSubscriberLogDtoRes.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteDiscountSubscriberLog"></a>
# **deleteDiscountSubscriberLog**
> deleteDiscountSubscriberLog(id, acceptLanguage)

deleteDiscountSubscriberLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteDiscountSubscriberLog(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#deleteDiscountSubscriberLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#deleteDiscountSubscriberLog")
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

<a name="getDiscountLogFilter"></a>
# **getDiscountLogFilter**
> Page_DiscountSubscriberLogDto_ getDiscountLogFilter(acceptLanguage, discountCode, from, pageNumber, pageSize, sort, sortKey, subscribersId, to)

getDiscountLogFilter

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val discountCode : kotlin.String = discountCode_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val subscribersId : kotlin.String = subscribersId_example // kotlin.String | 
val to : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Page_DiscountSubscriberLogDto_ = apiInstance.getDiscountLogFilter(acceptLanguage, discountCode, from, pageNumber, pageSize, sort, sortKey, subscribersId, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#getDiscountLogFilter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#getDiscountLogFilter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **discountCode** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **subscribersId** | **kotlin.String**|  | [optional]
 **to** | **kotlin.Long**|  | [optional]

### Return type

[**Page_DiscountSubscriberLogDto_**](Page_DiscountSubscriberLogDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDiscountSubscriberLog"></a>
# **getDiscountSubscriberLog**
> DiscountSubscriberLogDtoRes getDiscountSubscriberLog(id, acceptLanguage)

getDiscountSubscriberLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountSubscriberLogDtoRes = apiInstance.getDiscountSubscriberLog(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#getDiscountSubscriberLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#getDiscountSubscriberLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountSubscriberLogDtoRes**](DiscountSubscriberLogDtoRes.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getListDiscountSubscriberLog"></a>
# **getListDiscountSubscriberLog**
> Page_DiscountSubscriberLogDto_ getListDiscountSubscriberLog(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getListDiscountSubscriberLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_DiscountSubscriberLogDto_ = apiInstance.getListDiscountSubscriberLog(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#getListDiscountSubscriberLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#getListDiscountSubscriberLog")
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

[**Page_DiscountSubscriberLogDto_**](Page_DiscountSubscriberLogDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsageReport"></a>
# **getUsageReport**
> UsageReportDto getUsageReport(discountCode, acceptLanguage, from, to)

getUsageReport

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val discountCode : kotlin.String = discountCode_example // kotlin.String | code
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val from : kotlin.Long = 789 // kotlin.Long | Start
val to : kotlin.Long = 789 // kotlin.Long | End
try {
    val result : UsageReportDto = apiInstance.getUsageReport(discountCode, acceptLanguage, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#getUsageReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#getUsageReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discountCode** | **kotlin.String**| code |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **from** | **kotlin.Long**| Start | [optional]
 **to** | **kotlin.Long**| End | [optional]

### Return type

[**UsageReportDto**](UsageReportDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getValidationSubscriber"></a>
# **getValidationSubscriber**
> DiscountSubscriberLogValidModel getValidationSubscriber(discountCode, acceptLanguage)

getValidationSubscriber

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val discountCode : kotlin.String = discountCode_example // kotlin.String | discountCode
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountSubscriberLogValidModel = apiInstance.getValidationSubscriber(discountCode, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#getValidationSubscriber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#getValidationSubscriber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discountCode** | **kotlin.String**| discountCode |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountSubscriberLogValidModel**](DiscountSubscriberLogValidModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDiscountSubscriberLog"></a>
# **updateDiscountSubscriberLog**
> updateDiscountSubscriberLog(id, body, acceptLanguage)

Update

 update discount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : DiscountSubscriberLogDtoReq =  // DiscountSubscriberLogDtoReq | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateDiscountSubscriberLog(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#updateDiscountSubscriberLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#updateDiscountSubscriberLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**DiscountSubscriberLogDtoReq**](DiscountSubscriberLogDtoReq.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="validateDiscountByCodeAndAmount"></a>
# **validateDiscountByCodeAndAmount**
> ValidateDiscountAmountDto validateDiscountByCodeAndAmount(code, amount, acceptLanguage)

validateDiscountByCodeAndAmount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountSubscriberLogControllerApi()
val code : kotlin.String = code_example // kotlin.String | code
val amount : kotlin.Int = 56 // kotlin.Int | amount
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ValidateDiscountAmountDto = apiInstance.validateDiscountByCodeAndAmount(code, amount, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountSubscriberLogControllerApi#validateDiscountByCodeAndAmount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountSubscriberLogControllerApi#validateDiscountByCodeAndAmount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| code |
 **amount** | **kotlin.Int**| amount |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ValidateDiscountAmountDto**](ValidateDiscountAmountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

