/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentDistributionObjectKeyFilter.java
 * Definition File: Customer/PaymentDistribution.xml
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

/** Key Filter for PaymentDistributionObject object. */
public class PaymentDistributionObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: BMF_DISTRIBUTION.bmf_tracking_id) */
  public    IntegerFilter[] BmfTrackingId  = null;
  protected boolean BmfTrackingIdFetch = false;
  protected boolean BmfTrackingIdSortAscending = true;
  protected Integer BmfTrackingIdSort = null;
  /** raw field for: BMF_DISTRIBUTION.bmf_tracking_id_serv) */
  public    IntegerFilter[] BmfTrackingIdServ  = null;
  protected boolean BmfTrackingIdServFetch = false;
  protected boolean BmfTrackingIdServSortAscending = true;
  protected Integer BmfTrackingIdServSort = null;
  /** raw field for: BMF_DISTRIBUTION.distrib_order) */
  public    IntegerFilter[] DistribOrder  = null;
  protected boolean DistribOrderFetch = false;
  protected boolean DistribOrderSortAscending = true;
  protected Integer DistribOrderSort = null;
  private String _objName = "PaymentDistributionObjectKeyFilter";
  /** default constructor */
  public PaymentDistributionObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public PaymentDistributionObjectKeyFilter (PaymentDistributionObjectKeyFilter other)
  {
    if (other == null) return;
    this.BmfTrackingId = other.BmfTrackingId;
    this.BmfTrackingIdFetch = other.BmfTrackingIdFetch;
    this.BmfTrackingIdSort = other.BmfTrackingIdSort;
    this.BmfTrackingIdSortAscending = other.BmfTrackingIdSortAscending;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this.BmfTrackingIdServFetch = other.BmfTrackingIdServFetch;
    this.BmfTrackingIdServSort = other.BmfTrackingIdServSort;
    this.BmfTrackingIdServSortAscending = other.BmfTrackingIdServSortAscending;
    this.DistribOrder = other.DistribOrder;
    this.DistribOrderFetch = other.DistribOrderFetch;
    this.DistribOrderSort = other.DistribOrderSort;
    this.DistribOrderSortAscending = other.DistribOrderSortAscending;
  }
  /** Set the field level Fetch value for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdFetch (boolean fetch) {
    this.BmfTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdFetch () {
    return this.BmfTrackingIdFetch;
  }
  /** Set the SortOrder for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdSortOrder (Integer value) {
    this.BmfTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdSortOrder () {
    return this.BmfTrackingIdSort;
  }
  /** Set the sort direction for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdSortDirection (boolean ascending) {
    this.BmfTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdSortDirection () {
    return this.BmfTrackingIdSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingId = value;
  }
  /** Retrieve filter for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdFilter () {
    return this.BmfTrackingId;
  }

  /**
   * Retrieves the BmfTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdFilter field
   */
  public String[] getBmfTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdFilter filter field
   */
  public void setBmfTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
    try {
      this.setBmfTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdServFetch (boolean fetch) {
    this.BmfTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdServFetch () {
    return this.BmfTrackingIdServFetch;
  }
  /** Set the SortOrder for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdServSortOrder (Integer value) {
    this.BmfTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdServSortOrder () {
    return this.BmfTrackingIdServSort;
  }
  /** Set the sort direction for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdServSortDirection (boolean ascending) {
    this.BmfTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdServSortDirection () {
    return this.BmfTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingIdServ = value;
  }
  /** Retrieve filter for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdServFilter () {
    return this.BmfTrackingIdServ;
  }

  /**
   * Retrieves the BmfTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServFilter field
   */
  public String[] getBmfTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdServFilter filter field
   */
  public void setBmfTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
    try {
      this.setBmfTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @param fetch whether to fetch this field or not
   */
  public void setDistribOrderFetch (boolean fetch) {
    this.DistribOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistribOrderFetch () {
    return this.DistribOrderFetch;
  }
  /** Set the SortOrder for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistribOrderSortOrder (Integer value) {
    this.DistribOrderSort = value;
  }
  /** Retrieve SortOrder for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistribOrderSortOrder () {
    return this.DistribOrderSort;
  }
  /** Set the sort direction for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistribOrderSortDirection (boolean ascending) {
    this.DistribOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistribOrderSortDirection () {
    return this.DistribOrderSortAscending;
  }
  /** Set the field level filters for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistribOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.DistribOrder = value;
  }
  /** Retrieve filter for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
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
    return PaymentDistributionObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PaymentDistributionObjectKeyHelper.toMap(this, null);
  }
}
