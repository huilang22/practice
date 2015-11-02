/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataLocateObjectFilter.java
 * Definition File: Catalog/ExtendedDataLocate.xml
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
public class ExtendedDataLocateObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ExtendedDataLocateObjectKeyFilter Key = null;
  /** raw field for: EXT_DATA_LOOKUP.param_value) */
  public    StringFilter[] ParamValue  = null;
  protected boolean ParamValueFetch = false;
  protected boolean ParamValueSortAscending = true;
  protected boolean ParamValueCaseInsensitive = false;
  protected Integer ParamValueSort = null;
  /** raw field for: EXT_DATA_LOOKUP.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: EXT_DATA_LOOKUP.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  private String _objName = "ExtendedDataLocateObjectFilter";
  /** default constructor */
  public ExtendedDataLocateObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ExtendedDataLocateObjectFilter (ExtendedDataLocateObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ExtendedDataLocateObjectKeyFilter (other.Key);
    this.ParamValue = other.ParamValue;
    this.ParamValueFetch = other.ParamValueFetch;
    this.ParamValueSort = other.ParamValueSort;
    this.ParamValueCaseInsensitive = other.ParamValueCaseInsensitive;
    this.ParamValueSortAscending = other.ParamValueSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;  }
  /** get the filter for this object's key
   * @return ExtendedDataLocateObjectKeyFilter
   */
  public ExtendedDataLocateObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ExtendedDataLocateObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (EXT_DATA_LOOKUP.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.ParamIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdFetch;
  }
  /** Set the SortOrder for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.ParamIdSort = value;
  }
  /** Retrieve SortOrder for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamIdSort;
  }
  /** Set the sort direction for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.ParamIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdSortAscending;
  }
  /** Set the field level filters for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ExtendedDataLocateObjectKeyFilter ();
    this.Key.ParamId = value;
  }
  /** Retrieve filter for field: ParamId (EXT_DATA_LOOKUP.param_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamId;
  }
  /** Set the field level Fetch value for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @param fetch whether to fetch this field or not
   */
  public void setParamValueFetch (boolean fetch) {
    this.ParamValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamValueFetch () {
    return this.ParamValueFetch;
  }
  /** Set the SortOrder for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamValueSortOrder (Integer value) {
    this.ParamValueSort = value;
  }
  /** Retrieve SortOrder for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamValueSortOrder () {
    return this.ParamValueSort;
  }
  /** Set the sort direction for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamValueSortDirection (boolean ascending) {
    this.ParamValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamValueSortDirection () {
    return this.ParamValueSortAscending;
  }
  /** Set the case insensitive for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setParamValueCaseInsensitive (boolean ascending) {
    this.ParamValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getParamValueCaseInsensitive () {
    return this.ParamValueCaseInsensitive;
  }
  /** Set the field level filters for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamValueFilter (StringFilter[] value) throws ServiceException {
    this.ParamValue = value;
  }
  /** Retrieve filter for field: ParamValue (EXT_DATA_LOOKUP.param_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getParamValueFilter () {
    return this.ParamValue;
  }

  /**
   * Retrieves the ParamValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamValueFilter field
   */
  public String[] getParamValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamValueFilter filter value from a formatted string
   *
   * @param _value the ParamValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamValueFilter filter field
   */
  public void setParamValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamValueFilterFromFormattedString");
    try {
      this.setParamValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (EXT_DATA_LOOKUP.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter () {
    return this.ServiceInternalId;
  }

  /**
   * Retrieves the ServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdFilter field
   */
  public String[] getServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdFilter filter field
   */
  public void setServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
    try {
      this.setServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (EXT_DATA_LOOKUP.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter () {
    return this.ServiceInternalIdResets;
  }

  /**
   * Retrieves the ServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResetsFilter field
   */
  public String[] getServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdResetsFilter filter field
   */
  public void setServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  public String toString() {
    return ExtendedDataLocateObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ExtendedDataLocateObjectHelper.toMap(this, null);
  }
}
