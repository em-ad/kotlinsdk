# ApplicationVersionControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ApplicationVersionControllerApi.md#create) | **POST** /api/v1/application/versions | create
[**delete**](ApplicationVersionControllerApi.md#delete) | **DELETE** /api/v1/application/versions/{id} | delete
[**get**](ApplicationVersionControllerApi.md#get) | **GET** /api/v1/application/versions/{id} | get
[**getAll**](ApplicationVersionControllerApi.md#getAll) | **GET** /api/v1/application/versions | getAll
[**getStatus**](ApplicationVersionControllerApi.md#getStatus) | **GET** /api/v1/application/versions/status | getStatus
[**update**](ApplicationVersionControllerApi.md#update) | **PUT** /api/v1/application/versions/{id} | update

<a name="create"></a>
# **create**
> create(body, acceptLanguage)

create

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationVersionControllerApi()
val body : CreateApplicationVersion =  // CreateApplicationVersion | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.create(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ApplicationVersionControllerApi#create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationVersionControllerApi#create")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateApplicationVersion**](CreateApplicationVersion.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(id, acceptLanguage)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationVersionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.delete(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ApplicationVersionControllerApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationVersionControllerApi#delete")
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

<a name="get"></a>
# **get**
> GetApplicationVersion get(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationVersionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetApplicationVersion = apiInstance.get(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationVersionControllerApi#get")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationVersionControllerApi#get")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetApplicationVersion**](GetApplicationVersion.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll"></a>
# **getAll**
> Page_GetApplicationVersion_ getAll(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAll

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationVersionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | Starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | Must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sort will be based on these words
try {
    val result : Page_GetApplicationVersion_ = apiInstance.getAll(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationVersionControllerApi#getAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationVersionControllerApi#getAll")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**| Starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| Must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sort will be based on these words | [optional]

### Return type

[**Page_GetApplicationVersion_**](Page_GetApplicationVersion_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStatus"></a>
# **getStatus**
> GetLatestVersion getStatus(applicationType, acceptLanguage, packageName, versionName)

getStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationVersionControllerApi()
val applicationType : kotlin.String = applicationType_example // kotlin.String | OS type
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val packageName : kotlin.String = packageName_example // kotlin.String | Same as bundle id in apple ecosystem
val versionName : kotlin.String = versionName_example // kotlin.String | Valid data: 1.2.4 , 13.223.433   Invalid data : 1.2 , 1.3.0.Beta\"
try {
    val result : GetLatestVersion = apiInstance.getStatus(applicationType, acceptLanguage, packageName, versionName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationVersionControllerApi#getStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationVersionControllerApi#getStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationType** | **kotlin.String**| OS type | [enum: ANDROID, IOS]
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **packageName** | **kotlin.String**| Same as bundle id in apple ecosystem | [optional]
 **versionName** | **kotlin.String**| Valid data: 1.2.4 , 13.223.433   Invalid data : 1.2 , 1.3.0.Beta\&quot; | [optional]

### Return type

[**GetLatestVersion**](GetLatestVersion.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update"></a>
# **update**
> update(id, body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ApplicationVersionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val body : UpdateApplicationVersion =  // UpdateApplicationVersion | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.update(id, body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ApplicationVersionControllerApi#update")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationVersionControllerApi#update")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **body** | [**UpdateApplicationVersion**](UpdateApplicationVersion.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

