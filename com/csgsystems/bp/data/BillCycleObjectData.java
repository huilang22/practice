/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillCycleObjectData.java
 * Definition File: Admin/BillCycle.xml
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
  
/** BillCycleObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BillCycleObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public BillCycleObjectKeyData Key = null;
  /** BILL_CYCLE.billing_frequency field */
  public    Integer BillingFrequency  = null;
  protected boolean _BillingFrequencySet = false;
  /** BILL_CYCLE.next_ppdd_date field */
  public    Date NextPpddDate  = null;
  protected boolean _NextPpddDateSet = false;
  /** BILL_CYCLE.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** BILL_CYCLE.cutoff_date field */
  public    Date CutoffDate  = null;
  protected boolean _CutoffDateSet = false;
  /** BILL_CYCLE.prep_delay field */
  public    Integer PrepDelay  = null;
  protected boolean _PrepDelaySet = false;
  /** BILL_CYCLE.prep_date field */
  public    Date PrepDate  = null;
  protected boolean _PrepDateSet = false;
  /** BILL_CYCLE.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "BillCycleObjectData";
  /** Default constructor */
  public BillCycleObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BillCycleObjectData (BillCycleObjectData other)
  {

    if (other == null) return;
    this.Key = new BillCycleObjectKeyData (other.Key);
    this.BillingFrequency = other.BillingFrequency;
    this._BillingFrequencySet = other._BillingFrequencySet;
    this.NextPpddDate = other.NextPpddDate;
    this._NextPpddDateSet = other._NextPpddDateSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.CutoffDate = other.CutoffDate;
    this._CutoffDateSet = other._CutoffDateSet;
    this.PrepDelay = other.PrepDelay;
    this._PrepDelaySet = other._PrepDelaySet;
    this.PrepDate = other.PrepDate;
    this._PrepDateSet = other._PrepDateSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return BillCycleObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public BillCycleObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (BillCycleObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BillPeriod (BILL_CYCLE.bill_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillPeriod (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillPeriod", "setBillPeriod");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillPeriod", "setBillPeriod");
    }
    if (this.Key == null) this.Key = new BillCycleObjectKeyData ();
    this.Key.BillPeriod = value;
    this.Key._BillPeriodSet = true;
  }
  /** get the value of the field: BillPeriod (BILL_CYCLE.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    if (this.Key == null) return null;
    return this.Key.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (BILL_CYCLE.bill_period)
   */
  public void unsetBillPeriod () {
    if (this.Key == null) return;
    this.Key._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    if (this.Key == null) return false;
    return this.Key._BillPeriodSet;
  }

  /** Retrieves the BillPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriod field
   */
   public String getBillPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodAsFormattedString");
       return fmtMgr.formatString(this.getBillPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillPeriod field from a formatted string
   *
   * @param _value the BillPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillPeriod field
   */
   public void setBillPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillPeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFromFormattedString");
   }

  /** set the fields value: PpddDate (BILL_CYCLE.ppdd_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPpddDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PpddDate", "setPpddDate");
    }
    if (this.Key == null) this.Key = new BillCycleObjectKeyData ();
    this.Key.PpddDate = value;
    this.Key._PpddDateSet = true;
  }
  /** get the value of the field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return Date the value
   */
  public Date getPpddDate () {
    if (this.Key == null) return null;
    return this.Key.PpddDate;
  }
  /** Change the field to not being actively set: PpddDate (BILL_CYCLE.ppdd_date)
   */
  public void unsetPpddDate () {
    if (this.Key == null) return;
    this.Key._PpddDateSet = false;
  }
  /** See if the field is actively set: PpddDate (BILL_CYCLE.ppdd_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPpddDate () {
    if (this.Key == null) return false;
    return this.Key._PpddDateSet;
  }

  /** Retrieves the PpddDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PpddDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PpddDate field
   */
   public String getPpddDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPpddDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPpddDateAsFormattedString");
       return fmtMgr.formatDate(this.getPpddDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PpddDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPpddDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PpddDate field from a formatted string
   *
   * @param _value the PpddDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PpddDate field
   */
   public void setPpddDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPpddDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPpddDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PpddDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPpddDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPpddDateFromFormattedString");
   }

  /**
   * Retrieves the PpddDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PpddDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PpddDate field
   */
  public String getPpddDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPpddDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPpddDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPpddDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PpddDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPpddDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PpddDate field value from a formatted date/time string
   *
   * @param _value the PpddDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PpddDate field
   */
  public void setPpddDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPpddDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPpddDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PpddDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPpddDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: BillingFrequency (BILL_CYCLE.billing_frequency)
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

  /** get the value of the field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @return Integer the value
   */
  public Integer getBillingFrequency () {
    return this.BillingFrequency;
  }
  /** Change the field to not being actively set: BillingFrequency (BILL_CYCLE.billing_frequency)
   */
  public void unsetBillingFrequency () {
    this._BillingFrequencySet = false;
  }
  /** See if the field is actively set: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingFrequency () {
    return this._BillingFrequencySet;
  }
  /** set the fields value: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NextPpddDate") 
  public void setNextPpddDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NextPpddDate", "setNextPpddDate");
    }
    this.NextPpddDate = value;
    this._NextPpddDateSet = true;
  }

  /** Retrieves the NextPpddDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NextPpddDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextPpddDate field
   */
   public String getNextPpddDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextPpddDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextPpddDateAsFormattedString");
       return fmtMgr.formatDate(this.getNextPpddDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextPpddDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextPpddDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the NextPpddDate field from a formatted string
   *
   * @param _value the NextPpddDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextPpddDate field
   */
   public void setNextPpddDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextPpddDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNextPpddDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextPpddDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextPpddDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextPpddDateFromFormattedString");
   }

  /**
   * Retrieves the NextPpddDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextPpddDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextPpddDate field
   */
  public String getNextPpddDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextPpddDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextPpddDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getNextPpddDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextPpddDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextPpddDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextPpddDate field value from a formatted date/time string
   *
   * @param _value the NextPpddDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextPpddDate field
   */
  public void setNextPpddDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextPpddDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNextPpddDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextPpddDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextPpddDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @return Date the value
   */
  public Date getNextPpddDate () {
    return this.NextPpddDate;
  }
  /** Change the field to not being actively set: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   */
  public void unsetNextPpddDate () {
    this._NextPpddDateSet = false;
  }
  /** See if the field is actively set: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetNextPpddDate () {
    return this._NextPpddDateSet;
  }
  /** set the fields value: StatementDate (BILL_CYCLE.statement_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatementDate") 
  public void setStatementDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatementDate", "setStatementDate");
    }
    this.StatementDate = value;
    this._StatementDateSet = true;
  }

  /** Retrieves the StatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
   public String getStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementDate field from a formatted string
   *
   * @param _value the StatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
   public void setStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFromFormattedString");
   }

  /**
   * Retrieves the StatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
  public String getStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDate field value from a formatted date/time string
   *
   * @param _value the StatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
  public void setStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StatementDate (BILL_CYCLE.statement_date)
   * @return Date the value
   */
  public Date getStatementDate () {
    return this.StatementDate;
  }
  /** Change the field to not being actively set: StatementDate (BILL_CYCLE.statement_date)
   */
  public void unsetStatementDate () {
    this._StatementDateSet = false;
  }
  /** See if the field is actively set: StatementDate (BILL_CYCLE.statement_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementDate () {
    return this._StatementDateSet;
  }
  /** set the fields value: CutoffDate (BILL_CYCLE.cutoff_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CutoffDate") 
  public void setCutoffDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CutoffDate", "setCutoffDate");
    }
    this.CutoffDate = value;
    this._CutoffDateSet = true;
  }

  /** Retrieves the CutoffDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CutoffDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CutoffDate field
   */
   public String getCutoffDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCutoffDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCutoffDateAsFormattedString");
       return fmtMgr.formatDate(this.getCutoffDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCutoffDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CutoffDate field from a formatted string
   *
   * @param _value the CutoffDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CutoffDate field
   */
   public void setCutoffDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCutoffDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCutoffDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCutoffDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCutoffDateFromFormattedString");
   }

  /**
   * Retrieves the CutoffDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CutoffDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CutoffDate field
   */
  public String getCutoffDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCutoffDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCutoffDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCutoffDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCutoffDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CutoffDate field value from a formatted date/time string
   *
   * @param _value the CutoffDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CutoffDate field
   */
  public void setCutoffDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCutoffDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCutoffDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCutoffDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CutoffDate (BILL_CYCLE.cutoff_date)
   * @return Date the value
   */
  public Date getCutoffDate () {
    return this.CutoffDate;
  }
  /** Change the field to not being actively set: CutoffDate (BILL_CYCLE.cutoff_date)
   */
  public void unsetCutoffDate () {
    this._CutoffDateSet = false;
  }
  /** See if the field is actively set: CutoffDate (BILL_CYCLE.cutoff_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetCutoffDate () {
    return this._CutoffDateSet;
  }
  /** set the fields value: PrepDelay (BILL_CYCLE.prep_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepDelay") 
  public void setPrepDelay (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepDelay", "setPrepDelay");
    }
    this.PrepDelay = value;
    this._PrepDelaySet = true;
  }

  /** Retrieves the PrepDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDelay field
   */
   public String getPrepDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepDelay field from a formatted string
   *
   * @param _value the PrepDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDelay field
   */
   public void setPrepDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDelayFromFormattedString");
   }

  /** get the value of the field: PrepDelay (BILL_CYCLE.prep_delay)
   * @return Integer the value
   */
  public Integer getPrepDelay () {
    return this.PrepDelay;
  }
  /** Change the field to not being actively set: PrepDelay (BILL_CYCLE.prep_delay)
   */
  public void unsetPrepDelay () {
    this._PrepDelaySet = false;
  }
  /** See if the field is actively set: PrepDelay (BILL_CYCLE.prep_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepDelay () {
    return this._PrepDelaySet;
  }
  /** set the fields value: PrepDate (BILL_CYCLE.prep_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepDate") 
  public void setPrepDate (Date value) throws ServiceException
  {
    this.PrepDate = value;
    this._PrepDateSet = true;
  }

  /** Retrieves the PrepDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
   public String getPrepDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrepDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepDate field from a formatted string
   *
   * @param _value the PrepDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
   public void setPrepDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFromFormattedString");
   }

  /**
   * Retrieves the PrepDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
  public String getPrepDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrepDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDate field value from a formatted date/time string
   *
   * @param _value the PrepDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
  public void setPrepDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrepDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrepDate (BILL_CYCLE.prep_date)
   * @return Date the value
   */
  public Date getPrepDate () {
    return this.PrepDate;
  }
  /** Change the field to not being actively set: PrepDate (BILL_CYCLE.prep_date)
   */
  public void unsetPrepDate () {
    this._PrepDateSet = false;
  }
  /** See if the field is actively set: PrepDate (BILL_CYCLE.prep_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepDate () {
    return this._PrepDateSet;
  }
  /** set the fields value: ConfigTagId (BILL_CYCLE.config_tag_id)
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

  /** get the value of the field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (BILL_CYCLE.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return BillCycleObjectHelper.toMap(this, null).toString();
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
  /** BILL_CYCLE.billing_frequency field */
    if(!nonNullOnly || (BillingFrequency != null))  _BillingFrequencySet = flag;
  /** BILL_CYCLE.next_ppdd_date field */
    if(!nonNullOnly || (NextPpddDate != null))  _NextPpddDateSet = flag;
  /** BILL_CYCLE.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  /** BILL_CYCLE.cutoff_date field */
    if(!nonNullOnly || (CutoffDate != null))  _CutoffDateSet = flag;
  /** BILL_CYCLE.prep_delay field */
    if(!nonNullOnly || (PrepDelay != null))  _PrepDelaySet = flag;
  /** BILL_CYCLE.prep_date field */
    if(!nonNullOnly || (PrepDate != null))  _PrepDateSet = flag;
  /** BILL_CYCLE.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
