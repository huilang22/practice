/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DocumentTypeRefObjectKeyFilter.java
 * Definition File: Admin/DocumentTypeRef.xml
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

/** Key Filter for DocumentTypeRefObject object. */
public class DocumentTypeRefObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: DOCUMENT_TYPE_REF.document_type_id) */
  public    IntegerFilter[] DocumentTypeId  = null;
  protected boolean DocumentTypeIdFetch = false;
  protected boolean DocumentTypeIdSortAscending = true;
  protected Integer DocumentTypeIdSort = null;
  private String _objName = "DocumentTypeRefObjectKeyFilter";
  /** default constructor */
  public DocumentTypeRefObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public DocumentTypeRefObjectKeyFilter (DocumentTypeRefObjectKeyFilter other)
  {
    if (other == null) return;
    this.DocumentTypeId = other.DocumentTypeId;
    this.DocumentTypeIdFetch = other.DocumentTypeIdFetch;
    this.DocumentTypeIdSort = other.DocumentTypeIdSort;
    this.DocumentTypeIdSortAscending = other.DocumentTypeIdSortAscending;
  }
  /** Set the field level Fetch value for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentTypeIdFetch (boolean fetch) {
    this.DocumentTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentTypeIdFetch () {
    return this.DocumentTypeIdFetch;
  }
  /** Set the SortOrder for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentTypeIdSortOrder (Integer value) {
    this.DocumentTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentTypeIdSortOrder () {
    return this.DocumentTypeIdSort;
  }
  /** Set the sort direction for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentTypeIdSortDirection (boolean ascending) {
    this.DocumentTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentTypeIdSortDirection () {
    return this.DocumentTypeIdSortAscending;
  }
  /** Set the field level filters for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentTypeIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DocumentTypeId = value;
  }
  /** Retrieve filter for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
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

  public String toString() {
    return DocumentTypeRefObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return DocumentTypeRefObjectKeyHelper.toMap(this, null);
  }
}
