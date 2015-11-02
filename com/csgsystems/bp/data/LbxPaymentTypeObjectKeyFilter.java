/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LbxPaymentTypeObjectKeyFilter.java
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
import java.util.Locale;
import java.util.Map;

import java.math.BigInteger;
import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseFilter;

/** Key Filter for LbxPaymentTypeObject object. */
public class LbxPaymentTypeObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: LBX_PAYMENT_TYPES.ext_category) */
  public    StringFilter[] ExtCategory  = null;
  protected boolean ExtCategoryFetch = false;
  protected boolean ExtCategorySortAscending = true;
  protected boolean ExtCategoryCaseInsensitive = false;
  protected Integer ExtCategorySort = null;
  /** raw field for: LBX_PAYMENT_TYPES.source_id) */
  public    StringFilter[] SourceId  = null;
  protected boolean SourceIdFetch = false;
  protected boolean SourceIdSortAscending = true;
  protected boolean SourceIdCaseInsensitive = false;
  protected Integer SourceIdSort = null;
  /** raw field for: LBX_SOURCE_ID_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "LbxPaymentTypeObjectKeyFilter";
  /** default constructor */
  public LbxPaymentTypeObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public LbxPaymentTypeObjectKeyFilter (LbxPaymentTypeObjectKeyFilter other)
  {
    if (other == null) return;
    this.ExtCategory = other.ExtCategory;
    this.ExtCategoryFetch = other.ExtCategoryFetch;
    this.ExtCategorySort = other.ExtCategorySort;
    this.ExtCategoryCaseInsensitive = other.ExtCategoryCaseInsensitive;
    this.ExtCategorySortAscending = other.ExtCategorySortAscending;
    this.SourceId = other.SourceId;
    this.SourceIdFetch = other.SourceIdFetch;
    this.SourceIdSort = other.SourceIdSort;
    this.SourceIdCaseInsensitive = other.SourceIdCaseInsensitive;
    this.SourceIdSortAscending = other.SourceIdSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param fetch whether to fetch this field or not
   */
  public void setExtCategoryFetch (boolean fetch) {
    this.ExtCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getExtCategoryFetch () {
    return this.ExtCategoryFetch;
  }
  /** Set the SortOrder for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExtCategorySortOrder (Integer value) {
    this.ExtCategorySort = value;
  }
  /** Retrieve SortOrder for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExtCategorySortOrder () {
    return this.ExtCategorySort;
  }
  /** Set the sort direction for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExtCategorySortDirection (boolean ascending) {
    this.ExtCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExtCategorySortDirection () {
    return this.ExtCategorySortAscending;
  }
  /** Set the case insensitive for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExtCategoryCaseInsensitive (boolean ascending) {
    this.ExtCategoryCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExtCategoryCaseInsensitive () {
    return this.ExtCategoryCaseInsensitive;
  }
  /** Set the field level filters for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExtCategoryFilter (StringFilter[] value) throws ServiceException {
    this.ExtCategory = value;
  }
  /** Retrieve filter for field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExtCategoryFilter () {
    return this.ExtCategory;
  }

  /**
   * Retrieves the ExtCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExtCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtCategoryFilter field
   */
  public String[] getExtCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExtCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExtCategoryFilter filter value from a formatted string
   *
   * @param _value the ExtCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExtCategoryFilter filter field
   */
  public void setExtCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExtCategoryFilterFromFormattedString");
    try {
      this.setExtCategoryFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdFetch (boolean fetch) {
    this.SourceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdFetch () {
    return this.SourceIdFetch;
  }
  /** Set the SortOrder for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdSortOrder (Integer value) {
    this.SourceIdSort = value;
  }
  /** Retrieve SortOrder for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdSortOrder () {
    return this.SourceIdSort;
  }
  /** Set the sort direction for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdSortDirection (boolean ascending) {
    this.SourceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdSortDirection () {
    return this.SourceIdSortAscending;
  }
  /** Set the case insensitive for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSourceIdCaseInsensitive (boolean ascending) {
    this.SourceIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSourceIdCaseInsensitive () {
    return this.SourceIdCaseInsensitive;
  }
  /** Set the field level filters for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdFilter (StringFilter[] value) throws ServiceException {
    this.SourceId = value;
  }
  /** Retrieve filter for field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSourceIdFilter () {
    return this.SourceId;
  }

  /**
   * Retrieves the SourceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdFilter field
   */
  public String[] getSourceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceIdFilter filter value from a formatted string
   *
   * @param _value the SourceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceIdFilter filter field
   */
  public void setSourceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceIdFilterFromFormattedString");
    try {
      this.setSourceIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  public String toString() {
    return LbxPaymentTypeObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return LbxPaymentTypeObjectKeyHelper.toMap(this, null);
  }
}
