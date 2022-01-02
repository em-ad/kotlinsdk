# PublicCommentsApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addComment**](PublicCommentsApi.md#addComment) | **POST** /public/api/v1/comments | addComment
[**getCommentList1**](PublicCommentsApi.md#getCommentList1) | **GET** /public/api/v1/comments/{postId} | getCommentList

<a name="addComment"></a>
# **addComment**
> GetCommentDto addComment(body, acceptLanguage)

addComment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCommentsApi()
val body : CreateCommentDto =  // CreateCommentDto | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
try {
    val result : GetCommentDto = apiInstance.addComment(body, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCommentsApi#addComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCommentsApi#addComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCommentDto**](CreateCommentDto.md)|  | [optional]
 **acceptLanguage** | **kotlin.String**| language | [optional]

### Return type

[**GetCommentDto**](GetCommentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCommentList1"></a>
# **getCommentList1**
> Page_GetCommentDto_ getCommentList1(postId, acceptLanguage, pageNumber, pageSize, sort, sortKey)

getCommentList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicCommentsApi()
val postId : kotlin.String = postId_example // kotlin.String | postId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : Page_GetCommentDto_ = apiInstance.getCommentList1(postId, acceptLanguage, pageNumber, pageSize, sort, sortKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicCommentsApi#getCommentList1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicCommentsApi#getCommentList1")
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

### Return type

[**Page_GetCommentDto_**](Page_GetCommentDto_.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

