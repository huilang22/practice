/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EnhancedNoteObjectKeyFilter.java
 * Definition File: Customer/EnhancedNote.xml
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

/** Key Filter for EnhancedNoteObject object. */
public class EnhancedNoteObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: NOTE.note_id) */
  public    BigIntegerFilter[] NoteId  = null;
  protected boolean NoteIdFetch = false;
  protected boolean NoteIdSortAscending = true;
  protected Integer NoteIdSort = null;
  private String _objName = "EnhancedNoteObjectKeyFilter";
  /** default constructor */
  public EnhancedNoteObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public EnhancedNoteObjectKeyFilter (EnhancedNoteObjectKeyFilter other)
  {
    if (other == null) return;
    this.NoteId = other.NoteId;
    this.NoteIdFetch = other.NoteIdFetch;
    this.NoteIdSort = other.NoteIdSort;
    this.NoteIdSortAscending = other.NoteIdSortAscending;
  }
  /** Set the field level Fetch value for field: NoteId (NOTE.note_id)
   * @param fetch whether to fetch this field or not
   */
  public void setNoteIdFetch (boolean fetch) {
    this.NoteIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoteId (NOTE.note_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoteIdFetch () {
    return this.NoteIdFetch;
  }
  /** Set the SortOrder for field: NoteId (NOTE.note_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoteIdSortOrder (Integer value) {
    this.NoteIdSort = value;
  }
  /** Retrieve SortOrder for field: NoteId (NOTE.note_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoteIdSortOrder () {
    return this.NoteIdSort;
  }
  /** Set the sort direction for field: NoteId (NOTE.note_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoteIdSortDirection (boolean ascending) {
    this.NoteIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoteId (NOTE.note_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoteIdSortDirection () {
    return this.NoteIdSortAscending;
  }
  /** Set the field level filters for field: NoteId (NOTE.note_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoteIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.NoteId = value;
  }
  /** Retrieve filter for field: NoteId (NOTE.note_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNoteIdFilter () {
    return this.NoteId;
  }

  /**
   * Retrieves the NoteIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoteIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteIdFilter field
   */
  public String[] getNoteIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoteIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoteIdFilter filter value from a formatted string
   *
   * @param _value the NoteIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoteIdFilter filter field
   */
  public void setNoteIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoteIdFilterFromFormattedString");
    try {
      this.setNoteIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteIdFilterFromFormattedString");
  }

  public String toString() {
    return EnhancedNoteObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return EnhancedNoteObjectKeyHelper.toMap(this, null);
  }
}
