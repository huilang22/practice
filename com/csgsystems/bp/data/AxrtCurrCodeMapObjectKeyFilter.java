/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCurrCodeMapObjectKeyFilter.java
 * Definition File: Admin/AxrtCurrCodeMap.xml
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

/** Key Filter for AxrtCurrCodeMapObject object. */
public class AxrtCurrCodeMapObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ISO_CURRENCY_CODE_MAPPING.rate_currency_code) */
  public    IntegerFilter[] RateCurrencyCode  = null;
  protected boolean RateCurrencyCodeFetch = false;
  protected boolean RateCurrencyCodeSortAscending = true;
  protected Integer RateCurrencyCodeSort = null;
  private String _objName = "AxrtCurrCodeMapObjectKeyFilter";
  /** default constructor */
  public AxrtCurrCodeMapObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AxrtCurrCodeMapObjectKeyFilter (AxrtCurrCodeMapObjectKeyFilter other)
  {
    if (other == null) return;
    this.RateCurrencyCode = other.RateCurrencyCode;
    this.RateCurrencyCodeFetch = other.RateCurrencyCodeFetch;
    this.RateCurrencyCodeSort = other.RateCurrencyCodeSort;
    this.RateCurrencyCodeSortAscending = other.RateCurrencyCodeSortAscending;
  }
  /** Set the field level Fetch value for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setRateCurrencyCodeFetch (boolean fetch) {
    this.RateCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateCurrencyCodeFetch () {
    return this.RateCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateCurrencyCodeSortOrder (Integer value) {
    this.RateCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateCurrencyCodeSortOrder () {
    return this.RateCurrencyCodeSort;
  }
  /** Set the sort direction for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateCurrencyCodeSortDirection (boolean ascending) {
    this.RateCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateCurrencyCodeSortDirection () {
    return this.RateCurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.RateCurrencyCode = value;
  }
  /** Retrieve filter for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateCurrencyCodeFilter () {
    return this.RateCurrencyCode;
  }

  /**
   * Retrieves the RateCurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateCurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyCodeFilter field
   */
  public String[] getRateCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateCurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the RateCurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateCurrencyCodeFilter filter field
   */
  public void setRateCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyCodeFilterFromFormattedString");
    try {
      this.setRateCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyCodeFilterFromFormattedString");
  }

  public String toString() {
    return AxrtCurrCodeMapObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AxrtCurrCodeMapObjectKeyHelper.toMap(this, null);
  }
}
