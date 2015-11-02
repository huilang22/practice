/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointRateObjectKeyFilter.java
 * Definition File: Admin/BonusPointRate.xml
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

/** Key Filter for BonusPointRateObject object. */
public class BonusPointRateObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: RATE_BONUS_POINT.bonus_point_id) */
  public    IntegerFilter[] BonusPointId  = null;
  protected boolean BonusPointIdFetch = false;
  protected boolean BonusPointIdSortAscending = true;
  protected Integer BonusPointIdSort = null;
  /** raw field for: RATE_BONUS_POINT.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  private String _objName = "BonusPointRateObjectKeyFilter";
  /** default constructor */
  public BonusPointRateObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public BonusPointRateObjectKeyFilter (BonusPointRateObjectKeyFilter other)
  {
    if (other == null) return;
    this.BonusPointId = other.BonusPointId;
    this.BonusPointIdFetch = other.BonusPointIdFetch;
    this.BonusPointIdSort = other.BonusPointIdSort;
    this.BonusPointIdSortAscending = other.BonusPointIdSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
  }
  /** Set the field level Fetch value for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBonusPointIdFetch (boolean fetch) {
    this.BonusPointIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBonusPointIdFetch () {
    return this.BonusPointIdFetch;
  }
  /** Set the SortOrder for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBonusPointIdSortOrder (Integer value) {
    this.BonusPointIdSort = value;
  }
  /** Retrieve SortOrder for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBonusPointIdSortOrder () {
    return this.BonusPointIdSort;
  }
  /** Set the sort direction for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBonusPointIdSortDirection (boolean ascending) {
    this.BonusPointIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBonusPointIdSortDirection () {
    return this.BonusPointIdSortAscending;
  }
  /** Set the field level filters for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBonusPointIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BonusPointId = value;
  }
  /** Retrieve filter for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBonusPointIdFilter () {
    return this.BonusPointId;
  }

  /**
   * Retrieves the BonusPointIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BonusPointIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointIdFilter field
   */
  public String[] getBonusPointIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBonusPointIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BonusPointIdFilter filter value from a formatted string
   *
   * @param _value the BonusPointIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BonusPointIdFilter filter field
   */
  public void setBonusPointIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointIdFilterFromFormattedString");
    try {
      this.setBonusPointIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  public String toString() {
    return BonusPointRateObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BonusPointRateObjectKeyHelper.toMap(this, null);
  }
}
