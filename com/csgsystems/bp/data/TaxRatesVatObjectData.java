/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxRatesVatObjectData.java
 * Definition File: Admin/TaxRatesVat.xml
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
  
/** TaxRatesVatObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class TaxRatesVatObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public TaxRatesVatObjectKeyData Key = null;
  /** TAX_RATES_VAT.fixed_amt field */
  public    BigInteger FixedAmt  = null;
  protected boolean _FixedAmtSet = false;
  /** TAX_RATES_VAT.rate field */
  public    Integer Rate  = null;
  protected boolean _RateSet = false;
  /** TAX_RATES_VAT.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** TAX_RATES_VAT.tax_type_code field */
  public    Integer TaxTypeCode  = null;
  protected boolean _TaxTypeCodeSet = false;
  /** TAX_RATES_VAT.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "TaxRatesVatObjectData";
  /** Default constructor */
  public TaxRatesVatObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public TaxRatesVatObjectData (TaxRatesVatObjectData other)
  {

    if (other == null) return;
    this.Key = new TaxRatesVatObjectKeyData (other.Key);
    this.FixedAmt = other.FixedAmt;
    this._FixedAmtSet = other._FixedAmtSet;
    this.Rate = other.Rate;
    this._RateSet = other._RateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.TaxTypeCode = other.TaxTypeCode;
    this._TaxTypeCodeSet = other._TaxTypeCodeSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return TaxRatesVatObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public TaxRatesVatObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (TaxRatesVatObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyData ();
    this.Key.TaxPkgInstId = value;
    this.Key._TaxPkgInstIdSet = true;
  }
  /** get the value of the field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    if (this.Key == null) return;
    this.Key._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    if (this.Key == null) return false;
    return this.Key._TaxPkgInstIdSet;
  }

  /** Retrieves the TaxPkgInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPkgInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstId field
   */
   public String getTaxPkgInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxPkgInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPkgInstId field from a formatted string
   *
   * @param _value the TaxPkgInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPkgInstId field
   */
   public void setTaxPkgInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPkgInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFromFormattedString");
   }

  /** set the fields value: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyData ();
    this.Key.CurrencyCode = value;
    this.Key._CurrencyCodeSet = true;
  }
  /** get the value of the field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (TAX_RATES_VAT.currency_code)
   */
  public void unsetCurrencyCode () {
    if (this.Key == null) return;
    this.Key._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (TAX_RATES_VAT.currency_code)
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

  /** set the fields value: TaxClass (TAX_RATES_VAT.tax_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxClass", "setTaxClass");
    }
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyData ();
    this.Key.TaxClass = value;
    this.Key._TaxClassSet = true;
  }
  /** get the value of the field: TaxClass (TAX_RATES_VAT.tax_class)
   * @return Integer the value
   */
  public Integer getTaxClass () {
    if (this.Key == null) return null;
    return this.Key.TaxClass;
  }
  /** Change the field to not being actively set: TaxClass (TAX_RATES_VAT.tax_class)
   */
  public void unsetTaxClass () {
    if (this.Key == null) return;
    this.Key._TaxClassSet = false;
  }
  /** See if the field is actively set: TaxClass (TAX_RATES_VAT.tax_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxClass () {
    if (this.Key == null) return false;
    return this.Key._TaxClassSet;
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

  /** set the fields value: ActiveDate (TAX_RATES_VAT.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDate", "setActiveDate");
    }
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyData ();
    this.Key.ActiveDate = value;
    this.Key._ActiveDateSet = true;
  }
  /** get the value of the field: ActiveDate (TAX_RATES_VAT.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    if (this.Key == null) return null;
    return this.Key.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (TAX_RATES_VAT.active_date)
   */
  public void unsetActiveDate () {
    if (this.Key == null) return;
    this.Key._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (TAX_RATES_VAT.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    if (this.Key == null) return false;
    return this.Key._ActiveDateSet;
  }

  /** Retrieves the ActiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
   public String getActiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDate field from a formatted string
   *
   * @param _value the ActiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
   public void setActiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFromFormattedString");
   }

  /**
   * Retrieves the ActiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
  public String getActiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDate field value from a formatted date/time string
   *
   * @param _value the ActiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
  public void setActiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillingFrequency (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingFrequency", "setBillingFrequency");
    }
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyData ();
    this.Key.BillingFrequency = value;
    this.Key._BillingFrequencySet = true;
  }
  /** get the value of the field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @return Integer the value
   */
  public Integer getBillingFrequency () {
    if (this.Key == null) return null;
    return this.Key.BillingFrequency;
  }
  /** Change the field to not being actively set: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   */
  public void unsetBillingFrequency () {
    if (this.Key == null) return;
    this.Key._BillingFrequencySet = false;
  }
  /** See if the field is actively set: BillingFrequency (TAX_RATES_VAT.billing_frequency)
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

  /** set the fields value: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRangeTerminus (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RangeTerminus", "setRangeTerminus");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeTerminus", "setRangeTerminus");
    }
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyData ();
    this.Key.RangeTerminus = value;
    this.Key._RangeTerminusSet = true;
  }
  /** get the value of the field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @return BigInteger the value
   */
  public BigInteger getRangeTerminus () {
    if (this.Key == null) return null;
    return this.Key.RangeTerminus;
  }
  /** Change the field to not being actively set: RangeTerminus (TAX_RATES_VAT.range_terminus)
   */
  public void unsetRangeTerminus () {
    if (this.Key == null) return;
    this.Key._RangeTerminusSet = false;
  }
  /** See if the field is actively set: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeTerminus () {
    if (this.Key == null) return false;
    return this.Key._RangeTerminusSet;
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

  /** set the fields value: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FixedAmt") 
  public void setFixedAmt (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FixedAmt", "setFixedAmt");
    }
    this.FixedAmt = value;
    this._FixedAmtSet = true;
  }

  /** Retrieves the FixedAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FixedAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedAmt field
   */
   public String getFixedAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFixedAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the FixedAmt field from a formatted string
   *
   * @param _value the FixedAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedAmt field
   */
   public void setFixedAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFixedAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedAmtFromFormattedString");
   }

  /**
   * Retrieves the FixedAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedAmt field
   */
  public String getFixedAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getFixedAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the FixedAmt field value from a formatted currency string
   *
   * @param _value the FixedAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedAmt field
   */
  public void setFixedAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFixedAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @return BigInteger the value
   */
  public BigInteger getFixedAmt () {
    return this.FixedAmt;
  }
  /** Change the field to not being actively set: FixedAmt (TAX_RATES_VAT.fixed_amt)
   */
  public void unsetFixedAmt () {
    this._FixedAmtSet = false;
  }
  /** See if the field is actively set: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetFixedAmt () {
    return this._FixedAmtSet;
  }
  /** set the fields value: Rate (TAX_RATES_VAT.rate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Rate") 
  public void setRate (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Rate", "setRate");
    }
    this.Rate = value;
    this._RateSet = true;
  }

  /** Retrieves the Rate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Rate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Rate field
   */
   public String getRateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateAsFormattedString");
       return fmtMgr.formatNumber(this.getRate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Rate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateAsFormattedString");
       throw x;
     }
   }
  /** Sets the Rate field from a formatted string
   *
   * @param _value the Rate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Rate field
   */
   public void setRateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRate(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Rate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateFromFormattedString");
   }

  /** get the value of the field: Rate (TAX_RATES_VAT.rate)
   * @return Integer the value
   */
  public Integer getRate () {
    return this.Rate;
  }
  /** Change the field to not being actively set: Rate (TAX_RATES_VAT.rate)
   */
  public void unsetRate () {
    this._RateSet = false;
  }
  /** See if the field is actively set: Rate (TAX_RATES_VAT.rate)
   * @return boolean whether the field is actively set
   */
  public boolean issetRate () {
    return this._RateSet;
  }
  /** set the fields value: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDate") 
  public void setInactiveDate (Date value) throws ServiceException
  {
    this.InactiveDate = value;
    this._InactiveDateSet = true;
  }

  /** Retrieves the InactiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
   public String getInactiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDate field from a formatted string
   *
   * @param _value the InactiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
   public void setInactiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFromFormattedString");
   }

  /**
   * Retrieves the InactiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
  public String getInactiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDate field value from a formatted date/time string
   *
   * @param _value the InactiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
  public void setInactiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (TAX_RATES_VAT.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxTypeCode") 
  public void setTaxTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxTypeCode", "setTaxTypeCode");
    }
    this.TaxTypeCode = value;
    this._TaxTypeCodeSet = true;
  }

  /** Retrieves the TaxTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeCode field
   */
   public String getTaxTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxTypeCode field from a formatted string
   *
   * @param _value the TaxTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxTypeCode field
   */
   public void setTaxTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeCodeFromFormattedString");
   }

  /** get the value of the field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @return Integer the value
   */
  public Integer getTaxTypeCode () {
    return this.TaxTypeCode;
  }
  /** Change the field to not being actively set: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   */
  public void unsetTaxTypeCode () {
    this._TaxTypeCodeSet = false;
  }
  /** See if the field is actively set: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxTypeCode () {
    return this._TaxTypeCodeSet;
  }
  /** set the fields value: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return TaxRatesVatObjectHelper.toMap(this, null).toString();
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
  /** TAX_RATES_VAT.fixed_amt field */
    if(!nonNullOnly || (FixedAmt != null))  _FixedAmtSet = flag;
  /** TAX_RATES_VAT.rate field */
    if(!nonNullOnly || (Rate != null))  _RateSet = flag;
  /** TAX_RATES_VAT.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** TAX_RATES_VAT.tax_type_code field */
    if(!nonNullOnly || (TaxTypeCode != null))  _TaxTypeCodeSet = flag;
  /** TAX_RATES_VAT.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
