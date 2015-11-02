/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RewardBalanceObjectKeyFilter.java
 * Definition File: Admin/RewardBalance.xml
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

/** Key Filter for RewardBalanceObject object. */
public class RewardBalanceObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: REWARD_BALANCE_ID_VALUES.reward_balance_id) */
  public    IntegerFilter[] RewardBalanceId  = null;
  protected boolean RewardBalanceIdFetch = false;
  protected boolean RewardBalanceIdSortAscending = true;
  protected Integer RewardBalanceIdSort = null;
  /** raw field for: REWARD_BALANCE_ID_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "RewardBalanceObjectKeyFilter";
  /** default constructor */
  public RewardBalanceObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public RewardBalanceObjectKeyFilter (RewardBalanceObjectKeyFilter other)
  {
    if (other == null) return;
    this.RewardBalanceId = other.RewardBalanceId;
    this.RewardBalanceIdFetch = other.RewardBalanceIdFetch;
    this.RewardBalanceIdSort = other.RewardBalanceIdSort;
    this.RewardBalanceIdSortAscending = other.RewardBalanceIdSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRewardBalanceIdFetch (boolean fetch) {
    this.RewardBalanceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRewardBalanceIdFetch () {
    return this.RewardBalanceIdFetch;
  }
  /** Set the SortOrder for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRewardBalanceIdSortOrder (Integer value) {
    this.RewardBalanceIdSort = value;
  }
  /** Retrieve SortOrder for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRewardBalanceIdSortOrder () {
    return this.RewardBalanceIdSort;
  }
  /** Set the sort direction for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRewardBalanceIdSortDirection (boolean ascending) {
    this.RewardBalanceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRewardBalanceIdSortDirection () {
    return this.RewardBalanceIdSortAscending;
  }
  /** Set the field level filters for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRewardBalanceIdFilter (IntegerFilter[] value) throws ServiceException {
    this.RewardBalanceId = value;
  }
  /** Retrieve filter for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRewardBalanceIdFilter () {
    return this.RewardBalanceId;
  }

  /**
   * Retrieves the RewardBalanceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RewardBalanceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RewardBalanceIdFilter field
   */
  public String[] getRewardBalanceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRewardBalanceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RewardBalanceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRewardBalanceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RewardBalanceIdFilter filter value from a formatted string
   *
   * @param _value the RewardBalanceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RewardBalanceIdFilter filter field
   */
  public void setRewardBalanceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRewardBalanceIdFilterFromFormattedString");
    try {
      this.setRewardBalanceIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RewardBalanceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRewardBalanceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRewardBalanceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
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
    return RewardBalanceObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RewardBalanceObjectKeyHelper.toMap(this, null);
  }
}
