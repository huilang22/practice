/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInvoiceObjectFilter.java
 * Definition File: Customer/OrderQuote.xml
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
public class BillInvoiceObjectFilter  extends BaseFilter  implements Serializable
{
  /** bi_charge_element filter */
  public ChargeElementObjectFilter[] bi_charge_element = null;

  /** account_quote filter */
  public AccountQuoteObjectFilter account_quote = null;

  /** raw field */
  public    IntegerFilter[] BiBillRefno  = null;
  protected boolean BiBillRefnoFetch = false;
  protected boolean BiBillRefnoSortAscending = true;
  protected Integer BiBillRefnoSort = null;
  /** raw field */
  public    IntegerFilter[] BiBillRefResets  = null;
  protected boolean BiBillRefResetsFetch = false;
  protected boolean BiBillRefResetsSortAscending = true;
  protected Integer BiBillRefResetsSort = null;
  /** raw field */
  public    DateFilter[] BiStatementDate  = null;
  protected boolean BiStatementDateFetch = false;
  protected boolean BiStatementDateSortAscending = true;
  protected Integer BiStatementDateSort = null;
  /** raw field */
  public    DateFilter[] BiFromDate  = null;
  protected boolean BiFromDateFetch = false;
  protected boolean BiFromDateSortAscending = true;
  protected Integer BiFromDateSort = null;
  /** raw field */
  public    DateFilter[] BiToDate  = null;
  protected boolean BiToDateFetch = false;
  protected boolean BiToDateSortAscending = true;
  protected Integer BiToDateSort = null;
  private String _objName = "BillInvoiceObjectFilter";
  /** default constructor */
  public BillInvoiceObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BillInvoiceObjectFilter (BillInvoiceObjectFilter other)
  {
    if (other == null) return;
    if (other.bi_charge_element != null)
    {
      this.bi_charge_element = new ChargeElementObjectFilter[other.bi_charge_element.length];
      for (int i = 0; other.bi_charge_element != null && i < other.bi_charge_element.length; i++)
      {
        if (other.bi_charge_element[i] != null)  this.bi_charge_element[i] = new ChargeElementObjectFilter (other.bi_charge_element[i]);
      }
    }

    if (other.account_quote != null)
    {
      this.account_quote = new AccountQuoteObjectFilter (other.account_quote);
    }

    this.BiBillRefno = other.BiBillRefno;
    this.BiBillRefnoFetch = other.BiBillRefnoFetch;
    this.BiBillRefnoSort = other.BiBillRefnoSort;
    this.BiBillRefnoSortAscending = other.BiBillRefnoSortAscending;
    this.BiBillRefResets = other.BiBillRefResets;
    this.BiBillRefResetsFetch = other.BiBillRefResetsFetch;
    this.BiBillRefResetsSort = other.BiBillRefResetsSort;
    this.BiBillRefResetsSortAscending = other.BiBillRefResetsSortAscending;
    this.BiStatementDate = other.BiStatementDate;
    this.BiStatementDateFetch = other.BiStatementDateFetch;
    this.BiStatementDateSort = other.BiStatementDateSort;
    this.BiStatementDateSortAscending = other.BiStatementDateSortAscending;
    this.BiFromDate = other.BiFromDate;
    this.BiFromDateFetch = other.BiFromDateFetch;
    this.BiFromDateSort = other.BiFromDateSort;
    this.BiFromDateSortAscending = other.BiFromDateSortAscending;
    this.BiToDate = other.BiToDate;
    this.BiToDateFetch = other.BiToDateFetch;
    this.BiToDateSort = other.BiToDateSort;
    this.BiToDateSortAscending = other.BiToDateSortAscending;  }
  /** get the filter for ChargeElementObject
   * @return ChargeElementObjectFilter[] the filter
   */
  public ChargeElementObjectFilter[] getChargeElementObjectFilter ()
  {
    return this.bi_charge_element;
  }
  /** set the filter for ChargeElementObject
   * @param value the new filter
   */
  public void setChargeElementObjectFilter (ChargeElementObjectFilter[] value)
  {
    this.bi_charge_element = value;
  }
  /** get the filter for AccountQuoteObject
   * @return AccountQuoteObjectFilter the filter
   */
  public AccountQuoteObjectFilter getAccountQuoteObjectFilter ()
  {
    return this.account_quote;
  }
  /** set the filter for AccountQuoteObject
   * @param value the new filter
   */
  public void setAccountQuoteObjectFilter (AccountQuoteObjectFilter value)
  {
    this.account_quote = value;
  }
  /** Set the field level Fetch value for field: BiBillRefno
   * @param fetch whether to fetch this field or not
   */
  public void setBiBillRefnoFetch (boolean fetch)
  {
    this.BiBillRefnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BiBillRefno
   * @return boolean the Fetch value for this field
   */
  public boolean getBiBillRefnoFetch ()
  {
    return this.BiBillRefnoFetch;
  }
  /** Set the SortOrder for field: BiBillRefno
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBiBillRefnoSortOrder (Integer value)
  {
    this.BiBillRefnoSort = value;
  }
  /** Retrieve SortOrder for field: BiBillRefno
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBiBillRefnoSortOrder ()
  {
    return this.BiBillRefnoSort;
  }
  /** Set the sort direction for field: BiBillRefno
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBiBillRefnoSortDirection (boolean ascending)
  {
    this.BiBillRefnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BiBillRefno
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBiBillRefnoSortDirection ()
  {
    return this.BiBillRefnoSortAscending;
  }
  /** Set the field level filters for field: BiBillRefno
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBiBillRefnoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.BiBillRefno = value;
  }
  /** Retrieve filter for field: BiBillRefno
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBiBillRefnoFilter ()
  {
    return this.BiBillRefno;
  }
  /** Set the field level Fetch value for field: BiBillRefResets
   * @param fetch whether to fetch this field or not
   */
  public void setBiBillRefResetsFetch (boolean fetch)
  {
    this.BiBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BiBillRefResets
   * @return boolean the Fetch value for this field
   */
  public boolean getBiBillRefResetsFetch ()
  {
    return this.BiBillRefResetsFetch;
  }
  /** Set the SortOrder for field: BiBillRefResets
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBiBillRefResetsSortOrder (Integer value)
  {
    this.BiBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BiBillRefResets
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBiBillRefResetsSortOrder ()
  {
    return this.BiBillRefResetsSort;
  }
  /** Set the sort direction for field: BiBillRefResets
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBiBillRefResetsSortDirection (boolean ascending)
  {
    this.BiBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BiBillRefResets
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBiBillRefResetsSortDirection ()
  {
    return this.BiBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BiBillRefResets
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBiBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    this.BiBillRefResets = value;
  }
  /** Retrieve filter for field: BiBillRefResets
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBiBillRefResetsFilter ()
  {
    return this.BiBillRefResets;
  }
  /** Set the field level Fetch value for field: BiStatementDate
   * @param fetch whether to fetch this field or not
   */
  public void setBiStatementDateFetch (boolean fetch)
  {
    this.BiStatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BiStatementDate
   * @return boolean the Fetch value for this field
   */
  public boolean getBiStatementDateFetch ()
  {
    return this.BiStatementDateFetch;
  }
  /** Set the SortOrder for field: BiStatementDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBiStatementDateSortOrder (Integer value)
  {
    this.BiStatementDateSort = value;
  }
  /** Retrieve SortOrder for field: BiStatementDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBiStatementDateSortOrder ()
  {
    return this.BiStatementDateSort;
  }
  /** Set the sort direction for field: BiStatementDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBiStatementDateSortDirection (boolean ascending)
  {
    this.BiStatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BiStatementDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBiStatementDateSortDirection ()
  {
    return this.BiStatementDateSortAscending;
  }
  /** Set the field level filters for field: BiStatementDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBiStatementDateFilter (DateFilter[] value) throws ServiceException
  {
    this.BiStatementDate = value;
  }
  /** Retrieve filter for field: BiStatementDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getBiStatementDateFilter ()
  {
    return this.BiStatementDate;
  }
  /** Set the field level Fetch value for field: BiFromDate
   * @param fetch whether to fetch this field or not
   */
  public void setBiFromDateFetch (boolean fetch)
  {
    this.BiFromDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BiFromDate
   * @return boolean the Fetch value for this field
   */
  public boolean getBiFromDateFetch ()
  {
    return this.BiFromDateFetch;
  }
  /** Set the SortOrder for field: BiFromDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBiFromDateSortOrder (Integer value)
  {
    this.BiFromDateSort = value;
  }
  /** Retrieve SortOrder for field: BiFromDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBiFromDateSortOrder ()
  {
    return this.BiFromDateSort;
  }
  /** Set the sort direction for field: BiFromDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBiFromDateSortDirection (boolean ascending)
  {
    this.BiFromDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BiFromDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBiFromDateSortDirection ()
  {
    return this.BiFromDateSortAscending;
  }
  /** Set the field level filters for field: BiFromDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBiFromDateFilter (DateFilter[] value) throws ServiceException
  {
    this.BiFromDate = value;
  }
  /** Retrieve filter for field: BiFromDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getBiFromDateFilter ()
  {
    return this.BiFromDate;
  }
  /** Set the field level Fetch value for field: BiToDate
   * @param fetch whether to fetch this field or not
   */
  public void setBiToDateFetch (boolean fetch)
  {
    this.BiToDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BiToDate
   * @return boolean the Fetch value for this field
   */
  public boolean getBiToDateFetch ()
  {
    return this.BiToDateFetch;
  }
  /** Set the SortOrder for field: BiToDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBiToDateSortOrder (Integer value)
  {
    this.BiToDateSort = value;
  }
  /** Retrieve SortOrder for field: BiToDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBiToDateSortOrder ()
  {
    return this.BiToDateSort;
  }
  /** Set the sort direction for field: BiToDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBiToDateSortDirection (boolean ascending)
  {
    this.BiToDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BiToDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBiToDateSortDirection ()
  {
    return this.BiToDateSortAscending;
  }
  /** Set the field level filters for field: BiToDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBiToDateFilter (DateFilter[] value) throws ServiceException
  {
    this.BiToDate = value;
  }
  /** Retrieve filter for field: BiToDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getBiToDateFilter ()
  {
    return this.BiToDate;
  }
  public String toString() {
    return BillInvoiceObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillInvoiceObjectHelper.toMap(this, null);
  }
}
