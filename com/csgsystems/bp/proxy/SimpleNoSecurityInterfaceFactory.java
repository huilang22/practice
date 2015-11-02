package com.csgsystems.bp.proxy;

import com.csgsystems.api.utilities.ConfigurationManager;
import com.csgsystems.api.proxy.InterfaceFactoryException;

import java.util.Properties;

import com.csgsystems.bp.interfaces.*;

import com.csgsystems.bp.session.*;

import com.csgsystems.aruba.connection.BSDMSettings;

import com.csgsystems.api.utilities.Logger;

public class SimpleNoSecurityInterfaceFactory implements InterfaceFactory {

	public SimpleNoSecurityInterfaceFactory () {
	}
	public AbiAutoPayCmfMapInterface getAbiAutoPayCmfMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiAutoPayCmfMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
		return new AbiAutoPayCmfMapBean(BSDMSettings.getDefault());

	}
	public void releaseAbiAutoPayCmfMapInterface(AbiAutoPayCmfMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
	}
	public AbiBillMessagesInterface getAbiBillMessagesInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillMessagesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
		return new AbiBillMessagesBean(BSDMSettings.getDefault());

	}
	public void releaseAbiBillMessagesInterface(AbiBillMessagesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillMessagesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillMessagesInterface");
	}
	public AbiBillingStatisticsInterface getAbiBillingStatisticsInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillingStatisticsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
		return new AbiBillingStatisticsBean(BSDMSettings.getDefault());

	}
	public void releaseAbiBillingStatisticsInterface(AbiBillingStatisticsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillingStatisticsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillingStatisticsInterface");
	}
	public AbiNrcDucInterface getAbiNrcDucInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiNrcDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
		return new AbiNrcDucBean(BSDMSettings.getDefault());

	}
	public void releaseAbiNrcDucInterface(AbiNrcDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiNrcDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiNrcDucInterface");
	}
	public AccountInterface getAccountInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
		return new AccountBean(BSDMSettings.getDefault());

	}
	public void releaseAccountInterface(AccountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInterface");
	}
	public AccountAbiSourceInterface getAccountAbiSourceInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountAbiSourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
		return new AccountAbiSourceBean(BSDMSettings.getDefault());

	}
	public void releaseAccountAbiSourceInterface(AccountAbiSourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountAbiSourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountAbiSourceInterface");
	}
	public AccountBalancesInterface getAccountBalancesInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
		return new AccountBalancesBean(BSDMSettings.getDefault());

	}
	public void releaseAccountBalancesInterface(AccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBalancesInterface");
	}
	public AccountBonusPointBalanceInterface getAccountBonusPointBalanceInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
		return new AccountBonusPointBalanceBean(BSDMSettings.getDefault());

	}
	public void releaseAccountBonusPointBalanceInterface(AccountBonusPointBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointBalanceInterface");
	}
	public AccountBonusPointTransactionInterface getAccountBonusPointTransactionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
		return new AccountBonusPointTransactionBean(BSDMSettings.getDefault());

	}
	public void releaseAccountBonusPointTransactionInterface(AccountBonusPointTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointTransactionInterface");
	}
	public AccountCodeInterface getAccountCodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
		return new AccountCodeBean(BSDMSettings.getDefault());

	}
	public void releaseAccountCodeInterface(AccountCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeInterface");
	}
	public AccountCodeGroupInterface getAccountCodeGroupInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
		return new AccountCodeGroupBean(BSDMSettings.getDefault());

	}
	public void releaseAccountCodeGroupInterface(AccountCodeGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeGroupInterface");
	}
	public AccountHqContractInterface getAccountHqContractInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountHqContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
		return new AccountHqContractBean(BSDMSettings.getDefault());

	}
	public void releaseAccountHqContractInterface(AccountHqContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountHqContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountHqContractInterface");
	}
	public AccountIdInterface getAccountIdInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
		return new AccountIdBean(BSDMSettings.getDefault());

	}
	public void releaseAccountIdInterface(AccountIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountIdInterface");
	}
	public AccountInsertInterface getAccountInsertInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInsertInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
		return new AccountInsertBean(BSDMSettings.getDefault());

	}
	public void releaseAccountInsertInterface(AccountInsertInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInsertInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInsertInterface");
	}
	public AccountLocateInterface getAccountLocateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
		return new AccountLocateBean(BSDMSettings.getDefault());

	}
	public void releaseAccountLocateInterface(AccountLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountLocateInterface");
	}
	public AccountMessageInterface getAccountMessageInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountMessageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
		return new AccountMessageBean(BSDMSettings.getDefault());

	}
	public void releaseAccountMessageInterface(AccountMessageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountMessageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountMessageInterface");
	}
	public AccountSegmentInterface getAccountSegmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
		return new AccountSegmentBean(BSDMSettings.getDefault());

	}
	public void releaseAccountSegmentInterface(AccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentInterface");
	}
	public AccountSegmentMapInterface getAccountSegmentMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
		return new AccountSegmentMapBean(BSDMSettings.getDefault());

	}
	public void releaseAccountSegmentMapInterface(AccountSegmentMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentMapInterface");
	}
	public AccountStatusInterface getAccountStatusInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
		return new AccountStatusBean(BSDMSettings.getDefault());

	}
	public void releaseAccountStatusInterface(AccountStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountStatusInterface");
	}
	public AdjustmentInterface getAdjustmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
		return new AdjustmentBean(BSDMSettings.getDefault());

	}
	public void releaseAdjustmentInterface(AdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentInterface");
	}
	public AdjustmentReasonInterface getAdjustmentReasonInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
		return new AdjustmentReasonBean(BSDMSettings.getDefault());

	}
	public void releaseAdjustmentReasonInterface(AdjustmentReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentReasonInterface");
	}
	public AdjustmentTaxInterface getAdjustmentTaxInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
		return new AdjustmentTaxBean(BSDMSettings.getDefault());

	}
	public void releaseAdjustmentTaxInterface(AdjustmentTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTaxInterface");
	}
	public AdjustmentTypeInterface getAdjustmentTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
		return new AdjustmentTypeBean(BSDMSettings.getDefault());

	}
	public void releaseAdjustmentTypeInterface(AdjustmentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTypeInterface");
	}
	public AxrtCountryCodeMapInterface getAxrtCountryCodeMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCountryCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
		return new AxrtCountryCodeMapBean(BSDMSettings.getDefault());

	}
	public void releaseAxrtCountryCodeMapInterface(AxrtCountryCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCountryCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCountryCodeMapInterface");
	}
	public AxrtCurrCodeMapInterface getAxrtCurrCodeMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
		return new AxrtCurrCodeMapBean(BSDMSettings.getDefault());

	}
	public void releaseAxrtCurrCodeMapInterface(AxrtCurrCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrCodeMapInterface");
	}
	public AxrtCurrencyCodeMapInterface getAxrtCurrencyCodeMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrencyCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
		return new AxrtCurrencyCodeMapBean(BSDMSettings.getDefault());

	}
	public void releaseAxrtCurrencyCodeMapInterface(AxrtCurrencyCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
	}
	public AxrtPaymentInterface getAxrtPaymentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
		return new AxrtPaymentBean(BSDMSettings.getDefault());

	}
	public void releaseAxrtPaymentInterface(AxrtPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentInterface");
	}
	public AxrtPaymentMerchantInterface getAxrtPaymentMerchantInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentMerchantInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
		return new AxrtPaymentMerchantBean(BSDMSettings.getDefault());

	}
	public void releaseAxrtPaymentMerchantInterface(AxrtPaymentMerchantInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentMerchantInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentMerchantInterface");
	}
	public AxrtPaymentProfileInterface getAxrtPaymentProfileInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
		return new AxrtPaymentProfileBean(BSDMSettings.getDefault());

	}
	public void releaseAxrtPaymentProfileInterface(AxrtPaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentProfileInterface");
	}
	public AxrtPaymentTransInterface getAxrtPaymentTransInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
		return new AxrtPaymentTransBean(BSDMSettings.getDefault());

	}
	public void releaseAxrtPaymentTransInterface(AxrtPaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentTransInterface");
	}
	public BalanceLineItemInterface getBalanceLineItemInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
		return new BalanceLineItemBean(BSDMSettings.getDefault());

	}
	public void releaseBalanceLineItemInterface(BalanceLineItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemInterface");
	}
	public BalanceLineItemBulkAdjustmentInterface getBalanceLineItemBulkAdjustmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
		return new BalanceLineItemBulkAdjustmentBean(BSDMSettings.getDefault());

	}
	public void releaseBalanceLineItemBulkAdjustmentInterface(BalanceLineItemBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
	}
	public BalanceXferDiffInterface getBalanceXferDiffInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceXferDiffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
		return new BalanceXferDiffBean(BSDMSettings.getDefault());

	}
	public void releaseBalanceXferDiffInterface(BalanceXferDiffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceXferDiffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceXferDiffInterface");
	}
	public BamErrorCodeInterface getBamErrorCodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBamErrorCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
		return new BamErrorCodeBean(BSDMSettings.getDefault());

	}
	public void releaseBamErrorCodeInterface(BamErrorCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBamErrorCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBamErrorCodeInterface");
	}
	public BillCycleInterface getBillCycleInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCycleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
		return new BillCycleBean(BSDMSettings.getDefault());

	}
	public void releaseBillCycleInterface(BillCycleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillCycleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillCycleInterface");
	}
	public BillDispatchMethodInterface getBillDispatchMethodInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispatchMethodInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
		return new BillDispatchMethodBean(BSDMSettings.getDefault());

	}
	public void releaseBillDispatchMethodInterface(BillDispatchMethodInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillDispatchMethodInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillDispatchMethodInterface");
	}
	public BillImageInterface getBillImageInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
		return new BillImageBean(BSDMSettings.getDefault());

	}
	public void releaseBillImageInterface(BillImageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImageInterface");
	}
	public BillImagePageInterface getBillImagePageInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImagePageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
		return new BillImagePageBean(BSDMSettings.getDefault());

	}
	public void releaseBillImagePageInterface(BillImagePageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImagePageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImagePageInterface");
	}
	public BillInsertGroupInterface getBillInsertGroupInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
		return new BillInsertGroupBean(BSDMSettings.getDefault());

	}
	public void releaseBillInsertGroupInterface(BillInsertGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupInterface");
	}
	public BillInsertGroupMapInterface getBillInsertGroupMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
		return new BillInsertGroupMapBean(BSDMSettings.getDefault());

	}
	public void releaseBillInsertGroupMapInterface(BillInsertGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupMapInterface");
	}
	public BillMessageGroupInterface getBillMessageGroupInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
		return new BillMessageGroupBean(BSDMSettings.getDefault());

	}
	public void releaseBillMessageGroupInterface(BillMessageGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupInterface");
	}
	public BillMessageGroupMapInterface getBillMessageGroupMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
		return new BillMessageGroupMapBean(BSDMSettings.getDefault());

	}
	public void releaseBillMessageGroupMapInterface(BillMessageGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupMapInterface");
	}
	public BilledUsageInterface getBilledUsageInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
		return new BilledUsageBean(BSDMSettings.getDefault());

	}
	public void releaseBilledUsageInterface(BilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageInterface");
	}
	public BilledUsageBulkAdjustmentInterface getBilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
		return new BilledUsageBulkAdjustmentBean(BSDMSettings.getDefault());

	}
	public void releaseBilledUsageBulkAdjustmentInterface(BilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
	}
	public BonusPointRateInterface getBonusPointRateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
		return new BonusPointRateBean(BSDMSettings.getDefault());

	}
	public void releaseBonusPointRateInterface(BonusPointRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointRateInterface");
	}
	public BonusPointTransTypeInterface getBonusPointTransTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
		return new BonusPointTransTypeBean(BSDMSettings.getDefault());

	}
	public void releaseBonusPointTransTypeInterface(BonusPointTransTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointTransTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointTransTypeInterface");
	}
	public CcAuditLogInterface getCcAuditLogInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcAuditLogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
		return new CcAuditLogBean(BSDMSettings.getDefault());

	}
	public void releaseCcAuditLogInterface(CcAuditLogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCcAuditLogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCcAuditLogInterface");
	}
	public CdrDataDucInterface getCdrDataDucInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
		return new CdrDataDucBean(BSDMSettings.getDefault());

	}
	public void releaseCdrDataDucInterface(CdrDataDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCdrDataDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCdrDataDucInterface");
	}
	public ChargeDistribPercentInterface getChargeDistribPercentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDistribPercentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
		return new ChargeDistribPercentBean(BSDMSettings.getDefault());

	}
	public void releaseChargeDistribPercentInterface(ChargeDistribPercentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseChargeDistribPercentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseChargeDistribPercentInterface");
	}
	public ClearingHouseInterface getClearingHouseInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
		return new ClearingHouseBean(BSDMSettings.getDefault());

	}
	public void releaseClearingHouseInterface(ClearingHouseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInterface");
	}
	public ClearingHouseContactsInterface getClearingHouseContactsInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseContactsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
		return new ClearingHouseContactsBean(BSDMSettings.getDefault());

	}
	public void releaseClearingHouseContactsInterface(ClearingHouseContactsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseContactsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseContactsInterface");
	}
	public ClearingHouseInfoInterface getClearingHouseInfoInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
		return new ClearingHouseInfoBean(BSDMSettings.getDefault());

	}
	public void releaseClearingHouseInfoInterface(ClearingHouseInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInfoInterface");
	}
	public CmfBonusPointInterface getCmfBonusPointInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfBonusPointInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
		return new CmfBonusPointBean(BSDMSettings.getDefault());

	}
	public void releaseCmfBonusPointInterface(CmfBonusPointInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfBonusPointInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfBonusPointInterface");
	}
	public CmfPackageOverridesInterface getCmfPackageOverridesInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfPackageOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
		return new CmfPackageOverridesBean(BSDMSettings.getDefault());

	}
	public void releaseCmfPackageOverridesInterface(CmfPackageOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfPackageOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfPackageOverridesInterface");
	}
	public CmfRewardBalanceDetailInterface getCmfRewardBalanceDetailInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfRewardBalanceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
		return new CmfRewardBalanceDetailBean(BSDMSettings.getDefault());

	}
	public void releaseCmfRewardBalanceDetailInterface(CmfRewardBalanceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
	}
	public CmfStatusInterface getCmfStatusInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
		return new CmfStatusBean(BSDMSettings.getDefault());

	}
	public void releaseCmfStatusInterface(CmfStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusInterface");
	}
	public CmfStatusChgReasonInterface getCmfStatusChgReasonInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusChgReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
		return new CmfStatusChgReasonBean(BSDMSettings.getDefault());

	}
	public void releaseCmfStatusChgReasonInterface(CmfStatusChgReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusChgReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusChgReasonInterface");
	}
	public ConnectReasonInterface getConnectReasonInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
		return new ConnectReasonBean(BSDMSettings.getDefault());

	}
	public void releaseConnectReasonInterface(ConnectReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseConnectReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseConnectReasonInterface");
	}
	public ContactInterface getContactInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
		return new ContactBean(BSDMSettings.getDefault());

	}
	public void releaseContactInterface(ContactInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContactInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContactInterface");
	}
	public ContractDiscountInterface getContractDiscountInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractDiscountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
		return new ContractDiscountBean(BSDMSettings.getDefault());

	}
	public void releaseContractDiscountInterface(ContractDiscountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContractDiscountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContractDiscountInterface");
	}
	public CorridorInterface getCorridorInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
		return new CorridorBean(BSDMSettings.getDefault());

	}
	public void releaseCorridorInterface(CorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorInterface");
	}
	public CorridorRateBandOverrideInterface getCorridorRateBandOverrideInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateBandOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
		return new CorridorRateBandOverrideBean(BSDMSettings.getDefault());

	}
	public void releaseCorridorRateBandOverrideInterface(CorridorRateBandOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateBandOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateBandOverrideInterface");
	}
	public CorridorRateOverrideInterface getCorridorRateOverrideInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
		return new CorridorRateOverrideBean(BSDMSettings.getDefault());

	}
	public void releaseCorridorRateOverrideInterface(CorridorRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateOverrideInterface");
	}
	public CreditCardInterface getCreditCardInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
		return new CreditCardBean(BSDMSettings.getDefault());

	}
	public void releaseCreditCardInterface(CreditCardInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardInterface");
	}
	public CreditCardTypeCodeInterface getCreditCardTypeCodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardTypeCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
		return new CreditCardTypeCodeBean(BSDMSettings.getDefault());

	}
	public void releaseCreditCardTypeCodeInterface(CreditCardTypeCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardTypeCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardTypeCodeInterface");
	}
	public CsrInterface getCsrInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
		return new CsrBean(BSDMSettings.getDefault());

	}
	public void releaseCsrInterface(CsrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrInterface");
	}
	public CsrAccountSegmentInterface getCsrAccountSegmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
		return new CsrAccountSegmentBean(BSDMSettings.getDefault());

	}
	public void releaseCsrAccountSegmentInterface(CsrAccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrAccountSegmentInterface");
	}
	public CsrGroupAmountInterface getCsrGroupAmountInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupAmountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
		return new CsrGroupAmountBean(BSDMSettings.getDefault());

	}
	public void releaseCsrGroupAmountInterface(CsrGroupAmountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupAmountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupAmountInterface");
	}
	public CsrGroupFunctionInterface getCsrGroupFunctionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupFunctionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
		return new CsrGroupFunctionBean(BSDMSettings.getDefault());

	}
	public void releaseCsrGroupFunctionInterface(CsrGroupFunctionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupFunctionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupFunctionInterface");
	}
	public CustomerDocumentInterface getCustomerDocumentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocumentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
		return new CustomerDocumentBean(BSDMSettings.getDefault());

	}
	public void releaseCustomerDocumentInterface(CustomerDocumentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDocumentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDocumentInterface");
	}
	public CustomerDtServerInterface getCustomerDtServerInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
		return new CustomerDtServerBean(BSDMSettings.getDefault());

	}
	public void releaseCustomerDtServerInterface(CustomerDtServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtServerInterface");
	}
	public CustomerDtUrlInterface getCustomerDtUrlInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtUrlInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
		return new CustomerDtUrlBean(BSDMSettings.getDefault());

	}
	public void releaseCustomerDtUrlInterface(CustomerDtUrlInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtUrlInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtUrlInterface");
	}
	public CustomerServiceCenterInterface getCustomerServiceCenterInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
		return new CustomerServiceCenterBean(BSDMSettings.getDefault());

	}
	public void releaseCustomerServiceCenterInterface(CustomerServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerServiceCenterInterface");
	}
	public DepositInterface getDepositInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
		return new DepositBean(BSDMSettings.getDefault());

	}
	public void releaseDepositInterface(DepositInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositInterface");
	}
	public DepositTypeInterface getDepositTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
		return new DepositTypeBean(BSDMSettings.getDefault());

	}
	public void releaseDepositTypeInterface(DepositTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositTypeInterface");
	}
	public DiscReasonInterface getDiscReasonInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
		return new DiscReasonBean(BSDMSettings.getDefault());

	}
	public void releaseDiscReasonInterface(DiscReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDiscReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDiscReasonInterface");
	}
	public DocumentTypeRefInterface getDocumentTypeRefInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeRefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
		return new DocumentTypeRefBean(BSDMSettings.getDefault());

	}
	public void releaseDocumentTypeRefInterface(DocumentTypeRefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDocumentTypeRefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDocumentTypeRefInterface");
	}
	public EarlyTerminationChargeInterface getEarlyTerminationChargeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEarlyTerminationChargeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
		return new EarlyTerminationChargeBean(BSDMSettings.getDefault());

	}
	public void releaseEarlyTerminationChargeInterface(EarlyTerminationChargeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEarlyTerminationChargeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEarlyTerminationChargeInterface");
	}
	public EftResponseCodeInterface getEftResponseCodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftResponseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
		return new EftResponseCodeBean(BSDMSettings.getDefault());

	}
	public void releaseEftResponseCodeInterface(EftResponseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftResponseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftResponseCodeInterface");
	}
	public EftTransactionInterface getEftTransactionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
		return new EftTransactionBean(BSDMSettings.getDefault());

	}
	public void releaseEftTransactionInterface(EftTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftTransactionInterface");
	}
	public EnhancedNoteInterface getEnhancedNoteInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnhancedNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
		return new EnhancedNoteBean(BSDMSettings.getDefault());

	}
	public void releaseEnhancedNoteInterface(EnhancedNoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEnhancedNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEnhancedNoteInterface");
	}
	public ExchangeRateClassInterface getExchangeRateClassInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExchangeRateClassInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
		return new ExchangeRateClassBean(BSDMSettings.getDefault());

	}
	public void releaseExchangeRateClassInterface(ExchangeRateClassInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExchangeRateClassInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExchangeRateClassInterface");
	}
	public ExtendedDataAssociationInterface getExtendedDataAssociationInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataAssociationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
		return new ExtendedDataAssociationBean(BSDMSettings.getDefault());

	}
	public void releaseExtendedDataAssociationInterface(ExtendedDataAssociationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataAssociationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataAssociationInterface");
	}
	public ExtendedDataEnumerationInterface getExtendedDataEnumerationInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
		return new ExtendedDataEnumerationBean(BSDMSettings.getDefault());

	}
	public void releaseExtendedDataEnumerationInterface(ExtendedDataEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataEnumerationInterface");
	}
	public ExtendedDataLocateInterface getExtendedDataLocateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
		return new ExtendedDataLocateBean(BSDMSettings.getDefault());

	}
	public void releaseExtendedDataLocateInterface(ExtendedDataLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataLocateInterface");
	}
	public ExtendedDataParamInterface getExtendedDataParamInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
		return new ExtendedDataParamBean(BSDMSettings.getDefault());

	}
	public void releaseExtendedDataParamInterface(ExtendedDataParamInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamInterface");
	}
	public ExtendedDataParamTypeInterface getExtendedDataParamTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
		return new ExtendedDataParamTypeBean(BSDMSettings.getDefault());

	}
	public void releaseExtendedDataParamTypeInterface(ExtendedDataParamTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamTypeInterface");
	}
	public ExternalIdAcctMapInterface getExternalIdAcctMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAcctMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
		return new ExternalIdAcctMapBean(BSDMSettings.getDefault());

	}
	public void releaseExternalIdAcctMapInterface(ExternalIdAcctMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdAcctMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdAcctMapInterface");
	}
	public ExternalIdHqGroupsMapInterface getExternalIdHqGroupsMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdHqGroupsMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
		return new ExternalIdHqGroupsMapBean(BSDMSettings.getDefault());

	}
	public void releaseExternalIdHqGroupsMapInterface(ExternalIdHqGroupsMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
	}
	public FranchiseCodeInterface getFranchiseCodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
		return new FranchiseCodeBean(BSDMSettings.getDefault());

	}
	public void releaseFranchiseCodeInterface(FranchiseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseFranchiseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseFranchiseCodeInterface");
	}
	public GenderTypeInterface getGenderTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
		return new GenderTypeBean(BSDMSettings.getDefault());

	}
	public void releaseGenderTypeInterface(GenderTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenderTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenderTypeInterface");
	}
	public GenericEnumerationInterface getGenericEnumerationInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenericEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
		return new GenericEnumerationBean(BSDMSettings.getDefault());

	}
	public void releaseGenericEnumerationInterface(GenericEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenericEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenericEnumerationInterface");
	}
	public GeocodeInterface getGeocodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
		return new GeocodeBean(BSDMSettings.getDefault());

	}
	public void releaseGeocodeInterface(GeocodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGeocodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGeocodeInterface");
	}
	public GlobalAccountBalancesInterface getGlobalAccountBalancesInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
		return new GlobalAccountBalancesBean(BSDMSettings.getDefault());

	}
	public void releaseGlobalAccountBalancesInterface(GlobalAccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalAccountBalancesInterface");
	}
	public GlobalContractInterface getGlobalContractInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
		return new GlobalContractBean(BSDMSettings.getDefault());

	}
	public void releaseGlobalContractInterface(GlobalContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalContractInterface");
	}
	public GlobalOpenItemIdMapInterface getGlobalOpenItemIdMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
		return new GlobalOpenItemIdMapBean(BSDMSettings.getDefault());

	}
	public void releaseGlobalOpenItemIdMapInterface(GlobalOpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
	}
	public GroupInterface getGroupInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
		return new GroupBean(BSDMSettings.getDefault());

	}
	public void releaseGroupInterface(GroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupInterface");
	}
	public GroupLocateInterface getGroupLocateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
		return new GroupLocateBean(BSDMSettings.getDefault());

	}
	public void releaseGroupLocateInterface(GroupLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupLocateInterface");
	}
	public GroupMemberInterface getGroupMemberInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupMemberInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
		return new GroupMemberBean(BSDMSettings.getDefault());

	}
	public void releaseGroupMemberInterface(GroupMemberInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupMemberInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupMemberInterface");
	}
	public GuiIndicatorInterface getGuiIndicatorInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiIndicatorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
		return new GuiIndicatorBean(BSDMSettings.getDefault());

	}
	public void releaseGuiIndicatorInterface(GuiIndicatorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGuiIndicatorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGuiIndicatorInterface");
	}
	public HistoricalContributionInterface getHistoricalContributionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
		return new HistoricalContributionBean(BSDMSettings.getDefault());

	}
	public void releaseHistoricalContributionInterface(HistoricalContributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionInterface");
	}
	public HistoricalContributionTaxInterface getHistoricalContributionTaxInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
		return new HistoricalContributionTaxBean(BSDMSettings.getDefault());

	}
	public void releaseHistoricalContributionTaxInterface(HistoricalContributionTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionTaxInterface");
	}
	public HistoricalThresholdsInterface getHistoricalThresholdsInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalThresholdsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
		return new HistoricalThresholdsBean(BSDMSettings.getDefault());

	}
	public void releaseHistoricalThresholdsInterface(HistoricalThresholdsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalThresholdsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalThresholdsInterface");
	}
	public HqContractUnitCrInterface getHqContractUnitCrInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqContractUnitCrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
		return new HqContractUnitCrBean(BSDMSettings.getDefault());

	}
	public void releaseHqContractUnitCrInterface(HqContractUnitCrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqContractUnitCrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqContractUnitCrInterface");
	}
	public HqGroupContractsInterface getHqGroupContractsInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupContractsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
		return new HqGroupContractsBean(BSDMSettings.getDefault());

	}
	public void releaseHqGroupContractsInterface(HqGroupContractsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupContractsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupContractsInterface");
	}
	public HqGroupCorridorInterface getHqGroupCorridorInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
		return new HqGroupCorridorBean(BSDMSettings.getDefault());

	}
	public void releaseHqGroupCorridorInterface(HqGroupCorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupCorridorInterface");
	}
	public HqGroupMembersInterface getHqGroupMembersInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupMembersInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
		return new HqGroupMembersBean(BSDMSettings.getDefault());

	}
	public void releaseHqGroupMembersInterface(HqGroupMembersInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupMembersInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupMembersInterface");
	}
	public HqGroupProductInterface getHqGroupProductInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupProductInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
		return new HqGroupProductBean(BSDMSettings.getDefault());

	}
	public void releaseHqGroupProductInterface(HqGroupProductInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupProductInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupProductInterface");
	}
	public HqGroupsInterface getHqGroupsInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
		return new HqGroupsBean(BSDMSettings.getDefault());

	}
	public void releaseHqGroupsInterface(HqGroupsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupsInterface");
	}
	public HqgroupUsageRedirectMapInterface getHqgroupUsageRedirectMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqgroupUsageRedirectMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
		return new HqgroupUsageRedirectMapBean(BSDMSettings.getDefault());

	}
	public void releaseHqgroupUsageRedirectMapInterface(HqgroupUsageRedirectMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
	}
	public InterimBillInterface getInterimBillInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
		return new InterimBillBean(BSDMSettings.getDefault());

	}
	public void releaseInterimBillInterface(InterimBillInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInterimBillInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInterimBillInterface");
	}
	public InvoiceInterface getInvoiceInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
		return new InvoiceBean(BSDMSettings.getDefault());

	}
	public void releaseInvoiceInterface(InvoiceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceInterface");
	}
	public InvoiceDetailInterface getInvoiceDetailInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
		return new InvoiceDetailBean(BSDMSettings.getDefault());

	}
	public void releaseInvoiceDetailInterface(InvoiceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailInterface");
	}
	public InvoiceDetailBulkAdjustmentInterface getInvoiceDetailBulkAdjustmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
		return new InvoiceDetailBulkAdjustmentBean(BSDMSettings.getDefault());

	}
	public void releaseInvoiceDetailBulkAdjustmentInterface(InvoiceDetailBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
	}
	public LateFeeRateOverridesInterface getLateFeeRateOverridesInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeRateOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
		return new LateFeeRateOverridesBean(BSDMSettings.getDefault());

	}
	public void releaseLateFeeRateOverridesInterface(LateFeeRateOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLateFeeRateOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLateFeeRateOverridesInterface");
	}
	public LbxPaymentTypeInterface getLbxPaymentTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxPaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
		return new LbxPaymentTypeBean(BSDMSettings.getDefault());

	}
	public void releaseLbxPaymentTypeInterface(LbxPaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLbxPaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLbxPaymentTypeInterface");
	}
	public MultiLinesAdjInterface getMultiLinesAdjInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getMultiLinesAdjInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
		return new MultiLinesAdjBean(BSDMSettings.getDefault());

	}
	public void releaseMultiLinesAdjInterface(MultiLinesAdjInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseMultiLinesAdjInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseMultiLinesAdjInterface");
	}
	public NetActionInterface getNetActionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
		return new NetActionBean(BSDMSettings.getDefault());

	}
	public void releaseNetActionInterface(NetActionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNetActionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNetActionInterface");
	}
	public NoteInterface getNoteInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
		return new NoteBean(BSDMSettings.getDefault());

	}
	public void releaseNoteInterface(NoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteInterface");
	}
	public NoteCodeInterface getNoteCodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
		return new NoteCodeBean(BSDMSettings.getDefault());

	}
	public void releaseNoteCodeInterface(NoteCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteCodeInterface");
	}
	public NoteTextInterface getNoteTextInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTextInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
		return new NoteTextBean(BSDMSettings.getDefault());

	}
	public void releaseNoteTextInterface(NoteTextInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteTextInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteTextInterface");
	}
	public OpenItemInterface getOpenItemInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
		return new OpenItemBean(BSDMSettings.getDefault());

	}
	public void releaseOpenItemInterface(OpenItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemInterface");
	}
	public OpenItemIdMapInterface getOpenItemIdMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
		return new OpenItemIdMapBean(BSDMSettings.getDefault());

	}
	public void releaseOpenItemIdMapInterface(OpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemIdMapInterface");
	}
	public OrderQuoteInterface getOrderQuoteInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderQuoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
		return new OrderQuoteBean(BSDMSettings.getDefault());

	}
	public void releaseOrderQuoteInterface(OrderQuoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOrderQuoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOrderQuoteInterface");
	}
	public OverrideDiscountRateInterface getOverrideDiscountRateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDiscountRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
		return new OverrideDiscountRateBean(BSDMSettings.getDefault());

	}
	public void releaseOverrideDiscountRateInterface(OverrideDiscountRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideDiscountRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideDiscountRateInterface");
	}
	public OverrideUsageCreditRateInterface getOverrideUsageCreditRateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
		return new OverrideUsageCreditRateBean(BSDMSettings.getDefault());

	}
	public void releaseOverrideUsageCreditRateInterface(OverrideUsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideUsageCreditRateInterface");
	}
	public OwningCostCenterInterface getOwningCostCenterInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
		return new OwningCostCenterBean(BSDMSettings.getDefault());

	}
	public void releaseOwningCostCenterInterface(OwningCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOwningCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOwningCostCenterInterface");
	}
	public PackageComponentDefInterface getPackageComponentDefInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageComponentDefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
		return new PackageComponentDefBean(BSDMSettings.getDefault());

	}
	public void releasePackageComponentDefInterface(PackageComponentDefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePackageComponentDefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePackageComponentDefInterface");
	}
	public PaymentInterface getPaymentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
		return new PaymentBean(BSDMSettings.getDefault());

	}
	public void releasePaymentInterface(PaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentInterface");
	}
	public PaymentDistributionInterface getPaymentDistributionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
		return new PaymentDistributionBean(BSDMSettings.getDefault());

	}
	public void releasePaymentDistributionInterface(PaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentDistributionInterface");
	}
	public PaymentMerchantIdInterface getPaymentMerchantIdInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
		return new PaymentMerchantIdBean(BSDMSettings.getDefault());

	}
	public void releasePaymentMerchantIdInterface(PaymentMerchantIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdInterface");
	}
	public PaymentMerchantIdAssignInterface getPaymentMerchantIdAssignInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdAssignInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
		return new PaymentMerchantIdAssignBean(BSDMSettings.getDefault());

	}
	public void releasePaymentMerchantIdAssignInterface(PaymentMerchantIdAssignInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdAssignInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdAssignInterface");
	}
	public PaymentProfileInterface getPaymentProfileInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
		return new PaymentProfileBean(BSDMSettings.getDefault());

	}
	public void releasePaymentProfileInterface(PaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentProfileInterface");
	}
	public PaymentTransInterface getPaymentTransInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
		return new PaymentTransBean(BSDMSettings.getDefault());

	}
	public void releasePaymentTransInterface(PaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTransInterface");
	}
	public PaymentTypeInterface getPaymentTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
		return new PaymentTypeBean(BSDMSettings.getDefault());

	}
	public void releasePaymentTypeInterface(PaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTypeInterface");
	}
	public PrepaymentInterface getPrepaymentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
		return new PrepaymentBean(BSDMSettings.getDefault());

	}
	public void releasePrepaymentInterface(PrepaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentInterface");
	}
	public PrepaymentDistributionInterface getPrepaymentDistributionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
		return new PrepaymentDistributionBean(BSDMSettings.getDefault());

	}
	public void releasePrepaymentDistributionInterface(PrepaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentDistributionInterface");
	}
	public PrivacyLevelInterface getPrivacyLevelInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
		return new PrivacyLevelBean(BSDMSettings.getDefault());

	}
	public void releasePrivacyLevelInterface(PrivacyLevelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrivacyLevelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrivacyLevelInterface");
	}
	public ProductCatalogInterface getProductCatalogInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductCatalogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
		return new ProductCatalogBean(BSDMSettings.getDefault());

	}
	public void releaseProductCatalogInterface(ProductCatalogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductCatalogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductCatalogInterface");
	}
	public ProductChargeMapInterface getProductChargeMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductChargeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
		return new ProductChargeMapBean(BSDMSettings.getDefault());

	}
	public void releaseProductChargeMapInterface(ProductChargeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductChargeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductChargeMapInterface");
	}
	public ProductRateKeyInterface getProductRateKeyInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateKeyInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
		return new ProductRateKeyBean(BSDMSettings.getDefault());

	}
	public void releaseProductRateKeyInterface(ProductRateKeyInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateKeyInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateKeyInterface");
	}
	public ProductRateOverrideInterface getProductRateOverrideInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
		return new ProductRateOverrideBean(BSDMSettings.getDefault());

	}
	public void releaseProductRateOverrideInterface(ProductRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateOverrideInterface");
	}
	public ProductRcRateInterface getProductRcRateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRcRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
		return new ProductRcRateBean(BSDMSettings.getDefault());

	}
	public void releaseProductRcRateInterface(ProductRcRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRcRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRcRateInterface");
	}
	public RefinancePlanInterface getRefinancePlanInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
		return new RefinancePlanBean(BSDMSettings.getDefault());

	}
	public void releaseRefinancePlanInterface(RefinancePlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefinancePlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefinancePlanInterface");
	}
	public RefundInterface getRefundInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
		return new RefundBean(BSDMSettings.getDefault());

	}
	public void releaseRefundInterface(RefundInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundInterface");
	}
	public RefundReasonInterface getRefundReasonInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
		return new RefundReasonBean(BSDMSettings.getDefault());

	}
	public void releaseRefundReasonInterface(RefundReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundReasonInterface");
	}
	public RegulatoryIdInterface getRegulatoryIdInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
		return new RegulatoryIdBean(BSDMSettings.getDefault());

	}
	public void releaseRegulatoryIdInterface(RegulatoryIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRegulatoryIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRegulatoryIdInterface");
	}
	public RevRcvCostCenterInterface getRevRcvCostCenterInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
		return new RevRcvCostCenterBean(BSDMSettings.getDefault());

	}
	public void releaseRevRcvCostCenterInterface(RevRcvCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRevRcvCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRevRcvCostCenterInterface");
	}
	public ReverseBulkAdjustmentInterface getReverseBulkAdjustmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getReverseBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
		return new ReverseBulkAdjustmentBean(BSDMSettings.getDefault());

	}
	public void releaseReverseBulkAdjustmentInterface(ReverseBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseReverseBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseReverseBulkAdjustmentInterface");
	}
	public RewardBalanceInterface getRewardBalanceInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
		return new RewardBalanceBean(BSDMSettings.getDefault());

	}
	public void releaseRewardBalanceInterface(RewardBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceInterface");
	}
	public RewardBalanceEntityMappingInterface getRewardBalanceEntityMappingInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceEntityMappingInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
		return new RewardBalanceEntityMappingBean(BSDMSettings.getDefault());

	}
	public void releaseRewardBalanceEntityMappingInterface(RewardBalanceEntityMappingInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
	}
	public RtPaymentResponseInterface getRtPaymentResponseInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtPaymentResponseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
		return new RtPaymentResponseBean(BSDMSettings.getDefault());

	}
	public void releaseRtPaymentResponseInterface(RtPaymentResponseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRtPaymentResponseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRtPaymentResponseInterface");
	}
	public SalesChannelInterface getSalesChannelInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
		return new SalesChannelBean(BSDMSettings.getDefault());

	}
	public void releaseSalesChannelInterface(SalesChannelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSalesChannelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSalesChannelInterface");
	}
	public SecurityAciInterface getSecurityAciInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityAciInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
		return new SecurityAciBean(BSDMSettings.getDefault());

	}
	public void releaseSecurityAciInterface(SecurityAciInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityAciInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityAciInterface");
	}
	public SecurityResourceInterface getSecurityResourceInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityResourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
		return new SecurityResourceBean(BSDMSettings.getDefault());

	}
	public void releaseSecurityResourceInterface(SecurityResourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityResourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityResourceInterface");
	}
	public SecurityRoleInterface getSecurityRoleInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityRoleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
		return new SecurityRoleBean(BSDMSettings.getDefault());

	}
	public void releaseSecurityRoleInterface(SecurityRoleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityRoleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityRoleInterface");
	}
	public SecurityUserInterface getSecurityUserInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityUserInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
		return new SecurityUserBean(BSDMSettings.getDefault());

	}
	public void releaseSecurityUserInterface(SecurityUserInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityUserInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityUserInterface");
	}
	public ServerInterface getServerInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
		return new ServerBean(BSDMSettings.getDefault());

	}
	public void releaseServerInterface(ServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerInterface");
	}
	public ServerCategoryInterface getServerCategoryInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
		return new ServerCategoryBean(BSDMSettings.getDefault());

	}
	public void releaseServerCategoryInterface(ServerCategoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerCategoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerCategoryInterface");
	}
	public ServerDefinitionInterface getServerDefinitionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerDefinitionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
		return new ServerDefinitionBean(BSDMSettings.getDefault());

	}
	public void releaseServerDefinitionInterface(ServerDefinitionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerDefinitionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerDefinitionInterface");
	}
	public ServiceCenterInterface getServiceCenterInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
		return new ServiceCenterBean(BSDMSettings.getDefault());

	}
	public void releaseServiceCenterInterface(ServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterInterface");
	}
	public ServiceCenterTypeInterface getServiceCenterTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
		return new ServiceCenterTypeBean(BSDMSettings.getDefault());

	}
	public void releaseServiceCenterTypeInterface(ServiceCenterTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterTypeInterface");
	}
	public ServiceMasterGroupInterface getServiceMasterGroupInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMasterGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
		return new ServiceMasterGroupBean(BSDMSettings.getDefault());

	}
	public void releaseServiceMasterGroupInterface(ServiceMasterGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceMasterGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceMasterGroupInterface");
	}
	public ServicePricingPlanInterface getServicePricingPlanInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePricingPlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
		return new ServicePricingPlanBean(BSDMSettings.getDefault());

	}
	public void releaseServicePricingPlanInterface(ServicePricingPlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServicePricingPlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServicePricingPlanInterface");
	}
	public ServiceZoneInterface getServiceZoneInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceZoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
		return new ServiceZoneBean(BSDMSettings.getDefault());

	}
	public void releaseServiceZoneInterface(ServiceZoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceZoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceZoneInterface");
	}
	public SlaMeasurementDataInterface getSlaMeasurementDataInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementDataInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
		return new SlaMeasurementDataBean(BSDMSettings.getDefault());

	}
	public void releaseSlaMeasurementDataInterface(SlaMeasurementDataInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSlaMeasurementDataInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSlaMeasurementDataInterface");
	}
	public StatusReasonMapInterface getStatusReasonMapInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
		return new StatusReasonMapBean(BSDMSettings.getDefault());

	}
	public void releaseStatusReasonMapInterface(StatusReasonMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseStatusReasonMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseStatusReasonMapInterface");
	}
	public TaxAbandonedInterface getTaxAbandonedInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAbandonedInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
		return new TaxAbandonedBean(BSDMSettings.getDefault());

	}
	public void releaseTaxAbandonedInterface(TaxAbandonedInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAbandonedInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAbandonedInterface");
	}
	public TaxAssignmentInterface getTaxAssignmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAssignmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
		return new TaxAssignmentBean(BSDMSettings.getDefault());

	}
	public void releaseTaxAssignmentInterface(TaxAssignmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAssignmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAssignmentInterface");
	}
	public TaxExemptionInterface getTaxExemptionInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxExemptionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
		return new TaxExemptionBean(BSDMSettings.getDefault());

	}
	public void releaseTaxExemptionInterface(TaxExemptionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxExemptionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxExemptionInterface");
	}
	public TaxPackageInstInterface getTaxPackageInstInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPackageInstInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
		return new TaxPackageInstBean(BSDMSettings.getDefault());

	}
	public void releaseTaxPackageInstInterface(TaxPackageInstInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxPackageInstInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxPackageInstInterface");
	}
	public TaxRatesVatInterface getTaxRatesVatInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRatesVatInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
		return new TaxRatesVatBean(BSDMSettings.getDefault());

	}
	public void releaseTaxRatesVatInterface(TaxRatesVatInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxRatesVatInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxRatesVatInterface");
	}
	public TaxStatusInterface getTaxStatusInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
		return new TaxStatusBean(BSDMSettings.getDefault());

	}
	public void releaseTaxStatusInterface(TaxStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxStatusInterface");
	}
	public TaxTypeCommInterface getTaxTypeCommInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCommInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
		return new TaxTypeCommBean(BSDMSettings.getDefault());

	}
	public void releaseTaxTypeCommInterface(TaxTypeCommInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxTypeCommInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxTypeCommInterface");
	}
	public TimezoneInterface getTimezoneInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
		return new TimezoneBean(BSDMSettings.getDefault());

	}
	public void releaseTimezoneInterface(TimezoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTimezoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTimezoneInterface");
	}
	public TransSourceTypeInterface getTransSourceTypeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
		return new TransSourceTypeBean(BSDMSettings.getDefault());

	}
	public void releaseTransSourceTypeInterface(TransSourceTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransSourceTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransSourceTypeInterface");
	}
	public TransferReasonInterface getTransferReasonInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
		return new TransferReasonBean(BSDMSettings.getDefault());

	}
	public void releaseTransferReasonInterface(TransferReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransferReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransferReasonInterface");
	}
	public UnappliedPaymentInterface getUnappliedPaymentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnappliedPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
		return new UnappliedPaymentBean(BSDMSettings.getDefault());

	}
	public void releaseUnappliedPaymentInterface(UnappliedPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnappliedPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnappliedPaymentInterface");
	}
	public UnbilledUsageInterface getUnbilledUsageInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
		return new UnbilledUsageBean(BSDMSettings.getDefault());

	}
	public void releaseUnbilledUsageInterface(UnbilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageInterface");
	}
	public UnbilledUsageBulkAdjustmentInterface getUnbilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
		return new UnbilledUsageBulkAdjustmentBean(BSDMSettings.getDefault());

	}
	public void releaseUnbilledUsageBulkAdjustmentInterface(UnbilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
	}
	public UsageCreditRateInterface getUsageCreditRateInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
		return new UsageCreditRateBean(BSDMSettings.getDefault());

	}
	public void releaseUsageCreditRateInterface(UsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUsageCreditRateInterface");
	}
	public VipCodeInterface getVipCodeInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
		return new VipCodeBean(BSDMSettings.getDefault());

	}
	public void releaseVipCodeInterface(VipCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVipCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVipCodeInterface");
	}
	public VoucherDefinitionsInterface getVoucherDefinitionsInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDefinitionsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
		return new VoucherDefinitionsBean(BSDMSettings.getDefault());

	}
	public void releaseVoucherDefinitionsInterface(VoucherDefinitionsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherDefinitionsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherDefinitionsInterface");
	}
	public VoucherHistoryInterface getVoucherHistoryInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherHistoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
		return new VoucherHistoryBean(BSDMSettings.getDefault());

	}
	public void releaseVoucherHistoryInterface(VoucherHistoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherHistoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherHistoryInterface");
	}
	public VoucherLocationInterface getVoucherLocationInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherLocationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
		return new VoucherLocationBean(BSDMSettings.getDefault());

	}
	public void releaseVoucherLocationInterface(VoucherLocationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherLocationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherLocationInterface");
	}
	public VoucherStatusInterface getVoucherStatusInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
		return new VoucherStatusBean(BSDMSettings.getDefault());

	}
	public void releaseVoucherStatusInterface(VoucherStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInterface");
	}
	public VoucherStatusInfoInterface getVoucherStatusInfoInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
		return new VoucherStatusInfoBean(BSDMSettings.getDefault());

	}
	public void releaseVoucherStatusInfoInterface(VoucherStatusInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInfoInterface");
	}
	public VoucherStatusMovementInterface getVoucherStatusMovementInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusMovementInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
		return new VoucherStatusMovementBean(BSDMSettings.getDefault());

	}
	public void releaseVoucherStatusMovementInterface(VoucherStatusMovementInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusMovementInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusMovementInterface");
	}
	public VoucherTypesInterface getVoucherTypesInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
		return new VoucherTypesBean(BSDMSettings.getDefault());

	}
	public void releaseVoucherTypesInterface(VoucherTypesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherTypesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherTypesInterface");
	}
	public WriteoffInterface getWriteoffInterface() throws InterfaceFactoryException {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
		return new WriteoffBean(BSDMSettings.getDefault());

	}
	public void releaseWriteoffInterface(WriteoffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseWriteoffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseWriteoffInterface");
	}
}
