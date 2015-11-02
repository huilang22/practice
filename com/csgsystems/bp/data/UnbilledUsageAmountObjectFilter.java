/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageAmountObjectFilter.java
 * Definition File: Customer/UnbilledUsage.xml
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
public class UnbilledUsageAmountObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    BigIntegerFilter[] AdjustmentEligibleAmount  = null;
  protected boolean AdjustmentEligibleAmountFetch = false;
  protected boolean AdjustmentEligibleAmountSortAscending = true;
  protected Integer AdjustmentEligibleAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] Tax  = null;
  protected boolean TaxFetch = false;
  protected boolean TaxSortAscending = true;
  protected Integer TaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] UnbilledUsageTaxExclusiveAmount  = null;
  protected boolean UnbilledUsageTaxExclusiveAmountFetch = false;
  protected boolean UnbilledUsageTaxExclusiveAmountSortAscending = true;
  protected Integer UnbilledUsageTaxExclusiveAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] AmountCredited  = null;
  protected boolean AmountCreditedFetch = false;
  protected boolean AmountCreditedSortAscending = true;
  protected Integer AmountCreditedSort = null;
  /** raw field */
  public    BigIntegerFilter[] UnitsCredited  = null;
  protected boolean UnitsCreditedFetch = false;
  protected boolean UnitsCreditedSortAscending = true;
  protected Integer UnitsCreditedSort = null;
  private String _objName = "UnbilledUsageAmountObjectFilter";
  /** default constructor */
  public UnbilledUsageAmountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public UnbilledUsageAmountObjectFilter (UnbilledUsageAmountObjectFilter other)
  {
    if (other == null) return;
    this.AdjustmentEligibleAmount = other.AdjustmentEligibleAmount;
    this.AdjustmentEligibleAmountFetch = other.AdjustmentEligibleAmountFetch;
    this.AdjustmentEligibleAmountSort = other.AdjustmentEligibleAmountSort;
    this.AdjustmentEligibleAmountSortAscending = other.AdjustmentEligibleAmountSortAscending;
    this.Tax = other.Tax;
    this.TaxFetch = other.TaxFetch;
    this.TaxSort = other.TaxSort;
    this.TaxSortAscending = other.TaxSortAscending;
    this.UnbilledUsageTaxExclusiveAmount = other.UnbilledUsageTaxExclusiveAmount;
    this.UnbilledUsageTaxExclusiveAmountFetch = other.UnbilledUsageTaxExclusiveAmountFetch;
    this.UnbilledUsageTaxExclusiveAmountSort = other.UnbilledUsageTaxExclusiveAmountSort;
    this.UnbilledUsageTaxExclusiveAmountSortAscending = other.UnbilledUsageTaxExclusiveAmountSortAscending;
    this.AmountCredited = other.AmountCredited;
    this.AmountCreditedFetch = other.AmountCreditedFetch;
    this.AmountCreditedSort = other.AmountCreditedSort;
    this.AmountCreditedSortAscending = other.AmountCreditedSortAscending;
    this.UnitsCredited = other.UnitsCredited;
    this.UnitsCreditedFetch = other.UnitsCreditedFetch;
    this.UnitsCreditedSort = other.UnitsCreditedSort;
    this.UnitsCreditedSortAscending = other.UnitsCreditedSortAscending;  }
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
  /** Set the field level Fetch value for field: UnbilledUsageTaxExclusiveAmount
   * @param fetch whether to fetch this field or not
   */
  public void setUnbilledUsageTaxExclusiveAmountFetch (boolean fetch)
  {
    this.UnbilledUsageTaxExclusiveAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnbilledUsageTaxExclusiveAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getUnbilledUsageTaxExclusiveAmountFetch ()
  {
    return this.UnbilledUsageTaxExclusiveAmountFetch;
  }
  /** Set the SortOrder for field: UnbilledUsageTaxExclusiveAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnbilledUsageTaxExclusiveAmountSortOrder (Integer value)
  {
    this.UnbilledUsageTaxExclusiveAmountSort = value;
  }
  /** Retrieve SortOrder for field: UnbilledUsageTaxExclusiveAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnbilledUsageTaxExclusiveAmountSortOrder ()
  {
    return this.UnbilledUsageTaxExclusiveAmountSort;
  }
  /** Set the sort direction for field: UnbilledUsageTaxExclusiveAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnbilledUsageTaxExclusiveAmountSortDirection (boolean ascending)
  {
    this.UnbilledUsageTaxExclusiveAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnbilledUsageTaxExclusiveAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnbilledUsageTaxExclusiveAmountSortDirection ()
  {
    return this.UnbilledUsageTaxExclusiveAmountSortAscending;
  }
  /** Set the field level filters for field: UnbilledUsageTaxExclusiveAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnbilledUsageTaxExclusiveAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.UnbilledUsageTaxExclusiveAmount = value;
  }
  /** Retrieve filter for field: UnbilledUsageTaxExclusiveAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnbilledUsageTaxExclusiveAmountFilter ()
  {
    return this.UnbilledUsageTaxExclusiveAmount;
  }
  /** Set the field level Fetch value for field: AmountCredited
   * @param fetch whether to fetch this field or not
   */
  public void setAmountCreditedFetch (boolean fetch)
  {
    this.AmountCreditedFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmountCredited
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountCreditedFetch ()
  {
    return this.AmountCreditedFetch;
  }
  /** Set the SortOrder for field: AmountCredited
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountCreditedSortOrder (Integer value)
  {
    this.AmountCreditedSort = value;
  }
  /** Retrieve SortOrder for field: AmountCredited
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountCreditedSortOrder ()
  {
    return this.AmountCreditedSort;
  }
  /** Set the sort direction for field: AmountCredited
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountCreditedSortDirection (boolean ascending)
  {
    this.AmountCreditedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmountCredited
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountCreditedSortDirection ()
  {
    return this.AmountCreditedSortAscending;
  }
  /** Set the field level filters for field: AmountCredited
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountCreditedFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AmountCredited = value;
  }
  /** Retrieve filter for field: AmountCredited
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmountCreditedFilter ()
  {
    return this.AmountCredited;
  }
  /** Set the field level Fetch value for field: UnitsCredited
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsCreditedFetch (boolean fetch)
  {
    this.UnitsCreditedFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsCredited
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsCreditedFetch ()
  {
    return this.UnitsCreditedFetch;
  }
  /** Set the SortOrder for field: UnitsCredited
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsCreditedSortOrder (Integer value)
  {
    this.UnitsCreditedSort = value;
  }
  /** Retrieve SortOrder for field: UnitsCredited
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsCreditedSortOrder ()
  {
    return this.UnitsCreditedSort;
  }
  /** Set the sort direction for field: UnitsCredited
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsCreditedSortDirection (boolean ascending)
  {
    this.UnitsCreditedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsCredited
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsCreditedSortDirection ()
  {
    return this.UnitsCreditedSortAscending;
  }
  /** Set the field level filters for field: UnitsCredited
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsCreditedFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.UnitsCredited = value;
  }
  /** Retrieve filter for field: UnitsCredited
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnitsCreditedFilter ()
  {
    return this.UnitsCredited;
  }
  public String toString() {
    return UnbilledUsageAmountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return UnbilledUsageAmountObjectHelper.toMap(this, null);
  }
}
