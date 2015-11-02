/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCreditObjectKeyFilter.java
 * Definition File: Customer/UsageCreditRate.xml
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

/** Key Filter for RUCreditObject object. */
public class RUCreditObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: RATE_UNIT_CR.unit_cr_id) */
  public    IntegerFilter[] UnitCrId  = null;
  protected boolean UnitCrIdFetch = false;
  protected boolean UnitCrIdSortAscending = true;
  protected Integer UnitCrIdSort = null;
  /** raw field for: RATE_UNIT_CR.rate_class) */
  public    IntegerFilter[] RateClass  = null;
  protected boolean RateClassFetch = false;
  protected boolean RateClassSortAscending = true;
  protected Integer RateClassSort = null;
  /** raw field for: RATE_UNIT_CR.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: RATE_UNIT_CR.billing_frequency) */
  public    IntegerFilter[] BillingFrequency  = null;
  protected boolean BillingFrequencyFetch = false;
  protected boolean BillingFrequencySortAscending = true;
  protected Integer BillingFrequencySort = null;
  /** raw field for: RATE_UNIT_CR.date_active) */
  public    DateFilter[] DateActive  = null;
  protected boolean DateActiveFetch = false;
  protected boolean DateActiveSortAscending = true;
  protected Integer DateActiveSort = null;
  /** raw field for: RATE_UNIT_CR.range_origin) */
  public    BigIntegerFilter[] RangeOrigin  = null;
  protected boolean RangeOriginFetch = false;
  protected boolean RangeOriginSortAscending = true;
  protected Integer RangeOriginSort = null;
  private String _objName = "RUCreditObjectKeyFilter";
  /** default constructor */
  public RUCreditObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public RUCreditObjectKeyFilter (RUCreditObjectKeyFilter other)
  {
    if (other == null) return;
    this.UnitCrId = other.UnitCrId;
    this.UnitCrIdFetch = other.UnitCrIdFetch;
    this.UnitCrIdSort = other.UnitCrIdSort;
    this.UnitCrIdSortAscending = other.UnitCrIdSortAscending;
    this.RateClass = other.RateClass;
    this.RateClassFetch = other.RateClassFetch;
    this.RateClassSort = other.RateClassSort;
    this.RateClassSortAscending = other.RateClassSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.BillingFrequency = other.BillingFrequency;
    this.BillingFrequencyFetch = other.BillingFrequencyFetch;
    this.BillingFrequencySort = other.BillingFrequencySort;
    this.BillingFrequencySortAscending = other.BillingFrequencySortAscending;
    this.DateActive = other.DateActive;
    this.DateActiveFetch = other.DateActiveFetch;
    this.DateActiveSort = other.DateActiveSort;
    this.DateActiveSortAscending = other.DateActiveSortAscending;
    this.RangeOrigin = other.RangeOrigin;
    this.RangeOriginFetch = other.RangeOriginFetch;
    this.RangeOriginSort = other.RangeOriginSort;
    this.RangeOriginSortAscending = other.RangeOriginSortAscending;
  }
  /** Set the field level Fetch value for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitCrIdFetch (boolean fetch) {
    this.UnitCrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitCrIdFetch () {
    return this.UnitCrIdFetch;
  }
  /** Set the SortOrder for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitCrIdSortOrder (Integer value) {
    this.UnitCrIdSort = value;
  }
  /** Retrieve SortOrder for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitCrIdSortOrder () {
    return this.UnitCrIdSort;
  }
  /** Set the sort direction for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitCrIdSortDirection (boolean ascending) {
    this.UnitCrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitCrIdSortDirection () {
    return this.UnitCrIdSortAscending;
  }
  /** Set the field level filters for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitCrIdFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitCrId = value;
  }
  /** Retrieve filter for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitCrIdFilter () {
    return this.UnitCrId;
  }

  /**
   * Retrieves the UnitCrIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitCrIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCrIdFilter field
   */
  public String[] getUnitCrIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitCrIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCrIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCrIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitCrIdFilter filter value from a formatted string
   *
   * @param _value the UnitCrIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitCrIdFilter filter field
   */
  public void setUnitCrIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitCrIdFilterFromFormattedString");
    try {
      this.setUnitCrIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCrIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCrIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateClass (RATE_UNIT_CR.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch) {
    this.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch () {
    return this.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (RATE_UNIT_CR.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value) {
    this.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder () {
    return this.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (RATE_UNIT_CR.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending) {
    this.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection () {
    return this.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (RATE_UNIT_CR.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter () {
    return this.RateClass;
  }

  /**
   * Retrieves the RateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassFilter field
   */
  public String[] getRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassFilter filter value from a formatted string
   *
   * @param _value the RateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromFormattedString");
    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (RATE_UNIT_CR.currency_code)
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

  /** Set the field level Fetch value for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingFrequencyFetch (boolean fetch) {
    this.BillingFrequencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingFrequencyFetch () {
    return this.BillingFrequencyFetch;
  }
  /** Set the SortOrder for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingFrequencySortOrder (Integer value) {
    this.BillingFrequencySort = value;
  }
  /** Retrieve SortOrder for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingFrequencySortOrder () {
    return this.BillingFrequencySort;
  }
  /** Set the sort direction for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingFrequencySortDirection (boolean ascending) {
    this.BillingFrequencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingFrequencySortDirection () {
    return this.BillingFrequencySortAscending;
  }
  /** Set the field level filters for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingFrequencyFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingFrequency = value;
  }
  /** Retrieve filter for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
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

  /** Set the field level Fetch value for field: DateActive (RATE_UNIT_CR.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch) {
    this.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (RATE_UNIT_CR.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch () {
    return this.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (RATE_UNIT_CR.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value) {
    this.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (RATE_UNIT_CR.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder () {
    return this.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (RATE_UNIT_CR.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending) {
    this.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (RATE_UNIT_CR.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection () {
    return this.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (RATE_UNIT_CR.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (RATE_UNIT_CR.date_active)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateActiveFilter () {
    return this.DateActive;
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeOriginFetch (boolean fetch) {
    this.RangeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeOriginFetch () {
    return this.RangeOriginFetch;
  }
  /** Set the SortOrder for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeOriginSortOrder (Integer value) {
    this.RangeOriginSort = value;
  }
  /** Retrieve SortOrder for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeOriginSortOrder () {
    return this.RangeOriginSort;
  }
  /** Set the sort direction for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeOriginSortDirection (boolean ascending) {
    this.RangeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeOriginSortDirection () {
    return this.RangeOriginSortAscending;
  }
  /** Set the field level filters for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeOriginFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeOrigin = value;
  }
  /** Retrieve filter for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeOriginFilter () {
    return this.RangeOrigin;
  }

  /**
   * Retrieves the RangeOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RangeOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOriginFilter field
   */
  public String[] getRangeOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRangeOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RangeOriginFilter filter value from a formatted string
   *
   * @param _value the RangeOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RangeOriginFilter filter field
   */
  public void setRangeOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRangeOriginFilterFromFormattedString");
    try {
      this.setRangeOriginFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginFilterFromFormattedString");
  }

  public String toString() {
    return RUCreditObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RUCreditObjectKeyHelper.toMap(this, null);
  }
}
