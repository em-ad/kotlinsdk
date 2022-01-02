# UserApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**beforeLeaving**](UserApi.md#beforeLeaving) | **POST** /api/v1/datyar/user/before-leaving | beforeLeaving
[**checkUserNameAvailability**](UserApi.md#checkUserNameAvailability) | **GET** /api/v1/datyar/user/check-username/{username} | checkUserNameAvailability
[**get5**](UserApi.md#get5) | **GET** /api/v1/datyar/user/{id} | get
[**getAllUsers**](UserApi.md#getAllUsers) | **GET** /api/v1/datyar/user | getAllUsers

<a name="beforeLeaving"></a>
# **beforeLeaving**
> beforeLeaving(body, acceptLanguage)

beforeLeaving

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val body : BeforeLeaving =  // BeforeLeaving | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.beforeLeaving(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserApi#beforeLeaving")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#beforeLeaving")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BeforeLeaving**](BeforeLeaving.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="checkUserNameAvailability"></a>
# **checkUserNameAvailability**
> checkUserNameAvailability(username, acceptLanguage)

checkUserNameAvailability

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val username : kotlin.String = username_example // kotlin.String | username
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.checkUserNameAvailability(username, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserApi#checkUserNameAvailability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#checkUserNameAvailability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| username |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get5"></a>
# **get5**
> DatyarUser get5(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : DatyarUser = apiInstance.get5(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#get5")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#get5")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**DatyarUser**](DatyarUser.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsers"></a>
# **getAllUsers**
> Page_DatyarUser_ getAllUsers(acceptLanguage, deleted, email, firstName, from, fullName, lastName, locked, mobile, pageNumber, pageSize, role, sort, sortKey, tag, to, username)

getAllUsers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val deleted : kotlin.Boolean = true // kotlin.Boolean | 
val email : kotlin.String = email_example // kotlin.String | 
val firstName : kotlin.String = firstName_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val fullName : kotlin.String = fullName_example // kotlin.String | 
val lastName : kotlin.String = lastName_example // kotlin.String | 
val locked : kotlin.Boolean = true // kotlin.Boolean | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val role : kotlin.String = role_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val tag : kotlin.String = tag_example // kotlin.String | 
val to : kotlin.Long = 789 // kotlin.Long | 
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : Page_DatyarUser_ = apiInstance.getAllUsers(acceptLanguage, deleted, email, firstName, from, fullName, lastName, locked, mobile, pageNumber, pageSize, role, sort, sortKey, tag, to, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getAllUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getAllUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **deleted** | **kotlin.Boolean**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **firstName** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **fullName** | **kotlin.String**|  | [optional]
 **lastName** | **kotlin.String**|  | [optional]
 **locked** | **kotlin.Boolean**|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **role** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **tag** | **kotlin.String**|  | [optional]
 **to** | **kotlin.Long**|  | [optional]
 **username** | **kotlin.String**|  | [optional]

### Return type

[**Page_DatyarUser_**](Page_DatyarUser_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

