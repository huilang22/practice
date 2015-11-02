/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalThresholdsObjectKeyFilter.java
 * Definition File: Customer/HistoricalThresholds.xml
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

/** Key Filter for HistoricalThresholdsObject object. */
public class HistoricalThresholdsObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: HISTORIC_THRESHOLDS.threshold_tracking_id) */
  public    IntegerFilter[] ThresholdTrackingId  = null;
  protected boolean ThresholdTrackingIdFetch = false;
  protected boolean ThresholdTrackingIdSortAscending = true;
  protected Integer ThresholdTrackingIdSort = null;
  /** raw field for: HISTORIC_THRESHOLDS.threshold_tracking_id_serv) */
  public    IntegerFilter[] ThresholdTrackingIdServ  = null;
  protected boolean ThresholdTrackingIdServFetch = false;
  protected boolean ThresholdTrackingIdServSortAscending = true;
  protected Integer ThresholdTrackingIdServSort = null;
  private String _objName = "HistoricalThresholdsObjectKeyFilter";
  /** default constructor */
  public HistoricalThresholdsObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public HistoricalThresholdsObjectKeyFilter (HistoricalThresholdsObjectKeyFilter other)
  {
    if (other == null) return;
    this.ThresholdTrackingId = other.ThresholdTrackingId;
    this.ThresholdTrackingIdFetch = other.ThresholdTrackingIdFetch;
    this.ThresholdTrackingIdSort = other.ThresholdTrackingIdSort;
    this.ThresholdTrackingIdSortAscending = other.ThresholdTrackingIdSortAscending;
    this.ThresholdTrackingIdServ = other.ThresholdTrackingIdServ;
    this.ThresholdTrackingIdServFetch = other.ThresholdTrackingIdServFetch;
    this.ThresholdTrackingIdServSort = other.ThresholdTrackingIdServSort;
    this.ThresholdTrackingIdServSortAscending = other.ThresholdTrackingIdServSortAscending;
  }
  /** Set the field level Fetch value for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setThresholdTrackingIdFetch (boolean fetch) {
    this.ThresholdTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getThresholdTrackingIdFetch () {
    return this.ThresholdTrackingIdFetch;
  }
  /** Set the SortOrder for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setThresholdTrackingIdSortOrder (Integer value) {
    this.ThresholdTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getThresholdTrackingIdSortOrder () {
    return this.ThresholdTrackingIdSort;
  }
  /** Set the sort direction for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setThresholdTrackingIdSortDirection (boolean ascending) {
    this.ThresholdTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getThresholdTrackingIdSortDirection () {
    return this.ThresholdTrackingIdSortAscending;
  }
  /** Set the field level filters for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setThresholdTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ThresholdTrackingId = value;
  }
  /** Retrieve filter for field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getThresholdTrackingIdFilter () {
    return this.ThresholdTrackingId;
  }

  /**
   * Retrieves the ThresholdTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ThresholdTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdTrackingIdFilter field
   */
  public String[] getThresholdTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getThresholdTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ThresholdTrackingIdFilter filter value from a formatted string
   *
   * @param _value the ThresholdTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ThresholdTrackingIdFilter filter field
   */
  public void setThresholdTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThresholdTrackingIdFilterFromFormattedString");
    try {
      this.setThresholdTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setThresholdTrackingIdServFetch (boolean fetch) {
    this.ThresholdTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getThresholdTrackingIdServFetch () {
    return this.ThresholdTrackingIdServFetch;
  }
  /** Set the SortOrder for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setThresholdTrackingIdServSortOrder (Integer value) {
    this.ThresholdTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getThresholdTrackingIdServSortOrder () {
    return this.ThresholdTrackingIdServSort;
  }
  /** Set the sort direction for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setThresholdTrackingIdServSortDirection (boolean ascending) {
    this.ThresholdTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getThresholdTrackingIdServSortDirection () {
    return this.ThresholdTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setThresholdTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ThresholdTrackingIdServ = value;
  }
  /** Retrieve filter for field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getThresholdTrackingIdServFilter () {
    return this.ThresholdTrackingIdServ;
  }

  /**
   * Retrieves the ThresholdTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ThresholdTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdTrackingIdServFilter field
   */
  public String[] getThresholdTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getThresholdTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ThresholdTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the ThresholdTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ThresholdTrackingIdServFilter filter field
   */
  public void setThresholdTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThresholdTrackingIdServFilterFromFormattedString");
    try {
      this.setThresholdTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return HistoricalThresholdsObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HistoricalThresholdsObjectKeyHelper.toMap(this, null);
  }
}
