/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillingStatisticsObjectFilter.java
 * Definition File: Customer/AbiBillingStatistics.xml
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
public class AbiBillingStatisticsObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AbiBillingStatisticsObjectKeyFilter Key = null;
  /** raw field for: ABI_BILLING_STATISTICS.statistic_value) */
  public    BigIntegerFilter[] StatisticValue  = null;
  protected boolean StatisticValueFetch = false;
  protected boolean StatisticValueSortAscending = true;
  protected Integer StatisticValueSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.currency) */
  public    BigIntegerFilter[] Currency  = null;
  protected boolean CurrencyFetch = false;
  protected boolean CurrencySortAscending = true;
  protected Integer CurrencySort = null;
  /** raw field for: ABI_BILLING_STATISTICS.statistic_type) */
  public    BigIntegerFilter[] StatisticType  = null;
  protected boolean StatisticTypeFetch = false;
  protected boolean StatisticTypeSortAscending = true;
  protected Integer StatisticTypeSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.description) */
  public    StringFilter[] Description  = null;
  protected boolean DescriptionFetch = false;
  protected boolean DescriptionSortAscending = true;
  protected boolean DescriptionCaseInsensitive = false;
  protected Integer DescriptionSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.account_no) */
  public    BigIntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.subscr_no) */
  public    BigIntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.subscr_no_resets) */
  public    BigIntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.external_invoice_id) */
  public    BigIntegerFilter[] ExternalInvoiceId  = null;
  protected boolean ExternalInvoiceIdFetch = false;
  protected boolean ExternalInvoiceIdSortAscending = true;
  protected Integer ExternalInvoiceIdSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.invoice_record_seq) */
  public    BigIntegerFilter[] InvoiceRecordSeq  = null;
  protected boolean InvoiceRecordSeqFetch = false;
  protected boolean InvoiceRecordSeqSortAscending = true;
  protected Integer InvoiceRecordSeqSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.file_id) */
  public    BigIntegerFilter[] FileId  = null;
  protected boolean FileIdFetch = false;
  protected boolean FileIdSortAscending = true;
  protected Integer FileIdSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.file_id_serv) */
  public    BigIntegerFilter[] FileIdServ  = null;
  protected boolean FileIdServFetch = false;
  protected boolean FileIdServSortAscending = true;
  protected Integer FileIdServSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.lob_id) */
  public    BigIntegerFilter[] LobId  = null;
  protected boolean LobIdFetch = false;
  protected boolean LobIdSortAscending = true;
  protected Integer LobIdSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.transaction_id) */
  public    BigIntegerFilter[] TransactionId  = null;
  protected boolean TransactionIdFetch = false;
  protected boolean TransactionIdSortAscending = true;
  protected Integer TransactionIdSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.bill_ref_no) */
  public    BigIntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: ABI_BILLING_STATISTICS.bill_ref_resets) */
  public    BigIntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  private String _objName = "AbiBillingStatisticsObjectFilter";
  /** default constructor */
  public AbiBillingStatisticsObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AbiBillingStatisticsObjectFilter (AbiBillingStatisticsObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AbiBillingStatisticsObjectKeyFilter (other.Key);
    this.StatisticValue = other.StatisticValue;
    this.StatisticValueFetch = other.StatisticValueFetch;
    this.StatisticValueSort = other.StatisticValueSort;
    this.StatisticValueSortAscending = other.StatisticValueSortAscending;
    this.Currency = other.Currency;
    this.CurrencyFetch = other.CurrencyFetch;
    this.CurrencySort = other.CurrencySort;
    this.CurrencySortAscending = other.CurrencySortAscending;
    this.StatisticType = other.StatisticType;
    this.StatisticTypeFetch = other.StatisticTypeFetch;
    this.StatisticTypeSort = other.StatisticTypeSort;
    this.StatisticTypeSortAscending = other.StatisticTypeSortAscending;
    this.Description = other.Description;
    this.DescriptionFetch = other.DescriptionFetch;
    this.DescriptionSort = other.DescriptionSort;
    this.DescriptionCaseInsensitive = other.DescriptionCaseInsensitive;
    this.DescriptionSortAscending = other.DescriptionSortAscending;
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
    this.ExternalInvoiceId = other.ExternalInvoiceId;
    this.ExternalInvoiceIdFetch = other.ExternalInvoiceIdFetch;
    this.ExternalInvoiceIdSort = other.ExternalInvoiceIdSort;
    this.ExternalInvoiceIdSortAscending = other.ExternalInvoiceIdSortAscending;
    this.InvoiceRecordSeq = other.InvoiceRecordSeq;
    this.InvoiceRecordSeqFetch = other.InvoiceRecordSeqFetch;
    this.InvoiceRecordSeqSort = other.InvoiceRecordSeqSort;
    this.InvoiceRecordSeqSortAscending = other.InvoiceRecordSeqSortAscending;
    this.FileId = other.FileId;
    this.FileIdFetch = other.FileIdFetch;
    this.FileIdSort = other.FileIdSort;
    this.FileIdSortAscending = other.FileIdSortAscending;
    this.FileIdServ = other.FileIdServ;
    this.FileIdServFetch = other.FileIdServFetch;
    this.FileIdServSort = other.FileIdServSort;
    this.FileIdServSortAscending = other.FileIdServSortAscending;
    this.LobId = other.LobId;
    this.LobIdFetch = other.LobIdFetch;
    this.LobIdSort = other.LobIdSort;
    this.LobIdSortAscending = other.LobIdSortAscending;
    this.TransactionId = other.TransactionId;
    this.TransactionIdFetch = other.TransactionIdFetch;
    this.TransactionIdSort = other.TransactionIdSort;
    this.TransactionIdSortAscending = other.TransactionIdSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;  }
  /** get the filter for this object's key
   * @return AbiBillingStatisticsObjectKeyFilter
   */
  public AbiBillingStatisticsObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AbiBillingStatisticsObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @param fetch whether to fetch this field or not
   */
  public void setStatisticIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiBillingStatisticsObjectKeyFilter ();
    this.Key.StatisticIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatisticIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.StatisticIdFetch;
  }
  /** Set the SortOrder for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatisticIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiBillingStatisticsObjectKeyFilter ();
    this.Key.StatisticIdSort = value;
  }
  /** Retrieve SortOrder for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatisticIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.StatisticIdSort;
  }
  /** Set the sort direction for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatisticIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiBillingStatisticsObjectKeyFilter ();
    this.Key.StatisticIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatisticIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.StatisticIdSortAscending;
  }
  /** Set the field level filters for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatisticIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiBillingStatisticsObjectKeyFilter ();
    this.Key.StatisticId = value;
  }
  /** Retrieve filter for field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStatisticIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.StatisticId;
  }
  /** Set the field level Fetch value for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @param fetch whether to fetch this field or not
   */
  public void setStatisticValueFetch (boolean fetch) {
    this.StatisticValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatisticValueFetch () {
    return this.StatisticValueFetch;
  }
  /** Set the SortOrder for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatisticValueSortOrder (Integer value) {
    this.StatisticValueSort = value;
  }
  /** Retrieve SortOrder for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatisticValueSortOrder () {
    return this.StatisticValueSort;
  }
  /** Set the sort direction for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatisticValueSortDirection (boolean ascending) {
    this.StatisticValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatisticValueSortDirection () {
    return this.StatisticValueSortAscending;
  }
  /** Set the field level filters for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatisticValueFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StatisticValue = value;
  }
  /** Retrieve filter for field: StatisticValue (ABI_BILLING_STATISTICS.statistic_value)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStatisticValueFilter () {
    return this.StatisticValue;
  }

  /**
   * Retrieves the StatisticValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatisticValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatisticValueFilter field
   */
  public String[] getStatisticValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatisticValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatisticValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatisticValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatisticValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatisticValueFilter filter value from a formatted string
   *
   * @param _value the StatisticValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatisticValueFilter filter field
   */
  public void setStatisticValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatisticValueFilterFromFormattedString");
    try {
      this.setStatisticValueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatisticValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatisticValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatisticValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Currency (ABI_BILLING_STATISTICS.currency)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyFetch (boolean fetch) {
    this.CurrencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: Currency (ABI_BILLING_STATISTICS.currency)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyFetch () {
    return this.CurrencyFetch;
  }
  /** Set the SortOrder for field: Currency (ABI_BILLING_STATISTICS.currency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencySortOrder (Integer value) {
    this.CurrencySort = value;
  }
  /** Retrieve SortOrder for field: Currency (ABI_BILLING_STATISTICS.currency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencySortOrder () {
    return this.CurrencySort;
  }
  /** Set the sort direction for field: Currency (ABI_BILLING_STATISTICS.currency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencySortDirection (boolean ascending) {
    this.CurrencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Currency (ABI_BILLING_STATISTICS.currency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencySortDirection () {
    return this.CurrencySortAscending;
  }
  /** Set the field level filters for field: Currency (ABI_BILLING_STATISTICS.currency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Currency = value;
  }
  /** Retrieve filter for field: Currency (ABI_BILLING_STATISTICS.currency)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCurrencyFilter () {
    return this.Currency;
  }

  /**
   * Retrieves the CurrencyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyFilter field
   */
  public String[] getCurrencyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyFilter filter value from a formatted string
   *
   * @param _value the CurrencyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyFilter filter field
   */
  public void setCurrencyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyFilterFromFormattedString");
    try {
      this.setCurrencyFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @param fetch whether to fetch this field or not
   */
  public void setStatisticTypeFetch (boolean fetch) {
    this.StatisticTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatisticTypeFetch () {
    return this.StatisticTypeFetch;
  }
  /** Set the SortOrder for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatisticTypeSortOrder (Integer value) {
    this.StatisticTypeSort = value;
  }
  /** Retrieve SortOrder for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatisticTypeSortOrder () {
    return this.StatisticTypeSort;
  }
  /** Set the sort direction for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatisticTypeSortDirection (boolean ascending) {
    this.StatisticTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatisticTypeSortDirection () {
    return this.StatisticTypeSortAscending;
  }
  /** Set the field level filters for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatisticTypeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StatisticType = value;
  }
  /** Retrieve filter for field: StatisticType (ABI_BILLING_STATISTICS.statistic_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStatisticTypeFilter () {
    return this.StatisticType;
  }

  /**
   * Retrieves the StatisticTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatisticTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatisticTypeFilter field
   */
  public String[] getStatisticTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatisticTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatisticTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatisticTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatisticTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatisticTypeFilter filter value from a formatted string
   *
   * @param _value the StatisticTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatisticTypeFilter filter field
   */
  public void setStatisticTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatisticTypeFilterFromFormattedString");
    try {
      this.setStatisticTypeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatisticTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatisticTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatisticTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Description (ABI_BILLING_STATISTICS.description)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionFetch (boolean fetch) {
    this.DescriptionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Description (ABI_BILLING_STATISTICS.description)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionFetch () {
    return this.DescriptionFetch;
  }
  /** Set the SortOrder for field: Description (ABI_BILLING_STATISTICS.description)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionSortOrder (Integer value) {
    this.DescriptionSort = value;
  }
  /** Retrieve SortOrder for field: Description (ABI_BILLING_STATISTICS.description)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionSortOrder () {
    return this.DescriptionSort;
  }
  /** Set the sort direction for field: Description (ABI_BILLING_STATISTICS.description)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionSortDirection (boolean ascending) {
    this.DescriptionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Description (ABI_BILLING_STATISTICS.description)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionSortDirection () {
    return this.DescriptionSortAscending;
  }
  /** Set the case insensitive for field: Description (ABI_BILLING_STATISTICS.description)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDescriptionCaseInsensitive (boolean ascending) {
    this.DescriptionCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Description (ABI_BILLING_STATISTICS.description)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDescriptionCaseInsensitive () {
    return this.DescriptionCaseInsensitive;
  }
  /** Set the field level filters for field: Description (ABI_BILLING_STATISTICS.description)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionFilter (StringFilter[] value) throws ServiceException {
    this.Description = value;
  }
  /** Retrieve filter for field: Description (ABI_BILLING_STATISTICS.description)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDescriptionFilter () {
    return this.Description;
  }

  /**
   * Retrieves the DescriptionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionFilter field
   */
  public String[] getDescriptionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionFilter filter value from a formatted string
   *
   * @param _value the DescriptionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionFilter filter field
   */
  public void setDescriptionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionFilterFromFormattedString");
    try {
      this.setDescriptionFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (ABI_BILLING_STATISTICS.account_no)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAccountInternalIdFilter () {
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
      this.setAccountInternalIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (ABI_BILLING_STATISTICS.subscr_no)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getServiceInternalIdFilter () {
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
      this.setServiceInternalIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (ABI_BILLING_STATISTICS.subscr_no_resets)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getServiceInternalIdResetsFilter () {
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
      this.setServiceInternalIdResetsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalInvoiceIdFetch (boolean fetch) {
    this.ExternalInvoiceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalInvoiceIdFetch () {
    return this.ExternalInvoiceIdFetch;
  }
  /** Set the SortOrder for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalInvoiceIdSortOrder (Integer value) {
    this.ExternalInvoiceIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalInvoiceIdSortOrder () {
    return this.ExternalInvoiceIdSort;
  }
  /** Set the sort direction for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalInvoiceIdSortDirection (boolean ascending) {
    this.ExternalInvoiceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalInvoiceIdSortDirection () {
    return this.ExternalInvoiceIdSortAscending;
  }
  /** Set the field level filters for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalInvoiceIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ExternalInvoiceId = value;
  }
  /** Retrieve filter for field: ExternalInvoiceId (ABI_BILLING_STATISTICS.external_invoice_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getExternalInvoiceIdFilter () {
    return this.ExternalInvoiceId;
  }

  /**
   * Retrieves the ExternalInvoiceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalInvoiceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalInvoiceIdFilter field
   */
  public String[] getExternalInvoiceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalInvoiceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalInvoiceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalInvoiceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalInvoiceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalInvoiceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalInvoiceIdFilter filter value from a formatted string
   *
   * @param _value the ExternalInvoiceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalInvoiceIdFilter filter field
   */
  public void setExternalInvoiceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalInvoiceIdFilterFromFormattedString");
    try {
      this.setExternalInvoiceIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalInvoiceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalInvoiceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalInvoiceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @param fetch whether to fetch this field or not
   */
  public void setInvoiceRecordSeqFetch (boolean fetch) {
    this.InvoiceRecordSeqFetch = fetch;
  }
  /** Retrieve Fetch value for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @return boolean the Fetch value for this field
   */
  public boolean getInvoiceRecordSeqFetch () {
    return this.InvoiceRecordSeqFetch;
  }
  /** Set the SortOrder for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInvoiceRecordSeqSortOrder (Integer value) {
    this.InvoiceRecordSeqSort = value;
  }
  /** Retrieve SortOrder for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInvoiceRecordSeqSortOrder () {
    return this.InvoiceRecordSeqSort;
  }
  /** Set the sort direction for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInvoiceRecordSeqSortDirection (boolean ascending) {
    this.InvoiceRecordSeqSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInvoiceRecordSeqSortDirection () {
    return this.InvoiceRecordSeqSortAscending;
  }
  /** Set the field level filters for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInvoiceRecordSeqFilter (BigIntegerFilter[] value) throws ServiceException {
    this.InvoiceRecordSeq = value;
  }
  /** Retrieve filter for field: InvoiceRecordSeq (ABI_BILLING_STATISTICS.invoice_record_seq)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getInvoiceRecordSeqFilter () {
    return this.InvoiceRecordSeq;
  }

  /**
   * Retrieves the InvoiceRecordSeqFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InvoiceRecordSeqFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InvoiceRecordSeqFilter field
   */
  public String[] getInvoiceRecordSeqFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceRecordSeqFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInvoiceRecordSeqFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceRecordSeqFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InvoiceRecordSeqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInvoiceRecordSeqFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InvoiceRecordSeqFilter filter value from a formatted string
   *
   * @param _value the InvoiceRecordSeqFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InvoiceRecordSeqFilter filter field
   */
  public void setInvoiceRecordSeqFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInvoiceRecordSeqFilterFromFormattedString");
    try {
      this.setInvoiceRecordSeqFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InvoiceRecordSeqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInvoiceRecordSeqFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInvoiceRecordSeqFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdFetch (boolean fetch) {
    this.FileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdFetch () {
    return this.FileIdFetch;
  }
  /** Set the SortOrder for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdSortOrder (Integer value) {
    this.FileIdSort = value;
  }
  /** Retrieve SortOrder for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdSortOrder () {
    return this.FileIdSort;
  }
  /** Set the sort direction for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdSortDirection (boolean ascending) {
    this.FileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdSortDirection () {
    return this.FileIdSortAscending;
  }
  /** Set the field level filters for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FileId = value;
  }
  /** Retrieve filter for field: FileId (ABI_BILLING_STATISTICS.file_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFileIdFilter () {
    return this.FileId;
  }

  /**
   * Retrieves the FileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileIdFilter field
   */
  public String[] getFileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FileIdFilter filter value from a formatted string
   *
   * @param _value the FileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FileIdFilter filter field
   */
  public void setFileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFileIdFilterFromFormattedString");
    try {
      this.setFileIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdServFetch (boolean fetch) {
    this.FileIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdServFetch () {
    return this.FileIdServFetch;
  }
  /** Set the SortOrder for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdServSortOrder (Integer value) {
    this.FileIdServSort = value;
  }
  /** Retrieve SortOrder for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdServSortOrder () {
    return this.FileIdServSort;
  }
  /** Set the sort direction for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdServSortDirection (boolean ascending) {
    this.FileIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdServSortDirection () {
    return this.FileIdServSortAscending;
  }
  /** Set the field level filters for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdServFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FileIdServ = value;
  }
  /** Retrieve filter for field: FileIdServ (ABI_BILLING_STATISTICS.file_id_serv)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFileIdServFilter () {
    return this.FileIdServ;
  }

  /**
   * Retrieves the FileIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FileIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileIdServFilter field
   */
  public String[] getFileIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFileIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FileIdServFilter filter value from a formatted string
   *
   * @param _value the FileIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FileIdServFilter filter field
   */
  public void setFileIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFileIdServFilterFromFormattedString");
    try {
      this.setFileIdServFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @param fetch whether to fetch this field or not
   */
  public void setLobIdFetch (boolean fetch) {
    this.LobIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getLobIdFetch () {
    return this.LobIdFetch;
  }
  /** Set the SortOrder for field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLobIdSortOrder (Integer value) {
    this.LobIdSort = value;
  }
  /** Retrieve SortOrder for field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLobIdSortOrder () {
    return this.LobIdSort;
  }
  /** Set the sort direction for field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLobIdSortDirection (boolean ascending) {
    this.LobIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLobIdSortDirection () {
    return this.LobIdSortAscending;
  }
  /** Set the field level filters for field: LobId (ABI_BILLING_STATISTICS.lob_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLobIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LobId = value;
  }
  /** Retrieve filter for field: LobId (ABI_BILLING_STATISTICS.lob_id)
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

  /** Set the field level Fetch value for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTransactionIdFetch (boolean fetch) {
    this.TransactionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransactionIdFetch () {
    return this.TransactionIdFetch;
  }
  /** Set the SortOrder for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransactionIdSortOrder (Integer value) {
    this.TransactionIdSort = value;
  }
  /** Retrieve SortOrder for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransactionIdSortOrder () {
    return this.TransactionIdSort;
  }
  /** Set the sort direction for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransactionIdSortDirection (boolean ascending) {
    this.TransactionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransactionIdSortDirection () {
    return this.TransactionIdSortAscending;
  }
  /** Set the field level filters for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransactionIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TransactionId = value;
  }
  /** Retrieve filter for field: TransactionId (ABI_BILLING_STATISTICS.transaction_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTransactionIdFilter () {
    return this.TransactionId;
  }

  /**
   * Retrieves the TransactionIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransactionIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactionIdFilter field
   */
  public String[] getTransactionIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransactionIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactionIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactionIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransactionIdFilter filter value from a formatted string
   *
   * @param _value the TransactionIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransactionIdFilter filter field
   */
  public void setTransactionIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransactionIdFilterFromFormattedString");
    try {
      this.setTransactionIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactionIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactionIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (ABI_BILLING_STATISTICS.bill_ref_no)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBillRefNoFilter () {
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
      this.setBillRefNoFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (ABI_BILLING_STATISTICS.bill_ref_resets)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBillRefResetsFilter () {
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
      this.setBillRefResetsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFilterFromFormattedString");
  }

  public String toString() {
    return AbiBillingStatisticsObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AbiBillingStatisticsObjectHelper.toMap(this, null);
  }
}
