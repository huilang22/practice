/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RegulatoryIdObjectKeyFilter.java
 * Definition File: Admin/RegulatoryId.xml
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

/** Key Filter for RegulatoryIdObject object. */
public class RegulatoryIdObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: REGULATORY_ID_VALUES.regulatory_id) */
  public    IntegerFilter[] RegulatoryId  = null;
  protected boolean RegulatoryIdFetch = false;
  protected boolean RegulatoryIdSortAscending = true;
  protected Integer RegulatoryIdSort = null;
  /** raw field for: REGULATORY_ID_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "RegulatoryIdObjectKeyFilter";
  /** default constructor */
  public RegulatoryIdObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public RegulatoryIdObjectKeyFilter (RegulatoryIdObjectKeyFilter other)
  {
    if (other == null) return;
    this.RegulatoryId = other.RegulatoryId;
    this.RegulatoryIdFetch = other.RegulatoryIdFetch;
    this.RegulatoryIdSort = other.RegulatoryIdSort;
    this.RegulatoryIdSortAscending = other.RegulatoryIdSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRegulatoryIdFetch (boolean fetch) {
    this.RegulatoryIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRegulatoryIdFetch () {
    return this.RegulatoryIdFetch;
  }
  /** Set the SortOrder for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRegulatoryIdSortOrder (Integer value) {
    this.RegulatoryIdSort = value;
  }
  /** Retrieve SortOrder for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRegulatoryIdSortOrder () {
    return this.RegulatoryIdSort;
  }
  /** Set the sort direction for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRegulatoryIdSortDirection (boolean ascending) {
    this.RegulatoryIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRegulatoryIdSortDirection () {
    return this.RegulatoryIdSortAscending;
  }
  /** Set the field level filters for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRegulatoryIdFilter (IntegerFilter[] value) throws ServiceException {
    this.RegulatoryId = value;
  }
  /** Retrieve filter for field: RegulatoryId (REGULATORY_ID_VALUES.regulatory_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRegulatoryIdFilter () {
    return this.RegulatoryId;
  }

  /**
   * Retrieves the RegulatoryIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RegulatoryIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RegulatoryIdFilter field
   */
  public String[] getRegulatoryIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRegulatoryIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RegulatoryIdFilter filter value from a formatted string
   *
   * @param _value the RegulatoryIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RegulatoryIdFilter filter field
   */
  public void setRegulatoryIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
    try {
      this.setRegulatoryIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (REGULATORY_ID_VALUES.language_code)
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
    return RegulatoryIdObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RegulatoryIdObjectKeyHelper.toMap(this, null);
  }
}
