/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateNrcDescrGetOutputData.java
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
public class ProductRcRateNrcDescrGetOutputData implements ArubaObjectData, Serializable
{
  /** InNRCComponentId field */
  public    Integer InNRCComponentId  = null;
  protected boolean _InNRCComponentIdSet = false;
  /** InNRCElementId field */
  public    Integer InNRCElementId  = null;
  protected boolean _InNRCElementIdSet = false;
  /** InNRCCurrencyCode field */
  public    Integer InNRCCurrencyCode  = null;
  protected boolean _InNRCCurrencyCodeSet = false;
  /** InNRCRateCurrencyLocation field */
  public    Integer InNRCRateCurrencyLocation  = null;
  protected boolean _InNRCRateCurrencyLocationSet = false;
  private String _objName = "ProductRcRateNrcDescrGetOutputData";
  /** default constructor */
  public ProductRcRateNrcDescrGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public ProductRcRateNrcDescrGetOutputData (ProductRcRateNrcDescrGetOutputData other)
  {
    if (other == null) return;
    this.InNRCComponentId = other.InNRCComponentId;
    this._InNRCComponentIdSet = other._InNRCComponentIdSet;
    this.InNRCElementId = other.InNRCElementId;
    this._InNRCElementIdSet = other._InNRCElementIdSet;
    this.InNRCCurrencyCode = other.InNRCCurrencyCode;
    this._InNRCCurrencyCodeSet = other._InNRCCurrencyCodeSet;
    this.InNRCRateCurrencyLocation = other.InNRCRateCurrencyLocation;
    this._InNRCRateCurrencyLocationSet = other._InNRCRateCurrencyLocationSet;
  }
  /** set the fields value: InNRCComponentId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInNRCComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InNRCComponentId", "setInNRCComponentId");
    }
    this.InNRCComponentId = value;
    this._InNRCComponentIdSet = true;
  }
  /** get the value of the field: InNRCComponentId
   * @return Integer the value
   */
  public Integer getInNRCComponentId ()
  {
    return this.InNRCComponentId;
  }
  /** Change the field to not being actively set: InNRCComponentId
   */
  public void unsetInNRCComponentId ()
  {
    this._InNRCComponentIdSet = false;
  }
  /** See if the field is actively set: InNRCComponentId
   * @return boolean whether the field is actively set
   */
  public boolean issetInNRCComponentId ()
  {
    return this._InNRCComponentIdSet;
  }

