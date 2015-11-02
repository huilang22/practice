/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDocumentObjectKeyFilter.java
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

/** Key Filter for CustomerDocumentObject object. */
public class CustomerDocumentObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CUSTOMER_DOCUMENT.document_id) */
  public    IntegerFilter[] DocumentId  = null;
  protected boolean DocumentIdFetch = false;
  protected boolean DocumentIdSortAscending = true;
  protected Integer DocumentIdSort = null;
  private String _objName = "CustomerDocumentObjectKeyFilter";
  /** default constructor */
  public CustomerDocumentObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CustomerDocumentObjectKeyFilter (CustomerDocumentObjectKeyFilter other)
  {
    if (other == null) return;
    this.DocumentId = other.DocumentId;
    this.DocumentIdFetch = other.DocumentIdFetch;
    this.DocumentIdSort = other.DocumentIdSort;
    this.DocumentIdSortAscending = other.DocumentIdSortAscending;
  }
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

  public String toString() {
    return CustomerDocumentObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CustomerDocumentObjectKeyHelper.toMap(this, null);
  }
}
