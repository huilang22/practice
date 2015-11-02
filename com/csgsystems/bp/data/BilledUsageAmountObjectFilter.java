/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageAmountObjectFilter.java
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
public class BilledUsageAmountObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    BigIntegerFilter[] AdjustmentEligibleAmount  = null;
  protected boolean AdjustmentEligibleAmountFetch = false;
  protected boolean AdjustmentEligibleAmountSortAscending = true;
  protected Integer AdjustmentEligibleAmountSort = null;
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
  /** raw field */
  public    BigIntegerFilter[] BilledUsageTaxExclusiveAmount  = null;
  protected boolean BilledUsageTaxExclusiveAmountFetch = false;
  protected boolean BilledUsageTaxExclusiveAmountSortAscending = true;
  protected Integer BilledUsageTaxExclusiveAmountSort = null;
  private String _objName = "BilledUsageAmountObjectFilter";
  /** default constructor */
  public BilledUsageAmountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BilledUsageAmountObjectFilter (BilledUsageAmountObjectFilter other)
  {
    if (other == null) return;
    this.AdjustmentEligibleAmount = other.AdjustmentEligibleAmount;
    this.AdjustmentEligibleAmountFetch = other.AdjustmentEligibleAmountFetch;
    this.AdjustmentEligibleAmountSort = other.AdjustmentEligibleAmountSort;
    this.AdjustmentEligibleAmountSortAscending = other.AdjustmentEligibleAmountSortAscending;
    this.Discount = other.Discount;
    this.DiscountFetch = other.DiscountFetch;
    this.DiscountSort = other.DiscountSort;
    this.DiscountSortAscending = other.DiscountSortAscending;
    this.Tax = other.Tax;
    this.TaxFetch = other.TaxFetch;
    this.TaxSort = other.TaxSort;
    this.TaxSortAscending = other.TaxSortAscending;
    this.BilledUsageTaxExclusiveAmount = other.BilledUsageTaxExclusiveAmount;
    this.BilledUsageTaxExclusiveAmountFetch = other.BilledUsageTaxExclusiveAmountFetch;
    this.BilledUsageTaxExclusiveAmountSort = other.BilledUsageTaxExclusiveAmountSort;
    this.BilledUsageTaxExclusiveAmountSortAscending = other.BilledUsageTaxExclusiveAmountSortAscending;  }
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
  /** Set the field level Fetch value for field: BilledUsageTaxExclusiveAmount
   * @param fetch whether to fetch this field or not
   */
  public void setBilledUsageTaxExclusiveAmountFetch (boolean fetch)
  {
    this.BilledUsageTaxExclusiveAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: BilledUsageTaxExclusiveAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getBilledUsageTaxExclusiveAmountFetch ()
  {
    return this.BilledUsageTaxExclusiveAmountFetch;
  }
  /** Set the SortOrder for field: BilledUsageTaxExclusiveAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBilledUsageTaxExclusiveAmountSortOrder (Integer value)
  {
    this.BilledUsageTaxExclusiveAmountSort = value;
  }
  /** Retrieve SortOrder for field: BilledUsageTaxExclusiveAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBilledUsageTaxExclusiveAmountSortOrder ()
  {
    return this.BilledUsageTaxExclusiveAmountSort;
  }
  /** Set the sort direction for field: BilledUsageTaxExclusiveAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBilledUsageTaxExclusiveAmountSortDirection (boolean ascending)
  {
    this.BilledUsageTaxExclusiveAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BilledUsageTaxExclusiveAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBilledUsageTaxExclusiveAmountSortDirection ()
  {
    return this.BilledUsageTaxExclusiveAmountSortAscending;
  }
  /** Set the field level filters for field: BilledUsageTaxExclusiveAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBilledUsageTaxExclusiveAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.BilledUsageTaxExclusiveAmount = value;
  }
  /** Retrieve filter for field: BilledUsageTaxExclusiveAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBilledUsageTaxExclusiveAmountFilter ()
  {
    return this.BilledUsageTaxExclusiveAmount;
  }
  public String toString() {
    return BilledUsageAmountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BilledUsageAmountObjectHelper.toMap(this, null);
  }
}
