/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CmfRewardBalanceDetailObjectFilter.java
 * Definition File: Customer/CmfRewardBalanceDetail.xml
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
public class CmfRewardBalanceDetailObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CmfRewardBalanceDetailObjectKeyFilter Key = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.expiration_date) */
  public    DateFilter[] ExpirationDate  = null;
  protected boolean ExpirationDateFetch = false;
  protected boolean ExpirationDateSortAscending = true;
  protected Integer ExpirationDateSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.close_date) */
  public    DateFilter[] CloseDate  = null;
  protected boolean CloseDateFetch = false;
  protected boolean CloseDateSortAscending = true;
  protected Integer CloseDateSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.new_reward) */
  public    BigIntegerFilter[] NewReward  = null;
  protected boolean NewRewardFetch = false;
  protected boolean NewRewardSortAscending = true;
  protected Integer NewRewardSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.total_reward) */
  public    BigIntegerFilter[] TotalReward  = null;
  protected boolean TotalRewardFetch = false;
  protected boolean TotalRewardSortAscending = true;
  protected Integer TotalRewardSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.total_available_reward) */
  public    BigIntegerFilter[] TotalAvailableReward  = null;
  protected boolean TotalAvailableRewardFetch = false;
  protected boolean TotalAvailableRewardSortAscending = true;
  protected Integer TotalAvailableRewardSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.balance_reward) */
  public    BigIntegerFilter[] BalanceReward  = null;
  protected boolean BalanceRewardFetch = false;
  protected boolean BalanceRewardSortAscending = true;
  protected Integer BalanceRewardSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.total_adj) */
  public    BigIntegerFilter[] TotalAdj  = null;
  protected boolean TotalAdjFetch = false;
  protected boolean TotalAdjSortAscending = true;
  protected Integer TotalAdjSort = null;
  /** raw field for: CMF_REWARD_BALANCE_DETAIL.total_spend) */
  public    BigIntegerFilter[] TotalSpend  = null;
  protected boolean TotalSpendFetch = false;
  protected boolean TotalSpendSortAscending = true;
  protected Integer TotalSpendSort = null;
  private String _objName = "CmfRewardBalanceDetailObjectFilter";
  /** default constructor */
  public CmfRewardBalanceDetailObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CmfRewardBalanceDetailObjectFilter (CmfRewardBalanceDetailObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CmfRewardBalanceDetailObjectKeyFilter (other.Key);
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.ExpirationDate = other.ExpirationDate;
    this.ExpirationDateFetch = other.ExpirationDateFetch;
    this.ExpirationDateSort = other.ExpirationDateSort;
    this.ExpirationDateSortAscending = other.ExpirationDateSortAscending;
    this.CloseDate = other.CloseDate;
    this.CloseDateFetch = other.CloseDateFetch;
    this.CloseDateSort = other.CloseDateSort;
    this.CloseDateSortAscending = other.CloseDateSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.NewReward = other.NewReward;
    this.NewRewardFetch = other.NewRewardFetch;
    this.NewRewardSort = other.NewRewardSort;
    this.NewRewardSortAscending = other.NewRewardSortAscending;
    this.TotalReward = other.TotalReward;
    this.TotalRewardFetch = other.TotalRewardFetch;
    this.TotalRewardSort = other.TotalRewardSort;
    this.TotalRewardSortAscending = other.TotalRewardSortAscending;
    this.TotalAvailableReward = other.TotalAvailableReward;
    this.TotalAvailableRewardFetch = other.TotalAvailableRewardFetch;
    this.TotalAvailableRewardSort = other.TotalAvailableRewardSort;
    this.TotalAvailableRewardSortAscending = other.TotalAvailableRewardSortAscending;
    this.BalanceReward = other.BalanceReward;
    this.BalanceRewardFetch = other.BalanceRewardFetch;
    this.BalanceRewardSort = other.BalanceRewardSort;
    this.BalanceRewardSortAscending = other.BalanceRewardSortAscending;
    this.TotalAdj = other.TotalAdj;
    this.TotalAdjFetch = other.TotalAdjFetch;
    this.TotalAdjSort = other.TotalAdjSort;
    this.TotalAdjSortAscending = other.TotalAdjSortAscending;
    this.TotalSpend = other.TotalSpend;
    this.TotalSpendFetch = other.TotalSpendFetch;
    this.TotalSpendSort = other.TotalSpendSort;
    this.TotalSpendSortAscending = other.TotalSpendSortAscending;  }
  /** get the filter for this object's key
   * @return CmfRewardBalanceDetailObjectKeyFilter
   */
  public CmfRewardBalanceDetailObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CmfRewardBalanceDetailObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_REWARD_BALANCE_DETAIL.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRewardBalanceIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.RewardBalanceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRewardBalanceIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RewardBalanceIdFetch;
  }
  /** Set the SortOrder for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRewardBalanceIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.RewardBalanceIdSort = value;
  }
  /** Retrieve SortOrder for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRewardBalanceIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RewardBalanceIdSort;
  }
  /** Set the sort direction for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRewardBalanceIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.RewardBalanceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRewardBalanceIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RewardBalanceIdSortAscending;
  }
  /** Set the field level filters for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRewardBalanceIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.RewardBalanceId = value;
  }
  /** Retrieve filter for field: RewardBalanceId (CMF_REWARD_BALANCE_DETAIL.reward_balance_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRewardBalanceIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.RewardBalanceId;
  }
  /** Set the field level Fetch value for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (CMF_REWARD_BALANCE_DETAIL.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Set the field level Fetch value for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CmfRewardBalanceDetailObjectKeyFilter ();
    this.Key.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (CMF_REWARD_BALANCE_DETAIL.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Set the field level Fetch value for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (CMF_REWARD_BALANCE_DETAIL.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
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
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @param fetch whether to fetch this field or not
   */
  public void setExpirationDateFetch (boolean fetch) {
    this.ExpirationDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getExpirationDateFetch () {
    return this.ExpirationDateFetch;
  }
  /** Set the SortOrder for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExpirationDateSortOrder (Integer value) {
    this.ExpirationDateSort = value;
  }
  /** Retrieve SortOrder for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExpirationDateSortOrder () {
    return this.ExpirationDateSort;
  }
  /** Set the sort direction for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExpirationDateSortDirection (boolean ascending) {
    this.ExpirationDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExpirationDateSortDirection () {
    return this.ExpirationDateSortAscending;
  }
  /** Set the field level filters for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExpirationDateFilter (DateFilter[] value) throws ServiceException {
    this.ExpirationDate = value;
  }
  /** Retrieve filter for field: ExpirationDate (CMF_REWARD_BALANCE_DETAIL.expiration_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getExpirationDateFilter () {
    return this.ExpirationDate;
  }

  /**
   * Retrieves the ExpirationDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExpirationDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationDateFilter field
   */
  public String[] getExpirationDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExpirationDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExpirationDateFilter filter value from a formatted string
   *
   * @param _value the ExpirationDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExpirationDateFilter filter field
   */
  public void setExpirationDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExpirationDateFilterFromFormattedString");
    try {
      this.setExpirationDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExpirationDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ExpirationDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExpirationDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationDateFilter field
   */
  public String[] getExpirationDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExpirationDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ExpirationDateFilter filter value from a formatted string
   *
   * @param _value the ExpirationDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExpirationDateFilter filter field
   */
  public void setExpirationDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExpirationDateFilterFromFormattedDateTimeString");
    try {
      this.setExpirationDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExpirationDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @param fetch whether to fetch this field or not
   */
  public void setCloseDateFetch (boolean fetch) {
    this.CloseDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getCloseDateFetch () {
    return this.CloseDateFetch;
  }
  /** Set the SortOrder for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCloseDateSortOrder (Integer value) {
    this.CloseDateSort = value;
  }
  /** Retrieve SortOrder for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCloseDateSortOrder () {
    return this.CloseDateSort;
  }
  /** Set the sort direction for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCloseDateSortDirection (boolean ascending) {
    this.CloseDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCloseDateSortDirection () {
    return this.CloseDateSortAscending;
  }
  /** Set the field level filters for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCloseDateFilter (DateFilter[] value) throws ServiceException {
    this.CloseDate = value;
  }
  /** Retrieve filter for field: CloseDate (CMF_REWARD_BALANCE_DETAIL.close_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCloseDateFilter () {
    return this.CloseDate;
  }

  /**
   * Retrieves the CloseDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CloseDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CloseDateFilter field
   */
  public String[] getCloseDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCloseDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCloseDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCloseDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CloseDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCloseDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CloseDateFilter filter value from a formatted string
   *
   * @param _value the CloseDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CloseDateFilter filter field
   */
  public void setCloseDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCloseDateFilterFromFormattedString");
    try {
      this.setCloseDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CloseDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCloseDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCloseDateFilterFromFormattedString");
  }

  /**
   * Retrieves the CloseDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CloseDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CloseDateFilter field
   */
  public String[] getCloseDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCloseDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCloseDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCloseDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CloseDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCloseDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CloseDateFilter filter value from a formatted string
   *
   * @param _value the CloseDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CloseDateFilter filter field
   */
  public void setCloseDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCloseDateFilterFromFormattedDateTimeString");
    try {
      this.setCloseDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CloseDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCloseDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCloseDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (CMF_REWARD_BALANCE_DETAIL.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (CMF_REWARD_BALANCE_DETAIL.chg_who)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getChgWhoFilter () {
    return this.ChgWho;
  }

  /**
   * Retrieves the ChgWhoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgWhoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWhoFilter field
   */
  public String[] getChgWhoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgWhoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgWhoFilter filter value from a formatted string
   *
   * @param _value the ChgWhoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgWhoFilter filter field
   */
  public void setChgWhoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgWhoFilterFromFormattedString");
    try {
      this.setChgWhoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @param fetch whether to fetch this field or not
   */
  public void setNewRewardFetch (boolean fetch) {
    this.NewRewardFetch = fetch;
  }
  /** Retrieve Fetch value for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @return boolean the Fetch value for this field
   */
  public boolean getNewRewardFetch () {
    return this.NewRewardFetch;
  }
  /** Set the SortOrder for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNewRewardSortOrder (Integer value) {
    this.NewRewardSort = value;
  }
  /** Retrieve SortOrder for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNewRewardSortOrder () {
    return this.NewRewardSort;
  }
  /** Set the sort direction for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNewRewardSortDirection (boolean ascending) {
    this.NewRewardSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNewRewardSortDirection () {
    return this.NewRewardSortAscending;
  }
  /** Set the field level filters for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNewRewardFilter (BigIntegerFilter[] value) throws ServiceException {
    this.NewReward = value;
  }
  /** Retrieve filter for field: NewReward (CMF_REWARD_BALANCE_DETAIL.new_reward)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNewRewardFilter () {
    return this.NewReward;
  }

  /**
   * Retrieves the NewRewardFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewRewardFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewRewardFilter field
   */
  public String[] getNewRewardFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewRewardFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNewRewardFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewRewardFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewRewardFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NewRewardFilter filter value from a formatted string
   *
   * @param _value the NewRewardFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NewRewardFilter filter field
   */
  public void setNewRewardFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewRewardFilterFromFormattedString");
    try {
      this.setNewRewardFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewRewardFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewRewardFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalRewardFetch (boolean fetch) {
    this.TotalRewardFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalRewardFetch () {
    return this.TotalRewardFetch;
  }
  /** Set the SortOrder for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalRewardSortOrder (Integer value) {
    this.TotalRewardSort = value;
  }
  /** Retrieve SortOrder for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalRewardSortOrder () {
    return this.TotalRewardSort;
  }
  /** Set the sort direction for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalRewardSortDirection (boolean ascending) {
    this.TotalRewardSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalRewardSortDirection () {
    return this.TotalRewardSortAscending;
  }
  /** Set the field level filters for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalRewardFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalReward = value;
  }
  /** Retrieve filter for field: TotalReward (CMF_REWARD_BALANCE_DETAIL.total_reward)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalRewardFilter () {
    return this.TotalReward;
  }

  /**
   * Retrieves the TotalRewardFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalRewardFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalRewardFilter field
   */
  public String[] getTotalRewardFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalRewardFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalRewardFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalRewardFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalRewardFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalRewardFilter filter value from a formatted string
   *
   * @param _value the TotalRewardFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalRewardFilter filter field
   */
  public void setTotalRewardFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalRewardFilterFromFormattedString");
    try {
      this.setTotalRewardFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalRewardFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalRewardFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalAvailableRewardFetch (boolean fetch) {
    this.TotalAvailableRewardFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalAvailableRewardFetch () {
    return this.TotalAvailableRewardFetch;
  }
  /** Set the SortOrder for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalAvailableRewardSortOrder (Integer value) {
    this.TotalAvailableRewardSort = value;
  }
  /** Retrieve SortOrder for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalAvailableRewardSortOrder () {
    return this.TotalAvailableRewardSort;
  }
  /** Set the sort direction for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalAvailableRewardSortDirection (boolean ascending) {
    this.TotalAvailableRewardSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalAvailableRewardSortDirection () {
    return this.TotalAvailableRewardSortAscending;
  }
  /** Set the field level filters for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalAvailableRewardFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalAvailableReward = value;
  }
  /** Retrieve filter for field: TotalAvailableReward (CMF_REWARD_BALANCE_DETAIL.total_available_reward)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalAvailableRewardFilter () {
    return this.TotalAvailableReward;
  }

  /**
   * Retrieves the TotalAvailableRewardFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAvailableRewardFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAvailableRewardFilter field
   */
  public String[] getTotalAvailableRewardFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAvailableRewardFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAvailableRewardFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAvailableRewardFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAvailableRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAvailableRewardFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAvailableRewardFilter filter value from a formatted string
   *
   * @param _value the TotalAvailableRewardFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAvailableRewardFilter filter field
   */
  public void setTotalAvailableRewardFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAvailableRewardFilterFromFormattedString");
    try {
      this.setTotalAvailableRewardFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAvailableRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAvailableRewardFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAvailableRewardFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceRewardFetch (boolean fetch) {
    this.BalanceRewardFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceRewardFetch () {
    return this.BalanceRewardFetch;
  }
  /** Set the SortOrder for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceRewardSortOrder (Integer value) {
    this.BalanceRewardSort = value;
  }
  /** Retrieve SortOrder for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceRewardSortOrder () {
    return this.BalanceRewardSort;
  }
  /** Set the sort direction for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceRewardSortDirection (boolean ascending) {
    this.BalanceRewardSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceRewardSortDirection () {
    return this.BalanceRewardSortAscending;
  }
  /** Set the field level filters for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceRewardFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BalanceReward = value;
  }
  /** Retrieve filter for field: BalanceReward (CMF_REWARD_BALANCE_DETAIL.balance_reward)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBalanceRewardFilter () {
    return this.BalanceReward;
  }

  /**
   * Retrieves the BalanceRewardFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceRewardFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceRewardFilter field
   */
  public String[] getBalanceRewardFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceRewardFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceRewardFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceRewardFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceRewardFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceRewardFilter filter value from a formatted string
   *
   * @param _value the BalanceRewardFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceRewardFilter filter field
   */
  public void setBalanceRewardFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceRewardFilterFromFormattedString");
    try {
      this.setBalanceRewardFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceRewardFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceRewardFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceRewardFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalAdjFetch (boolean fetch) {
    this.TotalAdjFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalAdjFetch () {
    return this.TotalAdjFetch;
  }
  /** Set the SortOrder for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalAdjSortOrder (Integer value) {
    this.TotalAdjSort = value;
  }
  /** Retrieve SortOrder for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalAdjSortOrder () {
    return this.TotalAdjSort;
  }
  /** Set the sort direction for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalAdjSortDirection (boolean ascending) {
    this.TotalAdjSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalAdjSortDirection () {
    return this.TotalAdjSortAscending;
  }
  /** Set the field level filters for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalAdjFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalAdj = value;
  }
  /** Retrieve filter for field: TotalAdj (CMF_REWARD_BALANCE_DETAIL.total_adj)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalAdjFilter () {
    return this.TotalAdj;
  }

  /**
   * Retrieves the TotalAdjFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAdjFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdjFilter field
   */
  public String[] getTotalAdjFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAdjFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAdjFilter filter value from a formatted string
   *
   * @param _value the TotalAdjFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAdjFilter filter field
   */
  public void setTotalAdjFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAdjFilterFromFormattedString");
    try {
      this.setTotalAdjFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFilterFromFormattedString");
  }

  /**
   * Sets the TotalAdjFilter filter value from a formatted string
   *
   * @param _value the TotalAdjFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAdjFilter filter field
   */
  public void setTotalAdjFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAdjFilterFromFormattedCurrencyString");
    try {
      this.setTotalAdjFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalAdjFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAdjFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdjFilter field
   */

  public String[] getTotalAdjFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAdjFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalSpendFetch (boolean fetch) {
    this.TotalSpendFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalSpendFetch () {
    return this.TotalSpendFetch;
  }
  /** Set the SortOrder for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalSpendSortOrder (Integer value) {
    this.TotalSpendSort = value;
  }
  /** Retrieve SortOrder for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalSpendSortOrder () {
    return this.TotalSpendSort;
  }
  /** Set the sort direction for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalSpendSortDirection (boolean ascending) {
    this.TotalSpendSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalSpendSortDirection () {
    return this.TotalSpendSortAscending;
  }
  /** Set the field level filters for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalSpendFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalSpend = value;
  }
  /** Retrieve filter for field: TotalSpend (CMF_REWARD_BALANCE_DETAIL.total_spend)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalSpendFilter () {
    return this.TotalSpend;
  }

  /**
   * Retrieves the TotalSpendFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalSpendFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSpendFilter field
   */
  public String[] getTotalSpendFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSpendFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalSpendFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSpendFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSpendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSpendFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalSpendFilter filter value from a formatted string
   *
   * @param _value the TotalSpendFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalSpendFilter filter field
   */
  public void setTotalSpendFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalSpendFilterFromFormattedString");
    try {
      this.setTotalSpendFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSpendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSpendFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSpendFilterFromFormattedString");
  }

  /**
   * Sets the TotalSpendFilter filter value from a formatted string
   *
   * @param _value the TotalSpendFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalSpendFilter filter field
   */
  public void setTotalSpendFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalSpendFilterFromFormattedCurrencyString");
    try {
      this.setTotalSpendFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSpendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSpendFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSpendFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalSpendFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalSpendFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSpendFilter field
   */

  public String[] getTotalSpendFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSpendFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalSpendFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSpendFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSpendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSpendFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  public String toString() {
    return CmfRewardBalanceDetailObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CmfRewardBalanceDetailObjectHelper.toMap(this, null);
  }
}
