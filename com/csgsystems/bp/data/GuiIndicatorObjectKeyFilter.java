/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GuiIndicatorObjectKeyFilter.java
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
import java.util.Locale;
import java.util.Map;

import java.math.BigInteger;
import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseFilter;

/** Key Filter for GuiIndicatorObject object. */
public class GuiIndicatorObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: GUI_INDICATOR_VALUES.table_name) */
  public    StringFilter[] TableName  = null;
  protected boolean TableNameFetch = false;
  protected boolean TableNameSortAscending = true;
  protected boolean TableNameCaseInsensitive = false;
  protected Integer TableNameSort = null;
  /** raw field for: GUI_INDICATOR_VALUES.field_name) */
  public    StringFilter[] FieldName  = null;
  protected boolean FieldNameFetch = false;
  protected boolean FieldNameSortAscending = true;
  protected boolean FieldNameCaseInsensitive = false;
  protected Integer FieldNameSort = null;
  /** raw field for: GUI_INDICATOR_VALUES.integer_value) */
  public    IntegerFilter[] IntegerValue  = null;
  protected boolean IntegerValueFetch = false;
  protected boolean IntegerValueSortAscending = true;
  protected Integer IntegerValueSort = null;
  /** raw field for: GUI_INDICATOR_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "GuiIndicatorObjectKeyFilter";
  /** default constructor */
  public GuiIndicatorObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public GuiIndicatorObjectKeyFilter (GuiIndicatorObjectKeyFilter other)
  {
    if (other == null) return;
    this.TableName = other.TableName;
    this.TableNameFetch = other.TableNameFetch;
    this.TableNameSort = other.TableNameSort;
    this.TableNameCaseInsensitive = other.TableNameCaseInsensitive;
    this.TableNameSortAscending = other.TableNameSortAscending;
    this.FieldName = other.FieldName;
    this.FieldNameFetch = other.FieldNameFetch;
    this.FieldNameSort = other.FieldNameSort;
    this.FieldNameCaseInsensitive = other.FieldNameCaseInsensitive;
    this.FieldNameSortAscending = other.FieldNameSortAscending;
    this.IntegerValue = other.IntegerValue;
    this.IntegerValueFetch = other.IntegerValueFetch;
    this.IntegerValueSort = other.IntegerValueSort;
    this.IntegerValueSortAscending = other.IntegerValueSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @param fetch whether to fetch this field or not
   */
  public void setTableNameFetch (boolean fetch) {
    this.TableNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getTableNameFetch () {
    return this.TableNameFetch;
  }
  /** Set the SortOrder for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTableNameSortOrder (Integer value) {
    this.TableNameSort = value;
  }
  /** Retrieve SortOrder for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTableNameSortOrder () {
    return this.TableNameSort;
  }
  /** Set the sort direction for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTableNameSortDirection (boolean ascending) {
    this.TableNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTableNameSortDirection () {
    return this.TableNameSortAscending;
  }
  /** Set the case insensitive for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTableNameCaseInsensitive (boolean ascending) {
    this.TableNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTableNameCaseInsensitive () {
    return this.TableNameCaseInsensitive;
  }
  /** Set the field level filters for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTableNameFilter (StringFilter[] value) throws ServiceException {
    this.TableName = value;
  }
  /** Retrieve filter for field: TableName (GUI_INDICATOR_VALUES.table_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTableNameFilter () {
    return this.TableName;
  }

  /**
   * Retrieves the TableNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TableNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TableNameFilter field
   */
  public String[] getTableNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTableNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTableNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTableNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TableNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTableNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TableNameFilter filter value from a formatted string
   *
   * @param _value the TableNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TableNameFilter filter field
   */
  public void setTableNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTableNameFilterFromFormattedString");
    try {
      this.setTableNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TableNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTableNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTableNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @param fetch whether to fetch this field or not
   */
  public void setFieldNameFetch (boolean fetch) {
    this.FieldNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getFieldNameFetch () {
    return this.FieldNameFetch;
  }
  /** Set the SortOrder for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFieldNameSortOrder (Integer value) {
    this.FieldNameSort = value;
  }
  /** Retrieve SortOrder for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFieldNameSortOrder () {
    return this.FieldNameSort;
  }
  /** Set the sort direction for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFieldNameSortDirection (boolean ascending) {
    this.FieldNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFieldNameSortDirection () {
    return this.FieldNameSortAscending;
  }
  /** Set the case insensitive for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFieldNameCaseInsensitive (boolean ascending) {
    this.FieldNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFieldNameCaseInsensitive () {
    return this.FieldNameCaseInsensitive;
  }
  /** Set the field level filters for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFieldNameFilter (StringFilter[] value) throws ServiceException {
    this.FieldName = value;
  }
  /** Retrieve filter for field: FieldName (GUI_INDICATOR_VALUES.field_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFieldNameFilter () {
    return this.FieldName;
  }

  /**
   * Retrieves the FieldNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FieldNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FieldNameFilter field
   */
  public String[] getFieldNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFieldNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFieldNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFieldNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FieldNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFieldNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FieldNameFilter filter value from a formatted string
   *
   * @param _value the FieldNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FieldNameFilter filter field
   */
  public void setFieldNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFieldNameFilterFromFormattedString");
    try {
      this.setFieldNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FieldNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFieldNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFieldNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @param fetch whether to fetch this field or not
   */
  public void setIntegerValueFetch (boolean fetch) {
    this.IntegerValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getIntegerValueFetch () {
    return this.IntegerValueFetch;
  }
  /** Set the SortOrder for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIntegerValueSortOrder (Integer value) {
    this.IntegerValueSort = value;
  }
  /** Retrieve SortOrder for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIntegerValueSortOrder () {
    return this.IntegerValueSort;
  }
  /** Set the sort direction for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIntegerValueSortDirection (boolean ascending) {
    this.IntegerValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIntegerValueSortDirection () {
    return this.IntegerValueSortAscending;
  }
  /** Set the field level filters for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIntegerValueFilter (IntegerFilter[] value) throws ServiceException {
    this.IntegerValue = value;
  }
  /** Retrieve filter for field: IntegerValue (GUI_INDICATOR_VALUES.integer_value)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIntegerValueFilter () {
    return this.IntegerValue;
  }

  /**
   * Retrieves the IntegerValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IntegerValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IntegerValueFilter field
   */
  public String[] getIntegerValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntegerValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIntegerValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIntegerValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntegerValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIntegerValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IntegerValueFilter filter value from a formatted string
   *
   * @param _value the IntegerValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IntegerValueFilter filter field
   */
  public void setIntegerValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIntegerValueFilterFromFormattedString");
    try {
      this.setIntegerValueFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntegerValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIntegerValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIntegerValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (GUI_INDICATOR_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  public String toString() {
    return GuiIndicatorObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GuiIndicatorObjectKeyHelper.toMap(this, null);
  }
}
