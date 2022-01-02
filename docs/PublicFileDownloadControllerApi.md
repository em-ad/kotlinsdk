# PublicFileDownloadControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download**](PublicFileDownloadControllerApi.md#download) | **GET** /public/api/v1/file/download/{originalFileName} | download
[**downloadFile**](PublicFileDownloadControllerApi.md#downloadFile) | **GET** /public/api/v1/file/download/{bucket}/{file} | downloadFile
[**downloadFileLocal**](PublicFileDownloadControllerApi.md#downloadFileLocal) | **GET** /public/api/v1/file/storage/{userid}/{access}/{bucket}/{file} | downloadFileLocal

<a name="download"></a>
# **download**
> download(originalFileName, acceptLanguage, access, bucketName, fileName, parentId, provider)

download

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicFileDownloadControllerApi()
val originalFileName : kotlin.String = originalFileName_example // kotlin.String | originalFileName
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val access : kotlin.String = access_example // kotlin.String | 
val bucketName : kotlin.String = bucketName_example // kotlin.String | 
val fileName : kotlin.String = fileName_example // kotlin.String | 
val parentId : kotlin.String = parentId_example // kotlin.String | 
val provider : kotlin.String = provider_example // kotlin.String | 
try {
    apiInstance.download(originalFileName, acceptLanguage, access, bucketName, fileName, parentId, provider)
} catch (e: ClientException) {
    println("4xx response calling PublicFileDownloadControllerApi#download")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicFileDownloadControllerApi#download")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **originalFileName** | **kotlin.String**| originalFileName |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **access** | **kotlin.String**|  | [optional]
 **bucketName** | **kotlin.String**|  | [optional]
 **fileName** | **kotlin.String**|  | [optional]
 **parentId** | **kotlin.String**|  | [optional]
 **provider** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(bucket, file, acceptLanguage)

downloadFile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicFileDownloadControllerApi()
val bucket : kotlin.String = bucket_example // kotlin.String | bucket
val file : kotlin.String = file_example // kotlin.String | file
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.downloadFile(bucket, file, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PublicFileDownloadControllerApi#downloadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicFileDownloadControllerApi#downloadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucket** | **kotlin.String**| bucket |
 **file** | **kotlin.String**| file |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFileLocal"></a>
# **downloadFileLocal**
> downloadFileLocal(bucket, file, acceptLanguage)

downloadFileLocal

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicFileDownloadControllerApi()
val bucket : kotlin.String = bucket_example // kotlin.String | bucket
val file : kotlin.String = file_example // kotlin.String | file
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.downloadFileLocal(bucket, file, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling PublicFileDownloadControllerApi#downloadFileLocal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicFileDownloadControllerApi#downloadFileLocal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucket** | **kotlin.String**| bucket |
 **file** | **kotlin.String**| file |
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

