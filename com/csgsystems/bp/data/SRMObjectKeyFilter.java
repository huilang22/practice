/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SRMObjectKeyFilter.java
 * Definition File: Admin/StatusReasonMap.xml
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

/** Key Filter for SRMObject object. */
public class SRMObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: STATUS_REASON_MAP.status_id) */
  public    IntegerFilter[] StatusId  = null;
  protected boolean StatusIdFetch = false;
  protected boolean StatusIdSortAscending = true;
  protected Integer StatusIdSort = null;
  /** raw field for: STATUS_REASON_MAP.status_reason_id) */
  public    IntegerFilter[] StatusReasonId  = null;
  protected boolean StatusReasonIdFetch = false;
  protected boolean StatusReasonIdSortAscending = true;
  protected Integer StatusReasonIdSort = null;
  /** raw field for: STATUS_REASON_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "SRMObjectKeyFilter";
  /** default constructor */
  public SRMObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public SRMObjectKeyFilter (SRMObjectKeyFilter other)
  {
    if (other == null) return;
    this.StatusId = other.StatusId;
    this.StatusIdFetch = other.StatusIdFetch;
    this.StatusIdSort = other.StatusIdSort;
    this.StatusIdSortAscending = other.StatusIdSortAscending;
    this.StatusReasonId = other.StatusReasonId;
    this.StatusReasonIdFetch = other.StatusReasonIdFetch;
    this.StatusReasonIdSort = other.StatusReasonIdSort;
    this.StatusReasonIdSortAscending = other.StatusReasonIdSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: StatusId (STATUS_REASON_MAP.status_id)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusIdFetch (boolean fetch) {
    this.StatusIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusIdFetch () {
    return this.StatusIdFetch;
  }
  /** Set the SortOrder for field: StatusId (STATUS_REASON_MAP.status_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusIdSortOrder (Integer value) {
    this.StatusIdSort = value;
  }
  /** Retrieve SortOrder for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusIdSortOrder () {
    return this.StatusIdSort;
  }
  /** Set the sort direction for field: StatusId (STATUS_REASON_MAP.status_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusIdSortDirection (boolean ascending) {
    this.StatusIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusIdSortDirection () {
    return this.StatusIdSortAscending;
  }
  /** Set the field level filters for field: StatusId (STATUS_REASON_MAP.status_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusIdFilter (IntegerFilter[] value) throws ServiceException {
    this.StatusId = value;
  }
  /** Retrieve filter for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusIdFilter () {
    return this.StatusId;
  }

  /**
   * Retrieves the StatusIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusIdFilter field
   */
  public String[] getStatusIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusIdFilter filter value from a formatted string
   *
   * @param _value the StatusIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusIdFilter filter field
   */
  public void setStatusIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusIdFilterFromFormattedString");
    try {
      this.setStatusIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusReasonIdFetch (boolean fetch) {
    this.StatusReasonIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusReasonIdFetch () {
    return this.StatusReasonIdFetch;
  }
  /** Set the SortOrder for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusReasonIdSortOrder (Integer value) {
    this.StatusReasonIdSort = value;
  }
  /** Retrieve SortOrder for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusReasonIdSortOrder () {
    return this.StatusReasonIdSort;
  }
  /** Set the sort direction for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusReasonIdSortDirection (boolean ascending) {
    this.StatusReasonIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusReasonIdSortDirection () {
    return this.StatusReasonIdSortAscending;
  }
  /** Set the field level filters for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusReasonIdFilter (IntegerFilter[] value) throws ServiceException {
    this.StatusReasonId = value;
  }
  /** Retrieve filter for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusReasonIdFilter () {
    return this.StatusReasonId;
  }

  /**
   * Retrieves the StatusReasonIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusReasonIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusReasonIdFilter field
   */
  public String[] getStatusReasonIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusReasonIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusReasonIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusReasonIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusReasonIdFilter filter value from a formatted string
   *
   * @param _value the StatusReasonIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusReasonIdFilter filter field
   */
  public void setStatusReasonIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusReasonIdFilterFromFormattedString");
    try {
      this.setStatusReasonIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusReasonIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusReasonIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusReasonIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (STATUS_REASON_VALUES.language_code)
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

  public String toString() {
    return SRMObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SRMObjectKeyHelper.toMap(this, null);
  }
}
