/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCurrencyCodeMapObjectData.java
 * Definition File: Admin/AxrtCurrencyCodeMap.xml
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
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseObjectData;
  
/** AxrtCurrencyCodeMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AxrtCurrencyCodeMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AxrtCurrencyCodeMapObjectKeyData Key = null;
  /** ISO_CURRENCY_CODE_MAPPING.iso_currency_code field */
  public    String IsoCurrencyCode  = null;
  protected boolean _IsoCurrencyCodeSet = false;
  /** ISO_CURRENCY_CODE_MAPPING.description field */
  public    String Description  = null;
  protected boolean _DescriptionSet = false;
  /** ISO_CURRENCY_CODE_MAPPING.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "AxrtCurrencyCodeMapObjectData";
  /** Default constructor */
  public AxrtCurrencyCodeMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AxrtCurrencyCodeMapObjectData (AxrtCurrencyCodeMapObjectData other)
  {

    if (other == null) return;
    this.Key = new AxrtCurrencyCodeMapObjectKeyData (other.Key);
    this.IsoCurrencyCode = other.IsoCurrencyCode;
    this._IsoCurrencyCodeSet = other._IsoCurrencyCodeSet;
    this.Description = other.Description;
    this._DescriptionSet = other._DescriptionSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return AxrtCurrencyCodeMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AxrtCurrencyCodeMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AxrtCurrencyCodeMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRateCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateCurrencyCode", "setRateCurrencyCode");
    }
    if (this.Key == null) this.Key = new AxrtCurrencyCodeMapObjectKeyData ();
    this.Key.RateCurrencyCode = value;
    this.Key._RateCurrencyCodeSet = true;
  }
  /** get the value of the field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return Integer the value
   */
  public Integer getRateCurrencyCode () {
    if (this.Key == null) return null;
    return this.Key.RateCurrencyCode;
  }
  /** Change the field to not being actively set: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   */
  public void unsetRateCurrencyCode () {
    if (this.Key == null) return;
    this.Key._RateCurrencyCodeSet = false;
  }
  /** See if the field is actively set: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateCurrencyCode () {
    if (this.Key == null) return false;
    return this.Key._RateCurrencyCodeSet;
  }

  /** Retrieves the RateCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyCode field
   */
   public String getRateCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getRateCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateCurrencyCode field from a formatted string
   *
   * @param _value the RateCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateCurrencyCode field
   */
   public void setRateCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyCodeFromFormattedString");
   }

  /** set the fields value: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsoCurrencyCode") 
  public void setIsoCurrencyCode (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsoCurrencyCode", "setIsoCurrencyCode");
    }
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "IsoCurrencyCode", "setIsoCurrencyCode");
    }
    this.IsoCurrencyCode = value;
    this._IsoCurrencyCodeSet = true;
  }

  /** Retrieves the IsoCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsoCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsoCurrencyCode field
   */
   public String getIsoCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsoCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsoCurrencyCodeAsFormattedString");
       return fmtMgr.formatString(this.getIsoCurrencyCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsoCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsoCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsoCurrencyCode field from a formatted string
   *
   * @param _value the IsoCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsoCurrencyCode field
   */
   public void setIsoCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsoCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsoCurrencyCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsoCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsoCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsoCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @return String the value
   */
  public String getIsoCurrencyCode () {
    return this.IsoCurrencyCode;
  }
  /** Change the field to not being actively set: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   */
  public void unsetIsoCurrencyCode () {
    this._IsoCurrencyCodeSet = false;
  }
  /** See if the field is actively set: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsoCurrencyCode () {
    return this._IsoCurrencyCodeSet;
  }
  /** set the fields value: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Description") 
  public void setDescription (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Description", "setDescription");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Description", "setDescription");
    }
    this.Description = value;
    this._DescriptionSet = true;
  }

  /** Retrieves the Description field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Description field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Description field
   */
   public String getDescriptionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionAsFormattedString");
       return fmtMgr.formatString(this.getDescription());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Description");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionAsFormattedString");
       throw x;
     }
   }
  /** Sets the Description field from a formatted string
   *
   * @param _value the Description field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Description field
   */
   public void setDescriptionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescription(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Description");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionFromFormattedString");
   }

  /** get the value of the field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @return String the value
   */
  public String getDescription () {
    return this.Description;
  }
  /** Change the field to not being actively set: Description (ISO_CURRENCY_CODE_MAPPING.description)
   */
  public void unsetDescription () {
    this._DescriptionSet = false;
  }
  /** See if the field is actively set: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescription () {
    return this._DescriptionSet;
  }
  /** set the fields value: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ConfigTagId", "setConfigTagId");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return AxrtCurrencyCodeMapObjectHelper.toMap(this, null).toString();
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
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** ISO_CURRENCY_CODE_MAPPING.iso_currency_code field */
    if(!nonNullOnly || (IsoCurrencyCode != null))  _IsoCurrencyCodeSet = flag;
  /** ISO_CURRENCY_CODE_MAPPING.description field */
    if(!nonNullOnly || (Description != null))  _DescriptionSet = flag;
  /** ISO_CURRENCY_CODE_MAPPING.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
