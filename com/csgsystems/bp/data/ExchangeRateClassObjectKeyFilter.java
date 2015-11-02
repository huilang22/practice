/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExchangeRateClassObjectKeyFilter.java
 * Definition File: Admin/ExchangeRateClass.xml
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

/** Key Filter for ExchangeRateClassObject object. */
public class ExchangeRateClassObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: EXRATE_CLASS_VALUES.exrate_class) */
  public    IntegerFilter[] EClass  = null;
  protected boolean EClassFetch = false;
  protected boolean EClassSortAscending = true;
  protected Integer EClassSort = null;
  /** raw field for: EXRATE_CLASS_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "ExchangeRateClassObjectKeyFilter";
  /** default constructor */
  public ExchangeRateClassObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ExchangeRateClassObjectKeyFilter (ExchangeRateClassObjectKeyFilter other)
  {
    if (other == null) return;
    this.EClass = other.EClass;
    this.EClassFetch = other.EClassFetch;
    this.EClassSort = other.EClassSort;
    this.EClassSortAscending = other.EClassSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setEClassFetch (boolean fetch) {
    this.EClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getEClassFetch () {
    return this.EClassFetch;
  }
  /** Set the SortOrder for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEClassSortOrder (Integer value) {
    this.EClassSort = value;
  }
  /** Retrieve SortOrder for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEClassSortOrder () {
    return this.EClassSort;
  }
  /** Set the sort direction for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEClassSortDirection (boolean ascending) {
    this.EClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEClassSortDirection () {
    return this.EClassSortAscending;
  }
  /** Set the field level filters for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEClassFilter (IntegerFilter[] value) throws ServiceException {
    this.EClass = value;
  }
  /** Retrieve filter for field: EClass (EXRATE_CLASS_VALUES.exrate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEClassFilter () {
    return this.EClass;
  }

  /**
   * Retrieves the EClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EClassFilter field
   */
  public String[] getEClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EClassFilter filter value from a formatted string
   *
   * @param _value the EClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EClassFilter filter field
   */
  public void setEClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEClassFilterFromFormattedString");
    try {
      this.setEClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (EXRATE_CLASS_VALUES.language_code)
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
    return ExchangeRateClassObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ExchangeRateClassObjectKeyHelper.toMap(this, null);
  }
}
