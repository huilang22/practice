/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBalancesObjectData.java
 * Definition File: Customer/AccountBalances.xml
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
  
/** AccountBalancesObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountBalancesObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AccountBalancesObjectKeyData Key = null;
  /** ACCOUNT_BALANCES.balance_account_no field */
  public    Integer BalanceAccountInternalId  = null;
  protected boolean _BalanceAccountInternalIdSet = false;
  /** ACCOUNT_BALANCES.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** ACCOUNT_BALANCES.is_balance_prepaid field */
  public    Integer IsBalancePrepaid  = null;
  protected boolean _IsBalancePrepaidSet = false;
  /** ACCOUNT_BALANCES.authorization_flag field */
  public    Integer AuthorizationFlag  = null;
  protected boolean _AuthorizationFlagSet = false;
  /** ACCOUNT_BALANCES.regulatory_id field */
  public    Integer RegulatoryId  = null;
  protected boolean _RegulatoryIdSet = false;
  /** ACCOUNT_BALANCES.priority field */
  public    Integer Priority  = null;
  protected boolean _PrioritySet = false;
  /** ACCOUNT_BALANCES.balance_desc field */
  public    String BalanceDesc  = null;
  protected boolean _BalanceDescSet = false;
  /** ACCOUNT_BALANCES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  /** ACCOUNT_BALANCES.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** ACCOUNT_BALANCES.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** ACCOUNT_BALANCES.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** ACCOUNT_BALANCES.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** ACCOUNT_BALANCES.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String BalanceAccountExternalId  = null;
  protected boolean _BalanceAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer BalanceAccountExternalIdType  = null;
  protected boolean _BalanceAccountExternalIdTypeSet = false;
  private String _objName = "AccountBalancesObjectData";
  /** Default constructor */
  public AccountBalancesObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountBalancesObjectData (AccountBalancesObjectData other)
  {

    if (other == null) return;
    this.Key = new AccountBalancesObjectKeyData (other.Key);
    this.BalanceAccountInternalId = other.BalanceAccountInternalId;
    this._BalanceAccountInternalIdSet = other._BalanceAccountInternalIdSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.IsBalancePrepaid = other.IsBalancePrepaid;
    this._IsBalancePrepaidSet = other._IsBalancePrepaidSet;
    this.AuthorizationFlag = other.AuthorizationFlag;
    this._AuthorizationFlagSet = other._AuthorizationFlagSet;
    this.RegulatoryId = other.RegulatoryId;
    this._RegulatoryIdSet = other._RegulatoryIdSet;
    this.Priority = other.Priority;
    this._PrioritySet = other._PrioritySet;
    this.BalanceDesc = other.BalanceDesc;
    this._BalanceDescSet = other._BalanceDescSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.BalanceAccountExternalId = other.BalanceAccountExternalId;
    this._BalanceAccountExternalIdSet = other._BalanceAccountExternalIdSet;
    this.BalanceAccountExternalIdType = other.BalanceAccountExternalIdType;
    this._BalanceAccountExternalIdTypeSet = other._BalanceAccountExternalIdTypeSet;
  }

  /** get the Key for this object
   * @return AccountBalancesObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AccountBalancesObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AccountBalancesObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBalanceTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceTrackingId", "setBalanceTrackingId");
    }
    if (this.Key == null) this.Key = new AccountBalancesObjectKeyData ();
    this.Key.BalanceTrackingId = value;
    this.Key._BalanceTrackingIdSet = true;
  }
  /** get the value of the field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return Integer the value
   */
  public Integer getBalanceTrackingId () {
    if (this.Key == null) return null;
    return this.Key.BalanceTrackingId;
  }
  /** Change the field to not being actively set: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   */
  public void unsetBalanceTrackingId () {
    if (this.Key == null) return;
    this.Key._BalanceTrackingIdSet = false;
  }
  /** See if the field is actively set: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceTrackingId () {
    if (this.Key == null) return false;
    return this.Key._BalanceTrackingIdSet;
  }

  /** Retrieves the BalanceTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTrackingId field
   */
   public String getBalanceTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceTrackingId field from a formatted string
   *
   * @param _value the BalanceTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceTrackingId field
   */
   public void setBalanceTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTrackingIdFromFormattedString");
   }

  /** set the fields value: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBalanceTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceTrackingIdServ", "setBalanceTrackingIdServ");
    }
    if (this.Key == null) this.Key = new AccountBalancesObjectKeyData ();
    this.Key.BalanceTrackingIdServ = value;
    this.Key._BalanceTrackingIdServSet = true;
  }
  /** get the value of the field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBalanceTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.BalanceTrackingIdServ;
  }
  /** Change the field to not being actively set: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   */
  public void unsetBalanceTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._BalanceTrackingIdServSet = false;
  }
  /** See if the field is actively set: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._BalanceTrackingIdServSet;
  }

  /** Retrieves the BalanceTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTrackingIdServ field
   */
   public String getBalanceTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceTrackingIdServ field from a formatted string
   *
   * @param _value the BalanceTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceTrackingIdServ field
   */
   public void setBalanceTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTrackingIdServFromFormattedString");
   }

  /** set the fields value: BalanceAccountInternalId (ACCOUNT_BALANCES.balance_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceAccountInternalId") 
  public void setBalanceAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceAccountInternalId", "setBalanceAccountInternalId");
    }
    this.BalanceAccountInternalId = value;
    this._BalanceAccountInternalIdSet = true;
  }

  /** Retrieves the BalanceAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceAccountInternalId field
   */
   public String getBalanceAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceAccountInternalId field from a formatted string
   *
   * @param _value the BalanceAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceAccountInternalId field
   */
   public void setBalanceAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: BalanceAccountInternalId (ACCOUNT_BALANCES.balance_account_no)
   * @return Integer the value
   */
  public Integer getBalanceAccountInternalId () {
    return this.BalanceAccountInternalId;
  }
  /** Change the field to not being actively set: BalanceAccountInternalId (ACCOUNT_BALANCES.balance_account_no)
   */
  public void unsetBalanceAccountInternalId () {
    this._BalanceAccountInternalIdSet = false;
  }
  /** See if the field is actively set: BalanceAccountInternalId (ACCOUNT_BALANCES.balance_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceAccountInternalId () {
    return this._BalanceAccountInternalIdSet;
  }
  /** set the fields value: OpenItemId (ACCOUNT_BALANCES.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    this.OpenItemId = value;
    this._OpenItemIdSet = true;
  }

  /** Retrieves the OpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemId field
   */
   public String getOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OpenItemId field from a formatted string
   *
   * @param _value the OpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OpenItemId field
   */
   public void setOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */

  public String getOpenItemIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOpenItemId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */
  public Enumeration getOpenItemIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("OpenItem", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OpenItemId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOpenItemIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      this.setOpenItemId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
  }

  /** get the value of the field: OpenItemId (ACCOUNT_BALANCES.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (ACCOUNT_BALANCES.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (ACCOUNT_BALANCES.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: IsBalancePrepaid (ACCOUNT_BALANCES.is_balance_prepaid)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsBalancePrepaid") 
  public void setIsBalancePrepaid (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsBalancePrepaid", "setIsBalancePrepaid");
    }
    this.IsBalancePrepaid = value;
    this._IsBalancePrepaidSet = true;
  }

  /** Retrieves the IsBalancePrepaid field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsBalancePrepaid field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsBalancePrepaid field
   */
   public String getIsBalancePrepaidAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsBalancePrepaidAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsBalancePrepaidAsFormattedString");
       return fmtMgr.formatNumber(this.getIsBalancePrepaid(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsBalancePrepaid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsBalancePrepaidAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsBalancePrepaid field from a formatted string
   *
   * @param _value the IsBalancePrepaid field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsBalancePrepaid field
   */
   public void setIsBalancePrepaidFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsBalancePrepaidFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsBalancePrepaid(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsBalancePrepaid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsBalancePrepaidFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsBalancePrepaidFromFormattedString");
   }

  /** get the value of the field: IsBalancePrepaid (ACCOUNT_BALANCES.is_balance_prepaid)
   * @return Integer the value
   */
  public Integer getIsBalancePrepaid () {
    return this.IsBalancePrepaid;
  }
  /** Change the field to not being actively set: IsBalancePrepaid (ACCOUNT_BALANCES.is_balance_prepaid)
   */
  public void unsetIsBalancePrepaid () {
    this._IsBalancePrepaidSet = false;
  }
  /** See if the field is actively set: IsBalancePrepaid (ACCOUNT_BALANCES.is_balance_prepaid)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsBalancePrepaid () {
    return this._IsBalancePrepaidSet;
  }
  /** set the fields value: AuthorizationFlag (ACCOUNT_BALANCES.authorization_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AuthorizationFlag") 
  public void setAuthorizationFlag (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AuthorizationFlag", "setAuthorizationFlag");
    }
    this.AuthorizationFlag = value;
    this._AuthorizationFlagSet = true;
  }

  /** Retrieves the AuthorizationFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AuthorizationFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AuthorizationFlag field
   */
   public String getAuthorizationFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuthorizationFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAuthorizationFlagAsFormattedString");
       return fmtMgr.formatNumber(this.getAuthorizationFlag(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuthorizationFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAuthorizationFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the AuthorizationFlag field from a formatted string
   *
   * @param _value the AuthorizationFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AuthorizationFlag field
   */
   public void setAuthorizationFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuthorizationFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAuthorizationFlag(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuthorizationFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAuthorizationFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAuthorizationFlagFromFormattedString");
   }

  /** get the value of the field: AuthorizationFlag (ACCOUNT_BALANCES.authorization_flag)
   * @return Integer the value
   */
  public Integer getAuthorizationFlag () {
    return this.AuthorizationFlag;
  }
  /** Change the field to not being actively set: AuthorizationFlag (ACCOUNT_BALANCES.authorization_flag)
   */
  public void unsetAuthorizationFlag () {
    this._AuthorizationFlagSet = false;
  }
  /** See if the field is actively set: AuthorizationFlag (ACCOUNT_BALANCES.authorization_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetAuthorizationFlag () {
    return this._AuthorizationFlagSet;
  }
  /** set the fields value: RegulatoryId (ACCOUNT_BALANCES.regulatory_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RegulatoryId") 
  public void setRegulatoryId (Integer value) throws ServiceException
  {
    this.RegulatoryId = value;
    this._RegulatoryIdSet = true;
  }

  /** Retrieves the RegulatoryId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RegulatoryId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RegulatoryId field
   */
   public String getRegulatoryIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdAsFormattedString");
       return fmtMgr.formatNumber(this.getRegulatoryId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RegulatoryId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RegulatoryId field from a formatted string
   *
   * @param _value the RegulatoryId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RegulatoryId field
   */
   public void setRegulatoryIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRegulatoryId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RegulatoryId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRegulatoryIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRegulatoryIdFromFormattedString");
   }

  /** get the value of the field: RegulatoryId (ACCOUNT_BALANCES.regulatory_id)
   * @return Integer the value
   */
  public Integer getRegulatoryId () {
    return this.RegulatoryId;
  }
  /** Change the field to not being actively set: RegulatoryId (ACCOUNT_BALANCES.regulatory_id)
   */
  public void unsetRegulatoryId () {
    this._RegulatoryIdSet = false;
  }
  /** See if the field is actively set: RegulatoryId (ACCOUNT_BALANCES.regulatory_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRegulatoryId () {
    return this._RegulatoryIdSet;
  }
  /** set the fields value: Priority (ACCOUNT_BALANCES.priority)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Priority") 
  public void setPriority (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Priority", "setPriority");
    }
    this.Priority = value;
    this._PrioritySet = true;
  }

  /** Retrieves the Priority field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Priority field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Priority field
   */
   public String getPriorityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPriorityAsFormattedString");
       return fmtMgr.formatNumber(this.getPriority(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPriorityAsFormattedString");
       throw x;
     }
   }
  /** Sets the Priority field from a formatted string
   *
   * @param _value the Priority field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Priority field
   */
   public void setPriorityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPriority(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPriorityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPriorityFromFormattedString");
   }

  /** get the value of the field: Priority (ACCOUNT_BALANCES.priority)
   * @return Integer the value
   */
  public Integer getPriority () {
    return this.Priority;
  }
  /** Change the field to not being actively set: Priority (ACCOUNT_BALANCES.priority)
   */
  public void unsetPriority () {
    this._PrioritySet = false;
  }
  /** See if the field is actively set: Priority (ACCOUNT_BALANCES.priority)
   * @return boolean whether the field is actively set
   */
  public boolean issetPriority () {
    return this._PrioritySet;
  }
  /** set the fields value: BalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceDesc") 
  public void setBalanceDesc (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 85))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BalanceDesc", "setBalanceDesc");
    }
    this.BalanceDesc = value;
    this._BalanceDescSet = true;
  }

  /** Retrieves the BalanceDesc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceDesc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceDesc field
   */
   public String getBalanceDescAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDescAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceDescAsFormattedString");
       return fmtMgr.formatString(this.getBalanceDesc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceDescAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceDesc field from a formatted string
   *
   * @param _value the BalanceDesc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceDesc field
   */
   public void setBalanceDescFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDescFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceDesc(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceDescFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceDescFromFormattedString");
   }

  /** get the value of the field: BalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return String the value
   */
  public String getBalanceDesc () {
    return this.BalanceDesc;
  }
  /** Change the field to not being actively set: BalanceDesc (ACCOUNT_BALANCES.balance_desc)
   */
  public void unsetBalanceDesc () {
    this._BalanceDescSet = false;
  }
  /** See if the field is actively set: BalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceDesc () {
    return this._BalanceDescSet;
  }
  /** set the fields value: LanguageCode (ACCOUNT_BALANCES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LanguageCode") 
  public void setLanguageCode (Integer value) throws ServiceException
  {
    this.LanguageCode = value;
    this._LanguageCodeSet = true;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */

  public String getLanguageCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getLanguageCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */
  public Enumeration getLanguageCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("LanguageCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated LanguageCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setLanguageCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      this.setLanguageCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
  }

  /** get the value of the field: LanguageCode (ACCOUNT_BALANCES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (ACCOUNT_BALANCES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (ACCOUNT_BALANCES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  /** set the fields value: CreateDt (ACCOUNT_BALANCES.create_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreateDt") 
  public void setCreateDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreateDt", "setCreateDt");
    }
    this.CreateDt = value;
    this._CreateDtSet = true;
  }

  /** Retrieves the CreateDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreateDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
   public String getCreateDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedString");
       return fmtMgr.formatDate(this.getCreateDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreateDt field from a formatted string
   *
   * @param _value the CreateDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
   public void setCreateDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreateDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFromFormattedString");
   }

  /**
   * Retrieves the CreateDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
  public String getCreateDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCreateDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDt field value from a formatted date/time string
   *
   * @param _value the CreateDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
  public void setCreateDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCreateDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CreateDt (ACCOUNT_BALANCES.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (ACCOUNT_BALANCES.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (ACCOUNT_BALANCES.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: ActiveDt (ACCOUNT_BALANCES.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDt") 
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    this.ActiveDt = value;
    this._ActiveDtSet = true;
  }

  /** Retrieves the ActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
   public String getActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDt field from a formatted string
   *
   * @param _value the ActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
   public void setActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFromFormattedString");
   }

  /**
   * Retrieves the ActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
  public String getActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDt field value from a formatted date/time string
   *
   * @param _value the ActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
  public void setActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDt (ACCOUNT_BALANCES.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (ACCOUNT_BALANCES.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (ACCOUNT_BALANCES.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (ACCOUNT_BALANCES.inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDt") 
  public void setInactiveDt (Date value) throws ServiceException
  {
    this.InactiveDt = value;
    this._InactiveDtSet = true;
  }

  /** Retrieves the InactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
   public String getInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDt field from a formatted string
   *
   * @param _value the InactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
   public void setInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the InactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
  public String getInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDt field value from a formatted date/time string
   *
   * @param _value the InactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
  public void setInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDt (ACCOUNT_BALANCES.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (ACCOUNT_BALANCES.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (ACCOUNT_BALANCES.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: ChgDt (ACCOUNT_BALANCES.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (ACCOUNT_BALANCES.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (ACCOUNT_BALANCES.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (ACCOUNT_BALANCES.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (ACCOUNT_BALANCES.chg_who)
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

  /** get the value of the field: ChgWho (ACCOUNT_BALANCES.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (ACCOUNT_BALANCES.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (ACCOUNT_BALANCES.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: BalanceAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceAccountExternalId") 
  public void setBalanceAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceAccountExternalId", "setBalanceAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BalanceAccountExternalId", "setBalanceAccountExternalId");
    }
    this.BalanceAccountExternalId = value;
    this._BalanceAccountExternalIdSet = true;
  }

  /** Retrieves the BalanceAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceAccountExternalId field
   */
   public String getBalanceAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getBalanceAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceAccountExternalId field from a formatted string
   *
   * @param _value the BalanceAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceAccountExternalId field
   */
   public void setBalanceAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: BalanceAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getBalanceAccountExternalId () {
    return this.BalanceAccountExternalId;
  }
  /** Change the field to not being actively set: BalanceAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetBalanceAccountExternalId () {
    this._BalanceAccountExternalIdSet = false;
  }
  /** See if the field is actively set: BalanceAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceAccountExternalId () {
    return this._BalanceAccountExternalIdSet;
  }
  /** set the fields value: BalanceAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceAccountExternalIdType") 
  public void setBalanceAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceAccountExternalIdType", "setBalanceAccountExternalIdType");
    }
    this.BalanceAccountExternalIdType = value;
    this._BalanceAccountExternalIdTypeSet = true;
  }

  /** Retrieves the BalanceAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceAccountExternalIdType field
   */
   public String getBalanceAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceAccountExternalIdType field from a formatted string
   *
   * @param _value the BalanceAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceAccountExternalIdType field
   */
   public void setBalanceAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BalanceAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BalanceAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BalanceAccountExternalIdType field
   */

  public String getBalanceAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBalanceAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBalanceAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BalanceAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BalanceAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BalanceAccountExternalIdType field
   */
  public Enumeration getBalanceAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BalanceAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBalanceAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBalanceAccountExternalIdTypeEnumeration(_locale);
      this.setBalanceAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: BalanceAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getBalanceAccountExternalIdType () {
    return this.BalanceAccountExternalIdType;
  }
  /** Change the field to not being actively set: BalanceAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetBalanceAccountExternalIdType () {
    this._BalanceAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: BalanceAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceAccountExternalIdType () {
    return this._BalanceAccountExternalIdTypeSet;
  }
  public String toString() {
    return AccountBalancesObjectHelper.toMap(this, null).toString();
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
  /** ACCOUNT_BALANCES.balance_account_no field */
    if(!nonNullOnly || (BalanceAccountInternalId != null))  _BalanceAccountInternalIdSet = flag;
  /** ACCOUNT_BALANCES.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** ACCOUNT_BALANCES.is_balance_prepaid field */
    if(!nonNullOnly || (IsBalancePrepaid != null))  _IsBalancePrepaidSet = flag;
  /** ACCOUNT_BALANCES.authorization_flag field */
    if(!nonNullOnly || (AuthorizationFlag != null))  _AuthorizationFlagSet = flag;
  /** ACCOUNT_BALANCES.regulatory_id field */
    if(!nonNullOnly || (RegulatoryId != null))  _RegulatoryIdSet = flag;
  /** ACCOUNT_BALANCES.priority field */
    if(!nonNullOnly || (Priority != null))  _PrioritySet = flag;
  /** ACCOUNT_BALANCES.balance_desc field */
    if(!nonNullOnly || (BalanceDesc != null))  _BalanceDescSet = flag;
  /** ACCOUNT_BALANCES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  /** ACCOUNT_BALANCES.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** ACCOUNT_BALANCES.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** ACCOUNT_BALANCES.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** ACCOUNT_BALANCES.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** ACCOUNT_BALANCES.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (BalanceAccountExternalId != null))  _BalanceAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (BalanceAccountExternalIdType != null))  _BalanceAccountExternalIdTypeSet = flag;
  }
}
