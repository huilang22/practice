/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupCorridorObjectKeyFilter.java
 * Definition File: Catalog/HqGroupCorridor.xml
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

/** Key Filter for HqGroupCorridorObject object. */
public class HqGroupCorridorObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: HQ_GROUP_CORRIDORS.group_id) */
  public    IntegerFilter[] GroupId  = null;
  protected boolean GroupIdFetch = false;
  protected boolean GroupIdSortAscending = true;
  protected Integer GroupIdSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.group_id_serv) */
  public    IntegerFilter[] GroupIdServ  = null;
  protected boolean GroupIdServFetch = false;
  protected boolean GroupIdServSortAscending = true;
  protected Integer GroupIdServSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.tracking_id) */
  public    IntegerFilter[] TrackingId  = null;
  protected boolean TrackingIdFetch = false;
  protected boolean TrackingIdSortAscending = true;
  protected Integer TrackingIdSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.tracking_id_serv) */
  public    IntegerFilter[] TrackingIdServ  = null;
  protected boolean TrackingIdServFetch = false;
  protected boolean TrackingIdServSortAscending = true;
  protected Integer TrackingIdServSort = null;
  private String _objName = "HqGroupCorridorObjectKeyFilter";
  /** default constructor */
  public HqGroupCorridorObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public HqGroupCorridorObjectKeyFilter (HqGroupCorridorObjectKeyFilter other)
  {
    if (other == null) return;
    this.GroupId = other.GroupId;
    this.GroupIdFetch = other.GroupIdFetch;
    this.GroupIdSort = other.GroupIdSort;
    this.GroupIdSortAscending = other.GroupIdSortAscending;
    this.GroupIdServ = other.GroupIdServ;
    this.GroupIdServFetch = other.GroupIdServFetch;
    this.GroupIdServSort = other.GroupIdServSort;
    this.GroupIdServSortAscending = other.GroupIdServSortAscending;
    this.TrackingId = other.TrackingId;
    this.TrackingIdFetch = other.TrackingIdFetch;
    this.TrackingIdSort = other.TrackingIdSort;
    this.TrackingIdSortAscending = other.TrackingIdSortAscending;
    this.TrackingIdServ = other.TrackingIdServ;
    this.TrackingIdServFetch = other.TrackingIdServFetch;
    this.TrackingIdServSort = other.TrackingIdServSort;
    this.TrackingIdServSortAscending = other.TrackingIdServSortAscending;
  }
  /** Set the field level Fetch value for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdFetch (boolean fetch) {
    this.GroupIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdFetch () {
    return this.GroupIdFetch;
  }
  /** Set the SortOrder for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdSortOrder (Integer value) {
    this.GroupIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdSortOrder () {
    return this.GroupIdSort;
  }
  /** Set the sort direction for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdSortDirection (boolean ascending) {
    this.GroupIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdSortDirection () {
    return this.GroupIdSortAscending;
  }
  /** Set the field level filters for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupId = value;
  }
  /** Retrieve filter for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdFilter () {
    return this.GroupId;
  }

  /**
   * Retrieves the GroupIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdFilter field
   */
  public String[] getGroupIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupIdFilter filter value from a formatted string
   *
   * @param _value the GroupIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupIdFilter filter field
   */
  public void setGroupIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupIdFilterFromFormattedString");
    try {
      this.setGroupIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdServFetch (boolean fetch) {
    this.GroupIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdServFetch () {
    return this.GroupIdServFetch;
  }
  /** Set the SortOrder for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdServSortOrder (Integer value) {
    this.GroupIdServSort = value;
  }
  /** Retrieve SortOrder for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdServSortOrder () {
    return this.GroupIdServSort;
  }
  /** Set the sort direction for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdServSortDirection (boolean ascending) {
    this.GroupIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdServSortDirection () {
    return this.GroupIdServSortAscending;
  }
  /** Set the field level filters for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupIdServ = value;
  }
  /** Retrieve filter for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdServFilter () {
    return this.GroupIdServ;
  }

  /**
   * Retrieves the GroupIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdServFilter field
   */
  public String[] getGroupIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupIdServFilter filter value from a formatted string
   *
   * @param _value the GroupIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupIdServFilter filter field
   */
  public void setGroupIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupIdServFilterFromFormattedString");
    try {
      this.setGroupIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch) {
    this.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch () {
    return this.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value) {
    this.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder () {
    return this.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending) {
    this.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection () {
    return this.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter () {
    return this.TrackingId;
  }

  /**
   * Retrieves the TrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdFilter field
   */
  public String[] getTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdFilter filter value from a formatted string
   *
   * @param _value the TrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdFilter filter field
   */
  public void setTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdFilterFromFormattedString");
    try {
      this.setTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch) {
    this.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch () {
    return this.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value) {
    this.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder () {
    return this.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending) {
    this.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection () {
    return this.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter () {
    return this.TrackingIdServ;
  }

  /**
   * Retrieves the TrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServFilter field
   */
  public String[] getTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdServFilter filter value from a formatted string
   *
   * @param _value the TrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdServFilter filter field
   */
  public void setTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdServFilterFromFormattedString");
    try {
      this.setTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return HqGroupCorridorObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HqGroupCorridorObjectKeyHelper.toMap(this, null);
  }
}
