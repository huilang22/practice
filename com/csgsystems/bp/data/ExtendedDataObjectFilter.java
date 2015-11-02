/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataObjectFilter.java
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
public class ExtendedDataObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ExtendedDataObjectKeyFilter Key = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.grouping_id) */
  public    StringFilter[] GroupingId  = null;
  protected boolean GroupingIdFetch = false;
  protected boolean GroupingIdSortAscending = true;
  protected boolean GroupingIdCaseInsensitive = false;
  protected Integer GroupingIdSort = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.default_value) */
  public    StringFilter[] DefaultValue  = null;
  protected boolean DefaultValueFetch = false;
  protected boolean DefaultValueSortAscending = true;
  protected boolean DefaultValueCaseInsensitive = false;
  protected Integer DefaultValueSort = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.is_required) */
  public    BooleanFilter[] IsRequired  = null;
  protected boolean IsRequiredFetch = false;
  protected boolean IsRequiredSortAscending = true;
  protected Integer IsRequiredSort = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.attribute_display_order) */
  public    IntegerFilter[] AttributeDisplayOrder  = null;
  protected boolean AttributeDisplayOrderFetch = false;
  protected boolean AttributeDisplayOrderSortAscending = true;
  protected Integer AttributeDisplayOrderSort = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.is_searchable) */
  public    BooleanFilter[] IsSearchable  = null;
  protected boolean IsSearchableFetch = false;
  protected boolean IsSearchableSortAscending = true;
  protected Integer IsSearchableSort = null;
  /** raw field for: EXT_PARAM_TYPE_ASSOC.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "ExtendedDataObjectFilter";
  /** default constructor */
  public ExtendedDataObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ExtendedDataObjectFilter (ExtendedDataObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ExtendedDataObjectKeyFilter (other.Key);
    this.GroupingId = other.GroupingId;
    this.GroupingIdFetch = other.GroupingIdFetch;
    this.GroupingIdSort = other.GroupingIdSort;
    this.GroupingIdCaseInsensitive = other.GroupingIdCaseInsensitive;
    this.GroupingIdSortAscending = other.GroupingIdSortAscending;
    this.DefaultValue = other.DefaultValue;
    this.DefaultValueFetch = other.DefaultValueFetch;
    this.DefaultValueSort = other.DefaultValueSort;
    this.DefaultValueCaseInsensitive = other.DefaultValueCaseInsensitive;
    this.DefaultValueSortAscending = other.DefaultValueSortAscending;
    this.IsRequired = other.IsRequired;
    this.IsRequiredFetch = other.IsRequiredFetch;
    this.IsRequiredSort = other.IsRequiredSort;
    this.IsRequiredSortAscending = other.IsRequiredSortAscending;
    this.AttributeDisplayOrder = other.AttributeDisplayOrder;
    this.AttributeDisplayOrderFetch = other.AttributeDisplayOrderFetch;
    this.AttributeDisplayOrderSort = other.AttributeDisplayOrderSort;
    this.AttributeDisplayOrderSortAscending = other.AttributeDisplayOrderSortAscending;
    this.IsSearchable = other.IsSearchable;
    this.IsSearchableFetch = other.IsSearchableFetch;
    this.IsSearchableSort = other.IsSearchableSort;
    this.IsSearchableSortAscending = other.IsSearchableSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return ExtendedDataObjectKeyFilter
   */
  public ExtendedDataObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ExtendedDataObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param fetch whether to fetch this field or not
   */
  public void setBaseTableFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.BaseTableFetch = fetch;
  }
  /** Retrieve Fetch value for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean the Fetch value for this field
   */
  public boolean getBaseTableFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BaseTableFetch;
  }
  /** Set the SortOrder for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBaseTableSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.BaseTableSort = value;
  }
  /** Retrieve SortOrder for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBaseTableSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BaseTableSort;
  }
  /** Set the sort direction for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBaseTableSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.BaseTableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBaseTableSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BaseTableSortAscending;
  }
  /** Set the case insensitive for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBaseTableCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.BaseTableCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return boolean whether the field is case insensitive
   */
  public boolean getBaseTableCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.BaseTableCaseInsensitive;
  }
  /** Set the field level filters for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBaseTableFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.BaseTable = value;
  }
  /** Retrieve filter for field: BaseTable (EXT_PARAM_TYPE_ASSOC.base_table)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBaseTableFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BaseTable;
  }
  /** Set the field level Fetch value for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @param fetch whether to fetch this field or not
   */
  public void setEntityTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.EntityTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getEntityTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.EntityTypeFetch;
  }
  /** Set the SortOrder for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEntityTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.EntityTypeSort = value;
  }
  /** Retrieve SortOrder for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEntityTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.EntityTypeSort;
  }
  /** Set the sort direction for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEntityTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.EntityTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEntityTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.EntityTypeSortAscending;
  }
  /** Set the field level filters for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEntityTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.EntityType = value;
  }
  /** Retrieve filter for field: EntityType (EXT_PARAM_TYPE_ASSOC.entity_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEntityTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.EntityType;
  }
  /** Set the field level Fetch value for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.ParamIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdFetch;
  }
  /** Set the SortOrder for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.ParamIdSort = value;
  }
  /** Retrieve SortOrder for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamIdSort;
  }
  /** Set the sort direction for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.ParamIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdSortAscending;
  }
  /** Set the field level filters for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ExtendedDataObjectKeyFilter ();
    this.Key.ParamId = value;
  }
  /** Retrieve filter for field: ParamId (EXT_PARAM_TYPE_ASSOC.param_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamId;
  }
  /** Set the field level Fetch value for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupingIdFetch (boolean fetch) {
    this.GroupingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupingIdFetch () {
    return this.GroupingIdFetch;
  }
  /** Set the SortOrder for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupingIdSortOrder (Integer value) {
    this.GroupingIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupingIdSortOrder () {
    return this.GroupingIdSort;
  }
  /** Set the sort direction for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupingIdSortDirection (boolean ascending) {
    this.GroupingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupingIdSortDirection () {
    return this.GroupingIdSortAscending;
  }
  /** Set the case insensitive for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGroupingIdCaseInsensitive (boolean ascending) {
    this.GroupingIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGroupingIdCaseInsensitive () {
    return this.GroupingIdCaseInsensitive;
  }
  /** Set the field level filters for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupingIdFilter (StringFilter[] value) throws ServiceException {
    this.GroupingId = value;
  }
  /** Retrieve filter for field: GroupingId (EXT_PARAM_TYPE_ASSOC.grouping_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGroupingIdFilter () {
    return this.GroupingId;
  }

  /**
   * Retrieves the GroupingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupingIdFilter field
   */
  public String[] getGroupingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupingIdFilter filter value from a formatted string
   *
   * @param _value the GroupingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupingIdFilter filter field
   */
  public void setGroupingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupingIdFilterFromFormattedString");
    try {
      this.setGroupingIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDefaultValueFetch (boolean fetch) {
    this.DefaultValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDefaultValueFetch () {
    return this.DefaultValueFetch;
  }
  /** Set the SortOrder for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDefaultValueSortOrder (Integer value) {
    this.DefaultValueSort = value;
  }
  /** Retrieve SortOrder for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDefaultValueSortOrder () {
    return this.DefaultValueSort;
  }
  /** Set the sort direction for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDefaultValueSortDirection (boolean ascending) {
    this.DefaultValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDefaultValueSortDirection () {
    return this.DefaultValueSortAscending;
  }
  /** Set the case insensitive for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDefaultValueCaseInsensitive (boolean ascending) {
    this.DefaultValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDefaultValueCaseInsensitive () {
    return this.DefaultValueCaseInsensitive;
  }
  /** Set the field level filters for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDefaultValueFilter (StringFilter[] value) throws ServiceException {
    this.DefaultValue = value;
  }
  /** Retrieve filter for field: DefaultValue (EXT_PARAM_TYPE_ASSOC.default_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDefaultValueFilter () {
    return this.DefaultValue;
  }

  /**
   * Retrieves the DefaultValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DefaultValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DefaultValueFilter field
   */
  public String[] getDefaultValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDefaultValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDefaultValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DefaultValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDefaultValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DefaultValueFilter filter value from a formatted string
   *
   * @param _value the DefaultValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DefaultValueFilter filter field
   */
  public void setDefaultValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDefaultValueFilterFromFormattedString");
    try {
      this.setDefaultValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DefaultValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDefaultValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDefaultValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @param fetch whether to fetch this field or not
   */
  public void setIsRequiredFetch (boolean fetch) {
    this.IsRequiredFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsRequiredFetch () {
    return this.IsRequiredFetch;
  }
  /** Set the SortOrder for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsRequiredSortOrder (Integer value) {
    this.IsRequiredSort = value;
  }
  /** Retrieve SortOrder for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsRequiredSortOrder () {
    return this.IsRequiredSort;
  }
  /** Set the sort direction for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsRequiredSortDirection (boolean ascending) {
    this.IsRequiredSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsRequiredSortDirection () {
    return this.IsRequiredSortAscending;
  }
  /** Set the field level filters for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsRequiredFilter (BooleanFilter[] value) throws ServiceException {
    this.IsRequired = value;
  }
  /** Retrieve filter for field: IsRequired (EXT_PARAM_TYPE_ASSOC.is_required)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsRequiredFilter () {
    return this.IsRequired;
  }

  /**
   * Retrieves the IsRequiredFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsRequiredFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsRequiredFilter field
   */
  public String[] getIsRequiredFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRequiredFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsRequiredFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsRequiredFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsRequiredFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsRequiredFilter filter value from a formatted string
   *
   * @param _value the IsRequiredFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsRequiredFilter filter field
   */
  public void setIsRequiredFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsRequiredFilterFromFormattedString");
    try {
      this.setIsRequiredFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsRequiredFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsRequiredFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @param fetch whether to fetch this field or not
   */
  public void setAttributeDisplayOrderFetch (boolean fetch) {
    this.AttributeDisplayOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getAttributeDisplayOrderFetch () {
    return this.AttributeDisplayOrderFetch;
  }
  /** Set the SortOrder for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAttributeDisplayOrderSortOrder (Integer value) {
    this.AttributeDisplayOrderSort = value;
  }
  /** Retrieve SortOrder for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAttributeDisplayOrderSortOrder () {
    return this.AttributeDisplayOrderSort;
  }
  /** Set the sort direction for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAttributeDisplayOrderSortDirection (boolean ascending) {
    this.AttributeDisplayOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAttributeDisplayOrderSortDirection () {
    return this.AttributeDisplayOrderSortAscending;
  }
  /** Set the field level filters for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAttributeDisplayOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.AttributeDisplayOrder = value;
  }
  /** Retrieve filter for field: AttributeDisplayOrder (EXT_PARAM_TYPE_ASSOC.attribute_display_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAttributeDisplayOrderFilter () {
    return this.AttributeDisplayOrder;
  }

  /**
   * Retrieves the AttributeDisplayOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AttributeDisplayOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AttributeDisplayOrderFilter field
   */
  public String[] getAttributeDisplayOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAttributeDisplayOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAttributeDisplayOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAttributeDisplayOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AttributeDisplayOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAttributeDisplayOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AttributeDisplayOrderFilter filter value from a formatted string
   *
   * @param _value the AttributeDisplayOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AttributeDisplayOrderFilter filter field
   */
  public void setAttributeDisplayOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAttributeDisplayOrderFilterFromFormattedString");
    try {
      this.setAttributeDisplayOrderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AttributeDisplayOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAttributeDisplayOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAttributeDisplayOrderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsSearchableFetch (boolean fetch) {
    this.IsSearchableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsSearchableFetch () {
    return this.IsSearchableFetch;
  }
  /** Set the SortOrder for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsSearchableSortOrder (Integer value) {
    this.IsSearchableSort = value;
  }
  /** Retrieve SortOrder for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsSearchableSortOrder () {
    return this.IsSearchableSort;
  }
  /** Set the sort direction for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsSearchableSortDirection (boolean ascending) {
    this.IsSearchableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsSearchableSortDirection () {
    return this.IsSearchableSortAscending;
  }
  /** Set the field level filters for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsSearchableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsSearchable = value;
  }
  /** Retrieve filter for field: IsSearchable (EXT_PARAM_TYPE_ASSOC.is_searchable)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsSearchableFilter () {
    return this.IsSearchable;
  }

  /**
   * Retrieves the IsSearchableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsSearchableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsSearchableFilter field
   */
  public String[] getIsSearchableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSearchableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsSearchableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsSearchableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsSearchableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsSearchableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsSearchableFilter filter value from a formatted string
   *
   * @param _value the IsSearchableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsSearchableFilter filter field
   */
  public void setIsSearchableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsSearchableFilterFromFormattedString");
    try {
      this.setIsSearchableFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsSearchableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsSearchableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsSearchableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (EXT_PARAM_TYPE_ASSOC.config_tag_id)
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
    return ExtendedDataObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ExtendedDataObjectHelper.toMap(this, null);
  }
}
