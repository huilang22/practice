/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataObjectKeyFilter.java
 * Definition File: Admin/ExtendedDataAssociation.xml
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

/** Key Filter for ExtendedDataObject object. */
public class ExtendedDataObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: EXT_PARAM_TYPE_ASSOC.base_table) */
  public    StringFilter[] BaseTable  = null;
  protected boolean BaseTableFetch = false;
  protected boolean BaseTableSortAscending = true;
  protected boolean BaseTableCaseInsensitive = false;
  protected Integer BaseTableSort = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.entity_type) */
  public    IntegerFilter[] EntityType  = null;
  protected boolean EntityTypeFetch = false;
  protected boolean EntityTypeSortAscending = true;
  protected Integer EntityTypeSort = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.param_id) */
  public    IntegerFilter[] ParamId  = null;
  protected boolean ParamIdFetch = false;
  protected boolean ParamIdSortAscending = true;
  protected Integer ParamIdSort = null;
  private String _objName = "ExtendedDataObjectKeyFilter";
  /** default constructor */
  public ExtendedDataObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ExtendedDataObjectKeyFilter (ExtendedDataObjectKeyFilter other)
  {
    if (other == null) return;
    this.BaseTable = other.BaseTable;
    this.BaseTableFetch = other.BaseTableFetch;
    this.BaseTableSort = other.BaseTableSort;
    this.BaseTableCaseInsensitive = other.BaseTableCaseInsensitive;
    this.BaseTableSortAscending = other.BaseTableSortAscending;
    this.EntityType = other.EntityType;
    this.EntityTypeFetch = other.EntityTypeFetch;
    this.EntityTypeSort = other.EntityTypeSort;
    this.EntityTypeSortAscending = other.EntityTypeSortAscending;
    this.ParamId = other.ParamId;
    this.ParamIdFetch = other.ParamIdFetch;
    this.ParamIdSort = other.ParamIdSort;
    this.ParamIdSortAscending = other.ParamIdSortAscending;
  }
  /** Set the field level Fetch value for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param fetch whether to fetch this field or not
   */
  public void setBaseTableFetch (boolean fetch) {
    this.BaseTableFetch = fetch;
  }
  /** Retrieve Fetch value for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean the Fetch value for this field
   */
  public boolean getBaseTableFetch () {
    return this.BaseTableFetch;
  }
  /** Set the SortOrder for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBaseTableSortOrder (Integer value) {
    this.BaseTableSort = value;
  }
  /** Retrieve SortOrder for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBaseTableSortOrder () {
    return this.BaseTableSort;
  }
  /** Set the sort direction for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBaseTableSortDirection (boolean ascending) {
    this.BaseTableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBaseTableSortDirection () {
    return this.BaseTableSortAscending;
  }
  /** Set the case insensitive for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBaseTableCaseInsensitive (boolean ascending) {
    this.BaseTableCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBaseTableCaseInsensitive () {
    return this.BaseTableCaseInsensitive;
  }
  /** Set the field level filters for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBaseTableFilter (StringFilter[] value) throws ServiceException {
    this.BaseTable = value;
  }
  /** Retrieve filter for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBaseTableFilter () {
    return this.BaseTable;
  }

  /**
   * Retrieves the BaseTableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BaseTableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BaseTableFilter field
   */
  public String[] getBaseTableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseTableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBaseTableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBaseTableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseTableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBaseTableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BaseTableFilter filter value from a formatted string
   *
   * @param _value the BaseTableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BaseTableFilter filter field
   */
  public void setBaseTableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBaseTableFilterFromFormattedString");
    try {
      this.setBaseTableFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseTableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBaseTableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBaseTableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @param fetch whether to fetch this field or not
   */
  public void setEntityTypeFetch (boolean fetch) {
    this.EntityTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getEntityTypeFetch () {
    return this.EntityTypeFetch;
  }
  /** Set the SortOrder for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEntityTypeSortOrder (Integer value) {
    this.EntityTypeSort = value;
  }
  /** Retrieve SortOrder for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEntityTypeSortOrder () {
    return this.EntityTypeSort;
  }
  /** Set the sort direction for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEntityTypeSortDirection (boolean ascending) {
    this.EntityTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEntityTypeSortDirection () {
    return this.EntityTypeSortAscending;
  }
  /** Set the field level filters for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEntityTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.EntityType = value;
  }
  /** Retrieve filter for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEntityTypeFilter () {
    return this.EntityType;
  }

  /**
   * Retrieves the EntityTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntityTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityTypeFilter field
   */
  public String[] getEntityTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntityTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EntityTypeFilter filter value from a formatted string
   *
   * @param _value the EntityTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntityTypeFilter filter field
   */
  public void setEntityTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntityTypeFilterFromFormattedString");
    try {
      this.setEntityTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamIdFetch (boolean fetch) {
    this.ParamIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamIdFetch () {
    return this.ParamIdFetch;
  }
  /** Set the SortOrder for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamIdSortOrder (Integer value) {
    this.ParamIdSort = value;
  }
  /** Retrieve SortOrder for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamIdSortOrder () {
    return this.ParamIdSort;
  }
  /** Set the sort direction for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamIdSortDirection (boolean ascending) {
    this.ParamIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamIdSortDirection () {
    return this.ParamIdSortAscending;
  }
  /** Set the field level filters for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParamId = value;
  }
  /** Retrieve filter for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamIdFilter () {
    return this.ParamId;
  }

  /**
   * Retrieves the ParamIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamIdFilter field
   */
  public String[] getParamIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamIdFilter filter value from a formatted string
   *
   * @param _value the ParamIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamIdFilter filter field
   */
  public void setParamIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamIdFilterFromFormattedString");
    try {
      this.setParamIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamIdFilterFromFormattedString");
  }

  public String toString() {
    return ExtendedDataObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ExtendedDataObjectKeyHelper.toMap(this, null);
  }
}
