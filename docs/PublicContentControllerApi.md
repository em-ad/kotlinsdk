# PublicContentControllerApi

All URIs are relative to *https://datyar.vaslapp.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContent2**](PublicContentControllerApi.md#getContent2) | **GET** /public/v1/contents/{contentId} | getContent
[**getContentList1**](PublicContentControllerApi.md#getContentList1) | **GET** /public/v1/contents | getContentList
[**getContentLocationsList1**](PublicContentControllerApi.md#getContentLocationsList1) | **GET** /public/v1/contents/locations | getContentLocationsList

<a name="getContent2"></a>
# **getContent2**
> GetContentDto getContent2(contentId, acceptLanguage, byChildren)

getContent

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicContentControllerApi()
val contentId : kotlin.String = contentId_example // kotlin.String | contentId
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : GetContentDto = apiInstance.getContent2(contentId, acceptLanguage, byChildren)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicContentControllerApi#getContent2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicContentControllerApi#getContent2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **kotlin.String**| contentId |
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **byChildren** | **kotlin.Boolean**|  | [optional]

### Return type

[**GetContentDto**](GetContentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getContentList1"></a>
# **getContentList1**
> Page_GetContentDto_ getContentList1(pageNumber, pageSize, sort, acceptLanguage, categoryId, childEmbed, content, contentType, featured, hasGeo, highlight, keyword, maxRate, maxStudyDuration, minRate, minStudyDuration, sortKey, status, summary, title, type)

getContentList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicContentControllerApi()
val pageNumber : kotlin.Int = 56 // kotlin.Int | starts from 0
val pageSize : kotlin.Int = 56 // kotlin.Int | must be greater than 0
val sort : kotlin.String = sort_example // kotlin.String | ASC=ascending ,DESC=descending
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val childEmbed : kotlin.Boolean = true // kotlin.Boolean | 
val content : kotlin.String = content_example // kotlin.String | 
val contentType : kotlin.String = contentType_example // kotlin.String | 
val featured : kotlin.Boolean = true // kotlin.Boolean | 
val hasGeo : kotlin.Boolean = true // kotlin.Boolean | 
val highlight : kotlin.Boolean = true // kotlin.Boolean | 
val keyword : kotlin.String = keyword_example // kotlin.String | 
val maxRate : kotlin.Int = 56 // kotlin.Int | maxRate must be between 1 - 5
val maxStudyDuration : kotlin.Int = 56 // kotlin.Int | 
val minRate : kotlin.Int = 56 // kotlin.Int | minRate must be between 1 - 5
val minStudyDuration : kotlin.Int = 56 // kotlin.Int | 
val sortKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | sort will be based on these words
val status : kotlin.String = status_example // kotlin.String | 
val summary : kotlin.String = summary_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : Page_GetContentDto_ = apiInstance.getContentList1(pageNumber, pageSize, sort, acceptLanguage, categoryId, childEmbed, content, contentType, featured, hasGeo, highlight, keyword, maxRate, maxStudyDuration, minRate, minStudyDuration, sortKey, status, summary, title, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicContentControllerApi#getContentList1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicContentControllerApi#getContentList1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **kotlin.Int**| starts from 0 |
 **pageSize** | **kotlin.Int**| must be greater than 0 | [enum: ]
 **sort** | **kotlin.String**| ASC&#x3D;ascending ,DESC&#x3D;descending | [enum: ASC, DESC]
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **categoryId** | **kotlin.String**|  | [optional]
 **childEmbed** | **kotlin.Boolean**|  | [optional]
 **content** | **kotlin.String**|  | [optional]
 **contentType** | **kotlin.String**|  | [optional] [enum: IMAGE, VIDEO]
 **featured** | **kotlin.Boolean**|  | [optional]
 **hasGeo** | **kotlin.Boolean**|  | [optional]
 **highlight** | **kotlin.Boolean**|  | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **maxRate** | **kotlin.Int**| maxRate must be between 1 - 5 | [optional]
 **maxStudyDuration** | **kotlin.Int**|  | [optional]
 **minRate** | **kotlin.Int**| minRate must be between 1 - 5 | [optional]
 **minStudyDuration** | **kotlin.Int**|  | [optional]
 **sortKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| sort will be based on these words | [optional]
 **status** | **kotlin.String**|  | [optional] [enum: DRAFT, PUBLISHED]
 **summary** | **kotlin.String**|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional]

### Return type

[**Page_GetContentDto_**](Page_GetContentDto_.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getContentLocationsList1"></a>
# **getContentLocationsList1**
> kotlin.Array&lt;GetContentLocationDto&gt; getContentLocationsList1(acceptLanguage, byChildren, content, distance, keyword, lat, lng, summary, tagTitle, title, type)

getContentLocationsList

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicContentControllerApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | language
val byChildren : kotlin.Boolean = true // kotlin.Boolean | 
val content : kotlin.String = content_example // kotlin.String | 
val distance : kotlin.Double = 1.2 // kotlin.Double | 
val keyword : kotlin.String = keyword_example // kotlin.String | 
val lat : kotlin.Double = 1.2 // kotlin.Double | 
val lng : kotlin.Double = 1.2 // kotlin.Double | 
val summary : kotlin.String = summary_example // kotlin.String | 
val tagTitle : kotlin.String = tagTitle_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : kotlin.Array<GetContentLocationDto> = apiInstance.getContentLocationsList1(acceptLanguage, byChildren, content, distance, keyword, lat, lng, summary, tagTitle, title, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicContentControllerApi#getContentLocationsList1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicContentControllerApi#getContentLocationsList1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| language | [optional]
 **byChildren** | **kotlin.Boolean**|  | [optional]
 **content** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Double**|  | [optional]
 **keyword** | **kotlin.String**|  | [optional]
 **lat** | **kotlin.Double**|  | [optional]
 **lng** | **kotlin.Double**|  | [optional]
 **summary** | **kotlin.String**|  | [optional]
 **tagTitle** | **kotlin.String**|  | [optional]
 **title** | **kotlin.String**|  | [optional]
 **type** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.Array&lt;GetContentLocationDto&gt;**](GetContentLocationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

