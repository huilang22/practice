/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillCycleObjectKeyData.java
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

/** BillCycleObject's Key Data class. */
public class BillCycleObjectKeyData  extends BaseObjectData
{
  /** BILL_CYCLE.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** BILL_CYCLE.ppdd_date field */
  public    Date PpddDate  = null;
  protected boolean _PpddDateSet = false;
  private String _objName = "BillCycleObjectKeyData";
  /** default constructor */
  public BillCycleObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public BillCycleObjectKeyData (BillCycleObjectKeyData other)
  {
    if (other == null) return;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.PpddDate = other.PpddDate;
    this._PpddDateSet = other._PpddDateSet;
  }
  /** set the fields value: BillPeriod (BILL_CYCLE.bill_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillPeriod") 
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
    this.BillPeriod = value;
    this._BillPeriodSet = true;
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

  /** get the value of the field: BillPeriod (BILL_CYCLE.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (BILL_CYCLE.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: PpddDate (BILL_CYCLE.ppdd_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PpddDate") 
  public void setPpddDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PpddDate", "setPpddDate");
    }
    this.PpddDate = value;
    this._PpddDateSet = true;
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

  /** get the value of the field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return Date the value
   */
  public Date getPpddDate () {
    return this.PpddDate;
  }
  /** Change the field to not being actively set: PpddDate (BILL_CYCLE.ppdd_date)
   */
  public void unsetPpddDate () {
    this._PpddDateSet = false;
  }
  /** See if the field is actively set: PpddDate (BILL_CYCLE.ppdd_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPpddDate () {
    return this._PpddDateSet;
  }
  public String toString() {
    return BillCycleObjectKeyHelper.toMap(this, null).toString();
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
    
  /** BILL_CYCLE.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** BILL_CYCLE.ppdd_date field */
    if(!nonNullOnly || (PpddDate != null))  _PpddDateSet = flag;
  }
}
