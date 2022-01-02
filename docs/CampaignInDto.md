# CampaignInDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) |  |  [optional]
**name** | [**kotlin.String**](.md) |  |  [optional]
**ownerCampaignType** | [**inline**](#OwnerCampaignTypeEnum) |  |  [optional]
**ownerChargeType** | [**inline**](#OwnerChargeTypeEnum) |  |  [optional]
**ownerChargeValue** | [**kotlin.Long**](.md) |  |  [optional]
**targetCampaignType** | [**inline**](#TargetCampaignTypeEnum) |  |  [optional]
**targetChargeType** | [**inline**](#TargetChargeTypeEnum) |  |  [optional]
**targetChargeValue** | [**kotlin.Long**](.md) |  |  [optional]

<a name="OwnerCampaignTypeEnum"></a>
## Enum: ownerCampaignType
Name | Value
---- | -----
ownerCampaignType | DISCOUNT, WALLET

<a name="OwnerChargeTypeEnum"></a>
## Enum: ownerChargeType
Name | Value
---- | -----
ownerChargeType | CREDIT, PERCENT, VALUE

<a name="TargetCampaignTypeEnum"></a>
## Enum: targetCampaignType
Name | Value
---- | -----
targetCampaignType | DISCOUNT, WALLET

<a name="TargetChargeTypeEnum"></a>
## Enum: targetChargeType
Name | Value
---- | -----
targetChargeType | CREDIT, PERCENT, VALUE
