/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SRMObjectFilter.java
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
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class SRMObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public SRMObjectKeyFilter Key = null;
  /** raw field for: STATUS_VALUES.short_display) */
  public    StringFilter[] StatusShortDisplay  = null;
  protected boolean StatusShortDisplayFetch = false;
  protected boolean StatusShortDisplaySortAscending = true;
  protected boolean StatusShortDisplayCaseInsensitive = false;
  protected Integer StatusShortDisplaySort = null;
  /** raw field for: STATUS_VALUES.display_value) */
  public    StringFilter[] StatusDisplayValue  = null;
  protected boolean StatusDisplayValueFetch = false;
  protected boolean StatusDisplayValueSortAscending = true;
  protected boolean StatusDisplayValueCaseInsensitive = false;
  protected Integer StatusDisplayValueSort = null;
  /** raw field for: STATUS_REASON_VALUES.short_display) */
  public    StringFilter[] StatusReasonShortDisplay  = null;
  protected boolean StatusReasonShortDisplayFetch = false;
  protected boolean StatusReasonShortDisplaySortAscending = true;
  protected boolean StatusReasonShortDisplayCaseInsensitive = false;
  protected Integer StatusReasonShortDisplaySort = null;
  /** raw field for: STATUS_REASON_VALUES.display_value) */
  public    StringFilter[] StatusReasonDisplayValue  = null;
  protected boolean StatusReasonDisplayValueFetch = false;
  protected boolean StatusReasonDisplayValueSortAscending = true;
  protected boolean StatusReasonDisplayValueCaseInsensitive = false;
  protected Integer StatusReasonDisplayValueSort = null;
  private String _objName = "SRMObjectFilter";
  /** default constructor */
  public SRMObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public SRMObjectFilter (SRMObjectFilter other)
  {
    if (other == null) return;
    this.Key = new SRMObjectKeyFilter (other.Key);
    this.StatusShortDisplay = other.StatusShortDisplay;
    this.StatusShortDisplayFetch = other.StatusShortDisplayFetch;
    this.StatusShortDisplaySort = other.StatusShortDisplaySort;
    this.StatusShortDisplayCaseInsensitive = other.StatusShortDisplayCaseInsensitive;
    this.StatusShortDisplaySortAscending = other.StatusShortDisplaySortAscending;
    this.StatusDisplayValue = other.StatusDisplayValue;
    this.StatusDisplayValueFetch = other.StatusDisplayValueFetch;
    this.StatusDisplayValueSort = other.StatusDisplayValueSort;
    this.StatusDisplayValueCaseInsensitive = other.StatusDisplayValueCaseInsensitive;
    this.StatusDisplayValueSortAscending = other.StatusDisplayValueSortAscending;
    this.StatusReasonShortDisplay = other.StatusReasonShortDisplay;
    this.StatusReasonShortDisplayFetch = other.StatusReasonShortDisplayFetch;
    this.StatusReasonShortDisplaySort = other.StatusReasonShortDisplaySort;
    this.StatusReasonShortDisplayCaseInsensitive = other.StatusReasonShortDisplayCaseInsensitive;
    this.StatusReasonShortDisplaySortAscending = other.StatusReasonShortDisplaySortAscending;
    this.StatusReasonDisplayValue = other.StatusReasonDisplayValue;
    this.StatusReasonDisplayValueFetch = other.StatusReasonDisplayValueFetch;
    this.StatusReasonDisplayValueSort = other.StatusReasonDisplayValueSort;
    this.StatusReasonDisplayValueCaseInsensitive = other.StatusReasonDisplayValueCaseInsensitive;
    this.StatusReasonDisplayValueSortAscending = other.StatusReasonDisplayValueSortAscending;  }
  /** get the filter for this object's key
   * @return SRMObjectKeyFilter
   */
  public SRMObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (SRMObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: StatusId (STATUS_REASON_MAP.status_id)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.StatusIdFetch;
  }
  /** Set the SortOrder for field: StatusId (STATUS_REASON_MAP.status_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusIdSort = value;
  }
  /** Retrieve SortOrder for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.StatusIdSort;
  }
  /** Set the sort direction for field: StatusId (STATUS_REASON_MAP.status_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.StatusIdSortAscending;
  }
  /** Set the field level filters for field: StatusId (STATUS_REASON_MAP.status_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusId = value;
  }
  /** Retrieve filter for field: StatusId (STATUS_REASON_MAP.status_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.StatusId;
  }
  /** Set the field level Fetch value for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusReasonIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusReasonIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusReasonIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.StatusReasonIdFetch;
  }
  /** Set the SortOrder for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusReasonIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusReasonIdSort = value;
  }
  /** Retrieve SortOrder for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusReasonIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.StatusReasonIdSort;
  }
  /** Set the sort direction for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusReasonIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusReasonIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusReasonIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.StatusReasonIdSortAscending;
  }
  /** Set the field level filters for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusReasonIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.StatusReasonId = value;
  }
  /** Retrieve filter for field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusReasonIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.StatusReasonId;
  }
  /** Set the field level Fetch value for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SRMObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusShortDisplayFetch (boolean fetch) {
    this.StatusShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusShortDisplayFetch () {
    return this.StatusShortDisplayFetch;
  }
  /** Set the SortOrder for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusShortDisplaySortOrder (Integer value) {
    this.StatusShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusShortDisplaySortOrder () {
    return this.StatusShortDisplaySort;
  }
  /** Set the sort direction for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusShortDisplaySortDirection (boolean ascending) {
    this.StatusShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusShortDisplaySortDirection () {
    return this.StatusShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStatusShortDisplayCaseInsensitive (boolean ascending) {
    this.StatusShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStatusShortDisplayCaseInsensitive () {
    return this.StatusShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.StatusShortDisplay = value;
  }
  /** Retrieve filter for field: StatusShortDisplay (STATUS_VALUES.short_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStatusShortDisplayFilter () {
    return this.StatusShortDisplay;
  }

  /**
   * Retrieves the StatusShortDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusShortDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusShortDisplayFilter field
   */
  public String[] getStatusShortDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusShortDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusShortDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusShortDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusShortDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusShortDisplayFilter filter value from a formatted string
   *
   * @param _value the StatusShortDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusShortDisplayFilter filter field
   */
  public void setStatusShortDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusShortDisplayFilterFromFormattedString");
    try {
      this.setStatusShortDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusShortDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusShortDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusDisplayValueFetch (boolean fetch) {
    this.StatusDisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusDisplayValueFetch () {
    return this.StatusDisplayValueFetch;
  }
  /** Set the SortOrder for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusDisplayValueSortOrder (Integer value) {
    this.StatusDisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusDisplayValueSortOrder () {
    return this.StatusDisplayValueSort;
  }
  /** Set the sort direction for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusDisplayValueSortDirection (boolean ascending) {
    this.StatusDisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusDisplayValueSortDirection () {
    return this.StatusDisplayValueSortAscending;
  }
  /** Set the case insensitive for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStatusDisplayValueCaseInsensitive (boolean ascending) {
    this.StatusDisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStatusDisplayValueCaseInsensitive () {
    return this.StatusDisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.StatusDisplayValue = value;
  }
  /** Retrieve filter for field: StatusDisplayValue (STATUS_VALUES.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStatusDisplayValueFilter () {
    return this.StatusDisplayValue;
  }

  /**
   * Retrieves the StatusDisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusDisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusDisplayValueFilter field
   */
  public String[] getStatusDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusDisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusDisplayValueFilter filter value from a formatted string
   *
   * @param _value the StatusDisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusDisplayValueFilter filter field
   */
  public void setStatusDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusDisplayValueFilterFromFormattedString");
    try {
      this.setStatusDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusDisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusDisplayValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusReasonShortDisplayFetch (boolean fetch) {
    this.StatusReasonShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusReasonShortDisplayFetch () {
    return this.StatusReasonShortDisplayFetch;
  }
  /** Set the SortOrder for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusReasonShortDisplaySortOrder (Integer value) {
    this.StatusReasonShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusReasonShortDisplaySortOrder () {
    return this.StatusReasonShortDisplaySort;
  }
  /** Set the sort direction for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusReasonShortDisplaySortDirection (boolean ascending) {
    this.StatusReasonShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusReasonShortDisplaySortDirection () {
    return this.StatusReasonShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStatusReasonShortDisplayCaseInsensitive (boolean ascending) {
    this.StatusReasonShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStatusReasonShortDisplayCaseInsensitive () {
    return this.StatusReasonShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusReasonShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.StatusReasonShortDisplay = value;
  }
  /** Retrieve filter for field: StatusReasonShortDisplay (STATUS_REASON_VALUES.short_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStatusReasonShortDisplayFilter () {
    return this.StatusReasonShortDisplay;
  }

  /**
   * Retrieves the StatusReasonShortDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusReasonShortDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusReasonShortDisplayFilter field
   */
  public String[] getStatusReasonShortDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonShortDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusReasonShortDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonShortDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusReasonShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusReasonShortDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusReasonShortDisplayFilter filter value from a formatted string
   *
   * @param _value the StatusReasonShortDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusReasonShortDisplayFilter filter field
   */
  public void setStatusReasonShortDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusReasonShortDisplayFilterFromFormattedString");
    try {
      this.setStatusReasonShortDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusReasonShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusReasonShortDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusReasonShortDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusReasonDisplayValueFetch (boolean fetch) {
    this.StatusReasonDisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusReasonDisplayValueFetch () {
    return this.StatusReasonDisplayValueFetch;
  }
  /** Set the SortOrder for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusReasonDisplayValueSortOrder (Integer value) {
    this.StatusReasonDisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusReasonDisplayValueSortOrder () {
    return this.StatusReasonDisplayValueSort;
  }
  /** Set the sort direction for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusReasonDisplayValueSortDirection (boolean ascending) {
    this.StatusReasonDisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusReasonDisplayValueSortDirection () {
    return this.StatusReasonDisplayValueSortAscending;
  }
  /** Set the case insensitive for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStatusReasonDisplayValueCaseInsensitive (boolean ascending) {
    this.StatusReasonDisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStatusReasonDisplayValueCaseInsensitive () {
    return this.StatusReasonDisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusReasonDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.StatusReasonDisplayValue = value;
  }
  /** Retrieve filter for field: StatusReasonDisplayValue (STATUS_REASON_VALUES.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStatusReasonDisplayValueFilter () {
    return this.StatusReasonDisplayValue;
  }

  /**
   * Retrieves the StatusReasonDisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusReasonDisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusReasonDisplayValueFilter field
   */
  public String[] getStatusReasonDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusReasonDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusReasonDisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusReasonDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusReasonDisplayValueFilter filter value from a formatted string
   *
   * @param _value the StatusReasonDisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusReasonDisplayValueFilter filter field
   */
  public void setStatusReasonDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusReasonDisplayValueFilterFromFormattedString");
    try {
      this.setStatusReasonDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusReasonDisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusReasonDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusReasonDisplayValueFilterFromFormattedString");
  }

  public String toString() {
    return SRMObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SRMObjectHelper.toMap(this, null);
  }
}
