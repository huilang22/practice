/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInvoiceObjectData.java
 * Definition File: Customer/OrderQuote.xml
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
  
/** BillInvoiceObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BillInvoiceObjectData extends BaseObjectData implements Serializable
{

  /** bi_charge_element object */
  public ChargeElementObjectData[] bi_charge_element = null;

  /** account_quote object */
  public AccountQuoteObjectData account_quote = null;

  /** BiBillRefno field */
  public    Integer BiBillRefno  = null;
  protected boolean _BiBillRefnoSet = false;
  /** BiBillRefResets field */
  public    Integer BiBillRefResets  = null;
  protected boolean _BiBillRefResetsSet = false;
  /** BiStatementDate field */
  public    Date BiStatementDate  = null;
  protected boolean _BiStatementDateSet = false;
  /** BiFromDate field */
  public    Date BiFromDate  = null;
  protected boolean _BiFromDateSet = false;
  /** BiToDate field */
  public    Date BiToDate  = null;
  protected boolean _BiToDateSet = false;
  private String _objName = "BillInvoiceObjectData";
  /** Default constructor */
  public BillInvoiceObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BillInvoiceObjectData (BillInvoiceObjectData other)
  {

    if (other == null) return;
    if (other.bi_charge_element != null)
    {
      this.bi_charge_element = new ChargeElementObjectData[other.bi_charge_element.length];
      for (int i = 0; other.bi_charge_element != null && i < other.bi_charge_element.length; i++)
      {
        if (other.bi_charge_element[i] != null)  this.bi_charge_element[i] = new ChargeElementObjectData (other.bi_charge_element[i]);
      }
    }

    if (other.account_quote != null)
    {
      this.account_quote = new AccountQuoteObjectData (other.account_quote);
    }

    this.BiBillRefno = other.BiBillRefno;
    this._BiBillRefnoSet = other._BiBillRefnoSet;
    this.BiBillRefResets = other.BiBillRefResets;
    this._BiBillRefResetsSet = other._BiBillRefResetsSet;
    this.BiStatementDate = other.BiStatementDate;
    this._BiStatementDateSet = other._BiStatementDateSet;
    this.BiFromDate = other.BiFromDate;
    this._BiFromDateSet = other._BiFromDateSet;
    this.BiToDate = other.BiToDate;
    this._BiToDateSet = other._BiToDateSet;
  }

  /** get the object for ChargeElementObject
   * @return BiChargeElementData[] the object
   */
  public ChargeElementObjectData[] getBiChargeElement ()
  {
    return this.bi_charge_element;
  }
  /** set the object for BiChargeElement
   * @param value the new object
   */
  public void setBiChargeElement (ChargeElementObjectData[] value)
  {
    this.bi_charge_element = value;
  }
  /** get the object for AccountQuoteObject
   * @return AccountQuoteData the object
   */
  public AccountQuoteObjectData getAccountQuote ()
  {
    return this.account_quote;
  }
  /** set the object for AccountQuote
   * @param value the new object
   */
  public void setAccountQuote (AccountQuoteObjectData value)
  {
    this.account_quote = value;
  }
  /** set the fields value: BiBillRefno
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBiBillRefno (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BiBillRefno", "setBiBillRefno");
    }
    this.BiBillRefno = value;
    this._BiBillRefnoSet = true;
  }
  /** get the value of the field: BiBillRefno
   * @return Integer the value
   */
  public Integer getBiBillRefno ()
  {
    return this.BiBillRefno;
  }
  /** Change the field to not being actively set: BiBillRefno
   */
  public void unsetBiBillRefno ()
  {
    this._BiBillRefnoSet = false;
  }
  /** See if the field is actively set: BiBillRefno
   * @return boolean whether the field is actively set
   */
  public boolean issetBiBillRefno ()
  {
    return this._BiBillRefnoSet;
  }

  /** Retrieves the BiBillRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BiBillRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiBillRefno field
   */
   public String getBiBillRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiBillRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiBillRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getBiBillRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiBillRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BiBillRefno field from a formatted string
   *
   * @param _value the BiBillRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiBillRefno field
   */
   public void setBiBillRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiBillRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBiBillRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiBillRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBiBillRefnoFromFormattedString");
   }

  /** set the fields value: BiBillRefResets
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBiBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BiBillRefResets", "setBiBillRefResets");
    }
    this.BiBillRefResets = value;
    this._BiBillRefResetsSet = true;
  }
  /** get the value of the field: BiBillRefResets
   * @return Integer the value
   */
  public Integer getBiBillRefResets ()
  {
    return this.BiBillRefResets;
  }
  /** Change the field to not being actively set: BiBillRefResets
   */
  public void unsetBiBillRefResets ()
  {
    this._BiBillRefResetsSet = false;
  }
  /** See if the field is actively set: BiBillRefResets
   * @return boolean whether the field is actively set
   */
  public boolean issetBiBillRefResets ()
  {
    return this._BiBillRefResetsSet;
  }

  /** Retrieves the BiBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BiBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiBillRefResets field
   */
   public String getBiBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBiBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BiBillRefResets field from a formatted string
   *
   * @param _value the BiBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiBillRefResets field
   */
   public void setBiBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBiBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBiBillRefResetsFromFormattedString");
   }

  /** set the fields value: BiStatementDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBiStatementDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BiStatementDate", "setBiStatementDate");
    }
    this.BiStatementDate = value;
    this._BiStatementDateSet = true;
  }
  /** get the value of the field: BiStatementDate
   * @return Date the value
   */
  public Date getBiStatementDate ()
  {
    return this.BiStatementDate;
  }
  /** Change the field to not being actively set: BiStatementDate
   */
  public void unsetBiStatementDate ()
  {
    this._BiStatementDateSet = false;
  }
  /** See if the field is actively set: BiStatementDate
   * @return boolean whether the field is actively set
   */
  public boolean issetBiStatementDate ()
  {
    return this._BiStatementDateSet;
  }

  /** Retrieves the BiStatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BiStatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiStatementDate field
   */
   public String getBiStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getBiStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiStatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BiStatementDate field from a formatted string
   *
   * @param _value the BiStatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiStatementDate field
   */
   public void setBiStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBiStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiStatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBiStatementDateFromFormattedString");
   }

  /**
   * Retrieves the BiStatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BiStatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiStatementDate field
   */
  public String getBiStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getBiStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BiStatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BiStatementDate field value from a formatted date/time string
   *
   * @param _value the BiStatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiStatementDate field
   */
  public void setBiStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBiStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBiStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BiStatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: BiFromDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBiFromDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BiFromDate", "setBiFromDate");
    }
    this.BiFromDate = value;
    this._BiFromDateSet = true;
  }
  /** get the value of the field: BiFromDate
   * @return Date the value
   */
  public Date getBiFromDate ()
  {
    return this.BiFromDate;
  }
  /** Change the field to not being actively set: BiFromDate
   */
  public void unsetBiFromDate ()
  {
    this._BiFromDateSet = false;
  }
  /** See if the field is actively set: BiFromDate
   * @return boolean whether the field is actively set
   */
  public boolean issetBiFromDate ()
  {
    return this._BiFromDateSet;
  }

  /** Retrieves the BiFromDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BiFromDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiFromDate field
   */
   public String getBiFromDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiFromDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiFromDateAsFormattedString");
       return fmtMgr.formatDate(this.getBiFromDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiFromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiFromDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BiFromDate field from a formatted string
   *
   * @param _value the BiFromDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiFromDate field
   */
   public void setBiFromDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiFromDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBiFromDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiFromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiFromDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBiFromDateFromFormattedString");
   }

  /**
   * Retrieves the BiFromDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BiFromDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiFromDate field
   */
  public String getBiFromDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiFromDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiFromDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getBiFromDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BiFromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiFromDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BiFromDate field value from a formatted date/time string
   *
   * @param _value the BiFromDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiFromDate field
   */
  public void setBiFromDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBiFromDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBiFromDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BiFromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiFromDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: BiToDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBiToDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BiToDate", "setBiToDate");
    }
    this.BiToDate = value;
    this._BiToDateSet = true;
  }
  /** get the value of the field: BiToDate
   * @return Date the value
   */
  public Date getBiToDate ()
  {
    return this.BiToDate;
  }
  /** Change the field to not being actively set: BiToDate
   */
  public void unsetBiToDate ()
  {
    this._BiToDateSet = false;
  }
  /** See if the field is actively set: BiToDate
   * @return boolean whether the field is actively set
   */
  public boolean issetBiToDate ()
  {
    return this._BiToDateSet;
  }

  /** Retrieves the BiToDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BiToDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiToDate field
   */
   public String getBiToDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiToDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiToDateAsFormattedString");
       return fmtMgr.formatDate(this.getBiToDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiToDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BiToDate field from a formatted string
   *
   * @param _value the BiToDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiToDate field
   */
   public void setBiToDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiToDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBiToDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BiToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiToDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBiToDateFromFormattedString");
   }

  /**
   * Retrieves the BiToDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BiToDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BiToDate field
   */
  public String getBiToDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBiToDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBiToDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getBiToDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BiToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBiToDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BiToDate field value from a formatted date/time string
   *
   * @param _value the BiToDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BiToDate field
   */
  public void setBiToDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBiToDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBiToDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BiToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBiToDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  public String toString() {
    return BillInvoiceObjectHelper.toMap(this, null).toString();
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
    
  /** bi_charge_element object */
  
    if (bi_charge_element != null) {
      for (int i = 0; i < bi_charge_element.length; i++) {
        if(bi_charge_element[i] != null) bi_charge_element[i].resetFlags(flag, nonNullOnly);
      }
    }
    
  /** account_quote object */
  
      if (account_quote != null) account_quote.resetFlags(flag, nonNullOnly);
    
  /** BiBillRefno field */
    if (!nonNullOnly || (BiBillRefno != null)) _BiBillRefnoSet = flag;
  /** BiBillRefResets field */
    if (!nonNullOnly || (BiBillRefResets != null)) _BiBillRefResetsSet = flag;
  /** BiStatementDate field */
    if (!nonNullOnly || (BiStatementDate != null)) _BiStatementDateSet = flag;
  /** BiFromDate field */
    if (!nonNullOnly || (BiFromDate != null)) _BiFromDateSet = flag;
  /** BiToDate field */
    if (!nonNullOnly || (BiToDate != null)) _BiToDateSet = flag;
  }
}
