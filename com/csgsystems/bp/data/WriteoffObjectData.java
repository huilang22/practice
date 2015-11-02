/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: WriteoffObjectData.java
 * Definition File: Customer/Writeoff.xml
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
  
/** WriteoffObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class WriteoffObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public WriteoffObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** JNL_WRITEOFF_JOIN.micr_bank_id field */
  public    String MicrBankId  = null;
  protected boolean _MicrBankIdSet = false;
  /** JNL_WRITEOFF.writeoff_type_code field */
  public    Integer WriteoffTypeCode  = null;
  protected boolean _WriteoffTypeCodeSet = false;
  /** JNL_WRITEOFF.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** JNL_WRITEOFF.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** JNL_WRITEOFF.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** JNL_WRITEOFF.charge_date field */
  public    Date ChargeDate  = null;
  protected boolean _ChargeDateSet = false;
  /** JNL_WRITEOFF.tax_class field */
  public    Integer TaxClass  = null;
  protected boolean _TaxClassSet = false;
  /** JNL_WRITEOFF.tax_date field */
  public    Date TaxDate  = null;
  protected boolean _TaxDateSet = false;
  /** JNL_WRITEOFF.writeoff_trans_date field */
  public    Date WriteoffTransDate  = null;
  protected boolean _WriteoffTransDateSet = false;
  /** JNL_WRITEOFF.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** JNL_WRITEOFF.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** JNL_WRITEOFF.bmf_source_type field */
  public    Integer BmfSourceType  = null;
  protected boolean _BmfSourceTypeSet = false;
  /** JNL_WRITEOFF.bmf_tracking_id field */
  public    Integer BmfTrackingId  = null;
  protected boolean _BmfTrackingIdSet = false;
  /** JNL_WRITEOFF.bmf_tracking_id_serv field */
  public    Integer BmfTrackingIdServ  = null;
  protected boolean _BmfTrackingIdServSet = false;
  /** JNL_WRITEOFF.orig_tracking_id field */
  public    Integer OrigTrackingId  = null;
  protected boolean _OrigTrackingIdSet = false;
  /** JNL_WRITEOFF.orig_tracking_id_serv field */
  public    Integer OrigTrackingIdServ  = null;
  protected boolean _OrigTrackingIdServSet = false;
  private String _objName = "WriteoffObjectData";
  /** Default constructor */
  public WriteoffObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public WriteoffObjectData (WriteoffObjectData other)
  {

    if (other == null) return;
    this.Key = new WriteoffObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.MicrBankId = other.MicrBankId;
    this._MicrBankIdSet = other._MicrBankIdSet;
    this.WriteoffTypeCode = other.WriteoffTypeCode;
    this._WriteoffTypeCodeSet = other._WriteoffTypeCodeSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.ChargeDate = other.ChargeDate;
    this._ChargeDateSet = other._ChargeDateSet;
    this.TaxClass = other.TaxClass;
    this._TaxClassSet = other._TaxClassSet;
    this.TaxDate = other.TaxDate;
    this._TaxDateSet = other._TaxDateSet;
    this.WriteoffTransDate = other.WriteoffTransDate;
    this._WriteoffTransDateSet = other._WriteoffTransDateSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.BmfSourceType = other.BmfSourceType;
    this._BmfSourceTypeSet = other._BmfSourceTypeSet;
    this.BmfTrackingId = other.BmfTrackingId;
    this._BmfTrackingIdSet = other._BmfTrackingIdSet;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this._BmfTrackingIdServSet = other._BmfTrackingIdServSet;
    this.OrigTrackingId = other.OrigTrackingId;
    this._OrigTrackingIdSet = other._OrigTrackingIdSet;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this._OrigTrackingIdServSet = other._OrigTrackingIdServSet;
  }

  /** get the Key for this object
   * @return WriteoffObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public WriteoffObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (WriteoffObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (JNL_WRITEOFF.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new WriteoffObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (JNL_WRITEOFF.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (JNL_WRITEOFF.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (JNL_WRITEOFF.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (JNL_WRITEOFF.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new WriteoffObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (JNL_WRITEOFF.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (JNL_WRITEOFF.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (JNL_WRITEOFF.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** set the fields value: OpenItemId (JNL_WRITEOFF.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
    if (this.Key == null) this.Key = new WriteoffObjectKeyData ();
    this.Key.OpenItemId = value;
    this.Key._OpenItemIdSet = true;
  }
  /** get the value of the field: OpenItemId (JNL_WRITEOFF.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    if (this.Key == null) return null;
    return this.Key.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (JNL_WRITEOFF.open_item_id)
   */
  public void unsetOpenItemId () {
    if (this.Key == null) return;
    this.Key._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (JNL_WRITEOFF.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    if (this.Key == null) return false;
    return this.Key._OpenItemIdSet;
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
  /** set the fields value: MicrBankId (JNL_WRITEOFF_JOIN.micr_bank_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MicrBankId") 
  public void setMicrBankId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MicrBankId", "setMicrBankId");
    }
    this.MicrBankId = value;
    this._MicrBankIdSet = true;
  }

  /** Retrieves the MicrBankId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MicrBankId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrBankId field
   */
   public String getMicrBankIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrBankIdAsFormattedString");
       return fmtMgr.formatString(this.getMicrBankId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrBankId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrBankIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MicrBankId field from a formatted string
   *
   * @param _value the MicrBankId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MicrBankId field
   */
   public void setMicrBankIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMicrBankId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrBankId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrBankIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrBankIdFromFormattedString");
   }

  /** get the value of the field: MicrBankId (JNL_WRITEOFF_JOIN.micr_bank_id)
   * @return String the value
   */
  public String getMicrBankId () {
    return this.MicrBankId;
  }
  /** Change the field to not being actively set: MicrBankId (JNL_WRITEOFF_JOIN.micr_bank_id)
   */
  public void unsetMicrBankId () {
    this._MicrBankIdSet = false;
  }
  /** See if the field is actively set: MicrBankId (JNL_WRITEOFF_JOIN.micr_bank_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMicrBankId () {
    return this._MicrBankIdSet;
  }
  /** set the fields value: WriteoffTypeCode (JNL_WRITEOFF.writeoff_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("WriteoffTypeCode") 
  public void setWriteoffTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "WriteoffTypeCode", "setWriteoffTypeCode");
    }
    this.WriteoffTypeCode = value;
    this._WriteoffTypeCodeSet = true;
  }

  /** Retrieves the WriteoffTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The WriteoffTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WriteoffTypeCode field
   */
   public String getWriteoffTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getWriteoffTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WriteoffTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getWriteoffTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the WriteoffTypeCode field from a formatted string
   *
   * @param _value the WriteoffTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the WriteoffTypeCode field
   */
   public void setWriteoffTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setWriteoffTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WriteoffTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setWriteoffTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWriteoffTypeCodeFromFormattedString");
   }

  /** get the value of the field: WriteoffTypeCode (JNL_WRITEOFF.writeoff_type_code)
   * @return Integer the value
   */
  public Integer getWriteoffTypeCode () {
    return this.WriteoffTypeCode;
  }
  /** Change the field to not being actively set: WriteoffTypeCode (JNL_WRITEOFF.writeoff_type_code)
   */
  public void unsetWriteoffTypeCode () {
    this._WriteoffTypeCodeSet = false;
  }
  /** See if the field is actively set: WriteoffTypeCode (JNL_WRITEOFF.writeoff_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetWriteoffTypeCode () {
    return this._WriteoffTypeCodeSet;
  }
  /** set the fields value: AccountInternalId (JNL_WRITEOFF.account_no)
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

  /** get the value of the field: AccountInternalId (JNL_WRITEOFF.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (JNL_WRITEOFF.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (JNL_WRITEOFF.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: BillRefNo (JNL_WRITEOFF.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo") 
  public void setBillRefNo (Integer value) throws ServiceException
  {
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

  /** get the value of the field: BillRefNo (JNL_WRITEOFF.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (JNL_WRITEOFF.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (JNL_WRITEOFF.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (JNL_WRITEOFF.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets") 
  public void setBillRefResets (Integer value) throws ServiceException
  {
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

  /** get the value of the field: BillRefResets (JNL_WRITEOFF.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (JNL_WRITEOFF.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (JNL_WRITEOFF.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: ChargeDate (JNL_WRITEOFF.charge_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeDate") 
  public void setChargeDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeDate", "setChargeDate");
    }
    this.ChargeDate = value;
    this._ChargeDateSet = true;
  }

  /** Retrieves the ChargeDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChargeDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeDate field
   */
   public String getChargeDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDateAsFormattedString");
       return fmtMgr.formatDate(this.getChargeDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChargeDate field from a formatted string
   *
   * @param _value the ChargeDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeDate field
   */
   public void setChargeDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChargeDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeDateFromFormattedString");
   }

  /**
   * Retrieves the ChargeDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeDate field
   */
  public String getChargeDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChargeDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeDate field value from a formatted date/time string
   *
   * @param _value the ChargeDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeDate field
   */
  public void setChargeDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChargeDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChargeDate (JNL_WRITEOFF.charge_date)
   * @return Date the value
   */
  public Date getChargeDate () {
    return this.ChargeDate;
  }
  /** Change the field to not being actively set: ChargeDate (JNL_WRITEOFF.charge_date)
   */
  public void unsetChargeDate () {
    this._ChargeDateSet = false;
  }
  /** See if the field is actively set: ChargeDate (JNL_WRITEOFF.charge_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeDate () {
    return this._ChargeDateSet;
  }
  /** set the fields value: TaxClass (JNL_WRITEOFF.tax_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxClass") 
  public void setTaxClass (Integer value) throws ServiceException
  {
    this.TaxClass = value;
    this._TaxClassSet = true;
  }

  /** Retrieves the TaxClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxClass field
   */
   public String getTaxClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxClassAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxClass field from a formatted string
   *
   * @param _value the TaxClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxClass field
   */
   public void setTaxClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxClassFromFormattedString");
   }

  /** get the value of the field: TaxClass (JNL_WRITEOFF.tax_class)
   * @return Integer the value
   */
  public Integer getTaxClass () {
    return this.TaxClass;
  }
  /** Change the field to not being actively set: TaxClass (JNL_WRITEOFF.tax_class)
   */
  public void unsetTaxClass () {
    this._TaxClassSet = false;
  }
  /** See if the field is actively set: TaxClass (JNL_WRITEOFF.tax_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxClass () {
    return this._TaxClassSet;
  }
  /** set the fields value: TaxDate (JNL_WRITEOFF.tax_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxDate") 
  public void setTaxDate (Date value) throws ServiceException
  {
    this.TaxDate = value;
    this._TaxDateSet = true;
  }

  /** Retrieves the TaxDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxDate field
   */
   public String getTaxDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxDateAsFormattedString");
       return fmtMgr.formatDate(this.getTaxDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxDate field from a formatted string
   *
   * @param _value the TaxDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxDate field
   */
   public void setTaxDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxDateFromFormattedString");
   }

  /**
   * Retrieves the TaxDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxDate field
   */
  public String getTaxDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTaxDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxDate field value from a formatted date/time string
   *
   * @param _value the TaxDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxDate field
   */
  public void setTaxDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTaxDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TaxDate (JNL_WRITEOFF.tax_date)
   * @return Date the value
   */
  public Date getTaxDate () {
    return this.TaxDate;
  }
  /** Change the field to not being actively set: TaxDate (JNL_WRITEOFF.tax_date)
   */
  public void unsetTaxDate () {
    this._TaxDateSet = false;
  }
  /** See if the field is actively set: TaxDate (JNL_WRITEOFF.tax_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxDate () {
    return this._TaxDateSet;
  }
  /** set the fields value: WriteoffTransDate (JNL_WRITEOFF.writeoff_trans_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("WriteoffTransDate") 
  public void setWriteoffTransDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "WriteoffTransDate", "setWriteoffTransDate");
    }
    this.WriteoffTransDate = value;
    this._WriteoffTransDateSet = true;
  }

  /** Retrieves the WriteoffTransDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The WriteoffTransDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WriteoffTransDate field
   */
   public String getWriteoffTransDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffTransDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffTransDateAsFormattedString");
       return fmtMgr.formatDate(this.getWriteoffTransDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WriteoffTransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getWriteoffTransDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the WriteoffTransDate field from a formatted string
   *
   * @param _value the WriteoffTransDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the WriteoffTransDate field
   */
   public void setWriteoffTransDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffTransDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setWriteoffTransDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WriteoffTransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setWriteoffTransDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWriteoffTransDateFromFormattedString");
   }

  /**
   * Retrieves the WriteoffTransDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The WriteoffTransDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the WriteoffTransDate field
   */
  public String getWriteoffTransDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWriteoffTransDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWriteoffTransDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getWriteoffTransDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WriteoffTransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getWriteoffTransDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the WriteoffTransDate field value from a formatted date/time string
   *
   * @param _value the WriteoffTransDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the WriteoffTransDate field
   */
  public void setWriteoffTransDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setWriteoffTransDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setWriteoffTransDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WriteoffTransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setWriteoffTransDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: WriteoffTransDate (JNL_WRITEOFF.writeoff_trans_date)
   * @return Date the value
   */
  public Date getWriteoffTransDate () {
    return this.WriteoffTransDate;
  }
  /** Change the field to not being actively set: WriteoffTransDate (JNL_WRITEOFF.writeoff_trans_date)
   */
  public void unsetWriteoffTransDate () {
    this._WriteoffTransDateSet = false;
  }
  /** See if the field is actively set: WriteoffTransDate (JNL_WRITEOFF.writeoff_trans_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetWriteoffTransDate () {
    return this._WriteoffTransDateSet;
  }
  /** set the fields value: CurrencyCode (JNL_WRITEOFF.currency_code)
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

  /** get the value of the field: CurrencyCode (JNL_WRITEOFF.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (JNL_WRITEOFF.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (JNL_WRITEOFF.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: Amount (JNL_WRITEOFF.amount)
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

  /** get the value of the field: Amount (JNL_WRITEOFF.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (JNL_WRITEOFF.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (JNL_WRITEOFF.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: BmfSourceType (JNL_WRITEOFF.bmf_source_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfSourceType") 
  public void setBmfSourceType (Integer value) throws ServiceException
  {
    this.BmfSourceType = value;
    this._BmfSourceTypeSet = true;
  }

  /** Retrieves the BmfSourceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfSourceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfSourceType field
   */
   public String getBmfSourceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfSourceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfSourceTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfSourceType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfSourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfSourceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfSourceType field from a formatted string
   *
   * @param _value the BmfSourceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfSourceType field
   */
   public void setBmfSourceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfSourceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfSourceType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfSourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfSourceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfSourceTypeFromFormattedString");
   }

  /** get the value of the field: BmfSourceType (JNL_WRITEOFF.bmf_source_type)
   * @return Integer the value
   */
  public Integer getBmfSourceType () {
    return this.BmfSourceType;
  }
  /** Change the field to not being actively set: BmfSourceType (JNL_WRITEOFF.bmf_source_type)
   */
  public void unsetBmfSourceType () {
    this._BmfSourceTypeSet = false;
  }
  /** See if the field is actively set: BmfSourceType (JNL_WRITEOFF.bmf_source_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfSourceType () {
    return this._BmfSourceTypeSet;
  }
  /** set the fields value: BmfTrackingId (JNL_WRITEOFF.bmf_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingId") 
  public void setBmfTrackingId (Integer value) throws ServiceException
  {
    this.BmfTrackingId = value;
    this._BmfTrackingIdSet = true;
  }

  /** Retrieves the BmfTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingId field
   */
   public String getBmfTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingId field from a formatted string
   *
   * @param _value the BmfTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingId field
   */
   public void setBmfTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFromFormattedString");
   }

  /** get the value of the field: BmfTrackingId (JNL_WRITEOFF.bmf_tracking_id)
   * @return Integer the value
   */
  public Integer getBmfTrackingId () {
    return this.BmfTrackingId;
  }
  /** Change the field to not being actively set: BmfTrackingId (JNL_WRITEOFF.bmf_tracking_id)
   */
  public void unsetBmfTrackingId () {
    this._BmfTrackingIdSet = false;
  }
  /** See if the field is actively set: BmfTrackingId (JNL_WRITEOFF.bmf_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingId () {
    return this._BmfTrackingIdSet;
  }
  /** set the fields value: BmfTrackingIdServ (JNL_WRITEOFF.bmf_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingIdServ") 
  public void setBmfTrackingIdServ (Integer value) throws ServiceException
  {
    this.BmfTrackingIdServ = value;
    this._BmfTrackingIdServSet = true;
  }

  /** Retrieves the BmfTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServ field
   */
   public String getBmfTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingIdServ field from a formatted string
   *
   * @param _value the BmfTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingIdServ field
   */
   public void setBmfTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFromFormattedString");
   }

  /** get the value of the field: BmfTrackingIdServ (JNL_WRITEOFF.bmf_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBmfTrackingIdServ () {
    return this.BmfTrackingIdServ;
  }
  /** Change the field to not being actively set: BmfTrackingIdServ (JNL_WRITEOFF.bmf_tracking_id_serv)
   */
  public void unsetBmfTrackingIdServ () {
    this._BmfTrackingIdServSet = false;
  }
  /** See if the field is actively set: BmfTrackingIdServ (JNL_WRITEOFF.bmf_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingIdServ () {
    return this._BmfTrackingIdServSet;
  }
  /** set the fields value: OrigTrackingId (JNL_WRITEOFF.orig_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTrackingId") 
  public void setOrigTrackingId (Integer value) throws ServiceException
  {
    this.OrigTrackingId = value;
    this._OrigTrackingIdSet = true;
  }

  /** Retrieves the OrigTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingId field
   */
   public String getOrigTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTrackingId field from a formatted string
   *
   * @param _value the OrigTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingId field
   */
   public void setOrigTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdFromFormattedString");
   }

  /** get the value of the field: OrigTrackingId (JNL_WRITEOFF.orig_tracking_id)
   * @return Integer the value
   */
  public Integer getOrigTrackingId () {
    return this.OrigTrackingId;
  }
  /** Change the field to not being actively set: OrigTrackingId (JNL_WRITEOFF.orig_tracking_id)
   */
  public void unsetOrigTrackingId () {
    this._OrigTrackingIdSet = false;
  }
  /** See if the field is actively set: OrigTrackingId (JNL_WRITEOFF.orig_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingId () {
    return this._OrigTrackingIdSet;
  }
  /** set the fields value: OrigTrackingIdServ (JNL_WRITEOFF.orig_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTrackingIdServ") 
  public void setOrigTrackingIdServ (Integer value) throws ServiceException
  {
    this.OrigTrackingIdServ = value;
    this._OrigTrackingIdServSet = true;
  }

  /** Retrieves the OrigTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingIdServ field
   */
   public String getOrigTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTrackingIdServ field from a formatted string
   *
   * @param _value the OrigTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingIdServ field
   */
   public void setOrigTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdServFromFormattedString");
   }

  /** get the value of the field: OrigTrackingIdServ (JNL_WRITEOFF.orig_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getOrigTrackingIdServ () {
    return this.OrigTrackingIdServ;
  }
  /** Change the field to not being actively set: OrigTrackingIdServ (JNL_WRITEOFF.orig_tracking_id_serv)
   */
  public void unsetOrigTrackingIdServ () {
    this._OrigTrackingIdServSet = false;
  }
  /** See if the field is actively set: OrigTrackingIdServ (JNL_WRITEOFF.orig_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingIdServ () {
    return this._OrigTrackingIdServSet;
  }
  public String toString() {
    return WriteoffObjectHelper.toMap(this, null).toString();
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
  /** JNL_WRITEOFF_JOIN.micr_bank_id field */
    if(!nonNullOnly || (MicrBankId != null))  _MicrBankIdSet = flag;
  /** JNL_WRITEOFF.writeoff_type_code field */
    if(!nonNullOnly || (WriteoffTypeCode != null))  _WriteoffTypeCodeSet = flag;
  /** JNL_WRITEOFF.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** JNL_WRITEOFF.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** JNL_WRITEOFF.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** JNL_WRITEOFF.charge_date field */
    if(!nonNullOnly || (ChargeDate != null))  _ChargeDateSet = flag;
  /** JNL_WRITEOFF.tax_class field */
    if(!nonNullOnly || (TaxClass != null))  _TaxClassSet = flag;
  /** JNL_WRITEOFF.tax_date field */
    if(!nonNullOnly || (TaxDate != null))  _TaxDateSet = flag;
  /** JNL_WRITEOFF.writeoff_trans_date field */
    if(!nonNullOnly || (WriteoffTransDate != null))  _WriteoffTransDateSet = flag;
  /** JNL_WRITEOFF.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** JNL_WRITEOFF.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** JNL_WRITEOFF.bmf_source_type field */
    if(!nonNullOnly || (BmfSourceType != null))  _BmfSourceTypeSet = flag;
  /** JNL_WRITEOFF.bmf_tracking_id field */
    if(!nonNullOnly || (BmfTrackingId != null))  _BmfTrackingIdSet = flag;
  /** JNL_WRITEOFF.bmf_tracking_id_serv field */
    if(!nonNullOnly || (BmfTrackingIdServ != null))  _BmfTrackingIdServSet = flag;
  /** JNL_WRITEOFF.orig_tracking_id field */
    if(!nonNullOnly || (OrigTrackingId != null))  _OrigTrackingIdSet = flag;
  /** JNL_WRITEOFF.orig_tracking_id_serv field */
    if(!nonNullOnly || (OrigTrackingIdServ != null))  _OrigTrackingIdServSet = flag;
  }
}
