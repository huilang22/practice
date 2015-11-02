/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BalanceSummaryObjectFilter.java
 * Definition File: Customer/Invoice.xml
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

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class BalanceSummaryObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    BigIntegerFilter[] TransAmount  = null;
  protected boolean TransAmountFetch = false;
  protected boolean TransAmountSortAscending = true;
  protected Integer TransAmountSort = null;
  /** raw field */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  private String _objName = "BalanceSummaryObjectFilter";
  /** default constructor */
  public BalanceSummaryObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BalanceSummaryObjectFilter (BalanceSummaryObjectFilter other)
  {
    if (other == null) return;
    this.TransAmount = other.TransAmount;
    this.TransAmountFetch = other.TransAmountFetch;
    this.TransAmountSort = other.TransAmountSort;
    this.TransAmountSortAscending = other.TransAmountSortAscending;
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;  }
  /** Set the field level Fetch value for field: TransAmount
   * @param fetch whether to fetch this field or not
   */
  public void setTransAmountFetch (boolean fetch)
  {
    this.TransAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getTransAmountFetch ()
  {
    return this.TransAmountFetch;
  }
  /** Set the SortOrder for field: TransAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransAmountSortOrder (Integer value)
  {
    this.TransAmountSort = value;
  }
  /** Retrieve SortOrder for field: TransAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransAmountSortOrder ()
  {
    return this.TransAmountSort;
  }
  /** Set the sort direction for field: TransAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransAmountSortDirection (boolean ascending)
  {
    this.TransAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransAmountSortDirection ()
  {
    return this.TransAmountSortAscending;
  }
  /** Set the field level filters for field: TransAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.TransAmount = value;
  }
  /** Retrieve filter for field: TransAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTransAmountFilter ()
  {
    return this.TransAmount;
  }
  /** Set the field level Fetch value for field: AccountExternalId
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch)
  {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch ()
  {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value)
  {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder ()
  {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending)
  {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection ()
  {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending)
  {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId
   * @return boolean whether the field is case insensitive
   */
  public boolean getAccountExternalIdCaseInsensitive ()
  {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException
  {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter ()
  {
    return this.AccountExternalId;
  }
  /** Set the field level Fetch value for field: AccountExternalIdType
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch)
  {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch ()
  {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value)
  {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder ()
  {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending)
  {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection ()
  {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter ()
  {
    return this.AccountExternalIdType;
  }
  public String toString() {
    return BalanceSummaryObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BalanceSummaryObjectHelper.toMap(this, null);
  }
}
