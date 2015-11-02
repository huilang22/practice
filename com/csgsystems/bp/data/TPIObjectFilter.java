/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TPIObjectFilter.java
 * Definition File: Admin/TaxPackageInst.xml
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
public class TPIObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public TPIObjectKeyFilter Key = null;
  /** raw field for: TAX_PKG_INST_ID_REF.tax_pkg_type) */
  public    IntegerFilter[] TaxPkgType  = null;
  protected boolean TaxPkgTypeFetch = false;
  protected boolean TaxPkgTypeSortAscending = true;
  protected Integer TaxPkgTypeSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.pkg_order) */
  public    IntegerFilter[] PkgOrder  = null;
  protected boolean PkgOrderFetch = false;
  protected boolean PkgOrderSortAscending = true;
  protected Integer PkgOrderSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.basic_days) */
  public    IntegerFilter[] BasicDays  = null;
  protected boolean BasicDaysFetch = false;
  protected boolean BasicDaysSortAscending = true;
  protected Integer BasicDaysSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_binned) */
  public    IntegerFilter[] IsBinned  = null;
  protected boolean IsBinnedFetch = false;
  protected boolean IsBinnedSortAscending = true;
  protected Integer IsBinnedSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_distributed) */
  public    BooleanFilter[] IsDistributed  = null;
  protected boolean IsDistributedFetch = false;
  protected boolean IsDistributedSortAscending = true;
  protected Integer IsDistributedSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_franchise) */
  public    BooleanFilter[] IsFranchise  = null;
  protected boolean IsFranchiseFetch = false;
  protected boolean IsFranchiseSortAscending = true;
  protected Integer IsFranchiseSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_gui_pretax) */
  public    BooleanFilter[] IsGuiPretax  = null;
  protected boolean IsGuiPretaxFetch = false;
  protected boolean IsGuiPretaxSortAscending = true;
  protected Integer IsGuiPretaxSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.exclude_charge) */
  public    BooleanFilter[] ExcludeCharge  = null;
  protected boolean ExcludeChargeFetch = false;
  protected boolean ExcludeChargeSortAscending = true;
  protected Integer ExcludeChargeSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.rounding_method) */
  public    IntegerFilter[] RoundingMethod  = null;
  protected boolean RoundingMethodFetch = false;
  protected boolean RoundingMethodSortAscending = true;
  protected Integer RoundingMethodSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.tax_type) */
  public    IntegerFilter[] TaxType  = null;
  protected boolean TaxTypeFetch = false;
  protected boolean TaxTypeSortAscending = true;
  protected Integer TaxTypeSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_graduated) */
  public    IntegerFilter[] IsGraduated  = null;
  protected boolean IsGraduatedFetch = false;
  protected boolean IsGraduatedSortAscending = true;
  protected Integer IsGraduatedSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.tax_zero_charge) */
  public    IntegerFilter[] TaxZeroCharge  = null;
  protected boolean TaxZeroChargeFetch = false;
  protected boolean TaxZeroChargeSortAscending = true;
  protected Integer TaxZeroChargeSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.rounding_factor) */
  public    IntegerFilter[] RoundingFactor  = null;
  protected boolean RoundingFactorFetch = false;
  protected boolean RoundingFactorSortAscending = true;
  protected Integer RoundingFactorSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.bin_rounding) */
  public    BooleanFilter[] BinRounding  = null;
  protected boolean BinRoundingFetch = false;
  protected boolean BinRoundingSortAscending = true;
  protected Integer BinRoundingSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_late_fee_exempt) */
  public    BooleanFilter[] IsLateFeeExempt  = null;
  protected boolean IsLateFeeExemptFetch = false;
  protected boolean IsLateFeeExemptSortAscending = true;
  protected Integer IsLateFeeExemptSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.is_inclusive) */
  public    IntegerFilter[] IsInclusive  = null;
  protected boolean IsInclusiveFetch = false;
  protected boolean IsInclusiveSortAscending = true;
  protected Integer IsInclusiveSort = null;
  /** raw field for: TAX_PKG_INST_ID_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: TAX_PKG_INST_ID_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: TAX_PKG_INST_ID_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "TPIObjectFilter";
  /** default constructor */
  public TPIObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public TPIObjectFilter (TPIObjectFilter other)
  {
    if (other == null) return;
    this.Key = new TPIObjectKeyFilter (other.Key);
    this.TaxPkgType = other.TaxPkgType;
    this.TaxPkgTypeFetch = other.TaxPkgTypeFetch;
    this.TaxPkgTypeSort = other.TaxPkgTypeSort;
    this.TaxPkgTypeSortAscending = other.TaxPkgTypeSortAscending;
    this.PkgOrder = other.PkgOrder;
    this.PkgOrderFetch = other.PkgOrderFetch;
    this.PkgOrderSort = other.PkgOrderSort;
    this.PkgOrderSortAscending = other.PkgOrderSortAscending;
    this.BasicDays = other.BasicDays;
    this.BasicDaysFetch = other.BasicDaysFetch;
    this.BasicDaysSort = other.BasicDaysSort;
    this.BasicDaysSortAscending = other.BasicDaysSortAscending;
    this.IsBinned = other.IsBinned;
    this.IsBinnedFetch = other.IsBinnedFetch;
    this.IsBinnedSort = other.IsBinnedSort;
    this.IsBinnedSortAscending = other.IsBinnedSortAscending;
    this.IsDistributed = other.IsDistributed;
    this.IsDistributedFetch = other.IsDistributedFetch;
    this.IsDistributedSort = other.IsDistributedSort;
    this.IsDistributedSortAscending = other.IsDistributedSortAscending;
    this.IsFranchise = other.IsFranchise;
    this.IsFranchiseFetch = other.IsFranchiseFetch;
    this.IsFranchiseSort = other.IsFranchiseSort;
    this.IsFranchiseSortAscending = other.IsFranchiseSortAscending;
    this.IsGuiPretax = other.IsGuiPretax;
    this.IsGuiPretaxFetch = other.IsGuiPretaxFetch;
    this.IsGuiPretaxSort = other.IsGuiPretaxSort;
    this.IsGuiPretaxSortAscending = other.IsGuiPretaxSortAscending;
    this.ExcludeCharge = other.ExcludeCharge;
    this.ExcludeChargeFetch = other.ExcludeChargeFetch;
    this.ExcludeChargeSort = other.ExcludeChargeSort;
    this.ExcludeChargeSortAscending = other.ExcludeChargeSortAscending;
    this.RoundingMethod = other.RoundingMethod;
    this.RoundingMethodFetch = other.RoundingMethodFetch;
    this.RoundingMethodSort = other.RoundingMethodSort;
    this.RoundingMethodSortAscending = other.RoundingMethodSortAscending;
    this.TaxType = other.TaxType;
    this.TaxTypeFetch = other.TaxTypeFetch;
    this.TaxTypeSort = other.TaxTypeSort;
    this.TaxTypeSortAscending = other.TaxTypeSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.IsGraduated = other.IsGraduated;
    this.IsGraduatedFetch = other.IsGraduatedFetch;
    this.IsGraduatedSort = other.IsGraduatedSort;
    this.IsGraduatedSortAscending = other.IsGraduatedSortAscending;
    this.TaxZeroCharge = other.TaxZeroCharge;
    this.TaxZeroChargeFetch = other.TaxZeroChargeFetch;
    this.TaxZeroChargeSort = other.TaxZeroChargeSort;
    this.TaxZeroChargeSortAscending = other.TaxZeroChargeSortAscending;
    this.RoundingFactor = other.RoundingFactor;
    this.RoundingFactorFetch = other.RoundingFactorFetch;
    this.RoundingFactorSort = other.RoundingFactorSort;
    this.RoundingFactorSortAscending = other.RoundingFactorSortAscending;
    this.BinRounding = other.BinRounding;
    this.BinRoundingFetch = other.BinRoundingFetch;
    this.BinRoundingSort = other.BinRoundingSort;
    this.BinRoundingSortAscending = other.BinRoundingSortAscending;
    this.IsLateFeeExempt = other.IsLateFeeExempt;
    this.IsLateFeeExemptFetch = other.IsLateFeeExemptFetch;
    this.IsLateFeeExemptSort = other.IsLateFeeExemptSort;
    this.IsLateFeeExemptSortAscending = other.IsLateFeeExemptSortAscending;
    this.IsInclusive = other.IsInclusive;
    this.IsInclusiveFetch = other.IsInclusiveFetch;
    this.IsInclusiveSort = other.IsInclusiveSort;
    this.IsInclusiveSortAscending = other.IsInclusiveSortAscending;
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
   * @return TPIObjectKeyFilter
   */
  public TPIObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (TPIObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Set the field level Fetch value for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TPIObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgTypeFetch (boolean fetch) {
    this.TaxPkgTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgTypeFetch () {
    return this.TaxPkgTypeFetch;
  }
  /** Set the SortOrder for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgTypeSortOrder (Integer value) {
    this.TaxPkgTypeSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgTypeSortOrder () {
    return this.TaxPkgTypeSort;
  }
  /** Set the sort direction for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgTypeSortDirection (boolean ascending) {
    this.TaxPkgTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgTypeSortDirection () {
    return this.TaxPkgTypeSortAscending;
  }
  /** Set the field level filters for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgType = value;
  }
  /** Retrieve filter for field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgTypeFilter () {
    return this.TaxPkgType;
  }

  /**
   * Retrieves the TaxPkgTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPkgTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgTypeFilter field
   */
  public String[] getTaxPkgTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxPkgTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPkgTypeFilter filter value from a formatted string
   *
   * @param _value the TaxPkgTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPkgTypeFilter filter field
   */
  public void setTaxPkgTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgTypeFilterFromFormattedString");
    try {
      this.setTaxPkgTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @param fetch whether to fetch this field or not
   */
  public void setPkgOrderFetch (boolean fetch) {
    this.PkgOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getPkgOrderFetch () {
    return this.PkgOrderFetch;
  }
  /** Set the SortOrder for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkgOrderSortOrder (Integer value) {
    this.PkgOrderSort = value;
  }
  /** Retrieve SortOrder for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkgOrderSortOrder () {
    return this.PkgOrderSort;
  }
  /** Set the sort direction for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkgOrderSortDirection (boolean ascending) {
    this.PkgOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkgOrderSortDirection () {
    return this.PkgOrderSortAscending;
  }
  /** Set the field level filters for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkgOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.PkgOrder = value;
  }
  /** Retrieve filter for field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPkgOrderFilter () {
    return this.PkgOrder;
  }

  /**
   * Retrieves the PkgOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PkgOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkgOrderFilter field
   */
  public String[] getPkgOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkgOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPkgOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkgOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PkgOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkgOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PkgOrderFilter filter value from a formatted string
   *
   * @param _value the PkgOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PkgOrderFilter filter field
   */
  public void setPkgOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPkgOrderFilterFromFormattedString");
    try {
      this.setPkgOrderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PkgOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkgOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkgOrderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @param fetch whether to fetch this field or not
   */
  public void setBasicDaysFetch (boolean fetch) {
    this.BasicDaysFetch = fetch;
  }
  /** Retrieve Fetch value for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @return boolean the Fetch value for this field
   */
  public boolean getBasicDaysFetch () {
    return this.BasicDaysFetch;
  }
  /** Set the SortOrder for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBasicDaysSortOrder (Integer value) {
    this.BasicDaysSort = value;
  }
  /** Retrieve SortOrder for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBasicDaysSortOrder () {
    return this.BasicDaysSort;
  }
  /** Set the sort direction for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBasicDaysSortDirection (boolean ascending) {
    this.BasicDaysSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBasicDaysSortDirection () {
    return this.BasicDaysSortAscending;
  }
  /** Set the field level filters for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBasicDaysFilter (IntegerFilter[] value) throws ServiceException {
    this.BasicDays = value;
  }
  /** Retrieve filter for field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBasicDaysFilter () {
    return this.BasicDays;
  }

  /**
   * Retrieves the BasicDaysFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BasicDaysFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BasicDaysFilter field
   */
  public String[] getBasicDaysFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBasicDaysFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBasicDaysFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBasicDaysFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BasicDaysFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBasicDaysFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BasicDaysFilter filter value from a formatted string
   *
   * @param _value the BasicDaysFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BasicDaysFilter filter field
   */
  public void setBasicDaysFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBasicDaysFilterFromFormattedString");
    try {
      this.setBasicDaysFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BasicDaysFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBasicDaysFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBasicDaysFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @param fetch whether to fetch this field or not
   */
  public void setIsBinnedFetch (boolean fetch) {
    this.IsBinnedFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsBinnedFetch () {
    return this.IsBinnedFetch;
  }
  /** Set the SortOrder for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsBinnedSortOrder (Integer value) {
    this.IsBinnedSort = value;
  }
  /** Retrieve SortOrder for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsBinnedSortOrder () {
    return this.IsBinnedSort;
  }
  /** Set the sort direction for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsBinnedSortDirection (boolean ascending) {
    this.IsBinnedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsBinnedSortDirection () {
    return this.IsBinnedSortAscending;
  }
  /** Set the field level filters for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsBinnedFilter (IntegerFilter[] value) throws ServiceException {
    this.IsBinned = value;
  }
  /** Retrieve filter for field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIsBinnedFilter () {
    return this.IsBinned;
  }

  /**
   * Retrieves the IsBinnedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsBinnedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsBinnedFilter field
   */
  public String[] getIsBinnedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsBinnedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsBinnedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsBinnedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsBinnedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsBinnedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsBinnedFilter filter value from a formatted string
   *
   * @param _value the IsBinnedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsBinnedFilter filter field
   */
  public void setIsBinnedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsBinnedFilterFromFormattedString");
    try {
      this.setIsBinnedFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsBinnedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsBinnedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsBinnedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDistributedFetch (boolean fetch) {
    this.IsDistributedFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDistributedFetch () {
    return this.IsDistributedFetch;
  }
  /** Set the SortOrder for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDistributedSortOrder (Integer value) {
    this.IsDistributedSort = value;
  }
  /** Retrieve SortOrder for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDistributedSortOrder () {
    return this.IsDistributedSort;
  }
  /** Set the sort direction for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDistributedSortDirection (boolean ascending) {
    this.IsDistributedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDistributedSortDirection () {
    return this.IsDistributedSortAscending;
  }
  /** Set the field level filters for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDistributedFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDistributed = value;
  }
  /** Retrieve filter for field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDistributedFilter () {
    return this.IsDistributed;
  }

  /**
   * Retrieves the IsDistributedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDistributedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDistributedFilter field
   */
  public String[] getIsDistributedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDistributedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDistributedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDistributedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDistributedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDistributedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDistributedFilter filter value from a formatted string
   *
   * @param _value the IsDistributedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDistributedFilter filter field
   */
  public void setIsDistributedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDistributedFilterFromFormattedString");
    try {
      this.setIsDistributedFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDistributedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDistributedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDistributedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @param fetch whether to fetch this field or not
   */
  public void setIsFranchiseFetch (boolean fetch) {
    this.IsFranchiseFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsFranchiseFetch () {
    return this.IsFranchiseFetch;
  }
  /** Set the SortOrder for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsFranchiseSortOrder (Integer value) {
    this.IsFranchiseSort = value;
  }
  /** Retrieve SortOrder for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsFranchiseSortOrder () {
    return this.IsFranchiseSort;
  }
  /** Set the sort direction for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsFranchiseSortDirection (boolean ascending) {
    this.IsFranchiseSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsFranchiseSortDirection () {
    return this.IsFranchiseSortAscending;
  }
  /** Set the field level filters for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsFranchiseFilter (BooleanFilter[] value) throws ServiceException {
    this.IsFranchise = value;
  }
  /** Retrieve filter for field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsFranchiseFilter () {
    return this.IsFranchise;
  }

  /**
   * Retrieves the IsFranchiseFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsFranchiseFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsFranchiseFilter field
   */
  public String[] getIsFranchiseFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsFranchiseFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsFranchiseFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsFranchiseFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsFranchiseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsFranchiseFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsFranchiseFilter filter value from a formatted string
   *
   * @param _value the IsFranchiseFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsFranchiseFilter filter field
   */
  public void setIsFranchiseFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsFranchiseFilterFromFormattedString");
    try {
      this.setIsFranchiseFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsFranchiseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsFranchiseFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsFranchiseFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @param fetch whether to fetch this field or not
   */
  public void setIsGuiPretaxFetch (boolean fetch) {
    this.IsGuiPretaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsGuiPretaxFetch () {
    return this.IsGuiPretaxFetch;
  }
  /** Set the SortOrder for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsGuiPretaxSortOrder (Integer value) {
    this.IsGuiPretaxSort = value;
  }
  /** Retrieve SortOrder for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsGuiPretaxSortOrder () {
    return this.IsGuiPretaxSort;
  }
  /** Set the sort direction for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsGuiPretaxSortDirection (boolean ascending) {
    this.IsGuiPretaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsGuiPretaxSortDirection () {
    return this.IsGuiPretaxSortAscending;
  }
  /** Set the field level filters for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsGuiPretaxFilter (BooleanFilter[] value) throws ServiceException {
    this.IsGuiPretax = value;
  }
  /** Retrieve filter for field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsGuiPretaxFilter () {
    return this.IsGuiPretax;
  }

  /**
   * Retrieves the IsGuiPretaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsGuiPretaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsGuiPretaxFilter field
   */
  public String[] getIsGuiPretaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsGuiPretaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsGuiPretaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsGuiPretaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsGuiPretaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsGuiPretaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsGuiPretaxFilter filter value from a formatted string
   *
   * @param _value the IsGuiPretaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsGuiPretaxFilter filter field
   */
  public void setIsGuiPretaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsGuiPretaxFilterFromFormattedString");
    try {
      this.setIsGuiPretaxFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsGuiPretaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsGuiPretaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsGuiPretaxFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @param fetch whether to fetch this field or not
   */
  public void setExcludeChargeFetch (boolean fetch) {
    this.ExcludeChargeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @return boolean the Fetch value for this field
   */
  public boolean getExcludeChargeFetch () {
    return this.ExcludeChargeFetch;
  }
  /** Set the SortOrder for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExcludeChargeSortOrder (Integer value) {
    this.ExcludeChargeSort = value;
  }
  /** Retrieve SortOrder for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExcludeChargeSortOrder () {
    return this.ExcludeChargeSort;
  }
  /** Set the sort direction for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExcludeChargeSortDirection (boolean ascending) {
    this.ExcludeChargeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExcludeChargeSortDirection () {
    return this.ExcludeChargeSortAscending;
  }
  /** Set the field level filters for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExcludeChargeFilter (BooleanFilter[] value) throws ServiceException {
    this.ExcludeCharge = value;
  }
  /** Retrieve filter for field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getExcludeChargeFilter () {
    return this.ExcludeCharge;
  }

  /**
   * Retrieves the ExcludeChargeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExcludeChargeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExcludeChargeFilter field
   */
  public String[] getExcludeChargeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExcludeChargeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExcludeChargeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExcludeChargeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExcludeChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExcludeChargeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExcludeChargeFilter filter value from a formatted string
   *
   * @param _value the ExcludeChargeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExcludeChargeFilter filter field
   */
  public void setExcludeChargeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExcludeChargeFilterFromFormattedString");
    try {
      this.setExcludeChargeFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExcludeChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExcludeChargeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExcludeChargeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @param fetch whether to fetch this field or not
   */
  public void setRoundingMethodFetch (boolean fetch) {
    this.RoundingMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getRoundingMethodFetch () {
    return this.RoundingMethodFetch;
  }
  /** Set the SortOrder for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRoundingMethodSortOrder (Integer value) {
    this.RoundingMethodSort = value;
  }
  /** Retrieve SortOrder for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRoundingMethodSortOrder () {
    return this.RoundingMethodSort;
  }
  /** Set the sort direction for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRoundingMethodSortDirection (boolean ascending) {
    this.RoundingMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRoundingMethodSortDirection () {
    return this.RoundingMethodSortAscending;
  }
  /** Set the field level filters for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRoundingMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.RoundingMethod = value;
  }
  /** Retrieve filter for field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRoundingMethodFilter () {
    return this.RoundingMethod;
  }

  /**
   * Retrieves the RoundingMethodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RoundingMethodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RoundingMethodFilter field
   */
  public String[] getRoundingMethodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingMethodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRoundingMethodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRoundingMethodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RoundingMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRoundingMethodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RoundingMethodFilter filter value from a formatted string
   *
   * @param _value the RoundingMethodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RoundingMethodFilter filter field
   */
  public void setRoundingMethodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRoundingMethodFilterFromFormattedString");
    try {
      this.setRoundingMethodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RoundingMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRoundingMethodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRoundingMethodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeFetch (boolean fetch) {
    this.TaxTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeFetch () {
    return this.TaxTypeFetch;
  }
  /** Set the SortOrder for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeSortOrder (Integer value) {
    this.TaxTypeSort = value;
  }
  /** Retrieve SortOrder for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeSortOrder () {
    return this.TaxTypeSort;
  }
  /** Set the sort direction for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeSortDirection (boolean ascending) {
    this.TaxTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeSortDirection () {
    return this.TaxTypeSortAscending;
  }
  /** Set the field level filters for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxType = value;
  }
  /** Retrieve filter for field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxTypeFilter () {
    return this.TaxType;
  }

  /**
   * Retrieves the TaxTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeFilter field
   */
  public String[] getTaxTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxTypeFilter filter value from a formatted string
   *
   * @param _value the TaxTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxTypeFilter filter field
   */
  public void setTaxTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxTypeFilterFromFormattedString");
    try {
      this.setTaxTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
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

  /** Set the field level Fetch value for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
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

  /** Set the field level Fetch value for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @param fetch whether to fetch this field or not
   */
  public void setIsGraduatedFetch (boolean fetch) {
    this.IsGraduatedFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsGraduatedFetch () {
    return this.IsGraduatedFetch;
  }
  /** Set the SortOrder for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsGraduatedSortOrder (Integer value) {
    this.IsGraduatedSort = value;
  }
  /** Retrieve SortOrder for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsGraduatedSortOrder () {
    return this.IsGraduatedSort;
  }
  /** Set the sort direction for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsGraduatedSortDirection (boolean ascending) {
    this.IsGraduatedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsGraduatedSortDirection () {
    return this.IsGraduatedSortAscending;
  }
  /** Set the field level filters for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsGraduatedFilter (IntegerFilter[] value) throws ServiceException {
    this.IsGraduated = value;
  }
  /** Retrieve filter for field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIsGraduatedFilter () {
    return this.IsGraduated;
  }

  /**
   * Retrieves the IsGraduatedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsGraduatedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsGraduatedFilter field
   */
  public String[] getIsGraduatedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsGraduatedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsGraduatedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsGraduatedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsGraduatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsGraduatedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsGraduatedFilter filter value from a formatted string
   *
   * @param _value the IsGraduatedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsGraduatedFilter filter field
   */
  public void setIsGraduatedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsGraduatedFilterFromFormattedString");
    try {
      this.setIsGraduatedFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsGraduatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsGraduatedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsGraduatedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxZeroChargeFetch (boolean fetch) {
    this.TaxZeroChargeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxZeroChargeFetch () {
    return this.TaxZeroChargeFetch;
  }
  /** Set the SortOrder for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxZeroChargeSortOrder (Integer value) {
    this.TaxZeroChargeSort = value;
  }
  /** Retrieve SortOrder for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxZeroChargeSortOrder () {
    return this.TaxZeroChargeSort;
  }
  /** Set the sort direction for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxZeroChargeSortDirection (boolean ascending) {
    this.TaxZeroChargeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxZeroChargeSortDirection () {
    return this.TaxZeroChargeSortAscending;
  }
  /** Set the field level filters for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxZeroChargeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxZeroCharge = value;
  }
  /** Retrieve filter for field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxZeroChargeFilter () {
    return this.TaxZeroCharge;
  }

  /**
   * Retrieves the TaxZeroChargeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxZeroChargeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxZeroChargeFilter field
   */
  public String[] getTaxZeroChargeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxZeroChargeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxZeroChargeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxZeroChargeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxZeroChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxZeroChargeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxZeroChargeFilter filter value from a formatted string
   *
   * @param _value the TaxZeroChargeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxZeroChargeFilter filter field
   */
  public void setTaxZeroChargeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxZeroChargeFilterFromFormattedString");
    try {
      this.setTaxZeroChargeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxZeroChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxZeroChargeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxZeroChargeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @param fetch whether to fetch this field or not
   */
  public void setRoundingFactorFetch (boolean fetch) {
    this.RoundingFactorFetch = fetch;
  }
  /** Retrieve Fetch value for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @return boolean the Fetch value for this field
   */
  public boolean getRoundingFactorFetch () {
    return this.RoundingFactorFetch;
  }
  /** Set the SortOrder for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRoundingFactorSortOrder (Integer value) {
    this.RoundingFactorSort = value;
  }
  /** Retrieve SortOrder for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRoundingFactorSortOrder () {
    return this.RoundingFactorSort;
  }
  /** Set the sort direction for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRoundingFactorSortDirection (boolean ascending) {
    this.RoundingFactorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRoundingFactorSortDirection () {
    return this.RoundingFactorSortAscending;
  }
  /** Set the field level filters for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRoundingFactorFilter (IntegerFilter[] value) throws ServiceException {
    this.RoundingFactor = value;
  }
  /** Retrieve filter for field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRoundingFactorFilter () {
    return this.RoundingFactor;
  }

  /**
   * Retrieves the RoundingFactorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RoundingFactorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RoundingFactorFilter field
   */
  public String[] getRoundingFactorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingFactorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRoundingFactorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRoundingFactorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RoundingFactorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRoundingFactorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RoundingFactorFilter filter value from a formatted string
   *
   * @param _value the RoundingFactorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RoundingFactorFilter filter field
   */
  public void setRoundingFactorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRoundingFactorFilterFromFormattedString");
    try {
      this.setRoundingFactorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RoundingFactorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRoundingFactorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRoundingFactorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @param fetch whether to fetch this field or not
   */
  public void setBinRoundingFetch (boolean fetch) {
    this.BinRoundingFetch = fetch;
  }
  /** Retrieve Fetch value for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @return boolean the Fetch value for this field
   */
  public boolean getBinRoundingFetch () {
    return this.BinRoundingFetch;
  }
  /** Set the SortOrder for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBinRoundingSortOrder (Integer value) {
    this.BinRoundingSort = value;
  }
  /** Retrieve SortOrder for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBinRoundingSortOrder () {
    return this.BinRoundingSort;
  }
  /** Set the sort direction for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBinRoundingSortDirection (boolean ascending) {
    this.BinRoundingSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBinRoundingSortDirection () {
    return this.BinRoundingSortAscending;
  }
  /** Set the field level filters for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBinRoundingFilter (BooleanFilter[] value) throws ServiceException {
    this.BinRounding = value;
  }
  /** Retrieve filter for field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getBinRoundingFilter () {
    return this.BinRounding;
  }

  /**
   * Retrieves the BinRoundingFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BinRoundingFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BinRoundingFilter field
   */
  public String[] getBinRoundingFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBinRoundingFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBinRoundingFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBinRoundingFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BinRoundingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBinRoundingFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BinRoundingFilter filter value from a formatted string
   *
   * @param _value the BinRoundingFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BinRoundingFilter filter field
   */
  public void setBinRoundingFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBinRoundingFilterFromFormattedString");
    try {
      this.setBinRoundingFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BinRoundingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBinRoundingFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBinRoundingFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @param fetch whether to fetch this field or not
   */
  public void setIsLateFeeExemptFetch (boolean fetch) {
    this.IsLateFeeExemptFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsLateFeeExemptFetch () {
    return this.IsLateFeeExemptFetch;
  }
  /** Set the SortOrder for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsLateFeeExemptSortOrder (Integer value) {
    this.IsLateFeeExemptSort = value;
  }
  /** Retrieve SortOrder for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsLateFeeExemptSortOrder () {
    return this.IsLateFeeExemptSort;
  }
  /** Set the sort direction for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsLateFeeExemptSortDirection (boolean ascending) {
    this.IsLateFeeExemptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsLateFeeExemptSortDirection () {
    return this.IsLateFeeExemptSortAscending;
  }
  /** Set the field level filters for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsLateFeeExemptFilter (BooleanFilter[] value) throws ServiceException {
    this.IsLateFeeExempt = value;
  }
  /** Retrieve filter for field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsLateFeeExemptFilter () {
    return this.IsLateFeeExempt;
  }

  /**
   * Retrieves the IsLateFeeExemptFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsLateFeeExemptFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsLateFeeExemptFilter field
   */
  public String[] getIsLateFeeExemptFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsLateFeeExemptFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsLateFeeExemptFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsLateFeeExemptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsLateFeeExemptFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsLateFeeExemptFilter filter value from a formatted string
   *
   * @param _value the IsLateFeeExemptFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsLateFeeExemptFilter filter field
   */
  public void setIsLateFeeExemptFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsLateFeeExemptFilterFromFormattedString");
    try {
      this.setIsLateFeeExemptFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsLateFeeExemptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsLateFeeExemptFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsLateFeeExemptFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInclusiveFetch (boolean fetch) {
    this.IsInclusiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInclusiveFetch () {
    return this.IsInclusiveFetch;
  }
  /** Set the SortOrder for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInclusiveSortOrder (Integer value) {
    this.IsInclusiveSort = value;
  }
  /** Retrieve SortOrder for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInclusiveSortOrder () {
    return this.IsInclusiveSort;
  }
  /** Set the sort direction for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInclusiveSortDirection (boolean ascending) {
    this.IsInclusiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInclusiveSortDirection () {
    return this.IsInclusiveSortAscending;
  }
  /** Set the field level filters for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInclusiveFilter (IntegerFilter[] value) throws ServiceException {
    this.IsInclusive = value;
  }
  /** Retrieve filter for field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIsInclusiveFilter () {
    return this.IsInclusive;
  }

  /**
   * Retrieves the IsInclusiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsInclusiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInclusiveFilter field
   */
  public String[] getIsInclusiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInclusiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsInclusiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInclusiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInclusiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInclusiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsInclusiveFilter filter value from a formatted string
   *
   * @param _value the IsInclusiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsInclusiveFilter filter field
   */
  public void setIsInclusiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsInclusiveFilterFromFormattedString");
    try {
      this.setIsInclusiveFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInclusiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInclusiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInclusiveFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
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

  /** Set the field level Fetch value for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
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
    return TPIObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TPIObjectHelper.toMap(this, null);
  }
}
