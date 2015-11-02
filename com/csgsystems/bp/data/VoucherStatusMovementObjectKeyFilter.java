/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusMovementObjectKeyFilter.java
 * Definition File: Catalog/VoucherStatusMovement.xml
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

/** Key Filter for VoucherStatusMovementObject object. */
public class VoucherStatusMovementObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: VOUCHER_STATUS_MOVEMENT.state_from) */
  public    BigIntegerFilter[] StateFrom  = null;
  protected boolean StateFromFetch = false;
  protected boolean StateFromSortAscending = true;
  protected Integer StateFromSort = null;
  private String _objName = "VoucherStatusMovementObjectKeyFilter";
  /** default constructor */
  public VoucherStatusMovementObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public VoucherStatusMovementObjectKeyFilter (VoucherStatusMovementObjectKeyFilter other)
  {
    if (other == null) return;
    this.StateFrom = other.StateFrom;
    this.StateFromFetch = other.StateFromFetch;
    this.StateFromSort = other.StateFromSort;
    this.StateFromSortAscending = other.StateFromSortAscending;
  }
  /** Set the field level Fetch value for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @param fetch whether to fetch this field or not
   */
  public void setStateFromFetch (boolean fetch) {
    this.StateFromFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateFromFetch () {
    return this.StateFromFetch;
  }
  /** Set the SortOrder for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateFromSortOrder (Integer value) {
    this.StateFromSort = value;
  }
  /** Retrieve SortOrder for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateFromSortOrder () {
    return this.StateFromSort;
  }
  /** Set the sort direction for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateFromSortDirection (boolean ascending) {
    this.StateFromSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateFromSortDirection () {
    return this.StateFromSortAscending;
  }
  /** Set the field level filters for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateFromFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StateFrom = value;
  }
  /** Retrieve filter for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStateFromFilter () {
    return this.StateFrom;
  }

  /**
   * Retrieves the StateFromFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateFromFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateFromFilter field
   */
  public String[] getStateFromFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFromFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateFromFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateFromFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateFromFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateFromFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StateFromFilter filter value from a formatted string
   *
   * @param _value the StateFromFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateFromFilter filter field
   */
  public void setStateFromFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateFromFilterFromFormattedString");
    try {
      this.setStateFromFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateFromFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateFromFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateFromFilterFromFormattedString");
  }

  public String toString() {
    return VoucherStatusMovementObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherStatusMovementObjectKeyHelper.toMap(this, null);
  }
}
