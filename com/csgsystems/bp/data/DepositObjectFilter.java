/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DepositObjectFilter.java
 * Definition File: Customer/Deposit.xml
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
public class DepositObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public DepositObjectKeyFilter Key = null;
  /** raw field for: DEPOSIT.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: DEPOSIT.deposit_type) */
  public    IntegerFilter[] DepositType  = null;
  protected boolean DepositTypeFetch = false;
  protected boolean DepositTypeSortAscending = true;
  protected Integer DepositTypeSort = null;
  /** raw field for: DEPOSIT.date_received) */
  public    DateFilter[] DateReceived  = null;
  protected boolean DateReceivedFetch = false;
  protected boolean DateReceivedSortAscending = true;
  protected Integer DateReceivedSort = null;
  /** raw field for: DEPOSIT.date_returned) */
  public    DateFilter[] DateReturned  = null;
  protected boolean DateReturnedFetch = false;
  protected boolean DateReturnedSortAscending = true;
  protected Integer DateReturnedSort = null;
  /** raw field for: DEPOSIT.deposit_amount) */
  public    BigIntegerFilter[] DepositAmount  = null;
  protected boolean DepositAmountFetch = false;
  protected boolean DepositAmountSortAscending = true;
  protected Integer DepositAmountSort = null;
  /** raw field for: DEPOSIT.interest_amount) */
  public    BigIntegerFilter[] InterestAmount  = null;
  protected boolean InterestAmountFetch = false;
  protected boolean InterestAmountSortAscending = true;
  protected Integer InterestAmountSort = null;
  /** raw field for: DEPOSIT.income_tax_amount) */
  public    BigIntegerFilter[] IncomeTaxAmount  = null;
  protected boolean IncomeTaxAmountFetch = false;
  protected boolean IncomeTaxAmountSortAscending = true;
  protected Integer IncomeTaxAmountSort = null;
  /** raw field for: DEPOSIT.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: DEPOSIT.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: DEPOSIT.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: DEPOSIT.manual_ccauth_code) */
  public    StringFilter[] ManualCcauthCode  = null;
  protected boolean ManualCcauthCodeFetch = false;
  protected boolean ManualCcauthCodeSortAscending = true;
  protected boolean ManualCcauthCodeCaseInsensitive = false;
  protected Integer ManualCcauthCodeSort = null;
  /** raw field for: DEPOSIT.manual_ccauth_date) */
  public    StringFilter[] ManualCcauthDate  = null;
  protected boolean ManualCcauthDateFetch = false;
  protected boolean ManualCcauthDateSortAscending = true;
  protected boolean ManualCcauthDateCaseInsensitive = false;
  protected Integer ManualCcauthDateSort = null;
  /** raw field for: DEPOSIT.pay_method) */
  public    IntegerFilter[] PayMethod  = null;
  protected boolean PayMethodFetch = false;
  protected boolean PayMethodSortAscending = true;
  protected Integer PayMethodSort = null;
  /** raw field for: DEPOSIT.refund_type) */
  public    IntegerFilter[] RefundType  = null;
  protected boolean RefundTypeFetch = false;
  protected boolean RefundTypeSortAscending = true;
  protected Integer RefundTypeSort = null;
  /** raw field for: DEPOSIT.reason_code) */
  public    IntegerFilter[] ReasonCode  = null;
  protected boolean ReasonCodeFetch = false;
  protected boolean ReasonCodeSortAscending = true;
  protected Integer ReasonCodeSort = null;
  /** raw field for: DEPOSIT.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  private String _objName = "DepositObjectFilter";
  /** default constructor */
  public DepositObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public DepositObjectFilter (DepositObjectFilter other)
  {
    if (other == null) return;
    this.Key = new DepositObjectKeyFilter (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.DepositType = other.DepositType;
    this.DepositTypeFetch = other.DepositTypeFetch;
    this.DepositTypeSort = other.DepositTypeSort;
    this.DepositTypeSortAscending = other.DepositTypeSortAscending;
    this.DateReceived = other.DateReceived;
    this.DateReceivedFetch = other.DateReceivedFetch;
    this.DateReceivedSort = other.DateReceivedSort;
    this.DateReceivedSortAscending = other.DateReceivedSortAscending;
    this.DateReturned = other.DateReturned;
    this.DateReturnedFetch = other.DateReturnedFetch;
    this.DateReturnedSort = other.DateReturnedSort;
    this.DateReturnedSortAscending = other.DateReturnedSortAscending;
    this.DepositAmount = other.DepositAmount;
    this.DepositAmountFetch = other.DepositAmountFetch;
    this.DepositAmountSort = other.DepositAmountSort;
    this.DepositAmountSortAscending = other.DepositAmountSortAscending;
    this.InterestAmount = other.InterestAmount;
    this.InterestAmountFetch = other.InterestAmountFetch;
    this.InterestAmountSort = other.InterestAmountSort;
    this.InterestAmountSortAscending = other.InterestAmountSortAscending;
    this.IncomeTaxAmount = other.IncomeTaxAmount;
    this.IncomeTaxAmountFetch = other.IncomeTaxAmountFetch;
    this.IncomeTaxAmountSort = other.IncomeTaxAmountSort;
    this.IncomeTaxAmountSortAscending = other.IncomeTaxAmountSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.ManualCcauthCode = other.ManualCcauthCode;
    this.ManualCcauthCodeFetch = other.ManualCcauthCodeFetch;
    this.ManualCcauthCodeSort = other.ManualCcauthCodeSort;
    this.ManualCcauthCodeCaseInsensitive = other.ManualCcauthCodeCaseInsensitive;
    this.ManualCcauthCodeSortAscending = other.ManualCcauthCodeSortAscending;
    this.ManualCcauthDate = other.ManualCcauthDate;
    this.ManualCcauthDateFetch = other.ManualCcauthDateFetch;
    this.ManualCcauthDateSort = other.ManualCcauthDateSort;
    this.ManualCcauthDateCaseInsensitive = other.ManualCcauthDateCaseInsensitive;
    this.ManualCcauthDateSortAscending = other.ManualCcauthDateSortAscending;
    this.PayMethod = other.PayMethod;
    this.PayMethodFetch = other.PayMethodFetch;
    this.PayMethodSort = other.PayMethodSort;
    this.PayMethodSortAscending = other.PayMethodSortAscending;
    this.RefundType = other.RefundType;
    this.RefundTypeFetch = other.RefundTypeFetch;
    this.RefundTypeSort = other.RefundTypeSort;
    this.RefundTypeSortAscending = other.RefundTypeSortAscending;
    this.ReasonCode = other.ReasonCode;
    this.ReasonCodeFetch = other.ReasonCodeFetch;
    this.ReasonCodeSort = other.ReasonCodeSort;
    this.ReasonCodeSortAscending = other.ReasonCodeSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;  }
  /** get the filter for this object's key
   * @return DepositObjectKeyFilter
   */
  public DepositObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (DepositObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (DEPOSIT.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (DEPOSIT.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (DEPOSIT.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (DEPOSIT.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (DEPOSIT.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (DEPOSIT.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (DEPOSIT.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (DEPOSIT.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new DepositObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (DEPOSIT.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountInternalId (DEPOSIT.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (DEPOSIT.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (DEPOSIT.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (DEPOSIT.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (DEPOSIT.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (DEPOSIT.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (DEPOSIT.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (DEPOSIT.account_no)
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

  /** Set the field level Fetch value for field: DepositType (DEPOSIT.deposit_type)
   * @param fetch whether to fetch this field or not
   */
  public void setDepositTypeFetch (boolean fetch) {
    this.DepositTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DepositType (DEPOSIT.deposit_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getDepositTypeFetch () {
    return this.DepositTypeFetch;
  }
  /** Set the SortOrder for field: DepositType (DEPOSIT.deposit_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDepositTypeSortOrder (Integer value) {
    this.DepositTypeSort = value;
  }
  /** Retrieve SortOrder for field: DepositType (DEPOSIT.deposit_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDepositTypeSortOrder () {
    return this.DepositTypeSort;
  }
  /** Set the sort direction for field: DepositType (DEPOSIT.deposit_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDepositTypeSortDirection (boolean ascending) {
    this.DepositTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DepositType (DEPOSIT.deposit_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDepositTypeSortDirection () {
    return this.DepositTypeSortAscending;
  }
  /** Set the field level filters for field: DepositType (DEPOSIT.deposit_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDepositTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.DepositType = value;
  }
  /** Retrieve filter for field: DepositType (DEPOSIT.deposit_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDepositTypeFilter () {
    return this.DepositType;
  }

  /**
   * Retrieves the DepositTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DepositTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DepositTypeFilter field
   */
  public String[] getDepositTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDepositTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDepositTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DepositTypeFilter filter value from a formatted string
   *
   * @param _value the DepositTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DepositTypeFilter filter field
   */
  public void setDepositTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDepositTypeFilterFromFormattedString");
    try {
      this.setDepositTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDepositTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDepositTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DateReceived (DEPOSIT.date_received)
   * @param fetch whether to fetch this field or not
   */
  public void setDateReceivedFetch (boolean fetch) {
    this.DateReceivedFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateReceived (DEPOSIT.date_received)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateReceivedFetch () {
    return this.DateReceivedFetch;
  }
  /** Set the SortOrder for field: DateReceived (DEPOSIT.date_received)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateReceivedSortOrder (Integer value) {
    this.DateReceivedSort = value;
  }
  /** Retrieve SortOrder for field: DateReceived (DEPOSIT.date_received)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateReceivedSortOrder () {
    return this.DateReceivedSort;
  }
  /** Set the sort direction for field: DateReceived (DEPOSIT.date_received)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateReceivedSortDirection (boolean ascending) {
    this.DateReceivedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateReceived (DEPOSIT.date_received)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateReceivedSortDirection () {
    return this.DateReceivedSortAscending;
  }
  /** Set the field level filters for field: DateReceived (DEPOSIT.date_received)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateReceivedFilter (DateFilter[] value) throws ServiceException {
    this.DateReceived = value;
  }
  /** Retrieve filter for field: DateReceived (DEPOSIT.date_received)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateReceivedFilter () {
    return this.DateReceived;
  }

  /**
   * Retrieves the DateReceivedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateReceivedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReceivedFilter field
   */
  public String[] getDateReceivedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReceivedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateReceivedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReceivedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReceivedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReceivedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateReceivedFilter filter value from a formatted string
   *
   * @param _value the DateReceivedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateReceivedFilter filter field
   */
  public void setDateReceivedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateReceivedFilterFromFormattedString");
    try {
      this.setDateReceivedFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReceivedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReceivedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateReceivedFilterFromFormattedString");
  }

  /**
   * Retrieves the DateReceivedFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateReceivedFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReceivedFilter field
   */
  public String[] getDateReceivedFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReceivedFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateReceivedFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReceivedFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReceivedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReceivedFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateReceivedFilter filter value from a formatted string
   *
   * @param _value the DateReceivedFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateReceivedFilter filter field
   */
  public void setDateReceivedFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateReceivedFilterFromFormattedDateTimeString");
    try {
      this.setDateReceivedFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReceivedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReceivedFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateReceivedFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DateReturned (DEPOSIT.date_returned)
   * @param fetch whether to fetch this field or not
   */
  public void setDateReturnedFetch (boolean fetch) {
    this.DateReturnedFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateReturned (DEPOSIT.date_returned)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateReturnedFetch () {
    return this.DateReturnedFetch;
  }
  /** Set the SortOrder for field: DateReturned (DEPOSIT.date_returned)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateReturnedSortOrder (Integer value) {
    this.DateReturnedSort = value;
  }
  /** Retrieve SortOrder for field: DateReturned (DEPOSIT.date_returned)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateReturnedSortOrder () {
    return this.DateReturnedSort;
  }
  /** Set the sort direction for field: DateReturned (DEPOSIT.date_returned)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateReturnedSortDirection (boolean ascending) {
    this.DateReturnedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateReturned (DEPOSIT.date_returned)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateReturnedSortDirection () {
    return this.DateReturnedSortAscending;
  }
  /** Set the field level filters for field: DateReturned (DEPOSIT.date_returned)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateReturnedFilter (DateFilter[] value) throws ServiceException {
    this.DateReturned = value;
  }
  /** Retrieve filter for field: DateReturned (DEPOSIT.date_returned)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateReturnedFilter () {
    return this.DateReturned;
  }

  /**
   * Retrieves the DateReturnedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateReturnedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReturnedFilter field
   */
  public String[] getDateReturnedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReturnedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateReturnedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReturnedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReturnedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReturnedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateReturnedFilter filter value from a formatted string
   *
   * @param _value the DateReturnedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateReturnedFilter filter field
   */
  public void setDateReturnedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateReturnedFilterFromFormattedString");
    try {
      this.setDateReturnedFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReturnedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReturnedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateReturnedFilterFromFormattedString");
  }

  /**
   * Retrieves the DateReturnedFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateReturnedFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateReturnedFilter field
   */
  public String[] getDateReturnedFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateReturnedFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateReturnedFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateReturnedFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReturnedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateReturnedFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateReturnedFilter filter value from a formatted string
   *
   * @param _value the DateReturnedFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateReturnedFilter filter field
   */
  public void setDateReturnedFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateReturnedFilterFromFormattedDateTimeString");
    try {
      this.setDateReturnedFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateReturnedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateReturnedFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateReturnedFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DepositAmount (DEPOSIT.deposit_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setDepositAmountFetch (boolean fetch) {
    this.DepositAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: DepositAmount (DEPOSIT.deposit_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getDepositAmountFetch () {
    return this.DepositAmountFetch;
  }
  /** Set the SortOrder for field: DepositAmount (DEPOSIT.deposit_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDepositAmountSortOrder (Integer value) {
    this.DepositAmountSort = value;
  }
  /** Retrieve SortOrder for field: DepositAmount (DEPOSIT.deposit_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDepositAmountSortOrder () {
    return this.DepositAmountSort;
  }
  /** Set the sort direction for field: DepositAmount (DEPOSIT.deposit_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDepositAmountSortDirection (boolean ascending) {
    this.DepositAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DepositAmount (DEPOSIT.deposit_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDepositAmountSortDirection () {
    return this.DepositAmountSortAscending;
  }
  /** Set the field level filters for field: DepositAmount (DEPOSIT.deposit_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDepositAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DepositAmount = value;
  }
  /** Retrieve filter for field: DepositAmount (DEPOSIT.deposit_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDepositAmountFilter () {
    return this.DepositAmount;
  }

  /**
   * Retrieves the DepositAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DepositAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DepositAmountFilter field
   */
  public String[] getDepositAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDepositAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDepositAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DepositAmountFilter filter value from a formatted string
   *
   * @param _value the DepositAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DepositAmountFilter filter field
   */
  public void setDepositAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDepositAmountFilterFromFormattedString");
    try {
      this.setDepositAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDepositAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDepositAmountFilterFromFormattedString");
  }

  /**
   * Sets the DepositAmountFilter filter value from a formatted string
   *
   * @param _value the DepositAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DepositAmountFilter filter field
   */
  public void setDepositAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDepositAmountFilterFromFormattedCurrencyString");
    try {
      this.setDepositAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDepositAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDepositAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DepositAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DepositAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DepositAmountFilter field
   */

  public String[] getDepositAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDepositAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDepositAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDepositAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DepositAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDepositAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: InterestAmount (DEPOSIT.interest_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setInterestAmountFetch (boolean fetch) {
    this.InterestAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: InterestAmount (DEPOSIT.interest_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getInterestAmountFetch () {
    return this.InterestAmountFetch;
  }
  /** Set the SortOrder for field: InterestAmount (DEPOSIT.interest_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInterestAmountSortOrder (Integer value) {
    this.InterestAmountSort = value;
  }
  /** Retrieve SortOrder for field: InterestAmount (DEPOSIT.interest_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInterestAmountSortOrder () {
    return this.InterestAmountSort;
  }
  /** Set the sort direction for field: InterestAmount (DEPOSIT.interest_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInterestAmountSortDirection (boolean ascending) {
    this.InterestAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InterestAmount (DEPOSIT.interest_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInterestAmountSortDirection () {
    return this.InterestAmountSortAscending;
  }
  /** Set the field level filters for field: InterestAmount (DEPOSIT.interest_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInterestAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.InterestAmount = value;
  }
  /** Retrieve filter for field: InterestAmount (DEPOSIT.interest_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getInterestAmountFilter () {
    return this.InterestAmount;
  }

  /**
   * Retrieves the InterestAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InterestAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterestAmountFilter field
   */
  public String[] getInterestAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterestAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInterestAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterestAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterestAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterestAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InterestAmountFilter filter value from a formatted string
   *
   * @param _value the InterestAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InterestAmountFilter filter field
   */
  public void setInterestAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInterestAmountFilterFromFormattedString");
    try {
      this.setInterestAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterestAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterestAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterestAmountFilterFromFormattedString");
  }

  /**
   * Sets the InterestAmountFilter filter value from a formatted string
   *
   * @param _value the InterestAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InterestAmountFilter filter field
   */
  public void setInterestAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInterestAmountFilterFromFormattedCurrencyString");
    try {
      this.setInterestAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterestAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterestAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterestAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the InterestAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InterestAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterestAmountFilter field
   */

  public String[] getInterestAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterestAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInterestAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterestAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterestAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterestAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setIncomeTaxAmountFetch (boolean fetch) {
    this.IncomeTaxAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncomeTaxAmountFetch () {
    return this.IncomeTaxAmountFetch;
  }
  /** Set the SortOrder for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncomeTaxAmountSortOrder (Integer value) {
    this.IncomeTaxAmountSort = value;
  }
  /** Retrieve SortOrder for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncomeTaxAmountSortOrder () {
    return this.IncomeTaxAmountSort;
  }
  /** Set the sort direction for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncomeTaxAmountSortDirection (boolean ascending) {
    this.IncomeTaxAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncomeTaxAmountSortDirection () {
    return this.IncomeTaxAmountSortAscending;
  }
  /** Set the field level filters for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncomeTaxAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.IncomeTaxAmount = value;
  }
  /** Retrieve filter for field: IncomeTaxAmount (DEPOSIT.income_tax_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getIncomeTaxAmountFilter () {
    return this.IncomeTaxAmount;
  }

  /**
   * Retrieves the IncomeTaxAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncomeTaxAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncomeTaxAmountFilter field
   */
  public String[] getIncomeTaxAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncomeTaxAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncomeTaxAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncomeTaxAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncomeTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncomeTaxAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncomeTaxAmountFilter filter value from a formatted string
   *
   * @param _value the IncomeTaxAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncomeTaxAmountFilter filter field
   */
  public void setIncomeTaxAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncomeTaxAmountFilterFromFormattedString");
    try {
      this.setIncomeTaxAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncomeTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncomeTaxAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncomeTaxAmountFilterFromFormattedString");
  }

  /**
   * Sets the IncomeTaxAmountFilter filter value from a formatted string
   *
   * @param _value the IncomeTaxAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncomeTaxAmountFilter filter field
   */
  public void setIncomeTaxAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncomeTaxAmountFilterFromFormattedCurrencyString");
    try {
      this.setIncomeTaxAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncomeTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncomeTaxAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncomeTaxAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the IncomeTaxAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncomeTaxAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncomeTaxAmountFilter field
   */

  public String[] getIncomeTaxAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncomeTaxAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncomeTaxAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncomeTaxAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncomeTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncomeTaxAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CurrencyCode (DEPOSIT.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (DEPOSIT.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (DEPOSIT.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (DEPOSIT.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (DEPOSIT.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (DEPOSIT.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (DEPOSIT.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (DEPOSIT.currency_code)
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

  /** Set the field level Fetch value for field: ChgDate (DEPOSIT.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (DEPOSIT.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (DEPOSIT.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (DEPOSIT.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (DEPOSIT.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (DEPOSIT.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (DEPOSIT.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (DEPOSIT.chg_date)
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


  /** Set the field level Fetch value for field: ChgWho (DEPOSIT.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (DEPOSIT.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (DEPOSIT.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (DEPOSIT.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (DEPOSIT.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (DEPOSIT.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (DEPOSIT.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (DEPOSIT.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (DEPOSIT.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (DEPOSIT.chg_who)
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

  /** Set the field level Fetch value for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @param fetch whether to fetch this field or not
   */
  public void setManualCcauthCodeFetch (boolean fetch) {
    this.ManualCcauthCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getManualCcauthCodeFetch () {
    return this.ManualCcauthCodeFetch;
  }
  /** Set the SortOrder for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setManualCcauthCodeSortOrder (Integer value) {
    this.ManualCcauthCodeSort = value;
  }
  /** Retrieve SortOrder for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getManualCcauthCodeSortOrder () {
    return this.ManualCcauthCodeSort;
  }
  /** Set the sort direction for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setManualCcauthCodeSortDirection (boolean ascending) {
    this.ManualCcauthCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getManualCcauthCodeSortDirection () {
    return this.ManualCcauthCodeSortAscending;
  }
  /** Set the case insensitive for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setManualCcauthCodeCaseInsensitive (boolean ascending) {
    this.ManualCcauthCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getManualCcauthCodeCaseInsensitive () {
    return this.ManualCcauthCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setManualCcauthCodeFilter (StringFilter[] value) throws ServiceException {
    this.ManualCcauthCode = value;
  }
  /** Retrieve filter for field: ManualCcauthCode (DEPOSIT.manual_ccauth_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getManualCcauthCodeFilter () {
    return this.ManualCcauthCode;
  }

  /**
   * Retrieves the ManualCcauthCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ManualCcauthCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthCodeFilter field
   */
  public String[] getManualCcauthCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getManualCcauthCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ManualCcauthCodeFilter filter value from a formatted string
   *
   * @param _value the ManualCcauthCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ManualCcauthCodeFilter filter field
   */
  public void setManualCcauthCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
    try {
      this.setManualCcauthCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @param fetch whether to fetch this field or not
   */
  public void setManualCcauthDateFetch (boolean fetch) {
    this.ManualCcauthDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getManualCcauthDateFetch () {
    return this.ManualCcauthDateFetch;
  }
  /** Set the SortOrder for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setManualCcauthDateSortOrder (Integer value) {
    this.ManualCcauthDateSort = value;
  }
  /** Retrieve SortOrder for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getManualCcauthDateSortOrder () {
    return this.ManualCcauthDateSort;
  }
  /** Set the sort direction for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setManualCcauthDateSortDirection (boolean ascending) {
    this.ManualCcauthDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getManualCcauthDateSortDirection () {
    return this.ManualCcauthDateSortAscending;
  }
  /** Set the case insensitive for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setManualCcauthDateCaseInsensitive (boolean ascending) {
    this.ManualCcauthDateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getManualCcauthDateCaseInsensitive () {
    return this.ManualCcauthDateCaseInsensitive;
  }
  /** Set the field level filters for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setManualCcauthDateFilter (StringFilter[] value) throws ServiceException {
    this.ManualCcauthDate = value;
  }
  /** Retrieve filter for field: ManualCcauthDate (DEPOSIT.manual_ccauth_date)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getManualCcauthDateFilter () {
    return this.ManualCcauthDate;
  }

  /**
   * Retrieves the ManualCcauthDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ManualCcauthDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthDateFilter field
   */
  public String[] getManualCcauthDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getManualCcauthDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ManualCcauthDateFilter filter value from a formatted string
   *
   * @param _value the ManualCcauthDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ManualCcauthDateFilter filter field
   */
  public void setManualCcauthDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
    try {
      this.setManualCcauthDateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayMethod (DEPOSIT.pay_method)
   * @param fetch whether to fetch this field or not
   */
  public void setPayMethodFetch (boolean fetch) {
    this.PayMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayMethod (DEPOSIT.pay_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayMethodFetch () {
    return this.PayMethodFetch;
  }
  /** Set the SortOrder for field: PayMethod (DEPOSIT.pay_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayMethodSortOrder (Integer value) {
    this.PayMethodSort = value;
  }
  /** Retrieve SortOrder for field: PayMethod (DEPOSIT.pay_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayMethodSortOrder () {
    return this.PayMethodSort;
  }
  /** Set the sort direction for field: PayMethod (DEPOSIT.pay_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayMethodSortDirection (boolean ascending) {
    this.PayMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayMethod (DEPOSIT.pay_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayMethodSortDirection () {
    return this.PayMethodSortAscending;
  }
  /** Set the field level filters for field: PayMethod (DEPOSIT.pay_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.PayMethod = value;
  }
  /** Retrieve filter for field: PayMethod (DEPOSIT.pay_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPayMethodFilter () {
    return this.PayMethod;
  }

  /**
   * Retrieves the PayMethodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayMethodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayMethodFilter field
   */
  public String[] getPayMethodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayMethodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayMethodFilter filter value from a formatted string
   *
   * @param _value the PayMethodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayMethodFilter filter field
   */
  public void setPayMethodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayMethodFilterFromFormattedString");
    try {
      this.setPayMethodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayMethodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RefundType (DEPOSIT.refund_type)
   * @param fetch whether to fetch this field or not
   */
  public void setRefundTypeFetch (boolean fetch) {
    this.RefundTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RefundType (DEPOSIT.refund_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getRefundTypeFetch () {
    return this.RefundTypeFetch;
  }
  /** Set the SortOrder for field: RefundType (DEPOSIT.refund_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRefundTypeSortOrder (Integer value) {
    this.RefundTypeSort = value;
  }
  /** Retrieve SortOrder for field: RefundType (DEPOSIT.refund_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRefundTypeSortOrder () {
    return this.RefundTypeSort;
  }
  /** Set the sort direction for field: RefundType (DEPOSIT.refund_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRefundTypeSortDirection (boolean ascending) {
    this.RefundTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RefundType (DEPOSIT.refund_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRefundTypeSortDirection () {
    return this.RefundTypeSortAscending;
  }
  /** Set the field level filters for field: RefundType (DEPOSIT.refund_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRefundTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.RefundType = value;
  }
  /** Retrieve filter for field: RefundType (DEPOSIT.refund_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRefundTypeFilter () {
    return this.RefundType;
  }

  /**
   * Retrieves the RefundTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RefundTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundTypeFilter field
   */
  public String[] getRefundTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRefundTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RefundTypeFilter filter value from a formatted string
   *
   * @param _value the RefundTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RefundTypeFilter filter field
   */
  public void setRefundTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRefundTypeFilterFromFormattedString");
    try {
      this.setRefundTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ReasonCode (DEPOSIT.reason_code)
   * @param fetch whether to fetch this field or not
   */
  public void setReasonCodeFetch (boolean fetch) {
    this.ReasonCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReasonCode (DEPOSIT.reason_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getReasonCodeFetch () {
    return this.ReasonCodeFetch;
  }
  /** Set the SortOrder for field: ReasonCode (DEPOSIT.reason_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReasonCodeSortOrder (Integer value) {
    this.ReasonCodeSort = value;
  }
  /** Retrieve SortOrder for field: ReasonCode (DEPOSIT.reason_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReasonCodeSortOrder () {
    return this.ReasonCodeSort;
  }
  /** Set the sort direction for field: ReasonCode (DEPOSIT.reason_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReasonCodeSortDirection (boolean ascending) {
    this.ReasonCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReasonCode (DEPOSIT.reason_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReasonCodeSortDirection () {
    return this.ReasonCodeSortAscending;
  }
  /** Set the field level filters for field: ReasonCode (DEPOSIT.reason_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReasonCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ReasonCode = value;
  }
  /** Retrieve filter for field: ReasonCode (DEPOSIT.reason_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getReasonCodeFilter () {
    return this.ReasonCode;
  }

  /**
   * Retrieves the ReasonCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReasonCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReasonCodeFilter field
   */
  public String[] getReasonCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReasonCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReasonCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReasonCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReasonCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ReasonCodeFilter filter value from a formatted string
   *
   * @param _value the ReasonCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReasonCodeFilter filter field
   */
  public void setReasonCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReasonCodeFilterFromFormattedString");
    try {
      this.setReasonCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReasonCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReasonCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OpenItemId (DEPOSIT.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (DEPOSIT.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (DEPOSIT.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (DEPOSIT.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (DEPOSIT.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (DEPOSIT.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (DEPOSIT.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (DEPOSIT.open_item_id)
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

  public String toString() {
    return DepositObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return DepositObjectHelper.toMap(this, null);
  }
}
