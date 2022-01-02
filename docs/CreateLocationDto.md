# CreateLocationDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**LocationAddressDto**](LocationAddressDto.md) |  |  [optional]
**banner** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**categoriesId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**description** | [**kotlin.String**](.md) |  |  [optional]
**email** | [**kotlin.String**](.md) |  |  [optional]
**geoCodingType** | [**inline**](#GeoCodingTypeEnum) |  |  [optional]
**lat** | [**kotlin.Double**](.md) |  |  [optional]
**lng** | [**kotlin.Double**](.md) |  |  [optional]
**metaData** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](.md) |  |  [optional]
**parentId** | [**kotlin.String**](.md) |  |  [optional]
**propertiesId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) |  | 
**tagsId** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**title** | [**kotlin.String**](.md) |  |  [optional]
**type** | [**kotlin.String**](.md) |  | 

<a name="GeoCodingTypeEnum"></a>
## Enum: geoCodingType
Name | Value
---- | -----
geoCodingType | GOOGLE

<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | DRAFT, PUBLISHED
