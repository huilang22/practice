/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractDiscountObjectKeyFilter.java
 * Definition File: Customer/ContractDiscount.xml
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

/** Key Filter for ContractDiscountObject object. */
public class ContractDiscountObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: DISCOUNT_PLANS.discount_id) */
  public    IntegerFilter[] DiscountId  = null;
  protected boolean DiscountIdFetch = false;
  protected boolean DiscountIdSortAscending = true;
  protected Integer DiscountIdSort = null;
  /** raw field for: CONTRACT_TYPES.contract_type) */
  public    IntegerFilter[] ContractType  = null;
  protected boolean ContractTypeFetch = false;
  protected boolean ContractTypeSortAscending = true;
  protected Integer ContractTypeSort = null;
  private String _objName = "ContractDiscountObjectKeyFilter";
  /** default constructor */
  public ContractDiscountObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ContractDiscountObjectKeyFilter (ContractDiscountObjectKeyFilter other)
  {
    if (other == null) return;
    this.DiscountId = other.DiscountId;
    this.DiscountIdFetch = other.DiscountIdFetch;
    this.DiscountIdSort = other.DiscountIdSort;
    this.DiscountIdSortAscending = other.DiscountIdSortAscending;
    this.ContractType = other.ContractType;
    this.ContractTypeFetch = other.ContractTypeFetch;
    this.ContractTypeSort = other.ContractTypeSort;
    this.ContractTypeSortAscending = other.ContractTypeSortAscending;
  }
  /** Set the field level Fetch value for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountIdFetch (boolean fetch) {
    this.DiscountIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountIdFetch () {
    return this.DiscountIdFetch;
  }
  /** Set the SortOrder for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountIdSortOrder (Integer value) {
    this.DiscountIdSort = value;
  }
  /** Retrieve SortOrder for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountIdSortOrder () {
    return this.DiscountIdSort;
  }
  /** Set the sort direction for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountIdSortDirection (boolean ascending) {
    this.DiscountIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountIdSortDirection () {
    return this.DiscountIdSortAscending;
  }
  /** Set the field level filters for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountId = value;
  }
  /** Retrieve filter for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountIdFilter () {
    return this.DiscountId;
  }

  /**
   * Retrieves the DiscountIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountIdFilter field
   */
  public String[] getDiscountIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountIdFilter filter value from a formatted string
   *
   * @param _value the DiscountIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountIdFilter filter field
   */
  public void setDiscountIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFilterFromFormattedString");
    try {
      this.setDiscountIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractType (CONTRACT_TYPES.contract_type)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTypeFetch (boolean fetch) {
    this.ContractTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTypeFetch () {
    return this.ContractTypeFetch;
  }
  /** Set the SortOrder for field: ContractType (CONTRACT_TYPES.contract_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTypeSortOrder (Integer value) {
    this.ContractTypeSort = value;
  }
  /** Retrieve SortOrder for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTypeSortOrder () {
    return this.ContractTypeSort;
  }
  /** Set the sort direction for field: ContractType (CONTRACT_TYPES.contract_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTypeSortDirection (boolean ascending) {
    this.ContractTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTypeSortDirection () {
    return this.ContractTypeSortAscending;
  }
  /** Set the field level filters for field: ContractType (CONTRACT_TYPES.contract_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractType = value;
  }
  /** Retrieve filter for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTypeFilter () {
    return this.ContractType;
  }

  /**
   * Retrieves the ContractTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTypeFilter field
   */
  public String[] getContractTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTypeFilter filter value from a formatted string
   *
   * @param _value the ContractTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTypeFilter filter field
   */
  public void setContractTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFilterFromFormattedString");
    try {
      this.setContractTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFilterFromFormattedString");
  }

  public String toString() {
    return ContractDiscountObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ContractDiscountObjectKeyHelper.toMap(this, null);
  }
}
