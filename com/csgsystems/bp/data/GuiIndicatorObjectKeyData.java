/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GuiIndicatorObjectKeyData.java
 * Definition File: Admin/GuiIndicator.xml
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

/** GuiIndicatorObject's Key Data class. */
public class GuiIndicatorObjectKeyData  extends BaseObjectData
{
  /** GUI_INDICATOR_VALUES.table_name field */
  public    String TableName  = null;
  protected boolean _TableNameSet = false;
  /** GUI_INDICATOR_VALUES.field_name field */
  public    String FieldName  = null;
  protected boolean _FieldNameSet = false;
  /** GUI_INDICATOR_VALUES.integer_value field */
  public    Integer IntegerValue  = null;
  protected boolean _IntegerValueSet = false;
  /** GUI_INDICATOR_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "GuiIndicatorObjectKeyData";
  /** default constructor */
  public GuiIndicatorObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public GuiIndicatorObjectKeyData (GuiIndicatorObjectKeyData other)
  {
    if (other == null) return;
    this.TableName = other.TableName;
    this._TableNameSet = other._TableNameSet;
    this.FieldName = other.FieldName;
    this._FieldNameSet = other._FieldNameSet;
    this.IntegerValue = other.IntegerValue;
    this._IntegerValueSet = other._IntegerValueSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: TableName (GUI_INDICATOR_VALUES.table_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TableName") 
  public void setTableName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TableName", "setTableName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TableName", "setTableName");
    }
    this.TableName = value;
    this._TableNameSet = true;
  }

  /** Retrieves the TableName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TableName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TableName field
   */
   public String getTableNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTableNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTableNameAsFormattedString");
       return fmtMgr.formatString(this.getTableName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TableName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTableNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the TableName field from a formatted string
   *
   * @param _value the TableName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TableName field
   */
   public void setTableNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTableNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTableName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TableName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTableNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTableNameFromFormattedString");
   }

  /** get the value of the field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @return String the value
   */
  public String getTableName () {
    return this.TableName;
  }
  /** Change the field to not being actively set: TableName (GUI_INDICATOR_VALUES.table_name)
   */
  public void unsetTableName () {
    this._TableNameSet = false;
  }
  /** See if the field is actively set: TableName (GUI_INDICATOR_VALUES.table_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetTableName () {
    return this._TableNameSet;
  }
  /** set the fields value: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FieldName") 
  public void setFieldName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FieldName", "setFieldName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FieldName", "setFieldName");
    }
    this.FieldName = value;
    this._FieldNameSet = true;
  }

  /** Retrieves the FieldName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FieldName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FieldName field
   */
   public String getFieldNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFieldNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFieldNameAsFormattedString");
       return fmtMgr.formatString(this.getFieldName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FieldName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFieldNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the FieldName field from a formatted string
   *
   * @param _value the FieldName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FieldName field
   */
   public void setFieldNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFieldNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFieldName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FieldName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFieldNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFieldNameFromFormattedString");
   }

  /** get the value of the field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @return String the value
   */
  public String getFieldName () {
    return this.FieldName;
  }
  /** Change the field to not being actively set: FieldName (GUI_INDICATOR_VALUES.field_name)
   */
  public void unsetFieldName () {
    this._FieldNameSet = false;
  }
  /** See if the field is actively set: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetFieldName () {
    return this._FieldNameSet;
  }
  /** set the fields value: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IntegerValue") 
  public void setIntegerValue (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IntegerValue", "setIntegerValue");
    }
    this.IntegerValue = value;
    this._IntegerValueSet = true;
  }

  /** Retrieves the IntegerValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IntegerValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IntegerValue field
   */
   public String getIntegerValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntegerValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIntegerValueAsFormattedString");
       return fmtMgr.formatNumber(this.getIntegerValue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IntegerValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIntegerValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the IntegerValue field from a formatted string
   *
   * @param _value the IntegerValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IntegerValue field
   */
   public void setIntegerValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntegerValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIntegerValue(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IntegerValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIntegerValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIntegerValueFromFormattedString");
   }

  /** get the value of the field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @return Integer the value
   */
  public Integer getIntegerValue () {
    return this.IntegerValue;
  }
  /** Change the field to not being actively set: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   */
  public void unsetIntegerValue () {
    this._IntegerValueSet = false;
  }
  /** See if the field is actively set: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetIntegerValue () {
    return this._IntegerValueSet;
  }
  /** set the fields value: LanguageCode (GUI_INDICATOR_VALUES.language_code)
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

  /** get the value of the field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return GuiIndicatorObjectKeyHelper.toMap(this, null).toString();
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
    
  /** GUI_INDICATOR_VALUES.table_name field */
    if(!nonNullOnly || (TableName != null))  _TableNameSet = flag;
  /** GUI_INDICATOR_VALUES.field_name field */
    if(!nonNullOnly || (FieldName != null))  _FieldNameSet = flag;
  /** GUI_INDICATOR_VALUES.integer_value field */
    if(!nonNullOnly || (IntegerValue != null))  _IntegerValueSet = flag;
  /** GUI_INDICATOR_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
