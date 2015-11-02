/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BulkAdjustmentObjectFilter.java
 * Definition File: Customer/BulkAdjustment.xml
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
public class BulkAdjustmentObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: ADJ.adj_trans_code) */
  public    IntegerFilter[] TransCode  = null;
  protected boolean TransCodeFetch = false;
  protected boolean TransCodeSortAscending = true;
  protected Integer TransCodeSort = null;
  /** raw field for: ADJ.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  /** raw field for: ADJ.primary_units_type) */
  public    IntegerFilter[] PrimaryUnitsType  = null;
  protected boolean PrimaryUnitsTypeFetch = false;
  protected boolean PrimaryUnitsTypeSortAscending = true;
  protected Integer PrimaryUnitsTypeSort = null;
  /** raw field for: ADJ.primary_units) */
  public    BigIntegerFilter[] PrimaryUnits  = null;
  protected boolean PrimaryUnitsFetch = false;
  protected boolean PrimaryUnitsSortAscending = true;
  protected Integer PrimaryUnitsSort = null;
  /** raw field for: ADJ.effective_date) */
  public    DateFilter[] EffectiveDate  = null;
  protected boolean EffectiveDateFetch = false;
  protected boolean EffectiveDateSortAscending = true;
  protected Integer EffectiveDateSort = null;
  /** raw field for: ADJ.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: ADJ.adj_reason_code) */
  public    IntegerFilter[] AdjReasonCode  = null;
  protected boolean AdjReasonCodeFetch = false;
  protected boolean AdjReasonCodeSortAscending = true;
  protected Integer AdjReasonCodeSort = null;
  /** raw field for: ADJ.total_amt) */
  public    BigIntegerFilter[] TotalAmt  = null;
  protected boolean TotalAmtFetch = false;
  protected boolean TotalAmtSortAscending = true;
  protected Integer TotalAmtSort = null;
  /** raw field */
  public    IntegerFilter[] AdjTransGroup  = null;
  protected boolean AdjTransGroupFetch = false;
  protected boolean AdjTransGroupSortAscending = true;
  protected Integer AdjTransGroupSort = null;
  /** raw field */
  public    IntegerFilter[] IsMax  = null;
  protected boolean IsMaxFetch = false;
  protected boolean IsMaxSortAscending = true;
  protected Integer IsMaxSort = null;
  private String _objName = "BulkAdjustmentObjectFilter";
  /** default constructor */
  public BulkAdjustmentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BulkAdjustmentObjectFilter (BulkAdjustmentObjectFilter other)
  {
    if (other == null) return;
    this.TransCode = other.TransCode;
    this.TransCodeFetch = other.TransCodeFetch;
    this.TransCodeSort = other.TransCodeSort;
    this.TransCodeSortAscending = other.TransCodeSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;
    this.PrimaryUnitsType = other.PrimaryUnitsType;
    this.PrimaryUnitsTypeFetch = other.PrimaryUnitsTypeFetch;
    this.PrimaryUnitsTypeSort = other.PrimaryUnitsTypeSort;
    this.PrimaryUnitsTypeSortAscending = other.PrimaryUnitsTypeSortAscending;
    this.PrimaryUnits = other.PrimaryUnits;
    this.PrimaryUnitsFetch = other.PrimaryUnitsFetch;
    this.PrimaryUnitsSort = other.PrimaryUnitsSort;
    this.PrimaryUnitsSortAscending = other.PrimaryUnitsSortAscending;
    this.EffectiveDate = other.EffectiveDate;
    this.EffectiveDateFetch = other.EffectiveDateFetch;
    this.EffectiveDateSort = other.EffectiveDateSort;
    this.EffectiveDateSortAscending = other.EffectiveDateSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.AdjReasonCode = other.AdjReasonCode;
    this.AdjReasonCodeFetch = other.AdjReasonCodeFetch;
    this.AdjReasonCodeSort = other.AdjReasonCodeSort;
    this.AdjReasonCodeSortAscending = other.AdjReasonCodeSortAscending;
    this.TotalAmt = other.TotalAmt;
    this.TotalAmtFetch = other.TotalAmtFetch;
    this.TotalAmtSort = other.TotalAmtSort;
    this.TotalAmtSortAscending = other.TotalAmtSortAscending;
    this.AdjTransGroup = other.AdjTransGroup;
    this.AdjTransGroupFetch = other.AdjTransGroupFetch;
    this.AdjTransGroupSort = other.AdjTransGroupSort;
    this.AdjTransGroupSortAscending = other.AdjTransGroupSortAscending;
    this.IsMax = other.IsMax;
    this.IsMaxFetch = other.IsMaxFetch;
    this.IsMaxSort = other.IsMaxSort;
    this.IsMaxSortAscending = other.IsMaxSortAscending;  }
  /** Set the field level Fetch value for field: TransCode (ADJ.adj_trans_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTransCodeFetch (boolean fetch) {
    this.TransCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransCode (ADJ.adj_trans_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransCodeFetch () {
    return this.TransCodeFetch;
  }
  /** Set the SortOrder for field: TransCode (ADJ.adj_trans_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransCodeSortOrder (Integer value) {
    this.TransCodeSort = value;
  }
  /** Retrieve SortOrder for field: TransCode (ADJ.adj_trans_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransCodeSortOrder () {
    return this.TransCodeSort;
  }
  /** Set the sort direction for field: TransCode (ADJ.adj_trans_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransCodeSortDirection (boolean ascending) {
    this.TransCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransCode (ADJ.adj_trans_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransCodeSortDirection () {
    return this.TransCodeSortAscending;
  }
  /** Set the field level filters for field: TransCode (ADJ.adj_trans_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TransCode = value;
  }
  /** Retrieve filter for field: TransCode (ADJ.adj_trans_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransCodeFilter () {
    return this.TransCode;
  }

  /**
   * Retrieves the TransCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransCodeFilter field
   */
  public String[] getTransCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransCodeFilter filter value from a formatted string
   *
   * @param _value the TransCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransCodeFilter filter field
   */
  public void setTransCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFilterFromFormattedString");
    try {
      this.setTransCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated TransCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TransCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransCodeFilter filter field
   */
  public String[] getTransCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTransCodeFilter(), "AdjustmentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TransCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TransCodeFilter filter field
   */
  public void setTransCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTransCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "TransCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: Annotation (ADJ.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (ADJ.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (ADJ.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (ADJ.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (ADJ.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (ADJ.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (ADJ.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (ADJ.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (ADJ.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (ADJ.annotation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAnnotationFilter () {
    return this.Annotation;
  }

  /**
   * Retrieves the AnnotationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AnnotationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AnnotationFilter field
   */
  public String[] getAnnotationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAnnotationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AnnotationFilter filter value from a formatted string
   *
   * @param _value the AnnotationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AnnotationFilter filter field
   */
  public void setAnnotationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAnnotationFilterFromFormattedString");
    try {
      this.setAnnotationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setPrimaryUnitsTypeFetch (boolean fetch) {
    this.PrimaryUnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrimaryUnitsTypeFetch () {
    return this.PrimaryUnitsTypeFetch;
  }
  /** Set the SortOrder for field: PrimaryUnitsType (ADJ.primary_units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrimaryUnitsTypeSortOrder (Integer value) {
    this.PrimaryUnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrimaryUnitsTypeSortOrder () {
    return this.PrimaryUnitsTypeSort;
  }
  /** Set the sort direction for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrimaryUnitsTypeSortDirection (boolean ascending) {
    this.PrimaryUnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrimaryUnitsTypeSortDirection () {
    return this.PrimaryUnitsTypeSortAscending;
  }
  /** Set the field level filters for field: PrimaryUnitsType (ADJ.primary_units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrimaryUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.PrimaryUnitsType = value;
  }
  /** Retrieve filter for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrimaryUnitsTypeFilter () {
    return this.PrimaryUnitsType;
  }

  /**
   * Retrieves the PrimaryUnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrimaryUnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnitsTypeFilter field
   */
  public String[] getPrimaryUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrimaryUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrimaryUnitsTypeFilter filter value from a formatted string
   *
   * @param _value the PrimaryUnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrimaryUnitsTypeFilter filter field
   */
  public void setPrimaryUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrimaryUnitsTypeFilterFromFormattedString");
    try {
      this.setPrimaryUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrimaryUnits (ADJ.primary_units)
   * @param fetch whether to fetch this field or not
   */
  public void setPrimaryUnitsFetch (boolean fetch) {
    this.PrimaryUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrimaryUnits (ADJ.primary_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrimaryUnitsFetch () {
    return this.PrimaryUnitsFetch;
  }
  /** Set the SortOrder for field: PrimaryUnits (ADJ.primary_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrimaryUnitsSortOrder (Integer value) {
    this.PrimaryUnitsSort = value;
  }
  /** Retrieve SortOrder for field: PrimaryUnits (ADJ.primary_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrimaryUnitsSortOrder () {
    return this.PrimaryUnitsSort;
  }
  /** Set the sort direction for field: PrimaryUnits (ADJ.primary_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrimaryUnitsSortDirection (boolean ascending) {
    this.PrimaryUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrimaryUnits (ADJ.primary_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrimaryUnitsSortDirection () {
    return this.PrimaryUnitsSortAscending;
  }
  /** Set the field level filters for field: PrimaryUnits (ADJ.primary_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrimaryUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PrimaryUnits = value;
  }
  /** Retrieve filter for field: PrimaryUnits (ADJ.primary_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPrimaryUnitsFilter () {
    return this.PrimaryUnits;
  }

  /**
   * Retrieves the PrimaryUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrimaryUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnitsFilter field
   */
  public String[] getPrimaryUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrimaryUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrimaryUnitsFilter filter value from a formatted string
   *
   * @param _value the PrimaryUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrimaryUnitsFilter filter field
   */
  public void setPrimaryUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrimaryUnitsFilterFromFormattedString");
    try {
      this.setPrimaryUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EffectiveDate (ADJ.effective_date)
   * @param fetch whether to fetch this field or not
   */
  public void setEffectiveDateFetch (boolean fetch) {
    this.EffectiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: EffectiveDate (ADJ.effective_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getEffectiveDateFetch () {
    return this.EffectiveDateFetch;
  }
  /** Set the SortOrder for field: EffectiveDate (ADJ.effective_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEffectiveDateSortOrder (Integer value) {
    this.EffectiveDateSort = value;
  }
  /** Retrieve SortOrder for field: EffectiveDate (ADJ.effective_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEffectiveDateSortOrder () {
    return this.EffectiveDateSort;
  }
  /** Set the sort direction for field: EffectiveDate (ADJ.effective_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEffectiveDateSortDirection (boolean ascending) {
    this.EffectiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EffectiveDate (ADJ.effective_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEffectiveDateSortDirection () {
    return this.EffectiveDateSortAscending;
  }
  /** Set the field level filters for field: EffectiveDate (ADJ.effective_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEffectiveDateFilter (DateFilter[] value) throws ServiceException {
    this.EffectiveDate = value;
  }
  /** Retrieve filter for field: EffectiveDate (ADJ.effective_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEffectiveDateFilter () {
    return this.EffectiveDate;
  }

  /**
   * Retrieves the EffectiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDateFilter field
   */
  public String[] getEffectiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEffectiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDateFilter filter value from a formatted string
   *
   * @param _value the EffectiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EffectiveDateFilter filter field
   */
  public void setEffectiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFilterFromFormattedString");
    try {
      this.setEffectiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the EffectiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDateFilter field
   */
  public String[] getEffectiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEffectiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDateFilter filter value from a formatted string
   *
   * @param _value the EffectiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EffectiveDateFilter filter field
   */
  public void setEffectiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
    try {
      this.setEffectiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CurrencyCode (ADJ.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (ADJ.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (ADJ.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (ADJ.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (ADJ.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (ADJ.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (ADJ.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (ADJ.currency_code)
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

  /**
   * Retrieves the display value for the enumerated CurrencyCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCodeFilter filter field
   */
  public String[] getCurrencyCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCurrencyCodeFilter(), "Currency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CurrencyCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CurrencyCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AdjReasonCode (ADJ.adj_reason_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAdjReasonCodeFetch (boolean fetch) {
    this.AdjReasonCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjReasonCodeFetch () {
    return this.AdjReasonCodeFetch;
  }
  /** Set the SortOrder for field: AdjReasonCode (ADJ.adj_reason_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjReasonCodeSortOrder (Integer value) {
    this.AdjReasonCodeSort = value;
  }
  /** Retrieve SortOrder for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjReasonCodeSortOrder () {
    return this.AdjReasonCodeSort;
  }
  /** Set the sort direction for field: AdjReasonCode (ADJ.adj_reason_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjReasonCodeSortDirection (boolean ascending) {
    this.AdjReasonCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjReasonCodeSortDirection () {
    return this.AdjReasonCodeSortAscending;
  }
  /** Set the field level filters for field: AdjReasonCode (ADJ.adj_reason_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjReasonCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.AdjReasonCode = value;
  }
  /** Retrieve filter for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAdjReasonCodeFilter () {
    return this.AdjReasonCode;
  }

  /**
   * Retrieves the AdjReasonCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AdjReasonCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjReasonCodeFilter field
   */
  public String[] getAdjReasonCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAdjReasonCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AdjReasonCodeFilter filter value from a formatted string
   *
   * @param _value the AdjReasonCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AdjReasonCodeFilter filter field
   */
  public void setAdjReasonCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFilterFromFormattedString");
    try {
      this.setAdjReasonCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjReasonCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AdjReasonCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AdjReasonCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AdjReasonCodeFilter filter field
   */
  public String[] getAdjReasonCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAdjReasonCodeFilter(), "AdjustmentReason", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AdjReasonCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AdjReasonCodeFilter filter field
   */
  public void setAdjReasonCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAdjReasonCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AdjReasonCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjReasonCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TotalAmt (ADJ.total_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalAmtFetch (boolean fetch) {
    this.TotalAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalAmt (ADJ.total_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalAmtFetch () {
    return this.TotalAmtFetch;
  }
  /** Set the SortOrder for field: TotalAmt (ADJ.total_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalAmtSortOrder (Integer value) {
    this.TotalAmtSort = value;
  }
  /** Retrieve SortOrder for field: TotalAmt (ADJ.total_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalAmtSortOrder () {
    return this.TotalAmtSort;
  }
  /** Set the sort direction for field: TotalAmt (ADJ.total_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalAmtSortDirection (boolean ascending) {
    this.TotalAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalAmt (ADJ.total_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalAmtSortDirection () {
    return this.TotalAmtSortAscending;
  }
  /** Set the field level filters for field: TotalAmt (ADJ.total_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalAmt = value;
  }
  /** Retrieve filter for field: TotalAmt (ADJ.total_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalAmtFilter () {
    return this.TotalAmt;
  }

  /**
   * Retrieves the TotalAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmtFilter field
   */
  public String[] getTotalAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAmtFilter filter value from a formatted string
   *
   * @param _value the TotalAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAmtFilter filter field
   */
  public void setTotalAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAmtFilterFromFormattedString");
    try {
      this.setTotalAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFilterFromFormattedString");
  }

  /**
   * Sets the TotalAmtFilter filter value from a formatted string
   *
   * @param _value the TotalAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAmtFilter filter field
   */
  public void setTotalAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAmtFilterFromFormattedCurrencyString");
    try {
      this.setTotalAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmtFilter field
   */

  public String[] getTotalAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: AdjTransGroup
   * @param fetch whether to fetch this field or not
   */
  public void setAdjTransGroupFetch (boolean fetch)
  {
    this.AdjTransGroupFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjTransGroup
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjTransGroupFetch ()
  {
    return this.AdjTransGroupFetch;
  }
  /** Set the SortOrder for field: AdjTransGroup
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjTransGroupSortOrder (Integer value)
  {
    this.AdjTransGroupSort = value;
  }
  /** Retrieve SortOrder for field: AdjTransGroup
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjTransGroupSortOrder ()
  {
    return this.AdjTransGroupSort;
  }
  /** Set the sort direction for field: AdjTransGroup
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjTransGroupSortDirection (boolean ascending)
  {
    this.AdjTransGroupSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjTransGroup
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjTransGroupSortDirection ()
  {
    return this.AdjTransGroupSortAscending;
  }
  /** Set the field level filters for field: AdjTransGroup
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjTransGroupFilter (IntegerFilter[] value) throws ServiceException
  {
    this.AdjTransGroup = value;
  }
  /** Retrieve filter for field: AdjTransGroup
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAdjTransGroupFilter ()
  {
    return this.AdjTransGroup;
  }
  /** Set the field level Fetch value for field: IsMax
   * @param fetch whether to fetch this field or not
   */
  public void setIsMaxFetch (boolean fetch)
  {
    this.IsMaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsMax
   * @return boolean the Fetch value for this field
   */
  public boolean getIsMaxFetch ()
  {
    return this.IsMaxFetch;
  }
  /** Set the SortOrder for field: IsMax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsMaxSortOrder (Integer value)
  {
    this.IsMaxSort = value;
  }
  /** Retrieve SortOrder for field: IsMax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsMaxSortOrder ()
  {
    return this.IsMaxSort;
  }
  /** Set the sort direction for field: IsMax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsMaxSortDirection (boolean ascending)
  {
    this.IsMaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsMax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsMaxSortDirection ()
  {
    return this.IsMaxSortAscending;
  }
  /** Set the field level filters for field: IsMax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsMaxFilter (IntegerFilter[] value) throws ServiceException
  {
    this.IsMax = value;
  }
  /** Retrieve filter for field: IsMax
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIsMaxFilter ()
  {
    return this.IsMax;
  }
  public String toString() {
    return BulkAdjustmentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BulkAdjustmentObjectHelper.toMap(this, null);
  }
}
