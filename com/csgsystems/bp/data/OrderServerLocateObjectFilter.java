/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: OrderServerLocateObjectFilter.java
 * Definition File: Catalog/AccountLocate.xml
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
public class OrderServerLocateObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public OrderServerLocateObjectKeyFilter Key = null;
  /** raw field for: SERVER_LOOKUP.server_id) */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.order_number) */
  public    StringFilter[] OrderNumber  = null;
  protected boolean OrderNumberFetch = false;
  protected boolean OrderNumberSortAscending = true;
  protected boolean OrderNumberCaseInsensitive = false;
  protected Integer OrderNumberSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.order_status_id) */
  public    IntegerFilter[] OrderStatusId  = null;
  protected boolean OrderStatusIdFetch = false;
  protected boolean OrderStatusIdSortAscending = true;
  protected Integer OrderStatusIdSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.contact_fname) */
  public    StringFilter[] ContactFname  = null;
  protected boolean ContactFnameFetch = false;
  protected boolean ContactFnameSortAscending = true;
  protected boolean ContactFnameCaseInsensitive = false;
  protected Integer ContactFnameSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.contact_lname) */
  public    StringFilter[] ContactLname  = null;
  protected boolean ContactLnameFetch = false;
  protected boolean ContactLnameSortAscending = true;
  protected boolean ContactLnameCaseInsensitive = false;
  protected Integer ContactLnameSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.contact_company) */
  public    StringFilter[] ContactCompany  = null;
  protected boolean ContactCompanyFetch = false;
  protected boolean ContactCompanySortAscending = true;
  protected boolean ContactCompanyCaseInsensitive = false;
  protected Integer ContactCompanySort = null;
  /** raw field for: ORD_ORDER_LOOKUP.contact_fname_find) */
  public    StringFilter[] ContactFnameFind  = null;
  protected boolean ContactFnameFindFetch = false;
  protected boolean ContactFnameFindSortAscending = true;
  protected boolean ContactFnameFindCaseInsensitive = false;
  protected Integer ContactFnameFindSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.contact_lname_find) */
  public    StringFilter[] ContactLnameFind  = null;
  protected boolean ContactLnameFindFetch = false;
  protected boolean ContactLnameFindSortAscending = true;
  protected boolean ContactLnameFindCaseInsensitive = false;
  protected Integer ContactLnameFindSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.contact_company_find) */
  public    StringFilter[] ContactCompanyFind  = null;
  protected boolean ContactCompanyFindFetch = false;
  protected boolean ContactCompanyFindSortAscending = true;
  protected boolean ContactCompanyFindCaseInsensitive = false;
  protected Integer ContactCompanyFindSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.contact_email) */
  public    StringFilter[] ContactEmail  = null;
  protected boolean ContactEmailFetch = false;
  protected boolean ContactEmailSortAscending = true;
  protected boolean ContactEmailCaseInsensitive = false;
  protected Integer ContactEmailSort = null;
  /** raw field for: ORD_ORDER_LOOKUP.batch_id) */
  public    BigIntegerFilter[] BatchId  = null;
  protected boolean BatchIdFetch = false;
  protected boolean BatchIdSortAscending = true;
  protected Integer BatchIdSort = null;
  private String _objName = "OrderServerLocateObjectFilter";
  /** default constructor */
  public OrderServerLocateObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public OrderServerLocateObjectFilter (OrderServerLocateObjectFilter other)
  {
    if (other == null) return;
    this.Key = new OrderServerLocateObjectKeyFilter (other.Key);
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.OrderNumber = other.OrderNumber;
    this.OrderNumberFetch = other.OrderNumberFetch;
    this.OrderNumberSort = other.OrderNumberSort;
    this.OrderNumberCaseInsensitive = other.OrderNumberCaseInsensitive;
    this.OrderNumberSortAscending = other.OrderNumberSortAscending;
    this.OrderStatusId = other.OrderStatusId;
    this.OrderStatusIdFetch = other.OrderStatusIdFetch;
    this.OrderStatusIdSort = other.OrderStatusIdSort;
    this.OrderStatusIdSortAscending = other.OrderStatusIdSortAscending;
    this.ContactFname = other.ContactFname;
    this.ContactFnameFetch = other.ContactFnameFetch;
    this.ContactFnameSort = other.ContactFnameSort;
    this.ContactFnameCaseInsensitive = other.ContactFnameCaseInsensitive;
    this.ContactFnameSortAscending = other.ContactFnameSortAscending;
    this.ContactLname = other.ContactLname;
    this.ContactLnameFetch = other.ContactLnameFetch;
    this.ContactLnameSort = other.ContactLnameSort;
    this.ContactLnameCaseInsensitive = other.ContactLnameCaseInsensitive;
    this.ContactLnameSortAscending = other.ContactLnameSortAscending;
    this.ContactCompany = other.ContactCompany;
    this.ContactCompanyFetch = other.ContactCompanyFetch;
    this.ContactCompanySort = other.ContactCompanySort;
    this.ContactCompanyCaseInsensitive = other.ContactCompanyCaseInsensitive;
    this.ContactCompanySortAscending = other.ContactCompanySortAscending;
    this.ContactFnameFind = other.ContactFnameFind;
    this.ContactFnameFindFetch = other.ContactFnameFindFetch;
    this.ContactFnameFindSort = other.ContactFnameFindSort;
    this.ContactFnameFindCaseInsensitive = other.ContactFnameFindCaseInsensitive;
    this.ContactFnameFindSortAscending = other.ContactFnameFindSortAscending;
    this.ContactLnameFind = other.ContactLnameFind;
    this.ContactLnameFindFetch = other.ContactLnameFindFetch;
    this.ContactLnameFindSort = other.ContactLnameFindSort;
    this.ContactLnameFindCaseInsensitive = other.ContactLnameFindCaseInsensitive;
    this.ContactLnameFindSortAscending = other.ContactLnameFindSortAscending;
    this.ContactCompanyFind = other.ContactCompanyFind;
    this.ContactCompanyFindFetch = other.ContactCompanyFindFetch;
    this.ContactCompanyFindSort = other.ContactCompanyFindSort;
    this.ContactCompanyFindCaseInsensitive = other.ContactCompanyFindCaseInsensitive;
    this.ContactCompanyFindSortAscending = other.ContactCompanyFindSortAscending;
    this.ContactEmail = other.ContactEmail;
    this.ContactEmailFetch = other.ContactEmailFetch;
    this.ContactEmailSort = other.ContactEmailSort;
    this.ContactEmailCaseInsensitive = other.ContactEmailCaseInsensitive;
    this.ContactEmailSortAscending = other.ContactEmailSortAscending;
    this.BatchId = other.BatchId;
    this.BatchIdFetch = other.BatchIdFetch;
    this.BatchIdSort = other.BatchIdSort;
    this.BatchIdSortAscending = other.BatchIdSortAscending;  }
  /** get the filter for this object's key
   * @return OrderServerLocateObjectKeyFilter
   */
  public OrderServerLocateObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (OrderServerLocateObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrderIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new OrderServerLocateObjectKeyFilter ();
    this.Key.OrderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrderIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.OrderIdFetch;
  }
  /** Set the SortOrder for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrderIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new OrderServerLocateObjectKeyFilter ();
    this.Key.OrderIdSort = value;
  }
  /** Retrieve SortOrder for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrderIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.OrderIdSort;
  }
  /** Set the sort direction for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrderIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new OrderServerLocateObjectKeyFilter ();
    this.Key.OrderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrderIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.OrderIdSortAscending;
  }
  /** Set the field level filters for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrderIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new OrderServerLocateObjectKeyFilter ();
    this.Key.OrderId = value;
  }
  /** Retrieve filter for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOrderIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.OrderId;
  }
  /** Set the field level Fetch value for field: ServerId (SERVER_LOOKUP.server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch) {
    this.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId (SERVER_LOOKUP.server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch () {
    return this.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId (SERVER_LOOKUP.server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value) {
    this.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId (SERVER_LOOKUP.server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder () {
    return this.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId (SERVER_LOOKUP.server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending) {
    this.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId (SERVER_LOOKUP.server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection () {
    return this.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId (SERVER_LOOKUP.server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerId = value;
  }
  /** Retrieve filter for field: ServerId (SERVER_LOOKUP.server_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerIdFilter () {
    return this.ServerId;
  }

  /**
   * Retrieves the ServerIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServerIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerIdFilter field
   */
  public String[] getServerIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServerIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServerIdFilter filter value from a formatted string
   *
   * @param _value the ServerIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServerIdFilter filter field
   */
  public void setServerIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServerIdFilterFromFormattedString");
    try {
      this.setServerIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (ORD_ORDER_LOOKUP.account_no)
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

  /** Set the field level Fetch value for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @param fetch whether to fetch this field or not
   */
  public void setOrderNumberFetch (boolean fetch) {
    this.OrderNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrderNumberFetch () {
    return this.OrderNumberFetch;
  }
  /** Set the SortOrder for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrderNumberSortOrder (Integer value) {
    this.OrderNumberSort = value;
  }
  /** Retrieve SortOrder for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrderNumberSortOrder () {
    return this.OrderNumberSort;
  }
  /** Set the sort direction for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrderNumberSortDirection (boolean ascending) {
    this.OrderNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrderNumberSortDirection () {
    return this.OrderNumberSortAscending;
  }
  /** Set the case insensitive for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOrderNumberCaseInsensitive (boolean ascending) {
    this.OrderNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOrderNumberCaseInsensitive () {
    return this.OrderNumberCaseInsensitive;
  }
  /** Set the field level filters for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrderNumberFilter (StringFilter[] value) throws ServiceException {
    this.OrderNumber = value;
  }
  /** Retrieve filter for field: OrderNumber (ORD_ORDER_LOOKUP.order_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOrderNumberFilter () {
    return this.OrderNumber;
  }

  /**
   * Retrieves the OrderNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrderNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderNumberFilter field
   */
  public String[] getOrderNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrderNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrderNumberFilter filter value from a formatted string
   *
   * @param _value the OrderNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrderNumberFilter filter field
   */
  public void setOrderNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrderNumberFilterFromFormattedString");
    try {
      this.setOrderNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrderStatusIdFetch (boolean fetch) {
    this.OrderStatusIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrderStatusIdFetch () {
    return this.OrderStatusIdFetch;
  }
  /** Set the SortOrder for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrderStatusIdSortOrder (Integer value) {
    this.OrderStatusIdSort = value;
  }
  /** Retrieve SortOrder for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrderStatusIdSortOrder () {
    return this.OrderStatusIdSort;
  }
  /** Set the sort direction for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrderStatusIdSortDirection (boolean ascending) {
    this.OrderStatusIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrderStatusIdSortDirection () {
    return this.OrderStatusIdSortAscending;
  }
  /** Set the field level filters for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrderStatusIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrderStatusId = value;
  }
  /** Retrieve filter for field: OrderStatusId (ORD_ORDER_LOOKUP.order_status_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrderStatusIdFilter () {
    return this.OrderStatusId;
  }

  /**
   * Retrieves the OrderStatusIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrderStatusIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderStatusIdFilter field
   */
  public String[] getOrderStatusIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderStatusIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrderStatusIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderStatusIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderStatusIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderStatusIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrderStatusIdFilter filter value from a formatted string
   *
   * @param _value the OrderStatusIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrderStatusIdFilter filter field
   */
  public void setOrderStatusIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrderStatusIdFilterFromFormattedString");
    try {
      this.setOrderStatusIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderStatusIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderStatusIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderStatusIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setContactFnameFetch (boolean fetch) {
    this.ContactFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactFnameFetch () {
    return this.ContactFnameFetch;
  }
  /** Set the SortOrder for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactFnameSortOrder (Integer value) {
    this.ContactFnameSort = value;
  }
  /** Retrieve SortOrder for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactFnameSortOrder () {
    return this.ContactFnameSort;
  }
  /** Set the sort direction for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactFnameSortDirection (boolean ascending) {
    this.ContactFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactFnameSortDirection () {
    return this.ContactFnameSortAscending;
  }
  /** Set the case insensitive for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContactFnameCaseInsensitive (boolean ascending) {
    this.ContactFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContactFnameCaseInsensitive () {
    return this.ContactFnameCaseInsensitive;
  }
  /** Set the field level filters for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactFnameFilter (StringFilter[] value) throws ServiceException {
    this.ContactFname = value;
  }
  /** Retrieve filter for field: ContactFname (ORD_ORDER_LOOKUP.contact_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContactFnameFilter () {
    return this.ContactFname;
  }

  /**
   * Retrieves the ContactFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactFnameFilter field
   */
  public String[] getContactFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactFnameFilter filter value from a formatted string
   *
   * @param _value the ContactFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactFnameFilter filter field
   */
  public void setContactFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactFnameFilterFromFormattedString");
    try {
      this.setContactFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setContactLnameFetch (boolean fetch) {
    this.ContactLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactLnameFetch () {
    return this.ContactLnameFetch;
  }
  /** Set the SortOrder for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactLnameSortOrder (Integer value) {
    this.ContactLnameSort = value;
  }
  /** Retrieve SortOrder for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactLnameSortOrder () {
    return this.ContactLnameSort;
  }
  /** Set the sort direction for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactLnameSortDirection (boolean ascending) {
    this.ContactLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactLnameSortDirection () {
    return this.ContactLnameSortAscending;
  }
  /** Set the case insensitive for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContactLnameCaseInsensitive (boolean ascending) {
    this.ContactLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContactLnameCaseInsensitive () {
    return this.ContactLnameCaseInsensitive;
  }
  /** Set the field level filters for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactLnameFilter (StringFilter[] value) throws ServiceException {
    this.ContactLname = value;
  }
  /** Retrieve filter for field: ContactLname (ORD_ORDER_LOOKUP.contact_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContactLnameFilter () {
    return this.ContactLname;
  }

  /**
   * Retrieves the ContactLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactLnameFilter field
   */
  public String[] getContactLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactLnameFilter filter value from a formatted string
   *
   * @param _value the ContactLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactLnameFilter filter field
   */
  public void setContactLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactLnameFilterFromFormattedString");
    try {
      this.setContactLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @param fetch whether to fetch this field or not
   */
  public void setContactCompanyFetch (boolean fetch) {
    this.ContactCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactCompanyFetch () {
    return this.ContactCompanyFetch;
  }
  /** Set the SortOrder for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactCompanySortOrder (Integer value) {
    this.ContactCompanySort = value;
  }
  /** Retrieve SortOrder for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactCompanySortOrder () {
    return this.ContactCompanySort;
  }
  /** Set the sort direction for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactCompanySortDirection (boolean ascending) {
    this.ContactCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactCompanySortDirection () {
    return this.ContactCompanySortAscending;
  }
  /** Set the case insensitive for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContactCompanyCaseInsensitive (boolean ascending) {
    this.ContactCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContactCompanyCaseInsensitive () {
    return this.ContactCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactCompanyFilter (StringFilter[] value) throws ServiceException {
    this.ContactCompany = value;
  }
  /** Retrieve filter for field: ContactCompany (ORD_ORDER_LOOKUP.contact_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContactCompanyFilter () {
    return this.ContactCompany;
  }

  /**
   * Retrieves the ContactCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactCompanyFilter field
   */
  public String[] getContactCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactCompanyFilter filter value from a formatted string
   *
   * @param _value the ContactCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactCompanyFilter filter field
   */
  public void setContactCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactCompanyFilterFromFormattedString");
    try {
      this.setContactCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @param fetch whether to fetch this field or not
   */
  public void setContactFnameFindFetch (boolean fetch) {
    this.ContactFnameFindFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactFnameFindFetch () {
    return this.ContactFnameFindFetch;
  }
  /** Set the SortOrder for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactFnameFindSortOrder (Integer value) {
    this.ContactFnameFindSort = value;
  }
  /** Retrieve SortOrder for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactFnameFindSortOrder () {
    return this.ContactFnameFindSort;
  }
  /** Set the sort direction for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactFnameFindSortDirection (boolean ascending) {
    this.ContactFnameFindSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactFnameFindSortDirection () {
    return this.ContactFnameFindSortAscending;
  }
  /** Set the case insensitive for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContactFnameFindCaseInsensitive (boolean ascending) {
    this.ContactFnameFindCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContactFnameFindCaseInsensitive () {
    return this.ContactFnameFindCaseInsensitive;
  }
  /** Set the field level filters for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactFnameFindFilter (StringFilter[] value) throws ServiceException {
    this.ContactFnameFind = value;
  }
  /** Retrieve filter for field: ContactFnameFind (ORD_ORDER_LOOKUP.contact_fname_find)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContactFnameFindFilter () {
    return this.ContactFnameFind;
  }

  /**
   * Retrieves the ContactFnameFindFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactFnameFindFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactFnameFindFilter field
   */
  public String[] getContactFnameFindFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactFnameFindFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactFnameFindFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactFnameFindFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactFnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactFnameFindFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactFnameFindFilter filter value from a formatted string
   *
   * @param _value the ContactFnameFindFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactFnameFindFilter filter field
   */
  public void setContactFnameFindFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactFnameFindFilterFromFormattedString");
    try {
      this.setContactFnameFindFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactFnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactFnameFindFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactFnameFindFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @param fetch whether to fetch this field or not
   */
  public void setContactLnameFindFetch (boolean fetch) {
    this.ContactLnameFindFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactLnameFindFetch () {
    return this.ContactLnameFindFetch;
  }
  /** Set the SortOrder for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactLnameFindSortOrder (Integer value) {
    this.ContactLnameFindSort = value;
  }
  /** Retrieve SortOrder for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactLnameFindSortOrder () {
    return this.ContactLnameFindSort;
  }
  /** Set the sort direction for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactLnameFindSortDirection (boolean ascending) {
    this.ContactLnameFindSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactLnameFindSortDirection () {
    return this.ContactLnameFindSortAscending;
  }
  /** Set the case insensitive for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContactLnameFindCaseInsensitive (boolean ascending) {
    this.ContactLnameFindCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContactLnameFindCaseInsensitive () {
    return this.ContactLnameFindCaseInsensitive;
  }
  /** Set the field level filters for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactLnameFindFilter (StringFilter[] value) throws ServiceException {
    this.ContactLnameFind = value;
  }
  /** Retrieve filter for field: ContactLnameFind (ORD_ORDER_LOOKUP.contact_lname_find)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContactLnameFindFilter () {
    return this.ContactLnameFind;
  }

  /**
   * Retrieves the ContactLnameFindFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactLnameFindFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactLnameFindFilter field
   */
  public String[] getContactLnameFindFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactLnameFindFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactLnameFindFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactLnameFindFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactLnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactLnameFindFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactLnameFindFilter filter value from a formatted string
   *
   * @param _value the ContactLnameFindFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactLnameFindFilter filter field
   */
  public void setContactLnameFindFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactLnameFindFilterFromFormattedString");
    try {
      this.setContactLnameFindFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactLnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactLnameFindFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactLnameFindFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @param fetch whether to fetch this field or not
   */
  public void setContactCompanyFindFetch (boolean fetch) {
    this.ContactCompanyFindFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactCompanyFindFetch () {
    return this.ContactCompanyFindFetch;
  }
  /** Set the SortOrder for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactCompanyFindSortOrder (Integer value) {
    this.ContactCompanyFindSort = value;
  }
  /** Retrieve SortOrder for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactCompanyFindSortOrder () {
    return this.ContactCompanyFindSort;
  }
  /** Set the sort direction for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactCompanyFindSortDirection (boolean ascending) {
    this.ContactCompanyFindSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactCompanyFindSortDirection () {
    return this.ContactCompanyFindSortAscending;
  }
  /** Set the case insensitive for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContactCompanyFindCaseInsensitive (boolean ascending) {
    this.ContactCompanyFindCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContactCompanyFindCaseInsensitive () {
    return this.ContactCompanyFindCaseInsensitive;
  }
  /** Set the field level filters for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactCompanyFindFilter (StringFilter[] value) throws ServiceException {
    this.ContactCompanyFind = value;
  }
  /** Retrieve filter for field: ContactCompanyFind (ORD_ORDER_LOOKUP.contact_company_find)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContactCompanyFindFilter () {
    return this.ContactCompanyFind;
  }

  /**
   * Retrieves the ContactCompanyFindFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactCompanyFindFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactCompanyFindFilter field
   */
  public String[] getContactCompanyFindFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactCompanyFindFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactCompanyFindFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactCompanyFindFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactCompanyFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactCompanyFindFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactCompanyFindFilter filter value from a formatted string
   *
   * @param _value the ContactCompanyFindFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactCompanyFindFilter filter field
   */
  public void setContactCompanyFindFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactCompanyFindFilterFromFormattedString");
    try {
      this.setContactCompanyFindFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactCompanyFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactCompanyFindFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactCompanyFindFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @param fetch whether to fetch this field or not
   */
  public void setContactEmailFetch (boolean fetch) {
    this.ContactEmailFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactEmailFetch () {
    return this.ContactEmailFetch;
  }
  /** Set the SortOrder for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactEmailSortOrder (Integer value) {
    this.ContactEmailSort = value;
  }
  /** Retrieve SortOrder for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactEmailSortOrder () {
    return this.ContactEmailSort;
  }
  /** Set the sort direction for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactEmailSortDirection (boolean ascending) {
    this.ContactEmailSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactEmailSortDirection () {
    return this.ContactEmailSortAscending;
  }
  /** Set the case insensitive for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContactEmailCaseInsensitive (boolean ascending) {
    this.ContactEmailCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContactEmailCaseInsensitive () {
    return this.ContactEmailCaseInsensitive;
  }
  /** Set the field level filters for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactEmailFilter (StringFilter[] value) throws ServiceException {
    this.ContactEmail = value;
  }
  /** Retrieve filter for field: ContactEmail (ORD_ORDER_LOOKUP.contact_email)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContactEmailFilter () {
    return this.ContactEmail;
  }

  /**
   * Retrieves the ContactEmailFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactEmailFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactEmailFilter field
   */
  public String[] getContactEmailFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactEmailFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactEmailFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactEmailFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactEmailFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactEmailFilter filter value from a formatted string
   *
   * @param _value the ContactEmailFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactEmailFilter filter field
   */
  public void setContactEmailFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactEmailFilterFromFormattedString");
    try {
      this.setContactEmailFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactEmailFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactEmailFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBatchIdFetch (boolean fetch) {
    this.BatchIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBatchIdFetch () {
    return this.BatchIdFetch;
  }
  /** Set the SortOrder for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBatchIdSortOrder (Integer value) {
    this.BatchIdSort = value;
  }
  /** Retrieve SortOrder for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBatchIdSortOrder () {
    return this.BatchIdSort;
  }
  /** Set the sort direction for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBatchIdSortDirection (boolean ascending) {
    this.BatchIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBatchIdSortDirection () {
    return this.BatchIdSortAscending;
  }
  /** Set the field level filters for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBatchIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BatchId = value;
  }
  /** Retrieve filter for field: BatchId (ORD_ORDER_LOOKUP.batch_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBatchIdFilter () {
    return this.BatchId;
  }

  /**
   * Retrieves the BatchIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BatchIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchIdFilter field
   */
  public String[] getBatchIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBatchIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BatchIdFilter filter value from a formatted string
   *
   * @param _value the BatchIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BatchIdFilter filter field
   */
  public void setBatchIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBatchIdFilterFromFormattedString");
    try {
      this.setBatchIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdFilterFromFormattedString");
  }

  public String toString() {
    return OrderServerLocateObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return OrderServerLocateObjectHelper.toMap(this, null);
  }
}
