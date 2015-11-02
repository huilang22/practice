/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EDObjectKeyFilter.java
 * Definition File: Admin/ExtendedDataEnumeration.xml
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

/** Key Filter for EDObject object. */
public class EDObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ENUMERATION_DEF.enumeration_id) */
  public    IntegerFilter[] EnumerationId  = null;
  protected boolean EnumerationIdFetch = false;
  protected boolean EnumerationIdSortAscending = true;
  protected Integer EnumerationIdSort = null;
  private String _objName = "EDObjectKeyFilter";
  /** default constructor */
  public EDObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public EDObjectKeyFilter (EDObjectKeyFilter other)
  {
    if (other == null) return;
    this.EnumerationId = other.EnumerationId;
    this.EnumerationIdFetch = other.EnumerationIdFetch;
    this.EnumerationIdSort = other.EnumerationIdSort;
    this.EnumerationIdSortAscending = other.EnumerationIdSortAscending;
  }
  /** Set the field level Fetch value for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEnumerationIdFetch (boolean fetch) {
    this.EnumerationIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEnumerationIdFetch () {
    return this.EnumerationIdFetch;
  }
  /** Set the SortOrder for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEnumerationIdSortOrder (Integer value) {
    this.EnumerationIdSort = value;
  }
  /** Retrieve SortOrder for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEnumerationIdSortOrder () {
    return this.EnumerationIdSort;
  }
  /** Set the sort direction for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEnumerationIdSortDirection (boolean ascending) {
    this.EnumerationIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEnumerationIdSortDirection () {
    return this.EnumerationIdSortAscending;
  }
  /** Set the field level filters for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEnumerationIdFilter (IntegerFilter[] value) throws ServiceException {
    this.EnumerationId = value;
  }
  /** Retrieve filter for field: EnumerationId (ENUMERATION_DEF.enumeration_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEnumerationIdFilter () {
    return this.EnumerationId;
  }

  /**
   * Retrieves the EnumerationIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EnumerationIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationIdFilter field
   */
  public String[] getEnumerationIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEnumerationIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EnumerationIdFilter filter value from a formatted string
   *
   * @param _value the EnumerationIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EnumerationIdFilter filter field
   */
  public void setEnumerationIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEnumerationIdFilterFromFormattedString");
    try {
      this.setEnumerationIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EnumerationIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationIdFilterFromFormattedString");
  }

  public String toString() {
    return EDObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return EDObjectKeyHelper.toMap(this, null);
  }
}
