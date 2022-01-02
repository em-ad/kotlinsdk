# Session

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelRequestDateTime** | [**kotlin.String**](.md) |  |  [optional]
**cancellationOwner** | [**inline**](#CancellationOwnerEnum) |  |  [optional]
**cancellationReason** | [**kotlin.String**](.md) |  |  [optional]
**categoryId** | [**kotlin.String**](.md) |  |  [optional]
**consultingCost** | [**kotlin.Double**](.md) |  |  [optional]
**createdDate** | [**kotlin.String**](.md) |  |  [optional]
**deleted** | [**kotlin.Boolean**](.md) |  |  [optional]
**deletedAt** | [**kotlin.String**](.md) |  |  [optional]
**duration** | [**kotlin.Long**](.md) |  |  [optional]
**extendRequestDateTime** | [**kotlin.String**](.md) |  |  [optional]
**histories** | [**kotlin.Array&lt;SessionHistory&gt;**](SessionHistory.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**isCancelRequested** | [**kotlin.Boolean**](.md) |  |  [optional]
**isExtendRequested** | [**kotlin.Boolean**](.md) |  |  [optional]
**isNotifySend** | [**kotlin.Boolean**](.md) |  |  [optional]
**lastModifiedDate** | [**kotlin.String**](.md) |  |  [optional]
**lawyerId** | [**kotlin.String**](.md) |  |  [optional]
**new** | [**kotlin.Boolean**](.md) |  |  [optional]
**numberOfRemainingQuestions** | [**kotlin.Int**](.md) |  |  [optional]
**orderNumber** | [**kotlin.String**](.md) |  |  [optional]
**packageId** | [**kotlin.String**](.md) |  |  [optional]
**roomId** | [**kotlin.String**](.md) |  |  [optional]
**selectedDate** | [**kotlin.String**](.md) |  |  [optional]
**selectedTime** | [**FromToTime**](FromToTime.md) |  |  [optional]
**sessionEndTime** | [**kotlin.String**](.md) |  |  [optional]
**sessionMessages** | [**kotlin.Array&lt;SessionMessage&gt;**](SessionMessage.md) |  |  [optional]
**sessionStartTime** | [**kotlin.String**](.md) |  |  [optional]
**skillId** | [**kotlin.String**](.md) |  |  [optional]
**state** | [**inline**](#StateEnum) |  |  [optional]
**turn** | [**inline**](#TurnEnum) |  |  [optional]
**type** | [**inline**](#TypeEnum) |  |  [optional]
**userId** | [**kotlin.String**](.md) |  |  [optional]
**version** | [**kotlin.Long**](.md) |  |  [optional]

<a name="CancellationOwnerEnum"></a>
## Enum: cancellationOwner
Name | Value
---- | -----
cancellationOwner | ALL, CLIENT, LAWYER, LIST

<a name="StateEnum"></a>
## Enum: state
Name | Value
---- | -----
state | CANCELED, CREATED, DONE, FINISHED_CREATED, FINISHED_RESERVED, PENDING, RESERVED, RESERVED_START_TIME_SET

<a name="TurnEnum"></a>
## Enum: turn
Name | Value
---- | -----
turn | ALL, CLIENT, LAWYER, LIST

<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | OFFLINE, ONLINE, URGENT
