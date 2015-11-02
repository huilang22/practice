/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EnhancedNoteObjectFilter.java
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
public class EnhancedNoteObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public EnhancedNoteObjectKeyFilter Key = null;
  /** raw field for: NOTE.parent_code) */
  public    IntegerFilter[] ParentCode  = null;
  protected boolean ParentCodeFetch = false;
  protected boolean ParentCodeSortAscending = true;
  protected Integer ParentCodeSort = null;
  /** raw field for: NOTE.parent_id1) */
  public    BigIntegerFilter[] ParentId1  = null;
  protected boolean ParentId1Fetch = false;
  protected boolean ParentId1SortAscending = true;
  protected Integer ParentId1Sort = null;
  /** raw field for: NOTE.parent_id2) */
  public    IntegerFilter[] ParentId2  = null;
  protected boolean ParentId2Fetch = false;
  protected boolean ParentId2SortAscending = true;
  protected Integer ParentId2Sort = null;
  /** raw field for: NOTE.legacy_note_code) */
  public    StringFilter[] LegacyNoteCode  = null;
  protected boolean LegacyNoteCodeFetch = false;
  protected boolean LegacyNoteCodeSortAscending = true;
  protected boolean LegacyNoteCodeCaseInsensitive = false;
  protected Integer LegacyNoteCodeSort = null;
  /** raw field for: NOTE.note_source) */
  public    IntegerFilter[] NoteSource  = null;
  protected boolean NoteSourceFetch = false;
  protected boolean NoteSourceSortAscending = true;
  protected Integer NoteSourceSort = null;
  /** raw field for: NOTE.is_permanent) */
  public    BooleanFilter[] IsPermanent  = null;
  protected boolean IsPermanentFetch = false;
  protected boolean IsPermanentSortAscending = true;
  protected Integer IsPermanentSort = null;
  /** raw field for: NOTE.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: NOTE.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: NOTE.note_text) */
  public    StringFilter[] NoteText  = null;
  protected boolean NoteTextFetch = false;
  protected boolean NoteTextSortAscending = true;
  protected boolean NoteTextCaseInsensitive = false;
  protected Integer NoteTextSort = null;
  /** raw field for: NOTE.note_template_id) */
  public    IntegerFilter[] NoteTemplateId  = null;
  protected boolean NoteTemplateIdFetch = false;
  protected boolean NoteTemplateIdSortAscending = true;
  protected Integer NoteTemplateIdSort = null;
  /** raw field for: NOTE.note_type_id) */
  public    IntegerFilter[] NoteTypeId  = null;
  protected boolean NoteTypeIdFetch = false;
  protected boolean NoteTypeIdSortAscending = true;
  protected Integer NoteTypeIdSort = null;
  /** raw field for: NOTE.note_reason_id) */
  public    IntegerFilter[] NoteReasonId  = null;
  protected boolean NoteReasonIdFetch = false;
  protected boolean NoteReasonIdSortAscending = true;
  protected Integer NoteReasonIdSort = null;
  private String _objName = "EnhancedNoteObjectFilter";
  /** default constructor */
  public EnhancedNoteObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public EnhancedNoteObjectFilter (EnhancedNoteObjectFilter other)
  {
    if (other == null) return;
    this.Key = new EnhancedNoteObjectKeyFilter (other.Key);
    this.ParentCode = other.ParentCode;
    this.ParentCodeFetch = other.ParentCodeFetch;
    this.ParentCodeSort = other.ParentCodeSort;
    this.ParentCodeSortAscending = other.ParentCodeSortAscending;
    this.ParentId1 = other.ParentId1;
    this.ParentId1Fetch = other.ParentId1Fetch;
    this.ParentId1Sort = other.ParentId1Sort;
    this.ParentId1SortAscending = other.ParentId1SortAscending;
    this.ParentId2 = other.ParentId2;
    this.ParentId2Fetch = other.ParentId2Fetch;
    this.ParentId2Sort = other.ParentId2Sort;
    this.ParentId2SortAscending = other.ParentId2SortAscending;
    this.LegacyNoteCode = other.LegacyNoteCode;
    this.LegacyNoteCodeFetch = other.LegacyNoteCodeFetch;
    this.LegacyNoteCodeSort = other.LegacyNoteCodeSort;
    this.LegacyNoteCodeCaseInsensitive = other.LegacyNoteCodeCaseInsensitive;
    this.LegacyNoteCodeSortAscending = other.LegacyNoteCodeSortAscending;
    this.NoteSource = other.NoteSource;
    this.NoteSourceFetch = other.NoteSourceFetch;
    this.NoteSourceSort = other.NoteSourceSort;
    this.NoteSourceSortAscending = other.NoteSourceSortAscending;
    this.IsPermanent = other.IsPermanent;
    this.IsPermanentFetch = other.IsPermanentFetch;
    this.IsPermanentSort = other.IsPermanentSort;
    this.IsPermanentSortAscending = other.IsPermanentSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.NoteText = other.NoteText;
    this.NoteTextFetch = other.NoteTextFetch;
    this.NoteTextSort = other.NoteTextSort;
    this.NoteTextCaseInsensitive = other.NoteTextCaseInsensitive;
    this.NoteTextSortAscending = other.NoteTextSortAscending;
    this.NoteTemplateId = other.NoteTemplateId;
    this.NoteTemplateIdFetch = other.NoteTemplateIdFetch;
    this.NoteTemplateIdSort = other.NoteTemplateIdSort;
    this.NoteTemplateIdSortAscending = other.NoteTemplateIdSortAscending;
    this.NoteTypeId = other.NoteTypeId;
    this.NoteTypeIdFetch = other.NoteTypeIdFetch;
    this.NoteTypeIdSort = other.NoteTypeIdSort;
    this.NoteTypeIdSortAscending = other.NoteTypeIdSortAscending;
    this.NoteReasonId = other.NoteReasonId;
    this.NoteReasonIdFetch = other.NoteReasonIdFetch;
    this.NoteReasonIdSort = other.NoteReasonIdSort;
    this.NoteReasonIdSortAscending = other.NoteReasonIdSortAscending;  }
  /** get the filter for this object's key
   * @return EnhancedNoteObjectKeyFilter
   */
  public EnhancedNoteObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (EnhancedNoteObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: NoteId (NOTE.note_id)
   * @param fetch whether to fetch this field or not
   */
  public void setNoteIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EnhancedNoteObjectKeyFilter ();
    this.Key.NoteIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoteId (NOTE.note_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoteIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.NoteIdFetch;
  }
  /** Set the SortOrder for field: NoteId (NOTE.note_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoteIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EnhancedNoteObjectKeyFilter ();
    this.Key.NoteIdSort = value;
  }
  /** Retrieve SortOrder for field: NoteId (NOTE.note_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoteIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.NoteIdSort;
  }
  /** Set the sort direction for field: NoteId (NOTE.note_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoteIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EnhancedNoteObjectKeyFilter ();
    this.Key.NoteIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoteId (NOTE.note_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoteIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.NoteIdSortAscending;
  }
  /** Set the field level filters for field: NoteId (NOTE.note_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoteIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EnhancedNoteObjectKeyFilter ();
    this.Key.NoteId = value;
  }
  /** Retrieve filter for field: NoteId (NOTE.note_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNoteIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.NoteId;
  }
  /** Set the field level Fetch value for field: ParentCode (NOTE.parent_code)
   * @param fetch whether to fetch this field or not
   */
  public void setParentCodeFetch (boolean fetch) {
    this.ParentCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentCode (NOTE.parent_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentCodeFetch () {
    return this.ParentCodeFetch;
  }
  /** Set the SortOrder for field: ParentCode (NOTE.parent_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentCodeSortOrder (Integer value) {
    this.ParentCodeSort = value;
  }
  /** Retrieve SortOrder for field: ParentCode (NOTE.parent_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentCodeSortOrder () {
    return this.ParentCodeSort;
  }
  /** Set the sort direction for field: ParentCode (NOTE.parent_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentCodeSortDirection (boolean ascending) {
    this.ParentCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentCode (NOTE.parent_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentCodeSortDirection () {
    return this.ParentCodeSortAscending;
  }
  /** Set the field level filters for field: ParentCode (NOTE.parent_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentCode = value;
  }
  /** Retrieve filter for field: ParentCode (NOTE.parent_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentCodeFilter () {
    return this.ParentCode;
  }

  /**
   * Retrieves the ParentCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentCodeFilter field
   */
  public String[] getParentCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentCodeFilter filter value from a formatted string
   *
   * @param _value the ParentCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentCodeFilter filter field
   */
  public void setParentCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentCodeFilterFromFormattedString");
    try {
      this.setParentCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentId1 (NOTE.parent_id1)
   * @param fetch whether to fetch this field or not
   */
  public void setParentId1Fetch (boolean fetch) {
    this.ParentId1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentId1 (NOTE.parent_id1)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentId1Fetch () {
    return this.ParentId1Fetch;
  }
  /** Set the SortOrder for field: ParentId1 (NOTE.parent_id1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentId1SortOrder (Integer value) {
    this.ParentId1Sort = value;
  }
  /** Retrieve SortOrder for field: ParentId1 (NOTE.parent_id1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentId1SortOrder () {
    return this.ParentId1Sort;
  }
  /** Set the sort direction for field: ParentId1 (NOTE.parent_id1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentId1SortDirection (boolean ascending) {
    this.ParentId1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentId1 (NOTE.parent_id1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentId1SortDirection () {
    return this.ParentId1SortAscending;
  }
  /** Set the field level filters for field: ParentId1 (NOTE.parent_id1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentId1Filter (BigIntegerFilter[] value) throws ServiceException {
    this.ParentId1 = value;
  }
  /** Retrieve filter for field: ParentId1 (NOTE.parent_id1)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getParentId1Filter () {
    return this.ParentId1;
  }

  /**
   * Retrieves the ParentId1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentId1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId1Filter field
   */
  public String[] getParentId1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentId1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentId1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentId1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentId1Filter filter value from a formatted string
   *
   * @param _value the ParentId1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentId1Filter filter field
   */
  public void setParentId1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentId1FilterFromFormattedString");
    try {
      this.setParentId1Filter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentId1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentId1FilterFromFormattedString");
  }

  /**
   * Sets the ParentId1Filter filter value from a formatted string
   *
   * @param _value the ParentId1Filter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentId1Filter filter field
   */
  public void setParentId1FilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentId1FilterFromFormattedCurrencyString");
    try {
      this.setParentId1Filter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentId1FilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentId1FilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the ParentId1Filter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentId1Filter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId1Filter field
   */

  public String[] getParentId1FilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId1FilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentId1Filter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentId1FilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentId1FilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: ParentId2 (NOTE.parent_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setParentId2Fetch (boolean fetch) {
    this.ParentId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentId2 (NOTE.parent_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentId2Fetch () {
    return this.ParentId2Fetch;
  }
  /** Set the SortOrder for field: ParentId2 (NOTE.parent_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentId2SortOrder (Integer value) {
    this.ParentId2Sort = value;
  }
  /** Retrieve SortOrder for field: ParentId2 (NOTE.parent_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentId2SortOrder () {
    return this.ParentId2Sort;
  }
  /** Set the sort direction for field: ParentId2 (NOTE.parent_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentId2SortDirection (boolean ascending) {
    this.ParentId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentId2 (NOTE.parent_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentId2SortDirection () {
    return this.ParentId2SortAscending;
  }
  /** Set the field level filters for field: ParentId2 (NOTE.parent_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentId2Filter (IntegerFilter[] value) throws ServiceException {
    this.ParentId2 = value;
  }
  /** Retrieve filter for field: ParentId2 (NOTE.parent_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentId2Filter () {
    return this.ParentId2;
  }

  /**
   * Retrieves the ParentId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId2Filter field
   */
  public String[] getParentId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentId2Filter filter value from a formatted string
   *
   * @param _value the ParentId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentId2Filter filter field
   */
  public void setParentId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentId2FilterFromFormattedString");
    try {
      this.setParentId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLegacyNoteCodeFetch (boolean fetch) {
    this.LegacyNoteCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLegacyNoteCodeFetch () {
    return this.LegacyNoteCodeFetch;
  }
  /** Set the SortOrder for field: LegacyNoteCode (NOTE.legacy_note_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLegacyNoteCodeSortOrder (Integer value) {
    this.LegacyNoteCodeSort = value;
  }
  /** Retrieve SortOrder for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLegacyNoteCodeSortOrder () {
    return this.LegacyNoteCodeSort;
  }
  /** Set the sort direction for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLegacyNoteCodeSortDirection (boolean ascending) {
    this.LegacyNoteCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLegacyNoteCodeSortDirection () {
    return this.LegacyNoteCodeSortAscending;
  }
  /** Set the case insensitive for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setLegacyNoteCodeCaseInsensitive (boolean ascending) {
    this.LegacyNoteCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getLegacyNoteCodeCaseInsensitive () {
    return this.LegacyNoteCodeCaseInsensitive;
  }
  /** Set the field level filters for field: LegacyNoteCode (NOTE.legacy_note_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLegacyNoteCodeFilter (StringFilter[] value) throws ServiceException {
    this.LegacyNoteCode = value;
  }
  /** Retrieve filter for field: LegacyNoteCode (NOTE.legacy_note_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getLegacyNoteCodeFilter () {
    return this.LegacyNoteCode;
  }

  /**
   * Retrieves the LegacyNoteCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LegacyNoteCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LegacyNoteCodeFilter field
   */
  public String[] getLegacyNoteCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLegacyNoteCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLegacyNoteCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLegacyNoteCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LegacyNoteCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLegacyNoteCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LegacyNoteCodeFilter filter value from a formatted string
   *
   * @param _value the LegacyNoteCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LegacyNoteCodeFilter filter field
   */
  public void setLegacyNoteCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLegacyNoteCodeFilterFromFormattedString");
    try {
      this.setLegacyNoteCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LegacyNoteCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLegacyNoteCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLegacyNoteCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoteSource (NOTE.note_source)
   * @param fetch whether to fetch this field or not
   */
  public void setNoteSourceFetch (boolean fetch) {
    this.NoteSourceFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoteSource (NOTE.note_source)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoteSourceFetch () {
    return this.NoteSourceFetch;
  }
  /** Set the SortOrder for field: NoteSource (NOTE.note_source)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoteSourceSortOrder (Integer value) {
    this.NoteSourceSort = value;
  }
  /** Retrieve SortOrder for field: NoteSource (NOTE.note_source)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoteSourceSortOrder () {
    return this.NoteSourceSort;
  }
  /** Set the sort direction for field: NoteSource (NOTE.note_source)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoteSourceSortDirection (boolean ascending) {
    this.NoteSourceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoteSource (NOTE.note_source)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoteSourceSortDirection () {
    return this.NoteSourceSortAscending;
  }
  /** Set the field level filters for field: NoteSource (NOTE.note_source)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoteSourceFilter (IntegerFilter[] value) throws ServiceException {
    this.NoteSource = value;
  }
  /** Retrieve filter for field: NoteSource (NOTE.note_source)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNoteSourceFilter () {
    return this.NoteSource;
  }

  /**
   * Retrieves the NoteSourceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoteSourceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteSourceFilter field
   */
  public String[] getNoteSourceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteSourceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoteSourceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteSourceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteSourceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoteSourceFilter filter value from a formatted string
   *
   * @param _value the NoteSourceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoteSourceFilter filter field
   */
  public void setNoteSourceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoteSourceFilterFromFormattedString");
    try {
      this.setNoteSourceFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteSourceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteSourceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsPermanent (NOTE.is_permanent)
   * @param fetch whether to fetch this field or not
   */
  public void setIsPermanentFetch (boolean fetch) {
    this.IsPermanentFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsPermanent (NOTE.is_permanent)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsPermanentFetch () {
    return this.IsPermanentFetch;
  }
  /** Set the SortOrder for field: IsPermanent (NOTE.is_permanent)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsPermanentSortOrder (Integer value) {
    this.IsPermanentSort = value;
  }
  /** Retrieve SortOrder for field: IsPermanent (NOTE.is_permanent)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsPermanentSortOrder () {
    return this.IsPermanentSort;
  }
  /** Set the sort direction for field: IsPermanent (NOTE.is_permanent)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsPermanentSortDirection (boolean ascending) {
    this.IsPermanentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsPermanent (NOTE.is_permanent)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsPermanentSortDirection () {
    return this.IsPermanentSortAscending;
  }
  /** Set the field level filters for field: IsPermanent (NOTE.is_permanent)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsPermanentFilter (BooleanFilter[] value) throws ServiceException {
    this.IsPermanent = value;
  }
  /** Retrieve filter for field: IsPermanent (NOTE.is_permanent)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsPermanentFilter () {
    return this.IsPermanent;
  }

  /**
   * Retrieves the IsPermanentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsPermanentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPermanentFilter field
   */
  public String[] getIsPermanentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPermanentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsPermanentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPermanentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPermanentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPermanentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsPermanentFilter filter value from a formatted string
   *
   * @param _value the IsPermanentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsPermanentFilter filter field
   */
  public void setIsPermanentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsPermanentFilterFromFormattedString");
    try {
      this.setIsPermanentFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPermanentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPermanentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPermanentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgWho (NOTE.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (NOTE.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (NOTE.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (NOTE.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (NOTE.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (NOTE.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (NOTE.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (NOTE.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (NOTE.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (NOTE.chg_who)
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

  /** Set the field level Fetch value for field: ChgDt (NOTE.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (NOTE.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (NOTE.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (NOTE.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (NOTE.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (NOTE.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (NOTE.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (NOTE.chg_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDtFilter () {
    return this.ChgDt;
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: NoteText (NOTE.note_text)
   * @param fetch whether to fetch this field or not
   */
  public void setNoteTextFetch (boolean fetch) {
    this.NoteTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoteText (NOTE.note_text)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoteTextFetch () {
    return this.NoteTextFetch;
  }
  /** Set the SortOrder for field: NoteText (NOTE.note_text)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoteTextSortOrder (Integer value) {
    this.NoteTextSort = value;
  }
  /** Retrieve SortOrder for field: NoteText (NOTE.note_text)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoteTextSortOrder () {
    return this.NoteTextSort;
  }
  /** Set the sort direction for field: NoteText (NOTE.note_text)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoteTextSortDirection (boolean ascending) {
    this.NoteTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoteText (NOTE.note_text)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoteTextSortDirection () {
    return this.NoteTextSortAscending;
  }
  /** Set the case insensitive for field: NoteText (NOTE.note_text)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setNoteTextCaseInsensitive (boolean ascending) {
    this.NoteTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: NoteText (NOTE.note_text)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getNoteTextCaseInsensitive () {
    return this.NoteTextCaseInsensitive;
  }
  /** Set the field level filters for field: NoteText (NOTE.note_text)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoteTextFilter (StringFilter[] value) throws ServiceException {
    this.NoteText = value;
  }
  /** Retrieve filter for field: NoteText (NOTE.note_text)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getNoteTextFilter () {
    return this.NoteText;
  }

  /**
   * Retrieves the NoteTextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoteTextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteTextFilter field
   */
  public String[] getNoteTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoteTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoteTextFilter filter value from a formatted string
   *
   * @param _value the NoteTextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoteTextFilter filter field
   */
  public void setNoteTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoteTextFilterFromFormattedString");
    try {
      this.setNoteTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteTextFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoteTemplateId (NOTE.note_template_id)
   * @param fetch whether to fetch this field or not
   */
  public void setNoteTemplateIdFetch (boolean fetch) {
    this.NoteTemplateIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoteTemplateId (NOTE.note_template_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoteTemplateIdFetch () {
    return this.NoteTemplateIdFetch;
  }
  /** Set the SortOrder for field: NoteTemplateId (NOTE.note_template_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoteTemplateIdSortOrder (Integer value) {
    this.NoteTemplateIdSort = value;
  }
  /** Retrieve SortOrder for field: NoteTemplateId (NOTE.note_template_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoteTemplateIdSortOrder () {
    return this.NoteTemplateIdSort;
  }
  /** Set the sort direction for field: NoteTemplateId (NOTE.note_template_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoteTemplateIdSortDirection (boolean ascending) {
    this.NoteTemplateIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoteTemplateId (NOTE.note_template_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoteTemplateIdSortDirection () {
    return this.NoteTemplateIdSortAscending;
  }
  /** Set the field level filters for field: NoteTemplateId (NOTE.note_template_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoteTemplateIdFilter (IntegerFilter[] value) throws ServiceException {
    this.NoteTemplateId = value;
  }
  /** Retrieve filter for field: NoteTemplateId (NOTE.note_template_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNoteTemplateIdFilter () {
    return this.NoteTemplateId;
  }

  /**
   * Retrieves the NoteTemplateIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoteTemplateIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteTemplateIdFilter field
   */
  public String[] getNoteTemplateIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTemplateIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoteTemplateIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTemplateIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteTemplateIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteTemplateIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoteTemplateIdFilter filter value from a formatted string
   *
   * @param _value the NoteTemplateIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoteTemplateIdFilter filter field
   */
  public void setNoteTemplateIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoteTemplateIdFilterFromFormattedString");
    try {
      this.setNoteTemplateIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteTemplateIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteTemplateIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteTemplateIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoteTypeId (NOTE.note_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setNoteTypeIdFetch (boolean fetch) {
    this.NoteTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoteTypeId (NOTE.note_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoteTypeIdFetch () {
    return this.NoteTypeIdFetch;
  }
  /** Set the SortOrder for field: NoteTypeId (NOTE.note_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoteTypeIdSortOrder (Integer value) {
    this.NoteTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: NoteTypeId (NOTE.note_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoteTypeIdSortOrder () {
    return this.NoteTypeIdSort;
  }
  /** Set the sort direction for field: NoteTypeId (NOTE.note_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoteTypeIdSortDirection (boolean ascending) {
    this.NoteTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoteTypeId (NOTE.note_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoteTypeIdSortDirection () {
    return this.NoteTypeIdSortAscending;
  }
  /** Set the field level filters for field: NoteTypeId (NOTE.note_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoteTypeIdFilter (IntegerFilter[] value) throws ServiceException {
    this.NoteTypeId = value;
  }
  /** Retrieve filter for field: NoteTypeId (NOTE.note_type_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNoteTypeIdFilter () {
    return this.NoteTypeId;
  }

  /**
   * Retrieves the NoteTypeIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoteTypeIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteTypeIdFilter field
   */
  public String[] getNoteTypeIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteTypeIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoteTypeIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteTypeIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteTypeIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoteTypeIdFilter filter value from a formatted string
   *
   * @param _value the NoteTypeIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoteTypeIdFilter filter field
   */
  public void setNoteTypeIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoteTypeIdFilterFromFormattedString");
    try {
      this.setNoteTypeIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteTypeIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteTypeIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoteReasonId (NOTE.note_reason_id)
   * @param fetch whether to fetch this field or not
   */
  public void setNoteReasonIdFetch (boolean fetch) {
    this.NoteReasonIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoteReasonId (NOTE.note_reason_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoteReasonIdFetch () {
    return this.NoteReasonIdFetch;
  }
  /** Set the SortOrder for field: NoteReasonId (NOTE.note_reason_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoteReasonIdSortOrder (Integer value) {
    this.NoteReasonIdSort = value;
  }
  /** Retrieve SortOrder for field: NoteReasonId (NOTE.note_reason_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoteReasonIdSortOrder () {
    return this.NoteReasonIdSort;
  }
  /** Set the sort direction for field: NoteReasonId (NOTE.note_reason_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoteReasonIdSortDirection (boolean ascending) {
    this.NoteReasonIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoteReasonId (NOTE.note_reason_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoteReasonIdSortDirection () {
    return this.NoteReasonIdSortAscending;
  }
  /** Set the field level filters for field: NoteReasonId (NOTE.note_reason_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoteReasonIdFilter (IntegerFilter[] value) throws ServiceException {
    this.NoteReasonId = value;
  }
  /** Retrieve filter for field: NoteReasonId (NOTE.note_reason_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNoteReasonIdFilter () {
    return this.NoteReasonId;
  }

  /**
   * Retrieves the NoteReasonIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoteReasonIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoteReasonIdFilter field
   */
  public String[] getNoteReasonIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoteReasonIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoteReasonIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoteReasonIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteReasonIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoteReasonIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoteReasonIdFilter filter value from a formatted string
   *
   * @param _value the NoteReasonIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoteReasonIdFilter filter field
   */
  public void setNoteReasonIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoteReasonIdFilterFromFormattedString");
    try {
      this.setNoteReasonIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoteReasonIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoteReasonIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoteReasonIdFilterFromFormattedString");
  }

  public String toString() {
    return EnhancedNoteObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return EnhancedNoteObjectHelper.toMap(this, null);
  }
}
