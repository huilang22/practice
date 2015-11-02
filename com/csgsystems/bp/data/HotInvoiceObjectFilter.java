/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HotInvoiceObjectFilter.java
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
public class HotInvoiceObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HotInvoiceObjectKeyFilter Key = null;
  /** raw field */
  public    IntegerFilter[] HotReqId  = null;
  protected boolean HotReqIdFetch = false;
  protected boolean HotReqIdSortAscending = true;
  protected Integer HotReqIdSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqReturnCustom  = null;
  protected boolean HotReqReturnCustomFetch = false;
  protected boolean HotReqReturnCustomSortAscending = true;
  protected Integer HotReqReturnCustomSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqReturnStatus  = null;
  protected boolean HotReqReturnStatusFetch = false;
  protected boolean HotReqReturnStatusSortAscending = true;
  protected Integer HotReqReturnStatusSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqBillRefNo  = null;
  protected boolean HotReqBillRefNoFetch = false;
  protected boolean HotReqBillRefNoSortAscending = true;
  protected Integer HotReqBillRefNoSort = null;
  /** raw field */
  public    IntegerFilter[] HotReqBillRefResets  = null;
  protected boolean HotReqBillRefResetsFetch = false;
  protected boolean HotReqBillRefResetsSortAscending = true;
  protected Integer HotReqBillRefResetsSort = null;
  private String _objName = "HotInvoiceObjectFilter";
  /** default constructor */
  public HotInvoiceObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HotInvoiceObjectFilter (HotInvoiceObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HotInvoiceObjectKeyFilter (other.Key);
    this.HotReqId = other.HotReqId;
    this.HotReqIdFetch = other.HotReqIdFetch;
    this.HotReqIdSort = other.HotReqIdSort;
    this.HotReqIdSortAscending = other.HotReqIdSortAscending;
    this.HotReqReturnCustom = other.HotReqReturnCustom;
    this.HotReqReturnCustomFetch = other.HotReqReturnCustomFetch;
    this.HotReqReturnCustomSort = other.HotReqReturnCustomSort;
    this.HotReqReturnCustomSortAscending = other.HotReqReturnCustomSortAscending;
    this.HotReqReturnStatus = other.HotReqReturnStatus;
    this.HotReqReturnStatusFetch = other.HotReqReturnStatusFetch;
    this.HotReqReturnStatusSort = other.HotReqReturnStatusSort;
    this.HotReqReturnStatusSortAscending = other.HotReqReturnStatusSortAscending;
    this.HotReqBillRefNo = other.HotReqBillRefNo;
    this.HotReqBillRefNoFetch = other.HotReqBillRefNoFetch;
    this.HotReqBillRefNoSort = other.HotReqBillRefNoSort;
    this.HotReqBillRefNoSortAscending = other.HotReqBillRefNoSortAscending;
    this.HotReqBillRefResets = other.HotReqBillRefResets;
    this.HotReqBillRefResetsFetch = other.HotReqBillRefResetsFetch;
    this.HotReqBillRefResetsSort = other.HotReqBillRefResetsSort;
    this.HotReqBillRefResetsSortAscending = other.HotReqBillRefResetsSortAscending;  }
  /** get the filter for this object's key
   * @return HotInvoiceObjectKeyFilter
   */
  public HotInvoiceObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HotInvoiceObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: HotReqStatusQueue
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqStatusQueueFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HotInvoiceObjectKeyFilter ();
    this.Key.HotReqStatusQueueFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqStatusQueue
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqStatusQueueFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.HotReqStatusQueueFetch;
  }
  /** Set the SortOrder for field: HotReqStatusQueue
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqStatusQueueSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HotInvoiceObjectKeyFilter ();
    this.Key.HotReqStatusQueueSort = value;
  }
  /** Retrieve SortOrder for field: HotReqStatusQueue
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqStatusQueueSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.HotReqStatusQueueSort;
  }
  /** Set the sort direction for field: HotReqStatusQueue
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqStatusQueueSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HotInvoiceObjectKeyFilter ();
    this.Key.HotReqStatusQueueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqStatusQueue
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqStatusQueueSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.HotReqStatusQueueSortAscending;
  }
  /** Set the case insensitive for field: HotReqStatusQueue
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setHotReqStatusQueueCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new HotInvoiceObjectKeyFilter ();
    this.Key.HotReqStatusQueueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: HotReqStatusQueue
   * @return boolean whether the field is Case Insensitive
   */
  public boolean getHotReqStatusQueueCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.HotReqStatusQueueCaseInsensitive;
  }
  /** Set the field level filters for field: HotReqStatusQueue
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqStatusQueueFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HotInvoiceObjectKeyFilter ();
    this.Key.HotReqStatusQueue = value;
  }
  /** Retrieve filter for field: HotReqStatusQueue
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getHotReqStatusQueueFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.HotReqStatusQueue;
  }
  /** Set the field level Fetch value for field: HotReqId
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqIdFetch (boolean fetch)
  {
    this.HotReqIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqId
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqIdFetch ()
  {
    return this.HotReqIdFetch;
  }
  /** Set the SortOrder for field: HotReqId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqIdSortOrder (Integer value)
  {
    this.HotReqIdSort = value;
  }
  /** Retrieve SortOrder for field: HotReqId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqIdSortOrder ()
  {
    return this.HotReqIdSort;
  }
  /** Set the sort direction for field: HotReqId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqIdSortDirection (boolean ascending)
  {
    this.HotReqIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqIdSortDirection ()
  {
    return this.HotReqIdSortAscending;
  }
  /** Set the field level filters for field: HotReqId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqId = value;
  }
  /** Retrieve filter for field: HotReqId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqIdFilter ()
  {
    return this.HotReqId;
  }
  /** Set the field level Fetch value for field: HotReqReturnCustom
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqReturnCustomFetch (boolean fetch)
  {
    this.HotReqReturnCustomFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqReturnCustom
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqReturnCustomFetch ()
  {
    return this.HotReqReturnCustomFetch;
  }
  /** Set the SortOrder for field: HotReqReturnCustom
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqReturnCustomSortOrder (Integer value)
  {
    this.HotReqReturnCustomSort = value;
  }
  /** Retrieve SortOrder for field: HotReqReturnCustom
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqReturnCustomSortOrder ()
  {
    return this.HotReqReturnCustomSort;
  }
  /** Set the sort direction for field: HotReqReturnCustom
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqReturnCustomSortDirection (boolean ascending)
  {
    this.HotReqReturnCustomSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqReturnCustom
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqReturnCustomSortDirection ()
  {
    return this.HotReqReturnCustomSortAscending;
  }
  /** Set the field level filters for field: HotReqReturnCustom
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqReturnCustomFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqReturnCustom = value;
  }
  /** Retrieve filter for field: HotReqReturnCustom
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqReturnCustomFilter ()
  {
    return this.HotReqReturnCustom;
  }
  /** Set the field level Fetch value for field: HotReqReturnStatus
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqReturnStatusFetch (boolean fetch)
  {
    this.HotReqReturnStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqReturnStatus
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqReturnStatusFetch ()
  {
    return this.HotReqReturnStatusFetch;
  }
  /** Set the SortOrder for field: HotReqReturnStatus
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqReturnStatusSortOrder (Integer value)
  {
    this.HotReqReturnStatusSort = value;
  }
  /** Retrieve SortOrder for field: HotReqReturnStatus
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqReturnStatusSortOrder ()
  {
    return this.HotReqReturnStatusSort;
  }
  /** Set the sort direction for field: HotReqReturnStatus
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqReturnStatusSortDirection (boolean ascending)
  {
    this.HotReqReturnStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqReturnStatus
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqReturnStatusSortDirection ()
  {
    return this.HotReqReturnStatusSortAscending;
  }
  /** Set the field level filters for field: HotReqReturnStatus
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqReturnStatusFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqReturnStatus = value;
  }
  /** Retrieve filter for field: HotReqReturnStatus
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqReturnStatusFilter ()
  {
    return this.HotReqReturnStatus;
  }
  /** Set the field level Fetch value for field: HotReqBillRefNo
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqBillRefNoFetch (boolean fetch)
  {
    this.HotReqBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqBillRefNo
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqBillRefNoFetch ()
  {
    return this.HotReqBillRefNoFetch;
  }
  /** Set the SortOrder for field: HotReqBillRefNo
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqBillRefNoSortOrder (Integer value)
  {
    this.HotReqBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: HotReqBillRefNo
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqBillRefNoSortOrder ()
  {
    return this.HotReqBillRefNoSort;
  }
  /** Set the sort direction for field: HotReqBillRefNo
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqBillRefNoSortDirection (boolean ascending)
  {
    this.HotReqBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqBillRefNo
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqBillRefNoSortDirection ()
  {
    return this.HotReqBillRefNoSortAscending;
  }
  /** Set the field level filters for field: HotReqBillRefNo
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqBillRefNo = value;
  }
  /** Retrieve filter for field: HotReqBillRefNo
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqBillRefNoFilter ()
  {
    return this.HotReqBillRefNo;
  }
  /** Set the field level Fetch value for field: HotReqBillRefResets
   * @param fetch whether to fetch this field or not
   */
  public void setHotReqBillRefResetsFetch (boolean fetch)
  {
    this.HotReqBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: HotReqBillRefResets
   * @return boolean the Fetch value for this field
   */
  public boolean getHotReqBillRefResetsFetch ()
  {
    return this.HotReqBillRefResetsFetch;
  }
  /** Set the SortOrder for field: HotReqBillRefResets
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHotReqBillRefResetsSortOrder (Integer value)
  {
    this.HotReqBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: HotReqBillRefResets
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHotReqBillRefResetsSortOrder ()
  {
    return this.HotReqBillRefResetsSort;
  }
  /** Set the sort direction for field: HotReqBillRefResets
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHotReqBillRefResetsSortDirection (boolean ascending)
  {
    this.HotReqBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HotReqBillRefResets
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHotReqBillRefResetsSortDirection ()
  {
    return this.HotReqBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: HotReqBillRefResets
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHotReqBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HotReqBillRefResets = value;
  }
  /** Retrieve filter for field: HotReqBillRefResets
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHotReqBillRefResetsFilter ()
  {
    return this.HotReqBillRefResets;
  }
  public String toString() {
    return HotInvoiceObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HotInvoiceObjectHelper.toMap(this, null);
  }
}
