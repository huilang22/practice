/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupContractsObjectFilter.java
 * Definition File: Catalog/HqGroupContracts.xml
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
public class HqGroupContractsObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HqGroupContractsObjectKeyFilter Key = null;
  /** raw field for: HQ_GROUP_CONTRACTS.group_id) */
  public    IntegerFilter[] GroupId  = null;
  protected boolean GroupIdFetch = false;
  protected boolean GroupIdSortAscending = true;
  protected Integer GroupIdSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.group_id_serv) */
  public    IntegerFilter[] GroupIdServ  = null;
  protected boolean GroupIdServFetch = false;
  protected boolean GroupIdServSortAscending = true;
  protected Integer GroupIdServSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.contract_type) */
  public    IntegerFilter[] ContractType  = null;
  protected boolean ContractTypeFetch = false;
  protected boolean ContractTypeSortAscending = true;
  protected Integer ContractTypeSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.start_dt) */
  public    DateFilter[] StartDt  = null;
  protected boolean StartDtFetch = false;
  protected boolean StartDtSortAscending = true;
  protected Integer StartDtSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.end_dt) */
  public    DateFilter[] EndDt  = null;
  protected boolean EndDtFetch = false;
  protected boolean EndDtSortAscending = true;
  protected Integer EndDtSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.contract_level) */
  public    IntegerFilter[] ContractLevel  = null;
  protected boolean ContractLevelFetch = false;
  protected boolean ContractLevelSortAscending = true;
  protected Integer ContractLevelSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.server_id) */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.cntrct_parent_account_no) */
  public    IntegerFilter[] CntrctParentAccountNo  = null;
  protected boolean CntrctParentAccountNoFetch = false;
  protected boolean CntrctParentAccountNoSortAscending = true;
  protected Integer CntrctParentAccountNoSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no) */
  public    IntegerFilter[] CntrctParentSubscrNo  = null;
  protected boolean CntrctParentSubscrNoFetch = false;
  protected boolean CntrctParentSubscrNoSortAscending = true;
  protected Integer CntrctParentSubscrNoSort = null;
  /** raw field for: HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets) */
  public    IntegerFilter[] CntrctParentSubscrNoResets  = null;
  protected boolean CntrctParentSubscrNoResetsFetch = false;
  protected boolean CntrctParentSubscrNoResetsSortAscending = true;
  protected Integer CntrctParentSubscrNoResetsSort = null;
  private String _objName = "HqGroupContractsObjectFilter";
  /** default constructor */
  public HqGroupContractsObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HqGroupContractsObjectFilter (HqGroupContractsObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HqGroupContractsObjectKeyFilter (other.Key);
    this.GroupId = other.GroupId;
    this.GroupIdFetch = other.GroupIdFetch;
    this.GroupIdSort = other.GroupIdSort;
    this.GroupIdSortAscending = other.GroupIdSortAscending;
    this.GroupIdServ = other.GroupIdServ;
    this.GroupIdServFetch = other.GroupIdServFetch;
    this.GroupIdServSort = other.GroupIdServSort;
    this.GroupIdServSortAscending = other.GroupIdServSortAscending;
    this.ContractType = other.ContractType;
    this.ContractTypeFetch = other.ContractTypeFetch;
    this.ContractTypeSort = other.ContractTypeSort;
    this.ContractTypeSortAscending = other.ContractTypeSortAscending;
    this.StartDt = other.StartDt;
    this.StartDtFetch = other.StartDtFetch;
    this.StartDtSort = other.StartDtSort;
    this.StartDtSortAscending = other.StartDtSortAscending;
    this.EndDt = other.EndDt;
    this.EndDtFetch = other.EndDtFetch;
    this.EndDtSort = other.EndDtSort;
    this.EndDtSortAscending = other.EndDtSortAscending;
    this.ContractLevel = other.ContractLevel;
    this.ContractLevelFetch = other.ContractLevelFetch;
    this.ContractLevelSort = other.ContractLevelSort;
    this.ContractLevelSortAscending = other.ContractLevelSortAscending;
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;
    this.CntrctParentAccountNo = other.CntrctParentAccountNo;
    this.CntrctParentAccountNoFetch = other.CntrctParentAccountNoFetch;
    this.CntrctParentAccountNoSort = other.CntrctParentAccountNoSort;
    this.CntrctParentAccountNoSortAscending = other.CntrctParentAccountNoSortAscending;
    this.CntrctParentSubscrNo = other.CntrctParentSubscrNo;
    this.CntrctParentSubscrNoFetch = other.CntrctParentSubscrNoFetch;
    this.CntrctParentSubscrNoSort = other.CntrctParentSubscrNoSort;
    this.CntrctParentSubscrNoSortAscending = other.CntrctParentSubscrNoSortAscending;
    this.CntrctParentSubscrNoResets = other.CntrctParentSubscrNoResets;
    this.CntrctParentSubscrNoResetsFetch = other.CntrctParentSubscrNoResetsFetch;
    this.CntrctParentSubscrNoResetsSort = other.CntrctParentSubscrNoResetsSort;
    this.CntrctParentSubscrNoResetsSortAscending = other.CntrctParentSubscrNoResetsSortAscending;  }
  /** get the filter for this object's key
   * @return HqGroupContractsObjectKeyFilter
   */
  public HqGroupContractsObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HqGroupContractsObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdFetch (boolean fetch) {
    this.GroupIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdFetch () {
    return this.GroupIdFetch;
  }
  /** Set the SortOrder for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdSortOrder (Integer value) {
    this.GroupIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdSortOrder () {
    return this.GroupIdSort;
  }
  /** Set the sort direction for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdSortDirection (boolean ascending) {
    this.GroupIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdSortDirection () {
    return this.GroupIdSortAscending;
  }
  /** Set the field level filters for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupId = value;
  }
  /** Retrieve filter for field: GroupId (HQ_GROUP_CONTRACTS.group_id)
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

  /** Set the field level Fetch value for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdServFetch (boolean fetch) {
    this.GroupIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdServFetch () {
    return this.GroupIdServFetch;
  }
  /** Set the SortOrder for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdServSortOrder (Integer value) {
    this.GroupIdServSort = value;
  }
  /** Retrieve SortOrder for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdServSortOrder () {
    return this.GroupIdServSort;
  }
  /** Set the sort direction for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdServSortDirection (boolean ascending) {
    this.GroupIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdServSortDirection () {
    return this.GroupIdServSortAscending;
  }
  /** Set the field level filters for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupIdServ = value;
  }
  /** Retrieve filter for field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
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

  /** Set the field level Fetch value for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTypeFetch (boolean fetch) {
    this.ContractTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTypeFetch () {
    return this.ContractTypeFetch;
  }
  /** Set the SortOrder for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTypeSortOrder (Integer value) {
    this.ContractTypeSort = value;
  }
  /** Retrieve SortOrder for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTypeSortOrder () {
    return this.ContractTypeSort;
  }
  /** Set the sort direction for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTypeSortDirection (boolean ascending) {
    this.ContractTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTypeSortDirection () {
    return this.ContractTypeSortAscending;
  }
  /** Set the field level filters for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractType = value;
  }
  /** Retrieve filter for field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTypeFilter () {
    return this.ContractType;
  }

  /**
   * Retrieves the ContractTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTypeFilter field
   */
  public String[] getContractTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTypeFilter filter value from a formatted string
   *
   * @param _value the ContractTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTypeFilter filter field
   */
  public void setContractTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFilterFromFormattedString");
    try {
      this.setContractTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartDtFetch (boolean fetch) {
    this.StartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartDtFetch () {
    return this.StartDtFetch;
  }
  /** Set the SortOrder for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartDtSortOrder (Integer value) {
    this.StartDtSort = value;
  }
  /** Retrieve SortOrder for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartDtSortOrder () {
    return this.StartDtSort;
  }
  /** Set the sort direction for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartDtSortDirection (boolean ascending) {
    this.StartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartDtSortDirection () {
    return this.StartDtSortAscending;
  }
  /** Set the field level filters for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartDtFilter (DateFilter[] value) throws ServiceException {
    this.StartDt = value;
  }
  /** Retrieve filter for field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
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


  /** Set the field level Fetch value for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setEndDtFetch (boolean fetch) {
    this.EndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndDtFetch () {
    return this.EndDtFetch;
  }
  /** Set the SortOrder for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndDtSortOrder (Integer value) {
    this.EndDtSort = value;
  }
  /** Retrieve SortOrder for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndDtSortOrder () {
    return this.EndDtSort;
  }
  /** Set the sort direction for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndDtSortDirection (boolean ascending) {
    this.EndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndDtSortDirection () {
    return this.EndDtSortAscending;
  }
  /** Set the field level filters for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndDtFilter (DateFilter[] value) throws ServiceException {
    this.EndDt = value;
  }
  /** Retrieve filter for field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
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


  /** Set the field level Fetch value for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @param fetch whether to fetch this field or not
   */
  public void setContractLevelFetch (boolean fetch) {
    this.ContractLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractLevelFetch () {
    return this.ContractLevelFetch;
  }
  /** Set the SortOrder for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractLevelSortOrder (Integer value) {
    this.ContractLevelSort = value;
  }
  /** Retrieve SortOrder for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractLevelSortOrder () {
    return this.ContractLevelSort;
  }
  /** Set the sort direction for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractLevelSortDirection (boolean ascending) {
    this.ContractLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractLevelSortDirection () {
    return this.ContractLevelSortAscending;
  }
  /** Set the field level filters for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractLevel = value;
  }
  /** Retrieve filter for field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractLevelFilter () {
    return this.ContractLevel;
  }

  /**
   * Retrieves the ContractLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractLevelFilter field
   */
  public String[] getContractLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractLevelFilter filter value from a formatted string
   *
   * @param _value the ContractLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractLevelFilter filter field
   */
  public void setContractLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractLevelFilterFromFormattedString");
    try {
      this.setContractLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch) {
    this.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch () {
    return this.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value) {
    this.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder () {
    return this.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending) {
    this.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection () {
    return this.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerId = value;
  }
  /** Retrieve filter for field: ServerId (HQ_GROUP_CONTRACTS.server_id)
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

  /** Set the field level Fetch value for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setCntrctParentAccountNoFetch (boolean fetch) {
    this.CntrctParentAccountNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getCntrctParentAccountNoFetch () {
    return this.CntrctParentAccountNoFetch;
  }
  /** Set the SortOrder for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCntrctParentAccountNoSortOrder (Integer value) {
    this.CntrctParentAccountNoSort = value;
  }
  /** Retrieve SortOrder for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCntrctParentAccountNoSortOrder () {
    return this.CntrctParentAccountNoSort;
  }
  /** Set the sort direction for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCntrctParentAccountNoSortDirection (boolean ascending) {
    this.CntrctParentAccountNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCntrctParentAccountNoSortDirection () {
    return this.CntrctParentAccountNoSortAscending;
  }
  /** Set the field level filters for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCntrctParentAccountNoFilter (IntegerFilter[] value) throws ServiceException {
    this.CntrctParentAccountNo = value;
  }
  /** Retrieve filter for field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCntrctParentAccountNoFilter () {
    return this.CntrctParentAccountNo;
  }

  /**
   * Retrieves the CntrctParentAccountNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CntrctParentAccountNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CntrctParentAccountNoFilter field
   */
  public String[] getCntrctParentAccountNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentAccountNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCntrctParentAccountNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCntrctParentAccountNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CntrctParentAccountNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCntrctParentAccountNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CntrctParentAccountNoFilter filter value from a formatted string
   *
   * @param _value the CntrctParentAccountNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CntrctParentAccountNoFilter filter field
   */
  public void setCntrctParentAccountNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCntrctParentAccountNoFilterFromFormattedString");
    try {
      this.setCntrctParentAccountNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CntrctParentAccountNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCntrctParentAccountNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCntrctParentAccountNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setCntrctParentSubscrNoFetch (boolean fetch) {
    this.CntrctParentSubscrNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getCntrctParentSubscrNoFetch () {
    return this.CntrctParentSubscrNoFetch;
  }
  /** Set the SortOrder for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCntrctParentSubscrNoSortOrder (Integer value) {
    this.CntrctParentSubscrNoSort = value;
  }
  /** Retrieve SortOrder for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCntrctParentSubscrNoSortOrder () {
    return this.CntrctParentSubscrNoSort;
  }
  /** Set the sort direction for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCntrctParentSubscrNoSortDirection (boolean ascending) {
    this.CntrctParentSubscrNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCntrctParentSubscrNoSortDirection () {
    return this.CntrctParentSubscrNoSortAscending;
  }
  /** Set the field level filters for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCntrctParentSubscrNoFilter (IntegerFilter[] value) throws ServiceException {
    this.CntrctParentSubscrNo = value;
  }
  /** Retrieve filter for field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCntrctParentSubscrNoFilter () {
    return this.CntrctParentSubscrNo;
  }

  /**
   * Retrieves the CntrctParentSubscrNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CntrctParentSubscrNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CntrctParentSubscrNoFilter field
   */
  public String[] getCntrctParentSubscrNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentSubscrNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCntrctParentSubscrNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCntrctParentSubscrNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CntrctParentSubscrNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCntrctParentSubscrNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CntrctParentSubscrNoFilter filter value from a formatted string
   *
   * @param _value the CntrctParentSubscrNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CntrctParentSubscrNoFilter filter field
   */
  public void setCntrctParentSubscrNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCntrctParentSubscrNoFilterFromFormattedString");
    try {
      this.setCntrctParentSubscrNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CntrctParentSubscrNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCntrctParentSubscrNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCntrctParentSubscrNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setCntrctParentSubscrNoResetsFetch (boolean fetch) {
    this.CntrctParentSubscrNoResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getCntrctParentSubscrNoResetsFetch () {
    return this.CntrctParentSubscrNoResetsFetch;
  }
  /** Set the SortOrder for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCntrctParentSubscrNoResetsSortOrder (Integer value) {
    this.CntrctParentSubscrNoResetsSort = value;
  }
  /** Retrieve SortOrder for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCntrctParentSubscrNoResetsSortOrder () {
    return this.CntrctParentSubscrNoResetsSort;
  }
  /** Set the sort direction for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCntrctParentSubscrNoResetsSortDirection (boolean ascending) {
    this.CntrctParentSubscrNoResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCntrctParentSubscrNoResetsSortDirection () {
    return this.CntrctParentSubscrNoResetsSortAscending;
  }
  /** Set the field level filters for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCntrctParentSubscrNoResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.CntrctParentSubscrNoResets = value;
  }
  /** Retrieve filter for field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCntrctParentSubscrNoResetsFilter () {
    return this.CntrctParentSubscrNoResets;
  }

  /**
   * Retrieves the CntrctParentSubscrNoResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CntrctParentSubscrNoResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CntrctParentSubscrNoResetsFilter field
   */
  public String[] getCntrctParentSubscrNoResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentSubscrNoResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCntrctParentSubscrNoResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCntrctParentSubscrNoResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CntrctParentSubscrNoResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCntrctParentSubscrNoResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CntrctParentSubscrNoResetsFilter filter value from a formatted string
   *
   * @param _value the CntrctParentSubscrNoResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CntrctParentSubscrNoResetsFilter filter field
   */
  public void setCntrctParentSubscrNoResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCntrctParentSubscrNoResetsFilterFromFormattedString");
    try {
      this.setCntrctParentSubscrNoResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CntrctParentSubscrNoResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCntrctParentSubscrNoResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCntrctParentSubscrNoResetsFilterFromFormattedString");
  }

  public String toString() {
    return HqGroupContractsObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HqGroupContractsObjectHelper.toMap(this, null);
  }
}
