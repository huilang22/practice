/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CRBOObjectKeyFilter.java
 * Definition File: Admin/CorridorRateBandOverride.xml
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

/** Key Filter for CRBOObject object. */
public class CRBOObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: RATE_USAGE_BANDS_OVERRIDES.seqnum) */
  public    IntegerFilter[] Seqnum  = null;
  protected boolean SeqnumFetch = false;
  protected boolean SeqnumSortAscending = true;
  protected Integer SeqnumSort = null;
  /** raw field for: RATE_USAGE_BANDS_OVERRIDES.rateband) */
  public    IntegerFilter[] Rateband  = null;
  protected boolean RatebandFetch = false;
  protected boolean RatebandSortAscending = true;
  protected Integer RatebandSort = null;
  private String _objName = "CRBOObjectKeyFilter";
  /** default constructor */
  public CRBOObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CRBOObjectKeyFilter (CRBOObjectKeyFilter other)
  {
    if (other == null) return;
    this.Seqnum = other.Seqnum;
    this.SeqnumFetch = other.SeqnumFetch;
    this.SeqnumSort = other.SeqnumSort;
    this.SeqnumSortAscending = other.SeqnumSortAscending;
    this.Rateband = other.Rateband;
    this.RatebandFetch = other.RatebandFetch;
    this.RatebandSort = other.RatebandSort;
    this.RatebandSortAscending = other.RatebandSortAscending;
  }
  /** Set the field level Fetch value for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @param fetch whether to fetch this field or not
   */
  public void setSeqnumFetch (boolean fetch) {
    this.SeqnumFetch = fetch;
  }
  /** Retrieve Fetch value for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return boolean the Fetch value for this field
   */
  public boolean getSeqnumFetch () {
    return this.SeqnumFetch;
  }
  /** Set the SortOrder for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSeqnumSortOrder (Integer value) {
    this.SeqnumSort = value;
  }
  /** Retrieve SortOrder for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSeqnumSortOrder () {
    return this.SeqnumSort;
  }
  /** Set the sort direction for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSeqnumSortDirection (boolean ascending) {
    this.SeqnumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSeqnumSortDirection () {
    return this.SeqnumSortAscending;
  }
  /** Set the field level filters for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSeqnumFilter (IntegerFilter[] value) throws ServiceException {
    this.Seqnum = value;
  }
  /** Retrieve filter for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSeqnumFilter () {
    return this.Seqnum;
  }

  /**
   * Retrieves the SeqnumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SeqnumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SeqnumFilter field
   */
  public String[] getSeqnumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSeqnumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSeqnumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SeqnumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSeqnumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SeqnumFilter filter value from a formatted string
   *
   * @param _value the SeqnumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SeqnumFilter filter field
   */
  public void setSeqnumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSeqnumFilterFromFormattedString");
    try {
      this.setSeqnumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SeqnumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSeqnumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSeqnumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @param fetch whether to fetch this field or not
   */
  public void setRatebandFetch (boolean fetch) {
    this.RatebandFetch = fetch;
  }
  /** Retrieve Fetch value for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatebandFetch () {
    return this.RatebandFetch;
  }
  /** Set the SortOrder for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatebandSortOrder (Integer value) {
    this.RatebandSort = value;
  }
  /** Retrieve SortOrder for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatebandSortOrder () {
    return this.RatebandSort;
  }
  /** Set the sort direction for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatebandSortDirection (boolean ascending) {
    this.RatebandSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatebandSortDirection () {
    return this.RatebandSortAscending;
  }
  /** Set the field level filters for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatebandFilter (IntegerFilter[] value) throws ServiceException {
    this.Rateband = value;
  }
  /** Retrieve filter for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRatebandFilter () {
    return this.Rateband;
  }

  /**
   * Retrieves the RatebandFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatebandFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatebandFilter field
   */
  public String[] getRatebandFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatebandFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatebandFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatebandFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatebandFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatebandFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatebandFilter filter value from a formatted string
   *
   * @param _value the RatebandFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatebandFilter filter field
   */
  public void setRatebandFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatebandFilterFromFormattedString");
    try {
      this.setRatebandFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatebandFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatebandFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatebandFilterFromFormattedString");
  }

  public String toString() {
    return CRBOObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CRBOObjectKeyHelper.toMap(this, null);
  }
}
