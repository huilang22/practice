/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CorridorObjectKeyFilter.java
 * Definition File: Customer/Corridor.xml
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

/** Key Filter for CorridorObject object. */
public class CorridorObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CUSTOMER_CORRIDORS.tracking_id) */
  public    IntegerFilter[] TrackingId  = null;
  protected boolean TrackingIdFetch = false;
  protected boolean TrackingIdSortAscending = true;
  protected Integer TrackingIdSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.tracking_id_serv) */
  public    IntegerFilter[] TrackingIdServ  = null;
  protected boolean TrackingIdServFetch = false;
  protected boolean TrackingIdServSortAscending = true;
  protected Integer TrackingIdServSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "CorridorObjectKeyFilter";
  /** default constructor */
  public CorridorObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CorridorObjectKeyFilter (CorridorObjectKeyFilter other)
  {
    if (other == null) return;
    this.TrackingId = other.TrackingId;
    this.TrackingIdFetch = other.TrackingIdFetch;
    this.TrackingIdSort = other.TrackingIdSort;
    this.TrackingIdSortAscending = other.TrackingIdSortAscending;
    this.TrackingIdServ = other.TrackingIdServ;
    this.TrackingIdServFetch = other.TrackingIdServFetch;
    this.TrackingIdServSort = other.TrackingIdServSort;
    this.TrackingIdServSortAscending = other.TrackingIdServSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch) {
    this.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch () {
    return this.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value) {
    this.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder () {
    return this.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending) {
    this.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection () {
    return this.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
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

  /** Set the field level Fetch value for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch) {
    this.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch () {
    return this.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value) {
    this.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder () {
    return this.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending) {
    this.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection () {
    return this.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
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

  /** Set the field level Fetch value for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated LanguageCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCodeFilter filter field
   */
  public String[] getLanguageCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getLanguageCodeFilter(), "LanguageCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated LanguageCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "LanguageCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
  }


  public String toString() {
    return CorridorObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CorridorObjectKeyHelper.toMap(this, null);
  }
}
