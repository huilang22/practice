/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityRoleObjectData.java
 * Definition File: Admin/SecurityRole.xml
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
  
/** SecurityRoleObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class SecurityRoleObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public SecurityRoleObjectKeyData Key = null;
  /** SEC_FX_ROLE_VALUES.frv_short_display field */
  public    String FrvShortDisplay  = null;
  protected boolean _FrvShortDisplaySet = false;
  /** SEC_FX_ROLE_VALUES.frv_display_value field */
  public    String FrvDisplayValue  = null;
  protected boolean _FrvDisplayValueSet = false;
  /** SEC_FX_ROLE_VALUES.frv_update_count field */
  public    BigInteger FrvUpdateCount  = null;
  protected boolean _FrvUpdateCountSet = false;
  /** SEC_FX_ROLE_VALUES.frv_create_date field */
  public    Date FrvCreateDate  = null;
  protected boolean _FrvCreateDateSet = false;
  /** SEC_FX_ROLE_VALUES.frv_modify_date field */
  public    Date FrvModifyDate  = null;
  protected boolean _FrvModifyDateSet = false;
  /** SEC_FX_ROLE_VALUES.frv_modify_user field */
  public    String FrvModifyUser  = null;
  protected boolean _FrvModifyUserSet = false;
  private String _objName = "SecurityRoleObjectData";
  /** Default constructor */
  public SecurityRoleObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public SecurityRoleObjectData (SecurityRoleObjectData other)
  {

    if (other == null) return;
    this.Key = new SecurityRoleObjectKeyData (other.Key);
    this.FrvShortDisplay = other.FrvShortDisplay;
    this._FrvShortDisplaySet = other._FrvShortDisplaySet;
    this.FrvDisplayValue = other.FrvDisplayValue;
    this._FrvDisplayValueSet = other._FrvDisplayValueSet;
    this.FrvUpdateCount = other.FrvUpdateCount;
    this._FrvUpdateCountSet = other._FrvUpdateCountSet;
    this.FrvCreateDate = other.FrvCreateDate;
    this._FrvCreateDateSet = other._FrvCreateDateSet;
    this.FrvModifyDate = other.FrvModifyDate;
    this._FrvModifyDateSet = other._FrvModifyDateSet;
    this.FrvModifyUser = other.FrvModifyUser;
    this._FrvModifyUserSet = other._FrvModifyUserSet;
  }

  /** get the Key for this object
   * @return SecurityRoleObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public SecurityRoleObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (SecurityRoleObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setFrvRoleId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvRoleId", "setFrvRoleId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvRoleId", "setFrvRoleId");
    }
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyData ();
    this.Key.FrvRoleId = value;
    this.Key._FrvRoleIdSet = true;
  }
  /** get the value of the field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return BigInteger the value
   */
  public BigInteger getFrvRoleId () {
    if (this.Key == null) return null;
    return this.Key.FrvRoleId;
  }
  /** Change the field to not being actively set: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   */
  public void unsetFrvRoleId () {
    if (this.Key == null) return;
    this.Key._FrvRoleIdSet = false;
  }
  /** See if the field is actively set: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvRoleId () {
    if (this.Key == null) return false;
    return this.Key._FrvRoleIdSet;
  }

  /** Retrieves the FrvRoleId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvRoleId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvRoleId field
   */
   public String getFrvRoleIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvRoleIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvRoleIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFrvRoleId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvRoleIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvRoleId field from a formatted string
   *
   * @param _value the FrvRoleId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvRoleId field
   */
   public void setFrvRoleIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvRoleIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvRoleId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvRoleIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvRoleIdFromFormattedString");
   }

  /** set the fields value: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setFrvLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvLanguageCode", "setFrvLanguageCode");
    }
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyData ();
    this.Key.FrvLanguageCode = value;
    this.Key._FrvLanguageCodeSet = true;
  }
  /** get the value of the field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return Integer the value
   */
  public Integer getFrvLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.FrvLanguageCode;
  }
  /** Change the field to not being actively set: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   */
  public void unsetFrvLanguageCode () {
    if (this.Key == null) return;
    this.Key._FrvLanguageCodeSet = false;
  }
  /** See if the field is actively set: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvLanguageCode () {
    if (this.Key == null) return false;
    return this.Key._FrvLanguageCodeSet;
  }

  /** Retrieves the FrvLanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvLanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvLanguageCode field
   */
   public String getFrvLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFrvLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvLanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvLanguageCode field from a formatted string
   *
   * @param _value the FrvLanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvLanguageCode field
   */
   public void setFrvLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvLanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvLanguageCodeFromFormattedString");
   }

  /** set the fields value: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvShortDisplay") 
  public void setFrvShortDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvShortDisplay", "setFrvShortDisplay");
    }
    this.FrvShortDisplay = value;
    this._FrvShortDisplaySet = true;
  }

  /** Retrieves the FrvShortDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvShortDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvShortDisplay field
   */
   public String getFrvShortDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvShortDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvShortDisplayAsFormattedString");
       return fmtMgr.formatString(this.getFrvShortDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvShortDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvShortDisplay field from a formatted string
   *
   * @param _value the FrvShortDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvShortDisplay field
   */
   public void setFrvShortDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvShortDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvShortDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvShortDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvShortDisplayFromFormattedString");
   }

  /** get the value of the field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return String the value
   */
  public String getFrvShortDisplay () {
    return this.FrvShortDisplay;
  }
  /** Change the field to not being actively set: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   */
  public void unsetFrvShortDisplay () {
    this._FrvShortDisplaySet = false;
  }
  /** See if the field is actively set: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvShortDisplay () {
    return this._FrvShortDisplaySet;
  }
  /** set the fields value: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvDisplayValue") 
  public void setFrvDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvDisplayValue", "setFrvDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvDisplayValue", "setFrvDisplayValue");
    }
    this.FrvDisplayValue = value;
    this._FrvDisplayValueSet = true;
  }

  /** Retrieves the FrvDisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvDisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvDisplayValue field
   */
   public String getFrvDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getFrvDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvDisplayValue field from a formatted string
   *
   * @param _value the FrvDisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvDisplayValue field
   */
   public void setFrvDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvDisplayValueFromFormattedString");
   }

  /** get the value of the field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return String the value
   */
  public String getFrvDisplayValue () {
    return this.FrvDisplayValue;
  }
  /** Change the field to not being actively set: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   */
  public void unsetFrvDisplayValue () {
    this._FrvDisplayValueSet = false;
  }
  /** See if the field is actively set: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvDisplayValue () {
    return this._FrvDisplayValueSet;
  }
  /** set the fields value: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvUpdateCount") 
  public void setFrvUpdateCount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvUpdateCount", "setFrvUpdateCount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvUpdateCount", "setFrvUpdateCount");
    }
    this.FrvUpdateCount = value;
    this._FrvUpdateCountSet = true;
  }

  /** Retrieves the FrvUpdateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvUpdateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvUpdateCount field
   */
   public String getFrvUpdateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvUpdateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvUpdateCountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFrvUpdateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvUpdateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvUpdateCount field from a formatted string
   *
   * @param _value the FrvUpdateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvUpdateCount field
   */
   public void setFrvUpdateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvUpdateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvUpdateCount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvUpdateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvUpdateCountFromFormattedString");
   }

  /** get the value of the field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return BigInteger the value
   */
  public BigInteger getFrvUpdateCount () {
    return this.FrvUpdateCount;
  }
  /** Change the field to not being actively set: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   */
  public void unsetFrvUpdateCount () {
    this._FrvUpdateCountSet = false;
  }
  /** See if the field is actively set: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvUpdateCount () {
    return this._FrvUpdateCountSet;
  }
  /** set the fields value: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvCreateDate") 
  public void setFrvCreateDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvCreateDate", "setFrvCreateDate");
    }
    this.FrvCreateDate = value;
    this._FrvCreateDateSet = true;
  }

  /** Retrieves the FrvCreateDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvCreateDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvCreateDate field
   */
   public String getFrvCreateDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvCreateDateAsFormattedString");
       return fmtMgr.formatDate(this.getFrvCreateDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvCreateDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvCreateDate field from a formatted string
   *
   * @param _value the FrvCreateDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvCreateDate field
   */
   public void setFrvCreateDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvCreateDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvCreateDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvCreateDateFromFormattedString");
   }

  /**
   * Retrieves the FrvCreateDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvCreateDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvCreateDate field
   */
  public String getFrvCreateDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvCreateDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFrvCreateDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvCreateDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FrvCreateDate field value from a formatted date/time string
   *
   * @param _value the FrvCreateDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvCreateDate field
   */
  public void setFrvCreateDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvCreateDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFrvCreateDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvCreateDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return Date the value
   */
  public Date getFrvCreateDate () {
    return this.FrvCreateDate;
  }
  /** Change the field to not being actively set: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   */
  public void unsetFrvCreateDate () {
    this._FrvCreateDateSet = false;
  }
  /** See if the field is actively set: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvCreateDate () {
    return this._FrvCreateDateSet;
  }
  /** set the fields value: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvModifyDate") 
  public void setFrvModifyDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvModifyDate", "setFrvModifyDate");
    }
    this.FrvModifyDate = value;
    this._FrvModifyDateSet = true;
  }

  /** Retrieves the FrvModifyDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvModifyDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyDate field
   */
   public String getFrvModifyDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyDateAsFormattedString");
       return fmtMgr.formatDate(this.getFrvModifyDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvModifyDate field from a formatted string
   *
   * @param _value the FrvModifyDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvModifyDate field
   */
   public void setFrvModifyDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvModifyDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvModifyDateFromFormattedString");
   }

  /**
   * Retrieves the FrvModifyDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvModifyDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyDate field
   */
  public String getFrvModifyDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFrvModifyDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FrvModifyDate field value from a formatted date/time string
   *
   * @param _value the FrvModifyDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvModifyDate field
   */
  public void setFrvModifyDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvModifyDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFrvModifyDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return Date the value
   */
  public Date getFrvModifyDate () {
    return this.FrvModifyDate;
  }
  /** Change the field to not being actively set: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   */
  public void unsetFrvModifyDate () {
    this._FrvModifyDateSet = false;
  }
  /** See if the field is actively set: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvModifyDate () {
    return this._FrvModifyDateSet;
  }
  /** set the fields value: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvModifyUser") 
  public void setFrvModifyUser (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvModifyUser", "setFrvModifyUser");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvModifyUser", "setFrvModifyUser");
    }
    this.FrvModifyUser = value;
    this._FrvModifyUserSet = true;
  }

  /** Retrieves the FrvModifyUser field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvModifyUser field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyUser field
   */
   public String getFrvModifyUserAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyUserAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyUserAsFormattedString");
       return fmtMgr.formatString(this.getFrvModifyUser());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyUserAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvModifyUser field from a formatted string
   *
   * @param _value the FrvModifyUser field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvModifyUser field
   */
   public void setFrvModifyUserFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyUserFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvModifyUser(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyUserFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvModifyUserFromFormattedString");
   }

  /** get the value of the field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return String the value
   */
  public String getFrvModifyUser () {
    return this.FrvModifyUser;
  }
  /** Change the field to not being actively set: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   */
  public void unsetFrvModifyUser () {
    this._FrvModifyUserSet = false;
  }
  /** See if the field is actively set: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvModifyUser () {
    return this._FrvModifyUserSet;
  }
  public String toString() {
    return SecurityRoleObjectHelper.toMap(this, null).toString();
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
  /** SEC_FX_ROLE_VALUES.frv_short_display field */
    if(!nonNullOnly || (FrvShortDisplay != null))  _FrvShortDisplaySet = flag;
  /** SEC_FX_ROLE_VALUES.frv_display_value field */
    if(!nonNullOnly || (FrvDisplayValue != null))  _FrvDisplayValueSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_update_count field */
    if(!nonNullOnly || (FrvUpdateCount != null))  _FrvUpdateCountSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_create_date field */
    if(!nonNullOnly || (FrvCreateDate != null))  _FrvCreateDateSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_modify_date field */
    if(!nonNullOnly || (FrvModifyDate != null))  _FrvModifyDateSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_modify_user field */
    if(!nonNullOnly || (FrvModifyUser != null))  _FrvModifyUserSet = flag;
  }
}
