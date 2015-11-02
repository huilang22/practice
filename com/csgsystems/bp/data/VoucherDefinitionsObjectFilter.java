/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherDefinitionsObjectFilter.java
 * Definition File: Catalog/VoucherDefinitions.xml
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

import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class VoucherDefinitionsObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public VoucherDefinitionsObjectKeyFilter Key = null;
  /** raw field for: VOUCHER_DEFINITIONS.voucher_type_id) */
  public    BigIntegerFilter[] VoucherTypeId  = null;
  protected boolean VoucherTypeIdFetch = false;
  protected boolean VoucherTypeIdSortAscending = true;
  protected Integer VoucherTypeIdSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.unique_voucher_id) */
  public    BigIntegerFilter[] UniqueVoucherId  = null;
  protected boolean UniqueVoucherIdFetch = false;
  protected boolean UniqueVoucherIdSortAscending = true;
  protected Integer UniqueVoucherIdSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.pin_code1) */
  public    StringFilter[] PinCode1  = null;
  protected boolean PinCode1Fetch = false;
  protected boolean PinCode1SortAscending = true;
  protected boolean PinCode1CaseInsensitive = false;
  protected Integer PinCode1Sort = null;
  /** raw field for: VOUCHER_DEFINITIONS.pin_code2) */
  public    StringFilter[] PinCode2  = null;
  protected boolean PinCode2Fetch = false;
  protected boolean PinCode2SortAscending = true;
  protected boolean PinCode2CaseInsensitive = false;
  protected Integer PinCode2Sort = null;
  /** raw field for: VOUCHER_DEFINITIONS.unit_credit_contract_id) */
  public    BigIntegerFilter[] UnitCreditContractId  = null;
  protected boolean UnitCreditContractIdFetch = false;
  protected boolean UnitCreditContractIdSortAscending = true;
  protected Integer UnitCreditContractIdSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.number_of_units) */
  public    BigIntegerFilter[] NumberOfUnits  = null;
  protected boolean NumberOfUnitsFetch = false;
  protected boolean NumberOfUnitsSortAscending = true;
  protected Integer NumberOfUnitsSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.currency_code) */
  public    BigIntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.location_code) */
  public    BigIntegerFilter[] LocationCode  = null;
  protected boolean LocationCodeFetch = false;
  protected boolean LocationCodeSortAscending = true;
  protected Integer LocationCodeSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.batch_id) */
  public    BigIntegerFilter[] BatchId  = null;
  protected boolean BatchIdFetch = false;
  protected boolean BatchIdSortAscending = true;
  protected Integer BatchIdSort = null;
  /** raw field for: VOUCHER_DEFINITIONS.check_sum) */
  public    StringFilter[] CheckSum  = null;
  protected boolean CheckSumFetch = false;
  protected boolean CheckSumSortAscending = true;
  protected boolean CheckSumCaseInsensitive = false;
  protected Integer CheckSumSort = null;
  private String _objName = "VoucherDefinitionsObjectFilter";
  /** default constructor */
  public VoucherDefinitionsObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public VoucherDefinitionsObjectFilter (VoucherDefinitionsObjectFilter other)
  {
    if (other == null) return;
    this.Key = new VoucherDefinitionsObjectKeyFilter (other.Key);
    this.VoucherTypeId = other.VoucherTypeId;
    this.VoucherTypeIdFetch = other.VoucherTypeIdFetch;
    this.VoucherTypeIdSort = other.VoucherTypeIdSort;
    this.VoucherTypeIdSortAscending = other.VoucherTypeIdSortAscending;
    this.UniqueVoucherId = other.UniqueVoucherId;
    this.UniqueVoucherIdFetch = other.UniqueVoucherIdFetch;
    this.UniqueVoucherIdSort = other.UniqueVoucherIdSort;
    this.UniqueVoucherIdSortAscending = other.UniqueVoucherIdSortAscending;
    this.PinCode1 = other.PinCode1;
    this.PinCode1Fetch = other.PinCode1Fetch;
    this.PinCode1Sort = other.PinCode1Sort;
    this.PinCode1CaseInsensitive = other.PinCode1CaseInsensitive;
    this.PinCode1SortAscending = other.PinCode1SortAscending;
    this.PinCode2 = other.PinCode2;
    this.PinCode2Fetch = other.PinCode2Fetch;
    this.PinCode2Sort = other.PinCode2Sort;
    this.PinCode2CaseInsensitive = other.PinCode2CaseInsensitive;
    this.PinCode2SortAscending = other.PinCode2SortAscending;
    this.UnitCreditContractId = other.UnitCreditContractId;
    this.UnitCreditContractIdFetch = other.UnitCreditContractIdFetch;
    this.UnitCreditContractIdSort = other.UnitCreditContractIdSort;
    this.UnitCreditContractIdSortAscending = other.UnitCreditContractIdSortAscending;
    this.NumberOfUnits = other.NumberOfUnits;
    this.NumberOfUnitsFetch = other.NumberOfUnitsFetch;
    this.NumberOfUnitsSort = other.NumberOfUnitsSort;
    this.NumberOfUnitsSortAscending = other.NumberOfUnitsSortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.LocationCode = other.LocationCode;
    this.LocationCodeFetch = other.LocationCodeFetch;
    this.LocationCodeSort = other.LocationCodeSort;
    this.LocationCodeSortAscending = other.LocationCodeSortAscending;
    this.BatchId = other.BatchId;
    this.BatchIdFetch = other.BatchIdFetch;
    this.BatchIdSort = other.BatchIdSort;
    this.BatchIdSortAscending = other.BatchIdSortAscending;
    this.CheckSum = other.CheckSum;
    this.CheckSumFetch = other.CheckSumFetch;
    this.CheckSumSort = other.CheckSumSort;
    this.CheckSumCaseInsensitive = other.CheckSumCaseInsensitive;
    this.CheckSumSortAscending = other.CheckSumSortAscending;  }
  /** get the filter for this object's key
   * @return VoucherDefinitionsObjectKeyFilter
   */
  public VoucherDefinitionsObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (VoucherDefinitionsObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @param fetch whether to fetch this field or not
   */
  public void setVoucherIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new VoucherDefinitionsObjectKeyFilter ();
    this.Key.VoucherIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getVoucherIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.VoucherIdFetch;
  }
  /** Set the SortOrder for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVoucherIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new VoucherDefinitionsObjectKeyFilter ();
    this.Key.VoucherIdSort = value;
  }
  /** Retrieve SortOrder for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVoucherIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.VoucherIdSort;
  }
  /** Set the sort direction for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVoucherIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherDefinitionsObjectKeyFilter ();
    this.Key.VoucherIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVoucherIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.VoucherIdSortAscending;
  }
  /** Set the case insensitive for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setVoucherIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherDefinitionsObjectKeyFilter ();
    this.Key.VoucherIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getVoucherIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.VoucherIdCaseInsensitive;
  }
  /** Set the field level filters for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVoucherIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new VoucherDefinitionsObjectKeyFilter ();
    this.Key.VoucherId = value;
  }
  /** Retrieve filter for field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getVoucherIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.VoucherId;
  }
  /** Set the field level Fetch value for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setVoucherTypeIdFetch (boolean fetch) {
    this.VoucherTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getVoucherTypeIdFetch () {
    return this.VoucherTypeIdFetch;
  }
  /** Set the SortOrder for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVoucherTypeIdSortOrder (Integer value) {
    this.VoucherTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVoucherTypeIdSortOrder () {
    return this.VoucherTypeIdSort;
  }
  /** Set the sort direction for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVoucherTypeIdSortDirection (boolean ascending) {
    this.VoucherTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVoucherTypeIdSortDirection () {
    return this.VoucherTypeIdSortAscending;
  }
  /** Set the field level filters for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVoucherTypeIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.VoucherTypeId = value;
  }
  /** Retrieve filter for field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getVoucherTypeIdFilter () {
    return this.VoucherTypeId;
  }

  /**
   * Retrieves the VoucherTypeIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The VoucherTypeIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherTypeIdFilter field
   */
  public String[] getVoucherTypeIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypeIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getVoucherTypeIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypeIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherTypeIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the VoucherTypeIdFilter filter value from a formatted string
   *
   * @param _value the VoucherTypeIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the VoucherTypeIdFilter filter field
   */
  public void setVoucherTypeIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVoucherTypeIdFilterFromFormattedString");
    try {
      this.setVoucherTypeIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherTypeIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherTypeIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUniqueVoucherIdFetch (boolean fetch) {
    this.UniqueVoucherIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUniqueVoucherIdFetch () {
    return this.UniqueVoucherIdFetch;
  }
  /** Set the SortOrder for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUniqueVoucherIdSortOrder (Integer value) {
    this.UniqueVoucherIdSort = value;
  }
  /** Retrieve SortOrder for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUniqueVoucherIdSortOrder () {
    return this.UniqueVoucherIdSort;
  }
  /** Set the sort direction for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUniqueVoucherIdSortDirection (boolean ascending) {
    this.UniqueVoucherIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUniqueVoucherIdSortDirection () {
    return this.UniqueVoucherIdSortAscending;
  }
  /** Set the field level filters for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUniqueVoucherIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UniqueVoucherId = value;
  }
  /** Retrieve filter for field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUniqueVoucherIdFilter () {
    return this.UniqueVoucherId;
  }

  /**
   * Retrieves the UniqueVoucherIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UniqueVoucherIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UniqueVoucherIdFilter field
   */
  public String[] getUniqueVoucherIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUniqueVoucherIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUniqueVoucherIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUniqueVoucherIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UniqueVoucherIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUniqueVoucherIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UniqueVoucherIdFilter filter value from a formatted string
   *
   * @param _value the UniqueVoucherIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UniqueVoucherIdFilter filter field
   */
  public void setUniqueVoucherIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUniqueVoucherIdFilterFromFormattedString");
    try {
      this.setUniqueVoucherIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UniqueVoucherIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUniqueVoucherIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUniqueVoucherIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @param fetch whether to fetch this field or not
   */
  public void setPinCode1Fetch (boolean fetch) {
    this.PinCode1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @return boolean the Fetch value for this field
   */
  public boolean getPinCode1Fetch () {
    return this.PinCode1Fetch;
  }
  /** Set the SortOrder for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPinCode1SortOrder (Integer value) {
    this.PinCode1Sort = value;
  }
  /** Retrieve SortOrder for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPinCode1SortOrder () {
    return this.PinCode1Sort;
  }
  /** Set the sort direction for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPinCode1SortDirection (boolean ascending) {
    this.PinCode1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPinCode1SortDirection () {
    return this.PinCode1SortAscending;
  }
  /** Set the case insensitive for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPinCode1CaseInsensitive (boolean ascending) {
    this.PinCode1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPinCode1CaseInsensitive () {
    return this.PinCode1CaseInsensitive;
  }
  /** Set the field level filters for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPinCode1Filter (StringFilter[] value) throws ServiceException {
    this.PinCode1 = value;
  }
  /** Retrieve filter for field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPinCode1Filter () {
    return this.PinCode1;
  }

  /**
   * Retrieves the PinCode1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PinCode1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinCode1Filter field
   */
  public String[] getPinCode1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPinCode1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinCode1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PinCode1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinCode1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PinCode1Filter filter value from a formatted string
   *
   * @param _value the PinCode1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PinCode1Filter filter field
   */
  public void setPinCode1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPinCode1FilterFromFormattedString");
    try {
      this.setPinCode1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PinCode1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinCode1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinCode1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @param fetch whether to fetch this field or not
   */
  public void setPinCode2Fetch (boolean fetch) {
    this.PinCode2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @return boolean the Fetch value for this field
   */
  public boolean getPinCode2Fetch () {
    return this.PinCode2Fetch;
  }
  /** Set the SortOrder for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPinCode2SortOrder (Integer value) {
    this.PinCode2Sort = value;
  }
  /** Retrieve SortOrder for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPinCode2SortOrder () {
    return this.PinCode2Sort;
  }
  /** Set the sort direction for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPinCode2SortDirection (boolean ascending) {
    this.PinCode2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPinCode2SortDirection () {
    return this.PinCode2SortAscending;
  }
  /** Set the case insensitive for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPinCode2CaseInsensitive (boolean ascending) {
    this.PinCode2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPinCode2CaseInsensitive () {
    return this.PinCode2CaseInsensitive;
  }
  /** Set the field level filters for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPinCode2Filter (StringFilter[] value) throws ServiceException {
    this.PinCode2 = value;
  }
  /** Retrieve filter for field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPinCode2Filter () {
    return this.PinCode2;
  }

  /**
   * Retrieves the PinCode2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PinCode2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinCode2Filter field
   */
  public String[] getPinCode2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPinCode2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinCode2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PinCode2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinCode2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PinCode2Filter filter value from a formatted string
   *
   * @param _value the PinCode2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PinCode2Filter filter field
   */
  public void setPinCode2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPinCode2FilterFromFormattedString");
    try {
      this.setPinCode2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PinCode2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinCode2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinCode2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitCreditContractIdFetch (boolean fetch) {
    this.UnitCreditContractIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitCreditContractIdFetch () {
    return this.UnitCreditContractIdFetch;
  }
  /** Set the SortOrder for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitCreditContractIdSortOrder (Integer value) {
    this.UnitCreditContractIdSort = value;
  }
  /** Retrieve SortOrder for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitCreditContractIdSortOrder () {
    return this.UnitCreditContractIdSort;
  }
  /** Set the sort direction for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitCreditContractIdSortDirection (boolean ascending) {
    this.UnitCreditContractIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitCreditContractIdSortDirection () {
    return this.UnitCreditContractIdSortAscending;
  }
  /** Set the field level filters for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitCreditContractIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UnitCreditContractId = value;
  }
  /** Retrieve filter for field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnitCreditContractIdFilter () {
    return this.UnitCreditContractId;
  }

  /**
   * Retrieves the UnitCreditContractIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitCreditContractIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCreditContractIdFilter field
   */
  public String[] getUnitCreditContractIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCreditContractIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitCreditContractIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCreditContractIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCreditContractIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCreditContractIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitCreditContractIdFilter filter value from a formatted string
   *
   * @param _value the UnitCreditContractIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitCreditContractIdFilter filter field
   */
  public void setUnitCreditContractIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitCreditContractIdFilterFromFormattedString");
    try {
      this.setUnitCreditContractIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCreditContractIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCreditContractIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCreditContractIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @param fetch whether to fetch this field or not
   */
  public void setNumberOfUnitsFetch (boolean fetch) {
    this.NumberOfUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getNumberOfUnitsFetch () {
    return this.NumberOfUnitsFetch;
  }
  /** Set the SortOrder for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNumberOfUnitsSortOrder (Integer value) {
    this.NumberOfUnitsSort = value;
  }
  /** Retrieve SortOrder for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNumberOfUnitsSortOrder () {
    return this.NumberOfUnitsSort;
  }
  /** Set the sort direction for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNumberOfUnitsSortDirection (boolean ascending) {
    this.NumberOfUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNumberOfUnitsSortDirection () {
    return this.NumberOfUnitsSortAscending;
  }
  /** Set the field level filters for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNumberOfUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.NumberOfUnits = value;
  }
  /** Retrieve filter for field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNumberOfUnitsFilter () {
    return this.NumberOfUnits;
  }

  /**
   * Retrieves the NumberOfUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NumberOfUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumberOfUnitsFilter field
   */
  public String[] getNumberOfUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumberOfUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNumberOfUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumberOfUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumberOfUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumberOfUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NumberOfUnitsFilter filter value from a formatted string
   *
   * @param _value the NumberOfUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NumberOfUnitsFilter filter field
   */
  public void setNumberOfUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNumberOfUnitsFilterFromFormattedString");
    try {
      this.setNumberOfUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumberOfUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumberOfUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumberOfUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Amount (VOUCHER_DEFINITIONS.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (VOUCHER_DEFINITIONS.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (VOUCHER_DEFINITIONS.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (VOUCHER_DEFINITIONS.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (VOUCHER_DEFINITIONS.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (VOUCHER_DEFINITIONS.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (VOUCHER_DEFINITIONS.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (VOUCHER_DEFINITIONS.amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmountFilter () {
    return this.Amount;
  }

  /**
   * Retrieves the AmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */
  public String[] getAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLocationCodeFetch (boolean fetch) {
    this.LocationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLocationCodeFetch () {
    return this.LocationCodeFetch;
  }
  /** Set the SortOrder for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLocationCodeSortOrder (Integer value) {
    this.LocationCodeSort = value;
  }
  /** Retrieve SortOrder for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLocationCodeSortOrder () {
    return this.LocationCodeSort;
  }
  /** Set the sort direction for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLocationCodeSortDirection (boolean ascending) {
    this.LocationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLocationCodeSortDirection () {
    return this.LocationCodeSortAscending;
  }
  /** Set the field level filters for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLocationCodeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LocationCode = value;
  }
  /** Retrieve filter for field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLocationCodeFilter () {
    return this.LocationCode;
  }

  /**
   * Retrieves the LocationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LocationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationCodeFilter field
   */
  public String[] getLocationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLocationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LocationCodeFilter filter value from a formatted string
   *
   * @param _value the LocationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LocationCodeFilter filter field
   */
  public void setLocationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLocationCodeFilterFromFormattedString");
    try {
      this.setLocationCodeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBatchIdFetch (boolean fetch) {
    this.BatchIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBatchIdFetch () {
    return this.BatchIdFetch;
  }
  /** Set the SortOrder for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBatchIdSortOrder (Integer value) {
    this.BatchIdSort = value;
  }
  /** Retrieve SortOrder for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBatchIdSortOrder () {
    return this.BatchIdSort;
  }
  /** Set the sort direction for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBatchIdSortDirection (boolean ascending) {
    this.BatchIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBatchIdSortDirection () {
    return this.BatchIdSortAscending;
  }
  /** Set the field level filters for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBatchIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BatchId = value;
  }
  /** Retrieve filter for field: BatchId (VOUCHER_DEFINITIONS.batch_id)
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

  /** Set the field level Fetch value for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @param fetch whether to fetch this field or not
   */
  public void setCheckSumFetch (boolean fetch) {
    this.CheckSumFetch = fetch;
  }
  /** Retrieve Fetch value for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @return boolean the Fetch value for this field
   */
  public boolean getCheckSumFetch () {
    return this.CheckSumFetch;
  }
  /** Set the SortOrder for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCheckSumSortOrder (Integer value) {
    this.CheckSumSort = value;
  }
  /** Retrieve SortOrder for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCheckSumSortOrder () {
    return this.CheckSumSort;
  }
  /** Set the sort direction for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCheckSumSortDirection (boolean ascending) {
    this.CheckSumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCheckSumSortDirection () {
    return this.CheckSumSortAscending;
  }
  /** Set the case insensitive for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCheckSumCaseInsensitive (boolean ascending) {
    this.CheckSumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCheckSumCaseInsensitive () {
    return this.CheckSumCaseInsensitive;
  }
  /** Set the field level filters for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCheckSumFilter (StringFilter[] value) throws ServiceException {
    this.CheckSum = value;
  }
  /** Retrieve filter for field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCheckSumFilter () {
    return this.CheckSum;
  }

  /**
   * Retrieves the CheckSumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CheckSumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CheckSumFilter field
   */
  public String[] getCheckSumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCheckSumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCheckSumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCheckSumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CheckSumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCheckSumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CheckSumFilter filter value from a formatted string
   *
   * @param _value the CheckSumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CheckSumFilter filter field
   */
  public void setCheckSumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCheckSumFilterFromFormattedString");
    try {
      this.setCheckSumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CheckSumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCheckSumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCheckSumFilterFromFormattedString");
  }

  public String toString() {
    return VoucherDefinitionsObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherDefinitionsObjectHelper.toMap(this, null);
  }
}
