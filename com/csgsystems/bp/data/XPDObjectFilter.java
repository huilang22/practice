/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: XPDObjectFilter.java
 * Definition File: Admin/ExtendedDataParam.xml
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
public class XPDObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public XPDObjectKeyFilter Key = null;
  /** raw field for: PARAM_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: PARAM_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  /** raw field for: PARAM_VALUES.validation_rules_desc) */
  public    StringFilter[] ValidationRulesDesc  = null;
  protected boolean ValidationRulesDescFetch = false;
  protected boolean ValidationRulesDescSortAscending = true;
  protected boolean ValidationRulesDescCaseInsensitive = false;
  protected Integer ValidationRulesDescSort = null;
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
  private String _objName = "XPDObjectFilter";
  /** default constructor */
  public XPDObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public XPDObjectFilter (XPDObjectFilter other)
  {
    if (other == null) return;
    this.Key = new XPDObjectKeyFilter (other.Key);
    this.ShortDisplay = other.ShortDisplay;
    this.ShortDisplayFetch = other.ShortDisplayFetch;
    this.ShortDisplaySort = other.ShortDisplaySort;
    this.ShortDisplayCaseInsensitive = other.ShortDisplayCaseInsensitive;
    this.ShortDisplaySortAscending = other.ShortDisplaySortAscending;
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;
    this.ValidationRulesDesc = other.ValidationRulesDesc;
    this.ValidationRulesDescFetch = other.ValidationRulesDescFetch;
    this.ValidationRulesDescSort = other.ValidationRulesDescSort;
    this.ValidationRulesDescCaseInsensitive = other.ValidationRulesDescCaseInsensitive;
    this.ValidationRulesDescSortAscending = other.ValidationRulesDescSortAscending;
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
   * @return XPDObjectKeyFilter
   */
  public XPDObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (XPDObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ParamId (PARAM_DEF.param_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
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
  /** Set the field level Fetch value for field: LanguageCode (PARAM_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (PARAM_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (PARAM_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (PARAM_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (PARAM_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (PARAM_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (PARAM_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new XPDObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (PARAM_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: ShortDisplay (PARAM_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (PARAM_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (PARAM_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (PARAM_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (PARAM_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (PARAM_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (PARAM_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (PARAM_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (PARAM_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (PARAM_VALUES.short_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getShortDisplayFilter () {
    return this.ShortDisplay;
  }

  /**
   * Retrieves the ShortDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ShortDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDisplayFilter field
   */
  public String[] getShortDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getShortDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ShortDisplayFilter filter value from a formatted string
   *
   * @param _value the ShortDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ShortDisplayFilter filter field
   */
  public void setShortDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setShortDisplayFilterFromFormattedString");
    try {
      this.setShortDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisplayValue (PARAM_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (PARAM_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (PARAM_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (PARAM_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (PARAM_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (PARAM_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (PARAM_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (PARAM_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (PARAM_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (PARAM_VALUES.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayValueFilter () {
    return this.DisplayValue;
  }

  /**
   * Retrieves the DisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValueFilter field
   */
  public String[] getDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayValueFilter filter value from a formatted string
   *
   * @param _value the DisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayValueFilter filter field
   */
  public void setDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayValueFilterFromFormattedString");
    try {
      this.setDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @param fetch whether to fetch this field or not
   */
  public void setValidationRulesDescFetch (boolean fetch) {
    this.ValidationRulesDescFetch = fetch;
  }
  /** Retrieve Fetch value for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @return boolean the Fetch value for this field
   */
  public boolean getValidationRulesDescFetch () {
    return this.ValidationRulesDescFetch;
  }
  /** Set the SortOrder for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setValidationRulesDescSortOrder (Integer value) {
    this.ValidationRulesDescSort = value;
  }
  /** Retrieve SortOrder for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getValidationRulesDescSortOrder () {
    return this.ValidationRulesDescSort;
  }
  /** Set the sort direction for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setValidationRulesDescSortDirection (boolean ascending) {
    this.ValidationRulesDescSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getValidationRulesDescSortDirection () {
    return this.ValidationRulesDescSortAscending;
  }
  /** Set the case insensitive for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setValidationRulesDescCaseInsensitive (boolean ascending) {
    this.ValidationRulesDescCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getValidationRulesDescCaseInsensitive () {
    return this.ValidationRulesDescCaseInsensitive;
  }
  /** Set the field level filters for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setValidationRulesDescFilter (StringFilter[] value) throws ServiceException {
    this.ValidationRulesDesc = value;
  }
  /** Retrieve filter for field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getValidationRulesDescFilter () {
    return this.ValidationRulesDesc;
  }

  /**
   * Retrieves the ValidationRulesDescFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ValidationRulesDescFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ValidationRulesDescFilter field
   */
  public String[] getValidationRulesDescFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValidationRulesDescFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getValidationRulesDescFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getValidationRulesDescFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ValidationRulesDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getValidationRulesDescFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ValidationRulesDescFilter filter value from a formatted string
   *
   * @param _value the ValidationRulesDescFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ValidationRulesDescFilter filter field
   */
  public void setValidationRulesDescFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setValidationRulesDescFilterFromFormattedString");
    try {
      this.setValidationRulesDescFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ValidationRulesDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setValidationRulesDescFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setValidationRulesDescFilterFromFormattedString");
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
    return XPDObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return XPDObjectHelper.toMap(this, null);
  }
}
