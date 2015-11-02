/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CreditCardTypeCodeObjectFilter.java
 * Definition File: Admin/CreditCardTypeCode.xml
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
public class CreditCardTypeCodeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CreditCardTypeCodeObjectKeyFilter Key = null;
  /** raw field for: CARD_TYPE_CODE_REF.card_carrier) */
  public    StringFilter[] CcardCarrier  = null;
  protected boolean CcardCarrierFetch = false;
  protected boolean CcardCarrierSortAscending = true;
  protected boolean CcardCarrierCaseInsensitive = false;
  protected Integer CcardCarrierSort = null;
  /** raw field for: CARD_TYPE_CODE_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: CARD_TYPE_CODE_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: CARD_TYPE_CODE_REF.epg_card_type) */
  public    StringFilter[] EpgCardType  = null;
  protected boolean EpgCardTypeFetch = false;
  protected boolean EpgCardTypeSortAscending = true;
  protected boolean EpgCardTypeCaseInsensitive = false;
  protected Integer EpgCardTypeSort = null;
  /** raw field for: CARD_TYPE_CODE_REF.check_digit_alg) */
  public    IntegerFilter[] CheckDigitAlg  = null;
  protected boolean CheckDigitAlgFetch = false;
  protected boolean CheckDigitAlgSortAscending = true;
  protected Integer CheckDigitAlgSort = null;
  /** raw field for: CARD_TYPE_CODE_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: CARD_TYPE_CODE_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: CARD_TYPE_CODE_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "CreditCardTypeCodeObjectFilter";
  /** default constructor */
  public CreditCardTypeCodeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CreditCardTypeCodeObjectFilter (CreditCardTypeCodeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CreditCardTypeCodeObjectKeyFilter (other.Key);
    this.CcardCarrier = other.CcardCarrier;
    this.CcardCarrierFetch = other.CcardCarrierFetch;
    this.CcardCarrierSort = other.CcardCarrierSort;
    this.CcardCarrierCaseInsensitive = other.CcardCarrierCaseInsensitive;
    this.CcardCarrierSortAscending = other.CcardCarrierSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.EpgCardType = other.EpgCardType;
    this.EpgCardTypeFetch = other.EpgCardTypeFetch;
    this.EpgCardTypeSort = other.EpgCardTypeSort;
    this.EpgCardTypeCaseInsensitive = other.EpgCardTypeCaseInsensitive;
    this.EpgCardTypeSortAscending = other.EpgCardTypeSortAscending;
    this.CheckDigitAlg = other.CheckDigitAlg;
    this.CheckDigitAlgFetch = other.CheckDigitAlgFetch;
    this.CheckDigitAlgSort = other.CheckDigitAlgSort;
    this.CheckDigitAlgSortAscending = other.CheckDigitAlgSortAscending;
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
   * @return CreditCardTypeCodeObjectKeyFilter
   */
  public CreditCardTypeCodeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CreditCardTypeCodeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (CARD_TYPE_CODE_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardTypeCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.CcardTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardTypeCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CcardTypeCodeFetch;
  }
  /** Set the SortOrder for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardTypeCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.CcardTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardTypeCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CcardTypeCodeSort;
  }
  /** Set the sort direction for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardTypeCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.CcardTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardTypeCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CcardTypeCodeSortAscending;
  }
  /** Set the field level filters for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardTypeCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CreditCardTypeCodeObjectKeyFilter ();
    this.Key.CcardTypeCode = value;
  }
  /** Retrieve filter for field: CcardTypeCode (CARD_TYPE_CODE_VALUES.card_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCcardTypeCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CcardTypeCode;
  }
  /** Set the field level Fetch value for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardCarrierFetch (boolean fetch) {
    this.CcardCarrierFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardCarrierFetch () {
    return this.CcardCarrierFetch;
  }
  /** Set the SortOrder for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardCarrierSortOrder (Integer value) {
    this.CcardCarrierSort = value;
  }
  /** Retrieve SortOrder for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardCarrierSortOrder () {
    return this.CcardCarrierSort;
  }
  /** Set the sort direction for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardCarrierSortDirection (boolean ascending) {
    this.CcardCarrierSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardCarrierSortDirection () {
    return this.CcardCarrierSortAscending;
  }
  /** Set the case insensitive for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardCarrierCaseInsensitive (boolean ascending) {
    this.CcardCarrierCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardCarrierCaseInsensitive () {
    return this.CcardCarrierCaseInsensitive;
  }
  /** Set the field level filters for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardCarrierFilter (StringFilter[] value) throws ServiceException {
    this.CcardCarrier = value;
  }
  /** Retrieve filter for field: CcardCarrier (CARD_TYPE_CODE_REF.card_carrier)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardCarrierFilter () {
    return this.CcardCarrier;
  }

  /**
   * Retrieves the CcardCarrierFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardCarrierFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardCarrierFilter field
   */
  public String[] getCcardCarrierFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardCarrierFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardCarrierFilter filter value from a formatted string
   *
   * @param _value the CcardCarrierFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardCarrierFilter filter field
   */
  public void setCcardCarrierFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFilterFromFormattedString");
    try {
      this.setCcardCarrierFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardCarrierFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (CARD_TYPE_CODE_REF.is_default)
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

  /** Set the field level Fetch value for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (CARD_TYPE_CODE_REF.is_internal)
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

  /** Set the field level Fetch value for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @param fetch whether to fetch this field or not
   */
  public void setEpgCardTypeFetch (boolean fetch) {
    this.EpgCardTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getEpgCardTypeFetch () {
    return this.EpgCardTypeFetch;
  }
  /** Set the SortOrder for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEpgCardTypeSortOrder (Integer value) {
    this.EpgCardTypeSort = value;
  }
  /** Retrieve SortOrder for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEpgCardTypeSortOrder () {
    return this.EpgCardTypeSort;
  }
  /** Set the sort direction for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEpgCardTypeSortDirection (boolean ascending) {
    this.EpgCardTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEpgCardTypeSortDirection () {
    return this.EpgCardTypeSortAscending;
  }
  /** Set the case insensitive for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEpgCardTypeCaseInsensitive (boolean ascending) {
    this.EpgCardTypeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEpgCardTypeCaseInsensitive () {
    return this.EpgCardTypeCaseInsensitive;
  }
  /** Set the field level filters for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEpgCardTypeFilter (StringFilter[] value) throws ServiceException {
    this.EpgCardType = value;
  }
  /** Retrieve filter for field: EpgCardType (CARD_TYPE_CODE_REF.epg_card_type)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEpgCardTypeFilter () {
    return this.EpgCardType;
  }

  /**
   * Retrieves the EpgCardTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EpgCardTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgCardTypeFilter field
   */
  public String[] getEpgCardTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgCardTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEpgCardTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgCardTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgCardTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgCardTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EpgCardTypeFilter filter value from a formatted string
   *
   * @param _value the EpgCardTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EpgCardTypeFilter filter field
   */
  public void setEpgCardTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEpgCardTypeFilterFromFormattedString");
    try {
      this.setEpgCardTypeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgCardTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgCardTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgCardTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * @param fetch whether to fetch this field or not
   */
  public void setCheckDigitAlgFetch (boolean fetch) {
    this.CheckDigitAlgFetch = fetch;
  }
  /** Retrieve Fetch value for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * @return boolean the Fetch value for this field
   */
  public boolean getCheckDigitAlgFetch () {
    return this.CheckDigitAlgFetch;
  }
  /** Set the SortOrder for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCheckDigitAlgSortOrder (Integer value) {
    this.CheckDigitAlgSort = value;
  }
  /** Retrieve SortOrder for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCheckDigitAlgSortOrder () {
    return this.CheckDigitAlgSort;
  }
  /** Set the sort direction for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCheckDigitAlgSortDirection (boolean ascending) {
    this.CheckDigitAlgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCheckDigitAlgSortDirection () {
    return this.CheckDigitAlgSortAscending;
  }
  /** Set the field level filters for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCheckDigitAlgFilter (IntegerFilter[] value) throws ServiceException {
    this.CheckDigitAlg = value;
  }
  /** Retrieve filter for field: CheckDigitAlg (CARD_TYPE_CODE_REF.check_digit_alg)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCheckDigitAlgFilter () {
    return this.CheckDigitAlg;
  }

  /**
   * Retrieves the CheckDigitAlgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CheckDigitAlgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CheckDigitAlgFilter field
   */
  public String[] getCheckDigitAlgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCheckDigitAlgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCheckDigitAlgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCheckDigitAlgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CheckDigitAlgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCheckDigitAlgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CheckDigitAlgFilter filter value from a formatted string
   *
   * @param _value the CheckDigitAlgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CheckDigitAlgFilter filter field
   */
  public void setCheckDigitAlgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCheckDigitAlgFilterFromFormattedString");
    try {
      this.setCheckDigitAlgFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CheckDigitAlgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCheckDigitAlgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCheckDigitAlgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (CARD_TYPE_CODE_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (CARD_TYPE_CODE_VALUES.short_display)
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

  /** Set the field level Fetch value for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (CARD_TYPE_CODE_VALUES.display_value)
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
    return CreditCardTypeCodeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CreditCardTypeCodeObjectHelper.toMap(this, null);
  }
}
