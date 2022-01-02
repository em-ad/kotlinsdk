# OrganizationalCalendarDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar** | [**kotlin.String**](.md) |  |  [optional]
**createdDate** | [**kotlin.String**](.md) |  |  [optional]
**duration** | [**kotlin.Long**](.md) |  |  [optional]
**firstName** | [**kotlin.String**](.md) |  |  [optional]
**fullName** | [**kotlin.String**](.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**lastName** | [**kotlin.String**](.md) |  |  [optional]
**selectedDate** | [**kotlin.String**](.md) |  |  [optional]
**sessionStartTime** | [**kotlin.String**](.md) |  |  [optional]
**state** | [**inline**](#StateEnum) |  |  [optional]
**type** | [**inline**](#TypeEnum) |  |  [optional]
**userId** | [**kotlin.String**](.md) |  |  [optional]

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
