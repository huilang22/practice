/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalAccountBalancesObjectFilter.java
 * Definition File: Admin/GlobalAccountBalances.xml
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
public class GlobalAccountBalancesObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public GlobalAccountBalancesObjectKeyFilter Key = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv) */
  public    IntegerFilter[] BalanceTrackingIdServ  = null;
  protected boolean BalanceTrackingIdServFetch = false;
  protected boolean BalanceTrackingIdServSortAscending = true;
  protected Integer BalanceTrackingIdServSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.balance_account_no) */
  public    IntegerFilter[] BalanceAccountInternalId  = null;
  protected boolean BalanceAccountInternalIdFetch = false;
  protected boolean BalanceAccountInternalIdSortAscending = true;
  protected Integer BalanceAccountInternalIdSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid) */
  public    IntegerFilter[] IsBalancePrepaid  = null;
  protected boolean IsBalancePrepaidFetch = false;
  protected boolean IsBalancePrepaidSortAscending = true;
  protected Integer IsBalancePrepaidSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.authorization_flag) */
  public    IntegerFilter[] AuthorizationFlag  = null;
  protected boolean AuthorizationFlagFetch = false;
  protected boolean AuthorizationFlagSortAscending = true;
  protected Integer AuthorizationFlagSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.regulatory_id) */
  public    IntegerFilter[] RegulatoryId  = null;
  protected boolean RegulatoryIdFetch = false;
  protected boolean RegulatoryIdSortAscending = true;
  protected Integer RegulatoryIdSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.priority) */
  public    IntegerFilter[] Priority  = null;
  protected boolean PriorityFetch = false;
  protected boolean PrioritySortAscending = true;
  protected Integer PrioritySort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.balance_desc) */
  public    StringFilter[] BalanceDesc  = null;
  protected boolean BalanceDescFetch = false;
  protected boolean BalanceDescSortAscending = true;
  protected boolean BalanceDescCaseInsensitive = false;
  protected Integer BalanceDescSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: GLOBAL_ACCOUNT_BALANCES.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "GlobalAccountBalancesObjectFilter";
  /** default constructor */
  public GlobalAccountBalancesObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public GlobalAccountBalancesObjectFilter (GlobalAccountBalancesObjectFilter other)
  {
    if (other == null) return;
    this.Key = new GlobalAccountBalancesObjectKeyFilter (other.Key);
    this.BalanceTrackingIdServ = other.BalanceTrackingIdServ;
    this.BalanceTrackingIdServFetch = other.BalanceTrackingIdServFetch;
    this.BalanceTrackingIdServSort = other.BalanceTrackingIdServSort;
    this.BalanceTrackingIdServSortAscending = other.BalanceTrackingIdServSortAscending;
    this.BalanceAccountInternalId = other.BalanceAccountInternalId;
    this.BalanceAccountInternalIdFetch = other.BalanceAccountInternalIdFetch;
    this.BalanceAccountInternalIdSort = other.BalanceAccountInternalIdSort;
    this.BalanceAccountInternalIdSortAscending = other.BalanceAccountInternalIdSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.IsBalancePrepaid = other.IsBalancePrepaid;
    this.IsBalancePrepaidFetch = other.IsBalancePrepaidFetch;
    this.IsBalancePrepaidSort = other.IsBalancePrepaidSort;
    this.IsBalancePrepaidSortAscending = other.IsBalancePrepaidSortAscending;
    this.AuthorizationFlag = other.AuthorizationFlag;
    this.AuthorizationFlagFetch = other.AuthorizationFlagFetch;
    this.AuthorizationFlagSort = other.AuthorizationFlagSort;
    this.AuthorizationFlagSortAscending = other.AuthorizationFlagSortAscending;
    this.RegulatoryId = other.RegulatoryId;
    this.RegulatoryIdFetch = other.RegulatoryIdFetch;
    this.RegulatoryIdSort = other.RegulatoryIdSort;
    this.RegulatoryIdSortAscending = other.RegulatoryIdSortAscending;
    this.Priority = other.Priority;
    this.PriorityFetch = other.PriorityFetch;
    this.PrioritySort = other.PrioritySort;
    this.PrioritySortAscending = other.PrioritySortAscending;
    this.BalanceDesc = other.BalanceDesc;
    this.BalanceDescFetch = other.BalanceDescFetch;
    this.BalanceDescSort = other.BalanceDescSort;
    this.BalanceDescCaseInsensitive = other.BalanceDescCaseInsensitive;
    this.BalanceDescSortAscending = other.BalanceDescSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;
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
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return GlobalAccountBalancesObjectKeyFilter
   */
  public GlobalAccountBalancesObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (GlobalAccountBalancesObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new GlobalAccountBalancesObjectKeyFilter ();
    this.Key.BalanceTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BalanceTrackingIdFetch;
  }
  /** Set the SortOrder for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new GlobalAccountBalancesObjectKeyFilter ();
    this.Key.BalanceTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BalanceTrackingIdSort;
  }
  /** Set the sort direction for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new GlobalAccountBalancesObjectKeyFilter ();
    this.Key.BalanceTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BalanceTrackingIdSortAscending;
  }
  /** Set the field level filters for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new GlobalAccountBalancesObjectKeyFilter ();
    this.Key.BalanceTrackingId = value;
  }
  /** Retrieve filter for field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBalanceTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BalanceTrackingId;
  }
  /** Set the field level Fetch value for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceTrackingIdServFetch (boolean fetch) {
    this.BalanceTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceTrackingIdServFetch () {
    return this.BalanceTrackingIdServFetch;
  }
  /** Set the SortOrder for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceTrackingIdServSortOrder (Integer value) {
    this.BalanceTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceTrackingIdServSortOrder () {
    return this.BalanceTrackingIdServSort;
  }
  /** Set the sort direction for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceTrackingIdServSortDirection (boolean ascending) {
    this.BalanceTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceTrackingIdServSortDirection () {
    return this.BalanceTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceTrackingIdServ = value;
  }
  /** Retrieve filter for field: BalanceTrackingIdServ (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBalanceTrackingIdServFilter () {
    return this.BalanceTrackingIdServ;
  }

  /**
   * Retrieves the BalanceTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTrackingIdServFilter field
   */
  public String[] getBalanceTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the BalanceTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceTrackingIdServFilter filter field
   */
  public void setBalanceTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceTrackingIdServFilterFromFormattedString");
    try {
      this.setBalanceTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceAccountInternalIdFetch (boolean fetch) {
    this.BalanceAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceAccountInternalIdFetch () {
    return this.BalanceAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceAccountInternalIdSortOrder (Integer value) {
    this.BalanceAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceAccountInternalIdSortOrder () {
    return this.BalanceAccountInternalIdSort;
  }
  /** Set the sort direction for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceAccountInternalIdSortDirection (boolean ascending) {
    this.BalanceAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceAccountInternalIdSortDirection () {
    return this.BalanceAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceAccountInternalId = value;
  }
  /** Retrieve filter for field: BalanceAccountInternalId (GLOBAL_ACCOUNT_BALANCES.balance_account_no)
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

  /** Set the field level Fetch value for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (GLOBAL_ACCOUNT_BALANCES.open_item_id)
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

  /**
   * Retrieves the display value for the enumerated OpenItemIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OpenItemIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemIdFilter filter field
   */
  public String[] getOpenItemIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getOpenItemIdFilter(), "OpenItem", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated OpenItemIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "OpenItemId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * @param fetch whether to fetch this field or not
   */
  public void setIsBalancePrepaidFetch (boolean fetch) {
    this.IsBalancePrepaidFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsBalancePrepaidFetch () {
    return this.IsBalancePrepaidFetch;
  }
  /** Set the SortOrder for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsBalancePrepaidSortOrder (Integer value) {
    this.IsBalancePrepaidSort = value;
  }
  /** Retrieve SortOrder for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsBalancePrepaidSortOrder () {
    return this.IsBalancePrepaidSort;
  }
  /** Set the sort direction for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsBalancePrepaidSortDirection (boolean ascending) {
    this.IsBalancePrepaidSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsBalancePrepaidSortDirection () {
    return this.IsBalancePrepaidSortAscending;
  }
  /** Set the field level filters for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsBalancePrepaidFilter (IntegerFilter[] value) throws ServiceException {
    this.IsBalancePrepaid = value;
  }
  /** Retrieve filter for field: IsBalancePrepaid (GLOBAL_ACCOUNT_BALANCES.is_balance_prepaid)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIsBalancePrepaidFilter () {
    return this.IsBalancePrepaid;
  }

  /**
   * Retrieves the IsBalancePrepaidFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsBalancePrepaidFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsBalancePrepaidFilter field
   */
  public String[] getIsBalancePrepaidFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsBalancePrepaidFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsBalancePrepaidFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsBalancePrepaidFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsBalancePrepaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsBalancePrepaidFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsBalancePrepaidFilter filter value from a formatted string
   *
   * @param _value the IsBalancePrepaidFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsBalancePrepaidFilter filter field
   */
  public void setIsBalancePrepaidFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsBalancePrepaidFilterFromFormattedString");
    try {
      this.setIsBalancePrepaidFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsBalancePrepaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsBalancePrepaidFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsBalancePrepaidFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setAuthorizationFlagFetch (boolean fetch) {
    this.AuthorizationFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getAuthorizationFlagFetch () {
    return this.AuthorizationFlagFetch;
  }
  /** Set the SortOrder for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAuthorizationFlagSortOrder (Integer value) {
    this.AuthorizationFlagSort = value;
  }
  /** Retrieve SortOrder for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAuthorizationFlagSortOrder () {
    return this.AuthorizationFlagSort;
  }
  /** Set the sort direction for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAuthorizationFlagSortDirection (boolean ascending) {
    this.AuthorizationFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAuthorizationFlagSortDirection () {
    return this.AuthorizationFlagSortAscending;
  }
  /** Set the field level filters for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAuthorizationFlagFilter (IntegerFilter[] value) throws ServiceException {
    this.AuthorizationFlag = value;
  }
  /** Retrieve filter for field: AuthorizationFlag (GLOBAL_ACCOUNT_BALANCES.authorization_flag)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAuthorizationFlagFilter () {
    return this.AuthorizationFlag;
  }

  /**
   * Retrieves the AuthorizationFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AuthorizationFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AuthorizationFlagFilter field
   */
  public String[] getAuthorizationFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuthorizationFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAuthorizationFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAuthorizationFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AuthorizationFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAuthorizationFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AuthorizationFlagFilter filter value from a formatted string
   *
   * @param _value the AuthorizationFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AuthorizationFlagFilter filter field
   */
  public void setAuthorizationFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAuthorizationFlagFilterFromFormattedString");
    try {
      this.setAuthorizationFlagFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AuthorizationFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAuthorizationFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAuthorizationFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRegulatoryIdFetch (boolean fetch) {
    this.RegulatoryIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRegulatoryIdFetch () {
    return this.RegulatoryIdFetch;
  }
  /** Set the SortOrder for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRegulatoryIdSortOrder (Integer value) {
    this.RegulatoryIdSort = value;
  }
  /** Retrieve SortOrder for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRegulatoryIdSortOrder () {
    return this.RegulatoryIdSort;
  }
  /** Set the sort direction for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRegulatoryIdSortDirection (boolean ascending) {
    this.RegulatoryIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRegulatoryIdSortDirection () {
    return this.RegulatoryIdSortAscending;
  }
  /** Set the field level filters for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRegulatoryIdFilter (IntegerFilter[] value) throws ServiceException {
    this.RegulatoryId = value;
  }
  /** Retrieve filter for field: RegulatoryId (GLOBAL_ACCOUNT_BALANCES.regulatory_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRegulatoryIdFilter () {
    return this.RegulatoryId;
  }

  /**
   * Retrieves the RegulatoryIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RegulatoryIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RegulatoryIdFilter field
   */
  public String[] getRegulatoryIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRegulatoryIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RegulatoryIdFilter filter value from a formatted string
   *
   * @param _value the RegulatoryIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RegulatoryIdFilter filter field
   */
  public void setRegulatoryIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
    try {
      this.setRegulatoryIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
   * @param fetch whether to fetch this field or not
   */
  public void setPriorityFetch (boolean fetch) {
    this.PriorityFetch = fetch;
  }
  /** Retrieve Fetch value for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
   * @return boolean the Fetch value for this field
   */
  public boolean getPriorityFetch () {
    return this.PriorityFetch;
  }
  /** Set the SortOrder for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrioritySortOrder (Integer value) {
    this.PrioritySort = value;
  }
  /** Retrieve SortOrder for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrioritySortOrder () {
    return this.PrioritySort;
  }
  /** Set the sort direction for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrioritySortDirection (boolean ascending) {
    this.PrioritySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrioritySortDirection () {
    return this.PrioritySortAscending;
  }
  /** Set the field level filters for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPriorityFilter (IntegerFilter[] value) throws ServiceException {
    this.Priority = value;
  }
  /** Retrieve filter for field: Priority (GLOBAL_ACCOUNT_BALANCES.priority)
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

  /** Set the field level Fetch value for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceDescFetch (boolean fetch) {
    this.BalanceDescFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceDescFetch () {
    return this.BalanceDescFetch;
  }
  /** Set the SortOrder for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceDescSortOrder (Integer value) {
    this.BalanceDescSort = value;
  }
  /** Retrieve SortOrder for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceDescSortOrder () {
    return this.BalanceDescSort;
  }
  /** Set the sort direction for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceDescSortDirection (boolean ascending) {
    this.BalanceDescSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceDescSortDirection () {
    return this.BalanceDescSortAscending;
  }
  /** Set the case insensitive for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBalanceDescCaseInsensitive (boolean ascending) {
    this.BalanceDescCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBalanceDescCaseInsensitive () {
    return this.BalanceDescCaseInsensitive;
  }
  /** Set the field level filters for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceDescFilter (StringFilter[] value) throws ServiceException {
    this.BalanceDesc = value;
  }
  /** Retrieve filter for field: BalanceDesc (GLOBAL_ACCOUNT_BALANCES.balance_desc)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBalanceDescFilter () {
    return this.BalanceDesc;
  }

  /**
   * Retrieves the BalanceDescFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceDescFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceDescFilter field
   */
  public String[] getBalanceDescFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDescFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceDescFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceDescFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceDescFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceDescFilter filter value from a formatted string
   *
   * @param _value the BalanceDescFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceDescFilter filter field
   */
  public void setBalanceDescFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceDescFilterFromFormattedString");
    try {
      this.setBalanceDescFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceDescFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceDescFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (GLOBAL_ACCOUNT_BALANCES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated LanguageCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCodeFilter filter field
   */
  public String[] getLanguageCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getLanguageCodeFilter(), "LanguageCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated LanguageCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "LanguageCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (GLOBAL_ACCOUNT_BALANCES.create_dt)
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


  /** Set the field level Fetch value for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (GLOBAL_ACCOUNT_BALANCES.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (GLOBAL_ACCOUNT_BALANCES.inactive_dt)
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


  /** Set the field level Fetch value for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (GLOBAL_ACCOUNT_BALANCES.chg_dt)
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


  /** Set the field level Fetch value for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (GLOBAL_ACCOUNT_BALANCES.chg_who)
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

  /** Set the field level Fetch value for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (GLOBAL_ACCOUNT_BALANCES.config_tag_id)
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
    return GlobalAccountBalancesObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GlobalAccountBalancesObjectHelper.toMap(this, null);
  }
}
