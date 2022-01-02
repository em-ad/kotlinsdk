# FileControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFolder**](FileControllerApi.md#createFolder) | **POST** /api/v1/file/folder | createFolder
[**delete3**](FileControllerApi.md#delete3) | **DELETE** /api/v1/file/{id} | delete
[**get6**](FileControllerApi.md#get6) | **GET** /api/v1/file/{id} | get
[**getContent1**](FileControllerApi.md#getContent1) | **GET** /api/v1/file/folder/{folderId} | getContent
[**getRoot**](FileControllerApi.md#getRoot) | **GET** /api/v1/file/folder/root | getRoot
[**upload**](FileControllerApi.md#upload) | **POST** /api/v1/file/upload | upload
[**uploadPrivateUserFile**](FileControllerApi.md#uploadPrivateUserFile) | **POST** /api/v1/file/upload/user/private | uploadPrivateUserFile
[**uploadPublicFile**](FileControllerApi.md#uploadPublicFile) | **POST** /api/v1/file/upload/public-file | uploadPublicFile
[**uploadPublicFileWithFolderName**](FileControllerApi.md#uploadPublicFileWithFolderName) | **POST** /api/v1/file/upload/public-file-with-folder-name | uploadPublicFileWithFolderName
[**uploadPublicUserFile**](FileControllerApi.md#uploadPublicUserFile) | **POST** /api/v1/file/upload/user/public | uploadPublicUserFile
[**uploadWithFolderName**](FileControllerApi.md#uploadWithFolderName) | **POST** /api/v1/file/upload/folder-name | uploadWithFolderName

<a name="createFolder"></a>
# **createFolder**
> FileOrFolder createFolder(body, acceptLanguage)

createFolder

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val body : CreateFileRequest =  // CreateFileRequest | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.createFolder(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#createFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#createFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFileRequest**](CreateFileRequest.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete3"></a>
# **delete3**
> delete3(id, acceptLanguage, deleteByChildren)

delete

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val deleteByChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.delete3(id, acceptLanguage, deleteByChildren)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#delete3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#delete3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **deleteByChildren** | **kotlin.Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get6"></a>
# **get6**
> FileOrFolder get6(id, acceptLanguage)

get

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val id : kotlin.String = id_example // kotlin.String | id
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.get6(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#get6")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#get6")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getContent1"></a>
# **getContent1**
> kotlin.Array&lt;FileOrFolder&gt; getContent1(folderId, acceptLanguage)

getContent

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val folderId : kotlin.String = folderId_example // kotlin.String | folderId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<FileOrFolder> = apiInstance.getContent1(folderId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#getContent1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#getContent1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folderId** | **kotlin.String**| folderId |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;FileOrFolder&gt;**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoot"></a>
# **getRoot**
> kotlin.Array&lt;FileOrFolder&gt; getRoot(acceptLanguage)

getRoot

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : kotlin.Array<FileOrFolder> = apiInstance.getRoot(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#getRoot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#getRoot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**kotlin.Array&lt;FileOrFolder&gt;**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="upload"></a>
# **upload**
> FileOrFolder upload(file, folderId, name, acceptLanguage)

upload

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val file : kotlin.Array<kotlin.Byte> = file_example // kotlin.Array<kotlin.Byte> | 
val folderId : kotlin.String = folderId_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.upload(file, folderId, name, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#upload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#upload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **kotlin.Array&lt;kotlin.Byte&gt;**|  | [optional]
 **folderId** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadPrivateUserFile"></a>
# **uploadPrivateUserFile**
> FileOrFolder uploadPrivateUserFile(file, storeKey, acceptLanguage)

uploadPrivateUserFile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val file : kotlin.Array<kotlin.Byte> = file_example // kotlin.Array<kotlin.Byte> | 
val storeKey : kotlin.String = storeKey_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.uploadPrivateUserFile(file, storeKey, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#uploadPrivateUserFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#uploadPrivateUserFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **kotlin.Array&lt;kotlin.Byte&gt;**|  | [optional]
 **storeKey** | **kotlin.String**|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadPublicFile"></a>
# **uploadPublicFile**
> FileOrFolder uploadPublicFile(file, folderId, name, acceptLanguage)

uploadPublicFile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val file : kotlin.Array<kotlin.Byte> = file_example // kotlin.Array<kotlin.Byte> | 
val folderId : kotlin.String = folderId_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.uploadPublicFile(file, folderId, name, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#uploadPublicFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#uploadPublicFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **kotlin.Array&lt;kotlin.Byte&gt;**|  | [optional]
 **folderId** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadPublicFileWithFolderName"></a>
# **uploadPublicFileWithFolderName**
> FileOrFolder uploadPublicFileWithFolderName(file, folderName, name, acceptLanguage)

uploadPublicFileWithFolderName

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val file : kotlin.Array<kotlin.Byte> = file_example // kotlin.Array<kotlin.Byte> | 
val folderName : kotlin.String = folderName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.uploadPublicFileWithFolderName(file, folderName, name, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#uploadPublicFileWithFolderName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#uploadPublicFileWithFolderName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **kotlin.Array&lt;kotlin.Byte&gt;**|  | [optional]
 **folderName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadPublicUserFile"></a>
# **uploadPublicUserFile**
> FileOrFolder uploadPublicUserFile(file, acceptLanguage)

uploadPublicUserFile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val file : kotlin.Array<kotlin.Byte> = file_example // kotlin.Array<kotlin.Byte> | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.uploadPublicUserFile(file, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#uploadPublicUserFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#uploadPublicUserFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **kotlin.Array&lt;kotlin.Byte&gt;**|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadWithFolderName"></a>
# **uploadWithFolderName**
> FileOrFolder uploadWithFolderName(file, folderName, name, acceptLanguage)

uploadWithFolderName

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FileControllerApi()
val file : kotlin.Array<kotlin.Byte> = file_example // kotlin.Array<kotlin.Byte> | 
val folderName : kotlin.String = folderName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : FileOrFolder = apiInstance.uploadWithFolderName(file, folderName, name, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileControllerApi#uploadWithFolderName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileControllerApi#uploadWithFolderName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **kotlin.Array&lt;kotlin.Byte&gt;**|  | [optional]
 **folderName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**FileOrFolder**](FileOrFolder.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

