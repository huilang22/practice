/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillCycleObjectFilter.java
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
public class BillCycleObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public BillCycleObjectKeyFilter Key = null;
  /** raw field for: BILL_CYCLE.billing_frequency) */
  public    IntegerFilter[] BillingFrequency  = null;
  protected boolean BillingFrequencyFetch = false;
  protected boolean BillingFrequencySortAscending = true;
  protected Integer BillingFrequencySort = null;
  /** raw field for: BILL_CYCLE.next_ppdd_date) */
  public    DateFilter[] NextPpddDate  = null;
  protected boolean NextPpddDateFetch = false;
  protected boolean NextPpddDateSortAscending = true;
  protected Integer NextPpddDateSort = null;
  /** raw field for: BILL_CYCLE.statement_date) */
  public    DateFilter[] StatementDate  = null;
  protected boolean StatementDateFetch = false;
  protected boolean StatementDateSortAscending = true;
  protected Integer StatementDateSort = null;
  /** raw field for: BILL_CYCLE.cutoff_date) */
  public    DateFilter[] CutoffDate  = null;
  protected boolean CutoffDateFetch = false;
  protected boolean CutoffDateSortAscending = true;
  protected Integer CutoffDateSort = null;
  /** raw field for: BILL_CYCLE.prep_delay) */
  public    IntegerFilter[] PrepDelay  = null;
  protected boolean PrepDelayFetch = false;
  protected boolean PrepDelaySortAscending = true;
  protected Integer PrepDelaySort = null;
  /** raw field for: BILL_CYCLE.prep_date) */
  public    DateFilter[] PrepDate  = null;
  protected boolean PrepDateFetch = false;
  protected boolean PrepDateSortAscending = true;
  protected Integer PrepDateSort = null;
  /** raw field for: BILL_CYCLE.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "BillCycleObjectFilter";
  /** default constructor */
  public BillCycleObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BillCycleObjectFilter (BillCycleObjectFilter other)
  {
    if (other == null) return;
    this.Key = new BillCycleObjectKeyFilter (other.Key);
    this.BillingFrequency = other.BillingFrequency;
    this.BillingFrequencyFetch = other.BillingFrequencyFetch;
    this.BillingFrequencySort = other.BillingFrequencySort;
    this.BillingFrequencySortAscending = other.BillingFrequencySortAscending;
    this.NextPpddDate = other.NextPpddDate;
    this.NextPpddDateFetch = other.NextPpddDateFetch;
    this.NextPpddDateSort = other.NextPpddDateSort;
    this.NextPpddDateSortAscending = other.NextPpddDateSortAscending;
    this.StatementDate = other.StatementDate;
    this.StatementDateFetch = other.StatementDateFetch;
    this.StatementDateSort = other.StatementDateSort;
    this.StatementDateSortAscending = other.StatementDateSortAscending;
    this.CutoffDate = other.CutoffDate;
    this.CutoffDateFetch = other.CutoffDateFetch;
    this.CutoffDateSort = other.CutoffDateSort;
    this.CutoffDateSortAscending = other.CutoffDateSortAscending;
    this.PrepDelay = other.PrepDelay;
    this.PrepDelayFetch = other.PrepDelayFetch;
    this.PrepDelaySort = other.PrepDelaySort;
    this.PrepDelaySortAscending = other.PrepDelaySortAscending;
    this.PrepDate = other.PrepDate;
    this.PrepDateFetch = other.PrepDateFetch;
    this.PrepDateSort = other.PrepDateSort;
    this.PrepDateSortAscending = other.PrepDateSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return BillCycleObjectKeyFilter
   */
  public BillCycleObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (BillCycleObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BillPeriod (BILL_CYCLE.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (BILL_CYCLE.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (BILL_CYCLE.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (BILL_CYCLE.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return boolean whether the field is case insensitive
   */
  public boolean getBillPeriodCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (BILL_CYCLE.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (BILL_CYCLE.bill_period)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillPeriodFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillPeriod;
  }
  /** Set the field level Fetch value for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPpddDateFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.PpddDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPpddDateFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PpddDateFetch;
  }
  /** Set the SortOrder for field: PpddDate (BILL_CYCLE.ppdd_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPpddDateSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.PpddDateSort = value;
  }
  /** Retrieve SortOrder for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPpddDateSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PpddDateSort;
  }
  /** Set the sort direction for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPpddDateSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.PpddDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPpddDateSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PpddDateSortAscending;
  }
  /** Set the field level filters for field: PpddDate (BILL_CYCLE.ppdd_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPpddDateFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillCycleObjectKeyFilter ();
    this.Key.PpddDate = value;
  }
  /** Retrieve filter for field: PpddDate (BILL_CYCLE.ppdd_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPpddDateFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PpddDate;
  }
  /** Set the field level Fetch value for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingFrequencyFetch (boolean fetch) {
    this.BillingFrequencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingFrequencyFetch () {
    return this.BillingFrequencyFetch;
  }
  /** Set the SortOrder for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingFrequencySortOrder (Integer value) {
    this.BillingFrequencySort = value;
  }
  /** Retrieve SortOrder for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingFrequencySortOrder () {
    return this.BillingFrequencySort;
  }
  /** Set the sort direction for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingFrequencySortDirection (boolean ascending) {
    this.BillingFrequencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingFrequencySortDirection () {
    return this.BillingFrequencySortAscending;
  }
  /** Set the field level filters for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingFrequencyFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingFrequency = value;
  }
  /** Retrieve filter for field: BillingFrequency (BILL_CYCLE.billing_frequency)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingFrequencyFilter () {
    return this.BillingFrequency;
  }

  /**
   * Retrieves the BillingFrequencyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingFrequencyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingFrequencyFilter field
   */
  public String[] getBillingFrequencyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingFrequencyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingFrequencyFilter filter value from a formatted string
   *
   * @param _value the BillingFrequencyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingFrequencyFilter filter field
   */
  public void setBillingFrequencyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
    try {
      this.setBillingFrequencyFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @param fetch whether to fetch this field or not
   */
  public void setNextPpddDateFetch (boolean fetch) {
    this.NextPpddDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getNextPpddDateFetch () {
    return this.NextPpddDateFetch;
  }
  /** Set the SortOrder for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNextPpddDateSortOrder (Integer value) {
    this.NextPpddDateSort = value;
  }
  /** Retrieve SortOrder for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNextPpddDateSortOrder () {
    return this.NextPpddDateSort;
  }
  /** Set the sort direction for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNextPpddDateSortDirection (boolean ascending) {
    this.NextPpddDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNextPpddDateSortDirection () {
    return this.NextPpddDateSortAscending;
  }
  /** Set the field level filters for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNextPpddDateFilter (DateFilter[] value) throws ServiceException {
    this.NextPpddDate = value;
  }
  /** Retrieve filter for field: NextPpddDate (BILL_CYCLE.next_ppdd_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getNextPpddDateFilter () {
    return this.NextPpddDate;
  }

  /**
   * Retrieves the NextPpddDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextPpddDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextPpddDateFilter field
   */
  public String[] getNextPpddDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextPpddDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextPpddDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextPpddDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextPpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextPpddDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NextPpddDateFilter filter value from a formatted string
   *
   * @param _value the NextPpddDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextPpddDateFilter filter field
   */
  public void setNextPpddDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextPpddDateFilterFromFormattedString");
    try {
      this.setNextPpddDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextPpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextPpddDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextPpddDateFilterFromFormattedString");
  }

  /**
   * Retrieves the NextPpddDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextPpddDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextPpddDateFilter field
   */
  public String[] getNextPpddDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextPpddDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextPpddDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextPpddDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextPpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextPpddDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextPpddDateFilter filter value from a formatted string
   *
   * @param _value the NextPpddDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextPpddDateFilter filter field
   */
  public void setNextPpddDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextPpddDateFilterFromFormattedDateTimeString");
    try {
      this.setNextPpddDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextPpddDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextPpddDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextPpddDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: StatementDate (BILL_CYCLE.statement_date)
   * @param fetch whether to fetch this field or not
   */
  public void setStatementDateFetch (boolean fetch) {
    this.StatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementDate (BILL_CYCLE.statement_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementDateFetch () {
    return this.StatementDateFetch;
  }
  /** Set the SortOrder for field: StatementDate (BILL_CYCLE.statement_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementDateSortOrder (Integer value) {
    this.StatementDateSort = value;
  }
  /** Retrieve SortOrder for field: StatementDate (BILL_CYCLE.statement_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementDateSortOrder () {
    return this.StatementDateSort;
  }
  /** Set the sort direction for field: StatementDate (BILL_CYCLE.statement_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementDateSortDirection (boolean ascending) {
    this.StatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementDate (BILL_CYCLE.statement_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementDateSortDirection () {
    return this.StatementDateSortAscending;
  }
  /** Set the field level filters for field: StatementDate (BILL_CYCLE.statement_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementDateFilter (DateFilter[] value) throws ServiceException {
    this.StatementDate = value;
  }
  /** Retrieve filter for field: StatementDate (BILL_CYCLE.statement_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStatementDateFilter () {
    return this.StatementDate;
  }

  /**
   * Retrieves the StatementDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDateFilter field
   */
  public String[] getStatementDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDateFilter filter value from a formatted string
   *
   * @param _value the StatementDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementDateFilter filter field
   */
  public void setStatementDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFilterFromFormattedString");
    try {
      this.setStatementDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFilterFromFormattedString");
  }

  /**
   * Retrieves the StatementDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDateFilter field
   */
  public String[] getStatementDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDateFilter filter value from a formatted string
   *
   * @param _value the StatementDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementDateFilter filter field
   */
  public void setStatementDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
    try {
      this.setStatementDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * @param fetch whether to fetch this field or not
   */
  public void setCutoffDateFetch (boolean fetch) {
    this.CutoffDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getCutoffDateFetch () {
    return this.CutoffDateFetch;
  }
  /** Set the SortOrder for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCutoffDateSortOrder (Integer value) {
    this.CutoffDateSort = value;
  }
  /** Retrieve SortOrder for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCutoffDateSortOrder () {
    return this.CutoffDateSort;
  }
  /** Set the sort direction for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCutoffDateSortDirection (boolean ascending) {
    this.CutoffDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCutoffDateSortDirection () {
    return this.CutoffDateSortAscending;
  }
  /** Set the field level filters for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCutoffDateFilter (DateFilter[] value) throws ServiceException {
    this.CutoffDate = value;
  }
  /** Retrieve filter for field: CutoffDate (BILL_CYCLE.cutoff_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCutoffDateFilter () {
    return this.CutoffDate;
  }

  /**
   * Retrieves the CutoffDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CutoffDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CutoffDateFilter field
   */
  public String[] getCutoffDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCutoffDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCutoffDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCutoffDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCutoffDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CutoffDateFilter filter value from a formatted string
   *
   * @param _value the CutoffDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CutoffDateFilter filter field
   */
  public void setCutoffDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCutoffDateFilterFromFormattedString");
    try {
      this.setCutoffDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCutoffDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCutoffDateFilterFromFormattedString");
  }

  /**
   * Retrieves the CutoffDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CutoffDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CutoffDateFilter field
   */
  public String[] getCutoffDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCutoffDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCutoffDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCutoffDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCutoffDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CutoffDateFilter filter value from a formatted string
   *
   * @param _value the CutoffDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CutoffDateFilter filter field
   */
  public void setCutoffDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCutoffDateFilterFromFormattedDateTimeString");
    try {
      this.setCutoffDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCutoffDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCutoffDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrepDelay (BILL_CYCLE.prep_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepDelayFetch (boolean fetch) {
    this.PrepDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepDelay (BILL_CYCLE.prep_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepDelayFetch () {
    return this.PrepDelayFetch;
  }
  /** Set the SortOrder for field: PrepDelay (BILL_CYCLE.prep_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepDelaySortOrder (Integer value) {
    this.PrepDelaySort = value;
  }
  /** Retrieve SortOrder for field: PrepDelay (BILL_CYCLE.prep_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepDelaySortOrder () {
    return this.PrepDelaySort;
  }
  /** Set the sort direction for field: PrepDelay (BILL_CYCLE.prep_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepDelaySortDirection (boolean ascending) {
    this.PrepDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepDelay (BILL_CYCLE.prep_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepDelaySortDirection () {
    return this.PrepDelaySortAscending;
  }
  /** Set the field level filters for field: PrepDelay (BILL_CYCLE.prep_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.PrepDelay = value;
  }
  /** Retrieve filter for field: PrepDelay (BILL_CYCLE.prep_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepDelayFilter () {
    return this.PrepDelay;
  }

  /**
   * Retrieves the PrepDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDelayFilter field
   */
  public String[] getPrepDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDelayFilter filter value from a formatted string
   *
   * @param _value the PrepDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepDelayFilter filter field
   */
  public void setPrepDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDelayFilterFromFormattedString");
    try {
      this.setPrepDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrepDate (BILL_CYCLE.prep_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepDateFetch (boolean fetch) {
    this.PrepDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepDate (BILL_CYCLE.prep_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepDateFetch () {
    return this.PrepDateFetch;
  }
  /** Set the SortOrder for field: PrepDate (BILL_CYCLE.prep_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepDateSortOrder (Integer value) {
    this.PrepDateSort = value;
  }
  /** Retrieve SortOrder for field: PrepDate (BILL_CYCLE.prep_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepDateSortOrder () {
    return this.PrepDateSort;
  }
  /** Set the sort direction for field: PrepDate (BILL_CYCLE.prep_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepDateSortDirection (boolean ascending) {
    this.PrepDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepDate (BILL_CYCLE.prep_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepDateSortDirection () {
    return this.PrepDateSortAscending;
  }
  /** Set the field level filters for field: PrepDate (BILL_CYCLE.prep_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepDateFilter (DateFilter[] value) throws ServiceException {
    this.PrepDate = value;
  }
  /** Retrieve filter for field: PrepDate (BILL_CYCLE.prep_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrepDateFilter () {
    return this.PrepDate;
  }

  /**
   * Retrieves the PrepDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDateFilter field
   */
  public String[] getPrepDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDateFilter filter value from a formatted string
   *
   * @param _value the PrepDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepDateFilter filter field
   */
  public void setPrepDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFilterFromFormattedString");
    try {
      this.setPrepDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PrepDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDateFilter field
   */
  public String[] getPrepDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDateFilter filter value from a formatted string
   *
   * @param _value the PrepDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepDateFilter filter field
   */
  public void setPrepDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
    try {
      this.setPrepDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (BILL_CYCLE.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (BILL_CYCLE.config_tag_id)
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
    return BillCycleObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillCycleObjectHelper.toMap(this, null);
  }
}
