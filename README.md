# io.swagger.client - Kotlin client library for Datyar REST APIs

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://datyar.vaslapp.com:443*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationControllerApi* | [**addApplication**](docs/ApplicationControllerApi.md#addapplication) | **POST** /api/v1/security-server/application | add
*ApplicationControllerApi* | [**deleteApplication**](docs/ApplicationControllerApi.md#deleteapplication) | **DELETE** /api/v1/security-server/application/{id} | deleteApplication
*ApplicationControllerApi* | [**editApplication**](docs/ApplicationControllerApi.md#editapplication) | **PUT** /api/v1/security-server/application | editApplication
*ApplicationControllerApi* | [**getAllApplications**](docs/ApplicationControllerApi.md#getallapplications) | **GET** /api/v1/security-server/application | getAllApplications
*ApplicationControllerApi* | [**getApplication**](docs/ApplicationControllerApi.md#getapplication) | **GET** /api/v1/security-server/application/{id} | getApplication
*ApplicationControllerApi* | [**getPrivileges**](docs/ApplicationControllerApi.md#getprivileges) | **GET** /api/v1/security-server/application/privileges | getPrivileges
*ApplicationControllerApi* | [**selectiveEditAddApplicationUsingPATCH1**](docs/ApplicationControllerApi.md#selectiveeditaddapplicationusingpatch1) | **PATCH** /api/v1/security-server/application/add | selectiveEditAddApplication
*ApplicationControllerApi* | [**selectiveEditRemoveApplicationUsingPATCH1**](docs/ApplicationControllerApi.md#selectiveeditremoveapplicationusingpatch1) | **PATCH** /api/v1/security-server/application/remove | selectiveEditRemoveApplication
*ApplicationVersionControllerApi* | [**create**](docs/ApplicationVersionControllerApi.md#create) | **POST** /api/v1/application/versions | create
*ApplicationVersionControllerApi* | [**delete**](docs/ApplicationVersionControllerApi.md#delete) | **DELETE** /api/v1/application/versions/{id} | delete
*ApplicationVersionControllerApi* | [**get**](docs/ApplicationVersionControllerApi.md#get) | **GET** /api/v1/application/versions/{id} | get
*ApplicationVersionControllerApi* | [**getAll**](docs/ApplicationVersionControllerApi.md#getall) | **GET** /api/v1/application/versions | getAll
*ApplicationVersionControllerApi* | [**getStatus**](docs/ApplicationVersionControllerApi.md#getstatus) | **GET** /api/v1/application/versions/status | getStatus
*ApplicationVersionControllerApi* | [**update**](docs/ApplicationVersionControllerApi.md#update) | **PUT** /api/v1/application/versions/{id} | update
*BankCardControllerApi* | [**createBankCard**](docs/BankCardControllerApi.md#createbankcard) | **POST** /api/v1/wallet/bank-card | create
*BankCardControllerApi* | [**deleteBankCard**](docs/BankCardControllerApi.md#deletebankcard) | **DELETE** /api/v1/wallet/bank-card/{id} | deleteBankCard
*BankCardControllerApi* | [**getAllBankCards**](docs/BankCardControllerApi.md#getallbankcards) | **GET** /api/v1/wallet/bank-card | getAllBankCards
*BankCardControllerApi* | [**getBankCard**](docs/BankCardControllerApi.md#getbankcard) | **GET** /api/v1/wallet/bank-card/{id} | getBankCard
*BankCardControllerApi* | [**setDefaultCard**](docs/BankCardControllerApi.md#setdefaultcard) | **PUT** /api/v1/wallet/bank-card/select/{card-id} | setDefaultCard
*BankCardControllerApi* | [**updateBankCard**](docs/BankCardControllerApi.md#updatebankcard) | **PUT** /api/v1/wallet/bank-card/{id} | update
*BankGatewayControllerApi* | [**createBankGateway**](docs/BankGatewayControllerApi.md#createbankgateway) | **POST** /api/v1/ipg/bank-gateway | create
*BankGatewayControllerApi* | [**delete1**](docs/BankGatewayControllerApi.md#delete1) | **DELETE** /api/v1/ipg/bank-gateway/{id} | delete
*BankGatewayControllerApi* | [**get1**](docs/BankGatewayControllerApi.md#get1) | **GET** /api/v1/ipg/bank-gateway/{id} | get
*BankGatewayControllerApi* | [**getAllBankGateway**](docs/BankGatewayControllerApi.md#getallbankgateway) | **GET** /api/v1/ipg/bank-gateway | getAllBankGateway
*BankGatewayControllerApi* | [**getAllEnabledBankGateway**](docs/BankGatewayControllerApi.md#getallenabledbankgateway) | **GET** /api/v1/ipg/bank-gateway/enabled | getAllEnabledBankGateway
*BankGatewayControllerApi* | [**updateBankGateway**](docs/BankGatewayControllerApi.md#updatebankgateway) | **PUT** /api/v1/ipg/bank-gateway/{id} | update
*CampaignControllerApi* | [**createCampaign**](docs/CampaignControllerApi.md#createcampaign) | **POST** /api/v1/campaign/campaigns | don’t fill id.create Campaign 
*CampaignControllerApi* | [**deleteCampaign**](docs/CampaignControllerApi.md#deletecampaign) | **DELETE** /api/v1/campaign/campaigns/{id} | deleteCampaign
*CampaignControllerApi* | [**getCampaign**](docs/CampaignControllerApi.md#getcampaign) | **GET** /api/v1/campaign/campaigns/{id} | getCampaign
*CampaignControllerApi* | [**getListCampaign**](docs/CampaignControllerApi.md#getlistcampaign) | **GET** /api/v1/campaign/campaigns | getListCampaign
*CampaignControllerApi* | [**updateCampaign**](docs/CampaignControllerApi.md#updatecampaign) | **PUT** /api/v1/campaign/campaigns/{id} | Update
*ChargeCodeControllerApi* | [**createChargeCode**](docs/ChargeCodeControllerApi.md#createchargecode) | **POST** /api/v1/discount/charge-code | createChargeCode
*ChargeCodeControllerApi* | [**deleteChargeCode**](docs/ChargeCodeControllerApi.md#deletechargecode) | **DELETE** /api/v1/discount/charge-code/{id} | deleteChargeCode
*ChargeCodeControllerApi* | [**doUserTransactionWithChargeCode**](docs/ChargeCodeControllerApi.md#dousertransactionwithchargecode) | **POST** /api/v1/discount/charge-code/transaction/{chargeCode} | doUserTransactionWithChargeCode
*ChargeCodeControllerApi* | [**getLisCharge**](docs/ChargeCodeControllerApi.md#getlischarge) | **GET** /api/v1/discount/charge-code | getLisCharge
*ChargeCodeControllerApi* | [**updateChargeCodeUsingPATCH1**](docs/ChargeCodeControllerApi.md#updatechargecodeusingpatch1) | **PATCH** /api/v1/discount/charge-code/{id} | updateChargeCode
*ConsultingConfigurationApi* | [**changeConfigUsingPATCH1**](docs/ConsultingConfigurationApi.md#changeconfigusingpatch1) | **PATCH** /api/v1/datyar/consulting/configurations/{user-id} | changeConfig
*ConsultingConfigurationApi* | [**changeConfigUsingPATCH2**](docs/ConsultingConfigurationApi.md#changeconfigusingpatch2) | **PATCH** /api/v1/datyar/consulting/lawyer/configurations | changeConfig
*ConsultingConfigurationApi* | [**createSetting**](docs/ConsultingConfigurationApi.md#createsetting) | **POST** /api/v1/datyar/consulting/settings | createSetting
*ConsultingConfigurationApi* | [**getAllConfigs**](docs/ConsultingConfigurationApi.md#getallconfigs) | **GET** /api/v1/datyar/consulting/configurations | getAllConfigs
*ConsultingConfigurationApi* | [**getConfig**](docs/ConsultingConfigurationApi.md#getconfig) | **GET** /api/v1/datyar/consulting/configurations/{consulting-type} | getConfig
*ConsultingConfigurationApi* | [**getConfig1**](docs/ConsultingConfigurationApi.md#getconfig1) | **GET** /api/v1/datyar/consulting/configurations/{user-id}/{consulting-type} | getConfig
*ConsultingConfigurationApi* | [**getServices**](docs/ConsultingConfigurationApi.md#getservices) | **GET** /api/v1/datyar/consulting/services/{user-id} | getServices
*ConsultingConfigurationApi* | [**getSetting**](docs/ConsultingConfigurationApi.md#getsetting) | **GET** /api/v1/datyar/consulting/settings/{consultation-type} | getSetting
*ConsultingConfigurationApi* | [**getSettingPackages**](docs/ConsultingConfigurationApi.md#getsettingpackages) | **GET** /api/v1/datyar/consulting/settings/packages/{consultation-type} | getSettingPackages
*ConsultingConfigurationApi* | [**updatePackage**](docs/ConsultingConfigurationApi.md#updatepackage) | **PUT** /api/v1/datyar/consulting/settings/packages/{consultation-type} | updatePackage
*ConsultingConfigurationApi* | [**updateSetting**](docs/ConsultingConfigurationApi.md#updatesetting) | **PUT** /api/v1/datyar/consulting/settings | updateSetting
*ContentAdminCommentApi* | [**editCommentUsingPATCH1**](docs/ContentAdminCommentApi.md#editcommentusingpatch1) | **PATCH** /api/v1/admin-comments/edit | editComment
*ContentAdminCommentApi* | [**getAllComments**](docs/ContentAdminCommentApi.md#getallcomments) | **GET** /api/v1/admin-comments | getAllComments
*ContentAdminCommentApi* | [**getCommentList**](docs/ContentAdminCommentApi.md#getcommentlist) | **GET** /api/v1/admin-comments/{postId} | getCommentList
*ContentCategoryControllerApi* | [**addCategory**](docs/ContentCategoryControllerApi.md#addcategory) | **POST** /api/v1/contents/categories | addCategory
*ContentCategoryControllerApi* | [**categoryList**](docs/ContentCategoryControllerApi.md#categorylist) | **GET** /api/v1/contents/categories | categoryList
*ContentCategoryControllerApi* | [**deleteCategory**](docs/ContentCategoryControllerApi.md#deletecategory) | **DELETE** /api/v1/contents/categories/{categoryId} | deleteCategory
*ContentCategoryControllerApi* | [**editCategory**](docs/ContentCategoryControllerApi.md#editcategory) | **PUT** /api/v1/contents/categories/{categoryId} | editCategory
*ContentCategoryControllerApi* | [**getCategory**](docs/ContentCategoryControllerApi.md#getcategory) | **GET** /api/v1/contents/categories/{categoryId} | getCategory
*ContentCategoryControllerApi* | [**getCategoryTree**](docs/ContentCategoryControllerApi.md#getcategorytree) | **GET** /api/v1/contents/categories/tree | getCategoryTree
*ContentCategoryControllerApi* | [**getListWithSub**](docs/ContentCategoryControllerApi.md#getlistwithsub) | **GET** /api/v1/contents/categories/all | getListWithSub
*ContentControllerApi* | [**addContent**](docs/ContentControllerApi.md#addcontent) | **POST** /api/v1/contents | addContent
*ContentControllerApi* | [**addUserRate**](docs/ContentControllerApi.md#adduserrate) | **POST** /api/v1/contents/{contentId}/user-rate | addUserRate
*ContentControllerApi* | [**deleteContent**](docs/ContentControllerApi.md#deletecontent) | **DELETE** /api/v1/contents/{contentId} | deleteContent
*ContentControllerApi* | [**editContent**](docs/ContentControllerApi.md#editcontent) | **PUT** /api/v1/contents/{contentId} | editContent
*ContentControllerApi* | [**getContent**](docs/ContentControllerApi.md#getcontent) | **GET** /api/v1/contents/{contentId} | getContent
*ContentControllerApi* | [**getContentList**](docs/ContentControllerApi.md#getcontentlist) | **GET** /api/v1/contents | getContentList
*ContentControllerApi* | [**getContentLocationsList**](docs/ContentControllerApi.md#getcontentlocationslist) | **GET** /api/v1/contents/locations | getContentLocationsList
*ContentPropertyControllerApi* | [**createProperty**](docs/ContentPropertyControllerApi.md#createproperty) | **POST** /api/v1/contents/properties | createProperty
*ContentPropertyControllerApi* | [**deleteProperty**](docs/ContentPropertyControllerApi.md#deleteproperty) | **DELETE** /api/v1/contents/properties/{id} | deleteProperty
*ContentPropertyControllerApi* | [**getPropertiesList**](docs/ContentPropertyControllerApi.md#getpropertieslist) | **GET** /api/v1/contents/properties | getPropertiesList
*ContentPropertyControllerApi* | [**getProperty**](docs/ContentPropertyControllerApi.md#getproperty) | **GET** /api/v1/contents/properties/{id} | getProperty
*ContentPropertyControllerApi* | [**updateProperty**](docs/ContentPropertyControllerApi.md#updateproperty) | **PUT** /api/v1/contents/properties/{id} | updateProperty
*ContentTagControllerApi* | [**create1**](docs/ContentTagControllerApi.md#create1) | **POST** /api/v1/contents/tags | create
*ContentTagControllerApi* | [**delete2**](docs/ContentTagControllerApi.md#delete2) | **DELETE** /api/v1/contents/tags/{id} | delete
*ContentTagControllerApi* | [**get2**](docs/ContentTagControllerApi.md#get2) | **GET** /api/v1/contents/tags/{id} | get
*ContentTagControllerApi* | [**getList**](docs/ContentTagControllerApi.md#getlist) | **GET** /api/v1/contents/tags | getList
*ContentTagControllerApi* | [**update1**](docs/ContentTagControllerApi.md#update1) | **PUT** /api/v1/contents/tags/{id} | update
*CountryControllerApi* | [**getCities**](docs/CountryControllerApi.md#getcities) | **GET** /api/v1/location/countries/states/cities | getCities
*CountryControllerApi* | [**getCountries**](docs/CountryControllerApi.md#getcountries) | **GET** /api/v1/location/countries | getCountries
*CountryControllerApi* | [**getStates**](docs/CountryControllerApi.md#getstates) | **GET** /api/v1/location/countries/states | getStates
*DiscountControllerApi* | [**changeState**](docs/DiscountControllerApi.md#changestate) | **PUT** /api/v1/discount/discounts/state/{id} | state
*DiscountControllerApi* | [**createDiscount**](docs/DiscountControllerApi.md#creatediscount) | **POST** /api/v1/discount/discounts | create
*DiscountControllerApi* | [**deleteDiscount**](docs/DiscountControllerApi.md#deletediscount) | **DELETE** /api/v1/discount/discounts/{id} | deleteDiscount
*DiscountControllerApi* | [**getDiscount**](docs/DiscountControllerApi.md#getdiscount) | **GET** /api/v1/discount/discounts/{id} | getDiscount
*DiscountControllerApi* | [**getListDiscount**](docs/DiscountControllerApi.md#getlistdiscount) | **GET** /api/v1/discount/discounts | getListDiscount
*DiscountControllerApi* | [**getReport**](docs/DiscountControllerApi.md#getreport) | **GET** /api/v1/discount/discounts/report | getReport
*DiscountControllerApi* | [**updateDiscount**](docs/DiscountControllerApi.md#updatediscount) | **PUT** /api/v1/discount/discounts/{id} | Update
*DiscountSubscriberLogControllerApi* | [**createDiscountSubscriberLog**](docs/DiscountSubscriberLogControllerApi.md#creatediscountsubscriberlog) | **POST** /api/v1/discount/discount-subscriberlog/{code} | create
*DiscountSubscriberLogControllerApi* | [**deleteDiscountSubscriberLog**](docs/DiscountSubscriberLogControllerApi.md#deletediscountsubscriberlog) | **DELETE** /api/v1/discount/discount-subscriberlog/{id} | deleteDiscountSubscriberLog
*DiscountSubscriberLogControllerApi* | [**getDiscountLogFilter**](docs/DiscountSubscriberLogControllerApi.md#getdiscountlogfilter) | **GET** /api/v1/discount/discount-subscriberlog/filter/ | getDiscountLogFilter
*DiscountSubscriberLogControllerApi* | [**getDiscountSubscriberLog**](docs/DiscountSubscriberLogControllerApi.md#getdiscountsubscriberlog) | **GET** /api/v1/discount/discount-subscriberlog/{id} | getDiscountSubscriberLog
*DiscountSubscriberLogControllerApi* | [**getListDiscountSubscriberLog**](docs/DiscountSubscriberLogControllerApi.md#getlistdiscountsubscriberlog) | **GET** /api/v1/discount/discount-subscriberlog | getListDiscountSubscriberLog
*DiscountSubscriberLogControllerApi* | [**getUsageReport**](docs/DiscountSubscriberLogControllerApi.md#getusagereport) | **GET** /api/v1/discount/discount-subscriberlog/report/usage | getUsageReport
*DiscountSubscriberLogControllerApi* | [**getValidationSubscriber**](docs/DiscountSubscriberLogControllerApi.md#getvalidationsubscriber) | **GET** /api/v1/discount/discount-subscriberlog/valid/{discountCode} | getValidationSubscriber
*DiscountSubscriberLogControllerApi* | [**updateDiscountSubscriberLog**](docs/DiscountSubscriberLogControllerApi.md#updatediscountsubscriberlog) | **PUT** /api/v1/discount/discount-subscriberlog/{id} | Update
*DiscountSubscriberLogControllerApi* | [**validateDiscountByCodeAndAmount**](docs/DiscountSubscriberLogControllerApi.md#validatediscountbycodeandamount) | **GET** /api/v1/discount/discount-subscriberlog/validate/{code}/{amount} | validateDiscountByCodeAndAmount
*DiscountUserLogControllerApi* | [**createDiscountUserLog**](docs/DiscountUserLogControllerApi.md#creatediscountuserlog) | **POST** /api/v1/discount/discount-userlog/{code} | create
*DiscountUserLogControllerApi* | [**deleteDiscountUserLog**](docs/DiscountUserLogControllerApi.md#deletediscountuserlog) | **DELETE** /api/v1/discount/discount-userlog/{id} | deleteDiscountUserLog
*DiscountUserLogControllerApi* | [**getDiscountLogFilter1**](docs/DiscountUserLogControllerApi.md#getdiscountlogfilter1) | **GET** /api/v1/discount/discount-userlog/filter/ | getDiscountLogFilter
*DiscountUserLogControllerApi* | [**getDiscountUserLog**](docs/DiscountUserLogControllerApi.md#getdiscountuserlog) | **GET** /api/v1/discount/discount-userlog/{id} | getDiscountUserLog
*DiscountUserLogControllerApi* | [**getListDiscountUserLog**](docs/DiscountUserLogControllerApi.md#getlistdiscountuserlog) | **GET** /api/v1/discount/discount-userlog | getListDiscountUserLog
*DiscountUserLogControllerApi* | [**getUsageReport1**](docs/DiscountUserLogControllerApi.md#getusagereport1) | **GET** /api/v1/discount/discount-userlog/report/usage | getUsageReport
*DiscountUserLogControllerApi* | [**getValidationUser**](docs/DiscountUserLogControllerApi.md#getvalidationuser) | **GET** /api/v1/discount/discount-userlog/valid/{discountCode} | getValidationUser
*DiscountUserLogControllerApi* | [**updateDiscountUserLog**](docs/DiscountUserLogControllerApi.md#updatediscountuserlog) | **PUT** /api/v1/discount/discount-userlog/{id} | Update
*DiscountUserLogControllerApi* | [**validateCodeWithAmount**](docs/DiscountUserLogControllerApi.md#validatecodewithamount) | **POST** /api/v1/discount/discount-userlog/validate | validateCodeWithAmount
*DiscountUserLogControllerApi* | [**validateDiscountByCodeAndAmount1**](docs/DiscountUserLogControllerApi.md#validatediscountbycodeandamount1) | **GET** /api/v1/discount/discount-userlog/validate/{code}/{amount} | validateDiscountByCodeAndAmount
*FileControllerApi* | [**createFolder**](docs/FileControllerApi.md#createfolder) | **POST** /api/v1/file/folder | createFolder
*FileControllerApi* | [**delete3**](docs/FileControllerApi.md#delete3) | **DELETE** /api/v1/file/{id} | delete
*FileControllerApi* | [**get6**](docs/FileControllerApi.md#get6) | **GET** /api/v1/file/{id} | get
*FileControllerApi* | [**getContent1**](docs/FileControllerApi.md#getcontent1) | **GET** /api/v1/file/folder/{folderId} | getContent
*FileControllerApi* | [**getRoot**](docs/FileControllerApi.md#getroot) | **GET** /api/v1/file/folder/root | getRoot
*FileControllerApi* | [**upload**](docs/FileControllerApi.md#upload) | **POST** /api/v1/file/upload | upload
*FileControllerApi* | [**uploadPrivateUserFile**](docs/FileControllerApi.md#uploadprivateuserfile) | **POST** /api/v1/file/upload/user/private | uploadPrivateUserFile
*FileControllerApi* | [**uploadPublicFile**](docs/FileControllerApi.md#uploadpublicfile) | **POST** /api/v1/file/upload/public-file | uploadPublicFile
*FileControllerApi* | [**uploadPublicFileWithFolderName**](docs/FileControllerApi.md#uploadpublicfilewithfoldername) | **POST** /api/v1/file/upload/public-file-with-folder-name | uploadPublicFileWithFolderName
*FileControllerApi* | [**uploadPublicUserFile**](docs/FileControllerApi.md#uploadpublicuserfile) | **POST** /api/v1/file/upload/user/public | uploadPublicUserFile
*FileControllerApi* | [**uploadWithFolderName**](docs/FileControllerApi.md#uploadwithfoldername) | **POST** /api/v1/file/upload/folder-name | uploadWithFolderName
*GeoControllerApi* | [**create3**](docs/GeoControllerApi.md#create3) | **POST** /api/v1/geo | create
*GeoControllerApi* | [**delete4**](docs/GeoControllerApi.md#delete4) | **DELETE** /api/v1/geo/{id} | delete
*GeoControllerApi* | [**get7**](docs/GeoControllerApi.md#get7) | **GET** /api/v1/geo/{id} | get
*GeoControllerApi* | [**getList1**](docs/GeoControllerApi.md#getlist1) | **GET** /api/v1/geo | getList
*GeoControllerApi* | [**update2**](docs/GeoControllerApi.md#update2) | **PUT** /api/v1/geo/{id} | update
*InboxControllerV2Api* | [**delete5**](docs/InboxControllerV2Api.md#delete5) | **DELETE** /api/v2/inbox/{id} | delete
*InboxControllerV2Api* | [**get8**](docs/InboxControllerV2Api.md#get8) | **GET** /api/v2/inbox/user/{id} | get
*InboxControllerV2Api* | [**getAll1**](docs/InboxControllerV2Api.md#getall1) | **GET** /api/v2/inbox | getAll
*InboxControllerV2Api* | [**getStatus1**](docs/InboxControllerV2Api.md#getstatus1) | **GET** /api/v2/inbox/status | getStatus
*InboxControllerV2Api* | [**getUserNotifications**](docs/InboxControllerV2Api.md#getusernotifications) | **GET** /api/v2/inbox/user | getUserNotifications
*InboxControllerV2Api* | [**update3**](docs/InboxControllerV2Api.md#update3) | **PUT** /api/v2/inbox/{id} | update
*InitialProfileControllerApi* | [**createInitialProfile**](docs/InitialProfileControllerApi.md#createinitialprofile) | **POST** /api/v1/datyar/initial-profile | initial profile
*InitialProfileControllerApi* | [**createLawyerType**](docs/InitialProfileControllerApi.md#createlawyertype) | **POST** /api/v1/datyar/initial-profile/lawyerType | lawyerType
*InitialProfileControllerApi* | [**getListLawyerType**](docs/InitialProfileControllerApi.md#getlistlawyertype) | **GET** /api/v1/datyar/initial-profile/lawyer-type | ListLawyerType 
*InitialProfileControllerApi* | [**insertLawyersLicenceWithPhotos**](docs/InitialProfileControllerApi.md#insertlawyerslicencewithphotos) | **POST** /api/v1/datyar/initial-profile/lawyers-licence | LawyersLicence
*InitialProfileControllerApi* | [**insertLawyersResumeAndDegree**](docs/InitialProfileControllerApi.md#insertlawyersresumeanddegree) | **POST** /api/v1/datyar/initial-profile/lawyers-resume-degree | Lawyers lawyers resume degree
*InitialProfileControllerApi* | [**insertSelectSKill**](docs/InitialProfileControllerApi.md#insertselectskill) | **POST** /api/v1/datyar/initial-profile/select-skill | Select skill
*InitialProfileControllerApi* | [**uploadInitialProfile**](docs/InitialProfileControllerApi.md#uploadinitialprofile) | **POST** /api/v1/datyar/initial-profile/upload-file | upload InitialProfile
*IpgTransactionControllerApi* | [**createIpgTransaction**](docs/IpgTransactionControllerApi.md#createipgtransaction) | **POST** /api/v1/ipg/transaction | create
*IpgTransactionControllerApi* | [**deleteIpgTransaction**](docs/IpgTransactionControllerApi.md#deleteipgtransaction) | **DELETE** /api/v1/ipg/transaction/{id} | deleteIpgTransaction
*IpgTransactionControllerApi* | [**getAllIpgTransaction**](docs/IpgTransactionControllerApi.md#getallipgtransaction) | **GET** /api/v1/ipg/transaction | getAllIpgTransaction
*IpgTransactionControllerApi* | [**getIpgTransaction**](docs/IpgTransactionControllerApi.md#getipgtransaction) | **GET** /api/v1/ipg/transaction/{id} | getIpgTransaction
*IpgTransactionControllerApi* | [**updateIpgTransaction**](docs/IpgTransactionControllerApi.md#updateipgtransaction) | **PUT** /api/v1/ipg/transaction/{id} | update
*LawyerApi* | [**checkInformation**](docs/LawyerApi.md#checkinformation) | **POST** /api/v1/datyar/lawyers/check-information | checkInformation
*LawyerApi* | [**create2**](docs/LawyerApi.md#create2) | **POST** /api/v1/datyar/lawyers/create | create
*LawyerApi* | [**get3**](docs/LawyerApi.md#get3) | **GET** /api/v1/datyar/lawyers/professional-profile | get
*LawyerApi* | [**get4**](docs/LawyerApi.md#get4) | **GET** /api/v1/datyar/lawyers/get/{user-id} | get
*LawyerApi* | [**getById**](docs/LawyerApi.md#getbyid) | **GET** /api/v1/datyar/lawyers/professional-profile/{id} | getById
*LawyerApi* | [**getCapabilityById**](docs/LawyerApi.md#getcapabilitybyid) | **GET** /api/v1/datyar/lawyers/capability/{lawyerId} | getCapabilityById
*LawyerApi* | [**getComments**](docs/LawyerApi.md#getcomments) | **GET** /api/v1/datyar/lawyers/comment/{lawyerId} | getComments
*LawyerApi* | [**getEducationalInformationById**](docs/LawyerApi.md#geteducationalinformationbyid) | **GET** /api/v1/datyar/lawyers/educational-information/{lawyerId} | getEducationalInformationById
*LawyerApi* | [**getLanguages**](docs/LawyerApi.md#getlanguages) | **GET** /api/v1/datyar/lawyers/languages | getLanguages
*LawyerApi* | [**getLawyerInformation**](docs/LawyerApi.md#getlawyerinformation) | **GET** /api/v1/datyar/lawyers/professional-profile/get/{user-id} | getLawyerInformation
*LawyerApi* | [**getPersonalInformationById**](docs/LawyerApi.md#getpersonalinformationbyid) | **GET** /api/v1/datyar/lawyers/personal-information/{lawyerId} | getPersonalInformationById
*LawyerApi* | [**getProfessionalInformationById**](docs/LawyerApi.md#getprofessionalinformationbyid) | **GET** /api/v1/datyar/lawyers/professional-information/{lawyerId} | getProfessionalInformationById
*LawyerApi* | [**getResumeById**](docs/LawyerApi.md#getresumebyid) | **GET** /api/v1/datyar/lawyers/resume/{lawyerId} | getResumeById
*LawyerApi* | [**lawyersList**](docs/LawyerApi.md#lawyerslist) | **GET** /api/v1/datyar/lawyers/consulting/get/{consultation-type} | lawyersList
*LawyerApi* | [**lawyersListWithPackage**](docs/LawyerApi.md#lawyerslistwithpackage) | **GET** /api/v1/datyar/lawyers/consulting/{user-id} | lawyersListWithPackage
*LawyerApi* | [**saveCapability**](docs/LawyerApi.md#savecapability) | **PUT** /api/v1/datyar/lawyers/capability | saveCapability
*LawyerApi* | [**saveCapabilityById**](docs/LawyerApi.md#savecapabilitybyid) | **PUT** /api/v1/datyar/lawyers/capability/{lawyerId} | saveCapabilityById
*LawyerApi* | [**saveEducationalInformation**](docs/LawyerApi.md#saveeducationalinformation) | **PUT** /api/v1/datyar/lawyers/educational-information | saveEducationalInformation
*LawyerApi* | [**saveEducationalInformationById**](docs/LawyerApi.md#saveeducationalinformationbyid) | **PUT** /api/v1/datyar/lawyers/educational-information/{lawyerId} | saveEducationalInformationById
*LawyerApi* | [**savePersonalInformation**](docs/LawyerApi.md#savepersonalinformation) | **PUT** /api/v1/datyar/lawyers/personal-information | savePersonalInformation
*LawyerApi* | [**savePersonalInformationById**](docs/LawyerApi.md#savepersonalinformationbyid) | **PUT** /api/v1/datyar/lawyers/personal-information/{lawyerId} | savePersonalInformationById
*LawyerApi* | [**saveProfessionalInformation**](docs/LawyerApi.md#saveprofessionalinformation) | **PUT** /api/v1/datyar/lawyers/professional-information | saveProfessionalInformation
*LawyerApi* | [**saveProfessionalInformation1**](docs/LawyerApi.md#saveprofessionalinformation1) | **PUT** /api/v1/datyar/lawyers/professional-information/{lawyerId} | saveProfessionalInformation
*LawyerApi* | [**saveResume**](docs/LawyerApi.md#saveresume) | **PUT** /api/v1/datyar/lawyers/resume | saveResume
*LawyerApi* | [**saveResumeById**](docs/LawyerApi.md#saveresumebyid) | **PUT** /api/v1/datyar/lawyers/resume/{lawyerId} | saveResumeById
*LawyerApi* | [**updateLawyerStateUsingPATCH1**](docs/LawyerApi.md#updatelawyerstateusingpatch1) | **PATCH** /api/v1/datyar/lawyers/change-state | updateLawyerState
*LikeControllerApi* | [**dislike**](docs/LikeControllerApi.md#dislike) | **DELETE** /api/v1/likes/{related-id} | dislike
*LikeControllerApi* | [**like**](docs/LikeControllerApi.md#like) | **POST** /api/v1/likes/{related-id} | like
*LocationApi* | [**addLocation**](docs/LocationApi.md#addlocation) | **POST** /api/v1/datyar/locations | addLocation
*LocationApi* | [**deleteLocation**](docs/LocationApi.md#deletelocation) | **DELETE** /api/v1/datyar/locations/{locationId} | deleteLocation
*LocationApi* | [**editLocation**](docs/LocationApi.md#editlocation) | **PUT** /api/v1/datyar/locations/{locationId} | editLocation
*LocationApi* | [**getLocation**](docs/LocationApi.md#getlocation) | **GET** /api/v1/datyar/locations/{locationId} | getLocation
*LocationApi* | [**getLocationsList**](docs/LocationApi.md#getlocationslist) | **GET** /api/v1/datyar/locations | getLocationsList
*LocationCategoryControllerApi* | [**addCategory1**](docs/LocationCategoryControllerApi.md#addcategory1) | **POST** /api/v1/locations/categories | addCategory
*LocationCategoryControllerApi* | [**categoriesList**](docs/LocationCategoryControllerApi.md#categorieslist) | **GET** /api/v1/locations/categories | categoriesList
*LocationCategoryControllerApi* | [**deleteCategory1**](docs/LocationCategoryControllerApi.md#deletecategory1) | **DELETE** /api/v1/locations/categories/{categoryId} | deleteCategory
*LocationCategoryControllerApi* | [**editCategory1**](docs/LocationCategoryControllerApi.md#editcategory1) | **PUT** /api/v1/locations/categories/{categoryId} | editCategory
*LocationCategoryControllerApi* | [**getCategory1**](docs/LocationCategoryControllerApi.md#getcategory1) | **GET** /api/v1/locations/categories/{categoryId} | getCategory
*LocationControllerApi* | [**addLocation1**](docs/LocationControllerApi.md#addlocation1) | **POST** /api/v1/locations | addLocation
*LocationControllerApi* | [**deleteLocation1**](docs/LocationControllerApi.md#deletelocation1) | **DELETE** /api/v1/locations/{locationId} | deleteLocation
*LocationControllerApi* | [**editLocation1**](docs/LocationControllerApi.md#editlocation1) | **PUT** /api/v1/locations/{locationId} | editLocation
*LocationControllerApi* | [**getLocation2**](docs/LocationControllerApi.md#getlocation2) | **GET** /api/v1/locations/{locationId} | getLocation
*LocationControllerApi* | [**getLocationsList2**](docs/LocationControllerApi.md#getlocationslist2) | **GET** /api/v1/locations | getLocationsList
*LocationControllerApi* | [**getPaginatedLocationsList**](docs/LocationControllerApi.md#getpaginatedlocationslist) | **GET** /api/v1/locations/paginatedLocations | getPaginatedLocationsList
*LocationPropertyControllerApi* | [**createProperty1**](docs/LocationPropertyControllerApi.md#createproperty1) | **POST** /api/v1/locations/properties | createProperty
*LocationPropertyControllerApi* | [**deleteProperty1**](docs/LocationPropertyControllerApi.md#deleteproperty1) | **DELETE** /api/v1/locations/properties/{id} | deleteProperty
*LocationPropertyControllerApi* | [**getPropertiesList1**](docs/LocationPropertyControllerApi.md#getpropertieslist1) | **GET** /api/v1/locations/properties | getPropertiesList
*LocationPropertyControllerApi* | [**getProperty1**](docs/LocationPropertyControllerApi.md#getproperty1) | **GET** /api/v1/locations/properties/{id} | getProperty
*LocationPropertyControllerApi* | [**updateProperty1**](docs/LocationPropertyControllerApi.md#updateproperty1) | **PUT** /api/v1/locations/properties/{id} | updateProperty
*LocationTagControllerApi* | [**create4**](docs/LocationTagControllerApi.md#create4) | **POST** /api/v1/locations/tags | create
*LocationTagControllerApi* | [**delete6**](docs/LocationTagControllerApi.md#delete6) | **DELETE** /api/v1/locations/tags/{id} | delete
*LocationTagControllerApi* | [**get9**](docs/LocationTagControllerApi.md#get9) | **GET** /api/v1/locations/tags/{id} | get
*LocationTagControllerApi* | [**getList2**](docs/LocationTagControllerApi.md#getlist2) | **GET** /api/v1/locations/tags | getList
*LocationTagControllerApi* | [**update4**](docs/LocationTagControllerApi.md#update4) | **PUT** /api/v1/locations/tags/{id} | update
*MailServerControllerApi* | [**activateMailServerUsingPATCH2**](docs/MailServerControllerApi.md#activatemailserverusingpatch2) | **PATCH** /api/v1/mgs/mail-server/{id} | activateMailServer
*MailServerControllerApi* | [**createMailServer1**](docs/MailServerControllerApi.md#createmailserver1) | **POST** /api/v1/mgs/mail-server | create
*MailServerControllerApi* | [**deleteMailServer1**](docs/MailServerControllerApi.md#deletemailserver1) | **DELETE** /api/v1/mgs/mail-server/{id} | deleteMailServer
*MailServerControllerApi* | [**getAllMailServers1**](docs/MailServerControllerApi.md#getallmailservers1) | **GET** /api/v1/mgs/mail-server | getAllMailServers
*MailServerControllerApi* | [**getMailServer1**](docs/MailServerControllerApi.md#getmailserver1) | **GET** /api/v1/mgs/mail-server/{id} | getMailServer
*MailServerControllerApi* | [**updateMailServer1**](docs/MailServerControllerApi.md#updatemailserver1) | **PUT** /api/v1/mgs/mail-server | updateMailServer
*MailServerControllerV2Api* | [**activateMailServerUsingPATCH1**](docs/MailServerControllerV2Api.md#activatemailserverusingpatch1) | **PATCH** /api/v2/notification/mail-server/{id} | activateMailServer
*MailServerControllerV2Api* | [**createMailServer**](docs/MailServerControllerV2Api.md#createmailserver) | **POST** /api/v2/notification/mail-server | create
*MailServerControllerV2Api* | [**deleteMailServer**](docs/MailServerControllerV2Api.md#deletemailserver) | **DELETE** /api/v2/notification/mail-server/{id} | deleteMailServer
*MailServerControllerV2Api* | [**getAllMailServers**](docs/MailServerControllerV2Api.md#getallmailservers) | **GET** /api/v2/notification/mail-server | getAllMailServers
*MailServerControllerV2Api* | [**getMailServer**](docs/MailServerControllerV2Api.md#getmailserver) | **GET** /api/v2/notification/mail-server/{id} | getMailServer
*MailServerControllerV2Api* | [**updateMailServer**](docs/MailServerControllerV2Api.md#updatemailserver) | **PUT** /api/v2/notification/mail-server | updateMailServer
*MgsSubscriberControllerApi* | [**sendMail**](docs/MgsSubscriberControllerApi.md#sendmail) | **POST** /api/v1/mgs/subscriber/mail | send simple email
*MgsSubscriberControllerApi* | [**sendSms**](docs/MgsSubscriberControllerApi.md#sendsms) | **POST** /api/v1/mgs/subscriber/sms | send simple sms
*MgsUserControllerApi* | [**sendMail1**](docs/MgsUserControllerApi.md#sendmail1) | **POST** /api/v1/mgs/user/mail | send simple email
*MgsUserControllerApi* | [**sendSms1**](docs/MgsUserControllerApi.md#sendsms1) | **POST** /api/v1/mgs/user/sms | send simple sms
*NotificationApi* | [**send**](docs/NotificationApi.md#send) | **POST** /api/v1/datyar/notification | send
*NotificationControllerApi* | [**create5**](docs/NotificationControllerApi.md#create5) | **POST** /api/v1/notifications | create
*NotificationControllerApi* | [**delete7**](docs/NotificationControllerApi.md#delete7) | **DELETE** /api/v1/notifications/{id} | delete
*NotificationControllerApi* | [**deleteAllNotifications**](docs/NotificationControllerApi.md#deleteallnotifications) | **DELETE** /api/v1/notifications/all | deleteAllNotifications
*NotificationControllerApi* | [**deleteSubscriberNotification**](docs/NotificationControllerApi.md#deletesubscribernotification) | **DELETE** /api/v1/notifications/subscriber/{id} | deleteSubscriberNotification
*NotificationControllerApi* | [**deleteSubscriberNotifications**](docs/NotificationControllerApi.md#deletesubscribernotifications) | **DELETE** /api/v1/notifications/subscriber | deleteSubscriberNotifications
*NotificationControllerApi* | [**deleteUserNotification**](docs/NotificationControllerApi.md#deleteusernotification) | **DELETE** /api/v1/notifications/user/{id} | deleteUserNotification
*NotificationControllerApi* | [**deleteUserNotifications**](docs/NotificationControllerApi.md#deleteusernotifications) | **DELETE** /api/v1/notifications/user | deleteUserNotifications
*NotificationControllerApi* | [**getAll2**](docs/NotificationControllerApi.md#getall2) | **GET** /api/v1/notifications | getAll
*NotificationControllerApi* | [**getAllSubscriberNotifications**](docs/NotificationControllerApi.md#getallsubscribernotifications) | **GET** /api/v1/notifications/subscriber | getAllSubscriberNotifications
*NotificationControllerApi* | [**getStatus2**](docs/NotificationControllerApi.md#getstatus2) | **GET** /api/v1/notifications/status | getStatus
*NotificationControllerApi* | [**getUserNotification**](docs/NotificationControllerApi.md#getusernotification) | **GET** /api/v1/notifications/{id} | getUserNotification
*NotificationControllerApi* | [**getUserNotifications1**](docs/NotificationControllerApi.md#getusernotifications1) | **GET** /api/v1/notifications/user | getUserNotifications
*NotificationControllerApi* | [**update5**](docs/NotificationControllerApi.md#update5) | **PUT** /api/v1/notifications/{notification-id} | update
*NotificationControllerV2Api* | [**send1**](docs/NotificationControllerV2Api.md#send1) | **POST** /api/v2/notifications/send | send
*NotificationMailServerControllerApi* | [**activateMailServerUsingPATCH3**](docs/NotificationMailServerControllerApi.md#activatemailserverusingpatch3) | **PATCH** /api/v1/notification/mail-server/{id} | activateMailServer
*NotificationMailServerControllerApi* | [**createMailServer2**](docs/NotificationMailServerControllerApi.md#createmailserver2) | **POST** /api/v1/notification/mail-server | create
*NotificationMailServerControllerApi* | [**deleteMailServer2**](docs/NotificationMailServerControllerApi.md#deletemailserver2) | **DELETE** /api/v1/notification/mail-server/{id} | deleteMailServer
*NotificationMailServerControllerApi* | [**getAllMailServers2**](docs/NotificationMailServerControllerApi.md#getallmailservers2) | **GET** /api/v1/notification/mail-server | getAllMailServers
*NotificationMailServerControllerApi* | [**getMailServer2**](docs/NotificationMailServerControllerApi.md#getmailserver2) | **GET** /api/v1/notification/mail-server/{id} | getMailServer
*NotificationMailServerControllerApi* | [**updateMailServer2**](docs/NotificationMailServerControllerApi.md#updatemailserver2) | **PUT** /api/v1/notification/mail-server | updateMailServer
*NotificationUserControllerApi* | [**sendMail2**](docs/NotificationUserControllerApi.md#sendmail2) | **POST** /api/v1/notification/user/mail | send simple email
*NotificationUserControllerApi* | [**sendSms2**](docs/NotificationUserControllerApi.md#sendsms2) | **POST** /api/v1/notification/user/sms | send simple sms
*OldNotificationControllerApi* | [**createNotification**](docs/OldNotificationControllerApi.md#createnotification) | **POST** /api/v1/notifications/inbox | createNotification
*OldNotificationControllerApi* | [**delete8**](docs/OldNotificationControllerApi.md#delete8) | **DELETE** /api/v1/notifications/inbox/admin/delete/{id} | delete
*OldNotificationControllerApi* | [**deleteAll**](docs/OldNotificationControllerApi.md#deleteall) | **DELETE** /api/v1/notifications/inbox/admin/delete/all | deleteAll
*OldNotificationControllerApi* | [**deleteUserNotification1**](docs/OldNotificationControllerApi.md#deleteusernotification1) | **DELETE** /api/v1/notifications/inbox/{id} | deleteUserNotification
*OldNotificationControllerApi* | [**deleteUserNotifications1**](docs/OldNotificationControllerApi.md#deleteusernotifications1) | **DELETE** /api/v1/notifications/inbox | deleteUserNotifications
*OldNotificationControllerApi* | [**getAll3**](docs/OldNotificationControllerApi.md#getall3) | **GET** /api/v1/notifications/inbox/admin/all | getAll
*OldNotificationControllerApi* | [**getAllUserNotifications**](docs/OldNotificationControllerApi.md#getallusernotifications) | **GET** /api/v1/notifications/inbox | getAllUserNotifications
*OldNotificationControllerApi* | [**getStatus3**](docs/OldNotificationControllerApi.md#getstatus3) | **GET** /api/v1/notifications/inbox/status | getStatus
*OldNotificationControllerApi* | [**getUserNotification1**](docs/OldNotificationControllerApi.md#getusernotification1) | **GET** /api/v1/notifications/inbox/{id} | getUserNotification
*OldNotificationControllerApi* | [**update6**](docs/OldNotificationControllerApi.md#update6) | **PUT** /api/v1/notifications/inbox/admin/update/{notification-id} | update
*OldQueAnsCategoryControllerApi* | [**createQueAns**](docs/OldQueAnsCategoryControllerApi.md#createqueans) | **POST** /api/faq/category/v1 | create
*OldQueAnsCategoryControllerApi* | [**delete9**](docs/OldQueAnsCategoryControllerApi.md#delete9) | **DELETE** /api/faq/category/v1/{id} | delete
*OldQueAnsCategoryControllerApi* | [**get10**](docs/OldQueAnsCategoryControllerApi.md#get10) | **GET** /api/faq/category/v1/{id} | get
*OldQueAnsCategoryControllerApi* | [**getAll4**](docs/OldQueAnsCategoryControllerApi.md#getall4) | **GET** /api/faq/category/v1 | getAll
*OldQueAnsCategoryControllerApi* | [**getChildCategory**](docs/OldQueAnsCategoryControllerApi.md#getchildcategory) | **GET** /api/faq/category/v1/nodes | getChildCategory
*OldQueAnsCategoryControllerApi* | [**update7**](docs/OldQueAnsCategoryControllerApi.md#update7) | **PUT** /api/faq/category/v1/{id} | update
*OldQueAnsControllerApi* | [**createQueAns1**](docs/OldQueAnsControllerApi.md#createqueans1) | **POST** /api/faq/queans/v1 | create
*OldQueAnsControllerApi* | [**deleteQueAns**](docs/OldQueAnsControllerApi.md#deletequeans) | **DELETE** /api/faq/queans/v1/{id} | deleteQueAns
*OldQueAnsControllerApi* | [**getAllQueAns**](docs/OldQueAnsControllerApi.md#getallqueans) | **GET** /api/faq/queans/v1 | getAllQueAns
*OldQueAnsControllerApi* | [**getQueAns**](docs/OldQueAnsControllerApi.md#getqueans) | **GET** /api/faq/queans/v1/{id} | getQueAns
*OldQueAnsControllerApi* | [**getQueAnsByCategoryId**](docs/OldQueAnsControllerApi.md#getqueansbycategoryid) | **GET** /api/faq/queans/v1/category/{id} | getQueAnsByCategoryId
*OldQueAnsControllerApi* | [**updateQueAns**](docs/OldQueAnsControllerApi.md#updatequeans) | **PUT** /api/faq/queans/v1/{id} | update
*PasswordControllerApi* | [**forget**](docs/PasswordControllerApi.md#forget) | **POST** /client/v1/password/forget | forget
*PasswordControllerApi* | [**reset**](docs/PasswordControllerApi.md#reset) | **POST** /client/v1/password/reset | reset
*PostActivationOtpControllerApi* | [**sendEmailOtp**](docs/PostActivationOtpControllerApi.md#sendemailotp) | **POST** /api/v1/user/verification/send-email-otp | sendEmailOtp
*PostActivationOtpControllerApi* | [**sendMobileOtp**](docs/PostActivationOtpControllerApi.md#sendmobileotp) | **POST** /api/v1/user/verification/send-mobile-otp | sendMobileOtp
*PostActivationOtpControllerApi* | [**verifyEmail**](docs/PostActivationOtpControllerApi.md#verifyemail) | **POST** /api/v1/user/verification/verify-email-otp/{code} | verifyEmail
*PostActivationOtpControllerApi* | [**verifyMobile**](docs/PostActivationOtpControllerApi.md#verifymobile) | **POST** /api/v1/user/verification/verify-mobile-otp/{code} | verifyMobile
*PublicCommentsApi* | [**addComment**](docs/PublicCommentsApi.md#addcomment) | **POST** /public/api/v1/comments | addComment
*PublicCommentsApi* | [**getCommentList1**](docs/PublicCommentsApi.md#getcommentlist1) | **GET** /public/api/v1/comments/{postId} | getCommentList
*PublicContentCategoryControllerApi* | [**getCategory2**](docs/PublicContentCategoryControllerApi.md#getcategory2) | **GET** /public/v1/contents/categories/{categoryId} | getCategory
*PublicContentCategoryControllerApi* | [**getCategoryTree1**](docs/PublicContentCategoryControllerApi.md#getcategorytree1) | **GET** /public/v1/contents/categories/tree | getCategoryTree
*PublicContentControllerApi* | [**getContent2**](docs/PublicContentControllerApi.md#getcontent2) | **GET** /public/v1/contents/{contentId} | getContent
*PublicContentControllerApi* | [**getContentList1**](docs/PublicContentControllerApi.md#getcontentlist1) | **GET** /public/v1/contents | getContentList
*PublicContentControllerApi* | [**getContentLocationsList1**](docs/PublicContentControllerApi.md#getcontentlocationslist1) | **GET** /public/v1/contents/locations | getContentLocationsList
*PublicCountryControllerApi* | [**getCities2**](docs/PublicCountryControllerApi.md#getcities2) | **GET** /public/api/v1/location/countries/states/cities | getCities
*PublicCountryControllerApi* | [**getCountries2**](docs/PublicCountryControllerApi.md#getcountries2) | **GET** /public/api/v1/location/countries | getCountries
*PublicCountryControllerApi* | [**getStates2**](docs/PublicCountryControllerApi.md#getstates2) | **GET** /public/api/v1/location/countries/states | getStates
*PublicCountryControllerDeprecatedApi* | [**getCities1**](docs/PublicCountryControllerDeprecatedApi.md#getcities1) | **GET** /public/v1/location/countries/states/cities | getCities
*PublicCountryControllerDeprecatedApi* | [**getCountries1**](docs/PublicCountryControllerDeprecatedApi.md#getcountries1) | **GET** /public/v1/location/countries | getCountries
*PublicCountryControllerDeprecatedApi* | [**getStates1**](docs/PublicCountryControllerDeprecatedApi.md#getstates1) | **GET** /public/v1/location/countries/states | getStates
*PublicFileDownloadControllerApi* | [**download**](docs/PublicFileDownloadControllerApi.md#download) | **GET** /public/api/v1/file/download/{originalFileName} | download
*PublicFileDownloadControllerApi* | [**downloadFile**](docs/PublicFileDownloadControllerApi.md#downloadfile) | **GET** /public/api/v1/file/download/{bucket}/{file} | downloadFile
*PublicFileDownloadControllerApi* | [**downloadFileLocal**](docs/PublicFileDownloadControllerApi.md#downloadfilelocal) | **GET** /public/api/v1/file/storage/{userid}/{access}/{bucket}/{file} | downloadFileLocal
*PublicLocationApi* | [**getLocation1**](docs/PublicLocationApi.md#getlocation1) | **GET** /public/api/v1/datyar/locations/{locationId} | getLocation
*PublicLocationApi* | [**getLocationsList1**](docs/PublicLocationApi.md#getlocationslist1) | **GET** /public/api/v1/datyar/locations | getLocationsList
*PublicLocationApi* | [**getTestPath**](docs/PublicLocationApi.md#gettestpath) | **GET** /public/api/v1/datyar/locations/testPath | getTestPath
*PublicLocationCategoryControllerApi* | [**categoriesList2**](docs/PublicLocationCategoryControllerApi.md#categorieslist2) | **GET** /public/api/v1/locations/categories | categoriesList
*PublicLocationCategoryControllerApi* | [**getCategory4**](docs/PublicLocationCategoryControllerApi.md#getcategory4) | **GET** /public/api/v1/locations/categories/{categoryId} | getCategory
*PublicLocationCategoryControllerDeprecatedApi* | [**categoriesList1**](docs/PublicLocationCategoryControllerDeprecatedApi.md#categorieslist1) | **GET** /public/v1/locations/categories | categoriesList
*PublicLocationCategoryControllerDeprecatedApi* | [**getCategory3**](docs/PublicLocationCategoryControllerDeprecatedApi.md#getcategory3) | **GET** /public/v1/locations/categories/{categoryId} | getCategory
*PublicLocationControllerApi* | [**getLocation4**](docs/PublicLocationControllerApi.md#getlocation4) | **GET** /public/api/v1/locations/{locationId} | getLocation
*PublicLocationControllerApi* | [**getLocationsList4**](docs/PublicLocationControllerApi.md#getlocationslist4) | **GET** /public/api/v1/locations | getLocationsList
*PublicLocationControllerDeprecatedApi* | [**getLocation3**](docs/PublicLocationControllerDeprecatedApi.md#getlocation3) | **GET** /public/v1/locations/{locationId} | getLocation
*PublicLocationControllerDeprecatedApi* | [**getLocationsList3**](docs/PublicLocationControllerDeprecatedApi.md#getlocationslist3) | **GET** /public/v1/locations | getLocationsList
*PublicLocationPropertyControllerApi* | [**getPropertiesList3**](docs/PublicLocationPropertyControllerApi.md#getpropertieslist3) | **GET** /public/api/v1/locations/properties | getPropertiesList
*PublicLocationPropertyControllerApi* | [**getProperty3**](docs/PublicLocationPropertyControllerApi.md#getproperty3) | **GET** /public/api/v1/locations/properties/{id} | getProperty
*PublicLocationPropertyControllerDeprecatedApi* | [**getPropertiesList2**](docs/PublicLocationPropertyControllerDeprecatedApi.md#getpropertieslist2) | **GET** /public/v1/locations/properties | getPropertiesList
*PublicLocationPropertyControllerDeprecatedApi* | [**getProperty2**](docs/PublicLocationPropertyControllerDeprecatedApi.md#getproperty2) | **GET** /public/v1/locations/properties/{id} | getProperty
*PublicLocationTagControllerApi* | [**get12**](docs/PublicLocationTagControllerApi.md#get12) | **GET** /public/api/v1/locations/tags/{id} | get
*PublicLocationTagControllerApi* | [**getList4**](docs/PublicLocationTagControllerApi.md#getlist4) | **GET** /public/api/v1/locations/tags | getList
*PublicLocationTagControllerDeprecatedApi* | [**get11**](docs/PublicLocationTagControllerDeprecatedApi.md#get11) | **GET** /public/v1/locations/tags/{id} | get
*PublicLocationTagControllerDeprecatedApi* | [**getList3**](docs/PublicLocationTagControllerDeprecatedApi.md#getlist3) | **GET** /public/v1/locations/tags | getList
*PublicTransactionControllerApi* | [**processPayment**](docs/PublicTransactionControllerApi.md#processpayment) | **GET** /public/v1/transaction/process/{token} | processPayment
*PublicUserVerificationControllerApi* | [**verifyUserEmail**](docs/PublicUserVerificationControllerApi.md#verifyuseremail) | **GET** /client/v1/user/verification/by-email/{verificationCode} | verifyUserEmail
*PushNotificationServerControllerApi* | [**createPushServer**](docs/PushNotificationServerControllerApi.md#createpushserver) | **POST** /api/v1/notification/push/server | create
*PushNotificationServerControllerApi* | [**deletePushServer**](docs/PushNotificationServerControllerApi.md#deletepushserver) | **DELETE** /api/v1/notification/push/server/{id} | deletePushServer
*PushNotificationServerControllerApi* | [**getAllPushServers**](docs/PushNotificationServerControllerApi.md#getallpushservers) | **GET** /api/v1/notification/push/server | getAllPushServers
*PushNotificationServerControllerApi* | [**getPushServer**](docs/PushNotificationServerControllerApi.md#getpushserver) | **GET** /api/v1/notification/push/server/{id} | getPushServer
*PushNotificationServerControllerApi* | [**updatePushServer**](docs/PushNotificationServerControllerApi.md#updatepushserver) | **PUT** /api/v1/notification/push/server/{id} | update
*PushNotificationTokenControllerApi* | [**createPushToken**](docs/PushNotificationTokenControllerApi.md#createpushtoken) | **POST** /api/v1/notification/push/token | create
*PushNotificationTokenControllerApi* | [**deletePushToken**](docs/PushNotificationTokenControllerApi.md#deletepushtoken) | **DELETE** /api/v1/notification/push/token/{id} | deletePushToken
*PushNotificationTokenControllerApi* | [**getAllPushTokens**](docs/PushNotificationTokenControllerApi.md#getallpushtokens) | **GET** /api/v1/notification/push/token | getAllPushTokens
*PushNotificationTokenControllerApi* | [**getPushToken**](docs/PushNotificationTokenControllerApi.md#getpushtoken) | **GET** /api/v1/notification/push/token/{id} | getPushToken
*PushNotificationTokenControllerApi* | [**send2**](docs/PushNotificationTokenControllerApi.md#send2) | **POST** /api/v1/notification/push/token/send | create
*PushNotificationTokenControllerApi* | [**updatePushToken**](docs/PushNotificationTokenControllerApi.md#updatepushtoken) | **PUT** /api/v1/notification/push/token/{id} | update
*PushServerControllerApi* | [**createPushServer2**](docs/PushServerControllerApi.md#createpushserver2) | **POST** /api/v1/mgs/push/server | create
*PushServerControllerApi* | [**deletePushServer2**](docs/PushServerControllerApi.md#deletepushserver2) | **DELETE** /api/v1/mgs/push/server/{id} | deletePushServer
*PushServerControllerApi* | [**getAllPushServers2**](docs/PushServerControllerApi.md#getallpushservers2) | **GET** /api/v1/mgs/push/server | getAllPushServers
*PushServerControllerApi* | [**getPushServer2**](docs/PushServerControllerApi.md#getpushserver2) | **GET** /api/v1/mgs/push/server/{id} | getPushServer
*PushServerControllerApi* | [**updatePushServer2**](docs/PushServerControllerApi.md#updatepushserver2) | **PUT** /api/v1/mgs/push/server/{id} | update
*PushServerControllerV2Api* | [**createPushServer1**](docs/PushServerControllerV2Api.md#createpushserver1) | **POST** /api/v2/notification/push/server | create
*PushServerControllerV2Api* | [**deletePushServer1**](docs/PushServerControllerV2Api.md#deletepushserver1) | **DELETE** /api/v2/notification/push/server/{id} | deletePushServer
*PushServerControllerV2Api* | [**getAllPushServers1**](docs/PushServerControllerV2Api.md#getallpushservers1) | **GET** /api/v2/notification/push/server | getAllPushServers
*PushServerControllerV2Api* | [**getPushServer1**](docs/PushServerControllerV2Api.md#getpushserver1) | **GET** /api/v2/notification/push/server/{id} | getPushServer
*PushServerControllerV2Api* | [**updatePushServer1**](docs/PushServerControllerV2Api.md#updatepushserver1) | **PUT** /api/v2/notification/push/server/{id} | update
*PushTokenControllerApi* | [**createPushToken1**](docs/PushTokenControllerApi.md#createpushtoken1) | **POST** /api/v1/mgs/push/token | create
*PushTokenControllerApi* | [**deletePushToken1**](docs/PushTokenControllerApi.md#deletepushtoken1) | **DELETE** /api/v1/mgs/push/token/{id} | deletePushToken
*PushTokenControllerApi* | [**getAllPushTokens1**](docs/PushTokenControllerApi.md#getallpushtokens1) | **GET** /api/v1/mgs/push/token | getAllPushTokens
*PushTokenControllerApi* | [**getPushToken1**](docs/PushTokenControllerApi.md#getpushtoken1) | **GET** /api/v1/mgs/push/token/{id} | getPushToken
*PushTokenControllerApi* | [**send3**](docs/PushTokenControllerApi.md#send3) | **POST** /api/v1/mgs/push/token/send | create
*PushTokenControllerApi* | [**updatePushToken1**](docs/PushTokenControllerApi.md#updatepushtoken1) | **PUT** /api/v1/mgs/push/token/{id} | update
*PushTokenControllerV2Api* | [**delete10**](docs/PushTokenControllerV2Api.md#delete10) | **DELETE** /api/v2/notifications/push/tokens/{push-id} | delete
*PushTokenControllerV2Api* | [**get13**](docs/PushTokenControllerV2Api.md#get13) | **GET** /api/v2/notifications/push/tokens/{push-id} | get
*PushTokenControllerV2Api* | [**getAll5**](docs/PushTokenControllerV2Api.md#getall5) | **GET** /api/v2/notifications/push/tokens | getAll
*PushTokenControllerV2Api* | [**save**](docs/PushTokenControllerV2Api.md#save) | **POST** /api/v2/notifications/push/tokens | save
*QueAnsCategoryControllerApi* | [**createQueAns2**](docs/QueAnsCategoryControllerApi.md#createqueans2) | **POST** /api/v1/faq/category | create
*QueAnsCategoryControllerApi* | [**delete11**](docs/QueAnsCategoryControllerApi.md#delete11) | **DELETE** /api/v1/faq/category/{id} | delete
*QueAnsCategoryControllerApi* | [**get14**](docs/QueAnsCategoryControllerApi.md#get14) | **GET** /public/v1/faq/category/{id} | get
*QueAnsCategoryControllerApi* | [**getAll6**](docs/QueAnsCategoryControllerApi.md#getall6) | **GET** /public/v1/faq/category | getAll
*QueAnsCategoryControllerApi* | [**getChildCategory1**](docs/QueAnsCategoryControllerApi.md#getchildcategory1) | **GET** /public/v1/faq/category/nodes | getChildCategory
*QueAnsCategoryControllerApi* | [**update8**](docs/QueAnsCategoryControllerApi.md#update8) | **PUT** /api/v1/faq/category/{id} | update
*QueAnsControllerApi* | [**createQueAns3**](docs/QueAnsControllerApi.md#createqueans3) | **POST** /api/v1/faq/que-ans | create
*QueAnsControllerApi* | [**deleteQueAns1**](docs/QueAnsControllerApi.md#deletequeans1) | **DELETE** /api/v1/faq/que-ans/{id} | deleteQueAns
*QueAnsControllerApi* | [**getAllQueAns1**](docs/QueAnsControllerApi.md#getallqueans1) | **GET** /public/v1/faq/que-ans | getAllQueAns
*QueAnsControllerApi* | [**getQueAns1**](docs/QueAnsControllerApi.md#getqueans1) | **GET** /public/v1/faq/que-ans/{id} | getQueAns
*QueAnsControllerApi* | [**getQueAnsByCategoryId1**](docs/QueAnsControllerApi.md#getqueansbycategoryid1) | **GET** /public/v1/faq/que-ans/category/{id} | getQueAnsByCategoryId
*QueAnsControllerApi* | [**selectiveUpdateQueAnsUsingPATCH1**](docs/QueAnsControllerApi.md#selectiveupdatequeansusingpatch1) | **PATCH** /api/v1/faq/que-ans/{id} | update
*QueAnsControllerApi* | [**updateQueAns1**](docs/QueAnsControllerApi.md#updatequeans1) | **PUT** /api/v1/faq/que-ans/{id} | update
*RateControllerApi* | [**create6**](docs/RateControllerApi.md#create6) | **POST** /api/v1/rates | create
*RateControllerApi* | [**createMulti**](docs/RateControllerApi.md#createmulti) | **POST** /api/v1/rates/multi | createMulti
*RateControllerApi* | [**delete12**](docs/RateControllerApi.md#delete12) | **DELETE** /api/v1/rates/{id} | delete
*RateControllerApi* | [**get15**](docs/RateControllerApi.md#get15) | **GET** /api/v1/rates/{id} | get
*RateControllerApi* | [**getAll7**](docs/RateControllerApi.md#getall7) | **GET** /api/v1/rates | getAll
*RateControllerApi* | [**update9**](docs/RateControllerApi.md#update9) | **PUT** /api/v1/rates/{id} | update
*RateOpinionControllerApi* | [**addKeyUsingPATCH1**](docs/RateOpinionControllerApi.md#addkeyusingpatch1) | **PATCH** /api/v1/rates/opinions/keys/add | addKey
*RateOpinionControllerApi* | [**create7**](docs/RateOpinionControllerApi.md#create7) | **POST** /api/v1/rates/opinions | create
*RateOpinionControllerApi* | [**delete13**](docs/RateOpinionControllerApi.md#delete13) | **DELETE** /api/v1/rates/opinions/{value-enum} | delete
*RateOpinionControllerApi* | [**get16**](docs/RateOpinionControllerApi.md#get16) | **GET** /api/v1/rates/opinions/{value-enum} | get
*RateOpinionControllerApi* | [**getAll8**](docs/RateOpinionControllerApi.md#getall8) | **GET** /api/v1/rates/opinions | getAll
*RateOpinionControllerApi* | [**removeKeyUsingPATCH1**](docs/RateOpinionControllerApi.md#removekeyusingpatch1) | **PATCH** /api/v1/rates/opinions/keys/remove | removeKey
*RateOpinionControllerApi* | [**update10**](docs/RateOpinionControllerApi.md#update10) | **PUT** /api/v1/rates/opinions/{value-enum} | update
*ReferralLogControllerApi* | [**createSubscriberLog**](docs/ReferralLogControllerApi.md#createsubscriberlog) | **POST** /api/v1/campaign/referral/subscriberlog | create
*ReferralUserControllerApi* | [**createReferralUser**](docs/ReferralUserControllerApi.md#createreferraluser) | **POST** /api/v1/campaign/referral/subscriber | create
*ReferralUserControllerApi* | [**deleteReferralUser**](docs/ReferralUserControllerApi.md#deletereferraluser) | **DELETE** /api/v1/campaign/referral/subscriber/{id} | deleteReferralUser
*ReferralUserControllerApi* | [**getReferralUser**](docs/ReferralUserControllerApi.md#getreferraluser) | **GET** /api/v1/campaign/referral/subscriber/{id} | getReferralUser
*ReferralUserControllerApi* | [**getReferralUserList**](docs/ReferralUserControllerApi.md#getreferraluserlist) | **GET** /api/v1/campaign/referral/subscriber | getReferralUserList
*ReferralUserControllerApi* | [**updateReferralUser**](docs/ReferralUserControllerApi.md#updatereferraluser) | **PUT** /api/v1/campaign/referral/subscriber/{id} | Update
*RegistrationControllerApi* | [**activateByCode**](docs/RegistrationControllerApi.md#activatebycode) | **POST** /client/v1/user/register/activate | activation
*RegistrationControllerApi* | [**activateByLink**](docs/RegistrationControllerApi.md#activatebylink) | **GET** /client/v1/user/register/activate | activation
*RegistrationControllerApi* | [**facebookRegisterByToken**](docs/RegistrationControllerApi.md#facebookregisterbytoken) | **POST** /client/v1/user/register/third-party/facebook | facebookRegisterByToken
*RegistrationControllerApi* | [**googleRegisterAccomplish**](docs/RegistrationControllerApi.md#googleregisteraccomplish) | **GET** /client/v1/user/register/third-party/google/accomplish | googleRegisterAccomplish
*RegistrationControllerApi* | [**googleRegisterByToken**](docs/RegistrationControllerApi.md#googleregisterbytoken) | **POST** /client/v1/user/register/third-party/google | googleRegisterByToken
*RegistrationControllerApi* | [**linkedInRegisterAccomplish**](docs/RegistrationControllerApi.md#linkedinregisteraccomplish) | **GET** /client/v1/user/register/third-party/linked-in/accomplish | linkedInRegisterAccomplish
*RegistrationControllerApi* | [**linkedInRegisterByToken**](docs/RegistrationControllerApi.md#linkedinregisterbytoken) | **POST** /client/v1/user/register/third-party/linked-in | linkedInRegisterByToken
*RegistrationControllerApi* | [**redirectToThirdParty**](docs/RegistrationControllerApi.md#redirecttothirdparty) | **GET** /client/v1/user/register/third-party | registrationType
*RegistrationControllerApi* | [**register**](docs/RegistrationControllerApi.md#register) | **POST** /client/v1/user/register | register
*RegistrationControllerApi* | [**thirdPartyTest**](docs/RegistrationControllerApi.md#thirdpartytest) | **GET** /client/v1/user/register/third-party/test | thirdPartyTest
*RegistrationV2ControllerApi* | [**register1**](docs/RegistrationV2ControllerApi.md#register1) | **POST** /client/v2/user/register | register
*RolePermissionControllerApi* | [**addRolePermission**](docs/RolePermissionControllerApi.md#addrolepermission) | **POST** /api/v1/security-server/role-permission | add
*RolePermissionControllerApi* | [**deleteRolePermission**](docs/RolePermissionControllerApi.md#deleterolepermission) | **DELETE** /api/v1/security-server/role-permission/{id} | deleteRolePermission
*RolePermissionControllerApi* | [**editRolePermission**](docs/RolePermissionControllerApi.md#editrolepermission) | **PUT** /api/v1/security-server/role-permission | editRolePermission
*RolePermissionControllerApi* | [**getAllRolePermissions**](docs/RolePermissionControllerApi.md#getallrolepermissions) | **GET** /api/v1/security-server/role-permission | getAllRolePermissions
*RolePermissionControllerApi* | [**getPrivileges1**](docs/RolePermissionControllerApi.md#getprivileges1) | **GET** /api/v1/security-server/role-permission/privileges | getPrivileges
*RolePermissionControllerApi* | [**getRolePermission**](docs/RolePermissionControllerApi.md#getrolepermission) | **GET** /api/v1/security-server/role-permission/{id} | getRolePermission
*RolePermissionControllerApi* | [**selectiveEditRolePermissionUsingPATCH1**](docs/RolePermissionControllerApi.md#selectiveeditrolepermissionusingpatch1) | **PATCH** /api/v1/security-server/role-permission | selectiveEditRolePermission
*SessionApi* | [**cancelClientUsingPATCH1**](docs/SessionApi.md#cancelclientusingpatch1) | **PATCH** /api/v1/datyar/sessions/cancel/{session-id} | cancelClient
*SessionApi* | [**cancelLawyerUsingPATCH1**](docs/SessionApi.md#cancellawyerusingpatch1) | **PATCH** /api/v1/datyar/sessions/cancel | cancelLawyer
*SessionApi* | [**createMessage**](docs/SessionApi.md#createmessage) | **POST** /api/v1/datyar/sessions/create-message | createMessage
*SessionApi* | [**createSession**](docs/SessionApi.md#createsession) | **POST** /api/v1/datyar/sessions | createSession
*SessionApi* | [**deleteMessage**](docs/SessionApi.md#deletemessage) | **DELETE** /api/v1/datyar/sessions/delete-message/{session-Id}/{message-Id} | deleteMessage
*SessionApi* | [**endSessionUsingPATCH1**](docs/SessionApi.md#endsessionusingpatch1) | **PATCH** /api/v1/datyar/sessions/end-session/{session-id} | endSession
*SessionApi* | [**getAllLawyerOrders**](docs/SessionApi.md#getalllawyerorders) | **GET** /api/v1/datyar/sessions/getAllLawyerOrders | getAllLawyerOrders
*SessionApi* | [**getAllOrders**](docs/SessionApi.md#getallorders) | **GET** /api/v1/datyar/sessions/getAllOrders | getAllOrders
*SessionApi* | [**getAllUserOrders**](docs/SessionApi.md#getalluserorders) | **GET** /api/v1/datyar/sessions/getAllUserOrders | getAllUserOrders
*SessionApi* | [**getCalender**](docs/SessionApi.md#getcalender) | **GET** /api/v1/datyar/sessions/getCalender/{lawyer-Id} | getCalender
*SessionApi* | [**getLawyerOrganizationalCalendar**](docs/SessionApi.md#getlawyerorganizationalcalendar) | **GET** /api/v1/datyar/sessions/get-lawyer-organizational-calendar | getLawyerOrganizationalCalendar
*SessionApi* | [**getOutputDto**](docs/SessionApi.md#getoutputdto) | **GET** /api/v1/datyar/sessions/{session-id} | getOutputDto
*SessionApi* | [**getUrgentRequests**](docs/SessionApi.md#geturgentrequests) | **GET** /api/v1/datyar/sessions/get-urgent-requests | getUrgentRequests
*SessionApi* | [**requestCancelUsingPATCH1**](docs/SessionApi.md#requestcancelusingpatch1) | **PATCH** /api/v1/datyar/sessions/request-cancel | requestCancel
*SessionApi* | [**requestExtendUsingPATCH1**](docs/SessionApi.md#requestextendusingpatch1) | **PATCH** /api/v1/datyar/sessions/request-extend | requestExtend
*SessionApi* | [**sendMessage**](docs/SessionApi.md#sendmessage) | **POST** /api/v1/datyar/sessions/send-message/{session-id} | sendMessage
*SessionApi* | [**setSessionStartTimeUsingPATCH1**](docs/SessionApi.md#setsessionstarttimeusingpatch1) | **PATCH** /api/v1/datyar/sessions/set-start-time | setSessionStartTime
*SkillCategoryControllerApi* | [**createCategory**](docs/SkillCategoryControllerApi.md#createcategory) | **POST** /api/v1/datyar/skill-category | createSkillCategory
*SkillCategoryControllerApi* | [**deleteCategory2**](docs/SkillCategoryControllerApi.md#deletecategory2) | **DELETE** /api/v1/datyar/skill-category/{id} | deleteSkillCategory
*SkillCategoryControllerApi* | [**getCategoryById**](docs/SkillCategoryControllerApi.md#getcategorybyid) | **GET** /api/v1/datyar/skill-category/{id} | get category skill 
*SkillCategoryControllerApi* | [**getCategoryByName**](docs/SkillCategoryControllerApi.md#getcategorybyname) | **GET** /api/v1/datyar/skill-category/with-name/{name} | get category skill 
*SkillCategoryControllerApi* | [**getListCategory**](docs/SkillCategoryControllerApi.md#getlistcategory) | **GET** /api/v1/datyar/skill-category/list | list category skill 
*SkillCategoryControllerApi* | [**getSmartCategory**](docs/SkillCategoryControllerApi.md#getsmartcategory) | **POST** /api/v1/datyar/skill-category/smart-category | list category skill 
*SkillCategoryControllerApi* | [**getSmartCategoryList**](docs/SkillCategoryControllerApi.md#getsmartcategorylist) | **POST** /api/v1/datyar/skill-category/smart-category/list | list category skill 
*SkillCategoryControllerApi* | [**updateCategory**](docs/SkillCategoryControllerApi.md#updatecategory) | **PUT** /api/v1/datyar/skill-category/{id} | updateSkillCategory
*SkillControllerApi* | [**createSkill**](docs/SkillControllerApi.md#createskill) | **POST** /api/v1/datyar/skill | createSkill
*SkillControllerApi* | [**deleteObject**](docs/SkillControllerApi.md#deleteobject) | **DELETE** /api/v1/datyar/skill/{id} | delete Skill
*SkillControllerApi* | [**getAll9**](docs/SkillControllerApi.md#getall9) | **GET** /api/v1/datyar/skill | getAll
*SkillControllerApi* | [**getAllByIds**](docs/SkillControllerApi.md#getallbyids) | **GET** /api/v1/datyar/skill/by-Ids | getAllByIds
*SkillControllerApi* | [**getSkillById**](docs/SkillControllerApi.md#getskillbyid) | **GET** /api/v1/datyar/skill/{id} | get  skill 
*SkillControllerApi* | [**getSkillByName**](docs/SkillControllerApi.md#getskillbyname) | **GET** /api/v1/datyar/skill/with-name/{name} | get  skill 
*SkillControllerApi* | [**updateSkill**](docs/SkillControllerApi.md#updateskill) | **PUT** /api/v1/datyar/skill/{id} | updateSkill
*SmsNotificationServerControllerApi* | [**activateSmsServerUsingPATCH1**](docs/SmsNotificationServerControllerApi.md#activatesmsserverusingpatch1) | **PATCH** /api/v1/notification/sms-server/activate/{id} | activateSmsServer
*SmsNotificationServerControllerApi* | [**createSmsServer**](docs/SmsNotificationServerControllerApi.md#createsmsserver) | **POST** /api/v1/notification/sms-server | create
*SmsNotificationServerControllerApi* | [**deleteSmsServer**](docs/SmsNotificationServerControllerApi.md#deletesmsserver) | **DELETE** /api/v1/notification/sms-server/{id} | deleteSmsServer
*SmsNotificationServerControllerApi* | [**getAllSmsServers**](docs/SmsNotificationServerControllerApi.md#getallsmsservers) | **GET** /api/v1/notification/sms-server | getAllSmsServers
*SmsNotificationServerControllerApi* | [**getSmsServer**](docs/SmsNotificationServerControllerApi.md#getsmsserver) | **GET** /api/v1/notification/sms-server/{id} | getSmsServer
*SmsNotificationServerControllerApi* | [**updateSmsServer**](docs/SmsNotificationServerControllerApi.md#updatesmsserver) | **PUT** /api/v1/notification/sms-server | updateSmsServer
*SmsServerControllerApi* | [**activateSmsServerUsingPATCH3**](docs/SmsServerControllerApi.md#activatesmsserverusingpatch3) | **PATCH** /api/v1/mgs/sms-server/activate/{id} | activateSmsServer
*SmsServerControllerApi* | [**createSmsServer2**](docs/SmsServerControllerApi.md#createsmsserver2) | **POST** /api/v1/mgs/sms-server | create
*SmsServerControllerApi* | [**deleteSmsServer2**](docs/SmsServerControllerApi.md#deletesmsserver2) | **DELETE** /api/v1/mgs/sms-server/{id} | deleteSmsServer
*SmsServerControllerApi* | [**getAllSmsServers2**](docs/SmsServerControllerApi.md#getallsmsservers2) | **GET** /api/v1/mgs/sms-server | getAllSmsServers
*SmsServerControllerApi* | [**getSmsServer2**](docs/SmsServerControllerApi.md#getsmsserver2) | **GET** /api/v1/mgs/sms-server/{id} | getSmsServer
*SmsServerControllerApi* | [**updateSmsServer2**](docs/SmsServerControllerApi.md#updatesmsserver2) | **PUT** /api/v1/mgs/sms-server | updateSmsServer
*SmsServerControllerV2Api* | [**activateSmsServerUsingPATCH2**](docs/SmsServerControllerV2Api.md#activatesmsserverusingpatch2) | **PATCH** /api/v2/notification/sms-server/activate/{id} | activateSmsServer
*SmsServerControllerV2Api* | [**createSmsServer1**](docs/SmsServerControllerV2Api.md#createsmsserver1) | **POST** /api/v2/notification/sms-server | create
*SmsServerControllerV2Api* | [**deleteSmsServer1**](docs/SmsServerControllerV2Api.md#deletesmsserver1) | **DELETE** /api/v2/notification/sms-server/{id} | deleteSmsServer
*SmsServerControllerV2Api* | [**getAllSmsServers1**](docs/SmsServerControllerV2Api.md#getallsmsservers1) | **GET** /api/v2/notification/sms-server | getAllSmsServers
*SmsServerControllerV2Api* | [**getSmsServer1**](docs/SmsServerControllerV2Api.md#getsmsserver1) | **GET** /api/v2/notification/sms-server/{id} | getSmsServer
*SmsServerControllerV2Api* | [**updateSmsServer1**](docs/SmsServerControllerV2Api.md#updatesmsserver1) | **PUT** /api/v2/notification/sms-server | updateSmsServer
*SupportCategoryControllerApi* | [**createCategory1**](docs/SupportCategoryControllerApi.md#createcategory1) | **POST** /api/v1/support/categories | createCategory
*SupportCategoryControllerApi* | [**deleteCategory3**](docs/SupportCategoryControllerApi.md#deletecategory3) | **DELETE** /api/v1/support/categories/{id} | deleteCategory
*SupportCategoryControllerApi* | [**getCategory5**](docs/SupportCategoryControllerApi.md#getcategory5) | **GET** /api/v1/support/categories/{id} | getCategory
*SupportCategoryControllerApi* | [**getCategoryList**](docs/SupportCategoryControllerApi.md#getcategorylist) | **GET** /api/v1/support/categories | getCategoryList
*SupportCategoryControllerApi* | [**updateCategory1**](docs/SupportCategoryControllerApi.md#updatecategory1) | **PUT** /api/v1/support/categories/{id} | updateCategory
*TicketControllerApi* | [**changeState1**](docs/TicketControllerApi.md#changestate1) | **PUT** /api/v1/support/tickets/state/{id}/{stateEnum} | state
*TicketControllerApi* | [**closeState**](docs/TicketControllerApi.md#closestate) | **PUT** /api/v1/support/tickets/state/close/{id} | state
*TicketControllerApi* | [**createTicket**](docs/TicketControllerApi.md#createticket) | **POST** /api/v1/support/tickets | create
*TicketControllerApi* | [**deleteTicket**](docs/TicketControllerApi.md#deleteticket) | **DELETE** /api/v1/support/tickets/{id} | deleteTicket
*TicketControllerApi* | [**getSubscriberTickets**](docs/TicketControllerApi.md#getsubscribertickets) | **GET** /api/v1/support/tickets/get-subscriber-tickets | getSubscriberTickets
*TicketControllerApi* | [**getTicket**](docs/TicketControllerApi.md#getticket) | **GET** /api/v1/support/tickets/{id} | getTicket
*TicketControllerApi* | [**getTicketList**](docs/TicketControllerApi.md#getticketlist) | **GET** /api/v1/support/tickets | getTicketList
*TicketControllerApi* | [**getTicketListForAdminPanel**](docs/TicketControllerApi.md#getticketlistforadminpanel) | **GET** /api/v1/support/tickets/admin/get | getTicketListForAdminPanel
*TicketControllerApi* | [**getUserTickets**](docs/TicketControllerApi.md#getusertickets) | **GET** /api/v1/support/tickets/get-user-tickets | getUserTickets
*TicketControllerApi* | [**updateTicket**](docs/TicketControllerApi.md#updateticket) | **PUT** /api/v1/support/tickets/{id} | update
*TicketMessageControllerApi* | [**createTicketMessage**](docs/TicketMessageControllerApi.md#createticketmessage) | **POST** /api/v1/support/ticket-messages | create
*TicketMessageControllerApi* | [**deleteTicketMessage**](docs/TicketMessageControllerApi.md#deleteticketmessage) | **DELETE** /api/v1/support/ticket-messages/{id} | deleteTicketMessage
*TicketMessageControllerApi* | [**getTicketMessage**](docs/TicketMessageControllerApi.md#getticketmessage) | **GET** /api/v1/support/ticket-messages/{id} | getTicketMessage
*TicketMessageControllerApi* | [**getTicketMessageListByTicketId**](docs/TicketMessageControllerApi.md#getticketmessagelistbyticketid) | **GET** /api/v1/support/ticket-messages/ticket/{ticketId} | getTicketMessageListByTicketId
*TicketMessageControllerApi* | [**updateTicketMessage**](docs/TicketMessageControllerApi.md#updateticketmessage) | **PUT** /api/v1/support/ticket-messages/{id} | Update
*TicketMessageV2ControllerApi* | [**createMessage1**](docs/TicketMessageV2ControllerApi.md#createmessage1) | **POST** /api/v2/support/messages/create/ | createMessage
*TicketMessageV2ControllerApi* | [**createTicketMessage1**](docs/TicketMessageV2ControllerApi.md#createticketmessage1) | **POST** /api/v2/support/messages/{ticketId} | createTicketMessage
*TicketMessageV2ControllerApi* | [**getTicketMessageListByTicketId1**](docs/TicketMessageV2ControllerApi.md#getticketmessagelistbyticketid1) | **GET** /api/v2/support/messages/ticket/{ticketId} | getTicketMessageListByTicketId
*TicketRatingApi* | [**createRate**](docs/TicketRatingApi.md#createrate) | **POST** /api/v1/support/tickets/ratings | createRate
*TicketRatingApi* | [**getAllRates**](docs/TicketRatingApi.md#getallrates) | **GET** /api/v1/support/tickets/ratings | getAllRates
*TicketRatingApi* | [**getOneRate**](docs/TicketRatingApi.md#getonerate) | **GET** /api/v1/support/tickets/ratings/{id} | getOneRate
*TopLawyerApi* | [**getTopLawyers**](docs/TopLawyerApi.md#gettoplawyers) | **GET** /public/api/v1/datyar/lawyers/top-lawyer | getTopLawyers
*UserApi* | [**beforeLeaving**](docs/UserApi.md#beforeleaving) | **POST** /api/v1/datyar/user/before-leaving | beforeLeaving
*UserApi* | [**checkUserNameAvailability**](docs/UserApi.md#checkusernameavailability) | **GET** /api/v1/datyar/user/check-username/{username} | checkUserNameAvailability
*UserApi* | [**get5**](docs/UserApi.md#get5) | **GET** /api/v1/datyar/user/{id} | get
*UserApi* | [**getAllUsers**](docs/UserApi.md#getallusers) | **GET** /api/v1/datyar/user | getAllUsers
*UserControllerApi* | [**createUser**](docs/UserControllerApi.md#createuser) | **POST** /api/v1/user | create
*UserControllerApi* | [**deleteUser**](docs/UserControllerApi.md#deleteuser) | **DELETE** /api/v1/user/{id} | deleteUser
*UserControllerApi* | [**getAllUser**](docs/UserControllerApi.md#getalluser) | **GET** /api/v1/user | getAllUser
*UserControllerApi* | [**getAllUsers1**](docs/UserControllerApi.md#getallusers1) | **GET** /api/v1/user/all | getAllUsers
*UserControllerApi* | [**getAllUsers2**](docs/UserControllerApi.md#getallusers2) | **GET** /api/v1/user/admin-panel | getAllUsers
*UserControllerApi* | [**getAllUsersCsv**](docs/UserControllerApi.md#getalluserscsv) | **GET** /api/v1/user/admin-panel/users.csv | getAllUsersCsv
*UserControllerApi* | [**getProfile**](docs/UserControllerApi.md#getprofile) | **GET** /api/v1/user/profile | getProfile
*UserControllerApi* | [**getReport1**](docs/UserControllerApi.md#getreport1) | **GET** /api/v1/user/report | getReport
*UserControllerApi* | [**getUser**](docs/UserControllerApi.md#getuser) | **GET** /api/v1/user/{id} | getUser
*UserControllerApi* | [**lockUsingPATCH1**](docs/UserControllerApi.md#lockusingpatch1) | **PATCH** /api/v1/user/lock | lock
*UserControllerApi* | [**selectiveUpdateUserUsingPATCH1**](docs/UserControllerApi.md#selectiveupdateuserusingpatch1) | **PATCH** /api/v1/user | selectiveUpdate
*UserControllerApi* | [**unlockUsingPATCH1**](docs/UserControllerApi.md#unlockusingpatch1) | **PATCH** /api/v1/user/unlock | lock
*UserControllerApi* | [**updatePasswordUsingPATCH1**](docs/UserControllerApi.md#updatepasswordusingpatch1) | **PATCH** /api/v1/user/password | updatePassword
*UserControllerApi* | [**updateProfileUsingPATCH1**](docs/UserControllerApi.md#updateprofileusingpatch1) | **PATCH** /api/v1/user/profile | updateProfile
*UserControllerApi* | [**updateUser**](docs/UserControllerApi.md#updateuser) | **PUT** /api/v1/user | update
*UserControllerApi* | [**updateUser1**](docs/UserControllerApi.md#updateuser1) | **PUT** /api/v1/user/admin-panel | update
*UserVerificationControllerApi* | [**createUserEmailVerification**](docs/UserVerificationControllerApi.md#createuseremailverification) | **POST** /api/v1/user/verification | createUserEmailVerification
*UserVerificationControllerApi* | [**verifyUserSms**](docs/UserVerificationControllerApi.md#verifyusersms) | **POST** /api/v1/user/verification/by-sms | verifyUserSms
*VoteControllerApi* | [**downVote**](docs/VoteControllerApi.md#downvote) | **DELETE** /public/v1/votes/{related-id} | downVote
*VoteControllerApi* | [**upVote**](docs/VoteControllerApi.md#upvote) | **POST** /public/v1/votes/{related-id} | upVote
*WalletApi* | [**checkTransaction**](docs/WalletApi.md#checktransaction) | **GET** /api/v1/datyar/wallet/check/transaction | checkTransaction
*WalletApi* | [**checkoutChangeStateUsingPATCH1**](docs/WalletApi.md#checkoutchangestateusingpatch1) | **PATCH** /api/v1/datyar/wallet/checkout/change-state | checkoutChangeState
*WalletApi* | [**checkoutRequest**](docs/WalletApi.md#checkoutrequest) | **POST** /api/v1/datyar/wallet/checkout/request | checkoutRequest
*WalletApi* | [**doUserTransaction**](docs/WalletApi.md#dousertransaction) | **POST** /api/v1/datyar/wallet/do-transaction | doUserTransaction
*WalletApi* | [**getAllCheckout**](docs/WalletApi.md#getallcheckout) | **GET** /api/v1/datyar/wallet/checkout | getAllCheckout
*WalletApi* | [**getAllTransactions**](docs/WalletApi.md#getalltransactions) | **GET** /api/v1/datyar/wallet/transaction | getAllTransactions
*WalletApi* | [**getInvoiceInformation**](docs/WalletApi.md#getinvoiceinformation) | **GET** /api/v1/datyar/wallet/invoice | getInvoiceInformation
*WalletApi* | [**getUserCheckout**](docs/WalletApi.md#getusercheckout) | **GET** /api/v1/datyar/wallet/user/checkout | getUserCheckout
*WalletApi* | [**transferBalance**](docs/WalletApi.md#transferbalance) | **POST** /api/v1/datyar/wallet/transfer-balance | transferBalance
*WalletAccountControllerApi* | [**getWalletAccount**](docs/WalletAccountControllerApi.md#getwalletaccount) | **GET** /api/v1/wallet/account | getWalletAccount
*WalletTransactionControllerApi* | [**doSubscriberTransaction**](docs/WalletTransactionControllerApi.md#dosubscribertransaction) | **POST** /api/v1/wallet/subscriber/transaction | doSubscriberTransaction
*WalletTransactionControllerApi* | [**doTransaction**](docs/WalletTransactionControllerApi.md#dotransaction) | **POST** /api/v1/wallet/transaction | doTransaction
*WalletTransactionControllerApi* | [**doUserTransaction1**](docs/WalletTransactionControllerApi.md#dousertransaction1) | **POST** /api/v1/wallet/user/transaction | doUserTransaction
*WalletTransactionControllerApi* | [**getAllSubscriberTransactions**](docs/WalletTransactionControllerApi.md#getallsubscribertransactions) | **GET** /api/v1/wallet/subscriber/transaction | getAllSubscriberTransactions
*WalletTransactionControllerApi* | [**getAllTransactions1**](docs/WalletTransactionControllerApi.md#getalltransactions1) | **GET** /api/v1/wallet/transaction | getAllTransactions
*WalletTransactionControllerApi* | [**getAllUserTransactions**](docs/WalletTransactionControllerApi.md#getallusertransactions) | **GET** /api/v1/wallet/user/transaction | getAllUserTransactions
*WalletTransactionControllerApi* | [**getBalance**](docs/WalletTransactionControllerApi.md#getbalance) | **GET** /api/v1/wallet/balance | getBalance
*WalletTransactionControllerApi* | [**getRelatedRevenueList**](docs/WalletTransactionControllerApi.md#getrelatedrevenuelist) | **GET** /api/v1/wallet/related/revenue | getRelatedRevenueList
*WalletTransactionControllerApi* | [**getRelatedSum**](docs/WalletTransactionControllerApi.md#getrelatedsum) | **GET** /api/v1/wallet/related/sum | getRelatedSum
*WalletTransactionControllerApi* | [**getUserWalletTransaction**](docs/WalletTransactionControllerApi.md#getuserwallettransaction) | **GET** /api/v1/wallet/user/transaction/{id} | getUserWalletTransaction
*WalletTransactionControllerApi* | [**getWalletBalance**](docs/WalletTransactionControllerApi.md#getwalletbalance) | **GET** /api/v1/wallet/getbalance | getWalletBalance
*WalletTransactionControllerApi* | [**getWalletTransaction**](docs/WalletTransactionControllerApi.md#getwallettransaction) | **GET** /api/v1/wallet/subscriber/transaction/{id} | getWalletTransaction
*XmppAuthControllerApi* | [**closeSession**](docs/XmppAuthControllerApi.md#closesession) | **POST** /api/v1/datyar/xmpp/auth/close/{jid} | closeSession
*XmppAuthControllerApi* | [**generate**](docs/XmppAuthControllerApi.md#generate) | **GET** /api/v1/datyar/xmpp/auth/generate/{sid} | generate
*XmppAuthControllerApi* | [**get17**](docs/XmppAuthControllerApi.md#get17) | **GET** /api/v1/datyar/xmpp/auth/get | get

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.ActivationDto](docs/ActivationDto.md)
 - [io.swagger.client.models.ActivationResponseDto](docs/ActivationResponseDto.md)
 - [io.swagger.client.models.AdminSessionModel](docs/AdminSessionModel.md)
 - [io.swagger.client.models.AdminTicketDto](docs/AdminTicketDto.md)
 - [io.swagger.client.models.AllocatedDiscountDto](docs/AllocatedDiscountDto.md)
 - [io.swagger.client.models.ApiPermissionDto](docs/ApiPermissionDto.md)
 - [io.swagger.client.models.ApplicationDto](docs/ApplicationDto.md)
 - [io.swagger.client.models.AuthInfo](docs/AuthInfo.md)
 - [io.swagger.client.models.AuthResponse](docs/AuthResponse.md)
 - [io.swagger.client.models.Author](docs/Author.md)
 - [io.swagger.client.models.BalanceResponse](docs/BalanceResponse.md)
 - [io.swagger.client.models.BankCardAddressDto](docs/BankCardAddressDto.md)
 - [io.swagger.client.models.BankCardDto](docs/BankCardDto.md)
 - [io.swagger.client.models.BankCardExtraInfoDto](docs/BankCardExtraInfoDto.md)
 - [io.swagger.client.models.BankGatewayDto](docs/BankGatewayDto.md)
 - [io.swagger.client.models.BeforeLeaving](docs/BeforeLeaving.md)
 - [io.swagger.client.models.CampaignInDto](docs/CampaignInDto.md)
 - [io.swagger.client.models.CampaignOutDto](docs/CampaignOutDto.md)
 - [io.swagger.client.models.CancelSessionDto](docs/CancelSessionDto.md)
 - [io.swagger.client.models.Capability](docs/Capability.md)
 - [io.swagger.client.models.CapabilityDto](docs/CapabilityDto.md)
 - [io.swagger.client.models.Category](docs/Category.md)
 - [io.swagger.client.models.CategoryDto](docs/CategoryDto.md)
 - [io.swagger.client.models.ChangePasswordDto](docs/ChangePasswordDto.md)
 - [io.swagger.client.models.ChargeDto](docs/ChargeDto.md)
 - [io.swagger.client.models.CheckoutInputDto](docs/CheckoutInputDto.md)
 - [io.swagger.client.models.CheckoutOutputDto](docs/CheckoutOutputDto.md)
 - [io.swagger.client.models.Comment](docs/Comment.md)
 - [io.swagger.client.models.ConfigurationInputDto](docs/ConfigurationInputDto.md)
 - [io.swagger.client.models.ConfigurationOutputDto](docs/ConfigurationOutputDto.md)
 - [io.swagger.client.models.ConsultationPackage](docs/ConsultationPackage.md)
 - [io.swagger.client.models.ConsultationPackageDto](docs/ConsultationPackageDto.md)
 - [io.swagger.client.models.ConsultationSetting](docs/ConsultationSetting.md)
 - [io.swagger.client.models.ContentRateDto](docs/ContentRateDto.md)
 - [io.swagger.client.models.ContentRowDto](docs/ContentRowDto.md)
 - [io.swagger.client.models.CreateApplicationVersion](docs/CreateApplicationVersion.md)
 - [io.swagger.client.models.CreateCommentDto](docs/CreateCommentDto.md)
 - [io.swagger.client.models.CreateContentDto](docs/CreateContentDto.md)
 - [io.swagger.client.models.CreateFileRequest](docs/CreateFileRequest.md)
 - [io.swagger.client.models.CreateGeoDto](docs/CreateGeoDto.md)
 - [io.swagger.client.models.CreateLawyerDto](docs/CreateLawyerDto.md)
 - [io.swagger.client.models.CreateLocationDto](docs/CreateLocationDto.md)
 - [io.swagger.client.models.CreateLocationPropertyDto](docs/CreateLocationPropertyDto.md)
 - [io.swagger.client.models.CreateLocationPropertyOptionDto](docs/CreateLocationPropertyOptionDto.md)
 - [io.swagger.client.models.CreateMessageDto](docs/CreateMessageDto.md)
 - [io.swagger.client.models.CreateMultiRateDto](docs/CreateMultiRateDto.md)
 - [io.swagger.client.models.CreateNotificationDto](docs/CreateNotificationDto.md)
 - [io.swagger.client.models.CreatePropertyDto](docs/CreatePropertyDto.md)
 - [io.swagger.client.models.CreatePushTokenDto](docs/CreatePushTokenDto.md)
 - [io.swagger.client.models.CreateRateDto](docs/CreateRateDto.md)
 - [io.swagger.client.models.CreateRateOpinionDto](docs/CreateRateOpinionDto.md)
 - [io.swagger.client.models.CreateSessionDto](docs/CreateSessionDto.md)
 - [io.swagger.client.models.CreateSubscriberWalletTransactionDto](docs/CreateSubscriberWalletTransactionDto.md)
 - [io.swagger.client.models.CreateUserWalletTransactionDto](docs/CreateUserWalletTransactionDto.md)
 - [io.swagger.client.models.DailyReportDto](docs/DailyReportDto.md)
 - [io.swagger.client.models.DatyarCreateLocationDto](docs/DatyarCreateLocationDto.md)
 - [io.swagger.client.models.DatyarNotification](docs/DatyarNotification.md)
 - [io.swagger.client.models.DatyarUser](docs/DatyarUser.md)
 - [io.swagger.client.models.DatyarWalletTransactionDto](docs/DatyarWalletTransactionDto.md)
 - [io.swagger.client.models.DiscountDto](docs/DiscountDto.md)
 - [io.swagger.client.models.DiscountReq](docs/DiscountReq.md)
 - [io.swagger.client.models.DiscountRes](docs/DiscountRes.md)
 - [io.swagger.client.models.DiscountSubscriberLogDtoReq](docs/DiscountSubscriberLogDtoReq.md)
 - [io.swagger.client.models.DiscountSubscriberLogDtoRes](docs/DiscountSubscriberLogDtoRes.md)
 - [io.swagger.client.models.DiscountSubscriberLogValidModel](docs/DiscountSubscriberLogValidModel.md)
 - [io.swagger.client.models.DiscountType](docs/DiscountType.md)
 - [io.swagger.client.models.DiscountUserLogDtoReq](docs/DiscountUserLogDtoReq.md)
 - [io.swagger.client.models.DiscountUserLogDtoRes](docs/DiscountUserLogDtoRes.md)
 - [io.swagger.client.models.DiscountUserLogValidModel](docs/DiscountUserLogValidModel.md)
 - [io.swagger.client.models.DiscountValidationDto](docs/DiscountValidationDto.md)
 - [io.swagger.client.models.DoTransactionDto](docs/DoTransactionDto.md)
 - [io.swagger.client.models.EditCommentDto](docs/EditCommentDto.md)
 - [io.swagger.client.models.Education](docs/Education.md)
 - [io.swagger.client.models.EducationalBackground](docs/EducationalBackground.md)
 - [io.swagger.client.models.EducationalBackgroundDTO](docs/EducationalBackgroundDTO.md)
 - [io.swagger.client.models.ExtendConsultationDto](docs/ExtendConsultationDto.md)
 - [io.swagger.client.models.FileOrFolder](docs/FileOrFolder.md)
 - [io.swagger.client.models.FileUploadBody](docs/FileUploadBody.md)
 - [io.swagger.client.models.FinalFromToTimeModel](docs/FinalFromToTimeModel.md)
 - [io.swagger.client.models.ForgetPasswordInputDto](docs/ForgetPasswordInputDto.md)
 - [io.swagger.client.models.FromToTime](docs/FromToTime.md)
 - [io.swagger.client.models.GenericResponseDto_object_](docs/GenericResponseDto_object_.md)
 - [io.swagger.client.models.GetApplicationVersion](docs/GetApplicationVersion.md)
 - [io.swagger.client.models.GetComment](docs/GetComment.md)
 - [io.swagger.client.models.GetCommentDto](docs/GetCommentDto.md)
 - [io.swagger.client.models.GetContentDto](docs/GetContentDto.md)
 - [io.swagger.client.models.GetContentLocationDto](docs/GetContentLocationDto.md)
 - [io.swagger.client.models.GetContentPropertyDto](docs/GetContentPropertyDto.md)
 - [io.swagger.client.models.GetGeoDto](docs/GetGeoDto.md)
 - [io.swagger.client.models.GetInvoiceInformationDto](docs/GetInvoiceInformationDto.md)
 - [io.swagger.client.models.GetLatestVersion](docs/GetLatestVersion.md)
 - [io.swagger.client.models.GetLawyerDto](docs/GetLawyerDto.md)
 - [io.swagger.client.models.GetListLocationDto](docs/GetListLocationDto.md)
 - [io.swagger.client.models.GetLocationDto](docs/GetLocationDto.md)
 - [io.swagger.client.models.GetLocationPropertyDto](docs/GetLocationPropertyDto.md)
 - [io.swagger.client.models.GetLocationPropertyOptionDto](docs/GetLocationPropertyOptionDto.md)
 - [io.swagger.client.models.GetNotificationDto](docs/GetNotificationDto.md)
 - [io.swagger.client.models.GetPushTokenDto](docs/GetPushTokenDto.md)
 - [io.swagger.client.models.GetRateDto](docs/GetRateDto.md)
 - [io.swagger.client.models.GetRateOpinionDto](docs/GetRateOpinionDto.md)
 - [io.swagger.client.models.GradeDto](docs/GradeDto.md)
 - [io.swagger.client.models.InboxStatus](docs/InboxStatus.md)
 - [io.swagger.client.models.InitialProfileCategorySkillDto](docs/InitialProfileCategorySkillDto.md)
 - [io.swagger.client.models.InitialProfileLawyerDto](docs/InitialProfileLawyerDto.md)
 - [io.swagger.client.models.InitialprofileUploadfileBody](docs/InitialprofileUploadfileBody.md)
 - [io.swagger.client.models.KeyQueryParam](docs/KeyQueryParam.md)
 - [io.swagger.client.models.LanguageDTO](docs/LanguageDTO.md)
 - [io.swagger.client.models.LanguageModel](docs/LanguageModel.md)
 - [io.swagger.client.models.Lawyer](docs/Lawyer.md)
 - [io.swagger.client.models.LawyerCancellationsDto](docs/LawyerCancellationsDto.md)
 - [io.swagger.client.models.LawyerCategoryModel](docs/LawyerCategoryModel.md)
 - [io.swagger.client.models.LawyerConfirmationDto](docs/LawyerConfirmationDto.md)
 - [io.swagger.client.models.LawyerConsultingDto](docs/LawyerConsultingDto.md)
 - [io.swagger.client.models.LawyerGradeModel](docs/LawyerGradeModel.md)
 - [io.swagger.client.models.LawyerType](docs/LawyerType.md)
 - [io.swagger.client.models.LawyerTypeDto](docs/LawyerTypeDto.md)
 - [io.swagger.client.models.LawyerTypeResponseModel](docs/LawyerTypeResponseModel.md)
 - [io.swagger.client.models.LawyersLicenseUploadFile](docs/LawyersLicenseUploadFile.md)
 - [io.swagger.client.models.LawyersLicenseUploadFileDto](docs/LawyersLicenseUploadFileDto.md)
 - [io.swagger.client.models.LawyersResumeAndDegreeEducationDto](docs/LawyersResumeAndDegreeEducationDto.md)
 - [io.swagger.client.models.LawyersResumesAndDegreesEducation](docs/LawyersResumesAndDegreesEducation.md)
 - [io.swagger.client.models.ListSessionDto](docs/ListSessionDto.md)
 - [io.swagger.client.models.LocationAddressDto](docs/LocationAddressDto.md)
 - [io.swagger.client.models.LocationCategoryDto](docs/LocationCategoryDto.md)
 - [io.swagger.client.models.LocationCategoryResultDto](docs/LocationCategoryResultDto.md)
 - [io.swagger.client.models.LocationTagDto](docs/LocationTagDto.md)
 - [io.swagger.client.models.MailServerDto](docs/MailServerDto.md)
 - [io.swagger.client.models.MetaData](docs/MetaData.md)
 - [io.swagger.client.models.NotificationDto](docs/NotificationDto.md)
 - [io.swagger.client.models.NotificationStatus](docs/NotificationStatus.md)
 - [io.swagger.client.models.OneFieldModel](docs/OneFieldModel.md)
 - [io.swagger.client.models.OrganizationalCalendarDto](docs/OrganizationalCalendarDto.md)
 - [io.swagger.client.models.OutputSessionDTO](docs/OutputSessionDTO.md)
 - [io.swagger.client.models.Owner](docs/Owner.md)
 - [io.swagger.client.models.OwnerDto](docs/OwnerDto.md)
 - [io.swagger.client.models.PackageProperties](docs/PackageProperties.md)
 - [io.swagger.client.models.Page_AdminSessionModel_](docs/Page_AdminSessionModel_.md)
 - [io.swagger.client.models.Page_AdminTicketDto_](docs/Page_AdminTicketDto_.md)
 - [io.swagger.client.models.Page_ApplicationDto_](docs/Page_ApplicationDto_.md)
 - [io.swagger.client.models.Page_BankGatewayDto_](docs/Page_BankGatewayDto_.md)
 - [io.swagger.client.models.Page_CampaignOutDto_](docs/Page_CampaignOutDto_.md)
 - [io.swagger.client.models.Page_CategoryDto_](docs/Page_CategoryDto_.md)
 - [io.swagger.client.models.Page_CheckoutOutputDto_](docs/Page_CheckoutOutputDto_.md)
 - [io.swagger.client.models.Page_ConfigurationOutputDto_](docs/Page_ConfigurationOutputDto_.md)
 - [io.swagger.client.models.Page_DatyarUser_](docs/Page_DatyarUser_.md)
 - [io.swagger.client.models.Page_DatyarWalletTransactionDto_](docs/Page_DatyarWalletTransactionDto_.md)
 - [io.swagger.client.models.Page_DiscountDto_](docs/Page_DiscountDto_.md)
 - [io.swagger.client.models.Page_DiscountSubscriberLogDto_](docs/Page_DiscountSubscriberLogDto_.md)
 - [io.swagger.client.models.Page_DiscountUserLogDto_](docs/Page_DiscountUserLogDto_.md)
 - [io.swagger.client.models.Page_GetApplicationVersion_](docs/Page_GetApplicationVersion_.md)
 - [io.swagger.client.models.Page_GetCommentDto_](docs/Page_GetCommentDto_.md)
 - [io.swagger.client.models.Page_GetComment_](docs/Page_GetComment_.md)
 - [io.swagger.client.models.Page_GetContentDto_](docs/Page_GetContentDto_.md)
 - [io.swagger.client.models.Page_GetContentPropertyDto_](docs/Page_GetContentPropertyDto_.md)
 - [io.swagger.client.models.Page_GetListLocationDto_](docs/Page_GetListLocationDto_.md)
 - [io.swagger.client.models.Page_GetLocationPropertyDto_](docs/Page_GetLocationPropertyDto_.md)
 - [io.swagger.client.models.Page_GetNotificationDto_](docs/Page_GetNotificationDto_.md)
 - [io.swagger.client.models.Page_GetPushTokenDto_](docs/Page_GetPushTokenDto_.md)
 - [io.swagger.client.models.Page_GetRateDto_](docs/Page_GetRateDto_.md)
 - [io.swagger.client.models.Page_GetRateOpinionDto_](docs/Page_GetRateOpinionDto_.md)
 - [io.swagger.client.models.Page_Lawyer_](docs/Page_Lawyer_.md)
 - [io.swagger.client.models.Page_ListSessionDto_](docs/Page_ListSessionDto_.md)
 - [io.swagger.client.models.Page_LocationCategoryResultDto_](docs/Page_LocationCategoryResultDto_.md)
 - [io.swagger.client.models.Page_LocationTagDto_](docs/Page_LocationTagDto_.md)
 - [io.swagger.client.models.Page_MailServerDto_](docs/Page_MailServerDto_.md)
 - [io.swagger.client.models.Page_NotificationDto_](docs/Page_NotificationDto_.md)
 - [io.swagger.client.models.Page_OrganizationalCalendarDto_](docs/Page_OrganizationalCalendarDto_.md)
 - [io.swagger.client.models.Page_PushServerDto_](docs/Page_PushServerDto_.md)
 - [io.swagger.client.models.Page_PushTokenDto_](docs/Page_PushTokenDto_.md)
 - [io.swagger.client.models.Page_QueAnsCategoryDto_](docs/Page_QueAnsCategoryDto_.md)
 - [io.swagger.client.models.Page_QueAnsDto_](docs/Page_QueAnsDto_.md)
 - [io.swagger.client.models.Page_RateDto_](docs/Page_RateDto_.md)
 - [io.swagger.client.models.Page_ReferralUserDto_](docs/Page_ReferralUserDto_.md)
 - [io.swagger.client.models.Page_RolePermissionDto_](docs/Page_RolePermissionDto_.md)
 - [io.swagger.client.models.Page_SmsServerDto_](docs/Page_SmsServerDto_.md)
 - [io.swagger.client.models.Page_SupportCategoryDto_](docs/Page_SupportCategoryDto_.md)
 - [io.swagger.client.models.Page_TagDto_](docs/Page_TagDto_.md)
 - [io.swagger.client.models.Page_TicketDto_](docs/Page_TicketDto_.md)
 - [io.swagger.client.models.Page_TicketMessageDto_](docs/Page_TicketMessageDto_.md)
 - [io.swagger.client.models.Page_TransactionDto_](docs/Page_TransactionDto_.md)
 - [io.swagger.client.models.Page_UserDto_](docs/Page_UserDto_.md)
 - [io.swagger.client.models.Page_WalletTransactionDto_](docs/Page_WalletTransactionDto_.md)
 - [io.swagger.client.models.Pageable](docs/Pageable.md)
 - [io.swagger.client.models.PaymentModel](docs/PaymentModel.md)
 - [io.swagger.client.models.PersonalInformation](docs/PersonalInformation.md)
 - [io.swagger.client.models.PersonalInformationDTO](docs/PersonalInformationDTO.md)
 - [io.swagger.client.models.PersonalInformationReq](docs/PersonalInformationReq.md)
 - [io.swagger.client.models.PersonalInformationRes](docs/PersonalInformationRes.md)
 - [io.swagger.client.models.PivotalPermission](docs/PivotalPermission.md)
 - [io.swagger.client.models.PivotalPermissionDto](docs/PivotalPermissionDto.md)
 - [io.swagger.client.models.ProfessionalInformationDTO](docs/ProfessionalInformationDTO.md)
 - [io.swagger.client.models.ProfessionalInformationProDTO](docs/ProfessionalInformationProDTO.md)
 - [io.swagger.client.models.ProfessionalInputDTO](docs/ProfessionalInputDTO.md)
 - [io.swagger.client.models.ProfessionalPersonalInformationDTOReq](docs/ProfessionalPersonalInformationDTOReq.md)
 - [io.swagger.client.models.ProfessionalPersonalInformationDTORes](docs/ProfessionalPersonalInformationDTORes.md)
 - [io.swagger.client.models.ProfessionalProfile](docs/ProfessionalProfile.md)
 - [io.swagger.client.models.ProfessionalProfileDTO](docs/ProfessionalProfileDTO.md)
 - [io.swagger.client.models.ProfessionalProfileInitialProfileDto](docs/ProfessionalProfileInitialProfileDto.md)
 - [io.swagger.client.models.PropertyOptionDto](docs/PropertyOptionDto.md)
 - [io.swagger.client.models.PushMessageDto](docs/PushMessageDto.md)
 - [io.swagger.client.models.PushServerDto](docs/PushServerDto.md)
 - [io.swagger.client.models.PushTokenDto](docs/PushTokenDto.md)
 - [io.swagger.client.models.QueAnsCategoryDto](docs/QueAnsCategoryDto.md)
 - [io.swagger.client.models.QueAnsDto](docs/QueAnsDto.md)
 - [io.swagger.client.models.RateDto](docs/RateDto.md)
 - [io.swagger.client.models.ReferralLogInDto](docs/ReferralLogInDto.md)
 - [io.swagger.client.models.ReferralUserDto](docs/ReferralUserDto.md)
 - [io.swagger.client.models.RegisterResponseDto](docs/RegisterResponseDto.md)
 - [io.swagger.client.models.RegisterWithTypeDto](docs/RegisterWithTypeDto.md)
 - [io.swagger.client.models.RequestEmailOtpDto](docs/RequestEmailOtpDto.md)
 - [io.swagger.client.models.RequestMobileOtpDto](docs/RequestMobileOtpDto.md)
 - [io.swagger.client.models.Research](docs/Research.md)
 - [io.swagger.client.models.ResetPasswordInputDto](docs/ResetPasswordInputDto.md)
 - [io.swagger.client.models.Resume](docs/Resume.md)
 - [io.swagger.client.models.ResumeDTO](docs/ResumeDTO.md)
 - [io.swagger.client.models.RevenueDto](docs/RevenueDto.md)
 - [io.swagger.client.models.RolePermissionDto](docs/RolePermissionDto.md)
 - [io.swagger.client.models.SelectSkill](docs/SelectSkill.md)
 - [io.swagger.client.models.SelectSkillDto](docs/SelectSkillDto.md)
 - [io.swagger.client.models.SelectSkillReq](docs/SelectSkillReq.md)
 - [io.swagger.client.models.SelectSkillRes](docs/SelectSkillRes.md)
 - [io.swagger.client.models.SenderExtraInfo](docs/SenderExtraInfo.md)
 - [io.swagger.client.models.SenderInfo](docs/SenderInfo.md)
 - [io.swagger.client.models.ServicesOutputDto](docs/ServicesOutputDto.md)
 - [io.swagger.client.models.Session](docs/Session.md)
 - [io.swagger.client.models.SessionHistory](docs/SessionHistory.md)
 - [io.swagger.client.models.SessionMessage](docs/SessionMessage.md)
 - [io.swagger.client.models.SetSessionStartTimeDto](docs/SetSessionStartTimeDto.md)
 - [io.swagger.client.models.SettingInputDto](docs/SettingInputDto.md)
 - [io.swagger.client.models.SettingOutputDto](docs/SettingOutputDto.md)
 - [io.swagger.client.models.SimpleMailDto](docs/SimpleMailDto.md)
 - [io.swagger.client.models.SimpleSmsDto](docs/SimpleSmsDto.md)
 - [io.swagger.client.models.Skill](docs/Skill.md)
 - [io.swagger.client.models.SkillCategory](docs/SkillCategory.md)
 - [io.swagger.client.models.SkillCategoryDto](docs/SkillCategoryDto.md)
 - [io.swagger.client.models.SkillCategoryModel](docs/SkillCategoryModel.md)
 - [io.swagger.client.models.SkillCategoryReq](docs/SkillCategoryReq.md)
 - [io.swagger.client.models.SkillCategoryRes](docs/SkillCategoryRes.md)
 - [io.swagger.client.models.SkillDto](docs/SkillDto.md)
 - [io.swagger.client.models.SkillModel](docs/SkillModel.md)
 - [io.swagger.client.models.SkillReq](docs/SkillReq.md)
 - [io.swagger.client.models.SkillRes](docs/SkillRes.md)
 - [io.swagger.client.models.SkillValueTitle](docs/SkillValueTitle.md)
 - [io.swagger.client.models.SkillsDto](docs/SkillsDto.md)
 - [io.swagger.client.models.SmartSkillCategoryDto](docs/SmartSkillCategoryDto.md)
 - [io.swagger.client.models.SmsServerDto](docs/SmsServerDto.md)
 - [io.swagger.client.models.Sort](docs/Sort.md)
 - [io.swagger.client.models.StateDto_string_](docs/StateDto_string_.md)
 - [io.swagger.client.models.StateMachine_string_](docs/StateMachine_string_.md)
 - [io.swagger.client.models.StateMachinedDto_string_](docs/StateMachinedDto_string_.md)
 - [io.swagger.client.models.State_string_](docs/State_string_.md)
 - [io.swagger.client.models.SumResponse](docs/SumResponse.md)
 - [io.swagger.client.models.SupportCategoryDto](docs/SupportCategoryDto.md)
 - [io.swagger.client.models.TagDto](docs/TagDto.md)
 - [io.swagger.client.models.TicketDto](docs/TicketDto.md)
 - [io.swagger.client.models.TicketMessageDto](docs/TicketMessageDto.md)
 - [io.swagger.client.models.TicketMessageInputDto](docs/TicketMessageInputDto.md)
 - [io.swagger.client.models.TopLawyerOutputDto](docs/TopLawyerOutputDto.md)
 - [io.swagger.client.models.TransactionDto](docs/TransactionDto.md)
 - [io.swagger.client.models.TransactionResultDto](docs/TransactionResultDto.md)
 - [io.swagger.client.models.TransferBalanceDto](docs/TransferBalanceDto.md)
 - [io.swagger.client.models.TypeDto](docs/TypeDto.md)
 - [io.swagger.client.models.UpdateApplicationVersion](docs/UpdateApplicationVersion.md)
 - [io.swagger.client.models.UpdateChargeDto](docs/UpdateChargeDto.md)
 - [io.swagger.client.models.UpdateNotificationDto](docs/UpdateNotificationDto.md)
 - [io.swagger.client.models.UpdateRateDto](docs/UpdateRateDto.md)
 - [io.swagger.client.models.UpdateRateOpinionDto](docs/UpdateRateOpinionDto.md)
 - [io.swagger.client.models.UploadFoldernameBody](docs/UploadFoldernameBody.md)
 - [io.swagger.client.models.UploadPublicfileBody](docs/UploadPublicfileBody.md)
 - [io.swagger.client.models.UploadPublicfilewithfoldernameBody](docs/UploadPublicfilewithfoldernameBody.md)
 - [io.swagger.client.models.UsageReportDto](docs/UsageReportDto.md)
 - [io.swagger.client.models.User](docs/User.md)
 - [io.swagger.client.models.UserDto](docs/UserDto.md)
 - [io.swagger.client.models.UserExtraInfo](docs/UserExtraInfo.md)
 - [io.swagger.client.models.UserExtraInfoDto](docs/UserExtraInfoDto.md)
 - [io.swagger.client.models.UserInputDto](docs/UserInputDto.md)
 - [io.swagger.client.models.UserPersonalAddress](docs/UserPersonalAddress.md)
 - [io.swagger.client.models.UserPersonalAddressDto](docs/UserPersonalAddressDto.md)
 - [io.swagger.client.models.UserPrivateBody](docs/UserPrivateBody.md)
 - [io.swagger.client.models.UserPublicBody](docs/UserPublicBody.md)
 - [io.swagger.client.models.UserReportDto](docs/UserReportDto.md)
 - [io.swagger.client.models.UserVerificationDto](docs/UserVerificationDto.md)
 - [io.swagger.client.models.ValidateDiscountAmountDto](docs/ValidateDiscountAmountDto.md)
 - [io.swagger.client.models.VerificationByMobileDto](docs/VerificationByMobileDto.md)
 - [io.swagger.client.models.WalletAccountDto](docs/WalletAccountDto.md)
 - [io.swagger.client.models.WalletTransactionDto](docs/WalletTransactionDto.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Authorization"></a>
### Authorization


"# kotlinsdk" 
