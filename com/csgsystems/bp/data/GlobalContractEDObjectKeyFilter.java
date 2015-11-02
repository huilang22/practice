/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalContractEDObjectKeyFilter.java
 * Definition File: Customer/GlobalContract.xml
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

/** Key Filter for GlobalContractEDObject object. */
public class GlobalContractEDObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CUSTOMER_CONTRACT_EXT_DATA.view_id) */
  public    BigIntegerFilter[] ViewId  = null;
  protected boolean ViewIdFetch = false;
  protected boolean ViewIdSortAscending = true;
  protected Integer ViewIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_EXT_DATA.param_id) */
  public    IntegerFilter[] ParamId  = null;
  protected boolean ParamIdFetch = false;
  protected boolean ParamIdSortAscending = true;
  protected Integer ParamIdSort = null;
  private String _objName = "GlobalContractEDObjectKeyFilter";
  /** default constructor */
  public GlobalContractEDObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public GlobalContractEDObjectKeyFilter (GlobalContractEDObjectKeyFilter other)
  {
    if (other == null) return;
    this.ViewId = other.ViewId;
    this.ViewIdFetch = other.ViewIdFetch;
    this.ViewIdSort = other.ViewIdSort;
    this.ViewIdSortAscending = other.ViewIdSortAscending;
    this.ParamId = other.ParamId;
    this.ParamIdFetch = other.ParamIdFetch;
    this.ParamIdSort = other.ParamIdSort;
    this.ParamIdSortAscending = other.ParamIdSortAscending;
  }
  /** Set the field level Fetch value for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * @param fetch whether to fetch this field or not
   */
  public void setViewIdFetch (boolean fetch) {
    this.ViewIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewIdFetch () {
    return this.ViewIdFetch;
  }
  /** Set the SortOrder for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewIdSortOrder (Integer value) {
    this.ViewIdSort = value;
  }
  /** Retrieve SortOrder for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewIdSortOrder () {
    return this.ViewIdSort;
  }
  /** Set the sort direction for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewIdSortDirection (boolean ascending) {
    this.ViewIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewIdSortDirection () {
    return this.ViewIdSortAscending;
  }
  /** Set the field level filters for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ViewId = value;
  }
  /** Retrieve filter for field: ViewId (CUSTOMER_CONTRACT_EXT_DATA.view_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getViewIdFilter () {
    return this.ViewId;
  }

  /**
   * Retrieves the ViewIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewIdFilter field
   */
  public String[] getViewIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ViewIdFilter filter value from a formatted string
   *
   * @param _value the ViewIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewIdFilter filter field
   */
  public void setViewIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewIdFilterFromFormattedString");
    try {
      this.setViewIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParamIdFetch (boolean fetch) {
    this.ParamIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParamIdFetch () {
    return this.ParamIdFetch;
  }
  /** Set the SortOrder for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParamIdSortOrder (Integer value) {
    this.ParamIdSort = value;
  }
  /** Retrieve SortOrder for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParamIdSortOrder () {
    return this.ParamIdSort;
  }
  /** Set the sort direction for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParamIdSortDirection (boolean ascending) {
    this.ParamIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParamIdSortDirection () {
    return this.ParamIdSortAscending;
  }
  /** Set the field level filters for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParamIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParamId = value;
  }
  /** Retrieve filter for field: ParamId (CUSTOMER_CONTRACT_EXT_DATA.param_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParamIdFilter () {
    return this.ParamId;
  }

  /**
   * Retrieves the ParamIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParamIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamIdFilter field
   */
  public String[] getParamIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParamIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParamIdFilter filter value from a formatted string
   *
   * @param _value the ParamIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParamIdFilter filter field
   */
  public void setParamIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParamIdFilterFromFormattedString");
    try {
      this.setParamIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParamIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamIdFilterFromFormattedString");
  }

  public String toString() {
    return GlobalContractEDObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GlobalContractEDObjectKeyHelper.toMap(this, null);
  }
}
