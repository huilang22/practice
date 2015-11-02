/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherLocationObjectFilter.java
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
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class VoucherLocationObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public VoucherLocationObjectKeyFilter Key = null;
  /** raw field for: VOUCHER_LOCATION.location_info) */
  public    StringFilter[] LocationInfo  = null;
  protected boolean LocationInfoFetch = false;
  protected boolean LocationInfoSortAscending = true;
  protected boolean LocationInfoCaseInsensitive = false;
  protected Integer LocationInfoSort = null;
  private String _objName = "VoucherLocationObjectFilter";
  /** default constructor */
  public VoucherLocationObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public VoucherLocationObjectFilter (VoucherLocationObjectFilter other)
  {
    if (other == null) return;
    this.Key = new VoucherLocationObjectKeyFilter (other.Key);
    this.LocationInfo = other.LocationInfo;
    this.LocationInfoFetch = other.LocationInfoFetch;
    this.LocationInfoSort = other.LocationInfoSort;
    this.LocationInfoCaseInsensitive = other.LocationInfoCaseInsensitive;
    this.LocationInfoSortAscending = other.LocationInfoSortAscending;  }
  /** get the filter for this object's key
   * @return VoucherLocationObjectKeyFilter
   */
  public VoucherLocationObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (VoucherLocationObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLocationCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new VoucherLocationObjectKeyFilter ();
    this.Key.LocationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLocationCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LocationCodeFetch;
  }
  /** Set the SortOrder for field: LocationCode (VOUCHER_LOCATION.location_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLocationCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new VoucherLocationObjectKeyFilter ();
    this.Key.LocationCodeSort = value;
  }
  /** Retrieve SortOrder for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLocationCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LocationCodeSort;
  }
  /** Set the sort direction for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLocationCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherLocationObjectKeyFilter ();
    this.Key.LocationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLocationCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LocationCodeSortAscending;
  }
  /** Set the field level filters for field: LocationCode (VOUCHER_LOCATION.location_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLocationCodeFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new VoucherLocationObjectKeyFilter ();
    this.Key.LocationCode = value;
  }
  /** Retrieve filter for field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLocationCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LocationCode;
  }
  /** Set the field level Fetch value for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @param fetch whether to fetch this field or not
   */
  public void setLocationInfoFetch (boolean fetch) {
    this.LocationInfoFetch = fetch;
  }
  /** Retrieve Fetch value for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @return boolean the Fetch value for this field
   */
  public boolean getLocationInfoFetch () {
    return this.LocationInfoFetch;
  }
  /** Set the SortOrder for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLocationInfoSortOrder (Integer value) {
    this.LocationInfoSort = value;
  }
  /** Retrieve SortOrder for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLocationInfoSortOrder () {
    return this.LocationInfoSort;
  }
  /** Set the sort direction for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLocationInfoSortDirection (boolean ascending) {
    this.LocationInfoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLocationInfoSortDirection () {
    return this.LocationInfoSortAscending;
  }
  /** Set the case insensitive for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setLocationInfoCaseInsensitive (boolean ascending) {
    this.LocationInfoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getLocationInfoCaseInsensitive () {
    return this.LocationInfoCaseInsensitive;
  }
  /** Set the field level filters for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLocationInfoFilter (StringFilter[] value) throws ServiceException {
    this.LocationInfo = value;
  }
  /** Retrieve filter for field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getLocationInfoFilter () {
    return this.LocationInfo;
  }

  /**
   * Retrieves the LocationInfoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LocationInfoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationInfoFilter field
   */
  public String[] getLocationInfoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationInfoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLocationInfoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationInfoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationInfoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LocationInfoFilter filter value from a formatted string
   *
   * @param _value the LocationInfoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LocationInfoFilter filter field
   */
  public void setLocationInfoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLocationInfoFilterFromFormattedString");
    try {
      this.setLocationInfoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationInfoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationInfoFilterFromFormattedString");
  }

  public String toString() {
    return VoucherLocationObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherLocationObjectHelper.toMap(this, null);
  }
}
