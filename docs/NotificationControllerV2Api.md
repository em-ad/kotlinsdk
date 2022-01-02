# NotificationControllerV2Api

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send1**](NotificationControllerV2Api.md#send1) | **POST** /api/v2/notifications/send | send

<a name="send1"></a>
# **send1**
> send1(acceptLanguage, iDs, createdDate, deleted, deletedAt, id, lastModifiedDate, message, metaData, mobile, new, template, title, to, types, version, visitedSet)

send

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NotificationControllerV2Api()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val iDs : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val createdDate : kotlin.String = createdDate_example // kotlin.String | 
val deleted : kotlin.Boolean = true // kotlin.Boolean | 
val deletedAt : kotlin.String = deletedAt_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
val lastModifiedDate : kotlin.String = lastModifiedDate_example // kotlin.String | 
val message : kotlin.String = message_example // kotlin.String | 
val metaData : kotlin.Any =  // kotlin.Any | 
val mobile : kotlin.String = mobile_example // kotlin.String | 
val new : kotlin.Boolean = true // kotlin.Boolean | 
val template : kotlin.String = template_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val to : kotlin.String = to_example // kotlin.String | 
val types : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val version : kotlin.Long = 789 // kotlin.Long | 
val visitedSet : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    apiInstance.send1(acceptLanguage, iDs, createdDate, deleted, deletedAt, id, lastModifiedDate, message, metaData, mobile, new, template, title, to, types, version, visitedSet)
} catch (e: ClientException) {
    println("4xx response calling NotificationControllerV2Api#send1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationControllerV2Api#send1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **iDs** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **createdDate** | **kotlin.String**|  | [optional]
 **deleted** | **kotlin.Boolean**|  | [optional]
 **deletedAt** | **kotlin.String**|  | [optional]
 **id** | **kotlin.String**|  | [optional]
 **lastModifiedDate** | **kotlin.String**|  | [optional]
 **message** | **kotlin.String**|  | [optional]
 **metaData** | [**kotlin.Any**](.md)|  | [optional]
 **mobile** | **kotlin.String**|  | [optional]
 **new** | **kotlin.Boolean**|  | [optional]
 **template** | **kotlin.String**|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **to** | **kotlin.String**|  | [optional]
 **types** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **version** | **kotlin.Long**|  | [optional]
 **visitedSet** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

