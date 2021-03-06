/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherLocationObjectKeyFilter.java
 * Definition File: Catalog/VoucherLocation.xml
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

/** Key Filter for VoucherLocationObject object. */
public class VoucherLocationObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: VOUCHER_LOCATION.location_code) */
  public    BigIntegerFilter[] LocationCode  = null;
  protected boolean LocationCodeFetch = false;
  protected boolean LocationCodeSortAscending = true;
  protected Integer LocationCodeSort = null;
  private String _objName = "VoucherLocationObjectKeyFilter";
  /** default constructor */
  public VoucherLocationObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public VoucherLocationObjectKeyFilter (VoucherLocationObjectKeyFilter other)
  {
    if (other == null) return;
    this.LocationCode = other.LocationCode;
    this.LocationCodeFetch = other.LocationCodeFetch;
    this.LocationCodeSort = other.LocationCodeSort;
    this.LocationCodeSortAscending = other.LocationCodeSortAscending;
  }
  /** Set the field level Fetch value for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLocationCodeFetch (boolean fetch) {
    this.LocationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLocationCodeFetch () {
    return this.LocationCodeFetch;
  }
  /** Set the SortOrder for field: LocationCode (VOUCHER_LOCATION.location_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLocationCodeSortOrder (Integer value) {
    this.LocationCodeSort = value;
  }
  /** Retrieve SortOrder for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLocationCodeSortOrder () {
    return this.LocationCodeSort;
  }
  /** Set the sort direction for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLocationCodeSortDirection (boolean ascending) {
    this.LocationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLocationCodeSortDirection () {
    return this.LocationCodeSortAscending;
  }
  /** Set the field level filters for field: LocationCode (VOUCHER_LOCATION.location_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLocationCodeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LocationCode = value;
  }
  /** Retrieve filter for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLocationCodeFilter () {
    return this.LocationCode;
  }

  /**
   * Retrieves the LocationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LocationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationCodeFilter field
   */
  public String[] getLocationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLocationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LocationCodeFilter filter value from a formatted string
   *
   * @param _value the LocationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LocationCodeFilter filter field
   */
  public void setLocationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLocationCodeFilterFromFormattedString");
    try {
      this.setLocationCodeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationCodeFilterFromFormattedString");
  }

  public String toString() {
    return VoucherLocationObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherLocationObjectKeyHelper.toMap(this, null);
  }
}
