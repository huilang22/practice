/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtServerObjectFilter.java
 * Definition File: Customer/CustomerDtServer.xml
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
public class CustomerDtServerObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: CUSTOMER_DOCUMENT.document_id) */
  public    IntegerFilter[] DocumentId  = null;
  protected boolean DocumentIdFetch = false;
  protected boolean DocumentIdSortAscending = true;
  protected Integer DocumentIdSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.document_type_id) */
  public    IntegerFilter[] DocumentTypeId  = null;
  protected boolean DocumentTypeIdFetch = false;
  protected boolean DocumentTypeIdSortAscending = true;
  protected Integer DocumentTypeIdSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.source_id) */
  public    IntegerFilter[] SourceId  = null;
  protected boolean SourceIdFetch = false;
  protected boolean SourceIdSortAscending = true;
  protected Integer SourceIdSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.source_id2) */
  public    IntegerFilter[] SourceId2  = null;
  protected boolean SourceId2Fetch = false;
  protected boolean SourceId2SortAscending = true;
  protected Integer SourceId2Sort = null;
  /** raw field for: CUSTOMER_DOCUMENT.document_server) */
  public    StringFilter[] DocumentServer  = null;
  protected boolean DocumentServerFetch = false;
  protected boolean DocumentServerSortAscending = true;
  protected boolean DocumentServerCaseInsensitive = false;
  protected Integer DocumentServerSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.display_filename) */
  public    StringFilter[] DisplayFilename  = null;
  protected boolean DisplayFilenameFetch = false;
  protected boolean DisplayFilenameSortAscending = true;
  protected boolean DisplayFilenameCaseInsensitive = false;
  protected Integer DisplayFilenameSort = null;
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
  /** raw field for: BILL_INVOICE.statement_date) */
  public    DateFilter[] StatementDate  = null;
  protected boolean StatementDateFetch = false;
  protected boolean StatementDateSortAscending = true;
  protected Integer StatementDateSort = null;
  /** raw field for: BILL_INVOICE.prep_date) */
  public    DateFilter[] PrepDate  = null;
  protected boolean PrepDateFetch = false;
  protected boolean PrepDateSortAscending = true;
  protected Integer PrepDateSort = null;
  /** raw field for: BILL_INVOICE.payment_due_date) */
  public    DateFilter[] PaymentDueDate  = null;
  protected boolean PaymentDueDateFetch = false;
  protected boolean PaymentDueDateSortAscending = true;
  protected Integer PaymentDueDateSort = null;
  /** raw field for: BILL_INVOICE.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  private String _objName = "CustomerDtServerObjectFilter";
  /** default constructor */
  public CustomerDtServerObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CustomerDtServerObjectFilter (CustomerDtServerObjectFilter other)
  {
    if (other == null) return;
    this.DocumentId = other.DocumentId;
    this.DocumentIdFetch = other.DocumentIdFetch;
    this.DocumentIdSort = other.DocumentIdSort;
    this.DocumentIdSortAscending = other.DocumentIdSortAscending;
    this.DocumentTypeId = other.DocumentTypeId;
    this.DocumentTypeIdFetch = other.DocumentTypeIdFetch;
    this.DocumentTypeIdSort = other.DocumentTypeIdSort;
    this.DocumentTypeIdSortAscending = other.DocumentTypeIdSortAscending;
    this.SourceId = other.SourceId;
    this.SourceIdFetch = other.SourceIdFetch;
    this.SourceIdSort = other.SourceIdSort;
    this.SourceIdSortAscending = other.SourceIdSortAscending;
    this.SourceId2 = other.SourceId2;
    this.SourceId2Fetch = other.SourceId2Fetch;
    this.SourceId2Sort = other.SourceId2Sort;
    this.SourceId2SortAscending = other.SourceId2SortAscending;
    this.DocumentServer = other.DocumentServer;
    this.DocumentServerFetch = other.DocumentServerFetch;
    this.DocumentServerSort = other.DocumentServerSort;
    this.DocumentServerCaseInsensitive = other.DocumentServerCaseInsensitive;
    this.DocumentServerSortAscending = other.DocumentServerSortAscending;
    this.DisplayFilename = other.DisplayFilename;
    this.DisplayFilenameFetch = other.DisplayFilenameFetch;
    this.DisplayFilenameSort = other.DisplayFilenameSort;
    this.DisplayFilenameCaseInsensitive = other.DisplayFilenameCaseInsensitive;
    this.DisplayFilenameSortAscending = other.DisplayFilenameSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.StatementDate = other.StatementDate;
    this.StatementDateFetch = other.StatementDateFetch;
    this.StatementDateSort = other.StatementDateSort;
    this.StatementDateSortAscending = other.StatementDateSortAscending;
    this.PrepDate = other.PrepDate;
    this.PrepDateFetch = other.PrepDateFetch;
    this.PrepDateSort = other.PrepDateSort;
    this.PrepDateSortAscending = other.PrepDateSortAscending;
    this.PaymentDueDate = other.PaymentDueDate;
    this.PaymentDueDateFetch = other.PaymentDueDateFetch;
    this.PaymentDueDateSort = other.PaymentDueDateSort;
    this.PaymentDueDateSortAscending = other.PaymentDueDateSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;  }
  /** Set the field level Fetch value for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentIdFetch (boolean fetch) {
    this.DocumentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentIdFetch () {
    return this.DocumentIdFetch;
  }
  /** Set the SortOrder for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentIdSortOrder (Integer value) {
    this.DocumentIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentIdSortOrder () {
    return this.DocumentIdSort;
  }
  /** Set the sort direction for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentIdSortDirection (boolean ascending) {
    this.DocumentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentIdSortDirection () {
    return this.DocumentIdSortAscending;
  }
  /** Set the field level filters for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DocumentId = value;
  }
  /** Retrieve filter for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentIdFilter () {
    return this.DocumentId;
  }

  /**
   * Retrieves the DocumentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DocumentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentIdFilter field
   */
  public String[] getDocumentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDocumentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DocumentIdFilter filter value from a formatted string
   *
   * @param _value the DocumentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DocumentIdFilter filter field
   */
  public void setDocumentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDocumentIdFilterFromFormattedString");
    try {
      this.setDocumentIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentTypeIdFetch (boolean fetch) {
    this.DocumentTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentTypeIdFetch () {
    return this.DocumentTypeIdFetch;
  }
  /** Set the SortOrder for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentTypeIdSortOrder (Integer value) {
    this.DocumentTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentTypeIdSortOrder () {
    return this.DocumentTypeIdSort;
  }
  /** Set the sort direction for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentTypeIdSortDirection (boolean ascending) {
    this.DocumentTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentTypeIdSortDirection () {
    return this.DocumentTypeIdSortAscending;
  }
  /** Set the field level filters for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentTypeIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DocumentTypeId = value;
  }
  /** Retrieve filter for field: DocumentTypeId (CUSTOMER_DOCUMENT.document_type_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentTypeIdFilter () {
    return this.DocumentTypeId;
  }

  /**
   * Retrieves the DocumentTypeIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DocumentTypeIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentTypeIdFilter field
   */
  public String[] getDocumentTypeIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDocumentTypeIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentTypeIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DocumentTypeIdFilter filter value from a formatted string
   *
   * @param _value the DocumentTypeIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DocumentTypeIdFilter filter field
   */
  public void setDocumentTypeIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDocumentTypeIdFilterFromFormattedString");
    try {
      this.setDocumentTypeIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentTypeIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentTypeIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdFetch (boolean fetch) {
    this.SourceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdFetch () {
    return this.SourceIdFetch;
  }
  /** Set the SortOrder for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdSortOrder (Integer value) {
    this.SourceIdSort = value;
  }
  /** Retrieve SortOrder for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdSortOrder () {
    return this.SourceIdSort;
  }
  /** Set the sort direction for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdSortDirection (boolean ascending) {
    this.SourceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdSortDirection () {
    return this.SourceIdSortAscending;
  }
  /** Set the field level filters for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceId = value;
  }
  /** Retrieve filter for field: SourceId (CUSTOMER_DOCUMENT.source_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceIdFilter () {
    return this.SourceId;
  }

  /**
   * Retrieves the SourceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdFilter field
   */
  public String[] getSourceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceIdFilter filter value from a formatted string
   *
   * @param _value the SourceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceIdFilter filter field
   */
  public void setSourceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceIdFilterFromFormattedString");
    try {
      this.setSourceIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceId2Fetch (boolean fetch) {
    this.SourceId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceId2Fetch () {
    return this.SourceId2Fetch;
  }
  /** Set the SortOrder for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceId2SortOrder (Integer value) {
    this.SourceId2Sort = value;
  }
  /** Retrieve SortOrder for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceId2SortOrder () {
    return this.SourceId2Sort;
  }
  /** Set the sort direction for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceId2SortDirection (boolean ascending) {
    this.SourceId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceId2SortDirection () {
    return this.SourceId2SortAscending;
  }
  /** Set the field level filters for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceId2Filter (IntegerFilter[] value) throws ServiceException {
    this.SourceId2 = value;
  }
  /** Retrieve filter for field: SourceId2 (CUSTOMER_DOCUMENT.source_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceId2Filter () {
    return this.SourceId2;
  }

  /**
   * Retrieves the SourceId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId2Filter field
   */
  public String[] getSourceId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceId2Filter filter value from a formatted string
   *
   * @param _value the SourceId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceId2Filter filter field
   */
  public void setSourceId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceId2FilterFromFormattedString");
    try {
      this.setSourceId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentServerFetch (boolean fetch) {
    this.DocumentServerFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentServerFetch () {
    return this.DocumentServerFetch;
  }
  /** Set the SortOrder for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentServerSortOrder (Integer value) {
    this.DocumentServerSort = value;
  }
  /** Retrieve SortOrder for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentServerSortOrder () {
    return this.DocumentServerSort;
  }
  /** Set the sort direction for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentServerSortDirection (boolean ascending) {
    this.DocumentServerSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentServerSortDirection () {
    return this.DocumentServerSortAscending;
  }
  /** Set the case insensitive for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDocumentServerCaseInsensitive (boolean ascending) {
    this.DocumentServerCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDocumentServerCaseInsensitive () {
    return this.DocumentServerCaseInsensitive;
  }
  /** Set the field level filters for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentServerFilter (StringFilter[] value) throws ServiceException {
    this.DocumentServer = value;
  }
  /** Retrieve filter for field: DocumentServer (CUSTOMER_DOCUMENT.document_server)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDocumentServerFilter () {
    return this.DocumentServer;
  }

  /**
   * Retrieves the DocumentServerFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DocumentServerFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentServerFilter field
   */
  public String[] getDocumentServerFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentServerFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDocumentServerFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentServerFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentServerFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentServerFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DocumentServerFilter filter value from a formatted string
   *
   * @param _value the DocumentServerFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DocumentServerFilter filter field
   */
  public void setDocumentServerFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDocumentServerFilterFromFormattedString");
    try {
      this.setDocumentServerFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentServerFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentServerFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentServerFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayFilenameFetch (boolean fetch) {
    this.DisplayFilenameFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayFilenameFetch () {
    return this.DisplayFilenameFetch;
  }
  /** Set the SortOrder for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayFilenameSortOrder (Integer value) {
    this.DisplayFilenameSort = value;
  }
  /** Retrieve SortOrder for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayFilenameSortOrder () {
    return this.DisplayFilenameSort;
  }
  /** Set the sort direction for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayFilenameSortDirection (boolean ascending) {
    this.DisplayFilenameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayFilenameSortDirection () {
    return this.DisplayFilenameSortAscending;
  }
  /** Set the case insensitive for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayFilenameCaseInsensitive (boolean ascending) {
    this.DisplayFilenameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayFilenameCaseInsensitive () {
    return this.DisplayFilenameCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayFilenameFilter (StringFilter[] value) throws ServiceException {
    this.DisplayFilename = value;
  }
  /** Retrieve filter for field: DisplayFilename (CUSTOMER_DOCUMENT.display_filename)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayFilenameFilter () {
    return this.DisplayFilename;
  }

  /**
   * Retrieves the DisplayFilenameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayFilenameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayFilenameFilter field
   */
  public String[] getDisplayFilenameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayFilenameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayFilenameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayFilenameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayFilenameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayFilenameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayFilenameFilter filter value from a formatted string
   *
   * @param _value the DisplayFilenameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayFilenameFilter filter field
   */
  public void setDisplayFilenameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayFilenameFilterFromFormattedString");
    try {
      this.setDisplayFilenameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayFilenameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayFilenameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayFilenameFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: StatementDate (BILL_INVOICE.statement_date)
   * @param fetch whether to fetch this field or not
   */
  public void setStatementDateFetch (boolean fetch) {
    this.StatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementDate (BILL_INVOICE.statement_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementDateFetch () {
    return this.StatementDateFetch;
  }
  /** Set the SortOrder for field: StatementDate (BILL_INVOICE.statement_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementDateSortOrder (Integer value) {
    this.StatementDateSort = value;
  }
  /** Retrieve SortOrder for field: StatementDate (BILL_INVOICE.statement_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementDateSortOrder () {
    return this.StatementDateSort;
  }
  /** Set the sort direction for field: StatementDate (BILL_INVOICE.statement_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementDateSortDirection (boolean ascending) {
    this.StatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementDate (BILL_INVOICE.statement_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementDateSortDirection () {
    return this.StatementDateSortAscending;
  }
  /** Set the field level filters for field: StatementDate (BILL_INVOICE.statement_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementDateFilter (DateFilter[] value) throws ServiceException {
    this.StatementDate = value;
  }
  /** Retrieve filter for field: StatementDate (BILL_INVOICE.statement_date)
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


  /** Set the field level Fetch value for field: PrepDate (BILL_INVOICE.prep_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepDateFetch (boolean fetch) {
    this.PrepDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepDate (BILL_INVOICE.prep_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepDateFetch () {
    return this.PrepDateFetch;
  }
  /** Set the SortOrder for field: PrepDate (BILL_INVOICE.prep_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepDateSortOrder (Integer value) {
    this.PrepDateSort = value;
  }
  /** Retrieve SortOrder for field: PrepDate (BILL_INVOICE.prep_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepDateSortOrder () {
    return this.PrepDateSort;
  }
  /** Set the sort direction for field: PrepDate (BILL_INVOICE.prep_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepDateSortDirection (boolean ascending) {
    this.PrepDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepDate (BILL_INVOICE.prep_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepDateSortDirection () {
    return this.PrepDateSortAscending;
  }
  /** Set the field level filters for field: PrepDate (BILL_INVOICE.prep_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepDateFilter (DateFilter[] value) throws ServiceException {
    this.PrepDate = value;
  }
  /** Retrieve filter for field: PrepDate (BILL_INVOICE.prep_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrepDateFilter () {
    return this.PrepDate;
  }

  /**
   * Retrieves the PrepDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDateFilter field
   */
  public String[] getPrepDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDateFilter filter value from a formatted string
   *
   * @param _value the PrepDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepDateFilter filter field
   */
  public void setPrepDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFilterFromFormattedString");
    try {
      this.setPrepDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PrepDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDateFilter field
   */
  public String[] getPrepDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDateFilter filter value from a formatted string
   *
   * @param _value the PrepDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepDateFilter filter field
   */
  public void setPrepDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
    try {
      this.setPrepDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentDueDateFetch (boolean fetch) {
    this.PaymentDueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentDueDateFetch () {
    return this.PaymentDueDateFetch;
  }
  /** Set the SortOrder for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentDueDateSortOrder (Integer value) {
    this.PaymentDueDateSort = value;
  }
  /** Retrieve SortOrder for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentDueDateSortOrder () {
    return this.PaymentDueDateSort;
  }
  /** Set the sort direction for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentDueDateSortDirection (boolean ascending) {
    this.PaymentDueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentDueDateSortDirection () {
    return this.PaymentDueDateSortAscending;
  }
  /** Set the field level filters for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentDueDateFilter (DateFilter[] value) throws ServiceException {
    this.PaymentDueDate = value;
  }
  /** Retrieve filter for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
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


  /** Set the field level Fetch value for field: AccountInternalId (BILL_INVOICE.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (BILL_INVOICE.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (BILL_INVOICE.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (BILL_INVOICE.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (BILL_INVOICE.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (BILL_INVOICE.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (BILL_INVOICE.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (BILL_INVOICE.account_no)
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

  public String toString() {
    return CustomerDtServerObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CustomerDtServerObjectHelper.toMap(this, null);
  }
}
