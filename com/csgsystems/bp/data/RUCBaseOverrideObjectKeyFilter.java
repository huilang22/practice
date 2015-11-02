/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCBaseOverrideObjectKeyFilter.java
 * Definition File: Customer/OverrideUsageCreditRate.xml
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

/** Key Filter for RUCBaseOverrideObject object. */
public class RUCBaseOverrideObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: RATE_UNIT_CR_OVERRIDES.override_tracking_id) */
  public    IntegerFilter[] OverrideTrackingId  = null;
  protected boolean OverrideTrackingIdFetch = false;
  protected boolean OverrideTrackingIdSortAscending = true;
  protected Integer OverrideTrackingIdSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv) */
  public    IntegerFilter[] OverrideTrackingIdServ  = null;
  protected boolean OverrideTrackingIdServFetch = false;
  protected boolean OverrideTrackingIdServSortAscending = true;
  protected Integer OverrideTrackingIdServSort = null;
  private String _objName = "RUCBaseOverrideObjectKeyFilter";
  /** default constructor */
  public RUCBaseOverrideObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public RUCBaseOverrideObjectKeyFilter (RUCBaseOverrideObjectKeyFilter other)
  {
    if (other == null) return;
    this.OverrideTrackingId = other.OverrideTrackingId;
    this.OverrideTrackingIdFetch = other.OverrideTrackingIdFetch;
    this.OverrideTrackingIdSort = other.OverrideTrackingIdSort;
    this.OverrideTrackingIdSortAscending = other.OverrideTrackingIdSortAscending;
    this.OverrideTrackingIdServ = other.OverrideTrackingIdServ;
    this.OverrideTrackingIdServFetch = other.OverrideTrackingIdServFetch;
    this.OverrideTrackingIdServSort = other.OverrideTrackingIdServSort;
    this.OverrideTrackingIdServSortAscending = other.OverrideTrackingIdServSortAscending;
  }
  /** Set the field level Fetch value for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideTrackingIdFetch (boolean fetch) {
    this.OverrideTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideTrackingIdFetch () {
    return this.OverrideTrackingIdFetch;
  }
  /** Set the SortOrder for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideTrackingIdSortOrder (Integer value) {
    this.OverrideTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideTrackingIdSortOrder () {
    return this.OverrideTrackingIdSort;
  }
  /** Set the sort direction for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideTrackingIdSortDirection (boolean ascending) {
    this.OverrideTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideTrackingIdSortDirection () {
    return this.OverrideTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OverrideTrackingId = value;
  }
  /** Retrieve filter for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideTrackingIdFilter () {
    return this.OverrideTrackingId;
  }

  /**
   * Retrieves the OverrideTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideTrackingIdFilter field
   */
  public String[] getOverrideTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideTrackingIdFilter filter value from a formatted string
   *
   * @param _value the OverrideTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideTrackingIdFilter filter field
   */
  public void setOverrideTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideTrackingIdFilterFromFormattedString");
    try {
      this.setOverrideTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideTrackingIdServFetch (boolean fetch) {
    this.OverrideTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideTrackingIdServFetch () {
    return this.OverrideTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideTrackingIdServSortOrder (Integer value) {
    this.OverrideTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideTrackingIdServSortOrder () {
    return this.OverrideTrackingIdServSort;
  }
  /** Set the sort direction for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideTrackingIdServSortDirection (boolean ascending) {
    this.OverrideTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideTrackingIdServSortDirection () {
    return this.OverrideTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.OverrideTrackingIdServ = value;
  }
  /** Retrieve filter for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideTrackingIdServFilter () {
    return this.OverrideTrackingIdServ;
  }

  /**
   * Retrieves the OverrideTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideTrackingIdServFilter field
   */
  public String[] getOverrideTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the OverrideTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideTrackingIdServFilter filter field
   */
  public void setOverrideTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideTrackingIdServFilterFromFormattedString");
    try {
      this.setOverrideTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return RUCBaseOverrideObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RUCBaseOverrideObjectKeyHelper.toMap(this, null);
  }
}
