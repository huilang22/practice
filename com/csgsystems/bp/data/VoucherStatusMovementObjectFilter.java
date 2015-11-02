/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusMovementObjectFilter.java
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
public class VoucherStatusMovementObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public VoucherStatusMovementObjectKeyFilter Key = null;
  /** raw field for: VOUCHER_STATUS_MOVEMENT.state_to) */
  public    BigIntegerFilter[] StateTo  = null;
  protected boolean StateToFetch = false;
  protected boolean StateToSortAscending = true;
  protected Integer StateToSort = null;
  private String _objName = "VoucherStatusMovementObjectFilter";
  /** default constructor */
  public VoucherStatusMovementObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public VoucherStatusMovementObjectFilter (VoucherStatusMovementObjectFilter other)
  {
    if (other == null) return;
    this.Key = new VoucherStatusMovementObjectKeyFilter (other.Key);
    this.StateTo = other.StateTo;
    this.StateToFetch = other.StateToFetch;
    this.StateToSort = other.StateToSort;
    this.StateToSortAscending = other.StateToSortAscending;  }
  /** get the filter for this object's key
   * @return VoucherStatusMovementObjectKeyFilter
   */
  public VoucherStatusMovementObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (VoucherStatusMovementObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @param fetch whether to fetch this field or not
   */
  public void setStateFromFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new VoucherStatusMovementObjectKeyFilter ();
    this.Key.StateFromFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateFromFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.StateFromFetch;
  }
  /** Set the SortOrder for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateFromSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new VoucherStatusMovementObjectKeyFilter ();
    this.Key.StateFromSort = value;
  }
  /** Retrieve SortOrder for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateFromSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.StateFromSort;
  }
  /** Set the sort direction for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateFromSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherStatusMovementObjectKeyFilter ();
    this.Key.StateFromSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateFromSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.StateFromSortAscending;
  }
  /** Set the field level filters for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateFromFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new VoucherStatusMovementObjectKeyFilter ();
    this.Key.StateFrom = value;
  }
  /** Retrieve filter for field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStateFromFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.StateFrom;
  }
  /** Set the field level Fetch value for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @param fetch whether to fetch this field or not
   */
  public void setStateToFetch (boolean fetch) {
    this.StateToFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateToFetch () {
    return this.StateToFetch;
  }
  /** Set the SortOrder for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateToSortOrder (Integer value) {
    this.StateToSort = value;
  }
  /** Retrieve SortOrder for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateToSortOrder () {
    return this.StateToSort;
  }
  /** Set the sort direction for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateToSortDirection (boolean ascending) {
    this.StateToSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateToSortDirection () {
    return this.StateToSortAscending;
  }
  /** Set the field level filters for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateToFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StateTo = value;
  }
  /** Retrieve filter for field: StateTo (VOUCHER_STATUS_MOVEMENT.state_to)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStateToFilter () {
    return this.StateTo;
  }

  /**
   * Retrieves the StateToFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateToFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateToFilter field
   */
  public String[] getStateToFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateToFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateToFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateToFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateToFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateToFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StateToFilter filter value from a formatted string
   *
   * @param _value the StateToFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateToFilter filter field
   */
  public void setStateToFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateToFilterFromFormattedString");
    try {
      this.setStateToFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateToFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateToFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateToFilterFromFormattedString");
  }

  public String toString() {
    return VoucherStatusMovementObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherStatusMovementObjectHelper.toMap(this, null);
  }
}
