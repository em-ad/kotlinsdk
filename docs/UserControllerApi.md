# UserControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserControllerApi.md#createUser) | **POST** /api/v1/user | create
[**deleteUser**](UserControllerApi.md#deleteUser) | **DELETE** /api/v1/user/{id} | deleteUser
[**getAllUser**](UserControllerApi.md#getAllUser) | **GET** /api/v1/user | getAllUser
[**getAllUsers1**](UserControllerApi.md#getAllUsers1) | **GET** /api/v1/user/all | getAllUsers
[**getAllUsers2**](UserControllerApi.md#getAllUsers2) | **GET** /api/v1/user/admin-panel | getAllUsers
[**getAllUsersCsv**](UserControllerApi.md#getAllUsersCsv) | **GET** /api/v1/user/admin-panel/users.csv | getAllUsersCsv
[**getProfile**](UserControllerApi.md#getProfile) | **GET** /api/v1/user/profile | getProfile
[**getReport1**](UserControllerApi.md#getReport1) | **GET** /api/v1/user/report | getReport
[**getUser**](UserControllerApi.md#getUser) | **GET** /api/v1/user/{id} | getUser
[**lockUsingPATCH1**](UserControllerApi.md#lockUsingPATCH1) | **PATCH** /api/v1/user/lock | lock
[**selectiveUpdateUserUsingPATCH1**](UserControllerApi.md#selectiveUpdateUserUsingPATCH1) | **PATCH** /api/v1/user | selectiveUpdate
[**unlockUsingPATCH1**](UserControllerApi.md#unlockUsingPATCH1) | **PATCH** /api/v1/user/unlock | lock
[**updatePasswordUsingPATCH1**](UserControllerApi.md#updatePasswordUsingPATCH1) | **PATCH** /api/v1/user/password | updatePassword
[**updateProfileUsingPATCH1**](UserControllerApi.md#updateProfileUsingPATCH1) | **PATCH** /api/v1/user/profile | updateProfile
[**updateUser**](UserControllerApi.md#updateUser) | **PUT** /api/v1/user | update
[**updateUser1**](UserControllerApi.md#updateUser1) | **PUT** /api/v1/user/admin-panel | update

<a name="createUser"></a>
# **createUser**
> UserDto createUser(body, acceptLanguage)

create

don&#x27;t fill id and userStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val body : UserInputDto =  // UserInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : UserDto = apiInstance.createUser(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserInputDto**](UserInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**UserDto**](UserDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(id, acceptLanguage)

deleteUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.deleteUser(id, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#deleteUser")
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

<a name="getAllUser"></a>
# **getAllUser**
> Page_UserDto_ getAllUser(acceptLanguage, locked, pageNumber, pageSize, role, sort, sortKey)

getAllUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val locked : kotlin.Boolean = true // kotlin.Boolean | null value permitted
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val role : kotlin.String = role_example // kotlin.String | null value permitted
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
try {
    val result : Page_UserDto_ = apiInstance.getAllUser(acceptLanguage, locked, pageNumber, pageSize, role, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#getAllUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#getAllUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **locked** | **kotlin.Boolean**| null value permitted | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **role** | **kotlin.String**| null value permitted | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]

### Return type

[**Page_UserDto_**](Page_UserDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsers1"></a>
# **getAllUsers1**
> Page_UserDto_ getAllUsers1(acceptLanguage, deleted, email, firstName, from, fullName, lastName, locked, mobile, pageNumber, pageSize, role, sort, sortKey, tag, to, username)

getAllUsers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
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
    val result : Page_UserDto_ = apiInstance.getAllUsers1(acceptLanguage, deleted, email, firstName, from, fullName, lastName, locked, mobile, pageNumber, pageSize, role, sort, sortKey, tag, to, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#getAllUsers1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#getAllUsers1")
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

[**Page_UserDto_**](Page_UserDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsers2"></a>
# **getAllUsers2**
> Page_UserDto_ getAllUsers2(acceptLanguage, deleted, deletedAtFrom, deletedAtTo, email, firstName, from, fullName, lastName, mobile, pageNumber, pageSize, sort, sortKey, tag, to)

getAllUsers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val deleted : kotlin.Boolean = true // kotlin.Boolean | 
val deletedAtFrom : kotlin.String = deletedAtFrom_example // kotlin.String | 
val deletedAtTo : kotlin.String = deletedAtTo_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val firstName : kotlin.String = firstName_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val fullName : kotlin.String = fullName_example // kotlin.String | 
val lastName : kotlin.String = lastName_example // kotlin.String | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val tag : kotlin.String = tag_example // kotlin.String | 
val to : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Page_UserDto_ = apiInstance.getAllUsers2(acceptLanguage, deleted, deletedAtFrom, deletedAtTo, email, firstName, from, fullName, lastName, mobile, pageNumber, pageSize, sort, sortKey, tag, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#getAllUsers2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#getAllUsers2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **deleted** | **kotlin.Boolean**|  | [optional]
 **deletedAtFrom** | **kotlin.String**|  | [optional]
 **deletedAtTo** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **firstName** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **fullName** | **kotlin.String**|  | [optional]
 **lastName** | **kotlin.String**|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **pageNumber** | **kotlin.Int**| starts from 0 | [optional]
 **pageSize** | **kotlin.Int**| must be greater than 0 | [optional]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **tag** | **kotlin.String**|  | [optional]
 **to** | **kotlin.Long**|  | [optional]

### Return type

[**Page_UserDto_**](Page_UserDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsersCsv"></a>
# **getAllUsersCsv**
> getAllUsersCsv(acceptLanguage, deleted, deletedAtFrom, deletedAtTo, email, firstName, from, fullName, lastName, mobile, tag, to)

getAllUsersCsv

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val deleted : kotlin.Boolean = true // kotlin.Boolean | 
val deletedAtFrom : kotlin.String = deletedAtFrom_example // kotlin.String | 
val deletedAtTo : kotlin.String = deletedAtTo_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val firstName : kotlin.String = firstName_example // kotlin.String | 
val from : kotlin.Long = 789 // kotlin.Long | 
val fullName : kotlin.String = fullName_example // kotlin.String | 
val lastName : kotlin.String = lastName_example // kotlin.String | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val tag : kotlin.String = tag_example // kotlin.String | 
val to : kotlin.Long = 789 // kotlin.Long | 
try {
    apiInstance.getAllUsersCsv(acceptLanguage, deleted, deletedAtFrom, deletedAtTo, email, firstName, from, fullName, lastName, mobile, tag, to)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#getAllUsersCsv")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#getAllUsersCsv")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **deleted** | **kotlin.Boolean**|  | [optional]
 **deletedAtFrom** | **kotlin.String**|  | [optional]
 **deletedAtTo** | **kotlin.String**|  | [optional]
 **email** | **kotlin.String**|  | [optional]
 **firstName** | **kotlin.String**|  | [optional]
 **from** | **kotlin.Long**|  | [optional]
 **fullName** | **kotlin.String**|  | [optional]
 **lastName** | **kotlin.String**|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **tag** | **kotlin.String**|  | [optional]
 **to** | **kotlin.Long**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProfile"></a>
# **getProfile**
> UserDto getProfile(acceptLanguage)

getProfile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : UserDto = apiInstance.getProfile(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#getProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#getProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**UserDto**](UserDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getReport1"></a>
# **getReport1**
> UserReportDto getReport1(acceptLanguage, todayCount, totalCount)

getReport

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val todayCount : kotlin.Boolean = true // kotlin.Boolean | make it true if you want it
val totalCount : kotlin.Boolean = true // kotlin.Boolean | make it true if you want it
try {
    val result : UserReportDto = apiInstance.getReport1(acceptLanguage, todayCount, totalCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#getReport1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#getReport1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **todayCount** | **kotlin.Boolean**| make it true if you want it | [optional]
 **totalCount** | **kotlin.Boolean**| make it true if you want it | [optional]

### Return type

[**UserReportDto**](UserReportDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUser"></a>
# **getUser**
> UserDto getUser(id, acceptLanguage)

getUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : UserDto = apiInstance.getUser(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**UserDto**](UserDto.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="lockUsingPATCH1"></a>
# **lockUsingPATCH1**
> lockUsingPATCH1(acceptLanguage, userId)

lock

used for locking user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val userId : kotlin.String = userId_example // kotlin.String | userId used by admin
try {
    apiInstance.lockUsingPATCH1(acceptLanguage, userId)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#lockUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#lockUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **userId** | **kotlin.String**| userId used by admin | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="selectiveUpdateUserUsingPATCH1"></a>
# **selectiveUpdateUserUsingPATCH1**
> selectiveUpdateUserUsingPATCH1(body, acceptLanguage)

selectiveUpdate

fill selectively, don&#x27;t fill userStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val body : UserInputDto =  // UserInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.selectiveUpdateUserUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#selectiveUpdateUserUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#selectiveUpdateUserUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserInputDto**](UserInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="unlockUsingPATCH1"></a>
# **unlockUsingPATCH1**
> unlockUsingPATCH1(acceptLanguage, userId)

lock

used for locking user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val userId : kotlin.String = userId_example // kotlin.String | userId used by admin
try {
    apiInstance.unlockUsingPATCH1(acceptLanguage, userId)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#unlockUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#unlockUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **userId** | **kotlin.String**| userId used by admin | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePasswordUsingPATCH1"></a>
# **updatePasswordUsingPATCH1**
> updatePasswordUsingPATCH1(body, acceptLanguage)

updatePassword

don&#x27;t fill id

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val body : ChangePasswordDto =  // ChangePasswordDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updatePasswordUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#updatePasswordUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#updatePasswordUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangePasswordDto**](ChangePasswordDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateProfileUsingPATCH1"></a>
# **updateProfileUsingPATCH1**
> updateProfileUsingPATCH1(body, acceptLanguage)

updateProfile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val body : UserInputDto =  // UserInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateProfileUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#updateProfileUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#updateProfileUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserInputDto**](UserInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(body, acceptLanguage)

update

don&#x27;t fill userStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val body : UserInputDto =  // UserInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateUser(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserInputDto**](UserInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateUser1"></a>
# **updateUser1**
> updateUser1(body, acceptLanguage)

update

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserControllerApi()
val body : UserInputDto =  // UserInputDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.updateUser1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling UserControllerApi#updateUser1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserControllerApi#updateUser1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserInputDto**](UserInputDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

