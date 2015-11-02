/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteTextObjectFilter.java
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
public class NoteTextObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public NoteTextObjectKeyFilter Key = null;
  private String _objName = "NoteTextObjectFilter";
  /** default constructor */
  public NoteTextObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public NoteTextObjectFilter (NoteTextObjectFilter other)
  {
    if (other == null) return;
    this.Key = new NoteTextObjectKeyFilter (other.Key);  }
  /** get the filter for this object's key
   * @return NoteTextObjectKeyFilter
   */
  public NoteTextObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (NoteTextObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: Code (NOTE_TEMPLATE_VALUES.legacy_note_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
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
  /** Set the field level Fetch value for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param fetch whether to fetch this field or not
   */
  public void setTextFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
    this.Key.TextFetch = fetch;
  }
  /** Retrieve Fetch value for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean the Fetch value for this field
   */
  public boolean getTextFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TextFetch;
  }
  /** Set the SortOrder for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTextSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
    this.Key.TextSort = value;
  }
  /** Retrieve SortOrder for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTextSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TextSort;
  }
  /** Set the sort direction for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTextSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
    this.Key.TextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTextSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TextSortAscending;
  }
  /** Set the case insensitive for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTextCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
    this.Key.TextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return boolean whether the field is case insensitive
   */
  public boolean getTextCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.TextCaseInsensitive;
  }
  /** Set the field level filters for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTextFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new NoteTextObjectKeyFilter ();
    this.Key.Text = value;
  }
  /** Retrieve filter for field: Text (NOTE_TEMPLATE_VALUES.note_template)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTextFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Text;
  }
  public String toString() {
    return NoteTextObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return NoteTextObjectHelper.toMap(this, null);
  }
}
