/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalOpenItemIdMapObjectFilter.java
 * Definition File: Admin/GlobalOpenItemIdMap.xml
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
public class GlobalOpenItemIdMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public GlobalOpenItemIdMapObjectKeyFilter Key = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type) */
  public    IntegerFilter[] ChargeElementType  = null;
  protected boolean ChargeElementTypeFetch = false;
  protected boolean ChargeElementTypeSortAscending = true;
  protected Integer ChargeElementTypeSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value) */
  public    IntegerFilter[] ChargeElementValue  = null;
  protected boolean ChargeElementValueFetch = false;
  protected boolean ChargeElementValueSortAscending = true;
  protected Integer ChargeElementValueSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no) */
  public    IntegerFilter[] BalanceAccountInternalId  = null;
  protected boolean BalanceAccountInternalIdFetch = false;
  protected boolean BalanceAccountInternalIdSortAscending = true;
  protected Integer BalanceAccountInternalIdSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.order_level) */
  public    IntegerFilter[] OrderLevel  = null;
  protected boolean OrderLevelFetch = false;
  protected boolean OrderLevelSortAscending = true;
  protected Integer OrderLevelSort = null;
  /** raw field for: GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "GlobalOpenItemIdMapObjectFilter";
  /** default constructor */
  public GlobalOpenItemIdMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public GlobalOpenItemIdMapObjectFilter (GlobalOpenItemIdMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new GlobalOpenItemIdMapObjectKeyFilter (other.Key);
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
    this.ChargeElementType = other.ChargeElementType;
    this.ChargeElementTypeFetch = other.ChargeElementTypeFetch;
    this.ChargeElementTypeSort = other.ChargeElementTypeSort;
    this.ChargeElementTypeSortAscending = other.ChargeElementTypeSortAscending;
    this.ChargeElementValue = other.ChargeElementValue;
    this.ChargeElementValueFetch = other.ChargeElementValueFetch;
    this.ChargeElementValueSort = other.ChargeElementValueSort;
    this.ChargeElementValueSortAscending = other.ChargeElementValueSortAscending;
    this.BalanceAccountInternalId = other.BalanceAccountInternalId;
    this.BalanceAccountInternalIdFetch = other.BalanceAccountInternalIdFetch;
    this.BalanceAccountInternalIdSort = other.BalanceAccountInternalIdSort;
    this.BalanceAccountInternalIdSortAscending = other.BalanceAccountInternalIdSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.OrderLevel = other.OrderLevel;
    this.OrderLevelFetch = other.OrderLevelFetch;
    this.OrderLevelSort = other.OrderLevelSort;
    this.OrderLevelSortAscending = other.OrderLevelSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return GlobalOpenItemIdMapObjectKeyFilter
   */
  public GlobalOpenItemIdMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (GlobalOpenItemIdMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
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

  /** Set the field level Fetch value for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
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

  /** Set the field level Fetch value for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
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

  /** Set the field level Fetch value for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeElementTypeFetch (boolean fetch) {
    this.ChargeElementTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeElementTypeFetch () {
    return this.ChargeElementTypeFetch;
  }
  /** Set the SortOrder for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeElementTypeSortOrder (Integer value) {
    this.ChargeElementTypeSort = value;
  }
  /** Retrieve SortOrder for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeElementTypeSortOrder () {
    return this.ChargeElementTypeSort;
  }
  /** Set the sort direction for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeElementTypeSortDirection (boolean ascending) {
    this.ChargeElementTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeElementTypeSortDirection () {
    return this.ChargeElementTypeSortAscending;
  }
  /** Set the field level filters for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeElementTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ChargeElementType = value;
  }
  /** Retrieve filter for field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeElementTypeFilter () {
    return this.ChargeElementType;
  }

  /**
   * Retrieves the ChargeElementTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeElementTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeElementTypeFilter field
   */
  public String[] getChargeElementTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeElementTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChargeElementTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeElementTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeElementTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeElementTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeElementTypeFilter filter value from a formatted string
   *
   * @param _value the ChargeElementTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChargeElementTypeFilter filter field
   */
  public void setChargeElementTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeElementTypeFilterFromFormattedString");
    try {
      this.setChargeElementTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeElementTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeElementTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeElementTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeElementValueFetch (boolean fetch) {
    this.ChargeElementValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeElementValueFetch () {
    return this.ChargeElementValueFetch;
  }
  /** Set the SortOrder for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeElementValueSortOrder (Integer value) {
    this.ChargeElementValueSort = value;
  }
  /** Retrieve SortOrder for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeElementValueSortOrder () {
    return this.ChargeElementValueSort;
  }
  /** Set the sort direction for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeElementValueSortDirection (boolean ascending) {
    this.ChargeElementValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeElementValueSortDirection () {
    return this.ChargeElementValueSortAscending;
  }
  /** Set the field level filters for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeElementValueFilter (IntegerFilter[] value) throws ServiceException {
    this.ChargeElementValue = value;
  }
  /** Retrieve filter for field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeElementValueFilter () {
    return this.ChargeElementValue;
  }

  /**
   * Retrieves the ChargeElementValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeElementValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeElementValueFilter field
   */
  public String[] getChargeElementValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeElementValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChargeElementValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeElementValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeElementValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeElementValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeElementValueFilter filter value from a formatted string
   *
   * @param _value the ChargeElementValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChargeElementValueFilter filter field
   */
  public void setChargeElementValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeElementValueFilterFromFormattedString");
    try {
      this.setChargeElementValueFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeElementValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeElementValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeElementValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceAccountInternalIdFetch (boolean fetch) {
    this.BalanceAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceAccountInternalIdFetch () {
    return this.BalanceAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceAccountInternalIdSortOrder (Integer value) {
    this.BalanceAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceAccountInternalIdSortOrder () {
    return this.BalanceAccountInternalIdSort;
  }
  /** Set the sort direction for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceAccountInternalIdSortDirection (boolean ascending) {
    this.BalanceAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceAccountInternalIdSortDirection () {
    return this.BalanceAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceAccountInternalId = value;
  }
  /** Retrieve filter for field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
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

  /** Set the field level Fetch value for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOpenItemIdFilter () {
    return this.OpenItemId;
  }

  /**
   * Retrieves the OpenItemIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OpenItemIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemIdFilter field
   */
  public String[] getOpenItemIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOpenItemIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OpenItemIdFilter filter value from a formatted string
   *
   * @param _value the OpenItemIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromFormattedString");
    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
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


  /** Set the field level Fetch value for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
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


  /** Set the field level Fetch value for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
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

  /** Set the field level Fetch value for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @param fetch whether to fetch this field or not
   */
  public void setOrderLevelFetch (boolean fetch) {
    this.OrderLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrderLevelFetch () {
    return this.OrderLevelFetch;
  }
  /** Set the SortOrder for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrderLevelSortOrder (Integer value) {
    this.OrderLevelSort = value;
  }
  /** Retrieve SortOrder for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrderLevelSortOrder () {
    return this.OrderLevelSort;
  }
  /** Set the sort direction for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrderLevelSortDirection (boolean ascending) {
    this.OrderLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrderLevelSortDirection () {
    return this.OrderLevelSortAscending;
  }
  /** Set the field level filters for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrderLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.OrderLevel = value;
  }
  /** Retrieve filter for field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
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

  /** Set the field level Fetch value for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  public String toString() {
    return GlobalOpenItemIdMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GlobalOpenItemIdMapObjectHelper.toMap(this, null);
  }
}
