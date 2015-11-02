/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointRateObjectFilter.java
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
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class BonusPointRateObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public BonusPointRateObjectKeyFilter Key = null;
  /** raw field for: RATE_BONUS_POINT.convert_factor) */
  public    IntegerFilter[] ConvertFactor  = null;
  protected boolean ConvertFactorFetch = false;
  protected boolean ConvertFactorSortAscending = true;
  protected Integer ConvertFactorSort = null;
  /** raw field for: RATE_BONUS_POINT.operator) */
  public    IntegerFilter[] Operator  = null;
  protected boolean OperatorFetch = false;
  protected boolean OperatorSortAscending = true;
  protected Integer OperatorSort = null;
  /** raw field for: RATE_BONUS_POINT.implied_decimals) */
  public    IntegerFilter[] ImpliedDecimals  = null;
  protected boolean ImpliedDecimalsFetch = false;
  protected boolean ImpliedDecimalsSortAscending = true;
  protected Integer ImpliedDecimalsSort = null;
  /** raw field for: RATE_BONUS_POINT.date_active) */
  public    DateFilter[] DateActive  = null;
  protected boolean DateActiveFetch = false;
  protected boolean DateActiveSortAscending = true;
  protected Integer DateActiveSort = null;
  /** raw field for: RATE_BONUS_POINT.date_inactive) */
  public    DateFilter[] DateInactive  = null;
  protected boolean DateInactiveFetch = false;
  protected boolean DateInactiveSortAscending = true;
  protected Integer DateInactiveSort = null;
  /** raw field for: RATE_BONUS_POINT.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "BonusPointRateObjectFilter";
  /** default constructor */
  public BonusPointRateObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BonusPointRateObjectFilter (BonusPointRateObjectFilter other)
  {
    if (other == null) return;
    this.Key = new BonusPointRateObjectKeyFilter (other.Key);
    this.ConvertFactor = other.ConvertFactor;
    this.ConvertFactorFetch = other.ConvertFactorFetch;
    this.ConvertFactorSort = other.ConvertFactorSort;
    this.ConvertFactorSortAscending = other.ConvertFactorSortAscending;
    this.Operator = other.Operator;
    this.OperatorFetch = other.OperatorFetch;
    this.OperatorSort = other.OperatorSort;
    this.OperatorSortAscending = other.OperatorSortAscending;
    this.ImpliedDecimals = other.ImpliedDecimals;
    this.ImpliedDecimalsFetch = other.ImpliedDecimalsFetch;
    this.ImpliedDecimalsSort = other.ImpliedDecimalsSort;
    this.ImpliedDecimalsSortAscending = other.ImpliedDecimalsSortAscending;
    this.DateActive = other.DateActive;
    this.DateActiveFetch = other.DateActiveFetch;
    this.DateActiveSort = other.DateActiveSort;
    this.DateActiveSortAscending = other.DateActiveSortAscending;
    this.DateInactive = other.DateInactive;
    this.DateInactiveFetch = other.DateInactiveFetch;
    this.DateInactiveSort = other.DateInactiveSort;
    this.DateInactiveSortAscending = other.DateInactiveSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return BonusPointRateObjectKeyFilter
   */
  public BonusPointRateObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (BonusPointRateObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBonusPointIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.BonusPointIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBonusPointIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BonusPointIdFetch;
  }
  /** Set the SortOrder for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBonusPointIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.BonusPointIdSort = value;
  }
  /** Retrieve SortOrder for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBonusPointIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BonusPointIdSort;
  }
  /** Set the sort direction for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBonusPointIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.BonusPointIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBonusPointIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BonusPointIdSortAscending;
  }
  /** Set the field level filters for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBonusPointIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.BonusPointId = value;
  }
  /** Retrieve filter for field: BonusPointId (RATE_BONUS_POINT.bonus_point_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBonusPointIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BonusPointId;
  }
  /** Set the field level Fetch value for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BonusPointRateObjectKeyFilter ();
    this.Key.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (RATE_BONUS_POINT.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Set the field level Fetch value for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * @param fetch whether to fetch this field or not
   */
  public void setConvertFactorFetch (boolean fetch) {
    this.ConvertFactorFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * @return boolean the Fetch value for this field
   */
  public boolean getConvertFactorFetch () {
    return this.ConvertFactorFetch;
  }
  /** Set the SortOrder for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConvertFactorSortOrder (Integer value) {
    this.ConvertFactorSort = value;
  }
  /** Retrieve SortOrder for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConvertFactorSortOrder () {
    return this.ConvertFactorSort;
  }
  /** Set the sort direction for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConvertFactorSortDirection (boolean ascending) {
    this.ConvertFactorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConvertFactorSortDirection () {
    return this.ConvertFactorSortAscending;
  }
  /** Set the field level filters for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConvertFactorFilter (IntegerFilter[] value) throws ServiceException {
    this.ConvertFactor = value;
  }
  /** Retrieve filter for field: ConvertFactor (RATE_BONUS_POINT.convert_factor)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getConvertFactorFilter () {
    return this.ConvertFactor;
  }

  /**
   * Retrieves the ConvertFactorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConvertFactorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConvertFactorFilter field
   */
  public String[] getConvertFactorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConvertFactorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConvertFactorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConvertFactorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConvertFactorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConvertFactorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConvertFactorFilter filter value from a formatted string
   *
   * @param _value the ConvertFactorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConvertFactorFilter filter field
   */
  public void setConvertFactorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConvertFactorFilterFromFormattedString");
    try {
      this.setConvertFactorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConvertFactorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConvertFactorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConvertFactorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Operator (RATE_BONUS_POINT.operator)
   * @param fetch whether to fetch this field or not
   */
  public void setOperatorFetch (boolean fetch) {
    this.OperatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: Operator (RATE_BONUS_POINT.operator)
   * @return boolean the Fetch value for this field
   */
  public boolean getOperatorFetch () {
    return this.OperatorFetch;
  }
  /** Set the SortOrder for field: Operator (RATE_BONUS_POINT.operator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOperatorSortOrder (Integer value) {
    this.OperatorSort = value;
  }
  /** Retrieve SortOrder for field: Operator (RATE_BONUS_POINT.operator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOperatorSortOrder () {
    return this.OperatorSort;
  }
  /** Set the sort direction for field: Operator (RATE_BONUS_POINT.operator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOperatorSortDirection (boolean ascending) {
    this.OperatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Operator (RATE_BONUS_POINT.operator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOperatorSortDirection () {
    return this.OperatorSortAscending;
  }
  /** Set the field level filters for field: Operator (RATE_BONUS_POINT.operator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOperatorFilter (IntegerFilter[] value) throws ServiceException {
    this.Operator = value;
  }
  /** Retrieve filter for field: Operator (RATE_BONUS_POINT.operator)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOperatorFilter () {
    return this.Operator;
  }

  /**
   * Retrieves the OperatorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OperatorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OperatorFilter field
   */
  public String[] getOperatorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOperatorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOperatorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOperatorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OperatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOperatorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OperatorFilter filter value from a formatted string
   *
   * @param _value the OperatorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OperatorFilter filter field
   */
  public void setOperatorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOperatorFilterFromFormattedString");
    try {
      this.setOperatorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OperatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOperatorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOperatorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * @param fetch whether to fetch this field or not
   */
  public void setImpliedDecimalsFetch (boolean fetch) {
    this.ImpliedDecimalsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * @return boolean the Fetch value for this field
   */
  public boolean getImpliedDecimalsFetch () {
    return this.ImpliedDecimalsFetch;
  }
  /** Set the SortOrder for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setImpliedDecimalsSortOrder (Integer value) {
    this.ImpliedDecimalsSort = value;
  }
  /** Retrieve SortOrder for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getImpliedDecimalsSortOrder () {
    return this.ImpliedDecimalsSort;
  }
  /** Set the sort direction for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setImpliedDecimalsSortDirection (boolean ascending) {
    this.ImpliedDecimalsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getImpliedDecimalsSortDirection () {
    return this.ImpliedDecimalsSortAscending;
  }
  /** Set the field level filters for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setImpliedDecimalsFilter (IntegerFilter[] value) throws ServiceException {
    this.ImpliedDecimals = value;
  }
  /** Retrieve filter for field: ImpliedDecimals (RATE_BONUS_POINT.implied_decimals)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getImpliedDecimalsFilter () {
    return this.ImpliedDecimals;
  }

  /**
   * Retrieves the ImpliedDecimalsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ImpliedDecimalsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImpliedDecimalsFilter field
   */
  public String[] getImpliedDecimalsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImpliedDecimalsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getImpliedDecimalsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImpliedDecimalsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImpliedDecimalsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getImpliedDecimalsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ImpliedDecimalsFilter filter value from a formatted string
   *
   * @param _value the ImpliedDecimalsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ImpliedDecimalsFilter filter field
   */
  public void setImpliedDecimalsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setImpliedDecimalsFilterFromFormattedString");
    try {
      this.setImpliedDecimalsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImpliedDecimalsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setImpliedDecimalsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImpliedDecimalsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DateActive (RATE_BONUS_POINT.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch) {
    this.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (RATE_BONUS_POINT.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch () {
    return this.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (RATE_BONUS_POINT.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value) {
    this.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (RATE_BONUS_POINT.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder () {
    return this.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (RATE_BONUS_POINT.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending) {
    this.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (RATE_BONUS_POINT.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection () {
    return this.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (RATE_BONUS_POINT.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (RATE_BONUS_POINT.date_active)
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


  /** Set the field level Fetch value for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * @param fetch whether to fetch this field or not
   */
  public void setDateInactiveFetch (boolean fetch) {
    this.DateInactiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateInactiveFetch () {
    return this.DateInactiveFetch;
  }
  /** Set the SortOrder for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateInactiveSortOrder (Integer value) {
    this.DateInactiveSort = value;
  }
  /** Retrieve SortOrder for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateInactiveSortOrder () {
    return this.DateInactiveSort;
  }
  /** Set the sort direction for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateInactiveSortDirection (boolean ascending) {
    this.DateInactiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateInactiveSortDirection () {
    return this.DateInactiveSortAscending;
  }
  /** Set the field level filters for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateInactiveFilter (DateFilter[] value) throws ServiceException {
    this.DateInactive = value;
  }
  /** Retrieve filter for field: DateInactive (RATE_BONUS_POINT.date_inactive)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateInactiveFilter () {
    return this.DateInactive;
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (RATE_BONUS_POINT.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  public String toString() {
    return BonusPointRateObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BonusPointRateObjectHelper.toMap(this, null);
  }
}
