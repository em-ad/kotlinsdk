# DiscountControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeState**](DiscountControllerApi.md#changeState) | **PUT** /api/v1/discount/discounts/state/{id} | state
[**createDiscount**](DiscountControllerApi.md#createDiscount) | **POST** /api/v1/discount/discounts | create
[**deleteDiscount**](DiscountControllerApi.md#deleteDiscount) | **DELETE** /api/v1/discount/discounts/{id} | deleteDiscount
[**getDiscount**](DiscountControllerApi.md#getDiscount) | **GET** /api/v1/discount/discounts/{id} | getDiscount
[**getListDiscount**](DiscountControllerApi.md#getListDiscount) | **GET** /api/v1/discount/discounts | getListDiscount
[**getReport**](DiscountControllerApi.md#getReport) | **GET** /api/v1/discount/discounts/report | getReport
[**updateDiscount**](DiscountControllerApi.md#updateDiscount) | **PUT** /api/v1/discount/discounts/{id} | Update

<a name="changeState"></a>
# **changeState**
> changeState(id, body, acceptLanguage)

state

change status

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : kotlin.String =  // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.changeState(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling DiscountControllerApi#changeState")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountControllerApi#changeState")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**kotlin.String**](kotlin.String.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createDiscount"></a>
# **createDiscount**
> DiscountDto createDiscount(body, acceptLanguage)

create

 create discount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountControllerApi()
val body : DiscountDto =  // DiscountDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountDto = apiInstance.createDiscount(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountControllerApi#createDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountControllerApi#createDiscount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DiscountDto**](DiscountDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountDto**](DiscountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDiscount"></a>
# **deleteDiscount**
> deleteDiscount(id, acceptLanguage)

deleteDiscount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteDiscount(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling DiscountControllerApi#deleteDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountControllerApi#deleteDiscount")
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

<a name="getDiscount"></a>
# **getDiscount**
> DiscountDto getDiscount(id, acceptLanguage)

getDiscount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DiscountDto = apiInstance.getDiscount(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountControllerApi#getDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountControllerApi#getDiscount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DiscountDto**](DiscountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getListDiscount"></a>
# **getListDiscount**
> Page_DiscountDto_ getListDiscount(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getListDiscount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_DiscountDto_ = apiInstance.getListDiscount(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountControllerApi#getListDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountControllerApi#getListDiscount")
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

[**Page_DiscountDto_**](Page_DiscountDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getReport"></a>
# **getReport**
> AllocatedDiscountDto getReport(discountCode, acceptLanguage)

getReport

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountControllerApi()
val discountCode : kotlin.String = discountCode_example // kotlin.String | code
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : AllocatedDiscountDto = apiInstance.getReport(discountCode, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountControllerApi#getReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountControllerApi#getReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discountCode** | **kotlin.String**| code |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**AllocatedDiscountDto**](AllocatedDiscountDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDiscount"></a>
# **updateDiscount**
> updateDiscount(id, body, acceptLanguage)

Update

 update discount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DiscountControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : DiscountDto =  // DiscountDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateDiscount(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling DiscountControllerApi#updateDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountControllerApi#updateDiscount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**DiscountDto**](DiscountDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

