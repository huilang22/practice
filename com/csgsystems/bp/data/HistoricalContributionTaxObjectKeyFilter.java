/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionTaxObjectKeyFilter.java
 * Definition File: Customer/HistoricalContributionTax.xml
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

/** Key Filter for HistoricalContributionTaxObject object. */
public class HistoricalContributionTaxObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id) */
  public    IntegerFilter[] AccumulationTrackingId  = null;
  protected boolean AccumulationTrackingIdFetch = false;
  protected boolean AccumulationTrackingIdSortAscending = true;
  protected Integer AccumulationTrackingIdSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv) */
  public    IntegerFilter[] AccumulationTrackingIdServ  = null;
  protected boolean AccumulationTrackingIdServFetch = false;
  protected boolean AccumulationTrackingIdServSortAscending = true;
  protected Integer AccumulationTrackingIdServSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id) */
  public    IntegerFilter[] TaxPkgInstId  = null;
  protected boolean TaxPkgInstIdFetch = false;
  protected boolean TaxPkgInstIdSortAscending = true;
  protected Integer TaxPkgInstIdSort = null;
  private String _objName = "HistoricalContributionTaxObjectKeyFilter";
  /** default constructor */
  public HistoricalContributionTaxObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public HistoricalContributionTaxObjectKeyFilter (HistoricalContributionTaxObjectKeyFilter other)
  {
    if (other == null) return;
    this.AccumulationTrackingId = other.AccumulationTrackingId;
    this.AccumulationTrackingIdFetch = other.AccumulationTrackingIdFetch;
    this.AccumulationTrackingIdSort = other.AccumulationTrackingIdSort;
    this.AccumulationTrackingIdSortAscending = other.AccumulationTrackingIdSortAscending;
    this.AccumulationTrackingIdServ = other.AccumulationTrackingIdServ;
    this.AccumulationTrackingIdServFetch = other.AccumulationTrackingIdServFetch;
    this.AccumulationTrackingIdServSort = other.AccumulationTrackingIdServSort;
    this.AccumulationTrackingIdServSortAscending = other.AccumulationTrackingIdServSortAscending;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this.TaxPkgInstIdFetch = other.TaxPkgInstIdFetch;
    this.TaxPkgInstIdSort = other.TaxPkgInstIdSort;
    this.TaxPkgInstIdSortAscending = other.TaxPkgInstIdSortAscending;
  }
  /** Set the field level Fetch value for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccumulationTrackingIdFetch (boolean fetch) {
    this.AccumulationTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccumulationTrackingIdFetch () {
    return this.AccumulationTrackingIdFetch;
  }
  /** Set the SortOrder for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccumulationTrackingIdSortOrder (Integer value) {
    this.AccumulationTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccumulationTrackingIdSortOrder () {
    return this.AccumulationTrackingIdSort;
  }
  /** Set the sort direction for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccumulationTrackingIdSortDirection (boolean ascending) {
    this.AccumulationTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccumulationTrackingIdSortDirection () {
    return this.AccumulationTrackingIdSortAscending;
  }
  /** Set the field level filters for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccumulationTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccumulationTrackingId = value;
  }
  /** Retrieve filter for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccumulationTrackingIdFilter () {
    return this.AccumulationTrackingId;
  }

  /**
   * Retrieves the AccumulationTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccumulationTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccumulationTrackingIdFilter field
   */
  public String[] getAccumulationTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccumulationTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccumulationTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccumulationTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccumulationTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccumulationTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccumulationTrackingIdFilter filter value from a formatted string
   *
   * @param _value the AccumulationTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccumulationTrackingIdFilter filter field
   */
  public void setAccumulationTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccumulationTrackingIdFilterFromFormattedString");
    try {
      this.setAccumulationTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccumulationTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccumulationTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccumulationTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setAccumulationTrackingIdServFetch (boolean fetch) {
    this.AccumulationTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccumulationTrackingIdServFetch () {
    return this.AccumulationTrackingIdServFetch;
  }
  /** Set the SortOrder for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccumulationTrackingIdServSortOrder (Integer value) {
    this.AccumulationTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccumulationTrackingIdServSortOrder () {
    return this.AccumulationTrackingIdServSort;
  }
  /** Set the sort direction for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccumulationTrackingIdServSortDirection (boolean ascending) {
    this.AccumulationTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccumulationTrackingIdServSortDirection () {
    return this.AccumulationTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccumulationTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.AccumulationTrackingIdServ = value;
  }
  /** Retrieve filter for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccumulationTrackingIdServFilter () {
    return this.AccumulationTrackingIdServ;
  }

  /**
   * Retrieves the AccumulationTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccumulationTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccumulationTrackingIdServFilter field
   */
  public String[] getAccumulationTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccumulationTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccumulationTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccumulationTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccumulationTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccumulationTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccumulationTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the AccumulationTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccumulationTrackingIdServFilter filter field
   */
  public void setAccumulationTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccumulationTrackingIdServFilterFromFormattedString");
    try {
      this.setAccumulationTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccumulationTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccumulationTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccumulationTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch) {
    this.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch () {
    return this.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value) {
    this.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder () {
    return this.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending) {
    this.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection () {
    return this.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter () {
    return this.TaxPkgInstId;
  }

  /**
   * Retrieves the TaxPkgInstIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPkgInstIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstIdFilter field
   */
  public String[] getTaxPkgInstIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxPkgInstIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPkgInstIdFilter filter value from a formatted string
   *
   * @param _value the TaxPkgInstIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPkgInstIdFilter filter field
   */
  public void setTaxPkgInstIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
    try {
      this.setTaxPkgInstIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
  }

  public String toString() {
    return HistoricalContributionTaxObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HistoricalContributionTaxObjectKeyHelper.toMap(this, null);
  }
}
