/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CmfBonusPointObjectFilter.java
 * Definition File: Customer/CmfBonusPoint.xml
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
public class CmfBonusPointObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CmfBonusPointObjectKeyFilter Key = null;
  /** raw field for: CMF_BONUS_POINT.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CMF_BONUS_POINT.contract_tracking_id) */
  public    IntegerFilter[] ContractTrackingId  = null;
  protected boolean ContractTrackingIdFetch = false;
  protected boolean ContractTrackingIdSortAscending = true;
  protected Integer ContractTrackingIdSort = null;
  /** raw field for: CMF_BONUS_POINT.contract_tracking_id_serv) */
  public    IntegerFilter[] ContractTrackingIdServ  = null;
  protected boolean ContractTrackingIdServFetch = false;
  protected boolean ContractTrackingIdServSortAscending = true;
  protected Integer ContractTrackingIdServSort = null;
  /** raw field for: CMF_BONUS_POINT.bonus_point_id) */
  public    IntegerFilter[] BonusPointId  = null;
  protected boolean BonusPointIdFetch = false;
  protected boolean BonusPointIdSortAscending = true;
  protected Integer BonusPointIdSort = null;
  /** raw field for: CMF_BONUS_POINT.bonus_point_trans_type) */
  public    IntegerFilter[] BonusPointTransType  = null;
  protected boolean BonusPointTransTypeFetch = false;
  protected boolean BonusPointTransTypeSortAscending = true;
  protected Integer BonusPointTransTypeSort = null;
  /** raw field for: CMF_BONUS_POINT.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: CMF_BONUS_POINT.distributed_amount) */
  public    BigIntegerFilter[] DistributedAmount  = null;
  protected boolean DistributedAmountFetch = false;
  protected boolean DistributedAmountSortAscending = true;
  protected Integer DistributedAmountSort = null;
  /** raw field for: CMF_BONUS_POINT.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  /** raw field for: CMF_BONUS_POINT.expiration_date) */
  public    DateFilter[] ExpirationDate  = null;
  protected boolean ExpirationDateFetch = false;
  protected boolean ExpirationDateSortAscending = true;
  protected Integer ExpirationDateSort = null;
  /** raw field for: CMF_BONUS_POINT.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: CMF_BONUS_POINT.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: CMF_BONUS_POINT.expiration_bill_ref_no) */
  public    IntegerFilter[] ExpirationBillRefNo  = null;
  protected boolean ExpirationBillRefNoFetch = false;
  protected boolean ExpirationBillRefNoSortAscending = true;
  protected Integer ExpirationBillRefNoSort = null;
  /** raw field for: CMF_BONUS_POINT.expiration_bill_ref_resets) */
  public    IntegerFilter[] ExpirationBillRefResets  = null;
  protected boolean ExpirationBillRefResetsFetch = false;
  protected boolean ExpirationBillRefResetsSortAscending = true;
  protected Integer ExpirationBillRefResetsSort = null;
  /** raw field for: CMF_BONUS_POINT.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: CMF_BONUS_POINT.entry_date) */
  public    DateFilter[] EntryDate  = null;
  protected boolean EntryDateFetch = false;
  protected boolean EntryDateSortAscending = true;
  protected Integer EntryDateSort = null;
  /** raw field for: CMF_BONUS_POINT.trans_status) */
  public    IntegerFilter[] TransStatus  = null;
  protected boolean TransStatusFetch = false;
  protected boolean TransStatusSortAscending = true;
  protected Integer TransStatusSort = null;
  /** raw field for: CMF_BONUS_POINT.transfer_tracking_id) */
  public    IntegerFilter[] TransferTrackingId  = null;
  protected boolean TransferTrackingIdFetch = false;
  protected boolean TransferTrackingIdSortAscending = true;
  protected Integer TransferTrackingIdSort = null;
  /** raw field for: CMF_BONUS_POINT.transfer_tracking_id_serv) */
  public    IntegerFilter[] TransferTrackingIdServ  = null;
  protected boolean TransferTrackingIdServFetch = false;
  protected boolean TransferTrackingIdServSortAscending = true;
  protected Integer TransferTrackingIdServSort = null;
  /** raw field for: CMF_BONUS_POINT.external_trans_id) */
  public    StringFilter[] ExternalTransId  = null;
  protected boolean ExternalTransIdFetch = false;
  protected boolean ExternalTransIdSortAscending = true;
  protected boolean ExternalTransIdCaseInsensitive = false;
  protected Integer ExternalTransIdSort = null;
  /** raw field for: CMF_BONUS_POINT.external_date) */
  public    DateFilter[] ExternalDate  = null;
  protected boolean ExternalDateFetch = false;
  protected boolean ExternalDateSortAscending = true;
  protected Integer ExternalDateSort = null;
  /** raw field for: CMF_BONUS_POINT.external_trans_msg) */
  public    StringFilter[] ExternalTransMsg  = null;
  protected boolean ExternalTransMsgFetch = false;
  protected boolean ExternalTransMsgSortAscending = true;
  protected boolean ExternalTransMsgCaseInsensitive = false;
  protected Integer ExternalTransMsgSort = null;
  /** raw field for: CMF_BONUS_POINT.external_trans_info) */
  public    StringFilter[] ExternalTransInfo  = null;
  protected boolean ExternalTransInfoFetch = false;
  protected boolean ExternalTransInfoSortAscending = true;
  protected boolean ExternalTransInfoCaseInsensitive = false;
  protected Integer ExternalTransInfoSort = null;
  private String _objName = "CmfBonusPointObjectFilter";
  /** default constructor */
  public CmfBonusPointObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CmfBonusPointObjectFilter (CmfBonusPointObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CmfBonusPointObjectKeyFilter (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.ContractTrackingId = other.ContractTrackingId;
    this.ContractTrackingIdFetch = other.ContractTrackingIdFetch;
    this.ContractTrackingIdSort = other.ContractTrackingIdSort;
    this.ContractTrackingIdSortAscending = other.ContractTrackingIdSortAscending;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this.ContractTrackingIdServFetch = other.ContractTrackingIdServFetch;
    this.ContractTrackingIdServSort = other.ContractTrackingIdServSort;
    this.ContractTrackingIdServSortAscending = other.ContractTrackingIdServSortAscending;
    this.BonusPointId = other.BonusPointId;
    this.BonusPointIdFetch = other.BonusPointIdFetch;
    this.BonusPointIdSort = other.BonusPointIdSort;
    this.BonusPointIdSortAscending = other.BonusPointIdSortAscending;
    this.BonusPointTransType = other.BonusPointTransType;
    this.BonusPointTransTypeFetch = other.BonusPointTransTypeFetch;
    this.BonusPointTransTypeSort = other.BonusPointTransTypeSort;
    this.BonusPointTransTypeSortAscending = other.BonusPointTransTypeSortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.DistributedAmount = other.DistributedAmount;
    this.DistributedAmountFetch = other.DistributedAmountFetch;
    this.DistributedAmountSort = other.DistributedAmountSort;
    this.DistributedAmountSortAscending = other.DistributedAmountSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
    this.ExpirationDate = other.ExpirationDate;
    this.ExpirationDateFetch = other.ExpirationDateFetch;
    this.ExpirationDateSort = other.ExpirationDateSort;
    this.ExpirationDateSortAscending = other.ExpirationDateSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.ExpirationBillRefNo = other.ExpirationBillRefNo;
    this.ExpirationBillRefNoFetch = other.ExpirationBillRefNoFetch;
    this.ExpirationBillRefNoSort = other.ExpirationBillRefNoSort;
    this.ExpirationBillRefNoSortAscending = other.ExpirationBillRefNoSortAscending;
    this.ExpirationBillRefResets = other.ExpirationBillRefResets;
    this.ExpirationBillRefResetsFetch = other.ExpirationBillRefResetsFetch;
    this.ExpirationBillRefResetsSort = other.ExpirationBillRefResetsSort;
    this.ExpirationBillRefResetsSortAscending = other.ExpirationBillRefResetsSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.EntryDate = other.EntryDate;
    this.EntryDateFetch = other.EntryDateFetch;
    this.EntryDateSort = other.EntryDateSort;
    this.EntryDateSortAscending = other.EntryDateSortAscending;
    this.TransStatus = other.TransStatus;
    this.TransStatusFetch = other.TransStatusFetch;
    this.TransStatusSort = other.TransStatusSort;
    this.TransStatusSortAscending = other.TransStatusSortAscending;
    this.TransferTrackingId = other.TransferTrackingId;
    this.TransferTrackingIdFetch = other.TransferTrackingIdFetch;
    this.TransferTrackingIdSort = other.TransferTrackingIdSort;
    this.TransferTrackingIdSortAscending = other.TransferTrackingIdSortAscending;
    this.TransferTrackingIdServ = other.TransferTrackingIdServ;
    this.TransferTrackingIdServFetch = other.TransferTrackingIdServFetch;
    this.TransferTrackingIdServSort = other.TransferTrackingIdServSort;
    this.TransferTrackingIdServSortAscending = other.TransferTrackingIdServSortAscending;
    this.ExternalTransId = other.ExternalTransId;
    this.ExternalTransIdFetch = other.ExternalTransIdFetch;
    this.ExternalTransIdSort = other.ExternalTransIdSort;
    this.ExternalTransIdCaseInsensitive = other.ExternalTransIdCaseInsensitive;
    this.ExternalTransIdSortAscending = other.ExternalTransIdSortAscending;
    this.ExternalDate = other.ExternalDate;
    this.ExternalDateFetch = other.ExternalDateFetch;
    this.ExternalDateSort = other.ExternalDateSort;
    this.ExternalDateSortAscending = other.ExternalDateSortAscending;
    this.ExternalTransMsg = other.ExternalTransMsg;
    this.ExternalTransMsgFetch = other.ExternalTransMsgFetch;
    this.ExternalTransMsgSort = other.ExternalTransMsgSort;
    this.ExternalTransMsgCaseInsensitive = other.ExternalTransMsgCaseInsensitive;
    this.ExternalTransMsgSortAscending = other.ExternalTransMsgSortAscending;
    this.ExternalTransInfo = other.ExternalTransInfo;
    this.ExternalTransInfoFetch = other.ExternalTransInfoFetch;
    this.ExternalTransInfoSort = other.ExternalTransInfoSort;
    this.ExternalTransInfoCaseInsensitive = other.ExternalTransInfoCaseInsensitive;
    this.ExternalTransInfoSortAscending = other.ExternalTransInfoSortAscending;  }
  /** get the filter for this object's key
   * @return CmfBonusPointObjectKeyFilter
   */
  public CmfBonusPointObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CmfBonusPointObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTransTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTransTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PointTransTrackingIdFetch;
  }
  /** Set the SortOrder for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTransTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTransTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PointTransTrackingIdSort;
  }
  /** Set the sort direction for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTransTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTransTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PointTransTrackingIdSortAscending;
  }
  /** Set the field level filters for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTransTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingId = value;
  }
  /** Retrieve filter for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointTransTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PointTransTrackingId;
  }
  /** Set the field level Fetch value for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTransTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTransTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PointTransTrackingIdServFetch;
  }
  /** Set the SortOrder for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTransTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTransTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PointTransTrackingIdServSort;
  }
  /** Set the sort direction for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTransTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTransTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PointTransTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTransTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CmfBonusPointObjectKeyFilter ();
    this.Key.PointTransTrackingIdServ = value;
  }
  /** Retrieve filter for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointTransTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PointTransTrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_BONUS_POINT.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_BONUS_POINT.account_no)
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

  /** Set the field level Fetch value for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdFetch (boolean fetch) {
    this.ContractTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdFetch () {
    return this.ContractTrackingIdFetch;
  }
  /** Set the SortOrder for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdSortOrder (Integer value) {
    this.ContractTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdSortOrder () {
    return this.ContractTrackingIdSort;
  }
  /** Set the sort direction for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdSortDirection (boolean ascending) {
    this.ContractTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdSortDirection () {
    return this.ContractTrackingIdSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingId = value;
  }
  /** Retrieve filter for field: ContractTrackingId (CMF_BONUS_POINT.contract_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTrackingIdFilter () {
    return this.ContractTrackingId;
  }

  /**
   * Retrieves the ContractTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingIdFilter field
   */
  public String[] getContractTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTrackingIdFilter filter value from a formatted string
   *
   * @param _value the ContractTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTrackingIdFilter filter field
   */
  public void setContractTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTrackingIdFilterFromFormattedString");
    try {
      this.setContractTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdServFetch (boolean fetch) {
    this.ContractTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdServFetch () {
    return this.ContractTrackingIdServFetch;
  }
  /** Set the SortOrder for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdServSortOrder (Integer value) {
    this.ContractTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdServSortOrder () {
    return this.ContractTrackingIdServSort;
  }
  /** Set the sort direction for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdServSortDirection (boolean ascending) {
    this.ContractTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdServSortDirection () {
    return this.ContractTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingIdServ = value;
  }
  /** Retrieve filter for field: ContractTrackingIdServ (CMF_BONUS_POINT.contract_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTrackingIdServFilter () {
    return this.ContractTrackingIdServ;
  }

  /**
   * Retrieves the ContractTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingIdServFilter field
   */
  public String[] getContractTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the ContractTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTrackingIdServFilter filter field
   */
  public void setContractTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTrackingIdServFilterFromFormattedString");
    try {
      this.setContractTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBonusPointIdFetch (boolean fetch) {
    this.BonusPointIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBonusPointIdFetch () {
    return this.BonusPointIdFetch;
  }
  /** Set the SortOrder for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBonusPointIdSortOrder (Integer value) {
    this.BonusPointIdSort = value;
  }
  /** Retrieve SortOrder for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBonusPointIdSortOrder () {
    return this.BonusPointIdSort;
  }
  /** Set the sort direction for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBonusPointIdSortDirection (boolean ascending) {
    this.BonusPointIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBonusPointIdSortDirection () {
    return this.BonusPointIdSortAscending;
  }
  /** Set the field level filters for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBonusPointIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BonusPointId = value;
  }
  /** Retrieve filter for field: BonusPointId (CMF_BONUS_POINT.bonus_point_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBonusPointIdFilter () {
    return this.BonusPointId;
  }

  /**
   * Retrieves the BonusPointIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BonusPointIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointIdFilter field
   */
  public String[] getBonusPointIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBonusPointIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BonusPointIdFilter filter value from a formatted string
   *
   * @param _value the BonusPointIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BonusPointIdFilter filter field
   */
  public void setBonusPointIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointIdFilterFromFormattedString");
    try {
      this.setBonusPointIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BonusPointIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BonusPointIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BonusPointIdFilter filter field
   */
  public String[] getBonusPointIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBonusPointIdFilter(), "BonusPointId", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BonusPointIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BonusPointIdFilter filter field
   */
  public void setBonusPointIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBonusPointIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BonusPointId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBonusPointTransTypeFetch (boolean fetch) {
    this.BonusPointTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBonusPointTransTypeFetch () {
    return this.BonusPointTransTypeFetch;
  }
  /** Set the SortOrder for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBonusPointTransTypeSortOrder (Integer value) {
    this.BonusPointTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBonusPointTransTypeSortOrder () {
    return this.BonusPointTransTypeSort;
  }
  /** Set the sort direction for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBonusPointTransTypeSortDirection (boolean ascending) {
    this.BonusPointTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBonusPointTransTypeSortDirection () {
    return this.BonusPointTransTypeSortAscending;
  }
  /** Set the field level filters for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBonusPointTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BonusPointTransType = value;
  }
  /** Retrieve filter for field: BonusPointTransType (CMF_BONUS_POINT.bonus_point_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBonusPointTransTypeFilter () {
    return this.BonusPointTransType;
  }

  /**
   * Retrieves the BonusPointTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BonusPointTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointTransTypeFilter field
   */
  public String[] getBonusPointTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBonusPointTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BonusPointTransTypeFilter filter value from a formatted string
   *
   * @param _value the BonusPointTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BonusPointTransTypeFilter filter field
   */
  public void setBonusPointTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointTransTypeFilterFromFormattedString");
    try {
      this.setBonusPointTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointTransTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BonusPointTransTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BonusPointTransTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BonusPointTransTypeFilter filter field
   */
  public String[] getBonusPointTransTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBonusPointTransTypeFilter(), "BonusPointTransType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BonusPointTransTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BonusPointTransTypeFilter filter field
   */
  public void setBonusPointTransTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointTransTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBonusPointTransTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BonusPointTransType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointTransTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointTransTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: Amount (CMF_BONUS_POINT.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (CMF_BONUS_POINT.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (CMF_BONUS_POINT.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (CMF_BONUS_POINT.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (CMF_BONUS_POINT.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (CMF_BONUS_POINT.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (CMF_BONUS_POINT.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (CMF_BONUS_POINT.amount)
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


  /** Set the field level Fetch value for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setDistributedAmountFetch (boolean fetch) {
    this.DistributedAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistributedAmountFetch () {
    return this.DistributedAmountFetch;
  }
  /** Set the SortOrder for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistributedAmountSortOrder (Integer value) {
    this.DistributedAmountSort = value;
  }
  /** Retrieve SortOrder for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistributedAmountSortOrder () {
    return this.DistributedAmountSort;
  }
  /** Set the sort direction for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistributedAmountSortDirection (boolean ascending) {
    this.DistributedAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistributedAmountSortDirection () {
    return this.DistributedAmountSortAscending;
  }
  /** Set the field level filters for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistributedAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DistributedAmount = value;
  }
  /** Retrieve filter for field: DistributedAmount (CMF_BONUS_POINT.distributed_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDistributedAmountFilter () {
    return this.DistributedAmount;
  }

  /**
   * Retrieves the DistributedAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributedAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedAmountFilter field
   */
  public String[] getDistributedAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistributedAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistributedAmountFilter filter value from a formatted string
   *
   * @param _value the DistributedAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistributedAmountFilter filter field
   */
  public void setDistributedAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributedAmountFilterFromFormattedString");
    try {
      this.setDistributedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedAmountFilterFromFormattedString");
  }

  /**
   * Sets the DistributedAmountFilter filter value from a formatted string
   *
   * @param _value the DistributedAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistributedAmountFilter filter field
   */
  public void setDistributedAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributedAmountFilterFromFormattedCurrencyString");
    try {
      this.setDistributedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DistributedAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributedAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedAmountFilter field
   */

  public String[] getDistributedAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistributedAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TransDate (CMF_BONUS_POINT.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (CMF_BONUS_POINT.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (CMF_BONUS_POINT.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (CMF_BONUS_POINT.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (CMF_BONUS_POINT.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (CMF_BONUS_POINT.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (CMF_BONUS_POINT.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (CMF_BONUS_POINT.trans_date)
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


  /** Set the field level Fetch value for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * @param fetch whether to fetch this field or not
   */
  public void setExpirationDateFetch (boolean fetch) {
    this.ExpirationDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getExpirationDateFetch () {
    return this.ExpirationDateFetch;
  }
  /** Set the SortOrder for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExpirationDateSortOrder (Integer value) {
    this.ExpirationDateSort = value;
  }
  /** Retrieve SortOrder for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExpirationDateSortOrder () {
    return this.ExpirationDateSort;
  }
  /** Set the sort direction for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExpirationDateSortDirection (boolean ascending) {
    this.ExpirationDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExpirationDateSortDirection () {
    return this.ExpirationDateSortAscending;
  }
  /** Set the field level filters for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExpirationDateFilter (DateFilter[] value) throws ServiceException {
    this.ExpirationDate = value;
  }
  /** Retrieve filter for field: ExpirationDate (CMF_BONUS_POINT.expiration_date)
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


  /** Set the field level Fetch value for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (CMF_BONUS_POINT.bill_ref_no)
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

  /** Set the field level Fetch value for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (CMF_BONUS_POINT.bill_ref_resets)
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

  /** Set the field level Fetch value for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setExpirationBillRefNoFetch (boolean fetch) {
    this.ExpirationBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getExpirationBillRefNoFetch () {
    return this.ExpirationBillRefNoFetch;
  }
  /** Set the SortOrder for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExpirationBillRefNoSortOrder (Integer value) {
    this.ExpirationBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExpirationBillRefNoSortOrder () {
    return this.ExpirationBillRefNoSort;
  }
  /** Set the sort direction for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExpirationBillRefNoSortDirection (boolean ascending) {
    this.ExpirationBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExpirationBillRefNoSortDirection () {
    return this.ExpirationBillRefNoSortAscending;
  }
  /** Set the field level filters for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExpirationBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.ExpirationBillRefNo = value;
  }
  /** Retrieve filter for field: ExpirationBillRefNo (CMF_BONUS_POINT.expiration_bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExpirationBillRefNoFilter () {
    return this.ExpirationBillRefNo;
  }

  /**
   * Retrieves the ExpirationBillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExpirationBillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationBillRefNoFilter field
   */
  public String[] getExpirationBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExpirationBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExpirationBillRefNoFilter filter value from a formatted string
   *
   * @param _value the ExpirationBillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExpirationBillRefNoFilter filter field
   */
  public void setExpirationBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExpirationBillRefNoFilterFromFormattedString");
    try {
      this.setExpirationBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExpirationBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setExpirationBillRefResetsFetch (boolean fetch) {
    this.ExpirationBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getExpirationBillRefResetsFetch () {
    return this.ExpirationBillRefResetsFetch;
  }
  /** Set the SortOrder for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExpirationBillRefResetsSortOrder (Integer value) {
    this.ExpirationBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExpirationBillRefResetsSortOrder () {
    return this.ExpirationBillRefResetsSort;
  }
  /** Set the sort direction for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExpirationBillRefResetsSortDirection (boolean ascending) {
    this.ExpirationBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExpirationBillRefResetsSortDirection () {
    return this.ExpirationBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExpirationBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ExpirationBillRefResets = value;
  }
  /** Retrieve filter for field: ExpirationBillRefResets (CMF_BONUS_POINT.expiration_bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExpirationBillRefResetsFilter () {
    return this.ExpirationBillRefResets;
  }

  /**
   * Retrieves the ExpirationBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExpirationBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExpirationBillRefResetsFilter field
   */
  public String[] getExpirationBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExpirationBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExpirationBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExpirationBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExpirationBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExpirationBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the ExpirationBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExpirationBillRefResetsFilter filter field
   */
  public void setExpirationBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExpirationBillRefResetsFilterFromFormattedString");
    try {
      this.setExpirationBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExpirationBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExpirationBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExpirationBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (CMF_BONUS_POINT.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (CMF_BONUS_POINT.chg_who)
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

  /** Set the field level Fetch value for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * @param fetch whether to fetch this field or not
   */
  public void setEntryDateFetch (boolean fetch) {
    this.EntryDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getEntryDateFetch () {
    return this.EntryDateFetch;
  }
  /** Set the SortOrder for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEntryDateSortOrder (Integer value) {
    this.EntryDateSort = value;
  }
  /** Retrieve SortOrder for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEntryDateSortOrder () {
    return this.EntryDateSort;
  }
  /** Set the sort direction for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEntryDateSortDirection (boolean ascending) {
    this.EntryDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEntryDateSortDirection () {
    return this.EntryDateSortAscending;
  }
  /** Set the field level filters for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEntryDateFilter (DateFilter[] value) throws ServiceException {
    this.EntryDate = value;
  }
  /** Retrieve filter for field: EntryDate (CMF_BONUS_POINT.entry_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEntryDateFilter () {
    return this.EntryDate;
  }

  /**
   * Retrieves the EntryDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntryDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDateFilter field
   */
  public String[] getEntryDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntryDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EntryDateFilter filter value from a formatted string
   *
   * @param _value the EntryDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntryDateFilter filter field
   */
  public void setEntryDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntryDateFilterFromFormattedString");
    try {
      this.setEntryDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntryDateFilterFromFormattedString");
  }

  /**
   * Retrieves the EntryDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntryDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDateFilter field
   */
  public String[] getEntryDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntryDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EntryDateFilter filter value from a formatted string
   *
   * @param _value the EntryDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntryDateFilter filter field
   */
  public void setEntryDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntryDateFilterFromFormattedDateTimeString");
    try {
      this.setEntryDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntryDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * @param fetch whether to fetch this field or not
   */
  public void setTransStatusFetch (boolean fetch) {
    this.TransStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransStatusFetch () {
    return this.TransStatusFetch;
  }
  /** Set the SortOrder for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransStatusSortOrder (Integer value) {
    this.TransStatusSort = value;
  }
  /** Retrieve SortOrder for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransStatusSortOrder () {
    return this.TransStatusSort;
  }
  /** Set the sort direction for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransStatusSortDirection (boolean ascending) {
    this.TransStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransStatusSortDirection () {
    return this.TransStatusSortAscending;
  }
  /** Set the field level filters for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.TransStatus = value;
  }
  /** Retrieve filter for field: TransStatus (CMF_BONUS_POINT.trans_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransStatusFilter () {
    return this.TransStatus;
  }

  /**
   * Retrieves the TransStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransStatusFilter field
   */
  public String[] getTransStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransStatusFilter filter value from a formatted string
   *
   * @param _value the TransStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransStatusFilter filter field
   */
  public void setTransStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransStatusFilterFromFormattedString");
    try {
      this.setTransStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTransferTrackingIdFetch (boolean fetch) {
    this.TransferTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransferTrackingIdFetch () {
    return this.TransferTrackingIdFetch;
  }
  /** Set the SortOrder for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransferTrackingIdSortOrder (Integer value) {
    this.TransferTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransferTrackingIdSortOrder () {
    return this.TransferTrackingIdSort;
  }
  /** Set the sort direction for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransferTrackingIdSortDirection (boolean ascending) {
    this.TransferTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransferTrackingIdSortDirection () {
    return this.TransferTrackingIdSortAscending;
  }
  /** Set the field level filters for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransferTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TransferTrackingId = value;
  }
  /** Retrieve filter for field: TransferTrackingId (CMF_BONUS_POINT.transfer_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransferTrackingIdFilter () {
    return this.TransferTrackingId;
  }

  /**
   * Retrieves the TransferTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransferTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransferTrackingIdFilter field
   */
  public String[] getTransferTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransferTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransferTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransferTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransferTrackingIdFilter filter value from a formatted string
   *
   * @param _value the TransferTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransferTrackingIdFilter filter field
   */
  public void setTransferTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransferTrackingIdFilterFromFormattedString");
    try {
      this.setTransferTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransferTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransferTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransferTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTransferTrackingIdServFetch (boolean fetch) {
    this.TransferTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransferTrackingIdServFetch () {
    return this.TransferTrackingIdServFetch;
  }
  /** Set the SortOrder for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransferTrackingIdServSortOrder (Integer value) {
    this.TransferTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransferTrackingIdServSortOrder () {
    return this.TransferTrackingIdServSort;
  }
  /** Set the sort direction for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransferTrackingIdServSortDirection (boolean ascending) {
    this.TransferTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransferTrackingIdServSortDirection () {
    return this.TransferTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransferTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.TransferTrackingIdServ = value;
  }
  /** Retrieve filter for field: TransferTrackingIdServ (CMF_BONUS_POINT.transfer_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransferTrackingIdServFilter () {
    return this.TransferTrackingIdServ;
  }

  /**
   * Retrieves the TransferTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransferTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransferTrackingIdServFilter field
   */
  public String[] getTransferTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransferTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransferTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransferTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransferTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransferTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransferTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the TransferTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransferTrackingIdServFilter filter field
   */
  public void setTransferTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransferTrackingIdServFilterFromFormattedString");
    try {
      this.setTransferTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransferTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransferTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransferTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalTransIdFetch (boolean fetch) {
    this.ExternalTransIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalTransIdFetch () {
    return this.ExternalTransIdFetch;
  }
  /** Set the SortOrder for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalTransIdSortOrder (Integer value) {
    this.ExternalTransIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalTransIdSortOrder () {
    return this.ExternalTransIdSort;
  }
  /** Set the sort direction for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalTransIdSortDirection (boolean ascending) {
    this.ExternalTransIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalTransIdSortDirection () {
    return this.ExternalTransIdSortAscending;
  }
  /** Set the case insensitive for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExternalTransIdCaseInsensitive (boolean ascending) {
    this.ExternalTransIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExternalTransIdCaseInsensitive () {
    return this.ExternalTransIdCaseInsensitive;
  }
  /** Set the field level filters for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalTransIdFilter (StringFilter[] value) throws ServiceException {
    this.ExternalTransId = value;
  }
  /** Retrieve filter for field: ExternalTransId (CMF_BONUS_POINT.external_trans_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExternalTransIdFilter () {
    return this.ExternalTransId;
  }

  /**
   * Retrieves the ExternalTransIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalTransIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalTransIdFilter field
   */
  public String[] getExternalTransIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalTransIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalTransIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalTransIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalTransIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalTransIdFilter filter value from a formatted string
   *
   * @param _value the ExternalTransIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalTransIdFilter filter field
   */
  public void setExternalTransIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalTransIdFilterFromFormattedString");
    try {
      this.setExternalTransIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalTransIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalTransIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalTransIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalDateFetch (boolean fetch) {
    this.ExternalDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalDateFetch () {
    return this.ExternalDateFetch;
  }
  /** Set the SortOrder for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalDateSortOrder (Integer value) {
    this.ExternalDateSort = value;
  }
  /** Retrieve SortOrder for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalDateSortOrder () {
    return this.ExternalDateSort;
  }
  /** Set the sort direction for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalDateSortDirection (boolean ascending) {
    this.ExternalDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalDateSortDirection () {
    return this.ExternalDateSortAscending;
  }
  /** Set the field level filters for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalDateFilter (DateFilter[] value) throws ServiceException {
    this.ExternalDate = value;
  }
  /** Retrieve filter for field: ExternalDate (CMF_BONUS_POINT.external_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getExternalDateFilter () {
    return this.ExternalDate;
  }

  /**
   * Retrieves the ExternalDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalDateFilter field
   */
  public String[] getExternalDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalDateFilter filter value from a formatted string
   *
   * @param _value the ExternalDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalDateFilter filter field
   */
  public void setExternalDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalDateFilterFromFormattedString");
    try {
      this.setExternalDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ExternalDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalDateFilter field
   */
  public String[] getExternalDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalDateFilter filter value from a formatted string
   *
   * @param _value the ExternalDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalDateFilter filter field
   */
  public void setExternalDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalDateFilterFromFormattedDateTimeString");
    try {
      this.setExternalDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalTransMsgFetch (boolean fetch) {
    this.ExternalTransMsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalTransMsgFetch () {
    return this.ExternalTransMsgFetch;
  }
  /** Set the SortOrder for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalTransMsgSortOrder (Integer value) {
    this.ExternalTransMsgSort = value;
  }
  /** Retrieve SortOrder for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalTransMsgSortOrder () {
    return this.ExternalTransMsgSort;
  }
  /** Set the sort direction for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalTransMsgSortDirection (boolean ascending) {
    this.ExternalTransMsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalTransMsgSortDirection () {
    return this.ExternalTransMsgSortAscending;
  }
  /** Set the case insensitive for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExternalTransMsgCaseInsensitive (boolean ascending) {
    this.ExternalTransMsgCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExternalTransMsgCaseInsensitive () {
    return this.ExternalTransMsgCaseInsensitive;
  }
  /** Set the field level filters for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalTransMsgFilter (StringFilter[] value) throws ServiceException {
    this.ExternalTransMsg = value;
  }
  /** Retrieve filter for field: ExternalTransMsg (CMF_BONUS_POINT.external_trans_msg)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExternalTransMsgFilter () {
    return this.ExternalTransMsg;
  }

  /**
   * Retrieves the ExternalTransMsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalTransMsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalTransMsgFilter field
   */
  public String[] getExternalTransMsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransMsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalTransMsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalTransMsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalTransMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalTransMsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalTransMsgFilter filter value from a formatted string
   *
   * @param _value the ExternalTransMsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalTransMsgFilter filter field
   */
  public void setExternalTransMsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalTransMsgFilterFromFormattedString");
    try {
      this.setExternalTransMsgFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalTransMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalTransMsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalTransMsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalTransInfoFetch (boolean fetch) {
    this.ExternalTransInfoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalTransInfoFetch () {
    return this.ExternalTransInfoFetch;
  }
  /** Set the SortOrder for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalTransInfoSortOrder (Integer value) {
    this.ExternalTransInfoSort = value;
  }
  /** Retrieve SortOrder for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalTransInfoSortOrder () {
    return this.ExternalTransInfoSort;
  }
  /** Set the sort direction for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalTransInfoSortDirection (boolean ascending) {
    this.ExternalTransInfoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalTransInfoSortDirection () {
    return this.ExternalTransInfoSortAscending;
  }
  /** Set the case insensitive for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExternalTransInfoCaseInsensitive (boolean ascending) {
    this.ExternalTransInfoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExternalTransInfoCaseInsensitive () {
    return this.ExternalTransInfoCaseInsensitive;
  }
  /** Set the field level filters for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalTransInfoFilter (StringFilter[] value) throws ServiceException {
    this.ExternalTransInfo = value;
  }
  /** Retrieve filter for field: ExternalTransInfo (CMF_BONUS_POINT.external_trans_info)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExternalTransInfoFilter () {
    return this.ExternalTransInfo;
  }

  /**
   * Retrieves the ExternalTransInfoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalTransInfoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalTransInfoFilter field
   */
  public String[] getExternalTransInfoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalTransInfoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalTransInfoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalTransInfoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalTransInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalTransInfoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalTransInfoFilter filter value from a formatted string
   *
   * @param _value the ExternalTransInfoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalTransInfoFilter filter field
   */
  public void setExternalTransInfoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalTransInfoFilterFromFormattedString");
    try {
      this.setExternalTransInfoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalTransInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalTransInfoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalTransInfoFilterFromFormattedString");
  }

  public String toString() {
    return CmfBonusPointObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CmfBonusPointObjectHelper.toMap(this, null);
  }
}
