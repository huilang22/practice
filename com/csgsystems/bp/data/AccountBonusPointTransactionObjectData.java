/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBonusPointTransactionObjectData.java
 * Definition File: Customer/AccountBonusPointTransaction.xml
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
  
/** AccountBonusPointTransactionObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountBonusPointTransactionObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AccountBonusPointTransactionObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** CMF_BONUS_POINT.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** CMF_BONUS_POINT.contract_tracking_id field */
  public    Integer ContractTrackingId  = null;
  protected boolean _ContractTrackingIdSet = false;
  /** CMF_BONUS_POINT.contract_tracking_id_serv field */
  public    Integer ContractTrackingIdServ  = null;
  protected boolean _ContractTrackingIdServSet = false;
  /** CMF_BONUS_POINT.bonus_point_id field */
  public    Integer BonusPointId  = null;
  protected boolean _BonusPointIdSet = false;
  /** CMF_BONUS_POINT.bonus_point_trans_type field */
  public    Integer BonusPointTransType  = null;
  protected boolean _BonusPointTransTypeSet = false;
  /** CMF_BONUS_POINT.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** CMF_BONUS_POINT.distributed_amount field */
  public    BigInteger DistributedAmount  = null;
  protected boolean _DistributedAmountSet = false;
  /** CMF_BONUS_POINT.trans_date field */
  public    Date TransDate  = null;
  protected boolean _TransDateSet = false;
  /** CMF_BONUS_POINT.expiration_date field */
  public    Date ExpirationDate  = null;
  protected boolean _ExpirationDateSet = false;
  /** CMF_BONUS_POINT.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** CMF_BONUS_POINT.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** CMF_BONUS_POINT.expiration_bill_ref_no field */
  public    Integer ExpirationBillRefNo  = null;
  protected boolean _ExpirationBillRefNoSet = false;
  /** CMF_BONUS_POINT.expiration_bill_ref_resets field */
  public    Integer ExpirationBillRefResets  = null;
  protected boolean _ExpirationBillRefResetsSet = false;
  /** CMF_BONUS_POINT.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CMF_BONUS_POINT.entry_date field */
  public    Date EntryDate  = null;
  protected boolean _EntryDateSet = false;
  /** CMF_BONUS_POINT.trans_status field */
  public    Integer TransStatus  = null;
  protected boolean _TransStatusSet = false;
  /** CMF_BONUS_POINT.transfer_tracking_id field */
  public    Integer TransferTrackingId  = null;
  protected boolean _TransferTrackingIdSet = false;
  /** CMF_BONUS_POINT.transfer_tracking_id_serv field */
  public    Integer TransferTrackingIdServ  = null;
  protected boolean _TransferTrackingIdServSet = false;
  /** CMF_BONUS_POINT.external_trans_id field */
  public    String ExternalTransId  = null;
  protected boolean _ExternalTransIdSet = false;
  /** CMF_BONUS_POINT.external_date field */
  public    Date ExternalDate  = null;
  protected boolean _ExternalDateSet = false;
  /** CMF_BONUS_POINT.external_trans_msg field */
  public    String ExternalTransMsg  = null;
  protected boolean _ExternalTransMsgSet = false;
  /** CMF_BONUS_POINT.external_trans_info field */
  public    String ExternalTransInfo  = null;
  protected boolean _ExternalTransInfoSet = false;
  private String _objName = "AccountBonusPointTransactionObjectData";
  /** Default constructor */
  public AccountBonusPointTransactionObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountBonusPointTransactionObjectData (AccountBonusPointTransactionObjectData other)
  {

    if (other == null) return;
    this.Key = new AccountBonusPointTransactionObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ContractTrackingId = other.ContractTrackingId;
    this._ContractTrackingIdSet = other._ContractTrackingIdSet;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this._ContractTrackingIdServSet = other._ContractTrackingIdServSet;
    this.BonusPointId = other.BonusPointId;
    this._BonusPointIdSet = other._BonusPointIdSet;
    this.BonusPointTransType = other.BonusPointTransType;
    this._BonusPointTransTypeSet = other._BonusPointTransTypeSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.DistributedAmount = other.DistributedAmount;
    this._DistributedAmountSet = other._DistributedAmountSet;
    this.TransDate = other.TransDate;
    this._TransDateSet = other._TransDateSet;
    this.ExpirationDate = other.ExpirationDate;
    this._ExpirationDateSet = other._ExpirationDateSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.ExpirationBillRefNo = other.ExpirationBillRefNo;
    this._ExpirationBillRefNoSet = other._ExpirationBillRefNoSet;
    this.ExpirationBillRefResets = other.ExpirationBillRefResets;
    this._ExpirationBillRefResetsSet = other._ExpirationBillRefResetsSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.EntryDate = other.EntryDate;
    this._EntryDateSet = other._EntryDateSet;
    this.TransStatus = other.TransStatus;
    this._TransStatusSet = other._TransStatusSet;
    this.TransferTrackingId = other.TransferTrackingId;
    this._TransferTrackingIdSet = other._TransferTrackingIdSet;
    this.TransferTrackingIdServ = other.TransferTrackingIdServ;
    this._TransferTrackingIdServSet = other._TransferTrackingIdServSet;
    this.ExternalTransId = other.ExternalTransId;
    this._ExternalTransIdSet = other._ExternalTransIdSet;
    this.ExternalDate = other.ExternalDate;
    this._ExternalDateSet = other._ExternalDateSet;
    this.ExternalTransMsg = other.ExternalTransMsg;
    this._ExternalTransMsgSet = other._ExternalTransMsgSet;
    this.ExternalTransInfo = other.ExternalTransInfo;
    this._ExternalTransInfoSet = other._ExternalTransInfoSet;
  }

  /** get the Key for this object
   * @return AccountBonusPointTransactionObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AccountBonusPointTransactionObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AccountBonusPointTransactionObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPointTransTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointTransTrackingId", "setPointTransTrackingId");
    }
    if (this.Key == null) this.Key = new AccountBonusPointTransactionObjectKeyData ();
    this.Key.PointTransTrackingId = value;
    this.Key._PointTransTrackingIdSet = true;
  }
  /** get the value of the field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return Integer the value
   */
  public Integer getPointTransTrackingId () {
    if (this.Key == null) return null;
    return this.Key.PointTransTrackingId;
  }
  /** Change the field to not being actively set: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   */
  public void unsetPointTransTrackingId () {
    if (this.Key == null) return;
    this.Key._PointTransTrackingIdSet = false;
  }
  /** See if the field is actively set: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTransTrackingId () {
    if (this.Key == null) return false;
    return this.Key._PointTransTrackingIdSet;
  }

  /** Retrieves the PointTransTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTransTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTransTrackingId field
   */
   public String getPointTransTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTransTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPointTransTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTransTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTransTrackingId field from a formatted string
   *
   * @param _value the PointTransTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTransTrackingId field
   */
   public void setPointTransTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTransTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTransTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTransTrackingIdFromFormattedString");
   }

  /** set the fields value: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPointTransTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointTransTrackingIdServ", "setPointTransTrackingIdServ");
    }
    if (this.Key == null) this.Key = new AccountBonusPointTransactionObjectKeyData ();
    this.Key.PointTransTrackingIdServ = value;
    this.Key._PointTransTrackingIdServSet = true;
  }
  /** get the value of the field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getPointTransTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.PointTransTrackingIdServ;
  }
  /** Change the field to not being actively set: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   */
  public void unsetPointTransTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._PointTransTrackingIdServSet = false;
  }
  /** See if the field is actively set: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTransTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._PointTransTrackingIdServSet;
  }

  /** Retrieves the PointTransTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTransTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTransTrackingIdServ field
   */
   public String getPointTransTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTransTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getPointTransTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTransTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTransTrackingIdServ field from a formatted string
   *
   * @param _value the PointTransTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTransTrackingIdServ field
   */
   public void setPointTransTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTransTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTransTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTransTrackingIdServFromFormattedString");
   }

  /** set the fields value: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalId") 
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountExternalId", "setAccountExternalId");
    }
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
  }

  /** Retrieves the AccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalId field
   */
   public String getAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalId field from a formatted string
   *
   * @param _value the AccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalId field
   */
   public void setAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalIdType") 
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
  }

  /** Retrieves the AccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdType field
   */
   public String getAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalIdType field from a formatted string
   *
   * @param _value the AccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalIdType field
   */
   public void setAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */

  public String getAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */
  public Enumeration getAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      this.setAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
  }
  /** set the fields value: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
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

  /** get the value of the field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_BONUS_POINT.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractTrackingId") 
  public void setContractTrackingId (Integer value) throws ServiceException
  {
    this.ContractTrackingId = value;
    this._ContractTrackingIdSet = true;
  }

  /** Retrieves the ContractTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingId field
   */
   public String getContractTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getContractTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractTrackingId field from a formatted string
   *
   * @param _value the ContractTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractTrackingId field
   */
   public void setContractTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdFromFormattedString");
   }

  /** get the value of the field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @return Integer the value
   */
  public Integer getContractTrackingId () {
    return this.ContractTrackingId;
  }
  /** Change the field to not being actively set: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   */
  public void unsetContractTrackingId () {
    this._ContractTrackingIdSet = false;
  }
  /** See if the field is actively set: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingId () {
    return this._ContractTrackingIdSet;
  }
  /** set the fields value: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractTrackingIdServ") 
  public void setContractTrackingIdServ (Integer value) throws ServiceException
  {
    this.ContractTrackingIdServ = value;
    this._ContractTrackingIdServSet = true;
  }

  /** Retrieves the ContractTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingIdServ field
   */
   public String getContractTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getContractTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractTrackingIdServ field from a formatted string
   *
   * @param _value the ContractTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractTrackingIdServ field
   */
   public void setContractTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdServFromFormattedString");
   }

  /** get the value of the field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getContractTrackingIdServ () {
    return this.ContractTrackingIdServ;
  }
  /** Change the field to not being actively set: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   */
  public void unsetContractTrackingIdServ () {
    this._ContractTrackingIdServSet = false;
  }
  /** See if the field is actively set: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingIdServ () {
    return this._ContractTrackingIdServSet;
  }
  /** set the fields value: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BonusPointId") 
  public void setBonusPointId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BonusPointId", "setBonusPointId");
    }
    this.BonusPointId = value;
    this._BonusPointIdSet = true;
  }

  /** Retrieves the BonusPointId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BonusPointId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointId field
   */
   public String getBonusPointIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBonusPointId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BonusPointId field from a formatted string
   *
   * @param _value the BonusPointId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BonusPointId field
   */
   public void setBonusPointIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBonusPointId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BonusPointId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BonusPointId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BonusPointId field
   */

  public String getBonusPointIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBonusPointIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBonusPointId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BonusPointId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BonusPointId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BonusPointId field
   */
  public Enumeration getBonusPointIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BonusPointId", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BonusPointId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBonusPointIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBonusPointIdEnumeration(_locale);
      this.setBonusPointId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointIdFromDisplayValue");
  }

  /** get the value of the field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @return Integer the value
   */
  public Integer getBonusPointId () {
    return this.BonusPointId;
  }
  /** Change the field to not being actively set: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   */
  public void unsetBonusPointId () {
    this._BonusPointIdSet = false;
  }
  /** See if the field is actively set: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBonusPointId () {
    return this._BonusPointIdSet;
  }
  /** set the fields value: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BonusPointTransType") 
  public void setBonusPointTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BonusPointTransType", "setBonusPointTransType");
    }
    this.BonusPointTransType = value;
    this._BonusPointTransTypeSet = true;
  }

  /** Retrieves the BonusPointTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BonusPointTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointTransType field
   */
   public String getBonusPointTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBonusPointTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BonusPointTransType field from a formatted string
   *
   * @param _value the BonusPointTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BonusPointTransType field
   */
   public void setBonusPointTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBonusPointTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointTransTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BonusPointTransType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BonusPointTransType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BonusPointTransType field
   */

  public String getBonusPointTransTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBonusPointTransTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBonusPointTransType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BonusPointTransType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BonusPointTransType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BonusPointTransType field
   */
  public Enumeration getBonusPointTransTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BonusPointTransType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BonusPointTransType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBonusPointTransTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointTransTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBonusPointTransTypeEnumeration(_locale);
      this.setBonusPointTransType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointTransTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointTransTypeFromDisplayValue");
  }

  /** get the value of the field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @return Integer the value
   */
  public Integer getBonusPointTransType () {
    return this.BonusPointTransType;
  }
  /** Change the field to not being actively set: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   */
  public void unsetBonusPointTransType () {
    this._BonusPointTransTypeSet = false;
  }
  /** See if the field is actively set: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBonusPointTransType () {
    return this._BonusPointTransTypeSet;
  }
  /** set the fields value: Amount (CMF_BONUS_POINT.amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Amount") 
  public void setAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Amount", "setAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Amount", "setAmount");
    }
    this.Amount = value;
    this._AmountSet = true;
  }

  /** Retrieves the Amount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Amount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
   public String getAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Amount field from a formatted string
   *
   * @param _value the Amount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
   public void setAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedString");
   }

  /**
   * Retrieves the Amount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Amount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
  public String getAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Amount field value from a formatted currency string
   *
   * @param _value the Amount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
  public void setAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: Amount (CMF_BONUS_POINT.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (CMF_BONUS_POINT.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (CMF_BONUS_POINT.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DistributedAmount") 
  public void setDistributedAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistributedAmount", "setDistributedAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DistributedAmount", "setDistributedAmount");
    }
    this.DistributedAmount = value;
    this._DistributedAmountSet = true;
  }

  /** Retrieves the DistributedAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistributedAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedAmount field
   */
   public String getDistributedAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDistributedAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistributedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistributedAmount field from a formatted string
   *
   * @param _value the DistributedAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistributedAmount field
   */
   public void setDistributedAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistributedAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistributedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedAmountFromFormattedString");
   }

  /**
   * Retrieves the DistributedAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributedAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedAmount field
   */
  public String getDistributedAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDistributedAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the DistributedAmount field value from a formatted currency string
   *
   * @param _value the DistributedAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistributedAmount field
   */
  public void setDistributedAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributedAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDistributedAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @return BigInteger the value
   */
  public BigInteger getDistributedAmount () {
    return this.DistributedAmount;
  }
  /** Change the field to not being actively set: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   */
  public void unsetDistributedAmount () {
    this._DistributedAmountSet = false;
  }
  /** See if the field is actively set: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistributedAmount () {
    return this._DistributedAmountSet;
  }
  /** set the fields value: TransDate (CMF_BONUS_POINT.trans_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDate") 
  public void setTransDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDate", "setTransDate");
    }
    this.TransDate = value;
    this._TransDateSet = true;
  }

  /** Retrieves the TransDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
   public String getTransDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedString");
       return fmtMgr.formatDate(this.getTransDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDate field from a formatted string
   *
   * @param _value the TransDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
   public void setTransDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFromFormattedString");
   }

  /**
   * Retrieves the TransDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
  public String getTransDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDate field value from a formatted date/time string
   *
   * @param _value the TransDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
  public void setTransDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDate (CMF_BONUS_POINT.trans_date)
   * @return Date the value
   */
  public Date getTransDate () {
    return this.TransDate;
  }
  /** Change the field to not being actively set: TransDate (CMF_BONUS_POINT.trans_date)
   */
  public void unsetTransDate () {
    this._TransDateSet = false;
  }
  /** See if the field is actively set: TransDate (CMF_BONUS_POINT.trans_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDate () {
    return this._TransDateSet;
  }
  /** set the fields value: ExpirationDate (CMF_BONUS_POINT.expiration_date)
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

  /** get the value of the field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * @return Date the value
   */
  public Date getExpirationDate () {
    return this.ExpirationDate;
  }
  /** Change the field to not being actively set: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   */
  public void unsetExpirationDate () {
    this._ExpirationDateSet = false;
  }
  /** See if the field is actively set: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetExpirationDate () {
    return this._ExpirationDateSet;
  }
  /** set the fields value: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo") 
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    this.BillRefNo = value;
    this._BillRefNoSet = true;
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

  /** get the value of the field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets") 
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    this.BillRefResets = value;
    this._BillRefResetsSet = true;
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

  /** get the value of the field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExpirationBillRefNo") 
  public void setExpirationBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExpirationBillRefNo", "setExpirationBillRefNo");
    }
    this.ExpirationBillRefNo = value;
    this._ExpirationBillRefNoSet = true;
  }

  /** Retrieves the ExpirationBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExpirationBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationBillRefNo field
   */
   public String getExpirationBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getExpirationBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExpirationBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExpirationBillRefNo field from a formatted string
   *
   * @param _value the ExpirationBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExpirationBillRefNo field
   */
   public void setExpirationBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExpirationBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExpirationBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExpirationBillRefNoFromFormattedString");
   }

  /** get the value of the field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @return Integer the value
   */
  public Integer getExpirationBillRefNo () {
    return this.ExpirationBillRefNo;
  }
  /** Change the field to not being actively set: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   */
  public void unsetExpirationBillRefNo () {
    this._ExpirationBillRefNoSet = false;
  }
  /** See if the field is actively set: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetExpirationBillRefNo () {
    return this._ExpirationBillRefNoSet;
  }
  /** set the fields value: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExpirationBillRefResets") 
  public void setExpirationBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExpirationBillRefResets", "setExpirationBillRefResets");
    }
    this.ExpirationBillRefResets = value;
    this._ExpirationBillRefResetsSet = true;
  }

  /** Retrieves the ExpirationBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExpirationBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationBillRefResets field
   */
   public String getExpirationBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getExpirationBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExpirationBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExpirationBillRefResets field from a formatted string
   *
   * @param _value the ExpirationBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExpirationBillRefResets field
   */
   public void setExpirationBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExpirationBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExpirationBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExpirationBillRefResetsFromFormattedString");
   }

  /** get the value of the field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getExpirationBillRefResets () {
    return this.ExpirationBillRefResets;
  }
  /** Change the field to not being actively set: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   */
  public void unsetExpirationBillRefResets () {
    this._ExpirationBillRefResetsSet = false;
  }
  /** See if the field is actively set: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetExpirationBillRefResets () {
    return this._ExpirationBillRefResetsSet;
  }
  /** set the fields value: ChgWho (CMF_BONUS_POINT.chg_who)
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

  /** get the value of the field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (CMF_BONUS_POINT.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (CMF_BONUS_POINT.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: EntryDate (CMF_BONUS_POINT.entry_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EntryDate") 
  public void setEntryDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EntryDate", "setEntryDate");
    }
    this.EntryDate = value;
    this._EntryDateSet = true;
  }

  /** Retrieves the EntryDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EntryDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDate field
   */
   public String getEntryDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateAsFormattedString");
       return fmtMgr.formatDate(this.getEntryDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntryDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the EntryDate field from a formatted string
   *
   * @param _value the EntryDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntryDate field
   */
   public void setEntryDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEntryDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntryDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntryDateFromFormattedString");
   }

  /**
   * Retrieves the EntryDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntryDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDate field
   */
  public String getEntryDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEntryDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EntryDate field value from a formatted date/time string
   *
   * @param _value the EntryDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntryDate field
   */
  public void setEntryDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntryDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEntryDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EntryDate (CMF_BONUS_POINT.entry_date)
   * @return Date the value
   */
  public Date getEntryDate () {
    return this.EntryDate;
  }
  /** Change the field to not being actively set: EntryDate (CMF_BONUS_POINT.entry_date)
   */
  public void unsetEntryDate () {
    this._EntryDateSet = false;
  }
  /** See if the field is actively set: EntryDate (CMF_BONUS_POINT.entry_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetEntryDate () {
    return this._EntryDateSet;
  }
  /** set the fields value: TransStatus (CMF_BONUS_POINT.trans_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransStatus") 
  public void setTransStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransStatus", "setTransStatus");
    }
    this.TransStatus = value;
    this._TransStatusSet = true;
  }

  /** Retrieves the TransStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransStatus field
   */
   public String getTransStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getTransStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransStatus field from a formatted string
   *
   * @param _value the TransStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransStatus field
   */
   public void setTransStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransStatusFromFormattedString");
   }

  /** get the value of the field: TransStatus (CMF_BONUS_POINT.trans_status)
   * @return Integer the value
   */
  public Integer getTransStatus () {
    return this.TransStatus;
  }
  /** Change the field to not being actively set: TransStatus (CMF_BONUS_POINT.trans_status)
   */
  public void unsetTransStatus () {
    this._TransStatusSet = false;
  }
  /** See if the field is actively set: TransStatus (CMF_BONUS_POINT.trans_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransStatus () {
    return this._TransStatusSet;
  }
  /** set the fields value: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransferTrackingId") 
  public void setTransferTrackingId (Integer value) throws ServiceException
  {
    this.TransferTrackingId = value;
    this._TransferTrackingIdSet = true;
  }

  /** Retrieves the TransferTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransferTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransferTrackingId field
   */
   public String getTransferTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTransferTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransferTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransferTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransferTrackingId field from a formatted string
   *
   * @param _value the TransferTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransferTrackingId field
   */
   public void setTransferTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransferTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransferTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransferTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransferTrackingIdFromFormattedString");
   }

  /** get the value of the field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @return Integer the value
   */
  public Integer getTransferTrackingId () {
    return this.TransferTrackingId;
  }
  /** Change the field to not being actively set: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   */
  public void unsetTransferTrackingId () {
    this._TransferTrackingIdSet = false;
  }
  /** See if the field is actively set: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransferTrackingId () {
    return this._TransferTrackingIdSet;
  }
  /** set the fields value: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransferTrackingIdServ") 
  public void setTransferTrackingIdServ (Integer value) throws ServiceException
  {
    this.TransferTrackingIdServ = value;
    this._TransferTrackingIdServSet = true;
  }

  /** Retrieves the TransferTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransferTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransferTrackingIdServ field
   */
   public String getTransferTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTransferTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransferTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransferTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransferTrackingIdServ field from a formatted string
   *
   * @param _value the TransferTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransferTrackingIdServ field
   */
   public void setTransferTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransferTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransferTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransferTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransferTrackingIdServFromFormattedString");
   }

  /** get the value of the field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTransferTrackingIdServ () {
    return this.TransferTrackingIdServ;
  }
  /** Change the field to not being actively set: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   */
  public void unsetTransferTrackingIdServ () {
    this._TransferTrackingIdServSet = false;
  }
  /** See if the field is actively set: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransferTrackingIdServ () {
    return this._TransferTrackingIdServSet;
  }
  /** set the fields value: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalTransId") 
  public void setExternalTransId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalTransId", "setExternalTransId");
    }
    this.ExternalTransId = value;
    this._ExternalTransIdSet = true;
  }

  /** Retrieves the ExternalTransId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalTransId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalTransId field
   */
   public String getExternalTransIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalTransIdAsFormattedString");
       return fmtMgr.formatString(this.getExternalTransId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalTransId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalTransIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalTransId field from a formatted string
   *
   * @param _value the ExternalTransId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalTransId field
   */
   public void setExternalTransIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalTransId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalTransId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalTransIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalTransIdFromFormattedString");
   }

  /** get the value of the field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @return String the value
   */
  public String getExternalTransId () {
    return this.ExternalTransId;
  }
  /** Change the field to not being actively set: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   */
  public void unsetExternalTransId () {
    this._ExternalTransIdSet = false;
  }
  /** See if the field is actively set: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalTransId () {
    return this._ExternalTransIdSet;
  }
  /** set the fields value: ExternalDate (CMF_BONUS_POINT.external_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalDate") 
  public void setExternalDate (Date value) throws ServiceException
  {
    this.ExternalDate = value;
    this._ExternalDateSet = true;
  }

  /** Retrieves the ExternalDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalDate field
   */
   public String getExternalDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalDateAsFormattedString");
       return fmtMgr.formatDate(this.getExternalDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalDate field from a formatted string
   *
   * @param _value the ExternalDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalDate field
   */
   public void setExternalDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalDateFromFormattedString");
   }

  /**
   * Retrieves the ExternalDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalDate field
   */
  public String getExternalDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getExternalDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalDate field value from a formatted date/time string
   *
   * @param _value the ExternalDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalDate field
   */
  public void setExternalDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setExternalDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ExternalDate (CMF_BONUS_POINT.external_date)
   * @return Date the value
   */
  public Date getExternalDate () {
    return this.ExternalDate;
  }
  /** Change the field to not being actively set: ExternalDate (CMF_BONUS_POINT.external_date)
   */
  public void unsetExternalDate () {
    this._ExternalDateSet = false;
  }
  /** See if the field is actively set: ExternalDate (CMF_BONUS_POINT.external_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalDate () {
    return this._ExternalDateSet;
  }
  /** set the fields value: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalTransMsg") 
  public void setExternalTransMsg (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalTransMsg", "setExternalTransMsg");
    }
    this.ExternalTransMsg = value;
    this._ExternalTransMsgSet = true;
  }

  /** Retrieves the ExternalTransMsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalTransMsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalTransMsg field
   */
   public String getExternalTransMsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransMsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalTransMsgAsFormattedString");
       return fmtMgr.formatString(this.getExternalTransMsg());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalTransMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalTransMsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalTransMsg field from a formatted string
   *
   * @param _value the ExternalTransMsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalTransMsg field
   */
   public void setExternalTransMsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransMsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalTransMsg(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalTransMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalTransMsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalTransMsgFromFormattedString");
   }

  /** get the value of the field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @return String the value
   */
  public String getExternalTransMsg () {
    return this.ExternalTransMsg;
  }
  /** Change the field to not being actively set: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   */
  public void unsetExternalTransMsg () {
    this._ExternalTransMsgSet = false;
  }
  /** See if the field is actively set: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalTransMsg () {
    return this._ExternalTransMsgSet;
  }
  /** set the fields value: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalTransInfo") 
  public void setExternalTransInfo (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalTransInfo", "setExternalTransInfo");
    }
    this.ExternalTransInfo = value;
    this._ExternalTransInfoSet = true;
  }

  /** Retrieves the ExternalTransInfo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalTransInfo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalTransInfo field
   */
   public String getExternalTransInfoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransInfoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalTransInfoAsFormattedString");
       return fmtMgr.formatString(this.getExternalTransInfo());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalTransInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalTransInfoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalTransInfo field from a formatted string
   *
   * @param _value the ExternalTransInfo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalTransInfo field
   */
   public void setExternalTransInfoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransInfoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalTransInfo(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalTransInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalTransInfoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalTransInfoFromFormattedString");
   }

  /** get the value of the field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @return String the value
   */
  public String getExternalTransInfo () {
    return this.ExternalTransInfo;
  }
  /** Change the field to not being actively set: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   */
  public void unsetExternalTransInfo () {
    this._ExternalTransInfoSet = false;
  }
  /** See if the field is actively set: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalTransInfo () {
    return this._ExternalTransInfoSet;
  }
  public String toString() {
    return AccountBonusPointTransactionObjectHelper.toMap(this, null).toString();
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
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** CMF_BONUS_POINT.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** CMF_BONUS_POINT.contract_tracking_id field */
    if(!nonNullOnly || (ContractTrackingId != null))  _ContractTrackingIdSet = flag;
  /** CMF_BONUS_POINT.contract_tracking_id_serv field */
    if(!nonNullOnly || (ContractTrackingIdServ != null))  _ContractTrackingIdServSet = flag;
  /** CMF_BONUS_POINT.bonus_point_id field */
    if(!nonNullOnly || (BonusPointId != null))  _BonusPointIdSet = flag;
  /** CMF_BONUS_POINT.bonus_point_trans_type field */
    if(!nonNullOnly || (BonusPointTransType != null))  _BonusPointTransTypeSet = flag;
  /** CMF_BONUS_POINT.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** CMF_BONUS_POINT.distributed_amount field */
    if(!nonNullOnly || (DistributedAmount != null))  _DistributedAmountSet = flag;
  /** CMF_BONUS_POINT.trans_date field */
    if(!nonNullOnly || (TransDate != null))  _TransDateSet = flag;
  /** CMF_BONUS_POINT.expiration_date field */
    if(!nonNullOnly || (ExpirationDate != null))  _ExpirationDateSet = flag;
  /** CMF_BONUS_POINT.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** CMF_BONUS_POINT.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** CMF_BONUS_POINT.expiration_bill_ref_no field */
    if(!nonNullOnly || (ExpirationBillRefNo != null))  _ExpirationBillRefNoSet = flag;
  /** CMF_BONUS_POINT.expiration_bill_ref_resets field */
    if(!nonNullOnly || (ExpirationBillRefResets != null))  _ExpirationBillRefResetsSet = flag;
  /** CMF_BONUS_POINT.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CMF_BONUS_POINT.entry_date field */
    if(!nonNullOnly || (EntryDate != null))  _EntryDateSet = flag;
  /** CMF_BONUS_POINT.trans_status field */
    if(!nonNullOnly || (TransStatus != null))  _TransStatusSet = flag;
  /** CMF_BONUS_POINT.transfer_tracking_id field */
    if(!nonNullOnly || (TransferTrackingId != null))  _TransferTrackingIdSet = flag;
  /** CMF_BONUS_POINT.transfer_tracking_id_serv field */
    if(!nonNullOnly || (TransferTrackingIdServ != null))  _TransferTrackingIdServSet = flag;
  /** CMF_BONUS_POINT.external_trans_id field */
    if(!nonNullOnly || (ExternalTransId != null))  _ExternalTransIdSet = flag;
  /** CMF_BONUS_POINT.external_date field */
    if(!nonNullOnly || (ExternalDate != null))  _ExternalDateSet = flag;
  /** CMF_BONUS_POINT.external_trans_msg field */
    if(!nonNullOnly || (ExternalTransMsg != null))  _ExternalTransMsgSet = flag;
  /** CMF_BONUS_POINT.external_trans_info field */
    if(!nonNullOnly || (ExternalTransInfo != null))  _ExternalTransInfoSet = flag;
  }
}
