/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterObjectKeyFilter.java
 * Definition File: Admin/ServiceCenter.xml
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

/** Key Filter for ServiceCenterObject object. */
public class ServiceCenterObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: SERVICE_CENTERS.service_center_id) */
  public    IntegerFilter[] ServiceCenterId  = null;
  protected boolean ServiceCenterIdFetch = false;
  protected boolean ServiceCenterIdSortAscending = true;
  protected Integer ServiceCenterIdSort = null;
  private String _objName = "ServiceCenterObjectKeyFilter";
  /** default constructor */
  public ServiceCenterObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ServiceCenterObjectKeyFilter (ServiceCenterObjectKeyFilter other)
  {
    if (other == null) return;
    this.ServiceCenterId = other.ServiceCenterId;
    this.ServiceCenterIdFetch = other.ServiceCenterIdFetch;
    this.ServiceCenterIdSort = other.ServiceCenterIdSort;
    this.ServiceCenterIdSortAscending = other.ServiceCenterIdSortAscending;
  }
  /** Set the field level Fetch value for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterIdFetch (boolean fetch) {
    this.ServiceCenterIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterIdFetch () {
    return this.ServiceCenterIdFetch;
  }
  /** Set the SortOrder for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterIdSortOrder (Integer value) {
    this.ServiceCenterIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterIdSortOrder () {
    return this.ServiceCenterIdSort;
  }
  /** Set the sort direction for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterIdSortDirection (boolean ascending) {
    this.ServiceCenterIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterIdSortDirection () {
    return this.ServiceCenterIdSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceCenterId = value;
  }
  /** Retrieve filter for field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceCenterIdFilter () {
    return this.ServiceCenterId;
  }

  /**
   * Retrieves the ServiceCenterIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceCenterIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterIdFilter field
   */
  public String[] getServiceCenterIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceCenterIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceCenterIdFilter filter value from a formatted string
   *
   * @param _value the ServiceCenterIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceCenterIdFilter filter field
   */
  public void setServiceCenterIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceCenterIdFilterFromFormattedString");
    try {
      this.setServiceCenterIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCenterIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterIdFilterFromFormattedString");
  }

  public String toString() {
    return ServiceCenterObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServiceCenterObjectKeyHelper.toMap(this, null);
  }
}
