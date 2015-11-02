/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractQuoteObjectFilter.java
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
public class ContractQuoteObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] CnTrackingId  = null;
  protected boolean CnTrackingIdFetch = false;
  protected boolean CnTrackingIdSortAscending = true;
  protected Integer CnTrackingIdSort = null;
  /** raw field */
  public    IntegerFilter[] CnTrackingIdServ  = null;
  protected boolean CnTrackingIdServFetch = false;
  protected boolean CnTrackingIdServSortAscending = true;
  protected Integer CnTrackingIdServSort = null;
  /** raw field */
  public    StringFilter[] CnContractId  = null;
  protected boolean CnContractIdFetch = false;
  protected boolean CnContractIdSortAscending = true;
  protected boolean CnContractIdCaseInsensitive = false;
  protected Integer CnContractIdSort = null;
  /** raw field */
  public    IntegerFilter[] CnContractType  = null;
  protected boolean CnContractTypeFetch = false;
  protected boolean CnContractTypeSortAscending = true;
  protected Integer CnContractTypeSort = null;
  /** raw field */
  public    BigIntegerFilter[] CnAmount  = null;
  protected boolean CnAmountFetch = false;
  protected boolean CnAmountSortAscending = true;
  protected Integer CnAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] CnDiscount  = null;
  protected boolean CnDiscountFetch = false;
  protected boolean CnDiscountSortAscending = true;
  protected Integer CnDiscountSort = null;
  /** raw field */
  public    BigIntegerFilter[] CnFederalTax  = null;
  protected boolean CnFederalTaxFetch = false;
  protected boolean CnFederalTaxSortAscending = true;
  protected Integer CnFederalTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CnStateTax  = null;
  protected boolean CnStateTaxFetch = false;
  protected boolean CnStateTaxSortAscending = true;
  protected Integer CnStateTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CnCountyTax  = null;
  protected boolean CnCountyTaxFetch = false;
  protected boolean CnCountyTaxSortAscending = true;
  protected Integer CnCountyTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CnCityTax  = null;
  protected boolean CnCityTaxFetch = false;
  protected boolean CnCityTaxSortAscending = true;
  protected Integer CnCityTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CnOtherTax  = null;
  protected boolean CnOtherTaxFetch = false;
  protected boolean CnOtherTaxSortAscending = true;
  protected Integer CnOtherTaxSort = null;
  /** cn_charge_element filter */
  public ChargeElementObjectFilter[] cn_charge_element = null;

  private String _objName = "ContractQuoteObjectFilter";
  /** default constructor */
  public ContractQuoteObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ContractQuoteObjectFilter (ContractQuoteObjectFilter other)
  {
    if (other == null) return;
    this.CnTrackingId = other.CnTrackingId;
    this.CnTrackingIdFetch = other.CnTrackingIdFetch;
    this.CnTrackingIdSort = other.CnTrackingIdSort;
    this.CnTrackingIdSortAscending = other.CnTrackingIdSortAscending;
    this.CnTrackingIdServ = other.CnTrackingIdServ;
    this.CnTrackingIdServFetch = other.CnTrackingIdServFetch;
    this.CnTrackingIdServSort = other.CnTrackingIdServSort;
    this.CnTrackingIdServSortAscending = other.CnTrackingIdServSortAscending;
    this.CnContractId = other.CnContractId;
    this.CnContractIdFetch = other.CnContractIdFetch;
    this.CnContractIdSort = other.CnContractIdSort;
    this.CnContractIdCaseInsensitive = other.CnContractIdCaseInsensitive;
    this.CnContractIdSortAscending = other.CnContractIdSortAscending;
    this.CnContractType = other.CnContractType;
    this.CnContractTypeFetch = other.CnContractTypeFetch;
    this.CnContractTypeSort = other.CnContractTypeSort;
    this.CnContractTypeSortAscending = other.CnContractTypeSortAscending;
    this.CnAmount = other.CnAmount;
    this.CnAmountFetch = other.CnAmountFetch;
    this.CnAmountSort = other.CnAmountSort;
    this.CnAmountSortAscending = other.CnAmountSortAscending;
    this.CnDiscount = other.CnDiscount;
    this.CnDiscountFetch = other.CnDiscountFetch;
    this.CnDiscountSort = other.CnDiscountSort;
    this.CnDiscountSortAscending = other.CnDiscountSortAscending;
    this.CnFederalTax = other.CnFederalTax;
    this.CnFederalTaxFetch = other.CnFederalTaxFetch;
    this.CnFederalTaxSort = other.CnFederalTaxSort;
    this.CnFederalTaxSortAscending = other.CnFederalTaxSortAscending;
    this.CnStateTax = other.CnStateTax;
    this.CnStateTaxFetch = other.CnStateTaxFetch;
    this.CnStateTaxSort = other.CnStateTaxSort;
    this.CnStateTaxSortAscending = other.CnStateTaxSortAscending;
    this.CnCountyTax = other.CnCountyTax;
    this.CnCountyTaxFetch = other.CnCountyTaxFetch;
    this.CnCountyTaxSort = other.CnCountyTaxSort;
    this.CnCountyTaxSortAscending = other.CnCountyTaxSortAscending;
    this.CnCityTax = other.CnCityTax;
    this.CnCityTaxFetch = other.CnCityTaxFetch;
    this.CnCityTaxSort = other.CnCityTaxSort;
    this.CnCityTaxSortAscending = other.CnCityTaxSortAscending;
    this.CnOtherTax = other.CnOtherTax;
    this.CnOtherTaxFetch = other.CnOtherTaxFetch;
    this.CnOtherTaxSort = other.CnOtherTaxSort;
    this.CnOtherTaxSortAscending = other.CnOtherTaxSortAscending;
    if (other.cn_charge_element != null)
    {
      this.cn_charge_element = new ChargeElementObjectFilter[other.cn_charge_element.length];
      for (int i = 0; other.cn_charge_element != null && i < other.cn_charge_element.length; i++)
      {
        if (other.cn_charge_element[i] != null)  this.cn_charge_element[i] = new ChargeElementObjectFilter (other.cn_charge_element[i]);
      }
    }
  }
  /** Set the field level Fetch value for field: CnTrackingId
   * @param fetch whether to fetch this field or not
   */
  public void setCnTrackingIdFetch (boolean fetch)
  {
    this.CnTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnTrackingId
   * @return boolean the Fetch value for this field
   */
  public boolean getCnTrackingIdFetch ()
  {
    return this.CnTrackingIdFetch;
  }
  /** Set the SortOrder for field: CnTrackingId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnTrackingIdSortOrder (Integer value)
  {
    this.CnTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: CnTrackingId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnTrackingIdSortOrder ()
  {
    return this.CnTrackingIdSort;
  }
  /** Set the sort direction for field: CnTrackingId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnTrackingIdSortDirection (boolean ascending)
  {
    this.CnTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnTrackingId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnTrackingIdSortDirection ()
  {
    return this.CnTrackingIdSortAscending;
  }
  /** Set the field level filters for field: CnTrackingId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CnTrackingId = value;
  }
  /** Retrieve filter for field: CnTrackingId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCnTrackingIdFilter ()
  {
    return this.CnTrackingId;
  }
  /** Set the field level Fetch value for field: CnTrackingIdServ
   * @param fetch whether to fetch this field or not
   */
  public void setCnTrackingIdServFetch (boolean fetch)
  {
    this.CnTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnTrackingIdServ
   * @return boolean the Fetch value for this field
   */
  public boolean getCnTrackingIdServFetch ()
  {
    return this.CnTrackingIdServFetch;
  }
  /** Set the SortOrder for field: CnTrackingIdServ
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnTrackingIdServSortOrder (Integer value)
  {
    this.CnTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: CnTrackingIdServ
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnTrackingIdServSortOrder ()
  {
    return this.CnTrackingIdServSort;
  }
  /** Set the sort direction for field: CnTrackingIdServ
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnTrackingIdServSortDirection (boolean ascending)
  {
    this.CnTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnTrackingIdServ
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnTrackingIdServSortDirection ()
  {
    return this.CnTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: CnTrackingIdServ
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CnTrackingIdServ = value;
  }
  /** Retrieve filter for field: CnTrackingIdServ
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCnTrackingIdServFilter ()
  {
    return this.CnTrackingIdServ;
  }
  /** Set the field level Fetch value for field: CnContractId
   * @param fetch whether to fetch this field or not
   */
  public void setCnContractIdFetch (boolean fetch)
  {
    this.CnContractIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnContractId
   * @return boolean the Fetch value for this field
   */
  public boolean getCnContractIdFetch ()
  {
    return this.CnContractIdFetch;
  }
  /** Set the SortOrder for field: CnContractId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnContractIdSortOrder (Integer value)
  {
    this.CnContractIdSort = value;
  }
  /** Retrieve SortOrder for field: CnContractId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnContractIdSortOrder ()
  {
    return this.CnContractIdSort;
  }
  /** Set the sort direction for field: CnContractId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnContractIdSortDirection (boolean ascending)
  {
    this.CnContractIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnContractId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnContractIdSortDirection ()
  {
    return this.CnContractIdSortAscending;
  }
  /** Set the case insensitive for field: CnContractId
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCnContractIdCaseInsensitive (boolean ascending)
  {
    this.CnContractIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CnContractId
   * @return boolean whether the field is case insensitive
   */
  public boolean getCnContractIdCaseInsensitive ()
  {
    return this.CnContractIdCaseInsensitive;
  }
  /** Set the field level filters for field: CnContractId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnContractIdFilter (StringFilter[] value) throws ServiceException
  {
    this.CnContractId = value;
  }
  /** Retrieve filter for field: CnContractId
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCnContractIdFilter ()
  {
    return this.CnContractId;
  }
  /** Set the field level Fetch value for field: CnContractType
   * @param fetch whether to fetch this field or not
   */
  public void setCnContractTypeFetch (boolean fetch)
  {
    this.CnContractTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnContractType
   * @return boolean the Fetch value for this field
   */
  public boolean getCnContractTypeFetch ()
  {
    return this.CnContractTypeFetch;
  }
  /** Set the SortOrder for field: CnContractType
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnContractTypeSortOrder (Integer value)
  {
    this.CnContractTypeSort = value;
  }
  /** Retrieve SortOrder for field: CnContractType
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnContractTypeSortOrder ()
  {
    return this.CnContractTypeSort;
  }
  /** Set the sort direction for field: CnContractType
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnContractTypeSortDirection (boolean ascending)
  {
    this.CnContractTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnContractType
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnContractTypeSortDirection ()
  {
    return this.CnContractTypeSortAscending;
  }
  /** Set the field level filters for field: CnContractType
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnContractTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CnContractType = value;
  }
  /** Retrieve filter for field: CnContractType
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCnContractTypeFilter ()
  {
    return this.CnContractType;
  }
  /** Set the field level Fetch value for field: CnAmount
   * @param fetch whether to fetch this field or not
   */
  public void setCnAmountFetch (boolean fetch)
  {
    this.CnAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getCnAmountFetch ()
  {
    return this.CnAmountFetch;
  }
  /** Set the SortOrder for field: CnAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnAmountSortOrder (Integer value)
  {
    this.CnAmountSort = value;
  }
  /** Retrieve SortOrder for field: CnAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnAmountSortOrder ()
  {
    return this.CnAmountSort;
  }
  /** Set the sort direction for field: CnAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnAmountSortDirection (boolean ascending)
  {
    this.CnAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnAmountSortDirection ()
  {
    return this.CnAmountSortAscending;
  }
  /** Set the field level filters for field: CnAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CnAmount = value;
  }
  /** Retrieve filter for field: CnAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCnAmountFilter ()
  {
    return this.CnAmount;
  }
  /** Set the field level Fetch value for field: CnDiscount
   * @param fetch whether to fetch this field or not
   */
  public void setCnDiscountFetch (boolean fetch)
  {
    this.CnDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnDiscount
   * @return boolean the Fetch value for this field
   */
  public boolean getCnDiscountFetch ()
  {
    return this.CnDiscountFetch;
  }
  /** Set the SortOrder for field: CnDiscount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnDiscountSortOrder (Integer value)
  {
    this.CnDiscountSort = value;
  }
  /** Retrieve SortOrder for field: CnDiscount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnDiscountSortOrder ()
  {
    return this.CnDiscountSort;
  }
  /** Set the sort direction for field: CnDiscount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnDiscountSortDirection (boolean ascending)
  {
    this.CnDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnDiscount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnDiscountSortDirection ()
  {
    return this.CnDiscountSortAscending;
  }
  /** Set the field level filters for field: CnDiscount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnDiscountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CnDiscount = value;
  }
  /** Retrieve filter for field: CnDiscount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCnDiscountFilter ()
  {
    return this.CnDiscount;
  }
  /** Set the field level Fetch value for field: CnFederalTax
   * @param fetch whether to fetch this field or not
   */
  public void setCnFederalTaxFetch (boolean fetch)
  {
    this.CnFederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnFederalTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCnFederalTaxFetch ()
  {
    return this.CnFederalTaxFetch;
  }
  /** Set the SortOrder for field: CnFederalTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnFederalTaxSortOrder (Integer value)
  {
    this.CnFederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: CnFederalTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnFederalTaxSortOrder ()
  {
    return this.CnFederalTaxSort;
  }
  /** Set the sort direction for field: CnFederalTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnFederalTaxSortDirection (boolean ascending)
  {
    this.CnFederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnFederalTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnFederalTaxSortDirection ()
  {
    return this.CnFederalTaxSortAscending;
  }
  /** Set the field level filters for field: CnFederalTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CnFederalTax = value;
  }
  /** Retrieve filter for field: CnFederalTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCnFederalTaxFilter ()
  {
    return this.CnFederalTax;
  }
  /** Set the field level Fetch value for field: CnStateTax
   * @param fetch whether to fetch this field or not
   */
  public void setCnStateTaxFetch (boolean fetch)
  {
    this.CnStateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnStateTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCnStateTaxFetch ()
  {
    return this.CnStateTaxFetch;
  }
  /** Set the SortOrder for field: CnStateTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnStateTaxSortOrder (Integer value)
  {
    this.CnStateTaxSort = value;
  }
  /** Retrieve SortOrder for field: CnStateTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnStateTaxSortOrder ()
  {
    return this.CnStateTaxSort;
  }
  /** Set the sort direction for field: CnStateTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnStateTaxSortDirection (boolean ascending)
  {
    this.CnStateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnStateTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnStateTaxSortDirection ()
  {
    return this.CnStateTaxSortAscending;
  }
  /** Set the field level filters for field: CnStateTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnStateTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CnStateTax = value;
  }
  /** Retrieve filter for field: CnStateTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCnStateTaxFilter ()
  {
    return this.CnStateTax;
  }
  /** Set the field level Fetch value for field: CnCountyTax
   * @param fetch whether to fetch this field or not
   */
  public void setCnCountyTaxFetch (boolean fetch)
  {
    this.CnCountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnCountyTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCnCountyTaxFetch ()
  {
    return this.CnCountyTaxFetch;
  }
  /** Set the SortOrder for field: CnCountyTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnCountyTaxSortOrder (Integer value)
  {
    this.CnCountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: CnCountyTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnCountyTaxSortOrder ()
  {
    return this.CnCountyTaxSort;
  }
  /** Set the sort direction for field: CnCountyTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnCountyTaxSortDirection (boolean ascending)
  {
    this.CnCountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnCountyTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnCountyTaxSortDirection ()
  {
    return this.CnCountyTaxSortAscending;
  }
  /** Set the field level filters for field: CnCountyTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CnCountyTax = value;
  }
  /** Retrieve filter for field: CnCountyTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCnCountyTaxFilter ()
  {
    return this.CnCountyTax;
  }
  /** Set the field level Fetch value for field: CnCityTax
   * @param fetch whether to fetch this field or not
   */
  public void setCnCityTaxFetch (boolean fetch)
  {
    this.CnCityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnCityTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCnCityTaxFetch ()
  {
    return this.CnCityTaxFetch;
  }
  /** Set the SortOrder for field: CnCityTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnCityTaxSortOrder (Integer value)
  {
    this.CnCityTaxSort = value;
  }
  /** Retrieve SortOrder for field: CnCityTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnCityTaxSortOrder ()
  {
    return this.CnCityTaxSort;
  }
  /** Set the sort direction for field: CnCityTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnCityTaxSortDirection (boolean ascending)
  {
    this.CnCityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnCityTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnCityTaxSortDirection ()
  {
    return this.CnCityTaxSortAscending;
  }
  /** Set the field level filters for field: CnCityTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnCityTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CnCityTax = value;
  }
  /** Retrieve filter for field: CnCityTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCnCityTaxFilter ()
  {
    return this.CnCityTax;
  }
  /** Set the field level Fetch value for field: CnOtherTax
   * @param fetch whether to fetch this field or not
   */
  public void setCnOtherTaxFetch (boolean fetch)
  {
    this.CnOtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CnOtherTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCnOtherTaxFetch ()
  {
    return this.CnOtherTaxFetch;
  }
  /** Set the SortOrder for field: CnOtherTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCnOtherTaxSortOrder (Integer value)
  {
    this.CnOtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: CnOtherTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCnOtherTaxSortOrder ()
  {
    return this.CnOtherTaxSort;
  }
  /** Set the sort direction for field: CnOtherTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCnOtherTaxSortDirection (boolean ascending)
  {
    this.CnOtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CnOtherTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCnOtherTaxSortDirection ()
  {
    return this.CnOtherTaxSortAscending;
  }
  /** Set the field level filters for field: CnOtherTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCnOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CnOtherTax = value;
  }
  /** Retrieve filter for field: CnOtherTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCnOtherTaxFilter ()
  {
    return this.CnOtherTax;
  }
  /** get the filter for ChargeElementObject
   * @return ChargeElementObjectFilter[] the filter
   */
  public ChargeElementObjectFilter[] getChargeElementObjectFilter ()
  {
    return this.cn_charge_element;
  }
  /** set the filter for ChargeElementObject
   * @param value the new filter
   */
  public void setChargeElementObjectFilter (ChargeElementObjectFilter[] value)
  {
    this.cn_charge_element = value;
  }
  public String toString() {
    return ContractQuoteObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ContractQuoteObjectHelper.toMap(this, null);
  }
}
