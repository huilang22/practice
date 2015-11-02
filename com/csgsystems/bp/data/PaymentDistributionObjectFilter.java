/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentDistributionObjectFilter.java
 * Definition File: Customer/PaymentDistribution.xml
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
public class PaymentDistributionObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public PaymentDistributionObjectKeyFilter Key = null;
  /** raw field for: ACCOUNT_BALANCES.balance_desc) */
  public    StringFilter[] PrepayBalanceDesc  = null;
  protected boolean PrepayBalanceDescFetch = false;
  protected boolean PrepayBalanceDescSortAscending = true;
  protected boolean PrepayBalanceDescCaseInsensitive = false;
  protected Integer PrepayBalanceDescSort = null;
  /** raw field for: BMF.open_item_id) */
  public    IntegerFilter[] BmfOpenItemId  = null;
  protected boolean BmfOpenItemIdFetch = false;
  protected boolean BmfOpenItemIdSortAscending = true;
  protected Integer BmfOpenItemIdSort = null;
  /** raw field for: BMF.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  /** raw field for: BMF.bill_ref_no) */
  public    IntegerFilter[] PaymentBillRefNo  = null;
  protected boolean PaymentBillRefNoFetch = false;
  protected boolean PaymentBillRefNoSortAscending = true;
  protected Integer PaymentBillRefNoSort = null;
  /** raw field for: BMF.bill_ref_resets) */
  public    IntegerFilter[] PaymentBillRefResets  = null;
  protected boolean PaymentBillRefResetsFetch = false;
  protected boolean PaymentBillRefResetsSortAscending = true;
  protected Integer PaymentBillRefResetsSort = null;
  /** raw field for: BMF_DISTRIBUTION.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: BMF_DISTRIBUTION.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: BMF_DISTRIBUTION.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: BMF_DISTRIBUTION.orig_bill_ref_no) */
  public    IntegerFilter[] OrigBillRefNo  = null;
  protected boolean OrigBillRefNoFetch = false;
  protected boolean OrigBillRefNoSortAscending = true;
  protected Integer OrigBillRefNoSort = null;
  /** raw field for: BMF_DISTRIBUTION.orig_bill_ref_resets) */
  public    IntegerFilter[] OrigBillRefResets  = null;
  protected boolean OrigBillRefResetsFetch = false;
  protected boolean OrigBillRefResetsSortAscending = true;
  protected Integer OrigBillRefResetsSort = null;
  /** raw field for: BMF_DISTRIBUTION.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: BMF_DISTRIBUTION.gl_amount) */
  public    BigIntegerFilter[] GlAmount  = null;
  protected boolean GlAmountFetch = false;
  protected boolean GlAmountSortAscending = true;
  protected Integer GlAmountSort = null;
  /** raw field for: BMF_DISTRIBUTION.status) */
  public    IntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: BMF_DISTRIBUTION.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  /** raw field for: BMF_DISTRIBUTION.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: BMF_DISTRIBUTION.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: BMF_DISTRIBUTION.bmf_trans_type) */
  public    IntegerFilter[] BmfTransType  = null;
  protected boolean BmfTransTypeFetch = false;
  protected boolean BmfTransTypeSortAscending = true;
  protected Integer BmfTransTypeSort = null;
  /** raw field for: BMF_DISTRIBUTION.currency_gain_loss) */
  public    BigIntegerFilter[] CurrencyGainLoss  = null;
  protected boolean CurrencyGainLossFetch = false;
  protected boolean CurrencyGainLossSortAscending = true;
  protected Integer CurrencyGainLossSort = null;
  /** raw field for: BMF_DISTRIBUTION.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: BMF_DISTRIBUTION.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: BMF_DISTRIBUTION.late_fee_status) */
  public    IntegerFilter[] LateFeeStatus  = null;
  protected boolean LateFeeStatusFetch = false;
  protected boolean LateFeeStatusSortAscending = true;
  protected Integer LateFeeStatusSort = null;
  private String _objName = "PaymentDistributionObjectFilter";
  /** default constructor */
  public PaymentDistributionObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PaymentDistributionObjectFilter (PaymentDistributionObjectFilter other)
  {
    if (other == null) return;
    this.Key = new PaymentDistributionObjectKeyFilter (other.Key);
    this.PrepayBalanceDesc = other.PrepayBalanceDesc;
    this.PrepayBalanceDescFetch = other.PrepayBalanceDescFetch;
    this.PrepayBalanceDescSort = other.PrepayBalanceDescSort;
    this.PrepayBalanceDescCaseInsensitive = other.PrepayBalanceDescCaseInsensitive;
    this.PrepayBalanceDescSortAscending = other.PrepayBalanceDescSortAscending;
    this.BmfOpenItemId = other.BmfOpenItemId;
    this.BmfOpenItemIdFetch = other.BmfOpenItemIdFetch;
    this.BmfOpenItemIdSort = other.BmfOpenItemIdSort;
    this.BmfOpenItemIdSortAscending = other.BmfOpenItemIdSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
    this.PaymentBillRefNo = other.PaymentBillRefNo;
    this.PaymentBillRefNoFetch = other.PaymentBillRefNoFetch;
    this.PaymentBillRefNoSort = other.PaymentBillRefNoSort;
    this.PaymentBillRefNoSortAscending = other.PaymentBillRefNoSortAscending;
    this.PaymentBillRefResets = other.PaymentBillRefResets;
    this.PaymentBillRefResetsFetch = other.PaymentBillRefResetsFetch;
    this.PaymentBillRefResetsSort = other.PaymentBillRefResetsSort;
    this.PaymentBillRefResetsSortAscending = other.PaymentBillRefResetsSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.OrigBillRefNo = other.OrigBillRefNo;
    this.OrigBillRefNoFetch = other.OrigBillRefNoFetch;
    this.OrigBillRefNoSort = other.OrigBillRefNoSort;
    this.OrigBillRefNoSortAscending = other.OrigBillRefNoSortAscending;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this.OrigBillRefResetsFetch = other.OrigBillRefResetsFetch;
    this.OrigBillRefResetsSort = other.OrigBillRefResetsSort;
    this.OrigBillRefResetsSortAscending = other.OrigBillRefResetsSortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.GlAmount = other.GlAmount;
    this.GlAmountFetch = other.GlAmountFetch;
    this.GlAmountSort = other.GlAmountSort;
    this.GlAmountSortAscending = other.GlAmountSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.BmfTransType = other.BmfTransType;
    this.BmfTransTypeFetch = other.BmfTransTypeFetch;
    this.BmfTransTypeSort = other.BmfTransTypeSort;
    this.BmfTransTypeSortAscending = other.BmfTransTypeSortAscending;
    this.CurrencyGainLoss = other.CurrencyGainLoss;
    this.CurrencyGainLossFetch = other.CurrencyGainLossFetch;
    this.CurrencyGainLossSort = other.CurrencyGainLossSort;
    this.CurrencyGainLossSortAscending = other.CurrencyGainLossSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.LateFeeStatus = other.LateFeeStatus;
    this.LateFeeStatusFetch = other.LateFeeStatusFetch;
    this.LateFeeStatusSort = other.LateFeeStatusSort;
    this.LateFeeStatusSortAscending = other.LateFeeStatusSortAscending;  }
  /** get the filter for this object's key
   * @return PaymentDistributionObjectKeyFilter
   */
  public PaymentDistributionObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (PaymentDistributionObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BmfTrackingIdFetch;
  }
  /** Set the SortOrder for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BmfTrackingIdSort;
  }
  /** Set the sort direction for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BmfTrackingIdSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingId = value;
  }
  /** Retrieve filter for field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BmfTrackingId;
  }
  /** Set the field level Fetch value for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BmfTrackingIdServFetch;
  }
  /** Set the SortOrder for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BmfTrackingIdServSort;
  }
  /** Set the sort direction for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BmfTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.BmfTrackingIdServ = value;
  }
  /** Retrieve filter for field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BmfTrackingIdServ;
  }
  /** Set the field level Fetch value for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @param fetch whether to fetch this field or not
   */
  public void setDistribOrderFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistribOrderFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.DistribOrderFetch;
  }
  /** Set the SortOrder for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistribOrderSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrderSort = value;
  }
  /** Retrieve SortOrder for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistribOrderSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.DistribOrderSort;
  }
  /** Set the sort direction for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistribOrderSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistribOrderSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.DistribOrderSortAscending;
  }
  /** Set the field level filters for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistribOrderFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrder = value;
  }
  /** Retrieve filter for field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDistribOrderFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.DistribOrder;
  }
  /** Set the field level Fetch value for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepayBalanceDescFetch (boolean fetch) {
    this.PrepayBalanceDescFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepayBalanceDescFetch () {
    return this.PrepayBalanceDescFetch;
  }
  /** Set the SortOrder for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepayBalanceDescSortOrder (Integer value) {
    this.PrepayBalanceDescSort = value;
  }
  /** Retrieve SortOrder for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepayBalanceDescSortOrder () {
    return this.PrepayBalanceDescSort;
  }
  /** Set the sort direction for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepayBalanceDescSortDirection (boolean ascending) {
    this.PrepayBalanceDescSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepayBalanceDescSortDirection () {
    return this.PrepayBalanceDescSortAscending;
  }
  /** Set the case insensitive for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPrepayBalanceDescCaseInsensitive (boolean ascending) {
    this.PrepayBalanceDescCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPrepayBalanceDescCaseInsensitive () {
    return this.PrepayBalanceDescCaseInsensitive;
  }
  /** Set the field level filters for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepayBalanceDescFilter (StringFilter[] value) throws ServiceException {
    this.PrepayBalanceDesc = value;
  }
  /** Retrieve filter for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPrepayBalanceDescFilter () {
    return this.PrepayBalanceDesc;
  }

  /**
   * Retrieves the PrepayBalanceDescFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepayBalanceDescFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepayBalanceDescFilter field
   */
  public String[] getPrepayBalanceDescFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepayBalanceDescFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepayBalanceDescFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepayBalanceDescFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepayBalanceDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepayBalanceDescFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepayBalanceDescFilter filter value from a formatted string
   *
   * @param _value the PrepayBalanceDescFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepayBalanceDescFilter filter field
   */
  public void setPrepayBalanceDescFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepayBalanceDescFilterFromFormattedString");
    try {
      this.setPrepayBalanceDescFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepayBalanceDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepayBalanceDescFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepayBalanceDescFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfOpenItemId (BMF.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfOpenItemIdFetch (boolean fetch) {
    this.BmfOpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfOpenItemId (BMF.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfOpenItemIdFetch () {
    return this.BmfOpenItemIdFetch;
  }
  /** Set the SortOrder for field: BmfOpenItemId (BMF.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfOpenItemIdSortOrder (Integer value) {
    this.BmfOpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: BmfOpenItemId (BMF.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfOpenItemIdSortOrder () {
    return this.BmfOpenItemIdSort;
  }
  /** Set the sort direction for field: BmfOpenItemId (BMF.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfOpenItemIdSortDirection (boolean ascending) {
    this.BmfOpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfOpenItemId (BMF.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfOpenItemIdSortDirection () {
    return this.BmfOpenItemIdSortAscending;
  }
  /** Set the field level filters for field: BmfOpenItemId (BMF.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfOpenItemId = value;
  }
  /** Retrieve filter for field: BmfOpenItemId (BMF.open_item_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfOpenItemIdFilter () {
    return this.BmfOpenItemId;
  }

  /**
   * Retrieves the BmfOpenItemIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfOpenItemIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfOpenItemIdFilter field
   */
  public String[] getBmfOpenItemIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfOpenItemIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfOpenItemIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfOpenItemIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfOpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfOpenItemIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfOpenItemIdFilter filter value from a formatted string
   *
   * @param _value the BmfOpenItemIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfOpenItemIdFilter filter field
   */
  public void setBmfOpenItemIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfOpenItemIdFilterFromFormattedString");
    try {
      this.setBmfOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfOpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfOpenItemIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfOpenItemIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BmfOpenItemIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BmfOpenItemIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfOpenItemIdFilter filter field
   */
  public String[] getBmfOpenItemIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfOpenItemIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBmfOpenItemIdFilter(), "OpenItem", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfOpenItemIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfOpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfOpenItemIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BmfOpenItemIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfOpenItemIdFilter filter field
   */
  public void setBmfOpenItemIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfOpenItemIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBmfOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BmfOpenItemId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfOpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfOpenItemIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfOpenItemIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: NoBill (BMF.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (BMF.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (BMF.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (BMF.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (BMF.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (BMF.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (BMF.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (BooleanFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (BMF.no_bill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getNoBillFilter () {
    return this.NoBill;
  }

  /**
   * Retrieves the NoBillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoBillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBillFilter field
   */
  public String[] getNoBillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoBillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoBillFilter filter value from a formatted string
   *
   * @param _value the NoBillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoBillFilter filter field
   */
  public void setNoBillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoBillFilterFromFormattedString");
    try {
      this.setNoBillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PaymentBillRefNo (BMF.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentBillRefNoFetch (boolean fetch) {
    this.PaymentBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentBillRefNo (BMF.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentBillRefNoFetch () {
    return this.PaymentBillRefNoFetch;
  }
  /** Set the SortOrder for field: PaymentBillRefNo (BMF.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentBillRefNoSortOrder (Integer value) {
    this.PaymentBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: PaymentBillRefNo (BMF.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentBillRefNoSortOrder () {
    return this.PaymentBillRefNoSort;
  }
  /** Set the sort direction for field: PaymentBillRefNo (BMF.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentBillRefNoSortDirection (boolean ascending) {
    this.PaymentBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentBillRefNo (BMF.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentBillRefNoSortDirection () {
    return this.PaymentBillRefNoSortAscending;
  }
  /** Set the field level filters for field: PaymentBillRefNo (BMF.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.PaymentBillRefNo = value;
  }
  /** Retrieve filter for field: PaymentBillRefNo (BMF.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPaymentBillRefNoFilter () {
    return this.PaymentBillRefNo;
  }

  /**
   * Retrieves the PaymentBillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentBillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentBillRefNoFilter field
   */
  public String[] getPaymentBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentBillRefNoFilter filter value from a formatted string
   *
   * @param _value the PaymentBillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentBillRefNoFilter filter field
   */
  public void setPaymentBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentBillRefNoFilterFromFormattedString");
    try {
      this.setPaymentBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentBillRefResetsFetch (boolean fetch) {
    this.PaymentBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentBillRefResetsFetch () {
    return this.PaymentBillRefResetsFetch;
  }
  /** Set the SortOrder for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentBillRefResetsSortOrder (Integer value) {
    this.PaymentBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentBillRefResetsSortOrder () {
    return this.PaymentBillRefResetsSort;
  }
  /** Set the sort direction for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentBillRefResetsSortDirection (boolean ascending) {
    this.PaymentBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentBillRefResetsSortDirection () {
    return this.PaymentBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.PaymentBillRefResets = value;
  }
  /** Retrieve filter for field: PaymentBillRefResets (BMF.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPaymentBillRefResetsFilter () {
    return this.PaymentBillRefResets;
  }

  /**
   * Retrieves the PaymentBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentBillRefResetsFilter field
   */
  public String[] getPaymentBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the PaymentBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentBillRefResetsFilter filter field
   */
  public void setPaymentBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentBillRefResetsFilterFromFormattedString");
    try {
      this.setPaymentBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (BMF_DISTRIBUTION.account_no)
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

  /** Set the field level Fetch value for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (BMF_DISTRIBUTION.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter () {
    return this.BillRefNo;
  }

  /**
   * Retrieves the BillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNoFilter field
   */
  public String[] getBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefNoFilter filter value from a formatted string
   *
   * @param _value the BillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefNoFilter filter field
   */
  public void setBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefNoFilterFromFormattedString");
    try {
      this.setBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (BMF_DISTRIBUTION.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter () {
    return this.BillRefResets;
  }

  /**
   * Retrieves the BillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResetsFilter field
   */
  public String[] getBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefResetsFilter filter value from a formatted string
   *
   * @param _value the BillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefResetsFilter filter field
   */
  public void setBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefResetsFilterFromFormattedString");
    try {
      this.setBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefNoFetch (boolean fetch) {
    this.OrigBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefNoFetch () {
    return this.OrigBillRefNoFetch;
  }
  /** Set the SortOrder for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefNoSortOrder (Integer value) {
    this.OrigBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefNoSortOrder () {
    return this.OrigBillRefNoSort;
  }
  /** Set the sort direction for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefNoSortDirection (boolean ascending) {
    this.OrigBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefNoSortDirection () {
    return this.OrigBillRefNoSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefNo = value;
  }
  /** Retrieve filter for field: OrigBillRefNo (BMF_DISTRIBUTION.orig_bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillRefNoFilter () {
    return this.OrigBillRefNo;
  }

  /**
   * Retrieves the OrigBillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefNoFilter field
   */
  public String[] getOrigBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillRefNoFilter filter value from a formatted string
   *
   * @param _value the OrigBillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillRefNoFilter filter field
   */
  public void setOrigBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
    try {
      this.setOrigBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefResetsFetch (boolean fetch) {
    this.OrigBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefResetsFetch () {
    return this.OrigBillRefResetsFetch;
  }
  /** Set the SortOrder for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefResetsSortOrder (Integer value) {
    this.OrigBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefResetsSortOrder () {
    return this.OrigBillRefResetsSort;
  }
  /** Set the sort direction for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefResetsSortDirection (boolean ascending) {
    this.OrigBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefResetsSortDirection () {
    return this.OrigBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefResets = value;
  }
  /** Retrieve filter for field: OrigBillRefResets (BMF_DISTRIBUTION.orig_bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillRefResetsFilter () {
    return this.OrigBillRefResets;
  }

  /**
   * Retrieves the OrigBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefResetsFilter field
   */
  public String[] getOrigBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the OrigBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillRefResetsFilter filter field
   */
  public void setOrigBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
    try {
      this.setOrigBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Amount (BMF_DISTRIBUTION.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (BMF_DISTRIBUTION.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (BMF_DISTRIBUTION.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (BMF_DISTRIBUTION.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (BMF_DISTRIBUTION.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (BMF_DISTRIBUTION.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (BMF_DISTRIBUTION.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (BMF_DISTRIBUTION.amount)
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

  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the AmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */

  public String[] getAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setGlAmountFetch (boolean fetch) {
    this.GlAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getGlAmountFetch () {
    return this.GlAmountFetch;
  }
  /** Set the SortOrder for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGlAmountSortOrder (Integer value) {
    this.GlAmountSort = value;
  }
  /** Retrieve SortOrder for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGlAmountSortOrder () {
    return this.GlAmountSort;
  }
  /** Set the sort direction for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGlAmountSortDirection (boolean ascending) {
    this.GlAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGlAmountSortDirection () {
    return this.GlAmountSortAscending;
  }
  /** Set the field level filters for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGlAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.GlAmount = value;
  }
  /** Retrieve filter for field: GlAmount (BMF_DISTRIBUTION.gl_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getGlAmountFilter () {
    return this.GlAmount;
  }

  /**
   * Retrieves the GlAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmountFilter field
   */
  public String[] getGlAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGlAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GlAmountFilter filter value from a formatted string
   *
   * @param _value the GlAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GlAmountFilter filter field
   */
  public void setGlAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFilterFromFormattedString");
    try {
      this.setGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFilterFromFormattedString");
  }

  /**
   * Sets the GlAmountFilter filter value from a formatted string
   *
   * @param _value the GlAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GlAmountFilter filter field
   */
  public void setGlAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
    try {
      this.setGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the GlAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmountFilter field
   */

  public String[] getGlAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGlAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: Status (BMF_DISTRIBUTION.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (BMF_DISTRIBUTION.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (BMF_DISTRIBUTION.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (BMF_DISTRIBUTION.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (BMF_DISTRIBUTION.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (BMF_DISTRIBUTION.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (BMF_DISTRIBUTION.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (BMF_DISTRIBUTION.status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusFilter () {
    return this.Status;
  }

  /**
   * Retrieves the StatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusFilter field
   */
  public String[] getStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusFilter filter value from a formatted string
   *
   * @param _value the StatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusFilter filter field
   */
  public void setStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusFilterFromFormattedString");
    try {
      this.setStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (BMF_DISTRIBUTION.trans_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDateFilter () {
    return this.TransDate;
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (BMF_DISTRIBUTION.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (BMF_DISTRIBUTION.chg_date)
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


  /** Set the field level Fetch value for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (BMF_DISTRIBUTION.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (BMF_DISTRIBUTION.chg_who)
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

  /** Set the field level Fetch value for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTransTypeFetch (boolean fetch) {
    this.BmfTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTransTypeFetch () {
    return this.BmfTransTypeFetch;
  }
  /** Set the SortOrder for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTransTypeSortOrder (Integer value) {
    this.BmfTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTransTypeSortOrder () {
    return this.BmfTransTypeSort;
  }
  /** Set the sort direction for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTransTypeSortDirection (boolean ascending) {
    this.BmfTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTransTypeSortDirection () {
    return this.BmfTransTypeSortAscending;
  }
  /** Set the field level filters for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTransType = value;
  }
  /** Retrieve filter for field: BmfTransType (BMF_DISTRIBUTION.bmf_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTransTypeFilter () {
    return this.BmfTransType;
  }

  /**
   * Retrieves the BmfTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransTypeFilter field
   */
  public String[] getBmfTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTransTypeFilter filter value from a formatted string
   *
   * @param _value the BmfTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTransTypeFilter filter field
   */
  public void setBmfTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
    try {
      this.setBmfTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BmfTransTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BmfTransTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfTransTypeFilter filter field
   */
  public String[] getBmfTransTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBmfTransTypeFilter(), "PaymentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BmfTransTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTransTypeFilter filter field
   */
  public void setBmfTransTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBmfTransTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BmfTransType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyGainLossFetch (boolean fetch) {
    this.CurrencyGainLossFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyGainLossFetch () {
    return this.CurrencyGainLossFetch;
  }
  /** Set the SortOrder for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyGainLossSortOrder (Integer value) {
    this.CurrencyGainLossSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyGainLossSortOrder () {
    return this.CurrencyGainLossSort;
  }
  /** Set the sort direction for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyGainLossSortDirection (boolean ascending) {
    this.CurrencyGainLossSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyGainLossSortDirection () {
    return this.CurrencyGainLossSortAscending;
  }
  /** Set the field level filters for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyGainLossFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CurrencyGainLoss = value;
  }
  /** Retrieve filter for field: CurrencyGainLoss (BMF_DISTRIBUTION.currency_gain_loss)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCurrencyGainLossFilter () {
    return this.CurrencyGainLoss;
  }

  /**
   * Retrieves the CurrencyGainLossFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyGainLossFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyGainLossFilter field
   */
  public String[] getCurrencyGainLossFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyGainLossFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyGainLossFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyGainLossFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyGainLossFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyGainLossFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyGainLossFilter filter value from a formatted string
   *
   * @param _value the CurrencyGainLossFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyGainLossFilter filter field
   */
  public void setCurrencyGainLossFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyGainLossFilterFromFormattedString");
    try {
      this.setCurrencyGainLossFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyGainLossFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyGainLossFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyGainLossFilterFromFormattedString");
  }

  /**
   * Sets the CurrencyGainLossFilter filter value from a formatted string
   *
   * @param _value the CurrencyGainLossFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyGainLossFilter filter field
   */
  public void setCurrencyGainLossFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyGainLossFilterFromFormattedCurrencyString");
    try {
      this.setCurrencyGainLossFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyGainLossFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyGainLossFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyGainLossFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CurrencyGainLossFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyGainLossFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyGainLossFilter field
   */

  public String[] getCurrencyGainLossFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyGainLossFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyGainLossFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyGainLossFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyGainLossFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyGainLossFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (BMF_DISTRIBUTION.currency_code)
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

  /**
   * Retrieves the display value for the enumerated CurrencyCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCodeFilter filter field
   */
  public String[] getCurrencyCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCurrencyCodeFilter(), "Currency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CurrencyCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CurrencyCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (BMF_DISTRIBUTION.open_item_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOpenItemIdFilter () {
    return this.OpenItemId;
  }

  /**
   * Retrieves the OpenItemIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OpenItemIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemIdFilter field
   */
  public String[] getOpenItemIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOpenItemIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OpenItemIdFilter filter value from a formatted string
   *
   * @param _value the OpenItemIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromFormattedString");
    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated OpenItemIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OpenItemIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemIdFilter filter field
   */
  public String[] getOpenItemIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getOpenItemIdFilter(), "OpenItem", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated OpenItemIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "OpenItemId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @param fetch whether to fetch this field or not
   */
  public void setLateFeeStatusFetch (boolean fetch) {
    this.LateFeeStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getLateFeeStatusFetch () {
    return this.LateFeeStatusFetch;
  }
  /** Set the SortOrder for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLateFeeStatusSortOrder (Integer value) {
    this.LateFeeStatusSort = value;
  }
  /** Retrieve SortOrder for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLateFeeStatusSortOrder () {
    return this.LateFeeStatusSort;
  }
  /** Set the sort direction for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLateFeeStatusSortDirection (boolean ascending) {
    this.LateFeeStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLateFeeStatusSortDirection () {
    return this.LateFeeStatusSortAscending;
  }
  /** Set the field level filters for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLateFeeStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.LateFeeStatus = value;
  }
  /** Retrieve filter for field: LateFeeStatus (BMF_DISTRIBUTION.late_fee_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLateFeeStatusFilter () {
    return this.LateFeeStatus;
  }

  /**
   * Retrieves the LateFeeStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LateFeeStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateFeeStatusFilter field
   */
  public String[] getLateFeeStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLateFeeStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateFeeStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateFeeStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LateFeeStatusFilter filter value from a formatted string
   *
   * @param _value the LateFeeStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LateFeeStatusFilter filter field
   */
  public void setLateFeeStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLateFeeStatusFilterFromFormattedString");
    try {
      this.setLateFeeStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateFeeStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateFeeStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateFeeStatusFilterFromFormattedString");
  }

  public String toString() {
    return PaymentDistributionObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PaymentDistributionObjectHelper.toMap(this, null);
  }
}
