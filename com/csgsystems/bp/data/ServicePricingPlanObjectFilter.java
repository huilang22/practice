/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServicePricingPlanObjectFilter.java
 * Definition File: Admin/ServicePricingPlan.xml
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
public class ServicePricingPlanObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ServicePricingPlanObjectKeyFilter Key = null;
  /** raw field for: EMF_CONFIG_ID_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: EMF_CONFIG_ID_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  /** raw field for: EMF_CONFIG_ID_VALUES.format_display) */
  public    StringFilter[] FormatDisplay  = null;
  protected boolean FormatDisplayFetch = false;
  protected boolean FormatDisplaySortAscending = true;
  protected boolean FormatDisplayCaseInsensitive = false;
  protected Integer FormatDisplaySort = null;
  /** raw field for: EMF_CONFIG_ID_REF.default_external_id_type) */
  public    IntegerFilter[] DefaultExternalIdType  = null;
  protected boolean DefaultExternalIdTypeFetch = false;
  protected boolean DefaultExternalIdTypeSortAscending = true;
  protected Integer DefaultExternalIdTypeSort = null;
  /** raw field for: EMF_CONFIG_ID_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: EMF_CONFIG_ID_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: EMF_CONFIG_ID_REF.is_serviceability_applicable) */
  public    BooleanFilter[] IsServiceabilityApplicable  = null;
  protected boolean IsServiceabilityApplicableFetch = false;
  protected boolean IsServiceabilityApplicableSortAscending = true;
  protected Integer IsServiceabilityApplicableSort = null;
  /** raw field for: EMF_CONFIG_ID_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: EMF_CONFIGURATION.emf_type) */
  public    IntegerFilter[] EmfType  = null;
  protected boolean EmfTypeFetch = false;
  protected boolean EmfTypeSortAscending = true;
  protected Integer EmfTypeSort = null;
  /** raw field for: EMF_CONFIGURATION.equip_type_code) */
  public    IntegerFilter[] EquipTypeCode  = null;
  protected boolean EquipTypeCodeFetch = false;
  protected boolean EquipTypeCodeSortAscending = true;
  protected Integer EquipTypeCodeSort = null;
  /** raw field for: EMF_CONFIGURATION.equip_class_code) */
  public    IntegerFilter[] EquipClassCode  = null;
  protected boolean EquipClassCodeFetch = false;
  protected boolean EquipClassCodeSortAscending = true;
  protected Integer EquipClassCodeSort = null;
  /** raw field for: EMF_CONFIGURATION.class_of_service_code) */
  public    IntegerFilter[] ClassOfServiceCode  = null;
  protected boolean ClassOfServiceCodeFetch = false;
  protected boolean ClassOfServiceCodeSortAscending = true;
  protected Integer ClassOfServiceCodeSort = null;
  /** raw field for: EMF_CONFIGURATION.rate_class) */
  public    IntegerFilter[] RateClass  = null;
  protected boolean RateClassFetch = false;
  protected boolean RateClassSortAscending = true;
  protected Integer RateClassSort = null;
  /** raw field for: EMF_CONFIGURATION.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: EMF_CONFIGURATION.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: EMF_CONFIGURATION.emf_book_id) */
  public    IntegerFilter[] EmfBookId  = null;
  protected boolean EmfBookIdFetch = false;
  protected boolean EmfBookIdSortAscending = true;
  protected Integer EmfBookIdSort = null;
  /** raw field for: EMF_CONFIGURATION.industry_type) */
  public    IntegerFilter[] IndustryType  = null;
  protected boolean IndustryTypeFetch = false;
  protected boolean IndustryTypeSortAscending = true;
  protected Integer IndustryTypeSort = null;
  /** raw field for: INDUSTRY_TYPE_REF.use_address_server) */
  public    BooleanFilter[] UseAddressServer  = null;
  protected boolean UseAddressServerFetch = false;
  protected boolean UseAddressServerSortAscending = true;
  protected Integer UseAddressServerSort = null;
  /** raw field for: INDUSTRY_TYPE_REF.is_e911_required) */
  public    BooleanFilter[] IsE911Required  = null;
  protected boolean IsE911RequiredFetch = false;
  protected boolean IsE911RequiredSortAscending = true;
  protected Integer IsE911RequiredSort = null;
  /** raw field for: INDUSTRY_TYPE_REF.is_lidb_required) */
  public    BooleanFilter[] IsLidbRequired  = null;
  protected boolean IsLidbRequiredFetch = false;
  protected boolean IsLidbRequiredSortAscending = true;
  protected Integer IsLidbRequiredSort = null;
  /** raw field for: INDUSTRY_TYPE_REF.is_pic_required) */
  public    BooleanFilter[] IsPicRequired  = null;
  protected boolean IsPicRequiredFetch = false;
  protected boolean IsPicRequiredSortAscending = true;
  protected Integer IsPicRequiredSort = null;
  /** raw field for: INDUSTRY_TYPE_REF.is_dadl_used) */
  public    BooleanFilter[] IsDadlUsed  = null;
  protected boolean IsDadlUsedFetch = false;
  protected boolean IsDadlUsedSortAscending = true;
  protected Integer IsDadlUsedSort = null;
  /** raw field for: INDUSTRY_TYPE_REF.is_calling_card_used) */
  public    BooleanFilter[] IsCallingCardUsed  = null;
  protected boolean IsCallingCardUsedFetch = false;
  protected boolean IsCallingCardUsedSortAscending = true;
  protected Integer IsCallingCardUsedSort = null;
  private String _objName = "ServicePricingPlanObjectFilter";
  /** default constructor */
  public ServicePricingPlanObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ServicePricingPlanObjectFilter (ServicePricingPlanObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ServicePricingPlanObjectKeyFilter (other.Key);
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
    this.FormatDisplay = other.FormatDisplay;
    this.FormatDisplayFetch = other.FormatDisplayFetch;
    this.FormatDisplaySort = other.FormatDisplaySort;
    this.FormatDisplayCaseInsensitive = other.FormatDisplayCaseInsensitive;
    this.FormatDisplaySortAscending = other.FormatDisplaySortAscending;
    this.DefaultExternalIdType = other.DefaultExternalIdType;
    this.DefaultExternalIdTypeFetch = other.DefaultExternalIdTypeFetch;
    this.DefaultExternalIdTypeSort = other.DefaultExternalIdTypeSort;
    this.DefaultExternalIdTypeSortAscending = other.DefaultExternalIdTypeSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.IsServiceabilityApplicable = other.IsServiceabilityApplicable;
    this.IsServiceabilityApplicableFetch = other.IsServiceabilityApplicableFetch;
    this.IsServiceabilityApplicableSort = other.IsServiceabilityApplicableSort;
    this.IsServiceabilityApplicableSortAscending = other.IsServiceabilityApplicableSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.EmfType = other.EmfType;
    this.EmfTypeFetch = other.EmfTypeFetch;
    this.EmfTypeSort = other.EmfTypeSort;
    this.EmfTypeSortAscending = other.EmfTypeSortAscending;
    this.EquipTypeCode = other.EquipTypeCode;
    this.EquipTypeCodeFetch = other.EquipTypeCodeFetch;
    this.EquipTypeCodeSort = other.EquipTypeCodeSort;
    this.EquipTypeCodeSortAscending = other.EquipTypeCodeSortAscending;
    this.EquipClassCode = other.EquipClassCode;
    this.EquipClassCodeFetch = other.EquipClassCodeFetch;
    this.EquipClassCodeSort = other.EquipClassCodeSort;
    this.EquipClassCodeSortAscending = other.EquipClassCodeSortAscending;
    this.ClassOfServiceCode = other.ClassOfServiceCode;
    this.ClassOfServiceCodeFetch = other.ClassOfServiceCodeFetch;
    this.ClassOfServiceCodeSort = other.ClassOfServiceCodeSort;
    this.ClassOfServiceCodeSortAscending = other.ClassOfServiceCodeSortAscending;
    this.RateClass = other.RateClass;
    this.RateClassFetch = other.RateClassFetch;
    this.RateClassSort = other.RateClassSort;
    this.RateClassSortAscending = other.RateClassSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.EmfBookId = other.EmfBookId;
    this.EmfBookIdFetch = other.EmfBookIdFetch;
    this.EmfBookIdSort = other.EmfBookIdSort;
    this.EmfBookIdSortAscending = other.EmfBookIdSortAscending;
    this.IndustryType = other.IndustryType;
    this.IndustryTypeFetch = other.IndustryTypeFetch;
    this.IndustryTypeSort = other.IndustryTypeSort;
    this.IndustryTypeSortAscending = other.IndustryTypeSortAscending;
    this.UseAddressServer = other.UseAddressServer;
    this.UseAddressServerFetch = other.UseAddressServerFetch;
    this.UseAddressServerSort = other.UseAddressServerSort;
    this.UseAddressServerSortAscending = other.UseAddressServerSortAscending;
    this.IsE911Required = other.IsE911Required;
    this.IsE911RequiredFetch = other.IsE911RequiredFetch;
    this.IsE911RequiredSort = other.IsE911RequiredSort;
    this.IsE911RequiredSortAscending = other.IsE911RequiredSortAscending;
    this.IsLidbRequired = other.IsLidbRequired;
    this.IsLidbRequiredFetch = other.IsLidbRequiredFetch;
    this.IsLidbRequiredSort = other.IsLidbRequiredSort;
    this.IsLidbRequiredSortAscending = other.IsLidbRequiredSortAscending;
    this.IsPicRequired = other.IsPicRequired;
    this.IsPicRequiredFetch = other.IsPicRequiredFetch;
    this.IsPicRequiredSort = other.IsPicRequiredSort;
    this.IsPicRequiredSortAscending = other.IsPicRequiredSortAscending;
    this.IsDadlUsed = other.IsDadlUsed;
    this.IsDadlUsedFetch = other.IsDadlUsedFetch;
    this.IsDadlUsedSort = other.IsDadlUsedSort;
    this.IsDadlUsedSortAscending = other.IsDadlUsedSortAscending;
    this.IsCallingCardUsed = other.IsCallingCardUsed;
    this.IsCallingCardUsedFetch = other.IsCallingCardUsedFetch;
    this.IsCallingCardUsedSort = other.IsCallingCardUsedSort;
    this.IsCallingCardUsedSortAscending = other.IsCallingCardUsedSortAscending;  }
  /** get the filter for this object's key
   * @return ServicePricingPlanObjectKeyFilter
   */
  public ServicePricingPlanObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ServicePricingPlanObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEmfConfigIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.EmfConfigIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmfConfigIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.EmfConfigIdFetch;
  }
  /** Set the SortOrder for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmfConfigIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.EmfConfigIdSort = value;
  }
  /** Retrieve SortOrder for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmfConfigIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.EmfConfigIdSort;
  }
  /** Set the sort direction for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmfConfigIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.EmfConfigIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmfConfigIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.EmfConfigIdSortAscending;
  }
  /** Set the field level filters for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmfConfigIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.EmfConfigId = value;
  }
  /** Retrieve filter for field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEmfConfigIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.EmfConfigId;
  }
  /** Set the field level Fetch value for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
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

  /** Set the field level Fetch value for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
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

  /** Set the field level Fetch value for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @param fetch whether to fetch this field or not
   */
  public void setFormatDisplayFetch (boolean fetch) {
    this.FormatDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getFormatDisplayFetch () {
    return this.FormatDisplayFetch;
  }
  /** Set the SortOrder for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFormatDisplaySortOrder (Integer value) {
    this.FormatDisplaySort = value;
  }
  /** Retrieve SortOrder for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFormatDisplaySortOrder () {
    return this.FormatDisplaySort;
  }
  /** Set the sort direction for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFormatDisplaySortDirection (boolean ascending) {
    this.FormatDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFormatDisplaySortDirection () {
    return this.FormatDisplaySortAscending;
  }
  /** Set the case insensitive for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFormatDisplayCaseInsensitive (boolean ascending) {
    this.FormatDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFormatDisplayCaseInsensitive () {
    return this.FormatDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFormatDisplayFilter (StringFilter[] value) throws ServiceException {
    this.FormatDisplay = value;
  }
  /** Retrieve filter for field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFormatDisplayFilter () {
    return this.FormatDisplay;
  }

  /**
   * Retrieves the FormatDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FormatDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatDisplayFilter field
   */
  public String[] getFormatDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFormatDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FormatDisplayFilter filter value from a formatted string
   *
   * @param _value the FormatDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FormatDisplayFilter filter field
   */
  public void setFormatDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFormatDisplayFilterFromFormattedString");
    try {
      this.setFormatDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setDefaultExternalIdTypeFetch (boolean fetch) {
    this.DefaultExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getDefaultExternalIdTypeFetch () {
    return this.DefaultExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDefaultExternalIdTypeSortOrder (Integer value) {
    this.DefaultExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDefaultExternalIdTypeSortOrder () {
    return this.DefaultExternalIdTypeSort;
  }
  /** Set the sort direction for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDefaultExternalIdTypeSortDirection (boolean ascending) {
    this.DefaultExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDefaultExternalIdTypeSortDirection () {
    return this.DefaultExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDefaultExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.DefaultExternalIdType = value;
  }
  /** Retrieve filter for field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDefaultExternalIdTypeFilter () {
    return this.DefaultExternalIdType;
  }

  /**
   * Retrieves the DefaultExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DefaultExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DefaultExternalIdTypeFilter field
   */
  public String[] getDefaultExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDefaultExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDefaultExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DefaultExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDefaultExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DefaultExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the DefaultExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DefaultExternalIdTypeFilter filter field
   */
  public void setDefaultExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDefaultExternalIdTypeFilterFromFormattedString");
    try {
      this.setDefaultExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DefaultExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDefaultExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDefaultExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (EMF_CONFIG_ID_REF.is_default)
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

  /** Set the field level Fetch value for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
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

  /** Set the field level Fetch value for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsServiceabilityApplicableFetch (boolean fetch) {
    this.IsServiceabilityApplicableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsServiceabilityApplicableFetch () {
    return this.IsServiceabilityApplicableFetch;
  }
  /** Set the SortOrder for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsServiceabilityApplicableSortOrder (Integer value) {
    this.IsServiceabilityApplicableSort = value;
  }
  /** Retrieve SortOrder for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsServiceabilityApplicableSortOrder () {
    return this.IsServiceabilityApplicableSort;
  }
  /** Set the sort direction for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsServiceabilityApplicableSortDirection (boolean ascending) {
    this.IsServiceabilityApplicableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsServiceabilityApplicableSortDirection () {
    return this.IsServiceabilityApplicableSortAscending;
  }
  /** Set the field level filters for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsServiceabilityApplicableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsServiceabilityApplicable = value;
  }
  /** Retrieve filter for field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsServiceabilityApplicableFilter () {
    return this.IsServiceabilityApplicable;
  }

  /**
   * Retrieves the IsServiceabilityApplicableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsServiceabilityApplicableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsServiceabilityApplicableFilter field
   */
  public String[] getIsServiceabilityApplicableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsServiceabilityApplicableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsServiceabilityApplicableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsServiceabilityApplicableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsServiceabilityApplicableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsServiceabilityApplicableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsServiceabilityApplicableFilter filter value from a formatted string
   *
   * @param _value the IsServiceabilityApplicableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsServiceabilityApplicableFilter filter field
   */
  public void setIsServiceabilityApplicableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsServiceabilityApplicableFilterFromFormattedString");
    try {
      this.setIsServiceabilityApplicableFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsServiceabilityApplicableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsServiceabilityApplicableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsServiceabilityApplicableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: EmfType (EMF_CONFIGURATION.emf_type)
   * @param fetch whether to fetch this field or not
   */
  public void setEmfTypeFetch (boolean fetch) {
    this.EmfTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmfType (EMF_CONFIGURATION.emf_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmfTypeFetch () {
    return this.EmfTypeFetch;
  }
  /** Set the SortOrder for field: EmfType (EMF_CONFIGURATION.emf_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmfTypeSortOrder (Integer value) {
    this.EmfTypeSort = value;
  }
  /** Retrieve SortOrder for field: EmfType (EMF_CONFIGURATION.emf_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmfTypeSortOrder () {
    return this.EmfTypeSort;
  }
  /** Set the sort direction for field: EmfType (EMF_CONFIGURATION.emf_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmfTypeSortDirection (boolean ascending) {
    this.EmfTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmfType (EMF_CONFIGURATION.emf_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmfTypeSortDirection () {
    return this.EmfTypeSortAscending;
  }
  /** Set the field level filters for field: EmfType (EMF_CONFIGURATION.emf_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmfTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.EmfType = value;
  }
  /** Retrieve filter for field: EmfType (EMF_CONFIGURATION.emf_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEmfTypeFilter () {
    return this.EmfType;
  }

  /**
   * Retrieves the EmfTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EmfTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfTypeFilter field
   */
  public String[] getEmfTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEmfTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EmfTypeFilter filter value from a formatted string
   *
   * @param _value the EmfTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EmfTypeFilter filter field
   */
  public void setEmfTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEmfTypeFilterFromFormattedString");
    try {
      this.setEmfTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipTypeCodeFetch (boolean fetch) {
    this.EquipTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipTypeCodeFetch () {
    return this.EquipTypeCodeFetch;
  }
  /** Set the SortOrder for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipTypeCodeSortOrder (Integer value) {
    this.EquipTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipTypeCodeSortOrder () {
    return this.EquipTypeCodeSort;
  }
  /** Set the sort direction for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipTypeCodeSortDirection (boolean ascending) {
    this.EquipTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipTypeCodeSortDirection () {
    return this.EquipTypeCodeSortAscending;
  }
  /** Set the field level filters for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipTypeCode = value;
  }
  /** Retrieve filter for field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipTypeCodeFilter () {
    return this.EquipTypeCode;
  }

  /**
   * Retrieves the EquipTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipTypeCodeFilter field
   */
  public String[] getEquipTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipTypeCodeFilter filter value from a formatted string
   *
   * @param _value the EquipTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipTypeCodeFilter filter field
   */
  public void setEquipTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
    try {
      this.setEquipTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipClassCodeFetch (boolean fetch) {
    this.EquipClassCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipClassCodeFetch () {
    return this.EquipClassCodeFetch;
  }
  /** Set the SortOrder for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipClassCodeSortOrder (Integer value) {
    this.EquipClassCodeSort = value;
  }
  /** Retrieve SortOrder for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipClassCodeSortOrder () {
    return this.EquipClassCodeSort;
  }
  /** Set the sort direction for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipClassCodeSortDirection (boolean ascending) {
    this.EquipClassCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipClassCodeSortDirection () {
    return this.EquipClassCodeSortAscending;
  }
  /** Set the field level filters for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipClassCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipClassCode = value;
  }
  /** Retrieve filter for field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipClassCodeFilter () {
    return this.EquipClassCode;
  }

  /**
   * Retrieves the EquipClassCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipClassCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipClassCodeFilter field
   */
  public String[] getEquipClassCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipClassCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipClassCodeFilter filter value from a formatted string
   *
   * @param _value the EquipClassCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipClassCodeFilter filter field
   */
  public void setEquipClassCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
    try {
      this.setEquipClassCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @param fetch whether to fetch this field or not
   */
  public void setClassOfServiceCodeFetch (boolean fetch) {
    this.ClassOfServiceCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getClassOfServiceCodeFetch () {
    return this.ClassOfServiceCodeFetch;
  }
  /** Set the SortOrder for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClassOfServiceCodeSortOrder (Integer value) {
    this.ClassOfServiceCodeSort = value;
  }
  /** Retrieve SortOrder for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClassOfServiceCodeSortOrder () {
    return this.ClassOfServiceCodeSort;
  }
  /** Set the sort direction for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClassOfServiceCodeSortDirection (boolean ascending) {
    this.ClassOfServiceCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClassOfServiceCodeSortDirection () {
    return this.ClassOfServiceCodeSortAscending;
  }
  /** Set the field level filters for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClassOfServiceCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ClassOfServiceCode = value;
  }
  /** Retrieve filter for field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getClassOfServiceCodeFilter () {
    return this.ClassOfServiceCode;
  }

  /**
   * Retrieves the ClassOfServiceCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClassOfServiceCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClassOfServiceCodeFilter field
   */
  public String[] getClassOfServiceCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getClassOfServiceCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ClassOfServiceCodeFilter filter value from a formatted string
   *
   * @param _value the ClassOfServiceCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ClassOfServiceCodeFilter filter field
   */
  public void setClassOfServiceCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
    try {
      this.setClassOfServiceCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateClass (EMF_CONFIGURATION.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch) {
    this.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (EMF_CONFIGURATION.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch () {
    return this.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (EMF_CONFIGURATION.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value) {
    this.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (EMF_CONFIGURATION.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder () {
    return this.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (EMF_CONFIGURATION.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending) {
    this.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (EMF_CONFIGURATION.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection () {
    return this.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (EMF_CONFIGURATION.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (EMF_CONFIGURATION.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter () {
    return this.RateClass;
  }

  /**
   * Retrieves the RateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassFilter field
   */
  public String[] getRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassFilter filter value from a formatted string
   *
   * @param _value the RateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromFormattedString");
    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDtFilter () {
    return this.ActiveDt;
  }

  /**
   * Retrieves the ActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDtFilter field
   */
  public String[] getActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDtFilter filter value from a formatted string
   *
   * @param _value the ActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDtFilter filter field
   */
  public void setActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFilterFromFormattedString");
    try {
      this.setActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDtFilter field
   */
  public String[] getActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDtFilter filter value from a formatted string
   *
   * @param _value the ActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDtFilter filter field
   */
  public void setActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDtFilter () {
    return this.InactiveDt;
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEmfBookIdFetch (boolean fetch) {
    this.EmfBookIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmfBookIdFetch () {
    return this.EmfBookIdFetch;
  }
  /** Set the SortOrder for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmfBookIdSortOrder (Integer value) {
    this.EmfBookIdSort = value;
  }
  /** Retrieve SortOrder for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmfBookIdSortOrder () {
    return this.EmfBookIdSort;
  }
  /** Set the sort direction for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmfBookIdSortDirection (boolean ascending) {
    this.EmfBookIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmfBookIdSortDirection () {
    return this.EmfBookIdSortAscending;
  }
  /** Set the field level filters for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmfBookIdFilter (IntegerFilter[] value) throws ServiceException {
    this.EmfBookId = value;
  }
  /** Retrieve filter for field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEmfBookIdFilter () {
    return this.EmfBookId;
  }

  /**
   * Retrieves the EmfBookIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EmfBookIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfBookIdFilter field
   */
  public String[] getEmfBookIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfBookIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEmfBookIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfBookIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfBookIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfBookIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EmfBookIdFilter filter value from a formatted string
   *
   * @param _value the EmfBookIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EmfBookIdFilter filter field
   */
  public void setEmfBookIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEmfBookIdFilterFromFormattedString");
    try {
      this.setEmfBookIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfBookIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfBookIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfBookIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * @param fetch whether to fetch this field or not
   */
  public void setIndustryTypeFetch (boolean fetch) {
    this.IndustryTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getIndustryTypeFetch () {
    return this.IndustryTypeFetch;
  }
  /** Set the SortOrder for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIndustryTypeSortOrder (Integer value) {
    this.IndustryTypeSort = value;
  }
  /** Retrieve SortOrder for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIndustryTypeSortOrder () {
    return this.IndustryTypeSort;
  }
  /** Set the sort direction for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIndustryTypeSortDirection (boolean ascending) {
    this.IndustryTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIndustryTypeSortDirection () {
    return this.IndustryTypeSortAscending;
  }
  /** Set the field level filters for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIndustryTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.IndustryType = value;
  }
  /** Retrieve filter for field: IndustryType (EMF_CONFIGURATION.industry_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIndustryTypeFilter () {
    return this.IndustryType;
  }

  /**
   * Retrieves the IndustryTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IndustryTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IndustryTypeFilter field
   */
  public String[] getIndustryTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIndustryTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIndustryTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIndustryTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IndustryTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIndustryTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IndustryTypeFilter filter value from a formatted string
   *
   * @param _value the IndustryTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IndustryTypeFilter filter field
   */
  public void setIndustryTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIndustryTypeFilterFromFormattedString");
    try {
      this.setIndustryTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IndustryTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIndustryTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIndustryTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @param fetch whether to fetch this field or not
   */
  public void setUseAddressServerFetch (boolean fetch) {
    this.UseAddressServerFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseAddressServerFetch () {
    return this.UseAddressServerFetch;
  }
  /** Set the SortOrder for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseAddressServerSortOrder (Integer value) {
    this.UseAddressServerSort = value;
  }
  /** Retrieve SortOrder for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseAddressServerSortOrder () {
    return this.UseAddressServerSort;
  }
  /** Set the sort direction for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseAddressServerSortDirection (boolean ascending) {
    this.UseAddressServerSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseAddressServerSortDirection () {
    return this.UseAddressServerSortAscending;
  }
  /** Set the field level filters for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseAddressServerFilter (BooleanFilter[] value) throws ServiceException {
    this.UseAddressServer = value;
  }
  /** Retrieve filter for field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getUseAddressServerFilter () {
    return this.UseAddressServer;
  }

  /**
   * Retrieves the UseAddressServerFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseAddressServerFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseAddressServerFilter field
   */
  public String[] getUseAddressServerFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseAddressServerFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseAddressServerFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseAddressServerFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseAddressServerFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseAddressServerFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseAddressServerFilter filter value from a formatted string
   *
   * @param _value the UseAddressServerFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseAddressServerFilter filter field
   */
  public void setUseAddressServerFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseAddressServerFilterFromFormattedString");
    try {
      this.setUseAddressServerFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseAddressServerFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseAddressServerFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseAddressServerFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @param fetch whether to fetch this field or not
   */
  public void setIsE911RequiredFetch (boolean fetch) {
    this.IsE911RequiredFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsE911RequiredFetch () {
    return this.IsE911RequiredFetch;
  }
  /** Set the SortOrder for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsE911RequiredSortOrder (Integer value) {
    this.IsE911RequiredSort = value;
  }
  /** Retrieve SortOrder for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsE911RequiredSortOrder () {
    return this.IsE911RequiredSort;
  }
  /** Set the sort direction for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsE911RequiredSortDirection (boolean ascending) {
    this.IsE911RequiredSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsE911RequiredSortDirection () {
    return this.IsE911RequiredSortAscending;
  }
  /** Set the field level filters for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsE911RequiredFilter (BooleanFilter[] value) throws ServiceException {
    this.IsE911Required = value;
  }
  /** Retrieve filter for field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsE911RequiredFilter () {
    return this.IsE911Required;
  }

  /**
   * Retrieves the IsE911RequiredFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsE911RequiredFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsE911RequiredFilter field
   */
  public String[] getIsE911RequiredFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsE911RequiredFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsE911RequiredFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsE911RequiredFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsE911RequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsE911RequiredFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsE911RequiredFilter filter value from a formatted string
   *
   * @param _value the IsE911RequiredFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsE911RequiredFilter filter field
   */
  public void setIsE911RequiredFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsE911RequiredFilterFromFormattedString");
    try {
      this.setIsE911RequiredFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsE911RequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsE911RequiredFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsE911RequiredFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @param fetch whether to fetch this field or not
   */
  public void setIsLidbRequiredFetch (boolean fetch) {
    this.IsLidbRequiredFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsLidbRequiredFetch () {
    return this.IsLidbRequiredFetch;
  }
  /** Set the SortOrder for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsLidbRequiredSortOrder (Integer value) {
    this.IsLidbRequiredSort = value;
  }
  /** Retrieve SortOrder for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsLidbRequiredSortOrder () {
    return this.IsLidbRequiredSort;
  }
  /** Set the sort direction for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsLidbRequiredSortDirection (boolean ascending) {
    this.IsLidbRequiredSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsLidbRequiredSortDirection () {
    return this.IsLidbRequiredSortAscending;
  }
  /** Set the field level filters for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsLidbRequiredFilter (BooleanFilter[] value) throws ServiceException {
    this.IsLidbRequired = value;
  }
  /** Retrieve filter for field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsLidbRequiredFilter () {
    return this.IsLidbRequired;
  }

  /**
   * Retrieves the IsLidbRequiredFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsLidbRequiredFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsLidbRequiredFilter field
   */
  public String[] getIsLidbRequiredFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLidbRequiredFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsLidbRequiredFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsLidbRequiredFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsLidbRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsLidbRequiredFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsLidbRequiredFilter filter value from a formatted string
   *
   * @param _value the IsLidbRequiredFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsLidbRequiredFilter filter field
   */
  public void setIsLidbRequiredFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsLidbRequiredFilterFromFormattedString");
    try {
      this.setIsLidbRequiredFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsLidbRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsLidbRequiredFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsLidbRequiredFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @param fetch whether to fetch this field or not
   */
  public void setIsPicRequiredFetch (boolean fetch) {
    this.IsPicRequiredFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsPicRequiredFetch () {
    return this.IsPicRequiredFetch;
  }
  /** Set the SortOrder for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsPicRequiredSortOrder (Integer value) {
    this.IsPicRequiredSort = value;
  }
  /** Retrieve SortOrder for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsPicRequiredSortOrder () {
    return this.IsPicRequiredSort;
  }
  /** Set the sort direction for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsPicRequiredSortDirection (boolean ascending) {
    this.IsPicRequiredSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsPicRequiredSortDirection () {
    return this.IsPicRequiredSortAscending;
  }
  /** Set the field level filters for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsPicRequiredFilter (BooleanFilter[] value) throws ServiceException {
    this.IsPicRequired = value;
  }
  /** Retrieve filter for field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsPicRequiredFilter () {
    return this.IsPicRequired;
  }

  /**
   * Retrieves the IsPicRequiredFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsPicRequiredFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPicRequiredFilter field
   */
  public String[] getIsPicRequiredFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPicRequiredFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsPicRequiredFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPicRequiredFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPicRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPicRequiredFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsPicRequiredFilter filter value from a formatted string
   *
   * @param _value the IsPicRequiredFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsPicRequiredFilter filter field
   */
  public void setIsPicRequiredFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsPicRequiredFilterFromFormattedString");
    try {
      this.setIsPicRequiredFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPicRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPicRequiredFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPicRequiredFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDadlUsedFetch (boolean fetch) {
    this.IsDadlUsedFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDadlUsedFetch () {
    return this.IsDadlUsedFetch;
  }
  /** Set the SortOrder for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDadlUsedSortOrder (Integer value) {
    this.IsDadlUsedSort = value;
  }
  /** Retrieve SortOrder for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDadlUsedSortOrder () {
    return this.IsDadlUsedSort;
  }
  /** Set the sort direction for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDadlUsedSortDirection (boolean ascending) {
    this.IsDadlUsedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDadlUsedSortDirection () {
    return this.IsDadlUsedSortAscending;
  }
  /** Set the field level filters for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDadlUsedFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDadlUsed = value;
  }
  /** Retrieve filter for field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDadlUsedFilter () {
    return this.IsDadlUsed;
  }

  /**
   * Retrieves the IsDadlUsedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDadlUsedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDadlUsedFilter field
   */
  public String[] getIsDadlUsedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDadlUsedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDadlUsedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDadlUsedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDadlUsedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDadlUsedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDadlUsedFilter filter value from a formatted string
   *
   * @param _value the IsDadlUsedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDadlUsedFilter filter field
   */
  public void setIsDadlUsedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDadlUsedFilterFromFormattedString");
    try {
      this.setIsDadlUsedFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDadlUsedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDadlUsedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDadlUsedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @param fetch whether to fetch this field or not
   */
  public void setIsCallingCardUsedFetch (boolean fetch) {
    this.IsCallingCardUsedFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsCallingCardUsedFetch () {
    return this.IsCallingCardUsedFetch;
  }
  /** Set the SortOrder for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsCallingCardUsedSortOrder (Integer value) {
    this.IsCallingCardUsedSort = value;
  }
  /** Retrieve SortOrder for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsCallingCardUsedSortOrder () {
    return this.IsCallingCardUsedSort;
  }
  /** Set the sort direction for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsCallingCardUsedSortDirection (boolean ascending) {
    this.IsCallingCardUsedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsCallingCardUsedSortDirection () {
    return this.IsCallingCardUsedSortAscending;
  }
  /** Set the field level filters for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsCallingCardUsedFilter (BooleanFilter[] value) throws ServiceException {
    this.IsCallingCardUsed = value;
  }
  /** Retrieve filter for field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsCallingCardUsedFilter () {
    return this.IsCallingCardUsed;
  }

  /**
   * Retrieves the IsCallingCardUsedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsCallingCardUsedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCallingCardUsedFilter field
   */
  public String[] getIsCallingCardUsedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCallingCardUsedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsCallingCardUsedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCallingCardUsedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCallingCardUsedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCallingCardUsedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsCallingCardUsedFilter filter value from a formatted string
   *
   * @param _value the IsCallingCardUsedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsCallingCardUsedFilter filter field
   */
  public void setIsCallingCardUsedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsCallingCardUsedFilterFromFormattedString");
    try {
      this.setIsCallingCardUsedFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCallingCardUsedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCallingCardUsedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCallingCardUsedFilterFromFormattedString");
  }

  public String toString() {
    return ServicePricingPlanObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServicePricingPlanObjectHelper.toMap(this, null);
  }
}
