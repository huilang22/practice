/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LateFeeRateOverridesObjectData.java
 * Definition File: Customer/LateFeeRateOverrides.xml
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
  
/** LateFeeRateOverridesObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class LateFeeRateOverridesObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public LateFeeRateOverridesObjectKeyData Key = null;
  /** LATE_FEE_RATE_OVERRIDES.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** LATE_FEE_RATE_OVERRIDES.rate_amt field */
  public    BigInteger RateAmt  = null;
  protected boolean _RateAmtSet = false;
  /** LATE_FEE_RATE_OVERRIDES.rate_pct field */
  public    Integer RatePct  = null;
  protected boolean _RatePctSet = false;
  /** LATE_FEE_RATE_OVERRIDES.add_implied_decimals field */
  public    Integer AddImpliedDecimals  = null;
  protected boolean _AddImpliedDecimalsSet = false;
  /** LATE_FEE_RATE_OVERRIDES.delay_origin field */
  public    Integer DelayOrigin  = null;
  protected boolean _DelayOriginSet = false;
  /** LATE_FEE_RATE_OVERRIDES.delay_terminus field */
  public    Integer DelayTerminus  = null;
  protected boolean _DelayTerminusSet = false;
  /** LATE_FEE_RATE_OVERRIDES.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** LATE_FEE_RATE_OVERRIDES.calculation_type field */
  public    Integer CalculationType  = null;
  protected boolean _CalculationTypeSet = false;
  /** LATE_FEE_RATE_OVERRIDES.min_amt field */
  public    BigInteger MinAmt  = null;
  protected boolean _MinAmtSet = false;
  /** LATE_FEE_RATE_OVERRIDES.max_amt field */
  public    BigInteger MaxAmt  = null;
  protected boolean _MaxAmtSet = false;
  /** LATE_FEE_RATE_OVERRIDES.type_id_nrc field */
  public    Integer TypeIdNrc  = null;
  protected boolean _TypeIdNrcSet = false;
  /** LATE_FEE_RATE_OVERRIDES.grace_period field */
  public    Integer GracePeriod  = null;
  protected boolean _GracePeriodSet = false;
  /** LATE_FEE_RATE_OVERRIDES.min_bal_thresh field */
  public    BigInteger MinBalThresh  = null;
  protected boolean _MinBalThreshSet = false;
  /** LATE_FEE_RATE_OVERRIDES.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** LATE_FEE_RATE_OVERRIDES.product_line_id field */
  public    Integer ProductLineId  = null;
  protected boolean _ProductLineIdSet = false;
  /** LATE_FEE_RATE_OVERRIDES.dual_late_fee field */
  public    Integer DualLateFee  = null;
  protected boolean _DualLateFeeSet = false;
  private String _objName = "LateFeeRateOverridesObjectData";
  /** Default constructor */
  public LateFeeRateOverridesObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public LateFeeRateOverridesObjectData (LateFeeRateOverridesObjectData other)
  {

    if (other == null) return;
    this.Key = new LateFeeRateOverridesObjectKeyData (other.Key);
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.RateAmt = other.RateAmt;
    this._RateAmtSet = other._RateAmtSet;
    this.RatePct = other.RatePct;
    this._RatePctSet = other._RatePctSet;
    this.AddImpliedDecimals = other.AddImpliedDecimals;
    this._AddImpliedDecimalsSet = other._AddImpliedDecimalsSet;
    this.DelayOrigin = other.DelayOrigin;
    this._DelayOriginSet = other._DelayOriginSet;
    this.DelayTerminus = other.DelayTerminus;
    this._DelayTerminusSet = other._DelayTerminusSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.CalculationType = other.CalculationType;
    this._CalculationTypeSet = other._CalculationTypeSet;
    this.MinAmt = other.MinAmt;
    this._MinAmtSet = other._MinAmtSet;
    this.MaxAmt = other.MaxAmt;
    this._MaxAmtSet = other._MaxAmtSet;
    this.TypeIdNrc = other.TypeIdNrc;
    this._TypeIdNrcSet = other._TypeIdNrcSet;
    this.GracePeriod = other.GracePeriod;
    this._GracePeriodSet = other._GracePeriodSet;
    this.MinBalThresh = other.MinBalThresh;
    this._MinBalThreshSet = other._MinBalThreshSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.ProductLineId = other.ProductLineId;
    this._ProductLineIdSet = other._ProductLineIdSet;
    this.DualLateFee = other.DualLateFee;
    this._DualLateFeeSet = other._DualLateFeeSet;
  }

  /** get the Key for this object
   * @return LateFeeRateOverridesObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public LateFeeRateOverridesObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (LateFeeRateOverridesObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
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

  /** set the fields value: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLateFeeTypeId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LateFeeTypeId", "setLateFeeTypeId");
    }
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyData ();
    this.Key.LateFeeTypeId = value;
    this.Key._LateFeeTypeIdSet = true;
  }
  /** get the value of the field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return Integer the value
   */
  public Integer getLateFeeTypeId () {
    if (this.Key == null) return null;
    return this.Key.LateFeeTypeId;
  }
  /** Change the field to not being actively set: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   */
  public void unsetLateFeeTypeId () {
    if (this.Key == null) return;
    this.Key._LateFeeTypeIdSet = false;
  }
  /** See if the field is actively set: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLateFeeTypeId () {
    if (this.Key == null) return false;
    return this.Key._LateFeeTypeIdSet;
  }

  /** Retrieves the LateFeeTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LateFeeTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateFeeTypeId field
   */
   public String getLateFeeTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeTypeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getLateFeeTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateFeeTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateFeeTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the LateFeeTypeId field from a formatted string
   *
   * @param _value the LateFeeTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LateFeeTypeId field
   */
   public void setLateFeeTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLateFeeTypeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateFeeTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateFeeTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateFeeTypeIdFromFormattedString");
   }

  /** set the fields value: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyData ();
    this.Key.ActiveDt = value;
    this.Key._ActiveDtSet = true;
  }
  /** get the value of the field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    if (this.Key == null) return null;
    return this.Key.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   */
  public void unsetActiveDt () {
    if (this.Key == null) return;
    this.Key._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    if (this.Key == null) return false;
    return this.Key._ActiveDtSet;
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

  /** set the fields value: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
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

  /**
   * Retrieves the display value for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */

  public String getCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */
  public Enumeration getCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      this.setCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateAmt") 
  public void setRateAmt (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateAmt", "setRateAmt");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RateAmt", "setRateAmt");
    }
    this.RateAmt = value;
    this._RateAmtSet = true;
  }

  /** Retrieves the RateAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateAmt field
   */
   public String getRateAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRateAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateAmt field from a formatted string
   *
   * @param _value the RateAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateAmt field
   */
   public void setRateAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateAmtFromFormattedString");
   }

  /**
   * Retrieves the RateAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateAmt field
   */
  public String getRateAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getRateAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the RateAmt field value from a formatted currency string
   *
   * @param _value the RateAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateAmt field
   */
  public void setRateAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRateAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @return BigInteger the value
   */
  public BigInteger getRateAmt () {
    return this.RateAmt;
  }
  /** Change the field to not being actively set: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   */
  public void unsetRateAmt () {
    this._RateAmtSet = false;
  }
  /** See if the field is actively set: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateAmt () {
    return this._RateAmtSet;
  }
  /** set the fields value: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatePct") 
  public void setRatePct (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatePct", "setRatePct");
    }
    this.RatePct = value;
    this._RatePctSet = true;
  }

  /** Retrieves the RatePct field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatePct field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePct field
   */
   public String getRatePctAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePctAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePctAsFormattedString");
       return fmtMgr.formatNumber(this.getRatePct(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePct");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePctAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatePct field from a formatted string
   *
   * @param _value the RatePct field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatePct field
   */
   public void setRatePctFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePctFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatePct(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePct");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePctFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePctFromFormattedString");
   }

  /** get the value of the field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @return Integer the value
   */
  public Integer getRatePct () {
    return this.RatePct;
  }
  /** Change the field to not being actively set: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   */
  public void unsetRatePct () {
    this._RatePctSet = false;
  }
  /** See if the field is actively set: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatePct () {
    return this._RatePctSet;
  }
  /** set the fields value: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddImpliedDecimals") 
  public void setAddImpliedDecimals (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AddImpliedDecimals", "setAddImpliedDecimals");
    }
    this.AddImpliedDecimals = value;
    this._AddImpliedDecimalsSet = true;
  }

  /** Retrieves the AddImpliedDecimals field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddImpliedDecimals field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddImpliedDecimals field
   */
   public String getAddImpliedDecimalsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddImpliedDecimalsAsFormattedString");
       return fmtMgr.formatNumber(this.getAddImpliedDecimals(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddImpliedDecimals");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddImpliedDecimalsAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddImpliedDecimals field from a formatted string
   *
   * @param _value the AddImpliedDecimals field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddImpliedDecimals field
   */
   public void setAddImpliedDecimalsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddImpliedDecimals(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddImpliedDecimals");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddImpliedDecimalsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddImpliedDecimalsFromFormattedString");
   }

  /** get the value of the field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @return Integer the value
   */
  public Integer getAddImpliedDecimals () {
    return this.AddImpliedDecimals;
  }
  /** Change the field to not being actively set: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   */
  public void unsetAddImpliedDecimals () {
    this._AddImpliedDecimalsSet = false;
  }
  /** See if the field is actively set: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddImpliedDecimals () {
    return this._AddImpliedDecimalsSet;
  }
  /** set the fields value: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DelayOrigin") 
  public void setDelayOrigin (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DelayOrigin", "setDelayOrigin");
    }
    this.DelayOrigin = value;
    this._DelayOriginSet = true;
  }

  /** Retrieves the DelayOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DelayOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DelayOrigin field
   */
   public String getDelayOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDelayOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDelayOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getDelayOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DelayOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDelayOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the DelayOrigin field from a formatted string
   *
   * @param _value the DelayOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DelayOrigin field
   */
   public void setDelayOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDelayOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDelayOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DelayOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDelayOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDelayOriginFromFormattedString");
   }

  /** get the value of the field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @return Integer the value
   */
  public Integer getDelayOrigin () {
    return this.DelayOrigin;
  }
  /** Change the field to not being actively set: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   */
  public void unsetDelayOrigin () {
    this._DelayOriginSet = false;
  }
  /** See if the field is actively set: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetDelayOrigin () {
    return this._DelayOriginSet;
  }
  /** set the fields value: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DelayTerminus") 
  public void setDelayTerminus (Integer value) throws ServiceException
  {
    this.DelayTerminus = value;
    this._DelayTerminusSet = true;
  }

  /** Retrieves the DelayTerminus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DelayTerminus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DelayTerminus field
   */
   public String getDelayTerminusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDelayTerminusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDelayTerminusAsFormattedString");
       return fmtMgr.formatNumber(this.getDelayTerminus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DelayTerminus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDelayTerminusAsFormattedString");
       throw x;
     }
   }
  /** Sets the DelayTerminus field from a formatted string
   *
   * @param _value the DelayTerminus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DelayTerminus field
   */
   public void setDelayTerminusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDelayTerminusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDelayTerminus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DelayTerminus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDelayTerminusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDelayTerminusFromFormattedString");
   }

  /** get the value of the field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @return Integer the value
   */
  public Integer getDelayTerminus () {
    return this.DelayTerminus;
  }
  /** Change the field to not being actively set: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   */
  public void unsetDelayTerminus () {
    this._DelayTerminusSet = false;
  }
  /** See if the field is actively set: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @return boolean whether the field is actively set
   */
  public boolean issetDelayTerminus () {
    return this._DelayTerminusSet;
  }
  /** set the fields value: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
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

  /** get the value of the field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CalculationType") 
  public void setCalculationType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CalculationType", "setCalculationType");
    }
    this.CalculationType = value;
    this._CalculationTypeSet = true;
  }

  /** Retrieves the CalculationType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CalculationType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CalculationType field
   */
   public String getCalculationTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCalculationTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCalculationTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getCalculationType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CalculationType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCalculationTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CalculationType field from a formatted string
   *
   * @param _value the CalculationType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CalculationType field
   */
   public void setCalculationTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCalculationTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCalculationType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CalculationType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCalculationTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCalculationTypeFromFormattedString");
   }

  /** get the value of the field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @return Integer the value
   */
  public Integer getCalculationType () {
    return this.CalculationType;
  }
  /** Change the field to not being actively set: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   */
  public void unsetCalculationType () {
    this._CalculationTypeSet = false;
  }
  /** See if the field is actively set: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetCalculationType () {
    return this._CalculationTypeSet;
  }
  /** set the fields value: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinAmt") 
  public void setMinAmt (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MinAmt", "setMinAmt");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MinAmt", "setMinAmt");
    }
    this.MinAmt = value;
    this._MinAmtSet = true;
  }

  /** Retrieves the MinAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinAmt field
   */
   public String getMinAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMinAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinAmt field from a formatted string
   *
   * @param _value the MinAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinAmt field
   */
   public void setMinAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinAmtFromFormattedString");
   }

  /**
   * Retrieves the MinAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinAmt field
   */
  public String getMinAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getMinAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the MinAmt field value from a formatted currency string
   *
   * @param _value the MinAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinAmt field
   */
  public void setMinAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMinAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @return BigInteger the value
   */
  public BigInteger getMinAmt () {
    return this.MinAmt;
  }
  /** Change the field to not being actively set: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   */
  public void unsetMinAmt () {
    this._MinAmtSet = false;
  }
  /** See if the field is actively set: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinAmt () {
    return this._MinAmtSet;
  }
  /** set the fields value: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MaxAmt") 
  public void setMaxAmt (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MaxAmt", "setMaxAmt");
    }
    this.MaxAmt = value;
    this._MaxAmtSet = true;
  }

  /** Retrieves the MaxAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MaxAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmt field
   */
   public String getMaxAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMaxAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the MaxAmt field from a formatted string
   *
   * @param _value the MaxAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxAmt field
   */
   public void setMaxAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMaxAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmtFromFormattedString");
   }

  /**
   * Retrieves the MaxAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmt field
   */
  public String getMaxAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getMaxAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the MaxAmt field value from a formatted currency string
   *
   * @param _value the MaxAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxAmt field
   */
  public void setMaxAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMaxAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @return BigInteger the value
   */
  public BigInteger getMaxAmt () {
    return this.MaxAmt;
  }
  /** Change the field to not being actively set: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   */
  public void unsetMaxAmt () {
    this._MaxAmtSet = false;
  }
  /** See if the field is actively set: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetMaxAmt () {
    return this._MaxAmtSet;
  }
  /** set the fields value: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TypeIdNrc") 
  public void setTypeIdNrc (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TypeIdNrc", "setTypeIdNrc");
    }
    this.TypeIdNrc = value;
    this._TypeIdNrcSet = true;
  }

  /** Retrieves the TypeIdNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TypeIdNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdNrc field
   */
   public String getTypeIdNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdNrcAsFormattedString");
       return fmtMgr.formatNumber(this.getTypeIdNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the TypeIdNrc field from a formatted string
   *
   * @param _value the TypeIdNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TypeIdNrc field
   */
   public void setTypeIdNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTypeIdNrc(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdNrcFromFormattedString");
   }

  /** get the value of the field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @return Integer the value
   */
  public Integer getTypeIdNrc () {
    return this.TypeIdNrc;
  }
  /** Change the field to not being actively set: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   */
  public void unsetTypeIdNrc () {
    this._TypeIdNrcSet = false;
  }
  /** See if the field is actively set: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetTypeIdNrc () {
    return this._TypeIdNrcSet;
  }
  /** set the fields value: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GracePeriod") 
  public void setGracePeriod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GracePeriod", "setGracePeriod");
    }
    this.GracePeriod = value;
    this._GracePeriodSet = true;
  }

  /** Retrieves the GracePeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GracePeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GracePeriod field
   */
   public String getGracePeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGracePeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGracePeriodAsFormattedString");
       return fmtMgr.formatNumber(this.getGracePeriod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GracePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGracePeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the GracePeriod field from a formatted string
   *
   * @param _value the GracePeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GracePeriod field
   */
   public void setGracePeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGracePeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGracePeriod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GracePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGracePeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGracePeriodFromFormattedString");
   }

  /** get the value of the field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @return Integer the value
   */
  public Integer getGracePeriod () {
    return this.GracePeriod;
  }
  /** Change the field to not being actively set: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   */
  public void unsetGracePeriod () {
    this._GracePeriodSet = false;
  }
  /** See if the field is actively set: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetGracePeriod () {
    return this._GracePeriodSet;
  }
  /** set the fields value: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinBalThresh") 
  public void setMinBalThresh (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MinBalThresh", "setMinBalThresh");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MinBalThresh", "setMinBalThresh");
    }
    this.MinBalThresh = value;
    this._MinBalThreshSet = true;
  }

  /** Retrieves the MinBalThresh field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinBalThresh field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinBalThresh field
   */
   public String getMinBalThreshAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBalThreshAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinBalThreshAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMinBalThresh(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinBalThresh");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinBalThreshAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinBalThresh field from a formatted string
   *
   * @param _value the MinBalThresh field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinBalThresh field
   */
   public void setMinBalThreshFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBalThreshFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinBalThresh(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinBalThresh");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinBalThreshFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinBalThreshFromFormattedString");
   }

  /**
   * Retrieves the MinBalThresh field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinBalThresh field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinBalThresh field
   */
  public String getMinBalThreshAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBalThreshAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinBalThreshAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getMinBalThresh(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBalThresh");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinBalThreshAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the MinBalThresh field value from a formatted currency string
   *
   * @param _value the MinBalThresh field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinBalThresh field
   */
  public void setMinBalThreshFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinBalThreshFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMinBalThresh(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBalThresh");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinBalThreshFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinBalThreshFromFormattedCurrencyString");
  }

  /** get the value of the field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @return BigInteger the value
   */
  public BigInteger getMinBalThresh () {
    return this.MinBalThresh;
  }
  /** Change the field to not being actively set: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   */
  public void unsetMinBalThresh () {
    this._MinBalThreshSet = false;
  }
  /** See if the field is actively set: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinBalThresh () {
    return this._MinBalThreshSet;
  }
  /** set the fields value: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
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

  /** get the value of the field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProductLineId") 
  public void setProductLineId (Integer value) throws ServiceException
  {
    this.ProductLineId = value;
    this._ProductLineIdSet = true;
  }

  /** Retrieves the ProductLineId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProductLineId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProductLineId field
   */
   public String getProductLineIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdAsFormattedString");
       return fmtMgr.formatNumber(this.getProductLineId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProductLineId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProductLineId field from a formatted string
   *
   * @param _value the ProductLineId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProductLineId field
   */
   public void setProductLineIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProductLineId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProductLineId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProductLineIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProductLineIdFromFormattedString");
   }

  /** get the value of the field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @return Integer the value
   */
  public Integer getProductLineId () {
    return this.ProductLineId;
  }
  /** Change the field to not being actively set: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   */
  public void unsetProductLineId () {
    this._ProductLineIdSet = false;
  }
  /** See if the field is actively set: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProductLineId () {
    return this._ProductLineIdSet;
  }
  /** set the fields value: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DualLateFee") 
  public void setDualLateFee (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DualLateFee", "setDualLateFee");
    }
    this.DualLateFee = value;
    this._DualLateFeeSet = true;
  }

  /** Retrieves the DualLateFee field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DualLateFee field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DualLateFee field
   */
   public String getDualLateFeeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDualLateFeeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDualLateFeeAsFormattedString");
       return fmtMgr.formatNumber(this.getDualLateFee(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DualLateFee");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDualLateFeeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DualLateFee field from a formatted string
   *
   * @param _value the DualLateFee field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DualLateFee field
   */
   public void setDualLateFeeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDualLateFeeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDualLateFee(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DualLateFee");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDualLateFeeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDualLateFeeFromFormattedString");
   }

  /** get the value of the field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @return Integer the value
   */
  public Integer getDualLateFee () {
    return this.DualLateFee;
  }
  /** Change the field to not being actively set: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   */
  public void unsetDualLateFee () {
    this._DualLateFeeSet = false;
  }
  /** See if the field is actively set: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @return boolean whether the field is actively set
   */
  public boolean issetDualLateFee () {
    return this._DualLateFeeSet;
  }
  public String toString() {
    return LateFeeRateOverridesObjectHelper.toMap(this, null).toString();
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
  /** LATE_FEE_RATE_OVERRIDES.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.rate_amt field */
    if(!nonNullOnly || (RateAmt != null))  _RateAmtSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.rate_pct field */
    if(!nonNullOnly || (RatePct != null))  _RatePctSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.add_implied_decimals field */
    if(!nonNullOnly || (AddImpliedDecimals != null))  _AddImpliedDecimalsSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.delay_origin field */
    if(!nonNullOnly || (DelayOrigin != null))  _DelayOriginSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.delay_terminus field */
    if(!nonNullOnly || (DelayTerminus != null))  _DelayTerminusSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.calculation_type field */
    if(!nonNullOnly || (CalculationType != null))  _CalculationTypeSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.min_amt field */
    if(!nonNullOnly || (MinAmt != null))  _MinAmtSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.max_amt field */
    if(!nonNullOnly || (MaxAmt != null))  _MaxAmtSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.type_id_nrc field */
    if(!nonNullOnly || (TypeIdNrc != null))  _TypeIdNrcSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.grace_period field */
    if(!nonNullOnly || (GracePeriod != null))  _GracePeriodSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.min_bal_thresh field */
    if(!nonNullOnly || (MinBalThresh != null))  _MinBalThreshSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.product_line_id field */
    if(!nonNullOnly || (ProductLineId != null))  _ProductLineIdSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.dual_late_fee field */
    if(!nonNullOnly || (DualLateFee != null))  _DualLateFeeSet = flag;
  }
}
