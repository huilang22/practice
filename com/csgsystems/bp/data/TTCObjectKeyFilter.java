/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TTCObjectKeyFilter.java
 * Definition File: Admin/TaxTypeComm.xml
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

/** Key Filter for TTCObject object. */
public class TTCObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: TAX_TYPE_COMM_VALUES.tax_type) */
  public    IntegerFilter[] TaxType  = null;
  protected boolean TaxTypeFetch = false;
  protected boolean TaxTypeSortAscending = true;
  protected Integer TaxTypeSort = null;
  /** raw field for: TAX_TYPE_COMM_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "TTCObjectKeyFilter";
  /** default constructor */
  public TTCObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public TTCObjectKeyFilter (TTCObjectKeyFilter other)
  {
    if (other == null) return;
    this.TaxType = other.TaxType;
    this.TaxTypeFetch = other.TaxTypeFetch;
    this.TaxTypeSort = other.TaxTypeSort;
    this.TaxTypeSortAscending = other.TaxTypeSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeFetch (boolean fetch) {
    this.TaxTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeFetch () {
    return this.TaxTypeFetch;
  }
  /** Set the SortOrder for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeSortOrder (Integer value) {
    this.TaxTypeSort = value;
  }
  /** Retrieve SortOrder for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeSortOrder () {
    return this.TaxTypeSort;
  }
  /** Set the sort direction for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeSortDirection (boolean ascending) {
    this.TaxTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeSortDirection () {
    return this.TaxTypeSortAscending;
  }
  /** Set the field level filters for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxType = value;
  }
  /** Retrieve filter for field: TaxType (TAX_TYPE_COMM_VALUES.tax_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxTypeFilter () {
    return this.TaxType;
  }

  /**
   * Retrieves the TaxTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeFilter field
   */
  public String[] getTaxTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxTypeFilter filter value from a formatted string
   *
   * @param _value the TaxTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxTypeFilter filter field
   */
  public void setTaxTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxTypeFilterFromFormattedString");
    try {
      this.setTaxTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (TAX_TYPE_COMM_VALUES.language_code)
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
    return TTCObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TTCObjectKeyHelper.toMap(this, null);
  }
}
