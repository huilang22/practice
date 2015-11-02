/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiAutoPayCmfMapObjectKeyFilter.java
 * Definition File: Customer/AbiAutoPayCmfMap.xml
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

/** Key Filter for AbiAutoPayCmfMapObject object. */
public class AbiAutoPayCmfMapObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ABI_AUTO_PAY_CMF_MAP.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: ABI_AUTO_PAY_CMF_MAP.pay_off_method) */
  public    IntegerFilter[] PayOffMethod  = null;
  protected boolean PayOffMethodFetch = false;
  protected boolean PayOffMethodSortAscending = true;
  protected Integer PayOffMethodSort = null;
  /** raw field for: ABI_AUTO_PAY_CMF_MAP.charge_type_code) */
  public    IntegerFilter[] ChargeTypeCode  = null;
  protected boolean ChargeTypeCodeFetch = false;
  protected boolean ChargeTypeCodeSortAscending = true;
  protected Integer ChargeTypeCodeSort = null;
  private String _objName = "AbiAutoPayCmfMapObjectKeyFilter";
  /** default constructor */
  public AbiAutoPayCmfMapObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AbiAutoPayCmfMapObjectKeyFilter (AbiAutoPayCmfMapObjectKeyFilter other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.PayOffMethod = other.PayOffMethod;
    this.PayOffMethodFetch = other.PayOffMethodFetch;
    this.PayOffMethodSort = other.PayOffMethodSort;
    this.PayOffMethodSortAscending = other.PayOffMethodSortAscending;
    this.ChargeTypeCode = other.ChargeTypeCode;
    this.ChargeTypeCodeFetch = other.ChargeTypeCodeFetch;
    this.ChargeTypeCodeSort = other.ChargeTypeCodeSort;
    this.ChargeTypeCodeSortAscending = other.ChargeTypeCodeSortAscending;
  }
  /** Set the field level Fetch value for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
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

  /** Set the field level Fetch value for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @param fetch whether to fetch this field or not
   */
  public void setPayOffMethodFetch (boolean fetch) {
    this.PayOffMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayOffMethodFetch () {
    return this.PayOffMethodFetch;
  }
  /** Set the SortOrder for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayOffMethodSortOrder (Integer value) {
    this.PayOffMethodSort = value;
  }
  /** Retrieve SortOrder for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayOffMethodSortOrder () {
    return this.PayOffMethodSort;
  }
  /** Set the sort direction for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayOffMethodSortDirection (boolean ascending) {
    this.PayOffMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayOffMethodSortDirection () {
    return this.PayOffMethodSortAscending;
  }
  /** Set the field level filters for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayOffMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.PayOffMethod = value;
  }
  /** Retrieve filter for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPayOffMethodFilter () {
    return this.PayOffMethod;
  }

  /**
   * Retrieves the PayOffMethodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayOffMethodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayOffMethodFilter field
   */
  public String[] getPayOffMethodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayOffMethodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayOffMethodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayOffMethodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayOffMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayOffMethodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayOffMethodFilter filter value from a formatted string
   *
   * @param _value the PayOffMethodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayOffMethodFilter filter field
   */
  public void setPayOffMethodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayOffMethodFilterFromFormattedString");
    try {
      this.setPayOffMethodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayOffMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayOffMethodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayOffMethodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeTypeCodeFetch (boolean fetch) {
    this.ChargeTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeTypeCodeFetch () {
    return this.ChargeTypeCodeFetch;
  }
  /** Set the SortOrder for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeTypeCodeSortOrder (Integer value) {
    this.ChargeTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeTypeCodeSortOrder () {
    return this.ChargeTypeCodeSort;
  }
  /** Set the sort direction for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeTypeCodeSortDirection (boolean ascending) {
    this.ChargeTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeTypeCodeSortDirection () {
    return this.ChargeTypeCodeSortAscending;
  }
  /** Set the field level filters for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ChargeTypeCode = value;
  }
  /** Retrieve filter for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeTypeCodeFilter () {
    return this.ChargeTypeCode;
  }

  /**
   * Retrieves the ChargeTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeTypeCodeFilter field
   */
  public String[] getChargeTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChargeTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeTypeCodeFilter filter value from a formatted string
   *
   * @param _value the ChargeTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChargeTypeCodeFilter filter field
   */
  public void setChargeTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeTypeCodeFilterFromFormattedString");
    try {
      this.setChargeTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeTypeCodeFilterFromFormattedString");
  }

  public String toString() {
    return AbiAutoPayCmfMapObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AbiAutoPayCmfMapObjectKeyHelper.toMap(this, null);
  }
}
