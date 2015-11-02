/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceMasterGroupObjectKeyFilter.java
 * Definition File: Customer/ServiceMasterGroup.xml
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

/** Key Filter for ServiceMasterGroupObject object. */
public class ServiceMasterGroupObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: EMF_MASTER_GROUPS.subscr_master_group_no) */
  public    IntegerFilter[] SubscrMasterGroupNo  = null;
  protected boolean SubscrMasterGroupNoFetch = false;
  protected boolean SubscrMasterGroupNoSortAscending = true;
  protected Integer SubscrMasterGroupNoSort = null;
  private String _objName = "ServiceMasterGroupObjectKeyFilter";
  /** default constructor */
  public ServiceMasterGroupObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ServiceMasterGroupObjectKeyFilter (ServiceMasterGroupObjectKeyFilter other)
  {
    if (other == null) return;
    this.SubscrMasterGroupNo = other.SubscrMasterGroupNo;
    this.SubscrMasterGroupNoFetch = other.SubscrMasterGroupNoFetch;
    this.SubscrMasterGroupNoSort = other.SubscrMasterGroupNoSort;
    this.SubscrMasterGroupNoSortAscending = other.SubscrMasterGroupNoSortAscending;
  }
  /** Set the field level Fetch value for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @param fetch whether to fetch this field or not
   */
  public void setSubscrMasterGroupNoFetch (boolean fetch) {
    this.SubscrMasterGroupNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubscrMasterGroupNoFetch () {
    return this.SubscrMasterGroupNoFetch;
  }
  /** Set the SortOrder for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubscrMasterGroupNoSortOrder (Integer value) {
    this.SubscrMasterGroupNoSort = value;
  }
  /** Retrieve SortOrder for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubscrMasterGroupNoSortOrder () {
    return this.SubscrMasterGroupNoSort;
  }
  /** Set the sort direction for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubscrMasterGroupNoSortDirection (boolean ascending) {
    this.SubscrMasterGroupNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubscrMasterGroupNoSortDirection () {
    return this.SubscrMasterGroupNoSortAscending;
  }
  /** Set the field level filters for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubscrMasterGroupNoFilter (IntegerFilter[] value) throws ServiceException {
    this.SubscrMasterGroupNo = value;
  }
  /** Retrieve filter for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSubscrMasterGroupNoFilter () {
    return this.SubscrMasterGroupNo;
  }

  /**
   * Retrieves the SubscrMasterGroupNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubscrMasterGroupNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubscrMasterGroupNoFilter field
   */
  public String[] getSubscrMasterGroupNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubscrMasterGroupNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubscrMasterGroupNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubscrMasterGroupNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubscrMasterGroupNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubscrMasterGroupNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubscrMasterGroupNoFilter filter value from a formatted string
   *
   * @param _value the SubscrMasterGroupNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubscrMasterGroupNoFilter filter field
   */
  public void setSubscrMasterGroupNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubscrMasterGroupNoFilterFromFormattedString");
    try {
      this.setSubscrMasterGroupNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubscrMasterGroupNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubscrMasterGroupNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubscrMasterGroupNoFilterFromFormattedString");
  }

  public String toString() {
    return ServiceMasterGroupObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServiceMasterGroupObjectKeyHelper.toMap(this, null);
  }
}
