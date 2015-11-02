/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceInstanceQuoteObjectFilter.java
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
public class ServiceInstanceQuoteObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] SiSubscrNo  = null;
  protected boolean SiSubscrNoFetch = false;
  protected boolean SiSubscrNoSortAscending = true;
  protected Integer SiSubscrNoSort = null;
  /** raw field */
  public    IntegerFilter[] SiSubscrNoResets  = null;
  protected boolean SiSubscrNoResetsFetch = false;
  protected boolean SiSubscrNoResetsSortAscending = true;
  protected Integer SiSubscrNoResetsSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiServiceOrderId  = null;
  protected boolean SiServiceOrderIdFetch = false;
  protected boolean SiServiceOrderIdSortAscending = true;
  protected Integer SiServiceOrderIdSort = null;
  /** raw field */
  public    IntegerFilter[] SiEmfConfigId  = null;
  protected boolean SiEmfConfigIdFetch = false;
  protected boolean SiEmfConfigIdSortAscending = true;
  protected Integer SiEmfConfigIdSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiAmount  = null;
  protected boolean SiAmountFetch = false;
  protected boolean SiAmountSortAscending = true;
  protected Integer SiAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiDiscount  = null;
  protected boolean SiDiscountFetch = false;
  protected boolean SiDiscountSortAscending = true;
  protected Integer SiDiscountSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiFederalTax  = null;
  protected boolean SiFederalTaxFetch = false;
  protected boolean SiFederalTaxSortAscending = true;
  protected Integer SiFederalTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiStateTax  = null;
  protected boolean SiStateTaxFetch = false;
  protected boolean SiStateTaxSortAscending = true;
  protected Integer SiStateTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiCountyTax  = null;
  protected boolean SiCountyTaxFetch = false;
  protected boolean SiCountyTaxSortAscending = true;
  protected Integer SiCountyTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiCityTax  = null;
  protected boolean SiCityTaxFetch = false;
  protected boolean SiCityTaxSortAscending = true;
  protected Integer SiCityTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] SiOtherTax  = null;
  protected boolean SiOtherTaxFetch = false;
  protected boolean SiOtherTaxSortAscending = true;
  protected Integer SiOtherTaxSort = null;
  /** si_charge_element filter */
  public ChargeElementObjectFilter[] si_charge_element = null;

  /** si_contract_quote filter */
  public ContractQuoteObjectFilter[] si_contract_quote = null;

  private String _objName = "ServiceInstanceQuoteObjectFilter";
  /** default constructor */
  public ServiceInstanceQuoteObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ServiceInstanceQuoteObjectFilter (ServiceInstanceQuoteObjectFilter other)
  {
    if (other == null) return;
    this.SiSubscrNo = other.SiSubscrNo;
    this.SiSubscrNoFetch = other.SiSubscrNoFetch;
    this.SiSubscrNoSort = other.SiSubscrNoSort;
    this.SiSubscrNoSortAscending = other.SiSubscrNoSortAscending;
    this.SiSubscrNoResets = other.SiSubscrNoResets;
    this.SiSubscrNoResetsFetch = other.SiSubscrNoResetsFetch;
    this.SiSubscrNoResetsSort = other.SiSubscrNoResetsSort;
    this.SiSubscrNoResetsSortAscending = other.SiSubscrNoResetsSortAscending;
    this.SiServiceOrderId = other.SiServiceOrderId;
    this.SiServiceOrderIdFetch = other.SiServiceOrderIdFetch;
    this.SiServiceOrderIdSort = other.SiServiceOrderIdSort;
    this.SiServiceOrderIdSortAscending = other.SiServiceOrderIdSortAscending;
    this.SiEmfConfigId = other.SiEmfConfigId;
    this.SiEmfConfigIdFetch = other.SiEmfConfigIdFetch;
    this.SiEmfConfigIdSort = other.SiEmfConfigIdSort;
    this.SiEmfConfigIdSortAscending = other.SiEmfConfigIdSortAscending;
    this.SiAmount = other.SiAmount;
    this.SiAmountFetch = other.SiAmountFetch;
    this.SiAmountSort = other.SiAmountSort;
    this.SiAmountSortAscending = other.SiAmountSortAscending;
    this.SiDiscount = other.SiDiscount;
    this.SiDiscountFetch = other.SiDiscountFetch;
    this.SiDiscountSort = other.SiDiscountSort;
    this.SiDiscountSortAscending = other.SiDiscountSortAscending;
    this.SiFederalTax = other.SiFederalTax;
    this.SiFederalTaxFetch = other.SiFederalTaxFetch;
    this.SiFederalTaxSort = other.SiFederalTaxSort;
    this.SiFederalTaxSortAscending = other.SiFederalTaxSortAscending;
    this.SiStateTax = other.SiStateTax;
    this.SiStateTaxFetch = other.SiStateTaxFetch;
    this.SiStateTaxSort = other.SiStateTaxSort;
    this.SiStateTaxSortAscending = other.SiStateTaxSortAscending;
    this.SiCountyTax = other.SiCountyTax;
    this.SiCountyTaxFetch = other.SiCountyTaxFetch;
    this.SiCountyTaxSort = other.SiCountyTaxSort;
    this.SiCountyTaxSortAscending = other.SiCountyTaxSortAscending;
    this.SiCityTax = other.SiCityTax;
    this.SiCityTaxFetch = other.SiCityTaxFetch;
    this.SiCityTaxSort = other.SiCityTaxSort;
    this.SiCityTaxSortAscending = other.SiCityTaxSortAscending;
    this.SiOtherTax = other.SiOtherTax;
    this.SiOtherTaxFetch = other.SiOtherTaxFetch;
    this.SiOtherTaxSort = other.SiOtherTaxSort;
    this.SiOtherTaxSortAscending = other.SiOtherTaxSortAscending;
    if (other.si_charge_element != null)
    {
      this.si_charge_element = new ChargeElementObjectFilter[other.si_charge_element.length];
      for (int i = 0; other.si_charge_element != null && i < other.si_charge_element.length; i++)
      {
        if (other.si_charge_element[i] != null)  this.si_charge_element[i] = new ChargeElementObjectFilter (other.si_charge_element[i]);
      }
    }

    if (other.si_contract_quote != null)
    {
      this.si_contract_quote = new ContractQuoteObjectFilter[other.si_contract_quote.length];
      for (int i = 0; other.si_contract_quote != null && i < other.si_contract_quote.length; i++)
      {
        if (other.si_contract_quote[i] != null)  this.si_contract_quote[i] = new ContractQuoteObjectFilter (other.si_contract_quote[i]);
      }
    }
  }
  /** Set the field level Fetch value for field: SiSubscrNo
   * @param fetch whether to fetch this field or not
   */
  public void setSiSubscrNoFetch (boolean fetch)
  {
    this.SiSubscrNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiSubscrNo
   * @return boolean the Fetch value for this field
   */
  public boolean getSiSubscrNoFetch ()
  {
    return this.SiSubscrNoFetch;
  }
  /** Set the SortOrder for field: SiSubscrNo
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiSubscrNoSortOrder (Integer value)
  {
    this.SiSubscrNoSort = value;
  }
  /** Retrieve SortOrder for field: SiSubscrNo
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiSubscrNoSortOrder ()
  {
    return this.SiSubscrNoSort;
  }
  /** Set the sort direction for field: SiSubscrNo
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiSubscrNoSortDirection (boolean ascending)
  {
    this.SiSubscrNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiSubscrNo
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiSubscrNoSortDirection ()
  {
    return this.SiSubscrNoSortAscending;
  }
  /** Set the field level filters for field: SiSubscrNo
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiSubscrNoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.SiSubscrNo = value;
  }
  /** Retrieve filter for field: SiSubscrNo
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSiSubscrNoFilter ()
  {
    return this.SiSubscrNo;
  }
  /** Set the field level Fetch value for field: SiSubscrNoResets
   * @param fetch whether to fetch this field or not
   */
  public void setSiSubscrNoResetsFetch (boolean fetch)
  {
    this.SiSubscrNoResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiSubscrNoResets
   * @return boolean the Fetch value for this field
   */
  public boolean getSiSubscrNoResetsFetch ()
  {
    return this.SiSubscrNoResetsFetch;
  }
  /** Set the SortOrder for field: SiSubscrNoResets
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiSubscrNoResetsSortOrder (Integer value)
  {
    this.SiSubscrNoResetsSort = value;
  }
  /** Retrieve SortOrder for field: SiSubscrNoResets
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiSubscrNoResetsSortOrder ()
  {
    return this.SiSubscrNoResetsSort;
  }
  /** Set the sort direction for field: SiSubscrNoResets
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiSubscrNoResetsSortDirection (boolean ascending)
  {
    this.SiSubscrNoResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiSubscrNoResets
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiSubscrNoResetsSortDirection ()
  {
    return this.SiSubscrNoResetsSortAscending;
  }
  /** Set the field level filters for field: SiSubscrNoResets
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiSubscrNoResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    this.SiSubscrNoResets = value;
  }
  /** Retrieve filter for field: SiSubscrNoResets
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSiSubscrNoResetsFilter ()
  {
    return this.SiSubscrNoResets;
  }
  /** Set the field level Fetch value for field: SiServiceOrderId
   * @param fetch whether to fetch this field or not
   */
  public void setSiServiceOrderIdFetch (boolean fetch)
  {
    this.SiServiceOrderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiServiceOrderId
   * @return boolean the Fetch value for this field
   */
  public boolean getSiServiceOrderIdFetch ()
  {
    return this.SiServiceOrderIdFetch;
  }
  /** Set the SortOrder for field: SiServiceOrderId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiServiceOrderIdSortOrder (Integer value)
  {
    this.SiServiceOrderIdSort = value;
  }
  /** Retrieve SortOrder for field: SiServiceOrderId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiServiceOrderIdSortOrder ()
  {
    return this.SiServiceOrderIdSort;
  }
  /** Set the sort direction for field: SiServiceOrderId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiServiceOrderIdSortDirection (boolean ascending)
  {
    this.SiServiceOrderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiServiceOrderId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiServiceOrderIdSortDirection ()
  {
    return this.SiServiceOrderIdSortAscending;
  }
  /** Set the field level filters for field: SiServiceOrderId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiServiceOrderIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiServiceOrderId = value;
  }
  /** Retrieve filter for field: SiServiceOrderId
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiServiceOrderIdFilter ()
  {
    return this.SiServiceOrderId;
  }
  /** Set the field level Fetch value for field: SiEmfConfigId
   * @param fetch whether to fetch this field or not
   */
  public void setSiEmfConfigIdFetch (boolean fetch)
  {
    this.SiEmfConfigIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiEmfConfigId
   * @return boolean the Fetch value for this field
   */
  public boolean getSiEmfConfigIdFetch ()
  {
    return this.SiEmfConfigIdFetch;
  }
  /** Set the SortOrder for field: SiEmfConfigId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiEmfConfigIdSortOrder (Integer value)
  {
    this.SiEmfConfigIdSort = value;
  }
  /** Retrieve SortOrder for field: SiEmfConfigId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiEmfConfigIdSortOrder ()
  {
    return this.SiEmfConfigIdSort;
  }
  /** Set the sort direction for field: SiEmfConfigId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiEmfConfigIdSortDirection (boolean ascending)
  {
    this.SiEmfConfigIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiEmfConfigId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiEmfConfigIdSortDirection ()
  {
    return this.SiEmfConfigIdSortAscending;
  }
  /** Set the field level filters for field: SiEmfConfigId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiEmfConfigIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.SiEmfConfigId = value;
  }
  /** Retrieve filter for field: SiEmfConfigId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSiEmfConfigIdFilter ()
  {
    return this.SiEmfConfigId;
  }
  /** Set the field level Fetch value for field: SiAmount
   * @param fetch whether to fetch this field or not
   */
  public void setSiAmountFetch (boolean fetch)
  {
    this.SiAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getSiAmountFetch ()
  {
    return this.SiAmountFetch;
  }
  /** Set the SortOrder for field: SiAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiAmountSortOrder (Integer value)
  {
    this.SiAmountSort = value;
  }
  /** Retrieve SortOrder for field: SiAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiAmountSortOrder ()
  {
    return this.SiAmountSort;
  }
  /** Set the sort direction for field: SiAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiAmountSortDirection (boolean ascending)
  {
    this.SiAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiAmountSortDirection ()
  {
    return this.SiAmountSortAscending;
  }
  /** Set the field level filters for field: SiAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiAmount = value;
  }
  /** Retrieve filter for field: SiAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiAmountFilter ()
  {
    return this.SiAmount;
  }
  /** Set the field level Fetch value for field: SiDiscount
   * @param fetch whether to fetch this field or not
   */
  public void setSiDiscountFetch (boolean fetch)
  {
    this.SiDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiDiscount
   * @return boolean the Fetch value for this field
   */
  public boolean getSiDiscountFetch ()
  {
    return this.SiDiscountFetch;
  }
  /** Set the SortOrder for field: SiDiscount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiDiscountSortOrder (Integer value)
  {
    this.SiDiscountSort = value;
  }
  /** Retrieve SortOrder for field: SiDiscount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiDiscountSortOrder ()
  {
    return this.SiDiscountSort;
  }
  /** Set the sort direction for field: SiDiscount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiDiscountSortDirection (boolean ascending)
  {
    this.SiDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiDiscount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiDiscountSortDirection ()
  {
    return this.SiDiscountSortAscending;
  }
  /** Set the field level filters for field: SiDiscount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiDiscountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiDiscount = value;
  }
  /** Retrieve filter for field: SiDiscount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiDiscountFilter ()
  {
    return this.SiDiscount;
  }
  /** Set the field level Fetch value for field: SiFederalTax
   * @param fetch whether to fetch this field or not
   */
  public void setSiFederalTaxFetch (boolean fetch)
  {
    this.SiFederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiFederalTax
   * @return boolean the Fetch value for this field
   */
  public boolean getSiFederalTaxFetch ()
  {
    return this.SiFederalTaxFetch;
  }
  /** Set the SortOrder for field: SiFederalTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiFederalTaxSortOrder (Integer value)
  {
    this.SiFederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: SiFederalTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiFederalTaxSortOrder ()
  {
    return this.SiFederalTaxSort;
  }
  /** Set the sort direction for field: SiFederalTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiFederalTaxSortDirection (boolean ascending)
  {
    this.SiFederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiFederalTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiFederalTaxSortDirection ()
  {
    return this.SiFederalTaxSortAscending;
  }
  /** Set the field level filters for field: SiFederalTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiFederalTax = value;
  }
  /** Retrieve filter for field: SiFederalTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiFederalTaxFilter ()
  {
    return this.SiFederalTax;
  }
  /** Set the field level Fetch value for field: SiStateTax
   * @param fetch whether to fetch this field or not
   */
  public void setSiStateTaxFetch (boolean fetch)
  {
    this.SiStateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiStateTax
   * @return boolean the Fetch value for this field
   */
  public boolean getSiStateTaxFetch ()
  {
    return this.SiStateTaxFetch;
  }
  /** Set the SortOrder for field: SiStateTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiStateTaxSortOrder (Integer value)
  {
    this.SiStateTaxSort = value;
  }
  /** Retrieve SortOrder for field: SiStateTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiStateTaxSortOrder ()
  {
    return this.SiStateTaxSort;
  }
  /** Set the sort direction for field: SiStateTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiStateTaxSortDirection (boolean ascending)
  {
    this.SiStateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiStateTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiStateTaxSortDirection ()
  {
    return this.SiStateTaxSortAscending;
  }
  /** Set the field level filters for field: SiStateTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiStateTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiStateTax = value;
  }
  /** Retrieve filter for field: SiStateTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiStateTaxFilter ()
  {
    return this.SiStateTax;
  }
  /** Set the field level Fetch value for field: SiCountyTax
   * @param fetch whether to fetch this field or not
   */
  public void setSiCountyTaxFetch (boolean fetch)
  {
    this.SiCountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiCountyTax
   * @return boolean the Fetch value for this field
   */
  public boolean getSiCountyTaxFetch ()
  {
    return this.SiCountyTaxFetch;
  }
  /** Set the SortOrder for field: SiCountyTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiCountyTaxSortOrder (Integer value)
  {
    this.SiCountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: SiCountyTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiCountyTaxSortOrder ()
  {
    return this.SiCountyTaxSort;
  }
  /** Set the sort direction for field: SiCountyTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiCountyTaxSortDirection (boolean ascending)
  {
    this.SiCountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiCountyTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiCountyTaxSortDirection ()
  {
    return this.SiCountyTaxSortAscending;
  }
  /** Set the field level filters for field: SiCountyTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiCountyTax = value;
  }
  /** Retrieve filter for field: SiCountyTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiCountyTaxFilter ()
  {
    return this.SiCountyTax;
  }
  /** Set the field level Fetch value for field: SiCityTax
   * @param fetch whether to fetch this field or not
   */
  public void setSiCityTaxFetch (boolean fetch)
  {
    this.SiCityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiCityTax
   * @return boolean the Fetch value for this field
   */
  public boolean getSiCityTaxFetch ()
  {
    return this.SiCityTaxFetch;
  }
  /** Set the SortOrder for field: SiCityTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiCityTaxSortOrder (Integer value)
  {
    this.SiCityTaxSort = value;
  }
  /** Retrieve SortOrder for field: SiCityTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiCityTaxSortOrder ()
  {
    return this.SiCityTaxSort;
  }
  /** Set the sort direction for field: SiCityTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiCityTaxSortDirection (boolean ascending)
  {
    this.SiCityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiCityTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiCityTaxSortDirection ()
  {
    return this.SiCityTaxSortAscending;
  }
  /** Set the field level filters for field: SiCityTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiCityTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiCityTax = value;
  }
  /** Retrieve filter for field: SiCityTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiCityTaxFilter ()
  {
    return this.SiCityTax;
  }
  /** Set the field level Fetch value for field: SiOtherTax
   * @param fetch whether to fetch this field or not
   */
  public void setSiOtherTaxFetch (boolean fetch)
  {
    this.SiOtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: SiOtherTax
   * @return boolean the Fetch value for this field
   */
  public boolean getSiOtherTaxFetch ()
  {
    return this.SiOtherTaxFetch;
  }
  /** Set the SortOrder for field: SiOtherTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSiOtherTaxSortOrder (Integer value)
  {
    this.SiOtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: SiOtherTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSiOtherTaxSortOrder ()
  {
    return this.SiOtherTaxSort;
  }
  /** Set the sort direction for field: SiOtherTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSiOtherTaxSortDirection (boolean ascending)
  {
    this.SiOtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SiOtherTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSiOtherTaxSortDirection ()
  {
    return this.SiOtherTaxSortAscending;
  }
  /** Set the field level filters for field: SiOtherTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSiOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.SiOtherTax = value;
  }
  /** Retrieve filter for field: SiOtherTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSiOtherTaxFilter ()
  {
    return this.SiOtherTax;
  }
  /** get the filter for ChargeElementObject
   * @return ChargeElementObjectFilter[] the filter
   */
  public ChargeElementObjectFilter[] getChargeElementObjectFilter ()
  {
    return this.si_charge_element;
  }
  /** set the filter for ChargeElementObject
   * @param value the new filter
   */
  public void setChargeElementObjectFilter (ChargeElementObjectFilter[] value)
  {
    this.si_charge_element = value;
  }
  /** get the filter for ContractQuoteObject
   * @return ContractQuoteObjectFilter[] the filter
   */
  public ContractQuoteObjectFilter[] getContractQuoteObjectFilter ()
  {
    return this.si_contract_quote;
  }
  /** set the filter for ContractQuoteObject
   * @param value the new filter
   */
  public void setContractQuoteObjectFilter (ContractQuoteObjectFilter[] value)
  {
    this.si_contract_quote = value;
  }
  public String toString() {
    return ServiceInstanceQuoteObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServiceInstanceQuoteObjectHelper.toMap(this, null);
  }
}
