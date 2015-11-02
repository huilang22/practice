/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContactObjectKeyFilter.java
 * Definition File: Customer/Contact.xml
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

/** Key Filter for ContactObject object. */
public class ContactObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CONTACTS.contact_id) */
  public    IntegerFilter[] ContactId  = null;
  protected boolean ContactIdFetch = false;
  protected boolean ContactIdSortAscending = true;
  protected Integer ContactIdSort = null;
  private String _objName = "ContactObjectKeyFilter";
  /** default constructor */
  public ContactObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public ContactObjectKeyFilter (ContactObjectKeyFilter other)
  {
    if (other == null) return;
    this.ContactId = other.ContactId;
    this.ContactIdFetch = other.ContactIdFetch;
    this.ContactIdSort = other.ContactIdSort;
    this.ContactIdSortAscending = other.ContactIdSortAscending;
  }
  /** Set the field level Fetch value for field: ContactId (CONTACTS.contact_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContactIdFetch (boolean fetch) {
    this.ContactIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactId (CONTACTS.contact_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactIdFetch () {
    return this.ContactIdFetch;
  }
  /** Set the SortOrder for field: ContactId (CONTACTS.contact_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactIdSortOrder (Integer value) {
    this.ContactIdSort = value;
  }
  /** Retrieve SortOrder for field: ContactId (CONTACTS.contact_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactIdSortOrder () {
    return this.ContactIdSort;
  }
  /** Set the sort direction for field: ContactId (CONTACTS.contact_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactIdSortDirection (boolean ascending) {
    this.ContactIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactId (CONTACTS.contact_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactIdSortDirection () {
    return this.ContactIdSortAscending;
  }
  /** Set the field level filters for field: ContactId (CONTACTS.contact_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ContactId = value;
  }
  /** Retrieve filter for field: ContactId (CONTACTS.contact_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContactIdFilter () {
    return this.ContactId;
  }

  /**
   * Retrieves the ContactIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContactIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactIdFilter field
   */
  public String[] getContactIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContactIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContactIdFilter filter value from a formatted string
   *
   * @param _value the ContactIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContactIdFilter filter field
   */
  public void setContactIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContactIdFilterFromFormattedString");
    try {
      this.setContactIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContactIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactIdFilterFromFormattedString");
  }

  public String toString() {
    return ContactObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ContactObjectKeyHelper.toMap(this, null);
  }
}
