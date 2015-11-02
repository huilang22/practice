/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountSegmentMapObjectKeyFilter.java
 * Definition File: Admin/AccountSegmentMap.xml
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

/** Key Filter for AccountSegmentMapObject object. */
public class AccountSegmentMapObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ACCT_SEG_MAP.acct_seg_id) */
  public    IntegerFilter[] AcctSegId  = null;
  protected boolean AcctSegIdFetch = false;
  protected boolean AcctSegIdSortAscending = true;
  protected Integer AcctSegIdSort = null;
  private String _objName = "AccountSegmentMapObjectKeyFilter";
  /** default constructor */
  public AccountSegmentMapObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AccountSegmentMapObjectKeyFilter (AccountSegmentMapObjectKeyFilter other)
  {
    if (other == null) return;
    this.AcctSegId = other.AcctSegId;
    this.AcctSegIdFetch = other.AcctSegIdFetch;
    this.AcctSegIdSort = other.AcctSegIdSort;
    this.AcctSegIdSortAscending = other.AcctSegIdSortAscending;
  }
  /** Set the field level Fetch value for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcctSegIdFetch (boolean fetch) {
    this.AcctSegIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcctSegIdFetch () {
    return this.AcctSegIdFetch;
  }
  /** Set the SortOrder for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcctSegIdSortOrder (Integer value) {
    this.AcctSegIdSort = value;
  }
  /** Retrieve SortOrder for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcctSegIdSortOrder () {
    return this.AcctSegIdSort;
  }
  /** Set the sort direction for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcctSegIdSortDirection (boolean ascending) {
    this.AcctSegIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcctSegIdSortDirection () {
    return this.AcctSegIdSortAscending;
  }
  /** Set the field level filters for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcctSegIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AcctSegId = value;
  }
  /** Retrieve filter for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcctSegIdFilter () {
    return this.AcctSegId;
  }

  /**
   * Retrieves the AcctSegIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AcctSegIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcctSegIdFilter field
   */
  public String[] getAcctSegIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAcctSegIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AcctSegIdFilter filter value from a formatted string
   *
   * @param _value the AcctSegIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AcctSegIdFilter filter field
   */
  public void setAcctSegIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFilterFromFormattedString");
    try {
      this.setAcctSegIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFilterFromFormattedString");
  }

  public String toString() {
    return AccountSegmentMapObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountSegmentMapObjectKeyHelper.toMap(this, null);
  }
}
