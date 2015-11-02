/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountQuoteObjectFilter.java
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
public class AccountQuoteObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] AcAccountNo  = null;
  protected boolean AcAccountNoFetch = false;
  protected boolean AcAccountNoSortAscending = true;
  protected Integer AcAccountNoSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcServiceOrderId  = null;
  protected boolean AcServiceOrderIdFetch = false;
  protected boolean AcServiceOrderIdSortAscending = true;
  protected Integer AcServiceOrderIdSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcAmount  = null;
  protected boolean AcAmountFetch = false;
  protected boolean AcAmountSortAscending = true;
  protected Integer AcAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcDiscount  = null;
  protected boolean AcDiscountFetch = false;
  protected boolean AcDiscountSortAscending = true;
  protected Integer AcDiscountSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcFederalTax  = null;
  protected boolean AcFederalTaxFetch = false;
  protected boolean AcFederalTaxSortAscending = true;
  protected Integer AcFederalTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcStateTax  = null;
  protected boolean AcStateTaxFetch = false;
  protected boolean AcStateTaxSortAscending = true;
  protected Integer AcStateTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcCountyTax  = null;
  protected boolean AcCountyTaxFetch = false;
  protected boolean AcCountyTaxSortAscending = true;
  protected Integer AcCountyTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcCityTax  = null;
  protected boolean AcCityTaxFetch = false;
  protected boolean AcCityTaxSortAscending = true;
  protected Integer AcCityTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] AcOtherTax  = null;
  protected boolean AcOtherTaxFetch = false;
  protected boolean AcOtherTaxSortAscending = true;
  protected Integer AcOtherTaxSort = null;
  /** ac_charge_element filter */
  public ChargeElementObjectFilter[] ac_charge_element = null;

  /** ac_service_instance_quote filter */
  public ServiceInstanceQuoteObjectFilter[] ac_service_instance_quote = null;

  /** ac_contract_quote filter */
  public ContractQuoteObjectFilter[] ac_contract_quote = null;

  /** ac_package_quote filter */
  public PackageQuoteObjectFilter[] ac_package_quote = null;

  private String _objName = "AccountQuoteObjectFilter";
  /** default constructor */
  public AccountQuoteObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AccountQuoteObjectFilter (AccountQuoteObjectFilter other)
  {
    if (other == null) return;
    this.AcAccountNo = other.AcAccountNo;
    this.AcAccountNoFetch = other.AcAccountNoFetch;
    this.AcAccountNoSort = other.AcAccountNoSort;
    this.AcAccountNoSortAscending = other.AcAccountNoSortAscending;
    this.AcServiceOrderId = other.AcServiceOrderId;
    this.AcServiceOrderIdFetch = other.AcServiceOrderIdFetch;
    this.AcServiceOrderIdSort = other.AcServiceOrderIdSort;
    this.AcServiceOrderIdSortAscending = other.AcServiceOrderIdSortAscending;
    this.AcAmount = other.AcAmount;
    this.AcAmountFetch = other.AcAmountFetch;
    this.AcAmountSort = other.AcAmountSort;
    this.AcAmountSortAscending = other.AcAmountSortAscending;
    this.AcDiscount = other.AcDiscount;
    this.AcDiscountFetch = other.AcDiscountFetch;
    this.AcDiscountSort = other.AcDiscountSort;
    this.AcDiscountSortAscending = other.AcDiscountSortAscending;
    this.AcFederalTax = other.AcFederalTax;
    this.AcFederalTaxFetch = other.AcFederalTaxFetch;
    this.AcFederalTaxSort = other.AcFederalTaxSort;
    this.AcFederalTaxSortAscending = other.AcFederalTaxSortAscending;
    this.AcStateTax = other.AcStateTax;
    this.AcStateTaxFetch = other.AcStateTaxFetch;
    this.AcStateTaxSort = other.AcStateTaxSort;
    this.AcStateTaxSortAscending = other.AcStateTaxSortAscending;
    this.AcCountyTax = other.AcCountyTax;
    this.AcCountyTaxFetch = other.AcCountyTaxFetch;
    this.AcCountyTaxSort = other.AcCountyTaxSort;
    this.AcCountyTaxSortAscending = other.AcCountyTaxSortAscending;
    this.AcCityTax = other.AcCityTax;
    this.AcCityTaxFetch = other.AcCityTaxFetch;
    this.AcCityTaxSort = other.AcCityTaxSort;
    this.AcCityTaxSortAscending = other.AcCityTaxSortAscending;
    this.AcOtherTax = other.AcOtherTax;
    this.AcOtherTaxFetch = other.AcOtherTaxFetch;
    this.AcOtherTaxSort = other.AcOtherTaxSort;
    this.AcOtherTaxSortAscending = other.AcOtherTaxSortAscending;
    if (other.ac_charge_element != null)
    {
      this.ac_charge_element = new ChargeElementObjectFilter[other.ac_charge_element.length];
      for (int i = 0; other.ac_charge_element != null && i < other.ac_charge_element.length; i++)
      {
        if (other.ac_charge_element[i] != null)  this.ac_charge_element[i] = new ChargeElementObjectFilter (other.ac_charge_element[i]);
      }
    }

    if (other.ac_service_instance_quote != null)
    {
      this.ac_service_instance_quote = new ServiceInstanceQuoteObjectFilter[other.ac_service_instance_quote.length];
      for (int i = 0; other.ac_service_instance_quote != null && i < other.ac_service_instance_quote.length; i++)
      {
        if (other.ac_service_instance_quote[i] != null)  this.ac_service_instance_quote[i] = new ServiceInstanceQuoteObjectFilter (other.ac_service_instance_quote[i]);
      }
    }

    if (other.ac_contract_quote != null)
    {
      this.ac_contract_quote = new ContractQuoteObjectFilter[other.ac_contract_quote.length];
      for (int i = 0; other.ac_contract_quote != null && i < other.ac_contract_quote.length; i++)
      {
        if (other.ac_contract_quote[i] != null)  this.ac_contract_quote[i] = new ContractQuoteObjectFilter (other.ac_contract_quote[i]);
      }
    }

    if (other.ac_package_quote != null)
    {
      this.ac_package_quote = new PackageQuoteObjectFilter[other.ac_package_quote.length];
      for (int i = 0; other.ac_package_quote != null && i < other.ac_package_quote.length; i++)
      {
        if (other.ac_package_quote[i] != null)  this.ac_package_quote[i] = new PackageQuoteObjectFilter (other.ac_package_quote[i]);
      }
    }
  }
  /** Set the field level Fetch value for field: AcAccountNo
   * @param fetch whether to fetch this field or not
   */
  public void setAcAccountNoFetch (boolean fetch)
  {
    this.AcAccountNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcAccountNo
   * @return boolean the Fetch value for this field
   */
  public boolean getAcAccountNoFetch ()
  {
    return this.AcAccountNoFetch;
  }
  /** Set the SortOrder for field: AcAccountNo
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcAccountNoSortOrder (Integer value)
  {
    this.AcAccountNoSort = value;
  }
  /** Retrieve SortOrder for field: AcAccountNo
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcAccountNoSortOrder ()
  {
    return this.AcAccountNoSort;
  }
  /** Set the sort direction for field: AcAccountNo
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcAccountNoSortDirection (boolean ascending)
  {
    this.AcAccountNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcAccountNo
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcAccountNoSortDirection ()
  {
    return this.AcAccountNoSortAscending;
  }
  /** Set the field level filters for field: AcAccountNo
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcAccountNoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.AcAccountNo = value;
  }
  /** Retrieve filter for field: AcAccountNo
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcAccountNoFilter ()
  {
    return this.AcAccountNo;
  }
  /** Set the field level Fetch value for field: AcServiceOrderId
   * @param fetch whether to fetch this field or not
   */
  public void setAcServiceOrderIdFetch (boolean fetch)
  {
    this.AcServiceOrderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcServiceOrderId
   * @return boolean the Fetch value for this field
   */
  public boolean getAcServiceOrderIdFetch ()
  {
    return this.AcServiceOrderIdFetch;
  }
  /** Set the SortOrder for field: AcServiceOrderId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcServiceOrderIdSortOrder (Integer value)
  {
    this.AcServiceOrderIdSort = value;
  }
  /** Retrieve SortOrder for field: AcServiceOrderId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcServiceOrderIdSortOrder ()
  {
    return this.AcServiceOrderIdSort;
  }
  /** Set the sort direction for field: AcServiceOrderId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcServiceOrderIdSortDirection (boolean ascending)
  {
    this.AcServiceOrderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcServiceOrderId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcServiceOrderIdSortDirection ()
  {
    return this.AcServiceOrderIdSortAscending;
  }
  /** Set the field level filters for field: AcServiceOrderId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcServiceOrderIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcServiceOrderId = value;
  }
  /** Retrieve filter for field: AcServiceOrderId
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcServiceOrderIdFilter ()
  {
    return this.AcServiceOrderId;
  }
  /** Set the field level Fetch value for field: AcAmount
   * @param fetch whether to fetch this field or not
   */
  public void setAcAmountFetch (boolean fetch)
  {
    this.AcAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getAcAmountFetch ()
  {
    return this.AcAmountFetch;
  }
  /** Set the SortOrder for field: AcAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcAmountSortOrder (Integer value)
  {
    this.AcAmountSort = value;
  }
  /** Retrieve SortOrder for field: AcAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcAmountSortOrder ()
  {
    return this.AcAmountSort;
  }
  /** Set the sort direction for field: AcAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcAmountSortDirection (boolean ascending)
  {
    this.AcAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcAmountSortDirection ()
  {
    return this.AcAmountSortAscending;
  }
  /** Set the field level filters for field: AcAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcAmount = value;
  }
  /** Retrieve filter for field: AcAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcAmountFilter ()
  {
    return this.AcAmount;
  }
  /** Set the field level Fetch value for field: AcDiscount
   * @param fetch whether to fetch this field or not
   */
  public void setAcDiscountFetch (boolean fetch)
  {
    this.AcDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcDiscount
   * @return boolean the Fetch value for this field
   */
  public boolean getAcDiscountFetch ()
  {
    return this.AcDiscountFetch;
  }
  /** Set the SortOrder for field: AcDiscount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcDiscountSortOrder (Integer value)
  {
    this.AcDiscountSort = value;
  }
  /** Retrieve SortOrder for field: AcDiscount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcDiscountSortOrder ()
  {
    return this.AcDiscountSort;
  }
  /** Set the sort direction for field: AcDiscount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcDiscountSortDirection (boolean ascending)
  {
    this.AcDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcDiscount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcDiscountSortDirection ()
  {
    return this.AcDiscountSortAscending;
  }
  /** Set the field level filters for field: AcDiscount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcDiscountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcDiscount = value;
  }
  /** Retrieve filter for field: AcDiscount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcDiscountFilter ()
  {
    return this.AcDiscount;
  }
  /** Set the field level Fetch value for field: AcFederalTax
   * @param fetch whether to fetch this field or not
   */
  public void setAcFederalTaxFetch (boolean fetch)
  {
    this.AcFederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcFederalTax
   * @return boolean the Fetch value for this field
   */
  public boolean getAcFederalTaxFetch ()
  {
    return this.AcFederalTaxFetch;
  }
  /** Set the SortOrder for field: AcFederalTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcFederalTaxSortOrder (Integer value)
  {
    this.AcFederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: AcFederalTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcFederalTaxSortOrder ()
  {
    return this.AcFederalTaxSort;
  }
  /** Set the sort direction for field: AcFederalTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcFederalTaxSortDirection (boolean ascending)
  {
    this.AcFederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcFederalTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcFederalTaxSortDirection ()
  {
    return this.AcFederalTaxSortAscending;
  }
  /** Set the field level filters for field: AcFederalTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcFederalTax = value;
  }
  /** Retrieve filter for field: AcFederalTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcFederalTaxFilter ()
  {
    return this.AcFederalTax;
  }
  /** Set the field level Fetch value for field: AcStateTax
   * @param fetch whether to fetch this field or not
   */
  public void setAcStateTaxFetch (boolean fetch)
  {
    this.AcStateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcStateTax
   * @return boolean the Fetch value for this field
   */
  public boolean getAcStateTaxFetch ()
  {
    return this.AcStateTaxFetch;
  }
  /** Set the SortOrder for field: AcStateTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcStateTaxSortOrder (Integer value)
  {
    this.AcStateTaxSort = value;
  }
  /** Retrieve SortOrder for field: AcStateTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcStateTaxSortOrder ()
  {
    return this.AcStateTaxSort;
  }
  /** Set the sort direction for field: AcStateTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcStateTaxSortDirection (boolean ascending)
  {
    this.AcStateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcStateTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcStateTaxSortDirection ()
  {
    return this.AcStateTaxSortAscending;
  }
  /** Set the field level filters for field: AcStateTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcStateTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcStateTax = value;
  }
  /** Retrieve filter for field: AcStateTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcStateTaxFilter ()
  {
    return this.AcStateTax;
  }
  /** Set the field level Fetch value for field: AcCountyTax
   * @param fetch whether to fetch this field or not
   */
  public void setAcCountyTaxFetch (boolean fetch)
  {
    this.AcCountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcCountyTax
   * @return boolean the Fetch value for this field
   */
  public boolean getAcCountyTaxFetch ()
  {
    return this.AcCountyTaxFetch;
  }
  /** Set the SortOrder for field: AcCountyTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcCountyTaxSortOrder (Integer value)
  {
    this.AcCountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: AcCountyTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcCountyTaxSortOrder ()
  {
    return this.AcCountyTaxSort;
  }
  /** Set the sort direction for field: AcCountyTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcCountyTaxSortDirection (boolean ascending)
  {
    this.AcCountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcCountyTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcCountyTaxSortDirection ()
  {
    return this.AcCountyTaxSortAscending;
  }
  /** Set the field level filters for field: AcCountyTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcCountyTax = value;
  }
  /** Retrieve filter for field: AcCountyTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcCountyTaxFilter ()
  {
    return this.AcCountyTax;
  }
  /** Set the field level Fetch value for field: AcCityTax
   * @param fetch whether to fetch this field or not
   */
  public void setAcCityTaxFetch (boolean fetch)
  {
    this.AcCityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcCityTax
   * @return boolean the Fetch value for this field
   */
  public boolean getAcCityTaxFetch ()
  {
    return this.AcCityTaxFetch;
  }
  /** Set the SortOrder for field: AcCityTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcCityTaxSortOrder (Integer value)
  {
    this.AcCityTaxSort = value;
  }
  /** Retrieve SortOrder for field: AcCityTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcCityTaxSortOrder ()
  {
    return this.AcCityTaxSort;
  }
  /** Set the sort direction for field: AcCityTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcCityTaxSortDirection (boolean ascending)
  {
    this.AcCityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcCityTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcCityTaxSortDirection ()
  {
    return this.AcCityTaxSortAscending;
  }
  /** Set the field level filters for field: AcCityTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcCityTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcCityTax = value;
  }
  /** Retrieve filter for field: AcCityTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcCityTaxFilter ()
  {
    return this.AcCityTax;
  }
  /** Set the field level Fetch value for field: AcOtherTax
   * @param fetch whether to fetch this field or not
   */
  public void setAcOtherTaxFetch (boolean fetch)
  {
    this.AcOtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcOtherTax
   * @return boolean the Fetch value for this field
   */
  public boolean getAcOtherTaxFetch ()
  {
    return this.AcOtherTaxFetch;
  }
  /** Set the SortOrder for field: AcOtherTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcOtherTaxSortOrder (Integer value)
  {
    this.AcOtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: AcOtherTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcOtherTaxSortOrder ()
  {
    return this.AcOtherTaxSort;
  }
  /** Set the sort direction for field: AcOtherTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcOtherTaxSortDirection (boolean ascending)
  {
    this.AcOtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcOtherTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcOtherTaxSortDirection ()
  {
    return this.AcOtherTaxSortAscending;
  }
  /** Set the field level filters for field: AcOtherTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.AcOtherTax = value;
  }
  /** Retrieve filter for field: AcOtherTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAcOtherTaxFilter ()
  {
    return this.AcOtherTax;
  }
  /** get the filter for ChargeElementObject
   * @return ChargeElementObjectFilter[] the filter
   */
  public ChargeElementObjectFilter[] getChargeElementObjectFilter ()
  {
    return this.ac_charge_element;
  }
  /** set the filter for ChargeElementObject
   * @param value the new filter
   */
  public void setChargeElementObjectFilter (ChargeElementObjectFilter[] value)
  {
    this.ac_charge_element = value;
  }
  /** get the filter for ServiceInstanceQuoteObject
   * @return ServiceInstanceQuoteObjectFilter[] the filter
   */
  public ServiceInstanceQuoteObjectFilter[] getServiceInstanceQuoteObjectFilter ()
  {
    return this.ac_service_instance_quote;
  }
  /** set the filter for ServiceInstanceQuoteObject
   * @param value the new filter
   */
  public void setServiceInstanceQuoteObjectFilter (ServiceInstanceQuoteObjectFilter[] value)
  {
    this.ac_service_instance_quote = value;
  }
  /** get the filter for ContractQuoteObject
   * @return ContractQuoteObjectFilter[] the filter
   */
  public ContractQuoteObjectFilter[] getContractQuoteObjectFilter ()
  {
    return this.ac_contract_quote;
  }
  /** set the filter for ContractQuoteObject
   * @param value the new filter
   */
  public void setContractQuoteObjectFilter (ContractQuoteObjectFilter[] value)
  {
    this.ac_contract_quote = value;
  }
  /** get the filter for PackageQuoteObject
   * @return PackageQuoteObjectFilter[] the filter
   */
  public PackageQuoteObjectFilter[] getPackageQuoteObjectFilter ()
  {
    return this.ac_package_quote;
  }
  /** set the filter for PackageQuoteObject
   * @param value the new filter
   */
  public void setPackageQuoteObjectFilter (PackageQuoteObjectFilter[] value)
  {
    this.ac_package_quote = value;
  }
  public String toString() {
    return AccountQuoteObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountQuoteObjectHelper.toMap(this, null);
  }
}
