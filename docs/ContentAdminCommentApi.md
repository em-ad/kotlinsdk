# ContentAdminCommentApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editCommentUsingPATCH1**](ContentAdminCommentApi.md#editCommentUsingPATCH1) | **PATCH** /api/v1/admin-comments/edit | editComment
[**getAllComments**](ContentAdminCommentApi.md#getAllComments) | **GET** /api/v1/admin-comments | getAllComments
[**getCommentList**](ContentAdminCommentApi.md#getCommentList) | **GET** /api/v1/admin-comments/{postId} | getCommentList

<a name="editCommentUsingPATCH1"></a>
# **editCommentUsingPATCH1**
> editCommentUsingPATCH1(body, acceptLanguage)

editComment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentAdminCommentApi()
val body : EditCommentDto =  // EditCommentDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    apiInstance.editCommentUsingPATCH1(body, acceptLanguage)
} catch (e: ClientException) {
    println("4xx response calling ContentAdminCommentApi#editCommentUsingPATCH1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentAdminCommentApi#editCommentUsingPATCH1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditCommentDto**](EditCommentDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllComments"></a>
# **getAllComments**
> Page_GetCommentDto_ getAllComments(acceptLanguage, pageNumber, pageSize, sort, sortKey, status)

getAllComments

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentAdminCommentApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val status : kotlin.String = status_example // kotlin.String | status
try {
    val result : Page_GetCommentDto_ = apiInstance.getAllComments(acceptLanguage, pageNumber, pageSize, sort, sortKey, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentAdminCommentApi#getAllComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentAdminCommentApi#getAllComments")
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
 **status** | **kotlin.String**| status | [optional] [enum: DRAFT, PUBLISHED, REJECTED]

### Return type

[**Page_GetCommentDto_**](Page_GetCommentDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCommentList"></a>
# **getCommentList**
> Page_GetCommentDto_ getCommentList(postId, acceptLanguage, pageNumber, pageSize, sort, sortKey, status)

getCommentList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentAdminCommentApi()
val postId : kotlin.String = postId_example // kotlin.String | postId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val status : kotlin.String = status_example // kotlin.String | status
try {
    val result : Page_GetCommentDto_ = apiInstance.getCommentList(postId, acceptLanguage, pageNumber, pageSize, sort, sortKey, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentAdminCommentApi#getCommentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentAdminCommentApi#getCommentList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| postId |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **pageNumber** | **kotlin.Int**|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **status** | **kotlin.String**| status | [optional] [enum: DRAFT, PUBLISHED, REJECTED]

### Return type

[**Page_GetCommentDto_**](Page_GetCommentDto_.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

