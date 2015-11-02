/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupFunctionObjectFilter.java
 * Definition File: Admin/CsrGroupFunction.xml
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
public class CsrGroupFunctionObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CsrGroupFunctionObjectKeyFilter Key = null;
  private String _objName = "CsrGroupFunctionObjectFilter";
  /** default constructor */
  public CsrGroupFunctionObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CsrGroupFunctionObjectFilter (CsrGroupFunctionObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CsrGroupFunctionObjectKeyFilter (other.Key);  }
  /** get the filter for this object's key
   * @return CsrGroupFunctionObjectKeyFilter
   */
  public CsrGroupFunctionObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CsrGroupFunctionObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: GroupName (GROUP_FUNCTION.group_name)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupNameFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.GroupNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupName (GROUP_FUNCTION.group_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupNameFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupNameFetch;
  }
  /** Set the SortOrder for field: GroupName (GROUP_FUNCTION.group_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupNameSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.GroupNameSort = value;
  }
  /** Retrieve SortOrder for field: GroupName (GROUP_FUNCTION.group_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupNameSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupNameSort;
  }
  /** Set the sort direction for field: GroupName (GROUP_FUNCTION.group_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupNameSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.GroupNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupName (GROUP_FUNCTION.group_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupNameSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupNameSortAscending;
  }
  /** Set the case insensitive for field: GroupName (GROUP_FUNCTION.group_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGroupNameCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.GroupNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: GroupName (GROUP_FUNCTION.group_name)
   * @return boolean whether the field is case insensitive
   */
  public boolean getGroupNameCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.GroupNameCaseInsensitive;
  }
  /** Set the field level filters for field: GroupName (GROUP_FUNCTION.group_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupNameFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.GroupName = value;
  }
  /** Retrieve filter for field: GroupName (GROUP_FUNCTION.group_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGroupNameFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupName;
  }
  /** Set the field level Fetch value for field: ModuleName (GROUP_FUNCTION.module_name)
   * @param fetch whether to fetch this field or not
   */
  public void setModuleNameFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.ModuleNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getModuleNameFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ModuleNameFetch;
  }
  /** Set the SortOrder for field: ModuleName (GROUP_FUNCTION.module_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModuleNameSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.ModuleNameSort = value;
  }
  /** Retrieve SortOrder for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModuleNameSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ModuleNameSort;
  }
  /** Set the sort direction for field: ModuleName (GROUP_FUNCTION.module_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModuleNameSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.ModuleNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModuleNameSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ModuleNameSortAscending;
  }
  /** Set the case insensitive for field: ModuleName (GROUP_FUNCTION.module_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModuleNameCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.ModuleNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return boolean whether the field is case insensitive
   */
  public boolean getModuleNameCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.ModuleNameCaseInsensitive;
  }
  /** Set the field level filters for field: ModuleName (GROUP_FUNCTION.module_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModuleNameFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrGroupFunctionObjectKeyFilter ();
    this.Key.ModuleName = value;
  }
  /** Retrieve filter for field: ModuleName (GROUP_FUNCTION.module_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModuleNameFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ModuleName;
  }
  public String toString() {
    return CsrGroupFunctionObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CsrGroupFunctionObjectHelper.toMap(this, null);
  }
}
