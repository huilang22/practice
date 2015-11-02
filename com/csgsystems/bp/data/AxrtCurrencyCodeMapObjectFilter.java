/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCurrencyCodeMapObjectFilter.java
 * Definition File: Admin/AxrtCurrencyCodeMap.xml
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
public class AxrtCurrencyCodeMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AxrtCurrencyCodeMapObjectKeyFilter Key = null;
  /** raw field for: ISO_CURRENCY_CODE_MAPPING.iso_currency_code) */
  public    StringFilter[] IsoCurrencyCode  = null;
  protected boolean IsoCurrencyCodeFetch = false;
  protected boolean IsoCurrencyCodeSortAscending = true;
  protected boolean IsoCurrencyCodeCaseInsensitive = false;
  protected Integer IsoCurrencyCodeSort = null;
  /** raw field for: ISO_CURRENCY_CODE_MAPPING.description) */
  public    StringFilter[] Description  = null;
  protected boolean DescriptionFetch = false;
  protected boolean DescriptionSortAscending = true;
  protected boolean DescriptionCaseInsensitive = false;
  protected Integer DescriptionSort = null;
  /** raw field for: ISO_CURRENCY_CODE_MAPPING.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "AxrtCurrencyCodeMapObjectFilter";
  /** default constructor */
  public AxrtCurrencyCodeMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AxrtCurrencyCodeMapObjectFilter (AxrtCurrencyCodeMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AxrtCurrencyCodeMapObjectKeyFilter (other.Key);
    this.IsoCurrencyCode = other.IsoCurrencyCode;
    this.IsoCurrencyCodeFetch = other.IsoCurrencyCodeFetch;
    this.IsoCurrencyCodeSort = other.IsoCurrencyCodeSort;
    this.IsoCurrencyCodeCaseInsensitive = other.IsoCurrencyCodeCaseInsensitive;
    this.IsoCurrencyCodeSortAscending = other.IsoCurrencyCodeSortAscending;
    this.Description = other.Description;
    this.DescriptionFetch = other.DescriptionFetch;
    this.DescriptionSort = other.DescriptionSort;
    this.DescriptionCaseInsensitive = other.DescriptionCaseInsensitive;
    this.DescriptionSortAscending = other.DescriptionSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return AxrtCurrencyCodeMapObjectKeyFilter
   */
  public AxrtCurrencyCodeMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AxrtCurrencyCodeMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setRateCurrencyCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AxrtCurrencyCodeMapObjectKeyFilter ();
    this.Key.RateCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateCurrencyCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RateCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateCurrencyCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AxrtCurrencyCodeMapObjectKeyFilter ();
    this.Key.RateCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateCurrencyCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RateCurrencyCodeSort;
  }
  /** Set the sort direction for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateCurrencyCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AxrtCurrencyCodeMapObjectKeyFilter ();
    this.Key.RateCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateCurrencyCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RateCurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AxrtCurrencyCodeMapObjectKeyFilter ();
    this.Key.RateCurrencyCode = value;
  }
  /** Retrieve filter for field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateCurrencyCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.RateCurrencyCode;
  }
  /** Set the field level Fetch value for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setIsoCurrencyCodeFetch (boolean fetch) {
    this.IsoCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsoCurrencyCodeFetch () {
    return this.IsoCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsoCurrencyCodeSortOrder (Integer value) {
    this.IsoCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsoCurrencyCodeSortOrder () {
    return this.IsoCurrencyCodeSort;
  }
  /** Set the sort direction for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsoCurrencyCodeSortDirection (boolean ascending) {
    this.IsoCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsoCurrencyCodeSortDirection () {
    return this.IsoCurrencyCodeSortAscending;
  }
  /** Set the case insensitive for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setIsoCurrencyCodeCaseInsensitive (boolean ascending) {
    this.IsoCurrencyCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getIsoCurrencyCodeCaseInsensitive () {
    return this.IsoCurrencyCodeCaseInsensitive;
  }
  /** Set the field level filters for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsoCurrencyCodeFilter (StringFilter[] value) throws ServiceException {
    this.IsoCurrencyCode = value;
  }
  /** Retrieve filter for field: IsoCurrencyCode (ISO_CURRENCY_CODE_MAPPING.iso_currency_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getIsoCurrencyCodeFilter () {
    return this.IsoCurrencyCode;
  }

  /**
   * Retrieves the IsoCurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsoCurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsoCurrencyCodeFilter field
   */
  public String[] getIsoCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsoCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsoCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsoCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsoCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsoCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsoCurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the IsoCurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsoCurrencyCodeFilter filter field
   */
  public void setIsoCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsoCurrencyCodeFilterFromFormattedString");
    try {
      this.setIsoCurrencyCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsoCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsoCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsoCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionFetch (boolean fetch) {
    this.DescriptionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionFetch () {
    return this.DescriptionFetch;
  }
  /** Set the SortOrder for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionSortOrder (Integer value) {
    this.DescriptionSort = value;
  }
  /** Retrieve SortOrder for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionSortOrder () {
    return this.DescriptionSort;
  }
  /** Set the sort direction for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionSortDirection (boolean ascending) {
    this.DescriptionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionSortDirection () {
    return this.DescriptionSortAscending;
  }
  /** Set the case insensitive for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDescriptionCaseInsensitive (boolean ascending) {
    this.DescriptionCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDescriptionCaseInsensitive () {
    return this.DescriptionCaseInsensitive;
  }
  /** Set the field level filters for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionFilter (StringFilter[] value) throws ServiceException {
    this.Description = value;
  }
  /** Retrieve filter for field: Description (ISO_CURRENCY_CODE_MAPPING.description)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDescriptionFilter () {
    return this.Description;
  }

  /**
   * Retrieves the DescriptionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionFilter field
   */
  public String[] getDescriptionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionFilter filter value from a formatted string
   *
   * @param _value the DescriptionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionFilter filter field
   */
  public void setDescriptionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionFilterFromFormattedString");
    try {
      this.setDescriptionFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (ISO_CURRENCY_CODE_MAPPING.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  public String toString() {
    return AxrtCurrencyCodeMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AxrtCurrencyCodeMapObjectHelper.toMap(this, null);
  }
}
