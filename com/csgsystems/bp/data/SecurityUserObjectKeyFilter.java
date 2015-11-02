/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityUserObjectKeyFilter.java
 * Definition File: Admin/SecurityUser.xml
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

/** Key Filter for SecurityUserObject object. */
public class SecurityUserObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: SEC_FX_USER.usr_id) */
  public    BigIntegerFilter[] UsrId  = null;
  protected boolean UsrIdFetch = false;
  protected boolean UsrIdSortAscending = true;
  protected Integer UsrIdSort = null;
  private String _objName = "SecurityUserObjectKeyFilter";
  /** default constructor */
  public SecurityUserObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public SecurityUserObjectKeyFilter (SecurityUserObjectKeyFilter other)
  {
    if (other == null) return;
    this.UsrId = other.UsrId;
    this.UsrIdFetch = other.UsrIdFetch;
    this.UsrIdSort = other.UsrIdSort;
    this.UsrIdSortAscending = other.UsrIdSortAscending;
  }
  /** Set the field level Fetch value for field: UsrId (SEC_FX_USER.usr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrIdFetch (boolean fetch) {
    this.UsrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrId (SEC_FX_USER.usr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrIdFetch () {
    return this.UsrIdFetch;
  }
  /** Set the SortOrder for field: UsrId (SEC_FX_USER.usr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrIdSortOrder (Integer value) {
    this.UsrIdSort = value;
  }
  /** Retrieve SortOrder for field: UsrId (SEC_FX_USER.usr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrIdSortOrder () {
    return this.UsrIdSort;
  }
  /** Set the sort direction for field: UsrId (SEC_FX_USER.usr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrIdSortDirection (boolean ascending) {
    this.UsrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrId (SEC_FX_USER.usr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrIdSortDirection () {
    return this.UsrIdSortAscending;
  }
  /** Set the field level filters for field: UsrId (SEC_FX_USER.usr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UsrId = value;
  }
  /** Retrieve filter for field: UsrId (SEC_FX_USER.usr_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUsrIdFilter () {
    return this.UsrId;
  }

  /**
   * Retrieves the UsrIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrIdFilter field
   */
  public String[] getUsrIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrIdFilter filter value from a formatted string
   *
   * @param _value the UsrIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrIdFilter filter field
   */
  public void setUsrIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrIdFilterFromFormattedString");
    try {
      this.setUsrIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrIdFilterFromFormattedString");
  }

  public String toString() {
    return SecurityUserObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityUserObjectKeyHelper.toMap(this, null);
  }
}
