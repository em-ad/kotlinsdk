# PublicCountryControllerDeprecatedApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCities1**](PublicCountryControllerDeprecatedApi.md#getCities1) | **GET** /public/v1/location/countries/states/cities | getCities
[**getCountries1**](PublicCountryControllerDeprecatedApi.md#getCountries1) | **GET** /public/v1/location/countries | getCountries
[**getStates1**](PublicCountryControllerDeprecatedApi.md#getStates1) | **GET** /public/v1/location/countries/states | getStates

<a name="getCities1"></a>
# **getCities1**
> kotlin.Array&lt;OneFieldModel&gt; getCities1(country, state, acceptLanguage, q)

getCities

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCountryControllerDeprecatedApi()
val country : kotlin.String = country_example // kotlin.String | country
val state : kotlin.String = state_example // kotlin.String | state
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getCities1(country, state, acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCountryControllerDeprecatedApi#getCities1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCountryControllerDeprecatedApi#getCities1")
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

<a name="getCountries1"></a>
# **getCountries1**
> kotlin.Array&lt;OneFieldModel&gt; getCountries1(acceptLanguage, q)

getCountries

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCountryControllerDeprecatedApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getCountries1(acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCountryControllerDeprecatedApi#getCountries1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCountryControllerDeprecatedApi#getCountries1")
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

<a name="getStates1"></a>
# **getStates1**
> kotlin.Array&lt;OneFieldModel&gt; getStates1(country, acceptLanguage, q)

getStates

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCountryControllerDeprecatedApi()
val country : kotlin.String = country_example // kotlin.String | country
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val q : kotlin.String = q_example // kotlin.String | q
try {
    val result : kotlin.Array<OneFieldModel> = apiInstance.getStates1(country, acceptLanguage, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCountryControllerDeprecatedApi#getStates1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCountryControllerDeprecatedApi#getStates1")
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

