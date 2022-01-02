# WalletTransactionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**kotlin.Long**](.md) |  |  [optional]
**bankGatewayId** | [**kotlin.String**](.md) |  |  [optional]
**clientCallbackUrl** | [**kotlin.String**](.md) |  |  [optional]
**createDateIso** | [**kotlin.String**](.md) |  |  [optional]
**createdDateMilli** | [**kotlin.Long**](.md) |  |  [optional]
**currentState** | [**inline**](#CurrentStateEnum) |  |  [optional]
**description** | [**kotlin.String**](.md) |  |  [optional]
**id** | [**kotlin.String**](.md) |  |  [optional]
**paymentLink** | [**kotlin.String**](.md) |  |  [optional]
**refId** | [**kotlin.String**](.md) |  |  [optional]
**relatedId** | [**kotlin.String**](.md) | fill if you want to remember sth |  [optional]
**subscriberId** | [**kotlin.String**](.md) |  |  [optional]
**userId** | [**kotlin.String**](.md) |  |  [optional]
**walletTransactionType** | [**inline**](#WalletTransactionTypeEnum) |  |  [optional]

<a name="CurrentStateEnum"></a>
## Enum: currentState
Name | Value
---- | -----
currentState | DONE, WAITING_FOR_IPG_RESPONSE

<a name="WalletTransactionTypeEnum"></a>
## Enum: walletTransactionType
Name | Value
---- | -----
walletTransactionType | DEBIT, DEPOSIT, DEPOSIT_REMAINING
