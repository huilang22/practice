/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCreditObjectData.java
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
  
/** RUCreditObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class RUCreditObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public RUCreditObjectKeyData Key = null;
  /** RATE_UNIT_CR.units_free field */
  public    BigInteger UnitsFree  = null;
  protected boolean _UnitsFreeSet = false;
  /** RATE_UNIT_CR.amount_free field */
  public    BigInteger AmountFree  = null;
  protected boolean _AmountFreeSet = false;
  /** RATE_UNIT_CR.date_inactive field */
  public    Date DateInactive  = null;
  protected boolean _DateInactiveSet = false;
  /** RATE_UNIT_CR.range_terminus field */
  public    BigInteger RangeTerminus  = null;
  protected boolean _RangeTerminusSet = false;
  private String _objName = "RUCreditObjectData";
  /** Default constructor */
  public RUCreditObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public RUCreditObjectData (RUCreditObjectData other)
  {

    if (other == null) return;
    this.Key = new RUCreditObjectKeyData (other.Key);
    this.UnitsFree = other.UnitsFree;
    this._UnitsFreeSet = other._UnitsFreeSet;
    this.AmountFree = other.AmountFree;
    this._AmountFreeSet = other._AmountFreeSet;
    this.DateInactive = other.DateInactive;
    this._DateInactiveSet = other._DateInactiveSet;
    this.RangeTerminus = other.RangeTerminus;
    this._RangeTerminusSet = other._RangeTerminusSet;
  }

  /** get the Key for this object
   * @return RUCreditObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public RUCreditObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (RUCreditObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUnitCrId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitCrId", "setUnitCrId");
    }
    if (this.Key == null) this.Key = new RUCreditObjectKeyData ();
    this.Key.UnitCrId = value;
    this.Key._UnitCrIdSet = true;
  }
  /** get the value of the field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return Integer the value
   */
  public Integer getUnitCrId () {
    if (this.Key == null) return null;
    return this.Key.UnitCrId;
  }
  /** Change the field to not being actively set: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   */
  public void unsetUnitCrId () {
    if (this.Key == null) return;
    this.Key._UnitCrIdSet = false;
  }
  /** See if the field is actively set: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitCrId () {
    if (this.Key == null) return false;
    return this.Key._UnitCrIdSet;
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

  /** set the fields value: RateClass (RATE_UNIT_CR.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRateClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateClass", "setRateClass");
    }
    if (this.Key == null) this.Key = new RUCreditObjectKeyData ();
    this.Key.RateClass = value;
    this.Key._RateClassSet = true;
  }
  /** get the value of the field: RateClass (RATE_UNIT_CR.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    if (this.Key == null) return null;
    return this.Key.RateClass;
  }
  /** Change the field to not being actively set: RateClass (RATE_UNIT_CR.rate_class)
   */
  public void unsetRateClass () {
    if (this.Key == null) return;
    this.Key._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (RATE_UNIT_CR.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    if (this.Key == null) return false;
    return this.Key._RateClassSet;
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

  /** set the fields value: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    if (this.Key == null) this.Key = new RUCreditObjectKeyData ();
    this.Key.CurrencyCode = value;
    this.Key._CurrencyCodeSet = true;
  }
  /** get the value of the field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (RATE_UNIT_CR.currency_code)
   */
  public void unsetCurrencyCode () {
    if (this.Key == null) return;
    this.Key._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    if (this.Key == null) return false;
    return this.Key._CurrencyCodeSet;
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

  /** set the fields value: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillingFrequency (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingFrequency", "setBillingFrequency");
    }
    if (this.Key == null) this.Key = new RUCreditObjectKeyData ();
    this.Key.BillingFrequency = value;
    this.Key._BillingFrequencySet = true;
  }
  /** get the value of the field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return Integer the value
   */
  public Integer getBillingFrequency () {
    if (this.Key == null) return null;
    return this.Key.BillingFrequency;
  }
  /** Change the field to not being actively set: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   */
  public void unsetBillingFrequency () {
    if (this.Key == null) return;
    this.Key._BillingFrequencySet = false;
  }
  /** See if the field is actively set: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingFrequency () {
    if (this.Key == null) return false;
    return this.Key._BillingFrequencySet;
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

  /** set the fields value: DateActive (RATE_UNIT_CR.date_active)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDateActive (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DateActive", "setDateActive");
    }
    if (this.Key == null) this.Key = new RUCreditObjectKeyData ();
    this.Key.DateActive = value;
    this.Key._DateActiveSet = true;
  }
  /** get the value of the field: DateActive (RATE_UNIT_CR.date_active)
   * @return Date the value
   */
  public Date getDateActive () {
    if (this.Key == null) return null;
    return this.Key.DateActive;
  }
  /** Change the field to not being actively set: DateActive (RATE_UNIT_CR.date_active)
   */
  public void unsetDateActive () {
    if (this.Key == null) return;
    this.Key._DateActiveSet = false;
  }
  /** See if the field is actively set: DateActive (RATE_UNIT_CR.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateActive () {
    if (this.Key == null) return false;
    return this.Key._DateActiveSet;
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

  /** set the fields value: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
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
    if (this.Key == null) this.Key = new RUCreditObjectKeyData ();
    this.Key.RangeOrigin = value;
    this.Key._RangeOriginSet = true;
  }
  /** get the value of the field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return BigInteger the value
   */
  public BigInteger getRangeOrigin () {
    if (this.Key == null) return null;
    return this.Key.RangeOrigin;
  }
  /** Change the field to not being actively set: RangeOrigin (RATE_UNIT_CR.range_origin)
   */
  public void unsetRangeOrigin () {
    if (this.Key == null) return;
    this.Key._RangeOriginSet = false;
  }
  /** See if the field is actively set: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeOrigin () {
    if (this.Key == null) return false;
    return this.Key._RangeOriginSet;
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

  /** set the fields value: UnitsFree (RATE_UNIT_CR.units_free)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsFree") 
  public void setUnitsFree (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsFree", "setUnitsFree");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UnitsFree", "setUnitsFree");
    }
    this.UnitsFree = value;
    this._UnitsFreeSet = true;
  }

  /** Retrieves the UnitsFree field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsFree field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsFree field
   */
   public String getUnitsFreeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFreeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsFreeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnitsFree(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsFree");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsFreeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsFree field from a formatted string
   *
   * @param _value the UnitsFree field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsFree field
   */
   public void setUnitsFreeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFreeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsFree(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsFree");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFreeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFreeFromFormattedString");
   }

  /** get the value of the field: UnitsFree (RATE_UNIT_CR.units_free)
   * @return BigInteger the value
   */
  public BigInteger getUnitsFree () {
    return this.UnitsFree;
  }
  /** Change the field to not being actively set: UnitsFree (RATE_UNIT_CR.units_free)
   */
  public void unsetUnitsFree () {
    this._UnitsFreeSet = false;
  }
  /** See if the field is actively set: UnitsFree (RATE_UNIT_CR.units_free)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsFree () {
    return this._UnitsFreeSet;
  }
  /** set the fields value: AmountFree (RATE_UNIT_CR.amount_free)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AmountFree") 
  public void setAmountFree (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountFree", "setAmountFree");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AmountFree", "setAmountFree");
    }
    this.AmountFree = value;
    this._AmountFreeSet = true;
  }

  /** Retrieves the AmountFree field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountFree field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFree field
   */
   public String getAmountFreeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFreeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFreeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmountFree(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountFree");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFreeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountFree field from a formatted string
   *
   * @param _value the AmountFree field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountFree field
   */
   public void setAmountFreeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFreeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountFree(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountFree");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFreeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFreeFromFormattedString");
   }

  /**
   * Retrieves the AmountFree field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFree field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFree field
   */
  public String getAmountFreeAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFreeAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFreeAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmountFree(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFree");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFreeAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the AmountFree field value from a formatted currency string
   *
   * @param _value the AmountFree field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountFree field
   */
  public void setAmountFreeFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFreeFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmountFree(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFree");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFreeFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFreeFromFormattedCurrencyString");
  }

  /** get the value of the field: AmountFree (RATE_UNIT_CR.amount_free)
   * @return BigInteger the value
   */
  public BigInteger getAmountFree () {
    return this.AmountFree;
  }
  /** Change the field to not being actively set: AmountFree (RATE_UNIT_CR.amount_free)
   */
  public void unsetAmountFree () {
    this._AmountFreeSet = false;
  }
  /** See if the field is actively set: AmountFree (RATE_UNIT_CR.amount_free)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountFree () {
    return this._AmountFreeSet;
  }
  /** set the fields value: DateInactive (RATE_UNIT_CR.date_inactive)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateInactive") 
  public void setDateInactive (Date value) throws ServiceException
  {
    this.DateInactive = value;
    this._DateInactiveSet = true;
  }

  /** Retrieves the DateInactive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateInactive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
   public String getDateInactiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateInactive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateInactive field from a formatted string
   *
   * @param _value the DateInactive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
   public void setDateInactiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateInactive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFromFormattedString");
   }

  /**
   * Retrieves the DateInactive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
  public String getDateInactiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateInactive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactive field value from a formatted date/time string
   *
   * @param _value the DateInactive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
  public void setDateInactiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateInactive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateInactive (RATE_UNIT_CR.date_inactive)
   * @return Date the value
   */
  public Date getDateInactive () {
    return this.DateInactive;
  }
  /** Change the field to not being actively set: DateInactive (RATE_UNIT_CR.date_inactive)
   */
  public void unsetDateInactive () {
    this._DateInactiveSet = false;
  }
  /** See if the field is actively set: DateInactive (RATE_UNIT_CR.date_inactive)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateInactive () {
    return this._DateInactiveSet;
  }
  /** set the fields value: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeTerminus") 
  public void setRangeTerminus (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeTerminus", "setRangeTerminus");
    }
    this.RangeTerminus = value;
    this._RangeTerminusSet = true;
  }

  /** Retrieves the RangeTerminus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeTerminus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeTerminus field
   */
   public String getRangeTerminusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeTerminusAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeTerminus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeTerminusAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeTerminus field from a formatted string
   *
   * @param _value the RangeTerminus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeTerminus field
   */
   public void setRangeTerminusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeTerminus(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeTerminusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeTerminusFromFormattedString");
   }

  /** get the value of the field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @return BigInteger the value
   */
  public BigInteger getRangeTerminus () {
    return this.RangeTerminus;
  }
  /** Change the field to not being actively set: RangeTerminus (RATE_UNIT_CR.range_terminus)
   */
  public void unsetRangeTerminus () {
    this._RangeTerminusSet = false;
  }
  /** See if the field is actively set: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeTerminus () {
    return this._RangeTerminusSet;
  }
  public String toString() {
    return RUCreditObjectHelper.toMap(this, null).toString();
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
  /** RATE_UNIT_CR.units_free field */
    if(!nonNullOnly || (UnitsFree != null))  _UnitsFreeSet = flag;
  /** RATE_UNIT_CR.amount_free field */
    if(!nonNullOnly || (AmountFree != null))  _AmountFreeSet = flag;
  /** RATE_UNIT_CR.date_inactive field */
    if(!nonNullOnly || (DateInactive != null))  _DateInactiveSet = flag;
  /** RATE_UNIT_CR.range_terminus field */
    if(!nonNullOnly || (RangeTerminus != null))  _RangeTerminusSet = flag;
  }
}
