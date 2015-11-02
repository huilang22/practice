/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePrepaidUnbilledUsageTotalOutputData.java
 * Definition File: Customer/Invoice.xml
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
public class InvoicePrepaidUnbilledUsageTotalOutputData implements ArubaObjectData, Serializable
{
  /** TotalPrepaidUnbilledUsage field */
  public    BigInteger TotalPrepaidUnbilledUsage  = null;
  protected boolean _TotalPrepaidUnbilledUsageSet = false;
  /** SumPrepaidUnbilledUsage field */
  public    BigInteger SumPrepaidUnbilledUsage  = null;
  protected boolean _SumPrepaidUnbilledUsageSet = false;
  private String _objName = "InvoicePrepaidUnbilledUsageTotalOutputData";
  /** default constructor */
  public InvoicePrepaidUnbilledUsageTotalOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public InvoicePrepaidUnbilledUsageTotalOutputData (InvoicePrepaidUnbilledUsageTotalOutputData other)
  {
    if (other == null) return;
    this.TotalPrepaidUnbilledUsage = other.TotalPrepaidUnbilledUsage;
    this._TotalPrepaidUnbilledUsageSet = other._TotalPrepaidUnbilledUsageSet;
    this.SumPrepaidUnbilledUsage = other.SumPrepaidUnbilledUsage;
    this._SumPrepaidUnbilledUsageSet = other._SumPrepaidUnbilledUsageSet;
  }
  /** set the fields value: TotalPrepaidUnbilledUsage
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTotalPrepaidUnbilledUsage (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalPrepaidUnbilledUsage", "setTotalPrepaidUnbilledUsage");
    }
    this.TotalPrepaidUnbilledUsage = value;
    this._TotalPrepaidUnbilledUsageSet = true;
  }
  /** get the value of the field: TotalPrepaidUnbilledUsage
   * @return BigInteger the value
   */
  public BigInteger getTotalPrepaidUnbilledUsage ()
  {
    return this.TotalPrepaidUnbilledUsage;
  }
  /** Change the field to not being actively set: TotalPrepaidUnbilledUsage
   */
  public void unsetTotalPrepaidUnbilledUsage ()
  {
    this._TotalPrepaidUnbilledUsageSet = false;
  }
  /** See if the field is actively set: TotalPrepaidUnbilledUsage
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalPrepaidUnbilledUsage ()
  {
    return this._TotalPrepaidUnbilledUsageSet;
  }

  /** Retrieves the TotalPrepaidUnbilledUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalPrepaidUnbilledUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPrepaidUnbilledUsage field
   */
   public String getTotalPrepaidUnbilledUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPrepaidUnbilledUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPrepaidUnbilledUsageAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalPrepaidUnbilledUsage(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPrepaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPrepaidUnbilledUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalPrepaidUnbilledUsage field from a formatted string
   *
   * @param _value the TotalPrepaidUnbilledUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalPrepaidUnbilledUsage field
   */
   public void setTotalPrepaidUnbilledUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPrepaidUnbilledUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalPrepaidUnbilledUsage(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPrepaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPrepaidUnbilledUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPrepaidUnbilledUsageFromFormattedString");
   }

  /** set the fields value: SumPrepaidUnbilledUsage
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSumPrepaidUnbilledUsage (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SumPrepaidUnbilledUsage", "setSumPrepaidUnbilledUsage");
    }
    this.SumPrepaidUnbilledUsage = value;
    this._SumPrepaidUnbilledUsageSet = true;
  }
  /** get the value of the field: SumPrepaidUnbilledUsage
   * @return BigInteger the value
   */
  public BigInteger getSumPrepaidUnbilledUsage ()
  {
    return this.SumPrepaidUnbilledUsage;
  }
  /** Change the field to not being actively set: SumPrepaidUnbilledUsage
   */
  public void unsetSumPrepaidUnbilledUsage ()
  {
    this._SumPrepaidUnbilledUsageSet = false;
  }
  /** See if the field is actively set: SumPrepaidUnbilledUsage
   * @return boolean whether the field is actively set
   */
  public boolean issetSumPrepaidUnbilledUsage ()
  {
    return this._SumPrepaidUnbilledUsageSet;
  }

  /** Retrieves the SumPrepaidUnbilledUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SumPrepaidUnbilledUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SumPrepaidUnbilledUsage field
   */
   public String getSumPrepaidUnbilledUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSumPrepaidUnbilledUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSumPrepaidUnbilledUsageAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSumPrepaidUnbilledUsage(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SumPrepaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSumPrepaidUnbilledUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the SumPrepaidUnbilledUsage field from a formatted string
   *
   * @param _value the SumPrepaidUnbilledUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SumPrepaidUnbilledUsage field
   */
   public void setSumPrepaidUnbilledUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSumPrepaidUnbilledUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSumPrepaidUnbilledUsage(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SumPrepaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSumPrepaidUnbilledUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSumPrepaidUnbilledUsageFromFormattedString");
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
    
  /** TotalPrepaidUnbilledUsage field */
    if (!nonNullOnly || (TotalPrepaidUnbilledUsage != null)) _TotalPrepaidUnbilledUsageSet = flag;
  /** SumPrepaidUnbilledUsage field */
    if (!nonNullOnly || (SumPrepaidUnbilledUsage != null)) _SumPrepaidUnbilledUsageSet = flag;
  }
}
