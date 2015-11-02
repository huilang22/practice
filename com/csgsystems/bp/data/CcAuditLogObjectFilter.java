/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CcAuditLogObjectFilter.java
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
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class CcAuditLogObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CcAuditLogObjectKeyFilter Key = null;
  /** raw field for: CC_AUDIT_LOG.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CC_AUDIT_LOG.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: CC_AUDIT_LOG.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  private String _objName = "CcAuditLogObjectFilter";
  /** default constructor */
  public CcAuditLogObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CcAuditLogObjectFilter (CcAuditLogObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CcAuditLogObjectKeyFilter (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;  }
  /** get the filter for this object's key
   * @return CcAuditLogObjectKeyFilter
   */
  public CcAuditLogObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CcAuditLogObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @param fetch whether to fetch this field or not
   */
  public void setViewDefIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.ViewDefIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewDefIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ViewDefIdFetch;
  }
  /** Set the SortOrder for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewDefIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.ViewDefIdSort = value;
  }
  /** Retrieve SortOrder for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewDefIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ViewDefIdSort;
  }
  /** Set the sort direction for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewDefIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.ViewDefIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewDefIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ViewDefIdSortAscending;
  }
  /** Set the field level filters for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewDefIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.ViewDefId = value;
  }
  /** Retrieve filter for field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getViewDefIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ViewDefId;
  }
  /** Set the field level Fetch value for field: UserId (CC_AUDIT_LOG.user_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUserIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.UserIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UserId (CC_AUDIT_LOG.user_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUserIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.UserIdFetch;
  }
  /** Set the SortOrder for field: UserId (CC_AUDIT_LOG.user_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUserIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.UserIdSort = value;
  }
  /** Retrieve SortOrder for field: UserId (CC_AUDIT_LOG.user_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUserIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.UserIdSort;
  }
  /** Set the sort direction for field: UserId (CC_AUDIT_LOG.user_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUserIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.UserIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UserId (CC_AUDIT_LOG.user_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUserIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.UserIdSortAscending;
  }
  /** Set the case insensitive for field: UserId (CC_AUDIT_LOG.user_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUserIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.UserIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: UserId (CC_AUDIT_LOG.user_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getUserIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.UserIdCaseInsensitive;
  }
  /** Set the field level filters for field: UserId (CC_AUDIT_LOG.user_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUserIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.UserId = value;
  }
  /** Retrieve filter for field: UserId (CC_AUDIT_LOG.user_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUserIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.UserId;
  }
  /** Set the field level Fetch value for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (CC_AUDIT_LOG.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (CC_AUDIT_LOG.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CcAuditLogObjectKeyFilter ();
    this.Key.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDateFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TransDate;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CC_AUDIT_LOG.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter () {
    return this.AccountInternalId;
  }

  /**
   * Retrieves the AccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalIdFilter field
   */
  public String[] getAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountInternalIdFilter filter field
   */
  public void setAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
    try {
      this.setAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (CC_AUDIT_LOG.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter () {
    return this.ServiceInternalId;
  }

  /**
   * Retrieves the ServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdFilter field
   */
  public String[] getServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdFilter filter field
   */
  public void setServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
    try {
      this.setServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (CC_AUDIT_LOG.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter () {
    return this.ServiceInternalIdResets;
  }

  /**
   * Retrieves the ServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResetsFilter field
   */
  public String[] getServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdResetsFilter filter field
   */
  public void setServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  public String toString() {
    return CcAuditLogObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CcAuditLogObjectHelper.toMap(this, null);
  }
}
