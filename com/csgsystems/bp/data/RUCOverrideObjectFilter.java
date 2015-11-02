/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCOverrideObjectFilter.java
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



import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class RUCOverrideObjectFilter extends RUCBaseOverrideObjectFilter  implements Serializable
{
  /** raw field for: RATE_UNIT_CR_OVERRIDES.range_origin) */
  public    BigIntegerFilter[] RangeOriginAmount  = null;
  protected boolean RangeOriginAmountFetch = false;
  protected boolean RangeOriginAmountSortAscending = true;
  protected Integer RangeOriginAmountSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.range_origin) */
  public    BigIntegerFilter[] RangeOriginUnits  = null;
  protected boolean RangeOriginUnitsFetch = false;
  protected boolean RangeOriginUnitsSortAscending = true;
  protected Integer RangeOriginUnitsSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.range_terminus) */
  public    BigIntegerFilter[] RangeTerminusAmount  = null;
  protected boolean RangeTerminusAmountFetch = false;
  protected boolean RangeTerminusAmountSortAscending = true;
  protected Integer RangeTerminusAmountSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.range_terminus) */
  public    BigIntegerFilter[] RangeTerminusUnits  = null;
  protected boolean RangeTerminusUnitsFetch = false;
  protected boolean RangeTerminusUnitsSortAscending = true;
  protected Integer RangeTerminusUnitsSort = null;
  private String _objName = "RUCOverrideObjectFilter";
  /** default constructor */
  public RUCOverrideObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public RUCOverrideObjectFilter (RUCOverrideObjectFilter other)
  {
    super (other);
    if (other == null) return;
    this.RangeOriginAmount = other.RangeOriginAmount;
    this.RangeOriginAmountFetch = other.RangeOriginAmountFetch;
    this.RangeOriginAmountSort = other.RangeOriginAmountSort;
    this.RangeOriginAmountSortAscending = other.RangeOriginAmountSortAscending;
    this.RangeOriginUnits = other.RangeOriginUnits;
    this.RangeOriginUnitsFetch = other.RangeOriginUnitsFetch;
    this.RangeOriginUnitsSort = other.RangeOriginUnitsSort;
    this.RangeOriginUnitsSortAscending = other.RangeOriginUnitsSortAscending;
    this.RangeTerminusAmount = other.RangeTerminusAmount;
    this.RangeTerminusAmountFetch = other.RangeTerminusAmountFetch;
    this.RangeTerminusAmountSort = other.RangeTerminusAmountSort;
    this.RangeTerminusAmountSortAscending = other.RangeTerminusAmountSortAscending;
    this.RangeTerminusUnits = other.RangeTerminusUnits;
    this.RangeTerminusUnitsFetch = other.RangeTerminusUnitsFetch;
    this.RangeTerminusUnitsSort = other.RangeTerminusUnitsSort;
    this.RangeTerminusUnitsSortAscending = other.RangeTerminusUnitsSortAscending;  }
  /** Set the field level Fetch value for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeOriginAmountFetch (boolean fetch) {
    this.RangeOriginAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeOriginAmountFetch () {
    return this.RangeOriginAmountFetch;
  }
  /** Set the SortOrder for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeOriginAmountSortOrder (Integer value) {
    this.RangeOriginAmountSort = value;
  }
  /** Retrieve SortOrder for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeOriginAmountSortOrder () {
    return this.RangeOriginAmountSort;
  }
  /** Set the sort direction for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeOriginAmountSortDirection (boolean ascending) {
    this.RangeOriginAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeOriginAmountSortDirection () {
    return this.RangeOriginAmountSortAscending;
  }
  /** Set the field level filters for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeOriginAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeOriginAmount = value;
  }
  /** Retrieve filter for field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeOriginAmountFilter () {
    return this.RangeOriginAmount;
  }

  /**
   * Retrieves the RangeOriginAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RangeOriginAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOriginAmountFilter field
   */
  public String[] getRangeOriginAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRangeOriginAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RangeOriginAmountFilter filter value from a formatted string
   *
   * @param _value the RangeOriginAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RangeOriginAmountFilter filter field
   */
  public void setRangeOriginAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRangeOriginAmountFilterFromFormattedString");
    try {
      this.setRangeOriginAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginAmountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeOriginUnitsFetch (boolean fetch) {
    this.RangeOriginUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeOriginUnitsFetch () {
    return this.RangeOriginUnitsFetch;
  }
  /** Set the SortOrder for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeOriginUnitsSortOrder (Integer value) {
    this.RangeOriginUnitsSort = value;
  }
  /** Retrieve SortOrder for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeOriginUnitsSortOrder () {
    return this.RangeOriginUnitsSort;
  }
  /** Set the sort direction for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeOriginUnitsSortDirection (boolean ascending) {
    this.RangeOriginUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeOriginUnitsSortDirection () {
    return this.RangeOriginUnitsSortAscending;
  }
  /** Set the field level filters for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeOriginUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeOriginUnits = value;
  }
  /** Retrieve filter for field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeOriginUnitsFilter () {
    return this.RangeOriginUnits;
  }

  /**
   * Retrieves the RangeOriginUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RangeOriginUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOriginUnitsFilter field
   */
  public String[] getRangeOriginUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRangeOriginUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RangeOriginUnitsFilter filter value from a formatted string
   *
   * @param _value the RangeOriginUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RangeOriginUnitsFilter filter field
   */
  public void setRangeOriginUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRangeOriginUnitsFilterFromFormattedString");
    try {
      this.setRangeOriginUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeTerminusAmountFetch (boolean fetch) {
    this.RangeTerminusAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeTerminusAmountFetch () {
    return this.RangeTerminusAmountFetch;
  }
  /** Set the SortOrder for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeTerminusAmountSortOrder (Integer value) {
    this.RangeTerminusAmountSort = value;
  }
  /** Retrieve SortOrder for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeTerminusAmountSortOrder () {
    return this.RangeTerminusAmountSort;
  }
  /** Set the sort direction for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeTerminusAmountSortDirection (boolean ascending) {
    this.RangeTerminusAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeTerminusAmountSortDirection () {
    return this.RangeTerminusAmountSortAscending;
  }
  /** Set the field level filters for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeTerminusAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeTerminusAmount = value;
  }
  /** Retrieve filter for field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeTerminusAmountFilter () {
    return this.RangeTerminusAmount;
  }

  /**
   * Retrieves the RangeTerminusAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RangeTerminusAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeTerminusAmountFilter field
   */
  public String[] getRangeTerminusAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRangeTerminusAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeTerminusAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeTerminusAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeTerminusAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RangeTerminusAmountFilter filter value from a formatted string
   *
   * @param _value the RangeTerminusAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RangeTerminusAmountFilter filter field
   */
  public void setRangeTerminusAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRangeTerminusAmountFilterFromFormattedString");
    try {
      this.setRangeTerminusAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeTerminusAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeTerminusAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeTerminusAmountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeTerminusUnitsFetch (boolean fetch) {
    this.RangeTerminusUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeTerminusUnitsFetch () {
    return this.RangeTerminusUnitsFetch;
  }
  /** Set the SortOrder for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeTerminusUnitsSortOrder (Integer value) {
    this.RangeTerminusUnitsSort = value;
  }
  /** Retrieve SortOrder for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeTerminusUnitsSortOrder () {
    return this.RangeTerminusUnitsSort;
  }
  /** Set the sort direction for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeTerminusUnitsSortDirection (boolean ascending) {
    this.RangeTerminusUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeTerminusUnitsSortDirection () {
    return this.RangeTerminusUnitsSortAscending;
  }
  /** Set the field level filters for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeTerminusUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeTerminusUnits = value;
  }
  /** Retrieve filter for field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeTerminusUnitsFilter () {
    return this.RangeTerminusUnits;
  }

  /**
   * Retrieves the RangeTerminusUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RangeTerminusUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeTerminusUnitsFilter field
   */
  public String[] getRangeTerminusUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRangeTerminusUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeTerminusUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeTerminusUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeTerminusUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RangeTerminusUnitsFilter filter value from a formatted string
   *
   * @param _value the RangeTerminusUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RangeTerminusUnitsFilter filter field
   */
  public void setRangeTerminusUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRangeTerminusUnitsFilterFromFormattedString");
    try {
      this.setRangeTerminusUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeTerminusUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeTerminusUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeTerminusUnitsFilterFromFormattedString");
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public RUCOverrideObjectFilter (RUCBaseOverrideObjectFilter other)
  {
    super (other);

  }

  public String toString() {
    return RUCOverrideObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RUCOverrideObjectHelper.toMap(this, null);
  }
}
