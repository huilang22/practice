/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: OrderServerLocateObjectKeyFilter.java
 * Definition File: Catalog/AccountLocate.xml
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

/** Key Filter for OrderServerLocateObject object. */
public class OrderServerLocateObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ORD_ORDER_LOOKUP.order_id) */
  public    BigIntegerFilter[] OrderId  = null;
  protected boolean OrderIdFetch = false;
  protected boolean OrderIdSortAscending = true;
  protected Integer OrderIdSort = null;
  private String _objName = "OrderServerLocateObjectKeyFilter";
  /** default constructor */
  public OrderServerLocateObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public OrderServerLocateObjectKeyFilter (OrderServerLocateObjectKeyFilter other)
  {
    if (other == null) return;
    this.OrderId = other.OrderId;
    this.OrderIdFetch = other.OrderIdFetch;
    this.OrderIdSort = other.OrderIdSort;
    this.OrderIdSortAscending = other.OrderIdSortAscending;
  }
  /** Set the field level Fetch value for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrderIdFetch (boolean fetch) {
    this.OrderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrderIdFetch () {
    return this.OrderIdFetch;
  }
  /** Set the SortOrder for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrderIdSortOrder (Integer value) {
    this.OrderIdSort = value;
  }
  /** Retrieve SortOrder for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrderIdSortOrder () {
    return this.OrderIdSort;
  }
  /** Set the sort direction for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrderIdSortDirection (boolean ascending) {
    this.OrderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrderIdSortDirection () {
    return this.OrderIdSortAscending;
  }
  /** Set the field level filters for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrderIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OrderId = value;
  }
  /** Retrieve filter for field: OrderId (ORD_ORDER_LOOKUP.order_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOrderIdFilter () {
    return this.OrderId;
  }

  /**
   * Retrieves the OrderIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrderIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderIdFilter field
   */
  public String[] getOrderIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrderIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrderIdFilter filter value from a formatted string
   *
   * @param _value the OrderIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrderIdFilter filter field
   */
  public void setOrderIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrderIdFilterFromFormattedString");
    try {
      this.setOrderIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderIdFilterFromFormattedString");
  }

  public String toString() {
    return OrderServerLocateObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return OrderServerLocateObjectKeyHelper.toMap(this, null);
  }
}
