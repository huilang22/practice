/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlInputObjectFilter.java
 * Definition File: Customer/CustomerDtUrl.xml
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
public class CustomerDtUrlInputObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] AccountNo  = null;
  protected boolean AccountNoFetch = false;
  protected boolean AccountNoSortAscending = true;
  protected Integer AccountNoSort = null;
  /** raw field */
  public    DateFilter[] StatementDate  = null;
  protected boolean StatementDateFetch = false;
  protected boolean StatementDateSortAscending = true;
  protected Integer StatementDateSort = null;
  /** raw field */
  public    IntegerFilter[] InvoiceType  = null;
  protected boolean InvoiceTypeFetch = false;
  protected boolean InvoiceTypeSortAscending = true;
  protected Integer InvoiceTypeSort = null;
  private String _objName = "CustomerDtUrlInputObjectFilter";
  /** default constructor */
  public CustomerDtUrlInputObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CustomerDtUrlInputObjectFilter (CustomerDtUrlInputObjectFilter other)
  {
    if (other == null) return;
    this.AccountNo = other.AccountNo;
    this.AccountNoFetch = other.AccountNoFetch;
    this.AccountNoSort = other.AccountNoSort;
    this.AccountNoSortAscending = other.AccountNoSortAscending;
    this.StatementDate = other.StatementDate;
    this.StatementDateFetch = other.StatementDateFetch;
    this.StatementDateSort = other.StatementDateSort;
    this.StatementDateSortAscending = other.StatementDateSortAscending;
    this.InvoiceType = other.InvoiceType;
    this.InvoiceTypeFetch = other.InvoiceTypeFetch;
    this.InvoiceTypeSort = other.InvoiceTypeSort;
    this.InvoiceTypeSortAscending = other.InvoiceTypeSortAscending;  }
  /** Set the field level Fetch value for field: AccountNo
   * @param fetch whether to fetch this field or not
   */
  public void setAccountNoFetch (boolean fetch)
  {
    this.AccountNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountNo
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountNoFetch ()
  {
    return this.AccountNoFetch;
  }
  /** Set the SortOrder for field: AccountNo
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountNoSortOrder (Integer value)
  {
    this.AccountNoSort = value;
  }
  /** Retrieve SortOrder for field: AccountNo
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountNoSortOrder ()
  {
    return this.AccountNoSort;
  }
  /** Set the sort direction for field: AccountNo
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountNoSortDirection (boolean ascending)
  {
    this.AccountNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountNo
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountNoSortDirection ()
  {
    return this.AccountNoSortAscending;
  }
  /** Set the field level filters for field: AccountNo
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountNoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.AccountNo = value;
  }
  /** Retrieve filter for field: AccountNo
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountNoFilter ()
  {
    return this.AccountNo;
  }
  /** Set the field level Fetch value for field: StatementDate
   * @param fetch whether to fetch this field or not
   */
  public void setStatementDateFetch (boolean fetch)
  {
    this.StatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementDate
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementDateFetch ()
  {
    return this.StatementDateFetch;
  }
  /** Set the SortOrder for field: StatementDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementDateSortOrder (Integer value)
  {
    this.StatementDateSort = value;
  }
  /** Retrieve SortOrder for field: StatementDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementDateSortOrder ()
  {
    return this.StatementDateSort;
  }
  /** Set the sort direction for field: StatementDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementDateSortDirection (boolean ascending)
  {
    this.StatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementDateSortDirection ()
  {
    return this.StatementDateSortAscending;
  }
  /** Set the field level filters for field: StatementDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementDateFilter (DateFilter[] value) throws ServiceException
  {
    this.StatementDate = value;
  }
  /** Retrieve filter for field: StatementDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStatementDateFilter ()
  {
    return this.StatementDate;
  }
  /** Set the field level Fetch value for field: InvoiceType
   * @param fetch whether to fetch this field or not
   */
  public void setInvoiceTypeFetch (boolean fetch)
  {
    this.InvoiceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: InvoiceType
   * @return boolean the Fetch value for this field
   */
  public boolean getInvoiceTypeFetch ()
  {
    return this.InvoiceTypeFetch;
  }
  /** Set the SortOrder for field: InvoiceType
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInvoiceTypeSortOrder (Integer value)
  {
    this.InvoiceTypeSort = value;
  }
  /** Retrieve SortOrder for field: InvoiceType
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInvoiceTypeSortOrder ()
  {
    return this.InvoiceTypeSort;
  }
  /** Set the sort direction for field: InvoiceType
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInvoiceTypeSortDirection (boolean ascending)
  {
    this.InvoiceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InvoiceType
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInvoiceTypeSortDirection ()
  {
    return this.InvoiceTypeSortAscending;
  }
  /** Set the field level filters for field: InvoiceType
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInvoiceTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.InvoiceType = value;
  }
  /** Retrieve filter for field: InvoiceType
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInvoiceTypeFilter ()
  {
    return this.InvoiceType;
  }
  public String toString() {
    return CustomerDtUrlInputObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CustomerDtUrlInputObjectHelper.toMap(this, null);
  }
}
