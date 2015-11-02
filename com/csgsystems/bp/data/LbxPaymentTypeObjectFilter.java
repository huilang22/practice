/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LbxPaymentTypeObjectFilter.java
 * Definition File: Admin/LbxPaymentType.xml
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
public class LbxPaymentTypeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public LbxPaymentTypeObjectKeyFilter Key = null;
  /** raw field for: LBX_PAYMENT_TYPES.bmf_trans_type) */
  public    IntegerFilter[] BmfTransType  = null;
  protected boolean BmfTransTypeFetch = false;
  protected boolean BmfTransTypeSortAscending = true;
  protected Integer BmfTransTypeSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.lbx_source_type) */
  public    IntegerFilter[] LbxSourceType  = null;
  protected boolean LbxSourceTypeFetch = false;
  protected boolean LbxSourceTypeSortAscending = true;
  protected Integer LbxSourceTypeSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.lbx_cycle_type) */
  public    IntegerFilter[] LbxCycleType  = null;
  protected boolean LbxCycleTypeFetch = false;
  protected boolean LbxCycleTypeSortAscending = true;
  protected Integer LbxCycleTypeSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.cycle_expected) */
  public    StringFilter[] CycleExpected  = null;
  protected boolean CycleExpectedFetch = false;
  protected boolean CycleExpectedSortAscending = true;
  protected boolean CycleExpectedCaseInsensitive = false;
  protected Integer CycleExpectedSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.path_name) */
  public    StringFilter[] PathName  = null;
  protected boolean PathNameFetch = false;
  protected boolean PathNameSortAscending = true;
  protected boolean PathNameCaseInsensitive = false;
  protected Integer PathNameSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.naming_pattern) */
  public    StringFilter[] NamingPattern  = null;
  protected boolean NamingPatternFetch = false;
  protected boolean NamingPatternSortAscending = true;
  protected boolean NamingPatternCaseInsensitive = false;
  protected Integer NamingPatternSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.naming_extension) */
  public    StringFilter[] NamingExtension  = null;
  protected boolean NamingExtensionFetch = false;
  protected boolean NamingExtensionSortAscending = true;
  protected boolean NamingExtensionCaseInsensitive = false;
  protected Integer NamingExtensionSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: LBX_SOURCE_ID_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: LBX_SOURCE_ID_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: LBX_SOURCE_ID_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "LbxPaymentTypeObjectFilter";
  /** default constructor */
  public LbxPaymentTypeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public LbxPaymentTypeObjectFilter (LbxPaymentTypeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new LbxPaymentTypeObjectKeyFilter (other.Key);
    this.BmfTransType = other.BmfTransType;
    this.BmfTransTypeFetch = other.BmfTransTypeFetch;
    this.BmfTransTypeSort = other.BmfTransTypeSort;
    this.BmfTransTypeSortAscending = other.BmfTransTypeSortAscending;
    this.LbxSourceType = other.LbxSourceType;
    this.LbxSourceTypeFetch = other.LbxSourceTypeFetch;
    this.LbxSourceTypeSort = other.LbxSourceTypeSort;
    this.LbxSourceTypeSortAscending = other.LbxSourceTypeSortAscending;
    this.LbxCycleType = other.LbxCycleType;
    this.LbxCycleTypeFetch = other.LbxCycleTypeFetch;
    this.LbxCycleTypeSort = other.LbxCycleTypeSort;
    this.LbxCycleTypeSortAscending = other.LbxCycleTypeSortAscending;
    this.CycleExpected = other.CycleExpected;
    this.CycleExpectedFetch = other.CycleExpectedFetch;
    this.CycleExpectedSort = other.CycleExpectedSort;
    this.CycleExpectedCaseInsensitive = other.CycleExpectedCaseInsensitive;
    this.CycleExpectedSortAscending = other.CycleExpectedSortAscending;
    this.PathName = other.PathName;
    this.PathNameFetch = other.PathNameFetch;
    this.PathNameSort = other.PathNameSort;
    this.PathNameCaseInsensitive = other.PathNameCaseInsensitive;
    this.PathNameSortAscending = other.PathNameSortAscending;
    this.NamingPattern = other.NamingPattern;
    this.NamingPatternFetch = other.NamingPatternFetch;
    this.NamingPatternSort = other.NamingPatternSort;
    this.NamingPatternCaseInsensitive = other.NamingPatternCaseInsensitive;
    this.NamingPatternSortAscending = other.NamingPatternSortAscending;
    this.NamingExtension = other.NamingExtension;
    this.NamingExtensionFetch = other.NamingExtensionFetch;
    this.NamingExtensionSort = other.NamingExtensionSort;
    this.NamingExtensionCaseInsensitive = other.NamingExtensionCaseInsensitive;
    this.NamingExtensionSortAscending = other.NamingExtensionSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
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
   * @return LbxPaymentTypeObjectKeyFilter
   */
  public LbxPaymentTypeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (LbxPaymentTypeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param fetch whether to fetch this field or not
   */
  public void setExtCategoryFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.ExtCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getExtCategoryFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ExtCategoryFetch;
  }
  /** Set the SortOrder for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExtCategorySortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.ExtCategorySort = value;
  }
  /** Retrieve SortOrder for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExtCategorySortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ExtCategorySort;
  }
  /** Set the sort direction for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExtCategorySortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.ExtCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExtCategorySortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ExtCategorySortAscending;
  }
  /** Set the case insensitive for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExtCategoryCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.ExtCategoryCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean whether the field is case insensitive
   */
  public boolean getExtCategoryCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.ExtCategoryCaseInsensitive;
  }
  /** Set the field level filters for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExtCategoryFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.ExtCategory = value;
  }
  /** Retrieve filter for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExtCategoryFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ExtCategory;
  }
  /** Set the field level Fetch value for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.SourceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SourceIdFetch;
  }
  /** Set the SortOrder for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.SourceIdSort = value;
  }
  /** Retrieve SortOrder for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SourceIdSort;
  }
  /** Set the sort direction for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.SourceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SourceIdSortAscending;
  }
  /** Set the case insensitive for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSourceIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.SourceIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getSourceIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.SourceIdCaseInsensitive;
  }
  /** Set the field level filters for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.SourceId = value;
  }
  /** Retrieve filter for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSourceIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.SourceId;
  }
  /** Set the field level Fetch value for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTransTypeFetch (boolean fetch) {
    this.BmfTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTransTypeFetch () {
    return this.BmfTransTypeFetch;
  }
  /** Set the SortOrder for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTransTypeSortOrder (Integer value) {
    this.BmfTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTransTypeSortOrder () {
    return this.BmfTransTypeSort;
  }
  /** Set the sort direction for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTransTypeSortDirection (boolean ascending) {
    this.BmfTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTransTypeSortDirection () {
    return this.BmfTransTypeSortAscending;
  }
  /** Set the field level filters for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTransType = value;
  }
  /** Retrieve filter for field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTransTypeFilter () {
    return this.BmfTransType;
  }

  /**
   * Retrieves the BmfTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransTypeFilter field
   */
  public String[] getBmfTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTransTypeFilter filter value from a formatted string
   *
   * @param _value the BmfTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTransTypeFilter filter field
   */
  public void setBmfTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
    try {
      this.setBmfTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @param fetch whether to fetch this field or not
   */
  public void setLbxSourceTypeFetch (boolean fetch) {
    this.LbxSourceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getLbxSourceTypeFetch () {
    return this.LbxSourceTypeFetch;
  }
  /** Set the SortOrder for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLbxSourceTypeSortOrder (Integer value) {
    this.LbxSourceTypeSort = value;
  }
  /** Retrieve SortOrder for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLbxSourceTypeSortOrder () {
    return this.LbxSourceTypeSort;
  }
  /** Set the sort direction for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLbxSourceTypeSortDirection (boolean ascending) {
    this.LbxSourceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLbxSourceTypeSortDirection () {
    return this.LbxSourceTypeSortAscending;
  }
  /** Set the field level filters for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLbxSourceTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.LbxSourceType = value;
  }
  /** Retrieve filter for field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLbxSourceTypeFilter () {
    return this.LbxSourceType;
  }

  /**
   * Retrieves the LbxSourceTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LbxSourceTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LbxSourceTypeFilter field
   */
  public String[] getLbxSourceTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxSourceTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLbxSourceTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxSourceTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LbxSourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLbxSourceTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LbxSourceTypeFilter filter value from a formatted string
   *
   * @param _value the LbxSourceTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LbxSourceTypeFilter filter field
   */
  public void setLbxSourceTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLbxSourceTypeFilterFromFormattedString");
    try {
      this.setLbxSourceTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LbxSourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLbxSourceTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLbxSourceTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @param fetch whether to fetch this field or not
   */
  public void setLbxCycleTypeFetch (boolean fetch) {
    this.LbxCycleTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getLbxCycleTypeFetch () {
    return this.LbxCycleTypeFetch;
  }
  /** Set the SortOrder for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLbxCycleTypeSortOrder (Integer value) {
    this.LbxCycleTypeSort = value;
  }
  /** Retrieve SortOrder for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLbxCycleTypeSortOrder () {
    return this.LbxCycleTypeSort;
  }
  /** Set the sort direction for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLbxCycleTypeSortDirection (boolean ascending) {
    this.LbxCycleTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLbxCycleTypeSortDirection () {
    return this.LbxCycleTypeSortAscending;
  }
  /** Set the field level filters for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLbxCycleTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.LbxCycleType = value;
  }
  /** Retrieve filter for field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLbxCycleTypeFilter () {
    return this.LbxCycleType;
  }

  /**
   * Retrieves the LbxCycleTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LbxCycleTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LbxCycleTypeFilter field
   */
  public String[] getLbxCycleTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxCycleTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLbxCycleTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxCycleTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LbxCycleTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLbxCycleTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LbxCycleTypeFilter filter value from a formatted string
   *
   * @param _value the LbxCycleTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LbxCycleTypeFilter filter field
   */
  public void setLbxCycleTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLbxCycleTypeFilterFromFormattedString");
    try {
      this.setLbxCycleTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LbxCycleTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLbxCycleTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLbxCycleTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @param fetch whether to fetch this field or not
   */
  public void setCycleExpectedFetch (boolean fetch) {
    this.CycleExpectedFetch = fetch;
  }
  /** Retrieve Fetch value for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @return boolean the Fetch value for this field
   */
  public boolean getCycleExpectedFetch () {
    return this.CycleExpectedFetch;
  }
  /** Set the SortOrder for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCycleExpectedSortOrder (Integer value) {
    this.CycleExpectedSort = value;
  }
  /** Retrieve SortOrder for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCycleExpectedSortOrder () {
    return this.CycleExpectedSort;
  }
  /** Set the sort direction for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCycleExpectedSortDirection (boolean ascending) {
    this.CycleExpectedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCycleExpectedSortDirection () {
    return this.CycleExpectedSortAscending;
  }
  /** Set the case insensitive for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCycleExpectedCaseInsensitive (boolean ascending) {
    this.CycleExpectedCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCycleExpectedCaseInsensitive () {
    return this.CycleExpectedCaseInsensitive;
  }
  /** Set the field level filters for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCycleExpectedFilter (StringFilter[] value) throws ServiceException {
    this.CycleExpected = value;
  }
  /** Retrieve filter for field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCycleExpectedFilter () {
    return this.CycleExpected;
  }

  /**
   * Retrieves the CycleExpectedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CycleExpectedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CycleExpectedFilter field
   */
  public String[] getCycleExpectedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCycleExpectedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCycleExpectedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCycleExpectedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CycleExpectedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCycleExpectedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CycleExpectedFilter filter value from a formatted string
   *
   * @param _value the CycleExpectedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CycleExpectedFilter filter field
   */
  public void setCycleExpectedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCycleExpectedFilterFromFormattedString");
    try {
      this.setCycleExpectedFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CycleExpectedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCycleExpectedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCycleExpectedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @param fetch whether to fetch this field or not
   */
  public void setPathNameFetch (boolean fetch) {
    this.PathNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getPathNameFetch () {
    return this.PathNameFetch;
  }
  /** Set the SortOrder for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPathNameSortOrder (Integer value) {
    this.PathNameSort = value;
  }
  /** Retrieve SortOrder for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPathNameSortOrder () {
    return this.PathNameSort;
  }
  /** Set the sort direction for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPathNameSortDirection (boolean ascending) {
    this.PathNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPathNameSortDirection () {
    return this.PathNameSortAscending;
  }
  /** Set the case insensitive for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPathNameCaseInsensitive (boolean ascending) {
    this.PathNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPathNameCaseInsensitive () {
    return this.PathNameCaseInsensitive;
  }
  /** Set the field level filters for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPathNameFilter (StringFilter[] value) throws ServiceException {
    this.PathName = value;
  }
  /** Retrieve filter for field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPathNameFilter () {
    return this.PathName;
  }

  /**
   * Retrieves the PathNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PathNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PathNameFilter field
   */
  public String[] getPathNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPathNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPathNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPathNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PathNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPathNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PathNameFilter filter value from a formatted string
   *
   * @param _value the PathNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PathNameFilter filter field
   */
  public void setPathNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPathNameFilterFromFormattedString");
    try {
      this.setPathNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PathNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPathNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPathNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @param fetch whether to fetch this field or not
   */
  public void setNamingPatternFetch (boolean fetch) {
    this.NamingPatternFetch = fetch;
  }
  /** Retrieve Fetch value for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @return boolean the Fetch value for this field
   */
  public boolean getNamingPatternFetch () {
    return this.NamingPatternFetch;
  }
  /** Set the SortOrder for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNamingPatternSortOrder (Integer value) {
    this.NamingPatternSort = value;
  }
  /** Retrieve SortOrder for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNamingPatternSortOrder () {
    return this.NamingPatternSort;
  }
  /** Set the sort direction for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNamingPatternSortDirection (boolean ascending) {
    this.NamingPatternSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNamingPatternSortDirection () {
    return this.NamingPatternSortAscending;
  }
  /** Set the case insensitive for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setNamingPatternCaseInsensitive (boolean ascending) {
    this.NamingPatternCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getNamingPatternCaseInsensitive () {
    return this.NamingPatternCaseInsensitive;
  }
  /** Set the field level filters for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNamingPatternFilter (StringFilter[] value) throws ServiceException {
    this.NamingPattern = value;
  }
  /** Retrieve filter for field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getNamingPatternFilter () {
    return this.NamingPattern;
  }

  /**
   * Retrieves the NamingPatternFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NamingPatternFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NamingPatternFilter field
   */
  public String[] getNamingPatternFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamingPatternFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNamingPatternFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNamingPatternFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NamingPatternFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNamingPatternFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NamingPatternFilter filter value from a formatted string
   *
   * @param _value the NamingPatternFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NamingPatternFilter filter field
   */
  public void setNamingPatternFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNamingPatternFilterFromFormattedString");
    try {
      this.setNamingPatternFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NamingPatternFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNamingPatternFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNamingPatternFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @param fetch whether to fetch this field or not
   */
  public void setNamingExtensionFetch (boolean fetch) {
    this.NamingExtensionFetch = fetch;
  }
  /** Retrieve Fetch value for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @return boolean the Fetch value for this field
   */
  public boolean getNamingExtensionFetch () {
    return this.NamingExtensionFetch;
  }
  /** Set the SortOrder for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNamingExtensionSortOrder (Integer value) {
    this.NamingExtensionSort = value;
  }
  /** Retrieve SortOrder for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNamingExtensionSortOrder () {
    return this.NamingExtensionSort;
  }
  /** Set the sort direction for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNamingExtensionSortDirection (boolean ascending) {
    this.NamingExtensionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNamingExtensionSortDirection () {
    return this.NamingExtensionSortAscending;
  }
  /** Set the case insensitive for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setNamingExtensionCaseInsensitive (boolean ascending) {
    this.NamingExtensionCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getNamingExtensionCaseInsensitive () {
    return this.NamingExtensionCaseInsensitive;
  }
  /** Set the field level filters for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNamingExtensionFilter (StringFilter[] value) throws ServiceException {
    this.NamingExtension = value;
  }
  /** Retrieve filter for field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getNamingExtensionFilter () {
    return this.NamingExtension;
  }

  /**
   * Retrieves the NamingExtensionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NamingExtensionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NamingExtensionFilter field
   */
  public String[] getNamingExtensionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamingExtensionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNamingExtensionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNamingExtensionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NamingExtensionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNamingExtensionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NamingExtensionFilter filter value from a formatted string
   *
   * @param _value the NamingExtensionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NamingExtensionFilter filter field
   */
  public void setNamingExtensionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNamingExtensionFilterFromFormattedString");
    try {
      this.setNamingExtensionFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NamingExtensionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNamingExtensionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNamingExtensionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
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

  /** Set the field level Fetch value for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (LBX_SOURCE_ID_REF.is_default)
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

  /** Set the field level Fetch value for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
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

  /** Set the field level Fetch value for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
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

  /** Set the field level Fetch value for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
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
    return LbxPaymentTypeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return LbxPaymentTypeObjectHelper.toMap(this, null);
  }
}
