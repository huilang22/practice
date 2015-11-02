/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupFunctionObjectKeyFilter.java
 * Definition File: Admin/CsrGroupFunction.xml
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

/** Key Filter for CsrGroupFunctionObject object. */
public class CsrGroupFunctionObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: GROUP_FUNCTION.group_name) */
  public    StringFilter[] GroupName  = null;
  protected boolean GroupNameFetch = false;
  protected boolean GroupNameSortAscending = true;
  protected boolean GroupNameCaseInsensitive = false;
  protected Integer GroupNameSort = null;
  /** raw field for: GROUP_FUNCTION.module_name) */
  public    StringFilter[] ModuleName  = null;
  protected boolean ModuleNameFetch = false;
  protected boolean ModuleNameSortAscending = true;
  protected boolean ModuleNameCaseInsensitive = false;
  protected Integer ModuleNameSort = null;
  private String _objName = "CsrGroupFunctionObjectKeyFilter";
  /** default constructor */
  public CsrGroupFunctionObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CsrGroupFunctionObjectKeyFilter (CsrGroupFunctionObjectKeyFilter other)
  {
    if (other == null) return;
    this.GroupName = other.GroupName;
    this.GroupNameFetch = other.GroupNameFetch;
    this.GroupNameSort = other.GroupNameSort;
    this.GroupNameCaseInsensitive = other.GroupNameCaseInsensitive;
    this.GroupNameSortAscending = other.GroupNameSortAscending;
    this.ModuleName = other.ModuleName;
    this.ModuleNameFetch = other.ModuleNameFetch;
    this.ModuleNameSort = other.ModuleNameSort;
    this.ModuleNameCaseInsensitive = other.ModuleNameCaseInsensitive;
    this.ModuleNameSortAscending = other.ModuleNameSortAscending;
  }
  /** Set the field level Fetch value for field: GroupName (GROUP_FUNCTION.group_name)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupNameFetch (boolean fetch) {
    this.GroupNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupName (GROUP_FUNCTION.group_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupNameFetch () {
    return this.GroupNameFetch;
  }
  /** Set the SortOrder for field: GroupName (GROUP_FUNCTION.group_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupNameSortOrder (Integer value) {
    this.GroupNameSort = value;
  }
  /** Retrieve SortOrder for field: GroupName (GROUP_FUNCTION.group_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupNameSortOrder () {
    return this.GroupNameSort;
  }
  /** Set the sort direction for field: GroupName (GROUP_FUNCTION.group_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupNameSortDirection (boolean ascending) {
    this.GroupNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupName (GROUP_FUNCTION.group_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupNameSortDirection () {
    return this.GroupNameSortAscending;
  }
  /** Set the case insensitive for field: GroupName (GROUP_FUNCTION.group_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGroupNameCaseInsensitive (boolean ascending) {
    this.GroupNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: GroupName (GROUP_FUNCTION.group_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGroupNameCaseInsensitive () {
    return this.GroupNameCaseInsensitive;
  }
  /** Set the field level filters for field: GroupName (GROUP_FUNCTION.group_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupNameFilter (StringFilter[] value) throws ServiceException {
    this.GroupName = value;
  }
  /** Retrieve filter for field: GroupName (GROUP_FUNCTION.group_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGroupNameFilter () {
    return this.GroupName;
  }

  /**
   * Retrieves the GroupNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupNameFilter field
   */
  public String[] getGroupNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupNameFilter filter value from a formatted string
   *
   * @param _value the GroupNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupNameFilter filter field
   */
  public void setGroupNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupNameFilterFromFormattedString");
    try {
      this.setGroupNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ModuleName (GROUP_FUNCTION.module_name)
   * @param fetch whether to fetch this field or not
   */
  public void setModuleNameFetch (boolean fetch) {
    this.ModuleNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getModuleNameFetch () {
    return this.ModuleNameFetch;
  }
  /** Set the SortOrder for field: ModuleName (GROUP_FUNCTION.module_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModuleNameSortOrder (Integer value) {
    this.ModuleNameSort = value;
  }
  /** Retrieve SortOrder for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModuleNameSortOrder () {
    return this.ModuleNameSort;
  }
  /** Set the sort direction for field: ModuleName (GROUP_FUNCTION.module_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModuleNameSortDirection (boolean ascending) {
    this.ModuleNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModuleNameSortDirection () {
    return this.ModuleNameSortAscending;
  }
  /** Set the case insensitive for field: ModuleName (GROUP_FUNCTION.module_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModuleNameCaseInsensitive (boolean ascending) {
    this.ModuleNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getModuleNameCaseInsensitive () {
    return this.ModuleNameCaseInsensitive;
  }
  /** Set the field level filters for field: ModuleName (GROUP_FUNCTION.module_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModuleNameFilter (StringFilter[] value) throws ServiceException {
    this.ModuleName = value;
  }
  /** Retrieve filter for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModuleNameFilter () {
    return this.ModuleName;
  }

  /**
   * Retrieves the ModuleNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ModuleNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModuleNameFilter field
   */
  public String[] getModuleNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getModuleNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModuleNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModuleNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getModuleNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ModuleNameFilter filter value from a formatted string
   *
   * @param _value the ModuleNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ModuleNameFilter filter field
   */
  public void setModuleNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setModuleNameFilterFromFormattedString");
    try {
      this.setModuleNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModuleNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setModuleNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModuleNameFilterFromFormattedString");
  }

  public String toString() {
    return CsrGroupFunctionObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CsrGroupFunctionObjectKeyHelper.toMap(this, null);
  }
}
