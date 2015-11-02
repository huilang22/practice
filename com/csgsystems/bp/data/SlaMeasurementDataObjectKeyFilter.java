/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SlaMeasurementDataObjectKeyFilter.java
 * Definition File: Customer/SlaMeasurementData.xml
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

/** Key Filter for SlaMeasurementDataObject object. */
public class SlaMeasurementDataObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: SLA_MEASUREMENT_DATA.sla_msm_tracking_id) */
  public    IntegerFilter[] SlaMsmTrackingId  = null;
  protected boolean SlaMsmTrackingIdFetch = false;
  protected boolean SlaMsmTrackingIdSortAscending = true;
  protected Integer SlaMsmTrackingIdSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv) */
  public    IntegerFilter[] SlaMsmTrackingIdServ  = null;
  protected boolean SlaMsmTrackingIdServFetch = false;
  protected boolean SlaMsmTrackingIdServSortAscending = true;
  protected Integer SlaMsmTrackingIdServSort = null;
  private String _objName = "SlaMeasurementDataObjectKeyFilter";
  /** default constructor */
  public SlaMeasurementDataObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public SlaMeasurementDataObjectKeyFilter (SlaMeasurementDataObjectKeyFilter other)
  {
    if (other == null) return;
    this.SlaMsmTrackingId = other.SlaMsmTrackingId;
    this.SlaMsmTrackingIdFetch = other.SlaMsmTrackingIdFetch;
    this.SlaMsmTrackingIdSort = other.SlaMsmTrackingIdSort;
    this.SlaMsmTrackingIdSortAscending = other.SlaMsmTrackingIdSortAscending;
    this.SlaMsmTrackingIdServ = other.SlaMsmTrackingIdServ;
    this.SlaMsmTrackingIdServFetch = other.SlaMsmTrackingIdServFetch;
    this.SlaMsmTrackingIdServSort = other.SlaMsmTrackingIdServSort;
    this.SlaMsmTrackingIdServSortAscending = other.SlaMsmTrackingIdServSortAscending;
  }
  /** Set the field level Fetch value for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSlaMsmTrackingIdFetch (boolean fetch) {
    this.SlaMsmTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSlaMsmTrackingIdFetch () {
    return this.SlaMsmTrackingIdFetch;
  }
  /** Set the SortOrder for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSlaMsmTrackingIdSortOrder (Integer value) {
    this.SlaMsmTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSlaMsmTrackingIdSortOrder () {
    return this.SlaMsmTrackingIdSort;
  }
  /** Set the sort direction for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSlaMsmTrackingIdSortDirection (boolean ascending) {
    this.SlaMsmTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSlaMsmTrackingIdSortDirection () {
    return this.SlaMsmTrackingIdSortAscending;
  }
  /** Set the field level filters for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSlaMsmTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.SlaMsmTrackingId = value;
  }
  /** Retrieve filter for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSlaMsmTrackingIdFilter () {
    return this.SlaMsmTrackingId;
  }

  /**
   * Retrieves the SlaMsmTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SlaMsmTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMsmTrackingIdFilter field
   */
  public String[] getSlaMsmTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSlaMsmTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMsmTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaMsmTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMsmTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SlaMsmTrackingIdFilter filter value from a formatted string
   *
   * @param _value the SlaMsmTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SlaMsmTrackingIdFilter filter field
   */
  public void setSlaMsmTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSlaMsmTrackingIdFilterFromFormattedString");
    try {
      this.setSlaMsmTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaMsmTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMsmTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMsmTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setSlaMsmTrackingIdServFetch (boolean fetch) {
    this.SlaMsmTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getSlaMsmTrackingIdServFetch () {
    return this.SlaMsmTrackingIdServFetch;
  }
  /** Set the SortOrder for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSlaMsmTrackingIdServSortOrder (Integer value) {
    this.SlaMsmTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSlaMsmTrackingIdServSortOrder () {
    return this.SlaMsmTrackingIdServSort;
  }
  /** Set the sort direction for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSlaMsmTrackingIdServSortDirection (boolean ascending) {
    this.SlaMsmTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSlaMsmTrackingIdServSortDirection () {
    return this.SlaMsmTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSlaMsmTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.SlaMsmTrackingIdServ = value;
  }
  /** Retrieve filter for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSlaMsmTrackingIdServFilter () {
    return this.SlaMsmTrackingIdServ;
  }

  /**
   * Retrieves the SlaMsmTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SlaMsmTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMsmTrackingIdServFilter field
   */
  public String[] getSlaMsmTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSlaMsmTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMsmTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaMsmTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMsmTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SlaMsmTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the SlaMsmTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SlaMsmTrackingIdServFilter filter field
   */
  public void setSlaMsmTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSlaMsmTrackingIdServFilterFromFormattedString");
    try {
      this.setSlaMsmTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaMsmTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMsmTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMsmTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return SlaMeasurementDataObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SlaMeasurementDataObjectKeyHelper.toMap(this, null);
  }
}
