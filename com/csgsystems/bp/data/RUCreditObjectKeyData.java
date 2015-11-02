/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCreditObjectKeyData.java
 * Definition File: Customer/UsageCreditRate.xml
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
import java.util.Map;
import java.util.Locale;
import java.math.BigInteger;

import javax.ws.rs.QueryParam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.base.BaseObjectData;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.api.format.FieldFormatMgr;

/** RUCreditObject's Key Data class. */
public class RUCreditObjectKeyData  extends BaseObjectData
{
  /** RATE_UNIT_CR.unit_cr_id field */
  public    Integer UnitCrId  = null;
  protected boolean _UnitCrIdSet = false;
  /** RATE_UNIT_CR.rate_class field */
  public    Integer RateClass  = null;
  protected boolean _RateClassSet = false;
  /** RATE_UNIT_CR.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** RATE_UNIT_CR.billing_frequency field */
  public    Integer BillingFrequency  = null;
  protected boolean _BillingFrequencySet = false;
  /** RATE_UNIT_CR.date_active field */
  public    Date DateActive  = null;
  protected boolean _DateActiveSet = false;
  /** RATE_UNIT_CR.range_origin field */
  public    BigInteger RangeOrigin  = null;
  protected boolean _RangeOriginSet = false;
  private String _objName = "RUCreditObjectKeyData";
  /** default constructor */
  public RUCreditObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public RUCreditObjectKeyData (RUCreditObjectKeyData other)
  {
    if (other == null) return;
    this.UnitCrId = other.UnitCrId;
    this._UnitCrIdSet = other._UnitCrIdSet;
    this.RateClass = other.RateClass;
    this._RateClassSet = other._RateClassSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.BillingFrequency = other.BillingFrequency;
    this._BillingFrequencySet = other._BillingFrequencySet;
    this.DateActive = other.DateActive;
    this._DateActiveSet = other._DateActiveSet;
    this.RangeOrigin = other.RangeOrigin;
    this._RangeOriginSet = other._RangeOriginSet;
  }
  /** set the fields value: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitCrId") 
  public void setUnitCrId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitCrId", "setUnitCrId");
    }
    this.UnitCrId = value;
    this._UnitCrIdSet = true;
  }

  /** Retrieves the UnitCrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitCrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCrId field
   */
   public String getUnitCrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCrIdAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitCrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitCrId field from a formatted string
   *
   * @param _value the UnitCrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitCrId field
   */
   public void setUnitCrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitCrId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCrIdFromFormattedString");
   }

  /** get the value of the field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return Integer the value
   */
  public Integer getUnitCrId () {
    return this.UnitCrId;
  }
  /** Change the field to not being actively set: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   */
  public void unsetUnitCrId () {
    this._UnitCrIdSet = false;
  }
  /** See if the field is actively set: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitCrId () {
    return this._UnitCrIdSet;
  }
  /** set the fields value: RateClass (RATE_UNIT_CR.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClass") 
  public void setRateClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateClass", "setRateClass");
    }
    this.RateClass = value;
    this._RateClassSet = true;
  }

  /** Retrieves the RateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClass field
   */
   public String getRateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getRateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClass field from a formatted string
   *
   * @param _value the RateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClass field
   */
   public void setRateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFromFormattedString");
   }

  /** get the value of the field: RateClass (RATE_UNIT_CR.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    return this.RateClass;
  }
  /** Change the field to not being actively set: RateClass (RATE_UNIT_CR.rate_class)
   */
  public void unsetRateClass () {
    this._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (RATE_UNIT_CR.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    return this._RateClassSet;
  }
  /** set the fields value: CurrencyCode (RATE_UNIT_CR.currency_code)
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

  /** get the value of the field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (RATE_UNIT_CR.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingFrequency") 
  public void setBillingFrequency (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingFrequency", "setBillingFrequency");
    }
    this.BillingFrequency = value;
    this._BillingFrequencySet = true;
  }

  /** Retrieves the BillingFrequency field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingFrequency field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingFrequency field
   */
   public String getBillingFrequencyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingFrequency(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingFrequency field from a formatted string
   *
   * @param _value the BillingFrequency field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingFrequency field
   */
   public void setBillingFrequencyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingFrequency(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingFrequencyFromFormattedString");
   }

  /** get the value of the field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return Integer the value
   */
  public Integer getBillingFrequency () {
    return this.BillingFrequency;
  }
  /** Change the field to not being actively set: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   */
  public void unsetBillingFrequency () {
    this._BillingFrequencySet = false;
  }
  /** See if the field is actively set: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingFrequency () {
    return this._BillingFrequencySet;
  }
  /** set the fields value: DateActive (RATE_UNIT_CR.date_active)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateActive") 
  public void setDateActive (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DateActive", "setDateActive");
    }
    this.DateActive = value;
    this._DateActiveSet = true;
  }

  /** Retrieves the DateActive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateActive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
   public String getDateActiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateActive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateActive field from a formatted string
   *
   * @param _value the DateActive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
   public void setDateActiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateActive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFromFormattedString");
   }

  /**
   * Retrieves the DateActive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
  public String getDateActiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateActive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActive field value from a formatted date/time string
   *
   * @param _value the DateActive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
  public void setDateActiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateActive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateActive (RATE_UNIT_CR.date_active)
   * @return Date the value
   */
  public Date getDateActive () {
    return this.DateActive;
  }
  /** Change the field to not being actively set: DateActive (RATE_UNIT_CR.date_active)
   */
  public void unsetDateActive () {
    this._DateActiveSet = false;
  }
  /** See if the field is actively set: DateActive (RATE_UNIT_CR.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateActive () {
    return this._DateActiveSet;
  }
  /** set the fields value: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeOrigin") 
  public void setRangeOrigin (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RangeOrigin", "setRangeOrigin");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeOrigin", "setRangeOrigin");
    }
    this.RangeOrigin = value;
    this._RangeOriginSet = true;
  }

  /** Retrieves the RangeOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOrigin field
   */
   public String getRangeOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeOrigin field from a formatted string
   *
   * @param _value the RangeOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeOrigin field
   */
   public void setRangeOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeOrigin(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginFromFormattedString");
   }

  /** get the value of the field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return BigInteger the value
   */
  public BigInteger getRangeOrigin () {
    return this.RangeOrigin;
  }
  /** Change the field to not being actively set: RangeOrigin (RATE_UNIT_CR.range_origin)
   */
  public void unsetRangeOrigin () {
    this._RangeOriginSet = false;
  }
  /** See if the field is actively set: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeOrigin () {
    return this._RangeOriginSet;
  }
  public String toString() {
    return RUCreditObjectKeyHelper.toMap(this, null).toString();
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
   * This method sets all of the *Set flags to the specified value
   * @param flag value to set
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set
   * @param nonNullOnly value to set
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** RATE_UNIT_CR.unit_cr_id field */
    if(!nonNullOnly || (UnitCrId != null))  _UnitCrIdSet = flag;
  /** RATE_UNIT_CR.rate_class field */
    if(!nonNullOnly || (RateClass != null))  _RateClassSet = flag;
  /** RATE_UNIT_CR.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** RATE_UNIT_CR.billing_frequency field */
    if(!nonNullOnly || (BillingFrequency != null))  _BillingFrequencySet = flag;
  /** RATE_UNIT_CR.date_active field */
    if(!nonNullOnly || (DateActive != null))  _DateActiveSet = flag;
  /** RATE_UNIT_CR.range_origin field */
    if(!nonNullOnly || (RangeOrigin != null))  _RangeOriginSet = flag;
  }
}
