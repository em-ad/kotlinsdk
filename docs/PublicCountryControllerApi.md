# PublicCountryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCities2**](PublicCountryControllerApi.md#getCities2) | **GET** /public/api/v1/location/countries/states/cities | getCities
[**getCountries2**](PublicCountryControllerApi.md#getCountries2) | **GET** /public/api/v1/location/countries | getCountries
[**getStates2**](PublicCountryControllerApi.md#getStates2) | **GET** /public/api/v1/location/countries/states | getStates

<a name="getCities2"></a>
# **getCities2**
> kotlin.Array&lt;OneFieldModel&gt; getCities2(country, state, acceptLanguage, q)

getCities

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCountryControllerApi()
val country : kotlin.String = country_example // kotlin.String | country
val state : kotlin.String = state_example // kotlin.String | state
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getCities2(country, state, acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCountryControllerApi#getCities2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCountryControllerApi#getCities2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **kotlin.String**| country |
 **state** | **kotlin.String**| state |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **q** | **kotlin.String**| q | [optional]

### Return type

[**kotlin.Array&lt;OneFieldModel&gt;**](OneFieldModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCountries2"></a>
# **getCountries2**
> kotlin.Array&lt;OneFieldModel&gt; getCountries2(acceptLanguage, q)

getCountries

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCountryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getCountries2(acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCountryControllerApi#getCountries2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCountryControllerApi#getCountries2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **q** | **kotlin.String**| q | [optional]

### Return type

[**kotlin.Array&lt;OneFieldModel&gt;**](OneFieldModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStates2"></a>
# **getStates2**
> kotlin.Array&lt;OneFieldModel&gt; getStates2(country, acceptLanguage, q)

getStates

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCountryControllerApi()
val country : kotlin.String = country_example // kotlin.String | country
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getStates2(country, acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCountryControllerApi#getStates2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCountryControllerApi#getStates2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **kotlin.String**| country |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **q** | **kotlin.String**| q | [optional]

### Return type

[**kotlin.Array&lt;OneFieldModel&gt;**](OneFieldModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

