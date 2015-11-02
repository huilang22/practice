/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateCkDataGetOutputData.java
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
public class ProductRcRateCkDataGetOutputData implements ArubaObjectData, Serializable
{
  /** InCCKCommitmentAmount field */
  public    BigInteger InCCKCommitmentAmount  = null;
  protected boolean _InCCKCommitmentAmountSet = false;
  /** InCCKCommitmentCurrentcyCode field */
  public    Integer InCCKCommitmentCurrentcyCode  = null;
  protected boolean _InCCKCommitmentCurrentcyCodeSet = false;
  private String _objName = "ProductRcRateCkDataGetOutputData";
  /** default constructor */
  public ProductRcRateCkDataGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public ProductRcRateCkDataGetOutputData (ProductRcRateCkDataGetOutputData other)
  {
    if (other == null) return;
    this.InCCKCommitmentAmount = other.InCCKCommitmentAmount;
    this._InCCKCommitmentAmountSet = other._InCCKCommitmentAmountSet;
    this.InCCKCommitmentCurrentcyCode = other.InCCKCommitmentCurrentcyCode;
    this._InCCKCommitmentCurrentcyCodeSet = other._InCCKCommitmentCurrentcyCodeSet;
  }
  /** set the fields value: InCCKCommitmentAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCCKCommitmentAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCCKCommitmentAmount", "setInCCKCommitmentAmount");
    }
    this.InCCKCommitmentAmount = value;
    this._InCCKCommitmentAmountSet = true;
  }
  /** get the value of the field: InCCKCommitmentAmount
   * @return BigInteger the value
   */
  public BigInteger getInCCKCommitmentAmount ()
  {
    return this.InCCKCommitmentAmount;
  }
  /** Change the field to not being actively set: InCCKCommitmentAmount
   */
  public void unsetInCCKCommitmentAmount ()
  {
    this._InCCKCommitmentAmountSet = false;
  }
  /** See if the field is actively set: InCCKCommitmentAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetInCCKCommitmentAmount ()
  {
    return this._InCCKCommitmentAmountSet;
  }

  /** Retrieves the InCCKCommitmentAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCCKCommitmentAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCCKCommitmentAmount field
   */
   public String getInCCKCommitmentAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCCKCommitmentAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCCKCommitmentAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getInCCKCommitmentAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCCKCommitmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCCKCommitmentAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCCKCommitmentAmount field from a formatted string
   *
   * @param _value the InCCKCommitmentAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCCKCommitmentAmount field
   */
   public void setInCCKCommitmentAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCCKCommitmentAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCCKCommitmentAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCCKCommitmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCCKCommitmentAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCCKCommitmentAmountFromFormattedString");
   }

  /** set the fields value: InCCKCommitmentCurrentcyCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCCKCommitmentCurrentcyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCCKCommitmentCurrentcyCode", "setInCCKCommitmentCurrentcyCode");
    }
    this.InCCKCommitmentCurrentcyCode = value;
    this._InCCKCommitmentCurrentcyCodeSet = true;
  }
  /** get the value of the field: InCCKCommitmentCurrentcyCode
   * @return Integer the value
   */
  public Integer getInCCKCommitmentCurrentcyCode ()
  {
    return this.InCCKCommitmentCurrentcyCode;
  }
  /** Change the field to not being actively set: InCCKCommitmentCurrentcyCode
   */
  public void unsetInCCKCommitmentCurrentcyCode ()
  {
    this._InCCKCommitmentCurrentcyCodeSet = false;
  }
  /** See if the field is actively set: InCCKCommitmentCurrentcyCode
   * @return boolean whether the field is actively set
   */
  public boolean issetInCCKCommitmentCurrentcyCode ()
  {
    return this._InCCKCommitmentCurrentcyCodeSet;
  }

  /** Retrieves the InCCKCommitmentCurrentcyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCCKCommitmentCurrentcyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCCKCommitmentCurrentcyCode field
   */
   public String getInCCKCommitmentCurrentcyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCCKCommitmentCurrentcyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCCKCommitmentCurrentcyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getInCCKCommitmentCurrentcyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCCKCommitmentCurrentcyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCCKCommitmentCurrentcyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCCKCommitmentCurrentcyCode field from a formatted string
   *
   * @param _value the InCCKCommitmentCurrentcyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCCKCommitmentCurrentcyCode field
   */
   public void setInCCKCommitmentCurrentcyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCCKCommitmentCurrentcyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCCKCommitmentCurrentcyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCCKCommitmentCurrentcyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCCKCommitmentCurrentcyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCCKCommitmentCurrentcyCodeFromFormattedString");
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
    
  /** InCCKCommitmentAmount field */
    if (!nonNullOnly || (InCCKCommitmentAmount != null)) _InCCKCommitmentAmountSet = flag;
  /** InCCKCommitmentCurrentcyCode field */
    if (!nonNullOnly || (InCCKCommitmentCurrentcyCode != null)) _InCCKCommitmentCurrentcyCodeSet = flag;
  }
}
