/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateCmfDataGetOutputData.java
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
public class ProductRcRateCmfDataGetOutputData implements ArubaObjectData, Serializable
{
  /** InCMFExternalId field */
  public    String InCMFExternalId  = null;
  protected boolean _InCMFExternalIdSet = false;
  /** InCMFExternalIdType field */
  public    Integer InCMFExternalIdType  = null;
  protected boolean _InCMFExternalIdTypeSet = false;
  /** InCMFRateClassDefault field */
  public    Integer InCMFRateClassDefault  = null;
  protected boolean _InCMFRateClassDefaultSet = false;
  /** InCMFRateClassSpecial field */
  public    Integer InCMFRateClassSpecial  = null;
  protected boolean _InCMFRateClassSpecialSet = false;
  /** InCMFCurrencyCode field */
  public    Integer InCMFCurrencyCode  = null;
  protected boolean _InCMFCurrencyCodeSet = false;
  /** InCMFBillingFrequency field */
  public    Integer InCMFBillingFrequency  = null;
  protected boolean _InCMFBillingFrequencySet = false;
  /** InCMFBillPeriod field */
  public    String InCMFBillPeriod  = null;
  protected boolean _InCMFBillPeriodSet = false;
  private String _objName = "ProductRcRateCmfDataGetOutputData";
  /** default constructor */
  public ProductRcRateCmfDataGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public ProductRcRateCmfDataGetOutputData (ProductRcRateCmfDataGetOutputData other)
  {
    if (other == null) return;
    this.InCMFExternalId = other.InCMFExternalId;
    this._InCMFExternalIdSet = other._InCMFExternalIdSet;
    this.InCMFExternalIdType = other.InCMFExternalIdType;
    this._InCMFExternalIdTypeSet = other._InCMFExternalIdTypeSet;
    this.InCMFRateClassDefault = other.InCMFRateClassDefault;
    this._InCMFRateClassDefaultSet = other._InCMFRateClassDefaultSet;
    this.InCMFRateClassSpecial = other.InCMFRateClassSpecial;
    this._InCMFRateClassSpecialSet = other._InCMFRateClassSpecialSet;
    this.InCMFCurrencyCode = other.InCMFCurrencyCode;
    this._InCMFCurrencyCodeSet = other._InCMFCurrencyCodeSet;
    this.InCMFBillingFrequency = other.InCMFBillingFrequency;
    this._InCMFBillingFrequencySet = other._InCMFBillingFrequencySet;
    this.InCMFBillPeriod = other.InCMFBillPeriod;
    this._InCMFBillPeriodSet = other._InCMFBillPeriodSet;
  }
  /** set the fields value: InCMFExternalId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCMFExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCMFExternalId", "setInCMFExternalId");
    }
    this.InCMFExternalId = value;
    this._InCMFExternalIdSet = true;
  }
  /** get the value of the field: InCMFExternalId
   * @return String the value
   */
  public String getInCMFExternalId ()
  {
    return this.InCMFExternalId;
  }
  /** Change the field to not being actively set: InCMFExternalId
   */
  public void unsetInCMFExternalId ()
  {
    this._InCMFExternalIdSet = false;
  }
  /** See if the field is actively set: InCMFExternalId
   * @return boolean whether the field is actively set
   */
  public boolean issetInCMFExternalId ()
  {
    return this._InCMFExternalIdSet;
  }

