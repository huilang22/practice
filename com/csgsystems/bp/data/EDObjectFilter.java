/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EDObjectFilter.java
 * Definition File: Admin/ExtendedDataEnumeration.xml
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
public class EDObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public EDObjectKeyFilter Key = null;
  /** raw field for: ENUMERATION_DEF.enumeration_name) */
  public    StringFilter[] EnumerationName  = null;
  protected boolean EnumerationNameFetch = false;
  protected boolean EnumerationNameSortAscending = true;
  protected boolean EnumerationNameCaseInsensitive = false;
  protected Integer EnumerationNameSort = null;
  /** raw field for: ENUMERATION_DEF.enumeration_key) */
  public    StringFilter[] EnumerationKey  = null;
  protected boolean EnumerationKeyFetch = false;
  protected boolean EnumerationKeySortAscending = true;
  protected boolean EnumerationKeyCaseInsensitive = false;
  protected Integer EnumerationKeySort = null;
  /** raw field for: ENUMERATION_DEF.ref_table_name) */
  public    StringFilter[] RefTableName  = null;
  protected boolean RefTableNameFetch = false;
  protected boolean RefTableNameSortAscending = true;
  protected boolean RefTableNameCaseInsensitive = false;
  protected Integer RefTableNameSort = null;
  /** raw field for: ENUMERATION_DEF.enumeration_sort_basis) */
  public    IntegerFilter[] EnumerationSortBasis  = null;
  protected boolean EnumerationSortBasisFetch = false;
  protected boolean EnumerationSortBasisSortAscending = true;
  protected Integer EnumerationSortBasisSort = null;
  /** raw field for: ENUMERATION_DEF.enumeration_sort_order) */
  public    IntegerFilter[] EnumerationSortOrder  = null;
  protected boolean EnumerationSortOrderFetch = false;
  protected boolean EnumerationSortOrderSortAscending = true;
  protected Integer EnumerationSortOrderSort = null;
  /** raw field for: ENUMERATION_DEF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "EDObjectFilter";
  /** default constructor */
  public EDObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public EDObjectFilter (EDObjectFilter other)
  {
    if (other == null) return;
    this.Key = new EDObjectKeyFilter (other.Key);
    this.EnumerationName = other.EnumerationName;
    this.EnumerationNameFetch = other.EnumerationNameFetch;
    this.EnumerationNameSort = other.EnumerationNameSort;
    this.EnumerationNameCaseInsensitive = other.EnumerationNameCaseInsensitive;
    this.EnumerationNameSortAscending = other.EnumerationNameSortAscending;
    this.EnumerationKey = other.EnumerationKey;
    this.EnumerationKeyFetch = other.EnumerationKeyFetch;
    this.EnumerationKeySort = other.EnumerationKeySort;
    this.EnumerationKeyCaseInsensitive = other.EnumerationKeyCaseInsensitive;
    this.EnumerationKeySortAscending = other.EnumerationKeySortAscending;
    this.RefTableName = other.RefTableName;
    this.RefTableNameFetch = other.RefTableNameFetch;
    this.RefTableNameSort = other.RefTableNameSort;
    this.RefTableNameCaseInsensitive = other.RefTableNameCaseInsensitive;
    this.RefTableNameSortAscending = other.RefTableNameSortAscending;
    this.EnumerationSortBasis = other.EnumerationSortBasis;
    this.EnumerationSortBasisFetch = other.EnumerationSortBasisFetch;
    this.EnumerationSortBasisSort = other.EnumerationSortBasisSort;
    this.EnumerationSortBasisSortAscending = other.EnumerationSortBasisSortAscending;
    this.EnumerationSortOrder = other.EnumerationSortOrder;
    this.EnumerationSortOrderFetch = other.EnumerationSortOrderFetch;
    this.EnumerationSortOrderSort = other.EnumerationSortOrderSort;
    this.EnumerationSortOrderSortAscending = other.EnumerationSortOrderSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return EDObjectKeyFilter
   */
  public EDObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (EDObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEnumerationIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EDObjectKeyFilter ();
    this.Key.EnumerationIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEnumerationIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.EnumerationIdFetch;
  }
  /** Set the SortOrder for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEnumerationIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EDObjectKeyFilter ();
    this.Key.EnumerationIdSort = value;
  }
  /** Retrieve SortOrder for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEnumerationIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.EnumerationIdSort;
  }
  /** Set the sort direction for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEnumerationIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EDObjectKeyFilter ();
    this.Key.EnumerationIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEnumerationIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.EnumerationIdSortAscending;
  }
  /** Set the field level filters for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEnumerationIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EDObjectKeyFilter ();
    this.Key.EnumerationId = value;
  }
  /** Retrieve filter for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEnumerationIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.EnumerationId;
  }
  /** Set the field level Fetch value for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @param fetch whether to fetch this field or not
   */
  public void setEnumerationNameFetch (boolean fetch) {
    this.EnumerationNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getEnumerationNameFetch () {
    return this.EnumerationNameFetch;
  }
  /** Set the SortOrder for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEnumerationNameSortOrder (Integer value) {
    this.EnumerationNameSort = value;
  }
  /** Retrieve SortOrder for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEnumerationNameSortOrder () {
    return this.EnumerationNameSort;
  }
  /** Set the sort direction for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEnumerationNameSortDirection (boolean ascending) {
    this.EnumerationNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEnumerationNameSortDirection () {
    return this.EnumerationNameSortAscending;
  }
  /** Set the case insensitive for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEnumerationNameCaseInsensitive (boolean ascending) {
    this.EnumerationNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEnumerationNameCaseInsensitive () {
    return this.EnumerationNameCaseInsensitive;
  }
  /** Set the field level filters for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEnumerationNameFilter (StringFilter[] value) throws ServiceException {
    this.EnumerationName = value;
  }
  /** Retrieve filter for field: EnumerationName (ENUMERATION_DEF.enumeration_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEnumerationNameFilter () {
    return this.EnumerationName;
  }

  /**
   * Retrieves the EnumerationNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EnumerationNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationNameFilter field
   */
  public String[] getEnumerationNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEnumerationNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EnumerationNameFilter filter value from a formatted string
   *
   * @param _value the EnumerationNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EnumerationNameFilter filter field
   */
  public void setEnumerationNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEnumerationNameFilterFromFormattedString");
    try {
      this.setEnumerationNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @param fetch whether to fetch this field or not
   */
  public void setEnumerationKeyFetch (boolean fetch) {
    this.EnumerationKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getEnumerationKeyFetch () {
    return this.EnumerationKeyFetch;
  }
  /** Set the SortOrder for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEnumerationKeySortOrder (Integer value) {
    this.EnumerationKeySort = value;
  }
  /** Retrieve SortOrder for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEnumerationKeySortOrder () {
    return this.EnumerationKeySort;
  }
  /** Set the sort direction for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEnumerationKeySortDirection (boolean ascending) {
    this.EnumerationKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEnumerationKeySortDirection () {
    return this.EnumerationKeySortAscending;
  }
  /** Set the case insensitive for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEnumerationKeyCaseInsensitive (boolean ascending) {
    this.EnumerationKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEnumerationKeyCaseInsensitive () {
    return this.EnumerationKeyCaseInsensitive;
  }
  /** Set the field level filters for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEnumerationKeyFilter (StringFilter[] value) throws ServiceException {
    this.EnumerationKey = value;
  }
  /** Retrieve filter for field: EnumerationKey (ENUMERATION_DEF.enumeration_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEnumerationKeyFilter () {
    return this.EnumerationKey;
  }

  /**
   * Retrieves the EnumerationKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EnumerationKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationKeyFilter field
   */
  public String[] getEnumerationKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEnumerationKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EnumerationKeyFilter filter value from a formatted string
   *
   * @param _value the EnumerationKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EnumerationKeyFilter filter field
   */
  public void setEnumerationKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEnumerationKeyFilterFromFormattedString");
    try {
      this.setEnumerationKeyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationKeyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @param fetch whether to fetch this field or not
   */
  public void setRefTableNameFetch (boolean fetch) {
    this.RefTableNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getRefTableNameFetch () {
    return this.RefTableNameFetch;
  }
  /** Set the SortOrder for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRefTableNameSortOrder (Integer value) {
    this.RefTableNameSort = value;
  }
  /** Retrieve SortOrder for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRefTableNameSortOrder () {
    return this.RefTableNameSort;
  }
  /** Set the sort direction for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRefTableNameSortDirection (boolean ascending) {
    this.RefTableNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRefTableNameSortDirection () {
    return this.RefTableNameSortAscending;
  }
  /** Set the case insensitive for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRefTableNameCaseInsensitive (boolean ascending) {
    this.RefTableNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRefTableNameCaseInsensitive () {
    return this.RefTableNameCaseInsensitive;
  }
  /** Set the field level filters for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRefTableNameFilter (StringFilter[] value) throws ServiceException {
    this.RefTableName = value;
  }
  /** Retrieve filter for field: RefTableName (ENUMERATION_DEF.ref_table_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRefTableNameFilter () {
    return this.RefTableName;
  }

  /**
   * Retrieves the RefTableNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RefTableNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefTableNameFilter field
   */
  public String[] getRefTableNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefTableNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRefTableNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefTableNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefTableNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefTableNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RefTableNameFilter filter value from a formatted string
   *
   * @param _value the RefTableNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RefTableNameFilter filter field
   */
  public void setRefTableNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRefTableNameFilterFromFormattedString");
    try {
      this.setRefTableNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefTableNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefTableNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefTableNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @param fetch whether to fetch this field or not
   */
  public void setEnumerationSortBasisFetch (boolean fetch) {
    this.EnumerationSortBasisFetch = fetch;
  }
  /** Retrieve Fetch value for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @return boolean the Fetch value for this field
   */
  public boolean getEnumerationSortBasisFetch () {
    return this.EnumerationSortBasisFetch;
  }
  /** Set the SortOrder for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEnumerationSortBasisSortOrder (Integer value) {
    this.EnumerationSortBasisSort = value;
  }
  /** Retrieve SortOrder for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEnumerationSortBasisSortOrder () {
    return this.EnumerationSortBasisSort;
  }
  /** Set the sort direction for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEnumerationSortBasisSortDirection (boolean ascending) {
    this.EnumerationSortBasisSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEnumerationSortBasisSortDirection () {
    return this.EnumerationSortBasisSortAscending;
  }
  /** Set the field level filters for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEnumerationSortBasisFilter (IntegerFilter[] value) throws ServiceException {
    this.EnumerationSortBasis = value;
  }
  /** Retrieve filter for field: EnumerationSortBasis (ENUMERATION_DEF.enumeration_sort_basis)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEnumerationSortBasisFilter () {
    return this.EnumerationSortBasis;
  }

  /**
   * Retrieves the EnumerationSortBasisFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EnumerationSortBasisFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationSortBasisFilter field
   */
  public String[] getEnumerationSortBasisFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationSortBasisFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEnumerationSortBasisFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationSortBasisFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationSortBasisFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationSortBasisFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EnumerationSortBasisFilter filter value from a formatted string
   *
   * @param _value the EnumerationSortBasisFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EnumerationSortBasisFilter filter field
   */
  public void setEnumerationSortBasisFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEnumerationSortBasisFilterFromFormattedString");
    try {
      this.setEnumerationSortBasisFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationSortBasisFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationSortBasisFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationSortBasisFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @param fetch whether to fetch this field or not
   */
  public void setEnumerationSortOrderFetch (boolean fetch) {
    this.EnumerationSortOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getEnumerationSortOrderFetch () {
    return this.EnumerationSortOrderFetch;
  }
  /** Set the SortOrder for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEnumerationSortOrderSortOrder (Integer value) {
    this.EnumerationSortOrderSort = value;
  }
  /** Retrieve SortOrder for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEnumerationSortOrderSortOrder () {
    return this.EnumerationSortOrderSort;
  }
  /** Set the sort direction for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEnumerationSortOrderSortDirection (boolean ascending) {
    this.EnumerationSortOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEnumerationSortOrderSortDirection () {
    return this.EnumerationSortOrderSortAscending;
  }
  /** Set the field level filters for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEnumerationSortOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.EnumerationSortOrder = value;
  }
  /** Retrieve filter for field: EnumerationSortOrder (ENUMERATION_DEF.enumeration_sort_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEnumerationSortOrderFilter () {
    return this.EnumerationSortOrder;
  }

  /**
   * Retrieves the EnumerationSortOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EnumerationSortOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationSortOrderFilter field
   */
  public String[] getEnumerationSortOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationSortOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEnumerationSortOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationSortOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationSortOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationSortOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EnumerationSortOrderFilter filter value from a formatted string
   *
   * @param _value the EnumerationSortOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EnumerationSortOrderFilter filter field
   */
  public void setEnumerationSortOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEnumerationSortOrderFilterFromFormattedString");
    try {
      this.setEnumerationSortOrderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationSortOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationSortOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationSortOrderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (ENUMERATION_DEF.config_tag_id)
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
    return EDObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return EDObjectHelper.toMap(this, null);
  }
}
