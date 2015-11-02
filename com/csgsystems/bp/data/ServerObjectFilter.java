/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServerObjectFilter.java
 * Definition File: Catalog/Server.xml
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
public class ServerObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ServerObjectKeyFilter Key = null;
  /** raw field for: SERVER_DEFINITION.server_type) */
  public    IntegerFilter[] ServerType  = null;
  protected boolean ServerTypeFetch = false;
  protected boolean ServerTypeSortAscending = true;
  protected Integer ServerTypeSort = null;
  /** raw field for: SERVER_DEFINITION.hostname) */
  public    StringFilter[] Hostname  = null;
  protected boolean HostnameFetch = false;
  protected boolean HostnameSortAscending = true;
  protected boolean HostnameCaseInsensitive = false;
  protected Integer HostnameSort = null;
  /** raw field for: SERVER_DEFINITION.ip_address) */
  public    StringFilter[] IpAddress  = null;
  protected boolean IpAddressFetch = false;
  protected boolean IpAddressSortAscending = true;
  protected boolean IpAddressCaseInsensitive = false;
  protected Integer IpAddressSort = null;
  /** raw field for: SERVER_DEFINITION.dsquery) */
  public    StringFilter[] Dsquery  = null;
  protected boolean DsqueryFetch = false;
  protected boolean DsquerySortAscending = true;
  protected boolean DsqueryCaseInsensitive = false;
  protected Integer DsquerySort = null;
  /** raw field for: SERVER_DEFINITION.ds_database) */
  public    StringFilter[] DsDatabase  = null;
  protected boolean DsDatabaseFetch = false;
  protected boolean DsDatabaseSortAscending = true;
  protected boolean DsDatabaseCaseInsensitive = false;
  protected Integer DsDatabaseSort = null;
  /** raw field for: SERVER_DEFINITION.arbordata) */
  public    StringFilter[] Arbordata  = null;
  protected boolean ArbordataFetch = false;
  protected boolean ArbordataSortAscending = true;
  protected boolean ArbordataCaseInsensitive = false;
  protected Integer ArbordataSort = null;
  /** raw field for: SERVER_DEFINITION.num_accts) */
  public    IntegerFilter[] NumAccts  = null;
  protected boolean NumAcctsFetch = false;
  protected boolean NumAcctsSortAscending = true;
  protected Integer NumAcctsSort = null;
  /** raw field for: SERVER_DEFINITION.server_capacity) */
  public    IntegerFilter[] ServerCapacity  = null;
  protected boolean ServerCapacityFetch = false;
  protected boolean ServerCapacitySortAscending = true;
  protected Integer ServerCapacitySort = null;
  /** raw field for: SERVER_DEFINITION.active_flag) */
  public    BooleanFilter[] ActiveFlag  = null;
  protected boolean ActiveFlagFetch = false;
  protected boolean ActiveFlagSortAscending = true;
  protected Integer ActiveFlagSort = null;
  /** raw field for: SERVER_DEFINITION.up_since_dt) */
  public    DateFilter[] UpSinceDt  = null;
  protected boolean UpSinceDtFetch = false;
  protected boolean UpSinceDtSortAscending = true;
  protected Integer UpSinceDtSort = null;
  /** raw field for: SERVER_DEFINITION.down_since_dt) */
  public    DateFilter[] DownSinceDt  = null;
  protected boolean DownSinceDtFetch = false;
  protected boolean DownSinceDtSortAscending = true;
  protected Integer DownSinceDtSort = null;
  /** raw field for: SERVER_DEFINITION.down_set_by) */
  public    StringFilter[] DownSetBy  = null;
  protected boolean DownSetByFetch = false;
  protected boolean DownSetBySortAscending = true;
  protected boolean DownSetByCaseInsensitive = false;
  protected Integer DownSetBySort = null;
  /** raw field for: SERVER_DEFINITION.down_reason_code) */
  public    IntegerFilter[] DownReasonCode  = null;
  protected boolean DownReasonCodeFetch = false;
  protected boolean DownReasonCodeSortAscending = true;
  protected Integer DownReasonCodeSort = null;
  /** raw field for: SERVER_DEFINITION.server_category) */
  public    IntegerFilter[] ServerCategory  = null;
  protected boolean ServerCategoryFetch = false;
  protected boolean ServerCategorySortAscending = true;
  protected Integer ServerCategorySort = null;
  private String _objName = "ServerObjectFilter";
  /** default constructor */
  public ServerObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ServerObjectFilter (ServerObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ServerObjectKeyFilter (other.Key);
    this.ServerType = other.ServerType;
    this.ServerTypeFetch = other.ServerTypeFetch;
    this.ServerTypeSort = other.ServerTypeSort;
    this.ServerTypeSortAscending = other.ServerTypeSortAscending;
    this.Hostname = other.Hostname;
    this.HostnameFetch = other.HostnameFetch;
    this.HostnameSort = other.HostnameSort;
    this.HostnameCaseInsensitive = other.HostnameCaseInsensitive;
    this.HostnameSortAscending = other.HostnameSortAscending;
    this.IpAddress = other.IpAddress;
    this.IpAddressFetch = other.IpAddressFetch;
    this.IpAddressSort = other.IpAddressSort;
    this.IpAddressCaseInsensitive = other.IpAddressCaseInsensitive;
    this.IpAddressSortAscending = other.IpAddressSortAscending;
    this.Dsquery = other.Dsquery;
    this.DsqueryFetch = other.DsqueryFetch;
    this.DsquerySort = other.DsquerySort;
    this.DsqueryCaseInsensitive = other.DsqueryCaseInsensitive;
    this.DsquerySortAscending = other.DsquerySortAscending;
    this.DsDatabase = other.DsDatabase;
    this.DsDatabaseFetch = other.DsDatabaseFetch;
    this.DsDatabaseSort = other.DsDatabaseSort;
    this.DsDatabaseCaseInsensitive = other.DsDatabaseCaseInsensitive;
    this.DsDatabaseSortAscending = other.DsDatabaseSortAscending;
    this.Arbordata = other.Arbordata;
    this.ArbordataFetch = other.ArbordataFetch;
    this.ArbordataSort = other.ArbordataSort;
    this.ArbordataCaseInsensitive = other.ArbordataCaseInsensitive;
    this.ArbordataSortAscending = other.ArbordataSortAscending;
    this.NumAccts = other.NumAccts;
    this.NumAcctsFetch = other.NumAcctsFetch;
    this.NumAcctsSort = other.NumAcctsSort;
    this.NumAcctsSortAscending = other.NumAcctsSortAscending;
    this.ServerCapacity = other.ServerCapacity;
    this.ServerCapacityFetch = other.ServerCapacityFetch;
    this.ServerCapacitySort = other.ServerCapacitySort;
    this.ServerCapacitySortAscending = other.ServerCapacitySortAscending;
    this.ActiveFlag = other.ActiveFlag;
    this.ActiveFlagFetch = other.ActiveFlagFetch;
    this.ActiveFlagSort = other.ActiveFlagSort;
    this.ActiveFlagSortAscending = other.ActiveFlagSortAscending;
    this.UpSinceDt = other.UpSinceDt;
    this.UpSinceDtFetch = other.UpSinceDtFetch;
    this.UpSinceDtSort = other.UpSinceDtSort;
    this.UpSinceDtSortAscending = other.UpSinceDtSortAscending;
    this.DownSinceDt = other.DownSinceDt;
    this.DownSinceDtFetch = other.DownSinceDtFetch;
    this.DownSinceDtSort = other.DownSinceDtSort;
    this.DownSinceDtSortAscending = other.DownSinceDtSortAscending;
    this.DownSetBy = other.DownSetBy;
    this.DownSetByFetch = other.DownSetByFetch;
    this.DownSetBySort = other.DownSetBySort;
    this.DownSetByCaseInsensitive = other.DownSetByCaseInsensitive;
    this.DownSetBySortAscending = other.DownSetBySortAscending;
    this.DownReasonCode = other.DownReasonCode;
    this.DownReasonCodeFetch = other.DownReasonCodeFetch;
    this.DownReasonCodeSort = other.DownReasonCodeSort;
    this.DownReasonCodeSortAscending = other.DownReasonCodeSortAscending;
    this.ServerCategory = other.ServerCategory;
    this.ServerCategoryFetch = other.ServerCategoryFetch;
    this.ServerCategorySort = other.ServerCategorySort;
    this.ServerCategorySortAscending = other.ServerCategorySortAscending;  }
  /** get the filter for this object's key
   * @return ServerObjectKeyFilter
   */
  public ServerObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ServerObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ServerId (SERVER_DEFINITION.server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServerObjectKeyFilter ();
    this.Key.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId (SERVER_DEFINITION.server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId (SERVER_DEFINITION.server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServerObjectKeyFilter ();
    this.Key.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId (SERVER_DEFINITION.server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId (SERVER_DEFINITION.server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServerObjectKeyFilter ();
    this.Key.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId (SERVER_DEFINITION.server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId (SERVER_DEFINITION.server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServerObjectKeyFilter ();
    this.Key.ServerId = value;
  }
  /** Retrieve filter for field: ServerId (SERVER_DEFINITION.server_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ServerId;
  }
  /** Set the field level Fetch value for field: ServerType (SERVER_DEFINITION.server_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServerTypeFetch (boolean fetch) {
    this.ServerTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerType (SERVER_DEFINITION.server_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerTypeFetch () {
    return this.ServerTypeFetch;
  }
  /** Set the SortOrder for field: ServerType (SERVER_DEFINITION.server_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerTypeSortOrder (Integer value) {
    this.ServerTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServerType (SERVER_DEFINITION.server_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerTypeSortOrder () {
    return this.ServerTypeSort;
  }
  /** Set the sort direction for field: ServerType (SERVER_DEFINITION.server_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerTypeSortDirection (boolean ascending) {
    this.ServerTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerType (SERVER_DEFINITION.server_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerTypeSortDirection () {
    return this.ServerTypeSortAscending;
  }
  /** Set the field level filters for field: ServerType (SERVER_DEFINITION.server_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerType = value;
  }
  /** Retrieve filter for field: ServerType (SERVER_DEFINITION.server_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerTypeFilter () {
    return this.ServerType;
  }

  /**
   * Retrieves the ServerTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServerTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerTypeFilter field
   */
  public String[] getServerTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServerTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServerTypeFilter filter value from a formatted string
   *
   * @param _value the ServerTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServerTypeFilter filter field
   */
  public void setServerTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServerTypeFilterFromFormattedString");
    try {
      this.setServerTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Hostname (SERVER_DEFINITION.hostname)
   * @param fetch whether to fetch this field or not
   */
  public void setHostnameFetch (boolean fetch) {
    this.HostnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: Hostname (SERVER_DEFINITION.hostname)
   * @return boolean the Fetch value for this field
   */
  public boolean getHostnameFetch () {
    return this.HostnameFetch;
  }
  /** Set the SortOrder for field: Hostname (SERVER_DEFINITION.hostname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHostnameSortOrder (Integer value) {
    this.HostnameSort = value;
  }
  /** Retrieve SortOrder for field: Hostname (SERVER_DEFINITION.hostname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHostnameSortOrder () {
    return this.HostnameSort;
  }
  /** Set the sort direction for field: Hostname (SERVER_DEFINITION.hostname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHostnameSortDirection (boolean ascending) {
    this.HostnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Hostname (SERVER_DEFINITION.hostname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHostnameSortDirection () {
    return this.HostnameSortAscending;
  }
  /** Set the case insensitive for field: Hostname (SERVER_DEFINITION.hostname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setHostnameCaseInsensitive (boolean ascending) {
    this.HostnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Hostname (SERVER_DEFINITION.hostname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getHostnameCaseInsensitive () {
    return this.HostnameCaseInsensitive;
  }
  /** Set the field level filters for field: Hostname (SERVER_DEFINITION.hostname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHostnameFilter (StringFilter[] value) throws ServiceException {
    this.Hostname = value;
  }
  /** Retrieve filter for field: Hostname (SERVER_DEFINITION.hostname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getHostnameFilter () {
    return this.Hostname;
  }

  /**
   * Retrieves the HostnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The HostnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HostnameFilter field
   */
  public String[] getHostnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHostnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getHostnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHostnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HostnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHostnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the HostnameFilter filter value from a formatted string
   *
   * @param _value the HostnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the HostnameFilter filter field
   */
  public void setHostnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHostnameFilterFromFormattedString");
    try {
      this.setHostnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HostnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHostnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHostnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @param fetch whether to fetch this field or not
   */
  public void setIpAddressFetch (boolean fetch) {
    this.IpAddressFetch = fetch;
  }
  /** Retrieve Fetch value for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @return boolean the Fetch value for this field
   */
  public boolean getIpAddressFetch () {
    return this.IpAddressFetch;
  }
  /** Set the SortOrder for field: IpAddress (SERVER_DEFINITION.ip_address)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIpAddressSortOrder (Integer value) {
    this.IpAddressSort = value;
  }
  /** Retrieve SortOrder for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIpAddressSortOrder () {
    return this.IpAddressSort;
  }
  /** Set the sort direction for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIpAddressSortDirection (boolean ascending) {
    this.IpAddressSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIpAddressSortDirection () {
    return this.IpAddressSortAscending;
  }
  /** Set the case insensitive for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setIpAddressCaseInsensitive (boolean ascending) {
    this.IpAddressCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getIpAddressCaseInsensitive () {
    return this.IpAddressCaseInsensitive;
  }
  /** Set the field level filters for field: IpAddress (SERVER_DEFINITION.ip_address)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIpAddressFilter (StringFilter[] value) throws ServiceException {
    this.IpAddress = value;
  }
  /** Retrieve filter for field: IpAddress (SERVER_DEFINITION.ip_address)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getIpAddressFilter () {
    return this.IpAddress;
  }

  /**
   * Retrieves the IpAddressFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IpAddressFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IpAddressFilter field
   */
  public String[] getIpAddressFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIpAddressFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIpAddressFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIpAddressFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IpAddressFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIpAddressFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IpAddressFilter filter value from a formatted string
   *
   * @param _value the IpAddressFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IpAddressFilter filter field
   */
  public void setIpAddressFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIpAddressFilterFromFormattedString");
    try {
      this.setIpAddressFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IpAddressFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIpAddressFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIpAddressFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @param fetch whether to fetch this field or not
   */
  public void setDsqueryFetch (boolean fetch) {
    this.DsqueryFetch = fetch;
  }
  /** Retrieve Fetch value for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @return boolean the Fetch value for this field
   */
  public boolean getDsqueryFetch () {
    return this.DsqueryFetch;
  }
  /** Set the SortOrder for field: Dsquery (SERVER_DEFINITION.dsquery)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDsquerySortOrder (Integer value) {
    this.DsquerySort = value;
  }
  /** Retrieve SortOrder for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDsquerySortOrder () {
    return this.DsquerySort;
  }
  /** Set the sort direction for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDsquerySortDirection (boolean ascending) {
    this.DsquerySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDsquerySortDirection () {
    return this.DsquerySortAscending;
  }
  /** Set the case insensitive for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDsqueryCaseInsensitive (boolean ascending) {
    this.DsqueryCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDsqueryCaseInsensitive () {
    return this.DsqueryCaseInsensitive;
  }
  /** Set the field level filters for field: Dsquery (SERVER_DEFINITION.dsquery)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDsqueryFilter (StringFilter[] value) throws ServiceException {
    this.Dsquery = value;
  }
  /** Retrieve filter for field: Dsquery (SERVER_DEFINITION.dsquery)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDsqueryFilter () {
    return this.Dsquery;
  }

  /**
   * Retrieves the DsqueryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DsqueryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DsqueryFilter field
   */
  public String[] getDsqueryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDsqueryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDsqueryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDsqueryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DsqueryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDsqueryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DsqueryFilter filter value from a formatted string
   *
   * @param _value the DsqueryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DsqueryFilter filter field
   */
  public void setDsqueryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDsqueryFilterFromFormattedString");
    try {
      this.setDsqueryFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DsqueryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDsqueryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDsqueryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @param fetch whether to fetch this field or not
   */
  public void setDsDatabaseFetch (boolean fetch) {
    this.DsDatabaseFetch = fetch;
  }
  /** Retrieve Fetch value for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @return boolean the Fetch value for this field
   */
  public boolean getDsDatabaseFetch () {
    return this.DsDatabaseFetch;
  }
  /** Set the SortOrder for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDsDatabaseSortOrder (Integer value) {
    this.DsDatabaseSort = value;
  }
  /** Retrieve SortOrder for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDsDatabaseSortOrder () {
    return this.DsDatabaseSort;
  }
  /** Set the sort direction for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDsDatabaseSortDirection (boolean ascending) {
    this.DsDatabaseSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDsDatabaseSortDirection () {
    return this.DsDatabaseSortAscending;
  }
  /** Set the case insensitive for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDsDatabaseCaseInsensitive (boolean ascending) {
    this.DsDatabaseCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDsDatabaseCaseInsensitive () {
    return this.DsDatabaseCaseInsensitive;
  }
  /** Set the field level filters for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDsDatabaseFilter (StringFilter[] value) throws ServiceException {
    this.DsDatabase = value;
  }
  /** Retrieve filter for field: DsDatabase (SERVER_DEFINITION.ds_database)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDsDatabaseFilter () {
    return this.DsDatabase;
  }

  /**
   * Retrieves the DsDatabaseFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DsDatabaseFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DsDatabaseFilter field
   */
  public String[] getDsDatabaseFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDsDatabaseFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDsDatabaseFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDsDatabaseFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DsDatabaseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDsDatabaseFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DsDatabaseFilter filter value from a formatted string
   *
   * @param _value the DsDatabaseFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DsDatabaseFilter filter field
   */
  public void setDsDatabaseFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDsDatabaseFilterFromFormattedString");
    try {
      this.setDsDatabaseFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DsDatabaseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDsDatabaseFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDsDatabaseFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @param fetch whether to fetch this field or not
   */
  public void setArbordataFetch (boolean fetch) {
    this.ArbordataFetch = fetch;
  }
  /** Retrieve Fetch value for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @return boolean the Fetch value for this field
   */
  public boolean getArbordataFetch () {
    return this.ArbordataFetch;
  }
  /** Set the SortOrder for field: Arbordata (SERVER_DEFINITION.arbordata)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArbordataSortOrder (Integer value) {
    this.ArbordataSort = value;
  }
  /** Retrieve SortOrder for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArbordataSortOrder () {
    return this.ArbordataSort;
  }
  /** Set the sort direction for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArbordataSortDirection (boolean ascending) {
    this.ArbordataSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArbordataSortDirection () {
    return this.ArbordataSortAscending;
  }
  /** Set the case insensitive for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setArbordataCaseInsensitive (boolean ascending) {
    this.ArbordataCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getArbordataCaseInsensitive () {
    return this.ArbordataCaseInsensitive;
  }
  /** Set the field level filters for field: Arbordata (SERVER_DEFINITION.arbordata)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArbordataFilter (StringFilter[] value) throws ServiceException {
    this.Arbordata = value;
  }
  /** Retrieve filter for field: Arbordata (SERVER_DEFINITION.arbordata)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getArbordataFilter () {
    return this.Arbordata;
  }

  /**
   * Retrieves the ArbordataFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ArbordataFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArbordataFilter field
   */
  public String[] getArbordataFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArbordataFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getArbordataFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArbordataFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArbordataFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getArbordataFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ArbordataFilter filter value from a formatted string
   *
   * @param _value the ArbordataFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ArbordataFilter filter field
   */
  public void setArbordataFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setArbordataFilterFromFormattedString");
    try {
      this.setArbordataFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArbordataFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setArbordataFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArbordataFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NumAccts (SERVER_DEFINITION.num_accts)
   * @param fetch whether to fetch this field or not
   */
  public void setNumAcctsFetch (boolean fetch) {
    this.NumAcctsFetch = fetch;
  }
  /** Retrieve Fetch value for field: NumAccts (SERVER_DEFINITION.num_accts)
   * @return boolean the Fetch value for this field
   */
  public boolean getNumAcctsFetch () {
    return this.NumAcctsFetch;
  }
  /** Set the SortOrder for field: NumAccts (SERVER_DEFINITION.num_accts)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNumAcctsSortOrder (Integer value) {
    this.NumAcctsSort = value;
  }
  /** Retrieve SortOrder for field: NumAccts (SERVER_DEFINITION.num_accts)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNumAcctsSortOrder () {
    return this.NumAcctsSort;
  }
  /** Set the sort direction for field: NumAccts (SERVER_DEFINITION.num_accts)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNumAcctsSortDirection (boolean ascending) {
    this.NumAcctsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NumAccts (SERVER_DEFINITION.num_accts)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNumAcctsSortDirection () {
    return this.NumAcctsSortAscending;
  }
  /** Set the field level filters for field: NumAccts (SERVER_DEFINITION.num_accts)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNumAcctsFilter (IntegerFilter[] value) throws ServiceException {
    this.NumAccts = value;
  }
  /** Retrieve filter for field: NumAccts (SERVER_DEFINITION.num_accts)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNumAcctsFilter () {
    return this.NumAccts;
  }

  /**
   * Retrieves the NumAcctsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NumAcctsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumAcctsFilter field
   */
  public String[] getNumAcctsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumAcctsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNumAcctsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumAcctsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumAcctsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumAcctsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NumAcctsFilter filter value from a formatted string
   *
   * @param _value the NumAcctsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NumAcctsFilter filter field
   */
  public void setNumAcctsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNumAcctsFilterFromFormattedString");
    try {
      this.setNumAcctsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumAcctsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumAcctsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumAcctsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @param fetch whether to fetch this field or not
   */
  public void setServerCapacityFetch (boolean fetch) {
    this.ServerCapacityFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerCapacityFetch () {
    return this.ServerCapacityFetch;
  }
  /** Set the SortOrder for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerCapacitySortOrder (Integer value) {
    this.ServerCapacitySort = value;
  }
  /** Retrieve SortOrder for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerCapacitySortOrder () {
    return this.ServerCapacitySort;
  }
  /** Set the sort direction for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerCapacitySortDirection (boolean ascending) {
    this.ServerCapacitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerCapacitySortDirection () {
    return this.ServerCapacitySortAscending;
  }
  /** Set the field level filters for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerCapacityFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerCapacity = value;
  }
  /** Retrieve filter for field: ServerCapacity (SERVER_DEFINITION.server_capacity)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerCapacityFilter () {
    return this.ServerCapacity;
  }

  /**
   * Retrieves the ServerCapacityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServerCapacityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerCapacityFilter field
   */
  public String[] getServerCapacityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCapacityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServerCapacityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCapacityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerCapacityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerCapacityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServerCapacityFilter filter value from a formatted string
   *
   * @param _value the ServerCapacityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServerCapacityFilter filter field
   */
  public void setServerCapacityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServerCapacityFilterFromFormattedString");
    try {
      this.setServerCapacityFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerCapacityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerCapacityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerCapacityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveFlagFetch (boolean fetch) {
    this.ActiveFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveFlagFetch () {
    return this.ActiveFlagFetch;
  }
  /** Set the SortOrder for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveFlagSortOrder (Integer value) {
    this.ActiveFlagSort = value;
  }
  /** Retrieve SortOrder for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveFlagSortOrder () {
    return this.ActiveFlagSort;
  }
  /** Set the sort direction for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveFlagSortDirection (boolean ascending) {
    this.ActiveFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveFlagSortDirection () {
    return this.ActiveFlagSortAscending;
  }
  /** Set the field level filters for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ActiveFlag = value;
  }
  /** Retrieve filter for field: ActiveFlag (SERVER_DEFINITION.active_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getActiveFlagFilter () {
    return this.ActiveFlag;
  }

  /**
   * Retrieves the ActiveFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveFlagFilter field
   */
  public String[] getActiveFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveFlagFilter filter value from a formatted string
   *
   * @param _value the ActiveFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveFlagFilter filter field
   */
  public void setActiveFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveFlagFilterFromFormattedString");
    try {
      this.setActiveFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setUpSinceDtFetch (boolean fetch) {
    this.UpSinceDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getUpSinceDtFetch () {
    return this.UpSinceDtFetch;
  }
  /** Set the SortOrder for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUpSinceDtSortOrder (Integer value) {
    this.UpSinceDtSort = value;
  }
  /** Retrieve SortOrder for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUpSinceDtSortOrder () {
    return this.UpSinceDtSort;
  }
  /** Set the sort direction for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUpSinceDtSortDirection (boolean ascending) {
    this.UpSinceDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUpSinceDtSortDirection () {
    return this.UpSinceDtSortAscending;
  }
  /** Set the field level filters for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUpSinceDtFilter (DateFilter[] value) throws ServiceException {
    this.UpSinceDt = value;
  }
  /** Retrieve filter for field: UpSinceDt (SERVER_DEFINITION.up_since_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getUpSinceDtFilter () {
    return this.UpSinceDt;
  }

  /**
   * Retrieves the UpSinceDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UpSinceDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UpSinceDtFilter field
   */
  public String[] getUpSinceDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUpSinceDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUpSinceDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUpSinceDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UpSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUpSinceDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UpSinceDtFilter filter value from a formatted string
   *
   * @param _value the UpSinceDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UpSinceDtFilter filter field
   */
  public void setUpSinceDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUpSinceDtFilterFromFormattedString");
    try {
      this.setUpSinceDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UpSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUpSinceDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUpSinceDtFilterFromFormattedString");
  }

  /**
   * Retrieves the UpSinceDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UpSinceDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the UpSinceDtFilter field
   */
  public String[] getUpSinceDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUpSinceDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUpSinceDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUpSinceDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UpSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUpSinceDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the UpSinceDtFilter filter value from a formatted string
   *
   * @param _value the UpSinceDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UpSinceDtFilter filter field
   */
  public void setUpSinceDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUpSinceDtFilterFromFormattedDateTimeString");
    try {
      this.setUpSinceDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UpSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUpSinceDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUpSinceDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setDownSinceDtFetch (boolean fetch) {
    this.DownSinceDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getDownSinceDtFetch () {
    return this.DownSinceDtFetch;
  }
  /** Set the SortOrder for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDownSinceDtSortOrder (Integer value) {
    this.DownSinceDtSort = value;
  }
  /** Retrieve SortOrder for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDownSinceDtSortOrder () {
    return this.DownSinceDtSort;
  }
  /** Set the sort direction for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDownSinceDtSortDirection (boolean ascending) {
    this.DownSinceDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDownSinceDtSortDirection () {
    return this.DownSinceDtSortAscending;
  }
  /** Set the field level filters for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDownSinceDtFilter (DateFilter[] value) throws ServiceException {
    this.DownSinceDt = value;
  }
  /** Retrieve filter for field: DownSinceDt (SERVER_DEFINITION.down_since_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDownSinceDtFilter () {
    return this.DownSinceDt;
  }

  /**
   * Retrieves the DownSinceDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DownSinceDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownSinceDtFilter field
   */
  public String[] getDownSinceDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSinceDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDownSinceDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownSinceDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownSinceDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DownSinceDtFilter filter value from a formatted string
   *
   * @param _value the DownSinceDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DownSinceDtFilter filter field
   */
  public void setDownSinceDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDownSinceDtFilterFromFormattedString");
    try {
      this.setDownSinceDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownSinceDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDownSinceDtFilterFromFormattedString");
  }

  /**
   * Retrieves the DownSinceDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DownSinceDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownSinceDtFilter field
   */
  public String[] getDownSinceDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSinceDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDownSinceDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownSinceDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownSinceDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DownSinceDtFilter filter value from a formatted string
   *
   * @param _value the DownSinceDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DownSinceDtFilter filter field
   */
  public void setDownSinceDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDownSinceDtFilterFromFormattedDateTimeString");
    try {
      this.setDownSinceDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSinceDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownSinceDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDownSinceDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @param fetch whether to fetch this field or not
   */
  public void setDownSetByFetch (boolean fetch) {
    this.DownSetByFetch = fetch;
  }
  /** Retrieve Fetch value for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @return boolean the Fetch value for this field
   */
  public boolean getDownSetByFetch () {
    return this.DownSetByFetch;
  }
  /** Set the SortOrder for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDownSetBySortOrder (Integer value) {
    this.DownSetBySort = value;
  }
  /** Retrieve SortOrder for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDownSetBySortOrder () {
    return this.DownSetBySort;
  }
  /** Set the sort direction for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDownSetBySortDirection (boolean ascending) {
    this.DownSetBySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDownSetBySortDirection () {
    return this.DownSetBySortAscending;
  }
  /** Set the case insensitive for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDownSetByCaseInsensitive (boolean ascending) {
    this.DownSetByCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDownSetByCaseInsensitive () {
    return this.DownSetByCaseInsensitive;
  }
  /** Set the field level filters for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDownSetByFilter (StringFilter[] value) throws ServiceException {
    this.DownSetBy = value;
  }
  /** Retrieve filter for field: DownSetBy (SERVER_DEFINITION.down_set_by)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDownSetByFilter () {
    return this.DownSetBy;
  }

  /**
   * Retrieves the DownSetByFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DownSetByFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownSetByFilter field
   */
  public String[] getDownSetByFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownSetByFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDownSetByFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownSetByFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSetByFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownSetByFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DownSetByFilter filter value from a formatted string
   *
   * @param _value the DownSetByFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DownSetByFilter filter field
   */
  public void setDownSetByFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDownSetByFilterFromFormattedString");
    try {
      this.setDownSetByFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownSetByFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownSetByFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDownSetByFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDownReasonCodeFetch (boolean fetch) {
    this.DownReasonCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDownReasonCodeFetch () {
    return this.DownReasonCodeFetch;
  }
  /** Set the SortOrder for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDownReasonCodeSortOrder (Integer value) {
    this.DownReasonCodeSort = value;
  }
  /** Retrieve SortOrder for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDownReasonCodeSortOrder () {
    return this.DownReasonCodeSort;
  }
  /** Set the sort direction for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDownReasonCodeSortDirection (boolean ascending) {
    this.DownReasonCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDownReasonCodeSortDirection () {
    return this.DownReasonCodeSortAscending;
  }
  /** Set the field level filters for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDownReasonCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.DownReasonCode = value;
  }
  /** Retrieve filter for field: DownReasonCode (SERVER_DEFINITION.down_reason_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDownReasonCodeFilter () {
    return this.DownReasonCode;
  }

  /**
   * Retrieves the DownReasonCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DownReasonCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DownReasonCodeFilter field
   */
  public String[] getDownReasonCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDownReasonCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDownReasonCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDownReasonCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDownReasonCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DownReasonCodeFilter filter value from a formatted string
   *
   * @param _value the DownReasonCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DownReasonCodeFilter filter field
   */
  public void setDownReasonCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDownReasonCodeFilterFromFormattedString");
    try {
      this.setDownReasonCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DownReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDownReasonCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDownReasonCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerCategory (SERVER_DEFINITION.server_category)
   * @param fetch whether to fetch this field or not
   */
  public void setServerCategoryFetch (boolean fetch) {
    this.ServerCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerCategory (SERVER_DEFINITION.server_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerCategoryFetch () {
    return this.ServerCategoryFetch;
  }
  /** Set the SortOrder for field: ServerCategory (SERVER_DEFINITION.server_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerCategorySortOrder (Integer value) {
    this.ServerCategorySort = value;
  }
  /** Retrieve SortOrder for field: ServerCategory (SERVER_DEFINITION.server_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerCategorySortOrder () {
    return this.ServerCategorySort;
  }
  /** Set the sort direction for field: ServerCategory (SERVER_DEFINITION.server_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerCategorySortDirection (boolean ascending) {
    this.ServerCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerCategory (SERVER_DEFINITION.server_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerCategorySortDirection () {
    return this.ServerCategorySortAscending;
  }
  /** Set the field level filters for field: ServerCategory (SERVER_DEFINITION.server_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerCategory = value;
  }
  /** Retrieve filter for field: ServerCategory (SERVER_DEFINITION.server_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerCategoryFilter () {
    return this.ServerCategory;
  }

  /**
   * Retrieves the ServerCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServerCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerCategoryFilter field
   */
  public String[] getServerCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServerCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServerCategoryFilter filter value from a formatted string
   *
   * @param _value the ServerCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServerCategoryFilter filter field
   */
  public void setServerCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServerCategoryFilterFromFormattedString");
    try {
      this.setServerCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerCategoryFilterFromFormattedString");
  }

  public String toString() {
    return ServerObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServerObjectHelper.toMap(this, null);
  }
}
