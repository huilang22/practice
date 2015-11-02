/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityAciObjectKeyFilter.java
 * Definition File: Admin/SecurityAci.xml
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

/** Key Filter for SecurityAciObject object. */
public class SecurityAciObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: SEC_ACI.aci_id) */
  public    BigIntegerFilter[] AciId  = null;
  protected boolean AciIdFetch = false;
  protected boolean AciIdSortAscending = true;
  protected Integer AciIdSort = null;
  private String _objName = "SecurityAciObjectKeyFilter";
  /** default constructor */
  public SecurityAciObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public SecurityAciObjectKeyFilter (SecurityAciObjectKeyFilter other)
  {
    if (other == null) return;
    this.AciId = other.AciId;
    this.AciIdFetch = other.AciIdFetch;
    this.AciIdSort = other.AciIdSort;
    this.AciIdSortAscending = other.AciIdSortAscending;
  }
  /** Set the field level Fetch value for field: AciId (SEC_ACI.aci_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAciIdFetch (boolean fetch) {
    this.AciIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciId (SEC_ACI.aci_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciIdFetch () {
    return this.AciIdFetch;
  }
  /** Set the SortOrder for field: AciId (SEC_ACI.aci_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciIdSortOrder (Integer value) {
    this.AciIdSort = value;
  }
  /** Retrieve SortOrder for field: AciId (SEC_ACI.aci_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciIdSortOrder () {
    return this.AciIdSort;
  }
  /** Set the sort direction for field: AciId (SEC_ACI.aci_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciIdSortDirection (boolean ascending) {
    this.AciIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciId (SEC_ACI.aci_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciIdSortDirection () {
    return this.AciIdSortAscending;
  }
  /** Set the field level filters for field: AciId (SEC_ACI.aci_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AciId = value;
  }
  /** Retrieve filter for field: AciId (SEC_ACI.aci_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAciIdFilter () {
    return this.AciId;
  }

  /**
   * Retrieves the AciIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciIdFilter field
   */
  public String[] getAciIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciIdFilter filter value from a formatted string
   *
   * @param _value the AciIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciIdFilter filter field
   */
  public void setAciIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciIdFilterFromFormattedString");
    try {
      this.setAciIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciIdFilterFromFormattedString");
  }

  public String toString() {
    return SecurityAciObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityAciObjectKeyHelper.toMap(this, null);
  }
}