  /** Retrieves the InNRCComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InNRCComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InNRCComponentId field
   */
   public String getInNRCComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInNRCComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInNRCComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInNRCComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InNRCComponentId field from a formatted string
   *
   * @param _value the InNRCComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InNRCComponentId field
   */
   public void setInNRCComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInNRCComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInNRCComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInNRCComponentIdFromFormattedString");
   }

  /** set the fields value: InNRCElementId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInNRCElementId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InNRCElementId", "setInNRCElementId");
    }
    this.InNRCElementId = value;
    this._InNRCElementIdSet = true;
  }
  /** get the value of the field: InNRCElementId
   * @return Integer the value
   */
  public Integer getInNRCElementId ()
  {
    return this.InNRCElementId;
  }
  /** Change the field to not being actively set: InNRCElementId
   */
  public void unsetInNRCElementId ()
  {
    this._InNRCElementIdSet = false;
  }
  /** See if the field is actively set: InNRCElementId
   * @return boolean whether the field is actively set
   */
  public boolean issetInNRCElementId ()
  {
    return this._InNRCElementIdSet;
  }

  /** Retrieves the InNRCElementId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InNRCElementId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InNRCElementId field
   */
   public String getInNRCElementIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCElementIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInNRCElementIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInNRCElementId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInNRCElementIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InNRCElementId field from a formatted string
   *
   * @param _value the InNRCElementId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InNRCElementId field
   */
   public void setInNRCElementIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCElementIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInNRCElementId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInNRCElementIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInNRCElementIdFromFormattedString");
   }

  /** set the fields value: InNRCCurrencyCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInNRCCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InNRCCurrencyCode", "setInNRCCurrencyCode");
    }
    this.InNRCCurrencyCode = value;
    this._InNRCCurrencyCodeSet = true;
  }
  /** get the value of the field: InNRCCurrencyCode
   * @return Integer the value
   */
  public Integer getInNRCCurrencyCode ()
  {
    return this.InNRCCurrencyCode;
  }
  /** Change the field to not being actively set: InNRCCurrencyCode
   */
  public void unsetInNRCCurrencyCode ()
  {
    this._InNRCCurrencyCodeSet = false;
  }
  /** See if the field is actively set: InNRCCurrencyCode
   * @return boolean whether the field is actively set
   */
  public boolean issetInNRCCurrencyCode ()
  {
    return this._InNRCCurrencyCodeSet;
  }

  /** Retrieves the InNRCCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InNRCCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InNRCCurrencyCode field
   */
   public String getInNRCCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInNRCCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getInNRCCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInNRCCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the InNRCCurrencyCode field from a formatted string
   *
   * @param _value the InNRCCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InNRCCurrencyCode field
   */
   public void setInNRCCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInNRCCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInNRCCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInNRCCurrencyCodeFromFormattedString");
   }

  /** set the fields value: InNRCRateCurrencyLocation
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInNRCRateCurrencyLocation (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InNRCRateCurrencyLocation", "setInNRCRateCurrencyLocation");
    }
    this.InNRCRateCurrencyLocation = value;
    this._InNRCRateCurrencyLocationSet = true;
  }
  /** get the value of the field: InNRCRateCurrencyLocation
   * @return Integer the value
   */
  public Integer getInNRCRateCurrencyLocation ()
  {
    return this.InNRCRateCurrencyLocation;
  }
  /** Change the field to not being actively set: InNRCRateCurrencyLocation
   */
  public void unsetInNRCRateCurrencyLocation ()
  {
    this._InNRCRateCurrencyLocationSet = false;
  }
  /** See if the field is actively set: InNRCRateCurrencyLocation
   * @return boolean whether the field is actively set
   */
  public boolean issetInNRCRateCurrencyLocation ()
  {
    return this._InNRCRateCurrencyLocationSet;
  }

  /** Retrieves the InNRCRateCurrencyLocation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InNRCRateCurrencyLocation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InNRCRateCurrencyLocation field
   */
   public String getInNRCRateCurrencyLocationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCRateCurrencyLocationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInNRCRateCurrencyLocationAsFormattedString");
       return fmtMgr.formatNumber(this.getInNRCRateCurrencyLocation(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCRateCurrencyLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInNRCRateCurrencyLocationAsFormattedString");
       throw x;
     }
   }
  /** Sets the InNRCRateCurrencyLocation field from a formatted string
   *
   * @param _value the InNRCRateCurrencyLocation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InNRCRateCurrencyLocation field
   */
   public void setInNRCRateCurrencyLocationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInNRCRateCurrencyLocationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInNRCRateCurrencyLocation(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InNRCRateCurrencyLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInNRCRateCurrencyLocationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInNRCRateCurrencyLocationFromFormattedString");
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
    
  /** InNRCComponentId field */
    if (!nonNullOnly || (InNRCComponentId != null)) _InNRCComponentIdSet = flag;
  /** InNRCElementId field */
    if (!nonNullOnly || (InNRCElementId != null)) _InNRCElementIdSet = flag;
  /** InNRCCurrencyCode field */
    if (!nonNullOnly || (InNRCCurrencyCode != null)) _InNRCCurrencyCodeSet = flag;
  /** InNRCRateCurrencyLocation field */
    if (!nonNullOnly || (InNRCRateCurrencyLocation != null)) _InNRCRateCurrencyLocationSet = flag;
  }
}
