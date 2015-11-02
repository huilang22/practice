/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterTypeObjectKeyFilter.java
 * Definition File: Admin/ServiceCenterType.xml
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

/** Key Filter for ServiceCenterTypeObject object. */
public class ServiceCenterTypeObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: SERVICE_CENTER_TYPES.service_center_id) */
  public    IntegerFilter[] ServiceCenterId  = null;
  protected boolean ServiceCenterIdFetch = false;
  protected boolean ServiceCenterIdSortAscending = true;
  protected Integer ServiceCenterIdSort = null;
  /** raw field for: SERVICE_CENTER_TYPES.service_center_type) */
  public    IntegerFilter[] ServiceCenterType  = null;
  protected boolean ServiceCenterTypeFetch = false;
  protected boolean ServiceCenterTypeSortAscending = true;
  protected Integer ServiceCenterTypeSort = null;
  /** raw field for: SERVICE_CENTER_TYPE_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "ServiceCenterTypeObjectKeyFilter";
  /** default constructor */
  public ServiceCenterTypeObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ServiceCenterTypeObjectKeyFilter (ServiceCenterTypeObjectKeyFilter other)
  {
    if (other == null) return;
    this.ServiceCenterId = other.ServiceCenterId;
    this.ServiceCenterIdFetch = other.ServiceCenterIdFetch;
    this.ServiceCenterIdSort = other.ServiceCenterIdSort;
    this.ServiceCenterIdSortAscending = other.ServiceCenterIdSortAscending;
    this.ServiceCenterType = other.ServiceCenterType;
    this.ServiceCenterTypeFetch = other.ServiceCenterTypeFetch;
    this.ServiceCenterTypeSort = other.ServiceCenterTypeSort;
    this.ServiceCenterTypeSortAscending = other.ServiceCenterTypeSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterIdFetch (boolean fetch) {
    this.ServiceCenterIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterIdFetch () {
    return this.ServiceCenterIdFetch;
  }
  /** Set the SortOrder for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterIdSortOrder (Integer value) {
    this.ServiceCenterIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterIdSortOrder () {
    return this.ServiceCenterIdSort;
  }
  /** Set the sort direction for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterIdSortDirection (boolean ascending) {
    this.ServiceCenterIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterIdSortDirection () {
    return this.ServiceCenterIdSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceCenterId = value;
  }
  /** Retrieve filter for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceCenterIdFilter () {
    return this.ServiceCenterId;
  }

  /**
   * Retrieves the ServiceCenterIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceCenterIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterIdFilter field
   */
  public String[] getServiceCenterIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceCenterIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceCenterIdFilter filter value from a formatted string
   *
   * @param _value the ServiceCenterIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceCenterIdFilter filter field
   */
  public void setServiceCenterIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceCenterIdFilterFromFormattedString");
    try {
      this.setServiceCenterIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterTypeFetch (boolean fetch) {
    this.ServiceCenterTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterTypeFetch () {
    return this.ServiceCenterTypeFetch;
  }
  /** Set the SortOrder for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterTypeSortOrder (Integer value) {
    this.ServiceCenterTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterTypeSortOrder () {
    return this.ServiceCenterTypeSort;
  }
  /** Set the sort direction for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterTypeSortDirection (boolean ascending) {
    this.ServiceCenterTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterTypeSortDirection () {
    return this.ServiceCenterTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceCenterType = value;
  }
  /** Retrieve filter for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceCenterTypeFilter () {
    return this.ServiceCenterType;
  }

  /**
   * Retrieves the ServiceCenterTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceCenterTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterTypeFilter field
   */
  public String[] getServiceCenterTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceCenterTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceCenterTypeFilter filter value from a formatted string
   *
   * @param _value the ServiceCenterTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceCenterTypeFilter filter field
   */
  public void setServiceCenterTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceCenterTypeFilterFromFormattedString");
    try {
      this.setServiceCenterTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
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
    return ServiceCenterTypeObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServiceCenterTypeObjectKeyHelper.toMap(this, null);
  }
}
