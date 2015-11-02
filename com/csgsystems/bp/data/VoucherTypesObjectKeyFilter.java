/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherTypesObjectKeyFilter.java
 * Definition File: Catalog/VoucherTypes.xml
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

/** Key Filter for VoucherTypesObject object. */
public class VoucherTypesObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: VOUCHER_TYPES.voucher_type_id) */
  public    BigIntegerFilter[] VoucherTypeId  = null;
  protected boolean VoucherTypeIdFetch = false;
  protected boolean VoucherTypeIdSortAscending = true;
  protected Integer VoucherTypeIdSort = null;
  private String _objName = "VoucherTypesObjectKeyFilter";
  /** default constructor */
  public VoucherTypesObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public VoucherTypesObjectKeyFilter (VoucherTypesObjectKeyFilter other)
  {
    if (other == null) return;
    this.VoucherTypeId = other.VoucherTypeId;
    this.VoucherTypeIdFetch = other.VoucherTypeIdFetch;
    this.VoucherTypeIdSort = other.VoucherTypeIdSort;
    this.VoucherTypeIdSortAscending = other.VoucherTypeIdSortAscending;
  }
  /** Set the field level Fetch value for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setVoucherTypeIdFetch (boolean fetch) {
    this.VoucherTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getVoucherTypeIdFetch () {
    return this.VoucherTypeIdFetch;
  }
  /** Set the SortOrder for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVoucherTypeIdSortOrder (Integer value) {
    this.VoucherTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVoucherTypeIdSortOrder () {
    return this.VoucherTypeIdSort;
  }
  /** Set the sort direction for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVoucherTypeIdSortDirection (boolean ascending) {
    this.VoucherTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVoucherTypeIdSortDirection () {
    return this.VoucherTypeIdSortAscending;
  }
  /** Set the field level filters for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVoucherTypeIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.VoucherTypeId = value;
  }
  /** Retrieve filter for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getVoucherTypeIdFilter () {
    return this.VoucherTypeId;
  }

  /**
   * Retrieves the VoucherTypeIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The VoucherTypeIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherTypeIdFilter field
   */
  public String[] getVoucherTypeIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypeIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getVoucherTypeIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypeIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherTypeIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the VoucherTypeIdFilter filter value from a formatted string
   *
   * @param _value the VoucherTypeIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the VoucherTypeIdFilter filter field
   */
  public void setVoucherTypeIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVoucherTypeIdFilterFromFormattedString");
    try {
      this.setVoucherTypeIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherTypeIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherTypeIdFilterFromFormattedString");
  }

  public String toString() {
    return VoucherTypesObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherTypesObjectKeyHelper.toMap(this, null);
  }
}
