# CreateSubscriberWalletTransactionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**kotlin.Long**](.md) |  |  [optional]
**bankGatewayId** | [**kotlin.String**](.md) |  |  [optional]
**clientCallbackUrl** | [**kotlin.String**](.md) |  |  [optional]
**description** | [**kotlin.String**](.md) |  |  [optional]
**relatedId** | [**kotlin.String**](.md) |  |  [optional]
**walletTransactionType** | [**inline**](#WalletTransactionTypeEnum) |  |  [optional]

<a name="WalletTransactionTypeEnum"></a>
## Enum: walletTransactionType
Name | Value
---- | -----
walletTransactionType | DEBIT, DEPOSIT, DEPOSIT_REMAINING
