/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeGroupObjectFilter.java
 * Definition File: Customer/AccountCodeGroup.xml
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
public class AccountCodeGroupObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AccountCodeGroupObjectKeyFilter Key = null;
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
  /** raw field for: CMF_ACCOUNT_CODE_GROUPS.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  /** raw field for: CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id) */
  public    IntegerFilter[] AcgTrackingId  = null;
  protected boolean AcgTrackingIdFetch = false;
  protected boolean AcgTrackingIdSortAscending = true;
  protected Integer AcgTrackingIdSort = null;
  /** raw field for: CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv) */
  public    IntegerFilter[] AcgTrackingIdServ  = null;
  protected boolean AcgTrackingIdServFetch = false;
  protected boolean AcgTrackingIdServSortAscending = true;
  protected Integer AcgTrackingIdServSort = null;
  /** raw field for: CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id) */
  public    IntegerFilter[] ParentAcgTrackingId  = null;
  protected boolean ParentAcgTrackingIdFetch = false;
  protected boolean ParentAcgTrackingIdSortAscending = true;
  protected Integer ParentAcgTrackingIdSort = null;
  /** raw field for: CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv) */
  public    IntegerFilter[] ParentAcgTrackingIdServ  = null;
  protected boolean ParentAcgTrackingIdServFetch = false;
  protected boolean ParentAcgTrackingIdServSortAscending = true;
  protected Integer ParentAcgTrackingIdServSort = null;
  /** raw field for: CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id) */
  public    IntegerFilter[] HierarchyAcgTrackingId  = null;
  protected boolean HierarchyAcgTrackingIdFetch = false;
  protected boolean HierarchyAcgTrackingIdSortAscending = true;
  protected Integer HierarchyAcgTrackingIdSort = null;
  /** raw field for: CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv) */
  public    IntegerFilter[] HierarchyAcgTrackingIdServ  = null;
  protected boolean HierarchyAcgTrackingIdServFetch = false;
  protected boolean HierarchyAcgTrackingIdServSortAscending = true;
  protected Integer HierarchyAcgTrackingIdServSort = null;
  private String _objName = "AccountCodeGroupObjectFilter";
  /** default constructor */
  public AccountCodeGroupObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AccountCodeGroupObjectFilter (AccountCodeGroupObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AccountCodeGroupObjectKeyFilter (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;
    this.AcgTrackingId = other.AcgTrackingId;
    this.AcgTrackingIdFetch = other.AcgTrackingIdFetch;
    this.AcgTrackingIdSort = other.AcgTrackingIdSort;
    this.AcgTrackingIdSortAscending = other.AcgTrackingIdSortAscending;
    this.AcgTrackingIdServ = other.AcgTrackingIdServ;
    this.AcgTrackingIdServFetch = other.AcgTrackingIdServFetch;
    this.AcgTrackingIdServSort = other.AcgTrackingIdServSort;
    this.AcgTrackingIdServSortAscending = other.AcgTrackingIdServSortAscending;
    this.ParentAcgTrackingId = other.ParentAcgTrackingId;
    this.ParentAcgTrackingIdFetch = other.ParentAcgTrackingIdFetch;
    this.ParentAcgTrackingIdSort = other.ParentAcgTrackingIdSort;
    this.ParentAcgTrackingIdSortAscending = other.ParentAcgTrackingIdSortAscending;
    this.ParentAcgTrackingIdServ = other.ParentAcgTrackingIdServ;
    this.ParentAcgTrackingIdServFetch = other.ParentAcgTrackingIdServFetch;
    this.ParentAcgTrackingIdServSort = other.ParentAcgTrackingIdServSort;
    this.ParentAcgTrackingIdServSortAscending = other.ParentAcgTrackingIdServSortAscending;
    this.HierarchyAcgTrackingId = other.HierarchyAcgTrackingId;
    this.HierarchyAcgTrackingIdFetch = other.HierarchyAcgTrackingIdFetch;
    this.HierarchyAcgTrackingIdSort = other.HierarchyAcgTrackingIdSort;
    this.HierarchyAcgTrackingIdSortAscending = other.HierarchyAcgTrackingIdSortAscending;
    this.HierarchyAcgTrackingIdServ = other.HierarchyAcgTrackingIdServ;
    this.HierarchyAcgTrackingIdServFetch = other.HierarchyAcgTrackingIdServFetch;
    this.HierarchyAcgTrackingIdServSort = other.HierarchyAcgTrackingIdServSort;
    this.HierarchyAcgTrackingIdServSortAscending = other.HierarchyAcgTrackingIdServSortAscending;  }
  /** get the filter for this object's key
   * @return AccountCodeGroupObjectKeyFilter
   */
  public AccountCodeGroupObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AccountCodeGroupObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountCodeGroupFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountCodeGroupFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountCodeGroupFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountCodeGroupFetch;
  }
  /** Set the SortOrder for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountCodeGroupSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountCodeGroupSort = value;
  }
  /** Retrieve SortOrder for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountCodeGroupSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountCodeGroupSort;
  }
  /** Set the sort direction for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountCodeGroupSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountCodeGroupSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountCodeGroupSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountCodeGroupSortAscending;
  }
  /** Set the case insensitive for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountCodeGroupCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountCodeGroupCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return boolean whether the field is case insensitive
   */
  public boolean getAccountCodeGroupCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.AccountCodeGroupCaseInsensitive;
  }
  /** Set the field level filters for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountCodeGroupFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountCodeGroup = value;
  }
  /** Retrieve filter for field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountCodeGroupFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountCodeGroup;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
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


  /** Set the field level Fetch value for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayValueFilter () {
    return this.DisplayValue;
  }

  /**
   * Retrieves the DisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValueFilter field
   */
  public String[] getDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayValueFilter filter value from a formatted string
   *
   * @param _value the DisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayValueFilter filter field
   */
  public void setDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayValueFilterFromFormattedString");
    try {
      this.setDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcgTrackingIdFetch (boolean fetch) {
    this.AcgTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcgTrackingIdFetch () {
    return this.AcgTrackingIdFetch;
  }
  /** Set the SortOrder for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcgTrackingIdSortOrder (Integer value) {
    this.AcgTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcgTrackingIdSortOrder () {
    return this.AcgTrackingIdSort;
  }
  /** Set the sort direction for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcgTrackingIdSortDirection (boolean ascending) {
    this.AcgTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcgTrackingIdSortDirection () {
    return this.AcgTrackingIdSortAscending;
  }
  /** Set the field level filters for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcgTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AcgTrackingId = value;
  }
  /** Retrieve filter for field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcgTrackingIdFilter () {
    return this.AcgTrackingId;
  }

  /**
   * Retrieves the AcgTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AcgTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingIdFilter field
   */
  public String[] getAcgTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAcgTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AcgTrackingIdFilter filter value from a formatted string
   *
   * @param _value the AcgTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AcgTrackingIdFilter filter field
   */
  public void setAcgTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcgTrackingIdFilterFromFormattedString");
    try {
      this.setAcgTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setAcgTrackingIdServFetch (boolean fetch) {
    this.AcgTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcgTrackingIdServFetch () {
    return this.AcgTrackingIdServFetch;
  }
  /** Set the SortOrder for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcgTrackingIdServSortOrder (Integer value) {
    this.AcgTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcgTrackingIdServSortOrder () {
    return this.AcgTrackingIdServSort;
  }
  /** Set the sort direction for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcgTrackingIdServSortDirection (boolean ascending) {
    this.AcgTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcgTrackingIdServSortDirection () {
    return this.AcgTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcgTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.AcgTrackingIdServ = value;
  }
  /** Retrieve filter for field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcgTrackingIdServFilter () {
    return this.AcgTrackingIdServ;
  }

  /**
   * Retrieves the AcgTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AcgTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingIdServFilter field
   */
  public String[] getAcgTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAcgTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AcgTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the AcgTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AcgTrackingIdServFilter filter field
   */
  public void setAcgTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcgTrackingIdServFilterFromFormattedString");
    try {
      this.setAcgTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAcgTrackingIdFetch (boolean fetch) {
    this.ParentAcgTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAcgTrackingIdFetch () {
    return this.ParentAcgTrackingIdFetch;
  }
  /** Set the SortOrder for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAcgTrackingIdSortOrder (Integer value) {
    this.ParentAcgTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAcgTrackingIdSortOrder () {
    return this.ParentAcgTrackingIdSort;
  }
  /** Set the sort direction for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAcgTrackingIdSortDirection (boolean ascending) {
    this.ParentAcgTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAcgTrackingIdSortDirection () {
    return this.ParentAcgTrackingIdSortAscending;
  }
  /** Set the field level filters for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAcgTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentAcgTrackingId = value;
  }
  /** Retrieve filter for field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentAcgTrackingIdFilter () {
    return this.ParentAcgTrackingId;
  }

  /**
   * Retrieves the ParentAcgTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentAcgTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAcgTrackingIdFilter field
   */
  public String[] getParentAcgTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAcgTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentAcgTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAcgTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAcgTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentAcgTrackingIdFilter filter value from a formatted string
   *
   * @param _value the ParentAcgTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentAcgTrackingIdFilter filter field
   */
  public void setParentAcgTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAcgTrackingIdFilterFromFormattedString");
    try {
      this.setParentAcgTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAcgTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAcgTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAcgTrackingIdServFetch (boolean fetch) {
    this.ParentAcgTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAcgTrackingIdServFetch () {
    return this.ParentAcgTrackingIdServFetch;
  }
  /** Set the SortOrder for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAcgTrackingIdServSortOrder (Integer value) {
    this.ParentAcgTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAcgTrackingIdServSortOrder () {
    return this.ParentAcgTrackingIdServSort;
  }
  /** Set the sort direction for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAcgTrackingIdServSortDirection (boolean ascending) {
    this.ParentAcgTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAcgTrackingIdServSortDirection () {
    return this.ParentAcgTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAcgTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentAcgTrackingIdServ = value;
  }
  /** Retrieve filter for field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentAcgTrackingIdServFilter () {
    return this.ParentAcgTrackingIdServ;
  }

  /**
   * Retrieves the ParentAcgTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentAcgTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAcgTrackingIdServFilter field
   */
  public String[] getParentAcgTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAcgTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentAcgTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAcgTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAcgTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentAcgTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the ParentAcgTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentAcgTrackingIdServFilter filter field
   */
  public void setParentAcgTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAcgTrackingIdServFilterFromFormattedString");
    try {
      this.setParentAcgTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAcgTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAcgTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setHierarchyAcgTrackingIdFetch (boolean fetch) {
    this.HierarchyAcgTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getHierarchyAcgTrackingIdFetch () {
    return this.HierarchyAcgTrackingIdFetch;
  }
  /** Set the SortOrder for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHierarchyAcgTrackingIdSortOrder (Integer value) {
    this.HierarchyAcgTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHierarchyAcgTrackingIdSortOrder () {
    return this.HierarchyAcgTrackingIdSort;
  }
  /** Set the sort direction for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHierarchyAcgTrackingIdSortDirection (boolean ascending) {
    this.HierarchyAcgTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHierarchyAcgTrackingIdSortDirection () {
    return this.HierarchyAcgTrackingIdSortAscending;
  }
  /** Set the field level filters for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHierarchyAcgTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.HierarchyAcgTrackingId = value;
  }
  /** Retrieve filter for field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHierarchyAcgTrackingIdFilter () {
    return this.HierarchyAcgTrackingId;
  }

  /**
   * Retrieves the HierarchyAcgTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The HierarchyAcgTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAcgTrackingIdFilter field
   */
  public String[] getHierarchyAcgTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAcgTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getHierarchyAcgTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAcgTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAcgTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the HierarchyAcgTrackingIdFilter filter value from a formatted string
   *
   * @param _value the HierarchyAcgTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the HierarchyAcgTrackingIdFilter filter field
   */
  public void setHierarchyAcgTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAcgTrackingIdFilterFromFormattedString");
    try {
      this.setHierarchyAcgTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAcgTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAcgTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAcgTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setHierarchyAcgTrackingIdServFetch (boolean fetch) {
    this.HierarchyAcgTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getHierarchyAcgTrackingIdServFetch () {
    return this.HierarchyAcgTrackingIdServFetch;
  }
  /** Set the SortOrder for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHierarchyAcgTrackingIdServSortOrder (Integer value) {
    this.HierarchyAcgTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHierarchyAcgTrackingIdServSortOrder () {
    return this.HierarchyAcgTrackingIdServSort;
  }
  /** Set the sort direction for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHierarchyAcgTrackingIdServSortDirection (boolean ascending) {
    this.HierarchyAcgTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHierarchyAcgTrackingIdServSortDirection () {
    return this.HierarchyAcgTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHierarchyAcgTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.HierarchyAcgTrackingIdServ = value;
  }
  /** Retrieve filter for field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHierarchyAcgTrackingIdServFilter () {
    return this.HierarchyAcgTrackingIdServ;
  }

  /**
   * Retrieves the HierarchyAcgTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The HierarchyAcgTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAcgTrackingIdServFilter field
   */
  public String[] getHierarchyAcgTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAcgTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getHierarchyAcgTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAcgTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAcgTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the HierarchyAcgTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the HierarchyAcgTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the HierarchyAcgTrackingIdServFilter filter field
   */
  public void setHierarchyAcgTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAcgTrackingIdServFilterFromFormattedString");
    try {
      this.setHierarchyAcgTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAcgTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAcgTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAcgTrackingIdServFilterFromFormattedString");
  }

  public String toString() {
    return AccountCodeGroupObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountCodeGroupObjectHelper.toMap(this, null);
  }
}
