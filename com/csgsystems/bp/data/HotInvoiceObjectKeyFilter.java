/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HotInvoiceObjectKeyFilter.java
 * Definition File: Customer/InterimBill.xml
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

/** Key Filter for HotInvoiceObject object. */
public class HotInvoiceObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field */
  public    StringFilter[] HotReqStatusQueue  = null;
  protected boolean HotReqStatusQueueFetch = false;
  protected boolean HotReqStatusQueueSortAscending = true;
  protected boolean HotReqStatusQueueCaseInsensitive = false;
  protected Integer HotReqStatusQueueSort = null;
  private String _objName = "HotInvoiceObjectKeyFilter";
  /** default constructor */
  public HotInvoiceObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public HotInvoiceObjectKeyFilter (HotInvoiceObjectKeyFilter other)
  {
    if (other == null) return;
    this.HotReqStatusQueue = other.HotReqStatusQueue;
    this.HotReqStatusQueueFetch = other.HotReqStatusQueueFetch;
    this.HotReqStatusQueueSort = other.HotReqStatusQueueSort;
    this.HotReqStatusQueueCaseInsensitive = other.HotReqStatusQueueCaseInsensitive;
    this.HotReqStatusQueueSortAscending = other.HotReqStatusQueueSortAscending;
  }
  /** Set the field level Fetch value for field: HotReqStatusQueue
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqStatusQueueFetch (boolean fetch)
  {
    this.HotReqStatusQueueFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqStatusQueue
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqStatusQueueFetch ()
  {
    return this.HotReqStatusQueueFetch;
  }
  /** Set the SortOrder for field: HotReqStatusQueue
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqStatusQueueSortOrder (Integer value)
  {
    this.HotReqStatusQueueSort = value;
  }
  /** Retrieve SortOrder for field: HotReqStatusQueue
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqStatusQueueSortOrder ()
  {
    return this.HotReqStatusQueueSort;
  }
  /** Set the sort direction for field: HotReqStatusQueue
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqStatusQueueSortDirection (boolean ascending)
  {
    this.HotReqStatusQueueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqStatusQueue
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqStatusQueueSortDirection ()
  {
    return this.HotReqStatusQueueSortAscending;
  }
  /** Set the case insensitive for field: HotReqStatusQueue
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setHotReqStatusQueueCaseInsensitive (boolean ascending)
  {
    this.HotReqStatusQueueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: HotReqStatusQueue
   * @return boolean whether the field is case insensitive
   */
  public boolean getHotReqStatusQueueCaseInsensitive ()
  {
    return this.HotReqStatusQueueCaseInsensitive;
  }
  /** Set the field level filters for field: HotReqStatusQueue
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqStatusQueueFilter (StringFilter[] value) throws ServiceException
  {
    this.HotReqStatusQueue = value;
  }
  /** Retrieve filter for field: HotReqStatusQueue
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getHotReqStatusQueueFilter ()
  {
    return this.HotReqStatusQueue;
  }
  public String toString() {
    return HotInvoiceObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HotInvoiceObjectKeyHelper.toMap(this, null);
  }
}
