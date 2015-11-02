/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageObjectKeyFilter.java
 * Definition File: Customer/BilledUsage.xml
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
import java.util.Locale;
import java.util.Map;

import java.math.BigInteger;
import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseFilter;

/** Key Filter for BilledUsageObject object. */
public class BilledUsageObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: BILL_INVOICE.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: BILL_INVOICE.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: CDR_BILLED.cdr_data_partition_key) */
  public    DateFilter[] CdrDataPartitionKey  = null;
  protected boolean CdrDataPartitionKeyFetch = false;
  protected boolean CdrDataPartitionKeySortAscending = true;
  protected Integer CdrDataPartitionKeySort = null;
  /** raw field for: CDR_BILLED.msg_id) */
  public    IntegerFilter[] MsgId  = null;
  protected boolean MsgIdFetch = false;
  protected boolean MsgIdSortAscending = true;
  protected Integer MsgIdSort = null;
  /** raw field for: CDR_BILLED.msg_id2) */
  public    IntegerFilter[] MsgId2  = null;
  protected boolean MsgId2Fetch = false;
  protected boolean MsgId2SortAscending = true;
  protected Integer MsgId2Sort = null;
  /** raw field for: CDR_BILLED.msg_id_serv) */
  public    IntegerFilter[] MsgIdServ  = null;
  protected boolean MsgIdServFetch = false;
  protected boolean MsgIdServSortAscending = true;
  protected Integer MsgIdServSort = null;
  /** raw field for: CDR_BILLED.split_row_num) */
  public    IntegerFilter[] SplitRowNum  = null;
  protected boolean SplitRowNumFetch = false;
  protected boolean SplitRowNumSortAscending = true;
  protected Integer SplitRowNumSort = null;
  /** raw field for: DESCRIPTIONS.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
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
  private String _objName = "BilledUsageObjectKeyFilter";
  /** default constructor */
  public BilledUsageObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public BilledUsageObjectKeyFilter (BilledUsageObjectKeyFilter other)
  {
    if (other == null) return;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.CdrDataPartitionKey = other.CdrDataPartitionKey;
    this.CdrDataPartitionKeyFetch = other.CdrDataPartitionKeyFetch;
    this.CdrDataPartitionKeySort = other.CdrDataPartitionKeySort;
    this.CdrDataPartitionKeySortAscending = other.CdrDataPartitionKeySortAscending;
    this.MsgId = other.MsgId;
    this.MsgIdFetch = other.MsgIdFetch;
    this.MsgIdSort = other.MsgIdSort;
    this.MsgIdSortAscending = other.MsgIdSortAscending;
    this.MsgId2 = other.MsgId2;
    this.MsgId2Fetch = other.MsgId2Fetch;
    this.MsgId2Sort = other.MsgId2Sort;
    this.MsgId2SortAscending = other.MsgId2SortAscending;
    this.MsgIdServ = other.MsgIdServ;
    this.MsgIdServFetch = other.MsgIdServFetch;
    this.MsgIdServSort = other.MsgIdServSort;
    this.MsgIdServSortAscending = other.MsgIdServSortAscending;
    this.SplitRowNum = other.SplitRowNum;
    this.SplitRowNumFetch = other.SplitRowNumFetch;
    this.SplitRowNumSort = other.SplitRowNumSort;
    this.SplitRowNumSortAscending = other.SplitRowNumSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
  }
  /** Set the field level Fetch value for field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (BILL_INVOICE.bill_ref_no)
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

  /** Set the field level Fetch value for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (BILL_INVOICE.bill_ref_resets)
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

  /** Set the field level Fetch value for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @param fetch whether to fetch this field or not
   */
  public void setCdrDataPartitionKeyFetch (boolean fetch) {
    this.CdrDataPartitionKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getCdrDataPartitionKeyFetch () {
    return this.CdrDataPartitionKeyFetch;
  }
  /** Set the SortOrder for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCdrDataPartitionKeySortOrder (Integer value) {
    this.CdrDataPartitionKeySort = value;
  }
  /** Retrieve SortOrder for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCdrDataPartitionKeySortOrder () {
    return this.CdrDataPartitionKeySort;
  }
  /** Set the sort direction for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCdrDataPartitionKeySortDirection (boolean ascending) {
    this.CdrDataPartitionKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCdrDataPartitionKeySortDirection () {
    return this.CdrDataPartitionKeySortAscending;
  }
  /** Set the field level filters for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCdrDataPartitionKeyFilter (DateFilter[] value) throws ServiceException {
    this.CdrDataPartitionKey = value;
  }
  /** Retrieve filter for field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCdrDataPartitionKeyFilter () {
    return this.CdrDataPartitionKey;
  }

  /**
   * Retrieves the CdrDataPartitionKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKeyFilter field
   */
  public String[] getCdrDataPartitionKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCdrDataPartitionKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the CdrDataPartitionKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CdrDataPartitionKeyFilter filter field
   */
  public void setCdrDataPartitionKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
    try {
      this.setCdrDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
  }

  /**
   * Retrieves the CdrDataPartitionKeyFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKeyFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKeyFilter field
   */
  public String[] getCdrDataPartitionKeyFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCdrDataPartitionKeyFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the CdrDataPartitionKeyFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CdrDataPartitionKeyFilter filter field
   */
  public void setCdrDataPartitionKeyFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
    try {
      this.setCdrDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: MsgId (CDR_BILLED.msg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdFetch (boolean fetch) {
    this.MsgIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId (CDR_BILLED.msg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdFetch () {
    return this.MsgIdFetch;
  }
  /** Set the SortOrder for field: MsgId (CDR_BILLED.msg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdSortOrder (Integer value) {
    this.MsgIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgId (CDR_BILLED.msg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdSortOrder () {
    return this.MsgIdSort;
  }
  /** Set the sort direction for field: MsgId (CDR_BILLED.msg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdSortDirection (boolean ascending) {
    this.MsgIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId (CDR_BILLED.msg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdSortDirection () {
    return this.MsgIdSortAscending;
  }
  /** Set the field level filters for field: MsgId (CDR_BILLED.msg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgId = value;
  }
  /** Retrieve filter for field: MsgId (CDR_BILLED.msg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdFilter () {
    return this.MsgId;
  }

  /**
   * Retrieves the MsgIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdFilter field
   */
  public String[] getMsgIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdFilter filter value from a formatted string
   *
   * @param _value the MsgIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdFilter filter field
   */
  public void setMsgIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdFilterFromFormattedString");
    try {
      this.setMsgIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgId2 (CDR_BILLED.msg_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgId2Fetch (boolean fetch) {
    this.MsgId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId2 (CDR_BILLED.msg_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgId2Fetch () {
    return this.MsgId2Fetch;
  }
  /** Set the SortOrder for field: MsgId2 (CDR_BILLED.msg_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgId2SortOrder (Integer value) {
    this.MsgId2Sort = value;
  }
  /** Retrieve SortOrder for field: MsgId2 (CDR_BILLED.msg_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgId2SortOrder () {
    return this.MsgId2Sort;
  }
  /** Set the sort direction for field: MsgId2 (CDR_BILLED.msg_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgId2SortDirection (boolean ascending) {
    this.MsgId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId2 (CDR_BILLED.msg_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgId2SortDirection () {
    return this.MsgId2SortAscending;
  }
  /** Set the field level filters for field: MsgId2 (CDR_BILLED.msg_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgId2Filter (IntegerFilter[] value) throws ServiceException {
    this.MsgId2 = value;
  }
  /** Retrieve filter for field: MsgId2 (CDR_BILLED.msg_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgId2Filter () {
    return this.MsgId2;
  }

  /**
   * Retrieves the MsgId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2Filter field
   */
  public String[] getMsgId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgId2Filter filter value from a formatted string
   *
   * @param _value the MsgId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgId2Filter filter field
   */
  public void setMsgId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgId2FilterFromFormattedString");
    try {
      this.setMsgId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdServFetch (boolean fetch) {
    this.MsgIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdServFetch () {
    return this.MsgIdServFetch;
  }
  /** Set the SortOrder for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdServSortOrder (Integer value) {
    this.MsgIdServSort = value;
  }
  /** Retrieve SortOrder for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdServSortOrder () {
    return this.MsgIdServSort;
  }
  /** Set the sort direction for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdServSortDirection (boolean ascending) {
    this.MsgIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdServSortDirection () {
    return this.MsgIdServSortAscending;
  }
  /** Set the field level filters for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgIdServ = value;
  }
  /** Retrieve filter for field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdServFilter () {
    return this.MsgIdServ;
  }

  /**
   * Retrieves the MsgIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServFilter field
   */
  public String[] getMsgIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdServFilter filter value from a formatted string
   *
   * @param _value the MsgIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdServFilter filter field
   */
  public void setMsgIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdServFilterFromFormattedString");
    try {
      this.setMsgIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SplitRowNum (CDR_BILLED.split_row_num)
   * @param fetch whether to fetch this field or not
   */
  public void setSplitRowNumFetch (boolean fetch) {
    this.SplitRowNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: SplitRowNum (CDR_BILLED.split_row_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getSplitRowNumFetch () {
    return this.SplitRowNumFetch;
  }
  /** Set the SortOrder for field: SplitRowNum (CDR_BILLED.split_row_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSplitRowNumSortOrder (Integer value) {
    this.SplitRowNumSort = value;
  }
  /** Retrieve SortOrder for field: SplitRowNum (CDR_BILLED.split_row_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSplitRowNumSortOrder () {
    return this.SplitRowNumSort;
  }
  /** Set the sort direction for field: SplitRowNum (CDR_BILLED.split_row_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSplitRowNumSortDirection (boolean ascending) {
    this.SplitRowNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SplitRowNum (CDR_BILLED.split_row_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSplitRowNumSortDirection () {
    return this.SplitRowNumSortAscending;
  }
  /** Set the field level filters for field: SplitRowNum (CDR_BILLED.split_row_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSplitRowNumFilter (IntegerFilter[] value) throws ServiceException {
    this.SplitRowNum = value;
  }
  /** Retrieve filter for field: SplitRowNum (CDR_BILLED.split_row_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSplitRowNumFilter () {
    return this.SplitRowNum;
  }

  /**
   * Retrieves the SplitRowNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SplitRowNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNumFilter field
   */
  public String[] getSplitRowNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSplitRowNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SplitRowNumFilter filter value from a formatted string
   *
   * @param _value the SplitRowNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SplitRowNumFilter filter field
   */
  public void setSplitRowNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSplitRowNumFilterFromFormattedString");
    try {
      this.setSplitRowNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (DESCRIPTIONS.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (DESCRIPTIONS.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (DESCRIPTIONS.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (DESCRIPTIONS.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
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
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
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


  public String toString() {
    return BilledUsageObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BilledUsageObjectKeyHelper.toMap(this, null);
  }
}
