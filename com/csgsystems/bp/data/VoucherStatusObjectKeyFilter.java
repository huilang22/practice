/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusObjectKeyFilter.java
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

/** Key Filter for VoucherStatusObject object. */
public class VoucherStatusObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: VOUCHER_STATUS.status) */
  public    BigIntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  private String _objName = "VoucherStatusObjectKeyFilter";
  /** default constructor */
  public VoucherStatusObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public VoucherStatusObjectKeyFilter (VoucherStatusObjectKeyFilter other)
  {
    if (other == null) return;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
  }
  /** Set the field level Fetch value for field: Status (VOUCHER_STATUS.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (VOUCHER_STATUS.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (VOUCHER_STATUS.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (VOUCHER_STATUS.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (VOUCHER_STATUS.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (VOUCHER_STATUS.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (VOUCHER_STATUS.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (VOUCHER_STATUS.status)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStatusFilter () {
    return this.Status;
  }

  /**
   * Retrieves the StatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusFilter field
   */
  public String[] getStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusFilter filter value from a formatted string
   *
   * @param _value the StatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusFilter filter field
   */
  public void setStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusFilterFromFormattedString");
    try {
      this.setStatusFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  public String toString() {
    return VoucherStatusObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherStatusObjectKeyHelper.toMap(this, null);
  }
}
