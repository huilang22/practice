/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CmfBonusPointObjectKeyFilter.java
 * Definition File: Customer/CmfBonusPoint.xml
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

/** Key Filter for CmfBonusPointObject object. */
public class CmfBonusPointObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CMF_BONUS_POINT.point_trans_tracking_id) */
  public    IntegerFilter[] PointTransTrackingId  = null;
  protected boolean PointTransTrackingIdFetch = false;
  protected boolean PointTransTrackingIdSortAscending = true;
  protected Integer PointTransTrackingIdSort = null;
  /** raw field for: CMF_BONUS_POINT.point_trans_tracking_id_serv) */
  public    IntegerFilter[] PointTransTrackingIdServ  = null;
  protected boolean PointTransTrackingIdServFetch = false;
  protected boolean PointTransTrackingIdServSortAscending = true;
  protected Integer PointTransTrackingIdServSort = null;
  private String _objName = "CmfBonusPointObjectKeyFilter";
  /** default constructor */
  public CmfBonusPointObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CmfBonusPointObjectKeyFilter (CmfBonusPointObjectKeyFilter other)
  {
    if (other == null) return;
    this.PointTransTrackingId = other.PointTransTrackingId;
    this.PointTransTrackingIdFetch = other.PointTransTrackingIdFetch;
    this.PointTransTrackingIdSort = other.PointTransTrackingIdSort;
    this.PointTransTrackingIdSortAscending = other.PointTransTrackingIdSortAscending;
    this.PointTransTrackingIdServ = other.PointTransTrackingIdServ;
    this.PointTransTrackingIdServFetch = other.PointTransTrackingIdServFetch;
    this.PointTransTrackingIdServSort = other.PointTransTrackingIdServSort;
    this.PointTransTrackingIdServSortAscending = other.PointTransTrackingIdServSortAscending;
  }
  /** Set the field level Fetch value for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTransTrackingIdFetch (boolean fetch) {
    this.PointTransTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTransTrackingIdFetch () {
    return this.PointTransTrackingIdFetch;
  }
  /** Set the SortOrder for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTransTrackingIdSortOrder (Integer value) {
    this.PointTransTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTransTrackingIdSortOrder () {
    return this.PointTransTrackingIdSort;
  }
  /** Set the sort direction for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTransTrackingIdSortDirection (boolean ascending) {
    this.PointTransTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTransTrackingIdSortDirection () {
    return this.PointTransTrackingIdSortAscending;
  }
  /** Set the field level filters for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTransTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PointTransTrackingId = value;
  }
  /** Retrieve filter for field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointTransTrackingIdFilter () {
    return this.PointTransTrackingId;
  }

  /**
   * Retrieves the PointTransTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTransTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTransTrackingIdFilter field
   */
  public String[] getPointTransTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTransTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTransTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTransTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTransTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTransTrackingIdFilter filter value from a formatted string
   *
   * @param _value the PointTransTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTransTrackingIdFilter filter field
   */
  public void setPointTransTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTransTrackingIdFilterFromFormattedString");
    try {
      this.setPointTransTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTransTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTransTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTransTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTransTrackingIdServFetch (boolean fetch) {
    this.PointTransTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTransTrackingIdServFetch () {
    return this.PointTransTrackingIdServFetch;
  }
  /** Set the SortOrder for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTransTrackingIdServSortOrder (Integer value) {
    this.PointTransTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTransTrackingIdServSortOrder () {
    return this.PointTransTrackingIdServSort;
  }
  /** Set the sort direction for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTransTrackingIdServSortDirection (boolean ascending) {
    this.PointTransTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTransTrackingIdServSortDirection () {
    return this.PointTransTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTransTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.PointTransTrackingIdServ = value;
  }
  /** Retrieve filter for field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointTransTrackingIdServFilter () {
    return this.PointTransTrackingIdServ;
  }

  /**
   * Retrieves the PointTransTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTransTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTransTrackingIdServFilter field
   */
  public String[] getPointTransTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTransTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTransTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTransTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTransTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTransTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the PointTransTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTransTrackingIdServFilter filter field
   */
  public void setPointTransTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTransTrackingIdServFilterFromFormattedString");
    try {
      this.setPointTransTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTransTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTransTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTransTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return CmfBonusPointObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CmfBonusPointObjectKeyHelper.toMap(this, null);
  }
}
