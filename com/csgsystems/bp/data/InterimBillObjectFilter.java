/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InterimBillObjectFilter.java
 * Definition File: Customer/InterimBill.xml
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
public class InterimBillObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public InterimBillObjectKeyFilter Key = null;
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
  /** raw field */
  public    StringFilter[] HotReqStatusQueue  = null;
  protected boolean HotReqStatusQueueFetch = false;
  protected boolean HotReqStatusQueueSortAscending = true;
  protected boolean HotReqStatusQueueCaseInsensitive = false;
  protected Integer HotReqStatusQueueSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqId  = null;
  protected boolean HotReqIdFetch = false;
  protected boolean HotReqIdSortAscending = true;
  protected Integer HotReqIdSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqReturnCustom  = null;
  protected boolean HotReqReturnCustomFetch = false;
  protected boolean HotReqReturnCustomSortAscending = true;
  protected Integer HotReqReturnCustomSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqReturnStatus  = null;
  protected boolean HotReqReturnStatusFetch = false;
  protected boolean HotReqReturnStatusSortAscending = true;
  protected Integer HotReqReturnStatusSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqBillRefNo  = null;
  protected boolean HotReqBillRefNoFetch = false;
  protected boolean HotReqBillRefNoSortAscending = true;
  protected Integer HotReqBillRefNoSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqBillRefResets  = null;
  protected boolean HotReqBillRefResetsFetch = false;
  protected boolean HotReqBillRefResetsSortAscending = true;
  protected Integer HotReqBillRefResetsSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqPollTimeout  = null;
  protected boolean HotReqPollTimeoutFetch = false;
  protected boolean HotReqPollTimeoutSortAscending = true;
  protected Integer HotReqPollTimeoutSort = null;
  /** raw field for: CMF_INTERIM_BILLS.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CMF_INTERIM_BILLS.interim_bill_date) */
  public    DateFilter[] InterimBillDate  = null;
  protected boolean InterimBillDateFetch = false;
  protected boolean InterimBillDateSortAscending = true;
  protected Integer InterimBillDateSort = null;
  /** raw field for: CMF_INTERIM_BILLS.include_nrc) */
  public    BooleanFilter[] IncludeNrc  = null;
  protected boolean IncludeNrcFetch = false;
  protected boolean IncludeNrcSortAscending = true;
  protected Integer IncludeNrcSort = null;
  /** raw field for: CMF_INTERIM_BILLS.include_rc) */
  public    BooleanFilter[] IncludeRc  = null;
  protected boolean IncludeRcFetch = false;
  protected boolean IncludeRcSortAscending = true;
  protected Integer IncludeRcSort = null;
  /** raw field for: CMF_INTERIM_BILLS.include_adj) */
  public    BooleanFilter[] IncludeAdj  = null;
  protected boolean IncludeAdjFetch = false;
  protected boolean IncludeAdjSortAscending = true;
  protected Integer IncludeAdjSort = null;
  /** raw field for: CMF_INTERIM_BILLS.include_usage) */
  public    BooleanFilter[] IncludeUsage  = null;
  protected boolean IncludeUsageFetch = false;
  protected boolean IncludeUsageSortAscending = true;
  protected Integer IncludeUsageSort = null;
  /** raw field for: CMF_INTERIM_BILLS.include_bmf) */
  public    BooleanFilter[] IncludePayment  = null;
  protected boolean IncludePaymentFetch = false;
  protected boolean IncludePaymentSortAscending = true;
  protected Integer IncludePaymentSort = null;
  /** raw field for: CMF_INTERIM_BILLS.warm_bill_flag) */
  public    BooleanFilter[] WarmBillFlag  = null;
  protected boolean WarmBillFlagFetch = false;
  protected boolean WarmBillFlagSortAscending = true;
  protected Integer WarmBillFlagSort = null;
  /** raw field for: CMF_INTERIM_BILLS.proforma_bill_flag) */
  public    BooleanFilter[] ProformaBillFlag  = null;
  protected boolean ProformaBillFlagFetch = false;
  protected boolean ProformaBillFlagSortAscending = true;
  protected Integer ProformaBillFlagSort = null;
  /** raw field for: CMF_INTERIM_BILLS.format_status) */
  public    IntegerFilter[] FormatStatus  = null;
  protected boolean FormatStatusFetch = false;
  protected boolean FormatStatusSortAscending = true;
  protected Integer FormatStatusSort = null;
  /** raw field for: CMF_INTERIM_BILLS.bill_order_number) */
  public    StringFilter[] BillOrderNumber  = null;
  protected boolean BillOrderNumberFetch = false;
  protected boolean BillOrderNumberSortAscending = true;
  protected boolean BillOrderNumberCaseInsensitive = false;
  protected Integer BillOrderNumberSort = null;
  /** raw field for: CMF_INTERIM_BILLS.override_dates) */
  public    BooleanFilter[] OverrideDates  = null;
  protected boolean OverrideDatesFetch = false;
  protected boolean OverrideDatesSortAscending = true;
  protected Integer OverrideDatesSort = null;
  /** raw field for: CMF_INTERIM_BILLS.statement_date) */
  public    DateFilter[] StatementDate  = null;
  protected boolean StatementDateFetch = false;
  protected boolean StatementDateSortAscending = true;
  protected Integer StatementDateSort = null;
  /** raw field for: CMF_INTERIM_BILLS.payment_due_date) */
  public    DateFilter[] PaymentDueDate  = null;
  protected boolean PaymentDueDateFetch = false;
  protected boolean PaymentDueDateSortAscending = true;
  protected Integer PaymentDueDateSort = null;
  private String _objName = "InterimBillObjectFilter";
  /** default constructor */
  public InterimBillObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public InterimBillObjectFilter (InterimBillObjectFilter other)
  {
    if (other == null) return;
    this.Key = new InterimBillObjectKeyFilter (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.HotReqStatusQueue = other.HotReqStatusQueue;
    this.HotReqStatusQueueFetch = other.HotReqStatusQueueFetch;
    this.HotReqStatusQueueSort = other.HotReqStatusQueueSort;
    this.HotReqStatusQueueCaseInsensitive = other.HotReqStatusQueueCaseInsensitive;
    this.HotReqStatusQueueSortAscending = other.HotReqStatusQueueSortAscending;
    this.HotReqId = other.HotReqId;
    this.HotReqIdFetch = other.HotReqIdFetch;
    this.HotReqIdSort = other.HotReqIdSort;
    this.HotReqIdSortAscending = other.HotReqIdSortAscending;
    this.HotReqReturnCustom = other.HotReqReturnCustom;
    this.HotReqReturnCustomFetch = other.HotReqReturnCustomFetch;
    this.HotReqReturnCustomSort = other.HotReqReturnCustomSort;
    this.HotReqReturnCustomSortAscending = other.HotReqReturnCustomSortAscending;
    this.HotReqReturnStatus = other.HotReqReturnStatus;
    this.HotReqReturnStatusFetch = other.HotReqReturnStatusFetch;
    this.HotReqReturnStatusSort = other.HotReqReturnStatusSort;
    this.HotReqReturnStatusSortAscending = other.HotReqReturnStatusSortAscending;
    this.HotReqBillRefNo = other.HotReqBillRefNo;
    this.HotReqBillRefNoFetch = other.HotReqBillRefNoFetch;
    this.HotReqBillRefNoSort = other.HotReqBillRefNoSort;
    this.HotReqBillRefNoSortAscending = other.HotReqBillRefNoSortAscending;
    this.HotReqBillRefResets = other.HotReqBillRefResets;
    this.HotReqBillRefResetsFetch = other.HotReqBillRefResetsFetch;
    this.HotReqBillRefResetsSort = other.HotReqBillRefResetsSort;
    this.HotReqBillRefResetsSortAscending = other.HotReqBillRefResetsSortAscending;
    this.HotReqPollTimeout = other.HotReqPollTimeout;
    this.HotReqPollTimeoutFetch = other.HotReqPollTimeoutFetch;
    this.HotReqPollTimeoutSort = other.HotReqPollTimeoutSort;
    this.HotReqPollTimeoutSortAscending = other.HotReqPollTimeoutSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.InterimBillDate = other.InterimBillDate;
    this.InterimBillDateFetch = other.InterimBillDateFetch;
    this.InterimBillDateSort = other.InterimBillDateSort;
    this.InterimBillDateSortAscending = other.InterimBillDateSortAscending;
    this.IncludeNrc = other.IncludeNrc;
    this.IncludeNrcFetch = other.IncludeNrcFetch;
    this.IncludeNrcSort = other.IncludeNrcSort;
    this.IncludeNrcSortAscending = other.IncludeNrcSortAscending;
    this.IncludeRc = other.IncludeRc;
    this.IncludeRcFetch = other.IncludeRcFetch;
    this.IncludeRcSort = other.IncludeRcSort;
    this.IncludeRcSortAscending = other.IncludeRcSortAscending;
    this.IncludeAdj = other.IncludeAdj;
    this.IncludeAdjFetch = other.IncludeAdjFetch;
    this.IncludeAdjSort = other.IncludeAdjSort;
    this.IncludeAdjSortAscending = other.IncludeAdjSortAscending;
    this.IncludeUsage = other.IncludeUsage;
    this.IncludeUsageFetch = other.IncludeUsageFetch;
    this.IncludeUsageSort = other.IncludeUsageSort;
    this.IncludeUsageSortAscending = other.IncludeUsageSortAscending;
    this.IncludePayment = other.IncludePayment;
    this.IncludePaymentFetch = other.IncludePaymentFetch;
    this.IncludePaymentSort = other.IncludePaymentSort;
    this.IncludePaymentSortAscending = other.IncludePaymentSortAscending;
    this.WarmBillFlag = other.WarmBillFlag;
    this.WarmBillFlagFetch = other.WarmBillFlagFetch;
    this.WarmBillFlagSort = other.WarmBillFlagSort;
    this.WarmBillFlagSortAscending = other.WarmBillFlagSortAscending;
    this.ProformaBillFlag = other.ProformaBillFlag;
    this.ProformaBillFlagFetch = other.ProformaBillFlagFetch;
    this.ProformaBillFlagSort = other.ProformaBillFlagSort;
    this.ProformaBillFlagSortAscending = other.ProformaBillFlagSortAscending;
    this.FormatStatus = other.FormatStatus;
    this.FormatStatusFetch = other.FormatStatusFetch;
    this.FormatStatusSort = other.FormatStatusSort;
    this.FormatStatusSortAscending = other.FormatStatusSortAscending;
    this.BillOrderNumber = other.BillOrderNumber;
    this.BillOrderNumberFetch = other.BillOrderNumberFetch;
    this.BillOrderNumberSort = other.BillOrderNumberSort;
    this.BillOrderNumberCaseInsensitive = other.BillOrderNumberCaseInsensitive;
    this.BillOrderNumberSortAscending = other.BillOrderNumberSortAscending;
    this.OverrideDates = other.OverrideDates;
    this.OverrideDatesFetch = other.OverrideDatesFetch;
    this.OverrideDatesSort = other.OverrideDatesSort;
    this.OverrideDatesSortAscending = other.OverrideDatesSortAscending;
    this.StatementDate = other.StatementDate;
    this.StatementDateFetch = other.StatementDateFetch;
    this.StatementDateSort = other.StatementDateSort;
    this.StatementDateSortAscending = other.StatementDateSortAscending;
    this.PaymentDueDate = other.PaymentDueDate;
    this.PaymentDueDateFetch = other.PaymentDueDateFetch;
    this.PaymentDueDateSort = other.PaymentDueDateSort;
    this.PaymentDueDateSortAscending = other.PaymentDueDateSortAscending;  }
  /** get the filter for this object's key
   * @return InterimBillObjectKeyFilter
   */
  public InterimBillObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (InterimBillObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InterimBillObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
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


  /** Set the field level Fetch value for field: HotReqStatusQueue
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqStatusQueueFetch (boolean fetch)
  {
    this.HotReqStatusQueueFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqStatusQueue
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqStatusQueueFetch ()
  {
    return this.HotReqStatusQueueFetch;
  }
  /** Set the SortOrder for field: HotReqStatusQueue
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqStatusQueueSortOrder (Integer value)
  {
    this.HotReqStatusQueueSort = value;
  }
  /** Retrieve SortOrder for field: HotReqStatusQueue
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqStatusQueueSortOrder ()
  {
    return this.HotReqStatusQueueSort;
  }
  /** Set the sort direction for field: HotReqStatusQueue
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqStatusQueueSortDirection (boolean ascending)
  {
    this.HotReqStatusQueueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqStatusQueue
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqStatusQueueSortDirection ()
  {
    return this.HotReqStatusQueueSortAscending;
  }
  /** Set the case insensitive for field: HotReqStatusQueue
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setHotReqStatusQueueCaseInsensitive (boolean ascending)
  {
    this.HotReqStatusQueueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: HotReqStatusQueue
   * @return boolean whether the field is case insensitive
   */
  public boolean getHotReqStatusQueueCaseInsensitive ()
  {
    return this.HotReqStatusQueueCaseInsensitive;
  }
  /** Set the field level filters for field: HotReqStatusQueue
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqStatusQueueFilter (StringFilter[] value) throws ServiceException
  {
    this.HotReqStatusQueue = value;
  }
  /** Retrieve filter for field: HotReqStatusQueue
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getHotReqStatusQueueFilter ()
  {
    return this.HotReqStatusQueue;
  }
  /** Set the field level Fetch value for field: HotReqId
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqIdFetch (boolean fetch)
  {
    this.HotReqIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqId
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqIdFetch ()
  {
    return this.HotReqIdFetch;
  }
  /** Set the SortOrder for field: HotReqId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqIdSortOrder (Integer value)
  {
    this.HotReqIdSort = value;
  }
  /** Retrieve SortOrder for field: HotReqId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqIdSortOrder ()
  {
    return this.HotReqIdSort;
  }
  /** Set the sort direction for field: HotReqId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqIdSortDirection (boolean ascending)
  {
    this.HotReqIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqIdSortDirection ()
  {
    return this.HotReqIdSortAscending;
  }
  /** Set the field level filters for field: HotReqId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqId = value;
  }
  /** Retrieve filter for field: HotReqId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqIdFilter ()
  {
    return this.HotReqId;
  }
  /** Set the field level Fetch value for field: HotReqReturnCustom
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqReturnCustomFetch (boolean fetch)
  {
    this.HotReqReturnCustomFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqReturnCustom
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqReturnCustomFetch ()
  {
    return this.HotReqReturnCustomFetch;
  }
  /** Set the SortOrder for field: HotReqReturnCustom
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqReturnCustomSortOrder (Integer value)
  {
    this.HotReqReturnCustomSort = value;
  }
  /** Retrieve SortOrder for field: HotReqReturnCustom
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqReturnCustomSortOrder ()
  {
    return this.HotReqReturnCustomSort;
  }
  /** Set the sort direction for field: HotReqReturnCustom
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqReturnCustomSortDirection (boolean ascending)
  {
    this.HotReqReturnCustomSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqReturnCustom
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqReturnCustomSortDirection ()
  {
    return this.HotReqReturnCustomSortAscending;
  }
  /** Set the field level filters for field: HotReqReturnCustom
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqReturnCustomFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqReturnCustom = value;
  }
  /** Retrieve filter for field: HotReqReturnCustom
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqReturnCustomFilter ()
  {
    return this.HotReqReturnCustom;
  }
  /** Set the field level Fetch value for field: HotReqReturnStatus
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqReturnStatusFetch (boolean fetch)
  {
    this.HotReqReturnStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqReturnStatus
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqReturnStatusFetch ()
  {
    return this.HotReqReturnStatusFetch;
  }
  /** Set the SortOrder for field: HotReqReturnStatus
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqReturnStatusSortOrder (Integer value)
  {
    this.HotReqReturnStatusSort = value;
  }
  /** Retrieve SortOrder for field: HotReqReturnStatus
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqReturnStatusSortOrder ()
  {
    return this.HotReqReturnStatusSort;
  }
  /** Set the sort direction for field: HotReqReturnStatus
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqReturnStatusSortDirection (boolean ascending)
  {
    this.HotReqReturnStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqReturnStatus
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqReturnStatusSortDirection ()
  {
    return this.HotReqReturnStatusSortAscending;
  }
  /** Set the field level filters for field: HotReqReturnStatus
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqReturnStatusFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqReturnStatus = value;
  }
  /** Retrieve filter for field: HotReqReturnStatus
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqReturnStatusFilter ()
  {
    return this.HotReqReturnStatus;
  }
  /** Set the field level Fetch value for field: HotReqBillRefNo
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqBillRefNoFetch (boolean fetch)
  {
    this.HotReqBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqBillRefNo
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqBillRefNoFetch ()
  {
    return this.HotReqBillRefNoFetch;
  }
  /** Set the SortOrder for field: HotReqBillRefNo
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqBillRefNoSortOrder (Integer value)
  {
    this.HotReqBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: HotReqBillRefNo
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqBillRefNoSortOrder ()
  {
    return this.HotReqBillRefNoSort;
  }
  /** Set the sort direction for field: HotReqBillRefNo
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqBillRefNoSortDirection (boolean ascending)
  {
    this.HotReqBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqBillRefNo
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqBillRefNoSortDirection ()
  {
    return this.HotReqBillRefNoSortAscending;
  }
  /** Set the field level filters for field: HotReqBillRefNo
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqBillRefNo = value;
  }
  /** Retrieve filter for field: HotReqBillRefNo
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqBillRefNoFilter ()
  {
    return this.HotReqBillRefNo;
  }
  /** Set the field level Fetch value for field: HotReqBillRefResets
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqBillRefResetsFetch (boolean fetch)
  {
    this.HotReqBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqBillRefResets
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqBillRefResetsFetch ()
  {
    return this.HotReqBillRefResetsFetch;
  }
  /** Set the SortOrder for field: HotReqBillRefResets
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqBillRefResetsSortOrder (Integer value)
  {
    this.HotReqBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: HotReqBillRefResets
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqBillRefResetsSortOrder ()
  {
    return this.HotReqBillRefResetsSort;
  }
  /** Set the sort direction for field: HotReqBillRefResets
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqBillRefResetsSortDirection (boolean ascending)
  {
    this.HotReqBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqBillRefResets
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqBillRefResetsSortDirection ()
  {
    return this.HotReqBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: HotReqBillRefResets
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqBillRefResets = value;
  }
  /** Retrieve filter for field: HotReqBillRefResets
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqBillRefResetsFilter ()
  {
    return this.HotReqBillRefResets;
  }
  /** Set the field level Fetch value for field: HotReqPollTimeout
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqPollTimeoutFetch (boolean fetch)
  {
    this.HotReqPollTimeoutFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqPollTimeout
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqPollTimeoutFetch ()
  {
    return this.HotReqPollTimeoutFetch;
  }
  /** Set the SortOrder for field: HotReqPollTimeout
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqPollTimeoutSortOrder (Integer value)
  {
    this.HotReqPollTimeoutSort = value;
  }
  /** Retrieve SortOrder for field: HotReqPollTimeout
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqPollTimeoutSortOrder ()
  {
    return this.HotReqPollTimeoutSort;
  }
  /** Set the sort direction for field: HotReqPollTimeout
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqPollTimeoutSortDirection (boolean ascending)
  {
    this.HotReqPollTimeoutSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqPollTimeout
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqPollTimeoutSortDirection ()
  {
    return this.HotReqPollTimeoutSortAscending;
  }
  /** Set the field level filters for field: HotReqPollTimeout
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqPollTimeoutFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqPollTimeout = value;
  }
  /** Retrieve filter for field: HotReqPollTimeout
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqPollTimeoutFilter ()
  {
    return this.HotReqPollTimeout;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
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

  /** Set the field level Fetch value for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInterimBillDateFetch (boolean fetch) {
    this.InterimBillDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInterimBillDateFetch () {
    return this.InterimBillDateFetch;
  }
  /** Set the SortOrder for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInterimBillDateSortOrder (Integer value) {
    this.InterimBillDateSort = value;
  }
  /** Retrieve SortOrder for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInterimBillDateSortOrder () {
    return this.InterimBillDateSort;
  }
  /** Set the sort direction for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInterimBillDateSortDirection (boolean ascending) {
    this.InterimBillDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInterimBillDateSortDirection () {
    return this.InterimBillDateSortAscending;
  }
  /** Set the field level filters for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInterimBillDateFilter (DateFilter[] value) throws ServiceException {
    this.InterimBillDate = value;
  }
  /** Retrieve filter for field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInterimBillDateFilter () {
    return this.InterimBillDate;
  }

  /**
   * Retrieves the InterimBillDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InterimBillDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterimBillDateFilter field
   */
  public String[] getInterimBillDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInterimBillDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterimBillDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InterimBillDateFilter filter value from a formatted string
   *
   * @param _value the InterimBillDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InterimBillDateFilter filter field
   */
  public void setInterimBillDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInterimBillDateFilterFromFormattedString");
    try {
      this.setInterimBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterimBillDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterimBillDateFilterFromFormattedString");
  }

  /**
   * Retrieves the InterimBillDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InterimBillDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterimBillDateFilter field
   */
  public String[] getInterimBillDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInterimBillDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterimBillDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InterimBillDateFilter filter value from a formatted string
   *
   * @param _value the InterimBillDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InterimBillDateFilter filter field
   */
  public void setInterimBillDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInterimBillDateFilterFromFormattedDateTimeString");
    try {
      this.setInterimBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterimBillDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterimBillDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeNrcFetch (boolean fetch) {
    this.IncludeNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeNrcFetch () {
    return this.IncludeNrcFetch;
  }
  /** Set the SortOrder for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeNrcSortOrder (Integer value) {
    this.IncludeNrcSort = value;
  }
  /** Retrieve SortOrder for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeNrcSortOrder () {
    return this.IncludeNrcSort;
  }
  /** Set the sort direction for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeNrcSortDirection (boolean ascending) {
    this.IncludeNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeNrcSortDirection () {
    return this.IncludeNrcSortAscending;
  }
  /** Set the field level filters for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeNrcFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeNrc = value;
  }
  /** Retrieve filter for field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeNrcFilter () {
    return this.IncludeNrc;
  }

  /**
   * Retrieves the IncludeNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeNrcFilter field
   */
  public String[] getIncludeNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeNrcFilter filter value from a formatted string
   *
   * @param _value the IncludeNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeNrcFilter filter field
   */
  public void setIncludeNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeNrcFilterFromFormattedString");
    try {
      this.setIncludeNrcFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeRcFetch (boolean fetch) {
    this.IncludeRcFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeRcFetch () {
    return this.IncludeRcFetch;
  }
  /** Set the SortOrder for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeRcSortOrder (Integer value) {
    this.IncludeRcSort = value;
  }
  /** Retrieve SortOrder for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeRcSortOrder () {
    return this.IncludeRcSort;
  }
  /** Set the sort direction for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeRcSortDirection (boolean ascending) {
    this.IncludeRcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeRcSortDirection () {
    return this.IncludeRcSortAscending;
  }
  /** Set the field level filters for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeRcFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeRc = value;
  }
  /** Retrieve filter for field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeRcFilter () {
    return this.IncludeRc;
  }

  /**
   * Retrieves the IncludeRcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeRcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeRcFilter field
   */
  public String[] getIncludeRcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeRcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeRcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeRcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeRcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeRcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeRcFilter filter value from a formatted string
   *
   * @param _value the IncludeRcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeRcFilter filter field
   */
  public void setIncludeRcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeRcFilterFromFormattedString");
    try {
      this.setIncludeRcFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeRcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeRcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeRcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeAdjFetch (boolean fetch) {
    this.IncludeAdjFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeAdjFetch () {
    return this.IncludeAdjFetch;
  }
  /** Set the SortOrder for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeAdjSortOrder (Integer value) {
    this.IncludeAdjSort = value;
  }
  /** Retrieve SortOrder for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeAdjSortOrder () {
    return this.IncludeAdjSort;
  }
  /** Set the sort direction for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeAdjSortDirection (boolean ascending) {
    this.IncludeAdjSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeAdjSortDirection () {
    return this.IncludeAdjSortAscending;
  }
  /** Set the field level filters for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeAdjFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeAdj = value;
  }
  /** Retrieve filter for field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeAdjFilter () {
    return this.IncludeAdj;
  }

  /**
   * Retrieves the IncludeAdjFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeAdjFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeAdjFilter field
   */
  public String[] getIncludeAdjFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeAdjFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeAdjFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeAdjFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeAdjFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeAdjFilter filter value from a formatted string
   *
   * @param _value the IncludeAdjFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeAdjFilter filter field
   */
  public void setIncludeAdjFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeAdjFilterFromFormattedString");
    try {
      this.setIncludeAdjFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeAdjFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeAdjFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeUsageFetch (boolean fetch) {
    this.IncludeUsageFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeUsageFetch () {
    return this.IncludeUsageFetch;
  }
  /** Set the SortOrder for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeUsageSortOrder (Integer value) {
    this.IncludeUsageSort = value;
  }
  /** Retrieve SortOrder for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeUsageSortOrder () {
    return this.IncludeUsageSort;
  }
  /** Set the sort direction for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeUsageSortDirection (boolean ascending) {
    this.IncludeUsageSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeUsageSortDirection () {
    return this.IncludeUsageSortAscending;
  }
  /** Set the field level filters for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeUsageFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeUsage = value;
  }
  /** Retrieve filter for field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeUsageFilter () {
    return this.IncludeUsage;
  }

  /**
   * Retrieves the IncludeUsageFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeUsageFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeUsageFilter field
   */
  public String[] getIncludeUsageFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeUsageFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeUsageFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeUsageFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeUsageFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeUsageFilter filter value from a formatted string
   *
   * @param _value the IncludeUsageFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeUsageFilter filter field
   */
  public void setIncludeUsageFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeUsageFilterFromFormattedString");
    try {
      this.setIncludeUsageFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeUsageFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeUsageFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludePaymentFetch (boolean fetch) {
    this.IncludePaymentFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludePaymentFetch () {
    return this.IncludePaymentFetch;
  }
  /** Set the SortOrder for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludePaymentSortOrder (Integer value) {
    this.IncludePaymentSort = value;
  }
  /** Retrieve SortOrder for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludePaymentSortOrder () {
    return this.IncludePaymentSort;
  }
  /** Set the sort direction for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludePaymentSortDirection (boolean ascending) {
    this.IncludePaymentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludePaymentSortDirection () {
    return this.IncludePaymentSortAscending;
  }
  /** Set the field level filters for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludePaymentFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludePayment = value;
  }
  /** Retrieve filter for field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludePaymentFilter () {
    return this.IncludePayment;
  }

  /**
   * Retrieves the IncludePaymentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludePaymentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludePaymentFilter field
   */
  public String[] getIncludePaymentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludePaymentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludePaymentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludePaymentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludePaymentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludePaymentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludePaymentFilter filter value from a formatted string
   *
   * @param _value the IncludePaymentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludePaymentFilter filter field
   */
  public void setIncludePaymentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludePaymentFilterFromFormattedString");
    try {
      this.setIncludePaymentFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludePaymentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludePaymentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludePaymentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setWarmBillFlagFetch (boolean fetch) {
    this.WarmBillFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getWarmBillFlagFetch () {
    return this.WarmBillFlagFetch;
  }
  /** Set the SortOrder for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setWarmBillFlagSortOrder (Integer value) {
    this.WarmBillFlagSort = value;
  }
  /** Retrieve SortOrder for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getWarmBillFlagSortOrder () {
    return this.WarmBillFlagSort;
  }
  /** Set the sort direction for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setWarmBillFlagSortDirection (boolean ascending) {
    this.WarmBillFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getWarmBillFlagSortDirection () {
    return this.WarmBillFlagSortAscending;
  }
  /** Set the field level filters for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setWarmBillFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.WarmBillFlag = value;
  }
  /** Retrieve filter for field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getWarmBillFlagFilter () {
    return this.WarmBillFlag;
  }

  /**
   * Retrieves the WarmBillFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The WarmBillFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WarmBillFlagFilter field
   */
  public String[] getWarmBillFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWarmBillFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getWarmBillFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWarmBillFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WarmBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getWarmBillFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the WarmBillFlagFilter filter value from a formatted string
   *
   * @param _value the WarmBillFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the WarmBillFlagFilter filter field
   */
  public void setWarmBillFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setWarmBillFlagFilterFromFormattedString");
    try {
      this.setWarmBillFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WarmBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setWarmBillFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWarmBillFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setProformaBillFlagFetch (boolean fetch) {
    this.ProformaBillFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getProformaBillFlagFetch () {
    return this.ProformaBillFlagFetch;
  }
  /** Set the SortOrder for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProformaBillFlagSortOrder (Integer value) {
    this.ProformaBillFlagSort = value;
  }
  /** Retrieve SortOrder for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProformaBillFlagSortOrder () {
    return this.ProformaBillFlagSort;
  }
  /** Set the sort direction for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProformaBillFlagSortDirection (boolean ascending) {
    this.ProformaBillFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProformaBillFlagSortDirection () {
    return this.ProformaBillFlagSortAscending;
  }
  /** Set the field level filters for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProformaBillFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ProformaBillFlag = value;
  }
  /** Retrieve filter for field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProformaBillFlagFilter () {
    return this.ProformaBillFlag;
  }

  /**
   * Retrieves the ProformaBillFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProformaBillFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProformaBillFlagFilter field
   */
  public String[] getProformaBillFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProformaBillFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProformaBillFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProformaBillFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProformaBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProformaBillFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProformaBillFlagFilter filter value from a formatted string
   *
   * @param _value the ProformaBillFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProformaBillFlagFilter filter field
   */
  public void setProformaBillFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProformaBillFlagFilterFromFormattedString");
    try {
      this.setProformaBillFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProformaBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProformaBillFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProformaBillFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @param fetch whether to fetch this field or not
   */
  public void setFormatStatusFetch (boolean fetch) {
    this.FormatStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getFormatStatusFetch () {
    return this.FormatStatusFetch;
  }
  /** Set the SortOrder for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFormatStatusSortOrder (Integer value) {
    this.FormatStatusSort = value;
  }
  /** Retrieve SortOrder for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFormatStatusSortOrder () {
    return this.FormatStatusSort;
  }
  /** Set the sort direction for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFormatStatusSortDirection (boolean ascending) {
    this.FormatStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFormatStatusSortDirection () {
    return this.FormatStatusSortAscending;
  }
  /** Set the field level filters for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFormatStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.FormatStatus = value;
  }
  /** Retrieve filter for field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFormatStatusFilter () {
    return this.FormatStatus;
  }

  /**
   * Retrieves the FormatStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FormatStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatStatusFilter field
   */
  public String[] getFormatStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFormatStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FormatStatusFilter filter value from a formatted string
   *
   * @param _value the FormatStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FormatStatusFilter filter field
   */
  public void setFormatStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFormatStatusFilterFromFormattedString");
    try {
      this.setFormatStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @param fetch whether to fetch this field or not
   */
  public void setBillOrderNumberFetch (boolean fetch) {
    this.BillOrderNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillOrderNumberFetch () {
    return this.BillOrderNumberFetch;
  }
  /** Set the SortOrder for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillOrderNumberSortOrder (Integer value) {
    this.BillOrderNumberSort = value;
  }
  /** Retrieve SortOrder for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillOrderNumberSortOrder () {
    return this.BillOrderNumberSort;
  }
  /** Set the sort direction for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillOrderNumberSortDirection (boolean ascending) {
    this.BillOrderNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillOrderNumberSortDirection () {
    return this.BillOrderNumberSortAscending;
  }
  /** Set the case insensitive for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillOrderNumberCaseInsensitive (boolean ascending) {
    this.BillOrderNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillOrderNumberCaseInsensitive () {
    return this.BillOrderNumberCaseInsensitive;
  }
  /** Set the field level filters for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillOrderNumberFilter (StringFilter[] value) throws ServiceException {
    this.BillOrderNumber = value;
  }
  /** Retrieve filter for field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillOrderNumberFilter () {
    return this.BillOrderNumber;
  }

  /**
   * Retrieves the BillOrderNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillOrderNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillOrderNumberFilter field
   */
  public String[] getBillOrderNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillOrderNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillOrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillOrderNumberFilter filter value from a formatted string
   *
   * @param _value the BillOrderNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillOrderNumberFilter filter field
   */
  public void setBillOrderNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
    try {
      this.setBillOrderNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillOrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideDatesFetch (boolean fetch) {
    this.OverrideDatesFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideDatesFetch () {
    return this.OverrideDatesFetch;
  }
  /** Set the SortOrder for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideDatesSortOrder (Integer value) {
    this.OverrideDatesSort = value;
  }
  /** Retrieve SortOrder for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideDatesSortOrder () {
    return this.OverrideDatesSort;
  }
  /** Set the sort direction for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideDatesSortDirection (boolean ascending) {
    this.OverrideDatesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideDatesSortDirection () {
    return this.OverrideDatesSortAscending;
  }
  /** Set the field level filters for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideDatesFilter (BooleanFilter[] value) throws ServiceException {
    this.OverrideDates = value;
  }
  /** Retrieve filter for field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getOverrideDatesFilter () {
    return this.OverrideDates;
  }

  /**
   * Retrieves the OverrideDatesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideDatesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideDatesFilter field
   */
  public String[] getOverrideDatesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDatesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideDatesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDatesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideDatesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideDatesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideDatesFilter filter value from a formatted string
   *
   * @param _value the OverrideDatesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideDatesFilter filter field
   */
  public void setOverrideDatesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideDatesFilterFromFormattedString");
    try {
      this.setOverrideDatesFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideDatesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideDatesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideDatesFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @param fetch whether to fetch this field or not
   */
  public void setStatementDateFetch (boolean fetch) {
    this.StatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementDateFetch () {
    return this.StatementDateFetch;
  }
  /** Set the SortOrder for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementDateSortOrder (Integer value) {
    this.StatementDateSort = value;
  }
  /** Retrieve SortOrder for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementDateSortOrder () {
    return this.StatementDateSort;
  }
  /** Set the sort direction for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementDateSortDirection (boolean ascending) {
    this.StatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementDateSortDirection () {
    return this.StatementDateSortAscending;
  }
  /** Set the field level filters for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementDateFilter (DateFilter[] value) throws ServiceException {
    this.StatementDate = value;
  }
  /** Retrieve filter for field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStatementDateFilter () {
    return this.StatementDate;
  }

  /**
   * Retrieves the StatementDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDateFilter field
   */
  public String[] getStatementDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDateFilter filter value from a formatted string
   *
   * @param _value the StatementDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementDateFilter filter field
   */
  public void setStatementDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFilterFromFormattedString");
    try {
      this.setStatementDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFilterFromFormattedString");
  }

  /**
   * Retrieves the StatementDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDateFilter field
   */
  public String[] getStatementDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDateFilter filter value from a formatted string
   *
   * @param _value the StatementDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementDateFilter filter field
   */
  public void setStatementDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
    try {
      this.setStatementDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentDueDateFetch (boolean fetch) {
    this.PaymentDueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentDueDateFetch () {
    return this.PaymentDueDateFetch;
  }
  /** Set the SortOrder for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentDueDateSortOrder (Integer value) {
    this.PaymentDueDateSort = value;
  }
  /** Retrieve SortOrder for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentDueDateSortOrder () {
    return this.PaymentDueDateSort;
  }
  /** Set the sort direction for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentDueDateSortDirection (boolean ascending) {
    this.PaymentDueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentDueDateSortDirection () {
    return this.PaymentDueDateSortAscending;
  }
  /** Set the field level filters for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentDueDateFilter (DateFilter[] value) throws ServiceException {
    this.PaymentDueDate = value;
  }
  /** Retrieve filter for field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPaymentDueDateFilter () {
    return this.PaymentDueDate;
  }

  /**
   * Retrieves the PaymentDueDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDateFilter field
   */
  public String[] getPaymentDueDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentDueDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDateFilter filter value from a formatted string
   *
   * @param _value the PaymentDueDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentDueDateFilter filter field
   */
  public void setPaymentDueDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFilterFromFormattedString");
    try {
      this.setPaymentDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PaymentDueDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDateFilter field
   */
  public String[] getPaymentDueDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentDueDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDateFilter filter value from a formatted string
   *
   * @param _value the PaymentDueDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentDueDateFilter filter field
   */
  public void setPaymentDueDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFilterFromFormattedDateTimeString");
    try {
      this.setPaymentDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return InterimBillObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return InterimBillObjectHelper.toMap(this, null);
  }
}
