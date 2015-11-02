/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteCodeObjectFilter.java
 * Definition File: Admin/NoteCode.xml
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
public class NoteCodeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public NoteCodeObjectKeyFilter Key = null;
  private String _objName = "NoteCodeObjectFilter";
  /** default constructor */
  public NoteCodeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public NoteCodeObjectFilter (NoteCodeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new NoteCodeObjectKeyFilter (other.Key);  }
  /** get the filter for this object's key
   * @return NoteCodeObjectKeyFilter
   */
  public NoteCodeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (NoteCodeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.CodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CodeFetch;
  }
  /** Set the SortOrder for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.CodeSort = value;
  }
  /** Retrieve SortOrder for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CodeSort;
  }
  /** Set the sort direction for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.CodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CodeSortAscending;
  }
  /** Set the case insensitive for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCodeCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.CodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return boolean whether the field is case insensitive
   */
  public boolean getCodeCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.CodeCaseInsensitive;
  }
  /** Set the field level filters for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCodeFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.Code = value;
  }
  /** Retrieve filter for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Code;
  }
  /** Set the field level Fetch value for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new NoteCodeObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (NOTE_TEMPLATE_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  public String toString() {
    return NoteCodeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return NoteCodeObjectHelper.toMap(this, null);
  }
}
