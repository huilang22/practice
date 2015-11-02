/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupAmountObjectFilter.java
 * Definition File: Admin/CsrGroupAmount.xml
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
public class CsrGroupAmountObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CsrGroupAmountObjectKeyFilter Key = null;
  /** raw field for: GROUP_AMOUNT.max_amount) */
  public    BigIntegerFilter[] MaxAmount  = null;
  protected boolean MaxAmountFetch = false;
  protected boolean MaxAmountSortAscending = true;
  protected Integer MaxAmountSort = null;
  /** raw field for: GROUP_AMOUNT.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "CsrGroupAmountObjectFilter";
  /** default constructor */
  public CsrGroupAmountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CsrGroupAmountObjectFilter (CsrGroupAmountObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CsrGroupAmountObjectKeyFilter (other.Key);
    this.MaxAmount = other.MaxAmount;
    this.MaxAmountFetch = other.MaxAmountFetch;
    this.MaxAmountSort = other.MaxAmountSort;
    this.MaxAmountSortAscending = other.MaxAmountSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return CsrGroupAmountObjectKeyFilter
   */
  public CsrGroupAmountObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CsrGroupAmountObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: GroupName (GROUP_AMOUNT.group_name)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupNameFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.GroupNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupName (GROUP_AMOUNT.group_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupNameFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupNameFetch;
  }
  /** Set the SortOrder for field: GroupName (GROUP_AMOUNT.group_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupNameSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.GroupNameSort = value;
  }
  /** Retrieve SortOrder for field: GroupName (GROUP_AMOUNT.group_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupNameSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupNameSort;
  }
  /** Set the sort direction for field: GroupName (GROUP_AMOUNT.group_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupNameSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.GroupNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupName (GROUP_AMOUNT.group_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupNameSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupNameSortAscending;
  }
  /** Set the case insensitive for field: GroupName (GROUP_AMOUNT.group_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGroupNameCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.GroupNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: GroupName (GROUP_AMOUNT.group_name)
   * @return boolean whether the field is case insensitive
   */
  public boolean getGroupNameCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.GroupNameCaseInsensitive;
  }
  /** Set the field level filters for field: GroupName (GROUP_AMOUNT.group_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupNameFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.GroupName = value;
  }
  /** Retrieve filter for field: GroupName (GROUP_AMOUNT.group_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGroupNameFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupName;
  }
  /** Set the field level Fetch value for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Set the field level Fetch value for field: ModuleName (GROUP_AMOUNT.module_name)
   * @param fetch whether to fetch this field or not
   */
  public void setModuleNameFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.ModuleNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ModuleName (GROUP_AMOUNT.module_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getModuleNameFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ModuleNameFetch;
  }
  /** Set the SortOrder for field: ModuleName (GROUP_AMOUNT.module_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModuleNameSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.ModuleNameSort = value;
  }
  /** Retrieve SortOrder for field: ModuleName (GROUP_AMOUNT.module_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModuleNameSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ModuleNameSort;
  }
  /** Set the sort direction for field: ModuleName (GROUP_AMOUNT.module_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModuleNameSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.ModuleNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModuleName (GROUP_AMOUNT.module_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModuleNameSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ModuleNameSortAscending;
  }
  /** Set the field level filters for field: ModuleName (GROUP_AMOUNT.module_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModuleNameFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyFilter ();
    this.Key.ModuleName = value;
  }
  /** Retrieve filter for field: ModuleName (GROUP_AMOUNT.module_name)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getModuleNameFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ModuleName;
  }
  /** Set the field level Fetch value for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setMaxAmountFetch (boolean fetch) {
    this.MaxAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getMaxAmountFetch () {
    return this.MaxAmountFetch;
  }
  /** Set the SortOrder for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMaxAmountSortOrder (Integer value) {
    this.MaxAmountSort = value;
  }
  /** Retrieve SortOrder for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMaxAmountSortOrder () {
    return this.MaxAmountSort;
  }
  /** Set the sort direction for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMaxAmountSortDirection (boolean ascending) {
    this.MaxAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMaxAmountSortDirection () {
    return this.MaxAmountSortAscending;
  }
  /** Set the field level filters for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMaxAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MaxAmount = value;
  }
  /** Retrieve filter for field: MaxAmount (GROUP_AMOUNT.max_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMaxAmountFilter () {
    return this.MaxAmount;
  }

  /**
   * Retrieves the MaxAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmountFilter field
   */
  public String[] getMaxAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MaxAmountFilter filter value from a formatted string
   *
   * @param _value the MaxAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxAmountFilter filter field
   */
  public void setMaxAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAmountFilterFromFormattedString");
    try {
      this.setMaxAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmountFilterFromFormattedString");
  }

  /**
   * Sets the MaxAmountFilter filter value from a formatted string
   *
   * @param _value the MaxAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxAmountFilter filter field
   */
  public void setMaxAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAmountFilterFromFormattedCurrencyString");
    try {
      this.setMaxAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the MaxAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmountFilter field
   */

  public String[] getMaxAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
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
    return CsrGroupAmountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CsrGroupAmountObjectHelper.toMap(this, null);
  }
}
