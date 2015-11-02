/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RewardBalanceObjectFilter.java
 * Definition File: Admin/RewardBalance.xml
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
public class RewardBalanceObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public RewardBalanceObjectKeyFilter Key = null;
  /** raw field for: REWARD_BALANCE_ID_REF.balance_type) */
  public    IntegerFilter[] BalanceType  = null;
  protected boolean BalanceTypeFetch = false;
  protected boolean BalanceTypeSortAscending = true;
  protected Integer BalanceTypeSort = null;
  /** raw field for: REWARD_BALANCE_ID_REF.ext_id) */
  public    StringFilter[] ExtId  = null;
  protected boolean ExtIdFetch = false;
  protected boolean ExtIdSortAscending = true;
  protected boolean ExtIdCaseInsensitive = false;
  protected Integer ExtIdSort = null;
  /** raw field for: REWARD_BALANCE_ID_REF.external_id_type) */
  public    IntegerFilter[] ExternalIdType  = null;
  protected boolean ExternalIdTypeFetch = false;
  protected boolean ExternalIdTypeSortAscending = true;
  protected Integer ExternalIdTypeSort = null;
  /** raw field for: REWARD_BALANCE_ID_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: REWARD_BALANCE_ID_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: REWARD_BALANCE_ID_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  /** raw field for: REWARD_BALANCE_ID_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  private String _objName = "RewardBalanceObjectFilter";
  /** default constructor */
  public RewardBalanceObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public RewardBalanceObjectFilter (RewardBalanceObjectFilter other)
  {
    if (other == null) return;
    this.Key = new RewardBalanceObjectKeyFilter (other.Key);
    this.BalanceType = other.BalanceType;
    this.BalanceTypeFetch = other.BalanceTypeFetch;
    this.BalanceTypeSort = other.BalanceTypeSort;
    this.BalanceTypeSortAscending = other.BalanceTypeSortAscending;
    this.ExtId = other.ExtId;
    this.ExtIdFetch = other.ExtIdFetch;
    this.ExtIdSort = other.ExtIdSort;
    this.ExtIdCaseInsensitive = other.ExtIdCaseInsensitive;
    this.ExtIdSortAscending = other.ExtIdSortAscending;
    this.ExternalIdType = other.ExternalIdType;
    this.ExternalIdTypeFetch = other.ExternalIdTypeFetch;
    this.ExternalIdTypeSort = other.ExternalIdTypeSort;
    this.ExternalIdTypeSortAscending = other.ExternalIdTypeSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;
    this.ShortDisplay = other.ShortDisplay;
    this.ShortDisplayFetch = other.ShortDisplayFetch;
    this.ShortDisplaySort = other.ShortDisplaySort;
    this.ShortDisplayCaseInsensitive = other.ShortDisplayCaseInsensitive;
    this.ShortDisplaySortAscending = other.ShortDisplaySortAscending;  }
  /** get the filter for this object's key
   * @return RewardBalanceObjectKeyFilter
   */
  public RewardBalanceObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (RewardBalanceObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRewardBalanceIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.RewardBalanceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRewardBalanceIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RewardBalanceIdFetch;
  }
  /** Set the SortOrder for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRewardBalanceIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.RewardBalanceIdSort = value;
  }
  /** Retrieve SortOrder for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRewardBalanceIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RewardBalanceIdSort;
  }
  /** Set the sort direction for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRewardBalanceIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.RewardBalanceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRewardBalanceIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RewardBalanceIdSortAscending;
  }
  /** Set the field level filters for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRewardBalanceIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.RewardBalanceId = value;
  }
  /** Retrieve filter for field: RewardBalanceId (REWARD_BALANCE_ID_VALUES.reward_balance_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRewardBalanceIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.RewardBalanceId;
  }
  /** Set the field level Fetch value for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RewardBalanceObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (REWARD_BALANCE_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceTypeFetch (boolean fetch) {
    this.BalanceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceTypeFetch () {
    return this.BalanceTypeFetch;
  }
  /** Set the SortOrder for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceTypeSortOrder (Integer value) {
    this.BalanceTypeSort = value;
  }
  /** Retrieve SortOrder for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceTypeSortOrder () {
    return this.BalanceTypeSort;
  }
  /** Set the sort direction for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceTypeSortDirection (boolean ascending) {
    this.BalanceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceTypeSortDirection () {
    return this.BalanceTypeSortAscending;
  }
  /** Set the field level filters for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceType = value;
  }
  /** Retrieve filter for field: BalanceType (REWARD_BALANCE_ID_REF.balance_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBalanceTypeFilter () {
    return this.BalanceType;
  }

  /**
   * Retrieves the BalanceTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTypeFilter field
   */
  public String[] getBalanceTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceTypeFilter filter value from a formatted string
   *
   * @param _value the BalanceTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceTypeFilter filter field
   */
  public void setBalanceTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceTypeFilterFromFormattedString");
    try {
      this.setBalanceTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExtIdFetch (boolean fetch) {
    this.ExtIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExtIdFetch () {
    return this.ExtIdFetch;
  }
  /** Set the SortOrder for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExtIdSortOrder (Integer value) {
    this.ExtIdSort = value;
  }
  /** Retrieve SortOrder for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExtIdSortOrder () {
    return this.ExtIdSort;
  }
  /** Set the sort direction for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExtIdSortDirection (boolean ascending) {
    this.ExtIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExtIdSortDirection () {
    return this.ExtIdSortAscending;
  }
  /** Set the case insensitive for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExtIdCaseInsensitive (boolean ascending) {
    this.ExtIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExtIdCaseInsensitive () {
    return this.ExtIdCaseInsensitive;
  }
  /** Set the field level filters for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExtIdFilter (StringFilter[] value) throws ServiceException {
    this.ExtId = value;
  }
  /** Retrieve filter for field: ExtId (REWARD_BALANCE_ID_REF.ext_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExtIdFilter () {
    return this.ExtId;
  }

  /**
   * Retrieves the ExtIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExtIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtIdFilter field
   */
  public String[] getExtIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExtIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExtIdFilter filter value from a formatted string
   *
   * @param _value the ExtIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExtIdFilter filter field
   */
  public void setExtIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExtIdFilterFromFormattedString");
    try {
      this.setExtIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdTypeFetch (boolean fetch) {
    this.ExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdTypeFetch () {
    return this.ExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdTypeSortOrder (Integer value) {
    this.ExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdTypeSortOrder () {
    return this.ExternalIdTypeSort;
  }
  /** Set the sort direction for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdTypeSortDirection (boolean ascending) {
    this.ExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdTypeSortDirection () {
    return this.ExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ExternalIdType = value;
  }
  /** Retrieve filter for field: ExternalIdType (REWARD_BALANCE_ID_REF.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExternalIdTypeFilter () {
    return this.ExternalIdType;
  }

  /**
   * Retrieves the ExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdTypeFilter field
   */
  public String[] getExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalIdTypeFilter filter field
   */
  public void setExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
    try {
      this.setExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (REWARD_BALANCE_ID_REF.is_internal)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsInternalFilter () {
    return this.IsInternal;
  }

  /**
   * Retrieves the IsInternalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsInternalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternalFilter field
   */
  public String[] getIsInternalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsInternalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsInternalFilter filter value from a formatted string
   *
   * @param _value the IsInternalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsInternalFilter filter field
   */
  public void setIsInternalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsInternalFilterFromFormattedString");
    try {
      this.setIsInternalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (REWARD_BALANCE_ID_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (REWARD_BALANCE_ID_VALUES.display_value)
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

  /** Set the field level Fetch value for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (REWARD_BALANCE_ID_VALUES.short_display)
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

  public String toString() {
    return RewardBalanceObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RewardBalanceObjectHelper.toMap(this, null);
  }
}
