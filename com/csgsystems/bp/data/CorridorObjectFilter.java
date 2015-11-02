/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CorridorObjectFilter.java
 * Definition File: Customer/Corridor.xml
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
public class CorridorObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CorridorObjectKeyFilter Key = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.is_icb_corridor) */
  public    BooleanFilter[] IsIcbCorridor  = null;
  protected boolean IsIcbCorridorFetch = false;
  protected boolean IsIcbCorridorSortAscending = true;
  protected Integer IsIcbCorridorSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.plan_type) */
  public    IntegerFilter[] PlanType  = null;
  protected boolean PlanTypeFetch = false;
  protected boolean PlanTypeSortAscending = true;
  protected Integer PlanTypeSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.plan_level) */
  public    IntegerFilter[] PlanLevel  = null;
  protected boolean PlanLevelFetch = false;
  protected boolean PlanLevelSortAscending = true;
  protected Integer PlanLevelSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.origin_restriction) */
  public    IntegerFilter[] OriginRestriction  = null;
  protected boolean OriginRestrictionFetch = false;
  protected boolean OriginRestrictionSortAscending = true;
  protected Integer OriginRestrictionSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.target_restriction) */
  public    IntegerFilter[] TargetRestriction  = null;
  protected boolean TargetRestrictionFetch = false;
  protected boolean TargetRestrictionSortAscending = true;
  protected Integer TargetRestrictionSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.discount_id) */
  public    IntegerFilter[] DiscountId  = null;
  protected boolean DiscountIdFetch = false;
  protected boolean DiscountIdSortAscending = true;
  protected Integer DiscountIdSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.max_corridors) */
  public    IntegerFilter[] MaxCorridors  = null;
  protected boolean MaxCorridorsFetch = false;
  protected boolean MaxCorridorsSortAscending = true;
  protected Integer MaxCorridorsSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: CORRIDOR_PLAN_ID_REF.priority) */
  public    IntegerFilter[] Priority  = null;
  protected boolean PriorityFetch = false;
  protected boolean PrioritySortAscending = true;
  protected Integer PrioritySort = null;
  /** raw field for: CORRIDOR_PLAN_ID_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: CORRIDOR_PLAN_ID_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.point_origin) */
  public    StringFilter[] PointOrigin  = null;
  protected boolean PointOriginFetch = false;
  protected boolean PointOriginSortAscending = true;
  protected boolean PointOriginCaseInsensitive = false;
  protected Integer PointOriginSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.origin_is_xact) */
  public    BooleanFilter[] OriginIsXact  = null;
  protected boolean OriginIsXactFetch = false;
  protected boolean OriginIsXactSortAscending = true;
  protected Integer OriginIsXactSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.country_code_origin) */
  public    IntegerFilter[] CountryCodeOrigin  = null;
  protected boolean CountryCodeOriginFetch = false;
  protected boolean CountryCodeOriginSortAscending = true;
  protected Integer CountryCodeOriginSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.point_target) */
  public    StringFilter[] PointTarget  = null;
  protected boolean PointTargetFetch = false;
  protected boolean PointTargetSortAscending = true;
  protected boolean PointTargetCaseInsensitive = false;
  protected Integer PointTargetSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.target_is_xact) */
  public    BooleanFilter[] TargetIsXact  = null;
  protected boolean TargetIsXactFetch = false;
  protected boolean TargetIsXactSortAscending = true;
  protected Integer TargetIsXactSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.country_code_target) */
  public    IntegerFilter[] CountryCodeTarget  = null;
  protected boolean CountryCodeTargetFetch = false;
  protected boolean CountryCodeTargetSortAscending = true;
  protected Integer CountryCodeTargetSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.corridor_plan_id) */
  public    IntegerFilter[] CorridorPlanId  = null;
  protected boolean CorridorPlanIdFetch = false;
  protected boolean CorridorPlanIdSortAscending = true;
  protected Integer CorridorPlanIdSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.access_region_origin) */
  public    StringFilter[] AccessRegionOrigin  = null;
  protected boolean AccessRegionOriginFetch = false;
  protected boolean AccessRegionOriginSortAscending = true;
  protected boolean AccessRegionOriginCaseInsensitive = false;
  protected Integer AccessRegionOriginSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.access_region_target) */
  public    StringFilter[] AccessRegionTarget  = null;
  protected boolean AccessRegionTargetFetch = false;
  protected boolean AccessRegionTargetSortAscending = true;
  protected boolean AccessRegionTargetCaseInsensitive = false;
  protected Integer AccessRegionTargetSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.owning_account_no) */
  public    IntegerFilter[] OwningAccountInternalId  = null;
  protected boolean OwningAccountInternalIdFetch = false;
  protected boolean OwningAccountInternalIdSortAscending = true;
  protected Integer OwningAccountInternalIdSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.point_category) */
  public    IntegerFilter[] PointCategory  = null;
  protected boolean PointCategoryFetch = false;
  protected boolean PointCategorySortAscending = true;
  protected Integer PointCategorySort = null;
  /** raw field for: CUSTOMER_CORRIDORS.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: CUSTOMER_CORRIDORS.prev_end_dt) */
  public    DateFilter[] PrevEndDt  = null;
  protected boolean PrevEndDtFetch = false;
  protected boolean PrevEndDtSortAscending = true;
  protected Integer PrevEndDtSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] OwningAccountExternalId  = null;
  protected boolean OwningAccountExternalIdFetch = false;
  protected boolean OwningAccountExternalIdSortAscending = true;
  protected boolean OwningAccountExternalIdCaseInsensitive = false;
  protected Integer OwningAccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] OwningAccountExternalIdType  = null;
  protected boolean OwningAccountExternalIdTypeFetch = false;
  protected boolean OwningAccountExternalIdTypeSortAscending = true;
  protected Integer OwningAccountExternalIdTypeSort = null;
  private String _objName = "CorridorObjectFilter";
  /** default constructor */
  public CorridorObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CorridorObjectFilter (CorridorObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CorridorObjectKeyFilter (other.Key);
    this.IsIcbCorridor = other.IsIcbCorridor;
    this.IsIcbCorridorFetch = other.IsIcbCorridorFetch;
    this.IsIcbCorridorSort = other.IsIcbCorridorSort;
    this.IsIcbCorridorSortAscending = other.IsIcbCorridorSortAscending;
    this.PlanType = other.PlanType;
    this.PlanTypeFetch = other.PlanTypeFetch;
    this.PlanTypeSort = other.PlanTypeSort;
    this.PlanTypeSortAscending = other.PlanTypeSortAscending;
    this.PlanLevel = other.PlanLevel;
    this.PlanLevelFetch = other.PlanLevelFetch;
    this.PlanLevelSort = other.PlanLevelSort;
    this.PlanLevelSortAscending = other.PlanLevelSortAscending;
    this.OriginRestriction = other.OriginRestriction;
    this.OriginRestrictionFetch = other.OriginRestrictionFetch;
    this.OriginRestrictionSort = other.OriginRestrictionSort;
    this.OriginRestrictionSortAscending = other.OriginRestrictionSortAscending;
    this.TargetRestriction = other.TargetRestriction;
    this.TargetRestrictionFetch = other.TargetRestrictionFetch;
    this.TargetRestrictionSort = other.TargetRestrictionSort;
    this.TargetRestrictionSortAscending = other.TargetRestrictionSortAscending;
    this.DiscountId = other.DiscountId;
    this.DiscountIdFetch = other.DiscountIdFetch;
    this.DiscountIdSort = other.DiscountIdSort;
    this.DiscountIdSortAscending = other.DiscountIdSortAscending;
    this.MaxCorridors = other.MaxCorridors;
    this.MaxCorridorsFetch = other.MaxCorridorsFetch;
    this.MaxCorridorsSort = other.MaxCorridorsSort;
    this.MaxCorridorsSortAscending = other.MaxCorridorsSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.Priority = other.Priority;
    this.PriorityFetch = other.PriorityFetch;
    this.PrioritySort = other.PrioritySort;
    this.PrioritySortAscending = other.PrioritySortAscending;
    this.ShortDisplay = other.ShortDisplay;
    this.ShortDisplayFetch = other.ShortDisplayFetch;
    this.ShortDisplaySort = other.ShortDisplaySort;
    this.ShortDisplayCaseInsensitive = other.ShortDisplayCaseInsensitive;
    this.ShortDisplaySortAscending = other.ShortDisplaySortAscending;
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.PointOrigin = other.PointOrigin;
    this.PointOriginFetch = other.PointOriginFetch;
    this.PointOriginSort = other.PointOriginSort;
    this.PointOriginCaseInsensitive = other.PointOriginCaseInsensitive;
    this.PointOriginSortAscending = other.PointOriginSortAscending;
    this.OriginIsXact = other.OriginIsXact;
    this.OriginIsXactFetch = other.OriginIsXactFetch;
    this.OriginIsXactSort = other.OriginIsXactSort;
    this.OriginIsXactSortAscending = other.OriginIsXactSortAscending;
    this.CountryCodeOrigin = other.CountryCodeOrigin;
    this.CountryCodeOriginFetch = other.CountryCodeOriginFetch;
    this.CountryCodeOriginSort = other.CountryCodeOriginSort;
    this.CountryCodeOriginSortAscending = other.CountryCodeOriginSortAscending;
    this.PointTarget = other.PointTarget;
    this.PointTargetFetch = other.PointTargetFetch;
    this.PointTargetSort = other.PointTargetSort;
    this.PointTargetCaseInsensitive = other.PointTargetCaseInsensitive;
    this.PointTargetSortAscending = other.PointTargetSortAscending;
    this.TargetIsXact = other.TargetIsXact;
    this.TargetIsXactFetch = other.TargetIsXactFetch;
    this.TargetIsXactSort = other.TargetIsXactSort;
    this.TargetIsXactSortAscending = other.TargetIsXactSortAscending;
    this.CountryCodeTarget = other.CountryCodeTarget;
    this.CountryCodeTargetFetch = other.CountryCodeTargetFetch;
    this.CountryCodeTargetSort = other.CountryCodeTargetSort;
    this.CountryCodeTargetSortAscending = other.CountryCodeTargetSortAscending;
    this.CorridorPlanId = other.CorridorPlanId;
    this.CorridorPlanIdFetch = other.CorridorPlanIdFetch;
    this.CorridorPlanIdSort = other.CorridorPlanIdSort;
    this.CorridorPlanIdSortAscending = other.CorridorPlanIdSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.AccessRegionOrigin = other.AccessRegionOrigin;
    this.AccessRegionOriginFetch = other.AccessRegionOriginFetch;
    this.AccessRegionOriginSort = other.AccessRegionOriginSort;
    this.AccessRegionOriginCaseInsensitive = other.AccessRegionOriginCaseInsensitive;
    this.AccessRegionOriginSortAscending = other.AccessRegionOriginSortAscending;
    this.AccessRegionTarget = other.AccessRegionTarget;
    this.AccessRegionTargetFetch = other.AccessRegionTargetFetch;
    this.AccessRegionTargetSort = other.AccessRegionTargetSort;
    this.AccessRegionTargetCaseInsensitive = other.AccessRegionTargetCaseInsensitive;
    this.AccessRegionTargetSortAscending = other.AccessRegionTargetSortAscending;
    this.OwningAccountInternalId = other.OwningAccountInternalId;
    this.OwningAccountInternalIdFetch = other.OwningAccountInternalIdFetch;
    this.OwningAccountInternalIdSort = other.OwningAccountInternalIdSort;
    this.OwningAccountInternalIdSortAscending = other.OwningAccountInternalIdSortAscending;
    this.PointCategory = other.PointCategory;
    this.PointCategoryFetch = other.PointCategoryFetch;
    this.PointCategorySort = other.PointCategorySort;
    this.PointCategorySortAscending = other.PointCategorySortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;
    this.PrevEndDt = other.PrevEndDt;
    this.PrevEndDtFetch = other.PrevEndDtFetch;
    this.PrevEndDtSort = other.PrevEndDtSort;
    this.PrevEndDtSortAscending = other.PrevEndDtSortAscending;
    this.OwningAccountExternalId = other.OwningAccountExternalId;
    this.OwningAccountExternalIdFetch = other.OwningAccountExternalIdFetch;
    this.OwningAccountExternalIdSort = other.OwningAccountExternalIdSort;
    this.OwningAccountExternalIdCaseInsensitive = other.OwningAccountExternalIdCaseInsensitive;
    this.OwningAccountExternalIdSortAscending = other.OwningAccountExternalIdSortAscending;
    this.OwningAccountExternalIdType = other.OwningAccountExternalIdType;
    this.OwningAccountExternalIdTypeFetch = other.OwningAccountExternalIdTypeFetch;
    this.OwningAccountExternalIdTypeSort = other.OwningAccountExternalIdTypeSort;
    this.OwningAccountExternalIdTypeSortAscending = other.OwningAccountExternalIdTypeSortAscending;  }
  /** get the filter for this object's key
   * @return CorridorObjectKeyFilter
   */
  public CorridorObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CorridorObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (CUSTOMER_CORRIDORS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (CUSTOMER_CORRIDORS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CorridorObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (CORRIDOR_PLAN_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @param fetch whether to fetch this field or not
   */
  public void setIsIcbCorridorFetch (boolean fetch) {
    this.IsIcbCorridorFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsIcbCorridorFetch () {
    return this.IsIcbCorridorFetch;
  }
  /** Set the SortOrder for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsIcbCorridorSortOrder (Integer value) {
    this.IsIcbCorridorSort = value;
  }
  /** Retrieve SortOrder for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsIcbCorridorSortOrder () {
    return this.IsIcbCorridorSort;
  }
  /** Set the sort direction for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsIcbCorridorSortDirection (boolean ascending) {
    this.IsIcbCorridorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsIcbCorridorSortDirection () {
    return this.IsIcbCorridorSortAscending;
  }
  /** Set the field level filters for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsIcbCorridorFilter (BooleanFilter[] value) throws ServiceException {
    this.IsIcbCorridor = value;
  }
  /** Retrieve filter for field: IsIcbCorridor (CORRIDOR_PLAN_ID_REF.is_icb_corridor)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsIcbCorridorFilter () {
    return this.IsIcbCorridor;
  }

  /**
   * Retrieves the IsIcbCorridorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsIcbCorridorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsIcbCorridorFilter field
   */
  public String[] getIsIcbCorridorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsIcbCorridorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsIcbCorridorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsIcbCorridorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsIcbCorridorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsIcbCorridorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsIcbCorridorFilter filter value from a formatted string
   *
   * @param _value the IsIcbCorridorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsIcbCorridorFilter filter field
   */
  public void setIsIcbCorridorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsIcbCorridorFilterFromFormattedString");
    try {
      this.setIsIcbCorridorFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsIcbCorridorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsIcbCorridorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsIcbCorridorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @param fetch whether to fetch this field or not
   */
  public void setPlanTypeFetch (boolean fetch) {
    this.PlanTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getPlanTypeFetch () {
    return this.PlanTypeFetch;
  }
  /** Set the SortOrder for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPlanTypeSortOrder (Integer value) {
    this.PlanTypeSort = value;
  }
  /** Retrieve SortOrder for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPlanTypeSortOrder () {
    return this.PlanTypeSort;
  }
  /** Set the sort direction for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPlanTypeSortDirection (boolean ascending) {
    this.PlanTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPlanTypeSortDirection () {
    return this.PlanTypeSortAscending;
  }
  /** Set the field level filters for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPlanTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.PlanType = value;
  }
  /** Retrieve filter for field: PlanType (CORRIDOR_PLAN_ID_REF.plan_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPlanTypeFilter () {
    return this.PlanType;
  }

  /**
   * Retrieves the PlanTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PlanTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanTypeFilter field
   */
  public String[] getPlanTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPlanTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PlanTypeFilter filter value from a formatted string
   *
   * @param _value the PlanTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PlanTypeFilter filter field
   */
  public void setPlanTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanTypeFilterFromFormattedString");
    try {
      this.setPlanTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @param fetch whether to fetch this field or not
   */
  public void setPlanLevelFetch (boolean fetch) {
    this.PlanLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getPlanLevelFetch () {
    return this.PlanLevelFetch;
  }
  /** Set the SortOrder for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPlanLevelSortOrder (Integer value) {
    this.PlanLevelSort = value;
  }
  /** Retrieve SortOrder for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPlanLevelSortOrder () {
    return this.PlanLevelSort;
  }
  /** Set the sort direction for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPlanLevelSortDirection (boolean ascending) {
    this.PlanLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPlanLevelSortDirection () {
    return this.PlanLevelSortAscending;
  }
  /** Set the field level filters for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPlanLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.PlanLevel = value;
  }
  /** Retrieve filter for field: PlanLevel (CORRIDOR_PLAN_ID_REF.plan_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPlanLevelFilter () {
    return this.PlanLevel;
  }

  /**
   * Retrieves the PlanLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PlanLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanLevelFilter field
   */
  public String[] getPlanLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPlanLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PlanLevelFilter filter value from a formatted string
   *
   * @param _value the PlanLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PlanLevelFilter filter field
   */
  public void setPlanLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanLevelFilterFromFormattedString");
    try {
      this.setPlanLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @param fetch whether to fetch this field or not
   */
  public void setOriginRestrictionFetch (boolean fetch) {
    this.OriginRestrictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @return boolean the Fetch value for this field
   */
  public boolean getOriginRestrictionFetch () {
    return this.OriginRestrictionFetch;
  }
  /** Set the SortOrder for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOriginRestrictionSortOrder (Integer value) {
    this.OriginRestrictionSort = value;
  }
  /** Retrieve SortOrder for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOriginRestrictionSortOrder () {
    return this.OriginRestrictionSort;
  }
  /** Set the sort direction for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOriginRestrictionSortDirection (boolean ascending) {
    this.OriginRestrictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOriginRestrictionSortDirection () {
    return this.OriginRestrictionSortAscending;
  }
  /** Set the field level filters for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOriginRestrictionFilter (IntegerFilter[] value) throws ServiceException {
    this.OriginRestriction = value;
  }
  /** Retrieve filter for field: OriginRestriction (CORRIDOR_PLAN_ID_REF.origin_restriction)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOriginRestrictionFilter () {
    return this.OriginRestriction;
  }

  /**
   * Retrieves the OriginRestrictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OriginRestrictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginRestrictionFilter field
   */
  public String[] getOriginRestrictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginRestrictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOriginRestrictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginRestrictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginRestrictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginRestrictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OriginRestrictionFilter filter value from a formatted string
   *
   * @param _value the OriginRestrictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OriginRestrictionFilter filter field
   */
  public void setOriginRestrictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOriginRestrictionFilterFromFormattedString");
    try {
      this.setOriginRestrictionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginRestrictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginRestrictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginRestrictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @param fetch whether to fetch this field or not
   */
  public void setTargetRestrictionFetch (boolean fetch) {
    this.TargetRestrictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @return boolean the Fetch value for this field
   */
  public boolean getTargetRestrictionFetch () {
    return this.TargetRestrictionFetch;
  }
  /** Set the SortOrder for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTargetRestrictionSortOrder (Integer value) {
    this.TargetRestrictionSort = value;
  }
  /** Retrieve SortOrder for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTargetRestrictionSortOrder () {
    return this.TargetRestrictionSort;
  }
  /** Set the sort direction for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTargetRestrictionSortDirection (boolean ascending) {
    this.TargetRestrictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTargetRestrictionSortDirection () {
    return this.TargetRestrictionSortAscending;
  }
  /** Set the field level filters for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTargetRestrictionFilter (IntegerFilter[] value) throws ServiceException {
    this.TargetRestriction = value;
  }
  /** Retrieve filter for field: TargetRestriction (CORRIDOR_PLAN_ID_REF.target_restriction)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTargetRestrictionFilter () {
    return this.TargetRestriction;
  }

  /**
   * Retrieves the TargetRestrictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TargetRestrictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetRestrictionFilter field
   */
  public String[] getTargetRestrictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetRestrictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTargetRestrictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetRestrictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetRestrictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetRestrictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TargetRestrictionFilter filter value from a formatted string
   *
   * @param _value the TargetRestrictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TargetRestrictionFilter filter field
   */
  public void setTargetRestrictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTargetRestrictionFilterFromFormattedString");
    try {
      this.setTargetRestrictionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetRestrictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetRestrictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetRestrictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountIdFetch (boolean fetch) {
    this.DiscountIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountIdFetch () {
    return this.DiscountIdFetch;
  }
  /** Set the SortOrder for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountIdSortOrder (Integer value) {
    this.DiscountIdSort = value;
  }
  /** Retrieve SortOrder for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountIdSortOrder () {
    return this.DiscountIdSort;
  }
  /** Set the sort direction for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountIdSortDirection (boolean ascending) {
    this.DiscountIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountIdSortDirection () {
    return this.DiscountIdSortAscending;
  }
  /** Set the field level filters for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountId = value;
  }
  /** Retrieve filter for field: DiscountId (CORRIDOR_PLAN_ID_REF.discount_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountIdFilter () {
    return this.DiscountId;
  }

  /**
   * Retrieves the DiscountIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountIdFilter field
   */
  public String[] getDiscountIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountIdFilter filter value from a formatted string
   *
   * @param _value the DiscountIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountIdFilter filter field
   */
  public void setDiscountIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFilterFromFormattedString");
    try {
      this.setDiscountIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated DiscountIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the DiscountIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the DiscountIdFilter filter field
   */
  public String[] getDiscountIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getDiscountIdFilter(), "DiscountType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated DiscountIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountIdFilter filter field
   */
  public void setDiscountIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setDiscountIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "DiscountId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @param fetch whether to fetch this field or not
   */
  public void setMaxCorridorsFetch (boolean fetch) {
    this.MaxCorridorsFetch = fetch;
  }
  /** Retrieve Fetch value for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @return boolean the Fetch value for this field
   */
  public boolean getMaxCorridorsFetch () {
    return this.MaxCorridorsFetch;
  }
  /** Set the SortOrder for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMaxCorridorsSortOrder (Integer value) {
    this.MaxCorridorsSort = value;
  }
  /** Retrieve SortOrder for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMaxCorridorsSortOrder () {
    return this.MaxCorridorsSort;
  }
  /** Set the sort direction for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMaxCorridorsSortDirection (boolean ascending) {
    this.MaxCorridorsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMaxCorridorsSortDirection () {
    return this.MaxCorridorsSortAscending;
  }
  /** Set the field level filters for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMaxCorridorsFilter (IntegerFilter[] value) throws ServiceException {
    this.MaxCorridors = value;
  }
  /** Retrieve filter for field: MaxCorridors (CORRIDOR_PLAN_ID_REF.max_corridors)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMaxCorridorsFilter () {
    return this.MaxCorridors;
  }

  /**
   * Retrieves the MaxCorridorsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxCorridorsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxCorridorsFilter field
   */
  public String[] getMaxCorridorsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxCorridorsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxCorridorsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxCorridorsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxCorridorsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxCorridorsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MaxCorridorsFilter filter value from a formatted string
   *
   * @param _value the MaxCorridorsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxCorridorsFilter filter field
   */
  public void setMaxCorridorsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxCorridorsFilterFromFormattedString");
    try {
      this.setMaxCorridorsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxCorridorsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxCorridorsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxCorridorsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (CORRIDOR_PLAN_ID_REF.is_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultFilter () {
    return this.IsDefault;
  }

  /**
   * Retrieves the IsDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultFilter field
   */
  public String[] getIsDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultFilter filter value from a formatted string
   *
   * @param _value the IsDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultFilter filter field
   */
  public void setIsDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultFilterFromFormattedString");
    try {
      this.setIsDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (CORRIDOR_PLAN_ID_REF.is_internal)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsInternalFilter () {
    return this.IsInternal;
  }

  /**
   * Retrieves the IsInternalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsInternalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternalFilter field
   */
  public String[] getIsInternalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsInternalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsInternalFilter filter value from a formatted string
   *
   * @param _value the IsInternalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsInternalFilter filter field
   */
  public void setIsInternalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsInternalFilterFromFormattedString");
    try {
      this.setIsInternalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @param fetch whether to fetch this field or not
   */
  public void setPriorityFetch (boolean fetch) {
    this.PriorityFetch = fetch;
  }
  /** Retrieve Fetch value for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @return boolean the Fetch value for this field
   */
  public boolean getPriorityFetch () {
    return this.PriorityFetch;
  }
  /** Set the SortOrder for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrioritySortOrder (Integer value) {
    this.PrioritySort = value;
  }
  /** Retrieve SortOrder for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrioritySortOrder () {
    return this.PrioritySort;
  }
  /** Set the sort direction for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrioritySortDirection (boolean ascending) {
    this.PrioritySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrioritySortDirection () {
    return this.PrioritySortAscending;
  }
  /** Set the field level filters for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPriorityFilter (IntegerFilter[] value) throws ServiceException {
    this.Priority = value;
  }
  /** Retrieve filter for field: Priority (CORRIDOR_PLAN_ID_REF.priority)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPriorityFilter () {
    return this.Priority;
  }

  /**
   * Retrieves the PriorityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PriorityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PriorityFilter field
   */
  public String[] getPriorityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPriorityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPriorityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PriorityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPriorityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PriorityFilter filter value from a formatted string
   *
   * @param _value the PriorityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PriorityFilter filter field
   */
  public void setPriorityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPriorityFilterFromFormattedString");
    try {
      this.setPriorityFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PriorityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPriorityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPriorityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (CORRIDOR_PLAN_ID_VALUES.short_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getShortDisplayFilter () {
    return this.ShortDisplay;
  }

  /**
   * Retrieves the ShortDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ShortDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDisplayFilter field
   */
  public String[] getShortDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getShortDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ShortDisplayFilter filter value from a formatted string
   *
   * @param _value the ShortDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ShortDisplayFilter filter field
   */
  public void setShortDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setShortDisplayFilterFromFormattedString");
    try {
      this.setShortDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (CORRIDOR_PLAN_ID_VALUES.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayValueFilter () {
    return this.DisplayValue;
  }

  /**
   * Retrieves the DisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValueFilter field
   */
  public String[] getDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayValueFilter filter value from a formatted string
   *
   * @param _value the DisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayValueFilter filter field
   */
  public void setDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayValueFilterFromFormattedString");
    try {
      this.setDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CUSTOMER_CORRIDORS.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter () {
    return this.AccountInternalId;
  }

  /**
   * Retrieves the AccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalIdFilter field
   */
  public String[] getAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountInternalIdFilter filter field
   */
  public void setAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
    try {
      this.setAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setPointOriginFetch (boolean fetch) {
    this.PointOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointOriginFetch () {
    return this.PointOriginFetch;
  }
  /** Set the SortOrder for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointOriginSortOrder (Integer value) {
    this.PointOriginSort = value;
  }
  /** Retrieve SortOrder for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointOriginSortOrder () {
    return this.PointOriginSort;
  }
  /** Set the sort direction for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointOriginSortDirection (boolean ascending) {
    this.PointOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointOriginSortDirection () {
    return this.PointOriginSortAscending;
  }
  /** Set the case insensitive for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPointOriginCaseInsensitive (boolean ascending) {
    this.PointOriginCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPointOriginCaseInsensitive () {
    return this.PointOriginCaseInsensitive;
  }
  /** Set the field level filters for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointOriginFilter (StringFilter[] value) throws ServiceException {
    this.PointOrigin = value;
  }
  /** Retrieve filter for field: PointOrigin (CUSTOMER_CORRIDORS.point_origin)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPointOriginFilter () {
    return this.PointOrigin;
  }

  /**
   * Retrieves the PointOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointOriginFilter field
   */
  public String[] getPointOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointOriginFilter filter value from a formatted string
   *
   * @param _value the PointOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointOriginFilter filter field
   */
  public void setPointOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointOriginFilterFromFormattedString");
    try {
      this.setPointOriginFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @param fetch whether to fetch this field or not
   */
  public void setOriginIsXactFetch (boolean fetch) {
    this.OriginIsXactFetch = fetch;
  }
  /** Retrieve Fetch value for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @return boolean the Fetch value for this field
   */
  public boolean getOriginIsXactFetch () {
    return this.OriginIsXactFetch;
  }
  /** Set the SortOrder for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOriginIsXactSortOrder (Integer value) {
    this.OriginIsXactSort = value;
  }
  /** Retrieve SortOrder for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOriginIsXactSortOrder () {
    return this.OriginIsXactSort;
  }
  /** Set the sort direction for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOriginIsXactSortDirection (boolean ascending) {
    this.OriginIsXactSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOriginIsXactSortDirection () {
    return this.OriginIsXactSortAscending;
  }
  /** Set the field level filters for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOriginIsXactFilter (BooleanFilter[] value) throws ServiceException {
    this.OriginIsXact = value;
  }
  /** Retrieve filter for field: OriginIsXact (CUSTOMER_CORRIDORS.origin_is_xact)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getOriginIsXactFilter () {
    return this.OriginIsXact;
  }

  /**
   * Retrieves the OriginIsXactFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OriginIsXactFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginIsXactFilter field
   */
  public String[] getOriginIsXactFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginIsXactFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOriginIsXactFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginIsXactFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginIsXactFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginIsXactFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OriginIsXactFilter filter value from a formatted string
   *
   * @param _value the OriginIsXactFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OriginIsXactFilter filter field
   */
  public void setOriginIsXactFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOriginIsXactFilterFromFormattedString");
    try {
      this.setOriginIsXactFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginIsXactFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginIsXactFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginIsXactFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeOriginFetch (boolean fetch) {
    this.CountryCodeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeOriginFetch () {
    return this.CountryCodeOriginFetch;
  }
  /** Set the SortOrder for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeOriginSortOrder (Integer value) {
    this.CountryCodeOriginSort = value;
  }
  /** Retrieve SortOrder for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeOriginSortOrder () {
    return this.CountryCodeOriginSort;
  }
  /** Set the sort direction for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeOriginSortDirection (boolean ascending) {
    this.CountryCodeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeOriginSortDirection () {
    return this.CountryCodeOriginSortAscending;
  }
  /** Set the field level filters for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.CountryCodeOrigin = value;
  }
  /** Retrieve filter for field: CountryCodeOrigin (CUSTOMER_CORRIDORS.country_code_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountryCodeOriginFilter () {
    return this.CountryCodeOrigin;
  }

  /**
   * Retrieves the CountryCodeOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountryCodeOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeOriginFilter field
   */
  public String[] getCountryCodeOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountryCodeOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountryCodeOriginFilter filter value from a formatted string
   *
   * @param _value the CountryCodeOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeOriginFilter filter field
   */
  public void setCountryCodeOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFilterFromFormattedString");
    try {
      this.setCountryCodeOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeOriginFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CountryCodeOriginFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeOriginFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeOriginFilter filter field
   */
  public String[] getCountryCodeOriginFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCountryCodeOriginFilter(), "CountryCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CountryCodeOriginFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeOriginFilter filter field
   */
  public void setCountryCodeOriginFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCountryCodeOriginFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CountryCodeOrigin", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeOriginFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTargetFetch (boolean fetch) {
    this.PointTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTargetFetch () {
    return this.PointTargetFetch;
  }
  /** Set the SortOrder for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTargetSortOrder (Integer value) {
    this.PointTargetSort = value;
  }
  /** Retrieve SortOrder for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTargetSortOrder () {
    return this.PointTargetSort;
  }
  /** Set the sort direction for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTargetSortDirection (boolean ascending) {
    this.PointTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTargetSortDirection () {
    return this.PointTargetSortAscending;
  }
  /** Set the case insensitive for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPointTargetCaseInsensitive (boolean ascending) {
    this.PointTargetCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPointTargetCaseInsensitive () {
    return this.PointTargetCaseInsensitive;
  }
  /** Set the field level filters for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTargetFilter (StringFilter[] value) throws ServiceException {
    this.PointTarget = value;
  }
  /** Retrieve filter for field: PointTarget (CUSTOMER_CORRIDORS.point_target)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPointTargetFilter () {
    return this.PointTarget;
  }

  /**
   * Retrieves the PointTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTargetFilter field
   */
  public String[] getPointTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTargetFilter filter value from a formatted string
   *
   * @param _value the PointTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTargetFilter filter field
   */
  public void setPointTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTargetFilterFromFormattedString");
    try {
      this.setPointTargetFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTargetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @param fetch whether to fetch this field or not
   */
  public void setTargetIsXactFetch (boolean fetch) {
    this.TargetIsXactFetch = fetch;
  }
  /** Retrieve Fetch value for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @return boolean the Fetch value for this field
   */
  public boolean getTargetIsXactFetch () {
    return this.TargetIsXactFetch;
  }
  /** Set the SortOrder for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTargetIsXactSortOrder (Integer value) {
    this.TargetIsXactSort = value;
  }
  /** Retrieve SortOrder for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTargetIsXactSortOrder () {
    return this.TargetIsXactSort;
  }
  /** Set the sort direction for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTargetIsXactSortDirection (boolean ascending) {
    this.TargetIsXactSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTargetIsXactSortDirection () {
    return this.TargetIsXactSortAscending;
  }
  /** Set the field level filters for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTargetIsXactFilter (BooleanFilter[] value) throws ServiceException {
    this.TargetIsXact = value;
  }
  /** Retrieve filter for field: TargetIsXact (CUSTOMER_CORRIDORS.target_is_xact)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getTargetIsXactFilter () {
    return this.TargetIsXact;
  }

  /**
   * Retrieves the TargetIsXactFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TargetIsXactFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetIsXactFilter field
   */
  public String[] getTargetIsXactFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetIsXactFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTargetIsXactFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetIsXactFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetIsXactFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetIsXactFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TargetIsXactFilter filter value from a formatted string
   *
   * @param _value the TargetIsXactFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TargetIsXactFilter filter field
   */
  public void setTargetIsXactFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTargetIsXactFilterFromFormattedString");
    try {
      this.setTargetIsXactFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetIsXactFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetIsXactFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetIsXactFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeTargetFetch (boolean fetch) {
    this.CountryCodeTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeTargetFetch () {
    return this.CountryCodeTargetFetch;
  }
  /** Set the SortOrder for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeTargetSortOrder (Integer value) {
    this.CountryCodeTargetSort = value;
  }
  /** Retrieve SortOrder for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeTargetSortOrder () {
    return this.CountryCodeTargetSort;
  }
  /** Set the sort direction for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeTargetSortDirection (boolean ascending) {
    this.CountryCodeTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeTargetSortDirection () {
    return this.CountryCodeTargetSortAscending;
  }
  /** Set the field level filters for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeTargetFilter (IntegerFilter[] value) throws ServiceException {
    this.CountryCodeTarget = value;
  }
  /** Retrieve filter for field: CountryCodeTarget (CUSTOMER_CORRIDORS.country_code_target)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountryCodeTargetFilter () {
    return this.CountryCodeTarget;
  }

  /**
   * Retrieves the CountryCodeTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountryCodeTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeTargetFilter field
   */
  public String[] getCountryCodeTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountryCodeTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountryCodeTargetFilter filter value from a formatted string
   *
   * @param _value the CountryCodeTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeTargetFilter filter field
   */
  public void setCountryCodeTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFilterFromFormattedString");
    try {
      this.setCountryCodeTargetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeTargetFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CountryCodeTargetFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeTargetFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeTargetFilter filter field
   */
  public String[] getCountryCodeTargetFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCountryCodeTargetFilter(), "CountryCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CountryCodeTargetFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeTargetFilter filter field
   */
  public void setCountryCodeTargetFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCountryCodeTargetFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CountryCodeTarget", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeTargetFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCorridorPlanIdFetch (boolean fetch) {
    this.CorridorPlanIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCorridorPlanIdFetch () {
    return this.CorridorPlanIdFetch;
  }
  /** Set the SortOrder for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCorridorPlanIdSortOrder (Integer value) {
    this.CorridorPlanIdSort = value;
  }
  /** Retrieve SortOrder for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCorridorPlanIdSortOrder () {
    return this.CorridorPlanIdSort;
  }
  /** Set the sort direction for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCorridorPlanIdSortDirection (boolean ascending) {
    this.CorridorPlanIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCorridorPlanIdSortDirection () {
    return this.CorridorPlanIdSortAscending;
  }
  /** Set the field level filters for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCorridorPlanIdFilter (IntegerFilter[] value) throws ServiceException {
    this.CorridorPlanId = value;
  }
  /** Retrieve filter for field: CorridorPlanId (CUSTOMER_CORRIDORS.corridor_plan_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCorridorPlanIdFilter () {
    return this.CorridorPlanId;
  }

  /**
   * Retrieves the CorridorPlanIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CorridorPlanIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorPlanIdFilter field
   */
  public String[] getCorridorPlanIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCorridorPlanIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CorridorPlanIdFilter filter value from a formatted string
   *
   * @param _value the CorridorPlanIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorPlanIdFilter filter field
   */
  public void setCorridorPlanIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
    try {
      this.setCorridorPlanIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CorridorPlanIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CorridorPlanIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CorridorPlanIdFilter filter field
   */
  public String[] getCorridorPlanIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCorridorPlanIdFilter(), "CorridorPlan", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CorridorPlanIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorPlanIdFilter filter field
   */
  public void setCorridorPlanIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCorridorPlanIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CorridorPlanId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (CUSTOMER_CORRIDORS.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDtFilter () {
    return this.ActiveDt;
  }

  /**
   * Retrieves the ActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDtFilter field
   */
  public String[] getActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDtFilter filter value from a formatted string
   *
   * @param _value the ActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDtFilter filter field
   */
  public void setActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFilterFromFormattedString");
    try {
      this.setActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDtFilter field
   */
  public String[] getActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDtFilter filter value from a formatted string
   *
   * @param _value the ActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDtFilter filter field
   */
  public void setActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (CUSTOMER_CORRIDORS.inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDtFilter () {
    return this.InactiveDt;
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (CUSTOMER_CORRIDORS.create_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCreateDtFilter () {
    return this.CreateDt;
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedString");
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (CUSTOMER_CORRIDORS.chg_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDtFilter () {
    return this.ChgDt;
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (CUSTOMER_CORRIDORS.chg_who)
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

  /** Set the field level Fetch value for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setAccessRegionOriginFetch (boolean fetch) {
    this.AccessRegionOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccessRegionOriginFetch () {
    return this.AccessRegionOriginFetch;
  }
  /** Set the SortOrder for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccessRegionOriginSortOrder (Integer value) {
    this.AccessRegionOriginSort = value;
  }
  /** Retrieve SortOrder for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccessRegionOriginSortOrder () {
    return this.AccessRegionOriginSort;
  }
  /** Set the sort direction for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccessRegionOriginSortDirection (boolean ascending) {
    this.AccessRegionOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccessRegionOriginSortDirection () {
    return this.AccessRegionOriginSortAscending;
  }
  /** Set the case insensitive for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccessRegionOriginCaseInsensitive (boolean ascending) {
    this.AccessRegionOriginCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccessRegionOriginCaseInsensitive () {
    return this.AccessRegionOriginCaseInsensitive;
  }
  /** Set the field level filters for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccessRegionOriginFilter (StringFilter[] value) throws ServiceException {
    this.AccessRegionOrigin = value;
  }
  /** Retrieve filter for field: AccessRegionOrigin (CUSTOMER_CORRIDORS.access_region_origin)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccessRegionOriginFilter () {
    return this.AccessRegionOrigin;
  }

  /**
   * Retrieves the AccessRegionOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccessRegionOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionOriginFilter field
   */
  public String[] getAccessRegionOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccessRegionOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccessRegionOriginFilter filter value from a formatted string
   *
   * @param _value the AccessRegionOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccessRegionOriginFilter filter field
   */
  public void setAccessRegionOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionOriginFilterFromFormattedString");
    try {
      this.setAccessRegionOriginFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionOriginFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccessRegionOriginFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccessRegionOriginFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccessRegionOriginFilter filter field
   */
  public String[] getAccessRegionOriginFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccessRegionOriginFilter(), "AccessRegion", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionOriginFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionOriginFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccessRegionOriginFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccessRegionOriginFilter filter field
   */
  public void setAccessRegionOriginFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionOriginFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccessRegionOriginFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccessRegionOrigin", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionOriginFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionOriginFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @param fetch whether to fetch this field or not
   */
  public void setAccessRegionTargetFetch (boolean fetch) {
    this.AccessRegionTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccessRegionTargetFetch () {
    return this.AccessRegionTargetFetch;
  }
  /** Set the SortOrder for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccessRegionTargetSortOrder (Integer value) {
    this.AccessRegionTargetSort = value;
  }
  /** Retrieve SortOrder for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccessRegionTargetSortOrder () {
    return this.AccessRegionTargetSort;
  }
  /** Set the sort direction for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccessRegionTargetSortDirection (boolean ascending) {
    this.AccessRegionTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccessRegionTargetSortDirection () {
    return this.AccessRegionTargetSortAscending;
  }
  /** Set the case insensitive for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccessRegionTargetCaseInsensitive (boolean ascending) {
    this.AccessRegionTargetCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccessRegionTargetCaseInsensitive () {
    return this.AccessRegionTargetCaseInsensitive;
  }
  /** Set the field level filters for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccessRegionTargetFilter (StringFilter[] value) throws ServiceException {
    this.AccessRegionTarget = value;
  }
  /** Retrieve filter for field: AccessRegionTarget (CUSTOMER_CORRIDORS.access_region_target)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccessRegionTargetFilter () {
    return this.AccessRegionTarget;
  }

  /**
   * Retrieves the AccessRegionTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccessRegionTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionTargetFilter field
   */
  public String[] getAccessRegionTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccessRegionTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccessRegionTargetFilter filter value from a formatted string
   *
   * @param _value the AccessRegionTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccessRegionTargetFilter filter field
   */
  public void setAccessRegionTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionTargetFilterFromFormattedString");
    try {
      this.setAccessRegionTargetFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionTargetFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccessRegionTargetFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccessRegionTargetFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccessRegionTargetFilter filter field
   */
  public String[] getAccessRegionTargetFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccessRegionTargetFilter(), "AccessRegion", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionTargetFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionTargetFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccessRegionTargetFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccessRegionTargetFilter filter field
   */
  public void setAccessRegionTargetFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionTargetFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccessRegionTargetFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccessRegionTarget", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionTargetFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionTargetFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setOwningAccountInternalIdFetch (boolean fetch) {
    this.OwningAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwningAccountInternalIdFetch () {
    return this.OwningAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwningAccountInternalIdSortOrder (Integer value) {
    this.OwningAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwningAccountInternalIdSortOrder () {
    return this.OwningAccountInternalIdSort;
  }
  /** Set the sort direction for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwningAccountInternalIdSortDirection (boolean ascending) {
    this.OwningAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwningAccountInternalIdSortDirection () {
    return this.OwningAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwningAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OwningAccountInternalId = value;
  }
  /** Retrieve filter for field: OwningAccountInternalId (CUSTOMER_CORRIDORS.owning_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOwningAccountInternalIdFilter () {
    return this.OwningAccountInternalId;
  }

  /**
   * Retrieves the OwningAccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwningAccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningAccountInternalIdFilter field
   */
  public String[] getOwningAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwningAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwningAccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the OwningAccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwningAccountInternalIdFilter filter field
   */
  public void setOwningAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningAccountInternalIdFilterFromFormattedString");
    try {
      this.setOwningAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @param fetch whether to fetch this field or not
   */
  public void setPointCategoryFetch (boolean fetch) {
    this.PointCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointCategoryFetch () {
    return this.PointCategoryFetch;
  }
  /** Set the SortOrder for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointCategorySortOrder (Integer value) {
    this.PointCategorySort = value;
  }
  /** Retrieve SortOrder for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointCategorySortOrder () {
    return this.PointCategorySort;
  }
  /** Set the sort direction for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointCategorySortDirection (boolean ascending) {
    this.PointCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointCategorySortDirection () {
    return this.PointCategorySortAscending;
  }
  /** Set the field level filters for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.PointCategory = value;
  }
  /** Retrieve filter for field: PointCategory (CUSTOMER_CORRIDORS.point_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointCategoryFilter () {
    return this.PointCategory;
  }

  /**
   * Retrieves the PointCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointCategoryFilter field
   */
  public String[] getPointCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointCategoryFilter filter value from a formatted string
   *
   * @param _value the PointCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointCategoryFilter filter field
   */
  public void setPointCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointCategoryFilterFromFormattedString");
    try {
      this.setPointCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointCategoryFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PointCategoryFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PointCategoryFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointCategoryFilter filter field
   */
  public String[] getPointCategoryFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPointCategoryFilter(), "PointCategory", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointCategoryFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointCategoryFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PointCategoryFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PointCategoryFilter filter field
   */
  public void setPointCategoryFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointCategoryFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPointCategoryFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PointCategory", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointCategoryFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointCategoryFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (CUSTOMER_CORRIDORS.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter () {
    return this.ServiceInternalId;
  }

  /**
   * Retrieves the ServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdFilter field
   */
  public String[] getServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdFilter filter field
   */
  public void setServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
    try {
      this.setServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (CUSTOMER_CORRIDORS.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter () {
    return this.ServiceInternalIdResets;
  }

  /**
   * Retrieves the ServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResetsFilter field
   */
  public String[] getServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdResetsFilter filter field
   */
  public void setServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevEndDtFetch (boolean fetch) {
    this.PrevEndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevEndDtFetch () {
    return this.PrevEndDtFetch;
  }
  /** Set the SortOrder for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevEndDtSortOrder (Integer value) {
    this.PrevEndDtSort = value;
  }
  /** Retrieve SortOrder for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevEndDtSortOrder () {
    return this.PrevEndDtSort;
  }
  /** Set the sort direction for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevEndDtSortDirection (boolean ascending) {
    this.PrevEndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevEndDtSortDirection () {
    return this.PrevEndDtSortAscending;
  }
  /** Set the field level filters for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevEndDtFilter (DateFilter[] value) throws ServiceException {
    this.PrevEndDt = value;
  }
  /** Retrieve filter for field: PrevEndDt (CUSTOMER_CORRIDORS.prev_end_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrevEndDtFilter () {
    return this.PrevEndDt;
  }

  /**
   * Retrieves the PrevEndDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEndDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDtFilter field
   */
  public String[] getPrevEndDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevEndDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEndDtFilter filter value from a formatted string
   *
   * @param _value the PrevEndDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevEndDtFilter filter field
   */
  public void setPrevEndDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEndDtFilterFromFormattedString");
    try {
      this.setPrevEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEndDtFilterFromFormattedString");
  }

  /**
   * Retrieves the PrevEndDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEndDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDtFilter field
   */
  public String[] getPrevEndDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevEndDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEndDtFilter filter value from a formatted string
   *
   * @param _value the PrevEndDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevEndDtFilter filter field
   */
  public void setPrevEndDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEndDtFilterFromFormattedDateTimeString");
    try {
      this.setPrevEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEndDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOwningAccountExternalIdFetch (boolean fetch) {
    this.OwningAccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwningAccountExternalIdFetch () {
    return this.OwningAccountExternalIdFetch;
  }
  /** Set the SortOrder for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwningAccountExternalIdSortOrder (Integer value) {
    this.OwningAccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwningAccountExternalIdSortOrder () {
    return this.OwningAccountExternalIdSort;
  }
  /** Set the sort direction for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwningAccountExternalIdSortDirection (boolean ascending) {
    this.OwningAccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwningAccountExternalIdSortDirection () {
    return this.OwningAccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOwningAccountExternalIdCaseInsensitive (boolean ascending) {
    this.OwningAccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOwningAccountExternalIdCaseInsensitive () {
    return this.OwningAccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwningAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.OwningAccountExternalId = value;
  }
  /** Retrieve filter for field: OwningAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOwningAccountExternalIdFilter () {
    return this.OwningAccountExternalId;
  }

  /**
   * Retrieves the OwningAccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwningAccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningAccountExternalIdFilter field
   */
  public String[] getOwningAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwningAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwningAccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the OwningAccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwningAccountExternalIdFilter filter field
   */
  public void setOwningAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningAccountExternalIdFilterFromFormattedString");
    try {
      this.setOwningAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setOwningAccountExternalIdTypeFetch (boolean fetch) {
    this.OwningAccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwningAccountExternalIdTypeFetch () {
    return this.OwningAccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwningAccountExternalIdTypeSortOrder (Integer value) {
    this.OwningAccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwningAccountExternalIdTypeSortOrder () {
    return this.OwningAccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwningAccountExternalIdTypeSortDirection (boolean ascending) {
    this.OwningAccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwningAccountExternalIdTypeSortDirection () {
    return this.OwningAccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwningAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.OwningAccountExternalIdType = value;
  }
  /** Retrieve filter for field: OwningAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOwningAccountExternalIdTypeFilter () {
    return this.OwningAccountExternalIdType;
  }

  /**
   * Retrieves the OwningAccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwningAccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningAccountExternalIdTypeFilter field
   */
  public String[] getOwningAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwningAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwningAccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the OwningAccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwningAccountExternalIdTypeFilter filter field
   */
  public void setOwningAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setOwningAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated OwningAccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OwningAccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OwningAccountExternalIdTypeFilter filter field
   */
  public String[] getOwningAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getOwningAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated OwningAccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the OwningAccountExternalIdTypeFilter filter field
   */
  public void setOwningAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setOwningAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "OwningAccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountExternalIdTypeFilterFromDisplayValue");
  }


  public String toString() {
    return CorridorObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CorridorObjectHelper.toMap(this, null);
  }
}
