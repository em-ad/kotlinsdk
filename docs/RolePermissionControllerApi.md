# RolePermissionControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRolePermission**](RolePermissionControllerApi.md#addRolePermission) | **POST** /api/v1/security-server/role-permission | add
[**deleteRolePermission**](RolePermissionControllerApi.md#deleteRolePermission) | **DELETE** /api/v1/security-server/role-permission/{id} | deleteRolePermission
[**editRolePermission**](RolePermissionControllerApi.md#editRolePermission) | **PUT** /api/v1/security-server/role-permission | editRolePermission
[**getAllRolePermissions**](RolePermissionControllerApi.md#getAllRolePermissions) | **GET** /api/v1/security-server/role-permission | getAllRolePermissions
[**getPrivileges1**](RolePermissionControllerApi.md#getPrivileges1) | **GET** /api/v1/security-server/role-permission/privileges | getPrivileges
[**getRolePermission**](RolePermissionControllerApi.md#getRolePermission) | **GET** /api/v1/security-server/role-permission/{id} | getRolePermission
[**selectiveEditRolePermissionUsingPATCH1**](RolePermissionControllerApi.md#selectiveEditRolePermissionUsingPATCH1) | **PATCH** /api/v1/security-server/role-permission | selectiveEditRolePermission

<a name="addRolePermission"></a>
# **addRolePermission**
> RolePermissionDto addRolePermission(body, acceptLanguage)

add

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RolePermissionControllerApi()
val body : RolePermissionDto =  // RolePermissionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : RolePermissionDto = apiInstance.addRolePermission(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolePermissionControllerApi#addRolePermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolePermissionControllerApi#addRolePermission")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RolePermissionDto**](RolePermissionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**RolePermissionDto**](RolePermissionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRolePermission"></a>
# **deleteRolePermission**
> deleteRolePermission(id, acceptLanguage)

deleteRolePermission

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RolePermissionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteRolePermission(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RolePermissionControllerApi#deleteRolePermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolePermissionControllerApi#deleteRolePermission")
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

<a name="editRolePermission"></a>
# **editRolePermission**
> editRolePermission(body, acceptLanguage)

editRolePermission

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RolePermissionControllerApi()
val body : RolePermissionDto =  // RolePermissionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.editRolePermission(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RolePermissionControllerApi#editRolePermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolePermissionControllerApi#editRolePermission")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RolePermissionDto**](RolePermissionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllRolePermissions"></a>
# **getAllRolePermissions**
> Page_RolePermissionDto_ getAllRolePermissions(acceptLanguage, pageNumber, pageSize, sort, sortKey)

getAllRolePermissions

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RolePermissionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_RolePermissionDto_ = apiInstance.getAllRolePermissions(acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolePermissionControllerApi#getAllRolePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolePermissionControllerApi#getAllRolePermissions")
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

[**Page_RolePermissionDto_**](Page_RolePermissionDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPrivileges1"></a>
# **getPrivileges1**
> ApiPermissionDto getPrivileges1(acceptLanguage)

getPrivileges

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RolePermissionControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : ApiPermissionDto = apiInstance.getPrivileges1(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolePermissionControllerApi#getPrivileges1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolePermissionControllerApi#getPrivileges1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**ApiPermissionDto**](ApiPermissionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRolePermission"></a>
# **getRolePermission**
> RolePermissionDto getRolePermission(id, acceptLanguage)

getRolePermission

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RolePermissionControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : RolePermissionDto = apiInstance.getRolePermission(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolePermissionControllerApi#getRolePermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolePermissionControllerApi#getRolePermission")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**RolePermissionDto**](RolePermissionDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="selectiveEditRolePermissionUsingPATCH1"></a>
# **selectiveEditRolePermissionUsingPATCH1**
> selectiveEditRolePermissionUsingPATCH1(body, acceptLanguage)

selectiveEditRolePermission

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RolePermissionControllerApi()
val body : RolePermissionDto =  // RolePermissionDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.selectiveEditRolePermissionUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling RolePermissionControllerApi#selectiveEditRolePermissionUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolePermissionControllerApi#selectiveEditRolePermissionUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RolePermissionDto**](RolePermissionDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

