/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAndDiscountAmountObjectFilter.java
 * Definition File: Customer/BilledUsage.xml
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
public class TaxAndDiscountAmountObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    BigIntegerFilter[] Discount  = null;
  protected boolean DiscountFetch = false;
  protected boolean DiscountSortAscending = true;
  protected Integer DiscountSort = null;
  /** raw field */
  public    BigIntegerFilter[] Tax  = null;
  protected boolean TaxFetch = false;
  protected boolean TaxSortAscending = true;
  protected Integer TaxSort = null;
  private String _objName = "TaxAndDiscountAmountObjectFilter";
  /** default constructor */
  public TaxAndDiscountAmountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public TaxAndDiscountAmountObjectFilter (TaxAndDiscountAmountObjectFilter other)
  {
    if (other == null) return;
    this.Discount = other.Discount;
    this.DiscountFetch = other.DiscountFetch;
    this.DiscountSort = other.DiscountSort;
    this.DiscountSortAscending = other.DiscountSortAscending;
    this.Tax = other.Tax;
    this.TaxFetch = other.TaxFetch;
    this.TaxSort = other.TaxSort;
    this.TaxSortAscending = other.TaxSortAscending;  }
  /** Set the field level Fetch value for field: Discount
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountFetch (boolean fetch)
  {
    this.DiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Discount
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountFetch ()
  {
    return this.DiscountFetch;
  }
  /** Set the SortOrder for field: Discount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountSortOrder (Integer value)
  {
    this.DiscountSort = value;
  }
  /** Retrieve SortOrder for field: Discount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountSortOrder ()
  {
    return this.DiscountSort;
  }
  /** Set the sort direction for field: Discount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountSortDirection (boolean ascending)
  {
    this.DiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Discount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountSortDirection ()
  {
    return this.DiscountSortAscending;
  }
  /** Set the field level filters for field: Discount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.Discount = value;
  }
  /** Retrieve filter for field: Discount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDiscountFilter ()
  {
    return this.Discount;
  }
  /** Set the field level Fetch value for field: Tax
   * @param fetch whether to fetch this field or not
   */
  public void setTaxFetch (boolean fetch)
  {
    this.TaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: Tax
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxFetch ()
  {
    return this.TaxFetch;
  }
  /** Set the SortOrder for field: Tax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxSortOrder (Integer value)
  {
    this.TaxSort = value;
  }
  /** Retrieve SortOrder for field: Tax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxSortOrder ()
  {
    return this.TaxSort;
  }
  /** Set the sort direction for field: Tax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxSortDirection (boolean ascending)
  {
    this.TaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Tax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxSortDirection ()
  {
    return this.TaxSortAscending;
  }
  /** Set the field level filters for field: Tax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.Tax = value;
  }
  /** Retrieve filter for field: Tax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTaxFilter ()
  {
    return this.Tax;
  }
  public String toString() {
    return TaxAndDiscountAmountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TaxAndDiscountAmountObjectHelper.toMap(this, null);
  }
}
