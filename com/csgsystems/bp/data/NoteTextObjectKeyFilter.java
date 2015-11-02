/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteTextObjectKeyFilter.java
 * Definition File: Admin/NoteText.xml
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

/** Key Filter for NoteTextObject object. */
public class NoteTextObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: NOTE_TEMPLATE_VALUES.legacy_note_code) */
  public    StringFilter[] Code  = null;
  protected boolean CodeFetch = false;
  protected boolean CodeSortAscending = true;
  protected boolean CodeCaseInsensitive = false;
  protected Integer CodeSort = null;
  /** raw field for: NOTE_TEMPLATE_VALUES.note_template) */
  public    StringFilter[] Text  = null;
  protected boolean TextFetch = false;
  protected boolean TextSortAscending = true;
  protected boolean TextCaseInsensitive = false;
  protected Integer TextSort = null;
  private String _objName = "NoteTextObjectKeyFilter";
  /** default constructor */
  public NoteTextObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public NoteTextObjectKeyFilter (NoteTextObjectKeyFilter other)
  {
    if (other == null) return;
    this.Code = other.Code;
    this.CodeFetch = other.CodeFetch;
    this.CodeSort = other.CodeSort;
    this.CodeCaseInsensitive = other.CodeCaseInsensitive;
    this.CodeSortAscending = other.CodeSortAscending;
    this.Text = other.Text;
    this.TextFetch = other.TextFetch;
    this.TextSort = other.TextSort;
    this.TextCaseInsensitive = other.TextCaseInsensitive;
    this.TextSortAscending = other.TextSortAscending;
  }
  /** Set the field level Fetch value for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCodeFetch (boolean fetch) {
    this.CodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCodeFetch () {
    return this.CodeFetch;
  }
  /** Set the SortOrder for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCodeSortOrder (Integer value) {
    this.CodeSort = value;
  }
  /** Retrieve SortOrder for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCodeSortOrder () {
    return this.CodeSort;
  }
  /** Set the sort direction for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCodeSortDirection (boolean ascending) {
    this.CodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCodeSortDirection () {
    return this.CodeSortAscending;
  }
  /** Set the case insensitive for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCodeCaseInsensitive (boolean ascending) {
    this.CodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCodeCaseInsensitive () {
    return this.CodeCaseInsensitive;
  }
  /** Set the field level filters for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCodeFilter (StringFilter[] value) throws ServiceException {
    this.Code = value;
  }
  /** Retrieve filter for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCodeFilter () {
    return this.Code;
  }

  /**
   * Retrieves the CodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CodeFilter field
   */
  public String[] getCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CodeFilter filter value from a formatted string
   *
   * @param _value the CodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CodeFilter filter field
   */
  public void setCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCodeFilterFromFormattedString");
    try {
      this.setCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param fetch whether to fetch this field or not
   */
  public void setTextFetch (boolean fetch) {
    this.TextFetch = fetch;
  }
  /** Retrieve Fetch value for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean the Fetch value for this field
   */
  public boolean getTextFetch () {
    return this.TextFetch;
  }
  /** Set the SortOrder for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTextSortOrder (Integer value) {
    this.TextSort = value;
  }
  /** Retrieve SortOrder for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTextSortOrder () {
    return this.TextSort;
  }
  /** Set the sort direction for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTextSortDirection (boolean ascending) {
    this.TextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTextSortDirection () {
    return this.TextSortAscending;
  }
  /** Set the case insensitive for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTextCaseInsensitive (boolean ascending) {
    this.TextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTextCaseInsensitive () {
    return this.TextCaseInsensitive;
  }
  /** Set the field level filters for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTextFilter (StringFilter[] value) throws ServiceException {
    this.Text = value;
  }
  /** Retrieve filter for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTextFilter () {
    return this.Text;
  }

  /**
   * Retrieves the TextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TextFilter field
   */
  public String[] getTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TextFilter filter value from a formatted string
   *
   * @param _value the TextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TextFilter filter field
   */
  public void setTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTextFilterFromFormattedString");
    try {
      this.setTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTextFilterFromFormattedString");
  }

  public String toString() {
    return NoteTextObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return NoteTextObjectKeyHelper.toMap(this, null);
  }
}
