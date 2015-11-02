/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusObjectFilter.java
 * Definition File: Catalog/VoucherStatus.xml
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
public class VoucherStatusObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public VoucherStatusObjectKeyFilter Key = null;
  /** raw field for: VOUCHER_STATUS.status_info) */
  public    StringFilter[] StatusInfo  = null;
  protected boolean StatusInfoFetch = false;
  protected boolean StatusInfoSortAscending = true;
  protected boolean StatusInfoCaseInsensitive = false;
  protected Integer StatusInfoSort = null;
  private String _objName = "VoucherStatusObjectFilter";
  /** default constructor */
  public VoucherStatusObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public VoucherStatusObjectFilter (VoucherStatusObjectFilter other)
  {
    if (other == null) return;
    this.Key = new VoucherStatusObjectKeyFilter (other.Key);
    this.StatusInfo = other.StatusInfo;
    this.StatusInfoFetch = other.StatusInfoFetch;
    this.StatusInfoSort = other.StatusInfoSort;
    this.StatusInfoCaseInsensitive = other.StatusInfoCaseInsensitive;
    this.StatusInfoSortAscending = other.StatusInfoSortAscending;  }
  /** get the filter for this object's key
   * @return VoucherStatusObjectKeyFilter
   */
  public VoucherStatusObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (VoucherStatusObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: Status (VOUCHER_STATUS.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new VoucherStatusObjectKeyFilter ();
    this.Key.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (VOUCHER_STATUS.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.StatusFetch;
  }
  /** Set the SortOrder for field: Status (VOUCHER_STATUS.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new VoucherStatusObjectKeyFilter ();
    this.Key.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (VOUCHER_STATUS.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.StatusSort;
  }
  /** Set the sort direction for field: Status (VOUCHER_STATUS.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherStatusObjectKeyFilter ();
    this.Key.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (VOUCHER_STATUS.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (VOUCHER_STATUS.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new VoucherStatusObjectKeyFilter ();
    this.Key.Status = value;
  }
  /** Retrieve filter for field: Status (VOUCHER_STATUS.status)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStatusFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Status;
  }
  /** Set the field level Fetch value for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusInfoFetch (boolean fetch) {
    this.StatusInfoFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusInfoFetch () {
    return this.StatusInfoFetch;
  }
  /** Set the SortOrder for field: StatusInfo (VOUCHER_STATUS.status_info)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusInfoSortOrder (Integer value) {
    this.StatusInfoSort = value;
  }
  /** Retrieve SortOrder for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusInfoSortOrder () {
    return this.StatusInfoSort;
  }
  /** Set the sort direction for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusInfoSortDirection (boolean ascending) {
    this.StatusInfoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusInfoSortDirection () {
    return this.StatusInfoSortAscending;
  }
  /** Set the case insensitive for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStatusInfoCaseInsensitive (boolean ascending) {
    this.StatusInfoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStatusInfoCaseInsensitive () {
    return this.StatusInfoCaseInsensitive;
  }
  /** Set the field level filters for field: StatusInfo (VOUCHER_STATUS.status_info)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusInfoFilter (StringFilter[] value) throws ServiceException {
    this.StatusInfo = value;
  }
  /** Retrieve filter for field: StatusInfo (VOUCHER_STATUS.status_info)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStatusInfoFilter () {
    return this.StatusInfo;
  }

  /**
   * Retrieves the StatusInfoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusInfoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusInfoFilter field
   */
  public String[] getStatusInfoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusInfoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusInfoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusInfoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusInfoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusInfoFilter filter value from a formatted string
   *
   * @param _value the StatusInfoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusInfoFilter filter field
   */
  public void setStatusInfoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusInfoFilterFromFormattedString");
    try {
      this.setStatusInfoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusInfoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusInfoFilterFromFormattedString");
  }

  public String toString() {
    return VoucherStatusObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherStatusObjectHelper.toMap(this, null);
  }
}
