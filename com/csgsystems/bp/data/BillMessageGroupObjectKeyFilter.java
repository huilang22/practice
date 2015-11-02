/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillMessageGroupObjectKeyFilter.java
 * Definition File: Admin/BillMessageGroup.xml
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

/** Key Filter for BillMessageGroupObject object. */
public class BillMessageGroupObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: MSG_GRP_ID_VALUES.msg_grp_id) */
  public    IntegerFilter[] MsgGrpId  = null;
  protected boolean MsgGrpIdFetch = false;
  protected boolean MsgGrpIdSortAscending = true;
  protected Integer MsgGrpIdSort = null;
  /** raw field for: MSG_GRP_ID_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "BillMessageGroupObjectKeyFilter";
  /** default constructor */
  public BillMessageGroupObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public BillMessageGroupObjectKeyFilter (BillMessageGroupObjectKeyFilter other)
  {
    if (other == null) return;
    this.MsgGrpId = other.MsgGrpId;
    this.MsgGrpIdFetch = other.MsgGrpIdFetch;
    this.MsgGrpIdSort = other.MsgGrpIdSort;
    this.MsgGrpIdSortAscending = other.MsgGrpIdSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgGrpIdFetch (boolean fetch) {
    this.MsgGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgGrpIdFetch () {
    return this.MsgGrpIdFetch;
  }
  /** Set the SortOrder for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgGrpIdSortOrder (Integer value) {
    this.MsgGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgGrpIdSortOrder () {
    return this.MsgGrpIdSort;
  }
  /** Set the sort direction for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgGrpIdSortDirection (boolean ascending) {
    this.MsgGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgGrpIdSortDirection () {
    return this.MsgGrpIdSortAscending;
  }
  /** Set the field level filters for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgGrpId = value;
  }
  /** Retrieve filter for field: MsgGrpId (MSG_GRP_ID_VALUES.msg_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgGrpIdFilter () {
    return this.MsgGrpId;
  }

  /**
   * Retrieves the MsgGrpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgGrpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgGrpIdFilter field
   */
  public String[] getMsgGrpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgGrpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgGrpIdFilter filter value from a formatted string
   *
   * @param _value the MsgGrpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgGrpIdFilter filter field
   */
  public void setMsgGrpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
    try {
      this.setMsgGrpIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (MSG_GRP_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  public String toString() {
    return BillMessageGroupObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillMessageGroupObjectKeyHelper.toMap(this, null);
  }
}
