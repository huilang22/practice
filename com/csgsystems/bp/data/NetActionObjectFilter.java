/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetActionObjectFilter.java
 * Definition File: Admin/NetAction.xml
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
public class NetActionObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public NetActionObjectKeyFilter Key = null;
  /** raw field for: NET_ACTION_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: NET_ACTION_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: NET_ACTION_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: NET_INTERFACE_ACTIONS.net_interface_id) */
  public    IntegerFilter[] NetInterfaceId  = null;
  protected boolean NetInterfaceIdFetch = false;
  protected boolean NetInterfaceIdSortAscending = true;
  protected Integer NetInterfaceIdSort = null;
  /** raw field for: NET_INTERFACE_ACTIONS.net_action_id) */
  public    IntegerFilter[] NetActionId  = null;
  protected boolean NetActionIdFetch = false;
  protected boolean NetActionIdSortAscending = true;
  protected Integer NetActionIdSort = null;
  /** raw field for: NET_INTERFACE_ACTIONS.is_immediate) */
  public    BooleanFilter[] IsImmediate  = null;
  protected boolean IsImmediateFetch = false;
  protected boolean IsImmediateSortAscending = true;
  protected Integer IsImmediateSort = null;
  /** raw field for: NET_INTERFACE_ACTIONS.cgi_url) */
  public    StringFilter[] CgiUrl  = null;
  protected boolean CgiUrlFetch = false;
  protected boolean CgiUrlSortAscending = true;
  protected boolean CgiUrlCaseInsensitive = false;
  protected Integer CgiUrlSort = null;
  private String _objName = "NetActionObjectFilter";
  /** default constructor */
  public NetActionObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public NetActionObjectFilter (NetActionObjectFilter other)
  {
    if (other == null) return;
    this.Key = new NetActionObjectKeyFilter (other.Key);
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.NetInterfaceId = other.NetInterfaceId;
    this.NetInterfaceIdFetch = other.NetInterfaceIdFetch;
    this.NetInterfaceIdSort = other.NetInterfaceIdSort;
    this.NetInterfaceIdSortAscending = other.NetInterfaceIdSortAscending;
    this.NetActionId = other.NetActionId;
    this.NetActionIdFetch = other.NetActionIdFetch;
    this.NetActionIdSort = other.NetActionIdSort;
    this.NetActionIdSortAscending = other.NetActionIdSortAscending;
    this.IsImmediate = other.IsImmediate;
    this.IsImmediateFetch = other.IsImmediateFetch;
    this.IsImmediateSort = other.IsImmediateSort;
    this.IsImmediateSortAscending = other.IsImmediateSortAscending;
    this.CgiUrl = other.CgiUrl;
    this.CgiUrlFetch = other.CgiUrlFetch;
    this.CgiUrlSort = other.CgiUrlSort;
    this.CgiUrlCaseInsensitive = other.CgiUrlCaseInsensitive;
    this.CgiUrlSortAscending = other.CgiUrlSortAscending;  }
  /** get the filter for this object's key
   * @return NetActionObjectKeyFilter
   */
  public NetActionObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (NetActionObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.RateClass;
  }
  /** Set the field level Fetch value for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MktCode;
  }
  /** Set the field level Fetch value for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEmfConfigIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.EmfConfigIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmfConfigIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.EmfConfigIdFetch;
  }
  /** Set the SortOrder for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmfConfigIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.EmfConfigIdSort = value;
  }
  /** Retrieve SortOrder for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmfConfigIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.EmfConfigIdSort;
  }
  /** Set the sort direction for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmfConfigIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.EmfConfigIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmfConfigIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.EmfConfigIdSortAscending;
  }
  /** Set the field level filters for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmfConfigIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.EmfConfigId = value;
  }
  /** Retrieve filter for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEmfConfigIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.EmfConfigId;
  }
  /** Set the field level Fetch value for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @param fetch whether to fetch this field or not
   */
  public void setNetActionNameFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.NetActionNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getNetActionNameFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.NetActionNameFetch;
  }
  /** Set the SortOrder for field: NetActionName (NET_ACTION_REF.net_action_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNetActionNameSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.NetActionNameSort = value;
  }
  /** Retrieve SortOrder for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNetActionNameSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.NetActionNameSort;
  }
  /** Set the sort direction for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNetActionNameSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.NetActionNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNetActionNameSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.NetActionNameSortAscending;
  }
  /** Set the case insensitive for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setNetActionNameCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.NetActionNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean whether the field is case insensitive
   */
  public boolean getNetActionNameCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.NetActionNameCaseInsensitive;
  }
  /** Set the field level filters for field: NetActionName (NET_ACTION_REF.net_action_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNetActionNameFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new NetActionObjectKeyFilter ();
    this.Key.NetActionName = value;
  }
  /** Retrieve filter for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getNetActionNameFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.NetActionName;
  }
  /** Set the field level Fetch value for field: IsDefault (NET_ACTION_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (NET_ACTION_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (NET_ACTION_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (NET_ACTION_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (NET_ACTION_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (NET_ACTION_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (NET_ACTION_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (NET_ACTION_REF.is_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultFilter () {
    return this.IsDefault;
  }

  /**
   * Retrieves the IsDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultFilter field
   */
  public String[] getIsDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultFilter filter value from a formatted string
   *
   * @param _value the IsDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultFilter filter field
   */
  public void setIsDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultFilterFromFormattedString");
    try {
      this.setIsDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInternal (NET_ACTION_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (NET_ACTION_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (NET_ACTION_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (NET_ACTION_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (NET_ACTION_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (NET_ACTION_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (NET_ACTION_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (NET_ACTION_REF.is_internal)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsInternalFilter () {
    return this.IsInternal;
  }

  /**
   * Retrieves the IsInternalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsInternalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternalFilter field
   */
  public String[] getIsInternalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsInternalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsInternalFilter filter value from a formatted string
   *
   * @param _value the IsInternalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsInternalFilter filter field
   */
  public void setIsInternalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsInternalFilterFromFormattedString");
    try {
      this.setIsInternalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (NET_ACTION_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @param fetch whether to fetch this field or not
   */
  public void setNetInterfaceIdFetch (boolean fetch) {
    this.NetInterfaceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getNetInterfaceIdFetch () {
    return this.NetInterfaceIdFetch;
  }
  /** Set the SortOrder for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNetInterfaceIdSortOrder (Integer value) {
    this.NetInterfaceIdSort = value;
  }
  /** Retrieve SortOrder for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNetInterfaceIdSortOrder () {
    return this.NetInterfaceIdSort;
  }
  /** Set the sort direction for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNetInterfaceIdSortDirection (boolean ascending) {
    this.NetInterfaceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNetInterfaceIdSortDirection () {
    return this.NetInterfaceIdSortAscending;
  }
  /** Set the field level filters for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNetInterfaceIdFilter (IntegerFilter[] value) throws ServiceException {
    this.NetInterfaceId = value;
  }
  /** Retrieve filter for field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNetInterfaceIdFilter () {
    return this.NetInterfaceId;
  }

  /**
   * Retrieves the NetInterfaceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NetInterfaceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetInterfaceIdFilter field
   */
  public String[] getNetInterfaceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetInterfaceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNetInterfaceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetInterfaceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetInterfaceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetInterfaceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NetInterfaceIdFilter filter value from a formatted string
   *
   * @param _value the NetInterfaceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NetInterfaceIdFilter filter field
   */
  public void setNetInterfaceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNetInterfaceIdFilterFromFormattedString");
    try {
      this.setNetInterfaceIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetInterfaceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetInterfaceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetInterfaceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @param fetch whether to fetch this field or not
   */
  public void setNetActionIdFetch (boolean fetch) {
    this.NetActionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getNetActionIdFetch () {
    return this.NetActionIdFetch;
  }
  /** Set the SortOrder for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNetActionIdSortOrder (Integer value) {
    this.NetActionIdSort = value;
  }
  /** Retrieve SortOrder for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNetActionIdSortOrder () {
    return this.NetActionIdSort;
  }
  /** Set the sort direction for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNetActionIdSortDirection (boolean ascending) {
    this.NetActionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNetActionIdSortDirection () {
    return this.NetActionIdSortAscending;
  }
  /** Set the field level filters for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNetActionIdFilter (IntegerFilter[] value) throws ServiceException {
    this.NetActionId = value;
  }
  /** Retrieve filter for field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNetActionIdFilter () {
    return this.NetActionId;
  }

  /**
   * Retrieves the NetActionIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NetActionIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetActionIdFilter field
   */
  public String[] getNetActionIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNetActionIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetActionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetActionIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NetActionIdFilter filter value from a formatted string
   *
   * @param _value the NetActionIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NetActionIdFilter filter field
   */
  public void setNetActionIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNetActionIdFilterFromFormattedString");
    try {
      this.setNetActionIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetActionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetActionIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetActionIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @param fetch whether to fetch this field or not
   */
  public void setIsImmediateFetch (boolean fetch) {
    this.IsImmediateFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsImmediateFetch () {
    return this.IsImmediateFetch;
  }
  /** Set the SortOrder for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsImmediateSortOrder (Integer value) {
    this.IsImmediateSort = value;
  }
  /** Retrieve SortOrder for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsImmediateSortOrder () {
    return this.IsImmediateSort;
  }
  /** Set the sort direction for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsImmediateSortDirection (boolean ascending) {
    this.IsImmediateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsImmediateSortDirection () {
    return this.IsImmediateSortAscending;
  }
  /** Set the field level filters for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsImmediateFilter (BooleanFilter[] value) throws ServiceException {
    this.IsImmediate = value;
  }
  /** Retrieve filter for field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsImmediateFilter () {
    return this.IsImmediate;
  }

  /**
   * Retrieves the IsImmediateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsImmediateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsImmediateFilter field
   */
  public String[] getIsImmediateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsImmediateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsImmediateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsImmediateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsImmediateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsImmediateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsImmediateFilter filter value from a formatted string
   *
   * @param _value the IsImmediateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsImmediateFilter filter field
   */
  public void setIsImmediateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsImmediateFilterFromFormattedString");
    try {
      this.setIsImmediateFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsImmediateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsImmediateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsImmediateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @param fetch whether to fetch this field or not
   */
  public void setCgiUrlFetch (boolean fetch) {
    this.CgiUrlFetch = fetch;
  }
  /** Retrieve Fetch value for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @return boolean the Fetch value for this field
   */
  public boolean getCgiUrlFetch () {
    return this.CgiUrlFetch;
  }
  /** Set the SortOrder for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCgiUrlSortOrder (Integer value) {
    this.CgiUrlSort = value;
  }
  /** Retrieve SortOrder for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCgiUrlSortOrder () {
    return this.CgiUrlSort;
  }
  /** Set the sort direction for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCgiUrlSortDirection (boolean ascending) {
    this.CgiUrlSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCgiUrlSortDirection () {
    return this.CgiUrlSortAscending;
  }
  /** Set the case insensitive for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCgiUrlCaseInsensitive (boolean ascending) {
    this.CgiUrlCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCgiUrlCaseInsensitive () {
    return this.CgiUrlCaseInsensitive;
  }
  /** Set the field level filters for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCgiUrlFilter (StringFilter[] value) throws ServiceException {
    this.CgiUrl = value;
  }
  /** Retrieve filter for field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCgiUrlFilter () {
    return this.CgiUrl;
  }

  /**
   * Retrieves the CgiUrlFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CgiUrlFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CgiUrlFilter field
   */
  public String[] getCgiUrlFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCgiUrlFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCgiUrlFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCgiUrlFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CgiUrlFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCgiUrlFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CgiUrlFilter filter value from a formatted string
   *
   * @param _value the CgiUrlFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CgiUrlFilter filter field
   */
  public void setCgiUrlFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCgiUrlFilterFromFormattedString");
    try {
      this.setCgiUrlFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CgiUrlFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCgiUrlFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCgiUrlFilterFromFormattedString");
  }

  public String toString() {
    return NetActionObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return NetActionObjectHelper.toMap(this, null);
  }
}
