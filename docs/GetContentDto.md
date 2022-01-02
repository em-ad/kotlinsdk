# GetContentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**Author**](Author.md) |  |  [optional]
**averageRate** | [**kotlin.Float**](.md) |  |  [optional]
**banner** | [**ContentRowDto**](ContentRowDto.md) |  |  [optional]
**categories** | [**kotlin.Array&lt;CategoryDto&gt;**](CategoryDto.md) |  |  [optional]
**catsId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**children** | [**kotlin.Array&lt;GetContentDto&gt;**](GetContentDto.md) |  |  [optional]
**content** | [**kotlin.Array&lt;ContentRowDto&gt;**](ContentRowDto.md) |  |  [optional]
**contentType** | [**inline**](#ContentTypeEnum) |  |  [optional]
**createdDate** | [**kotlin.String**](.md) |  |  [optional]
**featured** | [**kotlin.Boolean**](.md) |  |  [optional]
**highlight** | [**kotlin.Boolean**](.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**language** | [**inline**](#LanguageEnum) |  |  [optional]
**lastModifiedDate** | [**kotlin.String**](.md) |  |  [optional]
**lat** | [**kotlin.Double**](.md) |  |  [optional]
**liked** | [**kotlin.Boolean**](.md) |  |  [optional]
**lng** | [**kotlin.Double**](.md) |  |  [optional]
**metaData** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](.md) |  |  [optional]
**publishDate** | [**kotlin.Long**](.md) |  |  [optional]
**publishDateIso** | [**kotlin.String**](.md) |  |  [optional]
**rateValue** | [**kotlin.Int**](.md) |  |  [optional]
**ratesCount** | [**kotlin.Int**](.md) |  |  [optional]
**ratesSum** | [**kotlin.Int**](.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) |  |  [optional]
**studyDuration** | [**kotlin.Int**](.md) |  |  [optional]
**summary** | [**ContentRowDto**](ContentRowDto.md) |  |  [optional]
**tags** | [**kotlin.Array&lt;TagDto&gt;**](TagDto.md) |  |  [optional]
**tagsId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**title** | [**ContentRowDto**](ContentRowDto.md) |  |  [optional]
**totalVisitCount** | [**kotlin.Int**](.md) |  |  [optional]
**type** | [**kotlin.String**](.md) |  |  [optional]
**userRate** | [**kotlin.Int**](.md) |  |  [optional]
**videoFile** | [**ContentRowDto**](ContentRowDto.md) |  |  [optional]
**visitedCount** | [**kotlin.Int**](.md) |  |  [optional]
**voteCount** | [**kotlin.Long**](.md) |  |  [optional]

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
