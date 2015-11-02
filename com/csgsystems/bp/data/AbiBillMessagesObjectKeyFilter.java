/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillMessagesObjectKeyFilter.java
 * Definition File: Customer/AbiBillMessages.xml
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

/** Key Filter for AbiBillMessagesObject object. */
public class AbiBillMessagesObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ABI_BILL_MESSAGES.message_id) */
  public    IntegerFilter[] MessageId  = null;
  protected boolean MessageIdFetch = false;
  protected boolean MessageIdSortAscending = true;
  protected Integer MessageIdSort = null;
  private String _objName = "AbiBillMessagesObjectKeyFilter";
  /** default constructor */
  public AbiBillMessagesObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AbiBillMessagesObjectKeyFilter (AbiBillMessagesObjectKeyFilter other)
  {
    if (other == null) return;
    this.MessageId = other.MessageId;
    this.MessageIdFetch = other.MessageIdFetch;
    this.MessageIdSort = other.MessageIdSort;
    this.MessageIdSortAscending = other.MessageIdSortAscending;
  }
  /** Set the field level Fetch value for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMessageIdFetch (boolean fetch) {
    this.MessageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMessageIdFetch () {
    return this.MessageIdFetch;
  }
  /** Set the SortOrder for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMessageIdSortOrder (Integer value) {
    this.MessageIdSort = value;
  }
  /** Retrieve SortOrder for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMessageIdSortOrder () {
    return this.MessageIdSort;
  }
  /** Set the sort direction for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMessageIdSortDirection (boolean ascending) {
    this.MessageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMessageIdSortDirection () {
    return this.MessageIdSortAscending;
  }
  /** Set the field level filters for field: MessageId (ABI_BILL_MESSAGES.message_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMessageIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MessageId = value;
  }
  /** Retrieve filter for field: MessageId (ABI_BILL_MESSAGES.message_id)
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

  public String toString() {
    return AbiBillMessagesObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AbiBillMessagesObjectKeyHelper.toMap(this, null);
  }
}
