/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillMessagesObjectFilter.java
 * Definition File: Customer/AbiBillMessages.xml
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
public class AbiBillMessagesObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AbiBillMessagesObjectKeyFilter Key = null;
  /** raw field for: ABI_BILL_MESSAGES.message_text) */
  public    StringFilter[] MessageText  = null;
  protected boolean MessageTextFetch = false;
  protected boolean MessageTextSortAscending = true;
  protected boolean MessageTextCaseInsensitive = false;
  protected Integer MessageTextSort = null;
  /** raw field for: ABI_BILL_MESSAGES.language_code) */
  public    BigIntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  /** raw field for: ABI_BILL_MESSAGES.account_no) */
  public    BigIntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: ABI_BILL_MESSAGES.subscr_no) */
  public    BigIntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: ABI_BILL_MESSAGES.subscr_no_resets) */
  public    BigIntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: ABI_BILL_MESSAGES.file_id) */
  public    BigIntegerFilter[] FileId  = null;
  protected boolean FileIdFetch = false;
  protected boolean FileIdSortAscending = true;
  protected Integer FileIdSort = null;
  /** raw field for: ABI_BILL_MESSAGES.file_id_serv) */
  public    BigIntegerFilter[] FileIdServ  = null;
  protected boolean FileIdServFetch = false;
  protected boolean FileIdServSortAscending = true;
  protected Integer FileIdServSort = null;
  /** raw field for: ABI_BILL_MESSAGES.lob_id) */
  public    BigIntegerFilter[] LobId  = null;
  protected boolean LobIdFetch = false;
  protected boolean LobIdSortAscending = true;
  protected Integer LobIdSort = null;
  /** raw field for: ABI_BILL_MESSAGES.transaction_id) */
  public    BigIntegerFilter[] TransactionId  = null;
  protected boolean TransactionIdFetch = false;
  protected boolean TransactionIdSortAscending = true;
  protected Integer TransactionIdSort = null;
  /** raw field for: ABI_BILL_MESSAGES.external_invoice_id) */
  public    BigIntegerFilter[] ExternalInvoiceId  = null;
  protected boolean ExternalInvoiceIdFetch = false;
  protected boolean ExternalInvoiceIdSortAscending = true;
  protected Integer ExternalInvoiceIdSort = null;
  /** raw field for: ABI_BILL_MESSAGES.invoice_record_seq) */
  public    BigIntegerFilter[] InvoiceRecordSeq  = null;
  protected boolean InvoiceRecordSeqFetch = false;
  protected boolean InvoiceRecordSeqSortAscending = true;
  protected Integer InvoiceRecordSeqSort = null;
  /** raw field for: ABI_BILL_MESSAGES.bill_ref_no) */
  public    BigIntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: ABI_BILL_MESSAGES.bill_ref_resets) */
  public    BigIntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  private String _objName = "AbiBillMessagesObjectFilter";
  /** default constructor */
  public AbiBillMessagesObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AbiBillMessagesObjectFilter (AbiBillMessagesObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AbiBillMessagesObjectKeyFilter (other.Key);
    this.MessageText = other.MessageText;
    this.MessageTextFetch = other.MessageTextFetch;
    this.MessageTextSort = other.MessageTextSort;
    this.MessageTextCaseInsensitive = other.MessageTextCaseInsensitive;
    this.MessageTextSortAscending = other.MessageTextSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
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
    this.ExternalInvoiceId = other.ExternalInvoiceId;
    this.ExternalInvoiceIdFetch = other.ExternalInvoiceIdFetch;
    this.ExternalInvoiceIdSort = other.ExternalInvoiceIdSort;
    this.ExternalInvoiceIdSortAscending = other.ExternalInvoiceIdSortAscending;
    this.InvoiceRecordSeq = other.InvoiceRecordSeq;
    this.InvoiceRecordSeqFetch = other.InvoiceRecordSeqFetch;
    this.InvoiceRecordSeqSort = other.InvoiceRecordSeqSort;
    this.InvoiceRecordSeqSortAscending = other.InvoiceRecordSeqSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;  }
  /** get the filter for this object's key
   * @return AbiBillMessagesObjectKeyFilter
   */
  public AbiBillMessagesObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AbiBillMessagesObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMessageIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiBillMessagesObjectKeyFilter ();
    this.Key.MessageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMessageIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MessageIdFetch;
  }
  /** Set the SortOrder for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMessageIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiBillMessagesObjectKeyFilter ();
    this.Key.MessageIdSort = value;
  }
  /** Retrieve SortOrder for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMessageIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MessageIdSort;
  }
  /** Set the sort direction for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMessageIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiBillMessagesObjectKeyFilter ();
    this.Key.MessageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMessageIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MessageIdSortAscending;
  }
  /** Set the field level filters for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMessageIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiBillMessagesObjectKeyFilter ();
    this.Key.MessageId = value;
  }
  /** Retrieve filter for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMessageIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MessageId;
  }
  /** Set the field level Fetch value for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @param fetch whether to fetch this field or not
   */
  public void setMessageTextFetch (boolean fetch) {
    this.MessageTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @return boolean the Fetch value for this field
   */
  public boolean getMessageTextFetch () {
    return this.MessageTextFetch;
  }
  /** Set the SortOrder for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMessageTextSortOrder (Integer value) {
    this.MessageTextSort = value;
  }
  /** Retrieve SortOrder for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMessageTextSortOrder () {
    return this.MessageTextSort;
  }
  /** Set the sort direction for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMessageTextSortDirection (boolean ascending) {
    this.MessageTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMessageTextSortDirection () {
    return this.MessageTextSortAscending;
  }
  /** Set the case insensitive for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMessageTextCaseInsensitive (boolean ascending) {
    this.MessageTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMessageTextCaseInsensitive () {
    return this.MessageTextCaseInsensitive;
  }
  /** Set the field level filters for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMessageTextFilter (StringFilter[] value) throws ServiceException {
    this.MessageText = value;
  }
  /** Retrieve filter for field: MessageText (ABI_BILL_MESSAGES.message_text)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMessageTextFilter () {
    return this.MessageText;
  }

  /**
   * Retrieves the MessageTextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MessageTextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MessageTextFilter field
   */
  public String[] getMessageTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMessageTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMessageTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MessageTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMessageTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MessageTextFilter filter value from a formatted string
   *
   * @param _value the MessageTextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MessageTextFilter filter field
   */
  public void setMessageTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMessageTextFilterFromFormattedString");
    try {
      this.setMessageTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MessageTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMessageTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMessageTextFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (ABI_BILL_MESSAGES.language_code)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (ABI_BILL_MESSAGES.account_no)
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

  /** Set the field level Fetch value for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (ABI_BILL_MESSAGES.subscr_no)
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

  /** Set the field level Fetch value for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (ABI_BILL_MESSAGES.subscr_no_resets)
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

  /** Set the field level Fetch value for field: FileId (ABI_BILL_MESSAGES.file_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdFetch (boolean fetch) {
    this.FileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileId (ABI_BILL_MESSAGES.file_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdFetch () {
    return this.FileIdFetch;
  }
  /** Set the SortOrder for field: FileId (ABI_BILL_MESSAGES.file_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdSortOrder (Integer value) {
    this.FileIdSort = value;
  }
  /** Retrieve SortOrder for field: FileId (ABI_BILL_MESSAGES.file_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdSortOrder () {
    return this.FileIdSort;
  }
  /** Set the sort direction for field: FileId (ABI_BILL_MESSAGES.file_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdSortDirection (boolean ascending) {
    this.FileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileId (ABI_BILL_MESSAGES.file_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdSortDirection () {
    return this.FileIdSortAscending;
  }
  /** Set the field level filters for field: FileId (ABI_BILL_MESSAGES.file_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FileId = value;
  }
  /** Retrieve filter for field: FileId (ABI_BILL_MESSAGES.file_id)
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

  /** Set the field level Fetch value for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdServFetch (boolean fetch) {
    this.FileIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdServFetch () {
    return this.FileIdServFetch;
  }
  /** Set the SortOrder for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdServSortOrder (Integer value) {
    this.FileIdServSort = value;
  }
  /** Retrieve SortOrder for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdServSortOrder () {
    return this.FileIdServSort;
  }
  /** Set the sort direction for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdServSortDirection (boolean ascending) {
    this.FileIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdServSortDirection () {
    return this.FileIdServSortAscending;
  }
  /** Set the field level filters for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdServFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FileIdServ = value;
  }
  /** Retrieve filter for field: FileIdServ (ABI_BILL_MESSAGES.file_id_serv)
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

  /** Set the field level Fetch value for field: LobId (ABI_BILL_MESSAGES.lob_id)
   * @param fetch whether to fetch this field or not
   */
  public void setLobIdFetch (boolean fetch) {
    this.LobIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: LobId (ABI_BILL_MESSAGES.lob_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getLobIdFetch () {
    return this.LobIdFetch;
  }
  /** Set the SortOrder for field: LobId (ABI_BILL_MESSAGES.lob_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLobIdSortOrder (Integer value) {
    this.LobIdSort = value;
  }
  /** Retrieve SortOrder for field: LobId (ABI_BILL_MESSAGES.lob_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLobIdSortOrder () {
    return this.LobIdSort;
  }
  /** Set the sort direction for field: LobId (ABI_BILL_MESSAGES.lob_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLobIdSortDirection (boolean ascending) {
    this.LobIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LobId (ABI_BILL_MESSAGES.lob_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLobIdSortDirection () {
    return this.LobIdSortAscending;
  }
  /** Set the field level filters for field: LobId (ABI_BILL_MESSAGES.lob_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLobIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LobId = value;
  }
  /** Retrieve filter for field: LobId (ABI_BILL_MESSAGES.lob_id)
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

  /** Set the field level Fetch value for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTransactionIdFetch (boolean fetch) {
    this.TransactionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransactionIdFetch () {
    return this.TransactionIdFetch;
  }
  /** Set the SortOrder for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransactionIdSortOrder (Integer value) {
    this.TransactionIdSort = value;
  }
  /** Retrieve SortOrder for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransactionIdSortOrder () {
    return this.TransactionIdSort;
  }
  /** Set the sort direction for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransactionIdSortDirection (boolean ascending) {
    this.TransactionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransactionIdSortDirection () {
    return this.TransactionIdSortAscending;
  }
  /** Set the field level filters for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransactionIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TransactionId = value;
  }
  /** Retrieve filter for field: TransactionId (ABI_BILL_MESSAGES.transaction_id)
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

  /** Set the field level Fetch value for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalInvoiceIdFetch (boolean fetch) {
    this.ExternalInvoiceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalInvoiceIdFetch () {
    return this.ExternalInvoiceIdFetch;
  }
  /** Set the SortOrder for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalInvoiceIdSortOrder (Integer value) {
    this.ExternalInvoiceIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalInvoiceIdSortOrder () {
    return this.ExternalInvoiceIdSort;
  }
  /** Set the sort direction for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalInvoiceIdSortDirection (boolean ascending) {
    this.ExternalInvoiceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalInvoiceIdSortDirection () {
    return this.ExternalInvoiceIdSortAscending;
  }
  /** Set the field level filters for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalInvoiceIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ExternalInvoiceId = value;
  }
  /** Retrieve filter for field: ExternalInvoiceId (ABI_BILL_MESSAGES.external_invoice_id)
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

  /** Set the field level Fetch value for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * @param fetch whether to fetch this field or not
   */
  public void setInvoiceRecordSeqFetch (boolean fetch) {
    this.InvoiceRecordSeqFetch = fetch;
  }
  /** Retrieve Fetch value for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * @return boolean the Fetch value for this field
   */
  public boolean getInvoiceRecordSeqFetch () {
    return this.InvoiceRecordSeqFetch;
  }
  /** Set the SortOrder for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInvoiceRecordSeqSortOrder (Integer value) {
    this.InvoiceRecordSeqSort = value;
  }
  /** Retrieve SortOrder for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInvoiceRecordSeqSortOrder () {
    return this.InvoiceRecordSeqSort;
  }
  /** Set the sort direction for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInvoiceRecordSeqSortDirection (boolean ascending) {
    this.InvoiceRecordSeqSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInvoiceRecordSeqSortDirection () {
    return this.InvoiceRecordSeqSortAscending;
  }
  /** Set the field level filters for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInvoiceRecordSeqFilter (BigIntegerFilter[] value) throws ServiceException {
    this.InvoiceRecordSeq = value;
  }
  /** Retrieve filter for field: InvoiceRecordSeq (ABI_BILL_MESSAGES.invoice_record_seq)
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

  /** Set the field level Fetch value for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (ABI_BILL_MESSAGES.bill_ref_no)
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

  /** Set the field level Fetch value for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (ABI_BILL_MESSAGES.bill_ref_resets)
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
    return AbiBillMessagesObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AbiBillMessagesObjectHelper.toMap(this, null);
  }
}
