# PushTokenControllerV2Api

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete10**](PushTokenControllerV2Api.md#delete10) | **DELETE** /api/v2/notifications/push/tokens/{push-id} | delete
[**get13**](PushTokenControllerV2Api.md#get13) | **GET** /api/v2/notifications/push/tokens/{push-id} | get
[**getAll5**](PushTokenControllerV2Api.md#getAll5) | **GET** /api/v2/notifications/push/tokens | getAll
[**save**](PushTokenControllerV2Api.md#save) | **POST** /api/v2/notifications/push/tokens | save

<a name="delete10"></a>
# **delete10**
> delete10(pushId, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerV2Api()
val pushId : kotlin.String = pushId_example // kotlin.String | push-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete10(pushId, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerV2Api#delete10")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerV2Api#delete10")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushId** | **kotlin.String**| push-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get13"></a>
# **get13**
> GetPushTokenDto get13(pushId, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerV2Api()
val pushId : kotlin.String = pushId_example // kotlin.String | push-id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetPushTokenDto = apiInstance.get13(pushId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerV2Api#get13")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerV2Api#get13")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushId** | **kotlin.String**| push-id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetPushTokenDto**](GetPushTokenDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll5"></a>
# **getAll5**
> Page_GetPushTokenDto_ getAll5(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerV2Api()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_GetPushTokenDto_ = apiInstance.getAll5(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerV2Api#getAll5")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerV2Api#getAll5")
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

[**Page_GetPushTokenDto_**](Page_GetPushTokenDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="save"></a>
# **save**
> save(body, acceptLanguage)

save

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PushTokenControllerV2Api()
val body : CreatePushTokenDto =  // CreatePushTokenDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.save(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PushTokenControllerV2Api#save")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushTokenControllerV2Api#save")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePushTokenDto**](CreatePushTokenDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

