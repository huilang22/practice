/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionObjectFilter.java
 * Definition File: Customer/HistoricalContribution.xml
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
public class HistoricalContributionObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HistoricalContributionObjectKeyFilter Key = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  /** raw field for: CUSTOMER_ID_EQUIP_MAP_VIEW.external_id) */
  public    StringFilter[] ServiceExternalId  = null;
  protected boolean ServiceExternalIdFetch = false;
  protected boolean ServiceExternalIdSortAscending = true;
  protected boolean ServiceExternalIdCaseInsensitive = false;
  protected Integer ServiceExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type) */
  public    IntegerFilter[] ServiceExternalIdType  = null;
  protected boolean ServiceExternalIdTypeFetch = false;
  protected boolean ServiceExternalIdTypeSortAscending = true;
  protected Integer ServiceExternalIdTypeSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.contract_tracking_id) */
  public    IntegerFilter[] ContractTrackingId  = null;
  protected boolean ContractTrackingIdFetch = false;
  protected boolean ContractTrackingIdSortAscending = true;
  protected Integer ContractTrackingIdSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.contract_tracking_id_serv) */
  public    IntegerFilter[] ContractTrackingIdServ  = null;
  protected boolean ContractTrackingIdServFetch = false;
  protected boolean ContractTrackingIdServSortAscending = true;
  protected Integer ContractTrackingIdServSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.discount_id) */
  public    IntegerFilter[] DiscountId  = null;
  protected boolean DiscountIdFetch = false;
  protected boolean DiscountIdSortAscending = true;
  protected Integer DiscountIdSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.discount_quantum) */
  public    IntegerFilter[] DiscountQuantum  = null;
  protected boolean DiscountQuantumFetch = false;
  protected boolean DiscountQuantumSortAscending = true;
  protected Integer DiscountQuantumSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.quanta) */
  public    BigIntegerFilter[] Quanta  = null;
  protected boolean QuantaFetch = false;
  protected boolean QuantaSortAscending = true;
  protected Integer QuantaSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.target_amount) */
  public    BigIntegerFilter[] TargetAmount  = null;
  protected boolean TargetAmountFetch = false;
  protected boolean TargetAmountSortAscending = true;
  protected Integer TargetAmountSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.effective_date) */
  public    DateFilter[] EffectiveDate  = null;
  protected boolean EffectiveDateFetch = false;
  protected boolean EffectiveDateSortAscending = true;
  protected Integer EffectiveDateSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.process_name) */
  public    StringFilter[] ProcessName  = null;
  protected boolean ProcessNameFetch = false;
  protected boolean ProcessNameSortAscending = true;
  protected boolean ProcessNameCaseInsensitive = false;
  protected Integer ProcessNameSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.evaluated) */
  public    BooleanFilter[] Evaluated  = null;
  protected boolean EvaluatedFetch = false;
  protected boolean EvaluatedSortAscending = true;
  protected Integer EvaluatedSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.evaluated_date) */
  public    DateFilter[] EvaluatedDate  = null;
  protected boolean EvaluatedDateFetch = false;
  protected boolean EvaluatedDateSortAscending = true;
  protected Integer EvaluatedDateSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  private String _objName = "HistoricalContributionObjectFilter";
  /** default constructor */
  public HistoricalContributionObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HistoricalContributionObjectFilter (HistoricalContributionObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HistoricalContributionObjectKeyFilter (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
    this.ContractTrackingId = other.ContractTrackingId;
    this.ContractTrackingIdFetch = other.ContractTrackingIdFetch;
    this.ContractTrackingIdSort = other.ContractTrackingIdSort;
    this.ContractTrackingIdSortAscending = other.ContractTrackingIdSortAscending;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this.ContractTrackingIdServFetch = other.ContractTrackingIdServFetch;
    this.ContractTrackingIdServSort = other.ContractTrackingIdServSort;
    this.ContractTrackingIdServSortAscending = other.ContractTrackingIdServSortAscending;
    this.DiscountId = other.DiscountId;
    this.DiscountIdFetch = other.DiscountIdFetch;
    this.DiscountIdSort = other.DiscountIdSort;
    this.DiscountIdSortAscending = other.DiscountIdSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;
    this.DiscountQuantum = other.DiscountQuantum;
    this.DiscountQuantumFetch = other.DiscountQuantumFetch;
    this.DiscountQuantumSort = other.DiscountQuantumSort;
    this.DiscountQuantumSortAscending = other.DiscountQuantumSortAscending;
    this.Quanta = other.Quanta;
    this.QuantaFetch = other.QuantaFetch;
    this.QuantaSort = other.QuantaSort;
    this.QuantaSortAscending = other.QuantaSortAscending;
    this.TargetAmount = other.TargetAmount;
    this.TargetAmountFetch = other.TargetAmountFetch;
    this.TargetAmountSort = other.TargetAmountSort;
    this.TargetAmountSortAscending = other.TargetAmountSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.EffectiveDate = other.EffectiveDate;
    this.EffectiveDateFetch = other.EffectiveDateFetch;
    this.EffectiveDateSort = other.EffectiveDateSort;
    this.EffectiveDateSortAscending = other.EffectiveDateSortAscending;
    this.ProcessName = other.ProcessName;
    this.ProcessNameFetch = other.ProcessNameFetch;
    this.ProcessNameSort = other.ProcessNameSort;
    this.ProcessNameCaseInsensitive = other.ProcessNameCaseInsensitive;
    this.ProcessNameSortAscending = other.ProcessNameSortAscending;
    this.Evaluated = other.Evaluated;
    this.EvaluatedFetch = other.EvaluatedFetch;
    this.EvaluatedSort = other.EvaluatedSort;
    this.EvaluatedSortAscending = other.EvaluatedSortAscending;
    this.EvaluatedDate = other.EvaluatedDate;
    this.EvaluatedDateFetch = other.EvaluatedDateFetch;
    this.EvaluatedDateSort = other.EvaluatedDateSort;
    this.EvaluatedDateSortAscending = other.EvaluatedDateSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;  }
  /** get the filter for this object's key
   * @return HistoricalContributionObjectKeyFilter
   */
  public HistoricalContributionObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HistoricalContributionObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccumulationTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccumulationTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdFetch;
  }
  /** Set the SortOrder for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccumulationTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccumulationTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingIdSort;
  }
  /** Set the sort direction for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccumulationTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccumulationTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdSortAscending;
  }
  /** Set the field level filters for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccumulationTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingId = value;
  }
  /** Retrieve filter for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccumulationTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingId;
  }
  /** Set the field level Fetch value for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setAccumulationTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccumulationTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdServFetch;
  }
  /** Set the SortOrder for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccumulationTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccumulationTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingIdServSort;
  }
  /** Set the sort direction for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccumulationTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccumulationTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccumulationTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HistoricalContributionObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServ = value;
  }
  /** Retrieve filter for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccumulationTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch) {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch () {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value) {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder () {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending) {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection () {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending) {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountExternalIdCaseInsensitive () {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter () {
    return this.AccountExternalId;
  }

  /**
   * Retrieves the AccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdFilter field
   */
  public String[] getAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdFilter filter field
   */
  public void setAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
    try {
      this.setAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch) {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch () {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value) {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder () {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending) {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection () {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter () {
    return this.AccountExternalIdType;
  }

  /**
   * Retrieves the AccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdTypeFilter field
   */
  public String[] getAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdTypeFilter filter field
   */
  public String[] getAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdFetch (boolean fetch) {
    this.ServiceExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdFetch () {
    return this.ServiceExternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdSortOrder (Integer value) {
    this.ServiceExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdSortOrder () {
    return this.ServiceExternalIdSort;
  }
  /** Set the sort direction for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdSortDirection (boolean ascending) {
    this.ServiceExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdSortDirection () {
    return this.ServiceExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceExternalIdCaseInsensitive (boolean ascending) {
    this.ServiceExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceExternalIdCaseInsensitive () {
    return this.ServiceExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ServiceExternalId = value;
  }
  /** Retrieve filter for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceExternalIdFilter () {
    return this.ServiceExternalId;
  }

  /**
   * Retrieves the ServiceExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdFilter field
   */
  public String[] getServiceExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdFilter filter field
   */
  public void setServiceExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
    try {
      this.setServiceExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdTypeFetch (boolean fetch) {
    this.ServiceExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdTypeFetch () {
    return this.ServiceExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdTypeSortOrder (Integer value) {
    this.ServiceExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdTypeSortOrder () {
    return this.ServiceExternalIdTypeSort;
  }
  /** Set the sort direction for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdTypeSortDirection (boolean ascending) {
    this.ServiceExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdTypeSortDirection () {
    return this.ServiceExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceExternalIdType = value;
  }
  /** Retrieve filter for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceExternalIdTypeFilter () {
    return this.ServiceExternalIdType;
  }

  /**
   * Retrieves the ServiceExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdTypeFilter field
   */
  public String[] getServiceExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdTypeFilter filter field
   */
  public void setServiceExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
    try {
      this.setServiceExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ServiceExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ServiceExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceExternalIdTypeFilter filter field
   */
  public String[] getServiceExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getServiceExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ServiceExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdTypeFilter filter field
   */
  public void setServiceExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setServiceExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ServiceExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdFetch (boolean fetch) {
    this.ContractTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdFetch () {
    return this.ContractTrackingIdFetch;
  }
  /** Set the SortOrder for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdSortOrder (Integer value) {
    this.ContractTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdSortOrder () {
    return this.ContractTrackingIdSort;
  }
  /** Set the sort direction for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdSortDirection (boolean ascending) {
    this.ContractTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdSortDirection () {
    return this.ContractTrackingIdSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingId = value;
  }
  /** Retrieve filter for field: ContractTrackingId (HISTORIC_CONTRIBUTION.contract_tracking_id)
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

  /** Set the field level Fetch value for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdServFetch (boolean fetch) {
    this.ContractTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdServFetch () {
    return this.ContractTrackingIdServFetch;
  }
  /** Set the SortOrder for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdServSortOrder (Integer value) {
    this.ContractTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdServSortOrder () {
    return this.ContractTrackingIdServSort;
  }
  /** Set the sort direction for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdServSortDirection (boolean ascending) {
    this.ContractTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdServSortDirection () {
    return this.ContractTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingIdServ = value;
  }
  /** Retrieve filter for field: ContractTrackingIdServ (HISTORIC_CONTRIBUTION.contract_tracking_id_serv)
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

  /** Set the field level Fetch value for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountIdFetch (boolean fetch) {
    this.DiscountIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountIdFetch () {
    return this.DiscountIdFetch;
  }
  /** Set the SortOrder for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountIdSortOrder (Integer value) {
    this.DiscountIdSort = value;
  }
  /** Retrieve SortOrder for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountIdSortOrder () {
    return this.DiscountIdSort;
  }
  /** Set the sort direction for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountIdSortDirection (boolean ascending) {
    this.DiscountIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountIdSortDirection () {
    return this.DiscountIdSortAscending;
  }
  /** Set the field level filters for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountId = value;
  }
  /** Retrieve filter for field: DiscountId (HISTORIC_CONTRIBUTION.discount_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountIdFilter () {
    return this.DiscountId;
  }

  /**
   * Retrieves the DiscountIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountIdFilter field
   */
  public String[] getDiscountIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountIdFilter filter value from a formatted string
   *
   * @param _value the DiscountIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountIdFilter filter field
   */
  public void setDiscountIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFilterFromFormattedString");
    try {
      this.setDiscountIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (HISTORIC_CONTRIBUTION.bill_ref_no)
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

  /** Set the field level Fetch value for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (HISTORIC_CONTRIBUTION.bill_ref_resets)
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

  /** Set the field level Fetch value for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (HISTORIC_CONTRIBUTION.account_no)
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

  /** Set the field level Fetch value for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (HISTORIC_CONTRIBUTION.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter () {
    return this.ServiceInternalId;
  }

  /**
   * Retrieves the ServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdFilter field
   */
  public String[] getServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdFilter filter field
   */
  public void setServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
    try {
      this.setServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (HISTORIC_CONTRIBUTION.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter () {
    return this.ServiceInternalIdResets;
  }

  /**
   * Retrieves the ServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResetsFilter field
   */
  public String[] getServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdResetsFilter filter field
   */
  public void setServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountQuantumFetch (boolean fetch) {
    this.DiscountQuantumFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountQuantumFetch () {
    return this.DiscountQuantumFetch;
  }
  /** Set the SortOrder for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountQuantumSortOrder (Integer value) {
    this.DiscountQuantumSort = value;
  }
  /** Retrieve SortOrder for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountQuantumSortOrder () {
    return this.DiscountQuantumSort;
  }
  /** Set the sort direction for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountQuantumSortDirection (boolean ascending) {
    this.DiscountQuantumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountQuantumSortDirection () {
    return this.DiscountQuantumSortAscending;
  }
  /** Set the field level filters for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountQuantumFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountQuantum = value;
  }
  /** Retrieve filter for field: DiscountQuantum (HISTORIC_CONTRIBUTION.discount_quantum)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountQuantumFilter () {
    return this.DiscountQuantum;
  }

  /**
   * Retrieves the DiscountQuantumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountQuantumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountQuantumFilter field
   */
  public String[] getDiscountQuantumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountQuantumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountQuantumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountQuantumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountQuantumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountQuantumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountQuantumFilter filter value from a formatted string
   *
   * @param _value the DiscountQuantumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountQuantumFilter filter field
   */
  public void setDiscountQuantumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountQuantumFilterFromFormattedString");
    try {
      this.setDiscountQuantumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountQuantumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountQuantumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountQuantumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * @param fetch whether to fetch this field or not
   */
  public void setQuantaFetch (boolean fetch) {
    this.QuantaFetch = fetch;
  }
  /** Retrieve Fetch value for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * @return boolean the Fetch value for this field
   */
  public boolean getQuantaFetch () {
    return this.QuantaFetch;
  }
  /** Set the SortOrder for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setQuantaSortOrder (Integer value) {
    this.QuantaSort = value;
  }
  /** Retrieve SortOrder for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getQuantaSortOrder () {
    return this.QuantaSort;
  }
  /** Set the sort direction for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setQuantaSortDirection (boolean ascending) {
    this.QuantaSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getQuantaSortDirection () {
    return this.QuantaSortAscending;
  }
  /** Set the field level filters for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setQuantaFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Quanta = value;
  }
  /** Retrieve filter for field: Quanta (HISTORIC_CONTRIBUTION.quanta)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getQuantaFilter () {
    return this.Quanta;
  }

  /**
   * Retrieves the QuantaFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The QuantaFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the QuantaFilter field
   */
  public String[] getQuantaFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantaFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getQuantaFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantaFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantaFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantaFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the QuantaFilter filter value from a formatted string
   *
   * @param _value the QuantaFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the QuantaFilter filter field
   */
  public void setQuantaFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setQuantaFilterFromFormattedString");
    try {
      this.setQuantaFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantaFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantaFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantaFilterFromFormattedString");
  }

  /**
   * Sets the QuantaFilter filter value from a formatted string
   *
   * @param _value the QuantaFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the QuantaFilter filter field
   */
  public void setQuantaFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setQuantaFilterFromFormattedCurrencyString");
    try {
      this.setQuantaFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantaFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantaFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantaFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the QuantaFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The QuantaFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the QuantaFilter field
   */

  public String[] getQuantaFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantaFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getQuantaFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantaFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantaFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantaFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setTargetAmountFetch (boolean fetch) {
    this.TargetAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getTargetAmountFetch () {
    return this.TargetAmountFetch;
  }
  /** Set the SortOrder for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTargetAmountSortOrder (Integer value) {
    this.TargetAmountSort = value;
  }
  /** Retrieve SortOrder for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTargetAmountSortOrder () {
    return this.TargetAmountSort;
  }
  /** Set the sort direction for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTargetAmountSortDirection (boolean ascending) {
    this.TargetAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTargetAmountSortDirection () {
    return this.TargetAmountSortAscending;
  }
  /** Set the field level filters for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTargetAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TargetAmount = value;
  }
  /** Retrieve filter for field: TargetAmount (HISTORIC_CONTRIBUTION.target_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTargetAmountFilter () {
    return this.TargetAmount;
  }

  /**
   * Retrieves the TargetAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TargetAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetAmountFilter field
   */
  public String[] getTargetAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTargetAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TargetAmountFilter filter value from a formatted string
   *
   * @param _value the TargetAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TargetAmountFilter filter field
   */
  public void setTargetAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTargetAmountFilterFromFormattedString");
    try {
      this.setTargetAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetAmountFilterFromFormattedString");
  }

  /**
   * Sets the TargetAmountFilter filter value from a formatted string
   *
   * @param _value the TargetAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TargetAmountFilter filter field
   */
  public void setTargetAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTargetAmountFilterFromFormattedCurrencyString");
    try {
      this.setTargetAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TargetAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TargetAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetAmountFilter field
   */

  public String[] getTargetAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTargetAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (HISTORIC_CONTRIBUTION.currency_code)
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

  /** Set the field level Fetch value for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * @param fetch whether to fetch this field or not
   */
  public void setEffectiveDateFetch (boolean fetch) {
    this.EffectiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getEffectiveDateFetch () {
    return this.EffectiveDateFetch;
  }
  /** Set the SortOrder for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEffectiveDateSortOrder (Integer value) {
    this.EffectiveDateSort = value;
  }
  /** Retrieve SortOrder for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEffectiveDateSortOrder () {
    return this.EffectiveDateSort;
  }
  /** Set the sort direction for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEffectiveDateSortDirection (boolean ascending) {
    this.EffectiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEffectiveDateSortDirection () {
    return this.EffectiveDateSortAscending;
  }
  /** Set the field level filters for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEffectiveDateFilter (DateFilter[] value) throws ServiceException {
    this.EffectiveDate = value;
  }
  /** Retrieve filter for field: EffectiveDate (HISTORIC_CONTRIBUTION.effective_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEffectiveDateFilter () {
    return this.EffectiveDate;
  }

  /**
   * Retrieves the EffectiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDateFilter field
   */
  public String[] getEffectiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEffectiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDateFilter filter value from a formatted string
   *
   * @param _value the EffectiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EffectiveDateFilter filter field
   */
  public void setEffectiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFilterFromFormattedString");
    try {
      this.setEffectiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the EffectiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDateFilter field
   */
  public String[] getEffectiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEffectiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDateFilter filter value from a formatted string
   *
   * @param _value the EffectiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EffectiveDateFilter filter field
   */
  public void setEffectiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
    try {
      this.setEffectiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @param fetch whether to fetch this field or not
   */
  public void setProcessNameFetch (boolean fetch) {
    this.ProcessNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getProcessNameFetch () {
    return this.ProcessNameFetch;
  }
  /** Set the SortOrder for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProcessNameSortOrder (Integer value) {
    this.ProcessNameSort = value;
  }
  /** Retrieve SortOrder for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProcessNameSortOrder () {
    return this.ProcessNameSort;
  }
  /** Set the sort direction for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProcessNameSortDirection (boolean ascending) {
    this.ProcessNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProcessNameSortDirection () {
    return this.ProcessNameSortAscending;
  }
  /** Set the case insensitive for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setProcessNameCaseInsensitive (boolean ascending) {
    this.ProcessNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getProcessNameCaseInsensitive () {
    return this.ProcessNameCaseInsensitive;
  }
  /** Set the field level filters for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProcessNameFilter (StringFilter[] value) throws ServiceException {
    this.ProcessName = value;
  }
  /** Retrieve filter for field: ProcessName (HISTORIC_CONTRIBUTION.process_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getProcessNameFilter () {
    return this.ProcessName;
  }

  /**
   * Retrieves the ProcessNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProcessNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessNameFilter field
   */
  public String[] getProcessNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProcessNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProcessNameFilter filter value from a formatted string
   *
   * @param _value the ProcessNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProcessNameFilter filter field
   */
  public void setProcessNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProcessNameFilterFromFormattedString");
    try {
      this.setProcessNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProcessNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * @param fetch whether to fetch this field or not
   */
  public void setEvaluatedFetch (boolean fetch) {
    this.EvaluatedFetch = fetch;
  }
  /** Retrieve Fetch value for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * @return boolean the Fetch value for this field
   */
  public boolean getEvaluatedFetch () {
    return this.EvaluatedFetch;
  }
  /** Set the SortOrder for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEvaluatedSortOrder (Integer value) {
    this.EvaluatedSort = value;
  }
  /** Retrieve SortOrder for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEvaluatedSortOrder () {
    return this.EvaluatedSort;
  }
  /** Set the sort direction for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEvaluatedSortDirection (boolean ascending) {
    this.EvaluatedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEvaluatedSortDirection () {
    return this.EvaluatedSortAscending;
  }
  /** Set the field level filters for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEvaluatedFilter (BooleanFilter[] value) throws ServiceException {
    this.Evaluated = value;
  }
  /** Retrieve filter for field: Evaluated (HISTORIC_CONTRIBUTION.evaluated)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getEvaluatedFilter () {
    return this.Evaluated;
  }

  /**
   * Retrieves the EvaluatedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EvaluatedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EvaluatedFilter field
   */
  public String[] getEvaluatedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEvaluatedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEvaluatedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEvaluatedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EvaluatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEvaluatedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EvaluatedFilter filter value from a formatted string
   *
   * @param _value the EvaluatedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EvaluatedFilter filter field
   */
  public void setEvaluatedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEvaluatedFilterFromFormattedString");
    try {
      this.setEvaluatedFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EvaluatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEvaluatedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEvaluatedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * @param fetch whether to fetch this field or not
   */
  public void setEvaluatedDateFetch (boolean fetch) {
    this.EvaluatedDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getEvaluatedDateFetch () {
    return this.EvaluatedDateFetch;
  }
  /** Set the SortOrder for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEvaluatedDateSortOrder (Integer value) {
    this.EvaluatedDateSort = value;
  }
  /** Retrieve SortOrder for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEvaluatedDateSortOrder () {
    return this.EvaluatedDateSort;
  }
  /** Set the sort direction for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEvaluatedDateSortDirection (boolean ascending) {
    this.EvaluatedDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEvaluatedDateSortDirection () {
    return this.EvaluatedDateSortAscending;
  }
  /** Set the field level filters for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEvaluatedDateFilter (DateFilter[] value) throws ServiceException {
    this.EvaluatedDate = value;
  }
  /** Retrieve filter for field: EvaluatedDate (HISTORIC_CONTRIBUTION.evaluated_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEvaluatedDateFilter () {
    return this.EvaluatedDate;
  }

  /**
   * Retrieves the EvaluatedDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EvaluatedDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EvaluatedDateFilter field
   */
  public String[] getEvaluatedDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEvaluatedDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEvaluatedDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEvaluatedDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EvaluatedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEvaluatedDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EvaluatedDateFilter filter value from a formatted string
   *
   * @param _value the EvaluatedDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EvaluatedDateFilter filter field
   */
  public void setEvaluatedDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEvaluatedDateFilterFromFormattedString");
    try {
      this.setEvaluatedDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EvaluatedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEvaluatedDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEvaluatedDateFilterFromFormattedString");
  }

  /**
   * Retrieves the EvaluatedDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EvaluatedDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EvaluatedDateFilter field
   */
  public String[] getEvaluatedDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEvaluatedDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEvaluatedDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEvaluatedDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EvaluatedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEvaluatedDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EvaluatedDateFilter filter value from a formatted string
   *
   * @param _value the EvaluatedDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EvaluatedDateFilter filter field
   */
  public void setEvaluatedDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEvaluatedDateFilterFromFormattedDateTimeString");
    try {
      this.setEvaluatedDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EvaluatedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEvaluatedDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEvaluatedDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (HISTORIC_CONTRIBUTION.chg_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDtFilter () {
    return this.ChgDt;
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (HISTORIC_CONTRIBUTION.chg_who)
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

  public String toString() {
    return HistoricalContributionObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HistoricalContributionObjectHelper.toMap(this, null);
  }
}
