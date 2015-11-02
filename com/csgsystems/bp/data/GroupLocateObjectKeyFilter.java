/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupLocateObjectKeyFilter.java
 * Definition File: Catalog/GroupLocate.xml
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

/** Key Filter for GroupLocateObject object. */
public class GroupLocateObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: EXTERNAL_ID_GROUP_MAP.external_id) */
  public    StringFilter[] GroupExternalId  = null;
  protected boolean GroupExternalIdFetch = false;
  protected boolean GroupExternalIdSortAscending = true;
  protected boolean GroupExternalIdCaseInsensitive = false;
  protected Integer GroupExternalIdSort = null;
  /** raw field for: EXTERNAL_ID_GROUP_MAP.external_id_type) */
  public    IntegerFilter[] GroupExternalIdType  = null;
  protected boolean GroupExternalIdTypeFetch = false;
  protected boolean GroupExternalIdTypeSortAscending = true;
  protected Integer GroupExternalIdTypeSort = null;
  private String _objName = "GroupLocateObjectKeyFilter";
  /** default constructor */
  public GroupLocateObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public GroupLocateObjectKeyFilter (GroupLocateObjectKeyFilter other)
  {
    if (other == null) return;
    this.GroupExternalId = other.GroupExternalId;
    this.GroupExternalIdFetch = other.GroupExternalIdFetch;
    this.GroupExternalIdSort = other.GroupExternalIdSort;
    this.GroupExternalIdCaseInsensitive = other.GroupExternalIdCaseInsensitive;
    this.GroupExternalIdSortAscending = other.GroupExternalIdSortAscending;
    this.GroupExternalIdType = other.GroupExternalIdType;
    this.GroupExternalIdTypeFetch = other.GroupExternalIdTypeFetch;
    this.GroupExternalIdTypeSort = other.GroupExternalIdTypeSort;
    this.GroupExternalIdTypeSortAscending = other.GroupExternalIdTypeSortAscending;
  }
  /** Set the field level Fetch value for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupExternalIdFetch (boolean fetch) {
    this.GroupExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupExternalIdFetch () {
    return this.GroupExternalIdFetch;
  }
  /** Set the SortOrder for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupExternalIdSortOrder (Integer value) {
    this.GroupExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupExternalIdSortOrder () {
    return this.GroupExternalIdSort;
  }
  /** Set the sort direction for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupExternalIdSortDirection (boolean ascending) {
    this.GroupExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupExternalIdSortDirection () {
    return this.GroupExternalIdSortAscending;
  }
  /** Set the case insensitive for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGroupExternalIdCaseInsensitive (boolean ascending) {
    this.GroupExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGroupExternalIdCaseInsensitive () {
    return this.GroupExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.GroupExternalId = value;
  }
  /** Retrieve filter for field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGroupExternalIdFilter () {
    return this.GroupExternalId;
  }

  /**
   * Retrieves the GroupExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupExternalIdFilter field
   */
  public String[] getGroupExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupExternalIdFilter filter value from a formatted string
   *
   * @param _value the GroupExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupExternalIdFilter filter field
   */
  public void setGroupExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupExternalIdFilterFromFormattedString");
    try {
      this.setGroupExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupExternalIdTypeFetch (boolean fetch) {
    this.GroupExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupExternalIdTypeFetch () {
    return this.GroupExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupExternalIdTypeSortOrder (Integer value) {
    this.GroupExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupExternalIdTypeSortOrder () {
    return this.GroupExternalIdTypeSort;
  }
  /** Set the sort direction for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupExternalIdTypeSortDirection (boolean ascending) {
    this.GroupExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupExternalIdTypeSortDirection () {
    return this.GroupExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupExternalIdType = value;
  }
  /** Retrieve filter for field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupExternalIdTypeFilter () {
    return this.GroupExternalIdType;
  }

  /**
   * Retrieves the GroupExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupExternalIdTypeFilter field
   */
  public String[] getGroupExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the GroupExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupExternalIdTypeFilter filter field
   */
  public void setGroupExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupExternalIdTypeFilterFromFormattedString");
    try {
      this.setGroupExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupExternalIdTypeFilterFromFormattedString");
  }

  public String toString() {
    return GroupLocateObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GroupLocateObjectKeyHelper.toMap(this, null);
  }
}
