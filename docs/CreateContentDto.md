# CreateContentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**banner** | [**ContentRowDto**](ContentRowDto.md) |  | 
**catsId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**content** | [**kotlin.Array&lt;ContentRowDto&gt;**](ContentRowDto.md) |  |  [optional]
**contentType** | [**inline**](#ContentTypeEnum) |  |  [optional]
**featured** | [**kotlin.Boolean**](.md) |  |  [optional]
**highlight** | [**kotlin.Boolean**](.md) |  |  [optional]
**language** | [**inline**](#LanguageEnum) |  | 
**lat** | [**kotlin.Double**](.md) |  |  [optional]
**lng** | [**kotlin.Double**](.md) |  |  [optional]
**metaData** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](.md) |  |  [optional]
**parentId** | [**kotlin.String**](.md) |  |  [optional]
**publishDate** | [**kotlin.Long**](.md) |  | 
**status** | [**inline**](#StatusEnum) |  | 
**summary** | [**ContentRowDto**](ContentRowDto.md) |  | 
**tagsId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**title** | [**ContentRowDto**](ContentRowDto.md) |  | 
**type** | [**kotlin.String**](.md) |  | 
**videoFile** | [**ContentRowDto**](ContentRowDto.md) |  |  [optional]

<a name="ContentTypeEnum"></a>
## Enum: contentType
Name | Value
---- | -----
contentType | IMAGE, VIDEO

<a name="LanguageEnum"></a>
## Enum: language
Name | Value
---- | -----
language | EN, FA, FR

<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | DRAFT, PUBLISHED
