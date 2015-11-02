/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetActionObjectKeyFilter.java
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
import java.util.Locale;
import java.util.Map;

import java.math.BigInteger;
import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseFilter;

/** Key Filter for NetActionObject object. */
public class NetActionObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: NET_INTERFACE_ELIGIBILITY.rate_class) */
  public    IntegerFilter[] RateClass  = null;
  protected boolean RateClassFetch = false;
  protected boolean RateClassSortAscending = true;
  protected Integer RateClassSort = null;
  /** raw field for: NET_INTERFACE_ELIGIBILITY.mkt_code) */
  public    IntegerFilter[] MktCode  = null;
  protected boolean MktCodeFetch = false;
  protected boolean MktCodeSortAscending = true;
  protected Integer MktCodeSort = null;
  /** raw field for: NET_INTERFACE_ELIGIBILITY.emf_config_id) */
  public    IntegerFilter[] EmfConfigId  = null;
  protected boolean EmfConfigIdFetch = false;
  protected boolean EmfConfigIdSortAscending = true;
  protected Integer EmfConfigIdSort = null;
  /** raw field for: NET_ACTION_REF.net_action_name) */
  public    StringFilter[] NetActionName  = null;
  protected boolean NetActionNameFetch = false;
  protected boolean NetActionNameSortAscending = true;
  protected boolean NetActionNameCaseInsensitive = false;
  protected Integer NetActionNameSort = null;
  private String _objName = "NetActionObjectKeyFilter";
  /** default constructor */
  public NetActionObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public NetActionObjectKeyFilter (NetActionObjectKeyFilter other)
  {
    if (other == null) return;
    this.RateClass = other.RateClass;
    this.RateClassFetch = other.RateClassFetch;
    this.RateClassSort = other.RateClassSort;
    this.RateClassSortAscending = other.RateClassSortAscending;
    this.MktCode = other.MktCode;
    this.MktCodeFetch = other.MktCodeFetch;
    this.MktCodeSort = other.MktCodeSort;
    this.MktCodeSortAscending = other.MktCodeSortAscending;
    this.EmfConfigId = other.EmfConfigId;
    this.EmfConfigIdFetch = other.EmfConfigIdFetch;
    this.EmfConfigIdSort = other.EmfConfigIdSort;
    this.EmfConfigIdSortAscending = other.EmfConfigIdSortAscending;
    this.NetActionName = other.NetActionName;
    this.NetActionNameFetch = other.NetActionNameFetch;
    this.NetActionNameSort = other.NetActionNameSort;
    this.NetActionNameCaseInsensitive = other.NetActionNameCaseInsensitive;
    this.NetActionNameSortAscending = other.NetActionNameSortAscending;
  }
  /** Set the field level Fetch value for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch) {
    this.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch () {
    return this.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value) {
    this.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder () {
    return this.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending) {
    this.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection () {
    return this.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter () {
    return this.RateClass;
  }

  /**
   * Retrieves the RateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassFilter field
   */
  public String[] getRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassFilter filter value from a formatted string
   *
   * @param _value the RateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromFormattedString");
    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch) {
    this.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch () {
    return this.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value) {
    this.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder () {
    return this.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending) {
    this.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection () {
    return this.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter () {
    return this.MktCode;
  }

  /**
   * Retrieves the MktCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MktCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCodeFilter field
   */
  public String[] getMktCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMktCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MktCodeFilter filter value from a formatted string
   *
   * @param _value the MktCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MktCodeFilter filter field
   */
  public void setMktCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFilterFromFormattedString");
    try {
      this.setMktCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEmfConfigIdFetch (boolean fetch) {
    this.EmfConfigIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmfConfigIdFetch () {
    return this.EmfConfigIdFetch;
  }
  /** Set the SortOrder for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmfConfigIdSortOrder (Integer value) {
    this.EmfConfigIdSort = value;
  }
  /** Retrieve SortOrder for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmfConfigIdSortOrder () {
    return this.EmfConfigIdSort;
  }
  /** Set the sort direction for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmfConfigIdSortDirection (boolean ascending) {
    this.EmfConfigIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmfConfigIdSortDirection () {
    return this.EmfConfigIdSortAscending;
  }
  /** Set the field level filters for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmfConfigIdFilter (IntegerFilter[] value) throws ServiceException {
    this.EmfConfigId = value;
  }
  /** Retrieve filter for field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEmfConfigIdFilter () {
    return this.EmfConfigId;
  }

  /**
   * Retrieves the EmfConfigIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EmfConfigIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfConfigIdFilter field
   */
  public String[] getEmfConfigIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEmfConfigIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfConfigIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EmfConfigIdFilter filter value from a formatted string
   *
   * @param _value the EmfConfigIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EmfConfigIdFilter filter field
   */
  public void setEmfConfigIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
    try {
      this.setEmfConfigIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfConfigIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @param fetch whether to fetch this field or not
   */
  public void setNetActionNameFetch (boolean fetch) {
    this.NetActionNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getNetActionNameFetch () {
    return this.NetActionNameFetch;
  }
  /** Set the SortOrder for field: NetActionName (NET_ACTION_REF.net_action_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNetActionNameSortOrder (Integer value) {
    this.NetActionNameSort = value;
  }
  /** Retrieve SortOrder for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNetActionNameSortOrder () {
    return this.NetActionNameSort;
  }
  /** Set the sort direction for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNetActionNameSortDirection (boolean ascending) {
    this.NetActionNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNetActionNameSortDirection () {
    return this.NetActionNameSortAscending;
  }
  /** Set the case insensitive for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setNetActionNameCaseInsensitive (boolean ascending) {
    this.NetActionNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getNetActionNameCaseInsensitive () {
    return this.NetActionNameCaseInsensitive;
  }
  /** Set the field level filters for field: NetActionName (NET_ACTION_REF.net_action_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNetActionNameFilter (StringFilter[] value) throws ServiceException {
    this.NetActionName = value;
  }
  /** Retrieve filter for field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getNetActionNameFilter () {
    return this.NetActionName;
  }

  /**
   * Retrieves the NetActionNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NetActionNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetActionNameFilter field
   */
  public String[] getNetActionNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNetActionNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetActionNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetActionNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NetActionNameFilter filter value from a formatted string
   *
   * @param _value the NetActionNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NetActionNameFilter filter field
   */
  public void setNetActionNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNetActionNameFilterFromFormattedString");
    try {
      this.setNetActionNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetActionNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetActionNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetActionNameFilterFromFormattedString");
  }

  public String toString() {
    return NetActionObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return NetActionObjectKeyHelper.toMap(this, null);
  }
}
