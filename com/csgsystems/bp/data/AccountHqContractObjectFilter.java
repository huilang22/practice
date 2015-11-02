/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountHqContractObjectFilter.java
 * Definition File: Customer/AccountHqContract.xml
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
public class AccountHqContractObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AccountHqContractObjectKeyFilter Key = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field for: CONTRACT_ASSIGNMENTS_HQ.end_dt) */
  public    DateFilter[] EndDt  = null;
  protected boolean EndDtFetch = false;
  protected boolean EndDtSortAscending = true;
  protected Integer EndDtSort = null;
  /** raw field for: CONTRACT_ASSIGNMENTS_HQ.proportion) */
  public    IntegerFilter[] Proportion  = null;
  protected boolean ProportionFetch = false;
  protected boolean ProportionSortAscending = true;
  protected Integer ProportionSort = null;
  /** raw field for: CONTRACT_ASSIGNMENTS_HQ.exclude) */
  public    BooleanFilter[] Exclude  = null;
  protected boolean ExcludeFetch = false;
  protected boolean ExcludeSortAscending = true;
  protected Integer ExcludeSort = null;
  /** raw field for: CONTRACT_ASSIGNMENTS_HQ.in_use) */
  public    StringFilter[] InUse  = null;
  protected boolean InUseFetch = false;
  protected boolean InUseSortAscending = true;
  protected boolean InUseCaseInsensitive = false;
  protected Integer InUseSort = null;
  private String _objName = "AccountHqContractObjectFilter";
  /** default constructor */
  public AccountHqContractObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AccountHqContractObjectFilter (AccountHqContractObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AccountHqContractObjectKeyFilter (other.Key);
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.EndDt = other.EndDt;
    this.EndDtFetch = other.EndDtFetch;
    this.EndDtSort = other.EndDtSort;
    this.EndDtSortAscending = other.EndDtSortAscending;
    this.Proportion = other.Proportion;
    this.ProportionFetch = other.ProportionFetch;
    this.ProportionSort = other.ProportionSort;
    this.ProportionSortAscending = other.ProportionSortAscending;
    this.Exclude = other.Exclude;
    this.ExcludeFetch = other.ExcludeFetch;
    this.ExcludeSort = other.ExcludeSort;
    this.ExcludeSortAscending = other.ExcludeSortAscending;
    this.InUse = other.InUse;
    this.InUseFetch = other.InUseFetch;
    this.InUseSort = other.InUseSort;
    this.InUseCaseInsensitive = other.InUseCaseInsensitive;
    this.InUseSortAscending = other.InUseSortAscending;  }
  /** get the filter for this object's key
   * @return AccountHqContractObjectKeyFilter
   */
  public AccountHqContractObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AccountHqContractObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CONTRACT_ASSIGNMENTS_HQ.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (CONTRACT_ASSIGNMENTS_HQ.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (CONTRACT_ASSIGNMENTS_HQ.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartDtFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.StartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartDtFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.StartDtFetch;
  }
  /** Set the SortOrder for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartDtSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.StartDtSort = value;
  }
  /** Retrieve SortOrder for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartDtSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.StartDtSort;
  }
  /** Set the sort direction for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartDtSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.StartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartDtSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.StartDtSortAscending;
  }
  /** Set the field level filters for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartDtFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountHqContractObjectKeyFilter ();
    this.Key.StartDt = value;
  }
  /** Retrieve filter for field: StartDt (CONTRACT_ASSIGNMENTS_HQ.start_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStartDtFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.StartDt;
  }
  /** Set the field level Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch) {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch () {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value) {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder () {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending) {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection () {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
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

  /**
   * Retrieves the display value for the enumerated AccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdTypeFilter filter field
   */
  public String[] getAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch) {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch () {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value) {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder () {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending) {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection () {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending) {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountExternalIdCaseInsensitive () {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
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

  /** Set the field level Fetch value for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setEndDtFetch (boolean fetch) {
    this.EndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndDtFetch () {
    return this.EndDtFetch;
  }
  /** Set the SortOrder for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndDtSortOrder (Integer value) {
    this.EndDtSort = value;
  }
  /** Retrieve SortOrder for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndDtSortOrder () {
    return this.EndDtSort;
  }
  /** Set the sort direction for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndDtSortDirection (boolean ascending) {
    this.EndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndDtSortDirection () {
    return this.EndDtSortAscending;
  }
  /** Set the field level filters for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndDtFilter (DateFilter[] value) throws ServiceException {
    this.EndDt = value;
  }
  /** Retrieve filter for field: EndDt (CONTRACT_ASSIGNMENTS_HQ.end_dt)
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


  /** Set the field level Fetch value for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
   * @param fetch whether to fetch this field or not
   */
  public void setProportionFetch (boolean fetch) {
    this.ProportionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
   * @return boolean the Fetch value for this field
   */
  public boolean getProportionFetch () {
    return this.ProportionFetch;
  }
  /** Set the SortOrder for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProportionSortOrder (Integer value) {
    this.ProportionSort = value;
  }
  /** Retrieve SortOrder for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProportionSortOrder () {
    return this.ProportionSort;
  }
  /** Set the sort direction for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProportionSortDirection (boolean ascending) {
    this.ProportionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProportionSortDirection () {
    return this.ProportionSortAscending;
  }
  /** Set the field level filters for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProportionFilter (IntegerFilter[] value) throws ServiceException {
    this.Proportion = value;
  }
  /** Retrieve filter for field: Proportion (CONTRACT_ASSIGNMENTS_HQ.proportion)
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

  /** Set the field level Fetch value for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * @param fetch whether to fetch this field or not
   */
  public void setExcludeFetch (boolean fetch) {
    this.ExcludeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * @return boolean the Fetch value for this field
   */
  public boolean getExcludeFetch () {
    return this.ExcludeFetch;
  }
  /** Set the SortOrder for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExcludeSortOrder (Integer value) {
    this.ExcludeSort = value;
  }
  /** Retrieve SortOrder for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExcludeSortOrder () {
    return this.ExcludeSort;
  }
  /** Set the sort direction for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExcludeSortDirection (boolean ascending) {
    this.ExcludeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExcludeSortDirection () {
    return this.ExcludeSortAscending;
  }
  /** Set the field level filters for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExcludeFilter (BooleanFilter[] value) throws ServiceException {
    this.Exclude = value;
  }
  /** Retrieve filter for field: Exclude (CONTRACT_ASSIGNMENTS_HQ.exclude)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getExcludeFilter () {
    return this.Exclude;
  }

  /**
   * Retrieves the ExcludeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExcludeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExcludeFilter field
   */
  public String[] getExcludeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExcludeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExcludeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExcludeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExcludeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExcludeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExcludeFilter filter value from a formatted string
   *
   * @param _value the ExcludeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExcludeFilter filter field
   */
  public void setExcludeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExcludeFilterFromFormattedString");
    try {
      this.setExcludeFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExcludeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExcludeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExcludeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @param fetch whether to fetch this field or not
   */
  public void setInUseFetch (boolean fetch) {
    this.InUseFetch = fetch;
  }
  /** Retrieve Fetch value for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @return boolean the Fetch value for this field
   */
  public boolean getInUseFetch () {
    return this.InUseFetch;
  }
  /** Set the SortOrder for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInUseSortOrder (Integer value) {
    this.InUseSort = value;
  }
  /** Retrieve SortOrder for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInUseSortOrder () {
    return this.InUseSort;
  }
  /** Set the sort direction for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInUseSortDirection (boolean ascending) {
    this.InUseSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInUseSortDirection () {
    return this.InUseSortAscending;
  }
  /** Set the case insensitive for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setInUseCaseInsensitive (boolean ascending) {
    this.InUseCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getInUseCaseInsensitive () {
    return this.InUseCaseInsensitive;
  }
  /** Set the field level filters for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInUseFilter (StringFilter[] value) throws ServiceException {
    this.InUse = value;
  }
  /** Retrieve filter for field: InUse (CONTRACT_ASSIGNMENTS_HQ.in_use)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getInUseFilter () {
    return this.InUse;
  }

  /**
   * Retrieves the InUseFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InUseFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InUseFilter field
   */
  public String[] getInUseFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInUseFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInUseFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInUseFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InUseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInUseFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InUseFilter filter value from a formatted string
   *
   * @param _value the InUseFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InUseFilter filter field
   */
  public void setInUseFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInUseFilterFromFormattedString");
    try {
      this.setInUseFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InUseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInUseFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInUseFilterFromFormattedString");
  }

  public String toString() {
    return AccountHqContractObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountHqContractObjectHelper.toMap(this, null);
  }
}