  /** Retrieves the InCMFExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCMFExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCMFExternalId field
   */
   public String getInCMFExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCMFExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getInCMFExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCMFExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCMFExternalId field from a formatted string
   *
   * @param _value the InCMFExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCMFExternalId field
   */
   public void setInCMFExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCMFExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCMFExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCMFExternalIdFromFormattedString");
   }

  /** set the fields value: InCMFExternalIdType
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCMFExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCMFExternalIdType", "setInCMFExternalIdType");
    }
    this.InCMFExternalIdType = value;
    this._InCMFExternalIdTypeSet = true;
  }
  /** get the value of the field: InCMFExternalIdType
   * @return Integer the value
   */
  public Integer getInCMFExternalIdType ()
  {
    return this.InCMFExternalIdType;
  }
  /** Change the field to not being actively set: InCMFExternalIdType
   */
  public void unsetInCMFExternalIdType ()
  {
    this._InCMFExternalIdTypeSet = false;
  }
  /** See if the field is actively set: InCMFExternalIdType
   * @return boolean whether the field is actively set
   */
  public boolean issetInCMFExternalIdType ()
  {
    return this._InCMFExternalIdTypeSet;
  }

  /** Retrieves the InCMFExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCMFExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCMFExternalIdType field
   */
   public String getInCMFExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCMFExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getInCMFExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCMFExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCMFExternalIdType field from a formatted string
   *
   * @param _value the InCMFExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCMFExternalIdType field
   */
   public void setInCMFExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCMFExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCMFExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCMFExternalIdTypeFromFormattedString");
   }

  /** set the fields value: InCMFRateClassDefault
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCMFRateClassDefault (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCMFRateClassDefault", "setInCMFRateClassDefault");
    }
    this.InCMFRateClassDefault = value;
    this._InCMFRateClassDefaultSet = true;
  }
  /** get the value of the field: InCMFRateClassDefault
   * @return Integer the value
   */
  public Integer getInCMFRateClassDefault ()
  {
    return this.InCMFRateClassDefault;
  }
  /** Change the field to not being actively set: InCMFRateClassDefault
   */
  public void unsetInCMFRateClassDefault ()
  {
    this._InCMFRateClassDefaultSet = false;
  }
  /** See if the field is actively set: InCMFRateClassDefault
   * @return boolean whether the field is actively set
   */
  public boolean issetInCMFRateClassDefault ()
  {
    return this._InCMFRateClassDefaultSet;
  }

  /** Retrieves the InCMFRateClassDefault field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCMFRateClassDefault field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCMFRateClassDefault field
   */
   public String getInCMFRateClassDefaultAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFRateClassDefaultAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCMFRateClassDefaultAsFormattedString");
       return fmtMgr.formatNumber(this.getInCMFRateClassDefault(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFRateClassDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCMFRateClassDefaultAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCMFRateClassDefault field from a formatted string
   *
   * @param _value the InCMFRateClassDefault field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCMFRateClassDefault field
   */
   public void setInCMFRateClassDefaultFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFRateClassDefaultFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCMFRateClassDefault(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFRateClassDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCMFRateClassDefaultFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCMFRateClassDefaultFromFormattedString");
   }

  /** set the fields value: InCMFRateClassSpecial
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCMFRateClassSpecial (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCMFRateClassSpecial", "setInCMFRateClassSpecial");
    }
    this.InCMFRateClassSpecial = value;
    this._InCMFRateClassSpecialSet = true;
  }
  /** get the value of the field: InCMFRateClassSpecial
   * @return Integer the value
   */
  public Integer getInCMFRateClassSpecial ()
  {
    return this.InCMFRateClassSpecial;
  }
  /** Change the field to not being actively set: InCMFRateClassSpecial
   */
  public void unsetInCMFRateClassSpecial ()
  {
    this._InCMFRateClassSpecialSet = false;
  }
  /** See if the field is actively set: InCMFRateClassSpecial
   * @return boolean whether the field is actively set
   */
  public boolean issetInCMFRateClassSpecial ()
  {
    return this._InCMFRateClassSpecialSet;
  }

  /** Retrieves the InCMFRateClassSpecial field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCMFRateClassSpecial field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCMFRateClassSpecial field
   */
   public String getInCMFRateClassSpecialAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFRateClassSpecialAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCMFRateClassSpecialAsFormattedString");
       return fmtMgr.formatNumber(this.getInCMFRateClassSpecial(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFRateClassSpecial");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCMFRateClassSpecialAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCMFRateClassSpecial field from a formatted string
   *
   * @param _value the InCMFRateClassSpecial field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCMFRateClassSpecial field
   */
   public void setInCMFRateClassSpecialFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFRateClassSpecialFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCMFRateClassSpecial(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFRateClassSpecial");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCMFRateClassSpecialFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCMFRateClassSpecialFromFormattedString");
   }

  /** set the fields value: InCMFCurrencyCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCMFCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCMFCurrencyCode", "setInCMFCurrencyCode");
    }
    this.InCMFCurrencyCode = value;
    this._InCMFCurrencyCodeSet = true;
  }
  /** get the value of the field: InCMFCurrencyCode
   * @return Integer the value
   */
  public Integer getInCMFCurrencyCode ()
  {
    return this.InCMFCurrencyCode;
  }
  /** Change the field to not being actively set: InCMFCurrencyCode
   */
  public void unsetInCMFCurrencyCode ()
  {
    this._InCMFCurrencyCodeSet = false;
  }
  /** See if the field is actively set: InCMFCurrencyCode
   * @return boolean whether the field is actively set
   */
  public boolean issetInCMFCurrencyCode ()
  {
    return this._InCMFCurrencyCodeSet;
  }

  /** Retrieves the InCMFCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCMFCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCMFCurrencyCode field
   */
   public String getInCMFCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCMFCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getInCMFCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCMFCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCMFCurrencyCode field from a formatted string
   *
   * @param _value the InCMFCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCMFCurrencyCode field
   */
   public void setInCMFCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCMFCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCMFCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCMFCurrencyCodeFromFormattedString");
   }

  /** set the fields value: InCMFBillingFrequency
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCMFBillingFrequency (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCMFBillingFrequency", "setInCMFBillingFrequency");
    }
    this.InCMFBillingFrequency = value;
    this._InCMFBillingFrequencySet = true;
  }
  /** get the value of the field: InCMFBillingFrequency
   * @return Integer the value
   */
  public Integer getInCMFBillingFrequency ()
  {
    return this.InCMFBillingFrequency;
  }
  /** Change the field to not being actively set: InCMFBillingFrequency
   */
  public void unsetInCMFBillingFrequency ()
  {
    this._InCMFBillingFrequencySet = false;
  }
  /** See if the field is actively set: InCMFBillingFrequency
   * @return boolean whether the field is actively set
   */
  public boolean issetInCMFBillingFrequency ()
  {
    return this._InCMFBillingFrequencySet;
  }

  /** Retrieves the InCMFBillingFrequency field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCMFBillingFrequency field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCMFBillingFrequency field
   */
   public String getInCMFBillingFrequencyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFBillingFrequencyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCMFBillingFrequencyAsFormattedString");
       return fmtMgr.formatNumber(this.getInCMFBillingFrequency(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFBillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCMFBillingFrequencyAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCMFBillingFrequency field from a formatted string
   *
   * @param _value the InCMFBillingFrequency field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCMFBillingFrequency field
   */
   public void setInCMFBillingFrequencyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFBillingFrequencyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCMFBillingFrequency(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFBillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCMFBillingFrequencyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCMFBillingFrequencyFromFormattedString");
   }

  /** set the fields value: InCMFBillPeriod
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInCMFBillPeriod (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InCMFBillPeriod", "setInCMFBillPeriod");
    }
    this.InCMFBillPeriod = value;
    this._InCMFBillPeriodSet = true;
  }
  /** get the value of the field: InCMFBillPeriod
   * @return String the value
   */
  public String getInCMFBillPeriod ()
  {
    return this.InCMFBillPeriod;
  }
  /** Change the field to not being actively set: InCMFBillPeriod
   */
  public void unsetInCMFBillPeriod ()
  {
    this._InCMFBillPeriodSet = false;
  }
  /** See if the field is actively set: InCMFBillPeriod
   * @return boolean whether the field is actively set
   */
  public boolean issetInCMFBillPeriod ()
  {
    return this._InCMFBillPeriodSet;
  }

  /** Retrieves the InCMFBillPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InCMFBillPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InCMFBillPeriod field
   */
   public String getInCMFBillPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFBillPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInCMFBillPeriodAsFormattedString");
       return fmtMgr.formatString(this.getInCMFBillPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFBillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInCMFBillPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the InCMFBillPeriod field from a formatted string
   *
   * @param _value the InCMFBillPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InCMFBillPeriod field
   */
   public void setInCMFBillPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInCMFBillPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInCMFBillPeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InCMFBillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInCMFBillPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInCMFBillPeriodFromFormattedString");
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
    
  /** InCMFExternalId field */
    if (!nonNullOnly || (InCMFExternalId != null)) _InCMFExternalIdSet = flag;
  /** InCMFExternalIdType field */
    if (!nonNullOnly || (InCMFExternalIdType != null)) _InCMFExternalIdTypeSet = flag;
  /** InCMFRateClassDefault field */
    if (!nonNullOnly || (InCMFRateClassDefault != null)) _InCMFRateClassDefaultSet = flag;
  /** InCMFRateClassSpecial field */
    if (!nonNullOnly || (InCMFRateClassSpecial != null)) _InCMFRateClassSpecialSet = flag;
  /** InCMFCurrencyCode field */
    if (!nonNullOnly || (InCMFCurrencyCode != null)) _InCMFCurrencyCodeSet = flag;
  /** InCMFBillingFrequency field */
    if (!nonNullOnly || (InCMFBillingFrequency != null)) _InCMFBillingFrequencySet = flag;
  /** InCMFBillPeriod field */
    if (!nonNullOnly || (InCMFBillPeriod != null)) _InCMFBillPeriodSet = flag;
  }
}
