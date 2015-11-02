/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrObjectFilter.java
 * Definition File: Admin/Csr.xml
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
public class CsrObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CsrObjectKeyFilter Key = null;
  /** raw field for: CSR_INFORMATION.supervisor_name) */
  public    StringFilter[] SupervisorName  = null;
  protected boolean SupervisorNameFetch = false;
  protected boolean SupervisorNameSortAscending = true;
  protected boolean SupervisorNameCaseInsensitive = false;
  protected Integer SupervisorNameSort = null;
  /** raw field for: CSR_INFORMATION.csr_lname) */
  public    StringFilter[] CsrLname  = null;
  protected boolean CsrLnameFetch = false;
  protected boolean CsrLnameSortAscending = true;
  protected boolean CsrLnameCaseInsensitive = false;
  protected Integer CsrLnameSort = null;
  /** raw field for: CSR_INFORMATION.csr_fname) */
  public    StringFilter[] CsrFname  = null;
  protected boolean CsrFnameFetch = false;
  protected boolean CsrFnameSortAscending = true;
  protected boolean CsrFnameCaseInsensitive = false;
  protected Integer CsrFnameSort = null;
  /** raw field for: CSR_INFORMATION.csr_minit) */
  public    StringFilter[] CsrMinit  = null;
  protected boolean CsrMinitFetch = false;
  protected boolean CsrMinitSortAscending = true;
  protected boolean CsrMinitCaseInsensitive = false;
  protected Integer CsrMinitSort = null;
  /** raw field for: CSR_INFORMATION.csr_title) */
  public    StringFilter[] CsrTitle  = null;
  protected boolean CsrTitleFetch = false;
  protected boolean CsrTitleSortAscending = true;
  protected boolean CsrTitleCaseInsensitive = false;
  protected Integer CsrTitleSort = null;
  /** raw field for: CSR_INFORMATION.csr_phone) */
  public    StringFilter[] CsrPhone  = null;
  protected boolean CsrPhoneFetch = false;
  protected boolean CsrPhoneSortAscending = true;
  protected boolean CsrPhoneCaseInsensitive = false;
  protected Integer CsrPhoneSort = null;
  /** raw field for: CSR_INFORMATION.csr_email) */
  public    StringFilter[] CsrEmail  = null;
  protected boolean CsrEmailFetch = false;
  protected boolean CsrEmailSortAscending = true;
  protected boolean CsrEmailCaseInsensitive = false;
  protected Integer CsrEmailSort = null;
  /** raw field for: CSR_INFORMATION.csr_address1) */
  public    StringFilter[] CsrAddress1  = null;
  protected boolean CsrAddress1Fetch = false;
  protected boolean CsrAddress1SortAscending = true;
  protected boolean CsrAddress1CaseInsensitive = false;
  protected Integer CsrAddress1Sort = null;
  /** raw field for: CSR_INFORMATION.csr_address2) */
  public    StringFilter[] CsrAddress2  = null;
  protected boolean CsrAddress2Fetch = false;
  protected boolean CsrAddress2SortAscending = true;
  protected boolean CsrAddress2CaseInsensitive = false;
  protected Integer CsrAddress2Sort = null;
  /** raw field for: CSR_INFORMATION.csr_address3) */
  public    StringFilter[] CsrAddress3  = null;
  protected boolean CsrAddress3Fetch = false;
  protected boolean CsrAddress3SortAscending = true;
  protected boolean CsrAddress3CaseInsensitive = false;
  protected Integer CsrAddress3Sort = null;
  /** raw field for: CSR_INFORMATION.csr_city) */
  public    StringFilter[] CsrCity  = null;
  protected boolean CsrCityFetch = false;
  protected boolean CsrCitySortAscending = true;
  protected boolean CsrCityCaseInsensitive = false;
  protected Integer CsrCitySort = null;
  /** raw field for: CSR_INFORMATION.csr_state) */
  public    StringFilter[] CsrState  = null;
  protected boolean CsrStateFetch = false;
  protected boolean CsrStateSortAscending = true;
  protected boolean CsrStateCaseInsensitive = false;
  protected Integer CsrStateSort = null;
  /** raw field for: CSR_INFORMATION.csr_zip) */
  public    StringFilter[] CsrZip  = null;
  protected boolean CsrZipFetch = false;
  protected boolean CsrZipSortAscending = true;
  protected boolean CsrZipCaseInsensitive = false;
  protected Integer CsrZipSort = null;
  /** raw field for: CSR_INFORMATION.csr_country_code) */
  public    IntegerFilter[] CsrCountryCode  = null;
  protected boolean CsrCountryCodeFetch = false;
  protected boolean CsrCountryCodeSortAscending = true;
  protected Integer CsrCountryCodeSort = null;
  /** raw field for: CSR_INFORMATION.csr_county) */
  public    StringFilter[] CsrCounty  = null;
  protected boolean CsrCountyFetch = false;
  protected boolean CsrCountySortAscending = true;
  protected boolean CsrCountyCaseInsensitive = false;
  protected Integer CsrCountySort = null;
  /** raw field for: CSR_INFORMATION.date_active) */
  public    DateFilter[] DateActive  = null;
  protected boolean DateActiveFetch = false;
  protected boolean DateActiveSortAscending = true;
  protected Integer DateActiveSort = null;
  /** raw field for: CSR_INFORMATION.date_inactive) */
  public    DateFilter[] DateInactive  = null;
  protected boolean DateInactiveFetch = false;
  protected boolean DateInactiveSortAscending = true;
  protected Integer DateInactiveSort = null;
  /** raw field for: CSR_INFORMATION.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "CsrObjectFilter";
  /** default constructor */
  public CsrObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CsrObjectFilter (CsrObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CsrObjectKeyFilter (other.Key);
    this.SupervisorName = other.SupervisorName;
    this.SupervisorNameFetch = other.SupervisorNameFetch;
    this.SupervisorNameSort = other.SupervisorNameSort;
    this.SupervisorNameCaseInsensitive = other.SupervisorNameCaseInsensitive;
    this.SupervisorNameSortAscending = other.SupervisorNameSortAscending;
    this.CsrLname = other.CsrLname;
    this.CsrLnameFetch = other.CsrLnameFetch;
    this.CsrLnameSort = other.CsrLnameSort;
    this.CsrLnameCaseInsensitive = other.CsrLnameCaseInsensitive;
    this.CsrLnameSortAscending = other.CsrLnameSortAscending;
    this.CsrFname = other.CsrFname;
    this.CsrFnameFetch = other.CsrFnameFetch;
    this.CsrFnameSort = other.CsrFnameSort;
    this.CsrFnameCaseInsensitive = other.CsrFnameCaseInsensitive;
    this.CsrFnameSortAscending = other.CsrFnameSortAscending;
    this.CsrMinit = other.CsrMinit;
    this.CsrMinitFetch = other.CsrMinitFetch;
    this.CsrMinitSort = other.CsrMinitSort;
    this.CsrMinitCaseInsensitive = other.CsrMinitCaseInsensitive;
    this.CsrMinitSortAscending = other.CsrMinitSortAscending;
    this.CsrTitle = other.CsrTitle;
    this.CsrTitleFetch = other.CsrTitleFetch;
    this.CsrTitleSort = other.CsrTitleSort;
    this.CsrTitleCaseInsensitive = other.CsrTitleCaseInsensitive;
    this.CsrTitleSortAscending = other.CsrTitleSortAscending;
    this.CsrPhone = other.CsrPhone;
    this.CsrPhoneFetch = other.CsrPhoneFetch;
    this.CsrPhoneSort = other.CsrPhoneSort;
    this.CsrPhoneCaseInsensitive = other.CsrPhoneCaseInsensitive;
    this.CsrPhoneSortAscending = other.CsrPhoneSortAscending;
    this.CsrEmail = other.CsrEmail;
    this.CsrEmailFetch = other.CsrEmailFetch;
    this.CsrEmailSort = other.CsrEmailSort;
    this.CsrEmailCaseInsensitive = other.CsrEmailCaseInsensitive;
    this.CsrEmailSortAscending = other.CsrEmailSortAscending;
    this.CsrAddress1 = other.CsrAddress1;
    this.CsrAddress1Fetch = other.CsrAddress1Fetch;
    this.CsrAddress1Sort = other.CsrAddress1Sort;
    this.CsrAddress1CaseInsensitive = other.CsrAddress1CaseInsensitive;
    this.CsrAddress1SortAscending = other.CsrAddress1SortAscending;
    this.CsrAddress2 = other.CsrAddress2;
    this.CsrAddress2Fetch = other.CsrAddress2Fetch;
    this.CsrAddress2Sort = other.CsrAddress2Sort;
    this.CsrAddress2CaseInsensitive = other.CsrAddress2CaseInsensitive;
    this.CsrAddress2SortAscending = other.CsrAddress2SortAscending;
    this.CsrAddress3 = other.CsrAddress3;
    this.CsrAddress3Fetch = other.CsrAddress3Fetch;
    this.CsrAddress3Sort = other.CsrAddress3Sort;
    this.CsrAddress3CaseInsensitive = other.CsrAddress3CaseInsensitive;
    this.CsrAddress3SortAscending = other.CsrAddress3SortAscending;
    this.CsrCity = other.CsrCity;
    this.CsrCityFetch = other.CsrCityFetch;
    this.CsrCitySort = other.CsrCitySort;
    this.CsrCityCaseInsensitive = other.CsrCityCaseInsensitive;
    this.CsrCitySortAscending = other.CsrCitySortAscending;
    this.CsrState = other.CsrState;
    this.CsrStateFetch = other.CsrStateFetch;
    this.CsrStateSort = other.CsrStateSort;
    this.CsrStateCaseInsensitive = other.CsrStateCaseInsensitive;
    this.CsrStateSortAscending = other.CsrStateSortAscending;
    this.CsrZip = other.CsrZip;
    this.CsrZipFetch = other.CsrZipFetch;
    this.CsrZipSort = other.CsrZipSort;
    this.CsrZipCaseInsensitive = other.CsrZipCaseInsensitive;
    this.CsrZipSortAscending = other.CsrZipSortAscending;
    this.CsrCountryCode = other.CsrCountryCode;
    this.CsrCountryCodeFetch = other.CsrCountryCodeFetch;
    this.CsrCountryCodeSort = other.CsrCountryCodeSort;
    this.CsrCountryCodeSortAscending = other.CsrCountryCodeSortAscending;
    this.CsrCounty = other.CsrCounty;
    this.CsrCountyFetch = other.CsrCountyFetch;
    this.CsrCountySort = other.CsrCountySort;
    this.CsrCountyCaseInsensitive = other.CsrCountyCaseInsensitive;
    this.CsrCountySortAscending = other.CsrCountySortAscending;
    this.DateActive = other.DateActive;
    this.DateActiveFetch = other.DateActiveFetch;
    this.DateActiveSort = other.DateActiveSort;
    this.DateActiveSortAscending = other.DateActiveSortAscending;
    this.DateInactive = other.DateInactive;
    this.DateInactiveFetch = other.DateInactiveFetch;
    this.DateInactiveSort = other.DateInactiveSort;
    this.DateInactiveSortAscending = other.DateInactiveSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return CsrObjectKeyFilter
   */
  public CsrObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CsrObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: UserName (CSR_INFORMATION.user_name)
   * @param fetch whether to fetch this field or not
   */
  public void setUserNameFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrObjectKeyFilter ();
    this.Key.UserNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: UserName (CSR_INFORMATION.user_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getUserNameFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.UserNameFetch;
  }
  /** Set the SortOrder for field: UserName (CSR_INFORMATION.user_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUserNameSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrObjectKeyFilter ();
    this.Key.UserNameSort = value;
  }
  /** Retrieve SortOrder for field: UserName (CSR_INFORMATION.user_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUserNameSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.UserNameSort;
  }
  /** Set the sort direction for field: UserName (CSR_INFORMATION.user_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUserNameSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrObjectKeyFilter ();
    this.Key.UserNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UserName (CSR_INFORMATION.user_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUserNameSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.UserNameSortAscending;
  }
  /** Set the case insensitive for field: UserName (CSR_INFORMATION.user_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUserNameCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrObjectKeyFilter ();
    this.Key.UserNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: UserName (CSR_INFORMATION.user_name)
   * @return boolean whether the field is case insensitive
   */
  public boolean getUserNameCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.UserNameCaseInsensitive;
  }
  /** Set the field level filters for field: UserName (CSR_INFORMATION.user_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUserNameFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrObjectKeyFilter ();
    this.Key.UserName = value;
  }
  /** Retrieve filter for field: UserName (CSR_INFORMATION.user_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUserNameFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.UserName;
  }
  /** Set the field level Fetch value for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @param fetch whether to fetch this field or not
   */
  public void setSupervisorNameFetch (boolean fetch) {
    this.SupervisorNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getSupervisorNameFetch () {
    return this.SupervisorNameFetch;
  }
  /** Set the SortOrder for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSupervisorNameSortOrder (Integer value) {
    this.SupervisorNameSort = value;
  }
  /** Retrieve SortOrder for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSupervisorNameSortOrder () {
    return this.SupervisorNameSort;
  }
  /** Set the sort direction for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSupervisorNameSortDirection (boolean ascending) {
    this.SupervisorNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSupervisorNameSortDirection () {
    return this.SupervisorNameSortAscending;
  }
  /** Set the case insensitive for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSupervisorNameCaseInsensitive (boolean ascending) {
    this.SupervisorNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSupervisorNameCaseInsensitive () {
    return this.SupervisorNameCaseInsensitive;
  }
  /** Set the field level filters for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSupervisorNameFilter (StringFilter[] value) throws ServiceException {
    this.SupervisorName = value;
  }
  /** Retrieve filter for field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSupervisorNameFilter () {
    return this.SupervisorName;
  }

  /**
   * Retrieves the SupervisorNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SupervisorNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SupervisorNameFilter field
   */
  public String[] getSupervisorNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSupervisorNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSupervisorNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SupervisorNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSupervisorNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SupervisorNameFilter filter value from a formatted string
   *
   * @param _value the SupervisorNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SupervisorNameFilter filter field
   */
  public void setSupervisorNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSupervisorNameFilterFromFormattedString");
    try {
      this.setSupervisorNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SupervisorNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSupervisorNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSupervisorNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrLnameFetch (boolean fetch) {
    this.CsrLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrLnameFetch () {
    return this.CsrLnameFetch;
  }
  /** Set the SortOrder for field: CsrLname (CSR_INFORMATION.csr_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrLnameSortOrder (Integer value) {
    this.CsrLnameSort = value;
  }
  /** Retrieve SortOrder for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrLnameSortOrder () {
    return this.CsrLnameSort;
  }
  /** Set the sort direction for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrLnameSortDirection (boolean ascending) {
    this.CsrLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrLnameSortDirection () {
    return this.CsrLnameSortAscending;
  }
  /** Set the case insensitive for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrLnameCaseInsensitive (boolean ascending) {
    this.CsrLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrLnameCaseInsensitive () {
    return this.CsrLnameCaseInsensitive;
  }
  /** Set the field level filters for field: CsrLname (CSR_INFORMATION.csr_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrLnameFilter (StringFilter[] value) throws ServiceException {
    this.CsrLname = value;
  }
  /** Retrieve filter for field: CsrLname (CSR_INFORMATION.csr_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrLnameFilter () {
    return this.CsrLname;
  }

  /**
   * Retrieves the CsrLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrLnameFilter field
   */
  public String[] getCsrLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrLnameFilter filter value from a formatted string
   *
   * @param _value the CsrLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrLnameFilter filter field
   */
  public void setCsrLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrLnameFilterFromFormattedString");
    try {
      this.setCsrLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrFnameFetch (boolean fetch) {
    this.CsrFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrFnameFetch () {
    return this.CsrFnameFetch;
  }
  /** Set the SortOrder for field: CsrFname (CSR_INFORMATION.csr_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrFnameSortOrder (Integer value) {
    this.CsrFnameSort = value;
  }
  /** Retrieve SortOrder for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrFnameSortOrder () {
    return this.CsrFnameSort;
  }
  /** Set the sort direction for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrFnameSortDirection (boolean ascending) {
    this.CsrFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrFnameSortDirection () {
    return this.CsrFnameSortAscending;
  }
  /** Set the case insensitive for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrFnameCaseInsensitive (boolean ascending) {
    this.CsrFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrFnameCaseInsensitive () {
    return this.CsrFnameCaseInsensitive;
  }
  /** Set the field level filters for field: CsrFname (CSR_INFORMATION.csr_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrFnameFilter (StringFilter[] value) throws ServiceException {
    this.CsrFname = value;
  }
  /** Retrieve filter for field: CsrFname (CSR_INFORMATION.csr_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrFnameFilter () {
    return this.CsrFname;
  }

  /**
   * Retrieves the CsrFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrFnameFilter field
   */
  public String[] getCsrFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrFnameFilter filter value from a formatted string
   *
   * @param _value the CsrFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrFnameFilter filter field
   */
  public void setCsrFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrFnameFilterFromFormattedString");
    try {
      this.setCsrFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrMinitFetch (boolean fetch) {
    this.CsrMinitFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrMinitFetch () {
    return this.CsrMinitFetch;
  }
  /** Set the SortOrder for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrMinitSortOrder (Integer value) {
    this.CsrMinitSort = value;
  }
  /** Retrieve SortOrder for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrMinitSortOrder () {
    return this.CsrMinitSort;
  }
  /** Set the sort direction for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrMinitSortDirection (boolean ascending) {
    this.CsrMinitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrMinitSortDirection () {
    return this.CsrMinitSortAscending;
  }
  /** Set the case insensitive for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrMinitCaseInsensitive (boolean ascending) {
    this.CsrMinitCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrMinitCaseInsensitive () {
    return this.CsrMinitCaseInsensitive;
  }
  /** Set the field level filters for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrMinitFilter (StringFilter[] value) throws ServiceException {
    this.CsrMinit = value;
  }
  /** Retrieve filter for field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrMinitFilter () {
    return this.CsrMinit;
  }

  /**
   * Retrieves the CsrMinitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrMinitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrMinitFilter field
   */
  public String[] getCsrMinitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrMinitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrMinitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrMinitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrMinitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrMinitFilter filter value from a formatted string
   *
   * @param _value the CsrMinitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrMinitFilter filter field
   */
  public void setCsrMinitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrMinitFilterFromFormattedString");
    try {
      this.setCsrMinitFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrMinitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrMinitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrTitleFetch (boolean fetch) {
    this.CsrTitleFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrTitleFetch () {
    return this.CsrTitleFetch;
  }
  /** Set the SortOrder for field: CsrTitle (CSR_INFORMATION.csr_title)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrTitleSortOrder (Integer value) {
    this.CsrTitleSort = value;
  }
  /** Retrieve SortOrder for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrTitleSortOrder () {
    return this.CsrTitleSort;
  }
  /** Set the sort direction for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrTitleSortDirection (boolean ascending) {
    this.CsrTitleSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrTitleSortDirection () {
    return this.CsrTitleSortAscending;
  }
  /** Set the case insensitive for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrTitleCaseInsensitive (boolean ascending) {
    this.CsrTitleCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrTitleCaseInsensitive () {
    return this.CsrTitleCaseInsensitive;
  }
  /** Set the field level filters for field: CsrTitle (CSR_INFORMATION.csr_title)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrTitleFilter (StringFilter[] value) throws ServiceException {
    this.CsrTitle = value;
  }
  /** Retrieve filter for field: CsrTitle (CSR_INFORMATION.csr_title)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrTitleFilter () {
    return this.CsrTitle;
  }

  /**
   * Retrieves the CsrTitleFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrTitleFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrTitleFilter field
   */
  public String[] getCsrTitleFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrTitleFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrTitleFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrTitleFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrTitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrTitleFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrTitleFilter filter value from a formatted string
   *
   * @param _value the CsrTitleFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrTitleFilter filter field
   */
  public void setCsrTitleFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrTitleFilterFromFormattedString");
    try {
      this.setCsrTitleFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrTitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrTitleFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrTitleFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrPhoneFetch (boolean fetch) {
    this.CsrPhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrPhoneFetch () {
    return this.CsrPhoneFetch;
  }
  /** Set the SortOrder for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrPhoneSortOrder (Integer value) {
    this.CsrPhoneSort = value;
  }
  /** Retrieve SortOrder for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrPhoneSortOrder () {
    return this.CsrPhoneSort;
  }
  /** Set the sort direction for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrPhoneSortDirection (boolean ascending) {
    this.CsrPhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrPhoneSortDirection () {
    return this.CsrPhoneSortAscending;
  }
  /** Set the case insensitive for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrPhoneCaseInsensitive (boolean ascending) {
    this.CsrPhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrPhoneCaseInsensitive () {
    return this.CsrPhoneCaseInsensitive;
  }
  /** Set the field level filters for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrPhoneFilter (StringFilter[] value) throws ServiceException {
    this.CsrPhone = value;
  }
  /** Retrieve filter for field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrPhoneFilter () {
    return this.CsrPhone;
  }

  /**
   * Retrieves the CsrPhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrPhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrPhoneFilter field
   */
  public String[] getCsrPhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrPhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrPhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrPhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrPhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrPhoneFilter filter value from a formatted string
   *
   * @param _value the CsrPhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrPhoneFilter filter field
   */
  public void setCsrPhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrPhoneFilterFromFormattedString");
    try {
      this.setCsrPhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrPhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrPhoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrEmailFetch (boolean fetch) {
    this.CsrEmailFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrEmailFetch () {
    return this.CsrEmailFetch;
  }
  /** Set the SortOrder for field: CsrEmail (CSR_INFORMATION.csr_email)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrEmailSortOrder (Integer value) {
    this.CsrEmailSort = value;
  }
  /** Retrieve SortOrder for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrEmailSortOrder () {
    return this.CsrEmailSort;
  }
  /** Set the sort direction for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrEmailSortDirection (boolean ascending) {
    this.CsrEmailSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrEmailSortDirection () {
    return this.CsrEmailSortAscending;
  }
  /** Set the case insensitive for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrEmailCaseInsensitive (boolean ascending) {
    this.CsrEmailCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrEmailCaseInsensitive () {
    return this.CsrEmailCaseInsensitive;
  }
  /** Set the field level filters for field: CsrEmail (CSR_INFORMATION.csr_email)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrEmailFilter (StringFilter[] value) throws ServiceException {
    this.CsrEmail = value;
  }
  /** Retrieve filter for field: CsrEmail (CSR_INFORMATION.csr_email)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrEmailFilter () {
    return this.CsrEmail;
  }

  /**
   * Retrieves the CsrEmailFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrEmailFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrEmailFilter field
   */
  public String[] getCsrEmailFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrEmailFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrEmailFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrEmailFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrEmailFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrEmailFilter filter value from a formatted string
   *
   * @param _value the CsrEmailFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrEmailFilter filter field
   */
  public void setCsrEmailFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrEmailFilterFromFormattedString");
    try {
      this.setCsrEmailFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrEmailFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrEmailFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrAddress1Fetch (boolean fetch) {
    this.CsrAddress1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrAddress1Fetch () {
    return this.CsrAddress1Fetch;
  }
  /** Set the SortOrder for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrAddress1SortOrder (Integer value) {
    this.CsrAddress1Sort = value;
  }
  /** Retrieve SortOrder for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrAddress1SortOrder () {
    return this.CsrAddress1Sort;
  }
  /** Set the sort direction for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrAddress1SortDirection (boolean ascending) {
    this.CsrAddress1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrAddress1SortDirection () {
    return this.CsrAddress1SortAscending;
  }
  /** Set the case insensitive for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrAddress1CaseInsensitive (boolean ascending) {
    this.CsrAddress1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrAddress1CaseInsensitive () {
    return this.CsrAddress1CaseInsensitive;
  }
  /** Set the field level filters for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrAddress1Filter (StringFilter[] value) throws ServiceException {
    this.CsrAddress1 = value;
  }
  /** Retrieve filter for field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrAddress1Filter () {
    return this.CsrAddress1;
  }

  /**
   * Retrieves the CsrAddress1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrAddress1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrAddress1Filter field
   */
  public String[] getCsrAddress1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrAddress1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAddress1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrAddress1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrAddress1Filter filter value from a formatted string
   *
   * @param _value the CsrAddress1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrAddress1Filter filter field
   */
  public void setCsrAddress1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrAddress1FilterFromFormattedString");
    try {
      this.setCsrAddress1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrAddress1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrAddress1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrAddress2Fetch (boolean fetch) {
    this.CsrAddress2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrAddress2Fetch () {
    return this.CsrAddress2Fetch;
  }
  /** Set the SortOrder for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrAddress2SortOrder (Integer value) {
    this.CsrAddress2Sort = value;
  }
  /** Retrieve SortOrder for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrAddress2SortOrder () {
    return this.CsrAddress2Sort;
  }
  /** Set the sort direction for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrAddress2SortDirection (boolean ascending) {
    this.CsrAddress2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrAddress2SortDirection () {
    return this.CsrAddress2SortAscending;
  }
  /** Set the case insensitive for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrAddress2CaseInsensitive (boolean ascending) {
    this.CsrAddress2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrAddress2CaseInsensitive () {
    return this.CsrAddress2CaseInsensitive;
  }
  /** Set the field level filters for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrAddress2Filter (StringFilter[] value) throws ServiceException {
    this.CsrAddress2 = value;
  }
  /** Retrieve filter for field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrAddress2Filter () {
    return this.CsrAddress2;
  }

  /**
   * Retrieves the CsrAddress2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrAddress2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrAddress2Filter field
   */
  public String[] getCsrAddress2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrAddress2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAddress2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrAddress2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrAddress2Filter filter value from a formatted string
   *
   * @param _value the CsrAddress2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrAddress2Filter filter field
   */
  public void setCsrAddress2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrAddress2FilterFromFormattedString");
    try {
      this.setCsrAddress2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrAddress2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrAddress2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrAddress3Fetch (boolean fetch) {
    this.CsrAddress3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrAddress3Fetch () {
    return this.CsrAddress3Fetch;
  }
  /** Set the SortOrder for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrAddress3SortOrder (Integer value) {
    this.CsrAddress3Sort = value;
  }
  /** Retrieve SortOrder for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrAddress3SortOrder () {
    return this.CsrAddress3Sort;
  }
  /** Set the sort direction for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrAddress3SortDirection (boolean ascending) {
    this.CsrAddress3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrAddress3SortDirection () {
    return this.CsrAddress3SortAscending;
  }
  /** Set the case insensitive for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrAddress3CaseInsensitive (boolean ascending) {
    this.CsrAddress3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrAddress3CaseInsensitive () {
    return this.CsrAddress3CaseInsensitive;
  }
  /** Set the field level filters for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrAddress3Filter (StringFilter[] value) throws ServiceException {
    this.CsrAddress3 = value;
  }
  /** Retrieve filter for field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrAddress3Filter () {
    return this.CsrAddress3;
  }

  /**
   * Retrieves the CsrAddress3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrAddress3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrAddress3Filter field
   */
  public String[] getCsrAddress3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrAddress3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAddress3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrAddress3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrAddress3Filter filter value from a formatted string
   *
   * @param _value the CsrAddress3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrAddress3Filter filter field
   */
  public void setCsrAddress3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrAddress3FilterFromFormattedString");
    try {
      this.setCsrAddress3Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrAddress3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrAddress3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrCity (CSR_INFORMATION.csr_city)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrCityFetch (boolean fetch) {
    this.CsrCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrCity (CSR_INFORMATION.csr_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrCityFetch () {
    return this.CsrCityFetch;
  }
  /** Set the SortOrder for field: CsrCity (CSR_INFORMATION.csr_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrCitySortOrder (Integer value) {
    this.CsrCitySort = value;
  }
  /** Retrieve SortOrder for field: CsrCity (CSR_INFORMATION.csr_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrCitySortOrder () {
    return this.CsrCitySort;
  }
  /** Set the sort direction for field: CsrCity (CSR_INFORMATION.csr_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrCitySortDirection (boolean ascending) {
    this.CsrCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrCity (CSR_INFORMATION.csr_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrCitySortDirection () {
    return this.CsrCitySortAscending;
  }
  /** Set the case insensitive for field: CsrCity (CSR_INFORMATION.csr_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrCityCaseInsensitive (boolean ascending) {
    this.CsrCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrCity (CSR_INFORMATION.csr_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrCityCaseInsensitive () {
    return this.CsrCityCaseInsensitive;
  }
  /** Set the field level filters for field: CsrCity (CSR_INFORMATION.csr_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrCityFilter (StringFilter[] value) throws ServiceException {
    this.CsrCity = value;
  }
  /** Retrieve filter for field: CsrCity (CSR_INFORMATION.csr_city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrCityFilter () {
    return this.CsrCity;
  }

  /**
   * Retrieves the CsrCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrCityFilter field
   */
  public String[] getCsrCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrCityFilter filter value from a formatted string
   *
   * @param _value the CsrCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrCityFilter filter field
   */
  public void setCsrCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrCityFilterFromFormattedString");
    try {
      this.setCsrCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrState (CSR_INFORMATION.csr_state)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrStateFetch (boolean fetch) {
    this.CsrStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrState (CSR_INFORMATION.csr_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrStateFetch () {
    return this.CsrStateFetch;
  }
  /** Set the SortOrder for field: CsrState (CSR_INFORMATION.csr_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrStateSortOrder (Integer value) {
    this.CsrStateSort = value;
  }
  /** Retrieve SortOrder for field: CsrState (CSR_INFORMATION.csr_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrStateSortOrder () {
    return this.CsrStateSort;
  }
  /** Set the sort direction for field: CsrState (CSR_INFORMATION.csr_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrStateSortDirection (boolean ascending) {
    this.CsrStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrState (CSR_INFORMATION.csr_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrStateSortDirection () {
    return this.CsrStateSortAscending;
  }
  /** Set the case insensitive for field: CsrState (CSR_INFORMATION.csr_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrStateCaseInsensitive (boolean ascending) {
    this.CsrStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrState (CSR_INFORMATION.csr_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrStateCaseInsensitive () {
    return this.CsrStateCaseInsensitive;
  }
  /** Set the field level filters for field: CsrState (CSR_INFORMATION.csr_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrStateFilter (StringFilter[] value) throws ServiceException {
    this.CsrState = value;
  }
  /** Retrieve filter for field: CsrState (CSR_INFORMATION.csr_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrStateFilter () {
    return this.CsrState;
  }

  /**
   * Retrieves the CsrStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrStateFilter field
   */
  public String[] getCsrStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrStateFilter filter value from a formatted string
   *
   * @param _value the CsrStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrStateFilter filter field
   */
  public void setCsrStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrStateFilterFromFormattedString");
    try {
      this.setCsrStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrStateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrZipFetch (boolean fetch) {
    this.CsrZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrZipFetch () {
    return this.CsrZipFetch;
  }
  /** Set the SortOrder for field: CsrZip (CSR_INFORMATION.csr_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrZipSortOrder (Integer value) {
    this.CsrZipSort = value;
  }
  /** Retrieve SortOrder for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrZipSortOrder () {
    return this.CsrZipSort;
  }
  /** Set the sort direction for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrZipSortDirection (boolean ascending) {
    this.CsrZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrZipSortDirection () {
    return this.CsrZipSortAscending;
  }
  /** Set the case insensitive for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrZipCaseInsensitive (boolean ascending) {
    this.CsrZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrZipCaseInsensitive () {
    return this.CsrZipCaseInsensitive;
  }
  /** Set the field level filters for field: CsrZip (CSR_INFORMATION.csr_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrZipFilter (StringFilter[] value) throws ServiceException {
    this.CsrZip = value;
  }
  /** Retrieve filter for field: CsrZip (CSR_INFORMATION.csr_zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrZipFilter () {
    return this.CsrZip;
  }

  /**
   * Retrieves the CsrZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrZipFilter field
   */
  public String[] getCsrZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrZipFilter filter value from a formatted string
   *
   * @param _value the CsrZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrZipFilter filter field
   */
  public void setCsrZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrZipFilterFromFormattedString");
    try {
      this.setCsrZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrCountryCodeFetch (boolean fetch) {
    this.CsrCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrCountryCodeFetch () {
    return this.CsrCountryCodeFetch;
  }
  /** Set the SortOrder for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrCountryCodeSortOrder (Integer value) {
    this.CsrCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrCountryCodeSortOrder () {
    return this.CsrCountryCodeSort;
  }
  /** Set the sort direction for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrCountryCodeSortDirection (boolean ascending) {
    this.CsrCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrCountryCodeSortDirection () {
    return this.CsrCountryCodeSortAscending;
  }
  /** Set the field level filters for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CsrCountryCode = value;
  }
  /** Retrieve filter for field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCsrCountryCodeFilter () {
    return this.CsrCountryCode;
  }

  /**
   * Retrieves the CsrCountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrCountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrCountryCodeFilter field
   */
  public String[] getCsrCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrCountryCodeFilter filter value from a formatted string
   *
   * @param _value the CsrCountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrCountryCodeFilter filter field
   */
  public void setCsrCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrCountryCodeFilterFromFormattedString");
    try {
      this.setCsrCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrCountryCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrCountyFetch (boolean fetch) {
    this.CsrCountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrCountyFetch () {
    return this.CsrCountyFetch;
  }
  /** Set the SortOrder for field: CsrCounty (CSR_INFORMATION.csr_county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrCountySortOrder (Integer value) {
    this.CsrCountySort = value;
  }
  /** Retrieve SortOrder for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrCountySortOrder () {
    return this.CsrCountySort;
  }
  /** Set the sort direction for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrCountySortDirection (boolean ascending) {
    this.CsrCountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrCountySortDirection () {
    return this.CsrCountySortAscending;
  }
  /** Set the case insensitive for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrCountyCaseInsensitive (boolean ascending) {
    this.CsrCountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCsrCountyCaseInsensitive () {
    return this.CsrCountyCaseInsensitive;
  }
  /** Set the field level filters for field: CsrCounty (CSR_INFORMATION.csr_county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrCountyFilter (StringFilter[] value) throws ServiceException {
    this.CsrCounty = value;
  }
  /** Retrieve filter for field: CsrCounty (CSR_INFORMATION.csr_county)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrCountyFilter () {
    return this.CsrCounty;
  }

  /**
   * Retrieves the CsrCountyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CsrCountyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrCountyFilter field
   */
  public String[] getCsrCountyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCountyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCsrCountyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrCountyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrCountyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CsrCountyFilter filter value from a formatted string
   *
   * @param _value the CsrCountyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CsrCountyFilter filter field
   */
  public void setCsrCountyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCsrCountyFilterFromFormattedString");
    try {
      this.setCsrCountyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CsrCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrCountyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrCountyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DateActive (CSR_INFORMATION.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch) {
    this.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (CSR_INFORMATION.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch () {
    return this.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (CSR_INFORMATION.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value) {
    this.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (CSR_INFORMATION.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder () {
    return this.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (CSR_INFORMATION.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending) {
    this.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (CSR_INFORMATION.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection () {
    return this.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (CSR_INFORMATION.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (CSR_INFORMATION.date_active)
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


  /** Set the field level Fetch value for field: DateInactive (CSR_INFORMATION.date_inactive)
   * @param fetch whether to fetch this field or not
   */
  public void setDateInactiveFetch (boolean fetch) {
    this.DateInactiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateInactive (CSR_INFORMATION.date_inactive)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateInactiveFetch () {
    return this.DateInactiveFetch;
  }
  /** Set the SortOrder for field: DateInactive (CSR_INFORMATION.date_inactive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateInactiveSortOrder (Integer value) {
    this.DateInactiveSort = value;
  }
  /** Retrieve SortOrder for field: DateInactive (CSR_INFORMATION.date_inactive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateInactiveSortOrder () {
    return this.DateInactiveSort;
  }
  /** Set the sort direction for field: DateInactive (CSR_INFORMATION.date_inactive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateInactiveSortDirection (boolean ascending) {
    this.DateInactiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateInactive (CSR_INFORMATION.date_inactive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateInactiveSortDirection () {
    return this.DateInactiveSortAscending;
  }
  /** Set the field level filters for field: DateInactive (CSR_INFORMATION.date_inactive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateInactiveFilter (DateFilter[] value) throws ServiceException {
    this.DateInactive = value;
  }
  /** Retrieve filter for field: DateInactive (CSR_INFORMATION.date_inactive)
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


  /** Set the field level Fetch value for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  public String toString() {
    return CsrObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CsrObjectHelper.toMap(this, null);
  }
}
