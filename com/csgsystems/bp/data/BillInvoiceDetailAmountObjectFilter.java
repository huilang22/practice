/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInvoiceDetailAmountObjectFilter.java
 * Definition File: Customer/InvoiceDetail.xml
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
public class BillInvoiceDetailAmountObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    BigIntegerFilter[] DiscountTotal  = null;
  protected boolean DiscountTotalFetch = false;
  protected boolean DiscountTotalSortAscending = true;
  protected Integer DiscountTotalSort = null;
  /** raw field */
  public    BigIntegerFilter[] TotalTax  = null;
  protected boolean TotalTaxFetch = false;
  protected boolean TotalTaxSortAscending = true;
  protected Integer TotalTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] UntaxesUndiscountedNewCharges  = null;
  protected boolean UntaxesUndiscountedNewChargesFetch = false;
  protected boolean UntaxesUndiscountedNewChargesSortAscending = true;
  protected Integer UntaxesUndiscountedNewChargesSort = null;
  private String _objName = "BillInvoiceDetailAmountObjectFilter";
  /** default constructor */
  public BillInvoiceDetailAmountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BillInvoiceDetailAmountObjectFilter (BillInvoiceDetailAmountObjectFilter other)
  {
    if (other == null) return;
    this.DiscountTotal = other.DiscountTotal;
    this.DiscountTotalFetch = other.DiscountTotalFetch;
    this.DiscountTotalSort = other.DiscountTotalSort;
    this.DiscountTotalSortAscending = other.DiscountTotalSortAscending;
    this.TotalTax = other.TotalTax;
    this.TotalTaxFetch = other.TotalTaxFetch;
    this.TotalTaxSort = other.TotalTaxSort;
    this.TotalTaxSortAscending = other.TotalTaxSortAscending;
    this.UntaxesUndiscountedNewCharges = other.UntaxesUndiscountedNewCharges;
    this.UntaxesUndiscountedNewChargesFetch = other.UntaxesUndiscountedNewChargesFetch;
    this.UntaxesUndiscountedNewChargesSort = other.UntaxesUndiscountedNewChargesSort;
    this.UntaxesUndiscountedNewChargesSortAscending = other.UntaxesUndiscountedNewChargesSortAscending;  }
  /** Set the field level Fetch value for field: DiscountTotal
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountTotalFetch (boolean fetch)
  {
    this.DiscountTotalFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountTotal
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountTotalFetch ()
  {
    return this.DiscountTotalFetch;
  }
  /** Set the SortOrder for field: DiscountTotal
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountTotalSortOrder (Integer value)
  {
    this.DiscountTotalSort = value;
  }
  /** Retrieve SortOrder for field: DiscountTotal
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountTotalSortOrder ()
  {
    return this.DiscountTotalSort;
  }
  /** Set the sort direction for field: DiscountTotal
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountTotalSortDirection (boolean ascending)
  {
    this.DiscountTotalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountTotal
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountTotalSortDirection ()
  {
    return this.DiscountTotalSortAscending;
  }
  /** Set the field level filters for field: DiscountTotal
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountTotalFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.DiscountTotal = value;
  }
  /** Retrieve filter for field: DiscountTotal
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDiscountTotalFilter ()
  {
    return this.DiscountTotal;
  }
  /** Set the field level Fetch value for field: TotalTax
   * @param fetch whether to fetch this field or not
   */
  public void setTotalTaxFetch (boolean fetch)
  {
    this.TotalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalTax
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalTaxFetch ()
  {
    return this.TotalTaxFetch;
  }
  /** Set the SortOrder for field: TotalTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalTaxSortOrder (Integer value)
  {
    this.TotalTaxSort = value;
  }
  /** Retrieve SortOrder for field: TotalTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalTaxSortOrder ()
  {
    return this.TotalTaxSort;
  }
  /** Set the sort direction for field: TotalTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalTaxSortDirection (boolean ascending)
  {
    this.TotalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalTaxSortDirection ()
  {
    return this.TotalTaxSortAscending;
  }
  /** Set the field level filters for field: TotalTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.TotalTax = value;
  }
  /** Retrieve filter for field: TotalTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalTaxFilter ()
  {
    return this.TotalTax;
  }
  /** Set the field level Fetch value for field: UntaxesUndiscountedNewCharges
   * @param fetch whether to fetch this field or not
   */
  public void setUntaxesUndiscountedNewChargesFetch (boolean fetch)
  {
    this.UntaxesUndiscountedNewChargesFetch = fetch;
  }
  /** Retrieve Fetch value for field: UntaxesUndiscountedNewCharges
   * @return boolean the Fetch value for this field
   */
  public boolean getUntaxesUndiscountedNewChargesFetch ()
  {
    return this.UntaxesUndiscountedNewChargesFetch;
  }
  /** Set the SortOrder for field: UntaxesUndiscountedNewCharges
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUntaxesUndiscountedNewChargesSortOrder (Integer value)
  {
    this.UntaxesUndiscountedNewChargesSort = value;
  }
  /** Retrieve SortOrder for field: UntaxesUndiscountedNewCharges
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUntaxesUndiscountedNewChargesSortOrder ()
  {
    return this.UntaxesUndiscountedNewChargesSort;
  }
  /** Set the sort direction for field: UntaxesUndiscountedNewCharges
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUntaxesUndiscountedNewChargesSortDirection (boolean ascending)
  {
    this.UntaxesUndiscountedNewChargesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UntaxesUndiscountedNewCharges
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUntaxesUndiscountedNewChargesSortDirection ()
  {
    return this.UntaxesUndiscountedNewChargesSortAscending;
  }
  /** Set the field level filters for field: UntaxesUndiscountedNewCharges
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUntaxesUndiscountedNewChargesFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.UntaxesUndiscountedNewCharges = value;
  }
  /** Retrieve filter for field: UntaxesUndiscountedNewCharges
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUntaxesUndiscountedNewChargesFilter ()
  {
    return this.UntaxesUndiscountedNewCharges;
  }
  public String toString() {
    return BillInvoiceDetailAmountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillInvoiceDetailAmountObjectHelper.toMap(this, null);
  }
}
