# LawyerCancellationsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lawyerId** | [**kotlin.String**](.md) |  |  [optional]
**packageId** | [**kotlin.String**](.md) |  |  [optional]
**selectedDate** | [**kotlin.String**](.md) |  |  [optional]
**selectedTime** | [**FromToTime**](FromToTime.md) |  |  [optional]
**sessionCancellationType** | [**inline**](#SessionCancellationTypeEnum) |  | 
**sessionId** | [**kotlin.String**](.md) |  | 
**sessionStartTime** | [**kotlin.String**](.md) |  |  [optional]

<a name="SessionCancellationTypeEnum"></a>
## Enum: sessionCancellationType
Name | Value
---- | -----
sessionCancellationType | CHANGE_DATE_TIME, CREATE_SESSION, RETURN_MONEY
