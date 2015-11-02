/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RefinancePlanObjectKeyFilter.java
 * Definition File: Customer/RefinancePlan.xml
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

/** Key Filter for RefinancePlanObject object. */
public class RefinancePlanObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: REFINANCE_PLAN.refinance_plan_id) */
  public    IntegerFilter[] RefinancePlanId  = null;
  protected boolean RefinancePlanIdFetch = false;
  protected boolean RefinancePlanIdSortAscending = true;
  protected Integer RefinancePlanIdSort = null;
  /** raw field for: REFINANCE_PLAN.refinance_plan_id_serv) */
  public    IntegerFilter[] RefinancePlanIdServ  = null;
  protected boolean RefinancePlanIdServFetch = false;
  protected boolean RefinancePlanIdServSortAscending = true;
  protected Integer RefinancePlanIdServSort = null;
  /** raw field for: REFINANCE_PLAN.adj_tracking_id) */
  public    IntegerFilter[] AdjTrackingId  = null;
  protected boolean AdjTrackingIdFetch = false;
  protected boolean AdjTrackingIdSortAscending = true;
  protected Integer AdjTrackingIdSort = null;
  /** raw field for: REFINANCE_PLAN.adj_tracking_id_serv) */
  public    IntegerFilter[] AdjTrackingIdServ  = null;
  protected boolean AdjTrackingIdServFetch = false;
  protected boolean AdjTrackingIdServSortAscending = true;
  protected Integer AdjTrackingIdServSort = null;
  private String _objName = "RefinancePlanObjectKeyFilter";
  /** default constructor */
  public RefinancePlanObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public RefinancePlanObjectKeyFilter (RefinancePlanObjectKeyFilter other)
  {
    if (other == null) return;
    this.RefinancePlanId = other.RefinancePlanId;
    this.RefinancePlanIdFetch = other.RefinancePlanIdFetch;
    this.RefinancePlanIdSort = other.RefinancePlanIdSort;
    this.RefinancePlanIdSortAscending = other.RefinancePlanIdSortAscending;
    this.RefinancePlanIdServ = other.RefinancePlanIdServ;
    this.RefinancePlanIdServFetch = other.RefinancePlanIdServFetch;
    this.RefinancePlanIdServSort = other.RefinancePlanIdServSort;
    this.RefinancePlanIdServSortAscending = other.RefinancePlanIdServSortAscending;
    this.AdjTrackingId = other.AdjTrackingId;
    this.AdjTrackingIdFetch = other.AdjTrackingIdFetch;
    this.AdjTrackingIdSort = other.AdjTrackingIdSort;
    this.AdjTrackingIdSortAscending = other.AdjTrackingIdSortAscending;
    this.AdjTrackingIdServ = other.AdjTrackingIdServ;
    this.AdjTrackingIdServFetch = other.AdjTrackingIdServFetch;
    this.AdjTrackingIdServSort = other.AdjTrackingIdServSort;
    this.AdjTrackingIdServSortAscending = other.AdjTrackingIdServSortAscending;
  }
  /** Set the field level Fetch value for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRefinancePlanIdFetch (boolean fetch) {
    this.RefinancePlanIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRefinancePlanIdFetch () {
    return this.RefinancePlanIdFetch;
  }
  /** Set the SortOrder for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRefinancePlanIdSortOrder (Integer value) {
    this.RefinancePlanIdSort = value;
  }
  /** Retrieve SortOrder for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRefinancePlanIdSortOrder () {
    return this.RefinancePlanIdSort;
  }
  /** Set the sort direction for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRefinancePlanIdSortDirection (boolean ascending) {
    this.RefinancePlanIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRefinancePlanIdSortDirection () {
    return this.RefinancePlanIdSortAscending;
  }
  /** Set the field level filters for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRefinancePlanIdFilter (IntegerFilter[] value) throws ServiceException {
    this.RefinancePlanId = value;
  }
  /** Retrieve filter for field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRefinancePlanIdFilter () {
    return this.RefinancePlanId;
  }

  /**
   * Retrieves the RefinancePlanIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RefinancePlanIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefinancePlanIdFilter field
   */
  public String[] getRefinancePlanIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRefinancePlanIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefinancePlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefinancePlanIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RefinancePlanIdFilter filter value from a formatted string
   *
   * @param _value the RefinancePlanIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RefinancePlanIdFilter filter field
   */
  public void setRefinancePlanIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRefinancePlanIdFilterFromFormattedString");
    try {
      this.setRefinancePlanIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefinancePlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefinancePlanIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefinancePlanIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setRefinancePlanIdServFetch (boolean fetch) {
    this.RefinancePlanIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getRefinancePlanIdServFetch () {
    return this.RefinancePlanIdServFetch;
  }
  /** Set the SortOrder for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRefinancePlanIdServSortOrder (Integer value) {
    this.RefinancePlanIdServSort = value;
  }
  /** Retrieve SortOrder for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRefinancePlanIdServSortOrder () {
    return this.RefinancePlanIdServSort;
  }
  /** Set the sort direction for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRefinancePlanIdServSortDirection (boolean ascending) {
    this.RefinancePlanIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRefinancePlanIdServSortDirection () {
    return this.RefinancePlanIdServSortAscending;
  }
  /** Set the field level filters for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRefinancePlanIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.RefinancePlanIdServ = value;
  }
  /** Retrieve filter for field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRefinancePlanIdServFilter () {
    return this.RefinancePlanIdServ;
  }

  /**
   * Retrieves the RefinancePlanIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RefinancePlanIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefinancePlanIdServFilter field
   */
  public String[] getRefinancePlanIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRefinancePlanIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefinancePlanIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefinancePlanIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RefinancePlanIdServFilter filter value from a formatted string
   *
   * @param _value the RefinancePlanIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RefinancePlanIdServFilter filter field
   */
  public void setRefinancePlanIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRefinancePlanIdServFilterFromFormattedString");
    try {
      this.setRefinancePlanIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefinancePlanIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefinancePlanIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefinancePlanIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAdjTrackingIdFetch (boolean fetch) {
    this.AdjTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjTrackingIdFetch () {
    return this.AdjTrackingIdFetch;
  }
  /** Set the SortOrder for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjTrackingIdSortOrder (Integer value) {
    this.AdjTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjTrackingIdSortOrder () {
    return this.AdjTrackingIdSort;
  }
  /** Set the sort direction for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjTrackingIdSortDirection (boolean ascending) {
    this.AdjTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjTrackingIdSortDirection () {
    return this.AdjTrackingIdSortAscending;
  }
  /** Set the field level filters for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AdjTrackingId = value;
  }
  /** Retrieve filter for field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAdjTrackingIdFilter () {
    return this.AdjTrackingId;
  }

  /**
   * Retrieves the AdjTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AdjTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjTrackingIdFilter field
   */
  public String[] getAdjTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAdjTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AdjTrackingIdFilter filter value from a formatted string
   *
   * @param _value the AdjTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AdjTrackingIdFilter filter field
   */
  public void setAdjTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjTrackingIdFilterFromFormattedString");
    try {
      this.setAdjTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setAdjTrackingIdServFetch (boolean fetch) {
    this.AdjTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjTrackingIdServFetch () {
    return this.AdjTrackingIdServFetch;
  }
  /** Set the SortOrder for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjTrackingIdServSortOrder (Integer value) {
    this.AdjTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjTrackingIdServSortOrder () {
    return this.AdjTrackingIdServSort;
  }
  /** Set the sort direction for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjTrackingIdServSortDirection (boolean ascending) {
    this.AdjTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjTrackingIdServSortDirection () {
    return this.AdjTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.AdjTrackingIdServ = value;
  }
  /** Retrieve filter for field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAdjTrackingIdServFilter () {
    return this.AdjTrackingIdServ;
  }

  /**
   * Retrieves the AdjTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AdjTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjTrackingIdServFilter field
   */
  public String[] getAdjTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAdjTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AdjTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the AdjTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AdjTrackingIdServFilter filter field
   */
  public void setAdjTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjTrackingIdServFilterFromFormattedString");
    try {
      this.setAdjTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return RefinancePlanObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RefinancePlanObjectKeyHelper.toMap(this, null);
  }
}
