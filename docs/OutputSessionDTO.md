# OutputSessionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | [**kotlin.String**](.md) |  |  [optional]
**categoryName** | [**kotlin.String**](.md) |  |  [optional]
**clientAvatar** | [**kotlin.String**](.md) |  |  [optional]
**clientFirstName** | [**kotlin.String**](.md) |  |  [optional]
**clientLastName** | [**kotlin.String**](.md) |  |  [optional]
**comment** | [**kotlin.String**](.md) |  |  [optional]
**consultingName** | [**inline**](#ConsultingNameEnum) |  |  [optional]
**duration** | [**kotlin.Long**](.md) |  |  [optional]
**lawyerAvatar** | [**kotlin.String**](.md) |  |  [optional]
**lawyerFirstName** | [**kotlin.String**](.md) |  |  [optional]
**lawyerId** | [**kotlin.String**](.md) |  |  [optional]
**lawyerLastName** | [**kotlin.String**](.md) |  |  [optional]
**lawyerType** | [**kotlin.String**](.md) |  |  [optional]
**negativeOpinions** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**numberOfRemainingQuestions** | [**kotlin.Int**](.md) |  |  [optional]
**orderNumber** | [**kotlin.String**](.md) |  |  [optional]
**positiveOpinions** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**rate** | [**kotlin.Int**](.md) |  |  [optional]
**selectedDate** | [**kotlin.String**](.md) |  |  [optional]
**selectedTime** | [**FromToTime**](FromToTime.md) |  |  [optional]
**sessionMessages** | [**kotlin.Array&lt;SessionMessage&gt;**](SessionMessage.md) |  |  [optional]
**sessionStartTime** | [**kotlin.String**](.md) |  |  [optional]
**state** | [**inline**](#StateEnum) |  |  [optional]
**turn** | [**inline**](#TurnEnum) |  |  [optional]

<a name="ConsultingNameEnum"></a>
## Enum: consultingName
Name | Value
---- | -----
consultingName | OFFLINE, ONLINE, URGENT

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
