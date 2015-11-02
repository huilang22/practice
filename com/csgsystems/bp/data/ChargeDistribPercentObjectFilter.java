/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeDistribPercentObjectFilter.java
 * Definition File: Customer/ChargeDistribPercent.xml
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
public class ChargeDistribPercentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ChargeDistribPercentObjectKeyFilter Key = null;
  /** raw field for: CHARGE_DISTRIB_PERCENT.a_distri_percent) */
  public    BigIntegerFilter[] ADistriPercent  = null;
  protected boolean ADistriPercentFetch = false;
  protected boolean ADistriPercentSortAscending = true;
  protected Integer ADistriPercentSort = null;
  /** raw field for: CHARGE_DISTRIB_PERCENT.b_distri_percent) */
  public    BigIntegerFilter[] BDistriPercent  = null;
  protected boolean BDistriPercentFetch = false;
  protected boolean BDistriPercentSortAscending = true;
  protected Integer BDistriPercentSort = null;
  /** raw field for: CHARGE_DISTRIB_PERCENT.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  private String _objName = "ChargeDistribPercentObjectFilter";
  /** default constructor */
  public ChargeDistribPercentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ChargeDistribPercentObjectFilter (ChargeDistribPercentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ChargeDistribPercentObjectKeyFilter (other.Key);
    this.ADistriPercent = other.ADistriPercent;
    this.ADistriPercentFetch = other.ADistriPercentFetch;
    this.ADistriPercentSort = other.ADistriPercentSort;
    this.ADistriPercentSortAscending = other.ADistriPercentSortAscending;
    this.BDistriPercent = other.BDistriPercent;
    this.BDistriPercentFetch = other.BDistriPercentFetch;
    this.BDistriPercentSort = other.BDistriPercentSort;
    this.BDistriPercentSortAscending = other.BDistriPercentSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;  }
  /** get the filter for this object's key
   * @return ChargeDistribPercentObjectKeyFilter
   */
  public ChargeDistribPercentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ChargeDistribPercentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CHARGE_DISTRIB_PERCENT.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @param fetch whether to fetch this field or not
   */
  public void setDistribTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.DistribTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistribTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.DistribTypeFetch;
  }
  /** Set the SortOrder for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistribTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.DistribTypeSort = value;
  }
  /** Retrieve SortOrder for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistribTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.DistribTypeSort;
  }
  /** Set the sort direction for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistribTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.DistribTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistribTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.DistribTypeSortAscending;
  }
  /** Set the field level filters for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistribTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.DistribType = value;
  }
  /** Retrieve filter for field: DistribType (CHARGE_DISTRIB_PERCENT.distrib_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDistribTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.DistribType;
  }
  /** Set the field level Fetch value for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (CHARGE_DISTRIB_PERCENT.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Set the field level Fetch value for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (CHARGE_DISTRIB_PERCENT.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceInternalId;
  }
  /** Set the field level Fetch value for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (CHARGE_DISTRIB_PERCENT.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceInternalIdResets;
  }
  /** Set the field level Fetch value for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeEltTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeEltTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltTypeFetch;
  }
  /** Set the SortOrder for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeEltTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltTypeSort = value;
  }
  /** Retrieve SortOrder for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeEltTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltTypeSort;
  }
  /** Set the sort direction for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeEltTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeEltTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltTypeSortAscending;
  }
  /** Set the field level filters for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeEltTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltType = value;
  }
  /** Retrieve filter for field: ChargeEltType (CHARGE_DISTRIB_PERCENT.charge_elt_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeEltTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltType;
  }
  /** Set the field level Fetch value for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeEltIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeEltIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltIdFetch;
  }
  /** Set the SortOrder for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeEltIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltIdSort = value;
  }
  /** Retrieve SortOrder for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeEltIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltIdSort;
  }
  /** Set the sort direction for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeEltIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeEltIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ChargeEltIdSortAscending;
  }
  /** Set the field level filters for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeEltIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ChargeEltId = value;
  }
  /** Retrieve filter for field: ChargeEltId (CHARGE_DISTRIB_PERCENT.charge_elt_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeEltIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ChargeEltId;
  }
  /** Set the field level Fetch value for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ChargeDistribPercentObjectKeyFilter ();
    this.Key.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (CHARGE_DISTRIB_PERCENT.active_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDate;
  }
  /** Set the field level Fetch value for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @param fetch whether to fetch this field or not
   */
  public void setADistriPercentFetch (boolean fetch) {
    this.ADistriPercentFetch = fetch;
  }
  /** Retrieve Fetch value for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @return boolean the Fetch value for this field
   */
  public boolean getADistriPercentFetch () {
    return this.ADistriPercentFetch;
  }
  /** Set the SortOrder for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setADistriPercentSortOrder (Integer value) {
    this.ADistriPercentSort = value;
  }
  /** Retrieve SortOrder for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getADistriPercentSortOrder () {
    return this.ADistriPercentSort;
  }
  /** Set the sort direction for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setADistriPercentSortDirection (boolean ascending) {
    this.ADistriPercentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getADistriPercentSortDirection () {
    return this.ADistriPercentSortAscending;
  }
  /** Set the field level filters for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setADistriPercentFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ADistriPercent = value;
  }
  /** Retrieve filter for field: ADistriPercent (CHARGE_DISTRIB_PERCENT.a_distri_percent)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getADistriPercentFilter () {
    return this.ADistriPercent;
  }

  /**
   * Retrieves the ADistriPercentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ADistriPercentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ADistriPercentFilter field
   */
  public String[] getADistriPercentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getADistriPercentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getADistriPercentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getADistriPercentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ADistriPercentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getADistriPercentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ADistriPercentFilter filter value from a formatted string
   *
   * @param _value the ADistriPercentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ADistriPercentFilter filter field
   */
  public void setADistriPercentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setADistriPercentFilterFromFormattedString");
    try {
      this.setADistriPercentFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ADistriPercentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setADistriPercentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setADistriPercentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @param fetch whether to fetch this field or not
   */
  public void setBDistriPercentFetch (boolean fetch) {
    this.BDistriPercentFetch = fetch;
  }
  /** Retrieve Fetch value for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @return boolean the Fetch value for this field
   */
  public boolean getBDistriPercentFetch () {
    return this.BDistriPercentFetch;
  }
  /** Set the SortOrder for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBDistriPercentSortOrder (Integer value) {
    this.BDistriPercentSort = value;
  }
  /** Retrieve SortOrder for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBDistriPercentSortOrder () {
    return this.BDistriPercentSort;
  }
  /** Set the sort direction for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBDistriPercentSortDirection (boolean ascending) {
    this.BDistriPercentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBDistriPercentSortDirection () {
    return this.BDistriPercentSortAscending;
  }
  /** Set the field level filters for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBDistriPercentFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BDistriPercent = value;
  }
  /** Retrieve filter for field: BDistriPercent (CHARGE_DISTRIB_PERCENT.b_distri_percent)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBDistriPercentFilter () {
    return this.BDistriPercent;
  }

  /**
   * Retrieves the BDistriPercentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BDistriPercentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BDistriPercentFilter field
   */
  public String[] getBDistriPercentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBDistriPercentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBDistriPercentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBDistriPercentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BDistriPercentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBDistriPercentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BDistriPercentFilter filter value from a formatted string
   *
   * @param _value the BDistriPercentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BDistriPercentFilter filter field
   */
  public void setBDistriPercentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBDistriPercentFilterFromFormattedString");
    try {
      this.setBDistriPercentFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BDistriPercentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBDistriPercentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBDistriPercentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (CHARGE_DISTRIB_PERCENT.inactive_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDateFilter () {
    return this.InactiveDate;
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return ChargeDistribPercentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ChargeDistribPercentObjectHelper.toMap(this, null);
  }
}
