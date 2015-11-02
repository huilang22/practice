/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointTransTypeObjectFilter.java
 * Definition File: Admin/BonusPointTransType.xml
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
public class BonusPointTransTypeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public BonusPointTransTypeObjectKeyFilter Key = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category) */
  public    IntegerFilter[] BonusPointTransCategory  = null;
  protected boolean BonusPointTransCategoryFetch = false;
  protected boolean BonusPointTransCategorySortAscending = true;
  protected Integer BonusPointTransCategorySort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.trans_sign) */
  public    IntegerFilter[] TransSign  = null;
  protected boolean TransSignFetch = false;
  protected boolean TransSignSortAscending = true;
  protected Integer TransSignSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill) */
  public    BooleanFilter[] IsDisplayedOnbill  = null;
  protected boolean IsDisplayedOnbillFetch = false;
  protected boolean IsDisplayedOnbillSortAscending = true;
  protected Integer IsDisplayedOnbillSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui) */
  public    BooleanFilter[] IsViewableOnGui  = null;
  protected boolean IsViewableOnGuiFetch = false;
  protected boolean IsViewableOnGuiSortAscending = true;
  protected Integer IsViewableOnGuiSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.is_external) */
  public    BooleanFilter[] IsExternal  = null;
  protected boolean IsExternalFetch = false;
  protected boolean IsExternalSortAscending = true;
  protected Integer IsExternalSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.is_system_generated) */
  public    BooleanFilter[] IsSystemGenerated  = null;
  protected boolean IsSystemGeneratedFetch = false;
  protected boolean IsSystemGeneratedSortAscending = true;
  protected Integer IsSystemGeneratedSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: BONUS_POINT_TRANS_TYPE_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "BonusPointTransTypeObjectFilter";
  /** default constructor */
  public BonusPointTransTypeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BonusPointTransTypeObjectFilter (BonusPointTransTypeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new BonusPointTransTypeObjectKeyFilter (other.Key);
    this.BonusPointTransCategory = other.BonusPointTransCategory;
    this.BonusPointTransCategoryFetch = other.BonusPointTransCategoryFetch;
    this.BonusPointTransCategorySort = other.BonusPointTransCategorySort;
    this.BonusPointTransCategorySortAscending = other.BonusPointTransCategorySortAscending;
    this.TransSign = other.TransSign;
    this.TransSignFetch = other.TransSignFetch;
    this.TransSignSort = other.TransSignSort;
    this.TransSignSortAscending = other.TransSignSortAscending;
    this.IsDisplayedOnbill = other.IsDisplayedOnbill;
    this.IsDisplayedOnbillFetch = other.IsDisplayedOnbillFetch;
    this.IsDisplayedOnbillSort = other.IsDisplayedOnbillSort;
    this.IsDisplayedOnbillSortAscending = other.IsDisplayedOnbillSortAscending;
    this.IsViewableOnGui = other.IsViewableOnGui;
    this.IsViewableOnGuiFetch = other.IsViewableOnGuiFetch;
    this.IsViewableOnGuiSort = other.IsViewableOnGuiSort;
    this.IsViewableOnGuiSortAscending = other.IsViewableOnGuiSortAscending;
    this.IsExternal = other.IsExternal;
    this.IsExternalFetch = other.IsExternalFetch;
    this.IsExternalSort = other.IsExternalSort;
    this.IsExternalSortAscending = other.IsExternalSortAscending;
    this.IsSystemGenerated = other.IsSystemGenerated;
    this.IsSystemGeneratedFetch = other.IsSystemGeneratedFetch;
    this.IsSystemGeneratedSort = other.IsSystemGeneratedSort;
    this.IsSystemGeneratedSortAscending = other.IsSystemGeneratedSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.ShortDisplay = other.ShortDisplay;
    this.ShortDisplayFetch = other.ShortDisplayFetch;
    this.ShortDisplaySort = other.ShortDisplaySort;
    this.ShortDisplayCaseInsensitive = other.ShortDisplayCaseInsensitive;
    this.ShortDisplaySortAscending = other.ShortDisplaySortAscending;
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;  }
  /** get the filter for this object's key
   * @return BonusPointTransTypeObjectKeyFilter
   */
  public BonusPointTransTypeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (BonusPointTransTypeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBonusPointTransTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.BonusPointTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBonusPointTransTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BonusPointTransTypeFetch;
  }
  /** Set the SortOrder for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBonusPointTransTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.BonusPointTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBonusPointTransTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BonusPointTransTypeSort;
  }
  /** Set the sort direction for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBonusPointTransTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.BonusPointTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBonusPointTransTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BonusPointTransTypeSortAscending;
  }
  /** Set the field level filters for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBonusPointTransTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.BonusPointTransType = value;
  }
  /** Retrieve filter for field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBonusPointTransTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BonusPointTransType;
  }
  /** Set the field level Fetch value for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @param fetch whether to fetch this field or not
   */
  public void setBonusPointTransCategoryFetch (boolean fetch) {
    this.BonusPointTransCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getBonusPointTransCategoryFetch () {
    return this.BonusPointTransCategoryFetch;
  }
  /** Set the SortOrder for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBonusPointTransCategorySortOrder (Integer value) {
    this.BonusPointTransCategorySort = value;
  }
  /** Retrieve SortOrder for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBonusPointTransCategorySortOrder () {
    return this.BonusPointTransCategorySort;
  }
  /** Set the sort direction for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBonusPointTransCategorySortDirection (boolean ascending) {
    this.BonusPointTransCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBonusPointTransCategorySortDirection () {
    return this.BonusPointTransCategorySortAscending;
  }
  /** Set the field level filters for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBonusPointTransCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.BonusPointTransCategory = value;
  }
  /** Retrieve filter for field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBonusPointTransCategoryFilter () {
    return this.BonusPointTransCategory;
  }

  /**
   * Retrieves the BonusPointTransCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BonusPointTransCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointTransCategoryFilter field
   */
  public String[] getBonusPointTransCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBonusPointTransCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BonusPointTransCategoryFilter filter value from a formatted string
   *
   * @param _value the BonusPointTransCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BonusPointTransCategoryFilter filter field
   */
  public void setBonusPointTransCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointTransCategoryFilterFromFormattedString");
    try {
      this.setBonusPointTransCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointTransCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointTransCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSignFetch (boolean fetch) {
    this.TransSignFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSignFetch () {
    return this.TransSignFetch;
  }
  /** Set the SortOrder for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSignSortOrder (Integer value) {
    this.TransSignSort = value;
  }
  /** Retrieve SortOrder for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSignSortOrder () {
    return this.TransSignSort;
  }
  /** Set the sort direction for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSignSortDirection (boolean ascending) {
    this.TransSignSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSignSortDirection () {
    return this.TransSignSortAscending;
  }
  /** Set the field level filters for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSignFilter (IntegerFilter[] value) throws ServiceException {
    this.TransSign = value;
  }
  /** Retrieve filter for field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransSignFilter () {
    return this.TransSign;
  }

  /**
   * Retrieves the TransSignFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransSignFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSignFilter field
   */
  public String[] getTransSignFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSignFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransSignFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSignFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSignFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSignFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransSignFilter filter value from a formatted string
   *
   * @param _value the TransSignFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSignFilter filter field
   */
  public void setTransSignFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSignFilterFromFormattedString");
    try {
      this.setTransSignFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSignFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSignFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSignFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDisplayedOnbillFetch (boolean fetch) {
    this.IsDisplayedOnbillFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDisplayedOnbillFetch () {
    return this.IsDisplayedOnbillFetch;
  }
  /** Set the SortOrder for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDisplayedOnbillSortOrder (Integer value) {
    this.IsDisplayedOnbillSort = value;
  }
  /** Retrieve SortOrder for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDisplayedOnbillSortOrder () {
    return this.IsDisplayedOnbillSort;
  }
  /** Set the sort direction for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDisplayedOnbillSortDirection (boolean ascending) {
    this.IsDisplayedOnbillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDisplayedOnbillSortDirection () {
    return this.IsDisplayedOnbillSortAscending;
  }
  /** Set the field level filters for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDisplayedOnbillFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDisplayedOnbill = value;
  }
  /** Retrieve filter for field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDisplayedOnbillFilter () {
    return this.IsDisplayedOnbill;
  }

  /**
   * Retrieves the IsDisplayedOnbillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDisplayedOnbillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDisplayedOnbillFilter field
   */
  public String[] getIsDisplayedOnbillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisplayedOnbillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDisplayedOnbillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDisplayedOnbillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDisplayedOnbillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDisplayedOnbillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDisplayedOnbillFilter filter value from a formatted string
   *
   * @param _value the IsDisplayedOnbillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDisplayedOnbillFilter filter field
   */
  public void setIsDisplayedOnbillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDisplayedOnbillFilterFromFormattedString");
    try {
      this.setIsDisplayedOnbillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDisplayedOnbillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDisplayedOnbillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDisplayedOnbillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @param fetch whether to fetch this field or not
   */
  public void setIsViewableOnGuiFetch (boolean fetch) {
    this.IsViewableOnGuiFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsViewableOnGuiFetch () {
    return this.IsViewableOnGuiFetch;
  }
  /** Set the SortOrder for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsViewableOnGuiSortOrder (Integer value) {
    this.IsViewableOnGuiSort = value;
  }
  /** Retrieve SortOrder for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsViewableOnGuiSortOrder () {
    return this.IsViewableOnGuiSort;
  }
  /** Set the sort direction for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsViewableOnGuiSortDirection (boolean ascending) {
    this.IsViewableOnGuiSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsViewableOnGuiSortDirection () {
    return this.IsViewableOnGuiSortAscending;
  }
  /** Set the field level filters for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsViewableOnGuiFilter (BooleanFilter[] value) throws ServiceException {
    this.IsViewableOnGui = value;
  }
  /** Retrieve filter for field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsViewableOnGuiFilter () {
    return this.IsViewableOnGui;
  }

  /**
   * Retrieves the IsViewableOnGuiFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsViewableOnGuiFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsViewableOnGuiFilter field
   */
  public String[] getIsViewableOnGuiFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsViewableOnGuiFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsViewableOnGuiFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsViewableOnGuiFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsViewableOnGuiFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsViewableOnGuiFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsViewableOnGuiFilter filter value from a formatted string
   *
   * @param _value the IsViewableOnGuiFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsViewableOnGuiFilter filter field
   */
  public void setIsViewableOnGuiFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsViewableOnGuiFilterFromFormattedString");
    try {
      this.setIsViewableOnGuiFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsViewableOnGuiFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsViewableOnGuiFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsViewableOnGuiFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @param fetch whether to fetch this field or not
   */
  public void setIsExternalFetch (boolean fetch) {
    this.IsExternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsExternalFetch () {
    return this.IsExternalFetch;
  }
  /** Set the SortOrder for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsExternalSortOrder (Integer value) {
    this.IsExternalSort = value;
  }
  /** Retrieve SortOrder for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsExternalSortOrder () {
    return this.IsExternalSort;
  }
  /** Set the sort direction for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsExternalSortDirection (boolean ascending) {
    this.IsExternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsExternalSortDirection () {
    return this.IsExternalSortAscending;
  }
  /** Set the field level filters for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsExternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsExternal = value;
  }
  /** Retrieve filter for field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsExternalFilter () {
    return this.IsExternal;
  }

  /**
   * Retrieves the IsExternalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsExternalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsExternalFilter field
   */
  public String[] getIsExternalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsExternalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsExternalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsExternalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsExternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsExternalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsExternalFilter filter value from a formatted string
   *
   * @param _value the IsExternalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsExternalFilter filter field
   */
  public void setIsExternalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsExternalFilterFromFormattedString");
    try {
      this.setIsExternalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsExternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsExternalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsExternalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @param fetch whether to fetch this field or not
   */
  public void setIsSystemGeneratedFetch (boolean fetch) {
    this.IsSystemGeneratedFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsSystemGeneratedFetch () {
    return this.IsSystemGeneratedFetch;
  }
  /** Set the SortOrder for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsSystemGeneratedSortOrder (Integer value) {
    this.IsSystemGeneratedSort = value;
  }
  /** Retrieve SortOrder for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsSystemGeneratedSortOrder () {
    return this.IsSystemGeneratedSort;
  }
  /** Set the sort direction for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsSystemGeneratedSortDirection (boolean ascending) {
    this.IsSystemGeneratedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsSystemGeneratedSortDirection () {
    return this.IsSystemGeneratedSortAscending;
  }
  /** Set the field level filters for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsSystemGeneratedFilter (BooleanFilter[] value) throws ServiceException {
    this.IsSystemGenerated = value;
  }
  /** Retrieve filter for field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsSystemGeneratedFilter () {
    return this.IsSystemGenerated;
  }

  /**
   * Retrieves the IsSystemGeneratedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsSystemGeneratedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsSystemGeneratedFilter field
   */
  public String[] getIsSystemGeneratedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSystemGeneratedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsSystemGeneratedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsSystemGeneratedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsSystemGeneratedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsSystemGeneratedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsSystemGeneratedFilter filter value from a formatted string
   *
   * @param _value the IsSystemGeneratedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsSystemGeneratedFilter filter field
   */
  public void setIsSystemGeneratedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsSystemGeneratedFilterFromFormattedString");
    try {
      this.setIsSystemGeneratedFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsSystemGeneratedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsSystemGeneratedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsSystemGeneratedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultFilter () {
    return this.IsDefault;
  }

  /**
   * Retrieves the IsDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultFilter field
   */
  public String[] getIsDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultFilter filter value from a formatted string
   *
   * @param _value the IsDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultFilter filter field
   */
  public void setIsDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultFilterFromFormattedString");
    try {
      this.setIsDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
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

  /** Set the field level Fetch value for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
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

  /** Set the field level Fetch value for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
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

  public String toString() {
    return BonusPointTransTypeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BonusPointTransTypeObjectHelper.toMap(this, null);
  }
}
