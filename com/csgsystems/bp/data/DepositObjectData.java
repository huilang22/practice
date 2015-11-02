/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DepositObjectData.java
 * Definition File: Customer/Deposit.xml
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

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** DepositObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class DepositObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public DepositObjectKeyData Key = null;
  /** DEPOSIT.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** DEPOSIT.deposit_type field */
  public    Integer DepositType  = null;
  protected boolean _DepositTypeSet = false;
  /** DEPOSIT.date_received field */
  public    Date DateReceived  = null;
  protected boolean _DateReceivedSet = false;
  /** DEPOSIT.date_returned field */
  public    Date DateReturned  = null;
  protected boolean _DateReturnedSet = false;
  /** DEPOSIT.deposit_amount field */
  public    BigInteger DepositAmount  = null;
  protected boolean _DepositAmountSet = false;
  /** DEPOSIT.interest_amount field */
  public    BigInteger InterestAmount  = null;
  protected boolean _InterestAmountSet = false;
  /** DEPOSIT.income_tax_amount field */
  public    BigInteger IncomeTaxAmount  = null;
  protected boolean _IncomeTaxAmountSet = false;
  /** DEPOSIT.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** DEPOSIT.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** DEPOSIT.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** DEPOSIT.manual_ccauth_code field */
  public    String ManualCcauthCode  = null;
  protected boolean _ManualCcauthCodeSet = false;
  /** DEPOSIT.manual_ccauth_date field */
  public    String ManualCcauthDate  = null;
  protected boolean _ManualCcauthDateSet = false;
  /** DEPOSIT.pay_method field */
  public    Integer PayMethod  = null;
  protected boolean _PayMethodSet = false;
  /** DEPOSIT.refund_type field */
  public    Integer RefundType  = null;
  protected boolean _RefundTypeSet = false;
  /** DEPOSIT.reason_code field */
  public    Integer ReasonCode  = null;
  protected boolean _ReasonCodeSet = false;
  /** DEPOSIT.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  private String _objName = "DepositObjectData";
  /** Default constructor */
  public DepositObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public DepositObjectData (DepositObjectData other)
  {

    if (other == null) return;
    this.Key = new DepositObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.DepositType = other.DepositType;
    this._DepositTypeSet = other._DepositTypeSet;
    this.DateReceived = other.DateReceived;
    this._DateReceivedSet = other._DateReceivedSet;
    this.DateReturned = other.DateReturned;
    this._DateReturnedSet = other._DateReturnedSet;
    this.DepositAmount = other.DepositAmount;
    this._DepositAmountSet = other._DepositAmountSet;
    this.InterestAmount = other.InterestAmount;
    this._InterestAmountSet = other._InterestAmountSet;
    this.IncomeTaxAmount = other.IncomeTaxAmount;
    this._IncomeTaxAmountSet = other._IncomeTaxAmountSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.ManualCcauthCode = other.ManualCcauthCode;
    this._ManualCcauthCodeSet = other._ManualCcauthCodeSet;
    this.ManualCcauthDate = other.ManualCcauthDate;
    this._ManualCcauthDateSet = other._ManualCcauthDateSet;
    this.PayMethod = other.PayMethod;
    this._PayMethodSet = other._PayMethodSet;
    this.RefundType = other.RefundType;
    this._RefundTypeSet = other._RefundTypeSet;
    this.ReasonCode = other.ReasonCode;
    this._ReasonCodeSet = other._ReasonCodeSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
  }

  /** get the Key for this object
   * @return DepositObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public DepositObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (DepositObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (DEPOSIT.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new DepositObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (DEPOSIT.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (DEPOSIT.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (DEPOSIT.tracking_id)
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

  /** set the fields value: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new DepositObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (DEPOSIT.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (DEPOSIT.tracking_id_serv)
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

  /** set the fields value: AccountInternalId (DEPOSIT.account_no)
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

  /** get the value of the field: AccountInternalId (DEPOSIT.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (DEPOSIT.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (DEPOSIT.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: DepositType (DEPOSIT.deposit_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DepositType") 
  public void setDepositType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DepositType", "setDepositType");
    }
    this.DepositType = value;
    this._DepositTypeSet = true;
  }

  /** Retrieves the DepositType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DepositType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DepositType field
   */
   public String getDepositTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getDepositType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DepositType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDepositTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DepositType field from a formatted string
   *
   * @param _value the DepositType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DepositType field
   */
   public void setDepositTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDepositType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DepositType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDepositTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDepositTypeFromFormattedString");
   }

  /** get the value of the field: DepositType (DEPOSIT.deposit_type)
   * @return Integer the value
   */
  public Integer getDepositType () {
    return this.DepositType;
  }
  /** Change the field to not being actively set: DepositType (DEPOSIT.deposit_type)
   */
  public void unsetDepositType () {
    this._DepositTypeSet = false;
  }
  /** See if the field is actively set: DepositType (DEPOSIT.deposit_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDepositType () {
    return this._DepositTypeSet;
  }
  /** set the fields value: DateReceived (DEPOSIT.date_received)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateReceived") 
  public void setDateReceived (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DateReceived", "setDateReceived");
    }
    this.DateReceived = value;
    this._DateReceivedSet = true;
  }

  /** Retrieves the DateReceived field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateReceived field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReceived field
   */
   public String getDateReceivedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReceivedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReceivedAsFormattedString");
       return fmtMgr.formatDate(this.getDateReceived(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateReceived");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReceivedAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateReceived field from a formatted string
   *
   * @param _value the DateReceived field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateReceived field
   */
   public void setDateReceivedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReceivedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateReceived(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateReceived");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReceivedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateReceivedFromFormattedString");
   }

  /**
   * Retrieves the DateReceived field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateReceived field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReceived field
   */
  public String getDateReceivedAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReceivedAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReceivedAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateReceived(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReceived");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReceivedAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateReceived field value from a formatted date/time string
   *
   * @param _value the DateReceived field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateReceived field
   */
  public void setDateReceivedFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateReceivedFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateReceived(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReceived");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReceivedFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateReceived (DEPOSIT.date_received)
   * @return Date the value
   */
  public Date getDateReceived () {
    return this.DateReceived;
  }
  /** Change the field to not being actively set: DateReceived (DEPOSIT.date_received)
   */
  public void unsetDateReceived () {
    this._DateReceivedSet = false;
  }
  /** See if the field is actively set: DateReceived (DEPOSIT.date_received)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateReceived () {
    return this._DateReceivedSet;
  }
  /** set the fields value: DateReturned (DEPOSIT.date_returned)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateReturned") 
  public void setDateReturned (Date value) throws ServiceException
  {
    this.DateReturned = value;
    this._DateReturnedSet = true;
  }

  /** Retrieves the DateReturned field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateReturned field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReturned field
   */
   public String getDateReturnedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReturnedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReturnedAsFormattedString");
       return fmtMgr.formatDate(this.getDateReturned(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateReturned");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReturnedAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateReturned field from a formatted string
   *
   * @param _value the DateReturned field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateReturned field
   */
   public void setDateReturnedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReturnedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateReturned(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateReturned");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReturnedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateReturnedFromFormattedString");
   }

  /**
   * Retrieves the DateReturned field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateReturned field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReturned field
   */
  public String getDateReturnedAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReturnedAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReturnedAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateReturned(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReturned");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReturnedAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateReturned field value from a formatted date/time string
   *
   * @param _value the DateReturned field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateReturned field
   */
  public void setDateReturnedFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateReturnedFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateReturned(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReturned");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReturnedFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateReturned (DEPOSIT.date_returned)
   * @return Date the value
   */
  public Date getDateReturned () {
    return this.DateReturned;
  }
  /** Change the field to not being actively set: DateReturned (DEPOSIT.date_returned)
   */
  public void unsetDateReturned () {
    this._DateReturnedSet = false;
  }
  /** See if the field is actively set: DateReturned (DEPOSIT.date_returned)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateReturned () {
    return this._DateReturnedSet;
  }
  /** set the fields value: DepositAmount (DEPOSIT.deposit_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DepositAmount") 
  public void setDepositAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DepositAmount", "setDepositAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DepositAmount", "setDepositAmount");
    }
    this.DepositAmount = value;
    this._DepositAmountSet = true;
  }

  /** Retrieves the DepositAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DepositAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DepositAmount field
   */
   public String getDepositAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDepositAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DepositAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDepositAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the DepositAmount field from a formatted string
   *
   * @param _value the DepositAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DepositAmount field
   */
   public void setDepositAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDepositAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DepositAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDepositAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDepositAmountFromFormattedString");
   }

  /**
   * Retrieves the DepositAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DepositAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DepositAmount field
   */
  public String getDepositAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDepositAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDepositAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the DepositAmount field value from a formatted currency string
   *
   * @param _value the DepositAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DepositAmount field
   */
  public void setDepositAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDepositAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDepositAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDepositAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDepositAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: DepositAmount (DEPOSIT.deposit_amount)
   * @return BigInteger the value
   */
  public BigInteger getDepositAmount () {
    return this.DepositAmount;
  }
  /** Change the field to not being actively set: DepositAmount (DEPOSIT.deposit_amount)
   */
  public void unsetDepositAmount () {
    this._DepositAmountSet = false;
  }
  /** See if the field is actively set: DepositAmount (DEPOSIT.deposit_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetDepositAmount () {
    return this._DepositAmountSet;
  }
  /** set the fields value: InterestAmount (DEPOSIT.interest_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InterestAmount") 
  public void setInterestAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InterestAmount", "setInterestAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "InterestAmount", "setInterestAmount");
    }
    this.InterestAmount = value;
    this._InterestAmountSet = true;
  }

  /** Retrieves the InterestAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InterestAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterestAmount field
   */
   public String getInterestAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterestAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterestAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getInterestAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InterestAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterestAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the InterestAmount field from a formatted string
   *
   * @param _value the InterestAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InterestAmount field
   */
   public void setInterestAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterestAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInterestAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InterestAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterestAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterestAmountFromFormattedString");
   }

  /**
   * Retrieves the InterestAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InterestAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterestAmount field
   */
  public String getInterestAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterestAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterestAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getInterestAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterestAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterestAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the InterestAmount field value from a formatted currency string
   *
   * @param _value the InterestAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InterestAmount field
   */
  public void setInterestAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInterestAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInterestAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterestAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterestAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterestAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: InterestAmount (DEPOSIT.interest_amount)
   * @return BigInteger the value
   */
  public BigInteger getInterestAmount () {
    return this.InterestAmount;
  }
  /** Change the field to not being actively set: InterestAmount (DEPOSIT.interest_amount)
   */
  public void unsetInterestAmount () {
    this._InterestAmountSet = false;
  }
  /** See if the field is actively set: InterestAmount (DEPOSIT.interest_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetInterestAmount () {
    return this._InterestAmountSet;
  }
  /** set the fields value: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncomeTaxAmount") 
  public void setIncomeTaxAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncomeTaxAmount", "setIncomeTaxAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "IncomeTaxAmount", "setIncomeTaxAmount");
    }
    this.IncomeTaxAmount = value;
    this._IncomeTaxAmountSet = true;
  }

  /** Retrieves the IncomeTaxAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncomeTaxAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncomeTaxAmount field
   */
   public String getIncomeTaxAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncomeTaxAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncomeTaxAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getIncomeTaxAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncomeTaxAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncomeTaxAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncomeTaxAmount field from a formatted string
   *
   * @param _value the IncomeTaxAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncomeTaxAmount field
   */
   public void setIncomeTaxAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncomeTaxAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncomeTaxAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncomeTaxAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncomeTaxAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncomeTaxAmountFromFormattedString");
   }

  /**
   * Retrieves the IncomeTaxAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncomeTaxAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncomeTaxAmount field
   */
  public String getIncomeTaxAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncomeTaxAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncomeTaxAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getIncomeTaxAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncomeTaxAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncomeTaxAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the IncomeTaxAmount field value from a formatted currency string
   *
   * @param _value the IncomeTaxAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncomeTaxAmount field
   */
  public void setIncomeTaxAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncomeTaxAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setIncomeTaxAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncomeTaxAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncomeTaxAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncomeTaxAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @return BigInteger the value
   */
  public BigInteger getIncomeTaxAmount () {
    return this.IncomeTaxAmount;
  }
  /** Change the field to not being actively set: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   */
  public void unsetIncomeTaxAmount () {
    this._IncomeTaxAmountSet = false;
  }
  /** See if the field is actively set: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncomeTaxAmount () {
    return this._IncomeTaxAmountSet;
  }
  /** set the fields value: CurrencyCode (DEPOSIT.currency_code)
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

  /** get the value of the field: CurrencyCode (DEPOSIT.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (DEPOSIT.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (DEPOSIT.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: ChgDate (DEPOSIT.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
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

  /** get the value of the field: ChgDate (DEPOSIT.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (DEPOSIT.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (DEPOSIT.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ChgWho (DEPOSIT.chg_who)
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

  /** get the value of the field: ChgWho (DEPOSIT.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (DEPOSIT.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (DEPOSIT.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ManualCcauthCode") 
  public void setManualCcauthCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ManualCcauthCode", "setManualCcauthCode");
    }
    this.ManualCcauthCode = value;
    this._ManualCcauthCodeSet = true;
  }

  /** Retrieves the ManualCcauthCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ManualCcauthCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthCode field
   */
   public String getManualCcauthCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthCodeAsFormattedString");
       return fmtMgr.formatString(this.getManualCcauthCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ManualCcauthCode field from a formatted string
   *
   * @param _value the ManualCcauthCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ManualCcauthCode field
   */
   public void setManualCcauthCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setManualCcauthCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthCodeFromFormattedString");
   }

  /** get the value of the field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @return String the value
   */
  public String getManualCcauthCode () {
    return this.ManualCcauthCode;
  }
  /** Change the field to not being actively set: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   */
  public void unsetManualCcauthCode () {
    this._ManualCcauthCodeSet = false;
  }
  /** See if the field is actively set: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetManualCcauthCode () {
    return this._ManualCcauthCodeSet;
  }
  /** set the fields value: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ManualCcauthDate") 
  public void setManualCcauthDate (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ManualCcauthDate", "setManualCcauthDate");
    }
    this.ManualCcauthDate = value;
    this._ManualCcauthDateSet = true;
  }

  /** Retrieves the ManualCcauthDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ManualCcauthDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthDate field
   */
   public String getManualCcauthDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthDateAsFormattedString");
       return fmtMgr.formatString(this.getManualCcauthDate());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ManualCcauthDate field from a formatted string
   *
   * @param _value the ManualCcauthDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ManualCcauthDate field
   */
   public void setManualCcauthDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setManualCcauthDate(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthDateFromFormattedString");
   }

  /** get the value of the field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @return String the value
   */
  public String getManualCcauthDate () {
    return this.ManualCcauthDate;
  }
  /** Change the field to not being actively set: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   */
  public void unsetManualCcauthDate () {
    this._ManualCcauthDateSet = false;
  }
  /** See if the field is actively set: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetManualCcauthDate () {
    return this._ManualCcauthDateSet;
  }
  /** set the fields value: PayMethod (DEPOSIT.pay_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayMethod") 
  public void setPayMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PayMethod", "setPayMethod");
    }
    this.PayMethod = value;
    this._PayMethodSet = true;
  }

  /** Retrieves the PayMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayMethod field
   */
   public String getPayMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getPayMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayMethod field from a formatted string
   *
   * @param _value the PayMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayMethod field
   */
   public void setPayMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayMethodFromFormattedString");
   }

  /** get the value of the field: PayMethod (DEPOSIT.pay_method)
   * @return Integer the value
   */
  public Integer getPayMethod () {
    return this.PayMethod;
  }
  /** Change the field to not being actively set: PayMethod (DEPOSIT.pay_method)
   */
  public void unsetPayMethod () {
    this._PayMethodSet = false;
  }
  /** See if the field is actively set: PayMethod (DEPOSIT.pay_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayMethod () {
    return this._PayMethodSet;
  }
  /** set the fields value: RefundType (DEPOSIT.refund_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefundType") 
  public void setRefundType (Integer value) throws ServiceException
  {
    this.RefundType = value;
    this._RefundTypeSet = true;
  }

  /** Retrieves the RefundType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefundType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundType field
   */
   public String getRefundTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getRefundType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefundType field from a formatted string
   *
   * @param _value the RefundType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefundType field
   */
   public void setRefundTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefundType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundTypeFromFormattedString");
   }

  /** get the value of the field: RefundType (DEPOSIT.refund_type)
   * @return Integer the value
   */
  public Integer getRefundType () {
    return this.RefundType;
  }
  /** Change the field to not being actively set: RefundType (DEPOSIT.refund_type)
   */
  public void unsetRefundType () {
    this._RefundTypeSet = false;
  }
  /** See if the field is actively set: RefundType (DEPOSIT.refund_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefundType () {
    return this._RefundTypeSet;
  }
  /** set the fields value: ReasonCode (DEPOSIT.reason_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ReasonCode") 
  public void setReasonCode (Integer value) throws ServiceException
  {
    this.ReasonCode = value;
    this._ReasonCodeSet = true;
  }

  /** Retrieves the ReasonCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReasonCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReasonCode field
   */
   public String getReasonCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReasonCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReasonCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getReasonCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReasonCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReasonCode field from a formatted string
   *
   * @param _value the ReasonCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReasonCode field
   */
   public void setReasonCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReasonCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReasonCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReasonCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReasonCodeFromFormattedString");
   }

  /** get the value of the field: ReasonCode (DEPOSIT.reason_code)
   * @return Integer the value
   */
  public Integer getReasonCode () {
    return this.ReasonCode;
  }
  /** Change the field to not being actively set: ReasonCode (DEPOSIT.reason_code)
   */
  public void unsetReasonCode () {
    this._ReasonCodeSet = false;
  }
  /** See if the field is actively set: ReasonCode (DEPOSIT.reason_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetReasonCode () {
    return this._ReasonCodeSet;
  }
  /** set the fields value: OpenItemId (DEPOSIT.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
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

  /** get the value of the field: OpenItemId (DEPOSIT.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (DEPOSIT.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (DEPOSIT.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  public String toString() {
    return DepositObjectHelper.toMap(this, null).toString();
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
  /** DEPOSIT.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** DEPOSIT.deposit_type field */
    if(!nonNullOnly || (DepositType != null))  _DepositTypeSet = flag;
  /** DEPOSIT.date_received field */
    if(!nonNullOnly || (DateReceived != null))  _DateReceivedSet = flag;
  /** DEPOSIT.date_returned field */
    if(!nonNullOnly || (DateReturned != null))  _DateReturnedSet = flag;
  /** DEPOSIT.deposit_amount field */
    if(!nonNullOnly || (DepositAmount != null))  _DepositAmountSet = flag;
  /** DEPOSIT.interest_amount field */
    if(!nonNullOnly || (InterestAmount != null))  _InterestAmountSet = flag;
  /** DEPOSIT.income_tax_amount field */
    if(!nonNullOnly || (IncomeTaxAmount != null))  _IncomeTaxAmountSet = flag;
  /** DEPOSIT.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** DEPOSIT.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** DEPOSIT.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** DEPOSIT.manual_ccauth_code field */
    if(!nonNullOnly || (ManualCcauthCode != null))  _ManualCcauthCodeSet = flag;
  /** DEPOSIT.manual_ccauth_date field */
    if(!nonNullOnly || (ManualCcauthDate != null))  _ManualCcauthDateSet = flag;
  /** DEPOSIT.pay_method field */
    if(!nonNullOnly || (PayMethod != null))  _PayMethodSet = flag;
  /** DEPOSIT.refund_type field */
    if(!nonNullOnly || (RefundType != null))  _RefundTypeSet = flag;
  /** DEPOSIT.reason_code field */
    if(!nonNullOnly || (ReasonCode != null))  _ReasonCodeSet = flag;
  /** DEPOSIT.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  }
}
