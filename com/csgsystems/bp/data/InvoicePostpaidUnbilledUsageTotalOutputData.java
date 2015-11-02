/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePostpaidUnbilledUsageTotalOutputData.java
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
public class InvoicePostpaidUnbilledUsageTotalOutputData implements ArubaObjectData, Serializable
{
  /** TotalPostpaidUnbilledUsage field */
  public    BigInteger TotalPostpaidUnbilledUsage  = null;
  protected boolean _TotalPostpaidUnbilledUsageSet = false;
  /** SumPostpaidUnbilledUsage field */
  public    BigInteger SumPostpaidUnbilledUsage  = null;
  protected boolean _SumPostpaidUnbilledUsageSet = false;
  private String _objName = "InvoicePostpaidUnbilledUsageTotalOutputData";
  /** default constructor */
  public InvoicePostpaidUnbilledUsageTotalOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public InvoicePostpaidUnbilledUsageTotalOutputData (InvoicePostpaidUnbilledUsageTotalOutputData other)
  {
    if (other == null) return;
    this.TotalPostpaidUnbilledUsage = other.TotalPostpaidUnbilledUsage;
    this._TotalPostpaidUnbilledUsageSet = other._TotalPostpaidUnbilledUsageSet;
    this.SumPostpaidUnbilledUsage = other.SumPostpaidUnbilledUsage;
    this._SumPostpaidUnbilledUsageSet = other._SumPostpaidUnbilledUsageSet;
  }
  /** set the fields value: TotalPostpaidUnbilledUsage
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTotalPostpaidUnbilledUsage (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalPostpaidUnbilledUsage", "setTotalPostpaidUnbilledUsage");
    }
    this.TotalPostpaidUnbilledUsage = value;
    this._TotalPostpaidUnbilledUsageSet = true;
  }
  /** get the value of the field: TotalPostpaidUnbilledUsage
   * @return BigInteger the value
   */
  public BigInteger getTotalPostpaidUnbilledUsage ()
  {
    return this.TotalPostpaidUnbilledUsage;
  }
  /** Change the field to not being actively set: TotalPostpaidUnbilledUsage
   */
  public void unsetTotalPostpaidUnbilledUsage ()
  {
    this._TotalPostpaidUnbilledUsageSet = false;
  }
  /** See if the field is actively set: TotalPostpaidUnbilledUsage
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalPostpaidUnbilledUsage ()
  {
    return this._TotalPostpaidUnbilledUsageSet;
  }

  /** Retrieves the TotalPostpaidUnbilledUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalPostpaidUnbilledUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPostpaidUnbilledUsage field
   */
   public String getTotalPostpaidUnbilledUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPostpaidUnbilledUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPostpaidUnbilledUsageAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalPostpaidUnbilledUsage(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPostpaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPostpaidUnbilledUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalPostpaidUnbilledUsage field from a formatted string
   *
   * @param _value the TotalPostpaidUnbilledUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalPostpaidUnbilledUsage field
   */
   public void setTotalPostpaidUnbilledUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPostpaidUnbilledUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalPostpaidUnbilledUsage(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPostpaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPostpaidUnbilledUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPostpaidUnbilledUsageFromFormattedString");
   }

  /** set the fields value: SumPostpaidUnbilledUsage
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSumPostpaidUnbilledUsage (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SumPostpaidUnbilledUsage", "setSumPostpaidUnbilledUsage");
    }
    this.SumPostpaidUnbilledUsage = value;
    this._SumPostpaidUnbilledUsageSet = true;
  }
  /** get the value of the field: SumPostpaidUnbilledUsage
   * @return BigInteger the value
   */
  public BigInteger getSumPostpaidUnbilledUsage ()
  {
    return this.SumPostpaidUnbilledUsage;
  }
  /** Change the field to not being actively set: SumPostpaidUnbilledUsage
   */
  public void unsetSumPostpaidUnbilledUsage ()
  {
    this._SumPostpaidUnbilledUsageSet = false;
  }
  /** See if the field is actively set: SumPostpaidUnbilledUsage
   * @return boolean whether the field is actively set
   */
  public boolean issetSumPostpaidUnbilledUsage ()
  {
    return this._SumPostpaidUnbilledUsageSet;
  }

  /** Retrieves the SumPostpaidUnbilledUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SumPostpaidUnbilledUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SumPostpaidUnbilledUsage field
   */
   public String getSumPostpaidUnbilledUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSumPostpaidUnbilledUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSumPostpaidUnbilledUsageAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSumPostpaidUnbilledUsage(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SumPostpaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSumPostpaidUnbilledUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the SumPostpaidUnbilledUsage field from a formatted string
   *
   * @param _value the SumPostpaidUnbilledUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SumPostpaidUnbilledUsage field
   */
   public void setSumPostpaidUnbilledUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSumPostpaidUnbilledUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSumPostpaidUnbilledUsage(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SumPostpaidUnbilledUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSumPostpaidUnbilledUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSumPostpaidUnbilledUsageFromFormattedString");
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
    
  /** TotalPostpaidUnbilledUsage field */
    if (!nonNullOnly || (TotalPostpaidUnbilledUsage != null)) _TotalPostpaidUnbilledUsageSet = flag;
  /** SumPostpaidUnbilledUsage field */
    if (!nonNullOnly || (SumPostpaidUnbilledUsage != null)) _SumPostpaidUnbilledUsageSet = flag;
  }
}
