package com.csgsystems.bp.proxy;

import com.csgsystems.api.utilities.ConfigurationManager;
import com.csgsystems.api.proxy.InterfaceFactoryException;

import java.util.Properties;

import com.csgsystems.api.security.PassiveCallbackHandler;

import javax.security.auth.login.LoginContext;

import com.csgsystems.bp.interfaces.*;

import com.csgsystems.bp.session.*;

import com.csgsystems.aruba.connection.BSDMSettings;

import com.csgsystems.api.utilities.Logger;

public class SimpleInterfaceFactory implements InterfaceFactory {

	protected String user = null;
	protected String password = null;
	protected String lcName = null;

	public SimpleInterfaceFactory () {
		try {
			ConfigurationManager cManager = ConfigurationManager.getInstance();
			Properties props = cManager.getPropertiesFromClassPath("/api.properties");
			user = props.getProperty("ejb.security.login", "guest");
			password = props.getProperty("ejb.security.password", "guest");
			lcName = props.getProperty("ejb.security.lcname", "client-login");
		} catch (Exception x) {
			Logger.error(this.getClass(), "constructor", "Could not load properties for /api.properties");
		}
	}
	public AbiAutoPayCmfMapInterface getAbiAutoPayCmfMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiAutoPayCmfMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
		return new AbiAutoPayCmfMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiAutoPayCmfMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiAutoPayCmfMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiAutoPayCmfMapInterface(AbiAutoPayCmfMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiAutoPayCmfMapInterface");
	}
	public AbiBillMessagesInterface getAbiBillMessagesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillMessagesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
		return new AbiBillMessagesBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiBillMessagesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillMessagesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiBillMessagesInterface(AbiBillMessagesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillMessagesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillMessagesInterface");
	}
	public AbiBillingStatisticsInterface getAbiBillingStatisticsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiBillingStatisticsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
		return new AbiBillingStatisticsBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiBillingStatisticsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiBillingStatisticsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiBillingStatisticsInterface(AbiBillingStatisticsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiBillingStatisticsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiBillingStatisticsInterface");
	}
	public AbiNrcDucInterface getAbiNrcDucInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAbiNrcDucInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
		return new AbiNrcDucBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAbiNrcDucInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAbiNrcDucInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAbiNrcDucInterface(AbiNrcDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAbiNrcDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAbiNrcDucInterface");
	}
	public AccountInterface getAccountInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
		return new AccountBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountInterface(AccountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInterface");
	}
	public AccountAbiSourceInterface getAccountAbiSourceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountAbiSourceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
		return new AccountAbiSourceBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountAbiSourceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountAbiSourceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountAbiSourceInterface(AccountAbiSourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountAbiSourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountAbiSourceInterface");
	}
	public AccountBalancesInterface getAccountBalancesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBalancesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
		return new AccountBalancesBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountBalancesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBalancesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountBalancesInterface(AccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBalancesInterface");
	}
	public AccountBonusPointBalanceInterface getAccountBonusPointBalanceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointBalanceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
		return new AccountBonusPointBalanceBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountBonusPointBalanceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointBalanceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountBonusPointBalanceInterface(AccountBonusPointBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointBalanceInterface");
	}
	public AccountBonusPointTransactionInterface getAccountBonusPointTransactionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountBonusPointTransactionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
		return new AccountBonusPointTransactionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountBonusPointTransactionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountBonusPointTransactionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountBonusPointTransactionInterface(AccountBonusPointTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountBonusPointTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountBonusPointTransactionInterface");
	}
	public AccountCodeInterface getAccountCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
		return new AccountCodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountCodeInterface(AccountCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeInterface");
	}
	public AccountCodeGroupInterface getAccountCodeGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
		return new AccountCodeGroupBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountCodeGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountCodeGroupInterface(AccountCodeGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountCodeGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountCodeGroupInterface");
	}
	public AccountHqContractInterface getAccountHqContractInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountHqContractInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
		return new AccountHqContractBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountHqContractInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountHqContractInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountHqContractInterface(AccountHqContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountHqContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountHqContractInterface");
	}
	public AccountIdInterface getAccountIdInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountIdInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
		return new AccountIdBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountIdInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountIdInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountIdInterface(AccountIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountIdInterface");
	}
	public AccountInsertInterface getAccountInsertInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInsertInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
		return new AccountInsertBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountInsertInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInsertInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountInsertInterface(AccountInsertInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountInsertInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountInsertInterface");
	}
	public AccountLocateInterface getAccountLocateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountLocateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
		return new AccountLocateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountLocateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountLocateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountLocateInterface(AccountLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountLocateInterface");
	}
	public AccountMessageInterface getAccountMessageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountMessageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
		return new AccountMessageBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountMessageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountMessageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountMessageInterface(AccountMessageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountMessageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountMessageInterface");
	}
	public AccountSegmentInterface getAccountSegmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
		return new AccountSegmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountSegmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountSegmentInterface(AccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentInterface");
	}
	public AccountSegmentMapInterface getAccountSegmentMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountSegmentMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
		return new AccountSegmentMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountSegmentMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountSegmentMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountSegmentMapInterface(AccountSegmentMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountSegmentMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountSegmentMapInterface");
	}
	public AccountStatusInterface getAccountStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
		return new AccountStatusBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAccountStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAccountStatusInterface(AccountStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAccountStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAccountStatusInterface");
	}
	public AdjustmentInterface getAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
		return new AdjustmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentInterface(AdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentInterface");
	}
	public AdjustmentReasonInterface getAdjustmentReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
		return new AdjustmentReasonBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentReasonInterface(AdjustmentReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentReasonInterface");
	}
	public AdjustmentTaxInterface getAdjustmentTaxInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTaxInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
		return new AdjustmentTaxBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentTaxInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTaxInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentTaxInterface(AdjustmentTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTaxInterface");
	}
	public AdjustmentTypeInterface getAdjustmentTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
		return new AdjustmentTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAdjustmentTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAdjustmentTypeInterface(AdjustmentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAdjustmentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAdjustmentTypeInterface");
	}
	public AxrtCountryCodeMapInterface getAxrtCountryCodeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCountryCodeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
		return new AxrtCountryCodeMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtCountryCodeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCountryCodeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtCountryCodeMapInterface(AxrtCountryCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCountryCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCountryCodeMapInterface");
	}
	public AxrtCurrCodeMapInterface getAxrtCurrCodeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrCodeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
		return new AxrtCurrCodeMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtCurrCodeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrCodeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtCurrCodeMapInterface(AxrtCurrCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrCodeMapInterface");
	}
	public AxrtCurrencyCodeMapInterface getAxrtCurrencyCodeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtCurrencyCodeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
		return new AxrtCurrencyCodeMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtCurrencyCodeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtCurrencyCodeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtCurrencyCodeMapInterface(AxrtCurrencyCodeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtCurrencyCodeMapInterface");
	}
	public AxrtPaymentInterface getAxrtPaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
		return new AxrtPaymentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentInterface(AxrtPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentInterface");
	}
	public AxrtPaymentMerchantInterface getAxrtPaymentMerchantInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentMerchantInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
		return new AxrtPaymentMerchantBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentMerchantInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentMerchantInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentMerchantInterface(AxrtPaymentMerchantInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentMerchantInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentMerchantInterface");
	}
	public AxrtPaymentProfileInterface getAxrtPaymentProfileInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentProfileInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
		return new AxrtPaymentProfileBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentProfileInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentProfileInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentProfileInterface(AxrtPaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentProfileInterface");
	}
	public AxrtPaymentTransInterface getAxrtPaymentTransInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getAxrtPaymentTransInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
		return new AxrtPaymentTransBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getAxrtPaymentTransInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getAxrtPaymentTransInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseAxrtPaymentTransInterface(AxrtPaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseAxrtPaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseAxrtPaymentTransInterface");
	}
	public BalanceLineItemInterface getBalanceLineItemInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
		return new BalanceLineItemBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBalanceLineItemInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBalanceLineItemInterface(BalanceLineItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemInterface");
	}
	public BalanceLineItemBulkAdjustmentInterface getBalanceLineItemBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
		return new BalanceLineItemBulkAdjustmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceLineItemBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBalanceLineItemBulkAdjustmentInterface(BalanceLineItemBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceLineItemBulkAdjustmentInterface");
	}
	public BalanceXferDiffInterface getBalanceXferDiffInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceXferDiffInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
		return new BalanceXferDiffBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBalanceXferDiffInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceXferDiffInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBalanceXferDiffInterface(BalanceXferDiffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBalanceXferDiffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBalanceXferDiffInterface");
	}
	public BamErrorCodeInterface getBamErrorCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBamErrorCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
		return new BamErrorCodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBamErrorCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBamErrorCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBamErrorCodeInterface(BamErrorCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBamErrorCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBamErrorCodeInterface");
	}
	public BillCycleInterface getBillCycleInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCycleInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
		return new BillCycleBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillCycleInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCycleInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillCycleInterface(BillCycleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillCycleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillCycleInterface");
	}
	public BillDispatchMethodInterface getBillDispatchMethodInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispatchMethodInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
		return new BillDispatchMethodBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillDispatchMethodInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispatchMethodInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillDispatchMethodInterface(BillDispatchMethodInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillDispatchMethodInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillDispatchMethodInterface");
	}
	public BillImageInterface getBillImageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
		return new BillImageBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillImageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillImageInterface(BillImageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImageInterface");
	}
	public BillImagePageInterface getBillImagePageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImagePageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
		return new BillImagePageBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillImagePageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImagePageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillImagePageInterface(BillImagePageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillImagePageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillImagePageInterface");
	}
	public BillInsertGroupInterface getBillInsertGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
		return new BillInsertGroupBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillInsertGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillInsertGroupInterface(BillInsertGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupInterface");
	}
	public BillInsertGroupMapInterface getBillInsertGroupMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInsertGroupMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
		return new BillInsertGroupMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillInsertGroupMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInsertGroupMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillInsertGroupMapInterface(BillInsertGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillInsertGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillInsertGroupMapInterface");
	}
	public BillMessageGroupInterface getBillMessageGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
		return new BillMessageGroupBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillMessageGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillMessageGroupInterface(BillMessageGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupInterface");
	}
	public BillMessageGroupMapInterface getBillMessageGroupMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMessageGroupMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
		return new BillMessageGroupMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBillMessageGroupMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMessageGroupMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBillMessageGroupMapInterface(BillMessageGroupMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBillMessageGroupMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBillMessageGroupMapInterface");
	}
	public BilledUsageInterface getBilledUsageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
		return new BilledUsageBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBilledUsageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBilledUsageInterface(BilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageInterface");
	}
	public BilledUsageBulkAdjustmentInterface getBilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
		return new BilledUsageBulkAdjustmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBilledUsageBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBilledUsageBulkAdjustmentInterface(BilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBilledUsageBulkAdjustmentInterface");
	}
	public BonusPointRateInterface getBonusPointRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
		return new BonusPointRateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBonusPointRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBonusPointRateInterface(BonusPointRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointRateInterface");
	}
	public BonusPointTransTypeInterface getBonusPointTransTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
		return new BonusPointTransTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getBonusPointTransTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseBonusPointTransTypeInterface(BonusPointTransTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseBonusPointTransTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseBonusPointTransTypeInterface");
	}
	public CcAuditLogInterface getCcAuditLogInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcAuditLogInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
		return new CcAuditLogBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCcAuditLogInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCcAuditLogInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCcAuditLogInterface(CcAuditLogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCcAuditLogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCcAuditLogInterface");
	}
	public CdrDataDucInterface getCdrDataDucInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataDucInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
		return new CdrDataDucBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCdrDataDucInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataDucInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCdrDataDucInterface(CdrDataDucInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCdrDataDucInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCdrDataDucInterface");
	}
	public ChargeDistribPercentInterface getChargeDistribPercentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDistribPercentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
		return new ChargeDistribPercentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getChargeDistribPercentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDistribPercentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseChargeDistribPercentInterface(ChargeDistribPercentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseChargeDistribPercentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseChargeDistribPercentInterface");
	}
	public ClearingHouseInterface getClearingHouseInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
		return new ClearingHouseBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getClearingHouseInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseClearingHouseInterface(ClearingHouseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInterface");
	}
	public ClearingHouseContactsInterface getClearingHouseContactsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseContactsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
		return new ClearingHouseContactsBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getClearingHouseContactsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseContactsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseClearingHouseContactsInterface(ClearingHouseContactsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseContactsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseContactsInterface");
	}
	public ClearingHouseInfoInterface getClearingHouseInfoInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseInfoInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
		return new ClearingHouseInfoBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getClearingHouseInfoInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseInfoInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseClearingHouseInfoInterface(ClearingHouseInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseClearingHouseInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseClearingHouseInfoInterface");
	}
	public CmfBonusPointInterface getCmfBonusPointInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfBonusPointInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
		return new CmfBonusPointBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfBonusPointInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfBonusPointInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfBonusPointInterface(CmfBonusPointInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfBonusPointInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfBonusPointInterface");
	}
	public CmfPackageOverridesInterface getCmfPackageOverridesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfPackageOverridesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
		return new CmfPackageOverridesBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfPackageOverridesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfPackageOverridesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfPackageOverridesInterface(CmfPackageOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfPackageOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfPackageOverridesInterface");
	}
	public CmfRewardBalanceDetailInterface getCmfRewardBalanceDetailInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfRewardBalanceDetailInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
		return new CmfRewardBalanceDetailBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfRewardBalanceDetailInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfRewardBalanceDetailInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfRewardBalanceDetailInterface(CmfRewardBalanceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfRewardBalanceDetailInterface");
	}
	public CmfStatusInterface getCmfStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
		return new CmfStatusBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfStatusInterface(CmfStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusInterface");
	}
	public CmfStatusChgReasonInterface getCmfStatusChgReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusChgReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
		return new CmfStatusChgReasonBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCmfStatusChgReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusChgReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCmfStatusChgReasonInterface(CmfStatusChgReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCmfStatusChgReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCmfStatusChgReasonInterface");
	}
	public ConnectReasonInterface getConnectReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
		return new ConnectReasonBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getConnectReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseConnectReasonInterface(ConnectReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseConnectReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseConnectReasonInterface");
	}
	public ContactInterface getContactInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
		return new ContactBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getContactInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContactInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseContactInterface(ContactInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContactInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContactInterface");
	}
	public ContractDiscountInterface getContractDiscountInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractDiscountInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
		return new ContractDiscountBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getContractDiscountInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getContractDiscountInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseContractDiscountInterface(ContractDiscountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseContractDiscountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseContractDiscountInterface");
	}
	public CorridorInterface getCorridorInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
		return new CorridorBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCorridorInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCorridorInterface(CorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorInterface");
	}
	public CorridorRateBandOverrideInterface getCorridorRateBandOverrideInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateBandOverrideInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
		return new CorridorRateBandOverrideBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCorridorRateBandOverrideInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateBandOverrideInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCorridorRateBandOverrideInterface(CorridorRateBandOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateBandOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateBandOverrideInterface");
	}
	public CorridorRateOverrideInterface getCorridorRateOverrideInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorRateOverrideInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
		return new CorridorRateOverrideBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCorridorRateOverrideInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorRateOverrideInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCorridorRateOverrideInterface(CorridorRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCorridorRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCorridorRateOverrideInterface");
	}
	public CreditCardInterface getCreditCardInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
		return new CreditCardBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCreditCardInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCreditCardInterface(CreditCardInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardInterface");
	}
	public CreditCardTypeCodeInterface getCreditCardTypeCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditCardTypeCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
		return new CreditCardTypeCodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCreditCardTypeCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditCardTypeCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCreditCardTypeCodeInterface(CreditCardTypeCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCreditCardTypeCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCreditCardTypeCodeInterface");
	}
	public CsrInterface getCsrInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
		return new CsrBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrInterface(CsrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrInterface");
	}
	public CsrAccountSegmentInterface getCsrAccountSegmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAccountSegmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
		return new CsrAccountSegmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrAccountSegmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAccountSegmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrAccountSegmentInterface(CsrAccountSegmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrAccountSegmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrAccountSegmentInterface");
	}
	public CsrGroupAmountInterface getCsrGroupAmountInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupAmountInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
		return new CsrGroupAmountBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrGroupAmountInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupAmountInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrGroupAmountInterface(CsrGroupAmountInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupAmountInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupAmountInterface");
	}
	public CsrGroupFunctionInterface getCsrGroupFunctionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrGroupFunctionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
		return new CsrGroupFunctionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCsrGroupFunctionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrGroupFunctionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCsrGroupFunctionInterface(CsrGroupFunctionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCsrGroupFunctionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCsrGroupFunctionInterface");
	}
	public CustomerDocumentInterface getCustomerDocumentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocumentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
		return new CustomerDocumentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerDocumentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerDocumentInterface(CustomerDocumentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDocumentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDocumentInterface");
	}
	public CustomerDtServerInterface getCustomerDtServerInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtServerInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
		return new CustomerDtServerBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerDtServerInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtServerInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerDtServerInterface(CustomerDtServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtServerInterface");
	}
	public CustomerDtUrlInterface getCustomerDtUrlInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDtUrlInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
		return new CustomerDtUrlBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerDtUrlInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDtUrlInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerDtUrlInterface(CustomerDtUrlInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerDtUrlInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerDtUrlInterface");
	}
	public CustomerServiceCenterInterface getCustomerServiceCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerServiceCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
		return new CustomerServiceCenterBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getCustomerServiceCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerServiceCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseCustomerServiceCenterInterface(CustomerServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseCustomerServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseCustomerServiceCenterInterface");
	}
	public DepositInterface getDepositInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
		return new DepositBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDepositInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDepositInterface(DepositInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositInterface");
	}
	public DepositTypeInterface getDepositTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
		return new DepositTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDepositTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDepositTypeInterface(DepositTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDepositTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDepositTypeInterface");
	}
	public DiscReasonInterface getDiscReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
		return new DiscReasonBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDiscReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDiscReasonInterface(DiscReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDiscReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDiscReasonInterface");
	}
	public DocumentTypeRefInterface getDocumentTypeRefInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeRefInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
		return new DocumentTypeRefBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getDocumentTypeRefInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeRefInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseDocumentTypeRefInterface(DocumentTypeRefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseDocumentTypeRefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseDocumentTypeRefInterface");
	}
	public EarlyTerminationChargeInterface getEarlyTerminationChargeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEarlyTerminationChargeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
		return new EarlyTerminationChargeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEarlyTerminationChargeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEarlyTerminationChargeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEarlyTerminationChargeInterface(EarlyTerminationChargeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEarlyTerminationChargeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEarlyTerminationChargeInterface");
	}
	public EftResponseCodeInterface getEftResponseCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftResponseCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
		return new EftResponseCodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEftResponseCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftResponseCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEftResponseCodeInterface(EftResponseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftResponseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftResponseCodeInterface");
	}
	public EftTransactionInterface getEftTransactionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransactionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
		return new EftTransactionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEftTransactionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransactionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEftTransactionInterface(EftTransactionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEftTransactionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEftTransactionInterface");
	}
	public EnhancedNoteInterface getEnhancedNoteInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnhancedNoteInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
		return new EnhancedNoteBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getEnhancedNoteInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getEnhancedNoteInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseEnhancedNoteInterface(EnhancedNoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseEnhancedNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseEnhancedNoteInterface");
	}
	public ExchangeRateClassInterface getExchangeRateClassInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExchangeRateClassInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
		return new ExchangeRateClassBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExchangeRateClassInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExchangeRateClassInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExchangeRateClassInterface(ExchangeRateClassInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExchangeRateClassInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExchangeRateClassInterface");
	}
	public ExtendedDataAssociationInterface getExtendedDataAssociationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataAssociationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
		return new ExtendedDataAssociationBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataAssociationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataAssociationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataAssociationInterface(ExtendedDataAssociationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataAssociationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataAssociationInterface");
	}
	public ExtendedDataEnumerationInterface getExtendedDataEnumerationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataEnumerationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
		return new ExtendedDataEnumerationBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataEnumerationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataEnumerationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataEnumerationInterface(ExtendedDataEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataEnumerationInterface");
	}
	public ExtendedDataLocateInterface getExtendedDataLocateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataLocateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
		return new ExtendedDataLocateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataLocateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataLocateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataLocateInterface(ExtendedDataLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataLocateInterface");
	}
	public ExtendedDataParamInterface getExtendedDataParamInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
		return new ExtendedDataParamBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataParamInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataParamInterface(ExtendedDataParamInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamInterface");
	}
	public ExtendedDataParamTypeInterface getExtendedDataParamTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtendedDataParamTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
		return new ExtendedDataParamTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExtendedDataParamTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExtendedDataParamTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExtendedDataParamTypeInterface(ExtendedDataParamTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExtendedDataParamTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExtendedDataParamTypeInterface");
	}
	public ExternalIdAcctMapInterface getExternalIdAcctMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAcctMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
		return new ExternalIdAcctMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExternalIdAcctMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAcctMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExternalIdAcctMapInterface(ExternalIdAcctMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdAcctMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdAcctMapInterface");
	}
	public ExternalIdHqGroupsMapInterface getExternalIdHqGroupsMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdHqGroupsMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
		return new ExternalIdHqGroupsMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getExternalIdHqGroupsMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdHqGroupsMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseExternalIdHqGroupsMapInterface(ExternalIdHqGroupsMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseExternalIdHqGroupsMapInterface");
	}
	public FranchiseCodeInterface getFranchiseCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
		return new FranchiseCodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getFranchiseCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseFranchiseCodeInterface(FranchiseCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseFranchiseCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseFranchiseCodeInterface");
	}
	public GenderTypeInterface getGenderTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
		return new GenderTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGenderTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGenderTypeInterface(GenderTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenderTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenderTypeInterface");
	}
	public GenericEnumerationInterface getGenericEnumerationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenericEnumerationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
		return new GenericEnumerationBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGenericEnumerationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGenericEnumerationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGenericEnumerationInterface(GenericEnumerationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGenericEnumerationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGenericEnumerationInterface");
	}
	public GeocodeInterface getGeocodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
		return new GeocodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGeocodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGeocodeInterface(GeocodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGeocodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGeocodeInterface");
	}
	public GlobalAccountBalancesInterface getGlobalAccountBalancesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalAccountBalancesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
		return new GlobalAccountBalancesBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGlobalAccountBalancesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalAccountBalancesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGlobalAccountBalancesInterface(GlobalAccountBalancesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalAccountBalancesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalAccountBalancesInterface");
	}
	public GlobalContractInterface getGlobalContractInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContractInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
		return new GlobalContractBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGlobalContractInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGlobalContractInterface(GlobalContractInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalContractInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalContractInterface");
	}
	public GlobalOpenItemIdMapInterface getGlobalOpenItemIdMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalOpenItemIdMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
		return new GlobalOpenItemIdMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGlobalOpenItemIdMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalOpenItemIdMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGlobalOpenItemIdMapInterface(GlobalOpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGlobalOpenItemIdMapInterface");
	}
	public GroupInterface getGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
		return new GroupBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGroupInterface(GroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupInterface");
	}
	public GroupLocateInterface getGroupLocateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupLocateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
		return new GroupLocateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGroupLocateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupLocateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGroupLocateInterface(GroupLocateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupLocateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupLocateInterface");
	}
	public GroupMemberInterface getGroupMemberInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupMemberInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
		return new GroupMemberBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGroupMemberInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupMemberInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGroupMemberInterface(GroupMemberInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGroupMemberInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGroupMemberInterface");
	}
	public GuiIndicatorInterface getGuiIndicatorInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiIndicatorInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
		return new GuiIndicatorBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getGuiIndicatorInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiIndicatorInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseGuiIndicatorInterface(GuiIndicatorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseGuiIndicatorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseGuiIndicatorInterface");
	}
	public HistoricalContributionInterface getHistoricalContributionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
		return new HistoricalContributionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHistoricalContributionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHistoricalContributionInterface(HistoricalContributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionInterface");
	}
	public HistoricalContributionTaxInterface getHistoricalContributionTaxInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalContributionTaxInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
		return new HistoricalContributionTaxBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHistoricalContributionTaxInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalContributionTaxInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHistoricalContributionTaxInterface(HistoricalContributionTaxInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalContributionTaxInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalContributionTaxInterface");
	}
	public HistoricalThresholdsInterface getHistoricalThresholdsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHistoricalThresholdsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
		return new HistoricalThresholdsBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHistoricalThresholdsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHistoricalThresholdsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHistoricalThresholdsInterface(HistoricalThresholdsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHistoricalThresholdsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHistoricalThresholdsInterface");
	}
	public HqContractUnitCrInterface getHqContractUnitCrInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqContractUnitCrInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
		return new HqContractUnitCrBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqContractUnitCrInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqContractUnitCrInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqContractUnitCrInterface(HqContractUnitCrInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqContractUnitCrInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqContractUnitCrInterface");
	}
	public HqGroupContractsInterface getHqGroupContractsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupContractsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
		return new HqGroupContractsBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupContractsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupContractsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupContractsInterface(HqGroupContractsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupContractsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupContractsInterface");
	}
	public HqGroupCorridorInterface getHqGroupCorridorInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupCorridorInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
		return new HqGroupCorridorBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupCorridorInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupCorridorInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupCorridorInterface(HqGroupCorridorInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupCorridorInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupCorridorInterface");
	}
	public HqGroupMembersInterface getHqGroupMembersInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupMembersInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
		return new HqGroupMembersBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupMembersInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupMembersInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupMembersInterface(HqGroupMembersInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupMembersInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupMembersInterface");
	}
	public HqGroupProductInterface getHqGroupProductInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupProductInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
		return new HqGroupProductBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupProductInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupProductInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupProductInterface(HqGroupProductInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupProductInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupProductInterface");
	}
	public HqGroupsInterface getHqGroupsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqGroupsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
		return new HqGroupsBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqGroupsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqGroupsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqGroupsInterface(HqGroupsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqGroupsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqGroupsInterface");
	}
	public HqgroupUsageRedirectMapInterface getHqgroupUsageRedirectMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getHqgroupUsageRedirectMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
		return new HqgroupUsageRedirectMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getHqgroupUsageRedirectMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getHqgroupUsageRedirectMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseHqgroupUsageRedirectMapInterface(HqgroupUsageRedirectMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseHqgroupUsageRedirectMapInterface");
	}
	public InterimBillInterface getInterimBillInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
		return new InterimBillBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInterimBillInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInterimBillInterface(InterimBillInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInterimBillInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInterimBillInterface");
	}
	public InvoiceInterface getInvoiceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
		return new InvoiceBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInvoiceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInvoiceInterface(InvoiceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceInterface");
	}
	public InvoiceDetailInterface getInvoiceDetailInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
		return new InvoiceDetailBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInvoiceDetailInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInvoiceDetailInterface(InvoiceDetailInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailInterface");
	}
	public InvoiceDetailBulkAdjustmentInterface getInvoiceDetailBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
		return new InvoiceDetailBulkAdjustmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceDetailBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseInvoiceDetailBulkAdjustmentInterface(InvoiceDetailBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseInvoiceDetailBulkAdjustmentInterface");
	}
	public LateFeeRateOverridesInterface getLateFeeRateOverridesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeRateOverridesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
		return new LateFeeRateOverridesBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getLateFeeRateOverridesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeRateOverridesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseLateFeeRateOverridesInterface(LateFeeRateOverridesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLateFeeRateOverridesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLateFeeRateOverridesInterface");
	}
	public LbxPaymentTypeInterface getLbxPaymentTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxPaymentTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
		return new LbxPaymentTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getLbxPaymentTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxPaymentTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseLbxPaymentTypeInterface(LbxPaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseLbxPaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseLbxPaymentTypeInterface");
	}
	public MultiLinesAdjInterface getMultiLinesAdjInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getMultiLinesAdjInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
		return new MultiLinesAdjBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getMultiLinesAdjInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getMultiLinesAdjInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseMultiLinesAdjInterface(MultiLinesAdjInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseMultiLinesAdjInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseMultiLinesAdjInterface");
	}
	public NetActionInterface getNetActionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
		return new NetActionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNetActionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNetActionInterface(NetActionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNetActionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNetActionInterface");
	}
	public NoteInterface getNoteInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
		return new NoteBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNoteInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNoteInterface(NoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteInterface");
	}
	public NoteCodeInterface getNoteCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
		return new NoteCodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNoteCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNoteCodeInterface(NoteCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteCodeInterface");
	}
	public NoteTextInterface getNoteTextInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTextInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
		return new NoteTextBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getNoteTextInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseNoteTextInterface(NoteTextInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseNoteTextInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseNoteTextInterface");
	}
	public OpenItemInterface getOpenItemInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
		return new OpenItemBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOpenItemInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOpenItemInterface(OpenItemInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemInterface");
	}
	public OpenItemIdMapInterface getOpenItemIdMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
		return new OpenItemIdMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOpenItemIdMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOpenItemIdMapInterface(OpenItemIdMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOpenItemIdMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOpenItemIdMapInterface");
	}
	public OrderQuoteInterface getOrderQuoteInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderQuoteInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
		return new OrderQuoteBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOrderQuoteInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderQuoteInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOrderQuoteInterface(OrderQuoteInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOrderQuoteInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOrderQuoteInterface");
	}
	public OverrideDiscountRateInterface getOverrideDiscountRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDiscountRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
		return new OverrideDiscountRateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOverrideDiscountRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDiscountRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOverrideDiscountRateInterface(OverrideDiscountRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideDiscountRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideDiscountRateInterface");
	}
	public OverrideUsageCreditRateInterface getOverrideUsageCreditRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsageCreditRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
		return new OverrideUsageCreditRateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOverrideUsageCreditRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsageCreditRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOverrideUsageCreditRateInterface(OverrideUsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOverrideUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOverrideUsageCreditRateInterface");
	}
	public OwningCostCenterInterface getOwningCostCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
		return new OwningCostCenterBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getOwningCostCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseOwningCostCenterInterface(OwningCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseOwningCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseOwningCostCenterInterface");
	}
	public PackageComponentDefInterface getPackageComponentDefInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageComponentDefInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
		return new PackageComponentDefBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPackageComponentDefInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageComponentDefInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePackageComponentDefInterface(PackageComponentDefInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePackageComponentDefInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePackageComponentDefInterface");
	}
	public PaymentInterface getPaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
		return new PaymentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentInterface(PaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentInterface");
	}
	public PaymentDistributionInterface getPaymentDistributionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDistributionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
		return new PaymentDistributionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentDistributionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDistributionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentDistributionInterface(PaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentDistributionInterface");
	}
	public PaymentMerchantIdInterface getPaymentMerchantIdInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
		return new PaymentMerchantIdBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentMerchantIdInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentMerchantIdInterface(PaymentMerchantIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdInterface");
	}
	public PaymentMerchantIdAssignInterface getPaymentMerchantIdAssignInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdAssignInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
		return new PaymentMerchantIdAssignBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentMerchantIdAssignInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAssignInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentMerchantIdAssignInterface(PaymentMerchantIdAssignInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentMerchantIdAssignInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentMerchantIdAssignInterface");
	}
	public PaymentProfileInterface getPaymentProfileInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfileInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
		return new PaymentProfileBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentProfileInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentProfileInterface(PaymentProfileInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentProfileInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentProfileInterface");
	}
	public PaymentTransInterface getPaymentTransInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTransInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
		return new PaymentTransBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentTransInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentTransInterface(PaymentTransInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTransInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTransInterface");
	}
	public PaymentTypeInterface getPaymentTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
		return new PaymentTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPaymentTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePaymentTypeInterface(PaymentTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePaymentTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePaymentTypeInterface");
	}
	public PrepaymentInterface getPrepaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
		return new PrepaymentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPrepaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePrepaymentInterface(PrepaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentInterface");
	}
	public PrepaymentDistributionInterface getPrepaymentDistributionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentDistributionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
		return new PrepaymentDistributionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPrepaymentDistributionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentDistributionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePrepaymentDistributionInterface(PrepaymentDistributionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrepaymentDistributionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrepaymentDistributionInterface");
	}
	public PrivacyLevelInterface getPrivacyLevelInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevelInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
		return new PrivacyLevelBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getPrivacyLevelInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releasePrivacyLevelInterface(PrivacyLevelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releasePrivacyLevelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releasePrivacyLevelInterface");
	}
	public ProductCatalogInterface getProductCatalogInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductCatalogInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
		return new ProductCatalogBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductCatalogInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductCatalogInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductCatalogInterface(ProductCatalogInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductCatalogInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductCatalogInterface");
	}
	public ProductChargeMapInterface getProductChargeMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductChargeMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
		return new ProductChargeMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductChargeMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductChargeMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductChargeMapInterface(ProductChargeMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductChargeMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductChargeMapInterface");
	}
	public ProductRateKeyInterface getProductRateKeyInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateKeyInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
		return new ProductRateKeyBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductRateKeyInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateKeyInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductRateKeyInterface(ProductRateKeyInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateKeyInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateKeyInterface");
	}
	public ProductRateOverrideInterface getProductRateOverrideInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRateOverrideInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
		return new ProductRateOverrideBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductRateOverrideInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRateOverrideInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductRateOverrideInterface(ProductRateOverrideInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRateOverrideInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRateOverrideInterface");
	}
	public ProductRcRateInterface getProductRcRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductRcRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
		return new ProductRcRateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getProductRcRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getProductRcRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseProductRcRateInterface(ProductRcRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseProductRcRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseProductRcRateInterface");
	}
	public RefinancePlanInterface getRefinancePlanInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
		return new RefinancePlanBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRefinancePlanInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRefinancePlanInterface(RefinancePlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefinancePlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefinancePlanInterface");
	}
	public RefundInterface getRefundInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
		return new RefundBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRefundInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRefundInterface(RefundInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundInterface");
	}
	public RefundReasonInterface getRefundReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
		return new RefundReasonBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRefundReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRefundReasonInterface(RefundReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRefundReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRefundReasonInterface");
	}
	public RegulatoryIdInterface getRegulatoryIdInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
		return new RegulatoryIdBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRegulatoryIdInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRegulatoryIdInterface(RegulatoryIdInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRegulatoryIdInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRegulatoryIdInterface");
	}
	public RevRcvCostCenterInterface getRevRcvCostCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
		return new RevRcvCostCenterBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRevRcvCostCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRevRcvCostCenterInterface(RevRcvCostCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRevRcvCostCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRevRcvCostCenterInterface");
	}
	public ReverseBulkAdjustmentInterface getReverseBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getReverseBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
		return new ReverseBulkAdjustmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getReverseBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getReverseBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseReverseBulkAdjustmentInterface(ReverseBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseReverseBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseReverseBulkAdjustmentInterface");
	}
	public RewardBalanceInterface getRewardBalanceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
		return new RewardBalanceBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRewardBalanceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRewardBalanceInterface(RewardBalanceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceInterface");
	}
	public RewardBalanceEntityMappingInterface getRewardBalanceEntityMappingInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceEntityMappingInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
		return new RewardBalanceEntityMappingBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRewardBalanceEntityMappingInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceEntityMappingInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRewardBalanceEntityMappingInterface(RewardBalanceEntityMappingInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRewardBalanceEntityMappingInterface");
	}
	public RtPaymentResponseInterface getRtPaymentResponseInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtPaymentResponseInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
		return new RtPaymentResponseBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getRtPaymentResponseInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getRtPaymentResponseInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseRtPaymentResponseInterface(RtPaymentResponseInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseRtPaymentResponseInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseRtPaymentResponseInterface");
	}
	public SalesChannelInterface getSalesChannelInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
		return new SalesChannelBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSalesChannelInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSalesChannelInterface(SalesChannelInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSalesChannelInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSalesChannelInterface");
	}
	public SecurityAciInterface getSecurityAciInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityAciInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
		return new SecurityAciBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityAciInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityAciInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityAciInterface(SecurityAciInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityAciInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityAciInterface");
	}
	public SecurityResourceInterface getSecurityResourceInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityResourceInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
		return new SecurityResourceBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityResourceInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityResourceInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityResourceInterface(SecurityResourceInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityResourceInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityResourceInterface");
	}
	public SecurityRoleInterface getSecurityRoleInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityRoleInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
		return new SecurityRoleBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityRoleInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityRoleInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityRoleInterface(SecurityRoleInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityRoleInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityRoleInterface");
	}
	public SecurityUserInterface getSecurityUserInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityUserInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
		return new SecurityUserBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSecurityUserInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityUserInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSecurityUserInterface(SecurityUserInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSecurityUserInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSecurityUserInterface");
	}
	public ServerInterface getServerInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
		return new ServerBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServerInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServerInterface(ServerInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerInterface");
	}
	public ServerCategoryInterface getServerCategoryInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategoryInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
		return new ServerCategoryBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServerCategoryInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServerCategoryInterface(ServerCategoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerCategoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerCategoryInterface");
	}
	public ServerDefinitionInterface getServerDefinitionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerDefinitionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
		return new ServerDefinitionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServerDefinitionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServerDefinitionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServerDefinitionInterface(ServerDefinitionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServerDefinitionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServerDefinitionInterface");
	}
	public ServiceCenterInterface getServiceCenterInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
		return new ServiceCenterBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceCenterInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceCenterInterface(ServiceCenterInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterInterface");
	}
	public ServiceCenterTypeInterface getServiceCenterTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
		return new ServiceCenterTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceCenterTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceCenterTypeInterface(ServiceCenterTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceCenterTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceCenterTypeInterface");
	}
	public ServiceMasterGroupInterface getServiceMasterGroupInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMasterGroupInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
		return new ServiceMasterGroupBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceMasterGroupInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMasterGroupInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceMasterGroupInterface(ServiceMasterGroupInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceMasterGroupInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceMasterGroupInterface");
	}
	public ServicePricingPlanInterface getServicePricingPlanInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePricingPlanInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
		return new ServicePricingPlanBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServicePricingPlanInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePricingPlanInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServicePricingPlanInterface(ServicePricingPlanInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServicePricingPlanInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServicePricingPlanInterface");
	}
	public ServiceZoneInterface getServiceZoneInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceZoneInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
		return new ServiceZoneBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getServiceZoneInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceZoneInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseServiceZoneInterface(ServiceZoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseServiceZoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseServiceZoneInterface");
	}
	public SlaMeasurementDataInterface getSlaMeasurementDataInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementDataInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
		return new SlaMeasurementDataBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getSlaMeasurementDataInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementDataInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseSlaMeasurementDataInterface(SlaMeasurementDataInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseSlaMeasurementDataInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseSlaMeasurementDataInterface");
	}
	public StatusReasonMapInterface getStatusReasonMapInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonMapInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
		return new StatusReasonMapBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getStatusReasonMapInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonMapInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseStatusReasonMapInterface(StatusReasonMapInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseStatusReasonMapInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseStatusReasonMapInterface");
	}
	public TaxAbandonedInterface getTaxAbandonedInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAbandonedInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
		return new TaxAbandonedBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxAbandonedInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAbandonedInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxAbandonedInterface(TaxAbandonedInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAbandonedInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAbandonedInterface");
	}
	public TaxAssignmentInterface getTaxAssignmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAssignmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
		return new TaxAssignmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxAssignmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAssignmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxAssignmentInterface(TaxAssignmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxAssignmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxAssignmentInterface");
	}
	public TaxExemptionInterface getTaxExemptionInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxExemptionInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
		return new TaxExemptionBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxExemptionInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxExemptionInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxExemptionInterface(TaxExemptionInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxExemptionInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxExemptionInterface");
	}
	public TaxPackageInstInterface getTaxPackageInstInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPackageInstInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
		return new TaxPackageInstBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxPackageInstInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPackageInstInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxPackageInstInterface(TaxPackageInstInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxPackageInstInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxPackageInstInterface");
	}
	public TaxRatesVatInterface getTaxRatesVatInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRatesVatInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
		return new TaxRatesVatBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxRatesVatInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRatesVatInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxRatesVatInterface(TaxRatesVatInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxRatesVatInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxRatesVatInterface");
	}
	public TaxStatusInterface getTaxStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
		return new TaxStatusBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxStatusInterface(TaxStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxStatusInterface");
	}
	public TaxTypeCommInterface getTaxTypeCommInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCommInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
		return new TaxTypeCommBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTaxTypeCommInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCommInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTaxTypeCommInterface(TaxTypeCommInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTaxTypeCommInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTaxTypeCommInterface");
	}
	public TimezoneInterface getTimezoneInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
		return new TimezoneBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTimezoneInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTimezoneInterface(TimezoneInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTimezoneInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTimezoneInterface");
	}
	public TransSourceTypeInterface getTransSourceTypeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceTypeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
		return new TransSourceTypeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTransSourceTypeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceTypeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTransSourceTypeInterface(TransSourceTypeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransSourceTypeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransSourceTypeInterface");
	}
	public TransferReasonInterface getTransferReasonInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferReasonInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
		return new TransferReasonBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getTransferReasonInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferReasonInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseTransferReasonInterface(TransferReasonInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseTransferReasonInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseTransferReasonInterface");
	}
	public UnappliedPaymentInterface getUnappliedPaymentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnappliedPaymentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
		return new UnappliedPaymentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUnappliedPaymentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnappliedPaymentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUnappliedPaymentInterface(UnappliedPaymentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnappliedPaymentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnappliedPaymentInterface");
	}
	public UnbilledUsageInterface getUnbilledUsageInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
		return new UnbilledUsageBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUnbilledUsageInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUnbilledUsageInterface(UnbilledUsageInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageInterface");
	}
	public UnbilledUsageBulkAdjustmentInterface getUnbilledUsageBulkAdjustmentInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
		return new UnbilledUsageBulkAdjustmentBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageBulkAdjustmentInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUnbilledUsageBulkAdjustmentInterface(UnbilledUsageBulkAdjustmentInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUnbilledUsageBulkAdjustmentInterface");
	}
	public UsageCreditRateInterface getUsageCreditRateInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageCreditRateInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
		return new UsageCreditRateBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getUsageCreditRateInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageCreditRateInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseUsageCreditRateInterface(UsageCreditRateInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseUsageCreditRateInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseUsageCreditRateInterface");
	}
	public VipCodeInterface getVipCodeInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
		return new VipCodeBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVipCodeInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVipCodeInterface(VipCodeInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVipCodeInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVipCodeInterface");
	}
	public VoucherDefinitionsInterface getVoucherDefinitionsInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDefinitionsInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
		return new VoucherDefinitionsBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherDefinitionsInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDefinitionsInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherDefinitionsInterface(VoucherDefinitionsInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherDefinitionsInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherDefinitionsInterface");
	}
	public VoucherHistoryInterface getVoucherHistoryInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherHistoryInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
		return new VoucherHistoryBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherHistoryInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherHistoryInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherHistoryInterface(VoucherHistoryInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherHistoryInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherHistoryInterface");
	}
	public VoucherLocationInterface getVoucherLocationInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherLocationInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
		return new VoucherLocationBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherLocationInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherLocationInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherLocationInterface(VoucherLocationInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherLocationInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherLocationInterface");
	}
	public VoucherStatusInterface getVoucherStatusInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
		return new VoucherStatusBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherStatusInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherStatusInterface(VoucherStatusInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInterface");
	}
	public VoucherStatusInfoInterface getVoucherStatusInfoInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusInfoInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
		return new VoucherStatusInfoBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherStatusInfoInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusInfoInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherStatusInfoInterface(VoucherStatusInfoInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusInfoInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusInfoInterface");
	}
	public VoucherStatusMovementInterface getVoucherStatusMovementInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherStatusMovementInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
		return new VoucherStatusMovementBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherStatusMovementInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherStatusMovementInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherStatusMovementInterface(VoucherStatusMovementInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherStatusMovementInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherStatusMovementInterface");
	}
	public VoucherTypesInterface getVoucherTypesInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypesInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
		return new VoucherTypesBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getVoucherTypesInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypesInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseVoucherTypesInterface(VoucherTypesInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseVoucherTypesInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseVoucherTypesInterface");
	}
	public WriteoffInterface getWriteoffInterface() throws InterfaceFactoryException {
		try {
			if(Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffInterface");
			PassiveCallbackHandler cbh = new PassiveCallbackHandler(user, password);
			LoginContext lc = new LoginContext(lcName, cbh);
			lc.login();
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
		return new WriteoffBean(BSDMSettings.getDefault());
		} catch (Exception x) {
			Logger.error(this.getClass(), "getWriteoffInterface", "Could not get interface referrence", x);
			if(Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffInterface");
			throw new InterfaceFactoryException("PROXY_INTERFACECREATEERROR", "Could not create interface - ", x);
		}
	}
	public void releaseWriteoffInterface(WriteoffInterface obj) throws InterfaceFactoryException {
		if(Logger.TRACE) Logger.traceEntry(this.getClass(), "releaseWriteoffInterface");
		if(Logger.TRACE) Logger.traceExit(this.getClass(), "releaseWriteoffInterface");
	}
}
