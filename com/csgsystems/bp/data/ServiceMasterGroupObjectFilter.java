/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceMasterGroupObjectFilter.java
 * Definition File: Customer/ServiceMasterGroup.xml
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
public class ServiceMasterGroupObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ServiceMasterGroupObjectKeyFilter Key = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  /** raw field for: EMF_MASTER_GROUPS.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: EMF_MASTER_GROUPS.comments) */
  public    StringFilter[] Comments  = null;
  protected boolean CommentsFetch = false;
  protected boolean CommentsSortAscending = true;
  protected boolean CommentsCaseInsensitive = false;
  protected Integer CommentsSort = null;
  /** raw field for: EMF_MASTER_GROUPS.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  private String _objName = "ServiceMasterGroupObjectFilter";
  /** default constructor */
  public ServiceMasterGroupObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ServiceMasterGroupObjectFilter (ServiceMasterGroupObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ServiceMasterGroupObjectKeyFilter (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.Comments = other.Comments;
    this.CommentsFetch = other.CommentsFetch;
    this.CommentsSort = other.CommentsSort;
    this.CommentsCaseInsensitive = other.CommentsCaseInsensitive;
    this.CommentsSortAscending = other.CommentsSortAscending;
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;  }
  /** get the filter for this object's key
   * @return ServiceMasterGroupObjectKeyFilter
   */
  public ServiceMasterGroupObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ServiceMasterGroupObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @param fetch whether to fetch this field or not
   */
  public void setSubscrMasterGroupNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServiceMasterGroupObjectKeyFilter ();
    this.Key.SubscrMasterGroupNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubscrMasterGroupNoFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SubscrMasterGroupNoFetch;
  }
  /** Set the SortOrder for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubscrMasterGroupNoSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServiceMasterGroupObjectKeyFilter ();
    this.Key.SubscrMasterGroupNoSort = value;
  }
  /** Retrieve SortOrder for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubscrMasterGroupNoSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SubscrMasterGroupNoSort;
  }
  /** Set the sort direction for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubscrMasterGroupNoSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServiceMasterGroupObjectKeyFilter ();
    this.Key.SubscrMasterGroupNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubscrMasterGroupNoSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SubscrMasterGroupNoSortAscending;
  }
  /** Set the field level filters for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubscrMasterGroupNoFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServiceMasterGroupObjectKeyFilter ();
    this.Key.SubscrMasterGroupNo = value;
  }
  /** Retrieve filter for field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSubscrMasterGroupNoFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.SubscrMasterGroupNo;
  }
  /** Set the field level Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch) {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch () {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value) {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder () {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending) {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection () {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending) {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountExternalIdCaseInsensitive () {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter () {
    return this.AccountExternalId;
  }

  /**
   * Retrieves the AccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdFilter field
   */
  public String[] getAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdFilter filter field
   */
  public void setAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
    try {
      this.setAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch) {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch () {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value) {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder () {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending) {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection () {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter () {
    return this.AccountExternalIdType;
  }

  /**
   * Retrieves the AccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdTypeFilter field
   */
  public String[] getAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdTypeFilter filter field
   */
  public String[] getAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (EMF_MASTER_GROUPS.account_no)
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

  /** Set the field level Fetch value for field: Comments (EMF_MASTER_GROUPS.comments)
   * @param fetch whether to fetch this field or not
   */
  public void setCommentsFetch (boolean fetch) {
    this.CommentsFetch = fetch;
  }
  /** Retrieve Fetch value for field: Comments (EMF_MASTER_GROUPS.comments)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommentsFetch () {
    return this.CommentsFetch;
  }
  /** Set the SortOrder for field: Comments (EMF_MASTER_GROUPS.comments)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommentsSortOrder (Integer value) {
    this.CommentsSort = value;
  }
  /** Retrieve SortOrder for field: Comments (EMF_MASTER_GROUPS.comments)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommentsSortOrder () {
    return this.CommentsSort;
  }
  /** Set the sort direction for field: Comments (EMF_MASTER_GROUPS.comments)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommentsSortDirection (boolean ascending) {
    this.CommentsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Comments (EMF_MASTER_GROUPS.comments)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommentsSortDirection () {
    return this.CommentsSortAscending;
  }
  /** Set the case insensitive for field: Comments (EMF_MASTER_GROUPS.comments)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCommentsCaseInsensitive (boolean ascending) {
    this.CommentsCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Comments (EMF_MASTER_GROUPS.comments)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCommentsCaseInsensitive () {
    return this.CommentsCaseInsensitive;
  }
  /** Set the field level filters for field: Comments (EMF_MASTER_GROUPS.comments)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommentsFilter (StringFilter[] value) throws ServiceException {
    this.Comments = value;
  }
  /** Retrieve filter for field: Comments (EMF_MASTER_GROUPS.comments)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCommentsFilter () {
    return this.Comments;
  }

  /**
   * Retrieves the CommentsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommentsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommentsFilter field
   */
  public String[] getCommentsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommentsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommentsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommentsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommentsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommentsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommentsFilter filter value from a formatted string
   *
   * @param _value the CommentsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommentsFilter filter field
   */
  public void setCommentsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommentsFilterFromFormattedString");
    try {
      this.setCommentsFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommentsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommentsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommentsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (EMF_MASTER_GROUPS.create_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCreateDtFilter () {
    return this.CreateDt;
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedString");
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return ServiceMasterGroupObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServiceMasterGroupObjectHelper.toMap(this, null);
  }
}
