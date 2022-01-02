# TopLawyerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTopLawyers**](TopLawyerApi.md#getTopLawyers) | **GET** /public/api/v1/datyar/lawyers/top-lawyer | getTopLawyers

<a name="getTopLawyers"></a>
# **getTopLawyers**
> kotlin.Array&lt;TopLawyerOutputDto&gt; getTopLawyers(acceptLanguage, categoryId, consultingType, pageNumber, pageSize, province, sort, sortKey)

getTopLawyers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = TopLawyerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val consultingType : kotlin.String = consultingType_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val province : kotlin.String = province_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<TopLawyerOutputDto> = apiInstance.getTopLawyers(acceptLanguage, categoryId, consultingType, pageNumber, pageSize, province, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TopLawyerApi#getTopLawyers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TopLawyerApi#getTopLawyers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **categoryId** | **kotlin.String**|  | [optional]
 **consultingType** | **kotlin.String**|  | [optional] [enum: OFFLINE, ONLINE, URGENT]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **province** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;TopLawyerOutputDto&gt;**](TopLawyerOutputDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

