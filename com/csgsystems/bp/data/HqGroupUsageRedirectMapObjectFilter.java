/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupUsageRedirectMapObjectFilter.java
 * Definition File: Catalog/HqgroupUsageRedirectMap.xml
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
public class HqGroupUsageRedirectMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HqGroupUsageRedirectMapObjectKeyFilter Key = null;
  /** raw field for: EXTERNAL_ID_HQ_GROUPS_MAP.external_id) */
  public    StringFilter[] ExternalId  = null;
  protected boolean ExternalIdFetch = false;
  protected boolean ExternalIdSortAscending = true;
  protected boolean ExternalIdCaseInsensitive = false;
  protected Integer ExternalIdSort = null;
  /** raw field for: EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type) */
  public    IntegerFilter[] ExternalIdType  = null;
  protected boolean ExternalIdTypeFetch = false;
  protected boolean ExternalIdTypeSortAscending = true;
  protected Integer ExternalIdTypeSort = null;
  /** raw field for: HQ_GROUP_USAGE_REDIRECT_MAP.group_id) */
  public    IntegerFilter[] GroupId  = null;
  protected boolean GroupIdFetch = false;
  protected boolean GroupIdSortAscending = true;
  protected Integer GroupIdSort = null;
  /** raw field for: HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv) */
  public    IntegerFilter[] GroupIdServ  = null;
  protected boolean GroupIdServFetch = false;
  protected boolean GroupIdServSortAscending = true;
  protected Integer GroupIdServSort = null;
  /** raw field for: HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group) */
  public    IntegerFilter[] UsageRedirectGroup  = null;
  protected boolean UsageRedirectGroupFetch = false;
  protected boolean UsageRedirectGroupSortAscending = true;
  protected Integer UsageRedirectGroupSort = null;
  /** raw field for: HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no) */
  public    IntegerFilter[] BalanceAccountInternalId  = null;
  protected boolean BalanceAccountInternalIdFetch = false;
  protected boolean BalanceAccountInternalIdSortAscending = true;
  protected Integer BalanceAccountInternalIdSort = null;
  /** raw field for: HQ_GROUP_USAGE_REDIRECT_MAP.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: HQ_GROUP_USAGE_REDIRECT_MAP.order_level) */
  public    IntegerFilter[] OrderLevel  = null;
  protected boolean OrderLevelFetch = false;
  protected boolean OrderLevelSortAscending = true;
  protected Integer OrderLevelSort = null;
  private String _objName = "HqGroupUsageRedirectMapObjectFilter";
  /** default constructor */
  public HqGroupUsageRedirectMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HqGroupUsageRedirectMapObjectFilter (HqGroupUsageRedirectMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HqGroupUsageRedirectMapObjectKeyFilter (other.Key);
    this.ExternalId = other.ExternalId;
    this.ExternalIdFetch = other.ExternalIdFetch;
    this.ExternalIdSort = other.ExternalIdSort;
    this.ExternalIdCaseInsensitive = other.ExternalIdCaseInsensitive;
    this.ExternalIdSortAscending = other.ExternalIdSortAscending;
    this.ExternalIdType = other.ExternalIdType;
    this.ExternalIdTypeFetch = other.ExternalIdTypeFetch;
    this.ExternalIdTypeSort = other.ExternalIdTypeSort;
    this.ExternalIdTypeSortAscending = other.ExternalIdTypeSortAscending;
    this.GroupId = other.GroupId;
    this.GroupIdFetch = other.GroupIdFetch;
    this.GroupIdSort = other.GroupIdSort;
    this.GroupIdSortAscending = other.GroupIdSortAscending;
    this.GroupIdServ = other.GroupIdServ;
    this.GroupIdServFetch = other.GroupIdServFetch;
    this.GroupIdServSort = other.GroupIdServSort;
    this.GroupIdServSortAscending = other.GroupIdServSortAscending;
    this.UsageRedirectGroup = other.UsageRedirectGroup;
    this.UsageRedirectGroupFetch = other.UsageRedirectGroupFetch;
    this.UsageRedirectGroupSort = other.UsageRedirectGroupSort;
    this.UsageRedirectGroupSortAscending = other.UsageRedirectGroupSortAscending;
    this.BalanceAccountInternalId = other.BalanceAccountInternalId;
    this.BalanceAccountInternalIdFetch = other.BalanceAccountInternalIdFetch;
    this.BalanceAccountInternalIdSort = other.BalanceAccountInternalIdSort;
    this.BalanceAccountInternalIdSortAscending = other.BalanceAccountInternalIdSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.OrderLevel = other.OrderLevel;
    this.OrderLevelFetch = other.OrderLevelFetch;
    this.OrderLevelSort = other.OrderLevelSort;
    this.OrderLevelSortAscending = other.OrderLevelSortAscending;  }
  /** get the filter for this object's key
   * @return HqGroupUsageRedirectMapObjectKeyFilter
   */
  public HqGroupUsageRedirectMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HqGroupUsageRedirectMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdFetch (boolean fetch) {
    this.ExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdFetch () {
    return this.ExternalIdFetch;
  }
  /** Set the SortOrder for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdSortOrder (Integer value) {
    this.ExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdSortOrder () {
    return this.ExternalIdSort;
  }
  /** Set the sort direction for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdSortDirection (boolean ascending) {
    this.ExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdSortDirection () {
    return this.ExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExternalIdCaseInsensitive (boolean ascending) {
    this.ExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExternalIdCaseInsensitive () {
    return this.ExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ExternalId = value;
  }
  /** Retrieve filter for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExternalIdFilter () {
    return this.ExternalId;
  }

  /**
   * Retrieves the ExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdFilter field
   */
  public String[] getExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalIdFilter filter value from a formatted string
   *
   * @param _value the ExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalIdFilter filter field
   */
  public void setExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalIdFilterFromFormattedString");
    try {
      this.setExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdTypeFetch (boolean fetch) {
    this.ExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdTypeFetch () {
    return this.ExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdTypeSortOrder (Integer value) {
    this.ExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdTypeSortOrder () {
    return this.ExternalIdTypeSort;
  }
  /** Set the sort direction for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdTypeSortDirection (boolean ascending) {
    this.ExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdTypeSortDirection () {
    return this.ExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ExternalIdType = value;
  }
  /** Retrieve filter for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExternalIdTypeFilter () {
    return this.ExternalIdType;
  }

  /**
   * Retrieves the ExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdTypeFilter field
   */
  public String[] getExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalIdTypeFilter filter field
   */
  public void setExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
    try {
      this.setExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdFetch (boolean fetch) {
    this.GroupIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdFetch () {
    return this.GroupIdFetch;
  }
  /** Set the SortOrder for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdSortOrder (Integer value) {
    this.GroupIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdSortOrder () {
    return this.GroupIdSort;
  }
  /** Set the sort direction for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdSortDirection (boolean ascending) {
    this.GroupIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdSortDirection () {
    return this.GroupIdSortAscending;
  }
  /** Set the field level filters for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupId = value;
  }
  /** Retrieve filter for field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdFilter () {
    return this.GroupId;
  }

  /**
   * Retrieves the GroupIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdFilter field
   */
  public String[] getGroupIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupIdFilter filter value from a formatted string
   *
   * @param _value the GroupIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupIdFilter filter field
   */
  public void setGroupIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupIdFilterFromFormattedString");
    try {
      this.setGroupIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdServFetch (boolean fetch) {
    this.GroupIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdServFetch () {
    return this.GroupIdServFetch;
  }
  /** Set the SortOrder for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdServSortOrder (Integer value) {
    this.GroupIdServSort = value;
  }
  /** Retrieve SortOrder for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdServSortOrder () {
    return this.GroupIdServSort;
  }
  /** Set the sort direction for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdServSortDirection (boolean ascending) {
    this.GroupIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdServSortDirection () {
    return this.GroupIdServSortAscending;
  }
  /** Set the field level filters for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupIdServ = value;
  }
  /** Retrieve filter for field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdServFilter () {
    return this.GroupIdServ;
  }

  /**
   * Retrieves the GroupIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdServFilter field
   */
  public String[] getGroupIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupIdServFilter filter value from a formatted string
   *
   * @param _value the GroupIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupIdServFilter filter field
   */
  public void setGroupIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupIdServFilterFromFormattedString");
    try {
      this.setGroupIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @param fetch whether to fetch this field or not
   */
  public void setUsageRedirectGroupFetch (boolean fetch) {
    this.UsageRedirectGroupFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsageRedirectGroupFetch () {
    return this.UsageRedirectGroupFetch;
  }
  /** Set the SortOrder for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsageRedirectGroupSortOrder (Integer value) {
    this.UsageRedirectGroupSort = value;
  }
  /** Retrieve SortOrder for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsageRedirectGroupSortOrder () {
    return this.UsageRedirectGroupSort;
  }
  /** Set the sort direction for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsageRedirectGroupSortDirection (boolean ascending) {
    this.UsageRedirectGroupSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsageRedirectGroupSortDirection () {
    return this.UsageRedirectGroupSortAscending;
  }
  /** Set the field level filters for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsageRedirectGroupFilter (IntegerFilter[] value) throws ServiceException {
    this.UsageRedirectGroup = value;
  }
  /** Retrieve filter for field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUsageRedirectGroupFilter () {
    return this.UsageRedirectGroup;
  }

  /**
   * Retrieves the UsageRedirectGroupFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsageRedirectGroupFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsageRedirectGroupFilter field
   */
  public String[] getUsageRedirectGroupFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageRedirectGroupFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsageRedirectGroupFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageRedirectGroupFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsageRedirectGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsageRedirectGroupFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsageRedirectGroupFilter filter value from a formatted string
   *
   * @param _value the UsageRedirectGroupFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsageRedirectGroupFilter filter field
   */
  public void setUsageRedirectGroupFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsageRedirectGroupFilterFromFormattedString");
    try {
      this.setUsageRedirectGroupFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsageRedirectGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsageRedirectGroupFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsageRedirectGroupFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceAccountInternalIdFetch (boolean fetch) {
    this.BalanceAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceAccountInternalIdFetch () {
    return this.BalanceAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceAccountInternalIdSortOrder (Integer value) {
    this.BalanceAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceAccountInternalIdSortOrder () {
    return this.BalanceAccountInternalIdSort;
  }
  /** Set the sort direction for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceAccountInternalIdSortDirection (boolean ascending) {
    this.BalanceAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceAccountInternalIdSortDirection () {
    return this.BalanceAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceAccountInternalId = value;
  }
  /** Retrieve filter for field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBalanceAccountInternalIdFilter () {
    return this.BalanceAccountInternalId;
  }

  /**
   * Retrieves the BalanceAccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceAccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceAccountInternalIdFilter field
   */
  public String[] getBalanceAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceAccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the BalanceAccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountInternalIdFilter filter field
   */
  public void setBalanceAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceAccountInternalIdFilterFromFormattedString");
    try {
      this.setBalanceAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
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


  /** Set the field level Fetch value for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @param fetch whether to fetch this field or not
   */
  public void setOrderLevelFetch (boolean fetch) {
    this.OrderLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrderLevelFetch () {
    return this.OrderLevelFetch;
  }
  /** Set the SortOrder for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrderLevelSortOrder (Integer value) {
    this.OrderLevelSort = value;
  }
  /** Retrieve SortOrder for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrderLevelSortOrder () {
    return this.OrderLevelSort;
  }
  /** Set the sort direction for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrderLevelSortDirection (boolean ascending) {
    this.OrderLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrderLevelSortDirection () {
    return this.OrderLevelSortAscending;
  }
  /** Set the field level filters for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrderLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.OrderLevel = value;
  }
  /** Retrieve filter for field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrderLevelFilter () {
    return this.OrderLevel;
  }

  /**
   * Retrieves the OrderLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrderLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderLevelFilter field
   */
  public String[] getOrderLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrderLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrderLevelFilter filter value from a formatted string
   *
   * @param _value the OrderLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrderLevelFilter filter field
   */
  public void setOrderLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrderLevelFilterFromFormattedString");
    try {
      this.setOrderLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderLevelFilterFromFormattedString");
  }

  public String toString() {
    return HqGroupUsageRedirectMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HqGroupUsageRedirectMapObjectHelper.toMap(this, null);
  }
}
