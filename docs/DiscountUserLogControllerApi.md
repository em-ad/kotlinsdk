# DiscountUserLogControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDiscountUserLog**](DiscountUserLogControllerApi.md#createDiscountUserLog) | **POST** /api/v1/discount/discount-userlog/{code} | create
[**deleteDiscountUserLog**](DiscountUserLogControllerApi.md#deleteDiscountUserLog) | **DELETE** /api/v1/discount/discount-userlog/{id} | deleteDiscountUserLog
[**getDiscountLogFilter1**](DiscountUserLogControllerApi.md#getDiscountLogFilter1) | **GET** /api/v1/discount/discount-userlog/filter/ | getDiscountLogFilter
[**getDiscountUserLog**](DiscountUserLogControllerApi.md#getDiscountUserLog) | **GET** /api/v1/discount/discount-userlog/{id} | getDiscountUserLog
[**getListDiscountUserLog**](DiscountUserLogControllerApi.md#getListDiscountUserLog) | **GET** /api/v1/discount/discount-userlog | getListDiscountUserLog
[**getUsageReport1**](DiscountUserLogControllerApi.md#getUsageReport1) | **GET** /api/v1/discount/discount-userlog/report/usage | getUsageReport
[**getValidationUser**](DiscountUserLogControllerApi.md#getValidationUser) | **GET** /api/v1/discount/discount-userlog/valid/{discountCode} | getValidationUser
[**updateDiscountUserLog**](DiscountUserLogControllerApi.md#updateDiscountUserLog) | **PUT** /api/v1/discount/discount-userlog/{id} | Update
[**validateCodeWithAmount**](DiscountUserLogControllerApi.md#validateCodeWithAmount) | **POST** /api/v1/discount/discount-userlog/validate | validateCodeWithAmount
[**validateDiscountByCodeAndAmount1**](DiscountUserLogControllerApi.md#validateDiscountByCodeAndAmount1) | **GET** /api/v1/discount/discount-userlog/validate/{code}/{amount} | validateDiscountByCodeAndAmount

<a name="createDiscountUserLog"></a>
# **createDiscountUserLog**
> DiscountUserLogDtoRes createDiscountUserLog(code, acceptLanguage)

create

 create discount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val code : kotlin.String = code_example // kotlin.String | code
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountUserLogDtoRes = apiInstance.createDiscountUserLog(code, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#createDiscountUserLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#createDiscountUserLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| code |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountUserLogDtoRes**](DiscountUserLogDtoRes.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteDiscountUserLog"></a>
# **deleteDiscountUserLog**
> deleteDiscountUserLog(id, acceptLanguage)

deleteDiscountUserLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteDiscountUserLog(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#deleteDiscountUserLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#deleteDiscountUserLog")
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

<a name="getDiscountLogFilter1"></a>
# **getDiscountLogFilter1**
> Page_DiscountUserLogDto_ getDiscountLogFilter1(acceptLanguage, discountCode, from, pageNumber, pageSize, sort, sortKey, to, usersId)

getDiscountLogFilter

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val discountCode : kotlin.String = discountCode_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val to : kotlin.Long = 789 // kotlin.Long | 
val usersId : kotlin.String = usersId_example // kotlin.String | 
try {
    val result : Page_DiscountUserLogDto_ = apiInstance.getDiscountLogFilter1(acceptLanguage, discountCode, from, pageNumber, pageSize, sort, sortKey, to, usersId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#getDiscountLogFilter1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#getDiscountLogFilter1")
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
 **to** | **kotlin.Long**|  | [optional]
 **usersId** | **kotlin.String**|  | [optional]

### Return type

[**Page_DiscountUserLogDto_**](Page_DiscountUserLogDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDiscountUserLog"></a>
# **getDiscountUserLog**
> DiscountUserLogDtoRes getDiscountUserLog(id, acceptLanguage)

getDiscountUserLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountUserLogDtoRes = apiInstance.getDiscountUserLog(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#getDiscountUserLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#getDiscountUserLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountUserLogDtoRes**](DiscountUserLogDtoRes.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getListDiscountUserLog"></a>
# **getListDiscountUserLog**
> Page_DiscountUserLogDto_ getListDiscountUserLog(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getListDiscountUserLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_DiscountUserLogDto_ = apiInstance.getListDiscountUserLog(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#getListDiscountUserLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#getListDiscountUserLog")
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

[**Page_DiscountUserLogDto_**](Page_DiscountUserLogDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsageReport1"></a>
# **getUsageReport1**
> UsageReportDto getUsageReport1(acceptLanguage, discountCode, from, to)

getUsageReport

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val discountCode : kotlin.String = discountCode_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val to : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : UsageReportDto = apiInstance.getUsageReport1(acceptLanguage, discountCode, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#getUsageReport1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#getUsageReport1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **discountCode** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **to** | **kotlin.Long**|  | [optional]

### Return type

[**UsageReportDto**](UsageReportDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getValidationUser"></a>
# **getValidationUser**
> DiscountUserLogValidModel getValidationUser(discountCode, acceptLanguage)

getValidationUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val discountCode : kotlin.String = discountCode_example // kotlin.String | discountCode
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountUserLogValidModel = apiInstance.getValidationUser(discountCode, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#getValidationUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#getValidationUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discountCode** | **kotlin.String**| discountCode |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountUserLogValidModel**](DiscountUserLogValidModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDiscountUserLog"></a>
# **updateDiscountUserLog**
> updateDiscountUserLog(id, body, acceptLanguage)

Update

 update discount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : DiscountUserLogDtoReq =  // DiscountUserLogDtoReq | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateDiscountUserLog(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#updateDiscountUserLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#updateDiscountUserLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**DiscountUserLogDtoReq**](DiscountUserLogDtoReq.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="validateCodeWithAmount"></a>
# **validateCodeWithAmount**
> ValidateDiscountAmountDto validateCodeWithAmount(body, acceptLanguage)

validateCodeWithAmount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val body : DiscountValidationDto =  // DiscountValidationDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ValidateDiscountAmountDto = apiInstance.validateCodeWithAmount(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#validateCodeWithAmount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#validateCodeWithAmount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DiscountValidationDto**](DiscountValidationDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ValidateDiscountAmountDto**](ValidateDiscountAmountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="validateDiscountByCodeAndAmount1"></a>
# **validateDiscountByCodeAndAmount1**
> ValidateDiscountAmountDto validateDiscountByCodeAndAmount1(code, amount, acceptLanguage)

validateDiscountByCodeAndAmount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountUserLogControllerApi()
val code : kotlin.String = code_example // kotlin.String | code
val amount : kotlin.Double = 1.2 // kotlin.Double | amount
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ValidateDiscountAmountDto = apiInstance.validateDiscountByCodeAndAmount1(code, amount, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountUserLogControllerApi#validateDiscountByCodeAndAmount1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountUserLogControllerApi#validateDiscountByCodeAndAmount1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| code |
 **amount** | **kotlin.Double**| amount |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ValidateDiscountAmountDto**](ValidateDiscountAmountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

