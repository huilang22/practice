/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupCorridorObjectFilter.java
 * Definition File: Catalog/HqGroupCorridor.xml
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
public class HqGroupCorridorObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HqGroupCorridorObjectKeyFilter Key = null;
  /** raw field for: HQ_GROUP_CORRIDORS.corridor_account_no) */
  public    IntegerFilter[] CorridorAccountNo  = null;
  protected boolean CorridorAccountNoFetch = false;
  protected boolean CorridorAccountNoSortAscending = true;
  protected Integer CorridorAccountNoSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.corridor_subscr_no) */
  public    IntegerFilter[] CorridorSubscrNo  = null;
  protected boolean CorridorSubscrNoFetch = false;
  protected boolean CorridorSubscrNoSortAscending = true;
  protected Integer CorridorSubscrNoSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.corridor_subscr_no_resets) */
  public    IntegerFilter[] CorridorSubscrNoResets  = null;
  protected boolean CorridorSubscrNoResetsFetch = false;
  protected boolean CorridorSubscrNoResetsSortAscending = true;
  protected Integer CorridorSubscrNoResetsSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.server_id) */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.start_dt) */
  public    DateFilter[] StartDt  = null;
  protected boolean StartDtFetch = false;
  protected boolean StartDtSortAscending = true;
  protected Integer StartDtSort = null;
  /** raw field for: HQ_GROUP_CORRIDORS.end_dt) */
  public    DateFilter[] EndDt  = null;
  protected boolean EndDtFetch = false;
  protected boolean EndDtSortAscending = true;
  protected Integer EndDtSort = null;
  private String _objName = "HqGroupCorridorObjectFilter";
  /** default constructor */
  public HqGroupCorridorObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HqGroupCorridorObjectFilter (HqGroupCorridorObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HqGroupCorridorObjectKeyFilter (other.Key);
    this.CorridorAccountNo = other.CorridorAccountNo;
    this.CorridorAccountNoFetch = other.CorridorAccountNoFetch;
    this.CorridorAccountNoSort = other.CorridorAccountNoSort;
    this.CorridorAccountNoSortAscending = other.CorridorAccountNoSortAscending;
    this.CorridorSubscrNo = other.CorridorSubscrNo;
    this.CorridorSubscrNoFetch = other.CorridorSubscrNoFetch;
    this.CorridorSubscrNoSort = other.CorridorSubscrNoSort;
    this.CorridorSubscrNoSortAscending = other.CorridorSubscrNoSortAscending;
    this.CorridorSubscrNoResets = other.CorridorSubscrNoResets;
    this.CorridorSubscrNoResetsFetch = other.CorridorSubscrNoResetsFetch;
    this.CorridorSubscrNoResetsSort = other.CorridorSubscrNoResetsSort;
    this.CorridorSubscrNoResetsSortAscending = other.CorridorSubscrNoResetsSortAscending;
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;
    this.StartDt = other.StartDt;
    this.StartDtFetch = other.StartDtFetch;
    this.StartDtSort = other.StartDtSort;
    this.StartDtSortAscending = other.StartDtSortAscending;
    this.EndDt = other.EndDt;
    this.EndDtFetch = other.EndDtFetch;
    this.EndDtSort = other.EndDtSort;
    this.EndDtSortAscending = other.EndDtSortAscending;  }
  /** get the filter for this object's key
   * @return HqGroupCorridorObjectKeyFilter
   */
  public HqGroupCorridorObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HqGroupCorridorObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdFetch;
  }
  /** Set the SortOrder for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupIdSort;
  }
  /** Set the sort direction for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdSortAscending;
  }
  /** Set the field level filters for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupId = value;
  }
  /** Retrieve filter for field: GroupId (HQ_GROUP_CORRIDORS.group_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupId;
  }
  /** Set the field level Fetch value for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdServFetch;
  }
  /** Set the SortOrder for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupIdServSort = value;
  }
  /** Retrieve SortOrder for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupIdServSort;
  }
  /** Set the sort direction for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdServSortAscending;
  }
  /** Set the field level filters for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.GroupIdServ = value;
  }
  /** Retrieve filter for field: GroupIdServ (HQ_GROUP_CORRIDORS.group_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupIdServ;
  }
  /** Set the field level Fetch value for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (HQ_GROUP_CORRIDORS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupCorridorObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (HQ_GROUP_CORRIDORS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setCorridorAccountNoFetch (boolean fetch) {
    this.CorridorAccountNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getCorridorAccountNoFetch () {
    return this.CorridorAccountNoFetch;
  }
  /** Set the SortOrder for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCorridorAccountNoSortOrder (Integer value) {
    this.CorridorAccountNoSort = value;
  }
  /** Retrieve SortOrder for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCorridorAccountNoSortOrder () {
    return this.CorridorAccountNoSort;
  }
  /** Set the sort direction for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCorridorAccountNoSortDirection (boolean ascending) {
    this.CorridorAccountNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCorridorAccountNoSortDirection () {
    return this.CorridorAccountNoSortAscending;
  }
  /** Set the field level filters for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCorridorAccountNoFilter (IntegerFilter[] value) throws ServiceException {
    this.CorridorAccountNo = value;
  }
  /** Retrieve filter for field: CorridorAccountNo (HQ_GROUP_CORRIDORS.corridor_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCorridorAccountNoFilter () {
    return this.CorridorAccountNo;
  }

  /**
   * Retrieves the CorridorAccountNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CorridorAccountNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorAccountNoFilter field
   */
  public String[] getCorridorAccountNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorAccountNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCorridorAccountNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorAccountNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorAccountNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorAccountNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CorridorAccountNoFilter filter value from a formatted string
   *
   * @param _value the CorridorAccountNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorAccountNoFilter filter field
   */
  public void setCorridorAccountNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorAccountNoFilterFromFormattedString");
    try {
      this.setCorridorAccountNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorAccountNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorAccountNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorAccountNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setCorridorSubscrNoFetch (boolean fetch) {
    this.CorridorSubscrNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getCorridorSubscrNoFetch () {
    return this.CorridorSubscrNoFetch;
  }
  /** Set the SortOrder for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCorridorSubscrNoSortOrder (Integer value) {
    this.CorridorSubscrNoSort = value;
  }
  /** Retrieve SortOrder for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCorridorSubscrNoSortOrder () {
    return this.CorridorSubscrNoSort;
  }
  /** Set the sort direction for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCorridorSubscrNoSortDirection (boolean ascending) {
    this.CorridorSubscrNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCorridorSubscrNoSortDirection () {
    return this.CorridorSubscrNoSortAscending;
  }
  /** Set the field level filters for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCorridorSubscrNoFilter (IntegerFilter[] value) throws ServiceException {
    this.CorridorSubscrNo = value;
  }
  /** Retrieve filter for field: CorridorSubscrNo (HQ_GROUP_CORRIDORS.corridor_subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCorridorSubscrNoFilter () {
    return this.CorridorSubscrNo;
  }

  /**
   * Retrieves the CorridorSubscrNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CorridorSubscrNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorSubscrNoFilter field
   */
  public String[] getCorridorSubscrNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorSubscrNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCorridorSubscrNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorSubscrNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorSubscrNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorSubscrNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CorridorSubscrNoFilter filter value from a formatted string
   *
   * @param _value the CorridorSubscrNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorSubscrNoFilter filter field
   */
  public void setCorridorSubscrNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorSubscrNoFilterFromFormattedString");
    try {
      this.setCorridorSubscrNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorSubscrNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorSubscrNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorSubscrNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setCorridorSubscrNoResetsFetch (boolean fetch) {
    this.CorridorSubscrNoResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getCorridorSubscrNoResetsFetch () {
    return this.CorridorSubscrNoResetsFetch;
  }
  /** Set the SortOrder for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCorridorSubscrNoResetsSortOrder (Integer value) {
    this.CorridorSubscrNoResetsSort = value;
  }
  /** Retrieve SortOrder for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCorridorSubscrNoResetsSortOrder () {
    return this.CorridorSubscrNoResetsSort;
  }
  /** Set the sort direction for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCorridorSubscrNoResetsSortDirection (boolean ascending) {
    this.CorridorSubscrNoResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCorridorSubscrNoResetsSortDirection () {
    return this.CorridorSubscrNoResetsSortAscending;
  }
  /** Set the field level filters for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCorridorSubscrNoResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.CorridorSubscrNoResets = value;
  }
  /** Retrieve filter for field: CorridorSubscrNoResets (HQ_GROUP_CORRIDORS.corridor_subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCorridorSubscrNoResetsFilter () {
    return this.CorridorSubscrNoResets;
  }

  /**
   * Retrieves the CorridorSubscrNoResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CorridorSubscrNoResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorSubscrNoResetsFilter field
   */
  public String[] getCorridorSubscrNoResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorSubscrNoResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCorridorSubscrNoResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorSubscrNoResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorSubscrNoResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorSubscrNoResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CorridorSubscrNoResetsFilter filter value from a formatted string
   *
   * @param _value the CorridorSubscrNoResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorSubscrNoResetsFilter filter field
   */
  public void setCorridorSubscrNoResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorSubscrNoResetsFilterFromFormattedString");
    try {
      this.setCorridorSubscrNoResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorSubscrNoResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorSubscrNoResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorSubscrNoResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch) {
    this.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch () {
    return this.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value) {
    this.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder () {
    return this.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending) {
    this.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection () {
    return this.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerId = value;
  }
  /** Retrieve filter for field: ServerId (HQ_GROUP_CORRIDORS.server_id)
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

  /** Set the field level Fetch value for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartDtFetch (boolean fetch) {
    this.StartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartDtFetch () {
    return this.StartDtFetch;
  }
  /** Set the SortOrder for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartDtSortOrder (Integer value) {
    this.StartDtSort = value;
  }
  /** Retrieve SortOrder for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartDtSortOrder () {
    return this.StartDtSort;
  }
  /** Set the sort direction for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartDtSortDirection (boolean ascending) {
    this.StartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartDtSortDirection () {
    return this.StartDtSortAscending;
  }
  /** Set the field level filters for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartDtFilter (DateFilter[] value) throws ServiceException {
    this.StartDt = value;
  }
  /** Retrieve filter for field: StartDt (HQ_GROUP_CORRIDORS.start_dt)
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


  /** Set the field level Fetch value for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setEndDtFetch (boolean fetch) {
    this.EndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndDtFetch () {
    return this.EndDtFetch;
  }
  /** Set the SortOrder for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndDtSortOrder (Integer value) {
    this.EndDtSort = value;
  }
  /** Retrieve SortOrder for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndDtSortOrder () {
    return this.EndDtSort;
  }
  /** Set the sort direction for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndDtSortDirection (boolean ascending) {
    this.EndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndDtSortDirection () {
    return this.EndDtSortAscending;
  }
  /** Set the field level filters for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndDtFilter (DateFilter[] value) throws ServiceException {
    this.EndDt = value;
  }
  /** Retrieve filter for field: EndDt (HQ_GROUP_CORRIDORS.end_dt)
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


  public String toString() {
    return HqGroupCorridorObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HqGroupCorridorObjectHelper.toMap(this, null);
  }
}
