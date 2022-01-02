# GetLocationDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**LocationAddressDto**](LocationAddressDto.md) |  |  [optional]
**banner** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**categories** | [**kotlin.Array&lt;LocationCategoryDto&gt;**](LocationCategoryDto.md) |  |  [optional]
**children** | [**kotlin.Array&lt;GetLocationDto&gt;**](GetLocationDto.md) |  |  [optional]
**confirmedBy** | [**kotlin.Long**](.md) |  |  [optional]
**createdDate** | [**kotlin.String**](.md) |  |  [optional]
**description** | [**kotlin.String**](.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**lat** | [**kotlin.Double**](.md) |  |  [optional]
**lng** | [**kotlin.Double**](.md) |  |  [optional]
**metaData** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](.md) |  |  [optional]
**owner** | [**OwnerDto**](OwnerDto.md) |  |  [optional]
**parentId** | [**kotlin.String**](.md) |  |  [optional]
**properties** | [**kotlin.Array&lt;GetLocationPropertyOptionDto&gt;**](GetLocationPropertyOptionDto.md) |  |  [optional]
**propertiesId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**publishDate** | [**kotlin.Long**](.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) |  |  [optional]
**tags** | [**kotlin.Array&lt;LocationTagDto&gt;**](LocationTagDto.md) |  |  [optional]
**title** | [**kotlin.String**](.md) |  |  [optional]
**type** | [**kotlin.String**](.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | DRAFT, PUBLISHED
