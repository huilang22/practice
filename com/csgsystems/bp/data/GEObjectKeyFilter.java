/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GEObjectKeyFilter.java
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

/** Key Filter for GEObject object. */
public class GEObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: GENERIC_ENUMERATION_VALUES.enumeration_key) */
  public    StringFilter[] EnumerationKey  = null;
  protected boolean EnumerationKeyFetch = false;
  protected boolean EnumerationKeySortAscending = true;
  protected boolean EnumerationKeyCaseInsensitive = false;
  protected Integer EnumerationKeySort = null;
  /** raw field for: GENERIC_ENUMERATION_VALUES.value) */
  public    StringFilter[] Value  = null;
  protected boolean ValueFetch = false;
  protected boolean ValueSortAscending = true;
  protected boolean ValueCaseInsensitive = false;
  protected Integer ValueSort = null;
  /** raw field for: GENERIC_ENUMERATION_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "GEObjectKeyFilter";
  /** default constructor */
  public GEObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public GEObjectKeyFilter (GEObjectKeyFilter other)
  {
    if (other == null) return;
    this.EnumerationKey = other.EnumerationKey;
    this.EnumerationKeyFetch = other.EnumerationKeyFetch;
    this.EnumerationKeySort = other.EnumerationKeySort;
    this.EnumerationKeyCaseInsensitive = other.EnumerationKeyCaseInsensitive;
    this.EnumerationKeySortAscending = other.EnumerationKeySortAscending;
    this.Value = other.Value;
    this.ValueFetch = other.ValueFetch;
    this.ValueSort = other.ValueSort;
    this.ValueCaseInsensitive = other.ValueCaseInsensitive;
    this.ValueSortAscending = other.ValueSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @param fetch whether to fetch this field or not
   */
  public void setEnumerationKeyFetch (boolean fetch) {
    this.EnumerationKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getEnumerationKeyFetch () {
    return this.EnumerationKeyFetch;
  }
  /** Set the SortOrder for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEnumerationKeySortOrder (Integer value) {
    this.EnumerationKeySort = value;
  }
  /** Retrieve SortOrder for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEnumerationKeySortOrder () {
    return this.EnumerationKeySort;
  }
  /** Set the sort direction for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEnumerationKeySortDirection (boolean ascending) {
    this.EnumerationKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEnumerationKeySortDirection () {
    return this.EnumerationKeySortAscending;
  }
  /** Set the case insensitive for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEnumerationKeyCaseInsensitive (boolean ascending) {
    this.EnumerationKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEnumerationKeyCaseInsensitive () {
    return this.EnumerationKeyCaseInsensitive;
  }
  /** Set the field level filters for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEnumerationKeyFilter (StringFilter[] value) throws ServiceException {
    this.EnumerationKey = value;
  }
  /** Retrieve filter for field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEnumerationKeyFilter () {
    return this.EnumerationKey;
  }

  /**
   * Retrieves the EnumerationKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EnumerationKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationKeyFilter field
   */
  public String[] getEnumerationKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEnumerationKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EnumerationKeyFilter filter value from a formatted string
   *
   * @param _value the EnumerationKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EnumerationKeyFilter filter field
   */
  public void setEnumerationKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEnumerationKeyFilterFromFormattedString");
    try {
      this.setEnumerationKeyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationKeyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @param fetch whether to fetch this field or not
   */
  public void setValueFetch (boolean fetch) {
    this.ValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return boolean the Fetch value for this field
   */
  public boolean getValueFetch () {
    return this.ValueFetch;
  }
  /** Set the SortOrder for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setValueSortOrder (Integer value) {
    this.ValueSort = value;
  }
  /** Retrieve SortOrder for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getValueSortOrder () {
    return this.ValueSort;
  }
  /** Set the sort direction for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setValueSortDirection (boolean ascending) {
    this.ValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getValueSortDirection () {
    return this.ValueSortAscending;
  }
  /** Set the case insensitive for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setValueCaseInsensitive (boolean ascending) {
    this.ValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getValueCaseInsensitive () {
    return this.ValueCaseInsensitive;
  }
  /** Set the field level filters for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setValueFilter (StringFilter[] value) throws ServiceException {
    this.Value = value;
  }
  /** Retrieve filter for field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getValueFilter () {
    return this.Value;
  }

  /**
   * Retrieves the ValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ValueFilter field
   */
  public String[] getValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ValueFilter filter value from a formatted string
   *
   * @param _value the ValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ValueFilter filter field
   */
  public void setValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setValueFilterFromFormattedString");
    try {
      this.setValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
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
    return GEObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GEObjectKeyHelper.toMap(this, null);
  }
}
