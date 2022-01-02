# TicketRatingApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRate**](TicketRatingApi.md#createRate) | **POST** /api/v1/support/tickets/ratings | createRate
[**getAllRates**](TicketRatingApi.md#getAllRates) | **GET** /api/v1/support/tickets/ratings | getAllRates
[**getOneRate**](TicketRatingApi.md#getOneRate) | **GET** /api/v1/support/tickets/ratings/{id} | getOneRate

<a name="createRate"></a>
# **createRate**
> createRate(body, acceptLanguage)

createRate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketRatingApi()
val body : RateDto =  // RateDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.createRate(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling TicketRatingApi#createRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketRatingApi#createRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateDto**](RateDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllRates"></a>
# **getAllRates**
> Page_RateDto_ getAllRates(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllRates

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketRatingApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_RateDto_ = apiInstance.getAllRates(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketRatingApi#getAllRates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketRatingApi#getAllRates")
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

[**Page_RateDto_**](Page_RateDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOneRate"></a>
# **getOneRate**
> RateDto getOneRate(id, acceptLanguage)

getOneRate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TicketRatingApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : RateDto = apiInstance.getOneRate(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TicketRatingApi#getOneRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TicketRatingApi#getOneRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**RateDto**](RateDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

