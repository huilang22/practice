/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GEObjectKeyData.java
 * Definition File: Admin/GenericEnumeration.xml
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
import java.util.Map;
import java.util.Locale;
import java.math.BigInteger;

import javax.ws.rs.QueryParam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.base.BaseObjectData;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.api.format.FieldFormatMgr;

/** GEObject's Key Data class. */
public class GEObjectKeyData  extends BaseObjectData
{
  /** GENERIC_ENUMERATION_VALUES.enumeration_key field */
  public    String EnumerationKey  = null;
  protected boolean _EnumerationKeySet = false;
  /** GENERIC_ENUMERATION_VALUES.value field */
  public    String Value  = null;
  protected boolean _ValueSet = false;
  /** GENERIC_ENUMERATION_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "GEObjectKeyData";
  /** default constructor */
  public GEObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public GEObjectKeyData (GEObjectKeyData other)
  {
    if (other == null) return;
    this.EnumerationKey = other.EnumerationKey;
    this._EnumerationKeySet = other._EnumerationKeySet;
    this.Value = other.Value;
    this._ValueSet = other._ValueSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EnumerationKey") 
  public void setEnumerationKey (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EnumerationKey", "setEnumerationKey");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EnumerationKey", "setEnumerationKey");
    }
    this.EnumerationKey = value;
    this._EnumerationKeySet = true;
  }

  /** Retrieves the EnumerationKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EnumerationKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationKey field
   */
   public String getEnumerationKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationKeyAsFormattedString");
       return fmtMgr.formatString(this.getEnumerationKey());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the EnumerationKey field from a formatted string
   *
   * @param _value the EnumerationKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EnumerationKey field
   */
   public void setEnumerationKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEnumerationKey(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationKeyFromFormattedString");
   }

  /** get the value of the field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return String the value
   */
  public String getEnumerationKey () {
    return this.EnumerationKey;
  }
  /** Change the field to not being actively set: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   */
  public void unsetEnumerationKey () {
    this._EnumerationKeySet = false;
  }
  /** See if the field is actively set: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationKey () {
    return this._EnumerationKeySet;
  }
  /** set the fields value: Value (GENERIC_ENUMERATION_VALUES.value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Value") 
  public void setValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Value", "setValue");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Value", "setValue");
    }
    this.Value = value;
    this._ValueSet = true;
  }

  /** Retrieves the Value field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Value field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Value field
   */
   public String getValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getValueAsFormattedString");
       return fmtMgr.formatString(this.getValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Value");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the Value field from a formatted string
   *
   * @param _value the Value field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Value field
   */
   public void setValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Value");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setValueFromFormattedString");
   }

  /** get the value of the field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return String the value
   */
  public String getValue () {
    return this.Value;
  }
  /** Change the field to not being actively set: Value (GENERIC_ENUMERATION_VALUES.value)
   */
  public void unsetValue () {
    this._ValueSet = false;
  }
  /** See if the field is actively set: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return boolean whether the field is actively set
   */
  public boolean issetValue () {
    return this._ValueSet;
  }
  /** set the fields value: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LanguageCode") 
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    this.LanguageCode = value;
    this._LanguageCodeSet = true;
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

  /** get the value of the field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return GEObjectKeyHelper.toMap(this, null).toString();
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
   * This method sets all of the *Set flags to the specified value
   * @param flag value to set
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set
   * @param nonNullOnly value to set
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** GENERIC_ENUMERATION_VALUES.enumeration_key field */
    if(!nonNullOnly || (EnumerationKey != null))  _EnumerationKeySet = flag;
  /** GENERIC_ENUMERATION_VALUES.value field */
    if(!nonNullOnly || (Value != null))  _ValueSet = flag;
  /** GENERIC_ENUMERATION_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
