/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityResourceObjectFilter.java
 * Definition File: Admin/SecurityResource.xml
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
public class SecurityResourceObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public SecurityResourceObjectKeyFilter Key = null;
  /** raw field for: SEC_FX_RESOURCE.res_name) */
  public    StringFilter[] ResName  = null;
  protected boolean ResNameFetch = false;
  protected boolean ResNameSortAscending = true;
  protected boolean ResNameCaseInsensitive = false;
  protected Integer ResNameSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_sub_id) */
  public    BigIntegerFilter[] ResSubId  = null;
  protected boolean ResSubIdFetch = false;
  protected boolean ResSubIdSortAscending = true;
  protected Integer ResSubIdSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_rty_id) */
  public    BigIntegerFilter[] ResRtyId  = null;
  protected boolean ResRtyIdFetch = false;
  protected boolean ResRtyIdSortAscending = true;
  protected Integer ResRtyIdSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_mr_id) */
  public    BigIntegerFilter[] ResMrId  = null;
  protected boolean ResMrIdFetch = false;
  protected boolean ResMrIdSortAscending = true;
  protected Integer ResMrIdSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_update_count) */
  public    BigIntegerFilter[] ResUpdateCount  = null;
  protected boolean ResUpdateCountFetch = false;
  protected boolean ResUpdateCountSortAscending = true;
  protected Integer ResUpdateCountSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_create_date) */
  public    DateFilter[] ResCreateDate  = null;
  protected boolean ResCreateDateFetch = false;
  protected boolean ResCreateDateSortAscending = true;
  protected Integer ResCreateDateSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_modify_date) */
  public    DateFilter[] ResModifyDate  = null;
  protected boolean ResModifyDateFetch = false;
  protected boolean ResModifyDateSortAscending = true;
  protected Integer ResModifyDateSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_modify_user) */
  public    StringFilter[] ResModifyUser  = null;
  protected boolean ResModifyUserFetch = false;
  protected boolean ResModifyUserSortAscending = true;
  protected boolean ResModifyUserCaseInsensitive = false;
  protected Integer ResModifyUserSort = null;
  /** raw field for: SEC_MASTER_RESOURCE.mr_id) */
  public    BigIntegerFilter[] MrId  = null;
  protected boolean MrIdFetch = false;
  protected boolean MrIdSortAscending = true;
  protected Integer MrIdSort = null;
  /** raw field for: SEC_MASTER_RESOURCE.mr_name) */
  public    StringFilter[] MrName  = null;
  protected boolean MrNameFetch = false;
  protected boolean MrNameSortAscending = true;
  protected boolean MrNameCaseInsensitive = false;
  protected Integer MrNameSort = null;
  /** raw field for: SEC_MASTER_RESOURCE.mr_canonical_name) */
  public    StringFilter[] MrCanonicalName  = null;
  protected boolean MrCanonicalNameFetch = false;
  protected boolean MrCanonicalNameSortAscending = true;
  protected boolean MrCanonicalNameCaseInsensitive = false;
  protected Integer MrCanonicalNameSort = null;
  /** raw field for: SEC_MASTER_RESOURCE.mr_resource_realm) */
  public    StringFilter[] MrResourceRealm  = null;
  protected boolean MrResourceRealmFetch = false;
  protected boolean MrResourceRealmSortAscending = true;
  protected boolean MrResourceRealmCaseInsensitive = false;
  protected Integer MrResourceRealmSort = null;
  /** raw field for: SEC_MASTER_RESOURCE.mr_resource_type) */
  public    StringFilter[] MrResourceType  = null;
  protected boolean MrResourceTypeFetch = false;
  protected boolean MrResourceTypeSortAscending = true;
  protected boolean MrResourceTypeCaseInsensitive = false;
  protected Integer MrResourceTypeSort = null;
  /** raw field for: SEC_MASTER_RESOURCE.mr_actions) */
  public    StringFilter[] MrActions  = null;
  protected boolean MrActionsFetch = false;
  protected boolean MrActionsSortAscending = true;
  protected boolean MrActionsCaseInsensitive = false;
  protected Integer MrActionsSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_id) */
  public    BigIntegerFilter[] SubId  = null;
  protected boolean SubIdFetch = false;
  protected boolean SubIdSortAscending = true;
  protected Integer SubIdSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_name) */
  public    StringFilter[] SubName  = null;
  protected boolean SubNameFetch = false;
  protected boolean SubNameSortAscending = true;
  protected boolean SubNameCaseInsensitive = false;
  protected Integer SubNameSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_rar_id) */
  public    BigIntegerFilter[] SubRarId  = null;
  protected boolean SubRarIdFetch = false;
  protected boolean SubRarIdSortAscending = true;
  protected Integer SubRarIdSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_parent_id) */
  public    BigIntegerFilter[] SubParentId  = null;
  protected boolean SubParentIdFetch = false;
  protected boolean SubParentIdSortAscending = true;
  protected Integer SubParentIdSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_update_count) */
  public    BigIntegerFilter[] SubUpdateCount  = null;
  protected boolean SubUpdateCountFetch = false;
  protected boolean SubUpdateCountSortAscending = true;
  protected Integer SubUpdateCountSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_create_date) */
  public    DateFilter[] SubCreateDate  = null;
  protected boolean SubCreateDateFetch = false;
  protected boolean SubCreateDateSortAscending = true;
  protected Integer SubCreateDateSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_modify_date) */
  public    DateFilter[] SubModifyDate  = null;
  protected boolean SubModifyDateFetch = false;
  protected boolean SubModifyDateSortAscending = true;
  protected Integer SubModifyDateSort = null;
  /** raw field for: SEC_SUB_SYSTEM.sub_modify_user) */
  public    StringFilter[] SubModifyUser  = null;
  protected boolean SubModifyUserFetch = false;
  protected boolean SubModifyUserSortAscending = true;
  protected boolean SubModifyUserCaseInsensitive = false;
  protected Integer SubModifyUserSort = null;
  /** raw field for: SEC_RESOURCE_TYPE.rty_id) */
  public    BigIntegerFilter[] RtyId  = null;
  protected boolean RtyIdFetch = false;
  protected boolean RtyIdSortAscending = true;
  protected Integer RtyIdSort = null;
  /** raw field for: SEC_RESOURCE_TYPE.rty_name) */
  public    StringFilter[] RtyName  = null;
  protected boolean RtyNameFetch = false;
  protected boolean RtyNameSortAscending = true;
  protected boolean RtyNameCaseInsensitive = false;
  protected Integer RtyNameSort = null;
  /** raw field for: SEC_RESOURCE_TYPE.rty_update_count) */
  public    BigIntegerFilter[] RtyUpdateCount  = null;
  protected boolean RtyUpdateCountFetch = false;
  protected boolean RtyUpdateCountSortAscending = true;
  protected Integer RtyUpdateCountSort = null;
  /** raw field for: SEC_RESOURCE_TYPE.rty_create_date) */
  public    DateFilter[] RtyCreateDate  = null;
  protected boolean RtyCreateDateFetch = false;
  protected boolean RtyCreateDateSortAscending = true;
  protected Integer RtyCreateDateSort = null;
  /** raw field for: SEC_RESOURCE_TYPE.rty_modify_date) */
  public    DateFilter[] RtyModifyDate  = null;
  protected boolean RtyModifyDateFetch = false;
  protected boolean RtyModifyDateSortAscending = true;
  protected Integer RtyModifyDateSort = null;
  /** raw field for: SEC_RESOURCE_TYPE.rty_modify_user) */
  public    StringFilter[] RtyModifyUser  = null;
  protected boolean RtyModifyUserFetch = false;
  protected boolean RtyModifyUserSortAscending = true;
  protected boolean RtyModifyUserCaseInsensitive = false;
  protected Integer RtyModifyUserSort = null;
  /** raw field for: SEC_RESOURCE_REALM.rar_id) */
  public    BigIntegerFilter[] RarId  = null;
  protected boolean RarIdFetch = false;
  protected boolean RarIdSortAscending = true;
  protected Integer RarIdSort = null;
  /** raw field for: SEC_RESOURCE_REALM.rar_name) */
  public    StringFilter[] RarName  = null;
  protected boolean RarNameFetch = false;
  protected boolean RarNameSortAscending = true;
  protected boolean RarNameCaseInsensitive = false;
  protected Integer RarNameSort = null;
  /** raw field for: SEC_RESOURCE_REALM.rar_update_count) */
  public    BigIntegerFilter[] RarUpdateCount  = null;
  protected boolean RarUpdateCountFetch = false;
  protected boolean RarUpdateCountSortAscending = true;
  protected Integer RarUpdateCountSort = null;
  /** raw field for: SEC_RESOURCE_REALM.rar_create_date) */
  public    DateFilter[] RarCreateDate  = null;
  protected boolean RarCreateDateFetch = false;
  protected boolean RarCreateDateSortAscending = true;
  protected Integer RarCreateDateSort = null;
  /** raw field for: SEC_RESOURCE_REALM.rar_modify_date) */
  public    DateFilter[] RarModifyDate  = null;
  protected boolean RarModifyDateFetch = false;
  protected boolean RarModifyDateSortAscending = true;
  protected Integer RarModifyDateSort = null;
  /** raw field for: SEC_RESOURCE_REALM.rar_modify_user) */
  public    StringFilter[] RarModifyUser  = null;
  protected boolean RarModifyUserFetch = false;
  protected boolean RarModifyUserSortAscending = true;
  protected boolean RarModifyUserCaseInsensitive = false;
  protected Integer RarModifyUserSort = null;
  private String _objName = "SecurityResourceObjectFilter";
  /** default constructor */
  public SecurityResourceObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public SecurityResourceObjectFilter (SecurityResourceObjectFilter other)
  {
    if (other == null) return;
    this.Key = new SecurityResourceObjectKeyFilter (other.Key);
    this.ResName = other.ResName;
    this.ResNameFetch = other.ResNameFetch;
    this.ResNameSort = other.ResNameSort;
    this.ResNameCaseInsensitive = other.ResNameCaseInsensitive;
    this.ResNameSortAscending = other.ResNameSortAscending;
    this.ResSubId = other.ResSubId;
    this.ResSubIdFetch = other.ResSubIdFetch;
    this.ResSubIdSort = other.ResSubIdSort;
    this.ResSubIdSortAscending = other.ResSubIdSortAscending;
    this.ResRtyId = other.ResRtyId;
    this.ResRtyIdFetch = other.ResRtyIdFetch;
    this.ResRtyIdSort = other.ResRtyIdSort;
    this.ResRtyIdSortAscending = other.ResRtyIdSortAscending;
    this.ResMrId = other.ResMrId;
    this.ResMrIdFetch = other.ResMrIdFetch;
    this.ResMrIdSort = other.ResMrIdSort;
    this.ResMrIdSortAscending = other.ResMrIdSortAscending;
    this.ResUpdateCount = other.ResUpdateCount;
    this.ResUpdateCountFetch = other.ResUpdateCountFetch;
    this.ResUpdateCountSort = other.ResUpdateCountSort;
    this.ResUpdateCountSortAscending = other.ResUpdateCountSortAscending;
    this.ResCreateDate = other.ResCreateDate;
    this.ResCreateDateFetch = other.ResCreateDateFetch;
    this.ResCreateDateSort = other.ResCreateDateSort;
    this.ResCreateDateSortAscending = other.ResCreateDateSortAscending;
    this.ResModifyDate = other.ResModifyDate;
    this.ResModifyDateFetch = other.ResModifyDateFetch;
    this.ResModifyDateSort = other.ResModifyDateSort;
    this.ResModifyDateSortAscending = other.ResModifyDateSortAscending;
    this.ResModifyUser = other.ResModifyUser;
    this.ResModifyUserFetch = other.ResModifyUserFetch;
    this.ResModifyUserSort = other.ResModifyUserSort;
    this.ResModifyUserCaseInsensitive = other.ResModifyUserCaseInsensitive;
    this.ResModifyUserSortAscending = other.ResModifyUserSortAscending;
    this.MrId = other.MrId;
    this.MrIdFetch = other.MrIdFetch;
    this.MrIdSort = other.MrIdSort;
    this.MrIdSortAscending = other.MrIdSortAscending;
    this.MrName = other.MrName;
    this.MrNameFetch = other.MrNameFetch;
    this.MrNameSort = other.MrNameSort;
    this.MrNameCaseInsensitive = other.MrNameCaseInsensitive;
    this.MrNameSortAscending = other.MrNameSortAscending;
    this.MrCanonicalName = other.MrCanonicalName;
    this.MrCanonicalNameFetch = other.MrCanonicalNameFetch;
    this.MrCanonicalNameSort = other.MrCanonicalNameSort;
    this.MrCanonicalNameCaseInsensitive = other.MrCanonicalNameCaseInsensitive;
    this.MrCanonicalNameSortAscending = other.MrCanonicalNameSortAscending;
    this.MrResourceRealm = other.MrResourceRealm;
    this.MrResourceRealmFetch = other.MrResourceRealmFetch;
    this.MrResourceRealmSort = other.MrResourceRealmSort;
    this.MrResourceRealmCaseInsensitive = other.MrResourceRealmCaseInsensitive;
    this.MrResourceRealmSortAscending = other.MrResourceRealmSortAscending;
    this.MrResourceType = other.MrResourceType;
    this.MrResourceTypeFetch = other.MrResourceTypeFetch;
    this.MrResourceTypeSort = other.MrResourceTypeSort;
    this.MrResourceTypeCaseInsensitive = other.MrResourceTypeCaseInsensitive;
    this.MrResourceTypeSortAscending = other.MrResourceTypeSortAscending;
    this.MrActions = other.MrActions;
    this.MrActionsFetch = other.MrActionsFetch;
    this.MrActionsSort = other.MrActionsSort;
    this.MrActionsCaseInsensitive = other.MrActionsCaseInsensitive;
    this.MrActionsSortAscending = other.MrActionsSortAscending;
    this.SubId = other.SubId;
    this.SubIdFetch = other.SubIdFetch;
    this.SubIdSort = other.SubIdSort;
    this.SubIdSortAscending = other.SubIdSortAscending;
    this.SubName = other.SubName;
    this.SubNameFetch = other.SubNameFetch;
    this.SubNameSort = other.SubNameSort;
    this.SubNameCaseInsensitive = other.SubNameCaseInsensitive;
    this.SubNameSortAscending = other.SubNameSortAscending;
    this.SubRarId = other.SubRarId;
    this.SubRarIdFetch = other.SubRarIdFetch;
    this.SubRarIdSort = other.SubRarIdSort;
    this.SubRarIdSortAscending = other.SubRarIdSortAscending;
    this.SubParentId = other.SubParentId;
    this.SubParentIdFetch = other.SubParentIdFetch;
    this.SubParentIdSort = other.SubParentIdSort;
    this.SubParentIdSortAscending = other.SubParentIdSortAscending;
    this.SubUpdateCount = other.SubUpdateCount;
    this.SubUpdateCountFetch = other.SubUpdateCountFetch;
    this.SubUpdateCountSort = other.SubUpdateCountSort;
    this.SubUpdateCountSortAscending = other.SubUpdateCountSortAscending;
    this.SubCreateDate = other.SubCreateDate;
    this.SubCreateDateFetch = other.SubCreateDateFetch;
    this.SubCreateDateSort = other.SubCreateDateSort;
    this.SubCreateDateSortAscending = other.SubCreateDateSortAscending;
    this.SubModifyDate = other.SubModifyDate;
    this.SubModifyDateFetch = other.SubModifyDateFetch;
    this.SubModifyDateSort = other.SubModifyDateSort;
    this.SubModifyDateSortAscending = other.SubModifyDateSortAscending;
    this.SubModifyUser = other.SubModifyUser;
    this.SubModifyUserFetch = other.SubModifyUserFetch;
    this.SubModifyUserSort = other.SubModifyUserSort;
    this.SubModifyUserCaseInsensitive = other.SubModifyUserCaseInsensitive;
    this.SubModifyUserSortAscending = other.SubModifyUserSortAscending;
    this.RtyId = other.RtyId;
    this.RtyIdFetch = other.RtyIdFetch;
    this.RtyIdSort = other.RtyIdSort;
    this.RtyIdSortAscending = other.RtyIdSortAscending;
    this.RtyName = other.RtyName;
    this.RtyNameFetch = other.RtyNameFetch;
    this.RtyNameSort = other.RtyNameSort;
    this.RtyNameCaseInsensitive = other.RtyNameCaseInsensitive;
    this.RtyNameSortAscending = other.RtyNameSortAscending;
    this.RtyUpdateCount = other.RtyUpdateCount;
    this.RtyUpdateCountFetch = other.RtyUpdateCountFetch;
    this.RtyUpdateCountSort = other.RtyUpdateCountSort;
    this.RtyUpdateCountSortAscending = other.RtyUpdateCountSortAscending;
    this.RtyCreateDate = other.RtyCreateDate;
    this.RtyCreateDateFetch = other.RtyCreateDateFetch;
    this.RtyCreateDateSort = other.RtyCreateDateSort;
    this.RtyCreateDateSortAscending = other.RtyCreateDateSortAscending;
    this.RtyModifyDate = other.RtyModifyDate;
    this.RtyModifyDateFetch = other.RtyModifyDateFetch;
    this.RtyModifyDateSort = other.RtyModifyDateSort;
    this.RtyModifyDateSortAscending = other.RtyModifyDateSortAscending;
    this.RtyModifyUser = other.RtyModifyUser;
    this.RtyModifyUserFetch = other.RtyModifyUserFetch;
    this.RtyModifyUserSort = other.RtyModifyUserSort;
    this.RtyModifyUserCaseInsensitive = other.RtyModifyUserCaseInsensitive;
    this.RtyModifyUserSortAscending = other.RtyModifyUserSortAscending;
    this.RarId = other.RarId;
    this.RarIdFetch = other.RarIdFetch;
    this.RarIdSort = other.RarIdSort;
    this.RarIdSortAscending = other.RarIdSortAscending;
    this.RarName = other.RarName;
    this.RarNameFetch = other.RarNameFetch;
    this.RarNameSort = other.RarNameSort;
    this.RarNameCaseInsensitive = other.RarNameCaseInsensitive;
    this.RarNameSortAscending = other.RarNameSortAscending;
    this.RarUpdateCount = other.RarUpdateCount;
    this.RarUpdateCountFetch = other.RarUpdateCountFetch;
    this.RarUpdateCountSort = other.RarUpdateCountSort;
    this.RarUpdateCountSortAscending = other.RarUpdateCountSortAscending;
    this.RarCreateDate = other.RarCreateDate;
    this.RarCreateDateFetch = other.RarCreateDateFetch;
    this.RarCreateDateSort = other.RarCreateDateSort;
    this.RarCreateDateSortAscending = other.RarCreateDateSortAscending;
    this.RarModifyDate = other.RarModifyDate;
    this.RarModifyDateFetch = other.RarModifyDateFetch;
    this.RarModifyDateSort = other.RarModifyDateSort;
    this.RarModifyDateSortAscending = other.RarModifyDateSortAscending;
    this.RarModifyUser = other.RarModifyUser;
    this.RarModifyUserFetch = other.RarModifyUserFetch;
    this.RarModifyUserSort = other.RarModifyUserSort;
    this.RarModifyUserCaseInsensitive = other.RarModifyUserCaseInsensitive;
    this.RarModifyUserSortAscending = other.RarModifyUserSortAscending;  }
  /** get the filter for this object's key
   * @return SecurityResourceObjectKeyFilter
   */
  public SecurityResourceObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (SecurityResourceObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ResId (SEC_FX_RESOURCE.res_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SecurityResourceObjectKeyFilter ();
    this.Key.ResIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ResIdFetch;
  }
  /** Set the SortOrder for field: ResId (SEC_FX_RESOURCE.res_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SecurityResourceObjectKeyFilter ();
    this.Key.ResIdSort = value;
  }
  /** Retrieve SortOrder for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ResIdSort;
  }
  /** Set the sort direction for field: ResId (SEC_FX_RESOURCE.res_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SecurityResourceObjectKeyFilter ();
    this.Key.ResIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ResIdSortAscending;
  }
  /** Set the field level filters for field: ResId (SEC_FX_RESOURCE.res_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SecurityResourceObjectKeyFilter ();
    this.Key.ResId = value;
  }
  /** Retrieve filter for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ResId;
  }
  /** Set the field level Fetch value for field: ResName (SEC_FX_RESOURCE.res_name)
   * @param fetch whether to fetch this field or not
   */
  public void setResNameFetch (boolean fetch) {
    this.ResNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getResNameFetch () {
    return this.ResNameFetch;
  }
  /** Set the SortOrder for field: ResName (SEC_FX_RESOURCE.res_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResNameSortOrder (Integer value) {
    this.ResNameSort = value;
  }
  /** Retrieve SortOrder for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResNameSortOrder () {
    return this.ResNameSort;
  }
  /** Set the sort direction for field: ResName (SEC_FX_RESOURCE.res_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResNameSortDirection (boolean ascending) {
    this.ResNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResNameSortDirection () {
    return this.ResNameSortAscending;
  }
  /** Set the case insensitive for field: ResName (SEC_FX_RESOURCE.res_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResNameCaseInsensitive (boolean ascending) {
    this.ResNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getResNameCaseInsensitive () {
    return this.ResNameCaseInsensitive;
  }
  /** Set the field level filters for field: ResName (SEC_FX_RESOURCE.res_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResNameFilter (StringFilter[] value) throws ServiceException {
    this.ResName = value;
  }
  /** Retrieve filter for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getResNameFilter () {
    return this.ResName;
  }

  /**
   * Retrieves the ResNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResNameFilter field
   */
  public String[] getResNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResNameFilter filter value from a formatted string
   *
   * @param _value the ResNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResNameFilter filter field
   */
  public void setResNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResNameFilterFromFormattedString");
    try {
      this.setResNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResSubIdFetch (boolean fetch) {
    this.ResSubIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResSubIdFetch () {
    return this.ResSubIdFetch;
  }
  /** Set the SortOrder for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResSubIdSortOrder (Integer value) {
    this.ResSubIdSort = value;
  }
  /** Retrieve SortOrder for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResSubIdSortOrder () {
    return this.ResSubIdSort;
  }
  /** Set the sort direction for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResSubIdSortDirection (boolean ascending) {
    this.ResSubIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResSubIdSortDirection () {
    return this.ResSubIdSortAscending;
  }
  /** Set the field level filters for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResSubIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResSubId = value;
  }
  /** Retrieve filter for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResSubIdFilter () {
    return this.ResSubId;
  }

  /**
   * Retrieves the ResSubIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResSubIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResSubIdFilter field
   */
  public String[] getResSubIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResSubIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResSubIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResSubIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResSubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResSubIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResSubIdFilter filter value from a formatted string
   *
   * @param _value the ResSubIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResSubIdFilter filter field
   */
  public void setResSubIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResSubIdFilterFromFormattedString");
    try {
      this.setResSubIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResSubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResSubIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResSubIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResRtyIdFetch (boolean fetch) {
    this.ResRtyIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResRtyIdFetch () {
    return this.ResRtyIdFetch;
  }
  /** Set the SortOrder for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResRtyIdSortOrder (Integer value) {
    this.ResRtyIdSort = value;
  }
  /** Retrieve SortOrder for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResRtyIdSortOrder () {
    return this.ResRtyIdSort;
  }
  /** Set the sort direction for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResRtyIdSortDirection (boolean ascending) {
    this.ResRtyIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResRtyIdSortDirection () {
    return this.ResRtyIdSortAscending;
  }
  /** Set the field level filters for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResRtyIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResRtyId = value;
  }
  /** Retrieve filter for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResRtyIdFilter () {
    return this.ResRtyId;
  }

  /**
   * Retrieves the ResRtyIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResRtyIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResRtyIdFilter field
   */
  public String[] getResRtyIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResRtyIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResRtyIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResRtyIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResRtyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResRtyIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResRtyIdFilter filter value from a formatted string
   *
   * @param _value the ResRtyIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResRtyIdFilter filter field
   */
  public void setResRtyIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResRtyIdFilterFromFormattedString");
    try {
      this.setResRtyIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResRtyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResRtyIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResRtyIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResMrIdFetch (boolean fetch) {
    this.ResMrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResMrIdFetch () {
    return this.ResMrIdFetch;
  }
  /** Set the SortOrder for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResMrIdSortOrder (Integer value) {
    this.ResMrIdSort = value;
  }
  /** Retrieve SortOrder for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResMrIdSortOrder () {
    return this.ResMrIdSort;
  }
  /** Set the sort direction for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResMrIdSortDirection (boolean ascending) {
    this.ResMrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResMrIdSortDirection () {
    return this.ResMrIdSortAscending;
  }
  /** Set the field level filters for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResMrIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResMrId = value;
  }
  /** Retrieve filter for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResMrIdFilter () {
    return this.ResMrId;
  }

  /**
   * Retrieves the ResMrIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResMrIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResMrIdFilter field
   */
  public String[] getResMrIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResMrIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResMrIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResMrIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResMrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResMrIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResMrIdFilter filter value from a formatted string
   *
   * @param _value the ResMrIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResMrIdFilter filter field
   */
  public void setResMrIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResMrIdFilterFromFormattedString");
    try {
      this.setResMrIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResMrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResMrIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResMrIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @param fetch whether to fetch this field or not
   */
  public void setResUpdateCountFetch (boolean fetch) {
    this.ResUpdateCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getResUpdateCountFetch () {
    return this.ResUpdateCountFetch;
  }
  /** Set the SortOrder for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResUpdateCountSortOrder (Integer value) {
    this.ResUpdateCountSort = value;
  }
  /** Retrieve SortOrder for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResUpdateCountSortOrder () {
    return this.ResUpdateCountSort;
  }
  /** Set the sort direction for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResUpdateCountSortDirection (boolean ascending) {
    this.ResUpdateCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResUpdateCountSortDirection () {
    return this.ResUpdateCountSortAscending;
  }
  /** Set the field level filters for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResUpdateCountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResUpdateCount = value;
  }
  /** Retrieve filter for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResUpdateCountFilter () {
    return this.ResUpdateCount;
  }

  /**
   * Retrieves the ResUpdateCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResUpdateCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResUpdateCountFilter field
   */
  public String[] getResUpdateCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResUpdateCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResUpdateCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResUpdateCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResUpdateCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResUpdateCountFilter filter value from a formatted string
   *
   * @param _value the ResUpdateCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResUpdateCountFilter filter field
   */
  public void setResUpdateCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResUpdateCountFilterFromFormattedString");
    try {
      this.setResUpdateCountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResUpdateCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResUpdateCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @param fetch whether to fetch this field or not
   */
  public void setResCreateDateFetch (boolean fetch) {
    this.ResCreateDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getResCreateDateFetch () {
    return this.ResCreateDateFetch;
  }
  /** Set the SortOrder for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResCreateDateSortOrder (Integer value) {
    this.ResCreateDateSort = value;
  }
  /** Retrieve SortOrder for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResCreateDateSortOrder () {
    return this.ResCreateDateSort;
  }
  /** Set the sort direction for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResCreateDateSortDirection (boolean ascending) {
    this.ResCreateDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResCreateDateSortDirection () {
    return this.ResCreateDateSortAscending;
  }
  /** Set the field level filters for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResCreateDateFilter (DateFilter[] value) throws ServiceException {
    this.ResCreateDate = value;
  }
  /** Retrieve filter for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getResCreateDateFilter () {
    return this.ResCreateDate;
  }

  /**
   * Retrieves the ResCreateDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResCreateDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResCreateDateFilter field
   */
  public String[] getResCreateDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResCreateDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResCreateDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResCreateDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResCreateDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResCreateDateFilter filter value from a formatted string
   *
   * @param _value the ResCreateDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResCreateDateFilter filter field
   */
  public void setResCreateDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResCreateDateFilterFromFormattedString");
    try {
      this.setResCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResCreateDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResCreateDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ResCreateDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResCreateDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResCreateDateFilter field
   */
  public String[] getResCreateDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResCreateDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResCreateDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResCreateDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResCreateDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ResCreateDateFilter filter value from a formatted string
   *
   * @param _value the ResCreateDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResCreateDateFilter filter field
   */
  public void setResCreateDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResCreateDateFilterFromFormattedDateTimeString");
    try {
      this.setResCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResCreateDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResCreateDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @param fetch whether to fetch this field or not
   */
  public void setResModifyDateFetch (boolean fetch) {
    this.ResModifyDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getResModifyDateFetch () {
    return this.ResModifyDateFetch;
  }
  /** Set the SortOrder for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResModifyDateSortOrder (Integer value) {
    this.ResModifyDateSort = value;
  }
  /** Retrieve SortOrder for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResModifyDateSortOrder () {
    return this.ResModifyDateSort;
  }
  /** Set the sort direction for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResModifyDateSortDirection (boolean ascending) {
    this.ResModifyDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResModifyDateSortDirection () {
    return this.ResModifyDateSortAscending;
  }
  /** Set the field level filters for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResModifyDateFilter (DateFilter[] value) throws ServiceException {
    this.ResModifyDate = value;
  }
  /** Retrieve filter for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getResModifyDateFilter () {
    return this.ResModifyDate;
  }

  /**
   * Retrieves the ResModifyDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResModifyDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyDateFilter field
   */
  public String[] getResModifyDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResModifyDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResModifyDateFilter filter value from a formatted string
   *
   * @param _value the ResModifyDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResModifyDateFilter filter field
   */
  public void setResModifyDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResModifyDateFilterFromFormattedString");
    try {
      this.setResModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ResModifyDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResModifyDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyDateFilter field
   */
  public String[] getResModifyDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResModifyDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ResModifyDateFilter filter value from a formatted string
   *
   * @param _value the ResModifyDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResModifyDateFilter filter field
   */
  public void setResModifyDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResModifyDateFilterFromFormattedDateTimeString");
    try {
      this.setResModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @param fetch whether to fetch this field or not
   */
  public void setResModifyUserFetch (boolean fetch) {
    this.ResModifyUserFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return boolean the Fetch value for this field
   */
  public boolean getResModifyUserFetch () {
    return this.ResModifyUserFetch;
  }
  /** Set the SortOrder for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResModifyUserSortOrder (Integer value) {
    this.ResModifyUserSort = value;
  }
  /** Retrieve SortOrder for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResModifyUserSortOrder () {
    return this.ResModifyUserSort;
  }
  /** Set the sort direction for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResModifyUserSortDirection (boolean ascending) {
    this.ResModifyUserSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResModifyUserSortDirection () {
    return this.ResModifyUserSortAscending;
  }
  /** Set the case insensitive for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResModifyUserCaseInsensitive (boolean ascending) {
    this.ResModifyUserCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getResModifyUserCaseInsensitive () {
    return this.ResModifyUserCaseInsensitive;
  }
  /** Set the field level filters for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResModifyUserFilter (StringFilter[] value) throws ServiceException {
    this.ResModifyUser = value;
  }
  /** Retrieve filter for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getResModifyUserFilter () {
    return this.ResModifyUser;
  }

  /**
   * Retrieves the ResModifyUserFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResModifyUserFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyUserFilter field
   */
  public String[] getResModifyUserFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyUserFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResModifyUserFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyUserFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyUserFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResModifyUserFilter filter value from a formatted string
   *
   * @param _value the ResModifyUserFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResModifyUserFilter filter field
   */
  public void setResModifyUserFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResModifyUserFilterFromFormattedString");
    try {
      this.setResModifyUserFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyUserFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyUserFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMrIdFetch (boolean fetch) {
    this.MrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMrIdFetch () {
    return this.MrIdFetch;
  }
  /** Set the SortOrder for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMrIdSortOrder (Integer value) {
    this.MrIdSort = value;
  }
  /** Retrieve SortOrder for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMrIdSortOrder () {
    return this.MrIdSort;
  }
  /** Set the sort direction for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMrIdSortDirection (boolean ascending) {
    this.MrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMrIdSortDirection () {
    return this.MrIdSortAscending;
  }
  /** Set the field level filters for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMrIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MrId = value;
  }
  /** Retrieve filter for field: MrId (SEC_MASTER_RESOURCE.mr_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMrIdFilter () {
    return this.MrId;
  }

  /**
   * Retrieves the MrIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MrIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrIdFilter field
   */
  public String[] getMrIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMrIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MrIdFilter filter value from a formatted string
   *
   * @param _value the MrIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MrIdFilter filter field
   */
  public void setMrIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMrIdFilterFromFormattedString");
    try {
      this.setMrIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @param fetch whether to fetch this field or not
   */
  public void setMrNameFetch (boolean fetch) {
    this.MrNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getMrNameFetch () {
    return this.MrNameFetch;
  }
  /** Set the SortOrder for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMrNameSortOrder (Integer value) {
    this.MrNameSort = value;
  }
  /** Retrieve SortOrder for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMrNameSortOrder () {
    return this.MrNameSort;
  }
  /** Set the sort direction for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMrNameSortDirection (boolean ascending) {
    this.MrNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMrNameSortDirection () {
    return this.MrNameSortAscending;
  }
  /** Set the case insensitive for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMrNameCaseInsensitive (boolean ascending) {
    this.MrNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMrNameCaseInsensitive () {
    return this.MrNameCaseInsensitive;
  }
  /** Set the field level filters for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMrNameFilter (StringFilter[] value) throws ServiceException {
    this.MrName = value;
  }
  /** Retrieve filter for field: MrName (SEC_MASTER_RESOURCE.mr_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMrNameFilter () {
    return this.MrName;
  }

  /**
   * Retrieves the MrNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MrNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrNameFilter field
   */
  public String[] getMrNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMrNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MrNameFilter filter value from a formatted string
   *
   * @param _value the MrNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MrNameFilter filter field
   */
  public void setMrNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMrNameFilterFromFormattedString");
    try {
      this.setMrNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @param fetch whether to fetch this field or not
   */
  public void setMrCanonicalNameFetch (boolean fetch) {
    this.MrCanonicalNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getMrCanonicalNameFetch () {
    return this.MrCanonicalNameFetch;
  }
  /** Set the SortOrder for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMrCanonicalNameSortOrder (Integer value) {
    this.MrCanonicalNameSort = value;
  }
  /** Retrieve SortOrder for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMrCanonicalNameSortOrder () {
    return this.MrCanonicalNameSort;
  }
  /** Set the sort direction for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMrCanonicalNameSortDirection (boolean ascending) {
    this.MrCanonicalNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMrCanonicalNameSortDirection () {
    return this.MrCanonicalNameSortAscending;
  }
  /** Set the case insensitive for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMrCanonicalNameCaseInsensitive (boolean ascending) {
    this.MrCanonicalNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMrCanonicalNameCaseInsensitive () {
    return this.MrCanonicalNameCaseInsensitive;
  }
  /** Set the field level filters for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMrCanonicalNameFilter (StringFilter[] value) throws ServiceException {
    this.MrCanonicalName = value;
  }
  /** Retrieve filter for field: MrCanonicalName (SEC_MASTER_RESOURCE.mr_canonical_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMrCanonicalNameFilter () {
    return this.MrCanonicalName;
  }

  /**
   * Retrieves the MrCanonicalNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MrCanonicalNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrCanonicalNameFilter field
   */
  public String[] getMrCanonicalNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrCanonicalNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMrCanonicalNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrCanonicalNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrCanonicalNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrCanonicalNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MrCanonicalNameFilter filter value from a formatted string
   *
   * @param _value the MrCanonicalNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MrCanonicalNameFilter filter field
   */
  public void setMrCanonicalNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMrCanonicalNameFilterFromFormattedString");
    try {
      this.setMrCanonicalNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrCanonicalNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrCanonicalNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrCanonicalNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @param fetch whether to fetch this field or not
   */
  public void setMrResourceRealmFetch (boolean fetch) {
    this.MrResourceRealmFetch = fetch;
  }
  /** Retrieve Fetch value for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @return boolean the Fetch value for this field
   */
  public boolean getMrResourceRealmFetch () {
    return this.MrResourceRealmFetch;
  }
  /** Set the SortOrder for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMrResourceRealmSortOrder (Integer value) {
    this.MrResourceRealmSort = value;
  }
  /** Retrieve SortOrder for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMrResourceRealmSortOrder () {
    return this.MrResourceRealmSort;
  }
  /** Set the sort direction for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMrResourceRealmSortDirection (boolean ascending) {
    this.MrResourceRealmSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMrResourceRealmSortDirection () {
    return this.MrResourceRealmSortAscending;
  }
  /** Set the case insensitive for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMrResourceRealmCaseInsensitive (boolean ascending) {
    this.MrResourceRealmCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMrResourceRealmCaseInsensitive () {
    return this.MrResourceRealmCaseInsensitive;
  }
  /** Set the field level filters for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMrResourceRealmFilter (StringFilter[] value) throws ServiceException {
    this.MrResourceRealm = value;
  }
  /** Retrieve filter for field: MrResourceRealm (SEC_MASTER_RESOURCE.mr_resource_realm)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMrResourceRealmFilter () {
    return this.MrResourceRealm;
  }

  /**
   * Retrieves the MrResourceRealmFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MrResourceRealmFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrResourceRealmFilter field
   */
  public String[] getMrResourceRealmFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrResourceRealmFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMrResourceRealmFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrResourceRealmFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrResourceRealmFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrResourceRealmFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MrResourceRealmFilter filter value from a formatted string
   *
   * @param _value the MrResourceRealmFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MrResourceRealmFilter filter field
   */
  public void setMrResourceRealmFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMrResourceRealmFilterFromFormattedString");
    try {
      this.setMrResourceRealmFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrResourceRealmFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrResourceRealmFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrResourceRealmFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @param fetch whether to fetch this field or not
   */
  public void setMrResourceTypeFetch (boolean fetch) {
    this.MrResourceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getMrResourceTypeFetch () {
    return this.MrResourceTypeFetch;
  }
  /** Set the SortOrder for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMrResourceTypeSortOrder (Integer value) {
    this.MrResourceTypeSort = value;
  }
  /** Retrieve SortOrder for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMrResourceTypeSortOrder () {
    return this.MrResourceTypeSort;
  }
  /** Set the sort direction for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMrResourceTypeSortDirection (boolean ascending) {
    this.MrResourceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMrResourceTypeSortDirection () {
    return this.MrResourceTypeSortAscending;
  }
  /** Set the case insensitive for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMrResourceTypeCaseInsensitive (boolean ascending) {
    this.MrResourceTypeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMrResourceTypeCaseInsensitive () {
    return this.MrResourceTypeCaseInsensitive;
  }
  /** Set the field level filters for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMrResourceTypeFilter (StringFilter[] value) throws ServiceException {
    this.MrResourceType = value;
  }
  /** Retrieve filter for field: MrResourceType (SEC_MASTER_RESOURCE.mr_resource_type)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMrResourceTypeFilter () {
    return this.MrResourceType;
  }

  /**
   * Retrieves the MrResourceTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MrResourceTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrResourceTypeFilter field
   */
  public String[] getMrResourceTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrResourceTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMrResourceTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrResourceTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrResourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrResourceTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MrResourceTypeFilter filter value from a formatted string
   *
   * @param _value the MrResourceTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MrResourceTypeFilter filter field
   */
  public void setMrResourceTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMrResourceTypeFilterFromFormattedString");
    try {
      this.setMrResourceTypeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrResourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrResourceTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrResourceTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @param fetch whether to fetch this field or not
   */
  public void setMrActionsFetch (boolean fetch) {
    this.MrActionsFetch = fetch;
  }
  /** Retrieve Fetch value for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @return boolean the Fetch value for this field
   */
  public boolean getMrActionsFetch () {
    return this.MrActionsFetch;
  }
  /** Set the SortOrder for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMrActionsSortOrder (Integer value) {
    this.MrActionsSort = value;
  }
  /** Retrieve SortOrder for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMrActionsSortOrder () {
    return this.MrActionsSort;
  }
  /** Set the sort direction for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMrActionsSortDirection (boolean ascending) {
    this.MrActionsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMrActionsSortDirection () {
    return this.MrActionsSortAscending;
  }
  /** Set the case insensitive for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMrActionsCaseInsensitive (boolean ascending) {
    this.MrActionsCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMrActionsCaseInsensitive () {
    return this.MrActionsCaseInsensitive;
  }
  /** Set the field level filters for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMrActionsFilter (StringFilter[] value) throws ServiceException {
    this.MrActions = value;
  }
  /** Retrieve filter for field: MrActions (SEC_MASTER_RESOURCE.mr_actions)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMrActionsFilter () {
    return this.MrActions;
  }

  /**
   * Retrieves the MrActionsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MrActionsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MrActionsFilter field
   */
  public String[] getMrActionsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMrActionsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMrActionsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMrActionsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrActionsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMrActionsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MrActionsFilter filter value from a formatted string
   *
   * @param _value the MrActionsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MrActionsFilter filter field
   */
  public void setMrActionsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMrActionsFilterFromFormattedString");
    try {
      this.setMrActionsFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MrActionsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMrActionsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMrActionsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSubIdFetch (boolean fetch) {
    this.SubIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubIdFetch () {
    return this.SubIdFetch;
  }
  /** Set the SortOrder for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubIdSortOrder (Integer value) {
    this.SubIdSort = value;
  }
  /** Retrieve SortOrder for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubIdSortOrder () {
    return this.SubIdSort;
  }
  /** Set the sort direction for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubIdSortDirection (boolean ascending) {
    this.SubIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubIdSortDirection () {
    return this.SubIdSortAscending;
  }
  /** Set the field level filters for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.SubId = value;
  }
  /** Retrieve filter for field: SubId (SEC_SUB_SYSTEM.sub_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSubIdFilter () {
    return this.SubId;
  }

  /**
   * Retrieves the SubIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubIdFilter field
   */
  public String[] getSubIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubIdFilter filter value from a formatted string
   *
   * @param _value the SubIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubIdFilter filter field
   */
  public void setSubIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubIdFilterFromFormattedString");
    try {
      this.setSubIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @param fetch whether to fetch this field or not
   */
  public void setSubNameFetch (boolean fetch) {
    this.SubNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubNameFetch () {
    return this.SubNameFetch;
  }
  /** Set the SortOrder for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubNameSortOrder (Integer value) {
    this.SubNameSort = value;
  }
  /** Retrieve SortOrder for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubNameSortOrder () {
    return this.SubNameSort;
  }
  /** Set the sort direction for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubNameSortDirection (boolean ascending) {
    this.SubNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubNameSortDirection () {
    return this.SubNameSortAscending;
  }
  /** Set the case insensitive for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSubNameCaseInsensitive (boolean ascending) {
    this.SubNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSubNameCaseInsensitive () {
    return this.SubNameCaseInsensitive;
  }
  /** Set the field level filters for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubNameFilter (StringFilter[] value) throws ServiceException {
    this.SubName = value;
  }
  /** Retrieve filter for field: SubName (SEC_SUB_SYSTEM.sub_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSubNameFilter () {
    return this.SubName;
  }

  /**
   * Retrieves the SubNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubNameFilter field
   */
  public String[] getSubNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubNameFilter filter value from a formatted string
   *
   * @param _value the SubNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubNameFilter filter field
   */
  public void setSubNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubNameFilterFromFormattedString");
    try {
      this.setSubNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSubRarIdFetch (boolean fetch) {
    this.SubRarIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubRarIdFetch () {
    return this.SubRarIdFetch;
  }
  /** Set the SortOrder for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubRarIdSortOrder (Integer value) {
    this.SubRarIdSort = value;
  }
  /** Retrieve SortOrder for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubRarIdSortOrder () {
    return this.SubRarIdSort;
  }
  /** Set the sort direction for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubRarIdSortDirection (boolean ascending) {
    this.SubRarIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubRarIdSortDirection () {
    return this.SubRarIdSortAscending;
  }
  /** Set the field level filters for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubRarIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.SubRarId = value;
  }
  /** Retrieve filter for field: SubRarId (SEC_SUB_SYSTEM.sub_rar_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSubRarIdFilter () {
    return this.SubRarId;
  }

  /**
   * Retrieves the SubRarIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubRarIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubRarIdFilter field
   */
  public String[] getSubRarIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubRarIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubRarIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubRarIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubRarIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubRarIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubRarIdFilter filter value from a formatted string
   *
   * @param _value the SubRarIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubRarIdFilter filter field
   */
  public void setSubRarIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubRarIdFilterFromFormattedString");
    try {
      this.setSubRarIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubRarIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubRarIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubRarIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSubParentIdFetch (boolean fetch) {
    this.SubParentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubParentIdFetch () {
    return this.SubParentIdFetch;
  }
  /** Set the SortOrder for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubParentIdSortOrder (Integer value) {
    this.SubParentIdSort = value;
  }
  /** Retrieve SortOrder for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubParentIdSortOrder () {
    return this.SubParentIdSort;
  }
  /** Set the sort direction for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubParentIdSortDirection (boolean ascending) {
    this.SubParentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubParentIdSortDirection () {
    return this.SubParentIdSortAscending;
  }
  /** Set the field level filters for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubParentIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.SubParentId = value;
  }
  /** Retrieve filter for field: SubParentId (SEC_SUB_SYSTEM.sub_parent_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSubParentIdFilter () {
    return this.SubParentId;
  }

  /**
   * Retrieves the SubParentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubParentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubParentIdFilter field
   */
  public String[] getSubParentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubParentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubParentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubParentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubParentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubParentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubParentIdFilter filter value from a formatted string
   *
   * @param _value the SubParentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubParentIdFilter filter field
   */
  public void setSubParentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubParentIdFilterFromFormattedString");
    try {
      this.setSubParentIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubParentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubParentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubParentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @param fetch whether to fetch this field or not
   */
  public void setSubUpdateCountFetch (boolean fetch) {
    this.SubUpdateCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubUpdateCountFetch () {
    return this.SubUpdateCountFetch;
  }
  /** Set the SortOrder for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubUpdateCountSortOrder (Integer value) {
    this.SubUpdateCountSort = value;
  }
  /** Retrieve SortOrder for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubUpdateCountSortOrder () {
    return this.SubUpdateCountSort;
  }
  /** Set the sort direction for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubUpdateCountSortDirection (boolean ascending) {
    this.SubUpdateCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubUpdateCountSortDirection () {
    return this.SubUpdateCountSortAscending;
  }
  /** Set the field level filters for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubUpdateCountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.SubUpdateCount = value;
  }
  /** Retrieve filter for field: SubUpdateCount (SEC_SUB_SYSTEM.sub_update_count)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSubUpdateCountFilter () {
    return this.SubUpdateCount;
  }

  /**
   * Retrieves the SubUpdateCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubUpdateCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubUpdateCountFilter field
   */
  public String[] getSubUpdateCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubUpdateCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubUpdateCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubUpdateCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubUpdateCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubUpdateCountFilter filter value from a formatted string
   *
   * @param _value the SubUpdateCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubUpdateCountFilter filter field
   */
  public void setSubUpdateCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubUpdateCountFilterFromFormattedString");
    try {
      this.setSubUpdateCountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubUpdateCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubUpdateCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @param fetch whether to fetch this field or not
   */
  public void setSubCreateDateFetch (boolean fetch) {
    this.SubCreateDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubCreateDateFetch () {
    return this.SubCreateDateFetch;
  }
  /** Set the SortOrder for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubCreateDateSortOrder (Integer value) {
    this.SubCreateDateSort = value;
  }
  /** Retrieve SortOrder for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubCreateDateSortOrder () {
    return this.SubCreateDateSort;
  }
  /** Set the sort direction for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubCreateDateSortDirection (boolean ascending) {
    this.SubCreateDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubCreateDateSortDirection () {
    return this.SubCreateDateSortAscending;
  }
  /** Set the field level filters for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubCreateDateFilter (DateFilter[] value) throws ServiceException {
    this.SubCreateDate = value;
  }
  /** Retrieve filter for field: SubCreateDate (SEC_SUB_SYSTEM.sub_create_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getSubCreateDateFilter () {
    return this.SubCreateDate;
  }

  /**
   * Retrieves the SubCreateDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubCreateDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubCreateDateFilter field
   */
  public String[] getSubCreateDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubCreateDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubCreateDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubCreateDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubCreateDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubCreateDateFilter filter value from a formatted string
   *
   * @param _value the SubCreateDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubCreateDateFilter filter field
   */
  public void setSubCreateDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubCreateDateFilterFromFormattedString");
    try {
      this.setSubCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubCreateDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubCreateDateFilterFromFormattedString");
  }

  /**
   * Retrieves the SubCreateDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubCreateDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubCreateDateFilter field
   */
  public String[] getSubCreateDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubCreateDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubCreateDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubCreateDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubCreateDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SubCreateDateFilter filter value from a formatted string
   *
   * @param _value the SubCreateDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubCreateDateFilter filter field
   */
  public void setSubCreateDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubCreateDateFilterFromFormattedDateTimeString");
    try {
      this.setSubCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubCreateDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubCreateDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @param fetch whether to fetch this field or not
   */
  public void setSubModifyDateFetch (boolean fetch) {
    this.SubModifyDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubModifyDateFetch () {
    return this.SubModifyDateFetch;
  }
  /** Set the SortOrder for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubModifyDateSortOrder (Integer value) {
    this.SubModifyDateSort = value;
  }
  /** Retrieve SortOrder for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubModifyDateSortOrder () {
    return this.SubModifyDateSort;
  }
  /** Set the sort direction for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubModifyDateSortDirection (boolean ascending) {
    this.SubModifyDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubModifyDateSortDirection () {
    return this.SubModifyDateSortAscending;
  }
  /** Set the field level filters for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubModifyDateFilter (DateFilter[] value) throws ServiceException {
    this.SubModifyDate = value;
  }
  /** Retrieve filter for field: SubModifyDate (SEC_SUB_SYSTEM.sub_modify_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getSubModifyDateFilter () {
    return this.SubModifyDate;
  }

  /**
   * Retrieves the SubModifyDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubModifyDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubModifyDateFilter field
   */
  public String[] getSubModifyDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubModifyDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubModifyDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubModifyDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubModifyDateFilter filter value from a formatted string
   *
   * @param _value the SubModifyDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubModifyDateFilter filter field
   */
  public void setSubModifyDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubModifyDateFilterFromFormattedString");
    try {
      this.setSubModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubModifyDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubModifyDateFilterFromFormattedString");
  }

  /**
   * Retrieves the SubModifyDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubModifyDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubModifyDateFilter field
   */
  public String[] getSubModifyDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubModifyDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubModifyDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubModifyDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SubModifyDateFilter filter value from a formatted string
   *
   * @param _value the SubModifyDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubModifyDateFilter filter field
   */
  public void setSubModifyDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubModifyDateFilterFromFormattedDateTimeString");
    try {
      this.setSubModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubModifyDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubModifyDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @param fetch whether to fetch this field or not
   */
  public void setSubModifyUserFetch (boolean fetch) {
    this.SubModifyUserFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubModifyUserFetch () {
    return this.SubModifyUserFetch;
  }
  /** Set the SortOrder for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubModifyUserSortOrder (Integer value) {
    this.SubModifyUserSort = value;
  }
  /** Retrieve SortOrder for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubModifyUserSortOrder () {
    return this.SubModifyUserSort;
  }
  /** Set the sort direction for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubModifyUserSortDirection (boolean ascending) {
    this.SubModifyUserSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubModifyUserSortDirection () {
    return this.SubModifyUserSortAscending;
  }
  /** Set the case insensitive for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSubModifyUserCaseInsensitive (boolean ascending) {
    this.SubModifyUserCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSubModifyUserCaseInsensitive () {
    return this.SubModifyUserCaseInsensitive;
  }
  /** Set the field level filters for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubModifyUserFilter (StringFilter[] value) throws ServiceException {
    this.SubModifyUser = value;
  }
  /** Retrieve filter for field: SubModifyUser (SEC_SUB_SYSTEM.sub_modify_user)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSubModifyUserFilter () {
    return this.SubModifyUser;
  }

  /**
   * Retrieves the SubModifyUserFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubModifyUserFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubModifyUserFilter field
   */
  public String[] getSubModifyUserFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubModifyUserFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubModifyUserFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubModifyUserFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubModifyUserFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubModifyUserFilter filter value from a formatted string
   *
   * @param _value the SubModifyUserFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubModifyUserFilter filter field
   */
  public void setSubModifyUserFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubModifyUserFilterFromFormattedString");
    try {
      this.setSubModifyUserFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubModifyUserFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubModifyUserFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRtyIdFetch (boolean fetch) {
    this.RtyIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRtyIdFetch () {
    return this.RtyIdFetch;
  }
  /** Set the SortOrder for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRtyIdSortOrder (Integer value) {
    this.RtyIdSort = value;
  }
  /** Retrieve SortOrder for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRtyIdSortOrder () {
    return this.RtyIdSort;
  }
  /** Set the sort direction for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRtyIdSortDirection (boolean ascending) {
    this.RtyIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRtyIdSortDirection () {
    return this.RtyIdSortAscending;
  }
  /** Set the field level filters for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRtyIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RtyId = value;
  }
  /** Retrieve filter for field: RtyId (SEC_RESOURCE_TYPE.rty_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRtyIdFilter () {
    return this.RtyId;
  }

  /**
   * Retrieves the RtyIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyIdFilter field
   */
  public String[] getRtyIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RtyIdFilter filter value from a formatted string
   *
   * @param _value the RtyIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyIdFilter filter field
   */
  public void setRtyIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyIdFilterFromFormattedString");
    try {
      this.setRtyIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @param fetch whether to fetch this field or not
   */
  public void setRtyNameFetch (boolean fetch) {
    this.RtyNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getRtyNameFetch () {
    return this.RtyNameFetch;
  }
  /** Set the SortOrder for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRtyNameSortOrder (Integer value) {
    this.RtyNameSort = value;
  }
  /** Retrieve SortOrder for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRtyNameSortOrder () {
    return this.RtyNameSort;
  }
  /** Set the sort direction for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRtyNameSortDirection (boolean ascending) {
    this.RtyNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRtyNameSortDirection () {
    return this.RtyNameSortAscending;
  }
  /** Set the case insensitive for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRtyNameCaseInsensitive (boolean ascending) {
    this.RtyNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRtyNameCaseInsensitive () {
    return this.RtyNameCaseInsensitive;
  }
  /** Set the field level filters for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRtyNameFilter (StringFilter[] value) throws ServiceException {
    this.RtyName = value;
  }
  /** Retrieve filter for field: RtyName (SEC_RESOURCE_TYPE.rty_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRtyNameFilter () {
    return this.RtyName;
  }

  /**
   * Retrieves the RtyNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyNameFilter field
   */
  public String[] getRtyNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RtyNameFilter filter value from a formatted string
   *
   * @param _value the RtyNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyNameFilter filter field
   */
  public void setRtyNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyNameFilterFromFormattedString");
    try {
      this.setRtyNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @param fetch whether to fetch this field or not
   */
  public void setRtyUpdateCountFetch (boolean fetch) {
    this.RtyUpdateCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getRtyUpdateCountFetch () {
    return this.RtyUpdateCountFetch;
  }
  /** Set the SortOrder for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRtyUpdateCountSortOrder (Integer value) {
    this.RtyUpdateCountSort = value;
  }
  /** Retrieve SortOrder for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRtyUpdateCountSortOrder () {
    return this.RtyUpdateCountSort;
  }
  /** Set the sort direction for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRtyUpdateCountSortDirection (boolean ascending) {
    this.RtyUpdateCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRtyUpdateCountSortDirection () {
    return this.RtyUpdateCountSortAscending;
  }
  /** Set the field level filters for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRtyUpdateCountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RtyUpdateCount = value;
  }
  /** Retrieve filter for field: RtyUpdateCount (SEC_RESOURCE_TYPE.rty_update_count)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRtyUpdateCountFilter () {
    return this.RtyUpdateCount;
  }

  /**
   * Retrieves the RtyUpdateCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyUpdateCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyUpdateCountFilter field
   */
  public String[] getRtyUpdateCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyUpdateCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyUpdateCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyUpdateCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyUpdateCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RtyUpdateCountFilter filter value from a formatted string
   *
   * @param _value the RtyUpdateCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyUpdateCountFilter filter field
   */
  public void setRtyUpdateCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyUpdateCountFilterFromFormattedString");
    try {
      this.setRtyUpdateCountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyUpdateCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyUpdateCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @param fetch whether to fetch this field or not
   */
  public void setRtyCreateDateFetch (boolean fetch) {
    this.RtyCreateDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getRtyCreateDateFetch () {
    return this.RtyCreateDateFetch;
  }
  /** Set the SortOrder for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRtyCreateDateSortOrder (Integer value) {
    this.RtyCreateDateSort = value;
  }
  /** Retrieve SortOrder for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRtyCreateDateSortOrder () {
    return this.RtyCreateDateSort;
  }
  /** Set the sort direction for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRtyCreateDateSortDirection (boolean ascending) {
    this.RtyCreateDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRtyCreateDateSortDirection () {
    return this.RtyCreateDateSortAscending;
  }
  /** Set the field level filters for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRtyCreateDateFilter (DateFilter[] value) throws ServiceException {
    this.RtyCreateDate = value;
  }
  /** Retrieve filter for field: RtyCreateDate (SEC_RESOURCE_TYPE.rty_create_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getRtyCreateDateFilter () {
    return this.RtyCreateDate;
  }

  /**
   * Retrieves the RtyCreateDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyCreateDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyCreateDateFilter field
   */
  public String[] getRtyCreateDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyCreateDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyCreateDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyCreateDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyCreateDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RtyCreateDateFilter filter value from a formatted string
   *
   * @param _value the RtyCreateDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyCreateDateFilter filter field
   */
  public void setRtyCreateDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyCreateDateFilterFromFormattedString");
    try {
      this.setRtyCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyCreateDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyCreateDateFilterFromFormattedString");
  }

  /**
   * Retrieves the RtyCreateDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyCreateDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyCreateDateFilter field
   */
  public String[] getRtyCreateDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyCreateDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyCreateDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyCreateDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyCreateDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RtyCreateDateFilter filter value from a formatted string
   *
   * @param _value the RtyCreateDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyCreateDateFilter filter field
   */
  public void setRtyCreateDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyCreateDateFilterFromFormattedDateTimeString");
    try {
      this.setRtyCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyCreateDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyCreateDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @param fetch whether to fetch this field or not
   */
  public void setRtyModifyDateFetch (boolean fetch) {
    this.RtyModifyDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getRtyModifyDateFetch () {
    return this.RtyModifyDateFetch;
  }
  /** Set the SortOrder for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRtyModifyDateSortOrder (Integer value) {
    this.RtyModifyDateSort = value;
  }
  /** Retrieve SortOrder for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRtyModifyDateSortOrder () {
    return this.RtyModifyDateSort;
  }
  /** Set the sort direction for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRtyModifyDateSortDirection (boolean ascending) {
    this.RtyModifyDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRtyModifyDateSortDirection () {
    return this.RtyModifyDateSortAscending;
  }
  /** Set the field level filters for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRtyModifyDateFilter (DateFilter[] value) throws ServiceException {
    this.RtyModifyDate = value;
  }
  /** Retrieve filter for field: RtyModifyDate (SEC_RESOURCE_TYPE.rty_modify_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getRtyModifyDateFilter () {
    return this.RtyModifyDate;
  }

  /**
   * Retrieves the RtyModifyDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyModifyDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyModifyDateFilter field
   */
  public String[] getRtyModifyDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyModifyDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyModifyDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyModifyDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RtyModifyDateFilter filter value from a formatted string
   *
   * @param _value the RtyModifyDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyModifyDateFilter filter field
   */
  public void setRtyModifyDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyModifyDateFilterFromFormattedString");
    try {
      this.setRtyModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyModifyDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyModifyDateFilterFromFormattedString");
  }

  /**
   * Retrieves the RtyModifyDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyModifyDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyModifyDateFilter field
   */
  public String[] getRtyModifyDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyModifyDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyModifyDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyModifyDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RtyModifyDateFilter filter value from a formatted string
   *
   * @param _value the RtyModifyDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyModifyDateFilter filter field
   */
  public void setRtyModifyDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyModifyDateFilterFromFormattedDateTimeString");
    try {
      this.setRtyModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyModifyDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyModifyDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @param fetch whether to fetch this field or not
   */
  public void setRtyModifyUserFetch (boolean fetch) {
    this.RtyModifyUserFetch = fetch;
  }
  /** Retrieve Fetch value for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @return boolean the Fetch value for this field
   */
  public boolean getRtyModifyUserFetch () {
    return this.RtyModifyUserFetch;
  }
  /** Set the SortOrder for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRtyModifyUserSortOrder (Integer value) {
    this.RtyModifyUserSort = value;
  }
  /** Retrieve SortOrder for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRtyModifyUserSortOrder () {
    return this.RtyModifyUserSort;
  }
  /** Set the sort direction for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRtyModifyUserSortDirection (boolean ascending) {
    this.RtyModifyUserSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRtyModifyUserSortDirection () {
    return this.RtyModifyUserSortAscending;
  }
  /** Set the case insensitive for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRtyModifyUserCaseInsensitive (boolean ascending) {
    this.RtyModifyUserCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRtyModifyUserCaseInsensitive () {
    return this.RtyModifyUserCaseInsensitive;
  }
  /** Set the field level filters for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRtyModifyUserFilter (StringFilter[] value) throws ServiceException {
    this.RtyModifyUser = value;
  }
  /** Retrieve filter for field: RtyModifyUser (SEC_RESOURCE_TYPE.rty_modify_user)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRtyModifyUserFilter () {
    return this.RtyModifyUser;
  }

  /**
   * Retrieves the RtyModifyUserFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RtyModifyUserFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RtyModifyUserFilter field
   */
  public String[] getRtyModifyUserFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRtyModifyUserFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRtyModifyUserFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRtyModifyUserFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRtyModifyUserFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RtyModifyUserFilter filter value from a formatted string
   *
   * @param _value the RtyModifyUserFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RtyModifyUserFilter filter field
   */
  public void setRtyModifyUserFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRtyModifyUserFilterFromFormattedString");
    try {
      this.setRtyModifyUserFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RtyModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRtyModifyUserFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRtyModifyUserFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRarIdFetch (boolean fetch) {
    this.RarIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRarIdFetch () {
    return this.RarIdFetch;
  }
  /** Set the SortOrder for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRarIdSortOrder (Integer value) {
    this.RarIdSort = value;
  }
  /** Retrieve SortOrder for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRarIdSortOrder () {
    return this.RarIdSort;
  }
  /** Set the sort direction for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRarIdSortDirection (boolean ascending) {
    this.RarIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRarIdSortDirection () {
    return this.RarIdSortAscending;
  }
  /** Set the field level filters for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRarIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RarId = value;
  }
  /** Retrieve filter for field: RarId (SEC_RESOURCE_REALM.rar_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRarIdFilter () {
    return this.RarId;
  }

  /**
   * Retrieves the RarIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarIdFilter field
   */
  public String[] getRarIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RarIdFilter filter value from a formatted string
   *
   * @param _value the RarIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarIdFilter filter field
   */
  public void setRarIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarIdFilterFromFormattedString");
    try {
      this.setRarIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @param fetch whether to fetch this field or not
   */
  public void setRarNameFetch (boolean fetch) {
    this.RarNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getRarNameFetch () {
    return this.RarNameFetch;
  }
  /** Set the SortOrder for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRarNameSortOrder (Integer value) {
    this.RarNameSort = value;
  }
  /** Retrieve SortOrder for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRarNameSortOrder () {
    return this.RarNameSort;
  }
  /** Set the sort direction for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRarNameSortDirection (boolean ascending) {
    this.RarNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRarNameSortDirection () {
    return this.RarNameSortAscending;
  }
  /** Set the case insensitive for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRarNameCaseInsensitive (boolean ascending) {
    this.RarNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRarNameCaseInsensitive () {
    return this.RarNameCaseInsensitive;
  }
  /** Set the field level filters for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRarNameFilter (StringFilter[] value) throws ServiceException {
    this.RarName = value;
  }
  /** Retrieve filter for field: RarName (SEC_RESOURCE_REALM.rar_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRarNameFilter () {
    return this.RarName;
  }

  /**
   * Retrieves the RarNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarNameFilter field
   */
  public String[] getRarNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RarNameFilter filter value from a formatted string
   *
   * @param _value the RarNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarNameFilter filter field
   */
  public void setRarNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarNameFilterFromFormattedString");
    try {
      this.setRarNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @param fetch whether to fetch this field or not
   */
  public void setRarUpdateCountFetch (boolean fetch) {
    this.RarUpdateCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getRarUpdateCountFetch () {
    return this.RarUpdateCountFetch;
  }
  /** Set the SortOrder for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRarUpdateCountSortOrder (Integer value) {
    this.RarUpdateCountSort = value;
  }
  /** Retrieve SortOrder for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRarUpdateCountSortOrder () {
    return this.RarUpdateCountSort;
  }
  /** Set the sort direction for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRarUpdateCountSortDirection (boolean ascending) {
    this.RarUpdateCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRarUpdateCountSortDirection () {
    return this.RarUpdateCountSortAscending;
  }
  /** Set the field level filters for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRarUpdateCountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RarUpdateCount = value;
  }
  /** Retrieve filter for field: RarUpdateCount (SEC_RESOURCE_REALM.rar_update_count)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRarUpdateCountFilter () {
    return this.RarUpdateCount;
  }

  /**
   * Retrieves the RarUpdateCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarUpdateCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarUpdateCountFilter field
   */
  public String[] getRarUpdateCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarUpdateCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarUpdateCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarUpdateCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarUpdateCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RarUpdateCountFilter filter value from a formatted string
   *
   * @param _value the RarUpdateCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarUpdateCountFilter filter field
   */
  public void setRarUpdateCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarUpdateCountFilterFromFormattedString");
    try {
      this.setRarUpdateCountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarUpdateCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarUpdateCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @param fetch whether to fetch this field or not
   */
  public void setRarCreateDateFetch (boolean fetch) {
    this.RarCreateDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getRarCreateDateFetch () {
    return this.RarCreateDateFetch;
  }
  /** Set the SortOrder for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRarCreateDateSortOrder (Integer value) {
    this.RarCreateDateSort = value;
  }
  /** Retrieve SortOrder for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRarCreateDateSortOrder () {
    return this.RarCreateDateSort;
  }
  /** Set the sort direction for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRarCreateDateSortDirection (boolean ascending) {
    this.RarCreateDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRarCreateDateSortDirection () {
    return this.RarCreateDateSortAscending;
  }
  /** Set the field level filters for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRarCreateDateFilter (DateFilter[] value) throws ServiceException {
    this.RarCreateDate = value;
  }
  /** Retrieve filter for field: RarCreateDate (SEC_RESOURCE_REALM.rar_create_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getRarCreateDateFilter () {
    return this.RarCreateDate;
  }

  /**
   * Retrieves the RarCreateDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarCreateDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarCreateDateFilter field
   */
  public String[] getRarCreateDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarCreateDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarCreateDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarCreateDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarCreateDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RarCreateDateFilter filter value from a formatted string
   *
   * @param _value the RarCreateDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarCreateDateFilter filter field
   */
  public void setRarCreateDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarCreateDateFilterFromFormattedString");
    try {
      this.setRarCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarCreateDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarCreateDateFilterFromFormattedString");
  }

  /**
   * Retrieves the RarCreateDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarCreateDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarCreateDateFilter field
   */
  public String[] getRarCreateDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarCreateDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarCreateDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarCreateDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarCreateDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RarCreateDateFilter filter value from a formatted string
   *
   * @param _value the RarCreateDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarCreateDateFilter filter field
   */
  public void setRarCreateDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarCreateDateFilterFromFormattedDateTimeString");
    try {
      this.setRarCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarCreateDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarCreateDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @param fetch whether to fetch this field or not
   */
  public void setRarModifyDateFetch (boolean fetch) {
    this.RarModifyDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getRarModifyDateFetch () {
    return this.RarModifyDateFetch;
  }
  /** Set the SortOrder for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRarModifyDateSortOrder (Integer value) {
    this.RarModifyDateSort = value;
  }
  /** Retrieve SortOrder for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRarModifyDateSortOrder () {
    return this.RarModifyDateSort;
  }
  /** Set the sort direction for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRarModifyDateSortDirection (boolean ascending) {
    this.RarModifyDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRarModifyDateSortDirection () {
    return this.RarModifyDateSortAscending;
  }
  /** Set the field level filters for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRarModifyDateFilter (DateFilter[] value) throws ServiceException {
    this.RarModifyDate = value;
  }
  /** Retrieve filter for field: RarModifyDate (SEC_RESOURCE_REALM.rar_modify_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getRarModifyDateFilter () {
    return this.RarModifyDate;
  }

  /**
   * Retrieves the RarModifyDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarModifyDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarModifyDateFilter field
   */
  public String[] getRarModifyDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarModifyDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarModifyDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarModifyDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RarModifyDateFilter filter value from a formatted string
   *
   * @param _value the RarModifyDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarModifyDateFilter filter field
   */
  public void setRarModifyDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarModifyDateFilterFromFormattedString");
    try {
      this.setRarModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarModifyDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarModifyDateFilterFromFormattedString");
  }

  /**
   * Retrieves the RarModifyDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarModifyDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarModifyDateFilter field
   */
  public String[] getRarModifyDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarModifyDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarModifyDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarModifyDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RarModifyDateFilter filter value from a formatted string
   *
   * @param _value the RarModifyDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarModifyDateFilter filter field
   */
  public void setRarModifyDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarModifyDateFilterFromFormattedDateTimeString");
    try {
      this.setRarModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarModifyDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarModifyDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @param fetch whether to fetch this field or not
   */
  public void setRarModifyUserFetch (boolean fetch) {
    this.RarModifyUserFetch = fetch;
  }
  /** Retrieve Fetch value for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @return boolean the Fetch value for this field
   */
  public boolean getRarModifyUserFetch () {
    return this.RarModifyUserFetch;
  }
  /** Set the SortOrder for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRarModifyUserSortOrder (Integer value) {
    this.RarModifyUserSort = value;
  }
  /** Retrieve SortOrder for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRarModifyUserSortOrder () {
    return this.RarModifyUserSort;
  }
  /** Set the sort direction for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRarModifyUserSortDirection (boolean ascending) {
    this.RarModifyUserSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRarModifyUserSortDirection () {
    return this.RarModifyUserSortAscending;
  }
  /** Set the case insensitive for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRarModifyUserCaseInsensitive (boolean ascending) {
    this.RarModifyUserCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRarModifyUserCaseInsensitive () {
    return this.RarModifyUserCaseInsensitive;
  }
  /** Set the field level filters for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRarModifyUserFilter (StringFilter[] value) throws ServiceException {
    this.RarModifyUser = value;
  }
  /** Retrieve filter for field: RarModifyUser (SEC_RESOURCE_REALM.rar_modify_user)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRarModifyUserFilter () {
    return this.RarModifyUser;
  }

  /**
   * Retrieves the RarModifyUserFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RarModifyUserFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RarModifyUserFilter field
   */
  public String[] getRarModifyUserFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRarModifyUserFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRarModifyUserFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRarModifyUserFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRarModifyUserFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RarModifyUserFilter filter value from a formatted string
   *
   * @param _value the RarModifyUserFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RarModifyUserFilter filter field
   */
  public void setRarModifyUserFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRarModifyUserFilterFromFormattedString");
    try {
      this.setRarModifyUserFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RarModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRarModifyUserFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRarModifyUserFilterFromFormattedString");
  }

  public String toString() {
    return SecurityResourceObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityResourceObjectHelper.toMap(this, null);
  }
}
