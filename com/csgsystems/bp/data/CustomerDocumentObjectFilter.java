/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDocumentObjectFilter.java
 * Definition File: Customer/CustomerDocument.xml
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
public class CustomerDocumentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CustomerDocumentObjectKeyFilter Key = null;
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
  /** raw field for: CUSTOMER_DOCUMENT.bill_disp_meth) */
  public    IntegerFilter[] BillDispMeth  = null;
  protected boolean BillDispMethFetch = false;
  protected boolean BillDispMethSortAscending = true;
  protected Integer BillDispMethSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.bill_fmt_opt) */
  public    IntegerFilter[] BillFmtOpt  = null;
  protected boolean BillFmtOptFetch = false;
  protected boolean BillFmtOptSortAscending = true;
  protected Integer BillFmtOptSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.bill_fmt_type) */
  public    StringFilter[] BillFmtType  = null;
  protected boolean BillFmtTypeFetch = false;
  protected boolean BillFmtTypeSortAscending = true;
  protected boolean BillFmtTypeCaseInsensitive = false;
  protected Integer BillFmtTypeSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.address_id) */
  public    BigIntegerFilter[] AddressId  = null;
  protected boolean AddressIdFetch = false;
  protected boolean AddressIdSortAscending = true;
  protected Integer AddressIdSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.status) */
  public    IntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: CUSTOMER_DOCUMENT.processed_date) */
  public    DateFilter[] ProcessedDate  = null;
  protected boolean ProcessedDateFetch = false;
  protected boolean ProcessedDateSortAscending = true;
  protected Integer ProcessedDateSort = null;
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
  private String _objName = "CustomerDocumentObjectFilter";
  /** default constructor */
  public CustomerDocumentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CustomerDocumentObjectFilter (CustomerDocumentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CustomerDocumentObjectKeyFilter (other.Key);
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
    this.BillDispMeth = other.BillDispMeth;
    this.BillDispMethFetch = other.BillDispMethFetch;
    this.BillDispMethSort = other.BillDispMethSort;
    this.BillDispMethSortAscending = other.BillDispMethSortAscending;
    this.BillFmtOpt = other.BillFmtOpt;
    this.BillFmtOptFetch = other.BillFmtOptFetch;
    this.BillFmtOptSort = other.BillFmtOptSort;
    this.BillFmtOptSortAscending = other.BillFmtOptSortAscending;
    this.BillFmtType = other.BillFmtType;
    this.BillFmtTypeFetch = other.BillFmtTypeFetch;
    this.BillFmtTypeSort = other.BillFmtTypeSort;
    this.BillFmtTypeCaseInsensitive = other.BillFmtTypeCaseInsensitive;
    this.BillFmtTypeSortAscending = other.BillFmtTypeSortAscending;
    this.AddressId = other.AddressId;
    this.AddressIdFetch = other.AddressIdFetch;
    this.AddressIdSort = other.AddressIdSort;
    this.AddressIdSortAscending = other.AddressIdSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.ProcessedDate = other.ProcessedDate;
    this.ProcessedDateFetch = other.ProcessedDateFetch;
    this.ProcessedDateSort = other.ProcessedDateSort;
    this.ProcessedDateSortAscending = other.ProcessedDateSortAscending;
    this.DocumentServer = other.DocumentServer;
    this.DocumentServerFetch = other.DocumentServerFetch;
    this.DocumentServerSort = other.DocumentServerSort;
    this.DocumentServerCaseInsensitive = other.DocumentServerCaseInsensitive;
    this.DocumentServerSortAscending = other.DocumentServerSortAscending;
    this.DisplayFilename = other.DisplayFilename;
    this.DisplayFilenameFetch = other.DisplayFilenameFetch;
    this.DisplayFilenameSort = other.DisplayFilenameSort;
    this.DisplayFilenameCaseInsensitive = other.DisplayFilenameCaseInsensitive;
    this.DisplayFilenameSortAscending = other.DisplayFilenameSortAscending;  }
  /** get the filter for this object's key
   * @return CustomerDocumentObjectKeyFilter
   */
  public CustomerDocumentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CustomerDocumentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CustomerDocumentObjectKeyFilter ();
    this.Key.DocumentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.DocumentIdFetch;
  }
  /** Set the SortOrder for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CustomerDocumentObjectKeyFilter ();
    this.Key.DocumentIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.DocumentIdSort;
  }
  /** Set the sort direction for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CustomerDocumentObjectKeyFilter ();
    this.Key.DocumentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.DocumentIdSortAscending;
  }
  /** Set the field level filters for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CustomerDocumentObjectKeyFilter ();
    this.Key.DocumentId = value;
  }
  /** Retrieve filter for field: DocumentId (CUSTOMER_DOCUMENT.document_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.DocumentId;
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

  /** Set the field level Fetch value for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @param fetch whether to fetch this field or not
   */
  public void setBillDispMethFetch (boolean fetch) {
    this.BillDispMethFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillDispMethFetch () {
    return this.BillDispMethFetch;
  }
  /** Set the SortOrder for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillDispMethSortOrder (Integer value) {
    this.BillDispMethSort = value;
  }
  /** Retrieve SortOrder for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillDispMethSortOrder () {
    return this.BillDispMethSort;
  }
  /** Set the sort direction for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillDispMethSortDirection (boolean ascending) {
    this.BillDispMethSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillDispMethSortDirection () {
    return this.BillDispMethSortAscending;
  }
  /** Set the field level filters for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillDispMethFilter (IntegerFilter[] value) throws ServiceException {
    this.BillDispMeth = value;
  }
  /** Retrieve filter for field: BillDispMeth (CUSTOMER_DOCUMENT.bill_disp_meth)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillDispMethFilter () {
    return this.BillDispMeth;
  }

  /**
   * Retrieves the BillDispMethFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillDispMethFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDispMethFilter field
   */
  public String[] getBillDispMethFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillDispMethFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMethFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillDispMethFilter filter value from a formatted string
   *
   * @param _value the BillDispMethFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillDispMethFilter filter field
   */
  public void setBillDispMethFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDispMethFilterFromFormattedString");
    try {
      this.setBillDispMethFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMethFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDispMethFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFmtOptFetch (boolean fetch) {
    this.BillFmtOptFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFmtOptFetch () {
    return this.BillFmtOptFetch;
  }
  /** Set the SortOrder for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFmtOptSortOrder (Integer value) {
    this.BillFmtOptSort = value;
  }
  /** Retrieve SortOrder for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFmtOptSortOrder () {
    return this.BillFmtOptSort;
  }
  /** Set the sort direction for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFmtOptSortDirection (boolean ascending) {
    this.BillFmtOptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFmtOptSortDirection () {
    return this.BillFmtOptSortAscending;
  }
  /** Set the field level filters for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFmtOptFilter (IntegerFilter[] value) throws ServiceException {
    this.BillFmtOpt = value;
  }
  /** Retrieve filter for field: BillFmtOpt (CUSTOMER_DOCUMENT.bill_fmt_opt)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillFmtOptFilter () {
    return this.BillFmtOpt;
  }

  /**
   * Retrieves the BillFmtOptFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFmtOptFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFmtOptFilter field
   */
  public String[] getBillFmtOptFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFmtOptFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFmtOptFilter filter value from a formatted string
   *
   * @param _value the BillFmtOptFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFmtOptFilter filter field
   */
  public void setBillFmtOptFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFmtOptFilterFromFormattedString");
    try {
      this.setBillFmtOptFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtOptFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtOptFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFmtTypeFetch (boolean fetch) {
    this.BillFmtTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFmtTypeFetch () {
    return this.BillFmtTypeFetch;
  }
  /** Set the SortOrder for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFmtTypeSortOrder (Integer value) {
    this.BillFmtTypeSort = value;
  }
  /** Retrieve SortOrder for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFmtTypeSortOrder () {
    return this.BillFmtTypeSort;
  }
  /** Set the sort direction for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFmtTypeSortDirection (boolean ascending) {
    this.BillFmtTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFmtTypeSortDirection () {
    return this.BillFmtTypeSortAscending;
  }
  /** Set the case insensitive for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillFmtTypeCaseInsensitive (boolean ascending) {
    this.BillFmtTypeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillFmtTypeCaseInsensitive () {
    return this.BillFmtTypeCaseInsensitive;
  }
  /** Set the field level filters for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFmtTypeFilter (StringFilter[] value) throws ServiceException {
    this.BillFmtType = value;
  }
  /** Retrieve filter for field: BillFmtType (CUSTOMER_DOCUMENT.bill_fmt_type)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillFmtTypeFilter () {
    return this.BillFmtType;
  }

  /**
   * Retrieves the BillFmtTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFmtTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFmtTypeFilter field
   */
  public String[] getBillFmtTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFmtTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFmtTypeFilter filter value from a formatted string
   *
   * @param _value the BillFmtTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFmtTypeFilter filter field
   */
  public void setBillFmtTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFmtTypeFilterFromFormattedString");
    try {
      this.setBillFmtTypeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressIdFetch (boolean fetch) {
    this.AddressIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressIdFetch () {
    return this.AddressIdFetch;
  }
  /** Set the SortOrder for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressIdSortOrder (Integer value) {
    this.AddressIdSort = value;
  }
  /** Retrieve SortOrder for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressIdSortOrder () {
    return this.AddressIdSort;
  }
  /** Set the sort direction for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressIdSortDirection (boolean ascending) {
    this.AddressIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressIdSortDirection () {
    return this.AddressIdSortAscending;
  }
  /** Set the field level filters for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AddressId = value;
  }
  /** Retrieve filter for field: AddressId (CUSTOMER_DOCUMENT.address_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAddressIdFilter () {
    return this.AddressId;
  }

  /**
   * Retrieves the AddressIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressIdFilter field
   */
  public String[] getAddressIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressIdFilter filter value from a formatted string
   *
   * @param _value the AddressIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressIdFilter filter field
   */
  public void setAddressIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressIdFilterFromFormattedString");
    try {
      this.setAddressIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Status (CUSTOMER_DOCUMENT.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (CUSTOMER_DOCUMENT.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (CUSTOMER_DOCUMENT.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (CUSTOMER_DOCUMENT.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (CUSTOMER_DOCUMENT.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (CUSTOMER_DOCUMENT.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (CUSTOMER_DOCUMENT.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (CUSTOMER_DOCUMENT.status)
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

  /** Set the field level Fetch value for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @param fetch whether to fetch this field or not
   */
  public void setProcessedDateFetch (boolean fetch) {
    this.ProcessedDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getProcessedDateFetch () {
    return this.ProcessedDateFetch;
  }
  /** Set the SortOrder for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProcessedDateSortOrder (Integer value) {
    this.ProcessedDateSort = value;
  }
  /** Retrieve SortOrder for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProcessedDateSortOrder () {
    return this.ProcessedDateSort;
  }
  /** Set the sort direction for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProcessedDateSortDirection (boolean ascending) {
    this.ProcessedDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProcessedDateSortDirection () {
    return this.ProcessedDateSortAscending;
  }
  /** Set the field level filters for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProcessedDateFilter (DateFilter[] value) throws ServiceException {
    this.ProcessedDate = value;
  }
  /** Retrieve filter for field: ProcessedDate (CUSTOMER_DOCUMENT.processed_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getProcessedDateFilter () {
    return this.ProcessedDate;
  }

  /**
   * Retrieves the ProcessedDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProcessedDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessedDateFilter field
   */
  public String[] getProcessedDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessedDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProcessedDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessedDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessedDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProcessedDateFilter filter value from a formatted string
   *
   * @param _value the ProcessedDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProcessedDateFilter filter field
   */
  public void setProcessedDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProcessedDateFilterFromFormattedString");
    try {
      this.setProcessedDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessedDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProcessedDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ProcessedDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProcessedDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessedDateFilter field
   */
  public String[] getProcessedDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessedDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProcessedDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessedDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessedDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ProcessedDateFilter filter value from a formatted string
   *
   * @param _value the ProcessedDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProcessedDateFilter filter field
   */
  public void setProcessedDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProcessedDateFilterFromFormattedDateTimeString");
    try {
      this.setProcessedDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessedDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProcessedDateFilterFromFormattedDateTimeString");
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

  public String toString() {
    return CustomerDocumentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CustomerDocumentObjectHelper.toMap(this, null);
  }
}
