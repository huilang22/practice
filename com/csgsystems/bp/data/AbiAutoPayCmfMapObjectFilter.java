/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiAutoPayCmfMapObjectFilter.java
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
public class AbiAutoPayCmfMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AbiAutoPayCmfMapObjectKeyFilter Key = null;
  /** raw field for: ABI_AUTO_PAY_CMF_MAP.lob_id) */
  public    BigIntegerFilter[] LobId  = null;
  protected boolean LobIdFetch = false;
  protected boolean LobIdSortAscending = true;
  protected Integer LobIdSort = null;
  private String _objName = "AbiAutoPayCmfMapObjectFilter";
  /** default constructor */
  public AbiAutoPayCmfMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AbiAutoPayCmfMapObjectFilter (AbiAutoPayCmfMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AbiAutoPayCmfMapObjectKeyFilter (other.Key);
    this.LobId = other.LobId;
    this.LobIdFetch = other.LobIdFetch;
    this.LobIdSort = other.LobIdSort;
    this.LobIdSortAscending = other.LobIdSortAscending;  }
  /** get the filter for this object's key
   * @return AbiAutoPayCmfMapObjectKeyFilter
   */
  public AbiAutoPayCmfMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AbiAutoPayCmfMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @param fetch whether to fetch this field or not
   */
  public void setPayOffMethodFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.PayOffMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayOffMethodFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PayOffMethodFetch;
  }
  /** Set the SortOrder for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayOffMethodSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.PayOffMethodSort = value;
  }
  /** Retrieve SortOrder for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayOffMethodSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PayOffMethodSort;
  }
  /** Set the sort direction for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayOffMethodSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.PayOffMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayOffMethodSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PayOffMethodSortAscending;
  }
  /** Set the field level filters for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayOffMethodFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.PayOffMethod = value;
  }
  /** Retrieve filter for field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPayOffMethodFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PayOffMethod;
  }
  /** Set the field level Fetch value for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeTypeCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.ChargeTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeTypeCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeTypeCodeFetch;
  }
  /** Set the SortOrder for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeTypeCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.ChargeTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeTypeCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeTypeCodeSort;
  }
  /** Set the sort direction for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeTypeCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.ChargeTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeTypeCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeTypeCodeSortAscending;
  }
  /** Set the field level filters for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeTypeCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyFilter ();
    this.Key.ChargeTypeCode = value;
  }
  /** Retrieve filter for field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeTypeCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeTypeCode;
  }
  /** Set the field level Fetch value for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @param fetch whether to fetch this field or not
   */
  public void setLobIdFetch (boolean fetch) {
    this.LobIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getLobIdFetch () {
    return this.LobIdFetch;
  }
  /** Set the SortOrder for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLobIdSortOrder (Integer value) {
    this.LobIdSort = value;
  }
  /** Retrieve SortOrder for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLobIdSortOrder () {
    return this.LobIdSort;
  }
  /** Set the sort direction for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLobIdSortDirection (boolean ascending) {
    this.LobIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLobIdSortDirection () {
    return this.LobIdSortAscending;
  }
  /** Set the field level filters for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLobIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LobId = value;
  }
  /** Retrieve filter for field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLobIdFilter () {
    return this.LobId;
  }

  /**
   * Retrieves the LobIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LobIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LobIdFilter field
   */
  public String[] getLobIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLobIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLobIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LobIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLobIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LobIdFilter filter value from a formatted string
   *
   * @param _value the LobIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LobIdFilter filter field
   */
  public void setLobIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLobIdFilterFromFormattedString");
    try {
      this.setLobIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LobIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLobIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLobIdFilterFromFormattedString");
  }

  public String toString() {
    return AbiAutoPayCmfMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AbiAutoPayCmfMapObjectHelper.toMap(this, null);
  }
}
