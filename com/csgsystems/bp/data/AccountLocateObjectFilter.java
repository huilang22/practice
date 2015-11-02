/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountLocateObjectFilter.java
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
public class AccountLocateObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AccountLocateObjectKeyFilter Key = null;
  /** raw field */
  public    IntegerFilter[] HierarchyId  = null;
  protected boolean HierarchyIdFetch = false;
  protected boolean HierarchyIdSortAscending = true;
  protected Integer HierarchyIdSort = null;
  /** raw field */
  public    IntegerFilter[] ParentId  = null;
  protected boolean ParentIdFetch = false;
  protected boolean ParentIdSortAscending = true;
  protected Integer ParentIdSort = null;
  /** raw field for: SERVER_LOOKUP.account_category) */
  public    IntegerFilter[] AccountCategory  = null;
  protected boolean AccountCategoryFetch = false;
  protected boolean AccountCategorySortAscending = true;
  protected Integer AccountCategorySort = null;
  /** raw field for: SERVER_LOOKUP.bill_fname) */
  public    StringFilter[] BillFname  = null;
  protected boolean BillFnameFetch = false;
  protected boolean BillFnameSortAscending = true;
  protected boolean BillFnameCaseInsensitive = false;
  protected Integer BillFnameSort = null;
  /** raw field for: SERVER_LOOKUP.bill_fname_find) */
  public    StringFilter[] BillFnameFind  = null;
  protected boolean BillFnameFindFetch = false;
  protected boolean BillFnameFindSortAscending = true;
  protected boolean BillFnameFindCaseInsensitive = false;
  protected Integer BillFnameFindSort = null;
  /** raw field for: SERVER_LOOKUP.bill_lname) */
  public    StringFilter[] BillLname  = null;
  protected boolean BillLnameFetch = false;
  protected boolean BillLnameSortAscending = true;
  protected boolean BillLnameCaseInsensitive = false;
  protected Integer BillLnameSort = null;
  /** raw field for: SERVER_LOOKUP.bill_lname_find) */
  public    StringFilter[] BillLnameFind  = null;
  protected boolean BillLnameFindFetch = false;
  protected boolean BillLnameFindSortAscending = true;
  protected boolean BillLnameFindCaseInsensitive = false;
  protected Integer BillLnameFindSort = null;
  /** raw field for: SERVER_LOOKUP.bill_company) */
  public    StringFilter[] BillCompany  = null;
  protected boolean BillCompanyFetch = false;
  protected boolean BillCompanySortAscending = true;
  protected boolean BillCompanyCaseInsensitive = false;
  protected Integer BillCompanySort = null;
  /** raw field for: SERVER_LOOKUP.bill_company_find) */
  public    StringFilter[] BillCompanyFind  = null;
  protected boolean BillCompanyFindFetch = false;
  protected boolean BillCompanyFindSortAscending = true;
  protected boolean BillCompanyFindCaseInsensitive = false;
  protected Integer BillCompanyFindSort = null;
  /** raw field for: SERVER_LOOKUP.bill_address1) */
  public    StringFilter[] BillAddress1  = null;
  protected boolean BillAddress1Fetch = false;
  protected boolean BillAddress1SortAscending = true;
  protected boolean BillAddress1CaseInsensitive = false;
  protected Integer BillAddress1Sort = null;
  /** raw field for: SERVER_LOOKUP.bill_city) */
  public    StringFilter[] BillCity  = null;
  protected boolean BillCityFetch = false;
  protected boolean BillCitySortAscending = true;
  protected boolean BillCityCaseInsensitive = false;
  protected Integer BillCitySort = null;
  /** raw field for: SERVER_LOOKUP.bill_state) */
  public    StringFilter[] BillState  = null;
  protected boolean BillStateFetch = false;
  protected boolean BillStateSortAscending = true;
  protected boolean BillStateCaseInsensitive = false;
  protected Integer BillStateSort = null;
  /** raw field for: SERVER_LOOKUP.bill_zip) */
  public    StringFilter[] BillZip  = null;
  protected boolean BillZipFetch = false;
  protected boolean BillZipSortAscending = true;
  protected boolean BillZipCaseInsensitive = false;
  protected Integer BillZipSort = null;
  /** raw field for: SERVER_LOOKUP.cust_phone1) */
  public    StringFilter[] CustPhone1  = null;
  protected boolean CustPhone1Fetch = false;
  protected boolean CustPhone1SortAscending = true;
  protected boolean CustPhone1CaseInsensitive = false;
  protected Integer CustPhone1Sort = null;
  /** raw field for: SERVER_LOOKUP.cust_phone2) */
  public    StringFilter[] CustPhone2  = null;
  protected boolean CustPhone2Fetch = false;
  protected boolean CustPhone2SortAscending = true;
  protected boolean CustPhone2CaseInsensitive = false;
  protected Integer CustPhone2Sort = null;
  /** raw field for: SERVER_LOOKUP.codeword) */
  public    StringFilter[] Codeword  = null;
  protected boolean CodewordFetch = false;
  protected boolean CodewordSortAscending = true;
  protected boolean CodewordCaseInsensitive = false;
  protected Integer CodewordSort = null;
  /** raw field for: SERVER_LOOKUP.server_id) */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: SERVER_LOOKUP.acct_seg_id) */
  public    IntegerFilter[] AcctSegId  = null;
  protected boolean AcctSegIdFetch = false;
  protected boolean AcctSegIdSortAscending = true;
  protected Integer AcctSegIdSort = null;
  /** raw field for: SERVER_LOOKUP.alt_lname) */
  public    StringFilter[] AltLname  = null;
  protected boolean AltLnameFetch = false;
  protected boolean AltLnameSortAscending = true;
  protected boolean AltLnameCaseInsensitive = false;
  protected Integer AltLnameSort = null;
  /** raw field for: SERVER_LOOKUP.alt_fname) */
  public    StringFilter[] AltFname  = null;
  protected boolean AltFnameFetch = false;
  protected boolean AltFnameSortAscending = true;
  protected boolean AltFnameCaseInsensitive = false;
  protected Integer AltFnameSort = null;
  /** raw field for: SERVER_LOOKUP.alt_company_name) */
  public    StringFilter[] AltCompanyName  = null;
  protected boolean AltCompanyNameFetch = false;
  protected boolean AltCompanyNameSortAscending = true;
  protected boolean AltCompanyNameCaseInsensitive = false;
  protected Integer AltCompanyNameSort = null;
  /** raw field for: SERVER_LOOKUP.date_active) */
  public    DateFilter[] DateActive  = null;
  protected boolean DateActiveFetch = false;
  protected boolean DateActiveSortAscending = true;
  protected Integer DateActiveSort = null;
  /** raw field for: SERVER_LOOKUP.date_inactive) */
  public    DateFilter[] DateInactive  = null;
  protected boolean DateInactiveFetch = false;
  protected boolean DateInactiveSortAscending = true;
  protected Integer DateInactiveSort = null;
  /** raw field for: SERVER_LOOKUP.customer_lifetime_id) */
  public    IntegerFilter[] CustomerLifetimeId  = null;
  protected boolean CustomerLifetimeIdFetch = false;
  protected boolean CustomerLifetimeIdSortAscending = true;
  protected Integer CustomerLifetimeIdSort = null;
  /** raw field for: SERVER_LOOKUP.customer_lifetime_id2) */
  public    IntegerFilter[] CustomerLifetimeId2  = null;
  protected boolean CustomerLifetimeId2Fetch = false;
  protected boolean CustomerLifetimeId2SortAscending = true;
  protected Integer CustomerLifetimeId2Sort = null;
  private String _objName = "AccountLocateObjectFilter";
  /** default constructor */
  public AccountLocateObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AccountLocateObjectFilter (AccountLocateObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AccountLocateObjectKeyFilter (other.Key);
    this.HierarchyId = other.HierarchyId;
    this.HierarchyIdFetch = other.HierarchyIdFetch;
    this.HierarchyIdSort = other.HierarchyIdSort;
    this.HierarchyIdSortAscending = other.HierarchyIdSortAscending;
    this.ParentId = other.ParentId;
    this.ParentIdFetch = other.ParentIdFetch;
    this.ParentIdSort = other.ParentIdSort;
    this.ParentIdSortAscending = other.ParentIdSortAscending;
    this.AccountCategory = other.AccountCategory;
    this.AccountCategoryFetch = other.AccountCategoryFetch;
    this.AccountCategorySort = other.AccountCategorySort;
    this.AccountCategorySortAscending = other.AccountCategorySortAscending;
    this.BillFname = other.BillFname;
    this.BillFnameFetch = other.BillFnameFetch;
    this.BillFnameSort = other.BillFnameSort;
    this.BillFnameCaseInsensitive = other.BillFnameCaseInsensitive;
    this.BillFnameSortAscending = other.BillFnameSortAscending;
    this.BillFnameFind = other.BillFnameFind;
    this.BillFnameFindFetch = other.BillFnameFindFetch;
    this.BillFnameFindSort = other.BillFnameFindSort;
    this.BillFnameFindCaseInsensitive = other.BillFnameFindCaseInsensitive;
    this.BillFnameFindSortAscending = other.BillFnameFindSortAscending;
    this.BillLname = other.BillLname;
    this.BillLnameFetch = other.BillLnameFetch;
    this.BillLnameSort = other.BillLnameSort;
    this.BillLnameCaseInsensitive = other.BillLnameCaseInsensitive;
    this.BillLnameSortAscending = other.BillLnameSortAscending;
    this.BillLnameFind = other.BillLnameFind;
    this.BillLnameFindFetch = other.BillLnameFindFetch;
    this.BillLnameFindSort = other.BillLnameFindSort;
    this.BillLnameFindCaseInsensitive = other.BillLnameFindCaseInsensitive;
    this.BillLnameFindSortAscending = other.BillLnameFindSortAscending;
    this.BillCompany = other.BillCompany;
    this.BillCompanyFetch = other.BillCompanyFetch;
    this.BillCompanySort = other.BillCompanySort;
    this.BillCompanyCaseInsensitive = other.BillCompanyCaseInsensitive;
    this.BillCompanySortAscending = other.BillCompanySortAscending;
    this.BillCompanyFind = other.BillCompanyFind;
    this.BillCompanyFindFetch = other.BillCompanyFindFetch;
    this.BillCompanyFindSort = other.BillCompanyFindSort;
    this.BillCompanyFindCaseInsensitive = other.BillCompanyFindCaseInsensitive;
    this.BillCompanyFindSortAscending = other.BillCompanyFindSortAscending;
    this.BillAddress1 = other.BillAddress1;
    this.BillAddress1Fetch = other.BillAddress1Fetch;
    this.BillAddress1Sort = other.BillAddress1Sort;
    this.BillAddress1CaseInsensitive = other.BillAddress1CaseInsensitive;
    this.BillAddress1SortAscending = other.BillAddress1SortAscending;
    this.BillCity = other.BillCity;
    this.BillCityFetch = other.BillCityFetch;
    this.BillCitySort = other.BillCitySort;
    this.BillCityCaseInsensitive = other.BillCityCaseInsensitive;
    this.BillCitySortAscending = other.BillCitySortAscending;
    this.BillState = other.BillState;
    this.BillStateFetch = other.BillStateFetch;
    this.BillStateSort = other.BillStateSort;
    this.BillStateCaseInsensitive = other.BillStateCaseInsensitive;
    this.BillStateSortAscending = other.BillStateSortAscending;
    this.BillZip = other.BillZip;
    this.BillZipFetch = other.BillZipFetch;
    this.BillZipSort = other.BillZipSort;
    this.BillZipCaseInsensitive = other.BillZipCaseInsensitive;
    this.BillZipSortAscending = other.BillZipSortAscending;
    this.CustPhone1 = other.CustPhone1;
    this.CustPhone1Fetch = other.CustPhone1Fetch;
    this.CustPhone1Sort = other.CustPhone1Sort;
    this.CustPhone1CaseInsensitive = other.CustPhone1CaseInsensitive;
    this.CustPhone1SortAscending = other.CustPhone1SortAscending;
    this.CustPhone2 = other.CustPhone2;
    this.CustPhone2Fetch = other.CustPhone2Fetch;
    this.CustPhone2Sort = other.CustPhone2Sort;
    this.CustPhone2CaseInsensitive = other.CustPhone2CaseInsensitive;
    this.CustPhone2SortAscending = other.CustPhone2SortAscending;
    this.Codeword = other.Codeword;
    this.CodewordFetch = other.CodewordFetch;
    this.CodewordSort = other.CodewordSort;
    this.CodewordCaseInsensitive = other.CodewordCaseInsensitive;
    this.CodewordSortAscending = other.CodewordSortAscending;
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;
    this.AcctSegId = other.AcctSegId;
    this.AcctSegIdFetch = other.AcctSegIdFetch;
    this.AcctSegIdSort = other.AcctSegIdSort;
    this.AcctSegIdSortAscending = other.AcctSegIdSortAscending;
    this.AltLname = other.AltLname;
    this.AltLnameFetch = other.AltLnameFetch;
    this.AltLnameSort = other.AltLnameSort;
    this.AltLnameCaseInsensitive = other.AltLnameCaseInsensitive;
    this.AltLnameSortAscending = other.AltLnameSortAscending;
    this.AltFname = other.AltFname;
    this.AltFnameFetch = other.AltFnameFetch;
    this.AltFnameSort = other.AltFnameSort;
    this.AltFnameCaseInsensitive = other.AltFnameCaseInsensitive;
    this.AltFnameSortAscending = other.AltFnameSortAscending;
    this.AltCompanyName = other.AltCompanyName;
    this.AltCompanyNameFetch = other.AltCompanyNameFetch;
    this.AltCompanyNameSort = other.AltCompanyNameSort;
    this.AltCompanyNameCaseInsensitive = other.AltCompanyNameCaseInsensitive;
    this.AltCompanyNameSortAscending = other.AltCompanyNameSortAscending;
    this.DateActive = other.DateActive;
    this.DateActiveFetch = other.DateActiveFetch;
    this.DateActiveSort = other.DateActiveSort;
    this.DateActiveSortAscending = other.DateActiveSortAscending;
    this.DateInactive = other.DateInactive;
    this.DateInactiveFetch = other.DateInactiveFetch;
    this.DateInactiveSort = other.DateInactiveSort;
    this.DateInactiveSortAscending = other.DateInactiveSortAscending;
    this.CustomerLifetimeId = other.CustomerLifetimeId;
    this.CustomerLifetimeIdFetch = other.CustomerLifetimeIdFetch;
    this.CustomerLifetimeIdSort = other.CustomerLifetimeIdSort;
    this.CustomerLifetimeIdSortAscending = other.CustomerLifetimeIdSortAscending;
    this.CustomerLifetimeId2 = other.CustomerLifetimeId2;
    this.CustomerLifetimeId2Fetch = other.CustomerLifetimeId2Fetch;
    this.CustomerLifetimeId2Sort = other.CustomerLifetimeId2Sort;
    this.CustomerLifetimeId2SortAscending = other.CustomerLifetimeId2SortAscending;  }
  /** get the filter for this object's key
   * @return AccountLocateObjectKeyFilter
   */
  public AccountLocateObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AccountLocateObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountLocateObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountLocateObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountLocateObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountLocateObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (SERVER_LOOKUP.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: HierarchyId
   * @param fetch whether to fetch this field or not
   */
  public void setHierarchyIdFetch (boolean fetch)
  {
    this.HierarchyIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: HierarchyId
   * @return boolean the Fetch value for this field
   */
  public boolean getHierarchyIdFetch ()
  {
    return this.HierarchyIdFetch;
  }
  /** Set the SortOrder for field: HierarchyId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHierarchyIdSortOrder (Integer value)
  {
    this.HierarchyIdSort = value;
  }
  /** Retrieve SortOrder for field: HierarchyId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHierarchyIdSortOrder ()
  {
    return this.HierarchyIdSort;
  }
  /** Set the sort direction for field: HierarchyId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHierarchyIdSortDirection (boolean ascending)
  {
    this.HierarchyIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HierarchyId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHierarchyIdSortDirection ()
  {
    return this.HierarchyIdSortAscending;
  }
  /** Set the field level filters for field: HierarchyId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHierarchyIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.HierarchyId = value;
  }
  /** Retrieve filter for field: HierarchyId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHierarchyIdFilter ()
  {
    return this.HierarchyId;
  }
  /** Set the field level Fetch value for field: ParentId
   * @param fetch whether to fetch this field or not
   */
  public void setParentIdFetch (boolean fetch)
  {
    this.ParentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentId
   * @return boolean the Fetch value for this field
   */
  public boolean getParentIdFetch ()
  {
    return this.ParentIdFetch;
  }
  /** Set the SortOrder for field: ParentId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentIdSortOrder (Integer value)
  {
    this.ParentIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentIdSortOrder ()
  {
    return this.ParentIdSort;
  }
  /** Set the sort direction for field: ParentId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentIdSortDirection (boolean ascending)
  {
    this.ParentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentIdSortDirection ()
  {
    return this.ParentIdSortAscending;
  }
  /** Set the field level filters for field: ParentId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.ParentId = value;
  }
  /** Retrieve filter for field: ParentId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentIdFilter ()
  {
    return this.ParentId;
  }
  /** Set the field level Fetch value for field: AccountCategory (SERVER_LOOKUP.account_category)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountCategoryFetch (boolean fetch) {
    this.AccountCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountCategory (SERVER_LOOKUP.account_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountCategoryFetch () {
    return this.AccountCategoryFetch;
  }
  /** Set the SortOrder for field: AccountCategory (SERVER_LOOKUP.account_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountCategorySortOrder (Integer value) {
    this.AccountCategorySort = value;
  }
  /** Retrieve SortOrder for field: AccountCategory (SERVER_LOOKUP.account_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountCategorySortOrder () {
    return this.AccountCategorySort;
  }
  /** Set the sort direction for field: AccountCategory (SERVER_LOOKUP.account_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountCategorySortDirection (boolean ascending) {
    this.AccountCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountCategory (SERVER_LOOKUP.account_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountCategorySortDirection () {
    return this.AccountCategorySortAscending;
  }
  /** Set the field level filters for field: AccountCategory (SERVER_LOOKUP.account_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountCategory = value;
  }
  /** Retrieve filter for field: AccountCategory (SERVER_LOOKUP.account_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountCategoryFilter () {
    return this.AccountCategory;
  }

  /**
   * Retrieves the AccountCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCategoryFilter field
   */
  public String[] getAccountCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountCategoryFilter filter value from a formatted string
   *
   * @param _value the AccountCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountCategoryFilter filter field
   */
  public void setAccountCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCategoryFilterFromFormattedString");
    try {
      this.setAccountCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCategoryFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountCategoryFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountCategoryFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountCategoryFilter filter field
   */
  public String[] getAccountCategoryFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountCategoryFilter(), "AccountCategory", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountCategoryFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountCategoryFilter filter field
   */
  public void setAccountCategoryFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCategoryFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountCategoryFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountCategory", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCategoryFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCategoryFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFnameFetch (boolean fetch) {
    this.BillFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFnameFetch () {
    return this.BillFnameFetch;
  }
  /** Set the SortOrder for field: BillFname (SERVER_LOOKUP.bill_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFnameSortOrder (Integer value) {
    this.BillFnameSort = value;
  }
  /** Retrieve SortOrder for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFnameSortOrder () {
    return this.BillFnameSort;
  }
  /** Set the sort direction for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFnameSortDirection (boolean ascending) {
    this.BillFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFnameSortDirection () {
    return this.BillFnameSortAscending;
  }
  /** Set the case insensitive for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillFnameCaseInsensitive (boolean ascending) {
    this.BillFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillFnameCaseInsensitive () {
    return this.BillFnameCaseInsensitive;
  }
  /** Set the field level filters for field: BillFname (SERVER_LOOKUP.bill_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFnameFilter (StringFilter[] value) throws ServiceException {
    this.BillFname = value;
  }
  /** Retrieve filter for field: BillFname (SERVER_LOOKUP.bill_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillFnameFilter () {
    return this.BillFname;
  }

  /**
   * Retrieves the BillFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFnameFilter field
   */
  public String[] getBillFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFnameFilter filter value from a formatted string
   *
   * @param _value the BillFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFnameFilter filter field
   */
  public void setBillFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFnameFilterFromFormattedString");
    try {
      this.setBillFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFnameFindFetch (boolean fetch) {
    this.BillFnameFindFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFnameFindFetch () {
    return this.BillFnameFindFetch;
  }
  /** Set the SortOrder for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFnameFindSortOrder (Integer value) {
    this.BillFnameFindSort = value;
  }
  /** Retrieve SortOrder for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFnameFindSortOrder () {
    return this.BillFnameFindSort;
  }
  /** Set the sort direction for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFnameFindSortDirection (boolean ascending) {
    this.BillFnameFindSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFnameFindSortDirection () {
    return this.BillFnameFindSortAscending;
  }
  /** Set the case insensitive for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillFnameFindCaseInsensitive (boolean ascending) {
    this.BillFnameFindCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillFnameFindCaseInsensitive () {
    return this.BillFnameFindCaseInsensitive;
  }
  /** Set the field level filters for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFnameFindFilter (StringFilter[] value) throws ServiceException {
    this.BillFnameFind = value;
  }
  /** Retrieve filter for field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillFnameFindFilter () {
    return this.BillFnameFind;
  }

  /**
   * Retrieves the BillFnameFindFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFnameFindFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFnameFindFilter field
   */
  public String[] getBillFnameFindFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFindFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFnameFindFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameFindFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameFindFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFnameFindFilter filter value from a formatted string
   *
   * @param _value the BillFnameFindFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFnameFindFilter filter field
   */
  public void setBillFnameFindFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFnameFindFilterFromFormattedString");
    try {
      this.setBillFnameFindFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFindFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFindFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setBillLnameFetch (boolean fetch) {
    this.BillLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillLnameFetch () {
    return this.BillLnameFetch;
  }
  /** Set the SortOrder for field: BillLname (SERVER_LOOKUP.bill_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillLnameSortOrder (Integer value) {
    this.BillLnameSort = value;
  }
  /** Retrieve SortOrder for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillLnameSortOrder () {
    return this.BillLnameSort;
  }
  /** Set the sort direction for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillLnameSortDirection (boolean ascending) {
    this.BillLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillLnameSortDirection () {
    return this.BillLnameSortAscending;
  }
  /** Set the case insensitive for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillLnameCaseInsensitive (boolean ascending) {
    this.BillLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillLnameCaseInsensitive () {
    return this.BillLnameCaseInsensitive;
  }
  /** Set the field level filters for field: BillLname (SERVER_LOOKUP.bill_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillLnameFilter (StringFilter[] value) throws ServiceException {
    this.BillLname = value;
  }
  /** Retrieve filter for field: BillLname (SERVER_LOOKUP.bill_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillLnameFilter () {
    return this.BillLname;
  }

  /**
   * Retrieves the BillLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLnameFilter field
   */
  public String[] getBillLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillLnameFilter filter value from a formatted string
   *
   * @param _value the BillLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillLnameFilter filter field
   */
  public void setBillLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillLnameFilterFromFormattedString");
    try {
      this.setBillLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @param fetch whether to fetch this field or not
   */
  public void setBillLnameFindFetch (boolean fetch) {
    this.BillLnameFindFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillLnameFindFetch () {
    return this.BillLnameFindFetch;
  }
  /** Set the SortOrder for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillLnameFindSortOrder (Integer value) {
    this.BillLnameFindSort = value;
  }
  /** Retrieve SortOrder for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillLnameFindSortOrder () {
    return this.BillLnameFindSort;
  }
  /** Set the sort direction for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillLnameFindSortDirection (boolean ascending) {
    this.BillLnameFindSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillLnameFindSortDirection () {
    return this.BillLnameFindSortAscending;
  }
  /** Set the case insensitive for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillLnameFindCaseInsensitive (boolean ascending) {
    this.BillLnameFindCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillLnameFindCaseInsensitive () {
    return this.BillLnameFindCaseInsensitive;
  }
  /** Set the field level filters for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillLnameFindFilter (StringFilter[] value) throws ServiceException {
    this.BillLnameFind = value;
  }
  /** Retrieve filter for field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillLnameFindFilter () {
    return this.BillLnameFind;
  }

  /**
   * Retrieves the BillLnameFindFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillLnameFindFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLnameFindFilter field
   */
  public String[] getBillLnameFindFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFindFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillLnameFindFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameFindFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameFindFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillLnameFindFilter filter value from a formatted string
   *
   * @param _value the BillLnameFindFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillLnameFindFilter filter field
   */
  public void setBillLnameFindFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillLnameFindFilterFromFormattedString");
    try {
      this.setBillLnameFindFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFindFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFindFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCompanyFetch (boolean fetch) {
    this.BillCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCompanyFetch () {
    return this.BillCompanyFetch;
  }
  /** Set the SortOrder for field: BillCompany (SERVER_LOOKUP.bill_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCompanySortOrder (Integer value) {
    this.BillCompanySort = value;
  }
  /** Retrieve SortOrder for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCompanySortOrder () {
    return this.BillCompanySort;
  }
  /** Set the sort direction for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCompanySortDirection (boolean ascending) {
    this.BillCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCompanySortDirection () {
    return this.BillCompanySortAscending;
  }
  /** Set the case insensitive for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCompanyCaseInsensitive (boolean ascending) {
    this.BillCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCompanyCaseInsensitive () {
    return this.BillCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: BillCompany (SERVER_LOOKUP.bill_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCompanyFilter (StringFilter[] value) throws ServiceException {
    this.BillCompany = value;
  }
  /** Retrieve filter for field: BillCompany (SERVER_LOOKUP.bill_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillCompanyFilter () {
    return this.BillCompany;
  }

  /**
   * Retrieves the BillCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompanyFilter field
   */
  public String[] getBillCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCompanyFilter filter value from a formatted string
   *
   * @param _value the BillCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCompanyFilter filter field
   */
  public void setBillCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCompanyFilterFromFormattedString");
    try {
      this.setBillCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCompanyFindFetch (boolean fetch) {
    this.BillCompanyFindFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCompanyFindFetch () {
    return this.BillCompanyFindFetch;
  }
  /** Set the SortOrder for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCompanyFindSortOrder (Integer value) {
    this.BillCompanyFindSort = value;
  }
  /** Retrieve SortOrder for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCompanyFindSortOrder () {
    return this.BillCompanyFindSort;
  }
  /** Set the sort direction for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCompanyFindSortDirection (boolean ascending) {
    this.BillCompanyFindSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCompanyFindSortDirection () {
    return this.BillCompanyFindSortAscending;
  }
  /** Set the case insensitive for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCompanyFindCaseInsensitive (boolean ascending) {
    this.BillCompanyFindCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCompanyFindCaseInsensitive () {
    return this.BillCompanyFindCaseInsensitive;
  }
  /** Set the field level filters for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCompanyFindFilter (StringFilter[] value) throws ServiceException {
    this.BillCompanyFind = value;
  }
  /** Retrieve filter for field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillCompanyFindFilter () {
    return this.BillCompanyFind;
  }

  /**
   * Retrieves the BillCompanyFindFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCompanyFindFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompanyFindFilter field
   */
  public String[] getBillCompanyFindFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFindFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCompanyFindFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyFindFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyFindFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCompanyFindFilter filter value from a formatted string
   *
   * @param _value the BillCompanyFindFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCompanyFindFilter filter field
   */
  public void setBillCompanyFindFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCompanyFindFilterFromFormattedString");
    try {
      this.setBillCompanyFindFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFindFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFindFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFindFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @param fetch whether to fetch this field or not
   */
  public void setBillAddress1Fetch (boolean fetch) {
    this.BillAddress1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillAddress1Fetch () {
    return this.BillAddress1Fetch;
  }
  /** Set the SortOrder for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillAddress1SortOrder (Integer value) {
    this.BillAddress1Sort = value;
  }
  /** Retrieve SortOrder for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillAddress1SortOrder () {
    return this.BillAddress1Sort;
  }
  /** Set the sort direction for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillAddress1SortDirection (boolean ascending) {
    this.BillAddress1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillAddress1SortDirection () {
    return this.BillAddress1SortAscending;
  }
  /** Set the case insensitive for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillAddress1CaseInsensitive (boolean ascending) {
    this.BillAddress1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillAddress1CaseInsensitive () {
    return this.BillAddress1CaseInsensitive;
  }
  /** Set the field level filters for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillAddress1Filter (StringFilter[] value) throws ServiceException {
    this.BillAddress1 = value;
  }
  /** Retrieve filter for field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillAddress1Filter () {
    return this.BillAddress1;
  }

  /**
   * Retrieves the BillAddress1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillAddress1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress1Filter field
   */
  public String[] getBillAddress1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillAddress1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillAddress1Filter filter value from a formatted string
   *
   * @param _value the BillAddress1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillAddress1Filter filter field
   */
  public void setBillAddress1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillAddress1FilterFromFormattedString");
    try {
      this.setBillAddress1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCity (SERVER_LOOKUP.bill_city)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCityFetch (boolean fetch) {
    this.BillCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCity (SERVER_LOOKUP.bill_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCityFetch () {
    return this.BillCityFetch;
  }
  /** Set the SortOrder for field: BillCity (SERVER_LOOKUP.bill_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCitySortOrder (Integer value) {
    this.BillCitySort = value;
  }
  /** Retrieve SortOrder for field: BillCity (SERVER_LOOKUP.bill_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCitySortOrder () {
    return this.BillCitySort;
  }
  /** Set the sort direction for field: BillCity (SERVER_LOOKUP.bill_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCitySortDirection (boolean ascending) {
    this.BillCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCity (SERVER_LOOKUP.bill_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCitySortDirection () {
    return this.BillCitySortAscending;
  }
  /** Set the case insensitive for field: BillCity (SERVER_LOOKUP.bill_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCityCaseInsensitive (boolean ascending) {
    this.BillCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCity (SERVER_LOOKUP.bill_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCityCaseInsensitive () {
    return this.BillCityCaseInsensitive;
  }
  /** Set the field level filters for field: BillCity (SERVER_LOOKUP.bill_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCityFilter (StringFilter[] value) throws ServiceException {
    this.BillCity = value;
  }
  /** Retrieve filter for field: BillCity (SERVER_LOOKUP.bill_city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillCityFilter () {
    return this.BillCity;
  }

  /**
   * Retrieves the BillCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCityFilter field
   */
  public String[] getBillCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCityFilter filter value from a formatted string
   *
   * @param _value the BillCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCityFilter filter field
   */
  public void setBillCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCityFilterFromFormattedString");
    try {
      this.setBillCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillState (SERVER_LOOKUP.bill_state)
   * @param fetch whether to fetch this field or not
   */
  public void setBillStateFetch (boolean fetch) {
    this.BillStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillState (SERVER_LOOKUP.bill_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillStateFetch () {
    return this.BillStateFetch;
  }
  /** Set the SortOrder for field: BillState (SERVER_LOOKUP.bill_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillStateSortOrder (Integer value) {
    this.BillStateSort = value;
  }
  /** Retrieve SortOrder for field: BillState (SERVER_LOOKUP.bill_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillStateSortOrder () {
    return this.BillStateSort;
  }
  /** Set the sort direction for field: BillState (SERVER_LOOKUP.bill_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillStateSortDirection (boolean ascending) {
    this.BillStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillState (SERVER_LOOKUP.bill_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillStateSortDirection () {
    return this.BillStateSortAscending;
  }
  /** Set the case insensitive for field: BillState (SERVER_LOOKUP.bill_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillStateCaseInsensitive (boolean ascending) {
    this.BillStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillState (SERVER_LOOKUP.bill_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillStateCaseInsensitive () {
    return this.BillStateCaseInsensitive;
  }
  /** Set the field level filters for field: BillState (SERVER_LOOKUP.bill_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillStateFilter (StringFilter[] value) throws ServiceException {
    this.BillState = value;
  }
  /** Retrieve filter for field: BillState (SERVER_LOOKUP.bill_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillStateFilter () {
    return this.BillState;
  }

  /**
   * Retrieves the BillStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillStateFilter field
   */
  public String[] getBillStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillStateFilter filter value from a formatted string
   *
   * @param _value the BillStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillStateFilter filter field
   */
  public void setBillStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFilterFromFormattedString");
    try {
      this.setBillStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillStateFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillStateFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillStateFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillStateFilter filter field
   */
  public String[] getBillStateFilterDisplayValue(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateFilterDisplayValue");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillStateFilter(), "StateProvince", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillStateFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillStateFilter filter field
   */
  public void setBillStateFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFilterFromDisplayValue");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      this.setBillStateFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillState", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillStateFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setBillZipFetch (boolean fetch) {
    this.BillZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillZipFetch () {
    return this.BillZipFetch;
  }
  /** Set the SortOrder for field: BillZip (SERVER_LOOKUP.bill_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillZipSortOrder (Integer value) {
    this.BillZipSort = value;
  }
  /** Retrieve SortOrder for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillZipSortOrder () {
    return this.BillZipSort;
  }
  /** Set the sort direction for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillZipSortDirection (boolean ascending) {
    this.BillZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillZipSortDirection () {
    return this.BillZipSortAscending;
  }
  /** Set the case insensitive for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillZipCaseInsensitive (boolean ascending) {
    this.BillZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillZipCaseInsensitive () {
    return this.BillZipCaseInsensitive;
  }
  /** Set the field level filters for field: BillZip (SERVER_LOOKUP.bill_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillZipFilter (StringFilter[] value) throws ServiceException {
    this.BillZip = value;
  }
  /** Retrieve filter for field: BillZip (SERVER_LOOKUP.bill_zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillZipFilter () {
    return this.BillZip;
  }

  /**
   * Retrieves the BillZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillZipFilter field
   */
  public String[] getBillZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillZipFilter filter value from a formatted string
   *
   * @param _value the BillZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillZipFilter filter field
   */
  public void setBillZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillZipFilterFromFormattedString");
    try {
      this.setBillZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @param fetch whether to fetch this field or not
   */
  public void setCustPhone1Fetch (boolean fetch) {
    this.CustPhone1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustPhone1Fetch () {
    return this.CustPhone1Fetch;
  }
  /** Set the SortOrder for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustPhone1SortOrder (Integer value) {
    this.CustPhone1Sort = value;
  }
  /** Retrieve SortOrder for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustPhone1SortOrder () {
    return this.CustPhone1Sort;
  }
  /** Set the sort direction for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustPhone1SortDirection (boolean ascending) {
    this.CustPhone1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustPhone1SortDirection () {
    return this.CustPhone1SortAscending;
  }
  /** Set the case insensitive for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustPhone1CaseInsensitive (boolean ascending) {
    this.CustPhone1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustPhone1CaseInsensitive () {
    return this.CustPhone1CaseInsensitive;
  }
  /** Set the field level filters for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustPhone1Filter (StringFilter[] value) throws ServiceException {
    this.CustPhone1 = value;
  }
  /** Retrieve filter for field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustPhone1Filter () {
    return this.CustPhone1;
  }

  /**
   * Retrieves the CustPhone1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustPhone1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone1Filter field
   */
  public String[] getCustPhone1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustPhone1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustPhone1Filter filter value from a formatted string
   *
   * @param _value the CustPhone1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustPhone1Filter filter field
   */
  public void setCustPhone1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustPhone1FilterFromFormattedString");
    try {
      this.setCustPhone1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @param fetch whether to fetch this field or not
   */
  public void setCustPhone2Fetch (boolean fetch) {
    this.CustPhone2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustPhone2Fetch () {
    return this.CustPhone2Fetch;
  }
  /** Set the SortOrder for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustPhone2SortOrder (Integer value) {
    this.CustPhone2Sort = value;
  }
  /** Retrieve SortOrder for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustPhone2SortOrder () {
    return this.CustPhone2Sort;
  }
  /** Set the sort direction for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustPhone2SortDirection (boolean ascending) {
    this.CustPhone2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustPhone2SortDirection () {
    return this.CustPhone2SortAscending;
  }
  /** Set the case insensitive for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustPhone2CaseInsensitive (boolean ascending) {
    this.CustPhone2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustPhone2CaseInsensitive () {
    return this.CustPhone2CaseInsensitive;
  }
  /** Set the field level filters for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustPhone2Filter (StringFilter[] value) throws ServiceException {
    this.CustPhone2 = value;
  }
  /** Retrieve filter for field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustPhone2Filter () {
    return this.CustPhone2;
  }

  /**
   * Retrieves the CustPhone2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustPhone2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone2Filter field
   */
  public String[] getCustPhone2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustPhone2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustPhone2Filter filter value from a formatted string
   *
   * @param _value the CustPhone2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustPhone2Filter filter field
   */
  public void setCustPhone2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustPhone2FilterFromFormattedString");
    try {
      this.setCustPhone2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Codeword (SERVER_LOOKUP.codeword)
   * @param fetch whether to fetch this field or not
   */
  public void setCodewordFetch (boolean fetch) {
    this.CodewordFetch = fetch;
  }
  /** Retrieve Fetch value for field: Codeword (SERVER_LOOKUP.codeword)
   * @return boolean the Fetch value for this field
   */
  public boolean getCodewordFetch () {
    return this.CodewordFetch;
  }
  /** Set the SortOrder for field: Codeword (SERVER_LOOKUP.codeword)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCodewordSortOrder (Integer value) {
    this.CodewordSort = value;
  }
  /** Retrieve SortOrder for field: Codeword (SERVER_LOOKUP.codeword)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCodewordSortOrder () {
    return this.CodewordSort;
  }
  /** Set the sort direction for field: Codeword (SERVER_LOOKUP.codeword)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCodewordSortDirection (boolean ascending) {
    this.CodewordSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Codeword (SERVER_LOOKUP.codeword)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCodewordSortDirection () {
    return this.CodewordSortAscending;
  }
  /** Set the case insensitive for field: Codeword (SERVER_LOOKUP.codeword)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCodewordCaseInsensitive (boolean ascending) {
    this.CodewordCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Codeword (SERVER_LOOKUP.codeword)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCodewordCaseInsensitive () {
    return this.CodewordCaseInsensitive;
  }
  /** Set the field level filters for field: Codeword (SERVER_LOOKUP.codeword)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCodewordFilter (StringFilter[] value) throws ServiceException {
    this.Codeword = value;
  }
  /** Retrieve filter for field: Codeword (SERVER_LOOKUP.codeword)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCodewordFilter () {
    return this.Codeword;
  }

  /**
   * Retrieves the CodewordFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CodewordFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CodewordFilter field
   */
  public String[] getCodewordFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCodewordFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodewordFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodewordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodewordFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CodewordFilter filter value from a formatted string
   *
   * @param _value the CodewordFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CodewordFilter filter field
   */
  public void setCodewordFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCodewordFilterFromFormattedString");
    try {
      this.setCodewordFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodewordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodewordFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodewordFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerId (SERVER_LOOKUP.server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch) {
    this.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId (SERVER_LOOKUP.server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch () {
    return this.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId (SERVER_LOOKUP.server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value) {
    this.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId (SERVER_LOOKUP.server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder () {
    return this.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId (SERVER_LOOKUP.server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending) {
    this.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId (SERVER_LOOKUP.server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection () {
    return this.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId (SERVER_LOOKUP.server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServerId = value;
  }
  /** Retrieve filter for field: ServerId (SERVER_LOOKUP.server_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerIdFilter () {
    return this.ServerId;
  }

  /**
   * Retrieves the ServerIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServerIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerIdFilter field
   */
  public String[] getServerIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServerIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServerIdFilter filter value from a formatted string
   *
   * @param _value the ServerIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServerIdFilter filter field
   */
  public void setServerIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServerIdFilterFromFormattedString");
    try {
      this.setServerIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcctSegIdFetch (boolean fetch) {
    this.AcctSegIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcctSegIdFetch () {
    return this.AcctSegIdFetch;
  }
  /** Set the SortOrder for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcctSegIdSortOrder (Integer value) {
    this.AcctSegIdSort = value;
  }
  /** Retrieve SortOrder for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcctSegIdSortOrder () {
    return this.AcctSegIdSort;
  }
  /** Set the sort direction for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcctSegIdSortDirection (boolean ascending) {
    this.AcctSegIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcctSegIdSortDirection () {
    return this.AcctSegIdSortAscending;
  }
  /** Set the field level filters for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcctSegIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AcctSegId = value;
  }
  /** Retrieve filter for field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcctSegIdFilter () {
    return this.AcctSegId;
  }

  /**
   * Retrieves the AcctSegIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AcctSegIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcctSegIdFilter field
   */
  public String[] getAcctSegIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAcctSegIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AcctSegIdFilter filter value from a formatted string
   *
   * @param _value the AcctSegIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AcctSegIdFilter filter field
   */
  public void setAcctSegIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFilterFromFormattedString");
    try {
      this.setAcctSegIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AcctSegIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AcctSegIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AcctSegIdFilter filter field
   */
  public String[] getAcctSegIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAcctSegIdFilter(), "AccountSegment", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AcctSegIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AcctSegIdFilter filter field
   */
  public void setAcctSegIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAcctSegIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AcctSegId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setAltLnameFetch (boolean fetch) {
    this.AltLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltLnameFetch () {
    return this.AltLnameFetch;
  }
  /** Set the SortOrder for field: AltLname (SERVER_LOOKUP.alt_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltLnameSortOrder (Integer value) {
    this.AltLnameSort = value;
  }
  /** Retrieve SortOrder for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltLnameSortOrder () {
    return this.AltLnameSort;
  }
  /** Set the sort direction for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltLnameSortDirection (boolean ascending) {
    this.AltLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltLnameSortDirection () {
    return this.AltLnameSortAscending;
  }
  /** Set the case insensitive for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltLnameCaseInsensitive (boolean ascending) {
    this.AltLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltLnameCaseInsensitive () {
    return this.AltLnameCaseInsensitive;
  }
  /** Set the field level filters for field: AltLname (SERVER_LOOKUP.alt_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltLnameFilter (StringFilter[] value) throws ServiceException {
    this.AltLname = value;
  }
  /** Retrieve filter for field: AltLname (SERVER_LOOKUP.alt_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltLnameFilter () {
    return this.AltLname;
  }

  /**
   * Retrieves the AltLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltLnameFilter field
   */
  public String[] getAltLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltLnameFilter filter value from a formatted string
   *
   * @param _value the AltLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltLnameFilter filter field
   */
  public void setAltLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltLnameFilterFromFormattedString");
    try {
      this.setAltLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setAltFnameFetch (boolean fetch) {
    this.AltFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltFnameFetch () {
    return this.AltFnameFetch;
  }
  /** Set the SortOrder for field: AltFname (SERVER_LOOKUP.alt_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltFnameSortOrder (Integer value) {
    this.AltFnameSort = value;
  }
  /** Retrieve SortOrder for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltFnameSortOrder () {
    return this.AltFnameSort;
  }
  /** Set the sort direction for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltFnameSortDirection (boolean ascending) {
    this.AltFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltFnameSortDirection () {
    return this.AltFnameSortAscending;
  }
  /** Set the case insensitive for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltFnameCaseInsensitive (boolean ascending) {
    this.AltFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltFnameCaseInsensitive () {
    return this.AltFnameCaseInsensitive;
  }
  /** Set the field level filters for field: AltFname (SERVER_LOOKUP.alt_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltFnameFilter (StringFilter[] value) throws ServiceException {
    this.AltFname = value;
  }
  /** Retrieve filter for field: AltFname (SERVER_LOOKUP.alt_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltFnameFilter () {
    return this.AltFname;
  }

  /**
   * Retrieves the AltFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltFnameFilter field
   */
  public String[] getAltFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltFnameFilter filter value from a formatted string
   *
   * @param _value the AltFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltFnameFilter filter field
   */
  public void setAltFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltFnameFilterFromFormattedString");
    try {
      this.setAltFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @param fetch whether to fetch this field or not
   */
  public void setAltCompanyNameFetch (boolean fetch) {
    this.AltCompanyNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltCompanyNameFetch () {
    return this.AltCompanyNameFetch;
  }
  /** Set the SortOrder for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltCompanyNameSortOrder (Integer value) {
    this.AltCompanyNameSort = value;
  }
  /** Retrieve SortOrder for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltCompanyNameSortOrder () {
    return this.AltCompanyNameSort;
  }
  /** Set the sort direction for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltCompanyNameSortDirection (boolean ascending) {
    this.AltCompanyNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltCompanyNameSortDirection () {
    return this.AltCompanyNameSortAscending;
  }
  /** Set the case insensitive for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltCompanyNameCaseInsensitive (boolean ascending) {
    this.AltCompanyNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltCompanyNameCaseInsensitive () {
    return this.AltCompanyNameCaseInsensitive;
  }
  /** Set the field level filters for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltCompanyNameFilter (StringFilter[] value) throws ServiceException {
    this.AltCompanyName = value;
  }
  /** Retrieve filter for field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltCompanyNameFilter () {
    return this.AltCompanyName;
  }

  /**
   * Retrieves the AltCompanyNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltCompanyNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCompanyNameFilter field
   */
  public String[] getAltCompanyNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltCompanyNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCompanyNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCompanyNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltCompanyNameFilter filter value from a formatted string
   *
   * @param _value the AltCompanyNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltCompanyNameFilter filter field
   */
  public void setAltCompanyNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltCompanyNameFilterFromFormattedString");
    try {
      this.setAltCompanyNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCompanyNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCompanyNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DateActive (SERVER_LOOKUP.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch) {
    this.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (SERVER_LOOKUP.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch () {
    return this.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (SERVER_LOOKUP.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value) {
    this.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (SERVER_LOOKUP.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder () {
    return this.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (SERVER_LOOKUP.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending) {
    this.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (SERVER_LOOKUP.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection () {
    return this.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (SERVER_LOOKUP.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (SERVER_LOOKUP.date_active)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateActiveFilter () {
    return this.DateActive;
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * @param fetch whether to fetch this field or not
   */
  public void setDateInactiveFetch (boolean fetch) {
    this.DateInactiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateInactiveFetch () {
    return this.DateInactiveFetch;
  }
  /** Set the SortOrder for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateInactiveSortOrder (Integer value) {
    this.DateInactiveSort = value;
  }
  /** Retrieve SortOrder for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateInactiveSortOrder () {
    return this.DateInactiveSort;
  }
  /** Set the sort direction for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateInactiveSortDirection (boolean ascending) {
    this.DateInactiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateInactiveSortDirection () {
    return this.DateInactiveSortAscending;
  }
  /** Set the field level filters for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateInactiveFilter (DateFilter[] value) throws ServiceException {
    this.DateInactive = value;
  }
  /** Retrieve filter for field: DateInactive (SERVER_LOOKUP.date_inactive)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateInactiveFilter () {
    return this.DateInactive;
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCustomerLifetimeIdFetch (boolean fetch) {
    this.CustomerLifetimeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustomerLifetimeIdFetch () {
    return this.CustomerLifetimeIdFetch;
  }
  /** Set the SortOrder for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustomerLifetimeIdSortOrder (Integer value) {
    this.CustomerLifetimeIdSort = value;
  }
  /** Retrieve SortOrder for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustomerLifetimeIdSortOrder () {
    return this.CustomerLifetimeIdSort;
  }
  /** Set the sort direction for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustomerLifetimeIdSortDirection (boolean ascending) {
    this.CustomerLifetimeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustomerLifetimeIdSortDirection () {
    return this.CustomerLifetimeIdSortAscending;
  }
  /** Set the field level filters for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustomerLifetimeIdFilter (IntegerFilter[] value) throws ServiceException {
    this.CustomerLifetimeId = value;
  }
  /** Retrieve filter for field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCustomerLifetimeIdFilter () {
    return this.CustomerLifetimeId;
  }

  /**
   * Retrieves the CustomerLifetimeIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustomerLifetimeIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeIdFilter field
   */
  public String[] getCustomerLifetimeIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustomerLifetimeIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustomerLifetimeIdFilter filter value from a formatted string
   *
   * @param _value the CustomerLifetimeIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustomerLifetimeIdFilter filter field
   */
  public void setCustomerLifetimeIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustomerLifetimeIdFilterFromFormattedString");
    try {
      this.setCustomerLifetimeIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setCustomerLifetimeId2Fetch (boolean fetch) {
    this.CustomerLifetimeId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustomerLifetimeId2Fetch () {
    return this.CustomerLifetimeId2Fetch;
  }
  /** Set the SortOrder for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustomerLifetimeId2SortOrder (Integer value) {
    this.CustomerLifetimeId2Sort = value;
  }
  /** Retrieve SortOrder for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustomerLifetimeId2SortOrder () {
    return this.CustomerLifetimeId2Sort;
  }
  /** Set the sort direction for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustomerLifetimeId2SortDirection (boolean ascending) {
    this.CustomerLifetimeId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustomerLifetimeId2SortDirection () {
    return this.CustomerLifetimeId2SortAscending;
  }
  /** Set the field level filters for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustomerLifetimeId2Filter (IntegerFilter[] value) throws ServiceException {
    this.CustomerLifetimeId2 = value;
  }
  /** Retrieve filter for field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCustomerLifetimeId2Filter () {
    return this.CustomerLifetimeId2;
  }

  /**
   * Retrieves the CustomerLifetimeId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustomerLifetimeId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeId2Filter field
   */
  public String[] getCustomerLifetimeId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustomerLifetimeId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustomerLifetimeId2Filter filter value from a formatted string
   *
   * @param _value the CustomerLifetimeId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustomerLifetimeId2Filter filter field
   */
  public void setCustomerLifetimeId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustomerLifetimeId2FilterFromFormattedString");
    try {
      this.setCustomerLifetimeId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeId2FilterFromFormattedString");
  }

  public String toString() {
    return AccountLocateObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountLocateObjectHelper.toMap(this, null);
  }
}
