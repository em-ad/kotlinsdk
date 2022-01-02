# ConsultingConfigurationApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeConfigUsingPATCH1**](ConsultingConfigurationApi.md#changeConfigUsingPATCH1) | **PATCH** /api/v1/datyar/consulting/configurations/{user-id} | changeConfig
[**changeConfigUsingPATCH2**](ConsultingConfigurationApi.md#changeConfigUsingPATCH2) | **PATCH** /api/v1/datyar/consulting/lawyer/configurations | changeConfig
[**createSetting**](ConsultingConfigurationApi.md#createSetting) | **POST** /api/v1/datyar/consulting/settings | createSetting
[**getAllConfigs**](ConsultingConfigurationApi.md#getAllConfigs) | **GET** /api/v1/datyar/consulting/configurations | getAllConfigs
[**getConfig**](ConsultingConfigurationApi.md#getConfig) | **GET** /api/v1/datyar/consulting/configurations/{consulting-type} | getConfig
[**getConfig1**](ConsultingConfigurationApi.md#getConfig1) | **GET** /api/v1/datyar/consulting/configurations/{user-id}/{consulting-type} | getConfig
[**getServices**](ConsultingConfigurationApi.md#getServices) | **GET** /api/v1/datyar/consulting/services/{user-id} | getServices
[**getSetting**](ConsultingConfigurationApi.md#getSetting) | **GET** /api/v1/datyar/consulting/settings/{consultation-type} | getSetting
[**getSettingPackages**](ConsultingConfigurationApi.md#getSettingPackages) | **GET** /api/v1/datyar/consulting/settings/packages/{consultation-type} | getSettingPackages
[**updatePackage**](ConsultingConfigurationApi.md#updatePackage) | **PUT** /api/v1/datyar/consulting/settings/packages/{consultation-type} | updatePackage
[**updateSetting**](ConsultingConfigurationApi.md#updateSetting) | **PUT** /api/v1/datyar/consulting/settings | updateSetting

<a name="changeConfigUsingPATCH1"></a>
# **changeConfigUsingPATCH1**
> ConfigurationOutputDto changeConfigUsingPATCH1(userId, body, acceptLanguage)

changeConfig

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val userId : kotlin.String = userId_example // kotlin.String | user-id
val body : ConfigurationInputDto =  // ConfigurationInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ConfigurationOutputDto = apiInstance.changeConfigUsingPATCH1(userId, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#changeConfigUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#changeConfigUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| user-id |
 **body** | [**ConfigurationInputDto**](ConfigurationInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ConfigurationOutputDto**](ConfigurationOutputDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="changeConfigUsingPATCH2"></a>
# **changeConfigUsingPATCH2**
> ConfigurationOutputDto changeConfigUsingPATCH2(body, acceptLanguage)

changeConfig

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val body : ConfigurationInputDto =  // ConfigurationInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ConfigurationOutputDto = apiInstance.changeConfigUsingPATCH2(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#changeConfigUsingPATCH2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#changeConfigUsingPATCH2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationInputDto**](ConfigurationInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ConfigurationOutputDto**](ConfigurationOutputDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSetting"></a>
# **createSetting**
> SettingOutputDto createSetting(body, acceptLanguage)

createSetting

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val body : SettingInputDto =  // SettingInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : SettingOutputDto = apiInstance.createSetting(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#createSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#createSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettingInputDto**](SettingInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**SettingOutputDto**](SettingOutputDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllConfigs"></a>
# **getAllConfigs**
> Page_ConfigurationOutputDto_ getAllConfigs(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllConfigs

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : Page_ConfigurationOutputDto_ = apiInstance.getAllConfigs(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#getAllConfigs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#getAllConfigs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**Page_ConfigurationOutputDto_**](Page_ConfigurationOutputDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConfig"></a>
# **getConfig**
> ConfigurationOutputDto getConfig(consultingType, acceptLanguage)

getConfig

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val consultingType : kotlin.String = consultingType_example // kotlin.String | consulting-type
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ConfigurationOutputDto = apiInstance.getConfig(consultingType, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#getConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#getConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultingType** | **kotlin.String**| consulting-type | [enum: OFFLINE, ONLINE, URGENT]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ConfigurationOutputDto**](ConfigurationOutputDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConfig1"></a>
# **getConfig1**
> ConfigurationOutputDto getConfig1(userId, consultingType, acceptLanguage)

getConfig

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val userId : kotlin.String = userId_example // kotlin.String | user-id
val consultingType : kotlin.String = consultingType_example // kotlin.String | consulting-type
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ConfigurationOutputDto = apiInstance.getConfig1(userId, consultingType, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#getConfig1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#getConfig1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| user-id |
 **consultingType** | **kotlin.String**| consulting-type | [enum: OFFLINE, ONLINE, URGENT]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ConfigurationOutputDto**](ConfigurationOutputDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServices"></a>
# **getServices**
> ServicesOutputDto getServices(userId, acceptLanguage)

getServices

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val userId : kotlin.String = userId_example // kotlin.String | user-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ServicesOutputDto = apiInstance.getServices(userId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#getServices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#getServices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| user-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ServicesOutputDto**](ServicesOutputDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSetting"></a>
# **getSetting**
> ConsultationSetting getSetting(consultationType, acceptLanguage)

getSetting

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val consultationType : kotlin.String = consultationType_example // kotlin.String | consultation-type
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ConsultationSetting = apiInstance.getSetting(consultationType, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#getSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#getSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationType** | **kotlin.String**| consultation-type | [enum: OFFLINE, ONLINE, URGENT]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ConsultationSetting**](ConsultationSetting.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSettingPackages"></a>
# **getSettingPackages**
> kotlin.Array&lt;ConsultationPackage&gt; getSettingPackages(consultationType, acceptLanguage)

getSettingPackages

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val consultationType : kotlin.String = consultationType_example // kotlin.String | consultation-type
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<ConsultationPackage> = apiInstance.getSettingPackages(consultationType, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#getSettingPackages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#getSettingPackages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationType** | **kotlin.String**| consultation-type | [enum: OFFLINE, ONLINE, URGENT]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;ConsultationPackage&gt;**](ConsultationPackage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updatePackage"></a>
# **updatePackage**
> kotlin.Array&lt;ConsultationPackage&gt; updatePackage(consultationType, body, acceptLanguage)

updatePackage

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val consultationType : kotlin.String = consultationType_example // kotlin.String | consultation-type
val body : ConsultationPackage =  // ConsultationPackage | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<ConsultationPackage> = apiInstance.updatePackage(consultationType, body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#updatePackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#updatePackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationType** | **kotlin.String**| consultation-type | [enum: OFFLINE, ONLINE, URGENT]
 **body** | [**ConsultationPackage**](ConsultationPackage.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;ConsultationPackage&gt;**](ConsultationPackage.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSetting"></a>
# **updateSetting**
> ConsultationSetting updateSetting(body, acceptLanguage)

updateSetting

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ConsultingConfigurationApi()
val body : SettingInputDto =  // SettingInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ConsultationSetting = apiInstance.updateSetting(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConsultingConfigurationApi#updateSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConsultingConfigurationApi#updateSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettingInputDto**](SettingInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ConsultationSetting**](ConsultationSetting.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

