/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupMembersObjectFilter.java
 * Definition File: Catalog/HqGroupMembers.xml
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
public class HqGroupMembersObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HqGroupMembersObjectKeyFilter Key = null;
  /** raw field for: EXTERNAL_ID_ACCT_MAP.external_id) */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field for: EXTERNAL_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  /** raw field for: EXTERNAL_ID_EQUIP_MAP.external_id) */
  public    StringFilter[] ServiceExternalId  = null;
  protected boolean ServiceExternalIdFetch = false;
  protected boolean ServiceExternalIdSortAscending = true;
  protected boolean ServiceExternalIdCaseInsensitive = false;
  protected Integer ServiceExternalIdSort = null;
  /** raw field for: EXTERNAL_ID_EQUIP_MAP.external_id_type) */
  public    IntegerFilter[] ServiceExternalIdType  = null;
  protected boolean ServiceExternalIdTypeFetch = false;
  protected boolean ServiceExternalIdTypeSortAscending = true;
  protected Integer ServiceExternalIdTypeSort = null;
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
  /** raw field for: HQ_GROUP_MEMBERS.group_id) */
  public    IntegerFilter[] GroupId  = null;
  protected boolean GroupIdFetch = false;
  protected boolean GroupIdSortAscending = true;
  protected Integer GroupIdSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.group_id_serv) */
  public    IntegerFilter[] GroupIdServ  = null;
  protected boolean GroupIdServFetch = false;
  protected boolean GroupIdServSortAscending = true;
  protected Integer GroupIdServSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.start_dt) */
  public    DateFilter[] StartDt  = null;
  protected boolean StartDtFetch = false;
  protected boolean StartDtSortAscending = true;
  protected Integer StartDtSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.end_dt) */
  public    DateFilter[] EndDt  = null;
  protected boolean EndDtFetch = false;
  protected boolean EndDtSortAscending = true;
  protected Integer EndDtSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.connect_reason) */
  public    IntegerFilter[] ConnectReason  = null;
  protected boolean ConnectReasonFetch = false;
  protected boolean ConnectReasonSortAscending = true;
  protected Integer ConnectReasonSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.disconnect_reason) */
  public    IntegerFilter[] DisconnectReason  = null;
  protected boolean DisconnectReasonFetch = false;
  protected boolean DisconnectReasonSortAscending = true;
  protected Integer DisconnectReasonSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.proportion) */
  public    IntegerFilter[] Proportion  = null;
  protected boolean ProportionFetch = false;
  protected boolean ProportionSortAscending = true;
  protected Integer ProportionSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.participation) */
  public    IntegerFilter[] Participation  = null;
  protected boolean ParticipationFetch = false;
  protected boolean ParticipationSortAscending = true;
  protected Integer ParticipationSort = null;
  /** raw field for: HQ_GROUP_MEMBERS.server_id) */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  private String _objName = "HqGroupMembersObjectFilter";
  /** default constructor */
  public HqGroupMembersObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HqGroupMembersObjectFilter (HqGroupMembersObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HqGroupMembersObjectKeyFilter (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
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
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;
    this.StartDt = other.StartDt;
    this.StartDtFetch = other.StartDtFetch;
    this.StartDtSort = other.StartDtSort;
    this.StartDtSortAscending = other.StartDtSortAscending;
    this.EndDt = other.EndDt;
    this.EndDtFetch = other.EndDtFetch;
    this.EndDtSort = other.EndDtSort;
    this.EndDtSortAscending = other.EndDtSortAscending;
    this.ConnectReason = other.ConnectReason;
    this.ConnectReasonFetch = other.ConnectReasonFetch;
    this.ConnectReasonSort = other.ConnectReasonSort;
    this.ConnectReasonSortAscending = other.ConnectReasonSortAscending;
    this.DisconnectReason = other.DisconnectReason;
    this.DisconnectReasonFetch = other.DisconnectReasonFetch;
    this.DisconnectReasonSort = other.DisconnectReasonSort;
    this.DisconnectReasonSortAscending = other.DisconnectReasonSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.Proportion = other.Proportion;
    this.ProportionFetch = other.ProportionFetch;
    this.ProportionSort = other.ProportionSort;
    this.ProportionSortAscending = other.ProportionSortAscending;
    this.Participation = other.Participation;
    this.ParticipationFetch = other.ParticipationFetch;
    this.ParticipationSort = other.ParticipationSort;
    this.ParticipationSortAscending = other.ParticipationSortAscending;
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;  }
  /** get the filter for this object's key
   * @return HqGroupMembersObjectKeyFilter
   */
  public HqGroupMembersObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HqGroupMembersObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch) {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch () {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value) {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder () {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending) {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection () {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending) {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountExternalIdCaseInsensitive () {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter () {
    return this.AccountExternalId;
  }

  /**
   * Retrieves the AccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdFilter field
   */
  public String[] getAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdFilter filter field
   */
  public void setAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
    try {
      this.setAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch) {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch () {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value) {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder () {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending) {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection () {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter () {
    return this.AccountExternalIdType;
  }

  /**
   * Retrieves the AccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdTypeFilter field
   */
  public String[] getAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdFetch (boolean fetch) {
    this.ServiceExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdFetch () {
    return this.ServiceExternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdSortOrder (Integer value) {
    this.ServiceExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdSortOrder () {
    return this.ServiceExternalIdSort;
  }
  /** Set the sort direction for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdSortDirection (boolean ascending) {
    this.ServiceExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdSortDirection () {
    return this.ServiceExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceExternalIdCaseInsensitive (boolean ascending) {
    this.ServiceExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceExternalIdCaseInsensitive () {
    return this.ServiceExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ServiceExternalId = value;
  }
  /** Retrieve filter for field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceExternalIdFilter () {
    return this.ServiceExternalId;
  }

  /**
   * Retrieves the ServiceExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdFilter field
   */
  public String[] getServiceExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdFilter filter field
   */
  public void setServiceExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
    try {
      this.setServiceExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdTypeFetch (boolean fetch) {
    this.ServiceExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdTypeFetch () {
    return this.ServiceExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdTypeSortOrder (Integer value) {
    this.ServiceExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdTypeSortOrder () {
    return this.ServiceExternalIdTypeSort;
  }
  /** Set the sort direction for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdTypeSortDirection (boolean ascending) {
    this.ServiceExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdTypeSortDirection () {
    return this.ServiceExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceExternalIdType = value;
  }
  /** Retrieve filter for field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceExternalIdTypeFilter () {
    return this.ServiceExternalIdType;
  }

  /**
   * Retrieves the ServiceExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdTypeFilter field
   */
  public String[] getServiceExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdTypeFilter filter field
   */
  public void setServiceExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
    try {
      this.setServiceExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdFetch (boolean fetch) {
    this.GroupIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdFetch () {
    return this.GroupIdFetch;
  }
  /** Set the SortOrder for field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdSortOrder (Integer value) {
    this.GroupIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdSortOrder () {
    return this.GroupIdSort;
  }
  /** Set the sort direction for field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdSortDirection (boolean ascending) {
    this.GroupIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdSortDirection () {
    return this.GroupIdSortAscending;
  }
  /** Set the field level filters for field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupId = value;
  }
  /** Retrieve filter for field: GroupId (HQ_GROUP_MEMBERS.group_id)
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

  /** Set the field level Fetch value for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdServFetch (boolean fetch) {
    this.GroupIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdServFetch () {
    return this.GroupIdServFetch;
  }
  /** Set the SortOrder for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdServSortOrder (Integer value) {
    this.GroupIdServSort = value;
  }
  /** Retrieve SortOrder for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdServSortOrder () {
    return this.GroupIdServSort;
  }
  /** Set the sort direction for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdServSortDirection (boolean ascending) {
    this.GroupIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdServSortDirection () {
    return this.GroupIdServSortAscending;
  }
  /** Set the field level filters for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupIdServ = value;
  }
  /** Retrieve filter for field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
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

  /** Set the field level Fetch value for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
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

  /** Set the field level Fetch value for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
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

  /** Set the field level Fetch value for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
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

  /** Set the field level Fetch value for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartDtFetch (boolean fetch) {
    this.StartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartDtFetch () {
    return this.StartDtFetch;
  }
  /** Set the SortOrder for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartDtSortOrder (Integer value) {
    this.StartDtSort = value;
  }
  /** Retrieve SortOrder for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartDtSortOrder () {
    return this.StartDtSort;
  }
  /** Set the sort direction for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartDtSortDirection (boolean ascending) {
    this.StartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartDtSortDirection () {
    return this.StartDtSortAscending;
  }
  /** Set the field level filters for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartDtFilter (DateFilter[] value) throws ServiceException {
    this.StartDt = value;
  }
  /** Retrieve filter for field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStartDtFilter () {
    return this.StartDt;
  }

  /**
   * Retrieves the StartDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDtFilter field
   */
  public String[] getStartDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StartDtFilter filter value from a formatted string
   *
   * @param _value the StartDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartDtFilter filter field
   */
  public void setStartDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFilterFromFormattedString");
    try {
      this.setStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFilterFromFormattedString");
  }

  /**
   * Retrieves the StartDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDtFilter field
   */
  public String[] getStartDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartDtFilter filter value from a formatted string
   *
   * @param _value the StartDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartDtFilter filter field
   */
  public void setStartDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
    try {
      this.setStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setEndDtFetch (boolean fetch) {
    this.EndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndDtFetch () {
    return this.EndDtFetch;
  }
  /** Set the SortOrder for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndDtSortOrder (Integer value) {
    this.EndDtSort = value;
  }
  /** Retrieve SortOrder for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndDtSortOrder () {
    return this.EndDtSort;
  }
  /** Set the sort direction for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndDtSortDirection (boolean ascending) {
    this.EndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndDtSortDirection () {
    return this.EndDtSortAscending;
  }
  /** Set the field level filters for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndDtFilter (DateFilter[] value) throws ServiceException {
    this.EndDt = value;
  }
  /** Retrieve filter for field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEndDtFilter () {
    return this.EndDt;
  }

  /**
   * Retrieves the EndDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDtFilter field
   */
  public String[] getEndDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEndDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EndDtFilter filter value from a formatted string
   *
   * @param _value the EndDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EndDtFilter filter field
   */
  public void setEndDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFilterFromFormattedString");
    try {
      this.setEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFilterFromFormattedString");
  }

  /**
   * Retrieves the EndDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDtFilter field
   */
  public String[] getEndDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEndDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EndDtFilter filter value from a formatted string
   *
   * @param _value the EndDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EndDtFilter filter field
   */
  public void setEndDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
    try {
      this.setEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @param fetch whether to fetch this field or not
   */
  public void setConnectReasonFetch (boolean fetch) {
    this.ConnectReasonFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @return boolean the Fetch value for this field
   */
  public boolean getConnectReasonFetch () {
    return this.ConnectReasonFetch;
  }
  /** Set the SortOrder for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConnectReasonSortOrder (Integer value) {
    this.ConnectReasonSort = value;
  }
  /** Retrieve SortOrder for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConnectReasonSortOrder () {
    return this.ConnectReasonSort;
  }
  /** Set the sort direction for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConnectReasonSortDirection (boolean ascending) {
    this.ConnectReasonSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConnectReasonSortDirection () {
    return this.ConnectReasonSortAscending;
  }
  /** Set the field level filters for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConnectReasonFilter (IntegerFilter[] value) throws ServiceException {
    this.ConnectReason = value;
  }
  /** Retrieve filter for field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getConnectReasonFilter () {
    return this.ConnectReason;
  }

  /**
   * Retrieves the ConnectReasonFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConnectReasonFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConnectReasonFilter field
   */
  public String[] getConnectReasonFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReasonFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConnectReasonFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConnectReasonFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConnectReasonFilter filter value from a formatted string
   *
   * @param _value the ConnectReasonFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConnectReasonFilter filter field
   */
  public void setConnectReasonFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConnectReasonFilterFromFormattedString");
    try {
      this.setConnectReasonFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConnectReasonFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConnectReasonFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @param fetch whether to fetch this field or not
   */
  public void setDisconnectReasonFetch (boolean fetch) {
    this.DisconnectReasonFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisconnectReasonFetch () {
    return this.DisconnectReasonFetch;
  }
  /** Set the SortOrder for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisconnectReasonSortOrder (Integer value) {
    this.DisconnectReasonSort = value;
  }
  /** Retrieve SortOrder for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisconnectReasonSortOrder () {
    return this.DisconnectReasonSort;
  }
  /** Set the sort direction for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisconnectReasonSortDirection (boolean ascending) {
    this.DisconnectReasonSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisconnectReasonSortDirection () {
    return this.DisconnectReasonSortAscending;
  }
  /** Set the field level filters for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisconnectReasonFilter (IntegerFilter[] value) throws ServiceException {
    this.DisconnectReason = value;
  }
  /** Retrieve filter for field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDisconnectReasonFilter () {
    return this.DisconnectReason;
  }

  /**
   * Retrieves the DisconnectReasonFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisconnectReasonFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisconnectReasonFilter field
   */
  public String[] getDisconnectReasonFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisconnectReasonFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisconnectReasonFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisconnectReasonFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisconnectReasonFilter filter value from a formatted string
   *
   * @param _value the DisconnectReasonFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisconnectReasonFilter filter field
   */
  public void setDisconnectReasonFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisconnectReasonFilterFromFormattedString");
    try {
      this.setDisconnectReasonFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisconnectReasonFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisconnectReasonFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
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


  /** Set the field level Fetch value for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
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

  /** Set the field level Fetch value for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @param fetch whether to fetch this field or not
   */
  public void setProportionFetch (boolean fetch) {
    this.ProportionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @return boolean the Fetch value for this field
   */
  public boolean getProportionFetch () {
    return this.ProportionFetch;
  }
  /** Set the SortOrder for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProportionSortOrder (Integer value) {
    this.ProportionSort = value;
  }
  /** Retrieve SortOrder for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProportionSortOrder () {
    return this.ProportionSort;
  }
  /** Set the sort direction for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProportionSortDirection (boolean ascending) {
    this.ProportionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProportionSortDirection () {
    return this.ProportionSortAscending;
  }
  /** Set the field level filters for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProportionFilter (IntegerFilter[] value) throws ServiceException {
    this.Proportion = value;
  }
  /** Retrieve filter for field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProportionFilter () {
    return this.Proportion;
  }

  /**
   * Retrieves the ProportionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProportionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProportionFilter field
   */
  public String[] getProportionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProportionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProportionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProportionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProportionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProportionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProportionFilter filter value from a formatted string
   *
   * @param _value the ProportionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProportionFilter filter field
   */
  public void setProportionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProportionFilterFromFormattedString");
    try {
      this.setProportionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProportionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProportionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProportionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Participation (HQ_GROUP_MEMBERS.participation)
   * @param fetch whether to fetch this field or not
   */
  public void setParticipationFetch (boolean fetch) {
    this.ParticipationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Participation (HQ_GROUP_MEMBERS.participation)
   * @return boolean the Fetch value for this field
   */
  public boolean getParticipationFetch () {
    return this.ParticipationFetch;
  }
  /** Set the SortOrder for field: Participation (HQ_GROUP_MEMBERS.participation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParticipationSortOrder (Integer value) {
    this.ParticipationSort = value;
  }
  /** Retrieve SortOrder for field: Participation (HQ_GROUP_MEMBERS.participation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParticipationSortOrder () {
    return this.ParticipationSort;
  }
  /** Set the sort direction for field: Participation (HQ_GROUP_MEMBERS.participation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParticipationSortDirection (boolean ascending) {
    this.ParticipationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Participation (HQ_GROUP_MEMBERS.participation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParticipationSortDirection () {
    return this.ParticipationSortAscending;
  }
  /** Set the field level filters for field: Participation (HQ_GROUP_MEMBERS.participation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParticipationFilter (IntegerFilter[] value) throws ServiceException {
    this.Participation = value;
  }
  /** Retrieve filter for field: Participation (HQ_GROUP_MEMBERS.participation)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParticipationFilter () {
    return this.Participation;
  }

  /**
   * Retrieves the ParticipationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParticipationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParticipationFilter field
   */
  public String[] getParticipationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParticipationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParticipationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParticipationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParticipationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParticipationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParticipationFilter filter value from a formatted string
   *
   * @param _value the ParticipationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParticipationFilter filter field
   */
  public void setParticipationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParticipationFilterFromFormattedString");
    try {
      this.setParticipationFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParticipationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParticipationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParticipationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch) {
    this.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch () {
    return this.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value) {
    this.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder () {
    return this.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending) {
    this.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection () {
    return this.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerId = value;
  }
  /** Retrieve filter for field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerIdFilter () {
    return this.ServerId;
  }

  /**
   * Retrieves the ServerIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServerIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerIdFilter field
   */
  public String[] getServerIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServerIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServerIdFilter filter value from a formatted string
   *
   * @param _value the ServerIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServerIdFilter filter field
   */
  public void setServerIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServerIdFilterFromFormattedString");
    try {
      this.setServerIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFilterFromFormattedString");
  }

  public String toString() {
    return HqGroupMembersObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HqGroupMembersObjectHelper.toMap(this, null);
  }
}
