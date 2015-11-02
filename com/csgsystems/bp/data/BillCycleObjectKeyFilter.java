/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillCycleObjectKeyFilter.java
 * Definition File: Admin/BillCycle.xml
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

/** Key Filter for BillCycleObject object. */
public class BillCycleObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: BILL_CYCLE.bill_period) */
  public    StringFilter[] BillPeriod  = null;
  protected boolean BillPeriodFetch = false;
  protected boolean BillPeriodSortAscending = true;
  protected boolean BillPeriodCaseInsensitive = false;
  protected Integer BillPeriodSort = null;
  /** raw field for: BILL_CYCLE.ppdd_date) */
  public    DateFilter[] PpddDate  = null;
  protected boolean PpddDateFetch = false;
  protected boolean PpddDateSortAscending = true;
  protected Integer PpddDateSort = null;
  private String _objName = "BillCycleObjectKeyFilter";
  /** default constructor */
  public BillCycleObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public BillCycleObjectKeyFilter (BillCycleObjectKeyFilter other)
  {
    if (other == null) return;
    this.BillPeriod = other.BillPeriod;
    this.BillPeriodFetch = other.BillPeriodFetch;
    this.BillPeriodSort = other.BillPeriodSort;
    this.BillPeriodCaseInsensitive = other.BillPeriodCaseInsensitive;
    this.BillPeriodSortAscending = other.BillPeriodSortAscending;
    this.PpddDate = other.PpddDate;
    this.PpddDateFetch = other.PpddDateFetch;
    this.PpddDateSort = other.PpddDateSort;
    this.PpddDateSortAscending = other.PpddDateSortAscending;
  }
  /** Set the field level Fetch value for field: BillPeriod (BILL_CYCLE.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch) {
    this.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch () {
    return this.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (BILL_CYCLE.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value) {
    this.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder () {
    return this.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (BILL_CYCLE.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending) {
    this.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection () {
    return this.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (BILL_CYCLE.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending) {
    this.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillPeriodCaseInsensitive () {
    return this.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (BILL_CYCLE.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException {
    this.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillPeriodFilter () {
    return this.BillPeriod;
  }

  /**
   * Retrieves the BillPeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillPeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriodFilter field
   */
  public String[] getBillPeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillPeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillPeriodFilter filter value from a formatted string
   *
   * @param _value the BillPeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillPeriodFilter filter field
   */
  public void setBillPeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFilterFromFormattedString");
    try {
      this.setBillPeriodFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPpddDateFetch (boolean fetch) {
    this.PpddDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPpddDateFetch () {
    return this.PpddDateFetch;
  }
  /** Set the SortOrder for field: PpddDate (BILL_CYCLE.ppdd_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPpddDateSortOrder (Integer value) {
    this.PpddDateSort = value;
  }
  /** Retrieve SortOrder for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPpddDateSortOrder () {
    return this.PpddDateSort;
  }
  /** Set the sort direction for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPpddDateSortDirection (boolean ascending) {
    this.PpddDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPpddDateSortDirection () {
    return this.PpddDateSortAscending;
  }
  /** Set the field level filters for field: PpddDate (BILL_CYCLE.ppdd_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPpddDateFilter (DateFilter[] value) throws ServiceException {
    this.PpddDate = value;
  }
  /** Retrieve filter for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPpddDateFilter () {
    return this.PpddDate;
  }

  /**
   * Retrieves the PpddDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PpddDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PpddDateFilter field
   */
  public String[] getPpddDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPpddDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPpddDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPpddDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPpddDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PpddDateFilter filter value from a formatted string
   *
   * @param _value the PpddDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PpddDateFilter filter field
   */
  public void setPpddDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPpddDateFilterFromFormattedString");
    try {
      this.setPpddDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPpddDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPpddDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PpddDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PpddDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PpddDateFilter field
   */
  public String[] getPpddDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPpddDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPpddDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPpddDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPpddDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PpddDateFilter filter value from a formatted string
   *
   * @param _value the PpddDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PpddDateFilter filter field
   */
  public void setPpddDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPpddDateFilterFromFormattedDateTimeString");
    try {
      this.setPpddDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPpddDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPpddDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return BillCycleObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillCycleObjectKeyHelper.toMap(this, null);
  }
}
