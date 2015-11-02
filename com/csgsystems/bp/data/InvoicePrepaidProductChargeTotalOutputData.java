/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePrepaidProductChargeTotalOutputData.java
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
public class InvoicePrepaidProductChargeTotalOutputData implements ArubaObjectData, Serializable
{
  /** PrepaidTotalProductAmount field */
  public    BigInteger PrepaidTotalProductAmount  = null;
  protected boolean _PrepaidTotalProductAmountSet = false;
  /** PrepaidTotalChargeAmount field */
  public    BigInteger PrepaidTotalChargeAmount  = null;
  protected boolean _PrepaidTotalChargeAmountSet = false;
  /** PrepaidTotalAdjustmentAmount field */
  public    BigInteger PrepaidTotalAdjustmentAmount  = null;
  protected boolean _PrepaidTotalAdjustmentAmountSet = false;
  /** PrepaidTotalPaymentAmount field */
  public    BigInteger PrepaidTotalPaymentAmount  = null;
  protected boolean _PrepaidTotalPaymentAmountSet = false;
  private String _objName = "InvoicePrepaidProductChargeTotalOutputData";
  /** default constructor */
  public InvoicePrepaidProductChargeTotalOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public InvoicePrepaidProductChargeTotalOutputData (InvoicePrepaidProductChargeTotalOutputData other)
  {
    if (other == null) return;
    this.PrepaidTotalProductAmount = other.PrepaidTotalProductAmount;
    this._PrepaidTotalProductAmountSet = other._PrepaidTotalProductAmountSet;
    this.PrepaidTotalChargeAmount = other.PrepaidTotalChargeAmount;
    this._PrepaidTotalChargeAmountSet = other._PrepaidTotalChargeAmountSet;
    this.PrepaidTotalAdjustmentAmount = other.PrepaidTotalAdjustmentAmount;
    this._PrepaidTotalAdjustmentAmountSet = other._PrepaidTotalAdjustmentAmountSet;
    this.PrepaidTotalPaymentAmount = other.PrepaidTotalPaymentAmount;
    this._PrepaidTotalPaymentAmountSet = other._PrepaidTotalPaymentAmountSet;
  }
  /** set the fields value: PrepaidTotalProductAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrepaidTotalProductAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaidTotalProductAmount", "setPrepaidTotalProductAmount");
    }
    this.PrepaidTotalProductAmount = value;
    this._PrepaidTotalProductAmountSet = true;
  }
  /** get the value of the field: PrepaidTotalProductAmount
   * @return BigInteger the value
   */
  public BigInteger getPrepaidTotalProductAmount ()
  {
    return this.PrepaidTotalProductAmount;
  }
  /** Change the field to not being actively set: PrepaidTotalProductAmount
   */
  public void unsetPrepaidTotalProductAmount ()
  {
    this._PrepaidTotalProductAmountSet = false;
  }
  /** See if the field is actively set: PrepaidTotalProductAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaidTotalProductAmount ()
  {
    return this._PrepaidTotalProductAmountSet;
  }

  /** Retrieves the PrepaidTotalProductAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaidTotalProductAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaidTotalProductAmount field
   */
   public String getPrepaidTotalProductAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalProductAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaidTotalProductAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrepaidTotalProductAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalProductAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaidTotalProductAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaidTotalProductAmount field from a formatted string
   *
   * @param _value the PrepaidTotalProductAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaidTotalProductAmount field
   */
   public void setPrepaidTotalProductAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalProductAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaidTotalProductAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalProductAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaidTotalProductAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaidTotalProductAmountFromFormattedString");
   }

  /** set the fields value: PrepaidTotalChargeAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrepaidTotalChargeAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaidTotalChargeAmount", "setPrepaidTotalChargeAmount");
    }
    this.PrepaidTotalChargeAmount = value;
    this._PrepaidTotalChargeAmountSet = true;
  }
  /** get the value of the field: PrepaidTotalChargeAmount
   * @return BigInteger the value
   */
  public BigInteger getPrepaidTotalChargeAmount ()
  {
    return this.PrepaidTotalChargeAmount;
  }
  /** Change the field to not being actively set: PrepaidTotalChargeAmount
   */
  public void unsetPrepaidTotalChargeAmount ()
  {
    this._PrepaidTotalChargeAmountSet = false;
  }
  /** See if the field is actively set: PrepaidTotalChargeAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaidTotalChargeAmount ()
  {
    return this._PrepaidTotalChargeAmountSet;
  }

  /** Retrieves the PrepaidTotalChargeAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaidTotalChargeAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaidTotalChargeAmount field
   */
   public String getPrepaidTotalChargeAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalChargeAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaidTotalChargeAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrepaidTotalChargeAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalChargeAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaidTotalChargeAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaidTotalChargeAmount field from a formatted string
   *
   * @param _value the PrepaidTotalChargeAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaidTotalChargeAmount field
   */
   public void setPrepaidTotalChargeAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalChargeAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaidTotalChargeAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalChargeAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaidTotalChargeAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaidTotalChargeAmountFromFormattedString");
   }

  /** set the fields value: PrepaidTotalAdjustmentAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrepaidTotalAdjustmentAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaidTotalAdjustmentAmount", "setPrepaidTotalAdjustmentAmount");
    }
    this.PrepaidTotalAdjustmentAmount = value;
    this._PrepaidTotalAdjustmentAmountSet = true;
  }
  /** get the value of the field: PrepaidTotalAdjustmentAmount
   * @return BigInteger the value
   */
  public BigInteger getPrepaidTotalAdjustmentAmount ()
  {
    return this.PrepaidTotalAdjustmentAmount;
  }
  /** Change the field to not being actively set: PrepaidTotalAdjustmentAmount
   */
  public void unsetPrepaidTotalAdjustmentAmount ()
  {
    this._PrepaidTotalAdjustmentAmountSet = false;
  }
  /** See if the field is actively set: PrepaidTotalAdjustmentAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaidTotalAdjustmentAmount ()
  {
    return this._PrepaidTotalAdjustmentAmountSet;
  }

  /** Retrieves the PrepaidTotalAdjustmentAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaidTotalAdjustmentAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaidTotalAdjustmentAmount field
   */
   public String getPrepaidTotalAdjustmentAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalAdjustmentAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaidTotalAdjustmentAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrepaidTotalAdjustmentAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalAdjustmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaidTotalAdjustmentAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaidTotalAdjustmentAmount field from a formatted string
   *
   * @param _value the PrepaidTotalAdjustmentAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaidTotalAdjustmentAmount field
   */
   public void setPrepaidTotalAdjustmentAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalAdjustmentAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaidTotalAdjustmentAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalAdjustmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaidTotalAdjustmentAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaidTotalAdjustmentAmountFromFormattedString");
   }

  /** set the fields value: PrepaidTotalPaymentAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrepaidTotalPaymentAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaidTotalPaymentAmount", "setPrepaidTotalPaymentAmount");
    }
    this.PrepaidTotalPaymentAmount = value;
    this._PrepaidTotalPaymentAmountSet = true;
  }
  /** get the value of the field: PrepaidTotalPaymentAmount
   * @return BigInteger the value
   */
  public BigInteger getPrepaidTotalPaymentAmount ()
  {
    return this.PrepaidTotalPaymentAmount;
  }
  /** Change the field to not being actively set: PrepaidTotalPaymentAmount
   */
  public void unsetPrepaidTotalPaymentAmount ()
  {
    this._PrepaidTotalPaymentAmountSet = false;
  }
  /** See if the field is actively set: PrepaidTotalPaymentAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaidTotalPaymentAmount ()
  {
    return this._PrepaidTotalPaymentAmountSet;
  }

  /** Retrieves the PrepaidTotalPaymentAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaidTotalPaymentAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaidTotalPaymentAmount field
   */
   public String getPrepaidTotalPaymentAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalPaymentAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaidTotalPaymentAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrepaidTotalPaymentAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalPaymentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaidTotalPaymentAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaidTotalPaymentAmount field from a formatted string
   *
   * @param _value the PrepaidTotalPaymentAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaidTotalPaymentAmount field
   */
   public void setPrepaidTotalPaymentAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaidTotalPaymentAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaidTotalPaymentAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaidTotalPaymentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaidTotalPaymentAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaidTotalPaymentAmountFromFormattedString");
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
    
  /** PrepaidTotalProductAmount field */
    if (!nonNullOnly || (PrepaidTotalProductAmount != null)) _PrepaidTotalProductAmountSet = flag;
  /** PrepaidTotalChargeAmount field */
    if (!nonNullOnly || (PrepaidTotalChargeAmount != null)) _PrepaidTotalChargeAmountSet = flag;
  /** PrepaidTotalAdjustmentAmount field */
    if (!nonNullOnly || (PrepaidTotalAdjustmentAmount != null)) _PrepaidTotalAdjustmentAmountSet = flag;
  /** PrepaidTotalPaymentAmount field */
    if (!nonNullOnly || (PrepaidTotalPaymentAmount != null)) _PrepaidTotalPaymentAmountSet = flag;
  }
}
