/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountEDObjectFilter.java
 * Definition File: Customer/Account.xml
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

import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class AccountEDObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AccountEDObjectKeyFilter Key = null;
  /** raw field for: PARAM_DEF.param_name) */
  public    StringFilter[] ParamName  = null;
  protected boolean ParamNameFetch = false;
  protected boolean ParamNameSortAscending = true;
  protected boolean ParamNameCaseInsensitive = false;
  protected Integer ParamNameSort = null;
  /** raw field for: CMF_EXT_DATA.param_value) */
  public    StringFilter[] ParamValue  = null;
  protected boolean ParamValueFetch = false;
  protected boolean ParamValueSortAscending = true;
  protected boolean ParamValueCaseInsensitive = false;
  protected Integer ParamValueSort = null;
  /** raw field for: CMF_EXT_DATA.param_datatype) */
  public    IntegerFilter[] ParamDatatype  = null;
  protected boolean ParamDatatypeFetch = false;
  protected boolean ParamDatatypeSortAscending = true;
  protected Integer ParamDatatypeSort = null;
  private String _objName = "AccountEDObjectFilter";
  /** default constructor */
  public AccountEDObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AccountEDObjectFilter (AccountEDObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AccountEDObjectKeyFilter (other.Key);
    this.ParamName = other.ParamName;
    this.ParamNameFetch = other.ParamNameFetch;
    this.ParamNameSort = other.ParamNameSort;
    this.ParamNameCaseInsensitive = other.ParamNameCaseInsensitive;
    this.ParamNameSortAscending = other.ParamNameSortAscending;
    this.ParamValue = other.ParamValue;
    this.ParamValueFetch = other.ParamValueFetch;
    this.ParamValueSort = other.ParamValueSort;
    this.ParamValueCaseInsensitive = other.ParamValueCaseInsensitive;
    this.ParamValueSortAscending = other.ParamValueSortAscending;
    this.ParamDatatype = other.ParamDatatype;
    this.ParamDatatypeFetch = other.ParamDatatypeFetch;
    this.ParamDatatypeSort = other.ParamDatatypeSort;
    this.ParamDatatypeSortAscending = other.ParamDatatypeSortAscending;  }
  /** get the filter for this object's key
   * @return AccountEDObjectKeyFilter
   */
  public AccountEDObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AccountEDObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_EXT_DATA.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: ParamId (CMF_EXT_DATA.param_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.ParamIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamId (CMF_EXT_DATA.param_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdFetch;
  }
  /** Set the SortOrder for field: ParamId (CMF_EXT_DATA.param_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.ParamIdSort = value;
  }
  /** Retrieve SortOrder for field: ParamId (CMF_EXT_DATA.param_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamIdSort;
  }
  /** Set the sort direction for field: ParamId (CMF_EXT_DATA.param_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.ParamIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamId (CMF_EXT_DATA.param_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ParamIdSortAscending;
  }
  /** Set the field level filters for field: ParamId (CMF_EXT_DATA.param_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountEDObjectKeyFilter ();
    this.Key.ParamId = value;
  }
  /** Retrieve filter for field: ParamId (CMF_EXT_DATA.param_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ParamId;
  }
  /** Set the field level Fetch value for field: ParamName (PARAM_DEF.param_name)
   * @param fetch whether to fetch this field or not
   */
  public void setParamNameFetch (boolean fetch) {
    this.ParamNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamName (PARAM_DEF.param_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamNameFetch () {
    return this.ParamNameFetch;
  }
  /** Set the SortOrder for field: ParamName (PARAM_DEF.param_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamNameSortOrder (Integer value) {
    this.ParamNameSort = value;
  }
  /** Retrieve SortOrder for field: ParamName (PARAM_DEF.param_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamNameSortOrder () {
    return this.ParamNameSort;
  }
  /** Set the sort direction for field: ParamName (PARAM_DEF.param_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamNameSortDirection (boolean ascending) {
    this.ParamNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamName (PARAM_DEF.param_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamNameSortDirection () {
    return this.ParamNameSortAscending;
  }
  /** Set the case insensitive for field: ParamName (PARAM_DEF.param_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setParamNameCaseInsensitive (boolean ascending) {
    this.ParamNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ParamName (PARAM_DEF.param_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getParamNameCaseInsensitive () {
    return this.ParamNameCaseInsensitive;
  }
  /** Set the field level filters for field: ParamName (PARAM_DEF.param_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamNameFilter (StringFilter[] value) throws ServiceException {
    this.ParamName = value;
  }
  /** Retrieve filter for field: ParamName (PARAM_DEF.param_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getParamNameFilter () {
    return this.ParamName;
  }

  /**
   * Retrieves the ParamNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamNameFilter field
   */
  public String[] getParamNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamNameFilter filter value from a formatted string
   *
   * @param _value the ParamNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamNameFilter filter field
   */
  public void setParamNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamNameFilterFromFormattedString");
    try {
      this.setParamNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParamValue (CMF_EXT_DATA.param_value)
   * @param fetch whether to fetch this field or not
   */
  public void setParamValueFetch (boolean fetch) {
    this.ParamValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamValue (CMF_EXT_DATA.param_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamValueFetch () {
    return this.ParamValueFetch;
  }
  /** Set the SortOrder for field: ParamValue (CMF_EXT_DATA.param_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamValueSortOrder (Integer value) {
    this.ParamValueSort = value;
  }
  /** Retrieve SortOrder for field: ParamValue (CMF_EXT_DATA.param_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamValueSortOrder () {
    return this.ParamValueSort;
  }
  /** Set the sort direction for field: ParamValue (CMF_EXT_DATA.param_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamValueSortDirection (boolean ascending) {
    this.ParamValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamValue (CMF_EXT_DATA.param_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamValueSortDirection () {
    return this.ParamValueSortAscending;
  }
  /** Set the case insensitive for field: ParamValue (CMF_EXT_DATA.param_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setParamValueCaseInsensitive (boolean ascending) {
    this.ParamValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ParamValue (CMF_EXT_DATA.param_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getParamValueCaseInsensitive () {
    return this.ParamValueCaseInsensitive;
  }
  /** Set the field level filters for field: ParamValue (CMF_EXT_DATA.param_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamValueFilter (StringFilter[] value) throws ServiceException {
    this.ParamValue = value;
  }
  /** Retrieve filter for field: ParamValue (CMF_EXT_DATA.param_value)
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

  /** Set the field level Fetch value for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @param fetch whether to fetch this field or not
   */
  public void setParamDatatypeFetch (boolean fetch) {
    this.ParamDatatypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamDatatypeFetch () {
    return this.ParamDatatypeFetch;
  }
  /** Set the SortOrder for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamDatatypeSortOrder (Integer value) {
    this.ParamDatatypeSort = value;
  }
  /** Retrieve SortOrder for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamDatatypeSortOrder () {
    return this.ParamDatatypeSort;
  }
  /** Set the sort direction for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamDatatypeSortDirection (boolean ascending) {
    this.ParamDatatypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamDatatypeSortDirection () {
    return this.ParamDatatypeSortAscending;
  }
  /** Set the field level filters for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamDatatypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ParamDatatype = value;
  }
  /** Retrieve filter for field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamDatatypeFilter () {
    return this.ParamDatatype;
  }

  /**
   * Retrieves the ParamDatatypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamDatatypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamDatatypeFilter field
   */
  public String[] getParamDatatypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamDatatypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamDatatypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamDatatypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamDatatypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamDatatypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamDatatypeFilter filter value from a formatted string
   *
   * @param _value the ParamDatatypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamDatatypeFilter filter field
   */
  public void setParamDatatypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamDatatypeFilterFromFormattedString");
    try {
      this.setParamDatatypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamDatatypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamDatatypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamDatatypeFilterFromFormattedString");
  }

  public String toString() {
    return AccountEDObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountEDObjectHelper.toMap(this, null);
  }
}
