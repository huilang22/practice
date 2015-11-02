/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrivacyLevelObjectKeyFilter.java
 * Definition File: Admin/PrivacyLevel.xml
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

/** Key Filter for PrivacyLevelObject object. */
public class PrivacyLevelObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: PRIVACY_LEVEL_VALUES.privacy_level) */
  public    IntegerFilter[] Level  = null;
  protected boolean LevelFetch = false;
  protected boolean LevelSortAscending = true;
  protected Integer LevelSort = null;
  /** raw field for: PRIVACY_LEVEL_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "PrivacyLevelObjectKeyFilter";
  /** default constructor */
  public PrivacyLevelObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public PrivacyLevelObjectKeyFilter (PrivacyLevelObjectKeyFilter other)
  {
    if (other == null) return;
    this.Level = other.Level;
    this.LevelFetch = other.LevelFetch;
    this.LevelSort = other.LevelSort;
    this.LevelSortAscending = other.LevelSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * @param fetch whether to fetch this field or not
   */
  public void setLevelFetch (boolean fetch) {
    this.LevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getLevelFetch () {
    return this.LevelFetch;
  }
  /** Set the SortOrder for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLevelSortOrder (Integer value) {
    this.LevelSort = value;
  }
  /** Retrieve SortOrder for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLevelSortOrder () {
    return this.LevelSort;
  }
  /** Set the sort direction for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLevelSortDirection (boolean ascending) {
    this.LevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLevelSortDirection () {
    return this.LevelSortAscending;
  }
  /** Set the field level filters for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.Level = value;
  }
  /** Retrieve filter for field: Level (PRIVACY_LEVEL_VALUES.privacy_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLevelFilter () {
    return this.Level;
  }

  /**
   * Retrieves the LevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LevelFilter field
   */
  public String[] getLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LevelFilter filter value from a formatted string
   *
   * @param _value the LevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LevelFilter filter field
   */
  public void setLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLevelFilterFromFormattedString");
    try {
      this.setLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (PRIVACY_LEVEL_VALUES.language_code)
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
    return PrivacyLevelObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PrivacyLevelObjectKeyHelper.toMap(this, null);
  }
}
