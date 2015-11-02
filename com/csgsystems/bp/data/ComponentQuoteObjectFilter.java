/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ComponentQuoteObjectFilter.java
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
public class ComponentQuoteObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] CmComponentInstId  = null;
  protected boolean CmComponentInstIdFetch = false;
  protected boolean CmComponentInstIdSortAscending = true;
  protected Integer CmComponentInstIdSort = null;
  /** raw field */
  public    IntegerFilter[] CmComponentInstIdServ  = null;
  protected boolean CmComponentInstIdServFetch = false;
  protected boolean CmComponentInstIdServSortAscending = true;
  protected Integer CmComponentInstIdServSort = null;
  /** raw field */
  public    IntegerFilter[] CmComponentId  = null;
  protected boolean CmComponentIdFetch = false;
  protected boolean CmComponentIdSortAscending = true;
  protected Integer CmComponentIdSort = null;
  /** raw field */
  public    BigIntegerFilter[] CmAmount  = null;
  protected boolean CmAmountFetch = false;
  protected boolean CmAmountSortAscending = true;
  protected Integer CmAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] CmDiscount  = null;
  protected boolean CmDiscountFetch = false;
  protected boolean CmDiscountSortAscending = true;
  protected Integer CmDiscountSort = null;
  /** raw field */
  public    BigIntegerFilter[] CmFederalTax  = null;
  protected boolean CmFederalTaxFetch = false;
  protected boolean CmFederalTaxSortAscending = true;
  protected Integer CmFederalTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CmStateTax  = null;
  protected boolean CmStateTaxFetch = false;
  protected boolean CmStateTaxSortAscending = true;
  protected Integer CmStateTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CmCountyTax  = null;
  protected boolean CmCountyTaxFetch = false;
  protected boolean CmCountyTaxSortAscending = true;
  protected Integer CmCountyTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CmCityTax  = null;
  protected boolean CmCityTaxFetch = false;
  protected boolean CmCityTaxSortAscending = true;
  protected Integer CmCityTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CmOtherTax  = null;
  protected boolean CmOtherTaxFetch = false;
  protected boolean CmOtherTaxSortAscending = true;
  protected Integer CmOtherTaxSort = null;
  /** cm_charge_element filter */
  public ChargeElementObjectFilter[] cm_charge_element = null;

  /** cm_contract_quote filter */
  public ContractQuoteObjectFilter[] cm_contract_quote = null;

  private String _objName = "ComponentQuoteObjectFilter";
  /** default constructor */
  public ComponentQuoteObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ComponentQuoteObjectFilter (ComponentQuoteObjectFilter other)
  {
    if (other == null) return;
    this.CmComponentInstId = other.CmComponentInstId;
    this.CmComponentInstIdFetch = other.CmComponentInstIdFetch;
    this.CmComponentInstIdSort = other.CmComponentInstIdSort;
    this.CmComponentInstIdSortAscending = other.CmComponentInstIdSortAscending;
    this.CmComponentInstIdServ = other.CmComponentInstIdServ;
    this.CmComponentInstIdServFetch = other.CmComponentInstIdServFetch;
    this.CmComponentInstIdServSort = other.CmComponentInstIdServSort;
    this.CmComponentInstIdServSortAscending = other.CmComponentInstIdServSortAscending;
    this.CmComponentId = other.CmComponentId;
    this.CmComponentIdFetch = other.CmComponentIdFetch;
    this.CmComponentIdSort = other.CmComponentIdSort;
    this.CmComponentIdSortAscending = other.CmComponentIdSortAscending;
    this.CmAmount = other.CmAmount;
    this.CmAmountFetch = other.CmAmountFetch;
    this.CmAmountSort = other.CmAmountSort;
    this.CmAmountSortAscending = other.CmAmountSortAscending;
    this.CmDiscount = other.CmDiscount;
    this.CmDiscountFetch = other.CmDiscountFetch;
    this.CmDiscountSort = other.CmDiscountSort;
    this.CmDiscountSortAscending = other.CmDiscountSortAscending;
    this.CmFederalTax = other.CmFederalTax;
    this.CmFederalTaxFetch = other.CmFederalTaxFetch;
    this.CmFederalTaxSort = other.CmFederalTaxSort;
    this.CmFederalTaxSortAscending = other.CmFederalTaxSortAscending;
    this.CmStateTax = other.CmStateTax;
    this.CmStateTaxFetch = other.CmStateTaxFetch;
    this.CmStateTaxSort = other.CmStateTaxSort;
    this.CmStateTaxSortAscending = other.CmStateTaxSortAscending;
    this.CmCountyTax = other.CmCountyTax;
    this.CmCountyTaxFetch = other.CmCountyTaxFetch;
    this.CmCountyTaxSort = other.CmCountyTaxSort;
    this.CmCountyTaxSortAscending = other.CmCountyTaxSortAscending;
    this.CmCityTax = other.CmCityTax;
    this.CmCityTaxFetch = other.CmCityTaxFetch;
    this.CmCityTaxSort = other.CmCityTaxSort;
    this.CmCityTaxSortAscending = other.CmCityTaxSortAscending;
    this.CmOtherTax = other.CmOtherTax;
    this.CmOtherTaxFetch = other.CmOtherTaxFetch;
    this.CmOtherTaxSort = other.CmOtherTaxSort;
    this.CmOtherTaxSortAscending = other.CmOtherTaxSortAscending;
    if (other.cm_charge_element != null)
    {
      this.cm_charge_element = new ChargeElementObjectFilter[other.cm_charge_element.length];
      for (int i = 0; other.cm_charge_element != null && i < other.cm_charge_element.length; i++)
      {
        if (other.cm_charge_element[i] != null)  this.cm_charge_element[i] = new ChargeElementObjectFilter (other.cm_charge_element[i]);
      }
    }

    if (other.cm_contract_quote != null)
    {
      this.cm_contract_quote = new ContractQuoteObjectFilter[other.cm_contract_quote.length];
      for (int i = 0; other.cm_contract_quote != null && i < other.cm_contract_quote.length; i++)
      {
        if (other.cm_contract_quote[i] != null)  this.cm_contract_quote[i] = new ContractQuoteObjectFilter (other.cm_contract_quote[i]);
      }
    }
  }
  /** Set the field level Fetch value for field: CmComponentInstId
   * @param fetch whether to fetch this field or not
   */
  public void setCmComponentInstIdFetch (boolean fetch)
  {
    this.CmComponentInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmComponentInstId
   * @return boolean the Fetch value for this field
   */
  public boolean getCmComponentInstIdFetch ()
  {
    return this.CmComponentInstIdFetch;
  }
  /** Set the SortOrder for field: CmComponentInstId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmComponentInstIdSortOrder (Integer value)
  {
    this.CmComponentInstIdSort = value;
  }
  /** Retrieve SortOrder for field: CmComponentInstId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmComponentInstIdSortOrder ()
  {
    return this.CmComponentInstIdSort;
  }
  /** Set the sort direction for field: CmComponentInstId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmComponentInstIdSortDirection (boolean ascending)
  {
    this.CmComponentInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmComponentInstId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmComponentInstIdSortDirection ()
  {
    return this.CmComponentInstIdSortAscending;
  }
  /** Set the field level filters for field: CmComponentInstId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmComponentInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CmComponentInstId = value;
  }
  /** Retrieve filter for field: CmComponentInstId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCmComponentInstIdFilter ()
  {
    return this.CmComponentInstId;
  }
  /** Set the field level Fetch value for field: CmComponentInstIdServ
   * @param fetch whether to fetch this field or not
   */
  public void setCmComponentInstIdServFetch (boolean fetch)
  {
    this.CmComponentInstIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmComponentInstIdServ
   * @return boolean the Fetch value for this field
   */
  public boolean getCmComponentInstIdServFetch ()
  {
    return this.CmComponentInstIdServFetch;
  }
  /** Set the SortOrder for field: CmComponentInstIdServ
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmComponentInstIdServSortOrder (Integer value)
  {
    this.CmComponentInstIdServSort = value;
  }
  /** Retrieve SortOrder for field: CmComponentInstIdServ
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmComponentInstIdServSortOrder ()
  {
    return this.CmComponentInstIdServSort;
  }
  /** Set the sort direction for field: CmComponentInstIdServ
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmComponentInstIdServSortDirection (boolean ascending)
  {
    this.CmComponentInstIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmComponentInstIdServ
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmComponentInstIdServSortDirection ()
  {
    return this.CmComponentInstIdServSortAscending;
  }
  /** Set the field level filters for field: CmComponentInstIdServ
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmComponentInstIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CmComponentInstIdServ = value;
  }
  /** Retrieve filter for field: CmComponentInstIdServ
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCmComponentInstIdServFilter ()
  {
    return this.CmComponentInstIdServ;
  }
  /** Set the field level Fetch value for field: CmComponentId
   * @param fetch whether to fetch this field or not
   */
  public void setCmComponentIdFetch (boolean fetch)
  {
    this.CmComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmComponentId
   * @return boolean the Fetch value for this field
   */
  public boolean getCmComponentIdFetch ()
  {
    return this.CmComponentIdFetch;
  }
  /** Set the SortOrder for field: CmComponentId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmComponentIdSortOrder (Integer value)
  {
    this.CmComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: CmComponentId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmComponentIdSortOrder ()
  {
    return this.CmComponentIdSort;
  }
  /** Set the sort direction for field: CmComponentId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmComponentIdSortDirection (boolean ascending)
  {
    this.CmComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmComponentId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmComponentIdSortDirection ()
  {
    return this.CmComponentIdSortAscending;
  }
  /** Set the field level filters for field: CmComponentId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmComponentIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CmComponentId = value;
  }
  /** Retrieve filter for field: CmComponentId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCmComponentIdFilter ()
  {
    return this.CmComponentId;
  }
  /** Set the field level Fetch value for field: CmAmount
   * @param fetch whether to fetch this field or not
   */
  public void setCmAmountFetch (boolean fetch)
  {
    this.CmAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getCmAmountFetch ()
  {
    return this.CmAmountFetch;
  }
  /** Set the SortOrder for field: CmAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmAmountSortOrder (Integer value)
  {
    this.CmAmountSort = value;
  }
  /** Retrieve SortOrder for field: CmAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmAmountSortOrder ()
  {
    return this.CmAmountSort;
  }
  /** Set the sort direction for field: CmAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmAmountSortDirection (boolean ascending)
  {
    this.CmAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmAmountSortDirection ()
  {
    return this.CmAmountSortAscending;
  }
  /** Set the field level filters for field: CmAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CmAmount = value;
  }
  /** Retrieve filter for field: CmAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCmAmountFilter ()
  {
    return this.CmAmount;
  }
  /** Set the field level Fetch value for field: CmDiscount
   * @param fetch whether to fetch this field or not
   */
  public void setCmDiscountFetch (boolean fetch)
  {
    this.CmDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmDiscount
   * @return boolean the Fetch value for this field
   */
  public boolean getCmDiscountFetch ()
  {
    return this.CmDiscountFetch;
  }
  /** Set the SortOrder for field: CmDiscount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmDiscountSortOrder (Integer value)
  {
    this.CmDiscountSort = value;
  }
  /** Retrieve SortOrder for field: CmDiscount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmDiscountSortOrder ()
  {
    return this.CmDiscountSort;
  }
  /** Set the sort direction for field: CmDiscount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmDiscountSortDirection (boolean ascending)
  {
    this.CmDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmDiscount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmDiscountSortDirection ()
  {
    return this.CmDiscountSortAscending;
  }
  /** Set the field level filters for field: CmDiscount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmDiscountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CmDiscount = value;
  }
  /** Retrieve filter for field: CmDiscount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCmDiscountFilter ()
  {
    return this.CmDiscount;
  }
  /** Set the field level Fetch value for field: CmFederalTax
   * @param fetch whether to fetch this field or not
   */
  public void setCmFederalTaxFetch (boolean fetch)
  {
    this.CmFederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmFederalTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCmFederalTaxFetch ()
  {
    return this.CmFederalTaxFetch;
  }
  /** Set the SortOrder for field: CmFederalTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmFederalTaxSortOrder (Integer value)
  {
    this.CmFederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: CmFederalTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmFederalTaxSortOrder ()
  {
    return this.CmFederalTaxSort;
  }
  /** Set the sort direction for field: CmFederalTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmFederalTaxSortDirection (boolean ascending)
  {
    this.CmFederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmFederalTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmFederalTaxSortDirection ()
  {
    return this.CmFederalTaxSortAscending;
  }
  /** Set the field level filters for field: CmFederalTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CmFederalTax = value;
  }
  /** Retrieve filter for field: CmFederalTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCmFederalTaxFilter ()
  {
    return this.CmFederalTax;
  }
  /** Set the field level Fetch value for field: CmStateTax
   * @param fetch whether to fetch this field or not
   */
  public void setCmStateTaxFetch (boolean fetch)
  {
    this.CmStateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmStateTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCmStateTaxFetch ()
  {
    return this.CmStateTaxFetch;
  }
  /** Set the SortOrder for field: CmStateTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmStateTaxSortOrder (Integer value)
  {
    this.CmStateTaxSort = value;
  }
  /** Retrieve SortOrder for field: CmStateTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmStateTaxSortOrder ()
  {
    return this.CmStateTaxSort;
  }
  /** Set the sort direction for field: CmStateTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmStateTaxSortDirection (boolean ascending)
  {
    this.CmStateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmStateTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmStateTaxSortDirection ()
  {
    return this.CmStateTaxSortAscending;
  }
  /** Set the field level filters for field: CmStateTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmStateTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CmStateTax = value;
  }
  /** Retrieve filter for field: CmStateTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCmStateTaxFilter ()
  {
    return this.CmStateTax;
  }
  /** Set the field level Fetch value for field: CmCountyTax
   * @param fetch whether to fetch this field or not
   */
  public void setCmCountyTaxFetch (boolean fetch)
  {
    this.CmCountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmCountyTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCmCountyTaxFetch ()
  {
    return this.CmCountyTaxFetch;
  }
  /** Set the SortOrder for field: CmCountyTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmCountyTaxSortOrder (Integer value)
  {
    this.CmCountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: CmCountyTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmCountyTaxSortOrder ()
  {
    return this.CmCountyTaxSort;
  }
  /** Set the sort direction for field: CmCountyTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmCountyTaxSortDirection (boolean ascending)
  {
    this.CmCountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmCountyTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmCountyTaxSortDirection ()
  {
    return this.CmCountyTaxSortAscending;
  }
  /** Set the field level filters for field: CmCountyTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CmCountyTax = value;
  }
  /** Retrieve filter for field: CmCountyTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCmCountyTaxFilter ()
  {
    return this.CmCountyTax;
  }
  /** Set the field level Fetch value for field: CmCityTax
   * @param fetch whether to fetch this field or not
   */
  public void setCmCityTaxFetch (boolean fetch)
  {
    this.CmCityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmCityTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCmCityTaxFetch ()
  {
    return this.CmCityTaxFetch;
  }
  /** Set the SortOrder for field: CmCityTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmCityTaxSortOrder (Integer value)
  {
    this.CmCityTaxSort = value;
  }
  /** Retrieve SortOrder for field: CmCityTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmCityTaxSortOrder ()
  {
    return this.CmCityTaxSort;
  }
  /** Set the sort direction for field: CmCityTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmCityTaxSortDirection (boolean ascending)
  {
    this.CmCityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmCityTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmCityTaxSortDirection ()
  {
    return this.CmCityTaxSortAscending;
  }
  /** Set the field level filters for field: CmCityTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmCityTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CmCityTax = value;
  }
  /** Retrieve filter for field: CmCityTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCmCityTaxFilter ()
  {
    return this.CmCityTax;
  }
  /** Set the field level Fetch value for field: CmOtherTax
   * @param fetch whether to fetch this field or not
   */
  public void setCmOtherTaxFetch (boolean fetch)
  {
    this.CmOtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmOtherTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCmOtherTaxFetch ()
  {
    return this.CmOtherTaxFetch;
  }
  /** Set the SortOrder for field: CmOtherTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmOtherTaxSortOrder (Integer value)
  {
    this.CmOtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: CmOtherTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmOtherTaxSortOrder ()
  {
    return this.CmOtherTaxSort;
  }
  /** Set the sort direction for field: CmOtherTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmOtherTaxSortDirection (boolean ascending)
  {
    this.CmOtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmOtherTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmOtherTaxSortDirection ()
  {
    return this.CmOtherTaxSortAscending;
  }
  /** Set the field level filters for field: CmOtherTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CmOtherTax = value;
  }
  /** Retrieve filter for field: CmOtherTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCmOtherTaxFilter ()
  {
    return this.CmOtherTax;
  }
  /** get the filter for ChargeElementObject
   * @return ChargeElementObjectFilter[] the filter
   */
  public ChargeElementObjectFilter[] getChargeElementObjectFilter ()
  {
    return this.cm_charge_element;
  }
  /** set the filter for ChargeElementObject
   * @param value the new filter
   */
  public void setChargeElementObjectFilter (ChargeElementObjectFilter[] value)
  {
    this.cm_charge_element = value;
  }
  /** get the filter for ContractQuoteObject
   * @return ContractQuoteObjectFilter[] the filter
   */
  public ContractQuoteObjectFilter[] getContractQuoteObjectFilter ()
  {
    return this.cm_contract_quote;
  }
  /** set the filter for ContractQuoteObject
   * @param value the new filter
   */
  public void setContractQuoteObjectFilter (ContractQuoteObjectFilter[] value)
  {
    this.cm_contract_quote = value;
  }
  public String toString() {
    return ComponentQuoteObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ComponentQuoteObjectHelper.toMap(this, null);
  }
}
