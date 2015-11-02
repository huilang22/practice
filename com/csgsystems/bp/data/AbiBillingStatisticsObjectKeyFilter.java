/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillingStatisticsObjectKeyFilter.java
 * Definition File: Customer/AbiBillingStatistics.xml
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

/** Key Filter for AbiBillingStatisticsObject object. */
public class AbiBillingStatisticsObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ABI_BILLING_STATISTICS.statistic_id) */
  public    BigIntegerFilter[] StatisticId  = null;
  protected boolean StatisticIdFetch = false;
  protected boolean StatisticIdSortAscending = true;
  protected Integer StatisticIdSort = null;
  private String _objName = "AbiBillingStatisticsObjectKeyFilter";
  /** default constructor */
  public AbiBillingStatisticsObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AbiBillingStatisticsObjectKeyFilter (AbiBillingStatisticsObjectKeyFilter other)
  {
    if (other == null) return;
    this.StatisticId = other.StatisticId;
    this.StatisticIdFetch = other.StatisticIdFetch;
    this.StatisticIdSort = other.StatisticIdSort;
    this.StatisticIdSortAscending = other.StatisticIdSortAscending;
  }
  /** Set the field level Fetch value for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @param fetch whether to fetch this field or not
   */
  public void setStatisticIdFetch (boolean fetch) {
    this.StatisticIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatisticIdFetch () {
    return this.StatisticIdFetch;
  }
  /** Set the SortOrder for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatisticIdSortOrder (Integer value) {
    this.StatisticIdSort = value;
  }
  /** Retrieve SortOrder for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatisticIdSortOrder () {
    return this.StatisticIdSort;
  }
  /** Set the sort direction for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatisticIdSortDirection (boolean ascending) {
    this.StatisticIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatisticIdSortDirection () {
    return this.StatisticIdSortAscending;
  }
  /** Set the field level filters for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatisticIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StatisticId = value;
  }
  /** Retrieve filter for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStatisticIdFilter () {
    return this.StatisticId;
  }

  /**
   * Retrieves the StatisticIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatisticIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatisticIdFilter field
   */
  public String[] getStatisticIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatisticIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatisticIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatisticIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatisticIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatisticIdFilter filter value from a formatted string
   *
   * @param _value the StatisticIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatisticIdFilter filter field
   */
  public void setStatisticIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatisticIdFilterFromFormattedString");
    try {
      this.setStatisticIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatisticIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatisticIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatisticIdFilterFromFormattedString");
  }

  public String toString() {
    return AbiBillingStatisticsObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AbiBillingStatisticsObjectKeyHelper.toMap(this, null);
  }
}
