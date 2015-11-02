package com.csgsystems.bp.proxy;

import com.csgsystems.bp.interfaces.*;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.api.proxy.InterfaceFactoryException;

import com.csgsystems.api.proxy.ApiInterfaceFactory;

import java.util.Map;
import java.util.TreeMap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import com.csgsystems.api.utilities.XmlHelper;

import com.csgsystems.api.utilities.Logger;

public class InterfaceFactoryManager implements InterfaceFactory, ApiInterfaceFactory {

	protected static InterfaceFactoryManager instance = null;

	protected Map factoryMap = null;

	protected String defaultType = null;
	protected String defaultApp = null;


	public static final String ABIAUTOPAYCMFMAP = "AbiAutoPayCmfMap";
	public static final String ABIBILLMESSAGES = "AbiBillMessages";
	public static final String ABIBILLINGSTATISTICS = "AbiBillingStatistics";
	public static final String ABINRCDUC = "AbiNrcDuc";
	public static final String ACCOUNT = "Account";
	public static final String ACCOUNTABISOURCE = "AccountAbiSource";
	public static final String ACCOUNTBALANCES = "AccountBalances";
	public static final String ACCOUNTBONUSPOINTBALANCE = "AccountBonusPointBalance";
	public static final String ACCOUNTBONUSPOINTTRANSACTION = "AccountBonusPointTransaction";
	public static final String ACCOUNTCODE = "AccountCode";
	public static final String ACCOUNTCODEGROUP = "AccountCodeGroup";
	public static final String ACCOUNTHQCONTRACT = "AccountHqContract";
	public static final String ACCOUNTID = "AccountId";
	public static final String ACCOUNTINSERT = "AccountInsert";
	public static final String ACCOUNTLOCATE = "AccountLocate";
	public static final String ACCOUNTMESSAGE = "AccountMessage";
	public static final String ACCOUNTSEGMENT = "AccountSegment";
	public static final String ACCOUNTSEGMENTMAP = "AccountSegmentMap";
	public static final String ACCOUNTSTATUS = "AccountStatus";
	public static final String ADJUSTMENT = "Adjustment";
	public static final String ADJUSTMENTREASON = "AdjustmentReason";
	public static final String ADJUSTMENTTAX = "AdjustmentTax";
	public static final String ADJUSTMENTTYPE = "AdjustmentType";
	public static final String AXRTCOUNTRYCODEMAP = "AxrtCountryCodeMap";
	public static final String AXRTCURRCODEMAP = "AxrtCurrCodeMap";
	public static final String AXRTCURRENCYCODEMAP = "AxrtCurrencyCodeMap";
	public static final String AXRTPAYMENT = "AxrtPayment";
	public static final String AXRTPAYMENTMERCHANT = "AxrtPaymentMerchant";
	public static final String AXRTPAYMENTPROFILE = "AxrtPaymentProfile";
	public static final String AXRTPAYMENTTRANS = "AxrtPaymentTrans";
	public static final String BALANCELINEITEM = "BalanceLineItem";
	public static final String BALANCELINEITEMBULKADJUSTMENT = "BalanceLineItemBulkAdjustment";
	public static final String BALANCEXFERDIFF = "BalanceXferDiff";
	public static final String BAMERRORCODE = "BamErrorCode";
	public static final String BILLCYCLE = "BillCycle";
	public static final String BILLDISPATCHMETHOD = "BillDispatchMethod";
	public static final String BILLIMAGE = "BillImage";
	public static final String BILLIMAGEPAGE = "BillImagePage";
	public static final String BILLINSERTGROUP = "BillInsertGroup";
	public static final String BILLINSERTGROUPMAP = "BillInsertGroupMap";
	public static final String BILLMESSAGEGROUP = "BillMessageGroup";
	public static final String BILLMESSAGEGROUPMAP = "BillMessageGroupMap";
	public static final String BILLEDUSAGE = "BilledUsage";
	public static final String BILLEDUSAGEBULKADJUSTMENT = "BilledUsageBulkAdjustment";
	public static final String BONUSPOINTRATE = "BonusPointRate";
	public static final String BONUSPOINTTRANSTYPE = "BonusPointTransType";
	public static final String CCAUDITLOG = "CcAuditLog";
	public static final String CDRDATADUC = "CdrDataDuc";
	public static final String CHARGEDISTRIBPERCENT = "ChargeDistribPercent";
	public static final String CLEARINGHOUSE = "ClearingHouse";
	public static final String CLEARINGHOUSECONTACTS = "ClearingHouseContacts";
	public static final String CLEARINGHOUSEINFO = "ClearingHouseInfo";
	public static final String CMFBONUSPOINT = "CmfBonusPoint";
	public static final String CMFPACKAGEOVERRIDES = "CmfPackageOverrides";
	public static final String CMFREWARDBALANCEDETAIL = "CmfRewardBalanceDetail";
	public static final String CMFSTATUS = "CmfStatus";
	public static final String CMFSTATUSCHGREASON = "CmfStatusChgReason";
	public static final String CONNECTREASON = "ConnectReason";
	public static final String CONTACT = "Contact";
	public static final String CONTRACTDISCOUNT = "ContractDiscount";
	public static final String CORRIDOR = "Corridor";
	public static final String CORRIDORRATEBANDOVERRIDE = "CorridorRateBandOverride";
	public static final String CORRIDORRATEOVERRIDE = "CorridorRateOverride";
	public static final String CREDITCARD = "CreditCard";
	public static final String CREDITCARDTYPECODE = "CreditCardTypeCode";
	public static final String CSR = "Csr";
	public static final String CSRACCOUNTSEGMENT = "CsrAccountSegment";
	public static final String CSRGROUPAMOUNT = "CsrGroupAmount";
	public static final String CSRGROUPFUNCTION = "CsrGroupFunction";
	public static final String CUSTOMERDOCUMENT = "CustomerDocument";
	public static final String CUSTOMERDTSERVER = "CustomerDtServer";
	public static final String CUSTOMERDTURL = "CustomerDtUrl";
	public static final String CUSTOMERSERVICECENTER = "CustomerServiceCenter";
	public static final String DEPOSIT = "Deposit";
	public static final String DEPOSITTYPE = "DepositType";
	public static final String DISCREASON = "DiscReason";
	public static final String DOCUMENTTYPEREF = "DocumentTypeRef";
	public static final String EARLYTERMINATIONCHARGE = "EarlyTerminationCharge";
	public static final String EFTRESPONSECODE = "EftResponseCode";
	public static final String EFTTRANSACTION = "EftTransaction";
	public static final String ENHANCEDNOTE = "EnhancedNote";
	public static final String EXCHANGERATECLASS = "ExchangeRateClass";
	public static final String EXTENDEDDATAASSOCIATION = "ExtendedDataAssociation";
	public static final String EXTENDEDDATAENUMERATION = "ExtendedDataEnumeration";
	public static final String EXTENDEDDATALOCATE = "ExtendedDataLocate";
	public static final String EXTENDEDDATAPARAM = "ExtendedDataParam";
	public static final String EXTENDEDDATAPARAMTYPE = "ExtendedDataParamType";
	public static final String EXTERNALIDACCTMAP = "ExternalIdAcctMap";
	public static final String EXTERNALIDHQGROUPSMAP = "ExternalIdHqGroupsMap";
	public static final String FRANCHISECODE = "FranchiseCode";
	public static final String GENDERTYPE = "GenderType";
	public static final String GENERICENUMERATION = "GenericEnumeration";
	public static final String GEOCODE = "Geocode";
	public static final String GLOBALACCOUNTBALANCES = "GlobalAccountBalances";
	public static final String GLOBALCONTRACT = "GlobalContract";
	public static final String GLOBALOPENITEMIDMAP = "GlobalOpenItemIdMap";
	public static final String GROUP = "Group";
	public static final String GROUPLOCATE = "GroupLocate";
	public static final String GROUPMEMBER = "GroupMember";
	public static final String GUIINDICATOR = "GuiIndicator";
	public static final String HISTORICALCONTRIBUTION = "HistoricalContribution";
	public static final String HISTORICALCONTRIBUTIONTAX = "HistoricalContributionTax";
	public static final String HISTORICALTHRESHOLDS = "HistoricalThresholds";
	public static final String HQCONTRACTUNITCR = "HqContractUnitCr";
	public static final String HQGROUPCONTRACTS = "HqGroupContracts";
	public static final String HQGROUPCORRIDOR = "HqGroupCorridor";
	public static final String HQGROUPMEMBERS = "HqGroupMembers";
	public static final String HQGROUPPRODUCT = "HqGroupProduct";
	public static final String HQGROUPS = "HqGroups";
	public static final String HQGROUPUSAGEREDIRECTMAP = "HqgroupUsageRedirectMap";
	public static final String INTERIMBILL = "InterimBill";
	public static final String INVOICE = "Invoice";
	public static final String INVOICEDETAIL = "InvoiceDetail";
	public static final String INVOICEDETAILBULKADJUSTMENT = "InvoiceDetailBulkAdjustment";
	public static final String LATEFEERATEOVERRIDES = "LateFeeRateOverrides";
	public static final String LBXPAYMENTTYPE = "LbxPaymentType";
	public static final String MULTILINESADJ = "MultiLinesAdj";
	public static final String NETACTION = "NetAction";
	public static final String NOTE = "Note";
	public static final String NOTECODE = "NoteCode";
	public static final String NOTETEXT = "NoteText";
	public static final String OPENITEM = "OpenItem";
	public static final String OPENITEMIDMAP = "OpenItemIdMap";
	public static final String ORDERQUOTE = "OrderQuote";
	public static final String OVERRIDEDISCOUNTRATE = "OverrideDiscountRate";
	public static final String OVERRIDEUSAGECREDITRATE = "OverrideUsageCreditRate";
	public static final String OWNINGCOSTCENTER = "OwningCostCenter";
	public static final String PACKAGECOMPONENTDEF = "PackageComponentDef";
	public static final String PAYMENT = "Payment";
	public static final String PAYMENTDISTRIBUTION = "PaymentDistribution";
	public static final String PAYMENTMERCHANTID = "PaymentMerchantId";
	public static final String PAYMENTMERCHANTIDASSIGN = "PaymentMerchantIdAssign";
	public static final String PAYMENTPROFILE = "PaymentProfile";
	public static final String PAYMENTTRANS = "PaymentTrans";
	public static final String PAYMENTTYPE = "PaymentType";
	public static final String PREPAYMENT = "Prepayment";
	public static final String PREPAYMENTDISTRIBUTION = "PrepaymentDistribution";
	public static final String PRIVACYLEVEL = "PrivacyLevel";
	public static final String PRODUCTCATALOG = "ProductCatalog";
	public static final String PRODUCTCHARGEMAP = "ProductChargeMap";
	public static final String PRODUCTRATEKEY = "ProductRateKey";
	public static final String PRODUCTRATEOVERRIDE = "ProductRateOverride";
	public static final String PRODUCTRCRATE = "ProductRcRate";
	public static final String REFINANCEPLAN = "RefinancePlan";
	public static final String REFUND = "Refund";
	public static final String REFUNDREASON = "RefundReason";
	public static final String REGULATORYID = "RegulatoryId";
	public static final String REVRCVCOSTCENTER = "RevRcvCostCenter";
	public static final String REVERSEBULKADJUSTMENT = "ReverseBulkAdjustment";
	public static final String REWARDBALANCE = "RewardBalance";
	public static final String REWARDBALANCEENTITYMAPPING = "RewardBalanceEntityMapping";
	public static final String RTPAYMENTRESPONSE = "RtPaymentResponse";
	public static final String SALESCHANNEL = "SalesChannel";
	public static final String SECURITYACI = "SecurityAci";
	public static final String SECURITYRESOURCE = "SecurityResource";
	public static final String SECURITYROLE = "SecurityRole";
	public static final String SECURITYUSER = "SecurityUser";
	public static final String SERVER = "Server";
	public static final String SERVERCATEGORY = "ServerCategory";
	public static final String SERVERDEFINITION = "ServerDefinition";
	public static final String SERVICECENTER = "ServiceCenter";
	public static final String SERVICECENTERTYPE = "ServiceCenterType";
	public static final String SERVICEMASTERGROUP = "ServiceMasterGroup";
	public static final String SERVICEPRICINGPLAN = "ServicePricingPlan";
	public static final String SERVICEZONE = "ServiceZone";
	public static final String SLAMEASUREMENTDATA = "SlaMeasurementData";
	public static final String STATUSREASONMAP = "StatusReasonMap";
	public static final String TAXABANDONED = "TaxAbandoned";
	public static final String TAXASSIGNMENT = "TaxAssignment";
	public static final String TAXEXEMPTION = "TaxExemption";
	public static final String TAXPACKAGEINST = "TaxPackageInst";
	public static final String TAXRATESVAT = "TaxRatesVat";
	public static final String TAXSTATUS = "TaxStatus";
	public static final String TAXTYPECOMM = "TaxTypeComm";
	public static final String TIMEZONE = "Timezone";
	public static final String TRANSSOURCETYPE = "TransSourceType";
	public static final String TRANSFERREASON = "TransferReason";
	public static final String UNAPPLIEDPAYMENT = "UnappliedPayment";
	public static final String UNBILLEDUSAGE = "UnbilledUsage";
	public static final String UNBILLEDUSAGEBULKADJUSTMENT = "UnbilledUsageBulkAdjustment";
	public static final String USAGECREDITRATE = "UsageCreditRate";
	public static final String VIPCODE = "VipCode";
	public static final String VOUCHERDEFINITIONS = "VoucherDefinitions";
	public static final String VOUCHERHISTORY = "VoucherHistory";
	public static final String VOUCHERLOCATION = "VoucherLocation";
	public static final String VOUCHERSTATUS = "VoucherStatus";
	public static final String VOUCHERSTATUSINFO = "VoucherStatusInfo";
	public static final String VOUCHERSTATUSMOVEMENT = "VoucherStatusMovement";
	public static final String VOUCHERTYPES = "VoucherTypes";
	public static final String WRITEOFF = "Writeoff";
	public InterfaceFactoryManager () {
		factoryMap = new TreeMap();
		Document xml = XmlHelper.createDocumentFromCPFile("/bpInterfaceFactoryManager.xml");
		Element rootNode = xml.getDocumentElement();
		NodeList factories = null;;
		try {
			defaultType = XmlHelper.getElementValue(XmlHelper.getSingleNode(rootNode, "/InterfaceFactoryManager/DefaultType"));
			defaultApp = XmlHelper.getElementValue(XmlHelper.getSingleNode(rootNode, "/InterfaceFactoryManager/DefaultApplication"));
			factories = XmlHelper.getNodeList(rootNode, "/InterfaceFactoryManager/InterfaceFactories/InterfaceFactory");
		} catch (Exception x) {
			Logger.error(this.getClass(), "Could not get factories nodes", x);
			return;
		}
		Node factoryNode = null;
		String app = null;
		String type = null;
		String className = null;
		Class factoryClass = null;
		Object factoryObj = null;
		Map innerMap = null;
		InterfaceFactory factory = null;
		for (int i = 0; i < factories.getLength(); i++) {
			factoryNode = factories.item(i);
			try {
				app = XmlHelper.getElementValue(XmlHelper.getSingleNode(factoryNode, "Application"));
				type = XmlHelper.getElementValue(XmlHelper.getSingleNode(factoryNode, "Type"));
				className = XmlHelper.getElementValue(XmlHelper.getSingleNode(factoryNode, "Class"));
				if (className != null && type != null && app != null) {
					if(Logger.DEBUG) Logger.debug(this.getClass(), "constructor", "Trying to istantiate using app = "+app+" type = "+type+" class "+className);
					try {
						factoryClass = Class.forName(className);
						factoryObj = factoryClass.newInstance();
						if(factoryObj instanceof InterfaceFactory) {
							factory = (InterfaceFactory) factoryObj;
							if (factoryMap.containsKey(app)) {
								innerMap = (Map)factoryMap.get(app);
							} else {
								innerMap = new TreeMap();
							}
							innerMap.put(type, factory);
							factoryMap.put(app, innerMap);
						} else {
							if (Logger.DEBUG) Logger.debug(this.getClass(), "constructor", "Not an instance of InterfaceFactory");
						}
					} catch (Exception x) {
						Logger.error(this.getClass(), "constructor", "Could not instantiate InterfaceFactory", x);
					}
				} else {
					if (Logger.DEBUG) Logger.debug(this.getClass(), "constructor", "Could not create InterfaceFactory null issue app = "+app+" type = "+type+" class "+className);
				}
			} catch (Exception x) {
				Logger.error(this.getClass(),"constructor", "Could not handle factory config", x);
			}
		}
	}
	public static InterfaceFactoryManager getInstance() {
		if (instance == null) {
			instance = new InterfaceFactoryManager();
		}
		return instance;
	}
	public boolean supports(String name) {
		if (ABIAUTOPAYCMFMAP.equals(name)) return true;
		if (ABIBILLMESSAGES.equals(name)) return true;
		if (ABIBILLINGSTATISTICS.equals(name)) return true;
		if (ABINRCDUC.equals(name)) return true;
		if (ACCOUNT.equals(name)) return true;
		if (ACCOUNTABISOURCE.equals(name)) return true;
		if (ACCOUNTBALANCES.equals(name)) return true;
		if (ACCOUNTBONUSPOINTBALANCE.equals(name)) return true;
		if (ACCOUNTBONUSPOINTTRANSACTION.equals(name)) return true;
		if (ACCOUNTCODE.equals(name)) return true;
		if (ACCOUNTCODEGROUP.equals(name)) return true;
		if (ACCOUNTHQCONTRACT.equals(name)) return true;
		if (ACCOUNTID.equals(name)) return true;
		if (ACCOUNTINSERT.equals(name)) return true;
		if (ACCOUNTLOCATE.equals(name)) return true;
		if (ACCOUNTMESSAGE.equals(name)) return true;
		if (ACCOUNTSEGMENT.equals(name)) return true;
		if (ACCOUNTSEGMENTMAP.equals(name)) return true;
		if (ACCOUNTSTATUS.equals(name)) return true;
		if (ADJUSTMENT.equals(name)) return true;
		if (ADJUSTMENTREASON.equals(name)) return true;
		if (ADJUSTMENTTAX.equals(name)) return true;
		if (ADJUSTMENTTYPE.equals(name)) return true;
		if (AXRTCOUNTRYCODEMAP.equals(name)) return true;
		if (AXRTCURRCODEMAP.equals(name)) return true;
		if (AXRTCURRENCYCODEMAP.equals(name)) return true;
		if (AXRTPAYMENT.equals(name)) return true;
		if (AXRTPAYMENTMERCHANT.equals(name)) return true;
		if (AXRTPAYMENTPROFILE.equals(name)) return true;
		if (AXRTPAYMENTTRANS.equals(name)) return true;
		if (BALANCELINEITEM.equals(name)) return true;
		if (BALANCELINEITEMBULKADJUSTMENT.equals(name)) return true;
		if (BALANCEXFERDIFF.equals(name)) return true;
		if (BAMERRORCODE.equals(name)) return true;
		if (BILLCYCLE.equals(name)) return true;
		if (BILLDISPATCHMETHOD.equals(name)) return true;
		if (BILLIMAGE.equals(name)) return true;
		if (BILLIMAGEPAGE.equals(name)) return true;
		if (BILLINSERTGROUP.equals(name)) return true;
		if (BILLINSERTGROUPMAP.equals(name)) return true;
		if (BILLMESSAGEGROUP.equals(name)) return true;
		if (BILLMESSAGEGROUPMAP.equals(name)) return true;
		if (BILLEDUSAGE.equals(name)) return true;
		if (BILLEDUSAGEBULKADJUSTMENT.equals(name)) return true;
		if (BONUSPOINTRATE.equals(name)) return true;
		if (BONUSPOINTTRANSTYPE.equals(name)) return true;
		if (CCAUDITLOG.equals(name)) return true;
		if (CDRDATADUC.equals(name)) return true;
		if (CHARGEDISTRIBPERCENT.equals(name)) return true;
		if (CLEARINGHOUSE.equals(name)) return true;
		if (CLEARINGHOUSECONTACTS.equals(name)) return true;
		if (CLEARINGHOUSEINFO.equals(name)) return true;
		if (CMFBONUSPOINT.equals(name)) return true;
		if (CMFPACKAGEOVERRIDES.equals(name)) return true;
		if (CMFREWARDBALANCEDETAIL.equals(name)) return true;
		if (CMFSTATUS.equals(name)) return true;
		if (CMFSTATUSCHGREASON.equals(name)) return true;
		if (CONNECTREASON.equals(name)) return true;
		if (CONTACT.equals(name)) return true;
		if (CONTRACTDISCOUNT.equals(name)) return true;
		if (CORRIDOR.equals(name)) return true;
		if (CORRIDORRATEBANDOVERRIDE.equals(name)) return true;
		if (CORRIDORRATEOVERRIDE.equals(name)) return true;
		if (CREDITCARD.equals(name)) return true;
		if (CREDITCARDTYPECODE.equals(name)) return true;
		if (CSR.equals(name)) return true;
		if (CSRACCOUNTSEGMENT.equals(name)) return true;
		if (CSRGROUPAMOUNT.equals(name)) return true;
		if (CSRGROUPFUNCTION.equals(name)) return true;
		if (CUSTOMERDOCUMENT.equals(name)) return true;
		if (CUSTOMERDTSERVER.equals(name)) return true;
		if (CUSTOMERDTURL.equals(name)) return true;
		if (CUSTOMERSERVICECENTER.equals(name)) return true;
		if (DEPOSIT.equals(name)) return true;
		if (DEPOSITTYPE.equals(name)) return true;
		if (DISCREASON.equals(name)) return true;
		if (DOCUMENTTYPEREF.equals(name)) return true;
		if (EARLYTERMINATIONCHARGE.equals(name)) return true;
		if (EFTRESPONSECODE.equals(name)) return true;
		if (EFTTRANSACTION.equals(name)) return true;
		if (ENHANCEDNOTE.equals(name)) return true;
		if (EXCHANGERATECLASS.equals(name)) return true;
		if (EXTENDEDDATAASSOCIATION.equals(name)) return true;
		if (EXTENDEDDATAENUMERATION.equals(name)) return true;
		if (EXTENDEDDATALOCATE.equals(name)) return true;
		if (EXTENDEDDATAPARAM.equals(name)) return true;
		if (EXTENDEDDATAPARAMTYPE.equals(name)) return true;
		if (EXTERNALIDACCTMAP.equals(name)) return true;
		if (EXTERNALIDHQGROUPSMAP.equals(name)) return true;
		if (FRANCHISECODE.equals(name)) return true;
		if (GENDERTYPE.equals(name)) return true;
		if (GENERICENUMERATION.equals(name)) return true;
		if (GEOCODE.equals(name)) return true;
		if (GLOBALACCOUNTBALANCES.equals(name)) return true;
		if (GLOBALCONTRACT.equals(name)) return true;
		if (GLOBALOPENITEMIDMAP.equals(name)) return true;
		if (GROUP.equals(name)) return true;
		if (GROUPLOCATE.equals(name)) return true;
		if (GROUPMEMBER.equals(name)) return true;
		if (GUIINDICATOR.equals(name)) return true;
		if (HISTORICALCONTRIBUTION.equals(name)) return true;
		if (HISTORICALCONTRIBUTIONTAX.equals(name)) return true;
		if (HISTORICALTHRESHOLDS.equals(name)) return true;
		if (HQCONTRACTUNITCR.equals(name)) return true;
		if (HQGROUPCONTRACTS.equals(name)) return true;
		if (HQGROUPCORRIDOR.equals(name)) return true;
		if (HQGROUPMEMBERS.equals(name)) return true;
		if (HQGROUPPRODUCT.equals(name)) return true;
		if (HQGROUPS.equals(name)) return true;
		if (HQGROUPUSAGEREDIRECTMAP.equals(name)) return true;
		if (INTERIMBILL.equals(name)) return true;
		if (INVOICE.equals(name)) return true;
		if (INVOICEDETAIL.equals(name)) return true;
		if (INVOICEDETAILBULKADJUSTMENT.equals(name)) return true;
		if (LATEFEERATEOVERRIDES.equals(name)) return true;
		if (LBXPAYMENTTYPE.equals(name)) return true;
		if (MULTILINESADJ.equals(name)) return true;
		if (NETACTION.equals(name)) return true;
		if (NOTE.equals(name)) return true;
		if (NOTECODE.equals(name)) return true;
		if (NOTETEXT.equals(name)) return true;
		if (OPENITEM.equals(name)) return true;
		if (OPENITEMIDMAP.equals(name)) return true;
		if (ORDERQUOTE.equals(name)) return true;
		if (OVERRIDEDISCOUNTRATE.equals(name)) return true;
		if (OVERRIDEUSAGECREDITRATE.equals(name)) return true;
		if (OWNINGCOSTCENTER.equals(name)) return true;
		if (PACKAGECOMPONENTDEF.equals(name)) return true;
		if (PAYMENT.equals(name)) return true;
		if (PAYMENTDISTRIBUTION.equals(name)) return true;
		if (PAYMENTMERCHANTID.equals(name)) return true;
		if (PAYMENTMERCHANTIDASSIGN.equals(name)) return true;
		if (PAYMENTPROFILE.equals(name)) return true;
		if (PAYMENTTRANS.equals(name)) return true;
		if (PAYMENTTYPE.equals(name)) return true;
		if (PREPAYMENT.equals(name)) return true;
		if (PREPAYMENTDISTRIBUTION.equals(name)) return true;
		if (PRIVACYLEVEL.equals(name)) return true;
		if (PRODUCTCATALOG.equals(name)) return true;
		if (PRODUCTCHARGEMAP.equals(name)) return true;
		if (PRODUCTRATEKEY.equals(name)) return true;
		if (PRODUCTRATEOVERRIDE.equals(name)) return true;
		if (PRODUCTRCRATE.equals(name)) return true;
		if (REFINANCEPLAN.equals(name)) return true;
		if (REFUND.equals(name)) return true;
		if (REFUNDREASON.equals(name)) return true;
		if (REGULATORYID.equals(name)) return true;
		if (REVRCVCOSTCENTER.equals(name)) return true;
		if (REVERSEBULKADJUSTMENT.equals(name)) return true;
		if (REWARDBALANCE.equals(name)) return true;
		if (REWARDBALANCEENTITYMAPPING.equals(name)) return true;
		if (RTPAYMENTRESPONSE.equals(name)) return true;
		if (SALESCHANNEL.equals(name)) return true;
		if (SECURITYACI.equals(name)) return true;
		if (SECURITYRESOURCE.equals(name)) return true;
		if (SECURITYROLE.equals(name)) return true;
		if (SECURITYUSER.equals(name)) return true;
		if (SERVER.equals(name)) return true;
		if (SERVERCATEGORY.equals(name)) return true;
		if (SERVERDEFINITION.equals(name)) return true;
		if (SERVICECENTER.equals(name)) return true;
		if (SERVICECENTERTYPE.equals(name)) return true;
		if (SERVICEMASTERGROUP.equals(name)) return true;
		if (SERVICEPRICINGPLAN.equals(name)) return true;
		if (SERVICEZONE.equals(name)) return true;
		if (SLAMEASUREMENTDATA.equals(name)) return true;
		if (STATUSREASONMAP.equals(name)) return true;
		if (TAXABANDONED.equals(name)) return true;
		if (TAXASSIGNMENT.equals(name)) return true;
		if (TAXEXEMPTION.equals(name)) return true;
		if (TAXPACKAGEINST.equals(name)) return true;
		if (TAXRATESVAT.equals(name)) return true;
		if (TAXSTATUS.equals(name)) return true;
		if (TAXTYPECOMM.equals(name)) return true;
		if (TIMEZONE.equals(name)) return true;
		if (TRANSSOURCETYPE.equals(name)) return true;
		if (TRANSFERREASON.equals(name)) return true;
		if (UNAPPLIEDPAYMENT.equals(name)) return true;
		if (UNBILLEDUSAGE.equals(name)) return true;
		if (UNBILLEDUSAGEBULKADJUSTMENT.equals(name)) return true;
		if (USAGECREDITRATE.equals(name)) return true;
		if (VIPCODE.equals(name)) return true;
		if (VOUCHERDEFINITIONS.equals(name)) return true;
		if (VOUCHERHISTORY.equals(name)) return true;
		if (VOUCHERLOCATION.equals(name)) return true;
		if (VOUCHERSTATUS.equals(name)) return true;
		if (VOUCHERSTATUSINFO.equals(name)) return true;
		if (VOUCHERSTATUSMOVEMENT.equals(name)) return true;
		if (VOUCHERTYPES.equals(name)) return true;
		if (WRITEOFF.equals(name)) return true;
		return false;
	}
	public BaliInterface get (String name) throws InterfaceFactoryException {
		if (ABIAUTOPAYCMFMAP.equals(name)) return getAbiAutoPayCmfMapInterface();
		if (ABIBILLMESSAGES.equals(name)) return getAbiBillMessagesInterface();
		if (ABIBILLINGSTATISTICS.equals(name)) return getAbiBillingStatisticsInterface();
		if (ABINRCDUC.equals(name)) return getAbiNrcDucInterface();
		if (ACCOUNT.equals(name)) return getAccountInterface();
		if (ACCOUNTABISOURCE.equals(name)) return getAccountAbiSourceInterface();
		if (ACCOUNTBALANCES.equals(name)) return getAccountBalancesInterface();
		if (ACCOUNTBONUSPOINTBALANCE.equals(name)) return getAccountBonusPointBalanceInterface();
		if (ACCOUNTBONUSPOINTTRANSACTION.equals(name)) return getAccountBonusPointTransactionInterface();
		if (ACCOUNTCODE.equals(name)) return getAccountCodeInterface();
		if (ACCOUNTCODEGROUP.equals(name)) return getAccountCodeGroupInterface();
		if (ACCOUNTHQCONTRACT.equals(name)) return getAccountHqContractInterface();
		if (ACCOUNTID.equals(name)) return getAccountIdInterface();
		if (ACCOUNTINSERT.equals(name)) return getAccountInsertInterface();
		if (ACCOUNTLOCATE.equals(name)) return getAccountLocateInterface();
		if (ACCOUNTMESSAGE.equals(name)) return getAccountMessageInterface();
		if (ACCOUNTSEGMENT.equals(name)) return getAccountSegmentInterface();
		if (ACCOUNTSEGMENTMAP.equals(name)) return getAccountSegmentMapInterface();
		if (ACCOUNTSTATUS.equals(name)) return getAccountStatusInterface();
		if (ADJUSTMENT.equals(name)) return getAdjustmentInterface();
		if (ADJUSTMENTREASON.equals(name)) return getAdjustmentReasonInterface();
		if (ADJUSTMENTTAX.equals(name)) return getAdjustmentTaxInterface();
		if (ADJUSTMENTTYPE.equals(name)) return getAdjustmentTypeInterface();
		if (AXRTCOUNTRYCODEMAP.equals(name)) return getAxrtCountryCodeMapInterface();
		if (AXRTCURRCODEMAP.equals(name)) return getAxrtCurrCodeMapInterface();
		if (AXRTCURRENCYCODEMAP.equals(name)) return getAxrtCurrencyCodeMapInterface();
		if (AXRTPAYMENT.equals(name)) return getAxrtPaymentInterface();
		if (AXRTPAYMENTMERCHANT.equals(name)) return getAxrtPaymentMerchantInterface();
		if (AXRTPAYMENTPROFILE.equals(name)) return getAxrtPaymentProfileInterface();
		if (AXRTPAYMENTTRANS.equals(name)) return getAxrtPaymentTransInterface();
		if (BALANCELINEITEM.equals(name)) return getBalanceLineItemInterface();
		if (BALANCELINEITEMBULKADJUSTMENT.equals(name)) return getBalanceLineItemBulkAdjustmentInterface();
		if (BALANCEXFERDIFF.equals(name)) return getBalanceXferDiffInterface();
		if (BAMERRORCODE.equals(name)) return getBamErrorCodeInterface();
		if (BILLCYCLE.equals(name)) return getBillCycleInterface();
		if (BILLDISPATCHMETHOD.equals(name)) return getBillDispatchMethodInterface();
		if (BILLIMAGE.equals(name)) return getBillImageInterface();
		if (BILLIMAGEPAGE.equals(name)) return getBillImagePageInterface();
		if (BILLINSERTGROUP.equals(name)) return getBillInsertGroupInterface();
		if (BILLINSERTGROUPMAP.equals(name)) return getBillInsertGroupMapInterface();
		if (BILLMESSAGEGROUP.equals(name)) return getBillMessageGroupInterface();
		if (BILLMESSAGEGROUPMAP.equals(name)) return getBillMessageGroupMapInterface();
		if (BILLEDUSAGE.equals(name)) return getBilledUsageInterface();
		if (BILLEDUSAGEBULKADJUSTMENT.equals(name)) return getBilledUsageBulkAdjustmentInterface();
		if (BONUSPOINTRATE.equals(name)) return getBonusPointRateInterface();
		if (BONUSPOINTTRANSTYPE.equals(name)) return getBonusPointTransTypeInterface();
		if (CCAUDITLOG.equals(name)) return getCcAuditLogInterface();
		if (CDRDATADUC.equals(name)) return getCdrDataDucInterface();
		if (CHARGEDISTRIBPERCENT.equals(name)) return getChargeDistribPercentInterface();
		if (CLEARINGHOUSE.equals(name)) return getClearingHouseInterface();
		if (CLEARINGHOUSECONTACTS.equals(name)) return getClearingHouseContactsInterface();
		if (CLEARINGHOUSEINFO.equals(name)) return getClearingHouseInfoInterface();
		if (CMFBONUSPOINT.equals(name)) return getCmfBonusPointInterface();
		if (CMFPACKAGEOVERRIDES.equals(name)) return getCmfPackageOverridesInterface();
		if (CMFREWARDBALANCEDETAIL.equals(name)) return getCmfRewardBalanceDetailInterface();
		if (CMFSTATUS.equals(name)) return getCmfStatusInterface();
		if (CMFSTATUSCHGREASON.equals(name)) return getCmfStatusChgReasonInterface();
		if (CONNECTREASON.equals(name)) return getConnectReasonInterface();
		if (CONTACT.equals(name)) return getContactInterface();
		if (CONTRACTDISCOUNT.equals(name)) return getContractDiscountInterface();
		if (CORRIDOR.equals(name)) return getCorridorInterface();
		if (CORRIDORRATEBANDOVERRIDE.equals(name)) return getCorridorRateBandOverrideInterface();
		if (CORRIDORRATEOVERRIDE.equals(name)) return getCorridorRateOverrideInterface();
		if (CREDITCARD.equals(name)) return getCreditCardInterface();
		if (CREDITCARDTYPECODE.equals(name)) return getCreditCardTypeCodeInterface();
		if (CSR.equals(name)) return getCsrInterface();
		if (CSRACCOUNTSEGMENT.equals(name)) return getCsrAccountSegmentInterface();
		if (CSRGROUPAMOUNT.equals(name)) return getCsrGroupAmountInterface();
		if (CSRGROUPFUNCTION.equals(name)) return getCsrGroupFunctionInterface();
		if (CUSTOMERDOCUMENT.equals(name)) return getCustomerDocumentInterface();
		if (CUSTOMERDTSERVER.equals(name)) return getCustomerDtServerInterface();
		if (CUSTOMERDTURL.equals(name)) return getCustomerDtUrlInterface();
		if (CUSTOMERSERVICECENTER.equals(name)) return getCustomerServiceCenterInterface();
		if (DEPOSIT.equals(name)) return getDepositInterface();
		if (DEPOSITTYPE.equals(name)) return getDepositTypeInterface();
		if (DISCREASON.equals(name)) return getDiscReasonInterface();
		if (DOCUMENTTYPEREF.equals(name)) return getDocumentTypeRefInterface();
		if (EARLYTERMINATIONCHARGE.equals(name)) return getEarlyTerminationChargeInterface();
		if (EFTRESPONSECODE.equals(name)) return getEftResponseCodeInterface();
		if (EFTTRANSACTION.equals(name)) return getEftTransactionInterface();
		if (ENHANCEDNOTE.equals(name)) return getEnhancedNoteInterface();
		if (EXCHANGERATECLASS.equals(name)) return getExchangeRateClassInterface();
		if (EXTENDEDDATAASSOCIATION.equals(name)) return getExtendedDataAssociationInterface();
		if (EXTENDEDDATAENUMERATION.equals(name)) return getExtendedDataEnumerationInterface();
		if (EXTENDEDDATALOCATE.equals(name)) return getExtendedDataLocateInterface();
		if (EXTENDEDDATAPARAM.equals(name)) return getExtendedDataParamInterface();
		if (EXTENDEDDATAPARAMTYPE.equals(name)) return getExtendedDataParamTypeInterface();
		if (EXTERNALIDACCTMAP.equals(name)) return getExternalIdAcctMapInterface();
		if (EXTERNALIDHQGROUPSMAP.equals(name)) return getExternalIdHqGroupsMapInterface();
		if (FRANCHISECODE.equals(name)) return getFranchiseCodeInterface();
		if (GENDERTYPE.equals(name)) return getGenderTypeInterface();
		if (GENERICENUMERATION.equals(name)) return getGenericEnumerationInterface();
		if (GEOCODE.equals(name)) return getGeocodeInterface();
		if (GLOBALACCOUNTBALANCES.equals(name)) return getGlobalAccountBalancesInterface();
		if (GLOBALCONTRACT.equals(name)) return getGlobalContractInterface();
		if (GLOBALOPENITEMIDMAP.equals(name)) return getGlobalOpenItemIdMapInterface();
		if (GROUP.equals(name)) return getGroupInterface();
		if (GROUPLOCATE.equals(name)) return getGroupLocateInterface();
		if (GROUPMEMBER.equals(name)) return getGroupMemberInterface();
		if (GUIINDICATOR.equals(name)) return getGuiIndicatorInterface();
		if (HISTORICALCONTRIBUTION.equals(name)) return getHistoricalContributionInterface();
		if (HISTORICALCONTRIBUTIONTAX.equals(name)) return getHistoricalContributionTaxInterface();
		if (HISTORICALTHRESHOLDS.equals(name)) return getHistoricalThresholdsInterface();
		if (HQCONTRACTUNITCR.equals(name)) return getHqContractUnitCrInterface();
		if (HQGROUPCONTRACTS.equals(name)) return getHqGroupContractsInterface();
		if (HQGROUPCORRIDOR.equals(name)) return getHqGroupCorridorInterface();
		if (HQGROUPMEMBERS.equals(name)) return getHqGroupMembersInterface();
		if (HQGROUPPRODUCT.equals(name)) return getHqGroupProductInterface();
		if (HQGROUPS.equals(name)) return getHqGroupsInterface();
		if (HQGROUPUSAGEREDIRECTMAP.equals(name)) return getHqgroupUsageRedirectMapInterface();
		if (INTERIMBILL.equals(name)) return getInterimBillInterface();
		if (INVOICE.equals(name)) return getInvoiceInterface();
		if (INVOICEDETAIL.equals(name)) return getInvoiceDetailInterface();
		if (INVOICEDETAILBULKADJUSTMENT.equals(name)) return getInvoiceDetailBulkAdjustmentInterface();
		if (LATEFEERATEOVERRIDES.equals(name)) return getLateFeeRateOverridesInterface();
		if (LBXPAYMENTTYPE.equals(name)) return getLbxPaymentTypeInterface();
		if (MULTILINESADJ.equals(name)) return getMultiLinesAdjInterface();
		if (NETACTION.equals(name)) return getNetActionInterface();
		if (NOTE.equals(name)) return getNoteInterface();
		if (NOTECODE.equals(name)) return getNoteCodeInterface();
		if (NOTETEXT.equals(name)) return getNoteTextInterface();
		if (OPENITEM.equals(name)) return getOpenItemInterface();
		if (OPENITEMIDMAP.equals(name)) return getOpenItemIdMapInterface();
		if (ORDERQUOTE.equals(name)) return getOrderQuoteInterface();
		if (OVERRIDEDISCOUNTRATE.equals(name)) return getOverrideDiscountRateInterface();
		if (OVERRIDEUSAGECREDITRATE.equals(name)) return getOverrideUsageCreditRateInterface();
		if (OWNINGCOSTCENTER.equals(name)) return getOwningCostCenterInterface();
		if (PACKAGECOMPONENTDEF.equals(name)) return getPackageComponentDefInterface();
		if (PAYMENT.equals(name)) return getPaymentInterface();
		if (PAYMENTDISTRIBUTION.equals(name)) return getPaymentDistributionInterface();
		if (PAYMENTMERCHANTID.equals(name)) return getPaymentMerchantIdInterface();
		if (PAYMENTMERCHANTIDASSIGN.equals(name)) return getPaymentMerchantIdAssignInterface();
		if (PAYMENTPROFILE.equals(name)) return getPaymentProfileInterface();
		if (PAYMENTTRANS.equals(name)) return getPaymentTransInterface();
		if (PAYMENTTYPE.equals(name)) return getPaymentTypeInterface();
		if (PREPAYMENT.equals(name)) return getPrepaymentInterface();
		if (PREPAYMENTDISTRIBUTION.equals(name)) return getPrepaymentDistributionInterface();
		if (PRIVACYLEVEL.equals(name)) return getPrivacyLevelInterface();
		if (PRODUCTCATALOG.equals(name)) return getProductCatalogInterface();
		if (PRODUCTCHARGEMAP.equals(name)) return getProductChargeMapInterface();
		if (PRODUCTRATEKEY.equals(name)) return getProductRateKeyInterface();
		if (PRODUCTRATEOVERRIDE.equals(name)) return getProductRateOverrideInterface();
		if (PRODUCTRCRATE.equals(name)) return getProductRcRateInterface();
		if (REFINANCEPLAN.equals(name)) return getRefinancePlanInterface();
		if (REFUND.equals(name)) return getRefundInterface();
		if (REFUNDREASON.equals(name)) return getRefundReasonInterface();
		if (REGULATORYID.equals(name)) return getRegulatoryIdInterface();
		if (REVRCVCOSTCENTER.equals(name)) return getRevRcvCostCenterInterface();
		if (REVERSEBULKADJUSTMENT.equals(name)) return getReverseBulkAdjustmentInterface();
		if (REWARDBALANCE.equals(name)) return getRewardBalanceInterface();
		if (REWARDBALANCEENTITYMAPPING.equals(name)) return getRewardBalanceEntityMappingInterface();
		if (RTPAYMENTRESPONSE.equals(name)) return getRtPaymentResponseInterface();
		if (SALESCHANNEL.equals(name)) return getSalesChannelInterface();
		if (SECURITYACI.equals(name)) return getSecurityAciInterface();
		if (SECURITYRESOURCE.equals(name)) return getSecurityResourceInterface();
		if (SECURITYROLE.equals(name)) return getSecurityRoleInterface();
		if (SECURITYUSER.equals(name)) return getSecurityUserInterface();
		if (SERVER.equals(name)) return getServerInterface();
		if (SERVERCATEGORY.equals(name)) return getServerCategoryInterface();
		if (SERVERDEFINITION.equals(name)) return getServerDefinitionInterface();
		if (SERVICECENTER.equals(name)) return getServiceCenterInterface();
		if (SERVICECENTERTYPE.equals(name)) return getServiceCenterTypeInterface();
		if (SERVICEMASTERGROUP.equals(name)) return getServiceMasterGroupInterface();
		if (SERVICEPRICINGPLAN.equals(name)) return getServicePricingPlanInterface();
		if (SERVICEZONE.equals(name)) return getServiceZoneInterface();
		if (SLAMEASUREMENTDATA.equals(name)) return getSlaMeasurementDataInterface();
		if (STATUSREASONMAP.equals(name)) return getStatusReasonMapInterface();
		if (TAXABANDONED.equals(name)) return getTaxAbandonedInterface();
		if (TAXASSIGNMENT.equals(name)) return getTaxAssignmentInterface();
		if (TAXEXEMPTION.equals(name)) return getTaxExemptionInterface();
		if (TAXPACKAGEINST.equals(name)) return getTaxPackageInstInterface();
		if (TAXRATESVAT.equals(name)) return getTaxRatesVatInterface();
		if (TAXSTATUS.equals(name)) return getTaxStatusInterface();
		if (TAXTYPECOMM.equals(name)) return getTaxTypeCommInterface();
		if (TIMEZONE.equals(name)) return getTimezoneInterface();
		if (TRANSSOURCETYPE.equals(name)) return getTransSourceTypeInterface();
		if (TRANSFERREASON.equals(name)) return getTransferReasonInterface();
		if (UNAPPLIEDPAYMENT.equals(name)) return getUnappliedPaymentInterface();
		if (UNBILLEDUSAGE.equals(name)) return getUnbilledUsageInterface();
		if (UNBILLEDUSAGEBULKADJUSTMENT.equals(name)) return getUnbilledUsageBulkAdjustmentInterface();
		if (USAGECREDITRATE.equals(name)) return getUsageCreditRateInterface();
		if (VIPCODE.equals(name)) return getVipCodeInterface();
		if (VOUCHERDEFINITIONS.equals(name)) return getVoucherDefinitionsInterface();
		if (VOUCHERHISTORY.equals(name)) return getVoucherHistoryInterface();
		if (VOUCHERLOCATION.equals(name)) return getVoucherLocationInterface();
		if (VOUCHERSTATUS.equals(name)) return getVoucherStatusInterface();
		if (VOUCHERSTATUSINFO.equals(name)) return getVoucherStatusInfoInterface();
		if (VOUCHERSTATUSMOVEMENT.equals(name)) return getVoucherStatusMovementInterface();
		if (VOUCHERTYPES.equals(name)) return getVoucherTypesInterface();
		if (WRITEOFF.equals(name)) return getWriteoffInterface();
		throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for name = "+name);
	}
	public BaliInterface get (String name, String app, String type) throws InterfaceFactoryException {
		if (ABIAUTOPAYCMFMAP.equals(name)) return getAbiAutoPayCmfMapInterface(app, type);
		if (ABIBILLMESSAGES.equals(name)) return getAbiBillMessagesInterface(app, type);
		if (ABIBILLINGSTATISTICS.equals(name)) return getAbiBillingStatisticsInterface(app, type);
		if (ABINRCDUC.equals(name)) return getAbiNrcDucInterface(app, type);
		if (ACCOUNT.equals(name)) return getAccountInterface(app, type);
		if (ACCOUNTABISOURCE.equals(name)) return getAccountAbiSourceInterface(app, type);
		if (ACCOUNTBALANCES.equals(name)) return getAccountBalancesInterface(app, type);
		if (ACCOUNTBONUSPOINTBALANCE.equals(name)) return getAccountBonusPointBalanceInterface(app, type);
		if (ACCOUNTBONUSPOINTTRANSACTION.equals(name)) return getAccountBonusPointTransactionInterface(app, type);
		if (ACCOUNTCODE.equals(name)) return getAccountCodeInterface(app, type);
		if (ACCOUNTCODEGROUP.equals(name)) return getAccountCodeGroupInterface(app, type);
		if (ACCOUNTHQCONTRACT.equals(name)) return getAccountHqContractInterface(app, type);
		if (ACCOUNTID.equals(name)) return getAccountIdInterface(app, type);
		if (ACCOUNTINSERT.equals(name)) return getAccountInsertInterface(app, type);
		if (ACCOUNTLOCATE.equals(name)) return getAccountLocateInterface(app, type);
		if (ACCOUNTMESSAGE.equals(name)) return getAccountMessageInterface(app, type);
		if (ACCOUNTSEGMENT.equals(name)) return getAccountSegmentInterface(app, type);
		if (ACCOUNTSEGMENTMAP.equals(name)) return getAccountSegmentMapInterface(app, type);
		if (ACCOUNTSTATUS.equals(name)) return getAccountStatusInterface(app, type);
		if (ADJUSTMENT.equals(name)) return getAdjustmentInterface(app, type);
		if (ADJUSTMENTREASON.equals(name)) return getAdjustmentReasonInterface(app, type);
		if (ADJUSTMENTTAX.equals(name)) return getAdjustmentTaxInterface(app, type);
		if (ADJUSTMENTTYPE.equals(name)) return getAdjustmentTypeInterface(app, type);
		if (AXRTCOUNTRYCODEMAP.equals(name)) return getAxrtCountryCodeMapInterface(app, type);
		if (AXRTCURRCODEMAP.equals(name)) return getAxrtCurrCodeMapInterface(app, type);
		if (AXRTCURRENCYCODEMAP.equals(name)) return getAxrtCurrencyCodeMapInterface(app, type);
		if (AXRTPAYMENT.equals(name)) return getAxrtPaymentInterface(app, type);
		if (AXRTPAYMENTMERCHANT.equals(name)) return getAxrtPaymentMerchantInterface(app, type);
		if (AXRTPAYMENTPROFILE.equals(name)) return getAxrtPaymentProfileInterface(app, type);
		if (AXRTPAYMENTTRANS.equals(name)) return getAxrtPaymentTransInterface(app, type);
		if (BALANCELINEITEM.equals(name)) return getBalanceLineItemInterface(app, type);
		if (BALANCELINEITEMBULKADJUSTMENT.equals(name)) return getBalanceLineItemBulkAdjustmentInterface(app, type);
		if (BALANCEXFERDIFF.equals(name)) return getBalanceXferDiffInterface(app, type);
		if (BAMERRORCODE.equals(name)) return getBamErrorCodeInterface(app, type);
		if (BILLCYCLE.equals(name)) return getBillCycleInterface(app, type);
		if (BILLDISPATCHMETHOD.equals(name)) return getBillDispatchMethodInterface(app, type);
		if (BILLIMAGE.equals(name)) return getBillImageInterface(app, type);
		if (BILLIMAGEPAGE.equals(name)) return getBillImagePageInterface(app, type);
		if (BILLINSERTGROUP.equals(name)) return getBillInsertGroupInterface(app, type);
		if (BILLINSERTGROUPMAP.equals(name)) return getBillInsertGroupMapInterface(app, type);
		if (BILLMESSAGEGROUP.equals(name)) return getBillMessageGroupInterface(app, type);
		if (BILLMESSAGEGROUPMAP.equals(name)) return getBillMessageGroupMapInterface(app, type);
		if (BILLEDUSAGE.equals(name)) return getBilledUsageInterface(app, type);
		if (BILLEDUSAGEBULKADJUSTMENT.equals(name)) return getBilledUsageBulkAdjustmentInterface(app, type);
		if (BONUSPOINTRATE.equals(name)) return getBonusPointRateInterface(app, type);
		if (BONUSPOINTTRANSTYPE.equals(name)) return getBonusPointTransTypeInterface(app, type);
		if (CCAUDITLOG.equals(name)) return getCcAuditLogInterface(app, type);
		if (CDRDATADUC.equals(name)) return getCdrDataDucInterface(app, type);
		if (CHARGEDISTRIBPERCENT.equals(name)) return getChargeDistribPercentInterface(app, type);
		if (CLEARINGHOUSE.equals(name)) return getClearingHouseInterface(app, type);
		if (CLEARINGHOUSECONTACTS.equals(name)) return getClearingHouseContactsInterface(app, type);
		if (CLEARINGHOUSEINFO.equals(name)) return getClearingHouseInfoInterface(app, type);
		if (CMFBONUSPOINT.equals(name)) return getCmfBonusPointInterface(app, type);
		if (CMFPACKAGEOVERRIDES.equals(name)) return getCmfPackageOverridesInterface(app, type);
		if (CMFREWARDBALANCEDETAIL.equals(name)) return getCmfRewardBalanceDetailInterface(app, type);
		if (CMFSTATUS.equals(name)) return getCmfStatusInterface(app, type);
		if (CMFSTATUSCHGREASON.equals(name)) return getCmfStatusChgReasonInterface(app, type);
		if (CONNECTREASON.equals(name)) return getConnectReasonInterface(app, type);
		if (CONTACT.equals(name)) return getContactInterface(app, type);
		if (CONTRACTDISCOUNT.equals(name)) return getContractDiscountInterface(app, type);
		if (CORRIDOR.equals(name)) return getCorridorInterface(app, type);
		if (CORRIDORRATEBANDOVERRIDE.equals(name)) return getCorridorRateBandOverrideInterface(app, type);
		if (CORRIDORRATEOVERRIDE.equals(name)) return getCorridorRateOverrideInterface(app, type);
		if (CREDITCARD.equals(name)) return getCreditCardInterface(app, type);
		if (CREDITCARDTYPECODE.equals(name)) return getCreditCardTypeCodeInterface(app, type);
		if (CSR.equals(name)) return getCsrInterface(app, type);
		if (CSRACCOUNTSEGMENT.equals(name)) return getCsrAccountSegmentInterface(app, type);
		if (CSRGROUPAMOUNT.equals(name)) return getCsrGroupAmountInterface(app, type);
		if (CSRGROUPFUNCTION.equals(name)) return getCsrGroupFunctionInterface(app, type);
		if (CUSTOMERDOCUMENT.equals(name)) return getCustomerDocumentInterface(app, type);
		if (CUSTOMERDTSERVER.equals(name)) return getCustomerDtServerInterface(app, type);
		if (CUSTOMERDTURL.equals(name)) return getCustomerDtUrlInterface(app, type);
		if (CUSTOMERSERVICECENTER.equals(name)) return getCustomerServiceCenterInterface(app, type);
		if (DEPOSIT.equals(name)) return getDepositInterface(app, type);
		if (DEPOSITTYPE.equals(name)) return getDepositTypeInterface(app, type);
		if (DISCREASON.equals(name)) return getDiscReasonInterface(app, type);
		if (DOCUMENTTYPEREF.equals(name)) return getDocumentTypeRefInterface(app, type);
		if (EARLYTERMINATIONCHARGE.equals(name)) return getEarlyTerminationChargeInterface(app, type);
		if (EFTRESPONSECODE.equals(name)) return getEftResponseCodeInterface(app, type);
		if (EFTTRANSACTION.equals(name)) return getEftTransactionInterface(app, type);
		if (ENHANCEDNOTE.equals(name)) return getEnhancedNoteInterface(app, type);
		if (EXCHANGERATECLASS.equals(name)) return getExchangeRateClassInterface(app, type);
		if (EXTENDEDDATAASSOCIATION.equals(name)) return getExtendedDataAssociationInterface(app, type);
		if (EXTENDEDDATAENUMERATION.equals(name)) return getExtendedDataEnumerationInterface(app, type);
		if (EXTENDEDDATALOCATE.equals(name)) return getExtendedDataLocateInterface(app, type);
		if (EXTENDEDDATAPARAM.equals(name)) return getExtendedDataParamInterface(app, type);
		if (EXTENDEDDATAPARAMTYPE.equals(name)) return getExtendedDataParamTypeInterface(app, type);
		if (EXTERNALIDACCTMAP.equals(name)) return getExternalIdAcctMapInterface(app, type);
		if (EXTERNALIDHQGROUPSMAP.equals(name)) return getExternalIdHqGroupsMapInterface(app, type);
		if (FRANCHISECODE.equals(name)) return getFranchiseCodeInterface(app, type);
		if (GENDERTYPE.equals(name)) return getGenderTypeInterface(app, type);
		if (GENERICENUMERATION.equals(name)) return getGenericEnumerationInterface(app, type);
		if (GEOCODE.equals(name)) return getGeocodeInterface(app, type);
		if (GLOBALACCOUNTBALANCES.equals(name)) return getGlobalAccountBalancesInterface(app, type);
		if (GLOBALCONTRACT.equals(name)) return getGlobalContractInterface(app, type);
		if (GLOBALOPENITEMIDMAP.equals(name)) return getGlobalOpenItemIdMapInterface(app, type);
		if (GROUP.equals(name)) return getGroupInterface(app, type);
		if (GROUPLOCATE.equals(name)) return getGroupLocateInterface(app, type);
		if (GROUPMEMBER.equals(name)) return getGroupMemberInterface(app, type);
		if (GUIINDICATOR.equals(name)) return getGuiIndicatorInterface(app, type);
		if (HISTORICALCONTRIBUTION.equals(name)) return getHistoricalContributionInterface(app, type);
		if (HISTORICALCONTRIBUTIONTAX.equals(name)) return getHistoricalContributionTaxInterface(app, type);
		if (HISTORICALTHRESHOLDS.equals(name)) return getHistoricalThresholdsInterface(app, type);
		if (HQCONTRACTUNITCR.equals(name)) return getHqContractUnitCrInterface(app, type);
		if (HQGROUPCONTRACTS.equals(name)) return getHqGroupContractsInterface(app, type);
		if (HQGROUPCORRIDOR.equals(name)) return getHqGroupCorridorInterface(app, type);
		if (HQGROUPMEMBERS.equals(name)) return getHqGroupMembersInterface(app, type);
		if (HQGROUPPRODUCT.equals(name)) return getHqGroupProductInterface(app, type);
		if (HQGROUPS.equals(name)) return getHqGroupsInterface(app, type);
		if (HQGROUPUSAGEREDIRECTMAP.equals(name)) return getHqgroupUsageRedirectMapInterface(app, type);
		if (INTERIMBILL.equals(name)) return getInterimBillInterface(app, type);
		if (INVOICE.equals(name)) return getInvoiceInterface(app, type);
		if (INVOICEDETAIL.equals(name)) return getInvoiceDetailInterface(app, type);
		if (INVOICEDETAILBULKADJUSTMENT.equals(name)) return getInvoiceDetailBulkAdjustmentInterface(app, type);
		if (LATEFEERATEOVERRIDES.equals(name)) return getLateFeeRateOverridesInterface(app, type);
		if (LBXPAYMENTTYPE.equals(name)) return getLbxPaymentTypeInterface(app, type);
		if (MULTILINESADJ.equals(name)) return getMultiLinesAdjInterface(app, type);
		if (NETACTION.equals(name)) return getNetActionInterface(app, type);
		if (NOTE.equals(name)) return getNoteInterface(app, type);
		if (NOTECODE.equals(name)) return getNoteCodeInterface(app, type);
		if (NOTETEXT.equals(name)) return getNoteTextInterface(app, type);
		if (OPENITEM.equals(name)) return getOpenItemInterface(app, type);
		if (OPENITEMIDMAP.equals(name)) return getOpenItemIdMapInterface(app, type);
		if (ORDERQUOTE.equals(name)) return getOrderQuoteInterface(app, type);
		if (OVERRIDEDISCOUNTRATE.equals(name)) return getOverrideDiscountRateInterface(app, type);
		if (OVERRIDEUSAGECREDITRATE.equals(name)) return getOverrideUsageCreditRateInterface(app, type);
		if (OWNINGCOSTCENTER.equals(name)) return getOwningCostCenterInterface(app, type);
		if (PACKAGECOMPONENTDEF.equals(name)) return getPackageComponentDefInterface(app, type);
		if (PAYMENT.equals(name)) return getPaymentInterface(app, type);
		if (PAYMENTDISTRIBUTION.equals(name)) return getPaymentDistributionInterface(app, type);
		if (PAYMENTMERCHANTID.equals(name)) return getPaymentMerchantIdInterface(app, type);
		if (PAYMENTMERCHANTIDASSIGN.equals(name)) return getPaymentMerchantIdAssignInterface(app, type);
		if (PAYMENTPROFILE.equals(name)) return getPaymentProfileInterface(app, type);
		if (PAYMENTTRANS.equals(name)) return getPaymentTransInterface(app, type);
		if (PAYMENTTYPE.equals(name)) return getPaymentTypeInterface(app, type);
		if (PREPAYMENT.equals(name)) return getPrepaymentInterface(app, type);
		if (PREPAYMENTDISTRIBUTION.equals(name)) return getPrepaymentDistributionInterface(app, type);
		if (PRIVACYLEVEL.equals(name)) return getPrivacyLevelInterface(app, type);
		if (PRODUCTCATALOG.equals(name)) return getProductCatalogInterface(app, type);
		if (PRODUCTCHARGEMAP.equals(name)) return getProductChargeMapInterface(app, type);
		if (PRODUCTRATEKEY.equals(name)) return getProductRateKeyInterface(app, type);
		if (PRODUCTRATEOVERRIDE.equals(name)) return getProductRateOverrideInterface(app, type);
		if (PRODUCTRCRATE.equals(name)) return getProductRcRateInterface(app, type);
		if (REFINANCEPLAN.equals(name)) return getRefinancePlanInterface(app, type);
		if (REFUND.equals(name)) return getRefundInterface(app, type);
		if (REFUNDREASON.equals(name)) return getRefundReasonInterface(app, type);
		if (REGULATORYID.equals(name)) return getRegulatoryIdInterface(app, type);
		if (REVRCVCOSTCENTER.equals(name)) return getRevRcvCostCenterInterface(app, type);
		if (REVERSEBULKADJUSTMENT.equals(name)) return getReverseBulkAdjustmentInterface(app, type);
		if (REWARDBALANCE.equals(name)) return getRewardBalanceInterface(app, type);
		if (REWARDBALANCEENTITYMAPPING.equals(name)) return getRewardBalanceEntityMappingInterface(app, type);
		if (RTPAYMENTRESPONSE.equals(name)) return getRtPaymentResponseInterface(app, type);
		if (SALESCHANNEL.equals(name)) return getSalesChannelInterface(app, type);
		if (SECURITYACI.equals(name)) return getSecurityAciInterface(app, type);
		if (SECURITYRESOURCE.equals(name)) return getSecurityResourceInterface(app, type);
		if (SECURITYROLE.equals(name)) return getSecurityRoleInterface(app, type);
		if (SECURITYUSER.equals(name)) return getSecurityUserInterface(app, type);
		if (SERVER.equals(name)) return getServerInterface(app, type);
		if (SERVERCATEGORY.equals(name)) return getServerCategoryInterface(app, type);
		if (SERVERDEFINITION.equals(name)) return getServerDefinitionInterface(app, type);
		if (SERVICECENTER.equals(name)) return getServiceCenterInterface(app, type);
		if (SERVICECENTERTYPE.equals(name)) return getServiceCenterTypeInterface(app, type);
		if (SERVICEMASTERGROUP.equals(name)) return getServiceMasterGroupInterface(app, type);
		if (SERVICEPRICINGPLAN.equals(name)) return getServicePricingPlanInterface(app, type);
		if (SERVICEZONE.equals(name)) return getServiceZoneInterface(app, type);
		if (SLAMEASUREMENTDATA.equals(name)) return getSlaMeasurementDataInterface(app, type);
		if (STATUSREASONMAP.equals(name)) return getStatusReasonMapInterface(app, type);
		if (TAXABANDONED.equals(name)) return getTaxAbandonedInterface(app, type);
		if (TAXASSIGNMENT.equals(name)) return getTaxAssignmentInterface(app, type);
		if (TAXEXEMPTION.equals(name)) return getTaxExemptionInterface(app, type);
		if (TAXPACKAGEINST.equals(name)) return getTaxPackageInstInterface(app, type);
		if (TAXRATESVAT.equals(name)) return getTaxRatesVatInterface(app, type);
		if (TAXSTATUS.equals(name)) return getTaxStatusInterface(app, type);
		if (TAXTYPECOMM.equals(name)) return getTaxTypeCommInterface(app, type);
		if (TIMEZONE.equals(name)) return getTimezoneInterface(app, type);
		if (TRANSSOURCETYPE.equals(name)) return getTransSourceTypeInterface(app, type);
		if (TRANSFERREASON.equals(name)) return getTransferReasonInterface(app, type);
		if (UNAPPLIEDPAYMENT.equals(name)) return getUnappliedPaymentInterface(app, type);
		if (UNBILLEDUSAGE.equals(name)) return getUnbilledUsageInterface(app, type);
		if (UNBILLEDUSAGEBULKADJUSTMENT.equals(name)) return getUnbilledUsageBulkAdjustmentInterface(app, type);
		if (USAGECREDITRATE.equals(name)) return getUsageCreditRateInterface(app, type);
		if (VIPCODE.equals(name)) return getVipCodeInterface(app, type);
		if (VOUCHERDEFINITIONS.equals(name)) return getVoucherDefinitionsInterface(app, type);
		if (VOUCHERHISTORY.equals(name)) return getVoucherHistoryInterface(app, type);
		if (VOUCHERLOCATION.equals(name)) return getVoucherLocationInterface(app, type);
		if (VOUCHERSTATUS.equals(name)) return getVoucherStatusInterface(app, type);
		if (VOUCHERSTATUSINFO.equals(name)) return getVoucherStatusInfoInterface(app, type);
		if (VOUCHERSTATUSMOVEMENT.equals(name)) return getVoucherStatusMovementInterface(app, type);
		if (VOUCHERTYPES.equals(name)) return getVoucherTypesInterface(app, type);
		if (WRITEOFF.equals(name)) return getWriteoffInterface(app, type);
		throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for name = "+name);
	}
	public void release (String name, BaliInterface baliinterface) throws InterfaceFactoryException {
		if (ABIAUTOPAYCMFMAP.equals(name)) {
			releaseAbiAutoPayCmfMapInterface((AbiAutoPayCmfMapInterface)baliinterface);
			return;
		}
		if (ABIBILLMESSAGES.equals(name)) {
			releaseAbiBillMessagesInterface((AbiBillMessagesInterface)baliinterface);
			return;
		}
		if (ABIBILLINGSTATISTICS.equals(name)) {
			releaseAbiBillingStatisticsInterface((AbiBillingStatisticsInterface)baliinterface);
			return;
		}
		if (ABINRCDUC.equals(name)) {
			releaseAbiNrcDucInterface((AbiNrcDucInterface)baliinterface);
			return;
		}
		if (ACCOUNT.equals(name)) {
			releaseAccountInterface((AccountInterface)baliinterface);
			return;
		}
		if (ACCOUNTABISOURCE.equals(name)) {
			releaseAccountAbiSourceInterface((AccountAbiSourceInterface)baliinterface);
			return;
		}
		if (ACCOUNTBALANCES.equals(name)) {
			releaseAccountBalancesInterface((AccountBalancesInterface)baliinterface);
			return;
		}
		if (ACCOUNTBONUSPOINTBALANCE.equals(name)) {
			releaseAccountBonusPointBalanceInterface((AccountBonusPointBalanceInterface)baliinterface);
			return;
		}
		if (ACCOUNTBONUSPOINTTRANSACTION.equals(name)) {
			releaseAccountBonusPointTransactionInterface((AccountBonusPointTransactionInterface)baliinterface);
			return;
		}
		if (ACCOUNTCODE.equals(name)) {
			releaseAccountCodeInterface((AccountCodeInterface)baliinterface);
			return;
		}
		if (ACCOUNTCODEGROUP.equals(name)) {
			releaseAccountCodeGroupInterface((AccountCodeGroupInterface)baliinterface);
			return;
		}
		if (ACCOUNTHQCONTRACT.equals(name)) {
			releaseAccountHqContractInterface((AccountHqContractInterface)baliinterface);
			return;
		}
		if (ACCOUNTID.equals(name)) {
			releaseAccountIdInterface((AccountIdInterface)baliinterface);
			return;
		}
		if (ACCOUNTINSERT.equals(name)) {
			releaseAccountInsertInterface((AccountInsertInterface)baliinterface);
			return;
		}
		if (ACCOUNTLOCATE.equals(name)) {
			releaseAccountLocateInterface((AccountLocateInterface)baliinterface);
			return;
		}
		if (ACCOUNTMESSAGE.equals(name)) {
			releaseAccountMessageInterface((AccountMessageInterface)baliinterface);
			return;
		}
		if (ACCOUNTSEGMENT.equals(name)) {
			releaseAccountSegmentInterface((AccountSegmentInterface)baliinterface);
			return;
		}
		if (ACCOUNTSEGMENTMAP.equals(name)) {
			releaseAccountSegmentMapInterface((AccountSegmentMapInterface)baliinterface);
			return;
		}
		if (ACCOUNTSTATUS.equals(name)) {
			releaseAccountStatusInterface((AccountStatusInterface)baliinterface);
			return;
		}
		if (ADJUSTMENT.equals(name)) {
			releaseAdjustmentInterface((AdjustmentInterface)baliinterface);
			return;
		}
		if (ADJUSTMENTREASON.equals(name)) {
			releaseAdjustmentReasonInterface((AdjustmentReasonInterface)baliinterface);
			return;
		}
		if (ADJUSTMENTTAX.equals(name)) {
			releaseAdjustmentTaxInterface((AdjustmentTaxInterface)baliinterface);
			return;
		}
		if (ADJUSTMENTTYPE.equals(name)) {
			releaseAdjustmentTypeInterface((AdjustmentTypeInterface)baliinterface);
			return;
		}
		if (AXRTCOUNTRYCODEMAP.equals(name)) {
			releaseAxrtCountryCodeMapInterface((AxrtCountryCodeMapInterface)baliinterface);
			return;
		}
		if (AXRTCURRCODEMAP.equals(name)) {
			releaseAxrtCurrCodeMapInterface((AxrtCurrCodeMapInterface)baliinterface);
			return;
		}
		if (AXRTCURRENCYCODEMAP.equals(name)) {
			releaseAxrtCurrencyCodeMapInterface((AxrtCurrencyCodeMapInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENT.equals(name)) {
			releaseAxrtPaymentInterface((AxrtPaymentInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENTMERCHANT.equals(name)) {
			releaseAxrtPaymentMerchantInterface((AxrtPaymentMerchantInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENTPROFILE.equals(name)) {
			releaseAxrtPaymentProfileInterface((AxrtPaymentProfileInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENTTRANS.equals(name)) {
			releaseAxrtPaymentTransInterface((AxrtPaymentTransInterface)baliinterface);
			return;
		}
		if (BALANCELINEITEM.equals(name)) {
			releaseBalanceLineItemInterface((BalanceLineItemInterface)baliinterface);
			return;
		}
		if (BALANCELINEITEMBULKADJUSTMENT.equals(name)) {
			releaseBalanceLineItemBulkAdjustmentInterface((BalanceLineItemBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (BALANCEXFERDIFF.equals(name)) {
			releaseBalanceXferDiffInterface((BalanceXferDiffInterface)baliinterface);
			return;
		}
		if (BAMERRORCODE.equals(name)) {
			releaseBamErrorCodeInterface((BamErrorCodeInterface)baliinterface);
			return;
		}
		if (BILLCYCLE.equals(name)) {
			releaseBillCycleInterface((BillCycleInterface)baliinterface);
			return;
		}
		if (BILLDISPATCHMETHOD.equals(name)) {
			releaseBillDispatchMethodInterface((BillDispatchMethodInterface)baliinterface);
			return;
		}
		if (BILLIMAGE.equals(name)) {
			releaseBillImageInterface((BillImageInterface)baliinterface);
			return;
		}
		if (BILLIMAGEPAGE.equals(name)) {
			releaseBillImagePageInterface((BillImagePageInterface)baliinterface);
			return;
		}
		if (BILLINSERTGROUP.equals(name)) {
			releaseBillInsertGroupInterface((BillInsertGroupInterface)baliinterface);
			return;
		}
		if (BILLINSERTGROUPMAP.equals(name)) {
			releaseBillInsertGroupMapInterface((BillInsertGroupMapInterface)baliinterface);
			return;
		}
		if (BILLMESSAGEGROUP.equals(name)) {
			releaseBillMessageGroupInterface((BillMessageGroupInterface)baliinterface);
			return;
		}
		if (BILLMESSAGEGROUPMAP.equals(name)) {
			releaseBillMessageGroupMapInterface((BillMessageGroupMapInterface)baliinterface);
			return;
		}
		if (BILLEDUSAGE.equals(name)) {
			releaseBilledUsageInterface((BilledUsageInterface)baliinterface);
			return;
		}
		if (BILLEDUSAGEBULKADJUSTMENT.equals(name)) {
			releaseBilledUsageBulkAdjustmentInterface((BilledUsageBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (BONUSPOINTRATE.equals(name)) {
			releaseBonusPointRateInterface((BonusPointRateInterface)baliinterface);
			return;
		}
		if (BONUSPOINTTRANSTYPE.equals(name)) {
			releaseBonusPointTransTypeInterface((BonusPointTransTypeInterface)baliinterface);
			return;
		}
		if (CCAUDITLOG.equals(name)) {
			releaseCcAuditLogInterface((CcAuditLogInterface)baliinterface);
			return;
		}
		if (CDRDATADUC.equals(name)) {
			releaseCdrDataDucInterface((CdrDataDucInterface)baliinterface);
			return;
		}
		if (CHARGEDISTRIBPERCENT.equals(name)) {
			releaseChargeDistribPercentInterface((ChargeDistribPercentInterface)baliinterface);
			return;
		}
		if (CLEARINGHOUSE.equals(name)) {
			releaseClearingHouseInterface((ClearingHouseInterface)baliinterface);
			return;
		}
		if (CLEARINGHOUSECONTACTS.equals(name)) {
			releaseClearingHouseContactsInterface((ClearingHouseContactsInterface)baliinterface);
			return;
		}
		if (CLEARINGHOUSEINFO.equals(name)) {
			releaseClearingHouseInfoInterface((ClearingHouseInfoInterface)baliinterface);
			return;
		}
		if (CMFBONUSPOINT.equals(name)) {
			releaseCmfBonusPointInterface((CmfBonusPointInterface)baliinterface);
			return;
		}
		if (CMFPACKAGEOVERRIDES.equals(name)) {
			releaseCmfPackageOverridesInterface((CmfPackageOverridesInterface)baliinterface);
			return;
		}
		if (CMFREWARDBALANCEDETAIL.equals(name)) {
			releaseCmfRewardBalanceDetailInterface((CmfRewardBalanceDetailInterface)baliinterface);
			return;
		}
		if (CMFSTATUS.equals(name)) {
			releaseCmfStatusInterface((CmfStatusInterface)baliinterface);
			return;
		}
		if (CMFSTATUSCHGREASON.equals(name)) {
			releaseCmfStatusChgReasonInterface((CmfStatusChgReasonInterface)baliinterface);
			return;
		}
		if (CONNECTREASON.equals(name)) {
			releaseConnectReasonInterface((ConnectReasonInterface)baliinterface);
			return;
		}
		if (CONTACT.equals(name)) {
			releaseContactInterface((ContactInterface)baliinterface);
			return;
		}
		if (CONTRACTDISCOUNT.equals(name)) {
			releaseContractDiscountInterface((ContractDiscountInterface)baliinterface);
			return;
		}
		if (CORRIDOR.equals(name)) {
			releaseCorridorInterface((CorridorInterface)baliinterface);
			return;
		}
		if (CORRIDORRATEBANDOVERRIDE.equals(name)) {
			releaseCorridorRateBandOverrideInterface((CorridorRateBandOverrideInterface)baliinterface);
			return;
		}
		if (CORRIDORRATEOVERRIDE.equals(name)) {
			releaseCorridorRateOverrideInterface((CorridorRateOverrideInterface)baliinterface);
			return;
		}
		if (CREDITCARD.equals(name)) {
			releaseCreditCardInterface((CreditCardInterface)baliinterface);
			return;
		}
		if (CREDITCARDTYPECODE.equals(name)) {
			releaseCreditCardTypeCodeInterface((CreditCardTypeCodeInterface)baliinterface);
			return;
		}
		if (CSR.equals(name)) {
			releaseCsrInterface((CsrInterface)baliinterface);
			return;
		}
		if (CSRACCOUNTSEGMENT.equals(name)) {
			releaseCsrAccountSegmentInterface((CsrAccountSegmentInterface)baliinterface);
			return;
		}
		if (CSRGROUPAMOUNT.equals(name)) {
			releaseCsrGroupAmountInterface((CsrGroupAmountInterface)baliinterface);
			return;
		}
		if (CSRGROUPFUNCTION.equals(name)) {
			releaseCsrGroupFunctionInterface((CsrGroupFunctionInterface)baliinterface);
			return;
		}
		if (CUSTOMERDOCUMENT.equals(name)) {
			releaseCustomerDocumentInterface((CustomerDocumentInterface)baliinterface);
			return;
		}
		if (CUSTOMERDTSERVER.equals(name)) {
			releaseCustomerDtServerInterface((CustomerDtServerInterface)baliinterface);
			return;
		}
		if (CUSTOMERDTURL.equals(name)) {
			releaseCustomerDtUrlInterface((CustomerDtUrlInterface)baliinterface);
			return;
		}
		if (CUSTOMERSERVICECENTER.equals(name)) {
			releaseCustomerServiceCenterInterface((CustomerServiceCenterInterface)baliinterface);
			return;
		}
		if (DEPOSIT.equals(name)) {
			releaseDepositInterface((DepositInterface)baliinterface);
			return;
		}
		if (DEPOSITTYPE.equals(name)) {
			releaseDepositTypeInterface((DepositTypeInterface)baliinterface);
			return;
		}
		if (DISCREASON.equals(name)) {
			releaseDiscReasonInterface((DiscReasonInterface)baliinterface);
			return;
		}
		if (DOCUMENTTYPEREF.equals(name)) {
			releaseDocumentTypeRefInterface((DocumentTypeRefInterface)baliinterface);
			return;
		}
		if (EARLYTERMINATIONCHARGE.equals(name)) {
			releaseEarlyTerminationChargeInterface((EarlyTerminationChargeInterface)baliinterface);
			return;
		}
		if (EFTRESPONSECODE.equals(name)) {
			releaseEftResponseCodeInterface((EftResponseCodeInterface)baliinterface);
			return;
		}
		if (EFTTRANSACTION.equals(name)) {
			releaseEftTransactionInterface((EftTransactionInterface)baliinterface);
			return;
		}
		if (ENHANCEDNOTE.equals(name)) {
			releaseEnhancedNoteInterface((EnhancedNoteInterface)baliinterface);
			return;
		}
		if (EXCHANGERATECLASS.equals(name)) {
			releaseExchangeRateClassInterface((ExchangeRateClassInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAASSOCIATION.equals(name)) {
			releaseExtendedDataAssociationInterface((ExtendedDataAssociationInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAENUMERATION.equals(name)) {
			releaseExtendedDataEnumerationInterface((ExtendedDataEnumerationInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATALOCATE.equals(name)) {
			releaseExtendedDataLocateInterface((ExtendedDataLocateInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAPARAM.equals(name)) {
			releaseExtendedDataParamInterface((ExtendedDataParamInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAPARAMTYPE.equals(name)) {
			releaseExtendedDataParamTypeInterface((ExtendedDataParamTypeInterface)baliinterface);
			return;
		}
		if (EXTERNALIDACCTMAP.equals(name)) {
			releaseExternalIdAcctMapInterface((ExternalIdAcctMapInterface)baliinterface);
			return;
		}
		if (EXTERNALIDHQGROUPSMAP.equals(name)) {
			releaseExternalIdHqGroupsMapInterface((ExternalIdHqGroupsMapInterface)baliinterface);
			return;
		}
		if (FRANCHISECODE.equals(name)) {
			releaseFranchiseCodeInterface((FranchiseCodeInterface)baliinterface);
			return;
		}
		if (GENDERTYPE.equals(name)) {
			releaseGenderTypeInterface((GenderTypeInterface)baliinterface);
			return;
		}
		if (GENERICENUMERATION.equals(name)) {
			releaseGenericEnumerationInterface((GenericEnumerationInterface)baliinterface);
			return;
		}
		if (GEOCODE.equals(name)) {
			releaseGeocodeInterface((GeocodeInterface)baliinterface);
			return;
		}
		if (GLOBALACCOUNTBALANCES.equals(name)) {
			releaseGlobalAccountBalancesInterface((GlobalAccountBalancesInterface)baliinterface);
			return;
		}
		if (GLOBALCONTRACT.equals(name)) {
			releaseGlobalContractInterface((GlobalContractInterface)baliinterface);
			return;
		}
		if (GLOBALOPENITEMIDMAP.equals(name)) {
			releaseGlobalOpenItemIdMapInterface((GlobalOpenItemIdMapInterface)baliinterface);
			return;
		}
		if (GROUP.equals(name)) {
			releaseGroupInterface((GroupInterface)baliinterface);
			return;
		}
		if (GROUPLOCATE.equals(name)) {
			releaseGroupLocateInterface((GroupLocateInterface)baliinterface);
			return;
		}
		if (GROUPMEMBER.equals(name)) {
			releaseGroupMemberInterface((GroupMemberInterface)baliinterface);
			return;
		}
		if (GUIINDICATOR.equals(name)) {
			releaseGuiIndicatorInterface((GuiIndicatorInterface)baliinterface);
			return;
		}
		if (HISTORICALCONTRIBUTION.equals(name)) {
			releaseHistoricalContributionInterface((HistoricalContributionInterface)baliinterface);
			return;
		}
		if (HISTORICALCONTRIBUTIONTAX.equals(name)) {
			releaseHistoricalContributionTaxInterface((HistoricalContributionTaxInterface)baliinterface);
			return;
		}
		if (HISTORICALTHRESHOLDS.equals(name)) {
			releaseHistoricalThresholdsInterface((HistoricalThresholdsInterface)baliinterface);
			return;
		}
		if (HQCONTRACTUNITCR.equals(name)) {
			releaseHqContractUnitCrInterface((HqContractUnitCrInterface)baliinterface);
			return;
		}
		if (HQGROUPCONTRACTS.equals(name)) {
			releaseHqGroupContractsInterface((HqGroupContractsInterface)baliinterface);
			return;
		}
		if (HQGROUPCORRIDOR.equals(name)) {
			releaseHqGroupCorridorInterface((HqGroupCorridorInterface)baliinterface);
			return;
		}
		if (HQGROUPMEMBERS.equals(name)) {
			releaseHqGroupMembersInterface((HqGroupMembersInterface)baliinterface);
			return;
		}
		if (HQGROUPPRODUCT.equals(name)) {
			releaseHqGroupProductInterface((HqGroupProductInterface)baliinterface);
			return;
		}
		if (HQGROUPS.equals(name)) {
			releaseHqGroupsInterface((HqGroupsInterface)baliinterface);
			return;
		}
		if (HQGROUPUSAGEREDIRECTMAP.equals(name)) {
			releaseHqgroupUsageRedirectMapInterface((HqgroupUsageRedirectMapInterface)baliinterface);
			return;
		}
		if (INTERIMBILL.equals(name)) {
			releaseInterimBillInterface((InterimBillInterface)baliinterface);
			return;
		}
		if (INVOICE.equals(name)) {
			releaseInvoiceInterface((InvoiceInterface)baliinterface);
			return;
		}
		if (INVOICEDETAIL.equals(name)) {
			releaseInvoiceDetailInterface((InvoiceDetailInterface)baliinterface);
			return;
		}
		if (INVOICEDETAILBULKADJUSTMENT.equals(name)) {
			releaseInvoiceDetailBulkAdjustmentInterface((InvoiceDetailBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (LATEFEERATEOVERRIDES.equals(name)) {
			releaseLateFeeRateOverridesInterface((LateFeeRateOverridesInterface)baliinterface);
			return;
		}
		if (LBXPAYMENTTYPE.equals(name)) {
			releaseLbxPaymentTypeInterface((LbxPaymentTypeInterface)baliinterface);
			return;
		}
		if (MULTILINESADJ.equals(name)) {
			releaseMultiLinesAdjInterface((MultiLinesAdjInterface)baliinterface);
			return;
		}
		if (NETACTION.equals(name)) {
			releaseNetActionInterface((NetActionInterface)baliinterface);
			return;
		}
		if (NOTE.equals(name)) {
			releaseNoteInterface((NoteInterface)baliinterface);
			return;
		}
		if (NOTECODE.equals(name)) {
			releaseNoteCodeInterface((NoteCodeInterface)baliinterface);
			return;
		}
		if (NOTETEXT.equals(name)) {
			releaseNoteTextInterface((NoteTextInterface)baliinterface);
			return;
		}
		if (OPENITEM.equals(name)) {
			releaseOpenItemInterface((OpenItemInterface)baliinterface);
			return;
		}
		if (OPENITEMIDMAP.equals(name)) {
			releaseOpenItemIdMapInterface((OpenItemIdMapInterface)baliinterface);
			return;
		}
		if (ORDERQUOTE.equals(name)) {
			releaseOrderQuoteInterface((OrderQuoteInterface)baliinterface);
			return;
		}
		if (OVERRIDEDISCOUNTRATE.equals(name)) {
			releaseOverrideDiscountRateInterface((OverrideDiscountRateInterface)baliinterface);
			return;
		}
		if (OVERRIDEUSAGECREDITRATE.equals(name)) {
			releaseOverrideUsageCreditRateInterface((OverrideUsageCreditRateInterface)baliinterface);
			return;
		}
		if (OWNINGCOSTCENTER.equals(name)) {
			releaseOwningCostCenterInterface((OwningCostCenterInterface)baliinterface);
			return;
		}
		if (PACKAGECOMPONENTDEF.equals(name)) {
			releasePackageComponentDefInterface((PackageComponentDefInterface)baliinterface);
			return;
		}
		if (PAYMENT.equals(name)) {
			releasePaymentInterface((PaymentInterface)baliinterface);
			return;
		}
		if (PAYMENTDISTRIBUTION.equals(name)) {
			releasePaymentDistributionInterface((PaymentDistributionInterface)baliinterface);
			return;
		}
		if (PAYMENTMERCHANTID.equals(name)) {
			releasePaymentMerchantIdInterface((PaymentMerchantIdInterface)baliinterface);
			return;
		}
		if (PAYMENTMERCHANTIDASSIGN.equals(name)) {
			releasePaymentMerchantIdAssignInterface((PaymentMerchantIdAssignInterface)baliinterface);
			return;
		}
		if (PAYMENTPROFILE.equals(name)) {
			releasePaymentProfileInterface((PaymentProfileInterface)baliinterface);
			return;
		}
		if (PAYMENTTRANS.equals(name)) {
			releasePaymentTransInterface((PaymentTransInterface)baliinterface);
			return;
		}
		if (PAYMENTTYPE.equals(name)) {
			releasePaymentTypeInterface((PaymentTypeInterface)baliinterface);
			return;
		}
		if (PREPAYMENT.equals(name)) {
			releasePrepaymentInterface((PrepaymentInterface)baliinterface);
			return;
		}
		if (PREPAYMENTDISTRIBUTION.equals(name)) {
			releasePrepaymentDistributionInterface((PrepaymentDistributionInterface)baliinterface);
			return;
		}
		if (PRIVACYLEVEL.equals(name)) {
			releasePrivacyLevelInterface((PrivacyLevelInterface)baliinterface);
			return;
		}
		if (PRODUCTCATALOG.equals(name)) {
			releaseProductCatalogInterface((ProductCatalogInterface)baliinterface);
			return;
		}
		if (PRODUCTCHARGEMAP.equals(name)) {
			releaseProductChargeMapInterface((ProductChargeMapInterface)baliinterface);
			return;
		}
		if (PRODUCTRATEKEY.equals(name)) {
			releaseProductRateKeyInterface((ProductRateKeyInterface)baliinterface);
			return;
		}
		if (PRODUCTRATEOVERRIDE.equals(name)) {
			releaseProductRateOverrideInterface((ProductRateOverrideInterface)baliinterface);
			return;
		}
		if (PRODUCTRCRATE.equals(name)) {
			releaseProductRcRateInterface((ProductRcRateInterface)baliinterface);
			return;
		}
		if (REFINANCEPLAN.equals(name)) {
			releaseRefinancePlanInterface((RefinancePlanInterface)baliinterface);
			return;
		}
		if (REFUND.equals(name)) {
			releaseRefundInterface((RefundInterface)baliinterface);
			return;
		}
		if (REFUNDREASON.equals(name)) {
			releaseRefundReasonInterface((RefundReasonInterface)baliinterface);
			return;
		}
		if (REGULATORYID.equals(name)) {
			releaseRegulatoryIdInterface((RegulatoryIdInterface)baliinterface);
			return;
		}
		if (REVRCVCOSTCENTER.equals(name)) {
			releaseRevRcvCostCenterInterface((RevRcvCostCenterInterface)baliinterface);
			return;
		}
		if (REVERSEBULKADJUSTMENT.equals(name)) {
			releaseReverseBulkAdjustmentInterface((ReverseBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (REWARDBALANCE.equals(name)) {
			releaseRewardBalanceInterface((RewardBalanceInterface)baliinterface);
			return;
		}
		if (REWARDBALANCEENTITYMAPPING.equals(name)) {
			releaseRewardBalanceEntityMappingInterface((RewardBalanceEntityMappingInterface)baliinterface);
			return;
		}
		if (RTPAYMENTRESPONSE.equals(name)) {
			releaseRtPaymentResponseInterface((RtPaymentResponseInterface)baliinterface);
			return;
		}
		if (SALESCHANNEL.equals(name)) {
			releaseSalesChannelInterface((SalesChannelInterface)baliinterface);
			return;
		}
		if (SECURITYACI.equals(name)) {
			releaseSecurityAciInterface((SecurityAciInterface)baliinterface);
			return;
		}
		if (SECURITYRESOURCE.equals(name)) {
			releaseSecurityResourceInterface((SecurityResourceInterface)baliinterface);
			return;
		}
		if (SECURITYROLE.equals(name)) {
			releaseSecurityRoleInterface((SecurityRoleInterface)baliinterface);
			return;
		}
		if (SECURITYUSER.equals(name)) {
			releaseSecurityUserInterface((SecurityUserInterface)baliinterface);
			return;
		}
		if (SERVER.equals(name)) {
			releaseServerInterface((ServerInterface)baliinterface);
			return;
		}
		if (SERVERCATEGORY.equals(name)) {
			releaseServerCategoryInterface((ServerCategoryInterface)baliinterface);
			return;
		}
		if (SERVERDEFINITION.equals(name)) {
			releaseServerDefinitionInterface((ServerDefinitionInterface)baliinterface);
			return;
		}
		if (SERVICECENTER.equals(name)) {
			releaseServiceCenterInterface((ServiceCenterInterface)baliinterface);
			return;
		}
		if (SERVICECENTERTYPE.equals(name)) {
			releaseServiceCenterTypeInterface((ServiceCenterTypeInterface)baliinterface);
			return;
		}
		if (SERVICEMASTERGROUP.equals(name)) {
			releaseServiceMasterGroupInterface((ServiceMasterGroupInterface)baliinterface);
			return;
		}
		if (SERVICEPRICINGPLAN.equals(name)) {
			releaseServicePricingPlanInterface((ServicePricingPlanInterface)baliinterface);
			return;
		}
		if (SERVICEZONE.equals(name)) {
			releaseServiceZoneInterface((ServiceZoneInterface)baliinterface);
			return;
		}
		if (SLAMEASUREMENTDATA.equals(name)) {
			releaseSlaMeasurementDataInterface((SlaMeasurementDataInterface)baliinterface);
			return;
		}
		if (STATUSREASONMAP.equals(name)) {
			releaseStatusReasonMapInterface((StatusReasonMapInterface)baliinterface);
			return;
		}
		if (TAXABANDONED.equals(name)) {
			releaseTaxAbandonedInterface((TaxAbandonedInterface)baliinterface);
			return;
		}
		if (TAXASSIGNMENT.equals(name)) {
			releaseTaxAssignmentInterface((TaxAssignmentInterface)baliinterface);
			return;
		}
		if (TAXEXEMPTION.equals(name)) {
			releaseTaxExemptionInterface((TaxExemptionInterface)baliinterface);
			return;
		}
		if (TAXPACKAGEINST.equals(name)) {
			releaseTaxPackageInstInterface((TaxPackageInstInterface)baliinterface);
			return;
		}
		if (TAXRATESVAT.equals(name)) {
			releaseTaxRatesVatInterface((TaxRatesVatInterface)baliinterface);
			return;
		}
		if (TAXSTATUS.equals(name)) {
			releaseTaxStatusInterface((TaxStatusInterface)baliinterface);
			return;
		}
		if (TAXTYPECOMM.equals(name)) {
			releaseTaxTypeCommInterface((TaxTypeCommInterface)baliinterface);
			return;
		}
		if (TIMEZONE.equals(name)) {
			releaseTimezoneInterface((TimezoneInterface)baliinterface);
			return;
		}
		if (TRANSSOURCETYPE.equals(name)) {
			releaseTransSourceTypeInterface((TransSourceTypeInterface)baliinterface);
			return;
		}
		if (TRANSFERREASON.equals(name)) {
			releaseTransferReasonInterface((TransferReasonInterface)baliinterface);
			return;
		}
		if (UNAPPLIEDPAYMENT.equals(name)) {
			releaseUnappliedPaymentInterface((UnappliedPaymentInterface)baliinterface);
			return;
		}
		if (UNBILLEDUSAGE.equals(name)) {
			releaseUnbilledUsageInterface((UnbilledUsageInterface)baliinterface);
			return;
		}
		if (UNBILLEDUSAGEBULKADJUSTMENT.equals(name)) {
			releaseUnbilledUsageBulkAdjustmentInterface((UnbilledUsageBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (USAGECREDITRATE.equals(name)) {
			releaseUsageCreditRateInterface((UsageCreditRateInterface)baliinterface);
			return;
		}
		if (VIPCODE.equals(name)) {
			releaseVipCodeInterface((VipCodeInterface)baliinterface);
			return;
		}
		if (VOUCHERDEFINITIONS.equals(name)) {
			releaseVoucherDefinitionsInterface((VoucherDefinitionsInterface)baliinterface);
			return;
		}
		if (VOUCHERHISTORY.equals(name)) {
			releaseVoucherHistoryInterface((VoucherHistoryInterface)baliinterface);
			return;
		}
		if (VOUCHERLOCATION.equals(name)) {
			releaseVoucherLocationInterface((VoucherLocationInterface)baliinterface);
			return;
		}
		if (VOUCHERSTATUS.equals(name)) {
			releaseVoucherStatusInterface((VoucherStatusInterface)baliinterface);
			return;
		}
		if (VOUCHERSTATUSINFO.equals(name)) {
			releaseVoucherStatusInfoInterface((VoucherStatusInfoInterface)baliinterface);
			return;
		}
		if (VOUCHERSTATUSMOVEMENT.equals(name)) {
			releaseVoucherStatusMovementInterface((VoucherStatusMovementInterface)baliinterface);
			return;
		}
		if (VOUCHERTYPES.equals(name)) {
			releaseVoucherTypesInterface((VoucherTypesInterface)baliinterface);
			return;
		}
		if (WRITEOFF.equals(name)) {
			releaseWriteoffInterface((WriteoffInterface)baliinterface);
			return;
		}
		throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for name = "+name);
	}
	public void release (String name, String app, String type, BaliInterface baliinterface) throws InterfaceFactoryException {
		if (ABIAUTOPAYCMFMAP.equals(name)) {
			releaseAbiAutoPayCmfMapInterface(app, type, (AbiAutoPayCmfMapInterface)baliinterface);
			return;
		}
		if (ABIBILLMESSAGES.equals(name)) {
			releaseAbiBillMessagesInterface(app, type, (AbiBillMessagesInterface)baliinterface);
			return;
		}
		if (ABIBILLINGSTATISTICS.equals(name)) {
			releaseAbiBillingStatisticsInterface(app, type, (AbiBillingStatisticsInterface)baliinterface);
			return;
		}
		if (ABINRCDUC.equals(name)) {
			releaseAbiNrcDucInterface(app, type, (AbiNrcDucInterface)baliinterface);
			return;
		}
		if (ACCOUNT.equals(name)) {
			releaseAccountInterface(app, type, (AccountInterface)baliinterface);
			return;
		}
		if (ACCOUNTABISOURCE.equals(name)) {
			releaseAccountAbiSourceInterface(app, type, (AccountAbiSourceInterface)baliinterface);
			return;
		}
		if (ACCOUNTBALANCES.equals(name)) {
			releaseAccountBalancesInterface(app, type, (AccountBalancesInterface)baliinterface);
			return;
		}
		if (ACCOUNTBONUSPOINTBALANCE.equals(name)) {
			releaseAccountBonusPointBalanceInterface(app, type, (AccountBonusPointBalanceInterface)baliinterface);
			return;
		}
		if (ACCOUNTBONUSPOINTTRANSACTION.equals(name)) {
			releaseAccountBonusPointTransactionInterface(app, type, (AccountBonusPointTransactionInterface)baliinterface);
			return;
		}
		if (ACCOUNTCODE.equals(name)) {
			releaseAccountCodeInterface(app, type, (AccountCodeInterface)baliinterface);
			return;
		}
		if (ACCOUNTCODEGROUP.equals(name)) {
			releaseAccountCodeGroupInterface(app, type, (AccountCodeGroupInterface)baliinterface);
			return;
		}
		if (ACCOUNTHQCONTRACT.equals(name)) {
			releaseAccountHqContractInterface(app, type, (AccountHqContractInterface)baliinterface);
			return;
		}
		if (ACCOUNTID.equals(name)) {
			releaseAccountIdInterface(app, type, (AccountIdInterface)baliinterface);
			return;
		}
		if (ACCOUNTINSERT.equals(name)) {
			releaseAccountInsertInterface(app, type, (AccountInsertInterface)baliinterface);
			return;
		}
		if (ACCOUNTLOCATE.equals(name)) {
			releaseAccountLocateInterface(app, type, (AccountLocateInterface)baliinterface);
			return;
		}
		if (ACCOUNTMESSAGE.equals(name)) {
			releaseAccountMessageInterface(app, type, (AccountMessageInterface)baliinterface);
			return;
		}
		if (ACCOUNTSEGMENT.equals(name)) {
			releaseAccountSegmentInterface(app, type, (AccountSegmentInterface)baliinterface);
			return;
		}
		if (ACCOUNTSEGMENTMAP.equals(name)) {
			releaseAccountSegmentMapInterface(app, type, (AccountSegmentMapInterface)baliinterface);
			return;
		}
		if (ACCOUNTSTATUS.equals(name)) {
			releaseAccountStatusInterface(app, type, (AccountStatusInterface)baliinterface);
			return;
		}
		if (ADJUSTMENT.equals(name)) {
			releaseAdjustmentInterface(app, type, (AdjustmentInterface)baliinterface);
			return;
		}
		if (ADJUSTMENTREASON.equals(name)) {
			releaseAdjustmentReasonInterface(app, type, (AdjustmentReasonInterface)baliinterface);
			return;
		}
		if (ADJUSTMENTTAX.equals(name)) {
			releaseAdjustmentTaxInterface(app, type, (AdjustmentTaxInterface)baliinterface);
			return;
		}
		if (ADJUSTMENTTYPE.equals(name)) {
			releaseAdjustmentTypeInterface(app, type, (AdjustmentTypeInterface)baliinterface);
			return;
		}
		if (AXRTCOUNTRYCODEMAP.equals(name)) {
			releaseAxrtCountryCodeMapInterface(app, type, (AxrtCountryCodeMapInterface)baliinterface);
			return;
		}
		if (AXRTCURRCODEMAP.equals(name)) {
			releaseAxrtCurrCodeMapInterface(app, type, (AxrtCurrCodeMapInterface)baliinterface);
			return;
		}
		if (AXRTCURRENCYCODEMAP.equals(name)) {
			releaseAxrtCurrencyCodeMapInterface(app, type, (AxrtCurrencyCodeMapInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENT.equals(name)) {
			releaseAxrtPaymentInterface(app, type, (AxrtPaymentInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENTMERCHANT.equals(name)) {
			releaseAxrtPaymentMerchantInterface(app, type, (AxrtPaymentMerchantInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENTPROFILE.equals(name)) {
			releaseAxrtPaymentProfileInterface(app, type, (AxrtPaymentProfileInterface)baliinterface);
			return;
		}
		if (AXRTPAYMENTTRANS.equals(name)) {
			releaseAxrtPaymentTransInterface(app, type, (AxrtPaymentTransInterface)baliinterface);
			return;
		}
		if (BALANCELINEITEM.equals(name)) {
			releaseBalanceLineItemInterface(app, type, (BalanceLineItemInterface)baliinterface);
			return;
		}
		if (BALANCELINEITEMBULKADJUSTMENT.equals(name)) {
			releaseBalanceLineItemBulkAdjustmentInterface(app, type, (BalanceLineItemBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (BALANCEXFERDIFF.equals(name)) {
			releaseBalanceXferDiffInterface(app, type, (BalanceXferDiffInterface)baliinterface);
			return;
		}
		if (BAMERRORCODE.equals(name)) {
			releaseBamErrorCodeInterface(app, type, (BamErrorCodeInterface)baliinterface);
			return;
		}
		if (BILLCYCLE.equals(name)) {
			releaseBillCycleInterface(app, type, (BillCycleInterface)baliinterface);
			return;
		}
		if (BILLDISPATCHMETHOD.equals(name)) {
			releaseBillDispatchMethodInterface(app, type, (BillDispatchMethodInterface)baliinterface);
			return;
		}
		if (BILLIMAGE.equals(name)) {
			releaseBillImageInterface(app, type, (BillImageInterface)baliinterface);
			return;
		}
		if (BILLIMAGEPAGE.equals(name)) {
			releaseBillImagePageInterface(app, type, (BillImagePageInterface)baliinterface);
			return;
		}
		if (BILLINSERTGROUP.equals(name)) {
			releaseBillInsertGroupInterface(app, type, (BillInsertGroupInterface)baliinterface);
			return;
		}
		if (BILLINSERTGROUPMAP.equals(name)) {
			releaseBillInsertGroupMapInterface(app, type, (BillInsertGroupMapInterface)baliinterface);
			return;
		}
		if (BILLMESSAGEGROUP.equals(name)) {
			releaseBillMessageGroupInterface(app, type, (BillMessageGroupInterface)baliinterface);
			return;
		}
		if (BILLMESSAGEGROUPMAP.equals(name)) {
			releaseBillMessageGroupMapInterface(app, type, (BillMessageGroupMapInterface)baliinterface);
			return;
		}
		if (BILLEDUSAGE.equals(name)) {
			releaseBilledUsageInterface(app, type, (BilledUsageInterface)baliinterface);
			return;
		}
		if (BILLEDUSAGEBULKADJUSTMENT.equals(name)) {
			releaseBilledUsageBulkAdjustmentInterface(app, type, (BilledUsageBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (BONUSPOINTRATE.equals(name)) {
			releaseBonusPointRateInterface(app, type, (BonusPointRateInterface)baliinterface);
			return;
		}
		if (BONUSPOINTTRANSTYPE.equals(name)) {
			releaseBonusPointTransTypeInterface(app, type, (BonusPointTransTypeInterface)baliinterface);
			return;
		}
		if (CCAUDITLOG.equals(name)) {
			releaseCcAuditLogInterface(app, type, (CcAuditLogInterface)baliinterface);
			return;
		}
		if (CDRDATADUC.equals(name)) {
			releaseCdrDataDucInterface(app, type, (CdrDataDucInterface)baliinterface);
			return;
		}
		if (CHARGEDISTRIBPERCENT.equals(name)) {
			releaseChargeDistribPercentInterface(app, type, (ChargeDistribPercentInterface)baliinterface);
			return;
		}
		if (CLEARINGHOUSE.equals(name)) {
			releaseClearingHouseInterface(app, type, (ClearingHouseInterface)baliinterface);
			return;
		}
		if (CLEARINGHOUSECONTACTS.equals(name)) {
			releaseClearingHouseContactsInterface(app, type, (ClearingHouseContactsInterface)baliinterface);
			return;
		}
		if (CLEARINGHOUSEINFO.equals(name)) {
			releaseClearingHouseInfoInterface(app, type, (ClearingHouseInfoInterface)baliinterface);
			return;
		}
		if (CMFBONUSPOINT.equals(name)) {
			releaseCmfBonusPointInterface(app, type, (CmfBonusPointInterface)baliinterface);
			return;
		}
		if (CMFPACKAGEOVERRIDES.equals(name)) {
			releaseCmfPackageOverridesInterface(app, type, (CmfPackageOverridesInterface)baliinterface);
			return;
		}
		if (CMFREWARDBALANCEDETAIL.equals(name)) {
			releaseCmfRewardBalanceDetailInterface(app, type, (CmfRewardBalanceDetailInterface)baliinterface);
			return;
		}
		if (CMFSTATUS.equals(name)) {
			releaseCmfStatusInterface(app, type, (CmfStatusInterface)baliinterface);
			return;
		}
		if (CMFSTATUSCHGREASON.equals(name)) {
			releaseCmfStatusChgReasonInterface(app, type, (CmfStatusChgReasonInterface)baliinterface);
			return;
		}
		if (CONNECTREASON.equals(name)) {
			releaseConnectReasonInterface(app, type, (ConnectReasonInterface)baliinterface);
			return;
		}
		if (CONTACT.equals(name)) {
			releaseContactInterface(app, type, (ContactInterface)baliinterface);
			return;
		}
		if (CONTRACTDISCOUNT.equals(name)) {
			releaseContractDiscountInterface(app, type, (ContractDiscountInterface)baliinterface);
			return;
		}
		if (CORRIDOR.equals(name)) {
			releaseCorridorInterface(app, type, (CorridorInterface)baliinterface);
			return;
		}
		if (CORRIDORRATEBANDOVERRIDE.equals(name)) {
			releaseCorridorRateBandOverrideInterface(app, type, (CorridorRateBandOverrideInterface)baliinterface);
			return;
		}
		if (CORRIDORRATEOVERRIDE.equals(name)) {
			releaseCorridorRateOverrideInterface(app, type, (CorridorRateOverrideInterface)baliinterface);
			return;
		}
		if (CREDITCARD.equals(name)) {
			releaseCreditCardInterface(app, type, (CreditCardInterface)baliinterface);
			return;
		}
		if (CREDITCARDTYPECODE.equals(name)) {
			releaseCreditCardTypeCodeInterface(app, type, (CreditCardTypeCodeInterface)baliinterface);
			return;
		}
		if (CSR.equals(name)) {
			releaseCsrInterface(app, type, (CsrInterface)baliinterface);
			return;
		}
		if (CSRACCOUNTSEGMENT.equals(name)) {
			releaseCsrAccountSegmentInterface(app, type, (CsrAccountSegmentInterface)baliinterface);
			return;
		}
		if (CSRGROUPAMOUNT.equals(name)) {
			releaseCsrGroupAmountInterface(app, type, (CsrGroupAmountInterface)baliinterface);
			return;
		}
		if (CSRGROUPFUNCTION.equals(name)) {
			releaseCsrGroupFunctionInterface(app, type, (CsrGroupFunctionInterface)baliinterface);
			return;
		}
		if (CUSTOMERDOCUMENT.equals(name)) {
			releaseCustomerDocumentInterface(app, type, (CustomerDocumentInterface)baliinterface);
			return;
		}
		if (CUSTOMERDTSERVER.equals(name)) {
			releaseCustomerDtServerInterface(app, type, (CustomerDtServerInterface)baliinterface);
			return;
		}
		if (CUSTOMERDTURL.equals(name)) {
			releaseCustomerDtUrlInterface(app, type, (CustomerDtUrlInterface)baliinterface);
			return;
		}
		if (CUSTOMERSERVICECENTER.equals(name)) {
			releaseCustomerServiceCenterInterface(app, type, (CustomerServiceCenterInterface)baliinterface);
			return;
		}
		if (DEPOSIT.equals(name)) {
			releaseDepositInterface(app, type, (DepositInterface)baliinterface);
			return;
		}
		if (DEPOSITTYPE.equals(name)) {
			releaseDepositTypeInterface(app, type, (DepositTypeInterface)baliinterface);
			return;
		}
		if (DISCREASON.equals(name)) {
			releaseDiscReasonInterface(app, type, (DiscReasonInterface)baliinterface);
			return;
		}
		if (DOCUMENTTYPEREF.equals(name)) {
			releaseDocumentTypeRefInterface(app, type, (DocumentTypeRefInterface)baliinterface);
			return;
		}
		if (EARLYTERMINATIONCHARGE.equals(name)) {
			releaseEarlyTerminationChargeInterface(app, type, (EarlyTerminationChargeInterface)baliinterface);
			return;
		}
		if (EFTRESPONSECODE.equals(name)) {
			releaseEftResponseCodeInterface(app, type, (EftResponseCodeInterface)baliinterface);
			return;
		}
		if (EFTTRANSACTION.equals(name)) {
			releaseEftTransactionInterface(app, type, (EftTransactionInterface)baliinterface);
			return;
		}
		if (ENHANCEDNOTE.equals(name)) {
			releaseEnhancedNoteInterface(app, type, (EnhancedNoteInterface)baliinterface);
			return;
		}
		if (EXCHANGERATECLASS.equals(name)) {
			releaseExchangeRateClassInterface(app, type, (ExchangeRateClassInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAASSOCIATION.equals(name)) {
			releaseExtendedDataAssociationInterface(app, type, (ExtendedDataAssociationInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAENUMERATION.equals(name)) {
			releaseExtendedDataEnumerationInterface(app, type, (ExtendedDataEnumerationInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATALOCATE.equals(name)) {
			releaseExtendedDataLocateInterface(app, type, (ExtendedDataLocateInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAPARAM.equals(name)) {
			releaseExtendedDataParamInterface(app, type, (ExtendedDataParamInterface)baliinterface);
			return;
		}
		if (EXTENDEDDATAPARAMTYPE.equals(name)) {
			releaseExtendedDataParamTypeInterface(app, type, (ExtendedDataParamTypeInterface)baliinterface);
			return;
		}
		if (EXTERNALIDACCTMAP.equals(name)) {
			releaseExternalIdAcctMapInterface(app, type, (ExternalIdAcctMapInterface)baliinterface);
			return;
		}
		if (EXTERNALIDHQGROUPSMAP.equals(name)) {
			releaseExternalIdHqGroupsMapInterface(app, type, (ExternalIdHqGroupsMapInterface)baliinterface);
			return;
		}
		if (FRANCHISECODE.equals(name)) {
			releaseFranchiseCodeInterface(app, type, (FranchiseCodeInterface)baliinterface);
			return;
		}
		if (GENDERTYPE.equals(name)) {
			releaseGenderTypeInterface(app, type, (GenderTypeInterface)baliinterface);
			return;
		}
		if (GENERICENUMERATION.equals(name)) {
			releaseGenericEnumerationInterface(app, type, (GenericEnumerationInterface)baliinterface);
			return;
		}
		if (GEOCODE.equals(name)) {
			releaseGeocodeInterface(app, type, (GeocodeInterface)baliinterface);
			return;
		}
		if (GLOBALACCOUNTBALANCES.equals(name)) {
			releaseGlobalAccountBalancesInterface(app, type, (GlobalAccountBalancesInterface)baliinterface);
			return;
		}
		if (GLOBALCONTRACT.equals(name)) {
			releaseGlobalContractInterface(app, type, (GlobalContractInterface)baliinterface);
			return;
		}
		if (GLOBALOPENITEMIDMAP.equals(name)) {
			releaseGlobalOpenItemIdMapInterface(app, type, (GlobalOpenItemIdMapInterface)baliinterface);
			return;
		}
		if (GROUP.equals(name)) {
			releaseGroupInterface(app, type, (GroupInterface)baliinterface);
			return;
		}
		if (GROUPLOCATE.equals(name)) {
			releaseGroupLocateInterface(app, type, (GroupLocateInterface)baliinterface);
			return;
		}
		if (GROUPMEMBER.equals(name)) {
			releaseGroupMemberInterface(app, type, (GroupMemberInterface)baliinterface);
			return;
		}
		if (GUIINDICATOR.equals(name)) {
			releaseGuiIndicatorInterface(app, type, (GuiIndicatorInterface)baliinterface);
			return;
		}
		if (HISTORICALCONTRIBUTION.equals(name)) {
			releaseHistoricalContributionInterface(app, type, (HistoricalContributionInterface)baliinterface);
			return;
		}
		if (HISTORICALCONTRIBUTIONTAX.equals(name)) {
			releaseHistoricalContributionTaxInterface(app, type, (HistoricalContributionTaxInterface)baliinterface);
			return;
		}
		if (HISTORICALTHRESHOLDS.equals(name)) {
			releaseHistoricalThresholdsInterface(app, type, (HistoricalThresholdsInterface)baliinterface);
			return;
		}
		if (HQCONTRACTUNITCR.equals(name)) {
			releaseHqContractUnitCrInterface(app, type, (HqContractUnitCrInterface)baliinterface);
			return;
		}
		if (HQGROUPCONTRACTS.equals(name)) {
			releaseHqGroupContractsInterface(app, type, (HqGroupContractsInterface)baliinterface);
			return;
		}
		if (HQGROUPCORRIDOR.equals(name)) {
			releaseHqGroupCorridorInterface(app, type, (HqGroupCorridorInterface)baliinterface);
			return;
		}
		if (HQGROUPMEMBERS.equals(name)) {
			releaseHqGroupMembersInterface(app, type, (HqGroupMembersInterface)baliinterface);
			return;
		}
		if (HQGROUPPRODUCT.equals(name)) {
			releaseHqGroupProductInterface(app, type, (HqGroupProductInterface)baliinterface);
			return;
		}
		if (HQGROUPS.equals(name)) {
			releaseHqGroupsInterface(app, type, (HqGroupsInterface)baliinterface);
			return;
		}
		if (HQGROUPUSAGEREDIRECTMAP.equals(name)) {
			releaseHqgroupUsageRedirectMapInterface(app, type, (HqgroupUsageRedirectMapInterface)baliinterface);
			return;
		}
		if (INTERIMBILL.equals(name)) {
			releaseInterimBillInterface(app, type, (InterimBillInterface)baliinterface);
			return;
		}
		if (INVOICE.equals(name)) {
			releaseInvoiceInterface(app, type, (InvoiceInterface)baliinterface);
			return;
		}
		if (INVOICEDETAIL.equals(name)) {
			releaseInvoiceDetailInterface(app, type, (InvoiceDetailInterface)baliinterface);
			return;
		}
		if (INVOICEDETAILBULKADJUSTMENT.equals(name)) {
			releaseInvoiceDetailBulkAdjustmentInterface(app, type, (InvoiceDetailBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (LATEFEERATEOVERRIDES.equals(name)) {
			releaseLateFeeRateOverridesInterface(app, type, (LateFeeRateOverridesInterface)baliinterface);
			return;
		}
		if (LBXPAYMENTTYPE.equals(name)) {
			releaseLbxPaymentTypeInterface(app, type, (LbxPaymentTypeInterface)baliinterface);
			return;
		}
		if (MULTILINESADJ.equals(name)) {
			releaseMultiLinesAdjInterface(app, type, (MultiLinesAdjInterface)baliinterface);
			return;
		}
		if (NETACTION.equals(name)) {
			releaseNetActionInterface(app, type, (NetActionInterface)baliinterface);
			return;
		}
		if (NOTE.equals(name)) {
			releaseNoteInterface(app, type, (NoteInterface)baliinterface);
			return;
		}
		if (NOTECODE.equals(name)) {
			releaseNoteCodeInterface(app, type, (NoteCodeInterface)baliinterface);
			return;
		}
		if (NOTETEXT.equals(name)) {
			releaseNoteTextInterface(app, type, (NoteTextInterface)baliinterface);
			return;
		}
		if (OPENITEM.equals(name)) {
			releaseOpenItemInterface(app, type, (OpenItemInterface)baliinterface);
			return;
		}
		if (OPENITEMIDMAP.equals(name)) {
			releaseOpenItemIdMapInterface(app, type, (OpenItemIdMapInterface)baliinterface);
			return;
		}
		if (ORDERQUOTE.equals(name)) {
			releaseOrderQuoteInterface(app, type, (OrderQuoteInterface)baliinterface);
			return;
		}
		if (OVERRIDEDISCOUNTRATE.equals(name)) {
			releaseOverrideDiscountRateInterface(app, type, (OverrideDiscountRateInterface)baliinterface);
			return;
		}
		if (OVERRIDEUSAGECREDITRATE.equals(name)) {
			releaseOverrideUsageCreditRateInterface(app, type, (OverrideUsageCreditRateInterface)baliinterface);
			return;
		}
		if (OWNINGCOSTCENTER.equals(name)) {
			releaseOwningCostCenterInterface(app, type, (OwningCostCenterInterface)baliinterface);
			return;
		}
		if (PACKAGECOMPONENTDEF.equals(name)) {
			releasePackageComponentDefInterface(app, type, (PackageComponentDefInterface)baliinterface);
			return;
		}
		if (PAYMENT.equals(name)) {
			releasePaymentInterface(app, type, (PaymentInterface)baliinterface);
			return;
		}
		if (PAYMENTDISTRIBUTION.equals(name)) {
			releasePaymentDistributionInterface(app, type, (PaymentDistributionInterface)baliinterface);
			return;
		}
		if (PAYMENTMERCHANTID.equals(name)) {
			releasePaymentMerchantIdInterface(app, type, (PaymentMerchantIdInterface)baliinterface);
			return;
		}
		if (PAYMENTMERCHANTIDASSIGN.equals(name)) {
			releasePaymentMerchantIdAssignInterface(app, type, (PaymentMerchantIdAssignInterface)baliinterface);
			return;
		}
		if (PAYMENTPROFILE.equals(name)) {
			releasePaymentProfileInterface(app, type, (PaymentProfileInterface)baliinterface);
			return;
		}
		if (PAYMENTTRANS.equals(name)) {
			releasePaymentTransInterface(app, type, (PaymentTransInterface)baliinterface);
			return;
		}
		if (PAYMENTTYPE.equals(name)) {
			releasePaymentTypeInterface(app, type, (PaymentTypeInterface)baliinterface);
			return;
		}
		if (PREPAYMENT.equals(name)) {
			releasePrepaymentInterface(app, type, (PrepaymentInterface)baliinterface);
			return;
		}
		if (PREPAYMENTDISTRIBUTION.equals(name)) {
			releasePrepaymentDistributionInterface(app, type, (PrepaymentDistributionInterface)baliinterface);
			return;
		}
		if (PRIVACYLEVEL.equals(name)) {
			releasePrivacyLevelInterface(app, type, (PrivacyLevelInterface)baliinterface);
			return;
		}
		if (PRODUCTCATALOG.equals(name)) {
			releaseProductCatalogInterface(app, type, (ProductCatalogInterface)baliinterface);
			return;
		}
		if (PRODUCTCHARGEMAP.equals(name)) {
			releaseProductChargeMapInterface(app, type, (ProductChargeMapInterface)baliinterface);
			return;
		}
		if (PRODUCTRATEKEY.equals(name)) {
			releaseProductRateKeyInterface(app, type, (ProductRateKeyInterface)baliinterface);
			return;
		}
		if (PRODUCTRATEOVERRIDE.equals(name)) {
			releaseProductRateOverrideInterface(app, type, (ProductRateOverrideInterface)baliinterface);
			return;
		}
		if (PRODUCTRCRATE.equals(name)) {
			releaseProductRcRateInterface(app, type, (ProductRcRateInterface)baliinterface);
			return;
		}
		if (REFINANCEPLAN.equals(name)) {
			releaseRefinancePlanInterface(app, type, (RefinancePlanInterface)baliinterface);
			return;
		}
		if (REFUND.equals(name)) {
			releaseRefundInterface(app, type, (RefundInterface)baliinterface);
			return;
		}
		if (REFUNDREASON.equals(name)) {
			releaseRefundReasonInterface(app, type, (RefundReasonInterface)baliinterface);
			return;
		}
		if (REGULATORYID.equals(name)) {
			releaseRegulatoryIdInterface(app, type, (RegulatoryIdInterface)baliinterface);
			return;
		}
		if (REVRCVCOSTCENTER.equals(name)) {
			releaseRevRcvCostCenterInterface(app, type, (RevRcvCostCenterInterface)baliinterface);
			return;
		}
		if (REVERSEBULKADJUSTMENT.equals(name)) {
			releaseReverseBulkAdjustmentInterface(app, type, (ReverseBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (REWARDBALANCE.equals(name)) {
			releaseRewardBalanceInterface(app, type, (RewardBalanceInterface)baliinterface);
			return;
		}
		if (REWARDBALANCEENTITYMAPPING.equals(name)) {
			releaseRewardBalanceEntityMappingInterface(app, type, (RewardBalanceEntityMappingInterface)baliinterface);
			return;
		}
		if (RTPAYMENTRESPONSE.equals(name)) {
			releaseRtPaymentResponseInterface(app, type, (RtPaymentResponseInterface)baliinterface);
			return;
		}
		if (SALESCHANNEL.equals(name)) {
			releaseSalesChannelInterface(app, type, (SalesChannelInterface)baliinterface);
			return;
		}
		if (SECURITYACI.equals(name)) {
			releaseSecurityAciInterface(app, type, (SecurityAciInterface)baliinterface);
			return;
		}
		if (SECURITYRESOURCE.equals(name)) {
			releaseSecurityResourceInterface(app, type, (SecurityResourceInterface)baliinterface);
			return;
		}
		if (SECURITYROLE.equals(name)) {
			releaseSecurityRoleInterface(app, type, (SecurityRoleInterface)baliinterface);
			return;
		}
		if (SECURITYUSER.equals(name)) {
			releaseSecurityUserInterface(app, type, (SecurityUserInterface)baliinterface);
			return;
		}
		if (SERVER.equals(name)) {
			releaseServerInterface(app, type, (ServerInterface)baliinterface);
			return;
		}
		if (SERVERCATEGORY.equals(name)) {
			releaseServerCategoryInterface(app, type, (ServerCategoryInterface)baliinterface);
			return;
		}
		if (SERVERDEFINITION.equals(name)) {
			releaseServerDefinitionInterface(app, type, (ServerDefinitionInterface)baliinterface);
			return;
		}
		if (SERVICECENTER.equals(name)) {
			releaseServiceCenterInterface(app, type, (ServiceCenterInterface)baliinterface);
			return;
		}
		if (SERVICECENTERTYPE.equals(name)) {
			releaseServiceCenterTypeInterface(app, type, (ServiceCenterTypeInterface)baliinterface);
			return;
		}
		if (SERVICEMASTERGROUP.equals(name)) {
			releaseServiceMasterGroupInterface(app, type, (ServiceMasterGroupInterface)baliinterface);
			return;
		}
		if (SERVICEPRICINGPLAN.equals(name)) {
			releaseServicePricingPlanInterface(app, type, (ServicePricingPlanInterface)baliinterface);
			return;
		}
		if (SERVICEZONE.equals(name)) {
			releaseServiceZoneInterface(app, type, (ServiceZoneInterface)baliinterface);
			return;
		}
		if (SLAMEASUREMENTDATA.equals(name)) {
			releaseSlaMeasurementDataInterface(app, type, (SlaMeasurementDataInterface)baliinterface);
			return;
		}
		if (STATUSREASONMAP.equals(name)) {
			releaseStatusReasonMapInterface(app, type, (StatusReasonMapInterface)baliinterface);
			return;
		}
		if (TAXABANDONED.equals(name)) {
			releaseTaxAbandonedInterface(app, type, (TaxAbandonedInterface)baliinterface);
			return;
		}
		if (TAXASSIGNMENT.equals(name)) {
			releaseTaxAssignmentInterface(app, type, (TaxAssignmentInterface)baliinterface);
			return;
		}
		if (TAXEXEMPTION.equals(name)) {
			releaseTaxExemptionInterface(app, type, (TaxExemptionInterface)baliinterface);
			return;
		}
		if (TAXPACKAGEINST.equals(name)) {
			releaseTaxPackageInstInterface(app, type, (TaxPackageInstInterface)baliinterface);
			return;
		}
		if (TAXRATESVAT.equals(name)) {
			releaseTaxRatesVatInterface(app, type, (TaxRatesVatInterface)baliinterface);
			return;
		}
		if (TAXSTATUS.equals(name)) {
			releaseTaxStatusInterface(app, type, (TaxStatusInterface)baliinterface);
			return;
		}
		if (TAXTYPECOMM.equals(name)) {
			releaseTaxTypeCommInterface(app, type, (TaxTypeCommInterface)baliinterface);
			return;
		}
		if (TIMEZONE.equals(name)) {
			releaseTimezoneInterface(app, type, (TimezoneInterface)baliinterface);
			return;
		}
		if (TRANSSOURCETYPE.equals(name)) {
			releaseTransSourceTypeInterface(app, type, (TransSourceTypeInterface)baliinterface);
			return;
		}
		if (TRANSFERREASON.equals(name)) {
			releaseTransferReasonInterface(app, type, (TransferReasonInterface)baliinterface);
			return;
		}
		if (UNAPPLIEDPAYMENT.equals(name)) {
			releaseUnappliedPaymentInterface(app, type, (UnappliedPaymentInterface)baliinterface);
			return;
		}
		if (UNBILLEDUSAGE.equals(name)) {
			releaseUnbilledUsageInterface(app, type, (UnbilledUsageInterface)baliinterface);
			return;
		}
		if (UNBILLEDUSAGEBULKADJUSTMENT.equals(name)) {
			releaseUnbilledUsageBulkAdjustmentInterface(app, type, (UnbilledUsageBulkAdjustmentInterface)baliinterface);
			return;
		}
		if (USAGECREDITRATE.equals(name)) {
			releaseUsageCreditRateInterface(app, type, (UsageCreditRateInterface)baliinterface);
			return;
		}
		if (VIPCODE.equals(name)) {
			releaseVipCodeInterface(app, type, (VipCodeInterface)baliinterface);
			return;
		}
		if (VOUCHERDEFINITIONS.equals(name)) {
			releaseVoucherDefinitionsInterface(app, type, (VoucherDefinitionsInterface)baliinterface);
			return;
		}
		if (VOUCHERHISTORY.equals(name)) {
			releaseVoucherHistoryInterface(app, type, (VoucherHistoryInterface)baliinterface);
			return;
		}
		if (VOUCHERLOCATION.equals(name)) {
			releaseVoucherLocationInterface(app, type, (VoucherLocationInterface)baliinterface);
			return;
		}
		if (VOUCHERSTATUS.equals(name)) {
			releaseVoucherStatusInterface(app, type, (VoucherStatusInterface)baliinterface);
			return;
		}
		if (VOUCHERSTATUSINFO.equals(name)) {
			releaseVoucherStatusInfoInterface(app, type, (VoucherStatusInfoInterface)baliinterface);
			return;
		}
		if (VOUCHERSTATUSMOVEMENT.equals(name)) {
			releaseVoucherStatusMovementInterface(app, type, (VoucherStatusMovementInterface)baliinterface);
			return;
		}
		if (VOUCHERTYPES.equals(name)) {
			releaseVoucherTypesInterface(app, type, (VoucherTypesInterface)baliinterface);
			return;
		}
		if (WRITEOFF.equals(name)) {
			releaseWriteoffInterface(app, type, (WriteoffInterface)baliinterface);
			return;
		}
		throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for name = "+name);
	}
	public AbiAutoPayCmfMapInterface getAbiAutoPayCmfMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiAutoPayCmfMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMap");
		return this.getAbiAutoPayCmfMapInterface(defaultApp, defaultType);
	}
	public void releaseAbiAutoPayCmfMapInterface(AbiAutoPayCmfMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
		this.releaseAbiAutoPayCmfMapInterface(defaultApp, defaultType, obj);
	}
	public AbiAutoPayCmfMapInterface getAbiAutoPayCmfMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiAutoPayCmfMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAbiAutoPayCmfMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
				return factory.getAbiAutoPayCmfMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAbiAutoPayCmfMapInterface(String appName, String type,AbiAutoPayCmfMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAbiAutoPayCmfMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
				factory.releaseAbiAutoPayCmfMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AbiBillMessagesInterface getAbiBillMessagesInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillMessages");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessages");
		return this.getAbiBillMessagesInterface(defaultApp, defaultType);
	}
	public void releaseAbiBillMessagesInterface(AbiBillMessagesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillMessagesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillMessagesInterface");
		this.releaseAbiBillMessagesInterface(defaultApp, defaultType, obj);
	}
	public AbiBillMessagesInterface getAbiBillMessagesInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillMessagesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAbiBillMessagesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
				return factory.getAbiBillMessagesInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAbiBillMessagesInterface(String appName, String type,AbiBillMessagesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillMessagesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAbiBillMessagesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillMessagesInterface");
				factory.releaseAbiBillMessagesInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillMessagesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillMessagesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AbiBillingStatisticsInterface getAbiBillingStatisticsInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillingStatistics");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatistics");
		return this.getAbiBillingStatisticsInterface(defaultApp, defaultType);
	}
	public void releaseAbiBillingStatisticsInterface(AbiBillingStatisticsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillingStatisticsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillingStatisticsInterface");
		this.releaseAbiBillingStatisticsInterface(defaultApp, defaultType, obj);
	}
	public AbiBillingStatisticsInterface getAbiBillingStatisticsInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillingStatisticsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAbiBillingStatisticsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
				return factory.getAbiBillingStatisticsInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAbiBillingStatisticsInterface(String appName, String type,AbiBillingStatisticsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillingStatisticsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAbiBillingStatisticsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillingStatisticsInterface");
				factory.releaseAbiBillingStatisticsInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillingStatisticsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillingStatisticsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AbiNrcDucInterface getAbiNrcDucInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiNrcDuc");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDuc");
		return this.getAbiNrcDucInterface(defaultApp, defaultType);
	}
	public void releaseAbiNrcDucInterface(AbiNrcDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiNrcDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiNrcDucInterface");
		this.releaseAbiNrcDucInterface(defaultApp, defaultType, obj);
	}
	public AbiNrcDucInterface getAbiNrcDucInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiNrcDucInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAbiNrcDucInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
				return factory.getAbiNrcDucInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAbiNrcDucInterface(String appName, String type,AbiNrcDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiNrcDucInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAbiNrcDucInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiNrcDucInterface");
				factory.releaseAbiNrcDucInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiNrcDucInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiNrcDucInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountInterface getAccountInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccount");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccount");
		return this.getAccountInterface(defaultApp, defaultType);
	}
	public void releaseAccountInterface(AccountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInterface");
		this.releaseAccountInterface(defaultApp, defaultType, obj);
	}
	public AccountInterface getAccountInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
				return factory.getAccountInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountInterface(String appName, String type,AccountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInterface");
				factory.releaseAccountInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountAbiSourceInterface getAccountAbiSourceInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountAbiSource");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSource");
		return this.getAccountAbiSourceInterface(defaultApp, defaultType);
	}
	public void releaseAccountAbiSourceInterface(AccountAbiSourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountAbiSourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountAbiSourceInterface");
		this.releaseAccountAbiSourceInterface(defaultApp, defaultType, obj);
	}
	public AccountAbiSourceInterface getAccountAbiSourceInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountAbiSourceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountAbiSourceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
				return factory.getAccountAbiSourceInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountAbiSourceInterface(String appName, String type,AccountAbiSourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountAbiSourceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountAbiSourceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountAbiSourceInterface");
				factory.releaseAccountAbiSourceInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountAbiSourceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountAbiSourceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountBalancesInterface getAccountBalancesInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBalances");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalances");
		return this.getAccountBalancesInterface(defaultApp, defaultType);
	}
	public void releaseAccountBalancesInterface(AccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBalancesInterface");
		this.releaseAccountBalancesInterface(defaultApp, defaultType, obj);
	}
	public AccountBalancesInterface getAccountBalancesInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBalancesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountBalancesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
				return factory.getAccountBalancesInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountBalancesInterface(String appName, String type,AccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBalancesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountBalancesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBalancesInterface");
				factory.releaseAccountBalancesInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBalancesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBalancesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountBonusPointBalanceInterface getAccountBonusPointBalanceInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointBalance");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalance");
		return this.getAccountBonusPointBalanceInterface(defaultApp, defaultType);
	}
	public void releaseAccountBonusPointBalanceInterface(AccountBonusPointBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointBalanceInterface");
		this.releaseAccountBonusPointBalanceInterface(defaultApp, defaultType, obj);
	}
	public AccountBonusPointBalanceInterface getAccountBonusPointBalanceInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointBalanceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountBonusPointBalanceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
				return factory.getAccountBonusPointBalanceInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountBonusPointBalanceInterface(String appName, String type,AccountBonusPointBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointBalanceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountBonusPointBalanceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointBalanceInterface");
				factory.releaseAccountBonusPointBalanceInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointBalanceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointBalanceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountBonusPointTransactionInterface getAccountBonusPointTransactionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointTransaction");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransaction");
		return this.getAccountBonusPointTransactionInterface(defaultApp, defaultType);
	}
	public void releaseAccountBonusPointTransactionInterface(AccountBonusPointTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointTransactionInterface");
		this.releaseAccountBonusPointTransactionInterface(defaultApp, defaultType, obj);
	}
	public AccountBonusPointTransactionInterface getAccountBonusPointTransactionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointTransactionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountBonusPointTransactionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
				return factory.getAccountBonusPointTransactionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountBonusPointTransactionInterface(String appName, String type,AccountBonusPointTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointTransactionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountBonusPointTransactionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointTransactionInterface");
				factory.releaseAccountBonusPointTransactionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointTransactionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointTransactionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountCodeInterface getAccountCodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCode");
		return this.getAccountCodeInterface(defaultApp, defaultType);
	}
	public void releaseAccountCodeInterface(AccountCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeInterface");
		this.releaseAccountCodeInterface(defaultApp, defaultType, obj);
	}
	public AccountCodeInterface getAccountCodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
				return factory.getAccountCodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountCodeInterface(String appName, String type,AccountCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeInterface");
				factory.releaseAccountCodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountCodeGroupInterface getAccountCodeGroupInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroup");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroup");
		return this.getAccountCodeGroupInterface(defaultApp, defaultType);
	}
	public void releaseAccountCodeGroupInterface(AccountCodeGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeGroupInterface");
		this.releaseAccountCodeGroupInterface(defaultApp, defaultType, obj);
	}
	public AccountCodeGroupInterface getAccountCodeGroupInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountCodeGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
				return factory.getAccountCodeGroupInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountCodeGroupInterface(String appName, String type,AccountCodeGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountCodeGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeGroupInterface");
				factory.releaseAccountCodeGroupInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountHqContractInterface getAccountHqContractInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountHqContract");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContract");
		return this.getAccountHqContractInterface(defaultApp, defaultType);
	}
	public void releaseAccountHqContractInterface(AccountHqContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountHqContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountHqContractInterface");
		this.releaseAccountHqContractInterface(defaultApp, defaultType, obj);
	}
	public AccountHqContractInterface getAccountHqContractInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountHqContractInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountHqContractInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
				return factory.getAccountHqContractInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountHqContractInterface(String appName, String type,AccountHqContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountHqContractInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountHqContractInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountHqContractInterface");
				factory.releaseAccountHqContractInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountHqContractInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountHqContractInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountIdInterface getAccountIdInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountId");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountId");
		return this.getAccountIdInterface(defaultApp, defaultType);
	}
	public void releaseAccountIdInterface(AccountIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountIdInterface");
		this.releaseAccountIdInterface(defaultApp, defaultType, obj);
	}
	public AccountIdInterface getAccountIdInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountIdInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountIdInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
				return factory.getAccountIdInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountIdInterface(String appName, String type,AccountIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountIdInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountIdInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountIdInterface");
				factory.releaseAccountIdInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountIdInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountIdInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountInsertInterface getAccountInsertInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInsert");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsert");
		return this.getAccountInsertInterface(defaultApp, defaultType);
	}
	public void releaseAccountInsertInterface(AccountInsertInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInsertInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInsertInterface");
		this.releaseAccountInsertInterface(defaultApp, defaultType, obj);
	}
	public AccountInsertInterface getAccountInsertInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInsertInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountInsertInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
				return factory.getAccountInsertInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountInsertInterface(String appName, String type,AccountInsertInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInsertInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountInsertInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInsertInterface");
				factory.releaseAccountInsertInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInsertInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInsertInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountLocateInterface getAccountLocateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountLocate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocate");
		return this.getAccountLocateInterface(defaultApp, defaultType);
	}
	public void releaseAccountLocateInterface(AccountLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountLocateInterface");
		this.releaseAccountLocateInterface(defaultApp, defaultType, obj);
	}
	public AccountLocateInterface getAccountLocateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountLocateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountLocateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
				return factory.getAccountLocateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountLocateInterface(String appName, String type,AccountLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountLocateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountLocateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountLocateInterface");
				factory.releaseAccountLocateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountLocateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountLocateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountMessageInterface getAccountMessageInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountMessage");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessage");
		return this.getAccountMessageInterface(defaultApp, defaultType);
	}
	public void releaseAccountMessageInterface(AccountMessageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountMessageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountMessageInterface");
		this.releaseAccountMessageInterface(defaultApp, defaultType, obj);
	}
	public AccountMessageInterface getAccountMessageInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountMessageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountMessageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
				return factory.getAccountMessageInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountMessageInterface(String appName, String type,AccountMessageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountMessageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountMessageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountMessageInterface");
				factory.releaseAccountMessageInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountMessageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountMessageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountSegmentInterface getAccountSegmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegment");
		return this.getAccountSegmentInterface(defaultApp, defaultType);
	}
	public void releaseAccountSegmentInterface(AccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentInterface");
		this.releaseAccountSegmentInterface(defaultApp, defaultType, obj);
	}
	public AccountSegmentInterface getAccountSegmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountSegmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
				return factory.getAccountSegmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountSegmentInterface(String appName, String type,AccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountSegmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentInterface");
				factory.releaseAccountSegmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountSegmentMapInterface getAccountSegmentMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMap");
		return this.getAccountSegmentMapInterface(defaultApp, defaultType);
	}
	public void releaseAccountSegmentMapInterface(AccountSegmentMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentMapInterface");
		this.releaseAccountSegmentMapInterface(defaultApp, defaultType, obj);
	}
	public AccountSegmentMapInterface getAccountSegmentMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountSegmentMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
				return factory.getAccountSegmentMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountSegmentMapInterface(String appName, String type,AccountSegmentMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountSegmentMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentMapInterface");
				factory.releaseAccountSegmentMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AccountStatusInterface getAccountStatusInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatus");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatus");
		return this.getAccountStatusInterface(defaultApp, defaultType);
	}
	public void releaseAccountStatusInterface(AccountStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountStatusInterface");
		this.releaseAccountStatusInterface(defaultApp, defaultType, obj);
	}
	public AccountStatusInterface getAccountStatusInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAccountStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
				return factory.getAccountStatusInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAccountStatusInterface(String appName, String type,AccountStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAccountStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountStatusInterface");
				factory.releaseAccountStatusInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AdjustmentInterface getAdjustmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustment");
		return this.getAdjustmentInterface(defaultApp, defaultType);
	}
	public void releaseAdjustmentInterface(AdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentInterface");
		this.releaseAdjustmentInterface(defaultApp, defaultType, obj);
	}
	public AdjustmentInterface getAdjustmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
				return factory.getAdjustmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAdjustmentInterface(String appName, String type,AdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentInterface");
				factory.releaseAdjustmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AdjustmentReasonInterface getAdjustmentReasonInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentReason");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReason");
		return this.getAdjustmentReasonInterface(defaultApp, defaultType);
	}
	public void releaseAdjustmentReasonInterface(AdjustmentReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentReasonInterface");
		this.releaseAdjustmentReasonInterface(defaultApp, defaultType, obj);
	}
	public AdjustmentReasonInterface getAdjustmentReasonInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAdjustmentReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
				return factory.getAdjustmentReasonInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAdjustmentReasonInterface(String appName, String type,AdjustmentReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAdjustmentReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentReasonInterface");
				factory.releaseAdjustmentReasonInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AdjustmentTaxInterface getAdjustmentTaxInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTax");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTax");
		return this.getAdjustmentTaxInterface(defaultApp, defaultType);
	}
	public void releaseAdjustmentTaxInterface(AdjustmentTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTaxInterface");
		this.releaseAdjustmentTaxInterface(defaultApp, defaultType, obj);
	}
	public AdjustmentTaxInterface getAdjustmentTaxInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTaxInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAdjustmentTaxInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
				return factory.getAdjustmentTaxInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAdjustmentTaxInterface(String appName, String type,AdjustmentTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTaxInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAdjustmentTaxInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTaxInterface");
				factory.releaseAdjustmentTaxInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTaxInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTaxInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AdjustmentTypeInterface getAdjustmentTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentType");
		return this.getAdjustmentTypeInterface(defaultApp, defaultType);
	}
	public void releaseAdjustmentTypeInterface(AdjustmentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTypeInterface");
		this.releaseAdjustmentTypeInterface(defaultApp, defaultType, obj);
	}
	public AdjustmentTypeInterface getAdjustmentTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAdjustmentTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
				return factory.getAdjustmentTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAdjustmentTypeInterface(String appName, String type,AdjustmentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAdjustmentTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTypeInterface");
				factory.releaseAdjustmentTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AxrtCountryCodeMapInterface getAxrtCountryCodeMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCountryCodeMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMap");
		return this.getAxrtCountryCodeMapInterface(defaultApp, defaultType);
	}
	public void releaseAxrtCountryCodeMapInterface(AxrtCountryCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCountryCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCountryCodeMapInterface");
		this.releaseAxrtCountryCodeMapInterface(defaultApp, defaultType, obj);
	}
	public AxrtCountryCodeMapInterface getAxrtCountryCodeMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCountryCodeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAxrtCountryCodeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
				return factory.getAxrtCountryCodeMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAxrtCountryCodeMapInterface(String appName, String type,AxrtCountryCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCountryCodeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAxrtCountryCodeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCountryCodeMapInterface");
				factory.releaseAxrtCountryCodeMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCountryCodeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCountryCodeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AxrtCurrCodeMapInterface getAxrtCurrCodeMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrCodeMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMap");
		return this.getAxrtCurrCodeMapInterface(defaultApp, defaultType);
	}
	public void releaseAxrtCurrCodeMapInterface(AxrtCurrCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrCodeMapInterface");
		this.releaseAxrtCurrCodeMapInterface(defaultApp, defaultType, obj);
	}
	public AxrtCurrCodeMapInterface getAxrtCurrCodeMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrCodeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAxrtCurrCodeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
				return factory.getAxrtCurrCodeMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAxrtCurrCodeMapInterface(String appName, String type,AxrtCurrCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrCodeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAxrtCurrCodeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrCodeMapInterface");
				factory.releaseAxrtCurrCodeMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrCodeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrCodeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AxrtCurrencyCodeMapInterface getAxrtCurrencyCodeMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrencyCodeMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMap");
		return this.getAxrtCurrencyCodeMapInterface(defaultApp, defaultType);
	}
	public void releaseAxrtCurrencyCodeMapInterface(AxrtCurrencyCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
		this.releaseAxrtCurrencyCodeMapInterface(defaultApp, defaultType, obj);
	}
	public AxrtCurrencyCodeMapInterface getAxrtCurrencyCodeMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrencyCodeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAxrtCurrencyCodeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
				return factory.getAxrtCurrencyCodeMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAxrtCurrencyCodeMapInterface(String appName, String type,AxrtCurrencyCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAxrtCurrencyCodeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
				factory.releaseAxrtCurrencyCodeMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AxrtPaymentInterface getAxrtPaymentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPayment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPayment");
		return this.getAxrtPaymentInterface(defaultApp, defaultType);
	}
	public void releaseAxrtPaymentInterface(AxrtPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentInterface");
		this.releaseAxrtPaymentInterface(defaultApp, defaultType, obj);
	}
	public AxrtPaymentInterface getAxrtPaymentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAxrtPaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
				return factory.getAxrtPaymentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAxrtPaymentInterface(String appName, String type,AxrtPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAxrtPaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentInterface");
				factory.releaseAxrtPaymentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AxrtPaymentMerchantInterface getAxrtPaymentMerchantInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentMerchant");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchant");
		return this.getAxrtPaymentMerchantInterface(defaultApp, defaultType);
	}
	public void releaseAxrtPaymentMerchantInterface(AxrtPaymentMerchantInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentMerchantInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentMerchantInterface");
		this.releaseAxrtPaymentMerchantInterface(defaultApp, defaultType, obj);
	}
	public AxrtPaymentMerchantInterface getAxrtPaymentMerchantInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentMerchantInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAxrtPaymentMerchantInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
				return factory.getAxrtPaymentMerchantInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAxrtPaymentMerchantInterface(String appName, String type,AxrtPaymentMerchantInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentMerchantInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAxrtPaymentMerchantInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentMerchantInterface");
				factory.releaseAxrtPaymentMerchantInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentMerchantInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentMerchantInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AxrtPaymentProfileInterface getAxrtPaymentProfileInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentProfile");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfile");
		return this.getAxrtPaymentProfileInterface(defaultApp, defaultType);
	}
	public void releaseAxrtPaymentProfileInterface(AxrtPaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentProfileInterface");
		this.releaseAxrtPaymentProfileInterface(defaultApp, defaultType, obj);
	}
	public AxrtPaymentProfileInterface getAxrtPaymentProfileInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentProfileInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAxrtPaymentProfileInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
				return factory.getAxrtPaymentProfileInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAxrtPaymentProfileInterface(String appName, String type,AxrtPaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentProfileInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAxrtPaymentProfileInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentProfileInterface");
				factory.releaseAxrtPaymentProfileInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentProfileInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentProfileInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public AxrtPaymentTransInterface getAxrtPaymentTransInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentTrans");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTrans");
		return this.getAxrtPaymentTransInterface(defaultApp, defaultType);
	}
	public void releaseAxrtPaymentTransInterface(AxrtPaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentTransInterface");
		this.releaseAxrtPaymentTransInterface(defaultApp, defaultType, obj);
	}
	public AxrtPaymentTransInterface getAxrtPaymentTransInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentTransInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getAxrtPaymentTransInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
				return factory.getAxrtPaymentTransInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseAxrtPaymentTransInterface(String appName, String type,AxrtPaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentTransInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseAxrtPaymentTransInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentTransInterface");
				factory.releaseAxrtPaymentTransInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentTransInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentTransInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BalanceLineItemInterface getBalanceLineItemInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItem");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItem");
		return this.getBalanceLineItemInterface(defaultApp, defaultType);
	}
	public void releaseBalanceLineItemInterface(BalanceLineItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemInterface");
		this.releaseBalanceLineItemInterface(defaultApp, defaultType, obj);
	}
	public BalanceLineItemInterface getBalanceLineItemInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBalanceLineItemInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
				return factory.getBalanceLineItemInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBalanceLineItemInterface(String appName, String type,BalanceLineItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBalanceLineItemInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemInterface");
				factory.releaseBalanceLineItemInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BalanceLineItemBulkAdjustmentInterface getBalanceLineItemBulkAdjustmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemBulkAdjustment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustment");
		return this.getBalanceLineItemBulkAdjustmentInterface(defaultApp, defaultType);
	}
	public void releaseBalanceLineItemBulkAdjustmentInterface(BalanceLineItemBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
		this.releaseBalanceLineItemBulkAdjustmentInterface(defaultApp, defaultType, obj);
	}
	public BalanceLineItemBulkAdjustmentInterface getBalanceLineItemBulkAdjustmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
				return factory.getBalanceLineItemBulkAdjustmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBalanceLineItemBulkAdjustmentInterface(String appName, String type,BalanceLineItemBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
				factory.releaseBalanceLineItemBulkAdjustmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BalanceXferDiffInterface getBalanceXferDiffInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceXferDiff");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiff");
		return this.getBalanceXferDiffInterface(defaultApp, defaultType);
	}
	public void releaseBalanceXferDiffInterface(BalanceXferDiffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceXferDiffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceXferDiffInterface");
		this.releaseBalanceXferDiffInterface(defaultApp, defaultType, obj);
	}
	public BalanceXferDiffInterface getBalanceXferDiffInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceXferDiffInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBalanceXferDiffInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
				return factory.getBalanceXferDiffInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBalanceXferDiffInterface(String appName, String type,BalanceXferDiffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceXferDiffInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBalanceXferDiffInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceXferDiffInterface");
				factory.releaseBalanceXferDiffInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceXferDiffInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceXferDiffInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BamErrorCodeInterface getBamErrorCodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBamErrorCode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCode");
		return this.getBamErrorCodeInterface(defaultApp, defaultType);
	}
	public void releaseBamErrorCodeInterface(BamErrorCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBamErrorCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBamErrorCodeInterface");
		this.releaseBamErrorCodeInterface(defaultApp, defaultType, obj);
	}
	public BamErrorCodeInterface getBamErrorCodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBamErrorCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBamErrorCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
				return factory.getBamErrorCodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBamErrorCodeInterface(String appName, String type,BamErrorCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBamErrorCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBamErrorCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBamErrorCodeInterface");
				factory.releaseBamErrorCodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBamErrorCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBamErrorCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillCycleInterface getBillCycleInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCycle");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycle");
		return this.getBillCycleInterface(defaultApp, defaultType);
	}
	public void releaseBillCycleInterface(BillCycleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillCycleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillCycleInterface");
		this.releaseBillCycleInterface(defaultApp, defaultType, obj);
	}
	public BillCycleInterface getBillCycleInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCycleInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillCycleInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
				return factory.getBillCycleInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillCycleInterface(String appName, String type,BillCycleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillCycleInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillCycleInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillCycleInterface");
				factory.releaseBillCycleInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillCycleInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillCycleInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillDispatchMethodInterface getBillDispatchMethodInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispatchMethod");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethod");
		return this.getBillDispatchMethodInterface(defaultApp, defaultType);
	}
	public void releaseBillDispatchMethodInterface(BillDispatchMethodInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillDispatchMethodInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillDispatchMethodInterface");
		this.releaseBillDispatchMethodInterface(defaultApp, defaultType, obj);
	}
	public BillDispatchMethodInterface getBillDispatchMethodInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispatchMethodInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillDispatchMethodInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
				return factory.getBillDispatchMethodInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillDispatchMethodInterface(String appName, String type,BillDispatchMethodInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillDispatchMethodInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillDispatchMethodInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillDispatchMethodInterface");
				factory.releaseBillDispatchMethodInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillDispatchMethodInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillDispatchMethodInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillImageInterface getBillImageInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImage");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImage");
		return this.getBillImageInterface(defaultApp, defaultType);
	}
	public void releaseBillImageInterface(BillImageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImageInterface");
		this.releaseBillImageInterface(defaultApp, defaultType, obj);
	}
	public BillImageInterface getBillImageInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillImageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
				return factory.getBillImageInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillImageInterface(String appName, String type,BillImageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillImageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImageInterface");
				factory.releaseBillImageInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillImagePageInterface getBillImagePageInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImagePage");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePage");
		return this.getBillImagePageInterface(defaultApp, defaultType);
	}
	public void releaseBillImagePageInterface(BillImagePageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImagePageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImagePageInterface");
		this.releaseBillImagePageInterface(defaultApp, defaultType, obj);
	}
	public BillImagePageInterface getBillImagePageInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImagePageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillImagePageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
				return factory.getBillImagePageInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillImagePageInterface(String appName, String type,BillImagePageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImagePageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillImagePageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImagePageInterface");
				factory.releaseBillImagePageInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImagePageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImagePageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillInsertGroupInterface getBillInsertGroupInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroup");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroup");
		return this.getBillInsertGroupInterface(defaultApp, defaultType);
	}
	public void releaseBillInsertGroupInterface(BillInsertGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupInterface");
		this.releaseBillInsertGroupInterface(defaultApp, defaultType, obj);
	}
	public BillInsertGroupInterface getBillInsertGroupInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillInsertGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
				return factory.getBillInsertGroupInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillInsertGroupInterface(String appName, String type,BillInsertGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillInsertGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupInterface");
				factory.releaseBillInsertGroupInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillInsertGroupMapInterface getBillInsertGroupMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMap");
		return this.getBillInsertGroupMapInterface(defaultApp, defaultType);
	}
	public void releaseBillInsertGroupMapInterface(BillInsertGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupMapInterface");
		this.releaseBillInsertGroupMapInterface(defaultApp, defaultType, obj);
	}
	public BillInsertGroupMapInterface getBillInsertGroupMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillInsertGroupMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
				return factory.getBillInsertGroupMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillInsertGroupMapInterface(String appName, String type,BillInsertGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillInsertGroupMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupMapInterface");
				factory.releaseBillInsertGroupMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillMessageGroupInterface getBillMessageGroupInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroup");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroup");
		return this.getBillMessageGroupInterface(defaultApp, defaultType);
	}
	public void releaseBillMessageGroupInterface(BillMessageGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupInterface");
		this.releaseBillMessageGroupInterface(defaultApp, defaultType, obj);
	}
	public BillMessageGroupInterface getBillMessageGroupInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillMessageGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
				return factory.getBillMessageGroupInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillMessageGroupInterface(String appName, String type,BillMessageGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillMessageGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupInterface");
				factory.releaseBillMessageGroupInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BillMessageGroupMapInterface getBillMessageGroupMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMap");
		return this.getBillMessageGroupMapInterface(defaultApp, defaultType);
	}
	public void releaseBillMessageGroupMapInterface(BillMessageGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupMapInterface");
		this.releaseBillMessageGroupMapInterface(defaultApp, defaultType, obj);
	}
	public BillMessageGroupMapInterface getBillMessageGroupMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBillMessageGroupMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
				return factory.getBillMessageGroupMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBillMessageGroupMapInterface(String appName, String type,BillMessageGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBillMessageGroupMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupMapInterface");
				factory.releaseBillMessageGroupMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BilledUsageInterface getBilledUsageInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsage");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsage");
		return this.getBilledUsageInterface(defaultApp, defaultType);
	}
	public void releaseBilledUsageInterface(BilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageInterface");
		this.releaseBilledUsageInterface(defaultApp, defaultType, obj);
	}
	public BilledUsageInterface getBilledUsageInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBilledUsageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
				return factory.getBilledUsageInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBilledUsageInterface(String appName, String type,BilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBilledUsageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageInterface");
				factory.releaseBilledUsageInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BilledUsageBulkAdjustmentInterface getBilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageBulkAdjustment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustment");
		return this.getBilledUsageBulkAdjustmentInterface(defaultApp, defaultType);
	}
	public void releaseBilledUsageBulkAdjustmentInterface(BilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
		this.releaseBilledUsageBulkAdjustmentInterface(defaultApp, defaultType, obj);
	}
	public BilledUsageBulkAdjustmentInterface getBilledUsageBulkAdjustmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBilledUsageBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
				return factory.getBilledUsageBulkAdjustmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBilledUsageBulkAdjustmentInterface(String appName, String type,BilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
				factory.releaseBilledUsageBulkAdjustmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BonusPointRateInterface getBonusPointRateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointRate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRate");
		return this.getBonusPointRateInterface(defaultApp, defaultType);
	}
	public void releaseBonusPointRateInterface(BonusPointRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointRateInterface");
		this.releaseBonusPointRateInterface(defaultApp, defaultType, obj);
	}
	public BonusPointRateInterface getBonusPointRateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBonusPointRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
				return factory.getBonusPointRateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBonusPointRateInterface(String appName, String type,BonusPointRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBonusPointRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointRateInterface");
				factory.releaseBonusPointRateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public BonusPointTransTypeInterface getBonusPointTransTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransType");
		return this.getBonusPointTransTypeInterface(defaultApp, defaultType);
	}
	public void releaseBonusPointTransTypeInterface(BonusPointTransTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointTransTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointTransTypeInterface");
		this.releaseBonusPointTransTypeInterface(defaultApp, defaultType, obj);
	}
	public BonusPointTransTypeInterface getBonusPointTransTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getBonusPointTransTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
				return factory.getBonusPointTransTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseBonusPointTransTypeInterface(String appName, String type,BonusPointTransTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointTransTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseBonusPointTransTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointTransTypeInterface");
				factory.releaseBonusPointTransTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointTransTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointTransTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CcAuditLogInterface getCcAuditLogInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcAuditLog");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLog");
		return this.getCcAuditLogInterface(defaultApp, defaultType);
	}
	public void releaseCcAuditLogInterface(CcAuditLogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCcAuditLogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCcAuditLogInterface");
		this.releaseCcAuditLogInterface(defaultApp, defaultType, obj);
	}
	public CcAuditLogInterface getCcAuditLogInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcAuditLogInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCcAuditLogInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
				return factory.getCcAuditLogInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCcAuditLogInterface(String appName, String type,CcAuditLogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCcAuditLogInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCcAuditLogInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCcAuditLogInterface");
				factory.releaseCcAuditLogInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCcAuditLogInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCcAuditLogInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CdrDataDucInterface getCdrDataDucInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataDuc");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDuc");
		return this.getCdrDataDucInterface(defaultApp, defaultType);
	}
	public void releaseCdrDataDucInterface(CdrDataDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCdrDataDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCdrDataDucInterface");
		this.releaseCdrDataDucInterface(defaultApp, defaultType, obj);
	}
	public CdrDataDucInterface getCdrDataDucInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataDucInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCdrDataDucInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
				return factory.getCdrDataDucInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCdrDataDucInterface(String appName, String type,CdrDataDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCdrDataDucInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCdrDataDucInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCdrDataDucInterface");
				factory.releaseCdrDataDucInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCdrDataDucInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCdrDataDucInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ChargeDistribPercentInterface getChargeDistribPercentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDistribPercent");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercent");
		return this.getChargeDistribPercentInterface(defaultApp, defaultType);
	}
	public void releaseChargeDistribPercentInterface(ChargeDistribPercentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseChargeDistribPercentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseChargeDistribPercentInterface");
		this.releaseChargeDistribPercentInterface(defaultApp, defaultType, obj);
	}
	public ChargeDistribPercentInterface getChargeDistribPercentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDistribPercentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getChargeDistribPercentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
				return factory.getChargeDistribPercentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseChargeDistribPercentInterface(String appName, String type,ChargeDistribPercentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseChargeDistribPercentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseChargeDistribPercentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseChargeDistribPercentInterface");
				factory.releaseChargeDistribPercentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseChargeDistribPercentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseChargeDistribPercentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ClearingHouseInterface getClearingHouseInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouse");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouse");
		return this.getClearingHouseInterface(defaultApp, defaultType);
	}
	public void releaseClearingHouseInterface(ClearingHouseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInterface");
		this.releaseClearingHouseInterface(defaultApp, defaultType, obj);
	}
	public ClearingHouseInterface getClearingHouseInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getClearingHouseInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
				return factory.getClearingHouseInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseClearingHouseInterface(String appName, String type,ClearingHouseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseClearingHouseInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInterface");
				factory.releaseClearingHouseInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ClearingHouseContactsInterface getClearingHouseContactsInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseContacts");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContacts");
		return this.getClearingHouseContactsInterface(defaultApp, defaultType);
	}
	public void releaseClearingHouseContactsInterface(ClearingHouseContactsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseContactsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseContactsInterface");
		this.releaseClearingHouseContactsInterface(defaultApp, defaultType, obj);
	}
	public ClearingHouseContactsInterface getClearingHouseContactsInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseContactsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getClearingHouseContactsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
				return factory.getClearingHouseContactsInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseClearingHouseContactsInterface(String appName, String type,ClearingHouseContactsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseContactsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseClearingHouseContactsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseContactsInterface");
				factory.releaseClearingHouseContactsInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseContactsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseContactsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ClearingHouseInfoInterface getClearingHouseInfoInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInfo");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfo");
		return this.getClearingHouseInfoInterface(defaultApp, defaultType);
	}
	public void releaseClearingHouseInfoInterface(ClearingHouseInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInfoInterface");
		this.releaseClearingHouseInfoInterface(defaultApp, defaultType, obj);
	}
	public ClearingHouseInfoInterface getClearingHouseInfoInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInfoInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getClearingHouseInfoInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
				return factory.getClearingHouseInfoInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseClearingHouseInfoInterface(String appName, String type,ClearingHouseInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInfoInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseClearingHouseInfoInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInfoInterface");
				factory.releaseClearingHouseInfoInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInfoInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInfoInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CmfBonusPointInterface getCmfBonusPointInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfBonusPoint");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPoint");
		return this.getCmfBonusPointInterface(defaultApp, defaultType);
	}
	public void releaseCmfBonusPointInterface(CmfBonusPointInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfBonusPointInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfBonusPointInterface");
		this.releaseCmfBonusPointInterface(defaultApp, defaultType, obj);
	}
	public CmfBonusPointInterface getCmfBonusPointInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfBonusPointInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCmfBonusPointInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
				return factory.getCmfBonusPointInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCmfBonusPointInterface(String appName, String type,CmfBonusPointInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfBonusPointInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCmfBonusPointInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfBonusPointInterface");
				factory.releaseCmfBonusPointInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfBonusPointInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfBonusPointInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CmfPackageOverridesInterface getCmfPackageOverridesInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfPackageOverrides");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverrides");
		return this.getCmfPackageOverridesInterface(defaultApp, defaultType);
	}
	public void releaseCmfPackageOverridesInterface(CmfPackageOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfPackageOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfPackageOverridesInterface");
		this.releaseCmfPackageOverridesInterface(defaultApp, defaultType, obj);
	}
	public CmfPackageOverridesInterface getCmfPackageOverridesInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfPackageOverridesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCmfPackageOverridesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
				return factory.getCmfPackageOverridesInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCmfPackageOverridesInterface(String appName, String type,CmfPackageOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfPackageOverridesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCmfPackageOverridesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfPackageOverridesInterface");
				factory.releaseCmfPackageOverridesInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfPackageOverridesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfPackageOverridesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CmfRewardBalanceDetailInterface getCmfRewardBalanceDetailInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfRewardBalanceDetail");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetail");
		return this.getCmfRewardBalanceDetailInterface(defaultApp, defaultType);
	}
	public void releaseCmfRewardBalanceDetailInterface(CmfRewardBalanceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
		this.releaseCmfRewardBalanceDetailInterface(defaultApp, defaultType, obj);
	}
	public CmfRewardBalanceDetailInterface getCmfRewardBalanceDetailInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfRewardBalanceDetailInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCmfRewardBalanceDetailInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
				return factory.getCmfRewardBalanceDetailInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCmfRewardBalanceDetailInterface(String appName, String type,CmfRewardBalanceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCmfRewardBalanceDetailInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
				factory.releaseCmfRewardBalanceDetailInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CmfStatusInterface getCmfStatusInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatus");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatus");
		return this.getCmfStatusInterface(defaultApp, defaultType);
	}
	public void releaseCmfStatusInterface(CmfStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusInterface");
		this.releaseCmfStatusInterface(defaultApp, defaultType, obj);
	}
	public CmfStatusInterface getCmfStatusInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCmfStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
				return factory.getCmfStatusInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCmfStatusInterface(String appName, String type,CmfStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCmfStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusInterface");
				factory.releaseCmfStatusInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CmfStatusChgReasonInterface getCmfStatusChgReasonInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusChgReason");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReason");
		return this.getCmfStatusChgReasonInterface(defaultApp, defaultType);
	}
	public void releaseCmfStatusChgReasonInterface(CmfStatusChgReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusChgReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusChgReasonInterface");
		this.releaseCmfStatusChgReasonInterface(defaultApp, defaultType, obj);
	}
	public CmfStatusChgReasonInterface getCmfStatusChgReasonInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusChgReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCmfStatusChgReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
				return factory.getCmfStatusChgReasonInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCmfStatusChgReasonInterface(String appName, String type,CmfStatusChgReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusChgReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCmfStatusChgReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusChgReasonInterface");
				factory.releaseCmfStatusChgReasonInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusChgReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusChgReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ConnectReasonInterface getConnectReasonInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReason");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReason");
		return this.getConnectReasonInterface(defaultApp, defaultType);
	}
	public void releaseConnectReasonInterface(ConnectReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseConnectReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseConnectReasonInterface");
		this.releaseConnectReasonInterface(defaultApp, defaultType, obj);
	}
	public ConnectReasonInterface getConnectReasonInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getConnectReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
				return factory.getConnectReasonInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseConnectReasonInterface(String appName, String type,ConnectReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseConnectReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseConnectReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseConnectReasonInterface");
				factory.releaseConnectReasonInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseConnectReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseConnectReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ContactInterface getContactInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContact");
		return this.getContactInterface(defaultApp, defaultType);
	}
	public void releaseContactInterface(ContactInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContactInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContactInterface");
		this.releaseContactInterface(defaultApp, defaultType, obj);
	}
	public ContactInterface getContactInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getContactInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
				return factory.getContactInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseContactInterface(String appName, String type,ContactInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContactInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseContactInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContactInterface");
				factory.releaseContactInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContactInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContactInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ContractDiscountInterface getContractDiscountInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractDiscount");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscount");
		return this.getContractDiscountInterface(defaultApp, defaultType);
	}
	public void releaseContractDiscountInterface(ContractDiscountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContractDiscountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContractDiscountInterface");
		this.releaseContractDiscountInterface(defaultApp, defaultType, obj);
	}
	public ContractDiscountInterface getContractDiscountInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractDiscountInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getContractDiscountInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
				return factory.getContractDiscountInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseContractDiscountInterface(String appName, String type,ContractDiscountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContractDiscountInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseContractDiscountInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContractDiscountInterface");
				factory.releaseContractDiscountInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContractDiscountInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContractDiscountInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CorridorInterface getCorridorInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridor");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridor");
		return this.getCorridorInterface(defaultApp, defaultType);
	}
	public void releaseCorridorInterface(CorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorInterface");
		this.releaseCorridorInterface(defaultApp, defaultType, obj);
	}
	public CorridorInterface getCorridorInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCorridorInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
				return factory.getCorridorInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCorridorInterface(String appName, String type,CorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCorridorInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorInterface");
				factory.releaseCorridorInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CorridorRateBandOverrideInterface getCorridorRateBandOverrideInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateBandOverride");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverride");
		return this.getCorridorRateBandOverrideInterface(defaultApp, defaultType);
	}
	public void releaseCorridorRateBandOverrideInterface(CorridorRateBandOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateBandOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateBandOverrideInterface");
		this.releaseCorridorRateBandOverrideInterface(defaultApp, defaultType, obj);
	}
	public CorridorRateBandOverrideInterface getCorridorRateBandOverrideInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateBandOverrideInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCorridorRateBandOverrideInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
				return factory.getCorridorRateBandOverrideInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCorridorRateBandOverrideInterface(String appName, String type,CorridorRateBandOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateBandOverrideInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCorridorRateBandOverrideInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateBandOverrideInterface");
				factory.releaseCorridorRateBandOverrideInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateBandOverrideInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateBandOverrideInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CorridorRateOverrideInterface getCorridorRateOverrideInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateOverride");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverride");
		return this.getCorridorRateOverrideInterface(defaultApp, defaultType);
	}
	public void releaseCorridorRateOverrideInterface(CorridorRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateOverrideInterface");
		this.releaseCorridorRateOverrideInterface(defaultApp, defaultType, obj);
	}
	public CorridorRateOverrideInterface getCorridorRateOverrideInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateOverrideInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCorridorRateOverrideInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
				return factory.getCorridorRateOverrideInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCorridorRateOverrideInterface(String appName, String type,CorridorRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateOverrideInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCorridorRateOverrideInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateOverrideInterface");
				factory.releaseCorridorRateOverrideInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateOverrideInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateOverrideInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CreditCardInterface getCreditCardInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCard");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCard");
		return this.getCreditCardInterface(defaultApp, defaultType);
	}
	public void releaseCreditCardInterface(CreditCardInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardInterface");
		this.releaseCreditCardInterface(defaultApp, defaultType, obj);
	}
	public CreditCardInterface getCreditCardInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCreditCardInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
				return factory.getCreditCardInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCreditCardInterface(String appName, String type,CreditCardInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCreditCardInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardInterface");
				factory.releaseCreditCardInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CreditCardTypeCodeInterface getCreditCardTypeCodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardTypeCode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCode");
		return this.getCreditCardTypeCodeInterface(defaultApp, defaultType);
	}
	public void releaseCreditCardTypeCodeInterface(CreditCardTypeCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardTypeCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardTypeCodeInterface");
		this.releaseCreditCardTypeCodeInterface(defaultApp, defaultType, obj);
	}
	public CreditCardTypeCodeInterface getCreditCardTypeCodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardTypeCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCreditCardTypeCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
				return factory.getCreditCardTypeCodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCreditCardTypeCodeInterface(String appName, String type,CreditCardTypeCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardTypeCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCreditCardTypeCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardTypeCodeInterface");
				factory.releaseCreditCardTypeCodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardTypeCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardTypeCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CsrInterface getCsrInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsr");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsr");
		return this.getCsrInterface(defaultApp, defaultType);
	}
	public void releaseCsrInterface(CsrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrInterface");
		this.releaseCsrInterface(defaultApp, defaultType, obj);
	}
	public CsrInterface getCsrInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCsrInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
				return factory.getCsrInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCsrInterface(String appName, String type,CsrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCsrInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrInterface");
				factory.releaseCsrInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CsrAccountSegmentInterface getCsrAccountSegmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAccountSegment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegment");
		return this.getCsrAccountSegmentInterface(defaultApp, defaultType);
	}
	public void releaseCsrAccountSegmentInterface(CsrAccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrAccountSegmentInterface");
		this.releaseCsrAccountSegmentInterface(defaultApp, defaultType, obj);
	}
	public CsrAccountSegmentInterface getCsrAccountSegmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAccountSegmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCsrAccountSegmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
				return factory.getCsrAccountSegmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCsrAccountSegmentInterface(String appName, String type,CsrAccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrAccountSegmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCsrAccountSegmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrAccountSegmentInterface");
				factory.releaseCsrAccountSegmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrAccountSegmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrAccountSegmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CsrGroupAmountInterface getCsrGroupAmountInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupAmount");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmount");
		return this.getCsrGroupAmountInterface(defaultApp, defaultType);
	}
	public void releaseCsrGroupAmountInterface(CsrGroupAmountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupAmountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupAmountInterface");
		this.releaseCsrGroupAmountInterface(defaultApp, defaultType, obj);
	}
	public CsrGroupAmountInterface getCsrGroupAmountInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupAmountInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCsrGroupAmountInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
				return factory.getCsrGroupAmountInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCsrGroupAmountInterface(String appName, String type,CsrGroupAmountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupAmountInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCsrGroupAmountInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupAmountInterface");
				factory.releaseCsrGroupAmountInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupAmountInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupAmountInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CsrGroupFunctionInterface getCsrGroupFunctionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupFunction");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunction");
		return this.getCsrGroupFunctionInterface(defaultApp, defaultType);
	}
	public void releaseCsrGroupFunctionInterface(CsrGroupFunctionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupFunctionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupFunctionInterface");
		this.releaseCsrGroupFunctionInterface(defaultApp, defaultType, obj);
	}
	public CsrGroupFunctionInterface getCsrGroupFunctionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupFunctionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCsrGroupFunctionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
				return factory.getCsrGroupFunctionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCsrGroupFunctionInterface(String appName, String type,CsrGroupFunctionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupFunctionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCsrGroupFunctionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupFunctionInterface");
				factory.releaseCsrGroupFunctionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupFunctionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupFunctionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CustomerDocumentInterface getCustomerDocumentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocument");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocument");
		return this.getCustomerDocumentInterface(defaultApp, defaultType);
	}
	public void releaseCustomerDocumentInterface(CustomerDocumentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDocumentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDocumentInterface");
		this.releaseCustomerDocumentInterface(defaultApp, defaultType, obj);
	}
	public CustomerDocumentInterface getCustomerDocumentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocumentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCustomerDocumentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
				return factory.getCustomerDocumentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCustomerDocumentInterface(String appName, String type,CustomerDocumentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDocumentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCustomerDocumentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDocumentInterface");
				factory.releaseCustomerDocumentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDocumentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDocumentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CustomerDtServerInterface getCustomerDtServerInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtServer");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServer");
		return this.getCustomerDtServerInterface(defaultApp, defaultType);
	}
	public void releaseCustomerDtServerInterface(CustomerDtServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtServerInterface");
		this.releaseCustomerDtServerInterface(defaultApp, defaultType, obj);
	}
	public CustomerDtServerInterface getCustomerDtServerInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtServerInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCustomerDtServerInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
				return factory.getCustomerDtServerInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCustomerDtServerInterface(String appName, String type,CustomerDtServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtServerInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCustomerDtServerInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtServerInterface");
				factory.releaseCustomerDtServerInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtServerInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtServerInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CustomerDtUrlInterface getCustomerDtUrlInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtUrl");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrl");
		return this.getCustomerDtUrlInterface(defaultApp, defaultType);
	}
	public void releaseCustomerDtUrlInterface(CustomerDtUrlInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtUrlInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtUrlInterface");
		this.releaseCustomerDtUrlInterface(defaultApp, defaultType, obj);
	}
	public CustomerDtUrlInterface getCustomerDtUrlInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtUrlInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCustomerDtUrlInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
				return factory.getCustomerDtUrlInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCustomerDtUrlInterface(String appName, String type,CustomerDtUrlInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtUrlInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCustomerDtUrlInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtUrlInterface");
				factory.releaseCustomerDtUrlInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtUrlInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtUrlInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public CustomerServiceCenterInterface getCustomerServiceCenterInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerServiceCenter");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenter");
		return this.getCustomerServiceCenterInterface(defaultApp, defaultType);
	}
	public void releaseCustomerServiceCenterInterface(CustomerServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerServiceCenterInterface");
		this.releaseCustomerServiceCenterInterface(defaultApp, defaultType, obj);
	}
	public CustomerServiceCenterInterface getCustomerServiceCenterInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerServiceCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getCustomerServiceCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
				return factory.getCustomerServiceCenterInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseCustomerServiceCenterInterface(String appName, String type,CustomerServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerServiceCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseCustomerServiceCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerServiceCenterInterface");
				factory.releaseCustomerServiceCenterInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerServiceCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerServiceCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public DepositInterface getDepositInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeposit");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDeposit");
		return this.getDepositInterface(defaultApp, defaultType);
	}
	public void releaseDepositInterface(DepositInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositInterface");
		this.releaseDepositInterface(defaultApp, defaultType, obj);
	}
	public DepositInterface getDepositInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getDepositInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
				return factory.getDepositInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseDepositInterface(String appName, String type,DepositInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseDepositInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositInterface");
				factory.releaseDepositInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public DepositTypeInterface getDepositTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositType");
		return this.getDepositTypeInterface(defaultApp, defaultType);
	}
	public void releaseDepositTypeInterface(DepositTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositTypeInterface");
		this.releaseDepositTypeInterface(defaultApp, defaultType, obj);
	}
	public DepositTypeInterface getDepositTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getDepositTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
				return factory.getDepositTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseDepositTypeInterface(String appName, String type,DepositTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseDepositTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositTypeInterface");
				factory.releaseDepositTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public DiscReasonInterface getDiscReasonInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscReason");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReason");
		return this.getDiscReasonInterface(defaultApp, defaultType);
	}
	public void releaseDiscReasonInterface(DiscReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDiscReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDiscReasonInterface");
		this.releaseDiscReasonInterface(defaultApp, defaultType, obj);
	}
	public DiscReasonInterface getDiscReasonInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getDiscReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
				return factory.getDiscReasonInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseDiscReasonInterface(String appName, String type,DiscReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDiscReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseDiscReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDiscReasonInterface");
				factory.releaseDiscReasonInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDiscReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDiscReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public DocumentTypeRefInterface getDocumentTypeRefInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeRef");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRef");
		return this.getDocumentTypeRefInterface(defaultApp, defaultType);
	}
	public void releaseDocumentTypeRefInterface(DocumentTypeRefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDocumentTypeRefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDocumentTypeRefInterface");
		this.releaseDocumentTypeRefInterface(defaultApp, defaultType, obj);
	}
	public DocumentTypeRefInterface getDocumentTypeRefInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeRefInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getDocumentTypeRefInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
				return factory.getDocumentTypeRefInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseDocumentTypeRefInterface(String appName, String type,DocumentTypeRefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDocumentTypeRefInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseDocumentTypeRefInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDocumentTypeRefInterface");
				factory.releaseDocumentTypeRefInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDocumentTypeRefInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDocumentTypeRefInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public EarlyTerminationChargeInterface getEarlyTerminationChargeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEarlyTerminationCharge");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationCharge");
		return this.getEarlyTerminationChargeInterface(defaultApp, defaultType);
	}
	public void releaseEarlyTerminationChargeInterface(EarlyTerminationChargeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEarlyTerminationChargeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEarlyTerminationChargeInterface");
		this.releaseEarlyTerminationChargeInterface(defaultApp, defaultType, obj);
	}
	public EarlyTerminationChargeInterface getEarlyTerminationChargeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEarlyTerminationChargeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getEarlyTerminationChargeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
				return factory.getEarlyTerminationChargeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseEarlyTerminationChargeInterface(String appName, String type,EarlyTerminationChargeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEarlyTerminationChargeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseEarlyTerminationChargeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEarlyTerminationChargeInterface");
				factory.releaseEarlyTerminationChargeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEarlyTerminationChargeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEarlyTerminationChargeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public EftResponseCodeInterface getEftResponseCodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftResponseCode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCode");
		return this.getEftResponseCodeInterface(defaultApp, defaultType);
	}
	public void releaseEftResponseCodeInterface(EftResponseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftResponseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftResponseCodeInterface");
		this.releaseEftResponseCodeInterface(defaultApp, defaultType, obj);
	}
	public EftResponseCodeInterface getEftResponseCodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftResponseCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getEftResponseCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
				return factory.getEftResponseCodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseEftResponseCodeInterface(String appName, String type,EftResponseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftResponseCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseEftResponseCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftResponseCodeInterface");
				factory.releaseEftResponseCodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftResponseCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftResponseCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public EftTransactionInterface getEftTransactionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransaction");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransaction");
		return this.getEftTransactionInterface(defaultApp, defaultType);
	}
	public void releaseEftTransactionInterface(EftTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftTransactionInterface");
		this.releaseEftTransactionInterface(defaultApp, defaultType, obj);
	}
	public EftTransactionInterface getEftTransactionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransactionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getEftTransactionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
				return factory.getEftTransactionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseEftTransactionInterface(String appName, String type,EftTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftTransactionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseEftTransactionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftTransactionInterface");
				factory.releaseEftTransactionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftTransactionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftTransactionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public EnhancedNoteInterface getEnhancedNoteInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnhancedNote");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNote");
		return this.getEnhancedNoteInterface(defaultApp, defaultType);
	}
	public void releaseEnhancedNoteInterface(EnhancedNoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEnhancedNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEnhancedNoteInterface");
		this.releaseEnhancedNoteInterface(defaultApp, defaultType, obj);
	}
	public EnhancedNoteInterface getEnhancedNoteInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnhancedNoteInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getEnhancedNoteInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
				return factory.getEnhancedNoteInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseEnhancedNoteInterface(String appName, String type,EnhancedNoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEnhancedNoteInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseEnhancedNoteInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEnhancedNoteInterface");
				factory.releaseEnhancedNoteInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEnhancedNoteInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEnhancedNoteInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExchangeRateClassInterface getExchangeRateClassInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExchangeRateClass");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClass");
		return this.getExchangeRateClassInterface(defaultApp, defaultType);
	}
	public void releaseExchangeRateClassInterface(ExchangeRateClassInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExchangeRateClassInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExchangeRateClassInterface");
		this.releaseExchangeRateClassInterface(defaultApp, defaultType, obj);
	}
	public ExchangeRateClassInterface getExchangeRateClassInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExchangeRateClassInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExchangeRateClassInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
				return factory.getExchangeRateClassInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExchangeRateClassInterface(String appName, String type,ExchangeRateClassInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExchangeRateClassInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExchangeRateClassInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExchangeRateClassInterface");
				factory.releaseExchangeRateClassInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExchangeRateClassInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExchangeRateClassInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExtendedDataAssociationInterface getExtendedDataAssociationInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataAssociation");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociation");
		return this.getExtendedDataAssociationInterface(defaultApp, defaultType);
	}
	public void releaseExtendedDataAssociationInterface(ExtendedDataAssociationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataAssociationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataAssociationInterface");
		this.releaseExtendedDataAssociationInterface(defaultApp, defaultType, obj);
	}
	public ExtendedDataAssociationInterface getExtendedDataAssociationInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataAssociationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExtendedDataAssociationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
				return factory.getExtendedDataAssociationInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExtendedDataAssociationInterface(String appName, String type,ExtendedDataAssociationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataAssociationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExtendedDataAssociationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataAssociationInterface");
				factory.releaseExtendedDataAssociationInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataAssociationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataAssociationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExtendedDataEnumerationInterface getExtendedDataEnumerationInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataEnumeration");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumeration");
		return this.getExtendedDataEnumerationInterface(defaultApp, defaultType);
	}
	public void releaseExtendedDataEnumerationInterface(ExtendedDataEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataEnumerationInterface");
		this.releaseExtendedDataEnumerationInterface(defaultApp, defaultType, obj);
	}
	public ExtendedDataEnumerationInterface getExtendedDataEnumerationInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataEnumerationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExtendedDataEnumerationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
				return factory.getExtendedDataEnumerationInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExtendedDataEnumerationInterface(String appName, String type,ExtendedDataEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataEnumerationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExtendedDataEnumerationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataEnumerationInterface");
				factory.releaseExtendedDataEnumerationInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataEnumerationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataEnumerationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExtendedDataLocateInterface getExtendedDataLocateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataLocate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocate");
		return this.getExtendedDataLocateInterface(defaultApp, defaultType);
	}
	public void releaseExtendedDataLocateInterface(ExtendedDataLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataLocateInterface");
		this.releaseExtendedDataLocateInterface(defaultApp, defaultType, obj);
	}
	public ExtendedDataLocateInterface getExtendedDataLocateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataLocateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExtendedDataLocateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
				return factory.getExtendedDataLocateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExtendedDataLocateInterface(String appName, String type,ExtendedDataLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataLocateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExtendedDataLocateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataLocateInterface");
				factory.releaseExtendedDataLocateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataLocateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataLocateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExtendedDataParamInterface getExtendedDataParamInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParam");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParam");
		return this.getExtendedDataParamInterface(defaultApp, defaultType);
	}
	public void releaseExtendedDataParamInterface(ExtendedDataParamInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamInterface");
		this.releaseExtendedDataParamInterface(defaultApp, defaultType, obj);
	}
	public ExtendedDataParamInterface getExtendedDataParamInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExtendedDataParamInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
				return factory.getExtendedDataParamInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExtendedDataParamInterface(String appName, String type,ExtendedDataParamInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExtendedDataParamInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamInterface");
				factory.releaseExtendedDataParamInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExtendedDataParamTypeInterface getExtendedDataParamTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamType");
		return this.getExtendedDataParamTypeInterface(defaultApp, defaultType);
	}
	public void releaseExtendedDataParamTypeInterface(ExtendedDataParamTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamTypeInterface");
		this.releaseExtendedDataParamTypeInterface(defaultApp, defaultType, obj);
	}
	public ExtendedDataParamTypeInterface getExtendedDataParamTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExtendedDataParamTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
				return factory.getExtendedDataParamTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExtendedDataParamTypeInterface(String appName, String type,ExtendedDataParamTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExtendedDataParamTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamTypeInterface");
				factory.releaseExtendedDataParamTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExternalIdAcctMapInterface getExternalIdAcctMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAcctMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMap");
		return this.getExternalIdAcctMapInterface(defaultApp, defaultType);
	}
	public void releaseExternalIdAcctMapInterface(ExternalIdAcctMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdAcctMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdAcctMapInterface");
		this.releaseExternalIdAcctMapInterface(defaultApp, defaultType, obj);
	}
	public ExternalIdAcctMapInterface getExternalIdAcctMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAcctMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExternalIdAcctMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
				return factory.getExternalIdAcctMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExternalIdAcctMapInterface(String appName, String type,ExternalIdAcctMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdAcctMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExternalIdAcctMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdAcctMapInterface");
				factory.releaseExternalIdAcctMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdAcctMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdAcctMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ExternalIdHqGroupsMapInterface getExternalIdHqGroupsMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdHqGroupsMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMap");
		return this.getExternalIdHqGroupsMapInterface(defaultApp, defaultType);
	}
	public void releaseExternalIdHqGroupsMapInterface(ExternalIdHqGroupsMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
		this.releaseExternalIdHqGroupsMapInterface(defaultApp, defaultType, obj);
	}
	public ExternalIdHqGroupsMapInterface getExternalIdHqGroupsMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdHqGroupsMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getExternalIdHqGroupsMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
				return factory.getExternalIdHqGroupsMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseExternalIdHqGroupsMapInterface(String appName, String type,ExternalIdHqGroupsMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseExternalIdHqGroupsMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
				factory.releaseExternalIdHqGroupsMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public FranchiseCodeInterface getFranchiseCodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCode");
		return this.getFranchiseCodeInterface(defaultApp, defaultType);
	}
	public void releaseFranchiseCodeInterface(FranchiseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseFranchiseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseFranchiseCodeInterface");
		this.releaseFranchiseCodeInterface(defaultApp, defaultType, obj);
	}
	public FranchiseCodeInterface getFranchiseCodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getFranchiseCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
				return factory.getFranchiseCodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseFranchiseCodeInterface(String appName, String type,FranchiseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseFranchiseCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseFranchiseCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseFranchiseCodeInterface");
				factory.releaseFranchiseCodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseFranchiseCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseFranchiseCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GenderTypeInterface getGenderTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderType");
		return this.getGenderTypeInterface(defaultApp, defaultType);
	}
	public void releaseGenderTypeInterface(GenderTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenderTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenderTypeInterface");
		this.releaseGenderTypeInterface(defaultApp, defaultType, obj);
	}
	public GenderTypeInterface getGenderTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGenderTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
				return factory.getGenderTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGenderTypeInterface(String appName, String type,GenderTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenderTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGenderTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenderTypeInterface");
				factory.releaseGenderTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenderTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenderTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GenericEnumerationInterface getGenericEnumerationInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenericEnumeration");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumeration");
		return this.getGenericEnumerationInterface(defaultApp, defaultType);
	}
	public void releaseGenericEnumerationInterface(GenericEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenericEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenericEnumerationInterface");
		this.releaseGenericEnumerationInterface(defaultApp, defaultType, obj);
	}
	public GenericEnumerationInterface getGenericEnumerationInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenericEnumerationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGenericEnumerationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
				return factory.getGenericEnumerationInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGenericEnumerationInterface(String appName, String type,GenericEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenericEnumerationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGenericEnumerationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenericEnumerationInterface");
				factory.releaseGenericEnumerationInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenericEnumerationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenericEnumerationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GeocodeInterface getGeocodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocode");
		return this.getGeocodeInterface(defaultApp, defaultType);
	}
	public void releaseGeocodeInterface(GeocodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGeocodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGeocodeInterface");
		this.releaseGeocodeInterface(defaultApp, defaultType, obj);
	}
	public GeocodeInterface getGeocodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGeocodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
				return factory.getGeocodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGeocodeInterface(String appName, String type,GeocodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGeocodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGeocodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGeocodeInterface");
				factory.releaseGeocodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGeocodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGeocodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GlobalAccountBalancesInterface getGlobalAccountBalancesInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalAccountBalances");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalances");
		return this.getGlobalAccountBalancesInterface(defaultApp, defaultType);
	}
	public void releaseGlobalAccountBalancesInterface(GlobalAccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalAccountBalancesInterface");
		this.releaseGlobalAccountBalancesInterface(defaultApp, defaultType, obj);
	}
	public GlobalAccountBalancesInterface getGlobalAccountBalancesInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalAccountBalancesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGlobalAccountBalancesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
				return factory.getGlobalAccountBalancesInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGlobalAccountBalancesInterface(String appName, String type,GlobalAccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalAccountBalancesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGlobalAccountBalancesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalAccountBalancesInterface");
				factory.releaseGlobalAccountBalancesInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalAccountBalancesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalAccountBalancesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GlobalContractInterface getGlobalContractInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContract");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContract");
		return this.getGlobalContractInterface(defaultApp, defaultType);
	}
	public void releaseGlobalContractInterface(GlobalContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalContractInterface");
		this.releaseGlobalContractInterface(defaultApp, defaultType, obj);
	}
	public GlobalContractInterface getGlobalContractInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContractInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGlobalContractInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
				return factory.getGlobalContractInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGlobalContractInterface(String appName, String type,GlobalContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalContractInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGlobalContractInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalContractInterface");
				factory.releaseGlobalContractInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalContractInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalContractInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GlobalOpenItemIdMapInterface getGlobalOpenItemIdMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalOpenItemIdMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMap");
		return this.getGlobalOpenItemIdMapInterface(defaultApp, defaultType);
	}
	public void releaseGlobalOpenItemIdMapInterface(GlobalOpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
		this.releaseGlobalOpenItemIdMapInterface(defaultApp, defaultType, obj);
	}
	public GlobalOpenItemIdMapInterface getGlobalOpenItemIdMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalOpenItemIdMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGlobalOpenItemIdMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
				return factory.getGlobalOpenItemIdMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGlobalOpenItemIdMapInterface(String appName, String type,GlobalOpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGlobalOpenItemIdMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
				factory.releaseGlobalOpenItemIdMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GroupInterface getGroupInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroup");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroup");
		return this.getGroupInterface(defaultApp, defaultType);
	}
	public void releaseGroupInterface(GroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupInterface");
		this.releaseGroupInterface(defaultApp, defaultType, obj);
	}
	public GroupInterface getGroupInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
				return factory.getGroupInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGroupInterface(String appName, String type,GroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupInterface");
				factory.releaseGroupInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GroupLocateInterface getGroupLocateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupLocate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocate");
		return this.getGroupLocateInterface(defaultApp, defaultType);
	}
	public void releaseGroupLocateInterface(GroupLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupLocateInterface");
		this.releaseGroupLocateInterface(defaultApp, defaultType, obj);
	}
	public GroupLocateInterface getGroupLocateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupLocateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGroupLocateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
				return factory.getGroupLocateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGroupLocateInterface(String appName, String type,GroupLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupLocateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGroupLocateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupLocateInterface");
				factory.releaseGroupLocateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupLocateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupLocateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GroupMemberInterface getGroupMemberInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupMember");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMember");
		return this.getGroupMemberInterface(defaultApp, defaultType);
	}
	public void releaseGroupMemberInterface(GroupMemberInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupMemberInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupMemberInterface");
		this.releaseGroupMemberInterface(defaultApp, defaultType, obj);
	}
	public GroupMemberInterface getGroupMemberInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupMemberInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGroupMemberInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
				return factory.getGroupMemberInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGroupMemberInterface(String appName, String type,GroupMemberInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupMemberInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGroupMemberInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupMemberInterface");
				factory.releaseGroupMemberInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupMemberInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupMemberInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public GuiIndicatorInterface getGuiIndicatorInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiIndicator");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicator");
		return this.getGuiIndicatorInterface(defaultApp, defaultType);
	}
	public void releaseGuiIndicatorInterface(GuiIndicatorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGuiIndicatorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGuiIndicatorInterface");
		this.releaseGuiIndicatorInterface(defaultApp, defaultType, obj);
	}
	public GuiIndicatorInterface getGuiIndicatorInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiIndicatorInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getGuiIndicatorInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
				return factory.getGuiIndicatorInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseGuiIndicatorInterface(String appName, String type,GuiIndicatorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGuiIndicatorInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseGuiIndicatorInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGuiIndicatorInterface");
				factory.releaseGuiIndicatorInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGuiIndicatorInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGuiIndicatorInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HistoricalContributionInterface getHistoricalContributionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContribution");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContribution");
		return this.getHistoricalContributionInterface(defaultApp, defaultType);
	}
	public void releaseHistoricalContributionInterface(HistoricalContributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionInterface");
		this.releaseHistoricalContributionInterface(defaultApp, defaultType, obj);
	}
	public HistoricalContributionInterface getHistoricalContributionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHistoricalContributionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
				return factory.getHistoricalContributionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHistoricalContributionInterface(String appName, String type,HistoricalContributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHistoricalContributionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionInterface");
				factory.releaseHistoricalContributionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HistoricalContributionTaxInterface getHistoricalContributionTaxInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionTax");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTax");
		return this.getHistoricalContributionTaxInterface(defaultApp, defaultType);
	}
	public void releaseHistoricalContributionTaxInterface(HistoricalContributionTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionTaxInterface");
		this.releaseHistoricalContributionTaxInterface(defaultApp, defaultType, obj);
	}
	public HistoricalContributionTaxInterface getHistoricalContributionTaxInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionTaxInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHistoricalContributionTaxInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
				return factory.getHistoricalContributionTaxInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHistoricalContributionTaxInterface(String appName, String type,HistoricalContributionTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionTaxInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHistoricalContributionTaxInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionTaxInterface");
				factory.releaseHistoricalContributionTaxInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionTaxInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionTaxInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HistoricalThresholdsInterface getHistoricalThresholdsInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalThresholds");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholds");
		return this.getHistoricalThresholdsInterface(defaultApp, defaultType);
	}
	public void releaseHistoricalThresholdsInterface(HistoricalThresholdsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalThresholdsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalThresholdsInterface");
		this.releaseHistoricalThresholdsInterface(defaultApp, defaultType, obj);
	}
	public HistoricalThresholdsInterface getHistoricalThresholdsInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalThresholdsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHistoricalThresholdsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
				return factory.getHistoricalThresholdsInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHistoricalThresholdsInterface(String appName, String type,HistoricalThresholdsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalThresholdsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHistoricalThresholdsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalThresholdsInterface");
				factory.releaseHistoricalThresholdsInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalThresholdsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalThresholdsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HqContractUnitCrInterface getHqContractUnitCrInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqContractUnitCr");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCr");
		return this.getHqContractUnitCrInterface(defaultApp, defaultType);
	}
	public void releaseHqContractUnitCrInterface(HqContractUnitCrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqContractUnitCrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqContractUnitCrInterface");
		this.releaseHqContractUnitCrInterface(defaultApp, defaultType, obj);
	}
	public HqContractUnitCrInterface getHqContractUnitCrInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqContractUnitCrInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHqContractUnitCrInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
				return factory.getHqContractUnitCrInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHqContractUnitCrInterface(String appName, String type,HqContractUnitCrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqContractUnitCrInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHqContractUnitCrInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqContractUnitCrInterface");
				factory.releaseHqContractUnitCrInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqContractUnitCrInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqContractUnitCrInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HqGroupContractsInterface getHqGroupContractsInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupContracts");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContracts");
		return this.getHqGroupContractsInterface(defaultApp, defaultType);
	}
	public void releaseHqGroupContractsInterface(HqGroupContractsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupContractsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupContractsInterface");
		this.releaseHqGroupContractsInterface(defaultApp, defaultType, obj);
	}
	public HqGroupContractsInterface getHqGroupContractsInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupContractsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHqGroupContractsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
				return factory.getHqGroupContractsInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHqGroupContractsInterface(String appName, String type,HqGroupContractsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupContractsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHqGroupContractsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupContractsInterface");
				factory.releaseHqGroupContractsInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupContractsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupContractsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HqGroupCorridorInterface getHqGroupCorridorInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupCorridor");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridor");
		return this.getHqGroupCorridorInterface(defaultApp, defaultType);
	}
	public void releaseHqGroupCorridorInterface(HqGroupCorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupCorridorInterface");
		this.releaseHqGroupCorridorInterface(defaultApp, defaultType, obj);
	}
	public HqGroupCorridorInterface getHqGroupCorridorInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupCorridorInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHqGroupCorridorInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
				return factory.getHqGroupCorridorInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHqGroupCorridorInterface(String appName, String type,HqGroupCorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupCorridorInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHqGroupCorridorInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupCorridorInterface");
				factory.releaseHqGroupCorridorInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupCorridorInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupCorridorInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HqGroupMembersInterface getHqGroupMembersInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupMembers");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembers");
		return this.getHqGroupMembersInterface(defaultApp, defaultType);
	}
	public void releaseHqGroupMembersInterface(HqGroupMembersInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupMembersInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupMembersInterface");
		this.releaseHqGroupMembersInterface(defaultApp, defaultType, obj);
	}
	public HqGroupMembersInterface getHqGroupMembersInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupMembersInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHqGroupMembersInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
				return factory.getHqGroupMembersInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHqGroupMembersInterface(String appName, String type,HqGroupMembersInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupMembersInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHqGroupMembersInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupMembersInterface");
				factory.releaseHqGroupMembersInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupMembersInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupMembersInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HqGroupProductInterface getHqGroupProductInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupProduct");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProduct");
		return this.getHqGroupProductInterface(defaultApp, defaultType);
	}
	public void releaseHqGroupProductInterface(HqGroupProductInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupProductInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupProductInterface");
		this.releaseHqGroupProductInterface(defaultApp, defaultType, obj);
	}
	public HqGroupProductInterface getHqGroupProductInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupProductInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHqGroupProductInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
				return factory.getHqGroupProductInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHqGroupProductInterface(String appName, String type,HqGroupProductInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupProductInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHqGroupProductInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupProductInterface");
				factory.releaseHqGroupProductInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupProductInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupProductInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HqGroupsInterface getHqGroupsInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroups");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroups");
		return this.getHqGroupsInterface(defaultApp, defaultType);
	}
	public void releaseHqGroupsInterface(HqGroupsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupsInterface");
		this.releaseHqGroupsInterface(defaultApp, defaultType, obj);
	}
	public HqGroupsInterface getHqGroupsInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHqGroupsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
				return factory.getHqGroupsInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHqGroupsInterface(String appName, String type,HqGroupsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHqGroupsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupsInterface");
				factory.releaseHqGroupsInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public HqgroupUsageRedirectMapInterface getHqgroupUsageRedirectMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqgroupUsageRedirectMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMap");
		return this.getHqgroupUsageRedirectMapInterface(defaultApp, defaultType);
	}
	public void releaseHqgroupUsageRedirectMapInterface(HqgroupUsageRedirectMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
		this.releaseHqgroupUsageRedirectMapInterface(defaultApp, defaultType, obj);
	}
	public HqgroupUsageRedirectMapInterface getHqgroupUsageRedirectMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqgroupUsageRedirectMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getHqgroupUsageRedirectMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
				return factory.getHqgroupUsageRedirectMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseHqgroupUsageRedirectMapInterface(String appName, String type,HqgroupUsageRedirectMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseHqgroupUsageRedirectMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
				factory.releaseHqgroupUsageRedirectMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public InterimBillInterface getInterimBillInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBill");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBill");
		return this.getInterimBillInterface(defaultApp, defaultType);
	}
	public void releaseInterimBillInterface(InterimBillInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInterimBillInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInterimBillInterface");
		this.releaseInterimBillInterface(defaultApp, defaultType, obj);
	}
	public InterimBillInterface getInterimBillInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getInterimBillInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
				return factory.getInterimBillInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseInterimBillInterface(String appName, String type,InterimBillInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInterimBillInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseInterimBillInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInterimBillInterface");
				factory.releaseInterimBillInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInterimBillInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInterimBillInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public InvoiceInterface getInvoiceInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoice");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoice");
		return this.getInvoiceInterface(defaultApp, defaultType);
	}
	public void releaseInvoiceInterface(InvoiceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceInterface");
		this.releaseInvoiceInterface(defaultApp, defaultType, obj);
	}
	public InvoiceInterface getInvoiceInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getInvoiceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
				return factory.getInvoiceInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseInvoiceInterface(String appName, String type,InvoiceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseInvoiceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceInterface");
				factory.releaseInvoiceInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public InvoiceDetailInterface getInvoiceDetailInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetail");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetail");
		return this.getInvoiceDetailInterface(defaultApp, defaultType);
	}
	public void releaseInvoiceDetailInterface(InvoiceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailInterface");
		this.releaseInvoiceDetailInterface(defaultApp, defaultType, obj);
	}
	public InvoiceDetailInterface getInvoiceDetailInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getInvoiceDetailInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
				return factory.getInvoiceDetailInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseInvoiceDetailInterface(String appName, String type,InvoiceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseInvoiceDetailInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailInterface");
				factory.releaseInvoiceDetailInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public InvoiceDetailBulkAdjustmentInterface getInvoiceDetailBulkAdjustmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailBulkAdjustment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustment");
		return this.getInvoiceDetailBulkAdjustmentInterface(defaultApp, defaultType);
	}
	public void releaseInvoiceDetailBulkAdjustmentInterface(InvoiceDetailBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
		this.releaseInvoiceDetailBulkAdjustmentInterface(defaultApp, defaultType, obj);
	}
	public InvoiceDetailBulkAdjustmentInterface getInvoiceDetailBulkAdjustmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
				return factory.getInvoiceDetailBulkAdjustmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseInvoiceDetailBulkAdjustmentInterface(String appName, String type,InvoiceDetailBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
				factory.releaseInvoiceDetailBulkAdjustmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public LateFeeRateOverridesInterface getLateFeeRateOverridesInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeRateOverrides");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverrides");
		return this.getLateFeeRateOverridesInterface(defaultApp, defaultType);
	}
	public void releaseLateFeeRateOverridesInterface(LateFeeRateOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLateFeeRateOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLateFeeRateOverridesInterface");
		this.releaseLateFeeRateOverridesInterface(defaultApp, defaultType, obj);
	}
	public LateFeeRateOverridesInterface getLateFeeRateOverridesInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeRateOverridesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getLateFeeRateOverridesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
				return factory.getLateFeeRateOverridesInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseLateFeeRateOverridesInterface(String appName, String type,LateFeeRateOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLateFeeRateOverridesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseLateFeeRateOverridesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLateFeeRateOverridesInterface");
				factory.releaseLateFeeRateOverridesInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLateFeeRateOverridesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLateFeeRateOverridesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public LbxPaymentTypeInterface getLbxPaymentTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxPaymentType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentType");
		return this.getLbxPaymentTypeInterface(defaultApp, defaultType);
	}
	public void releaseLbxPaymentTypeInterface(LbxPaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLbxPaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLbxPaymentTypeInterface");
		this.releaseLbxPaymentTypeInterface(defaultApp, defaultType, obj);
	}
	public LbxPaymentTypeInterface getLbxPaymentTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxPaymentTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getLbxPaymentTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
				return factory.getLbxPaymentTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseLbxPaymentTypeInterface(String appName, String type,LbxPaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLbxPaymentTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseLbxPaymentTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLbxPaymentTypeInterface");
				factory.releaseLbxPaymentTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLbxPaymentTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLbxPaymentTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public MultiLinesAdjInterface getMultiLinesAdjInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getMultiLinesAdj");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdj");
		return this.getMultiLinesAdjInterface(defaultApp, defaultType);
	}
	public void releaseMultiLinesAdjInterface(MultiLinesAdjInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseMultiLinesAdjInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseMultiLinesAdjInterface");
		this.releaseMultiLinesAdjInterface(defaultApp, defaultType, obj);
	}
	public MultiLinesAdjInterface getMultiLinesAdjInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getMultiLinesAdjInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getMultiLinesAdjInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
				return factory.getMultiLinesAdjInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseMultiLinesAdjInterface(String appName, String type,MultiLinesAdjInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseMultiLinesAdjInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseMultiLinesAdjInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseMultiLinesAdjInterface");
				factory.releaseMultiLinesAdjInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseMultiLinesAdjInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseMultiLinesAdjInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public NetActionInterface getNetActionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetAction");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetAction");
		return this.getNetActionInterface(defaultApp, defaultType);
	}
	public void releaseNetActionInterface(NetActionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNetActionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNetActionInterface");
		this.releaseNetActionInterface(defaultApp, defaultType, obj);
	}
	public NetActionInterface getNetActionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getNetActionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
				return factory.getNetActionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseNetActionInterface(String appName, String type,NetActionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNetActionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseNetActionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNetActionInterface");
				factory.releaseNetActionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNetActionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNetActionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public NoteInterface getNoteInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNote");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNote");
		return this.getNoteInterface(defaultApp, defaultType);
	}
	public void releaseNoteInterface(NoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteInterface");
		this.releaseNoteInterface(defaultApp, defaultType, obj);
	}
	public NoteInterface getNoteInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getNoteInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
				return factory.getNoteInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseNoteInterface(String appName, String type,NoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseNoteInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteInterface");
				factory.releaseNoteInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public NoteCodeInterface getNoteCodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteCode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCode");
		return this.getNoteCodeInterface(defaultApp, defaultType);
	}
	public void releaseNoteCodeInterface(NoteCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteCodeInterface");
		this.releaseNoteCodeInterface(defaultApp, defaultType, obj);
	}
	public NoteCodeInterface getNoteCodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getNoteCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
				return factory.getNoteCodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseNoteCodeInterface(String appName, String type,NoteCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseNoteCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteCodeInterface");
				factory.releaseNoteCodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public NoteTextInterface getNoteTextInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteText");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteText");
		return this.getNoteTextInterface(defaultApp, defaultType);
	}
	public void releaseNoteTextInterface(NoteTextInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteTextInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteTextInterface");
		this.releaseNoteTextInterface(defaultApp, defaultType, obj);
	}
	public NoteTextInterface getNoteTextInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTextInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getNoteTextInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
				return factory.getNoteTextInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseNoteTextInterface(String appName, String type,NoteTextInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteTextInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseNoteTextInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteTextInterface");
				factory.releaseNoteTextInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteTextInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteTextInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public OpenItemInterface getOpenItemInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItem");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItem");
		return this.getOpenItemInterface(defaultApp, defaultType);
	}
	public void releaseOpenItemInterface(OpenItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemInterface");
		this.releaseOpenItemInterface(defaultApp, defaultType, obj);
	}
	public OpenItemInterface getOpenItemInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getOpenItemInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
				return factory.getOpenItemInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseOpenItemInterface(String appName, String type,OpenItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseOpenItemInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemInterface");
				factory.releaseOpenItemInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public OpenItemIdMapInterface getOpenItemIdMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMap");
		return this.getOpenItemIdMapInterface(defaultApp, defaultType);
	}
	public void releaseOpenItemIdMapInterface(OpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemIdMapInterface");
		this.releaseOpenItemIdMapInterface(defaultApp, defaultType, obj);
	}
	public OpenItemIdMapInterface getOpenItemIdMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getOpenItemIdMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
				return factory.getOpenItemIdMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseOpenItemIdMapInterface(String appName, String type,OpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemIdMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseOpenItemIdMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemIdMapInterface");
				factory.releaseOpenItemIdMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemIdMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemIdMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public OrderQuoteInterface getOrderQuoteInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderQuote");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuote");
		return this.getOrderQuoteInterface(defaultApp, defaultType);
	}
	public void releaseOrderQuoteInterface(OrderQuoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOrderQuoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOrderQuoteInterface");
		this.releaseOrderQuoteInterface(defaultApp, defaultType, obj);
	}
	public OrderQuoteInterface getOrderQuoteInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderQuoteInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getOrderQuoteInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
				return factory.getOrderQuoteInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseOrderQuoteInterface(String appName, String type,OrderQuoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOrderQuoteInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseOrderQuoteInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOrderQuoteInterface");
				factory.releaseOrderQuoteInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOrderQuoteInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOrderQuoteInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public OverrideDiscountRateInterface getOverrideDiscountRateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDiscountRate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRate");
		return this.getOverrideDiscountRateInterface(defaultApp, defaultType);
	}
	public void releaseOverrideDiscountRateInterface(OverrideDiscountRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideDiscountRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideDiscountRateInterface");
		this.releaseOverrideDiscountRateInterface(defaultApp, defaultType, obj);
	}
	public OverrideDiscountRateInterface getOverrideDiscountRateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDiscountRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getOverrideDiscountRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
				return factory.getOverrideDiscountRateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseOverrideDiscountRateInterface(String appName, String type,OverrideDiscountRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideDiscountRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseOverrideDiscountRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideDiscountRateInterface");
				factory.releaseOverrideDiscountRateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideDiscountRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideDiscountRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public OverrideUsageCreditRateInterface getOverrideUsageCreditRateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsageCreditRate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRate");
		return this.getOverrideUsageCreditRateInterface(defaultApp, defaultType);
	}
	public void releaseOverrideUsageCreditRateInterface(OverrideUsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideUsageCreditRateInterface");
		this.releaseOverrideUsageCreditRateInterface(defaultApp, defaultType, obj);
	}
	public OverrideUsageCreditRateInterface getOverrideUsageCreditRateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsageCreditRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getOverrideUsageCreditRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
				return factory.getOverrideUsageCreditRateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseOverrideUsageCreditRateInterface(String appName, String type,OverrideUsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideUsageCreditRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseOverrideUsageCreditRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideUsageCreditRateInterface");
				factory.releaseOverrideUsageCreditRateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideUsageCreditRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideUsageCreditRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public OwningCostCenterInterface getOwningCostCenterInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCenter");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenter");
		return this.getOwningCostCenterInterface(defaultApp, defaultType);
	}
	public void releaseOwningCostCenterInterface(OwningCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOwningCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOwningCostCenterInterface");
		this.releaseOwningCostCenterInterface(defaultApp, defaultType, obj);
	}
	public OwningCostCenterInterface getOwningCostCenterInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getOwningCostCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
				return factory.getOwningCostCenterInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseOwningCostCenterInterface(String appName, String type,OwningCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOwningCostCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseOwningCostCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOwningCostCenterInterface");
				factory.releaseOwningCostCenterInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOwningCostCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOwningCostCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PackageComponentDefInterface getPackageComponentDefInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageComponentDef");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDef");
		return this.getPackageComponentDefInterface(defaultApp, defaultType);
	}
	public void releasePackageComponentDefInterface(PackageComponentDefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePackageComponentDefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePackageComponentDefInterface");
		this.releasePackageComponentDefInterface(defaultApp, defaultType, obj);
	}
	public PackageComponentDefInterface getPackageComponentDefInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageComponentDefInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPackageComponentDefInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
				return factory.getPackageComponentDefInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePackageComponentDefInterface(String appName, String type,PackageComponentDefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePackageComponentDefInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePackageComponentDefInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePackageComponentDefInterface");
				factory.releasePackageComponentDefInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePackageComponentDefInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePackageComponentDefInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PaymentInterface getPaymentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPayment");
		return this.getPaymentInterface(defaultApp, defaultType);
	}
	public void releasePaymentInterface(PaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentInterface");
		this.releasePaymentInterface(defaultApp, defaultType, obj);
	}
	public PaymentInterface getPaymentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
				return factory.getPaymentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePaymentInterface(String appName, String type,PaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentInterface");
				factory.releasePaymentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PaymentDistributionInterface getPaymentDistributionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDistribution");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistribution");
		return this.getPaymentDistributionInterface(defaultApp, defaultType);
	}
	public void releasePaymentDistributionInterface(PaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentDistributionInterface");
		this.releasePaymentDistributionInterface(defaultApp, defaultType, obj);
	}
	public PaymentDistributionInterface getPaymentDistributionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDistributionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPaymentDistributionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
				return factory.getPaymentDistributionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePaymentDistributionInterface(String appName, String type,PaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentDistributionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePaymentDistributionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentDistributionInterface");
				factory.releasePaymentDistributionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentDistributionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentDistributionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PaymentMerchantIdInterface getPaymentMerchantIdInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantId");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantId");
		return this.getPaymentMerchantIdInterface(defaultApp, defaultType);
	}
	public void releasePaymentMerchantIdInterface(PaymentMerchantIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdInterface");
		this.releasePaymentMerchantIdInterface(defaultApp, defaultType, obj);
	}
	public PaymentMerchantIdInterface getPaymentMerchantIdInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPaymentMerchantIdInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
				return factory.getPaymentMerchantIdInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePaymentMerchantIdInterface(String appName, String type,PaymentMerchantIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePaymentMerchantIdInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdInterface");
				factory.releasePaymentMerchantIdInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PaymentMerchantIdAssignInterface getPaymentMerchantIdAssignInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdAssign");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssign");
		return this.getPaymentMerchantIdAssignInterface(defaultApp, defaultType);
	}
	public void releasePaymentMerchantIdAssignInterface(PaymentMerchantIdAssignInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdAssignInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdAssignInterface");
		this.releasePaymentMerchantIdAssignInterface(defaultApp, defaultType, obj);
	}
	public PaymentMerchantIdAssignInterface getPaymentMerchantIdAssignInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdAssignInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPaymentMerchantIdAssignInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
				return factory.getPaymentMerchantIdAssignInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePaymentMerchantIdAssignInterface(String appName, String type,PaymentMerchantIdAssignInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdAssignInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePaymentMerchantIdAssignInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdAssignInterface");
				factory.releasePaymentMerchantIdAssignInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdAssignInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdAssignInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PaymentProfileInterface getPaymentProfileInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfile");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfile");
		return this.getPaymentProfileInterface(defaultApp, defaultType);
	}
	public void releasePaymentProfileInterface(PaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentProfileInterface");
		this.releasePaymentProfileInterface(defaultApp, defaultType, obj);
	}
	public PaymentProfileInterface getPaymentProfileInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfileInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPaymentProfileInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
				return factory.getPaymentProfileInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePaymentProfileInterface(String appName, String type,PaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentProfileInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePaymentProfileInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentProfileInterface");
				factory.releasePaymentProfileInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentProfileInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentProfileInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PaymentTransInterface getPaymentTransInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTrans");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTrans");
		return this.getPaymentTransInterface(defaultApp, defaultType);
	}
	public void releasePaymentTransInterface(PaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTransInterface");
		this.releasePaymentTransInterface(defaultApp, defaultType, obj);
	}
	public PaymentTransInterface getPaymentTransInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTransInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPaymentTransInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
				return factory.getPaymentTransInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePaymentTransInterface(String appName, String type,PaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTransInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePaymentTransInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTransInterface");
				factory.releasePaymentTransInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTransInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTransInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PaymentTypeInterface getPaymentTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentType");
		return this.getPaymentTypeInterface(defaultApp, defaultType);
	}
	public void releasePaymentTypeInterface(PaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTypeInterface");
		this.releasePaymentTypeInterface(defaultApp, defaultType, obj);
	}
	public PaymentTypeInterface getPaymentTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPaymentTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
				return factory.getPaymentTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePaymentTypeInterface(String appName, String type,PaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePaymentTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTypeInterface");
				factory.releasePaymentTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PrepaymentInterface getPrepaymentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepayment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepayment");
		return this.getPrepaymentInterface(defaultApp, defaultType);
	}
	public void releasePrepaymentInterface(PrepaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentInterface");
		this.releasePrepaymentInterface(defaultApp, defaultType, obj);
	}
	public PrepaymentInterface getPrepaymentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPrepaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
				return factory.getPrepaymentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePrepaymentInterface(String appName, String type,PrepaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePrepaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentInterface");
				factory.releasePrepaymentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PrepaymentDistributionInterface getPrepaymentDistributionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentDistribution");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistribution");
		return this.getPrepaymentDistributionInterface(defaultApp, defaultType);
	}
	public void releasePrepaymentDistributionInterface(PrepaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentDistributionInterface");
		this.releasePrepaymentDistributionInterface(defaultApp, defaultType, obj);
	}
	public PrepaymentDistributionInterface getPrepaymentDistributionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentDistributionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPrepaymentDistributionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
				return factory.getPrepaymentDistributionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePrepaymentDistributionInterface(String appName, String type,PrepaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentDistributionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePrepaymentDistributionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentDistributionInterface");
				factory.releasePrepaymentDistributionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentDistributionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentDistributionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public PrivacyLevelInterface getPrivacyLevelInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevel");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevel");
		return this.getPrivacyLevelInterface(defaultApp, defaultType);
	}
	public void releasePrivacyLevelInterface(PrivacyLevelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrivacyLevelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrivacyLevelInterface");
		this.releasePrivacyLevelInterface(defaultApp, defaultType, obj);
	}
	public PrivacyLevelInterface getPrivacyLevelInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevelInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getPrivacyLevelInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
				return factory.getPrivacyLevelInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releasePrivacyLevelInterface(String appName, String type,PrivacyLevelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrivacyLevelInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releasePrivacyLevelInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrivacyLevelInterface");
				factory.releasePrivacyLevelInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrivacyLevelInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrivacyLevelInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ProductCatalogInterface getProductCatalogInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductCatalog");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalog");
		return this.getProductCatalogInterface(defaultApp, defaultType);
	}
	public void releaseProductCatalogInterface(ProductCatalogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductCatalogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductCatalogInterface");
		this.releaseProductCatalogInterface(defaultApp, defaultType, obj);
	}
	public ProductCatalogInterface getProductCatalogInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductCatalogInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getProductCatalogInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
				return factory.getProductCatalogInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseProductCatalogInterface(String appName, String type,ProductCatalogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductCatalogInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseProductCatalogInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductCatalogInterface");
				factory.releaseProductCatalogInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductCatalogInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductCatalogInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ProductChargeMapInterface getProductChargeMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductChargeMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMap");
		return this.getProductChargeMapInterface(defaultApp, defaultType);
	}
	public void releaseProductChargeMapInterface(ProductChargeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductChargeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductChargeMapInterface");
		this.releaseProductChargeMapInterface(defaultApp, defaultType, obj);
	}
	public ProductChargeMapInterface getProductChargeMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductChargeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getProductChargeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
				return factory.getProductChargeMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseProductChargeMapInterface(String appName, String type,ProductChargeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductChargeMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseProductChargeMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductChargeMapInterface");
				factory.releaseProductChargeMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductChargeMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductChargeMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ProductRateKeyInterface getProductRateKeyInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateKey");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKey");
		return this.getProductRateKeyInterface(defaultApp, defaultType);
	}
	public void releaseProductRateKeyInterface(ProductRateKeyInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateKeyInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateKeyInterface");
		this.releaseProductRateKeyInterface(defaultApp, defaultType, obj);
	}
	public ProductRateKeyInterface getProductRateKeyInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateKeyInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getProductRateKeyInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
				return factory.getProductRateKeyInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseProductRateKeyInterface(String appName, String type,ProductRateKeyInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateKeyInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseProductRateKeyInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateKeyInterface");
				factory.releaseProductRateKeyInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateKeyInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateKeyInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ProductRateOverrideInterface getProductRateOverrideInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateOverride");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverride");
		return this.getProductRateOverrideInterface(defaultApp, defaultType);
	}
	public void releaseProductRateOverrideInterface(ProductRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateOverrideInterface");
		this.releaseProductRateOverrideInterface(defaultApp, defaultType, obj);
	}
	public ProductRateOverrideInterface getProductRateOverrideInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateOverrideInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getProductRateOverrideInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
				return factory.getProductRateOverrideInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseProductRateOverrideInterface(String appName, String type,ProductRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateOverrideInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseProductRateOverrideInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateOverrideInterface");
				factory.releaseProductRateOverrideInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateOverrideInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateOverrideInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ProductRcRateInterface getProductRcRateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRcRate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRate");
		return this.getProductRcRateInterface(defaultApp, defaultType);
	}
	public void releaseProductRcRateInterface(ProductRcRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRcRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRcRateInterface");
		this.releaseProductRcRateInterface(defaultApp, defaultType, obj);
	}
	public ProductRcRateInterface getProductRcRateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRcRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getProductRcRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
				return factory.getProductRcRateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseProductRcRateInterface(String appName, String type,ProductRcRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRcRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseProductRcRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRcRateInterface");
				factory.releaseProductRcRateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRcRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRcRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RefinancePlanInterface getRefinancePlanInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlan");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlan");
		return this.getRefinancePlanInterface(defaultApp, defaultType);
	}
	public void releaseRefinancePlanInterface(RefinancePlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefinancePlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefinancePlanInterface");
		this.releaseRefinancePlanInterface(defaultApp, defaultType, obj);
	}
	public RefinancePlanInterface getRefinancePlanInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRefinancePlanInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
				return factory.getRefinancePlanInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRefinancePlanInterface(String appName, String type,RefinancePlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefinancePlanInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRefinancePlanInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefinancePlanInterface");
				factory.releaseRefinancePlanInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefinancePlanInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefinancePlanInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RefundInterface getRefundInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefund");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefund");
		return this.getRefundInterface(defaultApp, defaultType);
	}
	public void releaseRefundInterface(RefundInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundInterface");
		this.releaseRefundInterface(defaultApp, defaultType, obj);
	}
	public RefundInterface getRefundInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRefundInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
				return factory.getRefundInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRefundInterface(String appName, String type,RefundInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRefundInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundInterface");
				factory.releaseRefundInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RefundReasonInterface getRefundReasonInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReason");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReason");
		return this.getRefundReasonInterface(defaultApp, defaultType);
	}
	public void releaseRefundReasonInterface(RefundReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundReasonInterface");
		this.releaseRefundReasonInterface(defaultApp, defaultType, obj);
	}
	public RefundReasonInterface getRefundReasonInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRefundReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
				return factory.getRefundReasonInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRefundReasonInterface(String appName, String type,RefundReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRefundReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundReasonInterface");
				factory.releaseRefundReasonInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RegulatoryIdInterface getRegulatoryIdInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryId");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryId");
		return this.getRegulatoryIdInterface(defaultApp, defaultType);
	}
	public void releaseRegulatoryIdInterface(RegulatoryIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRegulatoryIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRegulatoryIdInterface");
		this.releaseRegulatoryIdInterface(defaultApp, defaultType, obj);
	}
	public RegulatoryIdInterface getRegulatoryIdInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRegulatoryIdInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
				return factory.getRegulatoryIdInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRegulatoryIdInterface(String appName, String type,RegulatoryIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRegulatoryIdInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRegulatoryIdInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRegulatoryIdInterface");
				factory.releaseRegulatoryIdInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRegulatoryIdInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRegulatoryIdInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RevRcvCostCenterInterface getRevRcvCostCenterInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCenter");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenter");
		return this.getRevRcvCostCenterInterface(defaultApp, defaultType);
	}
	public void releaseRevRcvCostCenterInterface(RevRcvCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRevRcvCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRevRcvCostCenterInterface");
		this.releaseRevRcvCostCenterInterface(defaultApp, defaultType, obj);
	}
	public RevRcvCostCenterInterface getRevRcvCostCenterInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRevRcvCostCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
				return factory.getRevRcvCostCenterInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRevRcvCostCenterInterface(String appName, String type,RevRcvCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRevRcvCostCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRevRcvCostCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRevRcvCostCenterInterface");
				factory.releaseRevRcvCostCenterInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRevRcvCostCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRevRcvCostCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ReverseBulkAdjustmentInterface getReverseBulkAdjustmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getReverseBulkAdjustment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustment");
		return this.getReverseBulkAdjustmentInterface(defaultApp, defaultType);
	}
	public void releaseReverseBulkAdjustmentInterface(ReverseBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseReverseBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseReverseBulkAdjustmentInterface");
		this.releaseReverseBulkAdjustmentInterface(defaultApp, defaultType, obj);
	}
	public ReverseBulkAdjustmentInterface getReverseBulkAdjustmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getReverseBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getReverseBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
				return factory.getReverseBulkAdjustmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseReverseBulkAdjustmentInterface(String appName, String type,ReverseBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseReverseBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseReverseBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseReverseBulkAdjustmentInterface");
				factory.releaseReverseBulkAdjustmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseReverseBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseReverseBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RewardBalanceInterface getRewardBalanceInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalance");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalance");
		return this.getRewardBalanceInterface(defaultApp, defaultType);
	}
	public void releaseRewardBalanceInterface(RewardBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceInterface");
		this.releaseRewardBalanceInterface(defaultApp, defaultType, obj);
	}
	public RewardBalanceInterface getRewardBalanceInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRewardBalanceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
				return factory.getRewardBalanceInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRewardBalanceInterface(String appName, String type,RewardBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRewardBalanceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceInterface");
				factory.releaseRewardBalanceInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RewardBalanceEntityMappingInterface getRewardBalanceEntityMappingInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceEntityMapping");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMapping");
		return this.getRewardBalanceEntityMappingInterface(defaultApp, defaultType);
	}
	public void releaseRewardBalanceEntityMappingInterface(RewardBalanceEntityMappingInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
		this.releaseRewardBalanceEntityMappingInterface(defaultApp, defaultType, obj);
	}
	public RewardBalanceEntityMappingInterface getRewardBalanceEntityMappingInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceEntityMappingInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRewardBalanceEntityMappingInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
				return factory.getRewardBalanceEntityMappingInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRewardBalanceEntityMappingInterface(String appName, String type,RewardBalanceEntityMappingInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRewardBalanceEntityMappingInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
				factory.releaseRewardBalanceEntityMappingInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public RtPaymentResponseInterface getRtPaymentResponseInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtPaymentResponse");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponse");
		return this.getRtPaymentResponseInterface(defaultApp, defaultType);
	}
	public void releaseRtPaymentResponseInterface(RtPaymentResponseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRtPaymentResponseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRtPaymentResponseInterface");
		this.releaseRtPaymentResponseInterface(defaultApp, defaultType, obj);
	}
	public RtPaymentResponseInterface getRtPaymentResponseInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtPaymentResponseInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getRtPaymentResponseInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
				return factory.getRtPaymentResponseInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseRtPaymentResponseInterface(String appName, String type,RtPaymentResponseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRtPaymentResponseInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseRtPaymentResponseInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRtPaymentResponseInterface");
				factory.releaseRtPaymentResponseInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRtPaymentResponseInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRtPaymentResponseInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public SalesChannelInterface getSalesChannelInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannel");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannel");
		return this.getSalesChannelInterface(defaultApp, defaultType);
	}
	public void releaseSalesChannelInterface(SalesChannelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSalesChannelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSalesChannelInterface");
		this.releaseSalesChannelInterface(defaultApp, defaultType, obj);
	}
	public SalesChannelInterface getSalesChannelInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getSalesChannelInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
				return factory.getSalesChannelInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseSalesChannelInterface(String appName, String type,SalesChannelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSalesChannelInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseSalesChannelInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSalesChannelInterface");
				factory.releaseSalesChannelInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSalesChannelInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSalesChannelInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public SecurityAciInterface getSecurityAciInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityAci");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAci");
		return this.getSecurityAciInterface(defaultApp, defaultType);
	}
	public void releaseSecurityAciInterface(SecurityAciInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityAciInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityAciInterface");
		this.releaseSecurityAciInterface(defaultApp, defaultType, obj);
	}
	public SecurityAciInterface getSecurityAciInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityAciInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getSecurityAciInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
				return factory.getSecurityAciInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseSecurityAciInterface(String appName, String type,SecurityAciInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityAciInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseSecurityAciInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityAciInterface");
				factory.releaseSecurityAciInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityAciInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityAciInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public SecurityResourceInterface getSecurityResourceInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityResource");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResource");
		return this.getSecurityResourceInterface(defaultApp, defaultType);
	}
	public void releaseSecurityResourceInterface(SecurityResourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityResourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityResourceInterface");
		this.releaseSecurityResourceInterface(defaultApp, defaultType, obj);
	}
	public SecurityResourceInterface getSecurityResourceInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityResourceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getSecurityResourceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
				return factory.getSecurityResourceInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseSecurityResourceInterface(String appName, String type,SecurityResourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityResourceInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseSecurityResourceInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityResourceInterface");
				factory.releaseSecurityResourceInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityResourceInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityResourceInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public SecurityRoleInterface getSecurityRoleInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityRole");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRole");
		return this.getSecurityRoleInterface(defaultApp, defaultType);
	}
	public void releaseSecurityRoleInterface(SecurityRoleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityRoleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityRoleInterface");
		this.releaseSecurityRoleInterface(defaultApp, defaultType, obj);
	}
	public SecurityRoleInterface getSecurityRoleInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityRoleInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getSecurityRoleInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
				return factory.getSecurityRoleInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseSecurityRoleInterface(String appName, String type,SecurityRoleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityRoleInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseSecurityRoleInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityRoleInterface");
				factory.releaseSecurityRoleInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityRoleInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityRoleInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public SecurityUserInterface getSecurityUserInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityUser");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUser");
		return this.getSecurityUserInterface(defaultApp, defaultType);
	}
	public void releaseSecurityUserInterface(SecurityUserInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityUserInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityUserInterface");
		this.releaseSecurityUserInterface(defaultApp, defaultType, obj);
	}
	public SecurityUserInterface getSecurityUserInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityUserInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getSecurityUserInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
				return factory.getSecurityUserInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseSecurityUserInterface(String appName, String type,SecurityUserInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityUserInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseSecurityUserInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityUserInterface");
				factory.releaseSecurityUserInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityUserInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityUserInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServerInterface getServerInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServer");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServer");
		return this.getServerInterface(defaultApp, defaultType);
	}
	public void releaseServerInterface(ServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerInterface");
		this.releaseServerInterface(defaultApp, defaultType, obj);
	}
	public ServerInterface getServerInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServerInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
				return factory.getServerInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServerInterface(String appName, String type,ServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServerInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerInterface");
				factory.releaseServerInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServerCategoryInterface getServerCategoryInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategory");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategory");
		return this.getServerCategoryInterface(defaultApp, defaultType);
	}
	public void releaseServerCategoryInterface(ServerCategoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerCategoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerCategoryInterface");
		this.releaseServerCategoryInterface(defaultApp, defaultType, obj);
	}
	public ServerCategoryInterface getServerCategoryInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategoryInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServerCategoryInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
				return factory.getServerCategoryInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServerCategoryInterface(String appName, String type,ServerCategoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerCategoryInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServerCategoryInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerCategoryInterface");
				factory.releaseServerCategoryInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerCategoryInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerCategoryInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServerDefinitionInterface getServerDefinitionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerDefinition");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinition");
		return this.getServerDefinitionInterface(defaultApp, defaultType);
	}
	public void releaseServerDefinitionInterface(ServerDefinitionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerDefinitionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerDefinitionInterface");
		this.releaseServerDefinitionInterface(defaultApp, defaultType, obj);
	}
	public ServerDefinitionInterface getServerDefinitionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerDefinitionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServerDefinitionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
				return factory.getServerDefinitionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServerDefinitionInterface(String appName, String type,ServerDefinitionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerDefinitionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServerDefinitionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerDefinitionInterface");
				factory.releaseServerDefinitionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerDefinitionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerDefinitionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServiceCenterInterface getServiceCenterInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenter");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenter");
		return this.getServiceCenterInterface(defaultApp, defaultType);
	}
	public void releaseServiceCenterInterface(ServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterInterface");
		this.releaseServiceCenterInterface(defaultApp, defaultType, obj);
	}
	public ServiceCenterInterface getServiceCenterInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServiceCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
				return factory.getServiceCenterInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServiceCenterInterface(String appName, String type,ServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServiceCenterInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterInterface");
				factory.releaseServiceCenterInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServiceCenterTypeInterface getServiceCenterTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterType");
		return this.getServiceCenterTypeInterface(defaultApp, defaultType);
	}
	public void releaseServiceCenterTypeInterface(ServiceCenterTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterTypeInterface");
		this.releaseServiceCenterTypeInterface(defaultApp, defaultType, obj);
	}
	public ServiceCenterTypeInterface getServiceCenterTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServiceCenterTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
				return factory.getServiceCenterTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServiceCenterTypeInterface(String appName, String type,ServiceCenterTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServiceCenterTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterTypeInterface");
				factory.releaseServiceCenterTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServiceMasterGroupInterface getServiceMasterGroupInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMasterGroup");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroup");
		return this.getServiceMasterGroupInterface(defaultApp, defaultType);
	}
	public void releaseServiceMasterGroupInterface(ServiceMasterGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceMasterGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceMasterGroupInterface");
		this.releaseServiceMasterGroupInterface(defaultApp, defaultType, obj);
	}
	public ServiceMasterGroupInterface getServiceMasterGroupInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMasterGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServiceMasterGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
				return factory.getServiceMasterGroupInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServiceMasterGroupInterface(String appName, String type,ServiceMasterGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceMasterGroupInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServiceMasterGroupInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceMasterGroupInterface");
				factory.releaseServiceMasterGroupInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceMasterGroupInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceMasterGroupInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServicePricingPlanInterface getServicePricingPlanInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePricingPlan");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlan");
		return this.getServicePricingPlanInterface(defaultApp, defaultType);
	}
	public void releaseServicePricingPlanInterface(ServicePricingPlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServicePricingPlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServicePricingPlanInterface");
		this.releaseServicePricingPlanInterface(defaultApp, defaultType, obj);
	}
	public ServicePricingPlanInterface getServicePricingPlanInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePricingPlanInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServicePricingPlanInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
				return factory.getServicePricingPlanInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServicePricingPlanInterface(String appName, String type,ServicePricingPlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServicePricingPlanInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServicePricingPlanInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServicePricingPlanInterface");
				factory.releaseServicePricingPlanInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServicePricingPlanInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServicePricingPlanInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public ServiceZoneInterface getServiceZoneInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceZone");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZone");
		return this.getServiceZoneInterface(defaultApp, defaultType);
	}
	public void releaseServiceZoneInterface(ServiceZoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceZoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceZoneInterface");
		this.releaseServiceZoneInterface(defaultApp, defaultType, obj);
	}
	public ServiceZoneInterface getServiceZoneInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceZoneInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getServiceZoneInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
				return factory.getServiceZoneInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseServiceZoneInterface(String appName, String type,ServiceZoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceZoneInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseServiceZoneInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceZoneInterface");
				factory.releaseServiceZoneInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceZoneInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceZoneInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public SlaMeasurementDataInterface getSlaMeasurementDataInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementData");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementData");
		return this.getSlaMeasurementDataInterface(defaultApp, defaultType);
	}
	public void releaseSlaMeasurementDataInterface(SlaMeasurementDataInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSlaMeasurementDataInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSlaMeasurementDataInterface");
		this.releaseSlaMeasurementDataInterface(defaultApp, defaultType, obj);
	}
	public SlaMeasurementDataInterface getSlaMeasurementDataInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementDataInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getSlaMeasurementDataInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
				return factory.getSlaMeasurementDataInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseSlaMeasurementDataInterface(String appName, String type,SlaMeasurementDataInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSlaMeasurementDataInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseSlaMeasurementDataInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSlaMeasurementDataInterface");
				factory.releaseSlaMeasurementDataInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSlaMeasurementDataInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSlaMeasurementDataInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public StatusReasonMapInterface getStatusReasonMapInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonMap");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMap");
		return this.getStatusReasonMapInterface(defaultApp, defaultType);
	}
	public void releaseStatusReasonMapInterface(StatusReasonMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseStatusReasonMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseStatusReasonMapInterface");
		this.releaseStatusReasonMapInterface(defaultApp, defaultType, obj);
	}
	public StatusReasonMapInterface getStatusReasonMapInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getStatusReasonMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
				return factory.getStatusReasonMapInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseStatusReasonMapInterface(String appName, String type,StatusReasonMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseStatusReasonMapInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseStatusReasonMapInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseStatusReasonMapInterface");
				factory.releaseStatusReasonMapInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseStatusReasonMapInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseStatusReasonMapInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TaxAbandonedInterface getTaxAbandonedInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAbandoned");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandoned");
		return this.getTaxAbandonedInterface(defaultApp, defaultType);
	}
	public void releaseTaxAbandonedInterface(TaxAbandonedInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAbandonedInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAbandonedInterface");
		this.releaseTaxAbandonedInterface(defaultApp, defaultType, obj);
	}
	public TaxAbandonedInterface getTaxAbandonedInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAbandonedInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTaxAbandonedInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
				return factory.getTaxAbandonedInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTaxAbandonedInterface(String appName, String type,TaxAbandonedInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAbandonedInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTaxAbandonedInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAbandonedInterface");
				factory.releaseTaxAbandonedInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAbandonedInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAbandonedInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TaxAssignmentInterface getTaxAssignmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAssignment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignment");
		return this.getTaxAssignmentInterface(defaultApp, defaultType);
	}
	public void releaseTaxAssignmentInterface(TaxAssignmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAssignmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAssignmentInterface");
		this.releaseTaxAssignmentInterface(defaultApp, defaultType, obj);
	}
	public TaxAssignmentInterface getTaxAssignmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAssignmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTaxAssignmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
				return factory.getTaxAssignmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTaxAssignmentInterface(String appName, String type,TaxAssignmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAssignmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTaxAssignmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAssignmentInterface");
				factory.releaseTaxAssignmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAssignmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAssignmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TaxExemptionInterface getTaxExemptionInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxExemption");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemption");
		return this.getTaxExemptionInterface(defaultApp, defaultType);
	}
	public void releaseTaxExemptionInterface(TaxExemptionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxExemptionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxExemptionInterface");
		this.releaseTaxExemptionInterface(defaultApp, defaultType, obj);
	}
	public TaxExemptionInterface getTaxExemptionInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxExemptionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTaxExemptionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
				return factory.getTaxExemptionInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTaxExemptionInterface(String appName, String type,TaxExemptionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxExemptionInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTaxExemptionInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxExemptionInterface");
				factory.releaseTaxExemptionInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxExemptionInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxExemptionInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TaxPackageInstInterface getTaxPackageInstInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPackageInst");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInst");
		return this.getTaxPackageInstInterface(defaultApp, defaultType);
	}
	public void releaseTaxPackageInstInterface(TaxPackageInstInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxPackageInstInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxPackageInstInterface");
		this.releaseTaxPackageInstInterface(defaultApp, defaultType, obj);
	}
	public TaxPackageInstInterface getTaxPackageInstInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPackageInstInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTaxPackageInstInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
				return factory.getTaxPackageInstInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTaxPackageInstInterface(String appName, String type,TaxPackageInstInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxPackageInstInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTaxPackageInstInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxPackageInstInterface");
				factory.releaseTaxPackageInstInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxPackageInstInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxPackageInstInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TaxRatesVatInterface getTaxRatesVatInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRatesVat");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVat");
		return this.getTaxRatesVatInterface(defaultApp, defaultType);
	}
	public void releaseTaxRatesVatInterface(TaxRatesVatInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxRatesVatInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxRatesVatInterface");
		this.releaseTaxRatesVatInterface(defaultApp, defaultType, obj);
	}
	public TaxRatesVatInterface getTaxRatesVatInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRatesVatInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTaxRatesVatInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
				return factory.getTaxRatesVatInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTaxRatesVatInterface(String appName, String type,TaxRatesVatInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxRatesVatInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTaxRatesVatInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxRatesVatInterface");
				factory.releaseTaxRatesVatInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxRatesVatInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxRatesVatInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TaxStatusInterface getTaxStatusInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatus");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatus");
		return this.getTaxStatusInterface(defaultApp, defaultType);
	}
	public void releaseTaxStatusInterface(TaxStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxStatusInterface");
		this.releaseTaxStatusInterface(defaultApp, defaultType, obj);
	}
	public TaxStatusInterface getTaxStatusInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTaxStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
				return factory.getTaxStatusInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTaxStatusInterface(String appName, String type,TaxStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTaxStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxStatusInterface");
				factory.releaseTaxStatusInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TaxTypeCommInterface getTaxTypeCommInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeComm");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeComm");
		return this.getTaxTypeCommInterface(defaultApp, defaultType);
	}
	public void releaseTaxTypeCommInterface(TaxTypeCommInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxTypeCommInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxTypeCommInterface");
		this.releaseTaxTypeCommInterface(defaultApp, defaultType, obj);
	}
	public TaxTypeCommInterface getTaxTypeCommInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCommInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTaxTypeCommInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
				return factory.getTaxTypeCommInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTaxTypeCommInterface(String appName, String type,TaxTypeCommInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxTypeCommInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTaxTypeCommInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxTypeCommInterface");
				factory.releaseTaxTypeCommInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxTypeCommInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxTypeCommInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TimezoneInterface getTimezoneInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezone");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezone");
		return this.getTimezoneInterface(defaultApp, defaultType);
	}
	public void releaseTimezoneInterface(TimezoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTimezoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTimezoneInterface");
		this.releaseTimezoneInterface(defaultApp, defaultType, obj);
	}
	public TimezoneInterface getTimezoneInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTimezoneInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
				return factory.getTimezoneInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTimezoneInterface(String appName, String type,TimezoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTimezoneInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTimezoneInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTimezoneInterface");
				factory.releaseTimezoneInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTimezoneInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTimezoneInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TransSourceTypeInterface getTransSourceTypeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceType");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceType");
		return this.getTransSourceTypeInterface(defaultApp, defaultType);
	}
	public void releaseTransSourceTypeInterface(TransSourceTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransSourceTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransSourceTypeInterface");
		this.releaseTransSourceTypeInterface(defaultApp, defaultType, obj);
	}
	public TransSourceTypeInterface getTransSourceTypeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTransSourceTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
				return factory.getTransSourceTypeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTransSourceTypeInterface(String appName, String type,TransSourceTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransSourceTypeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTransSourceTypeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransSourceTypeInterface");
				factory.releaseTransSourceTypeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransSourceTypeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransSourceTypeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public TransferReasonInterface getTransferReasonInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferReason");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReason");
		return this.getTransferReasonInterface(defaultApp, defaultType);
	}
	public void releaseTransferReasonInterface(TransferReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransferReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransferReasonInterface");
		this.releaseTransferReasonInterface(defaultApp, defaultType, obj);
	}
	public TransferReasonInterface getTransferReasonInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getTransferReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
				return factory.getTransferReasonInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseTransferReasonInterface(String appName, String type,TransferReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransferReasonInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseTransferReasonInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransferReasonInterface");
				factory.releaseTransferReasonInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransferReasonInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransferReasonInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public UnappliedPaymentInterface getUnappliedPaymentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnappliedPayment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPayment");
		return this.getUnappliedPaymentInterface(defaultApp, defaultType);
	}
	public void releaseUnappliedPaymentInterface(UnappliedPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnappliedPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnappliedPaymentInterface");
		this.releaseUnappliedPaymentInterface(defaultApp, defaultType, obj);
	}
	public UnappliedPaymentInterface getUnappliedPaymentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnappliedPaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getUnappliedPaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
				return factory.getUnappliedPaymentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseUnappliedPaymentInterface(String appName, String type,UnappliedPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnappliedPaymentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseUnappliedPaymentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnappliedPaymentInterface");
				factory.releaseUnappliedPaymentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnappliedPaymentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnappliedPaymentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public UnbilledUsageInterface getUnbilledUsageInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsage");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsage");
		return this.getUnbilledUsageInterface(defaultApp, defaultType);
	}
	public void releaseUnbilledUsageInterface(UnbilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageInterface");
		this.releaseUnbilledUsageInterface(defaultApp, defaultType, obj);
	}
	public UnbilledUsageInterface getUnbilledUsageInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getUnbilledUsageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
				return factory.getUnbilledUsageInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseUnbilledUsageInterface(String appName, String type,UnbilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseUnbilledUsageInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageInterface");
				factory.releaseUnbilledUsageInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public UnbilledUsageBulkAdjustmentInterface getUnbilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageBulkAdjustment");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustment");
		return this.getUnbilledUsageBulkAdjustmentInterface(defaultApp, defaultType);
	}
	public void releaseUnbilledUsageBulkAdjustmentInterface(UnbilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
		this.releaseUnbilledUsageBulkAdjustmentInterface(defaultApp, defaultType, obj);
	}
	public UnbilledUsageBulkAdjustmentInterface getUnbilledUsageBulkAdjustmentInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
				return factory.getUnbilledUsageBulkAdjustmentInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseUnbilledUsageBulkAdjustmentInterface(String appName, String type,UnbilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
				factory.releaseUnbilledUsageBulkAdjustmentInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public UsageCreditRateInterface getUsageCreditRateInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageCreditRate");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRate");
		return this.getUsageCreditRateInterface(defaultApp, defaultType);
	}
	public void releaseUsageCreditRateInterface(UsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUsageCreditRateInterface");
		this.releaseUsageCreditRateInterface(defaultApp, defaultType, obj);
	}
	public UsageCreditRateInterface getUsageCreditRateInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageCreditRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getUsageCreditRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
				return factory.getUsageCreditRateInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseUsageCreditRateInterface(String appName, String type,UsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUsageCreditRateInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseUsageCreditRateInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUsageCreditRateInterface");
				factory.releaseUsageCreditRateInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUsageCreditRateInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUsageCreditRateInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VipCodeInterface getVipCodeInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCode");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCode");
		return this.getVipCodeInterface(defaultApp, defaultType);
	}
	public void releaseVipCodeInterface(VipCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVipCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVipCodeInterface");
		this.releaseVipCodeInterface(defaultApp, defaultType, obj);
	}
	public VipCodeInterface getVipCodeInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVipCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
				return factory.getVipCodeInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVipCodeInterface(String appName, String type,VipCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVipCodeInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVipCodeInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVipCodeInterface");
				factory.releaseVipCodeInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVipCodeInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVipCodeInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VoucherDefinitionsInterface getVoucherDefinitionsInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDefinitions");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitions");
		return this.getVoucherDefinitionsInterface(defaultApp, defaultType);
	}
	public void releaseVoucherDefinitionsInterface(VoucherDefinitionsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherDefinitionsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherDefinitionsInterface");
		this.releaseVoucherDefinitionsInterface(defaultApp, defaultType, obj);
	}
	public VoucherDefinitionsInterface getVoucherDefinitionsInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDefinitionsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVoucherDefinitionsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
				return factory.getVoucherDefinitionsInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVoucherDefinitionsInterface(String appName, String type,VoucherDefinitionsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherDefinitionsInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVoucherDefinitionsInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherDefinitionsInterface");
				factory.releaseVoucherDefinitionsInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherDefinitionsInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherDefinitionsInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VoucherHistoryInterface getVoucherHistoryInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherHistory");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistory");
		return this.getVoucherHistoryInterface(defaultApp, defaultType);
	}
	public void releaseVoucherHistoryInterface(VoucherHistoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherHistoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherHistoryInterface");
		this.releaseVoucherHistoryInterface(defaultApp, defaultType, obj);
	}
	public VoucherHistoryInterface getVoucherHistoryInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherHistoryInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVoucherHistoryInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
				return factory.getVoucherHistoryInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVoucherHistoryInterface(String appName, String type,VoucherHistoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherHistoryInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVoucherHistoryInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherHistoryInterface");
				factory.releaseVoucherHistoryInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherHistoryInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherHistoryInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VoucherLocationInterface getVoucherLocationInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherLocation");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocation");
		return this.getVoucherLocationInterface(defaultApp, defaultType);
	}
	public void releaseVoucherLocationInterface(VoucherLocationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherLocationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherLocationInterface");
		this.releaseVoucherLocationInterface(defaultApp, defaultType, obj);
	}
	public VoucherLocationInterface getVoucherLocationInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherLocationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVoucherLocationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
				return factory.getVoucherLocationInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVoucherLocationInterface(String appName, String type,VoucherLocationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherLocationInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVoucherLocationInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherLocationInterface");
				factory.releaseVoucherLocationInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherLocationInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherLocationInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VoucherStatusInterface getVoucherStatusInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatus");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatus");
		return this.getVoucherStatusInterface(defaultApp, defaultType);
	}
	public void releaseVoucherStatusInterface(VoucherStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInterface");
		this.releaseVoucherStatusInterface(defaultApp, defaultType, obj);
	}
	public VoucherStatusInterface getVoucherStatusInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVoucherStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
				return factory.getVoucherStatusInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVoucherStatusInterface(String appName, String type,VoucherStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVoucherStatusInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInterface");
				factory.releaseVoucherStatusInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VoucherStatusInfoInterface getVoucherStatusInfoInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInfo");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfo");
		return this.getVoucherStatusInfoInterface(defaultApp, defaultType);
	}
	public void releaseVoucherStatusInfoInterface(VoucherStatusInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInfoInterface");
		this.releaseVoucherStatusInfoInterface(defaultApp, defaultType, obj);
	}
	public VoucherStatusInfoInterface getVoucherStatusInfoInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInfoInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVoucherStatusInfoInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
				return factory.getVoucherStatusInfoInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVoucherStatusInfoInterface(String appName, String type,VoucherStatusInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInfoInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVoucherStatusInfoInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInfoInterface");
				factory.releaseVoucherStatusInfoInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInfoInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInfoInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VoucherStatusMovementInterface getVoucherStatusMovementInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusMovement");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovement");
		return this.getVoucherStatusMovementInterface(defaultApp, defaultType);
	}
	public void releaseVoucherStatusMovementInterface(VoucherStatusMovementInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusMovementInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusMovementInterface");
		this.releaseVoucherStatusMovementInterface(defaultApp, defaultType, obj);
	}
	public VoucherStatusMovementInterface getVoucherStatusMovementInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusMovementInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVoucherStatusMovementInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
				return factory.getVoucherStatusMovementInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVoucherStatusMovementInterface(String appName, String type,VoucherStatusMovementInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusMovementInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVoucherStatusMovementInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusMovementInterface");
				factory.releaseVoucherStatusMovementInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusMovementInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusMovementInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public VoucherTypesInterface getVoucherTypesInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypes");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypes");
		return this.getVoucherTypesInterface(defaultApp, defaultType);
	}
	public void releaseVoucherTypesInterface(VoucherTypesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherTypesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherTypesInterface");
		this.releaseVoucherTypesInterface(defaultApp, defaultType, obj);
	}
	public VoucherTypesInterface getVoucherTypesInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getVoucherTypesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
				return factory.getVoucherTypesInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseVoucherTypesInterface(String appName, String type,VoucherTypesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherTypesInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseVoucherTypesInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherTypesInterface");
				factory.releaseVoucherTypesInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherTypesInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherTypesInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public WriteoffInterface getWriteoffInterface() throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoff");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoff");
		return this.getWriteoffInterface(defaultApp, defaultType);
	}
	public void releaseWriteoffInterface(WriteoffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseWriteoffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseWriteoffInterface");
		this.releaseWriteoffInterface(defaultApp, defaultType, obj);
	}
	public WriteoffInterface getWriteoffInterface(String appName, String type) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "getWriteoffInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
				return factory.getWriteoffInterface();
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
	public void releaseWriteoffInterface(String appName, String type,WriteoffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseWriteoffInterface");
		if(Logger.DEBUG) Logger.debug(this.getClass(), "releaseWriteoffInterface", "called with app = "+appName+" type = "+type);
		if(factoryMap.containsKey(appName)){
			Map map = (Map)factoryMap.get(appName);
			if (map.containsKey(type)) {
				InterfaceFactory factory = (InterfaceFactory)map.get(type);
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseWriteoffInterface");
				factory.releaseWriteoffInterface(obj);
			} else {
				if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseWriteoffInterface");
				throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", type, "Map", map);
			}
		} else {
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseWriteoffInterface");
			throw new InterfaceFactoryException ("PROXY_NOINTERFACEMAPPINGFOUND", "No mapping found for ", "Key", appName, "Map", factoryMap);
		}
	}
}
