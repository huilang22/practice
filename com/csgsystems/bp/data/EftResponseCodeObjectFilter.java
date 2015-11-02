/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EftResponseCodeObjectFilter.java
 * Definition File: Admin/EftResponseCode.xml
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
public class EftResponseCodeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public EftResponseCodeObjectKeyFilter Key = null;
  /** raw field for: EFT_RESPONSE_CODE_REF.response_category) */
  public    IntegerFilter[] ResponseCategory  = null;
  protected boolean ResponseCategoryFetch = false;
  protected boolean ResponseCategorySortAscending = true;
  protected Integer ResponseCategorySort = null;
  /** raw field for: EFT_RESPONSE_CODE_REF.treatment_ind) */
  public    IntegerFilter[] TreatmentInd  = null;
  protected boolean TreatmentIndFetch = false;
  protected boolean TreatmentIndSortAscending = true;
  protected Integer TreatmentIndSort = null;
  /** raw field for: EFT_RESPONSE_CODE_REF.reversal_trans_type) */
  public    IntegerFilter[] ReversalTransType  = null;
  protected boolean ReversalTransTypeFetch = false;
  protected boolean ReversalTransTypeSortAscending = true;
  protected Integer ReversalTransTypeSort = null;
  /** raw field for: EFT_RESPONSE_CODE_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: EFT_RESPONSE_CODE_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: EFT_RESPONSE_CODE_REF.eft_event_type) */
  public    IntegerFilter[] EftEventType  = null;
  protected boolean EftEventTypeFetch = false;
  protected boolean EftEventTypeSortAscending = true;
  protected Integer EftEventTypeSort = null;
  /** raw field for: EFT_RESPONSE_CODE_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: EFT_RESPONSE_CODE_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  /** raw field for: EFT_RESPONSE_CODE_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  private String _objName = "EftResponseCodeObjectFilter";
  /** default constructor */
  public EftResponseCodeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public EftResponseCodeObjectFilter (EftResponseCodeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new EftResponseCodeObjectKeyFilter (other.Key);
    this.ResponseCategory = other.ResponseCategory;
    this.ResponseCategoryFetch = other.ResponseCategoryFetch;
    this.ResponseCategorySort = other.ResponseCategorySort;
    this.ResponseCategorySortAscending = other.ResponseCategorySortAscending;
    this.TreatmentInd = other.TreatmentInd;
    this.TreatmentIndFetch = other.TreatmentIndFetch;
    this.TreatmentIndSort = other.TreatmentIndSort;
    this.TreatmentIndSortAscending = other.TreatmentIndSortAscending;
    this.ReversalTransType = other.ReversalTransType;
    this.ReversalTransTypeFetch = other.ReversalTransTypeFetch;
    this.ReversalTransTypeSort = other.ReversalTransTypeSort;
    this.ReversalTransTypeSortAscending = other.ReversalTransTypeSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.EftEventType = other.EftEventType;
    this.EftEventTypeFetch = other.EftEventTypeFetch;
    this.EftEventTypeSort = other.EftEventTypeSort;
    this.EftEventTypeSortAscending = other.EftEventTypeSortAscending;
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
   * @return EftResponseCodeObjectKeyFilter
   */
  public EftResponseCodeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (EftResponseCodeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @param fetch whether to fetch this field or not
   */
  public void setResponseCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ResponseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getResponseCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ResponseCodeFetch;
  }
  /** Set the SortOrder for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResponseCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ResponseCodeSort = value;
  }
  /** Retrieve SortOrder for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResponseCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ResponseCodeSort;
  }
  /** Set the sort direction for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResponseCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ResponseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResponseCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ResponseCodeSortAscending;
  }
  /** Set the case insensitive for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResponseCodeCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ResponseCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @return boolean whether the field is case insensitive
   */
  public boolean getResponseCodeCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.ResponseCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResponseCodeFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ResponseCode = value;
  }
  /** Retrieve filter for field: ResponseCode (EFT_RESPONSE_CODE_VALUES.response_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getResponseCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ResponseCode;
  }
  /** Set the field level Fetch value for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @param fetch whether to fetch this field or not
   */
  public void setClearingHouseIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ClearingHouseIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getClearingHouseIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ClearingHouseIdFetch;
  }
  /** Set the SortOrder for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClearingHouseIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ClearingHouseIdSort = value;
  }
  /** Retrieve SortOrder for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClearingHouseIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ClearingHouseIdSort;
  }
  /** Set the sort direction for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClearingHouseIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ClearingHouseIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClearingHouseIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ClearingHouseIdSortAscending;
  }
  /** Set the case insensitive for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setClearingHouseIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ClearingHouseIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getClearingHouseIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.ClearingHouseIdCaseInsensitive;
  }
  /** Set the field level filters for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClearingHouseIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.ClearingHouseId = value;
  }
  /** Retrieve filter for field: ClearingHouseId (EFT_RESPONSE_CODE_VALUES.clearing_house_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getClearingHouseIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ClearingHouseId;
  }
  /** Set the field level Fetch value for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EftResponseCodeObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (EFT_RESPONSE_CODE_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * @param fetch whether to fetch this field or not
   */
  public void setResponseCategoryFetch (boolean fetch) {
    this.ResponseCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getResponseCategoryFetch () {
    return this.ResponseCategoryFetch;
  }
  /** Set the SortOrder for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResponseCategorySortOrder (Integer value) {
    this.ResponseCategorySort = value;
  }
  /** Retrieve SortOrder for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResponseCategorySortOrder () {
    return this.ResponseCategorySort;
  }
  /** Set the sort direction for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResponseCategorySortDirection (boolean ascending) {
    this.ResponseCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResponseCategorySortDirection () {
    return this.ResponseCategorySortAscending;
  }
  /** Set the field level filters for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResponseCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.ResponseCategory = value;
  }
  /** Retrieve filter for field: ResponseCategory (EFT_RESPONSE_CODE_REF.response_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getResponseCategoryFilter () {
    return this.ResponseCategory;
  }

  /**
   * Retrieves the ResponseCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResponseCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResponseCategoryFilter field
   */
  public String[] getResponseCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResponseCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResponseCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResponseCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResponseCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResponseCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResponseCategoryFilter filter value from a formatted string
   *
   * @param _value the ResponseCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResponseCategoryFilter filter field
   */
  public void setResponseCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResponseCategoryFilterFromFormattedString");
    try {
      this.setResponseCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResponseCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResponseCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResponseCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * @param fetch whether to fetch this field or not
   */
  public void setTreatmentIndFetch (boolean fetch) {
    this.TreatmentIndFetch = fetch;
  }
  /** Retrieve Fetch value for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * @return boolean the Fetch value for this field
   */
  public boolean getTreatmentIndFetch () {
    return this.TreatmentIndFetch;
  }
  /** Set the SortOrder for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTreatmentIndSortOrder (Integer value) {
    this.TreatmentIndSort = value;
  }
  /** Retrieve SortOrder for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTreatmentIndSortOrder () {
    return this.TreatmentIndSort;
  }
  /** Set the sort direction for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTreatmentIndSortDirection (boolean ascending) {
    this.TreatmentIndSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTreatmentIndSortDirection () {
    return this.TreatmentIndSortAscending;
  }
  /** Set the field level filters for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTreatmentIndFilter (IntegerFilter[] value) throws ServiceException {
    this.TreatmentInd = value;
  }
  /** Retrieve filter for field: TreatmentInd (EFT_RESPONSE_CODE_REF.treatment_ind)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTreatmentIndFilter () {
    return this.TreatmentInd;
  }

  /**
   * Retrieves the TreatmentIndFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TreatmentIndFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TreatmentIndFilter field
   */
  public String[] getTreatmentIndFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTreatmentIndFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTreatmentIndFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTreatmentIndFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreatmentIndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTreatmentIndFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TreatmentIndFilter filter value from a formatted string
   *
   * @param _value the TreatmentIndFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TreatmentIndFilter filter field
   */
  public void setTreatmentIndFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTreatmentIndFilterFromFormattedString");
    try {
      this.setTreatmentIndFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreatmentIndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTreatmentIndFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTreatmentIndFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setReversalTransTypeFetch (boolean fetch) {
    this.ReversalTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getReversalTransTypeFetch () {
    return this.ReversalTransTypeFetch;
  }
  /** Set the SortOrder for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReversalTransTypeSortOrder (Integer value) {
    this.ReversalTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReversalTransTypeSortOrder () {
    return this.ReversalTransTypeSort;
  }
  /** Set the sort direction for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReversalTransTypeSortDirection (boolean ascending) {
    this.ReversalTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReversalTransTypeSortDirection () {
    return this.ReversalTransTypeSortAscending;
  }
  /** Set the field level filters for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReversalTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ReversalTransType = value;
  }
  /** Retrieve filter for field: ReversalTransType (EFT_RESPONSE_CODE_REF.reversal_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getReversalTransTypeFilter () {
    return this.ReversalTransType;
  }

  /**
   * Retrieves the ReversalTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReversalTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReversalTransTypeFilter field
   */
  public String[] getReversalTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReversalTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReversalTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReversalTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReversalTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReversalTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ReversalTransTypeFilter filter value from a formatted string
   *
   * @param _value the ReversalTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReversalTransTypeFilter filter field
   */
  public void setReversalTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReversalTransTypeFilterFromFormattedString");
    try {
      this.setReversalTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReversalTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReversalTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReversalTransTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (EFT_RESPONSE_CODE_REF.is_default)
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

  /** Set the field level Fetch value for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (EFT_RESPONSE_CODE_REF.is_internal)
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

  /** Set the field level Fetch value for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * @param fetch whether to fetch this field or not
   */
  public void setEftEventTypeFetch (boolean fetch) {
    this.EftEventTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getEftEventTypeFetch () {
    return this.EftEventTypeFetch;
  }
  /** Set the SortOrder for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEftEventTypeSortOrder (Integer value) {
    this.EftEventTypeSort = value;
  }
  /** Retrieve SortOrder for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEftEventTypeSortOrder () {
    return this.EftEventTypeSort;
  }
  /** Set the sort direction for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEftEventTypeSortDirection (boolean ascending) {
    this.EftEventTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEftEventTypeSortDirection () {
    return this.EftEventTypeSortAscending;
  }
  /** Set the field level filters for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEftEventTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.EftEventType = value;
  }
  /** Retrieve filter for field: EftEventType (EFT_RESPONSE_CODE_REF.eft_event_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEftEventTypeFilter () {
    return this.EftEventType;
  }

  /**
   * Retrieves the EftEventTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EftEventTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EftEventTypeFilter field
   */
  public String[] getEftEventTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftEventTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEftEventTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEftEventTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftEventTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEftEventTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EftEventTypeFilter filter value from a formatted string
   *
   * @param _value the EftEventTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EftEventTypeFilter filter field
   */
  public void setEftEventTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEftEventTypeFilterFromFormattedString");
    try {
      this.setEftEventTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftEventTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEftEventTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEftEventTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (EFT_RESPONSE_CODE_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (EFT_RESPONSE_CODE_VALUES.display_value)
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

  /** Set the field level Fetch value for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (EFT_RESPONSE_CODE_VALUES.short_display)
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
    return EftResponseCodeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return EftResponseCodeObjectHelper.toMap(this, null);
  }
}
