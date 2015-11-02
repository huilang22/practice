/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RtPaymentResponseObjectKeyFilter.java
 * Definition File: Admin/RtPaymentResponse.xml
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

/** Key Filter for RtPaymentResponseObject object. */
public class RtPaymentResponseObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: RT_PAYMENT_RESP_VALUES.epg_type) */
  public    StringFilter[] EpgType  = null;
  protected boolean EpgTypeFetch = false;
  protected boolean EpgTypeSortAscending = true;
  protected boolean EpgTypeCaseInsensitive = false;
  protected Integer EpgTypeSort = null;
  /** raw field for: RT_PAYMENT_RESP_VALUES.reply_flag) */
  public    StringFilter[] ReplyFlag  = null;
  protected boolean ReplyFlagFetch = false;
  protected boolean ReplyFlagSortAscending = true;
  protected boolean ReplyFlagCaseInsensitive = false;
  protected Integer ReplyFlagSort = null;
  /** raw field for: RT_PAYMENT_RESP_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "RtPaymentResponseObjectKeyFilter";
  /** default constructor */
  public RtPaymentResponseObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public RtPaymentResponseObjectKeyFilter (RtPaymentResponseObjectKeyFilter other)
  {
    if (other == null) return;
    this.EpgType = other.EpgType;
    this.EpgTypeFetch = other.EpgTypeFetch;
    this.EpgTypeSort = other.EpgTypeSort;
    this.EpgTypeCaseInsensitive = other.EpgTypeCaseInsensitive;
    this.EpgTypeSortAscending = other.EpgTypeSortAscending;
    this.ReplyFlag = other.ReplyFlag;
    this.ReplyFlagFetch = other.ReplyFlagFetch;
    this.ReplyFlagSort = other.ReplyFlagSort;
    this.ReplyFlagCaseInsensitive = other.ReplyFlagCaseInsensitive;
    this.ReplyFlagSortAscending = other.ReplyFlagSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @param fetch whether to fetch this field or not
   */
  public void setEpgTypeFetch (boolean fetch) {
    this.EpgTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getEpgTypeFetch () {
    return this.EpgTypeFetch;
  }
  /** Set the SortOrder for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEpgTypeSortOrder (Integer value) {
    this.EpgTypeSort = value;
  }
  /** Retrieve SortOrder for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEpgTypeSortOrder () {
    return this.EpgTypeSort;
  }
  /** Set the sort direction for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEpgTypeSortDirection (boolean ascending) {
    this.EpgTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEpgTypeSortDirection () {
    return this.EpgTypeSortAscending;
  }
  /** Set the case insensitive for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEpgTypeCaseInsensitive (boolean ascending) {
    this.EpgTypeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEpgTypeCaseInsensitive () {
    return this.EpgTypeCaseInsensitive;
  }
  /** Set the field level filters for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEpgTypeFilter (StringFilter[] value) throws ServiceException {
    this.EpgType = value;
  }
  /** Retrieve filter for field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEpgTypeFilter () {
    return this.EpgType;
  }

  /**
   * Retrieves the EpgTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EpgTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgTypeFilter field
   */
  public String[] getEpgTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEpgTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EpgTypeFilter filter value from a formatted string
   *
   * @param _value the EpgTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EpgTypeFilter filter field
   */
  public void setEpgTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEpgTypeFilterFromFormattedString");
    try {
      this.setEpgTypeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setReplyFlagFetch (boolean fetch) {
    this.ReplyFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getReplyFlagFetch () {
    return this.ReplyFlagFetch;
  }
  /** Set the SortOrder for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReplyFlagSortOrder (Integer value) {
    this.ReplyFlagSort = value;
  }
  /** Retrieve SortOrder for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReplyFlagSortOrder () {
    return this.ReplyFlagSort;
  }
  /** Set the sort direction for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReplyFlagSortDirection (boolean ascending) {
    this.ReplyFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReplyFlagSortDirection () {
    return this.ReplyFlagSortAscending;
  }
  /** Set the case insensitive for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setReplyFlagCaseInsensitive (boolean ascending) {
    this.ReplyFlagCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getReplyFlagCaseInsensitive () {
    return this.ReplyFlagCaseInsensitive;
  }
  /** Set the field level filters for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReplyFlagFilter (StringFilter[] value) throws ServiceException {
    this.ReplyFlag = value;
  }
  /** Retrieve filter for field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getReplyFlagFilter () {
    return this.ReplyFlag;
  }

  /**
   * Retrieves the ReplyFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReplyFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReplyFlagFilter field
   */
  public String[] getReplyFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReplyFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReplyFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReplyFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReplyFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReplyFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ReplyFlagFilter filter value from a formatted string
   *
   * @param _value the ReplyFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReplyFlagFilter filter field
   */
  public void setReplyFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReplyFlagFilterFromFormattedString");
    try {
      this.setReplyFlagFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReplyFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReplyFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReplyFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
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
    return RtPaymentResponseObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RtPaymentResponseObjectKeyHelper.toMap(this, null);
  }
}
