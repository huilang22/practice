/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountStatusObjectKeyFilter.java
 * Definition File: Customer/AccountStatus.xml
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

/** Key Filter for AccountStatusObject object. */
public class AccountStatusObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CMF_STATUS_HISTORY.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CMF_STATUS_HISTORY.cmf_status_type) */
  public    IntegerFilter[] CmfStatusType  = null;
  protected boolean CmfStatusTypeFetch = false;
  protected boolean CmfStatusTypeSortAscending = true;
  protected Integer CmfStatusTypeSort = null;
  /** raw field for: CMF_STATUS_HISTORY.cmf_status) */
  public    IntegerFilter[] CmfStatus  = null;
  protected boolean CmfStatusFetch = false;
  protected boolean CmfStatusSortAscending = true;
  protected Integer CmfStatusSort = null;
  /** raw field for: CMF_STATUS_HISTORY.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  private String _objName = "AccountStatusObjectKeyFilter";
  /** default constructor */
  public AccountStatusObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AccountStatusObjectKeyFilter (AccountStatusObjectKeyFilter other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.CmfStatusType = other.CmfStatusType;
    this.CmfStatusTypeFetch = other.CmfStatusTypeFetch;
    this.CmfStatusTypeSort = other.CmfStatusTypeSort;
    this.CmfStatusTypeSortAscending = other.CmfStatusTypeSortAscending;
    this.CmfStatus = other.CmfStatus;
    this.CmfStatusFetch = other.CmfStatusFetch;
    this.CmfStatusSort = other.CmfStatusSort;
    this.CmfStatusSortAscending = other.CmfStatusSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_STATUS_HISTORY.account_no)
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

  /** Set the field level Fetch value for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * @param fetch whether to fetch this field or not
   */
  public void setCmfStatusTypeFetch (boolean fetch) {
    this.CmfStatusTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getCmfStatusTypeFetch () {
    return this.CmfStatusTypeFetch;
  }
  /** Set the SortOrder for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmfStatusTypeSortOrder (Integer value) {
    this.CmfStatusTypeSort = value;
  }
  /** Retrieve SortOrder for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmfStatusTypeSortOrder () {
    return this.CmfStatusTypeSort;
  }
  /** Set the sort direction for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmfStatusTypeSortDirection (boolean ascending) {
    this.CmfStatusTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmfStatusTypeSortDirection () {
    return this.CmfStatusTypeSortAscending;
  }
  /** Set the field level filters for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmfStatusTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.CmfStatusType = value;
  }
  /** Retrieve filter for field: CmfStatusType (CMF_STATUS_HISTORY.cmf_status_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCmfStatusTypeFilter () {
    return this.CmfStatusType;
  }

  /**
   * Retrieves the CmfStatusTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CmfStatusTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmfStatusTypeFilter field
   */
  public String[] getCmfStatusTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCmfStatusTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CmfStatusTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmfStatusTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CmfStatusTypeFilter filter value from a formatted string
   *
   * @param _value the CmfStatusTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CmfStatusTypeFilter filter field
   */
  public void setCmfStatusTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCmfStatusTypeFilterFromFormattedString");
    try {
      this.setCmfStatusTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CmfStatusTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmfStatusTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmfStatusTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * @param fetch whether to fetch this field or not
   */
  public void setCmfStatusFetch (boolean fetch) {
    this.CmfStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getCmfStatusFetch () {
    return this.CmfStatusFetch;
  }
  /** Set the SortOrder for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCmfStatusSortOrder (Integer value) {
    this.CmfStatusSort = value;
  }
  /** Retrieve SortOrder for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCmfStatusSortOrder () {
    return this.CmfStatusSort;
  }
  /** Set the sort direction for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCmfStatusSortDirection (boolean ascending) {
    this.CmfStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCmfStatusSortDirection () {
    return this.CmfStatusSortAscending;
  }
  /** Set the field level filters for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCmfStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.CmfStatus = value;
  }
  /** Retrieve filter for field: CmfStatus (CMF_STATUS_HISTORY.cmf_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCmfStatusFilter () {
    return this.CmfStatus;
  }

  /**
   * Retrieves the CmfStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CmfStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CmfStatusFilter field
   */
  public String[] getCmfStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCmfStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCmfStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCmfStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CmfStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCmfStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CmfStatusFilter filter value from a formatted string
   *
   * @param _value the CmfStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CmfStatusFilter filter field
   */
  public void setCmfStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCmfStatusFilterFromFormattedString");
    try {
      this.setCmfStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CmfStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCmfStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCmfStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (CMF_STATUS_HISTORY.chg_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDtFilter () {
    return this.ChgDt;
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return AccountStatusObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountStatusObjectKeyHelper.toMap(this, null);
  }
}
