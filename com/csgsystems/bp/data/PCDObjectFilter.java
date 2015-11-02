/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PCDObjectFilter.java
 * Definition File: Admin/PackageComponentDef.xml
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
public class PCDObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public PCDObjectKeyFilter Key = null;
  /** raw field for: PACKAGE_COMPONENTS.minimum_required) */
  public    IntegerFilter[] MinimumRequired  = null;
  protected boolean MinimumRequiredFetch = false;
  protected boolean MinimumRequiredSortAscending = true;
  protected Integer MinimumRequiredSort = null;
  /** raw field for: PACKAGE_COMPONENTS.maximum_allowed) */
  public    IntegerFilter[] MaximumAllowed  = null;
  protected boolean MaximumAllowedFetch = false;
  protected boolean MaximumAllowedSortAscending = true;
  protected Integer MaximumAllowedSort = null;
  /** raw field for: PACKAGE_COMPONENTS.inactive_dt) */
  public    DateFilter[] PackageInactiveDt  = null;
  protected boolean PackageInactiveDtFetch = false;
  protected boolean PackageInactiveDtSortAscending = true;
  protected Integer PackageInactiveDtSort = null;
  /** raw field for: COMPONENT_DEFINITION_REF.component_level) */
  public    IntegerFilter[] ComponentLevel  = null;
  protected boolean ComponentLevelFetch = false;
  protected boolean ComponentLevelSortAscending = true;
  protected Integer ComponentLevelSort = null;
  /** raw field for: COMPONENT_DEFINITION_REF.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: COMPONENT_DEFINITION_REF.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: COMPONENT_DEFINITION_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: COMPONENT_DEFINITION_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: COMPONENT_DEFINITION_REF.is_serviceability_applicable) */
  public    BooleanFilter[] IsServiceabilityApplicable  = null;
  protected boolean IsServiceabilityApplicableFetch = false;
  protected boolean IsServiceabilityApplicableSortAscending = true;
  protected Integer IsServiceabilityApplicableSort = null;
  /** raw field for: COMPONENT_DEFINITION_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: COMPONENT_DEFINITION_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: COMPONENT_DEFINITION_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "PCDObjectFilter";
  /** default constructor */
  public PCDObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PCDObjectFilter (PCDObjectFilter other)
  {
    if (other == null) return;
    this.Key = new PCDObjectKeyFilter (other.Key);
    this.MinimumRequired = other.MinimumRequired;
    this.MinimumRequiredFetch = other.MinimumRequiredFetch;
    this.MinimumRequiredSort = other.MinimumRequiredSort;
    this.MinimumRequiredSortAscending = other.MinimumRequiredSortAscending;
    this.MaximumAllowed = other.MaximumAllowed;
    this.MaximumAllowedFetch = other.MaximumAllowedFetch;
    this.MaximumAllowedSort = other.MaximumAllowedSort;
    this.MaximumAllowedSortAscending = other.MaximumAllowedSortAscending;
    this.PackageInactiveDt = other.PackageInactiveDt;
    this.PackageInactiveDtFetch = other.PackageInactiveDtFetch;
    this.PackageInactiveDtSort = other.PackageInactiveDtSort;
    this.PackageInactiveDtSortAscending = other.PackageInactiveDtSortAscending;
    this.ComponentLevel = other.ComponentLevel;
    this.ComponentLevelFetch = other.ComponentLevelFetch;
    this.ComponentLevelSort = other.ComponentLevelSort;
    this.ComponentLevelSortAscending = other.ComponentLevelSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
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
   * @return PCDObjectKeyFilter
   */
  public PCDObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (PCDObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageIdFetch;
  }
  /** Set the SortOrder for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageIdSort = value;
  }
  /** Retrieve SortOrder for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageIdSort;
  }
  /** Set the sort direction for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageIdSortAscending;
  }
  /** Set the field level filters for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageId = value;
  }
  /** Retrieve filter for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageId;
  }
  /** Set the field level Fetch value for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageActiveDtFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageActiveDtFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageActiveDtFetch;
  }
  /** Set the SortOrder for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageActiveDtSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageActiveDtSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageActiveDtSort;
  }
  /** Set the sort direction for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageActiveDtSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageActiveDtSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageActiveDtSortAscending;
  }
  /** Set the field level filters for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageActiveDtFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.PackageActiveDt = value;
  }
  /** Retrieve filter for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPackageActiveDtFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageActiveDt;
  }
  /** Set the field level Fetch value for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.ComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ComponentIdFetch;
  }
  /** Set the SortOrder for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.ComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ComponentIdSort;
  }
  /** Set the sort direction for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.ComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ComponentIdSortAscending;
  }
  /** Set the field level filters for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.ComponentId = value;
  }
  /** Retrieve filter for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getComponentIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ComponentId;
  }
  /** Set the field level Fetch value for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PCDObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * @param fetch whether to fetch this field or not
   */
  public void setMinimumRequiredFetch (boolean fetch) {
    this.MinimumRequiredFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinimumRequiredFetch () {
    return this.MinimumRequiredFetch;
  }
  /** Set the SortOrder for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinimumRequiredSortOrder (Integer value) {
    this.MinimumRequiredSort = value;
  }
  /** Retrieve SortOrder for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinimumRequiredSortOrder () {
    return this.MinimumRequiredSort;
  }
  /** Set the sort direction for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinimumRequiredSortDirection (boolean ascending) {
    this.MinimumRequiredSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinimumRequiredSortDirection () {
    return this.MinimumRequiredSortAscending;
  }
  /** Set the field level filters for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinimumRequiredFilter (IntegerFilter[] value) throws ServiceException {
    this.MinimumRequired = value;
  }
  /** Retrieve filter for field: MinimumRequired (PACKAGE_COMPONENTS.minimum_required)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMinimumRequiredFilter () {
    return this.MinimumRequired;
  }

  /**
   * Retrieves the MinimumRequiredFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinimumRequiredFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinimumRequiredFilter field
   */
  public String[] getMinimumRequiredFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinimumRequiredFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinimumRequiredFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinimumRequiredFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinimumRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinimumRequiredFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinimumRequiredFilter filter value from a formatted string
   *
   * @param _value the MinimumRequiredFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinimumRequiredFilter filter field
   */
  public void setMinimumRequiredFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinimumRequiredFilterFromFormattedString");
    try {
      this.setMinimumRequiredFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinimumRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinimumRequiredFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinimumRequiredFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * @param fetch whether to fetch this field or not
   */
  public void setMaximumAllowedFetch (boolean fetch) {
    this.MaximumAllowedFetch = fetch;
  }
  /** Retrieve Fetch value for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * @return boolean the Fetch value for this field
   */
  public boolean getMaximumAllowedFetch () {
    return this.MaximumAllowedFetch;
  }
  /** Set the SortOrder for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMaximumAllowedSortOrder (Integer value) {
    this.MaximumAllowedSort = value;
  }
  /** Retrieve SortOrder for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMaximumAllowedSortOrder () {
    return this.MaximumAllowedSort;
  }
  /** Set the sort direction for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMaximumAllowedSortDirection (boolean ascending) {
    this.MaximumAllowedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMaximumAllowedSortDirection () {
    return this.MaximumAllowedSortAscending;
  }
  /** Set the field level filters for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMaximumAllowedFilter (IntegerFilter[] value) throws ServiceException {
    this.MaximumAllowed = value;
  }
  /** Retrieve filter for field: MaximumAllowed (PACKAGE_COMPONENTS.maximum_allowed)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMaximumAllowedFilter () {
    return this.MaximumAllowed;
  }

  /**
   * Retrieves the MaximumAllowedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaximumAllowedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaximumAllowedFilter field
   */
  public String[] getMaximumAllowedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaximumAllowedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaximumAllowedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaximumAllowedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaximumAllowedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaximumAllowedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MaximumAllowedFilter filter value from a formatted string
   *
   * @param _value the MaximumAllowedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaximumAllowedFilter filter field
   */
  public void setMaximumAllowedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaximumAllowedFilterFromFormattedString");
    try {
      this.setMaximumAllowedFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaximumAllowedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaximumAllowedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaximumAllowedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageInactiveDtFetch (boolean fetch) {
    this.PackageInactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageInactiveDtFetch () {
    return this.PackageInactiveDtFetch;
  }
  /** Set the SortOrder for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageInactiveDtSortOrder (Integer value) {
    this.PackageInactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageInactiveDtSortOrder () {
    return this.PackageInactiveDtSort;
  }
  /** Set the sort direction for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageInactiveDtSortDirection (boolean ascending) {
    this.PackageInactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageInactiveDtSortDirection () {
    return this.PackageInactiveDtSortAscending;
  }
  /** Set the field level filters for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.PackageInactiveDt = value;
  }
  /** Retrieve filter for field: PackageInactiveDt (PACKAGE_COMPONENTS.inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPackageInactiveDtFilter () {
    return this.PackageInactiveDt;
  }

  /**
   * Retrieves the PackageInactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageInactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageInactiveDtFilter field
   */
  public String[] getPackageInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PackageInactiveDtFilter filter value from a formatted string
   *
   * @param _value the PackageInactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageInactiveDtFilter filter field
   */
  public void setPackageInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageInactiveDtFilterFromFormattedString");
    try {
      this.setPackageInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the PackageInactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageInactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageInactiveDtFilter field
   */
  public String[] getPackageInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PackageInactiveDtFilter filter value from a formatted string
   *
   * @param _value the PackageInactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageInactiveDtFilter filter field
   */
  public void setPackageInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setPackageInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageInactiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentLevelFetch (boolean fetch) {
    this.ComponentLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentLevelFetch () {
    return this.ComponentLevelFetch;
  }
  /** Set the SortOrder for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentLevelSortOrder (Integer value) {
    this.ComponentLevelSort = value;
  }
  /** Retrieve SortOrder for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentLevelSortOrder () {
    return this.ComponentLevelSort;
  }
  /** Set the sort direction for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentLevelSortDirection (boolean ascending) {
    this.ComponentLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentLevelSortDirection () {
    return this.ComponentLevelSortAscending;
  }
  /** Set the field level filters for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.ComponentLevel = value;
  }
  /** Retrieve filter for field: ComponentLevel (COMPONENT_DEFINITION_REF.component_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getComponentLevelFilter () {
    return this.ComponentLevel;
  }

  /**
   * Retrieves the ComponentLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ComponentLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentLevelFilter field
   */
  public String[] getComponentLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getComponentLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ComponentLevelFilter filter value from a formatted string
   *
   * @param _value the ComponentLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ComponentLevelFilter filter field
   */
  public void setComponentLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentLevelFilterFromFormattedString");
    try {
      this.setComponentLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (COMPONENT_DEFINITION_REF.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (COMPONENT_DEFINITION_REF.inactive_dt)
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


  /** Set the field level Fetch value for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (COMPONENT_DEFINITION_REF.is_default)
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

  /** Set the field level Fetch value for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (COMPONENT_DEFINITION_REF.is_internal)
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

  /** Set the field level Fetch value for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsServiceabilityApplicableFetch (boolean fetch) {
    this.IsServiceabilityApplicableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsServiceabilityApplicableFetch () {
    return this.IsServiceabilityApplicableFetch;
  }
  /** Set the SortOrder for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsServiceabilityApplicableSortOrder (Integer value) {
    this.IsServiceabilityApplicableSort = value;
  }
  /** Retrieve SortOrder for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsServiceabilityApplicableSortOrder () {
    return this.IsServiceabilityApplicableSort;
  }
  /** Set the sort direction for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsServiceabilityApplicableSortDirection (boolean ascending) {
    this.IsServiceabilityApplicableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsServiceabilityApplicableSortDirection () {
    return this.IsServiceabilityApplicableSortAscending;
  }
  /** Set the field level filters for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsServiceabilityApplicableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsServiceabilityApplicable = value;
  }
  /** Retrieve filter for field: IsServiceabilityApplicable (COMPONENT_DEFINITION_REF.is_serviceability_applicable)
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

  /** Set the field level Fetch value for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (COMPONENT_DEFINITION_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (COMPONENT_DEFINITION_VALUES.short_display)
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

  /** Set the field level Fetch value for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (COMPONENT_DEFINITION_VALUES.display_value)
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
    return PCDObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PCDObjectHelper.toMap(this, null);
  }
}
