/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CcAuditLogObjectKeyFilter.java
 * Definition File: Customer/CcAuditLog.xml
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

/** Key Filter for CcAuditLogObject object. */
public class CcAuditLogObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CC_AUDIT_LOG.view_def_id) */
  public    IntegerFilter[] ViewDefId  = null;
  protected boolean ViewDefIdFetch = false;
  protected boolean ViewDefIdSortAscending = true;
  protected Integer ViewDefIdSort = null;
  /** raw field for: CC_AUDIT_LOG.user_id) */
  public    StringFilter[] UserId  = null;
  protected boolean UserIdFetch = false;
  protected boolean UserIdSortAscending = true;
  protected boolean UserIdCaseInsensitive = false;
  protected Integer UserIdSort = null;
  /** raw field for: CC_AUDIT_LOG.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  private String _objName = "CcAuditLogObjectKeyFilter";
  /** default constructor */
  public CcAuditLogObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public CcAuditLogObjectKeyFilter (CcAuditLogObjectKeyFilter other)
  {
    if (other == null) return;
    this.ViewDefId = other.ViewDefId;
    this.ViewDefIdFetch = other.ViewDefIdFetch;
    this.ViewDefIdSort = other.ViewDefIdSort;
    this.ViewDefIdSortAscending = other.ViewDefIdSortAscending;
    this.UserId = other.UserId;
    this.UserIdFetch = other.UserIdFetch;
    this.UserIdSort = other.UserIdSort;
    this.UserIdCaseInsensitive = other.UserIdCaseInsensitive;
    this.UserIdSortAscending = other.UserIdSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
  }
  /** Set the field level Fetch value for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @param fetch whether to fetch this field or not
   */
  public void setViewDefIdFetch (boolean fetch) {
    this.ViewDefIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewDefIdFetch () {
    return this.ViewDefIdFetch;
  }
  /** Set the SortOrder for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewDefIdSortOrder (Integer value) {
    this.ViewDefIdSort = value;
  }
  /** Retrieve SortOrder for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewDefIdSortOrder () {
    return this.ViewDefIdSort;
  }
  /** Set the sort direction for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewDefIdSortDirection (boolean ascending) {
    this.ViewDefIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewDefIdSortDirection () {
    return this.ViewDefIdSortAscending;
  }
  /** Set the field level filters for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewDefIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ViewDefId = value;
  }
  /** Retrieve filter for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getViewDefIdFilter () {
    return this.ViewDefId;
  }

  /**
   * Retrieves the ViewDefIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewDefIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewDefIdFilter field
   */
  public String[] getViewDefIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewDefIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewDefIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewDefIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewDefIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewDefIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ViewDefIdFilter filter value from a formatted string
   *
   * @param _value the ViewDefIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewDefIdFilter filter field
   */
  public void setViewDefIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewDefIdFilterFromFormattedString");
    try {
      this.setViewDefIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewDefIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewDefIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewDefIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UserId (CC_AUDIT_LOG.user_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUserIdFetch (boolean fetch) {
    this.UserIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UserId (CC_AUDIT_LOG.user_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUserIdFetch () {
    return this.UserIdFetch;
  }
  /** Set the SortOrder for field: UserId (CC_AUDIT_LOG.user_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUserIdSortOrder (Integer value) {
    this.UserIdSort = value;
  }
  /** Retrieve SortOrder for field: UserId (CC_AUDIT_LOG.user_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUserIdSortOrder () {
    return this.UserIdSort;
  }
  /** Set the sort direction for field: UserId (CC_AUDIT_LOG.user_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUserIdSortDirection (boolean ascending) {
    this.UserIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UserId (CC_AUDIT_LOG.user_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUserIdSortDirection () {
    return this.UserIdSortAscending;
  }
  /** Set the case insensitive for field: UserId (CC_AUDIT_LOG.user_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUserIdCaseInsensitive (boolean ascending) {
    this.UserIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UserId (CC_AUDIT_LOG.user_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUserIdCaseInsensitive () {
    return this.UserIdCaseInsensitive;
  }
  /** Set the field level filters for field: UserId (CC_AUDIT_LOG.user_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUserIdFilter (StringFilter[] value) throws ServiceException {
    this.UserId = value;
  }
  /** Retrieve filter for field: UserId (CC_AUDIT_LOG.user_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUserIdFilter () {
    return this.UserId;
  }

  /**
   * Retrieves the UserIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UserIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UserIdFilter field
   */
  public String[] getUserIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUserIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUserIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UserIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUserIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UserIdFilter filter value from a formatted string
   *
   * @param _value the UserIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UserIdFilter filter field
   */
  public void setUserIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUserIdFilterFromFormattedString");
    try {
      this.setUserIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UserIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUserIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUserIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (CC_AUDIT_LOG.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (CC_AUDIT_LOG.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDateFilter () {
    return this.TransDate;
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return CcAuditLogObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CcAuditLogObjectKeyHelper.toMap(this, null);
  }
}
