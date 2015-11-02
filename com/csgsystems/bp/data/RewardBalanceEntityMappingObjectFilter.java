/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RewardBalanceEntityMappingObjectFilter.java
 * Definition File: Admin/RewardBalanceEntityMapping.xml
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
public class RewardBalanceEntityMappingObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public RewardBalanceEntityMappingObjectKeyFilter Key = null;
  /** raw field for: REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id) */
  public    IntegerFilter[] RewardBalanceId  = null;
  protected boolean RewardBalanceIdFetch = false;
  protected boolean RewardBalanceIdSortAscending = true;
  protected Integer RewardBalanceIdSort = null;
  /** raw field for: REWARD_BALANCE_ENTITY_MAPPING.entity_id1) */
  public    IntegerFilter[] EntityId1  = null;
  protected boolean EntityId1Fetch = false;
  protected boolean EntityId1SortAscending = true;
  protected Integer EntityId1Sort = null;
  /** raw field for: REWARD_BALANCE_ENTITY_MAPPING.entity_id2) */
  public    IntegerFilter[] EntityId2  = null;
  protected boolean EntityId2Fetch = false;
  protected boolean EntityId2SortAscending = true;
  protected Integer EntityId2Sort = null;
  /** raw field for: REWARD_BALANCE_ENTITY_MAPPING.entity_id3) */
  public    IntegerFilter[] EntityId3  = null;
  protected boolean EntityId3Fetch = false;
  protected boolean EntityId3SortAscending = true;
  protected Integer EntityId3Sort = null;
  private String _objName = "RewardBalanceEntityMappingObjectFilter";
  /** default constructor */
  public RewardBalanceEntityMappingObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public RewardBalanceEntityMappingObjectFilter (RewardBalanceEntityMappingObjectFilter other)
  {
    if (other == null) return;
    this.Key = new RewardBalanceEntityMappingObjectKeyFilter (other.Key);
    this.RewardBalanceId = other.RewardBalanceId;
    this.RewardBalanceIdFetch = other.RewardBalanceIdFetch;
    this.RewardBalanceIdSort = other.RewardBalanceIdSort;
    this.RewardBalanceIdSortAscending = other.RewardBalanceIdSortAscending;
    this.EntityId1 = other.EntityId1;
    this.EntityId1Fetch = other.EntityId1Fetch;
    this.EntityId1Sort = other.EntityId1Sort;
    this.EntityId1SortAscending = other.EntityId1SortAscending;
    this.EntityId2 = other.EntityId2;
    this.EntityId2Fetch = other.EntityId2Fetch;
    this.EntityId2Sort = other.EntityId2Sort;
    this.EntityId2SortAscending = other.EntityId2SortAscending;
    this.EntityId3 = other.EntityId3;
    this.EntityId3Fetch = other.EntityId3Fetch;
    this.EntityId3Sort = other.EntityId3Sort;
    this.EntityId3SortAscending = other.EntityId3SortAscending;  }
  /** get the filter for this object's key
   * @return RewardBalanceEntityMappingObjectKeyFilter
   */
  public RewardBalanceEntityMappingObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (RewardBalanceEntityMappingObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRewardBalanceIdFetch (boolean fetch) {
    this.RewardBalanceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRewardBalanceIdFetch () {
    return this.RewardBalanceIdFetch;
  }
  /** Set the SortOrder for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRewardBalanceIdSortOrder (Integer value) {
    this.RewardBalanceIdSort = value;
  }
  /** Retrieve SortOrder for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRewardBalanceIdSortOrder () {
    return this.RewardBalanceIdSort;
  }
  /** Set the sort direction for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRewardBalanceIdSortDirection (boolean ascending) {
    this.RewardBalanceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRewardBalanceIdSortDirection () {
    return this.RewardBalanceIdSortAscending;
  }
  /** Set the field level filters for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRewardBalanceIdFilter (IntegerFilter[] value) throws ServiceException {
    this.RewardBalanceId = value;
  }
  /** Retrieve filter for field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRewardBalanceIdFilter () {
    return this.RewardBalanceId;
  }

  /**
   * Retrieves the RewardBalanceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RewardBalanceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RewardBalanceIdFilter field
   */
  public String[] getRewardBalanceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRewardBalanceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RewardBalanceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRewardBalanceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RewardBalanceIdFilter filter value from a formatted string
   *
   * @param _value the RewardBalanceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RewardBalanceIdFilter filter field
   */
  public void setRewardBalanceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRewardBalanceIdFilterFromFormattedString");
    try {
      this.setRewardBalanceIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RewardBalanceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRewardBalanceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRewardBalanceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @param fetch whether to fetch this field or not
   */
  public void setEntityId1Fetch (boolean fetch) {
    this.EntityId1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @return boolean the Fetch value for this field
   */
  public boolean getEntityId1Fetch () {
    return this.EntityId1Fetch;
  }
  /** Set the SortOrder for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEntityId1SortOrder (Integer value) {
    this.EntityId1Sort = value;
  }
  /** Retrieve SortOrder for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEntityId1SortOrder () {
    return this.EntityId1Sort;
  }
  /** Set the sort direction for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEntityId1SortDirection (boolean ascending) {
    this.EntityId1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEntityId1SortDirection () {
    return this.EntityId1SortAscending;
  }
  /** Set the field level filters for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEntityId1Filter (IntegerFilter[] value) throws ServiceException {
    this.EntityId1 = value;
  }
  /** Retrieve filter for field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEntityId1Filter () {
    return this.EntityId1;
  }

  /**
   * Retrieves the EntityId1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntityId1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityId1Filter field
   */
  public String[] getEntityId1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntityId1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityId1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityId1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityId1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EntityId1Filter filter value from a formatted string
   *
   * @param _value the EntityId1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntityId1Filter filter field
   */
  public void setEntityId1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntityId1FilterFromFormattedString");
    try {
      this.setEntityId1Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityId1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityId1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityId1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setEntityId2Fetch (boolean fetch) {
    this.EntityId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getEntityId2Fetch () {
    return this.EntityId2Fetch;
  }
  /** Set the SortOrder for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEntityId2SortOrder (Integer value) {
    this.EntityId2Sort = value;
  }
  /** Retrieve SortOrder for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEntityId2SortOrder () {
    return this.EntityId2Sort;
  }
  /** Set the sort direction for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEntityId2SortDirection (boolean ascending) {
    this.EntityId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEntityId2SortDirection () {
    return this.EntityId2SortAscending;
  }
  /** Set the field level filters for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEntityId2Filter (IntegerFilter[] value) throws ServiceException {
    this.EntityId2 = value;
  }
  /** Retrieve filter for field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEntityId2Filter () {
    return this.EntityId2;
  }

  /**
   * Retrieves the EntityId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntityId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityId2Filter field
   */
  public String[] getEntityId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntityId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EntityId2Filter filter value from a formatted string
   *
   * @param _value the EntityId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntityId2Filter filter field
   */
  public void setEntityId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntityId2FilterFromFormattedString");
    try {
      this.setEntityId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @param fetch whether to fetch this field or not
   */
  public void setEntityId3Fetch (boolean fetch) {
    this.EntityId3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @return boolean the Fetch value for this field
   */
  public boolean getEntityId3Fetch () {
    return this.EntityId3Fetch;
  }
  /** Set the SortOrder for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEntityId3SortOrder (Integer value) {
    this.EntityId3Sort = value;
  }
  /** Retrieve SortOrder for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEntityId3SortOrder () {
    return this.EntityId3Sort;
  }
  /** Set the sort direction for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEntityId3SortDirection (boolean ascending) {
    this.EntityId3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEntityId3SortDirection () {
    return this.EntityId3SortAscending;
  }
  /** Set the field level filters for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEntityId3Filter (IntegerFilter[] value) throws ServiceException {
    this.EntityId3 = value;
  }
  /** Retrieve filter for field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEntityId3Filter () {
    return this.EntityId3;
  }

  /**
   * Retrieves the EntityId3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntityId3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityId3Filter field
   */
  public String[] getEntityId3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntityId3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityId3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityId3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityId3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EntityId3Filter filter value from a formatted string
   *
   * @param _value the EntityId3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntityId3Filter filter field
   */
  public void setEntityId3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntityId3FilterFromFormattedString");
    try {
      this.setEntityId3Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntityId3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityId3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityId3FilterFromFormattedString");
  }

  public String toString() {
    return RewardBalanceEntityMappingObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RewardBalanceEntityMappingObjectHelper.toMap(this, null);
  }
}
