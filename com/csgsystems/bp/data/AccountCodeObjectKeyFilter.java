/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeObjectKeyFilter.java
 * Definition File: Customer/AccountCode.xml
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

/** Key Filter for AccountCodeObject object. */
public class AccountCodeObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CMF_ACCOUNT_CODES.acg_tracking_id) */
  public    IntegerFilter[] AcgTrackingId  = null;
  protected boolean AcgTrackingIdFetch = false;
  protected boolean AcgTrackingIdSortAscending = true;
  protected Integer AcgTrackingIdSort = null;
  /** raw field for: CMF_ACCOUNT_CODES.acg_tracking_id_serv) */
  public    IntegerFilter[] AcgTrackingIdServ  = null;
  protected boolean AcgTrackingIdServFetch = false;
  protected boolean AcgTrackingIdServSortAscending = true;
  protected Integer AcgTrackingIdServSort = null;
  /** raw field for: CMF_ACCOUNT_CODES.account_code) */
  public    StringFilter[] AccountCode  = null;
  protected boolean AccountCodeFetch = false;
  protected boolean AccountCodeSortAscending = true;
  protected boolean AccountCodeCaseInsensitive = false;
  protected Integer AccountCodeSort = null;
  private String _objName = "AccountCodeObjectKeyFilter";
  /** default constructor */
  public AccountCodeObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AccountCodeObjectKeyFilter (AccountCodeObjectKeyFilter other)
  {
    if (other == null) return;
    this.AcgTrackingId = other.AcgTrackingId;
    this.AcgTrackingIdFetch = other.AcgTrackingIdFetch;
    this.AcgTrackingIdSort = other.AcgTrackingIdSort;
    this.AcgTrackingIdSortAscending = other.AcgTrackingIdSortAscending;
    this.AcgTrackingIdServ = other.AcgTrackingIdServ;
    this.AcgTrackingIdServFetch = other.AcgTrackingIdServFetch;
    this.AcgTrackingIdServSort = other.AcgTrackingIdServSort;
    this.AcgTrackingIdServSortAscending = other.AcgTrackingIdServSortAscending;
    this.AccountCode = other.AccountCode;
    this.AccountCodeFetch = other.AccountCodeFetch;
    this.AccountCodeSort = other.AccountCodeSort;
    this.AccountCodeCaseInsensitive = other.AccountCodeCaseInsensitive;
    this.AccountCodeSortAscending = other.AccountCodeSortAscending;
  }
  /** Set the field level Fetch value for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcgTrackingIdFetch (boolean fetch) {
    this.AcgTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcgTrackingIdFetch () {
    return this.AcgTrackingIdFetch;
  }
  /** Set the SortOrder for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcgTrackingIdSortOrder (Integer value) {
    this.AcgTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcgTrackingIdSortOrder () {
    return this.AcgTrackingIdSort;
  }
  /** Set the sort direction for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcgTrackingIdSortDirection (boolean ascending) {
    this.AcgTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcgTrackingIdSortDirection () {
    return this.AcgTrackingIdSortAscending;
  }
  /** Set the field level filters for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcgTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AcgTrackingId = value;
  }
  /** Retrieve filter for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcgTrackingIdFilter () {
    return this.AcgTrackingId;
  }

  /**
   * Retrieves the AcgTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AcgTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingIdFilter field
   */
  public String[] getAcgTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAcgTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AcgTrackingIdFilter filter value from a formatted string
   *
   * @param _value the AcgTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AcgTrackingIdFilter filter field
   */
  public void setAcgTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcgTrackingIdFilterFromFormattedString");
    try {
      this.setAcgTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setAcgTrackingIdServFetch (boolean fetch) {
    this.AcgTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcgTrackingIdServFetch () {
    return this.AcgTrackingIdServFetch;
  }
  /** Set the SortOrder for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcgTrackingIdServSortOrder (Integer value) {
    this.AcgTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcgTrackingIdServSortOrder () {
    return this.AcgTrackingIdServSort;
  }
  /** Set the sort direction for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcgTrackingIdServSortDirection (boolean ascending) {
    this.AcgTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcgTrackingIdServSortDirection () {
    return this.AcgTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcgTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.AcgTrackingIdServ = value;
  }
  /** Retrieve filter for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcgTrackingIdServFilter () {
    return this.AcgTrackingIdServ;
  }

  /**
   * Retrieves the AcgTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AcgTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingIdServFilter field
   */
  public String[] getAcgTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAcgTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AcgTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the AcgTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AcgTrackingIdServFilter filter field
   */
  public void setAcgTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcgTrackingIdServFilterFromFormattedString");
    try {
      this.setAcgTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountCodeFetch (boolean fetch) {
    this.AccountCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountCodeFetch () {
    return this.AccountCodeFetch;
  }
  /** Set the SortOrder for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountCodeSortOrder (Integer value) {
    this.AccountCodeSort = value;
  }
  /** Retrieve SortOrder for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountCodeSortOrder () {
    return this.AccountCodeSort;
  }
  /** Set the sort direction for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountCodeSortDirection (boolean ascending) {
    this.AccountCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountCodeSortDirection () {
    return this.AccountCodeSortAscending;
  }
  /** Set the case insensitive for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountCodeCaseInsensitive (boolean ascending) {
    this.AccountCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountCodeCaseInsensitive () {
    return this.AccountCodeCaseInsensitive;
  }
  /** Set the field level filters for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountCodeFilter (StringFilter[] value) throws ServiceException {
    this.AccountCode = value;
  }
  /** Retrieve filter for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountCodeFilter () {
    return this.AccountCode;
  }

  /**
   * Retrieves the AccountCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCodeFilter field
   */
  public String[] getAccountCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountCodeFilter filter value from a formatted string
   *
   * @param _value the AccountCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountCodeFilter filter field
   */
  public void setAccountCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCodeFilterFromFormattedString");
    try {
      this.setAccountCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCodeFilterFromFormattedString");
  }

  public String toString() {
    return AccountCodeObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountCodeObjectKeyHelper.toMap(this, null);
  }
}
