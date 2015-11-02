/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherHistoryObjectKeyFilter.java
 * Definition File: Catalog/VoucherHistory.xml
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

/** Key Filter for VoucherHistoryObject object. */
public class VoucherHistoryObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: VOUCHER_HISTORY.voucher_id) */
  public    StringFilter[] VoucherId  = null;
  protected boolean VoucherIdFetch = false;
  protected boolean VoucherIdSortAscending = true;
  protected boolean VoucherIdCaseInsensitive = false;
  protected Integer VoucherIdSort = null;
  /** raw field for: VOUCHER_HISTORY.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  private String _objName = "VoucherHistoryObjectKeyFilter";
  /** default constructor */
  public VoucherHistoryObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public VoucherHistoryObjectKeyFilter (VoucherHistoryObjectKeyFilter other)
  {
    if (other == null) return;
    this.VoucherId = other.VoucherId;
    this.VoucherIdFetch = other.VoucherIdFetch;
    this.VoucherIdSort = other.VoucherIdSort;
    this.VoucherIdCaseInsensitive = other.VoucherIdCaseInsensitive;
    this.VoucherIdSortAscending = other.VoucherIdSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
  }
  /** Set the field level Fetch value for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @param fetch whether to fetch this field or not
   */
  public void setVoucherIdFetch (boolean fetch) {
    this.VoucherIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getVoucherIdFetch () {
    return this.VoucherIdFetch;
  }
  /** Set the SortOrder for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVoucherIdSortOrder (Integer value) {
    this.VoucherIdSort = value;
  }
  /** Retrieve SortOrder for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVoucherIdSortOrder () {
    return this.VoucherIdSort;
  }
  /** Set the sort direction for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVoucherIdSortDirection (boolean ascending) {
    this.VoucherIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVoucherIdSortDirection () {
    return this.VoucherIdSortAscending;
  }
  /** Set the case insensitive for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setVoucherIdCaseInsensitive (boolean ascending) {
    this.VoucherIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getVoucherIdCaseInsensitive () {
    return this.VoucherIdCaseInsensitive;
  }
  /** Set the field level filters for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVoucherIdFilter (StringFilter[] value) throws ServiceException {
    this.VoucherId = value;
  }
  /** Retrieve filter for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getVoucherIdFilter () {
    return this.VoucherId;
  }

  /**
   * Retrieves the VoucherIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The VoucherIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherIdFilter field
   */
  public String[] getVoucherIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getVoucherIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the VoucherIdFilter filter value from a formatted string
   *
   * @param _value the VoucherIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the VoucherIdFilter filter field
   */
  public void setVoucherIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVoucherIdFilterFromFormattedString");
    try {
      this.setVoucherIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return VoucherHistoryObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherHistoryObjectKeyHelper.toMap(this, null);
  }
}
