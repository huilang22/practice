/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageObjectKeyFilter.java
 * Definition File: Customer/UnbilledUsage.xml
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

/** Key Filter for UnbilledUsageObject object. */
public class UnbilledUsageObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CDR_DATA.msg_id) */
  public    IntegerFilter[] MsgId  = null;
  protected boolean MsgIdFetch = false;
  protected boolean MsgIdSortAscending = true;
  protected Integer MsgIdSort = null;
  /** raw field for: CDR_DATA.msg_id2) */
  public    IntegerFilter[] MsgId2  = null;
  protected boolean MsgId2Fetch = false;
  protected boolean MsgId2SortAscending = true;
  protected Integer MsgId2Sort = null;
  /** raw field for: CDR_DATA.msg_id_serv) */
  public    IntegerFilter[] MsgIdServ  = null;
  protected boolean MsgIdServFetch = false;
  protected boolean MsgIdServSortAscending = true;
  protected Integer MsgIdServSort = null;
  /** raw field for: CDR_DATA.split_row_num) */
  public    IntegerFilter[] SplitRowNum  = null;
  protected boolean SplitRowNumFetch = false;
  protected boolean SplitRowNumSortAscending = true;
  protected Integer SplitRowNumSort = null;
  private String _objName = "UnbilledUsageObjectKeyFilter";
  /** default constructor */
  public UnbilledUsageObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public UnbilledUsageObjectKeyFilter (UnbilledUsageObjectKeyFilter other)
  {
    if (other == null) return;
    this.MsgId = other.MsgId;
    this.MsgIdFetch = other.MsgIdFetch;
    this.MsgIdSort = other.MsgIdSort;
    this.MsgIdSortAscending = other.MsgIdSortAscending;
    this.MsgId2 = other.MsgId2;
    this.MsgId2Fetch = other.MsgId2Fetch;
    this.MsgId2Sort = other.MsgId2Sort;
    this.MsgId2SortAscending = other.MsgId2SortAscending;
    this.MsgIdServ = other.MsgIdServ;
    this.MsgIdServFetch = other.MsgIdServFetch;
    this.MsgIdServSort = other.MsgIdServSort;
    this.MsgIdServSortAscending = other.MsgIdServSortAscending;
    this.SplitRowNum = other.SplitRowNum;
    this.SplitRowNumFetch = other.SplitRowNumFetch;
    this.SplitRowNumSort = other.SplitRowNumSort;
    this.SplitRowNumSortAscending = other.SplitRowNumSortAscending;
  }
  /** Set the field level Fetch value for field: MsgId (CDR_DATA.msg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdFetch (boolean fetch) {
    this.MsgIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId (CDR_DATA.msg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdFetch () {
    return this.MsgIdFetch;
  }
  /** Set the SortOrder for field: MsgId (CDR_DATA.msg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdSortOrder (Integer value) {
    this.MsgIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgId (CDR_DATA.msg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdSortOrder () {
    return this.MsgIdSort;
  }
  /** Set the sort direction for field: MsgId (CDR_DATA.msg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdSortDirection (boolean ascending) {
    this.MsgIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId (CDR_DATA.msg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdSortDirection () {
    return this.MsgIdSortAscending;
  }
  /** Set the field level filters for field: MsgId (CDR_DATA.msg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgId = value;
  }
  /** Retrieve filter for field: MsgId (CDR_DATA.msg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdFilter () {
    return this.MsgId;
  }

  /**
   * Retrieves the MsgIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdFilter field
   */
  public String[] getMsgIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdFilter filter value from a formatted string
   *
   * @param _value the MsgIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdFilter filter field
   */
  public void setMsgIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdFilterFromFormattedString");
    try {
      this.setMsgIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgId2 (CDR_DATA.msg_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgId2Fetch (boolean fetch) {
    this.MsgId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId2 (CDR_DATA.msg_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgId2Fetch () {
    return this.MsgId2Fetch;
  }
  /** Set the SortOrder for field: MsgId2 (CDR_DATA.msg_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgId2SortOrder (Integer value) {
    this.MsgId2Sort = value;
  }
  /** Retrieve SortOrder for field: MsgId2 (CDR_DATA.msg_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgId2SortOrder () {
    return this.MsgId2Sort;
  }
  /** Set the sort direction for field: MsgId2 (CDR_DATA.msg_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgId2SortDirection (boolean ascending) {
    this.MsgId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId2 (CDR_DATA.msg_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgId2SortDirection () {
    return this.MsgId2SortAscending;
  }
  /** Set the field level filters for field: MsgId2 (CDR_DATA.msg_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgId2Filter (IntegerFilter[] value) throws ServiceException {
    this.MsgId2 = value;
  }
  /** Retrieve filter for field: MsgId2 (CDR_DATA.msg_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgId2Filter () {
    return this.MsgId2;
  }

  /**
   * Retrieves the MsgId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2Filter field
   */
  public String[] getMsgId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgId2Filter filter value from a formatted string
   *
   * @param _value the MsgId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgId2Filter filter field
   */
  public void setMsgId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgId2FilterFromFormattedString");
    try {
      this.setMsgId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdServFetch (boolean fetch) {
    this.MsgIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdServFetch () {
    return this.MsgIdServFetch;
  }
  /** Set the SortOrder for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdServSortOrder (Integer value) {
    this.MsgIdServSort = value;
  }
  /** Retrieve SortOrder for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdServSortOrder () {
    return this.MsgIdServSort;
  }
  /** Set the sort direction for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdServSortDirection (boolean ascending) {
    this.MsgIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdServSortDirection () {
    return this.MsgIdServSortAscending;
  }
  /** Set the field level filters for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgIdServ = value;
  }
  /** Retrieve filter for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdServFilter () {
    return this.MsgIdServ;
  }

  /**
   * Retrieves the MsgIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServFilter field
   */
  public String[] getMsgIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdServFilter filter value from a formatted string
   *
   * @param _value the MsgIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdServFilter filter field
   */
  public void setMsgIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdServFilterFromFormattedString");
    try {
      this.setMsgIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SplitRowNum (CDR_DATA.split_row_num)
   * @param fetch whether to fetch this field or not
   */
  public void setSplitRowNumFetch (boolean fetch) {
    this.SplitRowNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getSplitRowNumFetch () {
    return this.SplitRowNumFetch;
  }
  /** Set the SortOrder for field: SplitRowNum (CDR_DATA.split_row_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSplitRowNumSortOrder (Integer value) {
    this.SplitRowNumSort = value;
  }
  /** Retrieve SortOrder for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSplitRowNumSortOrder () {
    return this.SplitRowNumSort;
  }
  /** Set the sort direction for field: SplitRowNum (CDR_DATA.split_row_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSplitRowNumSortDirection (boolean ascending) {
    this.SplitRowNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSplitRowNumSortDirection () {
    return this.SplitRowNumSortAscending;
  }
  /** Set the field level filters for field: SplitRowNum (CDR_DATA.split_row_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSplitRowNumFilter (IntegerFilter[] value) throws ServiceException {
    this.SplitRowNum = value;
  }
  /** Retrieve filter for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSplitRowNumFilter () {
    return this.SplitRowNum;
  }

  /**
   * Retrieves the SplitRowNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SplitRowNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNumFilter field
   */
  public String[] getSplitRowNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSplitRowNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SplitRowNumFilter filter value from a formatted string
   *
   * @param _value the SplitRowNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SplitRowNumFilter filter field
   */
  public void setSplitRowNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSplitRowNumFilterFromFormattedString");
    try {
      this.setSplitRowNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFilterFromFormattedString");
  }

  public String toString() {
    return UnbilledUsageObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return UnbilledUsageObjectKeyHelper.toMap(this, null);
  }
}
