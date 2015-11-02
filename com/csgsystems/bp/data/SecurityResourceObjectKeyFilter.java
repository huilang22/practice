/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityResourceObjectKeyFilter.java
 * Definition File: Admin/SecurityResource.xml
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

/** Key Filter for SecurityResourceObject object. */
public class SecurityResourceObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: SEC_FX_RESOURCE.res_id) */
  public    BigIntegerFilter[] ResId  = null;
  protected boolean ResIdFetch = false;
  protected boolean ResIdSortAscending = true;
  protected Integer ResIdSort = null;
  private String _objName = "SecurityResourceObjectKeyFilter";
  /** default constructor */
  public SecurityResourceObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public SecurityResourceObjectKeyFilter (SecurityResourceObjectKeyFilter other)
  {
    if (other == null) return;
    this.ResId = other.ResId;
    this.ResIdFetch = other.ResIdFetch;
    this.ResIdSort = other.ResIdSort;
    this.ResIdSortAscending = other.ResIdSortAscending;
  }
  /** Set the field level Fetch value for field: ResId (SEC_FX_RESOURCE.res_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResIdFetch (boolean fetch) {
    this.ResIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResIdFetch () {
    return this.ResIdFetch;
  }
  /** Set the SortOrder for field: ResId (SEC_FX_RESOURCE.res_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResIdSortOrder (Integer value) {
    this.ResIdSort = value;
  }
  /** Retrieve SortOrder for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResIdSortOrder () {
    return this.ResIdSort;
  }
  /** Set the sort direction for field: ResId (SEC_FX_RESOURCE.res_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResIdSortDirection (boolean ascending) {
    this.ResIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResIdSortDirection () {
    return this.ResIdSortAscending;
  }
  /** Set the field level filters for field: ResId (SEC_FX_RESOURCE.res_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResId = value;
  }
  /** Retrieve filter for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResIdFilter () {
    return this.ResId;
  }

  /**
   * Retrieves the ResIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResIdFilter field
   */
  public String[] getResIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResIdFilter filter value from a formatted string
   *
   * @param _value the ResIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResIdFilter filter field
   */
  public void setResIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResIdFilterFromFormattedString");
    try {
      this.setResIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResIdFilterFromFormattedString");
  }

  public String toString() {
    return SecurityResourceObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityResourceObjectKeyHelper.toMap(this, null);
  }
}
