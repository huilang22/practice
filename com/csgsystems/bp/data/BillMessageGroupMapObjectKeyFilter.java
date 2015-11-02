/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillMessageGroupMapObjectKeyFilter.java
 * Definition File: Admin/BillMessageGroupMap.xml
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

/** Key Filter for BillMessageGroupMapObject object. */
public class BillMessageGroupMapObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: BILL_MESSAGE_GROUPS.msg_grp_id) */
  public    IntegerFilter[] MsgGrpId  = null;
  protected boolean MsgGrpIdFetch = false;
  protected boolean MsgGrpIdSortAscending = true;
  protected Integer MsgGrpIdSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.message_id) */
  public    IntegerFilter[] MessageId  = null;
  protected boolean MessageIdFetch = false;
  protected boolean MessageIdSortAscending = true;
  protected Integer MessageIdSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.msg_sequence_num) */
  public    IntegerFilter[] MsgSequenceNum  = null;
  protected boolean MsgSequenceNumFetch = false;
  protected boolean MsgSequenceNumSortAscending = true;
  protected Integer MsgSequenceNumSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.geo_key) */
  public    StringFilter[] GeoKey  = null;
  protected boolean GeoKeyFetch = false;
  protected boolean GeoKeySortAscending = true;
  protected boolean GeoKeyCaseInsensitive = false;
  protected Integer GeoKeySort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.mkt_code) */
  public    IntegerFilter[] MktCode  = null;
  protected boolean MktCodeFetch = false;
  protected boolean MktCodeSortAscending = true;
  protected Integer MktCodeSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.service_center_id) */
  public    IntegerFilter[] ServiceCenterId  = null;
  protected boolean ServiceCenterIdFetch = false;
  protected boolean ServiceCenterIdSortAscending = true;
  protected Integer ServiceCenterIdSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.msg_foreign_key) */
  public    IntegerFilter[] MsgForeignKey  = null;
  protected boolean MsgForeignKeyFetch = false;
  protected boolean MsgForeignKeySortAscending = true;
  protected Integer MsgForeignKeySort = null;
  private String _objName = "BillMessageGroupMapObjectKeyFilter";
  /** default constructor */
  public BillMessageGroupMapObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public BillMessageGroupMapObjectKeyFilter (BillMessageGroupMapObjectKeyFilter other)
  {
    if (other == null) return;
    this.MsgGrpId = other.MsgGrpId;
    this.MsgGrpIdFetch = other.MsgGrpIdFetch;
    this.MsgGrpIdSort = other.MsgGrpIdSort;
    this.MsgGrpIdSortAscending = other.MsgGrpIdSortAscending;
    this.MessageId = other.MessageId;
    this.MessageIdFetch = other.MessageIdFetch;
    this.MessageIdSort = other.MessageIdSort;
    this.MessageIdSortAscending = other.MessageIdSortAscending;
    this.MsgSequenceNum = other.MsgSequenceNum;
    this.MsgSequenceNumFetch = other.MsgSequenceNumFetch;
    this.MsgSequenceNumSort = other.MsgSequenceNumSort;
    this.MsgSequenceNumSortAscending = other.MsgSequenceNumSortAscending;
    this.GeoKey = other.GeoKey;
    this.GeoKeyFetch = other.GeoKeyFetch;
    this.GeoKeySort = other.GeoKeySort;
    this.GeoKeyCaseInsensitive = other.GeoKeyCaseInsensitive;
    this.GeoKeySortAscending = other.GeoKeySortAscending;
    this.MktCode = other.MktCode;
    this.MktCodeFetch = other.MktCodeFetch;
    this.MktCodeSort = other.MktCodeSort;
    this.MktCodeSortAscending = other.MktCodeSortAscending;
    this.ServiceCenterId = other.ServiceCenterId;
    this.ServiceCenterIdFetch = other.ServiceCenterIdFetch;
    this.ServiceCenterIdSort = other.ServiceCenterIdSort;
    this.ServiceCenterIdSortAscending = other.ServiceCenterIdSortAscending;
    this.MsgForeignKey = other.MsgForeignKey;
    this.MsgForeignKeyFetch = other.MsgForeignKeyFetch;
    this.MsgForeignKeySort = other.MsgForeignKeySort;
    this.MsgForeignKeySortAscending = other.MsgForeignKeySortAscending;
  }
  /** Set the field level Fetch value for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgGrpIdFetch (boolean fetch) {
    this.MsgGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgGrpIdFetch () {
    return this.MsgGrpIdFetch;
  }
  /** Set the SortOrder for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgGrpIdSortOrder (Integer value) {
    this.MsgGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgGrpIdSortOrder () {
    return this.MsgGrpIdSort;
  }
  /** Set the sort direction for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgGrpIdSortDirection (boolean ascending) {
    this.MsgGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgGrpIdSortDirection () {
    return this.MsgGrpIdSortAscending;
  }
  /** Set the field level filters for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgGrpId = value;
  }
  /** Retrieve filter for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
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

  /** Set the field level Fetch value for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMessageIdFetch (boolean fetch) {
    this.MessageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMessageIdFetch () {
    return this.MessageIdFetch;
  }
  /** Set the SortOrder for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMessageIdSortOrder (Integer value) {
    this.MessageIdSort = value;
  }
  /** Retrieve SortOrder for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMessageIdSortOrder () {
    return this.MessageIdSort;
  }
  /** Set the sort direction for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMessageIdSortDirection (boolean ascending) {
    this.MessageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMessageIdSortDirection () {
    return this.MessageIdSortAscending;
  }
  /** Set the field level filters for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMessageIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MessageId = value;
  }
  /** Retrieve filter for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMessageIdFilter () {
    return this.MessageId;
  }

  /**
   * Retrieves the MessageIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MessageIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MessageIdFilter field
   */
  public String[] getMessageIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMessageIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMessageIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MessageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMessageIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MessageIdFilter filter value from a formatted string
   *
   * @param _value the MessageIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MessageIdFilter filter field
   */
  public void setMessageIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMessageIdFilterFromFormattedString");
    try {
      this.setMessageIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MessageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMessageIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMessageIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgSequenceNumFetch (boolean fetch) {
    this.MsgSequenceNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgSequenceNumFetch () {
    return this.MsgSequenceNumFetch;
  }
  /** Set the SortOrder for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgSequenceNumSortOrder (Integer value) {
    this.MsgSequenceNumSort = value;
  }
  /** Retrieve SortOrder for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgSequenceNumSortOrder () {
    return this.MsgSequenceNumSort;
  }
  /** Set the sort direction for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgSequenceNumSortDirection (boolean ascending) {
    this.MsgSequenceNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgSequenceNumSortDirection () {
    return this.MsgSequenceNumSortAscending;
  }
  /** Set the field level filters for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgSequenceNumFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgSequenceNum = value;
  }
  /** Retrieve filter for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgSequenceNumFilter () {
    return this.MsgSequenceNum;
  }

  /**
   * Retrieves the MsgSequenceNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgSequenceNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgSequenceNumFilter field
   */
  public String[] getMsgSequenceNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgSequenceNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgSequenceNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgSequenceNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgSequenceNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgSequenceNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgSequenceNumFilter filter value from a formatted string
   *
   * @param _value the MsgSequenceNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgSequenceNumFilter filter field
   */
  public void setMsgSequenceNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgSequenceNumFilterFromFormattedString");
    try {
      this.setMsgSequenceNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgSequenceNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgSequenceNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgSequenceNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param fetch whether to fetch this field or not
   */
  public void setGeoKeyFetch (boolean fetch) {
    this.GeoKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeoKeyFetch () {
    return this.GeoKeyFetch;
  }
  /** Set the SortOrder for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeoKeySortOrder (Integer value) {
    this.GeoKeySort = value;
  }
  /** Retrieve SortOrder for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeoKeySortOrder () {
    return this.GeoKeySort;
  }
  /** Set the sort direction for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeoKeySortDirection (boolean ascending) {
    this.GeoKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeoKeySortDirection () {
    return this.GeoKeySortAscending;
  }
  /** Set the case insensitive for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeoKeyCaseInsensitive (boolean ascending) {
    this.GeoKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGeoKeyCaseInsensitive () {
    return this.GeoKeyCaseInsensitive;
  }
  /** Set the field level filters for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeoKeyFilter (StringFilter[] value) throws ServiceException {
    this.GeoKey = value;
  }
  /** Retrieve filter for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeoKeyFilter () {
    return this.GeoKey;
  }

  /**
   * Retrieves the GeoKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GeoKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GeoKeyFilter field
   */
  public String[] getGeoKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGeoKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeoKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeoKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeoKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GeoKeyFilter filter value from a formatted string
   *
   * @param _value the GeoKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GeoKeyFilter filter field
   */
  public void setGeoKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGeoKeyFilterFromFormattedString");
    try {
      this.setGeoKeyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeoKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeoKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeoKeyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch) {
    this.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch () {
    return this.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value) {
    this.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder () {
    return this.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending) {
    this.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection () {
    return this.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter () {
    return this.MktCode;
  }

  /**
   * Retrieves the MktCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MktCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCodeFilter field
   */
  public String[] getMktCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMktCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MktCodeFilter filter value from a formatted string
   *
   * @param _value the MktCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MktCodeFilter filter field
   */
  public void setMktCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFilterFromFormattedString");
    try {
      this.setMktCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterIdFetch (boolean fetch) {
    this.ServiceCenterIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterIdFetch () {
    return this.ServiceCenterIdFetch;
  }
  /** Set the SortOrder for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterIdSortOrder (Integer value) {
    this.ServiceCenterIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterIdSortOrder () {
    return this.ServiceCenterIdSort;
  }
  /** Set the sort direction for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterIdSortDirection (boolean ascending) {
    this.ServiceCenterIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterIdSortDirection () {
    return this.ServiceCenterIdSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceCenterId = value;
  }
  /** Retrieve filter for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
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

  /** Set the field level Fetch value for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgForeignKeyFetch (boolean fetch) {
    this.MsgForeignKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgForeignKeyFetch () {
    return this.MsgForeignKeyFetch;
  }
  /** Set the SortOrder for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgForeignKeySortOrder (Integer value) {
    this.MsgForeignKeySort = value;
  }
  /** Retrieve SortOrder for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgForeignKeySortOrder () {
    return this.MsgForeignKeySort;
  }
  /** Set the sort direction for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgForeignKeySortDirection (boolean ascending) {
    this.MsgForeignKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgForeignKeySortDirection () {
    return this.MsgForeignKeySortAscending;
  }
  /** Set the field level filters for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgForeignKeyFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgForeignKey = value;
  }
  /** Retrieve filter for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgForeignKeyFilter () {
    return this.MsgForeignKey;
  }

  /**
   * Retrieves the MsgForeignKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgForeignKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgForeignKeyFilter field
   */
  public String[] getMsgForeignKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgForeignKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgForeignKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgForeignKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgForeignKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgForeignKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgForeignKeyFilter filter value from a formatted string
   *
   * @param _value the MsgForeignKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgForeignKeyFilter filter field
   */
  public void setMsgForeignKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgForeignKeyFilterFromFormattedString");
    try {
      this.setMsgForeignKeyFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgForeignKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgForeignKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgForeignKeyFilterFromFormattedString");
  }

  public String toString() {
    return BillMessageGroupMapObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillMessageGroupMapObjectKeyHelper.toMap(this, null);
  }
}
