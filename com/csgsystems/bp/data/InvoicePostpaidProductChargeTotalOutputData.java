/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePostpaidProductChargeTotalOutputData.java
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
public class InvoicePostpaidProductChargeTotalOutputData implements ArubaObjectData, Serializable
{
  /** PostpaidTotalProductAmount field */
  public    BigInteger PostpaidTotalProductAmount  = null;
  protected boolean _PostpaidTotalProductAmountSet = false;
  /** PostpaidTotalChargeAmount field */
  public    BigInteger PostpaidTotalChargeAmount  = null;
  protected boolean _PostpaidTotalChargeAmountSet = false;
  /** PostpaidTotalAdjustmentAmount field */
  public    BigInteger PostpaidTotalAdjustmentAmount  = null;
  protected boolean _PostpaidTotalAdjustmentAmountSet = false;
  /** PostpaidTotalPaymentAmount field */
  public    BigInteger PostpaidTotalPaymentAmount  = null;
  protected boolean _PostpaidTotalPaymentAmountSet = false;
  /** PostpaidTotalNegativePaymentAmount field */
  public    BigInteger PostpaidTotalNegativePaymentAmount  = null;
  protected boolean _PostpaidTotalNegativePaymentAmountSet = false;
  private String _objName = "InvoicePostpaidProductChargeTotalOutputData";
  /** default constructor */
  public InvoicePostpaidProductChargeTotalOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public InvoicePostpaidProductChargeTotalOutputData (InvoicePostpaidProductChargeTotalOutputData other)
  {
    if (other == null) return;
    this.PostpaidTotalProductAmount = other.PostpaidTotalProductAmount;
    this._PostpaidTotalProductAmountSet = other._PostpaidTotalProductAmountSet;
    this.PostpaidTotalChargeAmount = other.PostpaidTotalChargeAmount;
    this._PostpaidTotalChargeAmountSet = other._PostpaidTotalChargeAmountSet;
    this.PostpaidTotalAdjustmentAmount = other.PostpaidTotalAdjustmentAmount;
    this._PostpaidTotalAdjustmentAmountSet = other._PostpaidTotalAdjustmentAmountSet;
    this.PostpaidTotalPaymentAmount = other.PostpaidTotalPaymentAmount;
    this._PostpaidTotalPaymentAmountSet = other._PostpaidTotalPaymentAmountSet;
    this.PostpaidTotalNegativePaymentAmount = other.PostpaidTotalNegativePaymentAmount;
    this._PostpaidTotalNegativePaymentAmountSet = other._PostpaidTotalNegativePaymentAmountSet;
  }
  /** set the fields value: PostpaidTotalProductAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPostpaidTotalProductAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostpaidTotalProductAmount", "setPostpaidTotalProductAmount");
    }
    this.PostpaidTotalProductAmount = value;
    this._PostpaidTotalProductAmountSet = true;
  }
  /** get the value of the field: PostpaidTotalProductAmount
   * @return BigInteger the value
   */
  public BigInteger getPostpaidTotalProductAmount ()
  {
    return this.PostpaidTotalProductAmount;
  }
  /** Change the field to not being actively set: PostpaidTotalProductAmount
   */
  public void unsetPostpaidTotalProductAmount ()
  {
    this._PostpaidTotalProductAmountSet = false;
  }
  /** See if the field is actively set: PostpaidTotalProductAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPostpaidTotalProductAmount ()
  {
    return this._PostpaidTotalProductAmountSet;
  }

  /** Retrieves the PostpaidTotalProductAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostpaidTotalProductAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostpaidTotalProductAmount field
   */
   public String getPostpaidTotalProductAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalProductAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostpaidTotalProductAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPostpaidTotalProductAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalProductAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostpaidTotalProductAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostpaidTotalProductAmount field from a formatted string
   *
   * @param _value the PostpaidTotalProductAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostpaidTotalProductAmount field
   */
   public void setPostpaidTotalProductAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalProductAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostpaidTotalProductAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalProductAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostpaidTotalProductAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostpaidTotalProductAmountFromFormattedString");
   }

  /** set the fields value: PostpaidTotalChargeAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPostpaidTotalChargeAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostpaidTotalChargeAmount", "setPostpaidTotalChargeAmount");
    }
    this.PostpaidTotalChargeAmount = value;
    this._PostpaidTotalChargeAmountSet = true;
  }
  /** get the value of the field: PostpaidTotalChargeAmount
   * @return BigInteger the value
   */
  public BigInteger getPostpaidTotalChargeAmount ()
  {
    return this.PostpaidTotalChargeAmount;
  }
  /** Change the field to not being actively set: PostpaidTotalChargeAmount
   */
  public void unsetPostpaidTotalChargeAmount ()
  {
    this._PostpaidTotalChargeAmountSet = false;
  }
  /** See if the field is actively set: PostpaidTotalChargeAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPostpaidTotalChargeAmount ()
  {
    return this._PostpaidTotalChargeAmountSet;
  }

  /** Retrieves the PostpaidTotalChargeAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostpaidTotalChargeAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostpaidTotalChargeAmount field
   */
   public String getPostpaidTotalChargeAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalChargeAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostpaidTotalChargeAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPostpaidTotalChargeAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalChargeAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostpaidTotalChargeAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostpaidTotalChargeAmount field from a formatted string
   *
   * @param _value the PostpaidTotalChargeAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostpaidTotalChargeAmount field
   */
   public void setPostpaidTotalChargeAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalChargeAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostpaidTotalChargeAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalChargeAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostpaidTotalChargeAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostpaidTotalChargeAmountFromFormattedString");
   }

  /** set the fields value: PostpaidTotalAdjustmentAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPostpaidTotalAdjustmentAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostpaidTotalAdjustmentAmount", "setPostpaidTotalAdjustmentAmount");
    }
    this.PostpaidTotalAdjustmentAmount = value;
    this._PostpaidTotalAdjustmentAmountSet = true;
  }
  /** get the value of the field: PostpaidTotalAdjustmentAmount
   * @return BigInteger the value
   */
  public BigInteger getPostpaidTotalAdjustmentAmount ()
  {
    return this.PostpaidTotalAdjustmentAmount;
  }
  /** Change the field to not being actively set: PostpaidTotalAdjustmentAmount
   */
  public void unsetPostpaidTotalAdjustmentAmount ()
  {
    this._PostpaidTotalAdjustmentAmountSet = false;
  }
  /** See if the field is actively set: PostpaidTotalAdjustmentAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPostpaidTotalAdjustmentAmount ()
  {
    return this._PostpaidTotalAdjustmentAmountSet;
  }

  /** Retrieves the PostpaidTotalAdjustmentAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostpaidTotalAdjustmentAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostpaidTotalAdjustmentAmount field
   */
   public String getPostpaidTotalAdjustmentAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalAdjustmentAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostpaidTotalAdjustmentAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPostpaidTotalAdjustmentAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalAdjustmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostpaidTotalAdjustmentAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostpaidTotalAdjustmentAmount field from a formatted string
   *
   * @param _value the PostpaidTotalAdjustmentAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostpaidTotalAdjustmentAmount field
   */
   public void setPostpaidTotalAdjustmentAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalAdjustmentAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostpaidTotalAdjustmentAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalAdjustmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostpaidTotalAdjustmentAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostpaidTotalAdjustmentAmountFromFormattedString");
   }

  /** set the fields value: PostpaidTotalPaymentAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPostpaidTotalPaymentAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostpaidTotalPaymentAmount", "setPostpaidTotalPaymentAmount");
    }
    this.PostpaidTotalPaymentAmount = value;
    this._PostpaidTotalPaymentAmountSet = true;
  }
  /** get the value of the field: PostpaidTotalPaymentAmount
   * @return BigInteger the value
   */
  public BigInteger getPostpaidTotalPaymentAmount ()
  {
    return this.PostpaidTotalPaymentAmount;
  }
  /** Change the field to not being actively set: PostpaidTotalPaymentAmount
   */
  public void unsetPostpaidTotalPaymentAmount ()
  {
    this._PostpaidTotalPaymentAmountSet = false;
  }
  /** See if the field is actively set: PostpaidTotalPaymentAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPostpaidTotalPaymentAmount ()
  {
    return this._PostpaidTotalPaymentAmountSet;
  }

  /** Retrieves the PostpaidTotalPaymentAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostpaidTotalPaymentAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostpaidTotalPaymentAmount field
   */
   public String getPostpaidTotalPaymentAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalPaymentAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostpaidTotalPaymentAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPostpaidTotalPaymentAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalPaymentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostpaidTotalPaymentAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostpaidTotalPaymentAmount field from a formatted string
   *
   * @param _value the PostpaidTotalPaymentAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostpaidTotalPaymentAmount field
   */
   public void setPostpaidTotalPaymentAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalPaymentAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostpaidTotalPaymentAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalPaymentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostpaidTotalPaymentAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostpaidTotalPaymentAmountFromFormattedString");
   }

  /** set the fields value: PostpaidTotalNegativePaymentAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPostpaidTotalNegativePaymentAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostpaidTotalNegativePaymentAmount", "setPostpaidTotalNegativePaymentAmount");
    }
    this.PostpaidTotalNegativePaymentAmount = value;
    this._PostpaidTotalNegativePaymentAmountSet = true;
  }
  /** get the value of the field: PostpaidTotalNegativePaymentAmount
   * @return BigInteger the value
   */
  public BigInteger getPostpaidTotalNegativePaymentAmount ()
  {
    return this.PostpaidTotalNegativePaymentAmount;
  }
  /** Change the field to not being actively set: PostpaidTotalNegativePaymentAmount
   */
  public void unsetPostpaidTotalNegativePaymentAmount ()
  {
    this._PostpaidTotalNegativePaymentAmountSet = false;
  }
  /** See if the field is actively set: PostpaidTotalNegativePaymentAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetPostpaidTotalNegativePaymentAmount ()
  {
    return this._PostpaidTotalNegativePaymentAmountSet;
  }

  /** Retrieves the PostpaidTotalNegativePaymentAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostpaidTotalNegativePaymentAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostpaidTotalNegativePaymentAmount field
   */
   public String getPostpaidTotalNegativePaymentAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalNegativePaymentAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostpaidTotalNegativePaymentAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPostpaidTotalNegativePaymentAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalNegativePaymentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostpaidTotalNegativePaymentAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostpaidTotalNegativePaymentAmount field from a formatted string
   *
   * @param _value the PostpaidTotalNegativePaymentAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostpaidTotalNegativePaymentAmount field
   */
   public void setPostpaidTotalNegativePaymentAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostpaidTotalNegativePaymentAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostpaidTotalNegativePaymentAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostpaidTotalNegativePaymentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostpaidTotalNegativePaymentAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostpaidTotalNegativePaymentAmountFromFormattedString");
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
    
  /** PostpaidTotalProductAmount field */
    if (!nonNullOnly || (PostpaidTotalProductAmount != null)) _PostpaidTotalProductAmountSet = flag;
  /** PostpaidTotalChargeAmount field */
    if (!nonNullOnly || (PostpaidTotalChargeAmount != null)) _PostpaidTotalChargeAmountSet = flag;
  /** PostpaidTotalAdjustmentAmount field */
    if (!nonNullOnly || (PostpaidTotalAdjustmentAmount != null)) _PostpaidTotalAdjustmentAmountSet = flag;
  /** PostpaidTotalPaymentAmount field */
    if (!nonNullOnly || (PostpaidTotalPaymentAmount != null)) _PostpaidTotalPaymentAmountSet = flag;
  /** PostpaidTotalNegativePaymentAmount field */
    if (!nonNullOnly || (PostpaidTotalNegativePaymentAmount != null)) _PostpaidTotalNegativePaymentAmountSet = flag;
  }
}
