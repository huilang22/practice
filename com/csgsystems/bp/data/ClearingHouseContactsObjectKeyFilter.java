/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseContactsObjectKeyFilter.java
 * Definition File: Customer/ClearingHouseContacts.xml
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

/** Key Filter for ClearingHouseContactsObject object. */
public class ClearingHouseContactsObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CLEARING_HOUSE_CONTACTS.ext_contact_id) */
  public    IntegerFilter[] ExtContactId  = null;
  protected boolean ExtContactIdFetch = false;
  protected boolean ExtContactIdSortAscending = true;
  protected Integer ExtContactIdSort = null;
  private String _objName = "ClearingHouseContactsObjectKeyFilter";
  /** default constructor */
  public ClearingHouseContactsObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ClearingHouseContactsObjectKeyFilter (ClearingHouseContactsObjectKeyFilter other)
  {
    if (other == null) return;
    this.ExtContactId = other.ExtContactId;
    this.ExtContactIdFetch = other.ExtContactIdFetch;
    this.ExtContactIdSort = other.ExtContactIdSort;
    this.ExtContactIdSortAscending = other.ExtContactIdSortAscending;
  }
  /** Set the field level Fetch value for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExtContactIdFetch (boolean fetch) {
    this.ExtContactIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExtContactIdFetch () {
    return this.ExtContactIdFetch;
  }
  /** Set the SortOrder for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExtContactIdSortOrder (Integer value) {
    this.ExtContactIdSort = value;
  }
  /** Retrieve SortOrder for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExtContactIdSortOrder () {
    return this.ExtContactIdSort;
  }
  /** Set the sort direction for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExtContactIdSortDirection (boolean ascending) {
    this.ExtContactIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExtContactIdSortDirection () {
    return this.ExtContactIdSortAscending;
  }
  /** Set the field level filters for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExtContactIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ExtContactId = value;
  }
  /** Retrieve filter for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExtContactIdFilter () {
    return this.ExtContactId;
  }

  /**
   * Retrieves the ExtContactIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExtContactIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtContactIdFilter field
   */
  public String[] getExtContactIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtContactIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExtContactIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtContactIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtContactIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtContactIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExtContactIdFilter filter value from a formatted string
   *
   * @param _value the ExtContactIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExtContactIdFilter filter field
   */
  public void setExtContactIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExtContactIdFilterFromFormattedString");
    try {
      this.setExtContactIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtContactIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtContactIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtContactIdFilterFromFormattedString");
  }

  public String toString() {
    return ClearingHouseContactsObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ClearingHouseContactsObjectKeyHelper.toMap(this, null);
  }
}
