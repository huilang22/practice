/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageQuoteObjectFilter.java
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
public class PackageQuoteObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] PkPackageInstId  = null;
  protected boolean PkPackageInstIdFetch = false;
  protected boolean PkPackageInstIdSortAscending = true;
  protected Integer PkPackageInstIdSort = null;
  /** raw field */
  public    IntegerFilter[] PkPackageInstIdServ  = null;
  protected boolean PkPackageInstIdServFetch = false;
  protected boolean PkPackageInstIdServSortAscending = true;
  protected Integer PkPackageInstIdServSort = null;
  /** raw field */
  public    IntegerFilter[] PkPackageId  = null;
  protected boolean PkPackageIdFetch = false;
  protected boolean PkPackageIdSortAscending = true;
  protected Integer PkPackageIdSort = null;
  /** raw field */
  public    BigIntegerFilter[] PkAmount  = null;
  protected boolean PkAmountFetch = false;
  protected boolean PkAmountSortAscending = true;
  protected Integer PkAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] PkDiscount  = null;
  protected boolean PkDiscountFetch = false;
  protected boolean PkDiscountSortAscending = true;
  protected Integer PkDiscountSort = null;
  /** raw field */
  public    BigIntegerFilter[] PkFederalTax  = null;
  protected boolean PkFederalTaxFetch = false;
  protected boolean PkFederalTaxSortAscending = true;
  protected Integer PkFederalTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] PkStateTax  = null;
  protected boolean PkStateTaxFetch = false;
  protected boolean PkStateTaxSortAscending = true;
  protected Integer PkStateTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] PkCountyTax  = null;
  protected boolean PkCountyTaxFetch = false;
  protected boolean PkCountyTaxSortAscending = true;
  protected Integer PkCountyTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] PkCityTax  = null;
  protected boolean PkCityTaxFetch = false;
  protected boolean PkCityTaxSortAscending = true;
  protected Integer PkCityTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] PkOtherTax  = null;
  protected boolean PkOtherTaxFetch = false;
  protected boolean PkOtherTaxSortAscending = true;
  protected Integer PkOtherTaxSort = null;
  /** pk_component_quote filter */
  public ComponentQuoteObjectFilter[] pk_component_quote = null;

  private String _objName = "PackageQuoteObjectFilter";
  /** default constructor */
  public PackageQuoteObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PackageQuoteObjectFilter (PackageQuoteObjectFilter other)
  {
    if (other == null) return;
    this.PkPackageInstId = other.PkPackageInstId;
    this.PkPackageInstIdFetch = other.PkPackageInstIdFetch;
    this.PkPackageInstIdSort = other.PkPackageInstIdSort;
    this.PkPackageInstIdSortAscending = other.PkPackageInstIdSortAscending;
    this.PkPackageInstIdServ = other.PkPackageInstIdServ;
    this.PkPackageInstIdServFetch = other.PkPackageInstIdServFetch;
    this.PkPackageInstIdServSort = other.PkPackageInstIdServSort;
    this.PkPackageInstIdServSortAscending = other.PkPackageInstIdServSortAscending;
    this.PkPackageId = other.PkPackageId;
    this.PkPackageIdFetch = other.PkPackageIdFetch;
    this.PkPackageIdSort = other.PkPackageIdSort;
    this.PkPackageIdSortAscending = other.PkPackageIdSortAscending;
    this.PkAmount = other.PkAmount;
    this.PkAmountFetch = other.PkAmountFetch;
    this.PkAmountSort = other.PkAmountSort;
    this.PkAmountSortAscending = other.PkAmountSortAscending;
    this.PkDiscount = other.PkDiscount;
    this.PkDiscountFetch = other.PkDiscountFetch;
    this.PkDiscountSort = other.PkDiscountSort;
    this.PkDiscountSortAscending = other.PkDiscountSortAscending;
    this.PkFederalTax = other.PkFederalTax;
    this.PkFederalTaxFetch = other.PkFederalTaxFetch;
    this.PkFederalTaxSort = other.PkFederalTaxSort;
    this.PkFederalTaxSortAscending = other.PkFederalTaxSortAscending;
    this.PkStateTax = other.PkStateTax;
    this.PkStateTaxFetch = other.PkStateTaxFetch;
    this.PkStateTaxSort = other.PkStateTaxSort;
    this.PkStateTaxSortAscending = other.PkStateTaxSortAscending;
    this.PkCountyTax = other.PkCountyTax;
    this.PkCountyTaxFetch = other.PkCountyTaxFetch;
    this.PkCountyTaxSort = other.PkCountyTaxSort;
    this.PkCountyTaxSortAscending = other.PkCountyTaxSortAscending;
    this.PkCityTax = other.PkCityTax;
    this.PkCityTaxFetch = other.PkCityTaxFetch;
    this.PkCityTaxSort = other.PkCityTaxSort;
    this.PkCityTaxSortAscending = other.PkCityTaxSortAscending;
    this.PkOtherTax = other.PkOtherTax;
    this.PkOtherTaxFetch = other.PkOtherTaxFetch;
    this.PkOtherTaxSort = other.PkOtherTaxSort;
    this.PkOtherTaxSortAscending = other.PkOtherTaxSortAscending;
    if (other.pk_component_quote != null)
    {
      this.pk_component_quote = new ComponentQuoteObjectFilter[other.pk_component_quote.length];
      for (int i = 0; other.pk_component_quote != null && i < other.pk_component_quote.length; i++)
      {
        if (other.pk_component_quote[i] != null)  this.pk_component_quote[i] = new ComponentQuoteObjectFilter (other.pk_component_quote[i]);
      }
    }
  }
  /** Set the field level Fetch value for field: PkPackageInstId
   * @param fetch whether to fetch this field or not
   */
  public void setPkPackageInstIdFetch (boolean fetch)
  {
    this.PkPackageInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkPackageInstId
   * @return boolean the Fetch value for this field
   */
  public boolean getPkPackageInstIdFetch ()
  {
    return this.PkPackageInstIdFetch;
  }
  /** Set the SortOrder for field: PkPackageInstId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkPackageInstIdSortOrder (Integer value)
  {
    this.PkPackageInstIdSort = value;
  }
  /** Retrieve SortOrder for field: PkPackageInstId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkPackageInstIdSortOrder ()
  {
    return this.PkPackageInstIdSort;
  }
  /** Set the sort direction for field: PkPackageInstId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkPackageInstIdSortDirection (boolean ascending)
  {
    this.PkPackageInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkPackageInstId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkPackageInstIdSortDirection ()
  {
    return this.PkPackageInstIdSortAscending;
  }
  /** Set the field level filters for field: PkPackageInstId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkPackageInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.PkPackageInstId = value;
  }
  /** Retrieve filter for field: PkPackageInstId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPkPackageInstIdFilter ()
  {
    return this.PkPackageInstId;
  }
  /** Set the field level Fetch value for field: PkPackageInstIdServ
   * @param fetch whether to fetch this field or not
   */
  public void setPkPackageInstIdServFetch (boolean fetch)
  {
    this.PkPackageInstIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkPackageInstIdServ
   * @return boolean the Fetch value for this field
   */
  public boolean getPkPackageInstIdServFetch ()
  {
    return this.PkPackageInstIdServFetch;
  }
  /** Set the SortOrder for field: PkPackageInstIdServ
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkPackageInstIdServSortOrder (Integer value)
  {
    this.PkPackageInstIdServSort = value;
  }
  /** Retrieve SortOrder for field: PkPackageInstIdServ
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkPackageInstIdServSortOrder ()
  {
    return this.PkPackageInstIdServSort;
  }
  /** Set the sort direction for field: PkPackageInstIdServ
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkPackageInstIdServSortDirection (boolean ascending)
  {
    this.PkPackageInstIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkPackageInstIdServ
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkPackageInstIdServSortDirection ()
  {
    return this.PkPackageInstIdServSortAscending;
  }
  /** Set the field level filters for field: PkPackageInstIdServ
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkPackageInstIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    this.PkPackageInstIdServ = value;
  }
  /** Retrieve filter for field: PkPackageInstIdServ
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPkPackageInstIdServFilter ()
  {
    return this.PkPackageInstIdServ;
  }
  /** Set the field level Fetch value for field: PkPackageId
   * @param fetch whether to fetch this field or not
   */
  public void setPkPackageIdFetch (boolean fetch)
  {
    this.PkPackageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkPackageId
   * @return boolean the Fetch value for this field
   */
  public boolean getPkPackageIdFetch ()
  {
    return this.PkPackageIdFetch;
  }
  /** Set the SortOrder for field: PkPackageId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkPackageIdSortOrder (Integer value)
  {
    this.PkPackageIdSort = value;
  }
  /** Retrieve SortOrder for field: PkPackageId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkPackageIdSortOrder ()
  {
    return this.PkPackageIdSort;
  }
  /** Set the sort direction for field: PkPackageId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkPackageIdSortDirection (boolean ascending)
  {
    this.PkPackageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkPackageId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkPackageIdSortDirection ()
  {
    return this.PkPackageIdSortAscending;
  }
  /** Set the field level filters for field: PkPackageId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkPackageIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.PkPackageId = value;
  }
  /** Retrieve filter for field: PkPackageId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPkPackageIdFilter ()
  {
    return this.PkPackageId;
  }
  /** Set the field level Fetch value for field: PkAmount
   * @param fetch whether to fetch this field or not
   */
  public void setPkAmountFetch (boolean fetch)
  {
    this.PkAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getPkAmountFetch ()
  {
    return this.PkAmountFetch;
  }
  /** Set the SortOrder for field: PkAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkAmountSortOrder (Integer value)
  {
    this.PkAmountSort = value;
  }
  /** Retrieve SortOrder for field: PkAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkAmountSortOrder ()
  {
    return this.PkAmountSort;
  }
  /** Set the sort direction for field: PkAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkAmountSortDirection (boolean ascending)
  {
    this.PkAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkAmountSortDirection ()
  {
    return this.PkAmountSortAscending;
  }
  /** Set the field level filters for field: PkAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PkAmount = value;
  }
  /** Retrieve filter for field: PkAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPkAmountFilter ()
  {
    return this.PkAmount;
  }
  /** Set the field level Fetch value for field: PkDiscount
   * @param fetch whether to fetch this field or not
   */
  public void setPkDiscountFetch (boolean fetch)
  {
    this.PkDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkDiscount
   * @return boolean the Fetch value for this field
   */
  public boolean getPkDiscountFetch ()
  {
    return this.PkDiscountFetch;
  }
  /** Set the SortOrder for field: PkDiscount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkDiscountSortOrder (Integer value)
  {
    this.PkDiscountSort = value;
  }
  /** Retrieve SortOrder for field: PkDiscount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkDiscountSortOrder ()
  {
    return this.PkDiscountSort;
  }
  /** Set the sort direction for field: PkDiscount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkDiscountSortDirection (boolean ascending)
  {
    this.PkDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkDiscount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkDiscountSortDirection ()
  {
    return this.PkDiscountSortAscending;
  }
  /** Set the field level filters for field: PkDiscount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkDiscountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PkDiscount = value;
  }
  /** Retrieve filter for field: PkDiscount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPkDiscountFilter ()
  {
    return this.PkDiscount;
  }
  /** Set the field level Fetch value for field: PkFederalTax
   * @param fetch whether to fetch this field or not
   */
  public void setPkFederalTaxFetch (boolean fetch)
  {
    this.PkFederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkFederalTax
   * @return boolean the Fetch value for this field
   */
  public boolean getPkFederalTaxFetch ()
  {
    return this.PkFederalTaxFetch;
  }
  /** Set the SortOrder for field: PkFederalTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkFederalTaxSortOrder (Integer value)
  {
    this.PkFederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: PkFederalTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkFederalTaxSortOrder ()
  {
    return this.PkFederalTaxSort;
  }
  /** Set the sort direction for field: PkFederalTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkFederalTaxSortDirection (boolean ascending)
  {
    this.PkFederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkFederalTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkFederalTaxSortDirection ()
  {
    return this.PkFederalTaxSortAscending;
  }
  /** Set the field level filters for field: PkFederalTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PkFederalTax = value;
  }
  /** Retrieve filter for field: PkFederalTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPkFederalTaxFilter ()
  {
    return this.PkFederalTax;
  }
  /** Set the field level Fetch value for field: PkStateTax
   * @param fetch whether to fetch this field or not
   */
  public void setPkStateTaxFetch (boolean fetch)
  {
    this.PkStateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkStateTax
   * @return boolean the Fetch value for this field
   */
  public boolean getPkStateTaxFetch ()
  {
    return this.PkStateTaxFetch;
  }
  /** Set the SortOrder for field: PkStateTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkStateTaxSortOrder (Integer value)
  {
    this.PkStateTaxSort = value;
  }
  /** Retrieve SortOrder for field: PkStateTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkStateTaxSortOrder ()
  {
    return this.PkStateTaxSort;
  }
  /** Set the sort direction for field: PkStateTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkStateTaxSortDirection (boolean ascending)
  {
    this.PkStateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkStateTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkStateTaxSortDirection ()
  {
    return this.PkStateTaxSortAscending;
  }
  /** Set the field level filters for field: PkStateTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkStateTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PkStateTax = value;
  }
  /** Retrieve filter for field: PkStateTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPkStateTaxFilter ()
  {
    return this.PkStateTax;
  }
  /** Set the field level Fetch value for field: PkCountyTax
   * @param fetch whether to fetch this field or not
   */
  public void setPkCountyTaxFetch (boolean fetch)
  {
    this.PkCountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkCountyTax
   * @return boolean the Fetch value for this field
   */
  public boolean getPkCountyTaxFetch ()
  {
    return this.PkCountyTaxFetch;
  }
  /** Set the SortOrder for field: PkCountyTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkCountyTaxSortOrder (Integer value)
  {
    this.PkCountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: PkCountyTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkCountyTaxSortOrder ()
  {
    return this.PkCountyTaxSort;
  }
  /** Set the sort direction for field: PkCountyTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkCountyTaxSortDirection (boolean ascending)
  {
    this.PkCountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkCountyTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkCountyTaxSortDirection ()
  {
    return this.PkCountyTaxSortAscending;
  }
  /** Set the field level filters for field: PkCountyTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PkCountyTax = value;
  }
  /** Retrieve filter for field: PkCountyTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPkCountyTaxFilter ()
  {
    return this.PkCountyTax;
  }
  /** Set the field level Fetch value for field: PkCityTax
   * @param fetch whether to fetch this field or not
   */
  public void setPkCityTaxFetch (boolean fetch)
  {
    this.PkCityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkCityTax
   * @return boolean the Fetch value for this field
   */
  public boolean getPkCityTaxFetch ()
  {
    return this.PkCityTaxFetch;
  }
  /** Set the SortOrder for field: PkCityTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkCityTaxSortOrder (Integer value)
  {
    this.PkCityTaxSort = value;
  }
  /** Retrieve SortOrder for field: PkCityTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkCityTaxSortOrder ()
  {
    return this.PkCityTaxSort;
  }
  /** Set the sort direction for field: PkCityTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkCityTaxSortDirection (boolean ascending)
  {
    this.PkCityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkCityTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkCityTaxSortDirection ()
  {
    return this.PkCityTaxSortAscending;
  }
  /** Set the field level filters for field: PkCityTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkCityTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PkCityTax = value;
  }
  /** Retrieve filter for field: PkCityTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPkCityTaxFilter ()
  {
    return this.PkCityTax;
  }
  /** Set the field level Fetch value for field: PkOtherTax
   * @param fetch whether to fetch this field or not
   */
  public void setPkOtherTaxFetch (boolean fetch)
  {
    this.PkOtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: PkOtherTax
   * @return boolean the Fetch value for this field
   */
  public boolean getPkOtherTaxFetch ()
  {
    return this.PkOtherTaxFetch;
  }
  /** Set the SortOrder for field: PkOtherTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPkOtherTaxSortOrder (Integer value)
  {
    this.PkOtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: PkOtherTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPkOtherTaxSortOrder ()
  {
    return this.PkOtherTaxSort;
  }
  /** Set the sort direction for field: PkOtherTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPkOtherTaxSortDirection (boolean ascending)
  {
    this.PkOtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PkOtherTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPkOtherTaxSortDirection ()
  {
    return this.PkOtherTaxSortAscending;
  }
  /** Set the field level filters for field: PkOtherTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPkOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.PkOtherTax = value;
  }
  /** Retrieve filter for field: PkOtherTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPkOtherTaxFilter ()
  {
    return this.PkOtherTax;
  }
  /** get the filter for ComponentQuoteObject
   * @return ComponentQuoteObjectFilter[] the filter
   */
  public ComponentQuoteObjectFilter[] getComponentQuoteObjectFilter ()
  {
    return this.pk_component_quote;
  }
  /** set the filter for ComponentQuoteObject
   * @param value the new filter
   */
  public void setComponentQuoteObjectFilter (ComponentQuoteObjectFilter[] value)
  {
    this.pk_component_quote = value;
  }
  public String toString() {
    return PackageQuoteObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PackageQuoteObjectHelper.toMap(this, null);
  }
}
