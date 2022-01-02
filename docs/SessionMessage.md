# SessionMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdDate** | [**kotlin.String**](.md) |  |  [optional]
**deleted** | [**kotlin.Boolean**](.md) |  |  [optional]
**fileSize** | [**kotlin.String**](.md) |  |  [optional]
**fileUrl** | [**kotlin.String**](.md) |  |  [optional]
**filename** | [**kotlin.String**](.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**lastModifiedDate** | [**kotlin.String**](.md) |  |  [optional]
**messageState** | [**inline**](#MessageStateEnum) |  |  [optional]
**messageType** | [**inline**](#MessageTypeEnum) |  |  [optional]
**owner** | [**inline**](#OwnerEnum) |  |  [optional]
**text** | [**kotlin.String**](.md) |  |  [optional]
**userId** | [**kotlin.String**](.md) |  |  [optional]
**version** | [**kotlin.Long**](.md) |  |  [optional]

<a name="MessageStateEnum"></a>
## Enum: messageState
Name | Value
---- | -----
messageState | DRAFT, PUBLISHED

<a name="MessageTypeEnum"></a>
## Enum: messageType
Name | Value
---- | -----
messageType | DOCUMENT, IMAGE, TEXT, VOICE

<a name="OwnerEnum"></a>
## Enum: owner
Name | Value
---- | -----
owner | BOT, CLIENT, LAWYER
