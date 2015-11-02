/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: XPTObjectFilter.java
 * Definition File: Admin/ExtendedDataParamType.xml
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
public class XPTObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public XPTObjectKeyFilter Key = null;
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
  /** raw field for: PARAM_DEF.param_name) */
  public    StringFilter[] ParamName  = null;
  protected boolean ParamNameFetch = false;
  protected boolean ParamNameSortAscending = true;
  protected boolean ParamNameCaseInsensitive = false;
  protected Integer ParamNameSort = null;
  /** raw field for: PARAM_DEF.param_datatype) */
  public    IntegerFilter[] ParamDatatype  = null;
  protected boolean ParamDatatypeFetch = false;
  protected boolean ParamDatatypeSortAscending = true;
  protected Integer ParamDatatypeSort = null;
  /** raw field for: PARAM_DEF.assoc_enumeration_id) */
  public    IntegerFilter[] AssocEnumerationId  = null;
  protected boolean AssocEnumerationIdFetch = false;
  protected boolean AssocEnumerationIdSortAscending = true;
  protected Integer AssocEnumerationIdSort = null;
  /** raw field for: PARAM_DEF.is_addressable) */
  public    BooleanFilter[] IsAddressable  = null;
  protected boolean IsAddressableFetch = false;
  protected boolean IsAddressableSortAscending = true;
  protected Integer IsAddressableSort = null;
  /** raw field for: PARAM_DEF.param_external_id) */
  public    StringFilter[] ParamExternalId  = null;
  protected boolean ParamExternalIdFetch = false;
  protected boolean ParamExternalIdSortAscending = true;
  protected boolean ParamExternalIdCaseInsensitive = false;
  protected Integer ParamExternalIdSort = null;
  /** raw field for: PARAM_DEF.validation_rules) */
  public    StringFilter[] ValidationRules  = null;
  protected boolean ValidationRulesFetch = false;
  protected boolean ValidationRulesSortAscending = true;
  protected boolean ValidationRulesCaseInsensitive = false;
  protected Integer ValidationRulesSort = null;
  /** raw field for: PARAM_DEF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "XPTObjectFilter";
  /** default constructor */
  public XPTObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public XPTObjectFilter (XPTObjectFilter other)
  {
    if (other == null) return;
    this.Key = new XPTObjectKeyFilter (other.Key);
    this.BaseTable = other.BaseTable;
    this.BaseTableFetch = other.BaseTableFetch;
    this.BaseTableSort = other.BaseTableSort;
    this.BaseTableCaseInsensitive = other.BaseTableCaseInsensitive;
    this.BaseTableSortAscending = other.BaseTableSortAscending;
    this.EntityType = other.EntityType;
    this.EntityTypeFetch = other.EntityTypeFetch;
    this.EntityTypeSort = other.EntityTypeSort;
    this.EntityTypeSortAscending = other.EntityTypeSortAscending;
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
    this.ParamName = other.ParamName;
    this.ParamNameFetch = other.ParamNameFetch;
    this.ParamNameSort = other.ParamNameSort;
    this.ParamNameCaseInsensitive = other.ParamNameCaseInsensitive;
    this.ParamNameSortAscending = other.ParamNameSortAscending;
    this.ParamDatatype = other.ParamDatatype;
    this.ParamDatatypeFetch = other.ParamDatatypeFetch;
    this.ParamDatatypeSort = other.ParamDatatypeSort;
    this.ParamDatatypeSortAscending = other.ParamDatatypeSortAscending;
    this.AssocEnumerationId = other.AssocEnumerationId;
    this.AssocEnumerationIdFetch = other.AssocEnumerationIdFetch;
    this.AssocEnumerationIdSort = other.AssocEnumerationIdSort;
    this.AssocEnumerationIdSortAscending = other.AssocEnumerationIdSortAscending;
    this.IsAddressable = other.IsAddressable;
    this.IsAddressableFetch = other.IsAddressableFetch;
    this.IsAddressableSort = other.IsAddressableSort;
    this.IsAddressableSortAscending = other.IsAddressableSortAscending;
    this.ParamExternalId = other.ParamExternalId;
    this.ParamExternalIdFetch = other.ParamExternalIdFetch;
    this.ParamExternalIdSort = other.ParamExternalIdSort;
    this.ParamExternalIdCaseInsensitive = other.ParamExternalIdCaseInsensitive;
    this.ParamExternalIdSortAscending = other.ParamExternalIdSortAscending;
    this.ValidationRules = other.ValidationRules;
    this.ValidationRulesFetch = other.ValidationRulesFetch;
    this.ValidationRulesSort = other.ValidationRulesSort;
    this.ValidationRulesCaseInsensitive = other.ValidationRulesCaseInsensitive;
    this.ValidationRulesSortAscending = other.ValidationRulesSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return XPTObjectKeyFilter
   */
  public XPTObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (XPTObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ParamId (PARAM_DEF.param_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new XPTObjectKeyFilter ();
    this.Key.ParamIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamId (PARAM_DEF.param_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdFetch;
  }
  /** Set the SortOrder for field: ParamId (PARAM_DEF.param_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new XPTObjectKeyFilter ();
    this.Key.ParamIdSort = value;
  }
  /** Retrieve SortOrder for field: ParamId (PARAM_DEF.param_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamIdSort;
  }
  /** Set the sort direction for field: ParamId (PARAM_DEF.param_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new XPTObjectKeyFilter ();
    this.Key.ParamIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamId (PARAM_DEF.param_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdSortAscending;
  }
  /** Set the field level filters for field: ParamId (PARAM_DEF.param_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new XPTObjectKeyFilter ();
    this.Key.ParamId = value;
  }
  /** Retrieve filter for field: ParamId (PARAM_DEF.param_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamId;
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

  /** Set the field level Fetch value for field: ParamName (PARAM_DEF.param_name)
   * @param fetch whether to fetch this field or not
   */
  public void setParamNameFetch (boolean fetch) {
    this.ParamNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamName (PARAM_DEF.param_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamNameFetch () {
    return this.ParamNameFetch;
  }
  /** Set the SortOrder for field: ParamName (PARAM_DEF.param_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamNameSortOrder (Integer value) {
    this.ParamNameSort = value;
  }
  /** Retrieve SortOrder for field: ParamName (PARAM_DEF.param_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamNameSortOrder () {
    return this.ParamNameSort;
  }
  /** Set the sort direction for field: ParamName (PARAM_DEF.param_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamNameSortDirection (boolean ascending) {
    this.ParamNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamName (PARAM_DEF.param_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamNameSortDirection () {
    return this.ParamNameSortAscending;
  }
  /** Set the case insensitive for field: ParamName (PARAM_DEF.param_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setParamNameCaseInsensitive (boolean ascending) {
    this.ParamNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ParamName (PARAM_DEF.param_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getParamNameCaseInsensitive () {
    return this.ParamNameCaseInsensitive;
  }
  /** Set the field level filters for field: ParamName (PARAM_DEF.param_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamNameFilter (StringFilter[] value) throws ServiceException {
    this.ParamName = value;
  }
  /** Retrieve filter for field: ParamName (PARAM_DEF.param_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getParamNameFilter () {
    return this.ParamName;
  }

  /**
   * Retrieves the ParamNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamNameFilter field
   */
  public String[] getParamNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamNameFilter filter value from a formatted string
   *
   * @param _value the ParamNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamNameFilter filter field
   */
  public void setParamNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamNameFilterFromFormattedString");
    try {
      this.setParamNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParamDatatype (PARAM_DEF.param_datatype)
   * @param fetch whether to fetch this field or not
   */
  public void setParamDatatypeFetch (boolean fetch) {
    this.ParamDatatypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamDatatype (PARAM_DEF.param_datatype)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamDatatypeFetch () {
    return this.ParamDatatypeFetch;
  }
  /** Set the SortOrder for field: ParamDatatype (PARAM_DEF.param_datatype)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamDatatypeSortOrder (Integer value) {
    this.ParamDatatypeSort = value;
  }
  /** Retrieve SortOrder for field: ParamDatatype (PARAM_DEF.param_datatype)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamDatatypeSortOrder () {
    return this.ParamDatatypeSort;
  }
  /** Set the sort direction for field: ParamDatatype (PARAM_DEF.param_datatype)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamDatatypeSortDirection (boolean ascending) {
    this.ParamDatatypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamDatatype (PARAM_DEF.param_datatype)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamDatatypeSortDirection () {
    return this.ParamDatatypeSortAscending;
  }
  /** Set the field level filters for field: ParamDatatype (PARAM_DEF.param_datatype)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamDatatypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ParamDatatype = value;
  }
  /** Retrieve filter for field: ParamDatatype (PARAM_DEF.param_datatype)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamDatatypeFilter () {
    return this.ParamDatatype;
  }

  /**
   * Retrieves the ParamDatatypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamDatatypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamDatatypeFilter field
   */
  public String[] getParamDatatypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamDatatypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamDatatypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamDatatypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamDatatypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamDatatypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamDatatypeFilter filter value from a formatted string
   *
   * @param _value the ParamDatatypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamDatatypeFilter filter field
   */
  public void setParamDatatypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamDatatypeFilterFromFormattedString");
    try {
      this.setParamDatatypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamDatatypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamDatatypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamDatatypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAssocEnumerationIdFetch (boolean fetch) {
    this.AssocEnumerationIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAssocEnumerationIdFetch () {
    return this.AssocEnumerationIdFetch;
  }
  /** Set the SortOrder for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAssocEnumerationIdSortOrder (Integer value) {
    this.AssocEnumerationIdSort = value;
  }
  /** Retrieve SortOrder for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAssocEnumerationIdSortOrder () {
    return this.AssocEnumerationIdSort;
  }
  /** Set the sort direction for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAssocEnumerationIdSortDirection (boolean ascending) {
    this.AssocEnumerationIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAssocEnumerationIdSortDirection () {
    return this.AssocEnumerationIdSortAscending;
  }
  /** Set the field level filters for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAssocEnumerationIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AssocEnumerationId = value;
  }
  /** Retrieve filter for field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAssocEnumerationIdFilter () {
    return this.AssocEnumerationId;
  }

  /**
   * Retrieves the AssocEnumerationIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AssocEnumerationIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AssocEnumerationIdFilter field
   */
  public String[] getAssocEnumerationIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssocEnumerationIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAssocEnumerationIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAssocEnumerationIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AssocEnumerationIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAssocEnumerationIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AssocEnumerationIdFilter filter value from a formatted string
   *
   * @param _value the AssocEnumerationIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AssocEnumerationIdFilter filter field
   */
  public void setAssocEnumerationIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAssocEnumerationIdFilterFromFormattedString");
    try {
      this.setAssocEnumerationIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AssocEnumerationIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAssocEnumerationIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAssocEnumerationIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsAddressable (PARAM_DEF.is_addressable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsAddressableFetch (boolean fetch) {
    this.IsAddressableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsAddressable (PARAM_DEF.is_addressable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsAddressableFetch () {
    return this.IsAddressableFetch;
  }
  /** Set the SortOrder for field: IsAddressable (PARAM_DEF.is_addressable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsAddressableSortOrder (Integer value) {
    this.IsAddressableSort = value;
  }
  /** Retrieve SortOrder for field: IsAddressable (PARAM_DEF.is_addressable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsAddressableSortOrder () {
    return this.IsAddressableSort;
  }
  /** Set the sort direction for field: IsAddressable (PARAM_DEF.is_addressable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsAddressableSortDirection (boolean ascending) {
    this.IsAddressableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsAddressable (PARAM_DEF.is_addressable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsAddressableSortDirection () {
    return this.IsAddressableSortAscending;
  }
  /** Set the field level filters for field: IsAddressable (PARAM_DEF.is_addressable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsAddressableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsAddressable = value;
  }
  /** Retrieve filter for field: IsAddressable (PARAM_DEF.is_addressable)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsAddressableFilter () {
    return this.IsAddressable;
  }

  /**
   * Retrieves the IsAddressableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsAddressableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsAddressableFilter field
   */
  public String[] getIsAddressableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsAddressableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsAddressableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsAddressableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsAddressableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsAddressableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsAddressableFilter filter value from a formatted string
   *
   * @param _value the IsAddressableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsAddressableFilter filter field
   */
  public void setIsAddressableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsAddressableFilterFromFormattedString");
    try {
      this.setIsAddressableFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsAddressableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsAddressableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsAddressableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamExternalIdFetch (boolean fetch) {
    this.ParamExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamExternalIdFetch () {
    return this.ParamExternalIdFetch;
  }
  /** Set the SortOrder for field: ParamExternalId (PARAM_DEF.param_external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamExternalIdSortOrder (Integer value) {
    this.ParamExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamExternalIdSortOrder () {
    return this.ParamExternalIdSort;
  }
  /** Set the sort direction for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamExternalIdSortDirection (boolean ascending) {
    this.ParamExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamExternalIdSortDirection () {
    return this.ParamExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setParamExternalIdCaseInsensitive (boolean ascending) {
    this.ParamExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getParamExternalIdCaseInsensitive () {
    return this.ParamExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ParamExternalId (PARAM_DEF.param_external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ParamExternalId = value;
  }
  /** Retrieve filter for field: ParamExternalId (PARAM_DEF.param_external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getParamExternalIdFilter () {
    return this.ParamExternalId;
  }

  /**
   * Retrieves the ParamExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamExternalIdFilter field
   */
  public String[] getParamExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamExternalIdFilter filter value from a formatted string
   *
   * @param _value the ParamExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamExternalIdFilter filter field
   */
  public void setParamExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamExternalIdFilterFromFormattedString");
    try {
      this.setParamExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ValidationRules (PARAM_DEF.validation_rules)
   * @param fetch whether to fetch this field or not
   */
  public void setValidationRulesFetch (boolean fetch) {
    this.ValidationRulesFetch = fetch;
  }
  /** Retrieve Fetch value for field: ValidationRules (PARAM_DEF.validation_rules)
   * @return boolean the Fetch value for this field
   */
  public boolean getValidationRulesFetch () {
    return this.ValidationRulesFetch;
  }
  /** Set the SortOrder for field: ValidationRules (PARAM_DEF.validation_rules)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setValidationRulesSortOrder (Integer value) {
    this.ValidationRulesSort = value;
  }
  /** Retrieve SortOrder for field: ValidationRules (PARAM_DEF.validation_rules)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getValidationRulesSortOrder () {
    return this.ValidationRulesSort;
  }
  /** Set the sort direction for field: ValidationRules (PARAM_DEF.validation_rules)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setValidationRulesSortDirection (boolean ascending) {
    this.ValidationRulesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ValidationRules (PARAM_DEF.validation_rules)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getValidationRulesSortDirection () {
    return this.ValidationRulesSortAscending;
  }
  /** Set the case insensitive for field: ValidationRules (PARAM_DEF.validation_rules)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setValidationRulesCaseInsensitive (boolean ascending) {
    this.ValidationRulesCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ValidationRules (PARAM_DEF.validation_rules)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getValidationRulesCaseInsensitive () {
    return this.ValidationRulesCaseInsensitive;
  }
  /** Set the field level filters for field: ValidationRules (PARAM_DEF.validation_rules)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setValidationRulesFilter (StringFilter[] value) throws ServiceException {
    this.ValidationRules = value;
  }
  /** Retrieve filter for field: ValidationRules (PARAM_DEF.validation_rules)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getValidationRulesFilter () {
    return this.ValidationRules;
  }

  /**
   * Retrieves the ValidationRulesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ValidationRulesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ValidationRulesFilter field
   */
  public String[] getValidationRulesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValidationRulesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getValidationRulesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getValidationRulesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ValidationRulesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getValidationRulesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ValidationRulesFilter filter value from a formatted string
   *
   * @param _value the ValidationRulesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ValidationRulesFilter filter field
   */
  public void setValidationRulesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setValidationRulesFilterFromFormattedString");
    try {
      this.setValidationRulesFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ValidationRulesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setValidationRulesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setValidationRulesFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (PARAM_DEF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (PARAM_DEF.config_tag_id)
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
    return XPTObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return XPTObjectHelper.toMap(this, null);
  }
}
