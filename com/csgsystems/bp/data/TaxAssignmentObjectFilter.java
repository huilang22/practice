/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAssignmentObjectFilter.java
 * Definition File: Admin/TaxAssignment.xml
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
public class TaxAssignmentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public TaxAssignmentObjectKeyFilter Key = null;
  /** raw field for: TAX_ASSIGNMENTS.provider_id) */
  public    IntegerFilter[] ProviderId  = null;
  protected boolean ProviderIdFetch = false;
  protected boolean ProviderIdSortAscending = true;
  protected Integer ProviderIdSort = null;
  /** raw field for: TAX_ASSIGNMENTS.owning_cost_ctr) */
  public    IntegerFilter[] OwningCostCtr  = null;
  protected boolean OwningCostCtrFetch = false;
  protected boolean OwningCostCtrSortAscending = true;
  protected Integer OwningCostCtrSort = null;
  /** raw field for: TAX_ASSIGNMENTS.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "TaxAssignmentObjectFilter";
  /** default constructor */
  public TaxAssignmentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public TaxAssignmentObjectFilter (TaxAssignmentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new TaxAssignmentObjectKeyFilter (other.Key);
    this.ProviderId = other.ProviderId;
    this.ProviderIdFetch = other.ProviderIdFetch;
    this.ProviderIdSort = other.ProviderIdSort;
    this.ProviderIdSortAscending = other.ProviderIdSortAscending;
    this.OwningCostCtr = other.OwningCostCtr;
    this.OwningCostCtrFetch = other.OwningCostCtrFetch;
    this.OwningCostCtrSort = other.OwningCostCtrSort;
    this.OwningCostCtrSortAscending = other.OwningCostCtrSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return TaxAssignmentObjectKeyFilter
   */
  public TaxAssignmentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (TaxAssignmentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountCategoryFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.AccountCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountCategoryFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountCategoryFetch;
  }
  /** Set the SortOrder for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountCategorySortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.AccountCategorySort = value;
  }
  /** Retrieve SortOrder for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountCategorySortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountCategorySort;
  }
  /** Set the sort direction for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountCategorySortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.AccountCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountCategorySortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountCategorySortAscending;
  }
  /** Set the field level filters for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountCategoryFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.AccountCategory = value;
  }
  /** Retrieve filter for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountCategoryFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountCategory;
  }
  /** Set the field level Fetch value for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBrandIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.BrandIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBrandIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BrandIdFetch;
  }
  /** Set the SortOrder for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBrandIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.BrandIdSort = value;
  }
  /** Retrieve SortOrder for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBrandIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BrandIdSort;
  }
  /** Set the sort direction for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBrandIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.BrandIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBrandIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BrandIdSortAscending;
  }
  /** Set the field level filters for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBrandIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.BrandId = value;
  }
  /** Retrieve filter for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBrandIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BrandId;
  }
  /** Set the field level Fetch value for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CountryCodeFetch;
  }
  /** Set the SortOrder for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CountryCodeSort;
  }
  /** Set the sort direction for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CountryCodeSortAscending;
  }
  /** Set the field level filters for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountryCode = value;
  }
  /** Retrieve filter for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountryCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CountryCode;
  }
  /** Set the field level Fetch value for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @param fetch whether to fetch this field or not
   */
  public void setStateCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.StateCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.StateCodeFetch;
  }
  /** Set the SortOrder for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.StateCodeSort = value;
  }
  /** Retrieve SortOrder for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.StateCodeSort;
  }
  /** Set the sort direction for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.StateCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.StateCodeSortAscending;
  }
  /** Set the field level filters for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.StateCode = value;
  }
  /** Retrieve filter for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStateCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.StateCode;
  }
  /** Set the field level Fetch value for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CountyCodeFetch;
  }
  /** Set the SortOrder for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CountyCodeSort;
  }
  /** Set the sort direction for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CountyCodeSortAscending;
  }
  /** Set the field level filters for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CountyCode = value;
  }
  /** Retrieve filter for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountyCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CountyCode;
  }
  /** Set the field level Fetch value for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCityCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CityCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CityCodeFetch;
  }
  /** Set the SortOrder for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CityCodeSort = value;
  }
  /** Retrieve SortOrder for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CityCodeSort;
  }
  /** Set the sort direction for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CityCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CityCodeSortAscending;
  }
  /** Set the field level filters for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.CityCode = value;
  }
  /** Retrieve filter for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCityCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CityCode;
  }
  /** Set the field level Fetch value for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFranchiseCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.FranchiseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFranchiseCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.FranchiseCodeFetch;
  }
  /** Set the SortOrder for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFranchiseCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.FranchiseCodeSort = value;
  }
  /** Retrieve SortOrder for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFranchiseCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.FranchiseCodeSort;
  }
  /** Set the sort direction for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFranchiseCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.FranchiseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFranchiseCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.FranchiseCodeSortAscending;
  }
  /** Set the field level filters for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFranchiseCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.FranchiseCode = value;
  }
  /** Retrieve filter for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFranchiseCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.FranchiseCode;
  }
  /** Set the field level Fetch value for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeEltTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeEltTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltTypeFetch;
  }
  /** Set the SortOrder for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeEltTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltTypeSort = value;
  }
  /** Retrieve SortOrder for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeEltTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltTypeSort;
  }
  /** Set the sort direction for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeEltTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeEltTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltTypeSortAscending;
  }
  /** Set the field level filters for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeEltTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltType = value;
  }
  /** Retrieve filter for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeEltTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltType;
  }
  /** Set the field level Fetch value for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeEltIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeEltIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltIdFetch;
  }
  /** Set the SortOrder for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeEltIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltIdSort = value;
  }
  /** Retrieve SortOrder for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeEltIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltIdSort;
  }
  /** Set the sort direction for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeEltIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeEltIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltIdSortAscending;
  }
  /** Set the field level filters for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeEltIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.ChargeEltId = value;
  }
  /** Retrieve filter for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeEltIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltId;
  }
  /** Set the field level Fetch value for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAssignmentObjectKeyFilter ();
    this.Key.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Set the field level Fetch value for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProviderIdFetch (boolean fetch) {
    this.ProviderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProviderIdFetch () {
    return this.ProviderIdFetch;
  }
  /** Set the SortOrder for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProviderIdSortOrder (Integer value) {
    this.ProviderIdSort = value;
  }
  /** Retrieve SortOrder for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProviderIdSortOrder () {
    return this.ProviderIdSort;
  }
  /** Set the sort direction for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProviderIdSortDirection (boolean ascending) {
    this.ProviderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProviderIdSortDirection () {
    return this.ProviderIdSortAscending;
  }
  /** Set the field level filters for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProviderIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProviderId = value;
  }
  /** Retrieve filter for field: ProviderId (TAX_ASSIGNMENTS.provider_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProviderIdFilter () {
    return this.ProviderId;
  }

  /**
   * Retrieves the ProviderIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProviderIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProviderIdFilter field
   */
  public String[] getProviderIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProviderIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProviderIdFilter filter value from a formatted string
   *
   * @param _value the ProviderIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProviderIdFilter filter field
   */
  public void setProviderIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderIdFilterFromFormattedString");
    try {
      this.setProviderIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setOwningCostCtrFetch (boolean fetch) {
    this.OwningCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwningCostCtrFetch () {
    return this.OwningCostCtrFetch;
  }
  /** Set the SortOrder for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwningCostCtrSortOrder (Integer value) {
    this.OwningCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwningCostCtrSortOrder () {
    return this.OwningCostCtrSort;
  }
  /** Set the sort direction for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwningCostCtrSortDirection (boolean ascending) {
    this.OwningCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwningCostCtrSortDirection () {
    return this.OwningCostCtrSortAscending;
  }
  /** Set the field level filters for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwningCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.OwningCostCtr = value;
  }
  /** Retrieve filter for field: OwningCostCtr (TAX_ASSIGNMENTS.owning_cost_ctr)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOwningCostCtrFilter () {
    return this.OwningCostCtr;
  }

  /**
   * Retrieves the OwningCostCtrFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwningCostCtrFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningCostCtrFilter field
   */
  public String[] getOwningCostCtrFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwningCostCtrFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCtrFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningCostCtrFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwningCostCtrFilter filter value from a formatted string
   *
   * @param _value the OwningCostCtrFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwningCostCtrFilter filter field
   */
  public void setOwningCostCtrFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningCostCtrFilterFromFormattedString");
    try {
      this.setOwningCostCtrFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningCostCtrFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningCostCtrFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (TAX_ASSIGNMENTS.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  public String toString() {
    return TaxAssignmentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TaxAssignmentObjectHelper.toMap(this, null);
  }
}
