package com.csgsystems.bp.proxy;

import com.csgsystems.api.proxy.InterfaceFactoryException;

import java.util.Properties;

import com.csgsystems.api.utilities.ConfigurationManager;

import com.csgsystems.api.security.PassiveCallbackHandler;

import javax.security.auth.login.LoginContext;

import com.csgsystems.bp.interfaces.*;

import com.csgsystems.bp.session.*;

import com.csgsystems.aruba.connection.BSDMSettings;

import com.csgsystems.api.utilities.Logger;

import com.csgsystems.api.utilities.pool.ObjectPool;

public class PoolInterfaceFactory implements InterfaceFactory {

	protected String user = null;
	protected String password = null;
	protected String lcName = null;

	protected long expireTime = 3600000;

	public PoolInterfaceFactory () {
		try {
			ConfigurationManager cManager = ConfigurationManager.getInstance();
			Properties props = cManager.getPropertiesFromClassPath("/api.properties");
			user = props.getProperty("ejb.security.login", "guest");
			password = props.getProperty("ejb.security.password", "guest");
			lcName = props.getProperty("ejb.security.lcname", "client-login");
			expireTime = Long.parseLong(props.getProperty("bppoolproxy.expiration", "3600000"));
		} catch (Exception x) {
			Logger.error(this.getClass(), "constructor", "Could not load properties for /api.properties");
		}
		_AbiAutoPayCmfMapPool = new AbiAutoPayCmfMapPool(expireTime);
		_AbiBillMessagesPool = new AbiBillMessagesPool(expireTime);
		_AbiBillingStatisticsPool = new AbiBillingStatisticsPool(expireTime);
		_AbiNrcDucPool = new AbiNrcDucPool(expireTime);
		_AccountPool = new AccountPool(expireTime);
		_AccountAbiSourcePool = new AccountAbiSourcePool(expireTime);
		_AccountBalancesPool = new AccountBalancesPool(expireTime);
		_AccountBonusPointBalancePool = new AccountBonusPointBalancePool(expireTime);
		_AccountBonusPointTransactionPool = new AccountBonusPointTransactionPool(expireTime);
		_AccountCodePool = new AccountCodePool(expireTime);
		_AccountCodeGroupPool = new AccountCodeGroupPool(expireTime);
		_AccountHqContractPool = new AccountHqContractPool(expireTime);
		_AccountIdPool = new AccountIdPool(expireTime);
		_AccountInsertPool = new AccountInsertPool(expireTime);
		_AccountLocatePool = new AccountLocatePool(expireTime);
		_AccountMessagePool = new AccountMessagePool(expireTime);
		_AccountSegmentPool = new AccountSegmentPool(expireTime);
		_AccountSegmentMapPool = new AccountSegmentMapPool(expireTime);
		_AccountStatusPool = new AccountStatusPool(expireTime);
		_AdjustmentPool = new AdjustmentPool(expireTime);
		_AdjustmentReasonPool = new AdjustmentReasonPool(expireTime);
		_AdjustmentTaxPool = new AdjustmentTaxPool(expireTime);
		_AdjustmentTypePool = new AdjustmentTypePool(expireTime);
		_AxrtCountryCodeMapPool = new AxrtCountryCodeMapPool(expireTime);
		_AxrtCurrCodeMapPool = new AxrtCurrCodeMapPool(expireTime);
		_AxrtCurrencyCodeMapPool = new AxrtCurrencyCodeMapPool(expireTime);
		_AxrtPaymentPool = new AxrtPaymentPool(expireTime);
		_AxrtPaymentMerchantPool = new AxrtPaymentMerchantPool(expireTime);
		_AxrtPaymentProfilePool = new AxrtPaymentProfilePool(expireTime);
		_AxrtPaymentTransPool = new AxrtPaymentTransPool(expireTime);
		_BalanceLineItemPool = new BalanceLineItemPool(expireTime);
		_BalanceLineItemBulkAdjustmentPool = new BalanceLineItemBulkAdjustmentPool(expireTime);
		_BalanceXferDiffPool = new BalanceXferDiffPool(expireTime);
		_BamErrorCodePool = new BamErrorCodePool(expireTime);
		_BillCyclePool = new BillCyclePool(expireTime);
		_BillDispatchMethodPool = new BillDispatchMethodPool(expireTime);
		_BillImagePool = new BillImagePool(expireTime);
		_BillImagePagePool = new BillImagePagePool(expireTime);
		_BillInsertGroupPool = new BillInsertGroupPool(expireTime);
		_BillInsertGroupMapPool = new BillInsertGroupMapPool(expireTime);
		_BillMessageGroupPool = new BillMessageGroupPool(expireTime);
		_BillMessageGroupMapPool = new BillMessageGroupMapPool(expireTime);
		_BilledUsagePool = new BilledUsagePool(expireTime);
		_BilledUsageBulkAdjustmentPool = new BilledUsageBulkAdjustmentPool(expireTime);
		_BonusPointRatePool = new BonusPointRatePool(expireTime);
		_BonusPointTransTypePool = new BonusPointTransTypePool(expireTime);
		_CcAuditLogPool = new CcAuditLogPool(expireTime);
		_CdrDataDucPool = new CdrDataDucPool(expireTime);
		_ChargeDistribPercentPool = new ChargeDistribPercentPool(expireTime);
		_ClearingHousePool = new ClearingHousePool(expireTime);
		_ClearingHouseContactsPool = new ClearingHouseContactsPool(expireTime);
		_ClearingHouseInfoPool = new ClearingHouseInfoPool(expireTime);
		_CmfBonusPointPool = new CmfBonusPointPool(expireTime);
		_CmfPackageOverridesPool = new CmfPackageOverridesPool(expireTime);
		_CmfRewardBalanceDetailPool = new CmfRewardBalanceDetailPool(expireTime);
		_CmfStatusPool = new CmfStatusPool(expireTime);
		_CmfStatusChgReasonPool = new CmfStatusChgReasonPool(expireTime);
		_ConnectReasonPool = new ConnectReasonPool(expireTime);
		_ContactPool = new ContactPool(expireTime);
		_ContractDiscountPool = new ContractDiscountPool(expireTime);
		_CorridorPool = new CorridorPool(expireTime);
		_CorridorRateBandOverridePool = new CorridorRateBandOverridePool(expireTime);
		_CorridorRateOverridePool = new CorridorRateOverridePool(expireTime);
		_CreditCardPool = new CreditCardPool(expireTime);
		_CreditCardTypeCodePool = new CreditCardTypeCodePool(expireTime);
		_CsrPool = new CsrPool(expireTime);
		_CsrAccountSegmentPool = new CsrAccountSegmentPool(expireTime);
		_CsrGroupAmountPool = new CsrGroupAmountPool(expireTime);
		_CsrGroupFunctionPool = new CsrGroupFunctionPool(expireTime);
		_CustomerDocumentPool = new CustomerDocumentPool(expireTime);
		_CustomerDtServerPool = new CustomerDtServerPool(expireTime);
		_CustomerDtUrlPool = new CustomerDtUrlPool(expireTime);
		_CustomerServiceCenterPool = new CustomerServiceCenterPool(expireTime);
		_DepositPool = new DepositPool(expireTime);
		_DepositTypePool = new DepositTypePool(expireTime);
		_DiscReasonPool = new DiscReasonPool(expireTime);
		_DocumentTypeRefPool = new DocumentTypeRefPool(expireTime);
		_EarlyTerminationChargePool = new EarlyTerminationChargePool(expireTime);
		_EftResponseCodePool = new EftResponseCodePool(expireTime);
		_EftTransactionPool = new EftTransactionPool(expireTime);
		_EnhancedNotePool = new EnhancedNotePool(expireTime);
		_ExchangeRateClassPool = new ExchangeRateClassPool(expireTime);
		_ExtendedDataAssociationPool = new ExtendedDataAssociationPool(expireTime);
		_ExtendedDataEnumerationPool = new ExtendedDataEnumerationPool(expireTime);
		_ExtendedDataLocatePool = new ExtendedDataLocatePool(expireTime);
		_ExtendedDataParamPool = new ExtendedDataParamPool(expireTime);
		_ExtendedDataParamTypePool = new ExtendedDataParamTypePool(expireTime);
		_ExternalIdAcctMapPool = new ExternalIdAcctMapPool(expireTime);
		_ExternalIdHqGroupsMapPool = new ExternalIdHqGroupsMapPool(expireTime);
		_FranchiseCodePool = new FranchiseCodePool(expireTime);
		_GenderTypePool = new GenderTypePool(expireTime);
		_GenericEnumerationPool = new GenericEnumerationPool(expireTime);
		_GeocodePool = new GeocodePool(expireTime);
		_GlobalAccountBalancesPool = new GlobalAccountBalancesPool(expireTime);
		_GlobalContractPool = new GlobalContractPool(expireTime);
		_GlobalOpenItemIdMapPool = new GlobalOpenItemIdMapPool(expireTime);
		_GroupPool = new GroupPool(expireTime);
		_GroupLocatePool = new GroupLocatePool(expireTime);
		_GroupMemberPool = new GroupMemberPool(expireTime);
		_GuiIndicatorPool = new GuiIndicatorPool(expireTime);
		_HistoricalContributionPool = new HistoricalContributionPool(expireTime);
		_HistoricalContributionTaxPool = new HistoricalContributionTaxPool(expireTime);
		_HistoricalThresholdsPool = new HistoricalThresholdsPool(expireTime);
		_HqContractUnitCrPool = new HqContractUnitCrPool(expireTime);
		_HqGroupContractsPool = new HqGroupContractsPool(expireTime);
		_HqGroupCorridorPool = new HqGroupCorridorPool(expireTime);
		_HqGroupMembersPool = new HqGroupMembersPool(expireTime);
		_HqGroupProductPool = new HqGroupProductPool(expireTime);
		_HqGroupsPool = new HqGroupsPool(expireTime);
		_HqgroupUsageRedirectMapPool = new HqgroupUsageRedirectMapPool(expireTime);
		_InterimBillPool = new InterimBillPool(expireTime);
		_InvoicePool = new InvoicePool(expireTime);
		_InvoiceDetailPool = new InvoiceDetailPool(expireTime);
		_InvoiceDetailBulkAdjustmentPool = new InvoiceDetailBulkAdjustmentPool(expireTime);
		_LateFeeRateOverridesPool = new LateFeeRateOverridesPool(expireTime);
		_LbxPaymentTypePool = new LbxPaymentTypePool(expireTime);
		_MultiLinesAdjPool = new MultiLinesAdjPool(expireTime);
		_NetActionPool = new NetActionPool(expireTime);
		_NotePool = new NotePool(expireTime);
		_NoteCodePool = new NoteCodePool(expireTime);
		_NoteTextPool = new NoteTextPool(expireTime);
		_OpenItemPool = new OpenItemPool(expireTime);
		_OpenItemIdMapPool = new OpenItemIdMapPool(expireTime);
		_OrderQuotePool = new OrderQuotePool(expireTime);
		_OverrideDiscountRatePool = new OverrideDiscountRatePool(expireTime);
		_OverrideUsageCreditRatePool = new OverrideUsageCreditRatePool(expireTime);
		_OwningCostCenterPool = new OwningCostCenterPool(expireTime);
		_PackageComponentDefPool = new PackageComponentDefPool(expireTime);
		_PaymentPool = new PaymentPool(expireTime);
		_PaymentDistributionPool = new PaymentDistributionPool(expireTime);
		_PaymentMerchantIdPool = new PaymentMerchantIdPool(expireTime);
		_PaymentMerchantIdAssignPool = new PaymentMerchantIdAssignPool(expireTime);
		_PaymentProfilePool = new PaymentProfilePool(expireTime);
		_PaymentTransPool = new PaymentTransPool(expireTime);
		_PaymentTypePool = new PaymentTypePool(expireTime);
		_PrepaymentPool = new PrepaymentPool(expireTime);
		_PrepaymentDistributionPool = new PrepaymentDistributionPool(expireTime);
		_PrivacyLevelPool = new PrivacyLevelPool(expireTime);
		_ProductCatalogPool = new ProductCatalogPool(expireTime);
		_ProductChargeMapPool = new ProductChargeMapPool(expireTime);
		_ProductRateKeyPool = new ProductRateKeyPool(expireTime);
		_ProductRateOverridePool = new ProductRateOverridePool(expireTime);
		_ProductRcRatePool = new ProductRcRatePool(expireTime);
		_RefinancePlanPool = new RefinancePlanPool(expireTime);
		_RefundPool = new RefundPool(expireTime);
		_RefundReasonPool = new RefundReasonPool(expireTime);
		_RegulatoryIdPool = new RegulatoryIdPool(expireTime);
		_RevRcvCostCenterPool = new RevRcvCostCenterPool(expireTime);
		_ReverseBulkAdjustmentPool = new ReverseBulkAdjustmentPool(expireTime);
		_RewardBalancePool = new RewardBalancePool(expireTime);
		_RewardBalanceEntityMappingPool = new RewardBalanceEntityMappingPool(expireTime);
		_RtPaymentResponsePool = new RtPaymentResponsePool(expireTime);
		_SalesChannelPool = new SalesChannelPool(expireTime);
		_SecurityAciPool = new SecurityAciPool(expireTime);
		_SecurityResourcePool = new SecurityResourcePool(expireTime);
		_SecurityRolePool = new SecurityRolePool(expireTime);
		_SecurityUserPool = new SecurityUserPool(expireTime);
		_ServerPool = new ServerPool(expireTime);
		_ServerCategoryPool = new ServerCategoryPool(expireTime);
		_ServerDefinitionPool = new ServerDefinitionPool(expireTime);
		_ServiceCenterPool = new ServiceCenterPool(expireTime);
		_ServiceCenterTypePool = new ServiceCenterTypePool(expireTime);
		_ServiceMasterGroupPool = new ServiceMasterGroupPool(expireTime);
		_ServicePricingPlanPool = new ServicePricingPlanPool(expireTime);
		_ServiceZonePool = new ServiceZonePool(expireTime);
		_SlaMeasurementDataPool = new SlaMeasurementDataPool(expireTime);
		_StatusReasonMapPool = new StatusReasonMapPool(expireTime);
		_TaxAbandonedPool = new TaxAbandonedPool(expireTime);
		_TaxAssignmentPool = new TaxAssignmentPool(expireTime);
		_TaxExemptionPool = new TaxExemptionPool(expireTime);
		_TaxPackageInstPool = new TaxPackageInstPool(expireTime);
		_TaxRatesVatPool = new TaxRatesVatPool(expireTime);
		_TaxStatusPool = new TaxStatusPool(expireTime);
		_TaxTypeCommPool = new TaxTypeCommPool(expireTime);
		_TimezonePool = new TimezonePool(expireTime);
		_TransSourceTypePool = new TransSourceTypePool(expireTime);
		_TransferReasonPool = new TransferReasonPool(expireTime);
		_UnappliedPaymentPool = new UnappliedPaymentPool(expireTime);
		_UnbilledUsagePool = new UnbilledUsagePool(expireTime);
		_UnbilledUsageBulkAdjustmentPool = new UnbilledUsageBulkAdjustmentPool(expireTime);
		_UsageCreditRatePool = new UsageCreditRatePool(expireTime);
		_VipCodePool = new VipCodePool(expireTime);
		_VoucherDefinitionsPool = new VoucherDefinitionsPool(expireTime);
		_VoucherHistoryPool = new VoucherHistoryPool(expireTime);
		_VoucherLocationPool = new VoucherLocationPool(expireTime);
		_VoucherStatusPool = new VoucherStatusPool(expireTime);
		_VoucherStatusInfoPool = new VoucherStatusInfoPool(expireTime);
		_VoucherStatusMovementPool = new VoucherStatusMovementPool(expireTime);
		_VoucherTypesPool = new VoucherTypesPool(expireTime);
		_WriteoffPool = new WriteoffPool(expireTime);
	}
	private AbiAutoPayCmfMapPool _AbiAutoPayCmfMapPool = null;
	private AbiBillMessagesPool _AbiBillMessagesPool = null;
	private AbiBillingStatisticsPool _AbiBillingStatisticsPool = null;
	private AbiNrcDucPool _AbiNrcDucPool = null;
	private AccountPool _AccountPool = null;
	private AccountAbiSourcePool _AccountAbiSourcePool = null;
	private AccountBalancesPool _AccountBalancesPool = null;
	private AccountBonusPointBalancePool _AccountBonusPointBalancePool = null;
	private AccountBonusPointTransactionPool _AccountBonusPointTransactionPool = null;
	private AccountCodePool _AccountCodePool = null;
	private AccountCodeGroupPool _AccountCodeGroupPool = null;
	private AccountHqContractPool _AccountHqContractPool = null;
	private AccountIdPool _AccountIdPool = null;
	private AccountInsertPool _AccountInsertPool = null;
	private AccountLocatePool _AccountLocatePool = null;
	private AccountMessagePool _AccountMessagePool = null;
	private AccountSegmentPool _AccountSegmentPool = null;
	private AccountSegmentMapPool _AccountSegmentMapPool = null;
	private AccountStatusPool _AccountStatusPool = null;
	private AdjustmentPool _AdjustmentPool = null;
	private AdjustmentReasonPool _AdjustmentReasonPool = null;
	private AdjustmentTaxPool _AdjustmentTaxPool = null;
	private AdjustmentTypePool _AdjustmentTypePool = null;
	private AxrtCountryCodeMapPool _AxrtCountryCodeMapPool = null;
	private AxrtCurrCodeMapPool _AxrtCurrCodeMapPool = null;
	private AxrtCurrencyCodeMapPool _AxrtCurrencyCodeMapPool = null;
	private AxrtPaymentPool _AxrtPaymentPool = null;
	private AxrtPaymentMerchantPool _AxrtPaymentMerchantPool = null;
	private AxrtPaymentProfilePool _AxrtPaymentProfilePool = null;
	private AxrtPaymentTransPool _AxrtPaymentTransPool = null;
	private BalanceLineItemPool _BalanceLineItemPool = null;
	private BalanceLineItemBulkAdjustmentPool _BalanceLineItemBulkAdjustmentPool = null;
	private BalanceXferDiffPool _BalanceXferDiffPool = null;
	private BamErrorCodePool _BamErrorCodePool = null;
	private BillCyclePool _BillCyclePool = null;
	private BillDispatchMethodPool _BillDispatchMethodPool = null;
	private BillImagePool _BillImagePool = null;
	private BillImagePagePool _BillImagePagePool = null;
	private BillInsertGroupPool _BillInsertGroupPool = null;
	private BillInsertGroupMapPool _BillInsertGroupMapPool = null;
	private BillMessageGroupPool _BillMessageGroupPool = null;
	private BillMessageGroupMapPool _BillMessageGroupMapPool = null;
	private BilledUsagePool _BilledUsagePool = null;
	private BilledUsageBulkAdjustmentPool _BilledUsageBulkAdjustmentPool = null;
	private BonusPointRatePool _BonusPointRatePool = null;
	private BonusPointTransTypePool _BonusPointTransTypePool = null;
	private CcAuditLogPool _CcAuditLogPool = null;
	private CdrDataDucPool _CdrDataDucPool = null;
	private ChargeDistribPercentPool _ChargeDistribPercentPool = null;
	private ClearingHousePool _ClearingHousePool = null;
	private ClearingHouseContactsPool _ClearingHouseContactsPool = null;
	private ClearingHouseInfoPool _ClearingHouseInfoPool = null;
	private CmfBonusPointPool _CmfBonusPointPool = null;
	private CmfPackageOverridesPool _CmfPackageOverridesPool = null;
	private CmfRewardBalanceDetailPool _CmfRewardBalanceDetailPool = null;
	private CmfStatusPool _CmfStatusPool = null;
	private CmfStatusChgReasonPool _CmfStatusChgReasonPool = null;
	private ConnectReasonPool _ConnectReasonPool = null;
	private ContactPool _ContactPool = null;
	private ContractDiscountPool _ContractDiscountPool = null;
	private CorridorPool _CorridorPool = null;
	private CorridorRateBandOverridePool _CorridorRateBandOverridePool = null;
	private CorridorRateOverridePool _CorridorRateOverridePool = null;
	private CreditCardPool _CreditCardPool = null;
	private CreditCardTypeCodePool _CreditCardTypeCodePool = null;
	private CsrPool _CsrPool = null;
	private CsrAccountSegmentPool _CsrAccountSegmentPool = null;
	private CsrGroupAmountPool _CsrGroupAmountPool = null;
	private CsrGroupFunctionPool _CsrGroupFunctionPool = null;
	private CustomerDocumentPool _CustomerDocumentPool = null;
	private CustomerDtServerPool _CustomerDtServerPool = null;
	private CustomerDtUrlPool _CustomerDtUrlPool = null;
	private CustomerServiceCenterPool _CustomerServiceCenterPool = null;
	private DepositPool _DepositPool = null;
	private DepositTypePool _DepositTypePool = null;
	private DiscReasonPool _DiscReasonPool = null;
	private DocumentTypeRefPool _DocumentTypeRefPool = null;
	private EarlyTerminationChargePool _EarlyTerminationChargePool = null;
	private EftResponseCodePool _EftResponseCodePool = null;
	private EftTransactionPool _EftTransactionPool = null;
	private EnhancedNotePool _EnhancedNotePool = null;
	private ExchangeRateClassPool _ExchangeRateClassPool = null;
	private ExtendedDataAssociationPool _ExtendedDataAssociationPool = null;
	private ExtendedDataEnumerationPool _ExtendedDataEnumerationPool = null;
	private ExtendedDataLocatePool _ExtendedDataLocatePool = null;
	private ExtendedDataParamPool _ExtendedDataParamPool = null;
	private ExtendedDataParamTypePool _ExtendedDataParamTypePool = null;
	private ExternalIdAcctMapPool _ExternalIdAcctMapPool = null;
	private ExternalIdHqGroupsMapPool _ExternalIdHqGroupsMapPool = null;
	private FranchiseCodePool _FranchiseCodePool = null;
	private GenderTypePool _GenderTypePool = null;
	private GenericEnumerationPool _GenericEnumerationPool = null;
	private GeocodePool _GeocodePool = null;
	private GlobalAccountBalancesPool _GlobalAccountBalancesPool = null;
	private GlobalContractPool _GlobalContractPool = null;
	private GlobalOpenItemIdMapPool _GlobalOpenItemIdMapPool = null;
	private GroupPool _GroupPool = null;
	private GroupLocatePool _GroupLocatePool = null;
	private GroupMemberPool _GroupMemberPool = null;
	private GuiIndicatorPool _GuiIndicatorPool = null;
	private HistoricalContributionPool _HistoricalContributionPool = null;
	private HistoricalContributionTaxPool _HistoricalContributionTaxPool = null;
	private HistoricalThresholdsPool _HistoricalThresholdsPool = null;
	private HqContractUnitCrPool _HqContractUnitCrPool = null;
	private HqGroupContractsPool _HqGroupContractsPool = null;
	private HqGroupCorridorPool _HqGroupCorridorPool = null;
	private HqGroupMembersPool _HqGroupMembersPool = null;
	private HqGroupProductPool _HqGroupProductPool = null;
	private HqGroupsPool _HqGroupsPool = null;
	private HqgroupUsageRedirectMapPool _HqgroupUsageRedirectMapPool = null;
	private InterimBillPool _InterimBillPool = null;
	private InvoicePool _InvoicePool = null;
	private InvoiceDetailPool _InvoiceDetailPool = null;
	private InvoiceDetailBulkAdjustmentPool _InvoiceDetailBulkAdjustmentPool = null;
	private LateFeeRateOverridesPool _LateFeeRateOverridesPool = null;
	private LbxPaymentTypePool _LbxPaymentTypePool = null;
	private MultiLinesAdjPool _MultiLinesAdjPool = null;
	private NetActionPool _NetActionPool = null;
	private NotePool _NotePool = null;
	private NoteCodePool _NoteCodePool = null;
	private NoteTextPool _NoteTextPool = null;
	private OpenItemPool _OpenItemPool = null;
	private OpenItemIdMapPool _OpenItemIdMapPool = null;
	private OrderQuotePool _OrderQuotePool = null;
	private OverrideDiscountRatePool _OverrideDiscountRatePool = null;
	private OverrideUsageCreditRatePool _OverrideUsageCreditRatePool = null;
	private OwningCostCenterPool _OwningCostCenterPool = null;
	private PackageComponentDefPool _PackageComponentDefPool = null;
	private PaymentPool _PaymentPool = null;
	private PaymentDistributionPool _PaymentDistributionPool = null;
	private PaymentMerchantIdPool _PaymentMerchantIdPool = null;
	private PaymentMerchantIdAssignPool _PaymentMerchantIdAssignPool = null;
	private PaymentProfilePool _PaymentProfilePool = null;
	private PaymentTransPool _PaymentTransPool = null;
	private PaymentTypePool _PaymentTypePool = null;
	private PrepaymentPool _PrepaymentPool = null;
	private PrepaymentDistributionPool _PrepaymentDistributionPool = null;
	private PrivacyLevelPool _PrivacyLevelPool = null;
	private ProductCatalogPool _ProductCatalogPool = null;
	private ProductChargeMapPool _ProductChargeMapPool = null;
	private ProductRateKeyPool _ProductRateKeyPool = null;
	private ProductRateOverridePool _ProductRateOverridePool = null;
	private ProductRcRatePool _ProductRcRatePool = null;
	private RefinancePlanPool _RefinancePlanPool = null;
	private RefundPool _RefundPool = null;
	private RefundReasonPool _RefundReasonPool = null;
	private RegulatoryIdPool _RegulatoryIdPool = null;
	private RevRcvCostCenterPool _RevRcvCostCenterPool = null;
	private ReverseBulkAdjustmentPool _ReverseBulkAdjustmentPool = null;
	private RewardBalancePool _RewardBalancePool = null;
	private RewardBalanceEntityMappingPool _RewardBalanceEntityMappingPool = null;
	private RtPaymentResponsePool _RtPaymentResponsePool = null;
	private SalesChannelPool _SalesChannelPool = null;
	private SecurityAciPool _SecurityAciPool = null;
	private SecurityResourcePool _SecurityResourcePool = null;
	private SecurityRolePool _SecurityRolePool = null;
	private SecurityUserPool _SecurityUserPool = null;
	private ServerPool _ServerPool = null;
	private ServerCategoryPool _ServerCategoryPool = null;
	private ServerDefinitionPool _ServerDefinitionPool = null;
	private ServiceCenterPool _ServiceCenterPool = null;
	private ServiceCenterTypePool _ServiceCenterTypePool = null;
	private ServiceMasterGroupPool _ServiceMasterGroupPool = null;
	private ServicePricingPlanPool _ServicePricingPlanPool = null;
	private ServiceZonePool _ServiceZonePool = null;
	private SlaMeasurementDataPool _SlaMeasurementDataPool = null;
	private StatusReasonMapPool _StatusReasonMapPool = null;
	private TaxAbandonedPool _TaxAbandonedPool = null;
	private TaxAssignmentPool _TaxAssignmentPool = null;
	private TaxExemptionPool _TaxExemptionPool = null;
	private TaxPackageInstPool _TaxPackageInstPool = null;
	private TaxRatesVatPool _TaxRatesVatPool = null;
	private TaxStatusPool _TaxStatusPool = null;
	private TaxTypeCommPool _TaxTypeCommPool = null;
	private TimezonePool _TimezonePool = null;
	private TransSourceTypePool _TransSourceTypePool = null;
	private TransferReasonPool _TransferReasonPool = null;
	private UnappliedPaymentPool _UnappliedPaymentPool = null;
	private UnbilledUsagePool _UnbilledUsagePool = null;
	private UnbilledUsageBulkAdjustmentPool _UnbilledUsageBulkAdjustmentPool = null;
	private UsageCreditRatePool _UsageCreditRatePool = null;
	private VipCodePool _VipCodePool = null;
	private VoucherDefinitionsPool _VoucherDefinitionsPool = null;
	private VoucherHistoryPool _VoucherHistoryPool = null;
	private VoucherLocationPool _VoucherLocationPool = null;
	private VoucherStatusPool _VoucherStatusPool = null;
	private VoucherStatusInfoPool _VoucherStatusInfoPool = null;
	private VoucherStatusMovementPool _VoucherStatusMovementPool = null;
	private VoucherTypesPool _VoucherTypesPool = null;
	private WriteoffPool _WriteoffPool = null;
	public AbiAutoPayCmfMapInterface getAbiAutoPayCmfMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiAutoPayCmfMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
		return _AbiAutoPayCmfMapPool.borrowAbiAutoPayCmfMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiAutoPayCmfMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiAutoPayCmfMapInterface(AbiAutoPayCmfMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
		try {
			_AbiAutoPayCmfMapPool.returnAbiAutoPayCmfMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAbiAutoPayCmfMapInterface", "Exception releasing AbiAutoPayCmfMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
	}
	public AbiBillMessagesInterface getAbiBillMessagesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillMessagesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
		return _AbiBillMessagesPool.borrowAbiBillMessages();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiBillMessagesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiBillMessagesInterface(AbiBillMessagesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillMessagesInterface");
		try {
			_AbiBillMessagesPool.returnAbiBillMessages(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAbiBillMessagesInterface", "Exception releasing AbiBillMessages", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillMessagesInterface");
	}
	public AbiBillingStatisticsInterface getAbiBillingStatisticsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillingStatisticsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
		return _AbiBillingStatisticsPool.borrowAbiBillingStatistics();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiBillingStatisticsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiBillingStatisticsInterface(AbiBillingStatisticsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillingStatisticsInterface");
		try {
			_AbiBillingStatisticsPool.returnAbiBillingStatistics(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAbiBillingStatisticsInterface", "Exception releasing AbiBillingStatistics", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillingStatisticsInterface");
	}
	public AbiNrcDucInterface getAbiNrcDucInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiNrcDucInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
		return _AbiNrcDucPool.borrowAbiNrcDuc();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiNrcDucInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiNrcDucInterface(AbiNrcDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiNrcDucInterface");
		try {
			_AbiNrcDucPool.returnAbiNrcDuc(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAbiNrcDucInterface", "Exception releasing AbiNrcDuc", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiNrcDucInterface");
	}
	public AccountInterface getAccountInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
		return _AccountPool.borrowAccount();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountInterface(AccountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInterface");
		try {
			_AccountPool.returnAccount(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountInterface", "Exception releasing Account", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInterface");
	}
	public AccountAbiSourceInterface getAccountAbiSourceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountAbiSourceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
		return _AccountAbiSourcePool.borrowAccountAbiSource();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountAbiSourceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountAbiSourceInterface(AccountAbiSourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountAbiSourceInterface");
		try {
			_AccountAbiSourcePool.returnAccountAbiSource(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountAbiSourceInterface", "Exception releasing AccountAbiSource", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountAbiSourceInterface");
	}
	public AccountBalancesInterface getAccountBalancesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBalancesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
		return _AccountBalancesPool.borrowAccountBalances();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountBalancesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountBalancesInterface(AccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBalancesInterface");
		try {
			_AccountBalancesPool.returnAccountBalances(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountBalancesInterface", "Exception releasing AccountBalances", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBalancesInterface");
	}
	public AccountBonusPointBalanceInterface getAccountBonusPointBalanceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointBalanceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
		return _AccountBonusPointBalancePool.borrowAccountBonusPointBalance();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountBonusPointBalanceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountBonusPointBalanceInterface(AccountBonusPointBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointBalanceInterface");
		try {
			_AccountBonusPointBalancePool.returnAccountBonusPointBalance(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountBonusPointBalanceInterface", "Exception releasing AccountBonusPointBalance", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointBalanceInterface");
	}
	public AccountBonusPointTransactionInterface getAccountBonusPointTransactionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointTransactionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
		return _AccountBonusPointTransactionPool.borrowAccountBonusPointTransaction();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountBonusPointTransactionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountBonusPointTransactionInterface(AccountBonusPointTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointTransactionInterface");
		try {
			_AccountBonusPointTransactionPool.returnAccountBonusPointTransaction(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountBonusPointTransactionInterface", "Exception releasing AccountBonusPointTransaction", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointTransactionInterface");
	}
	public AccountCodeInterface getAccountCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
		return _AccountCodePool.borrowAccountCode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountCodeInterface(AccountCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeInterface");
		try {
			_AccountCodePool.returnAccountCode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountCodeInterface", "Exception releasing AccountCode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeInterface");
	}
	public AccountCodeGroupInterface getAccountCodeGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
		return _AccountCodeGroupPool.borrowAccountCodeGroup();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountCodeGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountCodeGroupInterface(AccountCodeGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeGroupInterface");
		try {
			_AccountCodeGroupPool.returnAccountCodeGroup(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountCodeGroupInterface", "Exception releasing AccountCodeGroup", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeGroupInterface");
	}
	public AccountHqContractInterface getAccountHqContractInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountHqContractInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
		return _AccountHqContractPool.borrowAccountHqContract();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountHqContractInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountHqContractInterface(AccountHqContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountHqContractInterface");
		try {
			_AccountHqContractPool.returnAccountHqContract(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountHqContractInterface", "Exception releasing AccountHqContract", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountHqContractInterface");
	}
	public AccountIdInterface getAccountIdInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountIdInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
		return _AccountIdPool.borrowAccountId();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountIdInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountIdInterface(AccountIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountIdInterface");
		try {
			_AccountIdPool.returnAccountId(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountIdInterface", "Exception releasing AccountId", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountIdInterface");
	}
	public AccountInsertInterface getAccountInsertInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInsertInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
		return _AccountInsertPool.borrowAccountInsert();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountInsertInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountInsertInterface(AccountInsertInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInsertInterface");
		try {
			_AccountInsertPool.returnAccountInsert(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountInsertInterface", "Exception releasing AccountInsert", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInsertInterface");
	}
	public AccountLocateInterface getAccountLocateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountLocateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
		return _AccountLocatePool.borrowAccountLocate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountLocateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountLocateInterface(AccountLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountLocateInterface");
		try {
			_AccountLocatePool.returnAccountLocate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountLocateInterface", "Exception releasing AccountLocate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountLocateInterface");
	}
	public AccountMessageInterface getAccountMessageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountMessageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
		return _AccountMessagePool.borrowAccountMessage();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountMessageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountMessageInterface(AccountMessageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountMessageInterface");
		try {
			_AccountMessagePool.returnAccountMessage(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountMessageInterface", "Exception releasing AccountMessage", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountMessageInterface");
	}
	public AccountSegmentInterface getAccountSegmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
		return _AccountSegmentPool.borrowAccountSegment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountSegmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountSegmentInterface(AccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentInterface");
		try {
			_AccountSegmentPool.returnAccountSegment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountSegmentInterface", "Exception releasing AccountSegment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentInterface");
	}
	public AccountSegmentMapInterface getAccountSegmentMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
		return _AccountSegmentMapPool.borrowAccountSegmentMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountSegmentMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountSegmentMapInterface(AccountSegmentMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentMapInterface");
		try {
			_AccountSegmentMapPool.returnAccountSegmentMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountSegmentMapInterface", "Exception releasing AccountSegmentMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentMapInterface");
	}
	public AccountStatusInterface getAccountStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
		return _AccountStatusPool.borrowAccountStatus();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountStatusInterface(AccountStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountStatusInterface");
		try {
			_AccountStatusPool.returnAccountStatus(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAccountStatusInterface", "Exception releasing AccountStatus", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountStatusInterface");
	}
	public AdjustmentInterface getAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
		return _AdjustmentPool.borrowAdjustment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentInterface(AdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentInterface");
		try {
			_AdjustmentPool.returnAdjustment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAdjustmentInterface", "Exception releasing Adjustment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentInterface");
	}
	public AdjustmentReasonInterface getAdjustmentReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
		return _AdjustmentReasonPool.borrowAdjustmentReason();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentReasonInterface(AdjustmentReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentReasonInterface");
		try {
			_AdjustmentReasonPool.returnAdjustmentReason(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAdjustmentReasonInterface", "Exception releasing AdjustmentReason", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentReasonInterface");
	}
	public AdjustmentTaxInterface getAdjustmentTaxInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTaxInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
		return _AdjustmentTaxPool.borrowAdjustmentTax();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentTaxInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentTaxInterface(AdjustmentTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTaxInterface");
		try {
			_AdjustmentTaxPool.returnAdjustmentTax(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAdjustmentTaxInterface", "Exception releasing AdjustmentTax", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTaxInterface");
	}
	public AdjustmentTypeInterface getAdjustmentTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
		return _AdjustmentTypePool.borrowAdjustmentType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentTypeInterface(AdjustmentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTypeInterface");
		try {
			_AdjustmentTypePool.returnAdjustmentType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAdjustmentTypeInterface", "Exception releasing AdjustmentType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTypeInterface");
	}
	public AxrtCountryCodeMapInterface getAxrtCountryCodeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCountryCodeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
		return _AxrtCountryCodeMapPool.borrowAxrtCountryCodeMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtCountryCodeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtCountryCodeMapInterface(AxrtCountryCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCountryCodeMapInterface");
		try {
			_AxrtCountryCodeMapPool.returnAxrtCountryCodeMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAxrtCountryCodeMapInterface", "Exception releasing AxrtCountryCodeMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCountryCodeMapInterface");
	}
	public AxrtCurrCodeMapInterface getAxrtCurrCodeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrCodeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
		return _AxrtCurrCodeMapPool.borrowAxrtCurrCodeMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtCurrCodeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtCurrCodeMapInterface(AxrtCurrCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrCodeMapInterface");
		try {
			_AxrtCurrCodeMapPool.returnAxrtCurrCodeMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAxrtCurrCodeMapInterface", "Exception releasing AxrtCurrCodeMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrCodeMapInterface");
	}
	public AxrtCurrencyCodeMapInterface getAxrtCurrencyCodeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrencyCodeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
		return _AxrtCurrencyCodeMapPool.borrowAxrtCurrencyCodeMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtCurrencyCodeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtCurrencyCodeMapInterface(AxrtCurrencyCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
		try {
			_AxrtCurrencyCodeMapPool.returnAxrtCurrencyCodeMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAxrtCurrencyCodeMapInterface", "Exception releasing AxrtCurrencyCodeMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
	}
	public AxrtPaymentInterface getAxrtPaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
		return _AxrtPaymentPool.borrowAxrtPayment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentInterface(AxrtPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentInterface");
		try {
			_AxrtPaymentPool.returnAxrtPayment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAxrtPaymentInterface", "Exception releasing AxrtPayment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentInterface");
	}
	public AxrtPaymentMerchantInterface getAxrtPaymentMerchantInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentMerchantInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
		return _AxrtPaymentMerchantPool.borrowAxrtPaymentMerchant();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentMerchantInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentMerchantInterface(AxrtPaymentMerchantInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentMerchantInterface");
		try {
			_AxrtPaymentMerchantPool.returnAxrtPaymentMerchant(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAxrtPaymentMerchantInterface", "Exception releasing AxrtPaymentMerchant", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentMerchantInterface");
	}
	public AxrtPaymentProfileInterface getAxrtPaymentProfileInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentProfileInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
		return _AxrtPaymentProfilePool.borrowAxrtPaymentProfile();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentProfileInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentProfileInterface(AxrtPaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentProfileInterface");
		try {
			_AxrtPaymentProfilePool.returnAxrtPaymentProfile(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAxrtPaymentProfileInterface", "Exception releasing AxrtPaymentProfile", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentProfileInterface");
	}
	public AxrtPaymentTransInterface getAxrtPaymentTransInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentTransInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
		return _AxrtPaymentTransPool.borrowAxrtPaymentTrans();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentTransInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentTransInterface(AxrtPaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentTransInterface");
		try {
			_AxrtPaymentTransPool.returnAxrtPaymentTrans(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseAxrtPaymentTransInterface", "Exception releasing AxrtPaymentTrans", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentTransInterface");
	}
	public BalanceLineItemInterface getBalanceLineItemInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
		return _BalanceLineItemPool.borrowBalanceLineItem();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBalanceLineItemInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBalanceLineItemInterface(BalanceLineItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemInterface");
		try {
			_BalanceLineItemPool.returnBalanceLineItem(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBalanceLineItemInterface", "Exception releasing BalanceLineItem", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemInterface");
	}
	public BalanceLineItemBulkAdjustmentInterface getBalanceLineItemBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
		return _BalanceLineItemBulkAdjustmentPool.borrowBalanceLineItemBulkAdjustment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBalanceLineItemBulkAdjustmentInterface(BalanceLineItemBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
		try {
			_BalanceLineItemBulkAdjustmentPool.returnBalanceLineItemBulkAdjustment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface", "Exception releasing BalanceLineItemBulkAdjustment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
	}
	public BalanceXferDiffInterface getBalanceXferDiffInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceXferDiffInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
		return _BalanceXferDiffPool.borrowBalanceXferDiff();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBalanceXferDiffInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBalanceXferDiffInterface(BalanceXferDiffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceXferDiffInterface");
		try {
			_BalanceXferDiffPool.returnBalanceXferDiff(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBalanceXferDiffInterface", "Exception releasing BalanceXferDiff", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceXferDiffInterface");
	}
	public BamErrorCodeInterface getBamErrorCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBamErrorCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
		return _BamErrorCodePool.borrowBamErrorCode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBamErrorCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBamErrorCodeInterface(BamErrorCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBamErrorCodeInterface");
		try {
			_BamErrorCodePool.returnBamErrorCode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBamErrorCodeInterface", "Exception releasing BamErrorCode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBamErrorCodeInterface");
	}
	public BillCycleInterface getBillCycleInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCycleInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
		return _BillCyclePool.borrowBillCycle();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillCycleInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillCycleInterface(BillCycleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillCycleInterface");
		try {
			_BillCyclePool.returnBillCycle(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillCycleInterface", "Exception releasing BillCycle", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillCycleInterface");
	}
	public BillDispatchMethodInterface getBillDispatchMethodInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispatchMethodInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
		return _BillDispatchMethodPool.borrowBillDispatchMethod();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillDispatchMethodInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillDispatchMethodInterface(BillDispatchMethodInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillDispatchMethodInterface");
		try {
			_BillDispatchMethodPool.returnBillDispatchMethod(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillDispatchMethodInterface", "Exception releasing BillDispatchMethod", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillDispatchMethodInterface");
	}
	public BillImageInterface getBillImageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
		return _BillImagePool.borrowBillImage();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillImageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillImageInterface(BillImageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImageInterface");
		try {
			_BillImagePool.returnBillImage(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillImageInterface", "Exception releasing BillImage", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImageInterface");
	}
	public BillImagePageInterface getBillImagePageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImagePageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
		return _BillImagePagePool.borrowBillImagePage();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillImagePageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillImagePageInterface(BillImagePageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImagePageInterface");
		try {
			_BillImagePagePool.returnBillImagePage(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillImagePageInterface", "Exception releasing BillImagePage", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImagePageInterface");
	}
	public BillInsertGroupInterface getBillInsertGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
		return _BillInsertGroupPool.borrowBillInsertGroup();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillInsertGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillInsertGroupInterface(BillInsertGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupInterface");
		try {
			_BillInsertGroupPool.returnBillInsertGroup(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillInsertGroupInterface", "Exception releasing BillInsertGroup", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupInterface");
	}
	public BillInsertGroupMapInterface getBillInsertGroupMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
		return _BillInsertGroupMapPool.borrowBillInsertGroupMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillInsertGroupMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillInsertGroupMapInterface(BillInsertGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupMapInterface");
		try {
			_BillInsertGroupMapPool.returnBillInsertGroupMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillInsertGroupMapInterface", "Exception releasing BillInsertGroupMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupMapInterface");
	}
	public BillMessageGroupInterface getBillMessageGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
		return _BillMessageGroupPool.borrowBillMessageGroup();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillMessageGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillMessageGroupInterface(BillMessageGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupInterface");
		try {
			_BillMessageGroupPool.returnBillMessageGroup(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillMessageGroupInterface", "Exception releasing BillMessageGroup", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupInterface");
	}
	public BillMessageGroupMapInterface getBillMessageGroupMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
		return _BillMessageGroupMapPool.borrowBillMessageGroupMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillMessageGroupMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillMessageGroupMapInterface(BillMessageGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupMapInterface");
		try {
			_BillMessageGroupMapPool.returnBillMessageGroupMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBillMessageGroupMapInterface", "Exception releasing BillMessageGroupMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupMapInterface");
	}
	public BilledUsageInterface getBilledUsageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
		return _BilledUsagePool.borrowBilledUsage();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBilledUsageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBilledUsageInterface(BilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageInterface");
		try {
			_BilledUsagePool.returnBilledUsage(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBilledUsageInterface", "Exception releasing BilledUsage", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageInterface");
	}
	public BilledUsageBulkAdjustmentInterface getBilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
		return _BilledUsageBulkAdjustmentPool.borrowBilledUsageBulkAdjustment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBilledUsageBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBilledUsageBulkAdjustmentInterface(BilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
		try {
			_BilledUsageBulkAdjustmentPool.returnBilledUsageBulkAdjustment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface", "Exception releasing BilledUsageBulkAdjustment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
	}
	public BonusPointRateInterface getBonusPointRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
		return _BonusPointRatePool.borrowBonusPointRate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBonusPointRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBonusPointRateInterface(BonusPointRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointRateInterface");
		try {
			_BonusPointRatePool.returnBonusPointRate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBonusPointRateInterface", "Exception releasing BonusPointRate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointRateInterface");
	}
	public BonusPointTransTypeInterface getBonusPointTransTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
		return _BonusPointTransTypePool.borrowBonusPointTransType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBonusPointTransTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBonusPointTransTypeInterface(BonusPointTransTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointTransTypeInterface");
		try {
			_BonusPointTransTypePool.returnBonusPointTransType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseBonusPointTransTypeInterface", "Exception releasing BonusPointTransType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointTransTypeInterface");
	}
	public CcAuditLogInterface getCcAuditLogInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcAuditLogInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
		return _CcAuditLogPool.borrowCcAuditLog();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCcAuditLogInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCcAuditLogInterface(CcAuditLogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCcAuditLogInterface");
		try {
			_CcAuditLogPool.returnCcAuditLog(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCcAuditLogInterface", "Exception releasing CcAuditLog", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCcAuditLogInterface");
	}
	public CdrDataDucInterface getCdrDataDucInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataDucInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
		return _CdrDataDucPool.borrowCdrDataDuc();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCdrDataDucInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCdrDataDucInterface(CdrDataDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCdrDataDucInterface");
		try {
			_CdrDataDucPool.returnCdrDataDuc(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCdrDataDucInterface", "Exception releasing CdrDataDuc", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCdrDataDucInterface");
	}
	public ChargeDistribPercentInterface getChargeDistribPercentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDistribPercentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
		return _ChargeDistribPercentPool.borrowChargeDistribPercent();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getChargeDistribPercentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseChargeDistribPercentInterface(ChargeDistribPercentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseChargeDistribPercentInterface");
		try {
			_ChargeDistribPercentPool.returnChargeDistribPercent(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseChargeDistribPercentInterface", "Exception releasing ChargeDistribPercent", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseChargeDistribPercentInterface");
	}
	public ClearingHouseInterface getClearingHouseInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
		return _ClearingHousePool.borrowClearingHouse();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getClearingHouseInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseClearingHouseInterface(ClearingHouseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInterface");
		try {
			_ClearingHousePool.returnClearingHouse(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseClearingHouseInterface", "Exception releasing ClearingHouse", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInterface");
	}
	public ClearingHouseContactsInterface getClearingHouseContactsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseContactsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
		return _ClearingHouseContactsPool.borrowClearingHouseContacts();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getClearingHouseContactsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseClearingHouseContactsInterface(ClearingHouseContactsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseContactsInterface");
		try {
			_ClearingHouseContactsPool.returnClearingHouseContacts(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseClearingHouseContactsInterface", "Exception releasing ClearingHouseContacts", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseContactsInterface");
	}
	public ClearingHouseInfoInterface getClearingHouseInfoInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInfoInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
		return _ClearingHouseInfoPool.borrowClearingHouseInfo();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getClearingHouseInfoInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseClearingHouseInfoInterface(ClearingHouseInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInfoInterface");
		try {
			_ClearingHouseInfoPool.returnClearingHouseInfo(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseClearingHouseInfoInterface", "Exception releasing ClearingHouseInfo", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInfoInterface");
	}
	public CmfBonusPointInterface getCmfBonusPointInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfBonusPointInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
		return _CmfBonusPointPool.borrowCmfBonusPoint();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfBonusPointInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfBonusPointInterface(CmfBonusPointInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfBonusPointInterface");
		try {
			_CmfBonusPointPool.returnCmfBonusPoint(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCmfBonusPointInterface", "Exception releasing CmfBonusPoint", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfBonusPointInterface");
	}
	public CmfPackageOverridesInterface getCmfPackageOverridesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfPackageOverridesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
		return _CmfPackageOverridesPool.borrowCmfPackageOverrides();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfPackageOverridesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfPackageOverridesInterface(CmfPackageOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfPackageOverridesInterface");
		try {
			_CmfPackageOverridesPool.returnCmfPackageOverrides(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCmfPackageOverridesInterface", "Exception releasing CmfPackageOverrides", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfPackageOverridesInterface");
	}
	public CmfRewardBalanceDetailInterface getCmfRewardBalanceDetailInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfRewardBalanceDetailInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
		return _CmfRewardBalanceDetailPool.borrowCmfRewardBalanceDetail();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfRewardBalanceDetailInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfRewardBalanceDetailInterface(CmfRewardBalanceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
		try {
			_CmfRewardBalanceDetailPool.returnCmfRewardBalanceDetail(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCmfRewardBalanceDetailInterface", "Exception releasing CmfRewardBalanceDetail", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
	}
	public CmfStatusInterface getCmfStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
		return _CmfStatusPool.borrowCmfStatus();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfStatusInterface(CmfStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusInterface");
		try {
			_CmfStatusPool.returnCmfStatus(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCmfStatusInterface", "Exception releasing CmfStatus", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusInterface");
	}
	public CmfStatusChgReasonInterface getCmfStatusChgReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusChgReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
		return _CmfStatusChgReasonPool.borrowCmfStatusChgReason();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfStatusChgReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfStatusChgReasonInterface(CmfStatusChgReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusChgReasonInterface");
		try {
			_CmfStatusChgReasonPool.returnCmfStatusChgReason(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCmfStatusChgReasonInterface", "Exception releasing CmfStatusChgReason", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusChgReasonInterface");
	}
	public ConnectReasonInterface getConnectReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
		return _ConnectReasonPool.borrowConnectReason();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getConnectReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseConnectReasonInterface(ConnectReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseConnectReasonInterface");
		try {
			_ConnectReasonPool.returnConnectReason(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseConnectReasonInterface", "Exception releasing ConnectReason", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseConnectReasonInterface");
	}
	public ContactInterface getContactInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
		return _ContactPool.borrowContact();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getContactInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseContactInterface(ContactInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContactInterface");
		try {
			_ContactPool.returnContact(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseContactInterface", "Exception releasing Contact", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContactInterface");
	}
	public ContractDiscountInterface getContractDiscountInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractDiscountInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
		return _ContractDiscountPool.borrowContractDiscount();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getContractDiscountInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseContractDiscountInterface(ContractDiscountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContractDiscountInterface");
		try {
			_ContractDiscountPool.returnContractDiscount(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseContractDiscountInterface", "Exception releasing ContractDiscount", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContractDiscountInterface");
	}
	public CorridorInterface getCorridorInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
		return _CorridorPool.borrowCorridor();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCorridorInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCorridorInterface(CorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorInterface");
		try {
			_CorridorPool.returnCorridor(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCorridorInterface", "Exception releasing Corridor", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorInterface");
	}
	public CorridorRateBandOverrideInterface getCorridorRateBandOverrideInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateBandOverrideInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
		return _CorridorRateBandOverridePool.borrowCorridorRateBandOverride();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCorridorRateBandOverrideInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCorridorRateBandOverrideInterface(CorridorRateBandOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateBandOverrideInterface");
		try {
			_CorridorRateBandOverridePool.returnCorridorRateBandOverride(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCorridorRateBandOverrideInterface", "Exception releasing CorridorRateBandOverride", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateBandOverrideInterface");
	}
	public CorridorRateOverrideInterface getCorridorRateOverrideInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateOverrideInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
		return _CorridorRateOverridePool.borrowCorridorRateOverride();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCorridorRateOverrideInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCorridorRateOverrideInterface(CorridorRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateOverrideInterface");
		try {
			_CorridorRateOverridePool.returnCorridorRateOverride(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCorridorRateOverrideInterface", "Exception releasing CorridorRateOverride", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateOverrideInterface");
	}
	public CreditCardInterface getCreditCardInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
		return _CreditCardPool.borrowCreditCard();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCreditCardInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCreditCardInterface(CreditCardInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardInterface");
		try {
			_CreditCardPool.returnCreditCard(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCreditCardInterface", "Exception releasing CreditCard", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardInterface");
	}
	public CreditCardTypeCodeInterface getCreditCardTypeCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardTypeCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
		return _CreditCardTypeCodePool.borrowCreditCardTypeCode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCreditCardTypeCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCreditCardTypeCodeInterface(CreditCardTypeCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardTypeCodeInterface");
		try {
			_CreditCardTypeCodePool.returnCreditCardTypeCode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCreditCardTypeCodeInterface", "Exception releasing CreditCardTypeCode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardTypeCodeInterface");
	}
	public CsrInterface getCsrInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
		return _CsrPool.borrowCsr();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrInterface(CsrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrInterface");
		try {
			_CsrPool.returnCsr(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCsrInterface", "Exception releasing Csr", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrInterface");
	}
	public CsrAccountSegmentInterface getCsrAccountSegmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAccountSegmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
		return _CsrAccountSegmentPool.borrowCsrAccountSegment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrAccountSegmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrAccountSegmentInterface(CsrAccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrAccountSegmentInterface");
		try {
			_CsrAccountSegmentPool.returnCsrAccountSegment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCsrAccountSegmentInterface", "Exception releasing CsrAccountSegment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrAccountSegmentInterface");
	}
	public CsrGroupAmountInterface getCsrGroupAmountInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupAmountInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
		return _CsrGroupAmountPool.borrowCsrGroupAmount();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrGroupAmountInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrGroupAmountInterface(CsrGroupAmountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupAmountInterface");
		try {
			_CsrGroupAmountPool.returnCsrGroupAmount(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCsrGroupAmountInterface", "Exception releasing CsrGroupAmount", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupAmountInterface");
	}
	public CsrGroupFunctionInterface getCsrGroupFunctionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupFunctionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
		return _CsrGroupFunctionPool.borrowCsrGroupFunction();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrGroupFunctionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrGroupFunctionInterface(CsrGroupFunctionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupFunctionInterface");
		try {
			_CsrGroupFunctionPool.returnCsrGroupFunction(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCsrGroupFunctionInterface", "Exception releasing CsrGroupFunction", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupFunctionInterface");
	}
	public CustomerDocumentInterface getCustomerDocumentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocumentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
		return _CustomerDocumentPool.borrowCustomerDocument();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerDocumentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerDocumentInterface(CustomerDocumentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDocumentInterface");
		try {
			_CustomerDocumentPool.returnCustomerDocument(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCustomerDocumentInterface", "Exception releasing CustomerDocument", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDocumentInterface");
	}
	public CustomerDtServerInterface getCustomerDtServerInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtServerInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
		return _CustomerDtServerPool.borrowCustomerDtServer();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerDtServerInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerDtServerInterface(CustomerDtServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtServerInterface");
		try {
			_CustomerDtServerPool.returnCustomerDtServer(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCustomerDtServerInterface", "Exception releasing CustomerDtServer", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtServerInterface");
	}
	public CustomerDtUrlInterface getCustomerDtUrlInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtUrlInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
		return _CustomerDtUrlPool.borrowCustomerDtUrl();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerDtUrlInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerDtUrlInterface(CustomerDtUrlInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtUrlInterface");
		try {
			_CustomerDtUrlPool.returnCustomerDtUrl(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCustomerDtUrlInterface", "Exception releasing CustomerDtUrl", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtUrlInterface");
	}
	public CustomerServiceCenterInterface getCustomerServiceCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerServiceCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
		return _CustomerServiceCenterPool.borrowCustomerServiceCenter();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerServiceCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerServiceCenterInterface(CustomerServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerServiceCenterInterface");
		try {
			_CustomerServiceCenterPool.returnCustomerServiceCenter(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseCustomerServiceCenterInterface", "Exception releasing CustomerServiceCenter", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerServiceCenterInterface");
	}
	public DepositInterface getDepositInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
		return _DepositPool.borrowDeposit();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDepositInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDepositInterface(DepositInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositInterface");
		try {
			_DepositPool.returnDeposit(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseDepositInterface", "Exception releasing Deposit", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositInterface");
	}
	public DepositTypeInterface getDepositTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
		return _DepositTypePool.borrowDepositType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDepositTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDepositTypeInterface(DepositTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositTypeInterface");
		try {
			_DepositTypePool.returnDepositType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseDepositTypeInterface", "Exception releasing DepositType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositTypeInterface");
	}
	public DiscReasonInterface getDiscReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
		return _DiscReasonPool.borrowDiscReason();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDiscReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDiscReasonInterface(DiscReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDiscReasonInterface");
		try {
			_DiscReasonPool.returnDiscReason(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseDiscReasonInterface", "Exception releasing DiscReason", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDiscReasonInterface");
	}
	public DocumentTypeRefInterface getDocumentTypeRefInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeRefInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
		return _DocumentTypeRefPool.borrowDocumentTypeRef();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDocumentTypeRefInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDocumentTypeRefInterface(DocumentTypeRefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDocumentTypeRefInterface");
		try {
			_DocumentTypeRefPool.returnDocumentTypeRef(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseDocumentTypeRefInterface", "Exception releasing DocumentTypeRef", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDocumentTypeRefInterface");
	}
	public EarlyTerminationChargeInterface getEarlyTerminationChargeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEarlyTerminationChargeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
		return _EarlyTerminationChargePool.borrowEarlyTerminationCharge();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEarlyTerminationChargeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEarlyTerminationChargeInterface(EarlyTerminationChargeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEarlyTerminationChargeInterface");
		try {
			_EarlyTerminationChargePool.returnEarlyTerminationCharge(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseEarlyTerminationChargeInterface", "Exception releasing EarlyTerminationCharge", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEarlyTerminationChargeInterface");
	}
	public EftResponseCodeInterface getEftResponseCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftResponseCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
		return _EftResponseCodePool.borrowEftResponseCode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEftResponseCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEftResponseCodeInterface(EftResponseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftResponseCodeInterface");
		try {
			_EftResponseCodePool.returnEftResponseCode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseEftResponseCodeInterface", "Exception releasing EftResponseCode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftResponseCodeInterface");
	}
	public EftTransactionInterface getEftTransactionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransactionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
		return _EftTransactionPool.borrowEftTransaction();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEftTransactionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEftTransactionInterface(EftTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftTransactionInterface");
		try {
			_EftTransactionPool.returnEftTransaction(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseEftTransactionInterface", "Exception releasing EftTransaction", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftTransactionInterface");
	}
	public EnhancedNoteInterface getEnhancedNoteInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnhancedNoteInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
		return _EnhancedNotePool.borrowEnhancedNote();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEnhancedNoteInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEnhancedNoteInterface(EnhancedNoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEnhancedNoteInterface");
		try {
			_EnhancedNotePool.returnEnhancedNote(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseEnhancedNoteInterface", "Exception releasing EnhancedNote", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEnhancedNoteInterface");
	}
	public ExchangeRateClassInterface getExchangeRateClassInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExchangeRateClassInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
		return _ExchangeRateClassPool.borrowExchangeRateClass();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExchangeRateClassInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExchangeRateClassInterface(ExchangeRateClassInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExchangeRateClassInterface");
		try {
			_ExchangeRateClassPool.returnExchangeRateClass(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExchangeRateClassInterface", "Exception releasing ExchangeRateClass", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExchangeRateClassInterface");
	}
	public ExtendedDataAssociationInterface getExtendedDataAssociationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataAssociationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
		return _ExtendedDataAssociationPool.borrowExtendedDataAssociation();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataAssociationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataAssociationInterface(ExtendedDataAssociationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataAssociationInterface");
		try {
			_ExtendedDataAssociationPool.returnExtendedDataAssociation(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExtendedDataAssociationInterface", "Exception releasing ExtendedDataAssociation", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataAssociationInterface");
	}
	public ExtendedDataEnumerationInterface getExtendedDataEnumerationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataEnumerationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
		return _ExtendedDataEnumerationPool.borrowExtendedDataEnumeration();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataEnumerationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataEnumerationInterface(ExtendedDataEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataEnumerationInterface");
		try {
			_ExtendedDataEnumerationPool.returnExtendedDataEnumeration(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExtendedDataEnumerationInterface", "Exception releasing ExtendedDataEnumeration", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataEnumerationInterface");
	}
	public ExtendedDataLocateInterface getExtendedDataLocateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataLocateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
		return _ExtendedDataLocatePool.borrowExtendedDataLocate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataLocateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataLocateInterface(ExtendedDataLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataLocateInterface");
		try {
			_ExtendedDataLocatePool.returnExtendedDataLocate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExtendedDataLocateInterface", "Exception releasing ExtendedDataLocate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataLocateInterface");
	}
	public ExtendedDataParamInterface getExtendedDataParamInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
		return _ExtendedDataParamPool.borrowExtendedDataParam();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataParamInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataParamInterface(ExtendedDataParamInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamInterface");
		try {
			_ExtendedDataParamPool.returnExtendedDataParam(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExtendedDataParamInterface", "Exception releasing ExtendedDataParam", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamInterface");
	}
	public ExtendedDataParamTypeInterface getExtendedDataParamTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
		return _ExtendedDataParamTypePool.borrowExtendedDataParamType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataParamTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataParamTypeInterface(ExtendedDataParamTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamTypeInterface");
		try {
			_ExtendedDataParamTypePool.returnExtendedDataParamType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExtendedDataParamTypeInterface", "Exception releasing ExtendedDataParamType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamTypeInterface");
	}
	public ExternalIdAcctMapInterface getExternalIdAcctMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAcctMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
		return _ExternalIdAcctMapPool.borrowExternalIdAcctMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExternalIdAcctMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExternalIdAcctMapInterface(ExternalIdAcctMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdAcctMapInterface");
		try {
			_ExternalIdAcctMapPool.returnExternalIdAcctMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExternalIdAcctMapInterface", "Exception releasing ExternalIdAcctMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdAcctMapInterface");
	}
	public ExternalIdHqGroupsMapInterface getExternalIdHqGroupsMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdHqGroupsMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
		return _ExternalIdHqGroupsMapPool.borrowExternalIdHqGroupsMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExternalIdHqGroupsMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExternalIdHqGroupsMapInterface(ExternalIdHqGroupsMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
		try {
			_ExternalIdHqGroupsMapPool.returnExternalIdHqGroupsMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseExternalIdHqGroupsMapInterface", "Exception releasing ExternalIdHqGroupsMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
	}
	public FranchiseCodeInterface getFranchiseCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
		return _FranchiseCodePool.borrowFranchiseCode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getFranchiseCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseFranchiseCodeInterface(FranchiseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseFranchiseCodeInterface");
		try {
			_FranchiseCodePool.returnFranchiseCode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseFranchiseCodeInterface", "Exception releasing FranchiseCode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseFranchiseCodeInterface");
	}
	public GenderTypeInterface getGenderTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
		return _GenderTypePool.borrowGenderType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGenderTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGenderTypeInterface(GenderTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenderTypeInterface");
		try {
			_GenderTypePool.returnGenderType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGenderTypeInterface", "Exception releasing GenderType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenderTypeInterface");
	}
	public GenericEnumerationInterface getGenericEnumerationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenericEnumerationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
		return _GenericEnumerationPool.borrowGenericEnumeration();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGenericEnumerationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGenericEnumerationInterface(GenericEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenericEnumerationInterface");
		try {
			_GenericEnumerationPool.returnGenericEnumeration(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGenericEnumerationInterface", "Exception releasing GenericEnumeration", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenericEnumerationInterface");
	}
	public GeocodeInterface getGeocodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
		return _GeocodePool.borrowGeocode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGeocodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGeocodeInterface(GeocodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGeocodeInterface");
		try {
			_GeocodePool.returnGeocode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGeocodeInterface", "Exception releasing Geocode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGeocodeInterface");
	}
	public GlobalAccountBalancesInterface getGlobalAccountBalancesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalAccountBalancesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
		return _GlobalAccountBalancesPool.borrowGlobalAccountBalances();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGlobalAccountBalancesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGlobalAccountBalancesInterface(GlobalAccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalAccountBalancesInterface");
		try {
			_GlobalAccountBalancesPool.returnGlobalAccountBalances(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGlobalAccountBalancesInterface", "Exception releasing GlobalAccountBalances", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalAccountBalancesInterface");
	}
	public GlobalContractInterface getGlobalContractInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContractInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
		return _GlobalContractPool.borrowGlobalContract();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGlobalContractInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGlobalContractInterface(GlobalContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalContractInterface");
		try {
			_GlobalContractPool.returnGlobalContract(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGlobalContractInterface", "Exception releasing GlobalContract", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalContractInterface");
	}
	public GlobalOpenItemIdMapInterface getGlobalOpenItemIdMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalOpenItemIdMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
		return _GlobalOpenItemIdMapPool.borrowGlobalOpenItemIdMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGlobalOpenItemIdMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGlobalOpenItemIdMapInterface(GlobalOpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
		try {
			_GlobalOpenItemIdMapPool.returnGlobalOpenItemIdMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGlobalOpenItemIdMapInterface", "Exception releasing GlobalOpenItemIdMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
	}
	public GroupInterface getGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
		return _GroupPool.borrowGroup();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGroupInterface(GroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupInterface");
		try {
			_GroupPool.returnGroup(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGroupInterface", "Exception releasing Group", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupInterface");
	}
	public GroupLocateInterface getGroupLocateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupLocateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
		return _GroupLocatePool.borrowGroupLocate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGroupLocateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGroupLocateInterface(GroupLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupLocateInterface");
		try {
			_GroupLocatePool.returnGroupLocate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGroupLocateInterface", "Exception releasing GroupLocate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupLocateInterface");
	}
	public GroupMemberInterface getGroupMemberInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupMemberInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
		return _GroupMemberPool.borrowGroupMember();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGroupMemberInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGroupMemberInterface(GroupMemberInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupMemberInterface");
		try {
			_GroupMemberPool.returnGroupMember(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGroupMemberInterface", "Exception releasing GroupMember", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupMemberInterface");
	}
	public GuiIndicatorInterface getGuiIndicatorInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiIndicatorInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
		return _GuiIndicatorPool.borrowGuiIndicator();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGuiIndicatorInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGuiIndicatorInterface(GuiIndicatorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGuiIndicatorInterface");
		try {
			_GuiIndicatorPool.returnGuiIndicator(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseGuiIndicatorInterface", "Exception releasing GuiIndicator", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGuiIndicatorInterface");
	}
	public HistoricalContributionInterface getHistoricalContributionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
		return _HistoricalContributionPool.borrowHistoricalContribution();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHistoricalContributionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHistoricalContributionInterface(HistoricalContributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionInterface");
		try {
			_HistoricalContributionPool.returnHistoricalContribution(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHistoricalContributionInterface", "Exception releasing HistoricalContribution", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionInterface");
	}
	public HistoricalContributionTaxInterface getHistoricalContributionTaxInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionTaxInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
		return _HistoricalContributionTaxPool.borrowHistoricalContributionTax();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHistoricalContributionTaxInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHistoricalContributionTaxInterface(HistoricalContributionTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionTaxInterface");
		try {
			_HistoricalContributionTaxPool.returnHistoricalContributionTax(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHistoricalContributionTaxInterface", "Exception releasing HistoricalContributionTax", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionTaxInterface");
	}
	public HistoricalThresholdsInterface getHistoricalThresholdsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalThresholdsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
		return _HistoricalThresholdsPool.borrowHistoricalThresholds();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHistoricalThresholdsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHistoricalThresholdsInterface(HistoricalThresholdsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalThresholdsInterface");
		try {
			_HistoricalThresholdsPool.returnHistoricalThresholds(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHistoricalThresholdsInterface", "Exception releasing HistoricalThresholds", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalThresholdsInterface");
	}
	public HqContractUnitCrInterface getHqContractUnitCrInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqContractUnitCrInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
		return _HqContractUnitCrPool.borrowHqContractUnitCr();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqContractUnitCrInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqContractUnitCrInterface(HqContractUnitCrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqContractUnitCrInterface");
		try {
			_HqContractUnitCrPool.returnHqContractUnitCr(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHqContractUnitCrInterface", "Exception releasing HqContractUnitCr", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqContractUnitCrInterface");
	}
	public HqGroupContractsInterface getHqGroupContractsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupContractsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
		return _HqGroupContractsPool.borrowHqGroupContracts();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupContractsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupContractsInterface(HqGroupContractsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupContractsInterface");
		try {
			_HqGroupContractsPool.returnHqGroupContracts(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHqGroupContractsInterface", "Exception releasing HqGroupContracts", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupContractsInterface");
	}
	public HqGroupCorridorInterface getHqGroupCorridorInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupCorridorInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
		return _HqGroupCorridorPool.borrowHqGroupCorridor();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupCorridorInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupCorridorInterface(HqGroupCorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupCorridorInterface");
		try {
			_HqGroupCorridorPool.returnHqGroupCorridor(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHqGroupCorridorInterface", "Exception releasing HqGroupCorridor", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupCorridorInterface");
	}
	public HqGroupMembersInterface getHqGroupMembersInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupMembersInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
		return _HqGroupMembersPool.borrowHqGroupMembers();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupMembersInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupMembersInterface(HqGroupMembersInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupMembersInterface");
		try {
			_HqGroupMembersPool.returnHqGroupMembers(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHqGroupMembersInterface", "Exception releasing HqGroupMembers", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupMembersInterface");
	}
	public HqGroupProductInterface getHqGroupProductInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupProductInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
		return _HqGroupProductPool.borrowHqGroupProduct();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupProductInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupProductInterface(HqGroupProductInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupProductInterface");
		try {
			_HqGroupProductPool.returnHqGroupProduct(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHqGroupProductInterface", "Exception releasing HqGroupProduct", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupProductInterface");
	}
	public HqGroupsInterface getHqGroupsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
		return _HqGroupsPool.borrowHqGroups();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupsInterface(HqGroupsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupsInterface");
		try {
			_HqGroupsPool.returnHqGroups(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHqGroupsInterface", "Exception releasing HqGroups", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupsInterface");
	}
	public HqgroupUsageRedirectMapInterface getHqgroupUsageRedirectMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqgroupUsageRedirectMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
		return _HqgroupUsageRedirectMapPool.borrowHqgroupUsageRedirectMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqgroupUsageRedirectMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqgroupUsageRedirectMapInterface(HqgroupUsageRedirectMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
		try {
			_HqgroupUsageRedirectMapPool.returnHqgroupUsageRedirectMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseHqgroupUsageRedirectMapInterface", "Exception releasing HqgroupUsageRedirectMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
	}
	public InterimBillInterface getInterimBillInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
		return _InterimBillPool.borrowInterimBill();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInterimBillInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInterimBillInterface(InterimBillInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInterimBillInterface");
		try {
			_InterimBillPool.returnInterimBill(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseInterimBillInterface", "Exception releasing InterimBill", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInterimBillInterface");
	}
	public InvoiceInterface getInvoiceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
		return _InvoicePool.borrowInvoice();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInvoiceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInvoiceInterface(InvoiceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceInterface");
		try {
			_InvoicePool.returnInvoice(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseInvoiceInterface", "Exception releasing Invoice", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceInterface");
	}
	public InvoiceDetailInterface getInvoiceDetailInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
		return _InvoiceDetailPool.borrowInvoiceDetail();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInvoiceDetailInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInvoiceDetailInterface(InvoiceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailInterface");
		try {
			_InvoiceDetailPool.returnInvoiceDetail(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseInvoiceDetailInterface", "Exception releasing InvoiceDetail", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailInterface");
	}
	public InvoiceDetailBulkAdjustmentInterface getInvoiceDetailBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
		return _InvoiceDetailBulkAdjustmentPool.borrowInvoiceDetailBulkAdjustment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInvoiceDetailBulkAdjustmentInterface(InvoiceDetailBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
		try {
			_InvoiceDetailBulkAdjustmentPool.returnInvoiceDetailBulkAdjustment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface", "Exception releasing InvoiceDetailBulkAdjustment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
	}
	public LateFeeRateOverridesInterface getLateFeeRateOverridesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeRateOverridesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
		return _LateFeeRateOverridesPool.borrowLateFeeRateOverrides();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getLateFeeRateOverridesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseLateFeeRateOverridesInterface(LateFeeRateOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLateFeeRateOverridesInterface");
		try {
			_LateFeeRateOverridesPool.returnLateFeeRateOverrides(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseLateFeeRateOverridesInterface", "Exception releasing LateFeeRateOverrides", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLateFeeRateOverridesInterface");
	}
	public LbxPaymentTypeInterface getLbxPaymentTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxPaymentTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
		return _LbxPaymentTypePool.borrowLbxPaymentType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getLbxPaymentTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseLbxPaymentTypeInterface(LbxPaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLbxPaymentTypeInterface");
		try {
			_LbxPaymentTypePool.returnLbxPaymentType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseLbxPaymentTypeInterface", "Exception releasing LbxPaymentType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLbxPaymentTypeInterface");
	}
	public MultiLinesAdjInterface getMultiLinesAdjInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getMultiLinesAdjInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
		return _MultiLinesAdjPool.borrowMultiLinesAdj();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getMultiLinesAdjInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseMultiLinesAdjInterface(MultiLinesAdjInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseMultiLinesAdjInterface");
		try {
			_MultiLinesAdjPool.returnMultiLinesAdj(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseMultiLinesAdjInterface", "Exception releasing MultiLinesAdj", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseMultiLinesAdjInterface");
	}
	public NetActionInterface getNetActionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
		return _NetActionPool.borrowNetAction();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNetActionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNetActionInterface(NetActionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNetActionInterface");
		try {
			_NetActionPool.returnNetAction(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseNetActionInterface", "Exception releasing NetAction", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNetActionInterface");
	}
	public NoteInterface getNoteInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
		return _NotePool.borrowNote();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNoteInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNoteInterface(NoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteInterface");
		try {
			_NotePool.returnNote(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseNoteInterface", "Exception releasing Note", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteInterface");
	}
	public NoteCodeInterface getNoteCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
		return _NoteCodePool.borrowNoteCode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNoteCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNoteCodeInterface(NoteCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteCodeInterface");
		try {
			_NoteCodePool.returnNoteCode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseNoteCodeInterface", "Exception releasing NoteCode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteCodeInterface");
	}
	public NoteTextInterface getNoteTextInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTextInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
		return _NoteTextPool.borrowNoteText();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNoteTextInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNoteTextInterface(NoteTextInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteTextInterface");
		try {
			_NoteTextPool.returnNoteText(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseNoteTextInterface", "Exception releasing NoteText", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteTextInterface");
	}
	public OpenItemInterface getOpenItemInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
		return _OpenItemPool.borrowOpenItem();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOpenItemInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOpenItemInterface(OpenItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemInterface");
		try {
			_OpenItemPool.returnOpenItem(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseOpenItemInterface", "Exception releasing OpenItem", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemInterface");
	}
	public OpenItemIdMapInterface getOpenItemIdMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
		return _OpenItemIdMapPool.borrowOpenItemIdMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOpenItemIdMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOpenItemIdMapInterface(OpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemIdMapInterface");
		try {
			_OpenItemIdMapPool.returnOpenItemIdMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseOpenItemIdMapInterface", "Exception releasing OpenItemIdMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemIdMapInterface");
	}
	public OrderQuoteInterface getOrderQuoteInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderQuoteInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
		return _OrderQuotePool.borrowOrderQuote();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOrderQuoteInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOrderQuoteInterface(OrderQuoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOrderQuoteInterface");
		try {
			_OrderQuotePool.returnOrderQuote(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseOrderQuoteInterface", "Exception releasing OrderQuote", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOrderQuoteInterface");
	}
	public OverrideDiscountRateInterface getOverrideDiscountRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDiscountRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
		return _OverrideDiscountRatePool.borrowOverrideDiscountRate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOverrideDiscountRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOverrideDiscountRateInterface(OverrideDiscountRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideDiscountRateInterface");
		try {
			_OverrideDiscountRatePool.returnOverrideDiscountRate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseOverrideDiscountRateInterface", "Exception releasing OverrideDiscountRate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideDiscountRateInterface");
	}
	public OverrideUsageCreditRateInterface getOverrideUsageCreditRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsageCreditRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
		return _OverrideUsageCreditRatePool.borrowOverrideUsageCreditRate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOverrideUsageCreditRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOverrideUsageCreditRateInterface(OverrideUsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideUsageCreditRateInterface");
		try {
			_OverrideUsageCreditRatePool.returnOverrideUsageCreditRate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseOverrideUsageCreditRateInterface", "Exception releasing OverrideUsageCreditRate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideUsageCreditRateInterface");
	}
	public OwningCostCenterInterface getOwningCostCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
		return _OwningCostCenterPool.borrowOwningCostCenter();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOwningCostCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOwningCostCenterInterface(OwningCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOwningCostCenterInterface");
		try {
			_OwningCostCenterPool.returnOwningCostCenter(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseOwningCostCenterInterface", "Exception releasing OwningCostCenter", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOwningCostCenterInterface");
	}
	public PackageComponentDefInterface getPackageComponentDefInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageComponentDefInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
		return _PackageComponentDefPool.borrowPackageComponentDef();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPackageComponentDefInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePackageComponentDefInterface(PackageComponentDefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePackageComponentDefInterface");
		try {
			_PackageComponentDefPool.returnPackageComponentDef(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePackageComponentDefInterface", "Exception releasing PackageComponentDef", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePackageComponentDefInterface");
	}
	public PaymentInterface getPaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
		return _PaymentPool.borrowPayment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentInterface(PaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentInterface");
		try {
			_PaymentPool.returnPayment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePaymentInterface", "Exception releasing Payment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentInterface");
	}
	public PaymentDistributionInterface getPaymentDistributionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDistributionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
		return _PaymentDistributionPool.borrowPaymentDistribution();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentDistributionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentDistributionInterface(PaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentDistributionInterface");
		try {
			_PaymentDistributionPool.returnPaymentDistribution(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePaymentDistributionInterface", "Exception releasing PaymentDistribution", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentDistributionInterface");
	}
	public PaymentMerchantIdInterface getPaymentMerchantIdInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
		return _PaymentMerchantIdPool.borrowPaymentMerchantId();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentMerchantIdInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentMerchantIdInterface(PaymentMerchantIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdInterface");
		try {
			_PaymentMerchantIdPool.returnPaymentMerchantId(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePaymentMerchantIdInterface", "Exception releasing PaymentMerchantId", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdInterface");
	}
	public PaymentMerchantIdAssignInterface getPaymentMerchantIdAssignInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdAssignInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
		return _PaymentMerchantIdAssignPool.borrowPaymentMerchantIdAssign();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentMerchantIdAssignInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentMerchantIdAssignInterface(PaymentMerchantIdAssignInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdAssignInterface");
		try {
			_PaymentMerchantIdAssignPool.returnPaymentMerchantIdAssign(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePaymentMerchantIdAssignInterface", "Exception releasing PaymentMerchantIdAssign", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdAssignInterface");
	}
	public PaymentProfileInterface getPaymentProfileInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfileInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
		return _PaymentProfilePool.borrowPaymentProfile();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentProfileInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentProfileInterface(PaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentProfileInterface");
		try {
			_PaymentProfilePool.returnPaymentProfile(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePaymentProfileInterface", "Exception releasing PaymentProfile", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentProfileInterface");
	}
	public PaymentTransInterface getPaymentTransInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTransInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
		return _PaymentTransPool.borrowPaymentTrans();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentTransInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentTransInterface(PaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTransInterface");
		try {
			_PaymentTransPool.returnPaymentTrans(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePaymentTransInterface", "Exception releasing PaymentTrans", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTransInterface");
	}
	public PaymentTypeInterface getPaymentTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
		return _PaymentTypePool.borrowPaymentType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentTypeInterface(PaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTypeInterface");
		try {
			_PaymentTypePool.returnPaymentType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePaymentTypeInterface", "Exception releasing PaymentType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTypeInterface");
	}
	public PrepaymentInterface getPrepaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
		return _PrepaymentPool.borrowPrepayment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPrepaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePrepaymentInterface(PrepaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentInterface");
		try {
			_PrepaymentPool.returnPrepayment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePrepaymentInterface", "Exception releasing Prepayment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentInterface");
	}
	public PrepaymentDistributionInterface getPrepaymentDistributionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentDistributionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
		return _PrepaymentDistributionPool.borrowPrepaymentDistribution();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPrepaymentDistributionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePrepaymentDistributionInterface(PrepaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentDistributionInterface");
		try {
			_PrepaymentDistributionPool.returnPrepaymentDistribution(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePrepaymentDistributionInterface", "Exception releasing PrepaymentDistribution", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentDistributionInterface");
	}
	public PrivacyLevelInterface getPrivacyLevelInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevelInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
		return _PrivacyLevelPool.borrowPrivacyLevel();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPrivacyLevelInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePrivacyLevelInterface(PrivacyLevelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrivacyLevelInterface");
		try {
			_PrivacyLevelPool.returnPrivacyLevel(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releasePrivacyLevelInterface", "Exception releasing PrivacyLevel", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrivacyLevelInterface");
	}
	public ProductCatalogInterface getProductCatalogInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductCatalogInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
		return _ProductCatalogPool.borrowProductCatalog();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductCatalogInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductCatalogInterface(ProductCatalogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductCatalogInterface");
		try {
			_ProductCatalogPool.returnProductCatalog(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseProductCatalogInterface", "Exception releasing ProductCatalog", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductCatalogInterface");
	}
	public ProductChargeMapInterface getProductChargeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductChargeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
		return _ProductChargeMapPool.borrowProductChargeMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductChargeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductChargeMapInterface(ProductChargeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductChargeMapInterface");
		try {
			_ProductChargeMapPool.returnProductChargeMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseProductChargeMapInterface", "Exception releasing ProductChargeMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductChargeMapInterface");
	}
	public ProductRateKeyInterface getProductRateKeyInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateKeyInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
		return _ProductRateKeyPool.borrowProductRateKey();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductRateKeyInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductRateKeyInterface(ProductRateKeyInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateKeyInterface");
		try {
			_ProductRateKeyPool.returnProductRateKey(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseProductRateKeyInterface", "Exception releasing ProductRateKey", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateKeyInterface");
	}
	public ProductRateOverrideInterface getProductRateOverrideInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateOverrideInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
		return _ProductRateOverridePool.borrowProductRateOverride();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductRateOverrideInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductRateOverrideInterface(ProductRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateOverrideInterface");
		try {
			_ProductRateOverridePool.returnProductRateOverride(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseProductRateOverrideInterface", "Exception releasing ProductRateOverride", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateOverrideInterface");
	}
	public ProductRcRateInterface getProductRcRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRcRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
		return _ProductRcRatePool.borrowProductRcRate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductRcRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductRcRateInterface(ProductRcRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRcRateInterface");
		try {
			_ProductRcRatePool.returnProductRcRate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseProductRcRateInterface", "Exception releasing ProductRcRate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRcRateInterface");
	}
	public RefinancePlanInterface getRefinancePlanInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
		return _RefinancePlanPool.borrowRefinancePlan();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRefinancePlanInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRefinancePlanInterface(RefinancePlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefinancePlanInterface");
		try {
			_RefinancePlanPool.returnRefinancePlan(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRefinancePlanInterface", "Exception releasing RefinancePlan", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefinancePlanInterface");
	}
	public RefundInterface getRefundInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
		return _RefundPool.borrowRefund();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRefundInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRefundInterface(RefundInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundInterface");
		try {
			_RefundPool.returnRefund(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRefundInterface", "Exception releasing Refund", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundInterface");
	}
	public RefundReasonInterface getRefundReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
		return _RefundReasonPool.borrowRefundReason();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRefundReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRefundReasonInterface(RefundReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundReasonInterface");
		try {
			_RefundReasonPool.returnRefundReason(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRefundReasonInterface", "Exception releasing RefundReason", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundReasonInterface");
	}
	public RegulatoryIdInterface getRegulatoryIdInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
		return _RegulatoryIdPool.borrowRegulatoryId();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRegulatoryIdInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRegulatoryIdInterface(RegulatoryIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRegulatoryIdInterface");
		try {
			_RegulatoryIdPool.returnRegulatoryId(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRegulatoryIdInterface", "Exception releasing RegulatoryId", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRegulatoryIdInterface");
	}
	public RevRcvCostCenterInterface getRevRcvCostCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
		return _RevRcvCostCenterPool.borrowRevRcvCostCenter();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRevRcvCostCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRevRcvCostCenterInterface(RevRcvCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRevRcvCostCenterInterface");
		try {
			_RevRcvCostCenterPool.returnRevRcvCostCenter(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRevRcvCostCenterInterface", "Exception releasing RevRcvCostCenter", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRevRcvCostCenterInterface");
	}
	public ReverseBulkAdjustmentInterface getReverseBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getReverseBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
		return _ReverseBulkAdjustmentPool.borrowReverseBulkAdjustment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getReverseBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseReverseBulkAdjustmentInterface(ReverseBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseReverseBulkAdjustmentInterface");
		try {
			_ReverseBulkAdjustmentPool.returnReverseBulkAdjustment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseReverseBulkAdjustmentInterface", "Exception releasing ReverseBulkAdjustment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseReverseBulkAdjustmentInterface");
	}
	public RewardBalanceInterface getRewardBalanceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
		return _RewardBalancePool.borrowRewardBalance();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRewardBalanceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRewardBalanceInterface(RewardBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceInterface");
		try {
			_RewardBalancePool.returnRewardBalance(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRewardBalanceInterface", "Exception releasing RewardBalance", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceInterface");
	}
	public RewardBalanceEntityMappingInterface getRewardBalanceEntityMappingInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceEntityMappingInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
		return _RewardBalanceEntityMappingPool.borrowRewardBalanceEntityMapping();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRewardBalanceEntityMappingInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRewardBalanceEntityMappingInterface(RewardBalanceEntityMappingInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
		try {
			_RewardBalanceEntityMappingPool.returnRewardBalanceEntityMapping(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRewardBalanceEntityMappingInterface", "Exception releasing RewardBalanceEntityMapping", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
	}
	public RtPaymentResponseInterface getRtPaymentResponseInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtPaymentResponseInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
		return _RtPaymentResponsePool.borrowRtPaymentResponse();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRtPaymentResponseInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRtPaymentResponseInterface(RtPaymentResponseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRtPaymentResponseInterface");
		try {
			_RtPaymentResponsePool.returnRtPaymentResponse(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseRtPaymentResponseInterface", "Exception releasing RtPaymentResponse", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRtPaymentResponseInterface");
	}
	public SalesChannelInterface getSalesChannelInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
		return _SalesChannelPool.borrowSalesChannel();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSalesChannelInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSalesChannelInterface(SalesChannelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSalesChannelInterface");
		try {
			_SalesChannelPool.returnSalesChannel(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseSalesChannelInterface", "Exception releasing SalesChannel", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSalesChannelInterface");
	}
	public SecurityAciInterface getSecurityAciInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityAciInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
		return _SecurityAciPool.borrowSecurityAci();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityAciInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityAciInterface(SecurityAciInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityAciInterface");
		try {
			_SecurityAciPool.returnSecurityAci(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseSecurityAciInterface", "Exception releasing SecurityAci", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityAciInterface");
	}
	public SecurityResourceInterface getSecurityResourceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityResourceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
		return _SecurityResourcePool.borrowSecurityResource();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityResourceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityResourceInterface(SecurityResourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityResourceInterface");
		try {
			_SecurityResourcePool.returnSecurityResource(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseSecurityResourceInterface", "Exception releasing SecurityResource", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityResourceInterface");
	}
	public SecurityRoleInterface getSecurityRoleInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityRoleInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
		return _SecurityRolePool.borrowSecurityRole();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityRoleInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityRoleInterface(SecurityRoleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityRoleInterface");
		try {
			_SecurityRolePool.returnSecurityRole(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseSecurityRoleInterface", "Exception releasing SecurityRole", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityRoleInterface");
	}
	public SecurityUserInterface getSecurityUserInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityUserInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
		return _SecurityUserPool.borrowSecurityUser();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityUserInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityUserInterface(SecurityUserInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityUserInterface");
		try {
			_SecurityUserPool.returnSecurityUser(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseSecurityUserInterface", "Exception releasing SecurityUser", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityUserInterface");
	}
	public ServerInterface getServerInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
		return _ServerPool.borrowServer();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServerInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServerInterface(ServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerInterface");
		try {
			_ServerPool.returnServer(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServerInterface", "Exception releasing Server", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerInterface");
	}
	public ServerCategoryInterface getServerCategoryInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategoryInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
		return _ServerCategoryPool.borrowServerCategory();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServerCategoryInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServerCategoryInterface(ServerCategoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerCategoryInterface");
		try {
			_ServerCategoryPool.returnServerCategory(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServerCategoryInterface", "Exception releasing ServerCategory", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerCategoryInterface");
	}
	public ServerDefinitionInterface getServerDefinitionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerDefinitionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
		return _ServerDefinitionPool.borrowServerDefinition();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServerDefinitionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServerDefinitionInterface(ServerDefinitionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerDefinitionInterface");
		try {
			_ServerDefinitionPool.returnServerDefinition(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServerDefinitionInterface", "Exception releasing ServerDefinition", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerDefinitionInterface");
	}
	public ServiceCenterInterface getServiceCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
		return _ServiceCenterPool.borrowServiceCenter();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceCenterInterface(ServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterInterface");
		try {
			_ServiceCenterPool.returnServiceCenter(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServiceCenterInterface", "Exception releasing ServiceCenter", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterInterface");
	}
	public ServiceCenterTypeInterface getServiceCenterTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
		return _ServiceCenterTypePool.borrowServiceCenterType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceCenterTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceCenterTypeInterface(ServiceCenterTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterTypeInterface");
		try {
			_ServiceCenterTypePool.returnServiceCenterType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServiceCenterTypeInterface", "Exception releasing ServiceCenterType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterTypeInterface");
	}
	public ServiceMasterGroupInterface getServiceMasterGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMasterGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
		return _ServiceMasterGroupPool.borrowServiceMasterGroup();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceMasterGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceMasterGroupInterface(ServiceMasterGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceMasterGroupInterface");
		try {
			_ServiceMasterGroupPool.returnServiceMasterGroup(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServiceMasterGroupInterface", "Exception releasing ServiceMasterGroup", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceMasterGroupInterface");
	}
	public ServicePricingPlanInterface getServicePricingPlanInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePricingPlanInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
		return _ServicePricingPlanPool.borrowServicePricingPlan();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServicePricingPlanInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServicePricingPlanInterface(ServicePricingPlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServicePricingPlanInterface");
		try {
			_ServicePricingPlanPool.returnServicePricingPlan(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServicePricingPlanInterface", "Exception releasing ServicePricingPlan", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServicePricingPlanInterface");
	}
	public ServiceZoneInterface getServiceZoneInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceZoneInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
		return _ServiceZonePool.borrowServiceZone();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceZoneInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceZoneInterface(ServiceZoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceZoneInterface");
		try {
			_ServiceZonePool.returnServiceZone(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseServiceZoneInterface", "Exception releasing ServiceZone", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceZoneInterface");
	}
	public SlaMeasurementDataInterface getSlaMeasurementDataInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementDataInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
		return _SlaMeasurementDataPool.borrowSlaMeasurementData();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSlaMeasurementDataInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSlaMeasurementDataInterface(SlaMeasurementDataInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSlaMeasurementDataInterface");
		try {
			_SlaMeasurementDataPool.returnSlaMeasurementData(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseSlaMeasurementDataInterface", "Exception releasing SlaMeasurementData", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSlaMeasurementDataInterface");
	}
	public StatusReasonMapInterface getStatusReasonMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
		return _StatusReasonMapPool.borrowStatusReasonMap();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getStatusReasonMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseStatusReasonMapInterface(StatusReasonMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseStatusReasonMapInterface");
		try {
			_StatusReasonMapPool.returnStatusReasonMap(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseStatusReasonMapInterface", "Exception releasing StatusReasonMap", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseStatusReasonMapInterface");
	}
	public TaxAbandonedInterface getTaxAbandonedInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAbandonedInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
		return _TaxAbandonedPool.borrowTaxAbandoned();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxAbandonedInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxAbandonedInterface(TaxAbandonedInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAbandonedInterface");
		try {
			_TaxAbandonedPool.returnTaxAbandoned(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTaxAbandonedInterface", "Exception releasing TaxAbandoned", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAbandonedInterface");
	}
	public TaxAssignmentInterface getTaxAssignmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAssignmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
		return _TaxAssignmentPool.borrowTaxAssignment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxAssignmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxAssignmentInterface(TaxAssignmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAssignmentInterface");
		try {
			_TaxAssignmentPool.returnTaxAssignment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTaxAssignmentInterface", "Exception releasing TaxAssignment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAssignmentInterface");
	}
	public TaxExemptionInterface getTaxExemptionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxExemptionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
		return _TaxExemptionPool.borrowTaxExemption();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxExemptionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxExemptionInterface(TaxExemptionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxExemptionInterface");
		try {
			_TaxExemptionPool.returnTaxExemption(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTaxExemptionInterface", "Exception releasing TaxExemption", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxExemptionInterface");
	}
	public TaxPackageInstInterface getTaxPackageInstInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPackageInstInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
		return _TaxPackageInstPool.borrowTaxPackageInst();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxPackageInstInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxPackageInstInterface(TaxPackageInstInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxPackageInstInterface");
		try {
			_TaxPackageInstPool.returnTaxPackageInst(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTaxPackageInstInterface", "Exception releasing TaxPackageInst", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxPackageInstInterface");
	}
	public TaxRatesVatInterface getTaxRatesVatInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRatesVatInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
		return _TaxRatesVatPool.borrowTaxRatesVat();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxRatesVatInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxRatesVatInterface(TaxRatesVatInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxRatesVatInterface");
		try {
			_TaxRatesVatPool.returnTaxRatesVat(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTaxRatesVatInterface", "Exception releasing TaxRatesVat", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxRatesVatInterface");
	}
	public TaxStatusInterface getTaxStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
		return _TaxStatusPool.borrowTaxStatus();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxStatusInterface(TaxStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxStatusInterface");
		try {
			_TaxStatusPool.returnTaxStatus(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTaxStatusInterface", "Exception releasing TaxStatus", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxStatusInterface");
	}
	public TaxTypeCommInterface getTaxTypeCommInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCommInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
		return _TaxTypeCommPool.borrowTaxTypeComm();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxTypeCommInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxTypeCommInterface(TaxTypeCommInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxTypeCommInterface");
		try {
			_TaxTypeCommPool.returnTaxTypeComm(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTaxTypeCommInterface", "Exception releasing TaxTypeComm", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxTypeCommInterface");
	}
	public TimezoneInterface getTimezoneInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
		return _TimezonePool.borrowTimezone();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTimezoneInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTimezoneInterface(TimezoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTimezoneInterface");
		try {
			_TimezonePool.returnTimezone(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTimezoneInterface", "Exception releasing Timezone", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTimezoneInterface");
	}
	public TransSourceTypeInterface getTransSourceTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
		return _TransSourceTypePool.borrowTransSourceType();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTransSourceTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTransSourceTypeInterface(TransSourceTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransSourceTypeInterface");
		try {
			_TransSourceTypePool.returnTransSourceType(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTransSourceTypeInterface", "Exception releasing TransSourceType", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransSourceTypeInterface");
	}
	public TransferReasonInterface getTransferReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
		return _TransferReasonPool.borrowTransferReason();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTransferReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTransferReasonInterface(TransferReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransferReasonInterface");
		try {
			_TransferReasonPool.returnTransferReason(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseTransferReasonInterface", "Exception releasing TransferReason", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransferReasonInterface");
	}
	public UnappliedPaymentInterface getUnappliedPaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnappliedPaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
		return _UnappliedPaymentPool.borrowUnappliedPayment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUnappliedPaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUnappliedPaymentInterface(UnappliedPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnappliedPaymentInterface");
		try {
			_UnappliedPaymentPool.returnUnappliedPayment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseUnappliedPaymentInterface", "Exception releasing UnappliedPayment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnappliedPaymentInterface");
	}
	public UnbilledUsageInterface getUnbilledUsageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
		return _UnbilledUsagePool.borrowUnbilledUsage();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUnbilledUsageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUnbilledUsageInterface(UnbilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageInterface");
		try {
			_UnbilledUsagePool.returnUnbilledUsage(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseUnbilledUsageInterface", "Exception releasing UnbilledUsage", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageInterface");
	}
	public UnbilledUsageBulkAdjustmentInterface getUnbilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
		return _UnbilledUsageBulkAdjustmentPool.borrowUnbilledUsageBulkAdjustment();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUnbilledUsageBulkAdjustmentInterface(UnbilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
		try {
			_UnbilledUsageBulkAdjustmentPool.returnUnbilledUsageBulkAdjustment(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface", "Exception releasing UnbilledUsageBulkAdjustment", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
	}
	public UsageCreditRateInterface getUsageCreditRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageCreditRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
		return _UsageCreditRatePool.borrowUsageCreditRate();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUsageCreditRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUsageCreditRateInterface(UsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUsageCreditRateInterface");
		try {
			_UsageCreditRatePool.returnUsageCreditRate(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseUsageCreditRateInterface", "Exception releasing UsageCreditRate", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUsageCreditRateInterface");
	}
	public VipCodeInterface getVipCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
		return _VipCodePool.borrowVipCode();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVipCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVipCodeInterface(VipCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVipCodeInterface");
		try {
			_VipCodePool.returnVipCode(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVipCodeInterface", "Exception releasing VipCode", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVipCodeInterface");
	}
	public VoucherDefinitionsInterface getVoucherDefinitionsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDefinitionsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
		return _VoucherDefinitionsPool.borrowVoucherDefinitions();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherDefinitionsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherDefinitionsInterface(VoucherDefinitionsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherDefinitionsInterface");
		try {
			_VoucherDefinitionsPool.returnVoucherDefinitions(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVoucherDefinitionsInterface", "Exception releasing VoucherDefinitions", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherDefinitionsInterface");
	}
	public VoucherHistoryInterface getVoucherHistoryInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherHistoryInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
		return _VoucherHistoryPool.borrowVoucherHistory();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherHistoryInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherHistoryInterface(VoucherHistoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherHistoryInterface");
		try {
			_VoucherHistoryPool.returnVoucherHistory(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVoucherHistoryInterface", "Exception releasing VoucherHistory", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherHistoryInterface");
	}
	public VoucherLocationInterface getVoucherLocationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherLocationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
		return _VoucherLocationPool.borrowVoucherLocation();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherLocationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherLocationInterface(VoucherLocationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherLocationInterface");
		try {
			_VoucherLocationPool.returnVoucherLocation(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVoucherLocationInterface", "Exception releasing VoucherLocation", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherLocationInterface");
	}
	public VoucherStatusInterface getVoucherStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
		return _VoucherStatusPool.borrowVoucherStatus();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherStatusInterface(VoucherStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInterface");
		try {
			_VoucherStatusPool.returnVoucherStatus(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVoucherStatusInterface", "Exception releasing VoucherStatus", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInterface");
	}
	public VoucherStatusInfoInterface getVoucherStatusInfoInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInfoInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
		return _VoucherStatusInfoPool.borrowVoucherStatusInfo();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherStatusInfoInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherStatusInfoInterface(VoucherStatusInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInfoInterface");
		try {
			_VoucherStatusInfoPool.returnVoucherStatusInfo(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVoucherStatusInfoInterface", "Exception releasing VoucherStatusInfo", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInfoInterface");
	}
	public VoucherStatusMovementInterface getVoucherStatusMovementInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusMovementInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
		return _VoucherStatusMovementPool.borrowVoucherStatusMovement();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherStatusMovementInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherStatusMovementInterface(VoucherStatusMovementInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusMovementInterface");
		try {
			_VoucherStatusMovementPool.returnVoucherStatusMovement(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVoucherStatusMovementInterface", "Exception releasing VoucherStatusMovement", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusMovementInterface");
	}
	public VoucherTypesInterface getVoucherTypesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
		return _VoucherTypesPool.borrowVoucherTypes();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherTypesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherTypesInterface(VoucherTypesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherTypesInterface");
		try {
			_VoucherTypesPool.returnVoucherTypes(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseVoucherTypesInterface", "Exception releasing VoucherTypes", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherTypesInterface");
	}
	public WriteoffInterface getWriteoffInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
		return _WriteoffPool.borrowWriteoff();
		} catch (Exception x) {
			Logger.error(this.getClass(), "getWriteoffInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseWriteoffInterface(WriteoffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseWriteoffInterface");
		try {
			_WriteoffPool.returnWriteoff(obj);
		} catch (Exception x) {
			Logger.error(this.getClass(), "releaseWriteoffInterface", "Exception releasing Writeoff", x);
		}
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseWriteoffInterface");
	}
	class AbiAutoPayCmfMapPool extends ObjectPool {
		public AbiAutoPayCmfMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AbiAutoPayCmfMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AbiAutoPayCmfMapInterface borrowAbiAutoPayCmfMap() {
			try{
				return((AbiAutoPayCmfMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAbiAutoPayCmfMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAbiAutoPayCmfMap(AbiAutoPayCmfMapInterface obj) {super.checkIn( obj );}
	}
	class AbiBillMessagesPool extends ObjectPool {
		public AbiBillMessagesPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AbiBillMessagesBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AbiBillMessagesInterface borrowAbiBillMessages() {
			try{
				return((AbiBillMessagesInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAbiBillMessages", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAbiBillMessages(AbiBillMessagesInterface obj) {super.checkIn( obj );}
	}
	class AbiBillingStatisticsPool extends ObjectPool {
		public AbiBillingStatisticsPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AbiBillingStatisticsBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AbiBillingStatisticsInterface borrowAbiBillingStatistics() {
			try{
				return((AbiBillingStatisticsInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAbiBillingStatistics", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAbiBillingStatistics(AbiBillingStatisticsInterface obj) {super.checkIn( obj );}
	}
	class AbiNrcDucPool extends ObjectPool {
		public AbiNrcDucPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AbiNrcDucBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AbiNrcDucInterface borrowAbiNrcDuc() {
			try{
				return((AbiNrcDucInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAbiNrcDuc", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAbiNrcDuc(AbiNrcDucInterface obj) {super.checkIn( obj );}
	}
	class AccountPool extends ObjectPool {
		public AccountPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountInterface borrowAccount() {
			try{
				return((AccountInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccount", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccount(AccountInterface obj) {super.checkIn( obj );}
	}
	class AccountAbiSourcePool extends ObjectPool {
		public AccountAbiSourcePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountAbiSourceBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountAbiSourceInterface borrowAccountAbiSource() {
			try{
				return((AccountAbiSourceInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountAbiSource", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountAbiSource(AccountAbiSourceInterface obj) {super.checkIn( obj );}
	}
	class AccountBalancesPool extends ObjectPool {
		public AccountBalancesPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountBalancesBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountBalancesInterface borrowAccountBalances() {
			try{
				return((AccountBalancesInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountBalances", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountBalances(AccountBalancesInterface obj) {super.checkIn( obj );}
	}
	class AccountBonusPointBalancePool extends ObjectPool {
		public AccountBonusPointBalancePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountBonusPointBalanceBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountBonusPointBalanceInterface borrowAccountBonusPointBalance() {
			try{
				return((AccountBonusPointBalanceInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountBonusPointBalance", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountBonusPointBalance(AccountBonusPointBalanceInterface obj) {super.checkIn( obj );}
	}
	class AccountBonusPointTransactionPool extends ObjectPool {
		public AccountBonusPointTransactionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountBonusPointTransactionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountBonusPointTransactionInterface borrowAccountBonusPointTransaction() {
			try{
				return((AccountBonusPointTransactionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountBonusPointTransaction", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountBonusPointTransaction(AccountBonusPointTransactionInterface obj) {super.checkIn( obj );}
	}
	class AccountCodePool extends ObjectPool {
		public AccountCodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountCodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountCodeInterface borrowAccountCode() {
			try{
				return((AccountCodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountCode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountCode(AccountCodeInterface obj) {super.checkIn( obj );}
	}
	class AccountCodeGroupPool extends ObjectPool {
		public AccountCodeGroupPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountCodeGroupBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountCodeGroupInterface borrowAccountCodeGroup() {
			try{
				return((AccountCodeGroupInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountCodeGroup", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountCodeGroup(AccountCodeGroupInterface obj) {super.checkIn( obj );}
	}
	class AccountHqContractPool extends ObjectPool {
		public AccountHqContractPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountHqContractBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountHqContractInterface borrowAccountHqContract() {
			try{
				return((AccountHqContractInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountHqContract", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountHqContract(AccountHqContractInterface obj) {super.checkIn( obj );}
	}
	class AccountIdPool extends ObjectPool {
		public AccountIdPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountIdBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountIdInterface borrowAccountId() {
			try{
				return((AccountIdInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountId", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountId(AccountIdInterface obj) {super.checkIn( obj );}
	}
	class AccountInsertPool extends ObjectPool {
		public AccountInsertPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountInsertBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountInsertInterface borrowAccountInsert() {
			try{
				return((AccountInsertInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountInsert", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountInsert(AccountInsertInterface obj) {super.checkIn( obj );}
	}
	class AccountLocatePool extends ObjectPool {
		public AccountLocatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountLocateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountLocateInterface borrowAccountLocate() {
			try{
				return((AccountLocateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountLocate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountLocate(AccountLocateInterface obj) {super.checkIn( obj );}
	}
	class AccountMessagePool extends ObjectPool {
		public AccountMessagePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountMessageBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountMessageInterface borrowAccountMessage() {
			try{
				return((AccountMessageInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountMessage", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountMessage(AccountMessageInterface obj) {super.checkIn( obj );}
	}
	class AccountSegmentPool extends ObjectPool {
		public AccountSegmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountSegmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountSegmentInterface borrowAccountSegment() {
			try{
				return((AccountSegmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountSegment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountSegment(AccountSegmentInterface obj) {super.checkIn( obj );}
	}
	class AccountSegmentMapPool extends ObjectPool {
		public AccountSegmentMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountSegmentMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountSegmentMapInterface borrowAccountSegmentMap() {
			try{
				return((AccountSegmentMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountSegmentMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountSegmentMap(AccountSegmentMapInterface obj) {super.checkIn( obj );}
	}
	class AccountStatusPool extends ObjectPool {
		public AccountStatusPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AccountStatusBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AccountStatusInterface borrowAccountStatus() {
			try{
				return((AccountStatusInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAccountStatus", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAccountStatus(AccountStatusInterface obj) {super.checkIn( obj );}
	}
	class AdjustmentPool extends ObjectPool {
		public AdjustmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AdjustmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AdjustmentInterface borrowAdjustment() {
			try{
				return((AdjustmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAdjustment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAdjustment(AdjustmentInterface obj) {super.checkIn( obj );}
	}
	class AdjustmentReasonPool extends ObjectPool {
		public AdjustmentReasonPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AdjustmentReasonBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AdjustmentReasonInterface borrowAdjustmentReason() {
			try{
				return((AdjustmentReasonInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAdjustmentReason", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAdjustmentReason(AdjustmentReasonInterface obj) {super.checkIn( obj );}
	}
	class AdjustmentTaxPool extends ObjectPool {
		public AdjustmentTaxPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AdjustmentTaxBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AdjustmentTaxInterface borrowAdjustmentTax() {
			try{
				return((AdjustmentTaxInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAdjustmentTax", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAdjustmentTax(AdjustmentTaxInterface obj) {super.checkIn( obj );}
	}
	class AdjustmentTypePool extends ObjectPool {
		public AdjustmentTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AdjustmentTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AdjustmentTypeInterface borrowAdjustmentType() {
			try{
				return((AdjustmentTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAdjustmentType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAdjustmentType(AdjustmentTypeInterface obj) {super.checkIn( obj );}
	}
	class AxrtCountryCodeMapPool extends ObjectPool {
		public AxrtCountryCodeMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AxrtCountryCodeMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AxrtCountryCodeMapInterface borrowAxrtCountryCodeMap() {
			try{
				return((AxrtCountryCodeMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAxrtCountryCodeMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAxrtCountryCodeMap(AxrtCountryCodeMapInterface obj) {super.checkIn( obj );}
	}
	class AxrtCurrCodeMapPool extends ObjectPool {
		public AxrtCurrCodeMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AxrtCurrCodeMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AxrtCurrCodeMapInterface borrowAxrtCurrCodeMap() {
			try{
				return((AxrtCurrCodeMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAxrtCurrCodeMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAxrtCurrCodeMap(AxrtCurrCodeMapInterface obj) {super.checkIn( obj );}
	}
	class AxrtCurrencyCodeMapPool extends ObjectPool {
		public AxrtCurrencyCodeMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AxrtCurrencyCodeMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AxrtCurrencyCodeMapInterface borrowAxrtCurrencyCodeMap() {
			try{
				return((AxrtCurrencyCodeMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAxrtCurrencyCodeMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAxrtCurrencyCodeMap(AxrtCurrencyCodeMapInterface obj) {super.checkIn( obj );}
	}
	class AxrtPaymentPool extends ObjectPool {
		public AxrtPaymentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AxrtPaymentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AxrtPaymentInterface borrowAxrtPayment() {
			try{
				return((AxrtPaymentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAxrtPayment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAxrtPayment(AxrtPaymentInterface obj) {super.checkIn( obj );}
	}
	class AxrtPaymentMerchantPool extends ObjectPool {
		public AxrtPaymentMerchantPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AxrtPaymentMerchantBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AxrtPaymentMerchantInterface borrowAxrtPaymentMerchant() {
			try{
				return((AxrtPaymentMerchantInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAxrtPaymentMerchant", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAxrtPaymentMerchant(AxrtPaymentMerchantInterface obj) {super.checkIn( obj );}
	}
	class AxrtPaymentProfilePool extends ObjectPool {
		public AxrtPaymentProfilePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AxrtPaymentProfileBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AxrtPaymentProfileInterface borrowAxrtPaymentProfile() {
			try{
				return((AxrtPaymentProfileInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAxrtPaymentProfile", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAxrtPaymentProfile(AxrtPaymentProfileInterface obj) {super.checkIn( obj );}
	}
	class AxrtPaymentTransPool extends ObjectPool {
		public AxrtPaymentTransPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new AxrtPaymentTransBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public AxrtPaymentTransInterface borrowAxrtPaymentTrans() {
			try{
				return((AxrtPaymentTransInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowAxrtPaymentTrans", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnAxrtPaymentTrans(AxrtPaymentTransInterface obj) {super.checkIn( obj );}
	}
	class BalanceLineItemPool extends ObjectPool {
		public BalanceLineItemPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BalanceLineItemBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BalanceLineItemInterface borrowBalanceLineItem() {
			try{
				return((BalanceLineItemInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBalanceLineItem", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBalanceLineItem(BalanceLineItemInterface obj) {super.checkIn( obj );}
	}
	class BalanceLineItemBulkAdjustmentPool extends ObjectPool {
		public BalanceLineItemBulkAdjustmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BalanceLineItemBulkAdjustmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BalanceLineItemBulkAdjustmentInterface borrowBalanceLineItemBulkAdjustment() {
			try{
				return((BalanceLineItemBulkAdjustmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBalanceLineItemBulkAdjustment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBalanceLineItemBulkAdjustment(BalanceLineItemBulkAdjustmentInterface obj) {super.checkIn( obj );}
	}
	class BalanceXferDiffPool extends ObjectPool {
		public BalanceXferDiffPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BalanceXferDiffBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BalanceXferDiffInterface borrowBalanceXferDiff() {
			try{
				return((BalanceXferDiffInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBalanceXferDiff", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBalanceXferDiff(BalanceXferDiffInterface obj) {super.checkIn( obj );}
	}
	class BamErrorCodePool extends ObjectPool {
		public BamErrorCodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BamErrorCodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BamErrorCodeInterface borrowBamErrorCode() {
			try{
				return((BamErrorCodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBamErrorCode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBamErrorCode(BamErrorCodeInterface obj) {super.checkIn( obj );}
	}
	class BillCyclePool extends ObjectPool {
		public BillCyclePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillCycleBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillCycleInterface borrowBillCycle() {
			try{
				return((BillCycleInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillCycle", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillCycle(BillCycleInterface obj) {super.checkIn( obj );}
	}
	class BillDispatchMethodPool extends ObjectPool {
		public BillDispatchMethodPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillDispatchMethodBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillDispatchMethodInterface borrowBillDispatchMethod() {
			try{
				return((BillDispatchMethodInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillDispatchMethod", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillDispatchMethod(BillDispatchMethodInterface obj) {super.checkIn( obj );}
	}
	class BillImagePool extends ObjectPool {
		public BillImagePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillImageBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillImageInterface borrowBillImage() {
			try{
				return((BillImageInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillImage", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillImage(BillImageInterface obj) {super.checkIn( obj );}
	}
	class BillImagePagePool extends ObjectPool {
		public BillImagePagePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillImagePageBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillImagePageInterface borrowBillImagePage() {
			try{
				return((BillImagePageInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillImagePage", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillImagePage(BillImagePageInterface obj) {super.checkIn( obj );}
	}
	class BillInsertGroupPool extends ObjectPool {
		public BillInsertGroupPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillInsertGroupBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillInsertGroupInterface borrowBillInsertGroup() {
			try{
				return((BillInsertGroupInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillInsertGroup", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillInsertGroup(BillInsertGroupInterface obj) {super.checkIn( obj );}
	}
	class BillInsertGroupMapPool extends ObjectPool {
		public BillInsertGroupMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillInsertGroupMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillInsertGroupMapInterface borrowBillInsertGroupMap() {
			try{
				return((BillInsertGroupMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillInsertGroupMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillInsertGroupMap(BillInsertGroupMapInterface obj) {super.checkIn( obj );}
	}
	class BillMessageGroupPool extends ObjectPool {
		public BillMessageGroupPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillMessageGroupBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillMessageGroupInterface borrowBillMessageGroup() {
			try{
				return((BillMessageGroupInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillMessageGroup", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillMessageGroup(BillMessageGroupInterface obj) {super.checkIn( obj );}
	}
	class BillMessageGroupMapPool extends ObjectPool {
		public BillMessageGroupMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BillMessageGroupMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BillMessageGroupMapInterface borrowBillMessageGroupMap() {
			try{
				return((BillMessageGroupMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBillMessageGroupMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBillMessageGroupMap(BillMessageGroupMapInterface obj) {super.checkIn( obj );}
	}
	class BilledUsagePool extends ObjectPool {
		public BilledUsagePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BilledUsageBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BilledUsageInterface borrowBilledUsage() {
			try{
				return((BilledUsageInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBilledUsage", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBilledUsage(BilledUsageInterface obj) {super.checkIn( obj );}
	}
	class BilledUsageBulkAdjustmentPool extends ObjectPool {
		public BilledUsageBulkAdjustmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BilledUsageBulkAdjustmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BilledUsageBulkAdjustmentInterface borrowBilledUsageBulkAdjustment() {
			try{
				return((BilledUsageBulkAdjustmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBilledUsageBulkAdjustment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBilledUsageBulkAdjustment(BilledUsageBulkAdjustmentInterface obj) {super.checkIn( obj );}
	}
	class BonusPointRatePool extends ObjectPool {
		public BonusPointRatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BonusPointRateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BonusPointRateInterface borrowBonusPointRate() {
			try{
				return((BonusPointRateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBonusPointRate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBonusPointRate(BonusPointRateInterface obj) {super.checkIn( obj );}
	}
	class BonusPointTransTypePool extends ObjectPool {
		public BonusPointTransTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new BonusPointTransTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public BonusPointTransTypeInterface borrowBonusPointTransType() {
			try{
				return((BonusPointTransTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowBonusPointTransType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnBonusPointTransType(BonusPointTransTypeInterface obj) {super.checkIn( obj );}
	}
	class CcAuditLogPool extends ObjectPool {
		public CcAuditLogPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CcAuditLogBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CcAuditLogInterface borrowCcAuditLog() {
			try{
				return((CcAuditLogInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCcAuditLog", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCcAuditLog(CcAuditLogInterface obj) {super.checkIn( obj );}
	}
	class CdrDataDucPool extends ObjectPool {
		public CdrDataDucPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CdrDataDucBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CdrDataDucInterface borrowCdrDataDuc() {
			try{
				return((CdrDataDucInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCdrDataDuc", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCdrDataDuc(CdrDataDucInterface obj) {super.checkIn( obj );}
	}
	class ChargeDistribPercentPool extends ObjectPool {
		public ChargeDistribPercentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ChargeDistribPercentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ChargeDistribPercentInterface borrowChargeDistribPercent() {
			try{
				return((ChargeDistribPercentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowChargeDistribPercent", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnChargeDistribPercent(ChargeDistribPercentInterface obj) {super.checkIn( obj );}
	}
	class ClearingHousePool extends ObjectPool {
		public ClearingHousePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ClearingHouseBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ClearingHouseInterface borrowClearingHouse() {
			try{
				return((ClearingHouseInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowClearingHouse", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnClearingHouse(ClearingHouseInterface obj) {super.checkIn( obj );}
	}
	class ClearingHouseContactsPool extends ObjectPool {
		public ClearingHouseContactsPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ClearingHouseContactsBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ClearingHouseContactsInterface borrowClearingHouseContacts() {
			try{
				return((ClearingHouseContactsInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowClearingHouseContacts", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnClearingHouseContacts(ClearingHouseContactsInterface obj) {super.checkIn( obj );}
	}
	class ClearingHouseInfoPool extends ObjectPool {
		public ClearingHouseInfoPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ClearingHouseInfoBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ClearingHouseInfoInterface borrowClearingHouseInfo() {
			try{
				return((ClearingHouseInfoInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowClearingHouseInfo", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnClearingHouseInfo(ClearingHouseInfoInterface obj) {super.checkIn( obj );}
	}
	class CmfBonusPointPool extends ObjectPool {
		public CmfBonusPointPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CmfBonusPointBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CmfBonusPointInterface borrowCmfBonusPoint() {
			try{
				return((CmfBonusPointInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCmfBonusPoint", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCmfBonusPoint(CmfBonusPointInterface obj) {super.checkIn( obj );}
	}
	class CmfPackageOverridesPool extends ObjectPool {
		public CmfPackageOverridesPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CmfPackageOverridesBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CmfPackageOverridesInterface borrowCmfPackageOverrides() {
			try{
				return((CmfPackageOverridesInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCmfPackageOverrides", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCmfPackageOverrides(CmfPackageOverridesInterface obj) {super.checkIn( obj );}
	}
	class CmfRewardBalanceDetailPool extends ObjectPool {
		public CmfRewardBalanceDetailPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CmfRewardBalanceDetailBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CmfRewardBalanceDetailInterface borrowCmfRewardBalanceDetail() {
			try{
				return((CmfRewardBalanceDetailInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCmfRewardBalanceDetail", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCmfRewardBalanceDetail(CmfRewardBalanceDetailInterface obj) {super.checkIn( obj );}
	}
	class CmfStatusPool extends ObjectPool {
		public CmfStatusPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CmfStatusBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CmfStatusInterface borrowCmfStatus() {
			try{
				return((CmfStatusInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCmfStatus", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCmfStatus(CmfStatusInterface obj) {super.checkIn( obj );}
	}
	class CmfStatusChgReasonPool extends ObjectPool {
		public CmfStatusChgReasonPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CmfStatusChgReasonBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CmfStatusChgReasonInterface borrowCmfStatusChgReason() {
			try{
				return((CmfStatusChgReasonInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCmfStatusChgReason", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCmfStatusChgReason(CmfStatusChgReasonInterface obj) {super.checkIn( obj );}
	}
	class ConnectReasonPool extends ObjectPool {
		public ConnectReasonPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ConnectReasonBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ConnectReasonInterface borrowConnectReason() {
			try{
				return((ConnectReasonInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowConnectReason", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnConnectReason(ConnectReasonInterface obj) {super.checkIn( obj );}
	}
	class ContactPool extends ObjectPool {
		public ContactPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ContactBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ContactInterface borrowContact() {
			try{
				return((ContactInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowContact", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnContact(ContactInterface obj) {super.checkIn( obj );}
	}
	class ContractDiscountPool extends ObjectPool {
		public ContractDiscountPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ContractDiscountBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ContractDiscountInterface borrowContractDiscount() {
			try{
				return((ContractDiscountInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowContractDiscount", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnContractDiscount(ContractDiscountInterface obj) {super.checkIn( obj );}
	}
	class CorridorPool extends ObjectPool {
		public CorridorPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CorridorBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CorridorInterface borrowCorridor() {
			try{
				return((CorridorInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCorridor", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCorridor(CorridorInterface obj) {super.checkIn( obj );}
	}
	class CorridorRateBandOverridePool extends ObjectPool {
		public CorridorRateBandOverridePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CorridorRateBandOverrideBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CorridorRateBandOverrideInterface borrowCorridorRateBandOverride() {
			try{
				return((CorridorRateBandOverrideInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCorridorRateBandOverride", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCorridorRateBandOverride(CorridorRateBandOverrideInterface obj) {super.checkIn( obj );}
	}
	class CorridorRateOverridePool extends ObjectPool {
		public CorridorRateOverridePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CorridorRateOverrideBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CorridorRateOverrideInterface borrowCorridorRateOverride() {
			try{
				return((CorridorRateOverrideInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCorridorRateOverride", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCorridorRateOverride(CorridorRateOverrideInterface obj) {super.checkIn( obj );}
	}
	class CreditCardPool extends ObjectPool {
		public CreditCardPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CreditCardBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CreditCardInterface borrowCreditCard() {
			try{
				return((CreditCardInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCreditCard", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCreditCard(CreditCardInterface obj) {super.checkIn( obj );}
	}
	class CreditCardTypeCodePool extends ObjectPool {
		public CreditCardTypeCodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CreditCardTypeCodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CreditCardTypeCodeInterface borrowCreditCardTypeCode() {
			try{
				return((CreditCardTypeCodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCreditCardTypeCode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCreditCardTypeCode(CreditCardTypeCodeInterface obj) {super.checkIn( obj );}
	}
	class CsrPool extends ObjectPool {
		public CsrPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CsrBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CsrInterface borrowCsr() {
			try{
				return((CsrInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCsr", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCsr(CsrInterface obj) {super.checkIn( obj );}
	}
	class CsrAccountSegmentPool extends ObjectPool {
		public CsrAccountSegmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CsrAccountSegmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CsrAccountSegmentInterface borrowCsrAccountSegment() {
			try{
				return((CsrAccountSegmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCsrAccountSegment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCsrAccountSegment(CsrAccountSegmentInterface obj) {super.checkIn( obj );}
	}
	class CsrGroupAmountPool extends ObjectPool {
		public CsrGroupAmountPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CsrGroupAmountBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CsrGroupAmountInterface borrowCsrGroupAmount() {
			try{
				return((CsrGroupAmountInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCsrGroupAmount", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCsrGroupAmount(CsrGroupAmountInterface obj) {super.checkIn( obj );}
	}
	class CsrGroupFunctionPool extends ObjectPool {
		public CsrGroupFunctionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CsrGroupFunctionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CsrGroupFunctionInterface borrowCsrGroupFunction() {
			try{
				return((CsrGroupFunctionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCsrGroupFunction", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCsrGroupFunction(CsrGroupFunctionInterface obj) {super.checkIn( obj );}
	}
	class CustomerDocumentPool extends ObjectPool {
		public CustomerDocumentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CustomerDocumentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CustomerDocumentInterface borrowCustomerDocument() {
			try{
				return((CustomerDocumentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCustomerDocument", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCustomerDocument(CustomerDocumentInterface obj) {super.checkIn( obj );}
	}
	class CustomerDtServerPool extends ObjectPool {
		public CustomerDtServerPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CustomerDtServerBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CustomerDtServerInterface borrowCustomerDtServer() {
			try{
				return((CustomerDtServerInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCustomerDtServer", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCustomerDtServer(CustomerDtServerInterface obj) {super.checkIn( obj );}
	}
	class CustomerDtUrlPool extends ObjectPool {
		public CustomerDtUrlPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CustomerDtUrlBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CustomerDtUrlInterface borrowCustomerDtUrl() {
			try{
				return((CustomerDtUrlInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCustomerDtUrl", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCustomerDtUrl(CustomerDtUrlInterface obj) {super.checkIn( obj );}
	}
	class CustomerServiceCenterPool extends ObjectPool {
		public CustomerServiceCenterPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new CustomerServiceCenterBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public CustomerServiceCenterInterface borrowCustomerServiceCenter() {
			try{
				return((CustomerServiceCenterInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowCustomerServiceCenter", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnCustomerServiceCenter(CustomerServiceCenterInterface obj) {super.checkIn( obj );}
	}
	class DepositPool extends ObjectPool {
		public DepositPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new DepositBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public DepositInterface borrowDeposit() {
			try{
				return((DepositInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowDeposit", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnDeposit(DepositInterface obj) {super.checkIn( obj );}
	}
	class DepositTypePool extends ObjectPool {
		public DepositTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new DepositTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public DepositTypeInterface borrowDepositType() {
			try{
				return((DepositTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowDepositType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnDepositType(DepositTypeInterface obj) {super.checkIn( obj );}
	}
	class DiscReasonPool extends ObjectPool {
		public DiscReasonPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new DiscReasonBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public DiscReasonInterface borrowDiscReason() {
			try{
				return((DiscReasonInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowDiscReason", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnDiscReason(DiscReasonInterface obj) {super.checkIn( obj );}
	}
	class DocumentTypeRefPool extends ObjectPool {
		public DocumentTypeRefPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new DocumentTypeRefBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public DocumentTypeRefInterface borrowDocumentTypeRef() {
			try{
				return((DocumentTypeRefInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowDocumentTypeRef", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnDocumentTypeRef(DocumentTypeRefInterface obj) {super.checkIn( obj );}
	}
	class EarlyTerminationChargePool extends ObjectPool {
		public EarlyTerminationChargePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new EarlyTerminationChargeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public EarlyTerminationChargeInterface borrowEarlyTerminationCharge() {
			try{
				return((EarlyTerminationChargeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowEarlyTerminationCharge", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnEarlyTerminationCharge(EarlyTerminationChargeInterface obj) {super.checkIn( obj );}
	}
	class EftResponseCodePool extends ObjectPool {
		public EftResponseCodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new EftResponseCodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public EftResponseCodeInterface borrowEftResponseCode() {
			try{
				return((EftResponseCodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowEftResponseCode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnEftResponseCode(EftResponseCodeInterface obj) {super.checkIn( obj );}
	}
	class EftTransactionPool extends ObjectPool {
		public EftTransactionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new EftTransactionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public EftTransactionInterface borrowEftTransaction() {
			try{
				return((EftTransactionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowEftTransaction", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnEftTransaction(EftTransactionInterface obj) {super.checkIn( obj );}
	}
	class EnhancedNotePool extends ObjectPool {
		public EnhancedNotePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new EnhancedNoteBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public EnhancedNoteInterface borrowEnhancedNote() {
			try{
				return((EnhancedNoteInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowEnhancedNote", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnEnhancedNote(EnhancedNoteInterface obj) {super.checkIn( obj );}
	}
	class ExchangeRateClassPool extends ObjectPool {
		public ExchangeRateClassPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExchangeRateClassBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExchangeRateClassInterface borrowExchangeRateClass() {
			try{
				return((ExchangeRateClassInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExchangeRateClass", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExchangeRateClass(ExchangeRateClassInterface obj) {super.checkIn( obj );}
	}
	class ExtendedDataAssociationPool extends ObjectPool {
		public ExtendedDataAssociationPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExtendedDataAssociationBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExtendedDataAssociationInterface borrowExtendedDataAssociation() {
			try{
				return((ExtendedDataAssociationInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExtendedDataAssociation", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExtendedDataAssociation(ExtendedDataAssociationInterface obj) {super.checkIn( obj );}
	}
	class ExtendedDataEnumerationPool extends ObjectPool {
		public ExtendedDataEnumerationPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExtendedDataEnumerationBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExtendedDataEnumerationInterface borrowExtendedDataEnumeration() {
			try{
				return((ExtendedDataEnumerationInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExtendedDataEnumeration", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExtendedDataEnumeration(ExtendedDataEnumerationInterface obj) {super.checkIn( obj );}
	}
	class ExtendedDataLocatePool extends ObjectPool {
		public ExtendedDataLocatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExtendedDataLocateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExtendedDataLocateInterface borrowExtendedDataLocate() {
			try{
				return((ExtendedDataLocateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExtendedDataLocate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExtendedDataLocate(ExtendedDataLocateInterface obj) {super.checkIn( obj );}
	}
	class ExtendedDataParamPool extends ObjectPool {
		public ExtendedDataParamPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExtendedDataParamBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExtendedDataParamInterface borrowExtendedDataParam() {
			try{
				return((ExtendedDataParamInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExtendedDataParam", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExtendedDataParam(ExtendedDataParamInterface obj) {super.checkIn( obj );}
	}
	class ExtendedDataParamTypePool extends ObjectPool {
		public ExtendedDataParamTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExtendedDataParamTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExtendedDataParamTypeInterface borrowExtendedDataParamType() {
			try{
				return((ExtendedDataParamTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExtendedDataParamType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExtendedDataParamType(ExtendedDataParamTypeInterface obj) {super.checkIn( obj );}
	}
	class ExternalIdAcctMapPool extends ObjectPool {
		public ExternalIdAcctMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExternalIdAcctMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExternalIdAcctMapInterface borrowExternalIdAcctMap() {
			try{
				return((ExternalIdAcctMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExternalIdAcctMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExternalIdAcctMap(ExternalIdAcctMapInterface obj) {super.checkIn( obj );}
	}
	class ExternalIdHqGroupsMapPool extends ObjectPool {
		public ExternalIdHqGroupsMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ExternalIdHqGroupsMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ExternalIdHqGroupsMapInterface borrowExternalIdHqGroupsMap() {
			try{
				return((ExternalIdHqGroupsMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowExternalIdHqGroupsMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnExternalIdHqGroupsMap(ExternalIdHqGroupsMapInterface obj) {super.checkIn( obj );}
	}
	class FranchiseCodePool extends ObjectPool {
		public FranchiseCodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new FranchiseCodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public FranchiseCodeInterface borrowFranchiseCode() {
			try{
				return((FranchiseCodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowFranchiseCode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnFranchiseCode(FranchiseCodeInterface obj) {super.checkIn( obj );}
	}
	class GenderTypePool extends ObjectPool {
		public GenderTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GenderTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GenderTypeInterface borrowGenderType() {
			try{
				return((GenderTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGenderType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGenderType(GenderTypeInterface obj) {super.checkIn( obj );}
	}
	class GenericEnumerationPool extends ObjectPool {
		public GenericEnumerationPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GenericEnumerationBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GenericEnumerationInterface borrowGenericEnumeration() {
			try{
				return((GenericEnumerationInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGenericEnumeration", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGenericEnumeration(GenericEnumerationInterface obj) {super.checkIn( obj );}
	}
	class GeocodePool extends ObjectPool {
		public GeocodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GeocodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GeocodeInterface borrowGeocode() {
			try{
				return((GeocodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGeocode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGeocode(GeocodeInterface obj) {super.checkIn( obj );}
	}
	class GlobalAccountBalancesPool extends ObjectPool {
		public GlobalAccountBalancesPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GlobalAccountBalancesBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GlobalAccountBalancesInterface borrowGlobalAccountBalances() {
			try{
				return((GlobalAccountBalancesInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGlobalAccountBalances", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGlobalAccountBalances(GlobalAccountBalancesInterface obj) {super.checkIn( obj );}
	}
	class GlobalContractPool extends ObjectPool {
		public GlobalContractPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GlobalContractBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GlobalContractInterface borrowGlobalContract() {
			try{
				return((GlobalContractInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGlobalContract", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGlobalContract(GlobalContractInterface obj) {super.checkIn( obj );}
	}
	class GlobalOpenItemIdMapPool extends ObjectPool {
		public GlobalOpenItemIdMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GlobalOpenItemIdMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GlobalOpenItemIdMapInterface borrowGlobalOpenItemIdMap() {
			try{
				return((GlobalOpenItemIdMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGlobalOpenItemIdMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGlobalOpenItemIdMap(GlobalOpenItemIdMapInterface obj) {super.checkIn( obj );}
	}
	class GroupPool extends ObjectPool {
		public GroupPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GroupBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GroupInterface borrowGroup() {
			try{
				return((GroupInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGroup", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGroup(GroupInterface obj) {super.checkIn( obj );}
	}
	class GroupLocatePool extends ObjectPool {
		public GroupLocatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GroupLocateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GroupLocateInterface borrowGroupLocate() {
			try{
				return((GroupLocateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGroupLocate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGroupLocate(GroupLocateInterface obj) {super.checkIn( obj );}
	}
	class GroupMemberPool extends ObjectPool {
		public GroupMemberPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GroupMemberBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GroupMemberInterface borrowGroupMember() {
			try{
				return((GroupMemberInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGroupMember", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGroupMember(GroupMemberInterface obj) {super.checkIn( obj );}
	}
	class GuiIndicatorPool extends ObjectPool {
		public GuiIndicatorPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new GuiIndicatorBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public GuiIndicatorInterface borrowGuiIndicator() {
			try{
				return((GuiIndicatorInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowGuiIndicator", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnGuiIndicator(GuiIndicatorInterface obj) {super.checkIn( obj );}
	}
	class HistoricalContributionPool extends ObjectPool {
		public HistoricalContributionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HistoricalContributionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HistoricalContributionInterface borrowHistoricalContribution() {
			try{
				return((HistoricalContributionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHistoricalContribution", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHistoricalContribution(HistoricalContributionInterface obj) {super.checkIn( obj );}
	}
	class HistoricalContributionTaxPool extends ObjectPool {
		public HistoricalContributionTaxPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HistoricalContributionTaxBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HistoricalContributionTaxInterface borrowHistoricalContributionTax() {
			try{
				return((HistoricalContributionTaxInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHistoricalContributionTax", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHistoricalContributionTax(HistoricalContributionTaxInterface obj) {super.checkIn( obj );}
	}
	class HistoricalThresholdsPool extends ObjectPool {
		public HistoricalThresholdsPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HistoricalThresholdsBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HistoricalThresholdsInterface borrowHistoricalThresholds() {
			try{
				return((HistoricalThresholdsInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHistoricalThresholds", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHistoricalThresholds(HistoricalThresholdsInterface obj) {super.checkIn( obj );}
	}
	class HqContractUnitCrPool extends ObjectPool {
		public HqContractUnitCrPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HqContractUnitCrBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HqContractUnitCrInterface borrowHqContractUnitCr() {
			try{
				return((HqContractUnitCrInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHqContractUnitCr", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHqContractUnitCr(HqContractUnitCrInterface obj) {super.checkIn( obj );}
	}
	class HqGroupContractsPool extends ObjectPool {
		public HqGroupContractsPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HqGroupContractsBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HqGroupContractsInterface borrowHqGroupContracts() {
			try{
				return((HqGroupContractsInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHqGroupContracts", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHqGroupContracts(HqGroupContractsInterface obj) {super.checkIn( obj );}
	}
	class HqGroupCorridorPool extends ObjectPool {
		public HqGroupCorridorPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HqGroupCorridorBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HqGroupCorridorInterface borrowHqGroupCorridor() {
			try{
				return((HqGroupCorridorInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHqGroupCorridor", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHqGroupCorridor(HqGroupCorridorInterface obj) {super.checkIn( obj );}
	}
	class HqGroupMembersPool extends ObjectPool {
		public HqGroupMembersPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HqGroupMembersBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HqGroupMembersInterface borrowHqGroupMembers() {
			try{
				return((HqGroupMembersInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHqGroupMembers", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHqGroupMembers(HqGroupMembersInterface obj) {super.checkIn( obj );}
	}
	class HqGroupProductPool extends ObjectPool {
		public HqGroupProductPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HqGroupProductBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HqGroupProductInterface borrowHqGroupProduct() {
			try{
				return((HqGroupProductInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHqGroupProduct", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHqGroupProduct(HqGroupProductInterface obj) {super.checkIn( obj );}
	}
	class HqGroupsPool extends ObjectPool {
		public HqGroupsPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HqGroupsBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HqGroupsInterface borrowHqGroups() {
			try{
				return((HqGroupsInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHqGroups", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHqGroups(HqGroupsInterface obj) {super.checkIn( obj );}
	}
	class HqgroupUsageRedirectMapPool extends ObjectPool {
		public HqgroupUsageRedirectMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new HqgroupUsageRedirectMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public HqgroupUsageRedirectMapInterface borrowHqgroupUsageRedirectMap() {
			try{
				return((HqgroupUsageRedirectMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowHqgroupUsageRedirectMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnHqgroupUsageRedirectMap(HqgroupUsageRedirectMapInterface obj) {super.checkIn( obj );}
	}
	class InterimBillPool extends ObjectPool {
		public InterimBillPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new InterimBillBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public InterimBillInterface borrowInterimBill() {
			try{
				return((InterimBillInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowInterimBill", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnInterimBill(InterimBillInterface obj) {super.checkIn( obj );}
	}
	class InvoicePool extends ObjectPool {
		public InvoicePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new InvoiceBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public InvoiceInterface borrowInvoice() {
			try{
				return((InvoiceInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowInvoice", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnInvoice(InvoiceInterface obj) {super.checkIn( obj );}
	}
	class InvoiceDetailPool extends ObjectPool {
		public InvoiceDetailPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new InvoiceDetailBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public InvoiceDetailInterface borrowInvoiceDetail() {
			try{
				return((InvoiceDetailInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowInvoiceDetail", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnInvoiceDetail(InvoiceDetailInterface obj) {super.checkIn( obj );}
	}
	class InvoiceDetailBulkAdjustmentPool extends ObjectPool {
		public InvoiceDetailBulkAdjustmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new InvoiceDetailBulkAdjustmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public InvoiceDetailBulkAdjustmentInterface borrowInvoiceDetailBulkAdjustment() {
			try{
				return((InvoiceDetailBulkAdjustmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowInvoiceDetailBulkAdjustment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnInvoiceDetailBulkAdjustment(InvoiceDetailBulkAdjustmentInterface obj) {super.checkIn( obj );}
	}
	class LateFeeRateOverridesPool extends ObjectPool {
		public LateFeeRateOverridesPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new LateFeeRateOverridesBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public LateFeeRateOverridesInterface borrowLateFeeRateOverrides() {
			try{
				return((LateFeeRateOverridesInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowLateFeeRateOverrides", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnLateFeeRateOverrides(LateFeeRateOverridesInterface obj) {super.checkIn( obj );}
	}
	class LbxPaymentTypePool extends ObjectPool {
		public LbxPaymentTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new LbxPaymentTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public LbxPaymentTypeInterface borrowLbxPaymentType() {
			try{
				return((LbxPaymentTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowLbxPaymentType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnLbxPaymentType(LbxPaymentTypeInterface obj) {super.checkIn( obj );}
	}
	class MultiLinesAdjPool extends ObjectPool {
		public MultiLinesAdjPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new MultiLinesAdjBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public MultiLinesAdjInterface borrowMultiLinesAdj() {
			try{
				return((MultiLinesAdjInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowMultiLinesAdj", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnMultiLinesAdj(MultiLinesAdjInterface obj) {super.checkIn( obj );}
	}
	class NetActionPool extends ObjectPool {
		public NetActionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new NetActionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public NetActionInterface borrowNetAction() {
			try{
				return((NetActionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowNetAction", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnNetAction(NetActionInterface obj) {super.checkIn( obj );}
	}
	class NotePool extends ObjectPool {
		public NotePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new NoteBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public NoteInterface borrowNote() {
			try{
				return((NoteInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowNote", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnNote(NoteInterface obj) {super.checkIn( obj );}
	}
	class NoteCodePool extends ObjectPool {
		public NoteCodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new NoteCodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public NoteCodeInterface borrowNoteCode() {
			try{
				return((NoteCodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowNoteCode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnNoteCode(NoteCodeInterface obj) {super.checkIn( obj );}
	}
	class NoteTextPool extends ObjectPool {
		public NoteTextPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new NoteTextBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public NoteTextInterface borrowNoteText() {
			try{
				return((NoteTextInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowNoteText", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnNoteText(NoteTextInterface obj) {super.checkIn( obj );}
	}
	class OpenItemPool extends ObjectPool {
		public OpenItemPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new OpenItemBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public OpenItemInterface borrowOpenItem() {
			try{
				return((OpenItemInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowOpenItem", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnOpenItem(OpenItemInterface obj) {super.checkIn( obj );}
	}
	class OpenItemIdMapPool extends ObjectPool {
		public OpenItemIdMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new OpenItemIdMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public OpenItemIdMapInterface borrowOpenItemIdMap() {
			try{
				return((OpenItemIdMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowOpenItemIdMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnOpenItemIdMap(OpenItemIdMapInterface obj) {super.checkIn( obj );}
	}
	class OrderQuotePool extends ObjectPool {
		public OrderQuotePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new OrderQuoteBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public OrderQuoteInterface borrowOrderQuote() {
			try{
				return((OrderQuoteInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowOrderQuote", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnOrderQuote(OrderQuoteInterface obj) {super.checkIn( obj );}
	}
	class OverrideDiscountRatePool extends ObjectPool {
		public OverrideDiscountRatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new OverrideDiscountRateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public OverrideDiscountRateInterface borrowOverrideDiscountRate() {
			try{
				return((OverrideDiscountRateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowOverrideDiscountRate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnOverrideDiscountRate(OverrideDiscountRateInterface obj) {super.checkIn( obj );}
	}
	class OverrideUsageCreditRatePool extends ObjectPool {
		public OverrideUsageCreditRatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new OverrideUsageCreditRateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public OverrideUsageCreditRateInterface borrowOverrideUsageCreditRate() {
			try{
				return((OverrideUsageCreditRateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowOverrideUsageCreditRate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnOverrideUsageCreditRate(OverrideUsageCreditRateInterface obj) {super.checkIn( obj );}
	}
	class OwningCostCenterPool extends ObjectPool {
		public OwningCostCenterPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new OwningCostCenterBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public OwningCostCenterInterface borrowOwningCostCenter() {
			try{
				return((OwningCostCenterInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowOwningCostCenter", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnOwningCostCenter(OwningCostCenterInterface obj) {super.checkIn( obj );}
	}
	class PackageComponentDefPool extends ObjectPool {
		public PackageComponentDefPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PackageComponentDefBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PackageComponentDefInterface borrowPackageComponentDef() {
			try{
				return((PackageComponentDefInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPackageComponentDef", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPackageComponentDef(PackageComponentDefInterface obj) {super.checkIn( obj );}
	}
	class PaymentPool extends ObjectPool {
		public PaymentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PaymentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PaymentInterface borrowPayment() {
			try{
				return((PaymentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPayment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPayment(PaymentInterface obj) {super.checkIn( obj );}
	}
	class PaymentDistributionPool extends ObjectPool {
		public PaymentDistributionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PaymentDistributionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PaymentDistributionInterface borrowPaymentDistribution() {
			try{
				return((PaymentDistributionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPaymentDistribution", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPaymentDistribution(PaymentDistributionInterface obj) {super.checkIn( obj );}
	}
	class PaymentMerchantIdPool extends ObjectPool {
		public PaymentMerchantIdPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PaymentMerchantIdBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PaymentMerchantIdInterface borrowPaymentMerchantId() {
			try{
				return((PaymentMerchantIdInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPaymentMerchantId", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPaymentMerchantId(PaymentMerchantIdInterface obj) {super.checkIn( obj );}
	}
	class PaymentMerchantIdAssignPool extends ObjectPool {
		public PaymentMerchantIdAssignPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PaymentMerchantIdAssignBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PaymentMerchantIdAssignInterface borrowPaymentMerchantIdAssign() {
			try{
				return((PaymentMerchantIdAssignInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPaymentMerchantIdAssign", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPaymentMerchantIdAssign(PaymentMerchantIdAssignInterface obj) {super.checkIn( obj );}
	}
	class PaymentProfilePool extends ObjectPool {
		public PaymentProfilePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PaymentProfileBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PaymentProfileInterface borrowPaymentProfile() {
			try{
				return((PaymentProfileInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPaymentProfile", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPaymentProfile(PaymentProfileInterface obj) {super.checkIn( obj );}
	}
	class PaymentTransPool extends ObjectPool {
		public PaymentTransPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PaymentTransBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PaymentTransInterface borrowPaymentTrans() {
			try{
				return((PaymentTransInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPaymentTrans", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPaymentTrans(PaymentTransInterface obj) {super.checkIn( obj );}
	}
	class PaymentTypePool extends ObjectPool {
		public PaymentTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PaymentTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PaymentTypeInterface borrowPaymentType() {
			try{
				return((PaymentTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPaymentType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPaymentType(PaymentTypeInterface obj) {super.checkIn( obj );}
	}
	class PrepaymentPool extends ObjectPool {
		public PrepaymentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PrepaymentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PrepaymentInterface borrowPrepayment() {
			try{
				return((PrepaymentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPrepayment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPrepayment(PrepaymentInterface obj) {super.checkIn( obj );}
	}
	class PrepaymentDistributionPool extends ObjectPool {
		public PrepaymentDistributionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PrepaymentDistributionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PrepaymentDistributionInterface borrowPrepaymentDistribution() {
			try{
				return((PrepaymentDistributionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPrepaymentDistribution", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPrepaymentDistribution(PrepaymentDistributionInterface obj) {super.checkIn( obj );}
	}
	class PrivacyLevelPool extends ObjectPool {
		public PrivacyLevelPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new PrivacyLevelBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public PrivacyLevelInterface borrowPrivacyLevel() {
			try{
				return((PrivacyLevelInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowPrivacyLevel", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnPrivacyLevel(PrivacyLevelInterface obj) {super.checkIn( obj );}
	}
	class ProductCatalogPool extends ObjectPool {
		public ProductCatalogPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ProductCatalogBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ProductCatalogInterface borrowProductCatalog() {
			try{
				return((ProductCatalogInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowProductCatalog", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnProductCatalog(ProductCatalogInterface obj) {super.checkIn( obj );}
	}
	class ProductChargeMapPool extends ObjectPool {
		public ProductChargeMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ProductChargeMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ProductChargeMapInterface borrowProductChargeMap() {
			try{
				return((ProductChargeMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowProductChargeMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnProductChargeMap(ProductChargeMapInterface obj) {super.checkIn( obj );}
	}
	class ProductRateKeyPool extends ObjectPool {
		public ProductRateKeyPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ProductRateKeyBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ProductRateKeyInterface borrowProductRateKey() {
			try{
				return((ProductRateKeyInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowProductRateKey", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnProductRateKey(ProductRateKeyInterface obj) {super.checkIn( obj );}
	}
	class ProductRateOverridePool extends ObjectPool {
		public ProductRateOverridePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ProductRateOverrideBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ProductRateOverrideInterface borrowProductRateOverride() {
			try{
				return((ProductRateOverrideInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowProductRateOverride", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnProductRateOverride(ProductRateOverrideInterface obj) {super.checkIn( obj );}
	}
	class ProductRcRatePool extends ObjectPool {
		public ProductRcRatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ProductRcRateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ProductRcRateInterface borrowProductRcRate() {
			try{
				return((ProductRcRateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowProductRcRate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnProductRcRate(ProductRcRateInterface obj) {super.checkIn( obj );}
	}
	class RefinancePlanPool extends ObjectPool {
		public RefinancePlanPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RefinancePlanBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RefinancePlanInterface borrowRefinancePlan() {
			try{
				return((RefinancePlanInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRefinancePlan", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRefinancePlan(RefinancePlanInterface obj) {super.checkIn( obj );}
	}
	class RefundPool extends ObjectPool {
		public RefundPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RefundBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RefundInterface borrowRefund() {
			try{
				return((RefundInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRefund", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRefund(RefundInterface obj) {super.checkIn( obj );}
	}
	class RefundReasonPool extends ObjectPool {
		public RefundReasonPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RefundReasonBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RefundReasonInterface borrowRefundReason() {
			try{
				return((RefundReasonInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRefundReason", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRefundReason(RefundReasonInterface obj) {super.checkIn( obj );}
	}
	class RegulatoryIdPool extends ObjectPool {
		public RegulatoryIdPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RegulatoryIdBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RegulatoryIdInterface borrowRegulatoryId() {
			try{
				return((RegulatoryIdInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRegulatoryId", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRegulatoryId(RegulatoryIdInterface obj) {super.checkIn( obj );}
	}
	class RevRcvCostCenterPool extends ObjectPool {
		public RevRcvCostCenterPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RevRcvCostCenterBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RevRcvCostCenterInterface borrowRevRcvCostCenter() {
			try{
				return((RevRcvCostCenterInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRevRcvCostCenter", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRevRcvCostCenter(RevRcvCostCenterInterface obj) {super.checkIn( obj );}
	}
	class ReverseBulkAdjustmentPool extends ObjectPool {
		public ReverseBulkAdjustmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ReverseBulkAdjustmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ReverseBulkAdjustmentInterface borrowReverseBulkAdjustment() {
			try{
				return((ReverseBulkAdjustmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowReverseBulkAdjustment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnReverseBulkAdjustment(ReverseBulkAdjustmentInterface obj) {super.checkIn( obj );}
	}
	class RewardBalancePool extends ObjectPool {
		public RewardBalancePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RewardBalanceBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RewardBalanceInterface borrowRewardBalance() {
			try{
				return((RewardBalanceInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRewardBalance", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRewardBalance(RewardBalanceInterface obj) {super.checkIn( obj );}
	}
	class RewardBalanceEntityMappingPool extends ObjectPool {
		public RewardBalanceEntityMappingPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RewardBalanceEntityMappingBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RewardBalanceEntityMappingInterface borrowRewardBalanceEntityMapping() {
			try{
				return((RewardBalanceEntityMappingInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRewardBalanceEntityMapping", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRewardBalanceEntityMapping(RewardBalanceEntityMappingInterface obj) {super.checkIn( obj );}
	}
	class RtPaymentResponsePool extends ObjectPool {
		public RtPaymentResponsePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new RtPaymentResponseBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public RtPaymentResponseInterface borrowRtPaymentResponse() {
			try{
				return((RtPaymentResponseInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowRtPaymentResponse", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnRtPaymentResponse(RtPaymentResponseInterface obj) {super.checkIn( obj );}
	}
	class SalesChannelPool extends ObjectPool {
		public SalesChannelPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new SalesChannelBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public SalesChannelInterface borrowSalesChannel() {
			try{
				return((SalesChannelInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowSalesChannel", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnSalesChannel(SalesChannelInterface obj) {super.checkIn( obj );}
	}
	class SecurityAciPool extends ObjectPool {
		public SecurityAciPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new SecurityAciBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public SecurityAciInterface borrowSecurityAci() {
			try{
				return((SecurityAciInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowSecurityAci", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnSecurityAci(SecurityAciInterface obj) {super.checkIn( obj );}
	}
	class SecurityResourcePool extends ObjectPool {
		public SecurityResourcePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new SecurityResourceBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public SecurityResourceInterface borrowSecurityResource() {
			try{
				return((SecurityResourceInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowSecurityResource", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnSecurityResource(SecurityResourceInterface obj) {super.checkIn( obj );}
	}
	class SecurityRolePool extends ObjectPool {
		public SecurityRolePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new SecurityRoleBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public SecurityRoleInterface borrowSecurityRole() {
			try{
				return((SecurityRoleInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowSecurityRole", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnSecurityRole(SecurityRoleInterface obj) {super.checkIn( obj );}
	}
	class SecurityUserPool extends ObjectPool {
		public SecurityUserPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new SecurityUserBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public SecurityUserInterface borrowSecurityUser() {
			try{
				return((SecurityUserInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowSecurityUser", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnSecurityUser(SecurityUserInterface obj) {super.checkIn( obj );}
	}
	class ServerPool extends ObjectPool {
		public ServerPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServerBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServerInterface borrowServer() {
			try{
				return((ServerInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServer", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServer(ServerInterface obj) {super.checkIn( obj );}
	}
	class ServerCategoryPool extends ObjectPool {
		public ServerCategoryPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServerCategoryBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServerCategoryInterface borrowServerCategory() {
			try{
				return((ServerCategoryInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServerCategory", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServerCategory(ServerCategoryInterface obj) {super.checkIn( obj );}
	}
	class ServerDefinitionPool extends ObjectPool {
		public ServerDefinitionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServerDefinitionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServerDefinitionInterface borrowServerDefinition() {
			try{
				return((ServerDefinitionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServerDefinition", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServerDefinition(ServerDefinitionInterface obj) {super.checkIn( obj );}
	}
	class ServiceCenterPool extends ObjectPool {
		public ServiceCenterPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServiceCenterBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServiceCenterInterface borrowServiceCenter() {
			try{
				return((ServiceCenterInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServiceCenter", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServiceCenter(ServiceCenterInterface obj) {super.checkIn( obj );}
	}
	class ServiceCenterTypePool extends ObjectPool {
		public ServiceCenterTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServiceCenterTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServiceCenterTypeInterface borrowServiceCenterType() {
			try{
				return((ServiceCenterTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServiceCenterType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServiceCenterType(ServiceCenterTypeInterface obj) {super.checkIn( obj );}
	}
	class ServiceMasterGroupPool extends ObjectPool {
		public ServiceMasterGroupPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServiceMasterGroupBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServiceMasterGroupInterface borrowServiceMasterGroup() {
			try{
				return((ServiceMasterGroupInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServiceMasterGroup", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServiceMasterGroup(ServiceMasterGroupInterface obj) {super.checkIn( obj );}
	}
	class ServicePricingPlanPool extends ObjectPool {
		public ServicePricingPlanPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServicePricingPlanBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServicePricingPlanInterface borrowServicePricingPlan() {
			try{
				return((ServicePricingPlanInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServicePricingPlan", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServicePricingPlan(ServicePricingPlanInterface obj) {super.checkIn( obj );}
	}
	class ServiceZonePool extends ObjectPool {
		public ServiceZonePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new ServiceZoneBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public ServiceZoneInterface borrowServiceZone() {
			try{
				return((ServiceZoneInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowServiceZone", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnServiceZone(ServiceZoneInterface obj) {super.checkIn( obj );}
	}
	class SlaMeasurementDataPool extends ObjectPool {
		public SlaMeasurementDataPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new SlaMeasurementDataBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public SlaMeasurementDataInterface borrowSlaMeasurementData() {
			try{
				return((SlaMeasurementDataInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowSlaMeasurementData", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnSlaMeasurementData(SlaMeasurementDataInterface obj) {super.checkIn( obj );}
	}
	class StatusReasonMapPool extends ObjectPool {
		public StatusReasonMapPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new StatusReasonMapBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public StatusReasonMapInterface borrowStatusReasonMap() {
			try{
				return((StatusReasonMapInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowStatusReasonMap", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnStatusReasonMap(StatusReasonMapInterface obj) {super.checkIn( obj );}
	}
	class TaxAbandonedPool extends ObjectPool {
		public TaxAbandonedPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TaxAbandonedBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TaxAbandonedInterface borrowTaxAbandoned() {
			try{
				return((TaxAbandonedInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTaxAbandoned", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTaxAbandoned(TaxAbandonedInterface obj) {super.checkIn( obj );}
	}
	class TaxAssignmentPool extends ObjectPool {
		public TaxAssignmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TaxAssignmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TaxAssignmentInterface borrowTaxAssignment() {
			try{
				return((TaxAssignmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTaxAssignment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTaxAssignment(TaxAssignmentInterface obj) {super.checkIn( obj );}
	}
	class TaxExemptionPool extends ObjectPool {
		public TaxExemptionPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TaxExemptionBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TaxExemptionInterface borrowTaxExemption() {
			try{
				return((TaxExemptionInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTaxExemption", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTaxExemption(TaxExemptionInterface obj) {super.checkIn( obj );}
	}
	class TaxPackageInstPool extends ObjectPool {
		public TaxPackageInstPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TaxPackageInstBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TaxPackageInstInterface borrowTaxPackageInst() {
			try{
				return((TaxPackageInstInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTaxPackageInst", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTaxPackageInst(TaxPackageInstInterface obj) {super.checkIn( obj );}
	}
	class TaxRatesVatPool extends ObjectPool {
		public TaxRatesVatPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TaxRatesVatBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TaxRatesVatInterface borrowTaxRatesVat() {
			try{
				return((TaxRatesVatInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTaxRatesVat", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTaxRatesVat(TaxRatesVatInterface obj) {super.checkIn( obj );}
	}
	class TaxStatusPool extends ObjectPool {
		public TaxStatusPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TaxStatusBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TaxStatusInterface borrowTaxStatus() {
			try{
				return((TaxStatusInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTaxStatus", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTaxStatus(TaxStatusInterface obj) {super.checkIn( obj );}
	}
	class TaxTypeCommPool extends ObjectPool {
		public TaxTypeCommPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TaxTypeCommBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TaxTypeCommInterface borrowTaxTypeComm() {
			try{
				return((TaxTypeCommInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTaxTypeComm", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTaxTypeComm(TaxTypeCommInterface obj) {super.checkIn( obj );}
	}
	class TimezonePool extends ObjectPool {
		public TimezonePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TimezoneBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TimezoneInterface borrowTimezone() {
			try{
				return((TimezoneInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTimezone", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTimezone(TimezoneInterface obj) {super.checkIn( obj );}
	}
	class TransSourceTypePool extends ObjectPool {
		public TransSourceTypePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TransSourceTypeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TransSourceTypeInterface borrowTransSourceType() {
			try{
				return((TransSourceTypeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTransSourceType", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTransSourceType(TransSourceTypeInterface obj) {super.checkIn( obj );}
	}
	class TransferReasonPool extends ObjectPool {
		public TransferReasonPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new TransferReasonBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public TransferReasonInterface borrowTransferReason() {
			try{
				return((TransferReasonInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowTransferReason", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnTransferReason(TransferReasonInterface obj) {super.checkIn( obj );}
	}
	class UnappliedPaymentPool extends ObjectPool {
		public UnappliedPaymentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new UnappliedPaymentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public UnappliedPaymentInterface borrowUnappliedPayment() {
			try{
				return((UnappliedPaymentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowUnappliedPayment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnUnappliedPayment(UnappliedPaymentInterface obj) {super.checkIn( obj );}
	}
	class UnbilledUsagePool extends ObjectPool {
		public UnbilledUsagePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new UnbilledUsageBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public UnbilledUsageInterface borrowUnbilledUsage() {
			try{
				return((UnbilledUsageInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowUnbilledUsage", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnUnbilledUsage(UnbilledUsageInterface obj) {super.checkIn( obj );}
	}
	class UnbilledUsageBulkAdjustmentPool extends ObjectPool {
		public UnbilledUsageBulkAdjustmentPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new UnbilledUsageBulkAdjustmentBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public UnbilledUsageBulkAdjustmentInterface borrowUnbilledUsageBulkAdjustment() {
			try{
				return((UnbilledUsageBulkAdjustmentInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowUnbilledUsageBulkAdjustment", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnUnbilledUsageBulkAdjustment(UnbilledUsageBulkAdjustmentInterface obj) {super.checkIn( obj );}
	}
	class UsageCreditRatePool extends ObjectPool {
		public UsageCreditRatePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new UsageCreditRateBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public UsageCreditRateInterface borrowUsageCreditRate() {
			try{
				return((UsageCreditRateInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowUsageCreditRate", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnUsageCreditRate(UsageCreditRateInterface obj) {super.checkIn( obj );}
	}
	class VipCodePool extends ObjectPool {
		public VipCodePool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VipCodeBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VipCodeInterface borrowVipCode() {
			try{
				return((VipCodeInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVipCode", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVipCode(VipCodeInterface obj) {super.checkIn( obj );}
	}
	class VoucherDefinitionsPool extends ObjectPool {
		public VoucherDefinitionsPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VoucherDefinitionsBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VoucherDefinitionsInterface borrowVoucherDefinitions() {
			try{
				return((VoucherDefinitionsInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVoucherDefinitions", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVoucherDefinitions(VoucherDefinitionsInterface obj) {super.checkIn( obj );}
	}
	class VoucherHistoryPool extends ObjectPool {
		public VoucherHistoryPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VoucherHistoryBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VoucherHistoryInterface borrowVoucherHistory() {
			try{
				return((VoucherHistoryInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVoucherHistory", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVoucherHistory(VoucherHistoryInterface obj) {super.checkIn( obj );}
	}
	class VoucherLocationPool extends ObjectPool {
		public VoucherLocationPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VoucherLocationBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VoucherLocationInterface borrowVoucherLocation() {
			try{
				return((VoucherLocationInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVoucherLocation", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVoucherLocation(VoucherLocationInterface obj) {super.checkIn( obj );}
	}
	class VoucherStatusPool extends ObjectPool {
		public VoucherStatusPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VoucherStatusBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VoucherStatusInterface borrowVoucherStatus() {
			try{
				return((VoucherStatusInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVoucherStatus", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVoucherStatus(VoucherStatusInterface obj) {super.checkIn( obj );}
	}
	class VoucherStatusInfoPool extends ObjectPool {
		public VoucherStatusInfoPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VoucherStatusInfoBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VoucherStatusInfoInterface borrowVoucherStatusInfo() {
			try{
				return((VoucherStatusInfoInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVoucherStatusInfo", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVoucherStatusInfo(VoucherStatusInfoInterface obj) {super.checkIn( obj );}
	}
	class VoucherStatusMovementPool extends ObjectPool {
		public VoucherStatusMovementPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VoucherStatusMovementBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VoucherStatusMovementInterface borrowVoucherStatusMovement() {
			try{
				return((VoucherStatusMovementInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVoucherStatusMovement", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVoucherStatusMovement(VoucherStatusMovementInterface obj) {super.checkIn( obj );}
	}
	class VoucherTypesPool extends ObjectPool {
		public VoucherTypesPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new VoucherTypesBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public VoucherTypesInterface borrowVoucherTypes() {
			try{
				return((VoucherTypesInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowVoucherTypes", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnVoucherTypes(VoucherTypesInterface obj) {super.checkIn( obj );}
	}
	class WriteoffPool extends ObjectPool {
		public WriteoffPool(long expiretime) {super(expiretime);}
		public Object create() throws Exception {
			return new WriteoffBean(BSDMSettings.getDefault());
		}
		public boolean validate( Object o ) {return true;}
		public void expire( Object o ) {}
		public WriteoffInterface borrowWriteoff() {
			try{
				return((WriteoffInterface) super.checkOut());
			} catch (Exception x) {
				Logger.error(this.getClass(), "borrowWriteoff", "Exception borrowing - ", x);
				return null;
			}
		}
		public void returnWriteoff(WriteoffInterface obj) {super.checkIn( obj );}
	}
}
