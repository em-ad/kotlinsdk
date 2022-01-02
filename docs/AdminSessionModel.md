# AdminSessionModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelRequestDateTime** | [**kotlin.String**](.md) |  |  [optional]
**cancellationOwner** | [**inline**](#CancellationOwnerEnum) |  |  [optional]
**cancellationReason** | [**kotlin.String**](.md) |  |  [optional]
**categoryId** | [**kotlin.String**](.md) |  |  [optional]
**clientFirstName** | [**kotlin.String**](.md) |  |  [optional]
**clientLastName** | [**kotlin.String**](.md) |  |  [optional]
**clientMobileNumber** | [**kotlin.String**](.md) |  |  [optional]
**consultingCost** | [**kotlin.Double**](.md) |  |  [optional]
**createdDate** | [**kotlin.String**](.md) |  |  [optional]
**extendRequestDateTime** | [**kotlin.String**](.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**isExtendRequested** | [**kotlin.Boolean**](.md) |  |  [optional]
**lawyerFirstName** | [**kotlin.String**](.md) |  |  [optional]
**lawyerId** | [**kotlin.String**](.md) |  |  [optional]
**lawyerLastName** | [**kotlin.String**](.md) |  |  [optional]
**lawyerMobileNumber** | [**kotlin.String**](.md) |  |  [optional]
**orderNumber** | [**kotlin.String**](.md) |  |  [optional]
**rate** | [**kotlin.Int**](.md) |  |  [optional]
**selectedDate** | [**kotlin.String**](.md) |  |  [optional]
**selectedTime** | [**FromToTime**](FromToTime.md) |  |  [optional]
**sessionStartTime** | [**kotlin.String**](.md) |  |  [optional]
**state** | [**inline**](#StateEnum) |  |  [optional]
**type** | [**inline**](#TypeEnum) |  |  [optional]
**userId** | [**kotlin.String**](.md) |  |  [optional]

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

<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | OFFLINE, ONLINE, URGENT
