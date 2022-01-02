# FileOrFolder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**inline**](#AccessEnum) |  |  [optional]
**bucketName** | [**kotlin.String**](.md) |  |  [optional]
**childFolders** | [**kotlin.Array&lt;FileOrFolder&gt;**](FileOrFolder.md) |  |  [optional]
**disk** | [**inline**](#DiskEnum) |  |  [optional]
**fileName** | [**kotlin.String**](.md) |  |  [optional]
**filePath** | [**kotlin.String**](.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**mimeType** | [**kotlin.String**](.md) |  |  [optional]
**originalFileName** | [**kotlin.String**](.md) |  |  [optional]
**parentId** | [**kotlin.String**](.md) |  |  [optional]
**size** | [**kotlin.Long**](.md) |  |  [optional]
**type** | [**inline**](#TypeEnum) |  |  [optional]
**uploadedAt** | [**kotlin.Long**](.md) |  |  [optional]
**url** | [**kotlin.String**](.md) |  |  [optional]
**userId** | [**kotlin.String**](.md) |  |  [optional]

<a name="AccessEnum"></a>
## Enum: access
Name | Value
---- | -----
access | PRIVATE, PUBLIC

<a name="DiskEnum"></a>
## Enum: disk
Name | Value
---- | -----
disk | ABRAMAD, ARVAN, BLOB, LOCAL, S3

<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | FILE, FOLDER
