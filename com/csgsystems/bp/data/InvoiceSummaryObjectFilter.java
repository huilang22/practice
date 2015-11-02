/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceSummaryObjectFilter.java
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
public class InvoiceSummaryObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    BigIntegerFilter[] UsageTotal  = null;
  protected boolean UsageTotalFetch = false;
  protected boolean UsageTotalSortAscending = true;
  protected Integer UsageTotalSort = null;
  /** raw field */
  public    IntegerFilter[] UsageNumber  = null;
  protected boolean UsageNumberFetch = false;
  protected boolean UsageNumberSortAscending = true;
  protected Integer UsageNumberSort = null;
  /** raw field */
  public    BigIntegerFilter[] RcTotal  = null;
  protected boolean RcTotalFetch = false;
  protected boolean RcTotalSortAscending = true;
  protected Integer RcTotalSort = null;
  /** raw field */
  public    IntegerFilter[] RcNumber  = null;
  protected boolean RcNumberFetch = false;
  protected boolean RcNumberSortAscending = true;
  protected Integer RcNumberSort = null;
  /** raw field */
  public    BigIntegerFilter[] NrcTotal  = null;
  protected boolean NrcTotalFetch = false;
  protected boolean NrcTotalSortAscending = true;
  protected Integer NrcTotalSort = null;
  /** raw field */
  public    IntegerFilter[] NrcNumber  = null;
  protected boolean NrcNumberFetch = false;
  protected boolean NrcNumberSortAscending = true;
  protected Integer NrcNumberSort = null;
  /** raw field */
  public    IntegerFilter[] AdjNumber  = null;
  protected boolean AdjNumberFetch = false;
  protected boolean AdjNumberSortAscending = true;
  protected Integer AdjNumberSort = null;
  /** raw field */
  public    IntegerFilter[] PaymentNumber  = null;
  protected boolean PaymentNumberFetch = false;
  protected boolean PaymentNumberSortAscending = true;
  protected Integer PaymentNumberSort = null;
  /** raw field */
  public    BigIntegerFilter[] TaxTotal  = null;
  protected boolean TaxTotalFetch = false;
  protected boolean TaxTotalSortAscending = true;
  protected Integer TaxTotalSort = null;
  /** raw field */
  public    IntegerFilter[] PostPaymentNumber  = null;
  protected boolean PostPaymentNumberFetch = false;
  protected boolean PostPaymentNumberSortAscending = true;
  protected Integer PostPaymentNumberSort = null;
  /** raw field */
  public    BigIntegerFilter[] PostPaymentTotal  = null;
  protected boolean PostPaymentTotalFetch = false;
  protected boolean PostPaymentTotalSortAscending = true;
  protected Integer PostPaymentTotalSort = null;
  /** raw field */
  public    BigIntegerFilter[] PrevBalanceDue  = null;
  protected boolean PrevBalanceDueFetch = false;
  protected boolean PrevBalanceDueSortAscending = true;
  protected Integer PrevBalanceDueSort = null;
  private String _objName = "InvoiceSummaryObjectFilter";
  /** default constructor */
  public InvoiceSummaryObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public InvoiceSummaryObjectFilter (InvoiceSummaryObjectFilter other)
  {
    if (other == null) return;
    this.UsageTotal = other.UsageTotal;
    this.UsageTotalFetch = other.UsageTotalFetch;
    this.UsageTotalSort = other.UsageTotalSort;
    this.UsageTotalSortAscending = other.UsageTotalSortAscending;
    this.UsageNumber = other.UsageNumber;
    this.UsageNumberFetch = other.UsageNumberFetch;
    this.UsageNumberSort = other.UsageNumberSort;
    this.UsageNumberSortAscending = other.UsageNumberSortAscending;
    this.RcTotal = other.RcTotal;
    this.RcTotalFetch = other.RcTotalFetch;
    this.RcTotalSort = other.RcTotalSort;
    this.RcTotalSortAscending = other.RcTotalSortAscending;
    this.RcNumber = other.RcNumber;
    this.RcNumberFetch = other.RcNumberFetch;
    this.RcNumberSort = other.RcNumberSort;
    this.RcNumberSortAscending = other.RcNumberSortAscending;
    this.NrcTotal = other.NrcTotal;
    this.NrcTotalFetch = other.NrcTotalFetch;
    this.NrcTotalSort = other.NrcTotalSort;
    this.NrcTotalSortAscending = other.NrcTotalSortAscending;
    this.NrcNumber = other.NrcNumber;
    this.NrcNumberFetch = other.NrcNumberFetch;
    this.NrcNumberSort = other.NrcNumberSort;
    this.NrcNumberSortAscending = other.NrcNumberSortAscending;
    this.AdjNumber = other.AdjNumber;
    this.AdjNumberFetch = other.AdjNumberFetch;
    this.AdjNumberSort = other.AdjNumberSort;
    this.AdjNumberSortAscending = other.AdjNumberSortAscending;
    this.PaymentNumber = other.PaymentNumber;
    this.PaymentNumberFetch = other.PaymentNumberFetch;
    this.PaymentNumberSort = other.PaymentNumberSort;
    this.PaymentNumberSortAscending = other.PaymentNumberSortAscending;
    this.TaxTotal = other.TaxTotal;
    this.TaxTotalFetch = other.TaxTotalFetch;
    this.TaxTotalSort = other.TaxTotalSort;
    this.TaxTotalSortAscending = other.TaxTotalSortAscending;
    this.PostPaymentNumber = other.PostPaymentNumber;
    this.PostPaymentNumberFetch = other.PostPaymentNumberFetch;
    this.PostPaymentNumberSort = other.PostPaymentNumberSort;
    this.PostPaymentNumberSortAscending = other.PostPaymentNumberSortAscending;
    this.PostPaymentTotal = other.PostPaymentTotal;
    this.PostPaymentTotalFetch = other.PostPaymentTotalFetch;
    this.PostPaymentTotalSort = other.PostPaymentTotalSort;
    this.PostPaymentTotalSortAscending = other.PostPaymentTotalSortAscending;
    this.PrevBalanceDue = other.PrevBalanceDue;
    this.PrevBalanceDueFetch = other.PrevBalanceDueFetch;
    this.PrevBalanceDueSort = other.PrevBalanceDueSort;
    this.PrevBalanceDueSortAscending = other.PrevBalanceDueSortAscending;  }
  /** Set the field level Fetch value for field: UsageTotal
   * @param fetch whether to fetch this field or not
   */
  public void setUsageTotalFetch (boolean fetch)
  {
    this.UsageTotalFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsageTotal
   * @return boolean the Fetch value for this field
   */
  public boolean getUsageTotalFetch ()
  {
    return this.UsageTotalFetch;
  }
  /** Set the SortOrder for field: UsageTotal
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsageTotalSortOrder (Integer value)
  {
    this.UsageTotalSort = value;
  }
  /** Retrieve SortOrder for field: UsageTotal
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsageTotalSortOrder ()
  {
    return this.UsageTotalSort;
  }
  /** Set the sort direction for field: UsageTotal
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsageTotalSortDirection (boolean ascending)
  {
    this.UsageTotalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsageTotal
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsageTotalSortDirection ()
  {
    return this.UsageTotalSortAscending;
  }
  /** Set the field level filters for field: UsageTotal
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsageTotalFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.UsageTotal = value;
  }
  /** Retrieve filter for field: UsageTotal
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUsageTotalFilter ()
  {
    return this.UsageTotal;
  }
  /** Set the field level Fetch value for field: UsageNumber
   * @param fetch whether to fetch this field or not
   */
  public void setUsageNumberFetch (boolean fetch)
  {
    this.UsageNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsageNumber
   * @return boolean the Fetch value for this field
   */
  public boolean getUsageNumberFetch ()
  {
    return this.UsageNumberFetch;
  }
  /** Set the SortOrder for field: UsageNumber
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsageNumberSortOrder (Integer value)
  {
    this.UsageNumberSort = value;
  }
  /** Retrieve SortOrder for field: UsageNumber
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsageNumberSortOrder ()
  {
    return this.UsageNumberSort;
  }
  /** Set the sort direction for field: UsageNumber
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsageNumberSortDirection (boolean ascending)
  {
    this.UsageNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsageNumber
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsageNumberSortDirection ()
  {
    return this.UsageNumberSortAscending;
  }
  /** Set the field level filters for field: UsageNumber
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsageNumberFilter (IntegerFilter[] value) throws ServiceException
  {
    this.UsageNumber = value;
  }
  /** Retrieve filter for field: UsageNumber
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUsageNumberFilter ()
  {
    return this.UsageNumber;
  }
  /** Set the field level Fetch value for field: RcTotal
   * @param fetch whether to fetch this field or not
   */
  public void setRcTotalFetch (boolean fetch)
  {
    this.RcTotalFetch = fetch;
  }
  /** Retrieve Fetch value for field: RcTotal
   * @return boolean the Fetch value for this field
   */
  public boolean getRcTotalFetch ()
  {
    return this.RcTotalFetch;
  }
  /** Set the SortOrder for field: RcTotal
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRcTotalSortOrder (Integer value)
  {
    this.RcTotalSort = value;
  }
  /** Retrieve SortOrder for field: RcTotal
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRcTotalSortOrder ()
  {
    return this.RcTotalSort;
  }
  /** Set the sort direction for field: RcTotal
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRcTotalSortDirection (boolean ascending)
  {
    this.RcTotalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RcTotal
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRcTotalSortDirection ()
  {
    return this.RcTotalSortAscending;
  }
  /** Set the field level filters for field: RcTotal
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRcTotalFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.RcTotal = value;
  }
  /** Retrieve filter for field: RcTotal
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRcTotalFilter ()
  {
    return this.RcTotal;
  }
  /** Set the field level Fetch value for field: RcNumber
   * @param fetch whether to fetch this field or not
   */
  public void setRcNumberFetch (boolean fetch)
  {
    this.RcNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: RcNumber
   * @return boolean the Fetch value for this field
   */
  public boolean getRcNumberFetch ()
  {
    return this.RcNumberFetch;
  }
  /** Set the SortOrder for field: RcNumber
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRcNumberSortOrder (Integer value)
  {
    this.RcNumberSort = value;
  }
  /** Retrieve SortOrder for field: RcNumber
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRcNumberSortOrder ()
  {
    return this.RcNumberSort;
  }
  /** Set the sort direction for field: RcNumber
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRcNumberSortDirection (boolean ascending)
  {
    this.RcNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RcNumber
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRcNumberSortDirection ()
  {
    return this.RcNumberSortAscending;
  }
  /** Set the field level filters for field: RcNumber
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRcNumberFilter (IntegerFilter[] value) throws ServiceException
  {
    this.RcNumber = value;
  }
  /** Retrieve filter for field: RcNumber
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRcNumberFilter ()
  {
    return this.RcNumber;
  }
  /** Set the field level Fetch value for field: NrcTotal
   * @param fetch whether to fetch this field or not
   */
  public void setNrcTotalFetch (boolean fetch)
  {
    this.NrcTotalFetch = fetch;
  }
  /** Retrieve Fetch value for field: NrcTotal
   * @return boolean the Fetch value for this field
   */
  public boolean getNrcTotalFetch ()
  {
    return this.NrcTotalFetch;
  }
  /** Set the SortOrder for field: NrcTotal
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNrcTotalSortOrder (Integer value)
  {
    this.NrcTotalSort = value;
  }
  /** Retrieve SortOrder for field: NrcTotal
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNrcTotalSortOrder ()
  {
    return this.NrcTotalSort;
  }
  /** Set the sort direction for field: NrcTotal
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNrcTotalSortDirection (boolean ascending)
  {
    this.NrcTotalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NrcTotal
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNrcTotalSortDirection ()
  {
    return this.NrcTotalSortAscending;
  }
  /** Set the field level filters for field: NrcTotal
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNrcTotalFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.NrcTotal = value;
  }
  /** Retrieve filter for field: NrcTotal
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNrcTotalFilter ()
  {
    return this.NrcTotal;
  }
  /** Set the field level Fetch value for field: NrcNumber
   * @param fetch whether to fetch this field or not
   */
  public void setNrcNumberFetch (boolean fetch)
  {
    this.NrcNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: NrcNumber
   * @return boolean the Fetch value for this field
   */
  public boolean getNrcNumberFetch ()
  {
    return this.NrcNumberFetch;
  }
  /** Set the SortOrder for field: NrcNumber
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNrcNumberSortOrder (Integer value)
  {
    this.NrcNumberSort = value;
  }
  /** Retrieve SortOrder for field: NrcNumber
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNrcNumberSortOrder ()
  {
    return this.NrcNumberSort;
  }
  /** Set the sort direction for field: NrcNumber
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNrcNumberSortDirection (boolean ascending)
  {
    this.NrcNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NrcNumber
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNrcNumberSortDirection ()
  {
    return this.NrcNumberSortAscending;
  }
  /** Set the field level filters for field: NrcNumber
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNrcNumberFilter (IntegerFilter[] value) throws ServiceException
  {
    this.NrcNumber = value;
  }
  /** Retrieve filter for field: NrcNumber
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNrcNumberFilter ()
  {
    return this.NrcNumber;
  }
  /** Set the field level Fetch value for field: AdjNumber
   * @param fetch whether to fetch this field or not
   */
  public void setAdjNumberFetch (boolean fetch)
  {
    this.AdjNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjNumber
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjNumberFetch ()
  {
    return this.AdjNumberFetch;
  }
  /** Set the SortOrder for field: AdjNumber
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjNumberSortOrder (Integer value)
  {
    this.AdjNumberSort = value;
  }
  /** Retrieve SortOrder for field: AdjNumber
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjNumberSortOrder ()
  {
    return this.AdjNumberSort;
  }
  /** Set the sort direction for field: AdjNumber
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjNumberSortDirection (boolean ascending)
  {
    this.AdjNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjNumber
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjNumberSortDirection ()
  {
    return this.AdjNumberSortAscending;
  }
  /** Set the field level filters for field: AdjNumber
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjNumberFilter (IntegerFilter[] value) throws ServiceException
  {
    this.AdjNumber = value;
  }
  /** Retrieve filter for field: AdjNumber
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAdjNumberFilter ()
  {
    return this.AdjNumber;
  }
  /** Set the field level Fetch value for field: PaymentNumber
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentNumberFetch (boolean fetch)
  {
    this.PaymentNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentNumber
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentNumberFetch ()
  {
    return this.PaymentNumberFetch;
  }
  /** Set the SortOrder for field: PaymentNumber
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentNumberSortOrder (Integer value)
  {
    this.PaymentNumberSort = value;
  }
  /** Retrieve SortOrder for field: PaymentNumber
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentNumberSortOrder ()
  {
    return this.PaymentNumberSort;
  }
  /** Set the sort direction for field: PaymentNumber
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentNumberSortDirection (boolean ascending)
  {
    this.PaymentNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentNumber
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentNumberSortDirection ()
  {
    return this.PaymentNumberSortAscending;
  }
  /** Set the field level filters for field: PaymentNumber
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentNumberFilter (IntegerFilter[] value) throws ServiceException
  {
    this.PaymentNumber = value;
  }
  /** Retrieve filter for field: PaymentNumber
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPaymentNumberFilter ()
  {
    return this.PaymentNumber;
  }
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
  /** Set the field level Fetch value for field: PostPaymentNumber
   * @param fetch whether to fetch this field or not
   */
  public void setPostPaymentNumberFetch (boolean fetch)
  {
    this.PostPaymentNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: PostPaymentNumber
   * @return boolean the Fetch value for this field
   */
  public boolean getPostPaymentNumberFetch ()
  {
    return this.PostPaymentNumberFetch;
  }
  /** Set the SortOrder for field: PostPaymentNumber
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPostPaymentNumberSortOrder (Integer value)
  {
    this.PostPaymentNumberSort = value;
  }
  /** Retrieve SortOrder for field: PostPaymentNumber
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPostPaymentNumberSortOrder ()
  {
    return this.PostPaymentNumberSort;
  }
  /** Set the sort direction for field: PostPaymentNumber
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPostPaymentNumberSortDirection (boolean ascending)
  {
    this.PostPaymentNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PostPaymentNumber
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPostPaymentNumberSortDirection ()
  {
    return this.PostPaymentNumberSortAscending;
  }
  /** Set the field level filters for field: PostPaymentNumber
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPostPaymentNumberFilter (IntegerFilter[] value) throws ServiceException
  {
    this.PostPaymentNumber = value;
  }
  /** Retrieve filter for field: PostPaymentNumber
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPostPaymentNumberFilter ()
  {
    return this.PostPaymentNumber;
  }
  /** Set the field level Fetch value for field: PostPaymentTotal
   * @param fetch whether to fetch this field or not
   */
  public void setPostPaymentTotalFetch (boolean fetch)
  {
    this.PostPaymentTotalFetch = fetch;
  }
  /** Retrieve Fetch value for field: PostPaymentTotal
   * @return boolean the Fetch value for this field
   */
  public boolean getPostPaymentTotalFetch ()
  {
    return this.PostPaymentTotalFetch;
  }
  /** Set the SortOrder for field: PostPaymentTotal
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPostPaymentTotalSortOrder (Integer value)
  {
    this.PostPaymentTotalSort = value;
  }
  /** Retrieve SortOrder for field: PostPaymentTotal
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPostPaymentTotalSortOrder ()
  {
    return this.PostPaymentTotalSort;
  }
  /** Set the sort direction for field: PostPaymentTotal
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPostPaymentTotalSortDirection (boolean ascending)
  {
    this.PostPaymentTotalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PostPaymentTotal
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPostPaymentTotalSortDirection ()
  {
    return this.PostPaymentTotalSortAscending;
  }
  /** Set the field level filters for field: PostPaymentTotal
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPostPaymentTotalFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PostPaymentTotal = value;
  }
  /** Retrieve filter for field: PostPaymentTotal
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPostPaymentTotalFilter ()
  {
    return this.PostPaymentTotal;
  }
  /** Set the field level Fetch value for field: PrevBalanceDue
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBalanceDueFetch (boolean fetch)
  {
    this.PrevBalanceDueFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBalanceDue
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBalanceDueFetch ()
  {
    return this.PrevBalanceDueFetch;
  }
  /** Set the SortOrder for field: PrevBalanceDue
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBalanceDueSortOrder (Integer value)
  {
    this.PrevBalanceDueSort = value;
  }
  /** Retrieve SortOrder for field: PrevBalanceDue
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBalanceDueSortOrder ()
  {
    return this.PrevBalanceDueSort;
  }
  /** Set the sort direction for field: PrevBalanceDue
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBalanceDueSortDirection (boolean ascending)
  {
    this.PrevBalanceDueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBalanceDue
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBalanceDueSortDirection ()
  {
    return this.PrevBalanceDueSortAscending;
  }
  /** Set the field level filters for field: PrevBalanceDue
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBalanceDueFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PrevBalanceDue = value;
  }
  /** Retrieve filter for field: PrevBalanceDue
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPrevBalanceDueFilter ()
  {
    return this.PrevBalanceDue;
  }
  public String toString() {
    return InvoiceSummaryObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return InvoiceSummaryObjectHelper.toMap(this, null);
  }
}
