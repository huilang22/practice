/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrObjectKeyFilter.java
 * Definition File: Admin/Csr.xml
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

/** Key Filter for CsrObject object. */
public class CsrObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CSR_INFORMATION.user_name) */
  public    StringFilter[] UserName  = null;
  protected boolean UserNameFetch = false;
  protected boolean UserNameSortAscending = true;
  protected boolean UserNameCaseInsensitive = false;
  protected Integer UserNameSort = null;
  private String _objName = "CsrObjectKeyFilter";
  /** default constructor */
  public CsrObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CsrObjectKeyFilter (CsrObjectKeyFilter other)
  {
    if (other == null) return;
    this.UserName = other.UserName;
    this.UserNameFetch = other.UserNameFetch;
    this.UserNameSort = other.UserNameSort;
    this.UserNameCaseInsensitive = other.UserNameCaseInsensitive;
    this.UserNameSortAscending = other.UserNameSortAscending;
  }
  /** Set the field level Fetch value for field: UserName (CSR_INFORMATION.user_name)
   * @param fetch whether to fetch this field or not
   */
  public void setUserNameFetch (boolean fetch) {
    this.UserNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: UserName (CSR_INFORMATION.user_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getUserNameFetch () {
    return this.UserNameFetch;
  }
  /** Set the SortOrder for field: UserName (CSR_INFORMATION.user_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUserNameSortOrder (Integer value) {
    this.UserNameSort = value;
  }
  /** Retrieve SortOrder for field: UserName (CSR_INFORMATION.user_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUserNameSortOrder () {
    return this.UserNameSort;
  }
  /** Set the sort direction for field: UserName (CSR_INFORMATION.user_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUserNameSortDirection (boolean ascending) {
    this.UserNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UserName (CSR_INFORMATION.user_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUserNameSortDirection () {
    return this.UserNameSortAscending;
  }
  /** Set the case insensitive for field: UserName (CSR_INFORMATION.user_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUserNameCaseInsensitive (boolean ascending) {
    this.UserNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UserName (CSR_INFORMATION.user_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUserNameCaseInsensitive () {
    return this.UserNameCaseInsensitive;
  }
  /** Set the field level filters for field: UserName (CSR_INFORMATION.user_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUserNameFilter (StringFilter[] value) throws ServiceException {
    this.UserName = value;
  }
  /** Retrieve filter for field: UserName (CSR_INFORMATION.user_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUserNameFilter () {
    return this.UserName;
  }

  /**
   * Retrieves the UserNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UserNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UserNameFilter field
   */
  public String[] getUserNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUserNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUserNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UserNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUserNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UserNameFilter filter value from a formatted string
   *
   * @param _value the UserNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UserNameFilter filter field
   */
  public void setUserNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUserNameFilterFromFormattedString");
    try {
      this.setUserNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UserNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUserNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUserNameFilterFromFormattedString");
  }

  public String toString() {
    return CsrObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CsrObjectKeyHelper.toMap(this, null);
  }
}
