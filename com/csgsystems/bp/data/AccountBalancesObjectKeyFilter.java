/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBalancesObjectKeyFilter.java
 * Definition File: Customer/AccountBalances.xml
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

/** Key Filter for AccountBalancesObject object. */
public class AccountBalancesObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ACCOUNT_BALANCES.balance_tracking_id) */
  public    IntegerFilter[] BalanceTrackingId  = null;
  protected boolean BalanceTrackingIdFetch = false;
  protected boolean BalanceTrackingIdSortAscending = true;
  protected Integer BalanceTrackingIdSort = null;
  /** raw field for: ACCOUNT_BALANCES.balance_tracking_id_serv) */
  public    IntegerFilter[] BalanceTrackingIdServ  = null;
  protected boolean BalanceTrackingIdServFetch = false;
  protected boolean BalanceTrackingIdServSortAscending = true;
  protected Integer BalanceTrackingIdServSort = null;
  private String _objName = "AccountBalancesObjectKeyFilter";
  /** default constructor */
  public AccountBalancesObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AccountBalancesObjectKeyFilter (AccountBalancesObjectKeyFilter other)
  {
    if (other == null) return;
    this.BalanceTrackingId = other.BalanceTrackingId;
    this.BalanceTrackingIdFetch = other.BalanceTrackingIdFetch;
    this.BalanceTrackingIdSort = other.BalanceTrackingIdSort;
    this.BalanceTrackingIdSortAscending = other.BalanceTrackingIdSortAscending;
    this.BalanceTrackingIdServ = other.BalanceTrackingIdServ;
    this.BalanceTrackingIdServFetch = other.BalanceTrackingIdServFetch;
    this.BalanceTrackingIdServSort = other.BalanceTrackingIdServSort;
    this.BalanceTrackingIdServSortAscending = other.BalanceTrackingIdServSortAscending;
  }
  /** Set the field level Fetch value for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceTrackingIdFetch (boolean fetch) {
    this.BalanceTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceTrackingIdFetch () {
    return this.BalanceTrackingIdFetch;
  }
  /** Set the SortOrder for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceTrackingIdSortOrder (Integer value) {
    this.BalanceTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceTrackingIdSortOrder () {
    return this.BalanceTrackingIdSort;
  }
  /** Set the sort direction for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceTrackingIdSortDirection (boolean ascending) {
    this.BalanceTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceTrackingIdSortDirection () {
    return this.BalanceTrackingIdSortAscending;
  }
  /** Set the field level filters for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceTrackingId = value;
  }
  /** Retrieve filter for field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBalanceTrackingIdFilter () {
    return this.BalanceTrackingId;
  }

  /**
   * Retrieves the BalanceTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTrackingIdFilter field
   */
  public String[] getBalanceTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceTrackingIdFilter filter value from a formatted string
   *
   * @param _value the BalanceTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceTrackingIdFilter filter field
   */
  public void setBalanceTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceTrackingIdFilterFromFormattedString");
    try {
      this.setBalanceTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceTrackingIdServFetch (boolean fetch) {
    this.BalanceTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceTrackingIdServFetch () {
    return this.BalanceTrackingIdServFetch;
  }
  /** Set the SortOrder for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceTrackingIdServSortOrder (Integer value) {
    this.BalanceTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceTrackingIdServSortOrder () {
    return this.BalanceTrackingIdServSort;
  }
  /** Set the sort direction for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceTrackingIdServSortDirection (boolean ascending) {
    this.BalanceTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceTrackingIdServSortDirection () {
    return this.BalanceTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceTrackingIdServ = value;
  }
  /** Retrieve filter for field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBalanceTrackingIdServFilter () {
    return this.BalanceTrackingIdServ;
  }

  /**
   * Retrieves the BalanceTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTrackingIdServFilter field
   */
  public String[] getBalanceTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the BalanceTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceTrackingIdServFilter filter field
   */
  public void setBalanceTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceTrackingIdServFilterFromFormattedString");
    try {
      this.setBalanceTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return AccountBalancesObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountBalancesObjectKeyHelper.toMap(this, null);
  }
}
