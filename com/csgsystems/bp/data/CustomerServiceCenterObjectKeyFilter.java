/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerServiceCenterObjectKeyFilter.java
 * Definition File: Customer/CustomerServiceCenter.xml
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

/** Key Filter for CustomerServiceCenterObject object. */
public class CustomerServiceCenterObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CUSTOMER_SERVICE_CENTERS.service_center_type) */
  public    IntegerFilter[] ServiceCenterType  = null;
  protected boolean ServiceCenterTypeFetch = false;
  protected boolean ServiceCenterTypeSortAscending = true;
  protected Integer ServiceCenterTypeSort = null;
  /** raw field for: CUSTOMER_SERVICE_CENTERS.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  private String _objName = "CustomerServiceCenterObjectKeyFilter";
  /** default constructor */
  public CustomerServiceCenterObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CustomerServiceCenterObjectKeyFilter (CustomerServiceCenterObjectKeyFilter other)
  {
    if (other == null) return;
    this.ServiceCenterType = other.ServiceCenterType;
    this.ServiceCenterTypeFetch = other.ServiceCenterTypeFetch;
    this.ServiceCenterTypeSort = other.ServiceCenterTypeSort;
    this.ServiceCenterTypeSortAscending = other.ServiceCenterTypeSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
  }
  /** Set the field level Fetch value for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterTypeFetch (boolean fetch) {
    this.ServiceCenterTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterTypeFetch () {
    return this.ServiceCenterTypeFetch;
  }
  /** Set the SortOrder for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterTypeSortOrder (Integer value) {
    this.ServiceCenterTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterTypeSortOrder () {
    return this.ServiceCenterTypeSort;
  }
  /** Set the sort direction for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterTypeSortDirection (boolean ascending) {
    this.ServiceCenterTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterTypeSortDirection () {
    return this.ServiceCenterTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceCenterType = value;
  }
  /** Retrieve filter for field: ServiceCenterType (CUSTOMER_SERVICE_CENTERS.service_center_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceCenterTypeFilter () {
    return this.ServiceCenterType;
  }

  /**
   * Retrieves the ServiceCenterTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceCenterTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterTypeFilter field
   */
  public String[] getServiceCenterTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceCenterTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceCenterTypeFilter filter value from a formatted string
   *
   * @param _value the ServiceCenterTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceCenterTypeFilter filter field
   */
  public void setServiceCenterTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceCenterTypeFilterFromFormattedString");
    try {
      this.setServiceCenterTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CUSTOMER_SERVICE_CENTERS.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter () {
    return this.AccountInternalId;
  }

  /**
   * Retrieves the AccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalIdFilter field
   */
  public String[] getAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountInternalIdFilter filter field
   */
  public void setAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
    try {
      this.setAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  public String toString() {
    return CustomerServiceCenterObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CustomerServiceCenterObjectKeyHelper.toMap(this, null);
  }
}
