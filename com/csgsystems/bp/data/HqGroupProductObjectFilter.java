/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupProductObjectFilter.java
 * Definition File: Catalog/HqGroupProduct.xml
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
public class HqGroupProductObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HqGroupProductObjectKeyFilter Key = null;
  /** raw field for: HQ_GROUP_PRODUCTS.prdct_parent_account_no) */
  public    IntegerFilter[] PrdctParentAccountNo  = null;
  protected boolean PrdctParentAccountNoFetch = false;
  protected boolean PrdctParentAccountNoSortAscending = true;
  protected Integer PrdctParentAccountNoSort = null;
  /** raw field for: HQ_GROUP_PRODUCTS.prdct_parent_subscr_no) */
  public    IntegerFilter[] PrdctParentSubscrNo  = null;
  protected boolean PrdctParentSubscrNoFetch = false;
  protected boolean PrdctParentSubscrNoSortAscending = true;
  protected Integer PrdctParentSubscrNoSort = null;
  /** raw field for: HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets) */
  public    IntegerFilter[] PrdctParentSubscrNoResets  = null;
  protected boolean PrdctParentSubscrNoResetsFetch = false;
  protected boolean PrdctParentSubscrNoResetsSortAscending = true;
  protected Integer PrdctParentSubscrNoResetsSort = null;
  /** raw field for: HQ_GROUP_PRODUCTS.server_id) */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: HQ_GROUP_PRODUCTS.start_dt) */
  public    DateFilter[] StartDt  = null;
  protected boolean StartDtFetch = false;
  protected boolean StartDtSortAscending = true;
  protected Integer StartDtSort = null;
  /** raw field for: HQ_GROUP_PRODUCTS.end_dt) */
  public    DateFilter[] EndDt  = null;
  protected boolean EndDtFetch = false;
  protected boolean EndDtSortAscending = true;
  protected Integer EndDtSort = null;
  private String _objName = "HqGroupProductObjectFilter";
  /** default constructor */
  public HqGroupProductObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HqGroupProductObjectFilter (HqGroupProductObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HqGroupProductObjectKeyFilter (other.Key);
    this.PrdctParentAccountNo = other.PrdctParentAccountNo;
    this.PrdctParentAccountNoFetch = other.PrdctParentAccountNoFetch;
    this.PrdctParentAccountNoSort = other.PrdctParentAccountNoSort;
    this.PrdctParentAccountNoSortAscending = other.PrdctParentAccountNoSortAscending;
    this.PrdctParentSubscrNo = other.PrdctParentSubscrNo;
    this.PrdctParentSubscrNoFetch = other.PrdctParentSubscrNoFetch;
    this.PrdctParentSubscrNoSort = other.PrdctParentSubscrNoSort;
    this.PrdctParentSubscrNoSortAscending = other.PrdctParentSubscrNoSortAscending;
    this.PrdctParentSubscrNoResets = other.PrdctParentSubscrNoResets;
    this.PrdctParentSubscrNoResetsFetch = other.PrdctParentSubscrNoResetsFetch;
    this.PrdctParentSubscrNoResetsSort = other.PrdctParentSubscrNoResetsSort;
    this.PrdctParentSubscrNoResetsSortAscending = other.PrdctParentSubscrNoResetsSortAscending;
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
   * @return HqGroupProductObjectKeyFilter
   */
  public HqGroupProductObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HqGroupProductObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdFetch;
  }
  /** Set the SortOrder for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupIdSort;
  }
  /** Set the sort direction for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdSortAscending;
  }
  /** Set the field level filters for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupId = value;
  }
  /** Retrieve filter for field: GroupId (HQ_GROUP_PRODUCTS.group_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupId;
  }
  /** Set the field level Fetch value for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdServFetch;
  }
  /** Set the SortOrder for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupIdServSort = value;
  }
  /** Retrieve SortOrder for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupIdServSort;
  }
  /** Set the sort direction for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GroupIdServSortAscending;
  }
  /** Set the field level filters for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.GroupIdServ = value;
  }
  /** Retrieve filter for field: GroupIdServ (HQ_GROUP_PRODUCTS.group_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GroupIdServ;
  }
  /** Set the field level Fetch value for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (HQ_GROUP_PRODUCTS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupProductObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (HQ_GROUP_PRODUCTS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setPrdctParentAccountNoFetch (boolean fetch) {
    this.PrdctParentAccountNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrdctParentAccountNoFetch () {
    return this.PrdctParentAccountNoFetch;
  }
  /** Set the SortOrder for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrdctParentAccountNoSortOrder (Integer value) {
    this.PrdctParentAccountNoSort = value;
  }
  /** Retrieve SortOrder for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrdctParentAccountNoSortOrder () {
    return this.PrdctParentAccountNoSort;
  }
  /** Set the sort direction for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrdctParentAccountNoSortDirection (boolean ascending) {
    this.PrdctParentAccountNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrdctParentAccountNoSortDirection () {
    return this.PrdctParentAccountNoSortAscending;
  }
  /** Set the field level filters for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrdctParentAccountNoFilter (IntegerFilter[] value) throws ServiceException {
    this.PrdctParentAccountNo = value;
  }
  /** Retrieve filter for field: PrdctParentAccountNo (HQ_GROUP_PRODUCTS.prdct_parent_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrdctParentAccountNoFilter () {
    return this.PrdctParentAccountNo;
  }

  /**
   * Retrieves the PrdctParentAccountNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrdctParentAccountNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrdctParentAccountNoFilter field
   */
  public String[] getPrdctParentAccountNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentAccountNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrdctParentAccountNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrdctParentAccountNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrdctParentAccountNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrdctParentAccountNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrdctParentAccountNoFilter filter value from a formatted string
   *
   * @param _value the PrdctParentAccountNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrdctParentAccountNoFilter filter field
   */
  public void setPrdctParentAccountNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrdctParentAccountNoFilterFromFormattedString");
    try {
      this.setPrdctParentAccountNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrdctParentAccountNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrdctParentAccountNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrdctParentAccountNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setPrdctParentSubscrNoFetch (boolean fetch) {
    this.PrdctParentSubscrNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrdctParentSubscrNoFetch () {
    return this.PrdctParentSubscrNoFetch;
  }
  /** Set the SortOrder for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrdctParentSubscrNoSortOrder (Integer value) {
    this.PrdctParentSubscrNoSort = value;
  }
  /** Retrieve SortOrder for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrdctParentSubscrNoSortOrder () {
    return this.PrdctParentSubscrNoSort;
  }
  /** Set the sort direction for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrdctParentSubscrNoSortDirection (boolean ascending) {
    this.PrdctParentSubscrNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrdctParentSubscrNoSortDirection () {
    return this.PrdctParentSubscrNoSortAscending;
  }
  /** Set the field level filters for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrdctParentSubscrNoFilter (IntegerFilter[] value) throws ServiceException {
    this.PrdctParentSubscrNo = value;
  }
  /** Retrieve filter for field: PrdctParentSubscrNo (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrdctParentSubscrNoFilter () {
    return this.PrdctParentSubscrNo;
  }

  /**
   * Retrieves the PrdctParentSubscrNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrdctParentSubscrNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrdctParentSubscrNoFilter field
   */
  public String[] getPrdctParentSubscrNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentSubscrNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrdctParentSubscrNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrdctParentSubscrNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrdctParentSubscrNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrdctParentSubscrNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrdctParentSubscrNoFilter filter value from a formatted string
   *
   * @param _value the PrdctParentSubscrNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrdctParentSubscrNoFilter filter field
   */
  public void setPrdctParentSubscrNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrdctParentSubscrNoFilterFromFormattedString");
    try {
      this.setPrdctParentSubscrNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrdctParentSubscrNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrdctParentSubscrNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrdctParentSubscrNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setPrdctParentSubscrNoResetsFetch (boolean fetch) {
    this.PrdctParentSubscrNoResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrdctParentSubscrNoResetsFetch () {
    return this.PrdctParentSubscrNoResetsFetch;
  }
  /** Set the SortOrder for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrdctParentSubscrNoResetsSortOrder (Integer value) {
    this.PrdctParentSubscrNoResetsSort = value;
  }
  /** Retrieve SortOrder for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrdctParentSubscrNoResetsSortOrder () {
    return this.PrdctParentSubscrNoResetsSort;
  }
  /** Set the sort direction for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrdctParentSubscrNoResetsSortDirection (boolean ascending) {
    this.PrdctParentSubscrNoResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrdctParentSubscrNoResetsSortDirection () {
    return this.PrdctParentSubscrNoResetsSortAscending;
  }
  /** Set the field level filters for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrdctParentSubscrNoResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.PrdctParentSubscrNoResets = value;
  }
  /** Retrieve filter for field: PrdctParentSubscrNoResets (HQ_GROUP_PRODUCTS.prdct_parent_subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrdctParentSubscrNoResetsFilter () {
    return this.PrdctParentSubscrNoResets;
  }

  /**
   * Retrieves the PrdctParentSubscrNoResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrdctParentSubscrNoResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrdctParentSubscrNoResetsFilter field
   */
  public String[] getPrdctParentSubscrNoResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrdctParentSubscrNoResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrdctParentSubscrNoResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrdctParentSubscrNoResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrdctParentSubscrNoResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrdctParentSubscrNoResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrdctParentSubscrNoResetsFilter filter value from a formatted string
   *
   * @param _value the PrdctParentSubscrNoResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrdctParentSubscrNoResetsFilter filter field
   */
  public void setPrdctParentSubscrNoResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrdctParentSubscrNoResetsFilterFromFormattedString");
    try {
      this.setPrdctParentSubscrNoResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrdctParentSubscrNoResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrdctParentSubscrNoResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrdctParentSubscrNoResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch) {
    this.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch () {
    return this.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value) {
    this.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder () {
    return this.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending) {
    this.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection () {
    return this.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerId = value;
  }
  /** Retrieve filter for field: ServerId (HQ_GROUP_PRODUCTS.server_id)
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

  /** Set the field level Fetch value for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartDtFetch (boolean fetch) {
    this.StartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartDtFetch () {
    return this.StartDtFetch;
  }
  /** Set the SortOrder for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartDtSortOrder (Integer value) {
    this.StartDtSort = value;
  }
  /** Retrieve SortOrder for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartDtSortOrder () {
    return this.StartDtSort;
  }
  /** Set the sort direction for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartDtSortDirection (boolean ascending) {
    this.StartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartDtSortDirection () {
    return this.StartDtSortAscending;
  }
  /** Set the field level filters for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartDtFilter (DateFilter[] value) throws ServiceException {
    this.StartDt = value;
  }
  /** Retrieve filter for field: StartDt (HQ_GROUP_PRODUCTS.start_dt)
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


  /** Set the field level Fetch value for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setEndDtFetch (boolean fetch) {
    this.EndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndDtFetch () {
    return this.EndDtFetch;
  }
  /** Set the SortOrder for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndDtSortOrder (Integer value) {
    this.EndDtSort = value;
  }
  /** Retrieve SortOrder for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndDtSortOrder () {
    return this.EndDtSort;
  }
  /** Set the sort direction for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndDtSortDirection (boolean ascending) {
    this.EndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndDtSortDirection () {
    return this.EndDtSortAscending;
  }
  /** Set the field level filters for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndDtFilter (DateFilter[] value) throws ServiceException {
    this.EndDt = value;
  }
  /** Retrieve filter for field: EndDt (HQ_GROUP_PRODUCTS.end_dt)
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
    return HqGroupProductObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HqGroupProductObjectHelper.toMap(this, null);
  }
}
