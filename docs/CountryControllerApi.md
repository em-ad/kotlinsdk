# CountryControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCities**](CountryControllerApi.md#getCities) | **GET** /api/v1/location/countries/states/cities | getCities
[**getCountries**](CountryControllerApi.md#getCountries) | **GET** /api/v1/location/countries | getCountries
[**getStates**](CountryControllerApi.md#getStates) | **GET** /api/v1/location/countries/states | getStates

<a name="getCities"></a>
# **getCities**
> kotlin.Array&lt;OneFieldModel&gt; getCities(country, state, acceptLanguage, q)

getCities

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CountryControllerApi()
val country : kotlin.String = country_example // kotlin.String | country
val state : kotlin.String = state_example // kotlin.String | state
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getCities(country, state, acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountryControllerApi#getCities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountryControllerApi#getCities")
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCountries"></a>
# **getCountries**
> kotlin.Array&lt;OneFieldModel&gt; getCountries(acceptLanguage, q)

getCountries

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CountryControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getCountries(acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountryControllerApi#getCountries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountryControllerApi#getCountries")
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStates"></a>
# **getStates**
> kotlin.Array&lt;OneFieldModel&gt; getStates(country, acceptLanguage, q)

getStates

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CountryControllerApi()
val country : kotlin.String = country_example // kotlin.String | country
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getStates(country, acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountryControllerApi#getStates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountryControllerApi#getStates")
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

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

