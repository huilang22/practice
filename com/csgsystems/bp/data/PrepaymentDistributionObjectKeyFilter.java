/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentDistributionObjectKeyFilter.java
 * Definition File: Customer/PrepaymentDistribution.xml
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

/** Key Filter for PrepaymentDistributionObject object. */
public class PrepaymentDistributionObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: PREPAYMENT_DISTRIBUTION.prepayment_tracking_id) */
  public    IntegerFilter[] PrepaymentTrackingId  = null;
  protected boolean PrepaymentTrackingIdFetch = false;
  protected boolean PrepaymentTrackingIdSortAscending = true;
  protected Integer PrepaymentTrackingIdSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv) */
  public    IntegerFilter[] PrepaymentTrackingIdServ  = null;
  protected boolean PrepaymentTrackingIdServFetch = false;
  protected boolean PrepaymentTrackingIdServSortAscending = true;
  protected Integer PrepaymentTrackingIdServSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.distrib_order) */
  public    IntegerFilter[] DistribOrder  = null;
  protected boolean DistribOrderFetch = false;
  protected boolean DistribOrderSortAscending = true;
  protected Integer DistribOrderSort = null;
  private String _objName = "PrepaymentDistributionObjectKeyFilter";
  /** default constructor */
  public PrepaymentDistributionObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public PrepaymentDistributionObjectKeyFilter (PrepaymentDistributionObjectKeyFilter other)
  {
    if (other == null) return;
    this.PrepaymentTrackingId = other.PrepaymentTrackingId;
    this.PrepaymentTrackingIdFetch = other.PrepaymentTrackingIdFetch;
    this.PrepaymentTrackingIdSort = other.PrepaymentTrackingIdSort;
    this.PrepaymentTrackingIdSortAscending = other.PrepaymentTrackingIdSortAscending;
    this.PrepaymentTrackingIdServ = other.PrepaymentTrackingIdServ;
    this.PrepaymentTrackingIdServFetch = other.PrepaymentTrackingIdServFetch;
    this.PrepaymentTrackingIdServSort = other.PrepaymentTrackingIdServSort;
    this.PrepaymentTrackingIdServSortAscending = other.PrepaymentTrackingIdServSortAscending;
    this.DistribOrder = other.DistribOrder;
    this.DistribOrderFetch = other.DistribOrderFetch;
    this.DistribOrderSort = other.DistribOrderSort;
    this.DistribOrderSortAscending = other.DistribOrderSortAscending;
  }
  /** Set the field level Fetch value for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepaymentTrackingIdFetch (boolean fetch) {
    this.PrepaymentTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepaymentTrackingIdFetch () {
    return this.PrepaymentTrackingIdFetch;
  }
  /** Set the SortOrder for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepaymentTrackingIdSortOrder (Integer value) {
    this.PrepaymentTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepaymentTrackingIdSortOrder () {
    return this.PrepaymentTrackingIdSort;
  }
  /** Set the sort direction for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepaymentTrackingIdSortDirection (boolean ascending) {
    this.PrepaymentTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepaymentTrackingIdSortDirection () {
    return this.PrepaymentTrackingIdSortAscending;
  }
  /** Set the field level filters for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepaymentTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PrepaymentTrackingId = value;
  }
  /** Retrieve filter for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepaymentTrackingIdFilter () {
    return this.PrepaymentTrackingId;
  }

  /**
   * Retrieves the PrepaymentTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepaymentTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaymentTrackingIdFilter field
   */
  public String[] getPrepaymentTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepaymentTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepaymentTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaymentTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepaymentTrackingIdFilter filter value from a formatted string
   *
   * @param _value the PrepaymentTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepaymentTrackingIdFilter filter field
   */
  public void setPrepaymentTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepaymentTrackingIdFilterFromFormattedString");
    try {
      this.setPrepaymentTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepaymentTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaymentTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaymentTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepaymentTrackingIdServFetch (boolean fetch) {
    this.PrepaymentTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepaymentTrackingIdServFetch () {
    return this.PrepaymentTrackingIdServFetch;
  }
  /** Set the SortOrder for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepaymentTrackingIdServSortOrder (Integer value) {
    this.PrepaymentTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepaymentTrackingIdServSortOrder () {
    return this.PrepaymentTrackingIdServSort;
  }
  /** Set the sort direction for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepaymentTrackingIdServSortDirection (boolean ascending) {
    this.PrepaymentTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepaymentTrackingIdServSortDirection () {
    return this.PrepaymentTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepaymentTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.PrepaymentTrackingIdServ = value;
  }
  /** Retrieve filter for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepaymentTrackingIdServFilter () {
    return this.PrepaymentTrackingIdServ;
  }

  /**
   * Retrieves the PrepaymentTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepaymentTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaymentTrackingIdServFilter field
   */
  public String[] getPrepaymentTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepaymentTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepaymentTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaymentTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepaymentTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the PrepaymentTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepaymentTrackingIdServFilter filter field
   */
  public void setPrepaymentTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepaymentTrackingIdServFilterFromFormattedString");
    try {
      this.setPrepaymentTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepaymentTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaymentTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaymentTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @param fetch whether to fetch this field or not
   */
  public void setDistribOrderFetch (boolean fetch) {
    this.DistribOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistribOrderFetch () {
    return this.DistribOrderFetch;
  }
  /** Set the SortOrder for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistribOrderSortOrder (Integer value) {
    this.DistribOrderSort = value;
  }
  /** Retrieve SortOrder for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistribOrderSortOrder () {
    return this.DistribOrderSort;
  }
  /** Set the sort direction for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistribOrderSortDirection (boolean ascending) {
    this.DistribOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistribOrderSortDirection () {
    return this.DistribOrderSortAscending;
  }
  /** Set the field level filters for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistribOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.DistribOrder = value;
  }
  /** Retrieve filter for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDistribOrderFilter () {
    return this.DistribOrder;
  }

  /**
   * Retrieves the DistribOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistribOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistribOrderFilter field
   */
  public String[] getDistribOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistribOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistribOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistribOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistribOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistribOrderFilter filter value from a formatted string
   *
   * @param _value the DistribOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistribOrderFilter filter field
   */
  public void setDistribOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistribOrderFilterFromFormattedString");
    try {
      this.setDistribOrderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistribOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistribOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistribOrderFilterFromFormattedString");
  }

  public String toString() {
    return PrepaymentDistributionObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PrepaymentDistributionObjectKeyHelper.toMap(this, null);
  }
}
