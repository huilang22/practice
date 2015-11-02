/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupObjectKeyFilter.java
 * Definition File: Customer/Group.xml
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

/** Key Filter for GroupObject object. */
public class GroupObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: GROUPS.group_no) */
  public    IntegerFilter[] GroupNo  = null;
  protected boolean GroupNoFetch = false;
  protected boolean GroupNoSortAscending = true;
  protected Integer GroupNoSort = null;
  private String _objName = "GroupObjectKeyFilter";
  /** default constructor */
  public GroupObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public GroupObjectKeyFilter (GroupObjectKeyFilter other)
  {
    if (other == null) return;
    this.GroupNo = other.GroupNo;
    this.GroupNoFetch = other.GroupNoFetch;
    this.GroupNoSort = other.GroupNoSort;
    this.GroupNoSortAscending = other.GroupNoSortAscending;
  }
  /** Set the field level Fetch value for field: GroupNo (GROUPS.group_no)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupNoFetch (boolean fetch) {
    this.GroupNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupNo (GROUPS.group_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupNoFetch () {
    return this.GroupNoFetch;
  }
  /** Set the SortOrder for field: GroupNo (GROUPS.group_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupNoSortOrder (Integer value) {
    this.GroupNoSort = value;
  }
  /** Retrieve SortOrder for field: GroupNo (GROUPS.group_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupNoSortOrder () {
    return this.GroupNoSort;
  }
  /** Set the sort direction for field: GroupNo (GROUPS.group_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupNoSortDirection (boolean ascending) {
    this.GroupNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupNo (GROUPS.group_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupNoSortDirection () {
    return this.GroupNoSortAscending;
  }
  /** Set the field level filters for field: GroupNo (GROUPS.group_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupNoFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupNo = value;
  }
  /** Retrieve filter for field: GroupNo (GROUPS.group_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupNoFilter () {
    return this.GroupNo;
  }

  /**
   * Retrieves the GroupNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupNoFilter field
   */
  public String[] getGroupNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupNoFilter filter value from a formatted string
   *
   * @param _value the GroupNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupNoFilter filter field
   */
  public void setGroupNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupNoFilterFromFormattedString");
    try {
      this.setGroupNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupNoFilterFromFormattedString");
  }

  public String toString() {
    return GroupObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GroupObjectKeyHelper.toMap(this, null);
  }
}
