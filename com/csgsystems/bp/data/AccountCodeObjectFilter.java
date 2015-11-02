/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeObjectFilter.java
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
public class AccountCodeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AccountCodeObjectKeyFilter Key = null;
  /** raw field for: CMF_ACCOUNT_CODES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "AccountCodeObjectFilter";
  /** default constructor */
  public AccountCodeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AccountCodeObjectFilter (AccountCodeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AccountCodeObjectKeyFilter (other.Key);
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;  }
  /** get the filter for this object's key
   * @return AccountCodeObjectKeyFilter
   */
  public AccountCodeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AccountCodeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcgTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcgTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AcgTrackingIdFetch;
  }
  /** Set the SortOrder for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcgTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcgTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AcgTrackingIdSort;
  }
  /** Set the sort direction for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcgTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcgTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AcgTrackingIdSortAscending;
  }
  /** Set the field level filters for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcgTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingId = value;
  }
  /** Retrieve filter for field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcgTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AcgTrackingId;
  }
  /** Set the field level Fetch value for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setAcgTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcgTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AcgTrackingIdServFetch;
  }
  /** Set the SortOrder for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcgTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcgTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AcgTrackingIdServSort;
  }
  /** Set the sort direction for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcgTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcgTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AcgTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcgTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AcgTrackingIdServ = value;
  }
  /** Retrieve filter for field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcgTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AcgTrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AccountCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountCodeFetch;
  }
  /** Set the SortOrder for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AccountCodeSort = value;
  }
  /** Retrieve SortOrder for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountCodeSort;
  }
  /** Set the sort direction for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AccountCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountCodeSortAscending;
  }
  /** Set the case insensitive for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountCodeCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AccountCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean whether the field is case insensitive
   */
  public boolean getAccountCodeCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.AccountCodeCaseInsensitive;
  }
  /** Set the field level filters for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountCodeFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountCodeObjectKeyFilter ();
    this.Key.AccountCode = value;
  }
  /** Retrieve filter for field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountCode;
  }
  /** Set the field level Fetch value for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayValueFilter () {
    return this.DisplayValue;
  }

  /**
   * Retrieves the DisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValueFilter field
   */
  public String[] getDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayValueFilter filter value from a formatted string
   *
   * @param _value the DisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayValueFilter filter field
   */
  public void setDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayValueFilterFromFormattedString");
    try {
      this.setDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFilterFromFormattedString");
  }

  public String toString() {
    return AccountCodeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountCodeObjectHelper.toMap(this, null);
  }
}
