# CampaignControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignControllerApi.md#createCampaign) | **POST** /api/v1/campaign/campaigns | don’t fill id.create Campaign 
[**deleteCampaign**](CampaignControllerApi.md#deleteCampaign) | **DELETE** /api/v1/campaign/campaigns/{id} | deleteCampaign
[**getCampaign**](CampaignControllerApi.md#getCampaign) | **GET** /api/v1/campaign/campaigns/{id} | getCampaign
[**getListCampaign**](CampaignControllerApi.md#getListCampaign) | **GET** /api/v1/campaign/campaigns | getListCampaign
[**updateCampaign**](CampaignControllerApi.md#updateCampaign) | **PUT** /api/v1/campaign/campaigns/{id} | Update

<a name="createCampaign"></a>
# **createCampaign**
> CampaignOutDto createCampaign(body, acceptLanguage)

don’t fill id.create Campaign 

 create Campaign

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CampaignControllerApi()
val body : CampaignInDto =  // CampaignInDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : CampaignOutDto = apiInstance.createCampaign(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignControllerApi#createCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignControllerApi#createCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignInDto**](CampaignInDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**CampaignOutDto**](CampaignOutDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(id, acceptLanguage)

deleteCampaign

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CampaignControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteCampaign(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling CampaignControllerApi#deleteCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignControllerApi#deleteCampaign")
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

<a name="getCampaign"></a>
# **getCampaign**
> CampaignOutDto getCampaign(id, acceptLanguage)

getCampaign

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CampaignControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : CampaignOutDto = apiInstance.getCampaign(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignControllerApi#getCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignControllerApi#getCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**CampaignOutDto**](CampaignOutDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getListCampaign"></a>
# **getListCampaign**
> Page_CampaignOutDto_ getListCampaign(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getListCampaign

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CampaignControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_CampaignOutDto_ = apiInstance.getListCampaign(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignControllerApi#getListCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignControllerApi#getListCampaign")
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

[**Page_CampaignOutDto_**](Page_CampaignOutDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCampaign"></a>
# **updateCampaign**
> updateCampaign(id, body, acceptLanguage)

Update

 update Campaign

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CampaignControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : CampaignInDto =  // CampaignInDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateCampaign(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling CampaignControllerApi#updateCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignControllerApi#updateCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**CampaignInDto**](CampaignInDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

