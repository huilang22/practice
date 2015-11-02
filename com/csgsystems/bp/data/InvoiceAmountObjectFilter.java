/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceAmountObjectFilter.java
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
public class InvoiceAmountObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    BigIntegerFilter[] TaxTotal  = null;
  protected boolean TaxTotalFetch = false;
  protected boolean TaxTotalSortAscending = true;
  protected Integer TaxTotalSort = null;
  /** raw field */
  public    BigIntegerFilter[] DiscountTotal  = null;
  protected boolean DiscountTotalFetch = false;
  protected boolean DiscountTotalSortAscending = true;
  protected Integer DiscountTotalSort = null;
  /** raw field */
  public    BigIntegerFilter[] AdjustmentEligibleAmount  = null;
  protected boolean AdjustmentEligibleAmountFetch = false;
  protected boolean AdjustmentEligibleAmountSortAscending = true;
  protected Integer AdjustmentEligibleAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] SubTotalNewCharges  = null;
  protected boolean SubTotalNewChargesFetch = false;
  protected boolean SubTotalNewChargesSortAscending = true;
  protected Integer SubTotalNewChargesSort = null;
  private String _objName = "InvoiceAmountObjectFilter";
  /** default constructor */
  public InvoiceAmountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public InvoiceAmountObjectFilter (InvoiceAmountObjectFilter other)
  {
    if (other == null) return;
    this.TaxTotal = other.TaxTotal;
    this.TaxTotalFetch = other.TaxTotalFetch;
    this.TaxTotalSort = other.TaxTotalSort;
    this.TaxTotalSortAscending = other.TaxTotalSortAscending;
    this.DiscountTotal = other.DiscountTotal;
    this.DiscountTotalFetch = other.DiscountTotalFetch;
    this.DiscountTotalSort = other.DiscountTotalSort;
    this.DiscountTotalSortAscending = other.DiscountTotalSortAscending;
    this.AdjustmentEligibleAmount = other.AdjustmentEligibleAmount;
    this.AdjustmentEligibleAmountFetch = other.AdjustmentEligibleAmountFetch;
    this.AdjustmentEligibleAmountSort = other.AdjustmentEligibleAmountSort;
    this.AdjustmentEligibleAmountSortAscending = other.AdjustmentEligibleAmountSortAscending;
    this.SubTotalNewCharges = other.SubTotalNewCharges;
    this.SubTotalNewChargesFetch = other.SubTotalNewChargesFetch;
    this.SubTotalNewChargesSort = other.SubTotalNewChargesSort;
    this.SubTotalNewChargesSortAscending = other.SubTotalNewChargesSortAscending;  }
  /** Set the field level Fetch value for field: TaxTotal
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTotalFetch (boolean fetch)
  {
    this.TaxTotalFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTotal
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTotalFetch ()
  {
    return this.TaxTotalFetch;
  }
  /** Set the SortOrder for field: TaxTotal
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTotalSortOrder (Integer value)
  {
    this.TaxTotalSort = value;
  }
  /** Retrieve SortOrder for field: TaxTotal
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTotalSortOrder ()
  {
    return this.TaxTotalSort;
  }
  /** Set the sort direction for field: TaxTotal
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTotalSortDirection (boolean ascending)
  {
    this.TaxTotalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTotal
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTotalSortDirection ()
  {
    return this.TaxTotalSortAscending;
  }
  /** Set the field level filters for field: TaxTotal
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTotalFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.TaxTotal = value;
  }
  /** Retrieve filter for field: TaxTotal
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTaxTotalFilter ()
  {
    return this.TaxTotal;
  }
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
  /** Set the field level Fetch value for field: AdjustmentEligibleAmount
   * @param fetch whether to fetch this field or not
   */
  public void setAdjustmentEligibleAmountFetch (boolean fetch)
  {
    this.AdjustmentEligibleAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjustmentEligibleAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjustmentEligibleAmountFetch ()
  {
    return this.AdjustmentEligibleAmountFetch;
  }
  /** Set the SortOrder for field: AdjustmentEligibleAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjustmentEligibleAmountSortOrder (Integer value)
  {
    this.AdjustmentEligibleAmountSort = value;
  }
  /** Retrieve SortOrder for field: AdjustmentEligibleAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjustmentEligibleAmountSortOrder ()
  {
    return this.AdjustmentEligibleAmountSort;
  }
  /** Set the sort direction for field: AdjustmentEligibleAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjustmentEligibleAmountSortDirection (boolean ascending)
  {
    this.AdjustmentEligibleAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjustmentEligibleAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjustmentEligibleAmountSortDirection ()
  {
    return this.AdjustmentEligibleAmountSortAscending;
  }
  /** Set the field level filters for field: AdjustmentEligibleAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjustmentEligibleAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AdjustmentEligibleAmount = value;
  }
  /** Retrieve filter for field: AdjustmentEligibleAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAdjustmentEligibleAmountFilter ()
  {
    return this.AdjustmentEligibleAmount;
  }
  /** Set the field level Fetch value for field: SubTotalNewCharges
   * @param fetch whether to fetch this field or not
   */
  public void setSubTotalNewChargesFetch (boolean fetch)
  {
    this.SubTotalNewChargesFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubTotalNewCharges
   * @return boolean the Fetch value for this field
   */
  public boolean getSubTotalNewChargesFetch ()
  {
    return this.SubTotalNewChargesFetch;
  }
  /** Set the SortOrder for field: SubTotalNewCharges
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubTotalNewChargesSortOrder (Integer value)
  {
    this.SubTotalNewChargesSort = value;
  }
  /** Retrieve SortOrder for field: SubTotalNewCharges
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubTotalNewChargesSortOrder ()
  {
    return this.SubTotalNewChargesSort;
  }
  /** Set the sort direction for field: SubTotalNewCharges
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubTotalNewChargesSortDirection (boolean ascending)
  {
    this.SubTotalNewChargesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubTotalNewCharges
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubTotalNewChargesSortDirection ()
  {
    return this.SubTotalNewChargesSortAscending;
  }
  /** Set the field level filters for field: SubTotalNewCharges
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubTotalNewChargesFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SubTotalNewCharges = value;
  }
  /** Retrieve filter for field: SubTotalNewCharges
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSubTotalNewChargesFilter ()
  {
    return this.SubTotalNewCharges;
  }
  public String toString() {
    return InvoiceAmountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return InvoiceAmountObjectHelper.toMap(this, null);
  }
}
