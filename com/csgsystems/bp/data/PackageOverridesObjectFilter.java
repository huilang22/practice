/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageOverridesObjectFilter.java
 * Definition File: Customer/CmfPackageOverrides.xml
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
public class PackageOverridesObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public PackageOverridesObjectKeyFilter Key = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.component_id) */
  public    IntegerFilter[] ComponentId  = null;
  protected boolean ComponentIdFetch = false;
  protected boolean ComponentIdSortAscending = true;
  protected Integer ComponentIdSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.member_id) */
  public    IntegerFilter[] MemberId  = null;
  protected boolean MemberIdFetch = false;
  protected boolean MemberIdSortAscending = true;
  protected Integer MemberIdSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.override_rate_level) */
  public    BigIntegerFilter[] OverrideRateLevel  = null;
  protected boolean OverrideRateLevelFetch = false;
  protected boolean OverrideRateLevelSortAscending = true;
  protected Integer OverrideRateLevelSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.override_rate_status) */
  public    BigIntegerFilter[] OverrideRateStatus  = null;
  protected boolean OverrideRateStatusFetch = false;
  protected boolean OverrideRateStatusSortAscending = true;
  protected Integer OverrideRateStatusSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.override_rate_rc) */
  public    BigIntegerFilter[] OverrideRateRc  = null;
  protected boolean OverrideRateRcFetch = false;
  protected boolean OverrideRateRcSortAscending = true;
  protected Integer OverrideRateRcSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.override_rate_nrc) */
  public    BigIntegerFilter[] OverrideRateNrc  = null;
  protected boolean OverrideRateNrcFetch = false;
  protected boolean OverrideRateNrcSortAscending = true;
  protected Integer OverrideRateNrcSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.override_usg_charge_amt) */
  public    BigIntegerFilter[] OverrideUsgChargeAmt  = null;
  protected boolean OverrideUsgChargeAmtFetch = false;
  protected boolean OverrideUsgChargeAmtSortAscending = true;
  protected Integer OverrideUsgChargeAmtSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt) */
  public    IntegerFilter[] OverrideUsgFixedAmt  = null;
  protected boolean OverrideUsgFixedAmtFetch = false;
  protected boolean OverrideUsgFixedAmtSortAscending = true;
  protected Integer OverrideUsgFixedAmtSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.override_usg_unit) */
  public    IntegerFilter[] OverrideUsgUnit  = null;
  protected boolean OverrideUsgUnitFetch = false;
  protected boolean OverrideUsgUnitSortAscending = true;
  protected Integer OverrideUsgUnitSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.active_date) */
  public    DateFilter[] ActiveDate  = null;
  protected boolean ActiveDateFetch = false;
  protected boolean ActiveDateSortAscending = true;
  protected Integer ActiveDateSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  private String _objName = "PackageOverridesObjectFilter";
  /** default constructor */
  public PackageOverridesObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PackageOverridesObjectFilter (PackageOverridesObjectFilter other)
  {
    if (other == null) return;
    this.Key = new PackageOverridesObjectKeyFilter (other.Key);
    this.ComponentId = other.ComponentId;
    this.ComponentIdFetch = other.ComponentIdFetch;
    this.ComponentIdSort = other.ComponentIdSort;
    this.ComponentIdSortAscending = other.ComponentIdSortAscending;
    this.MemberId = other.MemberId;
    this.MemberIdFetch = other.MemberIdFetch;
    this.MemberIdSort = other.MemberIdSort;
    this.MemberIdSortAscending = other.MemberIdSortAscending;
    this.OverrideRateLevel = other.OverrideRateLevel;
    this.OverrideRateLevelFetch = other.OverrideRateLevelFetch;
    this.OverrideRateLevelSort = other.OverrideRateLevelSort;
    this.OverrideRateLevelSortAscending = other.OverrideRateLevelSortAscending;
    this.OverrideRateStatus = other.OverrideRateStatus;
    this.OverrideRateStatusFetch = other.OverrideRateStatusFetch;
    this.OverrideRateStatusSort = other.OverrideRateStatusSort;
    this.OverrideRateStatusSortAscending = other.OverrideRateStatusSortAscending;
    this.OverrideRateRc = other.OverrideRateRc;
    this.OverrideRateRcFetch = other.OverrideRateRcFetch;
    this.OverrideRateRcSort = other.OverrideRateRcSort;
    this.OverrideRateRcSortAscending = other.OverrideRateRcSortAscending;
    this.OverrideRateNrc = other.OverrideRateNrc;
    this.OverrideRateNrcFetch = other.OverrideRateNrcFetch;
    this.OverrideRateNrcSort = other.OverrideRateNrcSort;
    this.OverrideRateNrcSortAscending = other.OverrideRateNrcSortAscending;
    this.OverrideUsgChargeAmt = other.OverrideUsgChargeAmt;
    this.OverrideUsgChargeAmtFetch = other.OverrideUsgChargeAmtFetch;
    this.OverrideUsgChargeAmtSort = other.OverrideUsgChargeAmtSort;
    this.OverrideUsgChargeAmtSortAscending = other.OverrideUsgChargeAmtSortAscending;
    this.OverrideUsgFixedAmt = other.OverrideUsgFixedAmt;
    this.OverrideUsgFixedAmtFetch = other.OverrideUsgFixedAmtFetch;
    this.OverrideUsgFixedAmtSort = other.OverrideUsgFixedAmtSort;
    this.OverrideUsgFixedAmtSortAscending = other.OverrideUsgFixedAmtSortAscending;
    this.OverrideUsgUnit = other.OverrideUsgUnit;
    this.OverrideUsgUnitFetch = other.OverrideUsgUnitFetch;
    this.OverrideUsgUnitSort = other.OverrideUsgUnitSort;
    this.OverrideUsgUnitSortAscending = other.OverrideUsgUnitSortAscending;
    this.ActiveDate = other.ActiveDate;
    this.ActiveDateFetch = other.ActiveDateFetch;
    this.ActiveDateSort = other.ActiveDateSort;
    this.ActiveDateSortAscending = other.ActiveDateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;  }
  /** get the filter for this object's key
   * @return PackageOverridesObjectKeyFilter
   */
  public PackageOverridesObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (PackageOverridesObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.ParentAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ParentAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.ParentAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ParentAccountInternalIdSort;
  }
  /** Set the sort direction for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.ParentAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ParentAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.ParentAccountInternalId = value;
  }
  /** Retrieve filter for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ParentAccountInternalId;
  }
  /** Set the field level Fetch value for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageInstIdFetch;
  }
  /** Set the SortOrder for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstIdSort = value;
  }
  /** Retrieve SortOrder for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageInstIdSort;
  }
  /** Set the sort direction for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageInstIdSortAscending;
  }
  /** Set the field level filters for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstId = value;
  }
  /** Retrieve filter for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageInstId;
  }
  /** Set the field level Fetch value for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageInstIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageInstIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageInstIdServFetch;
  }
  /** Set the SortOrder for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageInstIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstIdServSort = value;
  }
  /** Retrieve SortOrder for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageInstIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageInstIdServSort;
  }
  /** Set the sort direction for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageInstIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageInstIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageInstIdServSortAscending;
  }
  /** Set the field level filters for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageInstIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageInstIdServ = value;
  }
  /** Retrieve filter for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageInstIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageInstIdServ;
  }
  /** Set the field level Fetch value for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageIdFetch;
  }
  /** Set the SortOrder for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageIdSort = value;
  }
  /** Retrieve SortOrder for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageIdSort;
  }
  /** Set the sort direction for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PackageIdSortAscending;
  }
  /** Set the field level filters for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.PackageId = value;
  }
  /** Retrieve filter for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PackageId;
  }
  /** Set the field level Fetch value for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAssociationIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAssociationIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AssociationIdFetch;
  }
  /** Set the SortOrder for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAssociationIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationIdSort = value;
  }
  /** Retrieve SortOrder for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAssociationIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AssociationIdSort;
  }
  /** Set the sort direction for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAssociationIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAssociationIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AssociationIdSortAscending;
  }
  /** Set the field level filters for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAssociationIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationId = value;
  }
  /** Retrieve filter for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAssociationIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AssociationId;
  }
  /** Set the field level Fetch value for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAssociationTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAssociationTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AssociationTypeFetch;
  }
  /** Set the SortOrder for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAssociationTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationTypeSort = value;
  }
  /** Retrieve SortOrder for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAssociationTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AssociationTypeSort;
  }
  /** Set the sort direction for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAssociationTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAssociationTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AssociationTypeSortAscending;
  }
  /** Set the field level filters for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAssociationTypeFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.AssociationType = value;
  }
  /** Retrieve filter for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAssociationTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AssociationType;
  }
  /** Set the field level Fetch value for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PackageOverridesObjectKeyFilter ();
    this.Key.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Set the field level Fetch value for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentIdFetch (boolean fetch) {
    this.ComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentIdFetch () {
    return this.ComponentIdFetch;
  }
  /** Set the SortOrder for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentIdSortOrder (Integer value) {
    this.ComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentIdSortOrder () {
    return this.ComponentIdSort;
  }
  /** Set the sort direction for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentIdSortDirection (boolean ascending) {
    this.ComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentIdSortDirection () {
    return this.ComponentIdSortAscending;
  }
  /** Set the field level filters for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ComponentId = value;
  }
  /** Retrieve filter for field: ComponentId (CMF_PACKAGE_OVERRIDES.component_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getComponentIdFilter () {
    return this.ComponentId;
  }

  /**
   * Retrieves the ComponentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ComponentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentIdFilter field
   */
  public String[] getComponentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getComponentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ComponentIdFilter filter value from a formatted string
   *
   * @param _value the ComponentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ComponentIdFilter filter field
   */
  public void setComponentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFilterFromFormattedString");
    try {
      this.setComponentIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMemberIdFetch (boolean fetch) {
    this.MemberIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMemberIdFetch () {
    return this.MemberIdFetch;
  }
  /** Set the SortOrder for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMemberIdSortOrder (Integer value) {
    this.MemberIdSort = value;
  }
  /** Retrieve SortOrder for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMemberIdSortOrder () {
    return this.MemberIdSort;
  }
  /** Set the sort direction for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMemberIdSortDirection (boolean ascending) {
    this.MemberIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMemberIdSortDirection () {
    return this.MemberIdSortAscending;
  }
  /** Set the field level filters for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMemberIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MemberId = value;
  }
  /** Retrieve filter for field: MemberId (CMF_PACKAGE_OVERRIDES.member_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMemberIdFilter () {
    return this.MemberId;
  }

  /**
   * Retrieves the MemberIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MemberIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MemberIdFilter field
   */
  public String[] getMemberIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMemberIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMemberIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMemberIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MemberIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMemberIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MemberIdFilter filter value from a formatted string
   *
   * @param _value the MemberIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MemberIdFilter filter field
   */
  public void setMemberIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMemberIdFilterFromFormattedString");
    try {
      this.setMemberIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MemberIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMemberIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMemberIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideRateLevelFetch (boolean fetch) {
    this.OverrideRateLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideRateLevelFetch () {
    return this.OverrideRateLevelFetch;
  }
  /** Set the SortOrder for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideRateLevelSortOrder (Integer value) {
    this.OverrideRateLevelSort = value;
  }
  /** Retrieve SortOrder for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideRateLevelSortOrder () {
    return this.OverrideRateLevelSort;
  }
  /** Set the sort direction for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideRateLevelSortDirection (boolean ascending) {
    this.OverrideRateLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideRateLevelSortDirection () {
    return this.OverrideRateLevelSortAscending;
  }
  /** Set the field level filters for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideRateLevelFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OverrideRateLevel = value;
  }
  /** Retrieve filter for field: OverrideRateLevel (CMF_PACKAGE_OVERRIDES.override_rate_level)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOverrideRateLevelFilter () {
    return this.OverrideRateLevel;
  }

  /**
   * Retrieves the OverrideRateLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideRateLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateLevelFilter field
   */
  public String[] getOverrideRateLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideRateLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideRateLevelFilter filter value from a formatted string
   *
   * @param _value the OverrideRateLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideRateLevelFilter filter field
   */
  public void setOverrideRateLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideRateLevelFilterFromFormattedString");
    try {
      this.setOverrideRateLevelFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideRateStatusFetch (boolean fetch) {
    this.OverrideRateStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideRateStatusFetch () {
    return this.OverrideRateStatusFetch;
  }
  /** Set the SortOrder for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideRateStatusSortOrder (Integer value) {
    this.OverrideRateStatusSort = value;
  }
  /** Retrieve SortOrder for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideRateStatusSortOrder () {
    return this.OverrideRateStatusSort;
  }
  /** Set the sort direction for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideRateStatusSortDirection (boolean ascending) {
    this.OverrideRateStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideRateStatusSortDirection () {
    return this.OverrideRateStatusSortAscending;
  }
  /** Set the field level filters for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideRateStatusFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OverrideRateStatus = value;
  }
  /** Retrieve filter for field: OverrideRateStatus (CMF_PACKAGE_OVERRIDES.override_rate_status)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOverrideRateStatusFilter () {
    return this.OverrideRateStatus;
  }

  /**
   * Retrieves the OverrideRateStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideRateStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateStatusFilter field
   */
  public String[] getOverrideRateStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideRateStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideRateStatusFilter filter value from a formatted string
   *
   * @param _value the OverrideRateStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideRateStatusFilter filter field
   */
  public void setOverrideRateStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideRateStatusFilterFromFormattedString");
    try {
      this.setOverrideRateStatusFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideRateRcFetch (boolean fetch) {
    this.OverrideRateRcFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideRateRcFetch () {
    return this.OverrideRateRcFetch;
  }
  /** Set the SortOrder for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideRateRcSortOrder (Integer value) {
    this.OverrideRateRcSort = value;
  }
  /** Retrieve SortOrder for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideRateRcSortOrder () {
    return this.OverrideRateRcSort;
  }
  /** Set the sort direction for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideRateRcSortDirection (boolean ascending) {
    this.OverrideRateRcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideRateRcSortDirection () {
    return this.OverrideRateRcSortAscending;
  }
  /** Set the field level filters for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideRateRcFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OverrideRateRc = value;
  }
  /** Retrieve filter for field: OverrideRateRc (CMF_PACKAGE_OVERRIDES.override_rate_rc)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOverrideRateRcFilter () {
    return this.OverrideRateRc;
  }

  /**
   * Retrieves the OverrideRateRcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideRateRcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateRcFilter field
   */
  public String[] getOverrideRateRcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateRcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideRateRcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateRcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateRcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateRcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideRateRcFilter filter value from a formatted string
   *
   * @param _value the OverrideRateRcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideRateRcFilter filter field
   */
  public void setOverrideRateRcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideRateRcFilterFromFormattedString");
    try {
      this.setOverrideRateRcFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateRcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateRcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateRcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideRateNrcFetch (boolean fetch) {
    this.OverrideRateNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideRateNrcFetch () {
    return this.OverrideRateNrcFetch;
  }
  /** Set the SortOrder for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideRateNrcSortOrder (Integer value) {
    this.OverrideRateNrcSort = value;
  }
  /** Retrieve SortOrder for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideRateNrcSortOrder () {
    return this.OverrideRateNrcSort;
  }
  /** Set the sort direction for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideRateNrcSortDirection (boolean ascending) {
    this.OverrideRateNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideRateNrcSortDirection () {
    return this.OverrideRateNrcSortAscending;
  }
  /** Set the field level filters for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideRateNrcFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OverrideRateNrc = value;
  }
  /** Retrieve filter for field: OverrideRateNrc (CMF_PACKAGE_OVERRIDES.override_rate_nrc)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOverrideRateNrcFilter () {
    return this.OverrideRateNrc;
  }

  /**
   * Retrieves the OverrideRateNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideRateNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideRateNrcFilter field
   */
  public String[] getOverrideRateNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideRateNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideRateNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideRateNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideRateNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideRateNrcFilter filter value from a formatted string
   *
   * @param _value the OverrideRateNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideRateNrcFilter filter field
   */
  public void setOverrideRateNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideRateNrcFilterFromFormattedString");
    try {
      this.setOverrideRateNrcFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideRateNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideRateNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideRateNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideUsgChargeAmtFetch (boolean fetch) {
    this.OverrideUsgChargeAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideUsgChargeAmtFetch () {
    return this.OverrideUsgChargeAmtFetch;
  }
  /** Set the SortOrder for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideUsgChargeAmtSortOrder (Integer value) {
    this.OverrideUsgChargeAmtSort = value;
  }
  /** Retrieve SortOrder for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideUsgChargeAmtSortOrder () {
    return this.OverrideUsgChargeAmtSort;
  }
  /** Set the sort direction for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideUsgChargeAmtSortDirection (boolean ascending) {
    this.OverrideUsgChargeAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideUsgChargeAmtSortDirection () {
    return this.OverrideUsgChargeAmtSortAscending;
  }
  /** Set the field level filters for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideUsgChargeAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OverrideUsgChargeAmt = value;
  }
  /** Retrieve filter for field: OverrideUsgChargeAmt (CMF_PACKAGE_OVERRIDES.override_usg_charge_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOverrideUsgChargeAmtFilter () {
    return this.OverrideUsgChargeAmt;
  }

  /**
   * Retrieves the OverrideUsgChargeAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideUsgChargeAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideUsgChargeAmtFilter field
   */
  public String[] getOverrideUsgChargeAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgChargeAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideUsgChargeAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsgChargeAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideUsgChargeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideUsgChargeAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideUsgChargeAmtFilter filter value from a formatted string
   *
   * @param _value the OverrideUsgChargeAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideUsgChargeAmtFilter filter field
   */
  public void setOverrideUsgChargeAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideUsgChargeAmtFilterFromFormattedString");
    try {
      this.setOverrideUsgChargeAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideUsgChargeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideUsgChargeAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideUsgChargeAmtFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideUsgFixedAmtFetch (boolean fetch) {
    this.OverrideUsgFixedAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideUsgFixedAmtFetch () {
    return this.OverrideUsgFixedAmtFetch;
  }
  /** Set the SortOrder for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideUsgFixedAmtSortOrder (Integer value) {
    this.OverrideUsgFixedAmtSort = value;
  }
  /** Retrieve SortOrder for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideUsgFixedAmtSortOrder () {
    return this.OverrideUsgFixedAmtSort;
  }
  /** Set the sort direction for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideUsgFixedAmtSortDirection (boolean ascending) {
    this.OverrideUsgFixedAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideUsgFixedAmtSortDirection () {
    return this.OverrideUsgFixedAmtSortAscending;
  }
  /** Set the field level filters for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideUsgFixedAmtFilter (IntegerFilter[] value) throws ServiceException {
    this.OverrideUsgFixedAmt = value;
  }
  /** Retrieve filter for field: OverrideUsgFixedAmt (CMF_PACKAGE_OVERRIDES.override_usg_fixed_amt)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideUsgFixedAmtFilter () {
    return this.OverrideUsgFixedAmt;
  }

  /**
   * Retrieves the OverrideUsgFixedAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideUsgFixedAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideUsgFixedAmtFilter field
   */
  public String[] getOverrideUsgFixedAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgFixedAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideUsgFixedAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsgFixedAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideUsgFixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideUsgFixedAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideUsgFixedAmtFilter filter value from a formatted string
   *
   * @param _value the OverrideUsgFixedAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideUsgFixedAmtFilter filter field
   */
  public void setOverrideUsgFixedAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideUsgFixedAmtFilterFromFormattedString");
    try {
      this.setOverrideUsgFixedAmtFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideUsgFixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideUsgFixedAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideUsgFixedAmtFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideUsgUnitFetch (boolean fetch) {
    this.OverrideUsgUnitFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideUsgUnitFetch () {
    return this.OverrideUsgUnitFetch;
  }
  /** Set the SortOrder for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideUsgUnitSortOrder (Integer value) {
    this.OverrideUsgUnitSort = value;
  }
  /** Retrieve SortOrder for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideUsgUnitSortOrder () {
    return this.OverrideUsgUnitSort;
  }
  /** Set the sort direction for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideUsgUnitSortDirection (boolean ascending) {
    this.OverrideUsgUnitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideUsgUnitSortDirection () {
    return this.OverrideUsgUnitSortAscending;
  }
  /** Set the field level filters for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideUsgUnitFilter (IntegerFilter[] value) throws ServiceException {
    this.OverrideUsgUnit = value;
  }
  /** Retrieve filter for field: OverrideUsgUnit (CMF_PACKAGE_OVERRIDES.override_usg_unit)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideUsgUnitFilter () {
    return this.OverrideUsgUnit;
  }

  /**
   * Retrieves the OverrideUsgUnitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OverrideUsgUnitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideUsgUnitFilter field
   */
  public String[] getOverrideUsgUnitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideUsgUnitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOverrideUsgUnitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideUsgUnitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideUsgUnitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideUsgUnitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OverrideUsgUnitFilter filter value from a formatted string
   *
   * @param _value the OverrideUsgUnitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OverrideUsgUnitFilter filter field
   */
  public void setOverrideUsgUnitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOverrideUsgUnitFilterFromFormattedString");
    try {
      this.setOverrideUsgUnitFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OverrideUsgUnitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideUsgUnitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideUsgUnitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch) {
    this.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch () {
    return this.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value) {
    this.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder () {
    return this.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending) {
    this.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection () {
    return this.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (CMF_PACKAGE_OVERRIDES.active_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter () {
    return this.ActiveDate;
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (CMF_PACKAGE_OVERRIDES.inactive_date)
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


  /** Set the field level Fetch value for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (CMF_PACKAGE_OVERRIDES.chg_who)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getChgWhoFilter () {
    return this.ChgWho;
  }

  /**
   * Retrieves the ChgWhoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgWhoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWhoFilter field
   */
  public String[] getChgWhoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgWhoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgWhoFilter filter value from a formatted string
   *
   * @param _value the ChgWhoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgWhoFilter filter field
   */
  public void setChgWhoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgWhoFilterFromFormattedString");
    try {
      this.setChgWhoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (CMF_PACKAGE_OVERRIDES.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return PackageOverridesObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PackageOverridesObjectHelper.toMap(this, null);
  }
}
