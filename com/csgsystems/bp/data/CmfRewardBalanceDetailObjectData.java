/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CmfRewardBalanceDetailObjectData.java
 * Definition File: Customer/CmfRewardBalanceDetail.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *---------------------------------------------------------------------------*/
/**---------------------------------------------------------------------------
 * Object Summary Information
 *----------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.data;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseObjectData;
  
/** CmfRewardBalanceDetailObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CmfRewardBalanceDetailObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CmfRewardBalanceDetailObjectKeyData Key = null;
  /** CMF_REWARD_BALANCE_DETAIL.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.expiration_date field */
  public    Date ExpirationDate  = null;
  protected boolean _ExpirationDateSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.close_date field */
  public    Date CloseDate  = null;
  protected boolean _CloseDateSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.new_reward field */
  public    BigInteger NewReward  = null;
  protected boolean _NewRewardSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.total_reward field */
  public    BigInteger TotalReward  = null;
  protected boolean _TotalRewardSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.total_available_reward field */
  public    BigInteger TotalAvailableReward  = null;
  protected boolean _TotalAvailableRewardSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.balance_reward field */
  public    BigInteger BalanceReward  = null;
  protected boolean _BalanceRewardSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.total_adj field */
  public    BigInteger TotalAdj  = null;
  protected boolean _TotalAdjSet = false;
  /** CMF_REWARD_BALANCE_DETAIL.total_spend field */
  public    BigInteger TotalSpend  = null;
  protected boolean _TotalSpendSet = false;
  private String _objName = "CmfRewardBalanceDetailObjectData";
  /** Default constructor */
  public CmfRewardBalanceDetailObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CmfRewardBalanceDetailObjectData (CmfRewardBalanceDetailObjectData other)
  {

    if (other == null) return;
    this.Key = new CmfRewardBalanceDetailObjectKeyData (other.Key);
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.ExpirationDate = other.ExpirationDate;
    this._ExpirationDateSet = other._ExpirationDateSet;
    this.CloseDate = other.CloseDate;
    this._CloseDateSet = other._CloseDateSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.NewReward = other.NewReward;
    this._NewRewardSet = other._NewRewardSet;
    this.TotalReward = other.TotalReward;
    this._TotalRewardSet = other._TotalRewardSet;
    this.TotalAvailableReward = other.TotalAvailableReward;
    this._TotalAvailableRewardSet = other._TotalAvailableRewardSet;
    this.BalanceReward = other.BalanceReward;
    this._BalanceRewardSet = other._BalanceRewardSet;
    this.TotalAdj = other.TotalAdj;
    this._TotalAdjSet = other._TotalAdjSet;
    this.TotalSpend = other.TotalSpend;
    this._TotalSpendSet = other._TotalSpendSet;
  }

  /** get the Key for this object
   * @return CmfRewardBalanceDetailObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CmfRewardBalanceDetailObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CmfRewardBalanceDetailObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    if (this.Key == null) return false;
    return this.Key._AccountInternalIdSet;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** set the fields value: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRewardBalanceId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RewardBalanceId", "setRewardBalanceId");
    }
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyData ();
    this.Key.RewardBalanceId = value;
    this.Key._RewardBalanceIdSet = true;
  }
  /** get the value of the field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @return Integer the value
   */
  public Integer getRewardBalanceId () {
    if (this.Key == null) return null;
    return this.Key.RewardBalanceId;
  }
  /** Change the field to not being actively set: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   */
  public void unsetRewardBalanceId () {
    if (this.Key == null) return;
    this.Key._RewardBalanceIdSet = false;
  }
  /** See if the field is actively set: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRewardBalanceId () {
    if (this.Key == null) return false;
    return this.Key._RewardBalanceIdSet;
  }

  /** Retrieves the RewardBalanceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RewardBalanceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RewardBalanceId field
   */
   public String getRewardBalanceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceIdAsFormattedString");
       return fmtMgr.formatNumber(this.getRewardBalanceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RewardBalanceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRewardBalanceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RewardBalanceId field from a formatted string
   *
   * @param _value the RewardBalanceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RewardBalanceId field
   */
   public void setRewardBalanceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRewardBalanceId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RewardBalanceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRewardBalanceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRewardBalanceIdFromFormattedString");
   }

  /** set the fields value: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyData ();
    this.Key.BillRefNo = value;
    this.Key._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   */
  public void unsetBillRefNo () {
    if (this.Key == null) return;
    this.Key._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    if (this.Key == null) return false;
    return this.Key._BillRefNoSet;
  }

  /** Retrieves the BillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo field
   */
   public String getBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo field from a formatted string
   *
   * @param _value the BillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo field
   */
   public void setBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** set the fields value: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyData ();
    this.Key.BillRefResets = value;
    this.Key._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    if (this.Key == null) return;
    this.Key._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    if (this.Key == null) return false;
    return this.Key._BillRefResetsSet;
  }

  /** Retrieves the BillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets field
   */
   public String getBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets field from a formatted string
   *
   * @param _value the BillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets field
   */
   public void setBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** set the fields value: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExpirationDate") 
  public void setExpirationDate (Date value) throws ServiceException
  {
    this.ExpirationDate = value;
    this._ExpirationDateSet = true;
  }

  /** Retrieves the ExpirationDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExpirationDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationDate field
   */
   public String getExpirationDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationDateAsFormattedString");
       return fmtMgr.formatDate(this.getExpirationDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExpirationDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExpirationDate field from a formatted string
   *
   * @param _value the ExpirationDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExpirationDate field
   */
   public void setExpirationDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExpirationDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExpirationDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExpirationDateFromFormattedString");
   }

  /**
   * Retrieves the ExpirationDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExpirationDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationDate field
   */
  public String getExpirationDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getExpirationDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ExpirationDate field value from a formatted date/time string
   *
   * @param _value the ExpirationDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExpirationDate field
   */
  public void setExpirationDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExpirationDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setExpirationDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @return Date the value
   */
  public Date getExpirationDate () {
    return this.ExpirationDate;
  }
  /** Change the field to not being actively set: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   */
  public void unsetExpirationDate () {
    this._ExpirationDateSet = false;
  }
  /** See if the field is actively set: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetExpirationDate () {
    return this._ExpirationDateSet;
  }
  /** set the fields value: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CloseDate") 
  public void setCloseDate (Date value) throws ServiceException
  {
    this.CloseDate = value;
    this._CloseDateSet = true;
  }

  /** Retrieves the CloseDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CloseDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CloseDate field
   */
   public String getCloseDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCloseDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCloseDateAsFormattedString");
       return fmtMgr.formatDate(this.getCloseDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CloseDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCloseDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CloseDate field from a formatted string
   *
   * @param _value the CloseDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CloseDate field
   */
   public void setCloseDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCloseDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCloseDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CloseDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCloseDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCloseDateFromFormattedString");
   }

  /**
   * Retrieves the CloseDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CloseDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CloseDate field
   */
  public String getCloseDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCloseDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCloseDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCloseDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CloseDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCloseDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CloseDate field value from a formatted date/time string
   *
   * @param _value the CloseDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CloseDate field
   */
  public void setCloseDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCloseDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCloseDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CloseDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCloseDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @return Date the value
   */
  public Date getCloseDate () {
    return this.CloseDate;
  }
  /** Change the field to not being actively set: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   */
  public void unsetCloseDate () {
    this._CloseDateSet = false;
  }
  /** See if the field is actively set: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetCloseDate () {
    return this._CloseDateSet;
  }
  /** set the fields value: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    this.ChgDate = value;
    this._ChgDateSet = true;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NewReward") 
  public void setNewReward (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NewReward", "setNewReward");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NewReward", "setNewReward");
    }
    this.NewReward = value;
    this._NewRewardSet = true;
  }

  /** Retrieves the NewReward field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NewReward field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewReward field
   */
   public String getNewRewardAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewRewardAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewRewardAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNewReward(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewRewardAsFormattedString");
       throw x;
     }
   }
  /** Sets the NewReward field from a formatted string
   *
   * @param _value the NewReward field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NewReward field
   */
   public void setNewRewardFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewRewardFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNewReward(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewRewardFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewRewardFromFormattedString");
   }

  /** get the value of the field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @return BigInteger the value
   */
  public BigInteger getNewReward () {
    return this.NewReward;
  }
  /** Change the field to not being actively set: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   */
  public void unsetNewReward () {
    this._NewRewardSet = false;
  }
  /** See if the field is actively set: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @return boolean whether the field is actively set
   */
  public boolean issetNewReward () {
    return this._NewRewardSet;
  }
  /** set the fields value: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalReward") 
  public void setTotalReward (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalReward", "setTotalReward");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalReward", "setTotalReward");
    }
    this.TotalReward = value;
    this._TotalRewardSet = true;
  }

  /** Retrieves the TotalReward field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalReward field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalReward field
   */
   public String getTotalRewardAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalRewardAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalRewardAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalReward(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalRewardAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalReward field from a formatted string
   *
   * @param _value the TotalReward field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalReward field
   */
   public void setTotalRewardFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalRewardFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalReward(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalRewardFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalRewardFromFormattedString");
   }

  /** get the value of the field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @return BigInteger the value
   */
  public BigInteger getTotalReward () {
    return this.TotalReward;
  }
  /** Change the field to not being actively set: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   */
  public void unsetTotalReward () {
    this._TotalRewardSet = false;
  }
  /** See if the field is actively set: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalReward () {
    return this._TotalRewardSet;
  }
  /** set the fields value: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalAvailableReward") 
  public void setTotalAvailableReward (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalAvailableReward", "setTotalAvailableReward");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalAvailableReward", "setTotalAvailableReward");
    }
    this.TotalAvailableReward = value;
    this._TotalAvailableRewardSet = true;
  }

  /** Retrieves the TotalAvailableReward field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalAvailableReward field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAvailableReward field
   */
   public String getTotalAvailableRewardAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAvailableRewardAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAvailableRewardAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalAvailableReward(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAvailableReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAvailableRewardAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalAvailableReward field from a formatted string
   *
   * @param _value the TotalAvailableReward field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAvailableReward field
   */
   public void setTotalAvailableRewardFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAvailableRewardFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalAvailableReward(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAvailableReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAvailableRewardFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAvailableRewardFromFormattedString");
   }

  /** get the value of the field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @return BigInteger the value
   */
  public BigInteger getTotalAvailableReward () {
    return this.TotalAvailableReward;
  }
  /** Change the field to not being actively set: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   */
  public void unsetTotalAvailableReward () {
    this._TotalAvailableRewardSet = false;
  }
  /** See if the field is actively set: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalAvailableReward () {
    return this._TotalAvailableRewardSet;
  }
  /** set the fields value: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceReward") 
  public void setBalanceReward (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceReward", "setBalanceReward");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BalanceReward", "setBalanceReward");
    }
    this.BalanceReward = value;
    this._BalanceRewardSet = true;
  }

  /** Retrieves the BalanceReward field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceReward field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceReward field
   */
   public String getBalanceRewardAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceRewardAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceRewardAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBalanceReward(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceRewardAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceReward field from a formatted string
   *
   * @param _value the BalanceReward field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceReward field
   */
   public void setBalanceRewardFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceRewardFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceReward(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceReward");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceRewardFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceRewardFromFormattedString");
   }

  /** get the value of the field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @return BigInteger the value
   */
  public BigInteger getBalanceReward () {
    return this.BalanceReward;
  }
  /** Change the field to not being actively set: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   */
  public void unsetBalanceReward () {
    this._BalanceRewardSet = false;
  }
  /** See if the field is actively set: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceReward () {
    return this._BalanceRewardSet;
  }
  /** set the fields value: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalAdj") 
  public void setTotalAdj (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalAdj", "setTotalAdj");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalAdj", "setTotalAdj");
    }
    this.TotalAdj = value;
    this._TotalAdjSet = true;
  }

  /** Retrieves the TotalAdj field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalAdj field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdj field
   */
   public String getTotalAdjAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalAdj(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalAdj field from a formatted string
   *
   * @param _value the TotalAdj field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAdj field
   */
   public void setTotalAdjFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalAdj(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFromFormattedString");
   }

  /**
   * Retrieves the TotalAdj field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAdj field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdj field
   */
  public String getTotalAdjAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalAdj(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdj");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAdj field value from a formatted currency string
   *
   * @param _value the TotalAdj field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAdj field
   */
  public void setTotalAdjFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAdjFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalAdj(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdj");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @return BigInteger the value
   */
  public BigInteger getTotalAdj () {
    return this.TotalAdj;
  }
  /** Change the field to not being actively set: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   */
  public void unsetTotalAdj () {
    this._TotalAdjSet = false;
  }
  /** See if the field is actively set: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalAdj () {
    return this._TotalAdjSet;
  }
  /** set the fields value: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalSpend") 
  public void setTotalSpend (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalSpend", "setTotalSpend");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalSpend", "setTotalSpend");
    }
    this.TotalSpend = value;
    this._TotalSpendSet = true;
  }

  /** Retrieves the TotalSpend field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalSpend field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSpend field
   */
   public String getTotalSpendAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSpendAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSpendAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalSpend(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalSpend");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSpendAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalSpend field from a formatted string
   *
   * @param _value the TotalSpend field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalSpend field
   */
   public void setTotalSpendFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSpendFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalSpend(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalSpend");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSpendFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSpendFromFormattedString");
   }

  /**
   * Retrieves the TotalSpend field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalSpend field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSpend field
   */
  public String getTotalSpendAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSpendAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSpendAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalSpend(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSpend");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSpendAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalSpend field value from a formatted currency string
   *
   * @param _value the TotalSpend field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalSpend field
   */
  public void setTotalSpendFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalSpendFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalSpend(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSpend");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSpendFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSpendFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @return BigInteger the value
   */
  public BigInteger getTotalSpend () {
    return this.TotalSpend;
  }
  /** Change the field to not being actively set: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   */
  public void unsetTotalSpend () {
    this._TotalSpendSet = false;
  }
  /** See if the field is actively set: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalSpend () {
    return this._TotalSpendSet;
  }
  public String toString() {
    return CmfRewardBalanceDetailObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ObjectHelper.objectToMap(this);
  }
  public void loadDefaults(String action) {
    if (action != null) DefaultManager.getInstance().setObjectDefaults(this, action);
  }
  public void checkConstraints(String action) throws ConstraintException {
    if (action != null) ConstraintManager.getInstance().checkConstraints(this, action);
  }
  /*
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** CMF_REWARD_BALANCE_DETAIL.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.expiration_date field */
    if(!nonNullOnly || (ExpirationDate != null))  _ExpirationDateSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.close_date field */
    if(!nonNullOnly || (CloseDate != null))  _CloseDateSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.new_reward field */
    if(!nonNullOnly || (NewReward != null))  _NewRewardSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.total_reward field */
    if(!nonNullOnly || (TotalReward != null))  _TotalRewardSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.total_available_reward field */
    if(!nonNullOnly || (TotalAvailableReward != null))  _TotalAvailableRewardSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.balance_reward field */
    if(!nonNullOnly || (BalanceReward != null))  _BalanceRewardSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.total_adj field */
    if(!nonNullOnly || (TotalAdj != null))  _TotalAdjSet = flag;
  /** CMF_REWARD_BALANCE_DETAIL.total_spend field */
    if(!nonNullOnly || (TotalSpend != null))  _TotalSpendSet = flag;
  }
}
