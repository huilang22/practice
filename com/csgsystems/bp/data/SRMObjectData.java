/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SRMObjectData.java
 * Definition File: Admin/StatusReasonMap.xml
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
  
/** SRMObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class SRMObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public SRMObjectKeyData Key = null;
  /** STATUS_VALUES.short_display field */
  public    String StatusShortDisplay  = null;
  protected boolean _StatusShortDisplaySet = false;
  /** STATUS_VALUES.display_value field */
  public    String StatusDisplayValue  = null;
  protected boolean _StatusDisplayValueSet = false;
  /** STATUS_REASON_VALUES.short_display field */
  public    String StatusReasonShortDisplay  = null;
  protected boolean _StatusReasonShortDisplaySet = false;
  /** STATUS_REASON_VALUES.display_value field */
  public    String StatusReasonDisplayValue  = null;
  protected boolean _StatusReasonDisplayValueSet = false;
  private String _objName = "SRMObjectData";
  /** Default constructor */
  public SRMObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public SRMObjectData (SRMObjectData other)
  {

    if (other == null) return;
    this.Key = new SRMObjectKeyData (other.Key);
    this.StatusShortDisplay = other.StatusShortDisplay;
    this._StatusShortDisplaySet = other._StatusShortDisplaySet;
    this.StatusDisplayValue = other.StatusDisplayValue;
    this._StatusDisplayValueSet = other._StatusDisplayValueSet;
    this.StatusReasonShortDisplay = other.StatusReasonShortDisplay;
    this._StatusReasonShortDisplaySet = other._StatusReasonShortDisplaySet;
    this.StatusReasonDisplayValue = other.StatusReasonDisplayValue;
    this._StatusReasonDisplayValueSet = other._StatusReasonDisplayValueSet;
  }

  /** get the Key for this object
   * @return SRMObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public SRMObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (SRMObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: StatusId (STATUS_REASON_MAP.status_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStatusId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatusId", "setStatusId");
    }
    if (this.Key == null) this.Key = new SRMObjectKeyData ();
    this.Key.StatusId = value;
    this.Key._StatusIdSet = true;
  }
  /** get the value of the field: StatusId (STATUS_REASON_MAP.status_id)
   * @return Integer the value
   */
  public Integer getStatusId () {
    if (this.Key == null) return null;
    return this.Key.StatusId;
  }
  /** Change the field to not being actively set: StatusId (STATUS_REASON_MAP.status_id)
   */
  public void unsetStatusId () {
    if (this.Key == null) return;
    this.Key._StatusIdSet = false;
  }
  /** See if the field is actively set: StatusId (STATUS_REASON_MAP.status_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusId () {
    if (this.Key == null) return false;
    return this.Key._StatusIdSet;
  }

  /** Retrieves the StatusId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusId field
   */
   public String getStatusIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusIdAsFormattedString");
       return fmtMgr.formatNumber(this.getStatusId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusId field from a formatted string
   *
   * @param _value the StatusId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusId field
   */
   public void setStatusIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusIdFromFormattedString");
   }

  /** set the fields value: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStatusReasonId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatusReasonId", "setStatusReasonId");
    }
    if (this.Key == null) this.Key = new SRMObjectKeyData ();
    this.Key.StatusReasonId = value;
    this.Key._StatusReasonIdSet = true;
  }
  /** get the value of the field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return Integer the value
   */
  public Integer getStatusReasonId () {
    if (this.Key == null) return null;
    return this.Key.StatusReasonId;
  }
  /** Change the field to not being actively set: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   */
  public void unsetStatusReasonId () {
    if (this.Key == null) return;
    this.Key._StatusReasonIdSet = false;
  }
  /** See if the field is actively set: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusReasonId () {
    if (this.Key == null) return false;
    return this.Key._StatusReasonIdSet;
  }

  /** Retrieves the StatusReasonId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusReasonId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusReasonId field
   */
   public String getStatusReasonIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonIdAsFormattedString");
       return fmtMgr.formatNumber(this.getStatusReasonId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusReasonIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusReasonId field from a formatted string
   *
   * @param _value the StatusReasonId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusReasonId field
   */
   public void setStatusReasonIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusReasonId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusReasonIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusReasonIdFromFormattedString");
   }

  /** set the fields value: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new SRMObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (STATUS_REASON_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    if (this.Key == null) return false;
    return this.Key._LanguageCodeSet;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /** set the fields value: StatusShortDisplay (STATUS_VALUES.short_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatusShortDisplay") 
  public void setStatusShortDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatusShortDisplay", "setStatusShortDisplay");
    }
    this.StatusShortDisplay = value;
    this._StatusShortDisplaySet = true;
  }

  /** Retrieves the StatusShortDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusShortDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusShortDisplay field
   */
   public String getStatusShortDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusShortDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusShortDisplayAsFormattedString");
       return fmtMgr.formatString(this.getStatusShortDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusShortDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusShortDisplay field from a formatted string
   *
   * @param _value the StatusShortDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusShortDisplay field
   */
   public void setStatusShortDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusShortDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusShortDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusShortDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusShortDisplayFromFormattedString");
   }

  /** get the value of the field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @return String the value
   */
  public String getStatusShortDisplay () {
    return this.StatusShortDisplay;
  }
  /** Change the field to not being actively set: StatusShortDisplay (STATUS_VALUES.short_display)
   */
  public void unsetStatusShortDisplay () {
    this._StatusShortDisplaySet = false;
  }
  /** See if the field is actively set: StatusShortDisplay (STATUS_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusShortDisplay () {
    return this._StatusShortDisplaySet;
  }
  /** set the fields value: StatusDisplayValue (STATUS_VALUES.display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatusDisplayValue") 
  public void setStatusDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatusDisplayValue", "setStatusDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatusDisplayValue", "setStatusDisplayValue");
    }
    this.StatusDisplayValue = value;
    this._StatusDisplayValueSet = true;
  }

  /** Retrieves the StatusDisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusDisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusDisplayValue field
   */
   public String getStatusDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getStatusDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusDisplayValue field from a formatted string
   *
   * @param _value the StatusDisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusDisplayValue field
   */
   public void setStatusDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusDisplayValueFromFormattedString");
   }

  /** get the value of the field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @return String the value
   */
  public String getStatusDisplayValue () {
    return this.StatusDisplayValue;
  }
  /** Change the field to not being actively set: StatusDisplayValue (STATUS_VALUES.display_value)
   */
  public void unsetStatusDisplayValue () {
    this._StatusDisplayValueSet = false;
  }
  /** See if the field is actively set: StatusDisplayValue (STATUS_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusDisplayValue () {
    return this._StatusDisplayValueSet;
  }
  /** set the fields value: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatusReasonShortDisplay") 
  public void setStatusReasonShortDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatusReasonShortDisplay", "setStatusReasonShortDisplay");
    }
    this.StatusReasonShortDisplay = value;
    this._StatusReasonShortDisplaySet = true;
  }

  /** Retrieves the StatusReasonShortDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusReasonShortDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusReasonShortDisplay field
   */
   public String getStatusReasonShortDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonShortDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonShortDisplayAsFormattedString");
       return fmtMgr.formatString(this.getStatusReasonShortDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusReasonShortDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusReasonShortDisplay field from a formatted string
   *
   * @param _value the StatusReasonShortDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusReasonShortDisplay field
   */
   public void setStatusReasonShortDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonShortDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusReasonShortDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusReasonShortDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusReasonShortDisplayFromFormattedString");
   }

  /** get the value of the field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @return String the value
   */
  public String getStatusReasonShortDisplay () {
    return this.StatusReasonShortDisplay;
  }
  /** Change the field to not being actively set: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   */
  public void unsetStatusReasonShortDisplay () {
    this._StatusReasonShortDisplaySet = false;
  }
  /** See if the field is actively set: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusReasonShortDisplay () {
    return this._StatusReasonShortDisplaySet;
  }
  /** set the fields value: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatusReasonDisplayValue") 
  public void setStatusReasonDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatusReasonDisplayValue", "setStatusReasonDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatusReasonDisplayValue", "setStatusReasonDisplayValue");
    }
    this.StatusReasonDisplayValue = value;
    this._StatusReasonDisplayValueSet = true;
  }

  /** Retrieves the StatusReasonDisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusReasonDisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusReasonDisplayValue field
   */
   public String getStatusReasonDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getStatusReasonDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusReasonDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusReasonDisplayValue field from a formatted string
   *
   * @param _value the StatusReasonDisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusReasonDisplayValue field
   */
   public void setStatusReasonDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusReasonDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusReasonDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusReasonDisplayValueFromFormattedString");
   }

  /** get the value of the field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @return String the value
   */
  public String getStatusReasonDisplayValue () {
    return this.StatusReasonDisplayValue;
  }
  /** Change the field to not being actively set: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   */
  public void unsetStatusReasonDisplayValue () {
    this._StatusReasonDisplayValueSet = false;
  }
  /** See if the field is actively set: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusReasonDisplayValue () {
    return this._StatusReasonDisplayValueSet;
  }
  public String toString() {
    return SRMObjectHelper.toMap(this, null).toString();
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
  /** STATUS_VALUES.short_display field */
    if(!nonNullOnly || (StatusShortDisplay != null))  _StatusShortDisplaySet = flag;
  /** STATUS_VALUES.display_value field */
    if(!nonNullOnly || (StatusDisplayValue != null))  _StatusDisplayValueSet = flag;
  /** STATUS_REASON_VALUES.short_display field */
    if(!nonNullOnly || (StatusReasonShortDisplay != null))  _StatusReasonShortDisplaySet = flag;
  /** STATUS_REASON_VALUES.display_value field */
    if(!nonNullOnly || (StatusReasonDisplayValue != null))  _StatusReasonDisplayValueSet = flag;
  }
}
