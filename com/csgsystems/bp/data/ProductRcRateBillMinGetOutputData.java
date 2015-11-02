/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateBillMinGetOutputData.java
 * Definition File: Customer/ProductRcRate.xml
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

/** class to support methods which have more than one output field. */
@XmlRootElement(namespace ="http://.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ProductRcRateBillMinGetOutputData implements ArubaObjectData, Serializable
{
  /** OutPRRMDMinCutOffDate field */
  public    Date OutPRRMDMinCutOffDate  = null;
  protected boolean _OutPRRMDMinCutOffDateSet = false;
  /** OutPRRMDDateCount field */
  public    Integer OutPRRMDDateCount  = null;
  protected boolean _OutPRRMDDateCountSet = false;
  private String _objName = "ProductRcRateBillMinGetOutputData";
  /** default constructor */
  public ProductRcRateBillMinGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public ProductRcRateBillMinGetOutputData (ProductRcRateBillMinGetOutputData other)
  {
    if (other == null) return;
    this.OutPRRMDMinCutOffDate = other.OutPRRMDMinCutOffDate;
    this._OutPRRMDMinCutOffDateSet = other._OutPRRMDMinCutOffDateSet;
    this.OutPRRMDDateCount = other.OutPRRMDDateCount;
    this._OutPRRMDDateCountSet = other._OutPRRMDDateCountSet;
  }
  /** set the fields value: OutPRRMDMinCutOffDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setOutPRRMDMinCutOffDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OutPRRMDMinCutOffDate", "setOutPRRMDMinCutOffDate");
    }
    this.OutPRRMDMinCutOffDate = value;
    this._OutPRRMDMinCutOffDateSet = true;
  }
  /** get the value of the field: OutPRRMDMinCutOffDate
   * @return Date the value
   */
  public Date getOutPRRMDMinCutOffDate ()
  {
    return this.OutPRRMDMinCutOffDate;
  }
  /** Change the field to not being actively set: OutPRRMDMinCutOffDate
   */
  public void unsetOutPRRMDMinCutOffDate ()
  {
    this._OutPRRMDMinCutOffDateSet = false;
  }
  /** See if the field is actively set: OutPRRMDMinCutOffDate
   * @return boolean whether the field is actively set
   */
  public boolean issetOutPRRMDMinCutOffDate ()
  {
    return this._OutPRRMDMinCutOffDateSet;
  }

  /** Retrieves the OutPRRMDMinCutOffDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OutPRRMDMinCutOffDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OutPRRMDMinCutOffDate field
   */
   public String getOutPRRMDMinCutOffDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOutPRRMDMinCutOffDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOutPRRMDMinCutOffDateAsFormattedString");
       return fmtMgr.formatDate(this.getOutPRRMDMinCutOffDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OutPRRMDMinCutOffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOutPRRMDMinCutOffDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the OutPRRMDMinCutOffDate field from a formatted string
   *
   * @param _value the OutPRRMDMinCutOffDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OutPRRMDMinCutOffDate field
   */
   public void setOutPRRMDMinCutOffDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOutPRRMDMinCutOffDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOutPRRMDMinCutOffDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OutPRRMDMinCutOffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOutPRRMDMinCutOffDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOutPRRMDMinCutOffDateFromFormattedString");
   }

  /**
   * Retrieves the OutPRRMDMinCutOffDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OutPRRMDMinCutOffDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the OutPRRMDMinCutOffDate field
   */
  public String getOutPRRMDMinCutOffDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOutPRRMDMinCutOffDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOutPRRMDMinCutOffDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getOutPRRMDMinCutOffDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OutPRRMDMinCutOffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOutPRRMDMinCutOffDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the OutPRRMDMinCutOffDate field value from a formatted date/time string
   *
   * @param _value the OutPRRMDMinCutOffDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OutPRRMDMinCutOffDate field
   */
  public void setOutPRRMDMinCutOffDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOutPRRMDMinCutOffDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setOutPRRMDMinCutOffDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OutPRRMDMinCutOffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOutPRRMDMinCutOffDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: OutPRRMDDateCount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setOutPRRMDDateCount (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OutPRRMDDateCount", "setOutPRRMDDateCount");
    }
    this.OutPRRMDDateCount = value;
    this._OutPRRMDDateCountSet = true;
  }
  /** get the value of the field: OutPRRMDDateCount
   * @return Integer the value
   */
  public Integer getOutPRRMDDateCount ()
  {
    return this.OutPRRMDDateCount;
  }
  /** Change the field to not being actively set: OutPRRMDDateCount
   */
  public void unsetOutPRRMDDateCount ()
  {
    this._OutPRRMDDateCountSet = false;
  }
  /** See if the field is actively set: OutPRRMDDateCount
   * @return boolean whether the field is actively set
   */
  public boolean issetOutPRRMDDateCount ()
  {
    return this._OutPRRMDDateCountSet;
  }

  /** Retrieves the OutPRRMDDateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OutPRRMDDateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OutPRRMDDateCount field
   */
   public String getOutPRRMDDateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOutPRRMDDateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOutPRRMDDateCountAsFormattedString");
       return fmtMgr.formatNumber(this.getOutPRRMDDateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OutPRRMDDateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOutPRRMDDateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the OutPRRMDDateCount field from a formatted string
   *
   * @param _value the OutPRRMDDateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OutPRRMDDateCount field
   */
   public void setOutPRRMDDateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOutPRRMDDateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOutPRRMDDateCount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OutPRRMDDateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOutPRRMDDateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOutPRRMDDateCountFromFormattedString");
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
    
  /** OutPRRMDMinCutOffDate field */
    if (!nonNullOnly || (OutPRRMDMinCutOffDate != null)) _OutPRRMDMinCutOffDateSet = flag;
  /** OutPRRMDDateCount field */
    if (!nonNullOnly || (OutPRRMDDateCount != null)) _OutPRRMDDateCountSet = flag;
  }
}
