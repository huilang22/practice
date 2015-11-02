/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateRateCrDataOutputData.java
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
public class ProductRcRateRateCrDataOutputData implements ArubaObjectData, Serializable
{
  /** InRATEImpliedDecimal field */
  public    Integer InRATEImpliedDecimal  = null;
  protected boolean _InRATEImpliedDecimalSet = false;
  /** InRATERoundingMethod field */
  public    Integer InRATERoundingMethod  = null;
  protected boolean _InRATERoundingMethodSet = false;
  private String _objName = "ProductRcRateRateCrDataOutputData";
  /** default constructor */
  public ProductRcRateRateCrDataOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public ProductRcRateRateCrDataOutputData (ProductRcRateRateCrDataOutputData other)
  {
    if (other == null) return;
    this.InRATEImpliedDecimal = other.InRATEImpliedDecimal;
    this._InRATEImpliedDecimalSet = other._InRATEImpliedDecimalSet;
    this.InRATERoundingMethod = other.InRATERoundingMethod;
    this._InRATERoundingMethodSet = other._InRATERoundingMethodSet;
  }
  /** set the fields value: InRATEImpliedDecimal
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInRATEImpliedDecimal (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InRATEImpliedDecimal", "setInRATEImpliedDecimal");
    }
    this.InRATEImpliedDecimal = value;
    this._InRATEImpliedDecimalSet = true;
  }
  /** get the value of the field: InRATEImpliedDecimal
   * @return Integer the value
   */
  public Integer getInRATEImpliedDecimal ()
  {
    return this.InRATEImpliedDecimal;
  }
  /** Change the field to not being actively set: InRATEImpliedDecimal
   */
  public void unsetInRATEImpliedDecimal ()
  {
    this._InRATEImpliedDecimalSet = false;
  }
  /** See if the field is actively set: InRATEImpliedDecimal
   * @return boolean whether the field is actively set
   */
  public boolean issetInRATEImpliedDecimal ()
  {
    return this._InRATEImpliedDecimalSet;
  }

  /** Retrieves the InRATEImpliedDecimal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InRATEImpliedDecimal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InRATEImpliedDecimal field
   */
   public String getInRATEImpliedDecimalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInRATEImpliedDecimalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInRATEImpliedDecimalAsFormattedString");
       return fmtMgr.formatNumber(this.getInRATEImpliedDecimal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InRATEImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInRATEImpliedDecimalAsFormattedString");
       throw x;
     }
   }
  /** Sets the InRATEImpliedDecimal field from a formatted string
   *
   * @param _value the InRATEImpliedDecimal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InRATEImpliedDecimal field
   */
   public void setInRATEImpliedDecimalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInRATEImpliedDecimalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInRATEImpliedDecimal(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InRATEImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInRATEImpliedDecimalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInRATEImpliedDecimalFromFormattedString");
   }

  /** set the fields value: InRATERoundingMethod
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInRATERoundingMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InRATERoundingMethod", "setInRATERoundingMethod");
    }
    this.InRATERoundingMethod = value;
    this._InRATERoundingMethodSet = true;
  }
  /** get the value of the field: InRATERoundingMethod
   * @return Integer the value
   */
  public Integer getInRATERoundingMethod ()
  {
    return this.InRATERoundingMethod;
  }
  /** Change the field to not being actively set: InRATERoundingMethod
   */
  public void unsetInRATERoundingMethod ()
  {
    this._InRATERoundingMethodSet = false;
  }
  /** See if the field is actively set: InRATERoundingMethod
   * @return boolean whether the field is actively set
   */
  public boolean issetInRATERoundingMethod ()
  {
    return this._InRATERoundingMethodSet;
  }

  /** Retrieves the InRATERoundingMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InRATERoundingMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InRATERoundingMethod field
   */
   public String getInRATERoundingMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInRATERoundingMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInRATERoundingMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getInRATERoundingMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InRATERoundingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInRATERoundingMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the InRATERoundingMethod field from a formatted string
   *
   * @param _value the InRATERoundingMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InRATERoundingMethod field
   */
   public void setInRATERoundingMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInRATERoundingMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInRATERoundingMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InRATERoundingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInRATERoundingMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInRATERoundingMethodFromFormattedString");
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
    
  /** InRATEImpliedDecimal field */
    if (!nonNullOnly || (InRATEImpliedDecimal != null)) _InRATEImpliedDecimalSet = flag;
  /** InRATERoundingMethod field */
    if (!nonNullOnly || (InRATERoundingMethod != null)) _InRATERoundingMethodSet = flag;
  }
}
