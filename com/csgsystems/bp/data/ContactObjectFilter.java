/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContactObjectFilter.java
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
public class ContactObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ContactObjectKeyFilter Key = null;
  /** raw field for: CONTACTS.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: CONTACTS.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: CONTACTS.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: CONTACTS.name_prefix) */
  public    StringFilter[] NamePrefix  = null;
  protected boolean NamePrefixFetch = false;
  protected boolean NamePrefixSortAscending = true;
  protected boolean NamePrefixCaseInsensitive = false;
  protected Integer NamePrefixSort = null;
  /** raw field for: CONTACTS.first_name) */
  public    StringFilter[] FirstName  = null;
  protected boolean FirstNameFetch = false;
  protected boolean FirstNameSortAscending = true;
  protected boolean FirstNameCaseInsensitive = false;
  protected Integer FirstNameSort = null;
  /** raw field for: CONTACTS.middle_name) */
  public    StringFilter[] MiddleName  = null;
  protected boolean MiddleNameFetch = false;
  protected boolean MiddleNameSortAscending = true;
  protected boolean MiddleNameCaseInsensitive = false;
  protected Integer MiddleNameSort = null;
  /** raw field for: CONTACTS.last_name) */
  public    StringFilter[] LastName  = null;
  protected boolean LastNameFetch = false;
  protected boolean LastNameSortAscending = true;
  protected boolean LastNameCaseInsensitive = false;
  protected Integer LastNameSort = null;
  /** raw field for: CONTACTS.generation) */
  public    StringFilter[] Generation  = null;
  protected boolean GenerationFetch = false;
  protected boolean GenerationSortAscending = true;
  protected boolean GenerationCaseInsensitive = false;
  protected Integer GenerationSort = null;
  /** raw field for: CONTACTS.title) */
  public    StringFilter[] Title  = null;
  protected boolean TitleFetch = false;
  protected boolean TitleSortAscending = true;
  protected boolean TitleCaseInsensitive = false;
  protected Integer TitleSort = null;
  /** raw field for: CONTACTS.company) */
  public    StringFilter[] Company  = null;
  protected boolean CompanyFetch = false;
  protected boolean CompanySortAscending = true;
  protected boolean CompanyCaseInsensitive = false;
  protected Integer CompanySort = null;
  /** raw field for: CONTACTS.address_id) */
  public    BigIntegerFilter[] AddressId  = null;
  protected boolean AddressIdFetch = false;
  protected boolean AddressIdSortAscending = true;
  protected Integer AddressIdSort = null;
  /** raw field for: CONTACTS.alt_lname) */
  public    StringFilter[] AltLname  = null;
  protected boolean AltLnameFetch = false;
  protected boolean AltLnameSortAscending = true;
  protected boolean AltLnameCaseInsensitive = false;
  protected Integer AltLnameSort = null;
  /** raw field for: CONTACTS.alt_fname) */
  public    StringFilter[] AltFname  = null;
  protected boolean AltFnameFetch = false;
  protected boolean AltFnameSortAscending = true;
  protected boolean AltFnameCaseInsensitive = false;
  protected Integer AltFnameSort = null;
  /** raw field for: CONTACTS.alt_company) */
  public    StringFilter[] AltCompany  = null;
  protected boolean AltCompanyFetch = false;
  protected boolean AltCompanySortAscending = true;
  protected boolean AltCompanyCaseInsensitive = false;
  protected Integer AltCompanySort = null;
  /** raw field for: CONTACTS.gender) */
  public    IntegerFilter[] Gender  = null;
  protected boolean GenderFetch = false;
  protected boolean GenderSortAscending = true;
  protected Integer GenderSort = null;
  /** raw field for: CONTACTS.dept) */
  public    StringFilter[] Dept  = null;
  protected boolean DeptFetch = false;
  protected boolean DeptSortAscending = true;
  protected boolean DeptCaseInsensitive = false;
  protected Integer DeptSort = null;
  /** raw field for: ADDRESS.date_active) */
  public    DateFilter[] DateActive  = null;
  protected boolean DateActiveFetch = false;
  protected boolean DateActiveSortAscending = true;
  protected Integer DateActiveSort = null;
  /** raw field for: ADDRESS.date_inactive) */
  public    DateFilter[] DateInactive  = null;
  protected boolean DateInactiveFetch = false;
  protected boolean DateInactiveSortAscending = true;
  protected Integer DateInactiveSort = null;
  /** raw field for: ADDRESS.address_line1) */
  public    StringFilter[] AddressLine1  = null;
  protected boolean AddressLine1Fetch = false;
  protected boolean AddressLine1SortAscending = true;
  protected boolean AddressLine1CaseInsensitive = false;
  protected Integer AddressLine1Sort = null;
  /** raw field for: ADDRESS.address_line2) */
  public    StringFilter[] AddressLine2  = null;
  protected boolean AddressLine2Fetch = false;
  protected boolean AddressLine2SortAscending = true;
  protected boolean AddressLine2CaseInsensitive = false;
  protected Integer AddressLine2Sort = null;
  /** raw field for: ADDRESS.address_line3) */
  public    StringFilter[] AddressLine3  = null;
  protected boolean AddressLine3Fetch = false;
  protected boolean AddressLine3SortAscending = true;
  protected boolean AddressLine3CaseInsensitive = false;
  protected Integer AddressLine3Sort = null;
  /** raw field for: ADDRESS.address_line4) */
  public    StringFilter[] AddressLine4  = null;
  protected boolean AddressLine4Fetch = false;
  protected boolean AddressLine4SortAscending = true;
  protected boolean AddressLine4CaseInsensitive = false;
  protected Integer AddressLine4Sort = null;
  /** raw field for: ADDRESS.city) */
  public    StringFilter[] City  = null;
  protected boolean CityFetch = false;
  protected boolean CitySortAscending = true;
  protected boolean CityCaseInsensitive = false;
  protected Integer CitySort = null;
  /** raw field for: ADDRESS.state) */
  public    StringFilter[] State  = null;
  protected boolean StateFetch = false;
  protected boolean StateSortAscending = true;
  protected boolean StateCaseInsensitive = false;
  protected Integer StateSort = null;
  /** raw field for: ADDRESS.postal_code) */
  public    StringFilter[] PostalCode  = null;
  protected boolean PostalCodeFetch = false;
  protected boolean PostalCodeSortAscending = true;
  protected boolean PostalCodeCaseInsensitive = false;
  protected Integer PostalCodeSort = null;
  /** raw field for: ADDRESS.country_code) */
  public    IntegerFilter[] CountryCode  = null;
  protected boolean CountryCodeFetch = false;
  protected boolean CountryCodeSortAscending = true;
  protected Integer CountryCodeSort = null;
  /** raw field for: ADDRESS.franchise_tax_code) */
  public    IntegerFilter[] FranchiseTaxCode  = null;
  protected boolean FranchiseTaxCodeFetch = false;
  protected boolean FranchiseTaxCodeSortAscending = true;
  protected Integer FranchiseTaxCodeSort = null;
  /** raw field for: ADDRESS.geocode) */
  public    StringFilter[] Geocode  = null;
  protected boolean GeocodeFetch = false;
  protected boolean GeocodeSortAscending = true;
  protected boolean GeocodeCaseInsensitive = false;
  protected Integer GeocodeSort = null;
  /** raw field for: ADDRESS.county) */
  public    StringFilter[] County  = null;
  protected boolean CountyFetch = false;
  protected boolean CountySortAscending = true;
  protected boolean CountyCaseInsensitive = false;
  protected Integer CountySort = null;
  private String _objName = "ContactObjectFilter";
  /** default constructor */
  public ContactObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ContactObjectFilter (ContactObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ContactObjectKeyFilter (other.Key);
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.NamePrefix = other.NamePrefix;
    this.NamePrefixFetch = other.NamePrefixFetch;
    this.NamePrefixSort = other.NamePrefixSort;
    this.NamePrefixCaseInsensitive = other.NamePrefixCaseInsensitive;
    this.NamePrefixSortAscending = other.NamePrefixSortAscending;
    this.FirstName = other.FirstName;
    this.FirstNameFetch = other.FirstNameFetch;
    this.FirstNameSort = other.FirstNameSort;
    this.FirstNameCaseInsensitive = other.FirstNameCaseInsensitive;
    this.FirstNameSortAscending = other.FirstNameSortAscending;
    this.MiddleName = other.MiddleName;
    this.MiddleNameFetch = other.MiddleNameFetch;
    this.MiddleNameSort = other.MiddleNameSort;
    this.MiddleNameCaseInsensitive = other.MiddleNameCaseInsensitive;
    this.MiddleNameSortAscending = other.MiddleNameSortAscending;
    this.LastName = other.LastName;
    this.LastNameFetch = other.LastNameFetch;
    this.LastNameSort = other.LastNameSort;
    this.LastNameCaseInsensitive = other.LastNameCaseInsensitive;
    this.LastNameSortAscending = other.LastNameSortAscending;
    this.Generation = other.Generation;
    this.GenerationFetch = other.GenerationFetch;
    this.GenerationSort = other.GenerationSort;
    this.GenerationCaseInsensitive = other.GenerationCaseInsensitive;
    this.GenerationSortAscending = other.GenerationSortAscending;
    this.Title = other.Title;
    this.TitleFetch = other.TitleFetch;
    this.TitleSort = other.TitleSort;
    this.TitleCaseInsensitive = other.TitleCaseInsensitive;
    this.TitleSortAscending = other.TitleSortAscending;
    this.Company = other.Company;
    this.CompanyFetch = other.CompanyFetch;
    this.CompanySort = other.CompanySort;
    this.CompanyCaseInsensitive = other.CompanyCaseInsensitive;
    this.CompanySortAscending = other.CompanySortAscending;
    this.AddressId = other.AddressId;
    this.AddressIdFetch = other.AddressIdFetch;
    this.AddressIdSort = other.AddressIdSort;
    this.AddressIdSortAscending = other.AddressIdSortAscending;
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
    this.AltCompany = other.AltCompany;
    this.AltCompanyFetch = other.AltCompanyFetch;
    this.AltCompanySort = other.AltCompanySort;
    this.AltCompanyCaseInsensitive = other.AltCompanyCaseInsensitive;
    this.AltCompanySortAscending = other.AltCompanySortAscending;
    this.Gender = other.Gender;
    this.GenderFetch = other.GenderFetch;
    this.GenderSort = other.GenderSort;
    this.GenderSortAscending = other.GenderSortAscending;
    this.Dept = other.Dept;
    this.DeptFetch = other.DeptFetch;
    this.DeptSort = other.DeptSort;
    this.DeptCaseInsensitive = other.DeptCaseInsensitive;
    this.DeptSortAscending = other.DeptSortAscending;
    this.DateActive = other.DateActive;
    this.DateActiveFetch = other.DateActiveFetch;
    this.DateActiveSort = other.DateActiveSort;
    this.DateActiveSortAscending = other.DateActiveSortAscending;
    this.DateInactive = other.DateInactive;
    this.DateInactiveFetch = other.DateInactiveFetch;
    this.DateInactiveSort = other.DateInactiveSort;
    this.DateInactiveSortAscending = other.DateInactiveSortAscending;
    this.AddressLine1 = other.AddressLine1;
    this.AddressLine1Fetch = other.AddressLine1Fetch;
    this.AddressLine1Sort = other.AddressLine1Sort;
    this.AddressLine1CaseInsensitive = other.AddressLine1CaseInsensitive;
    this.AddressLine1SortAscending = other.AddressLine1SortAscending;
    this.AddressLine2 = other.AddressLine2;
    this.AddressLine2Fetch = other.AddressLine2Fetch;
    this.AddressLine2Sort = other.AddressLine2Sort;
    this.AddressLine2CaseInsensitive = other.AddressLine2CaseInsensitive;
    this.AddressLine2SortAscending = other.AddressLine2SortAscending;
    this.AddressLine3 = other.AddressLine3;
    this.AddressLine3Fetch = other.AddressLine3Fetch;
    this.AddressLine3Sort = other.AddressLine3Sort;
    this.AddressLine3CaseInsensitive = other.AddressLine3CaseInsensitive;
    this.AddressLine3SortAscending = other.AddressLine3SortAscending;
    this.AddressLine4 = other.AddressLine4;
    this.AddressLine4Fetch = other.AddressLine4Fetch;
    this.AddressLine4Sort = other.AddressLine4Sort;
    this.AddressLine4CaseInsensitive = other.AddressLine4CaseInsensitive;
    this.AddressLine4SortAscending = other.AddressLine4SortAscending;
    this.City = other.City;
    this.CityFetch = other.CityFetch;
    this.CitySort = other.CitySort;
    this.CityCaseInsensitive = other.CityCaseInsensitive;
    this.CitySortAscending = other.CitySortAscending;
    this.State = other.State;
    this.StateFetch = other.StateFetch;
    this.StateSort = other.StateSort;
    this.StateCaseInsensitive = other.StateCaseInsensitive;
    this.StateSortAscending = other.StateSortAscending;
    this.PostalCode = other.PostalCode;
    this.PostalCodeFetch = other.PostalCodeFetch;
    this.PostalCodeSort = other.PostalCodeSort;
    this.PostalCodeCaseInsensitive = other.PostalCodeCaseInsensitive;
    this.PostalCodeSortAscending = other.PostalCodeSortAscending;
    this.CountryCode = other.CountryCode;
    this.CountryCodeFetch = other.CountryCodeFetch;
    this.CountryCodeSort = other.CountryCodeSort;
    this.CountryCodeSortAscending = other.CountryCodeSortAscending;
    this.FranchiseTaxCode = other.FranchiseTaxCode;
    this.FranchiseTaxCodeFetch = other.FranchiseTaxCodeFetch;
    this.FranchiseTaxCodeSort = other.FranchiseTaxCodeSort;
    this.FranchiseTaxCodeSortAscending = other.FranchiseTaxCodeSortAscending;
    this.Geocode = other.Geocode;
    this.GeocodeFetch = other.GeocodeFetch;
    this.GeocodeSort = other.GeocodeSort;
    this.GeocodeCaseInsensitive = other.GeocodeCaseInsensitive;
    this.GeocodeSortAscending = other.GeocodeSortAscending;
    this.County = other.County;
    this.CountyFetch = other.CountyFetch;
    this.CountySort = other.CountySort;
    this.CountyCaseInsensitive = other.CountyCaseInsensitive;
    this.CountySortAscending = other.CountySortAscending;  }
  /** get the filter for this object's key
   * @return ContactObjectKeyFilter
   */
  public ContactObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ContactObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ContactId (CONTACTS.contact_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContactIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ContactObjectKeyFilter ();
    this.Key.ContactIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContactId (CONTACTS.contact_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContactIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ContactIdFetch;
  }
  /** Set the SortOrder for field: ContactId (CONTACTS.contact_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContactIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ContactObjectKeyFilter ();
    this.Key.ContactIdSort = value;
  }
  /** Retrieve SortOrder for field: ContactId (CONTACTS.contact_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContactIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ContactIdSort;
  }
  /** Set the sort direction for field: ContactId (CONTACTS.contact_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContactIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ContactObjectKeyFilter ();
    this.Key.ContactIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContactId (CONTACTS.contact_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContactIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ContactIdSortAscending;
  }
  /** Set the field level filters for field: ContactId (CONTACTS.contact_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContactIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ContactObjectKeyFilter ();
    this.Key.ContactId = value;
  }
  /** Retrieve filter for field: ContactId (CONTACTS.contact_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContactIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ContactId;
  }
  /** Set the field level Fetch value for field: CreateDt (CONTACTS.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (CONTACTS.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (CONTACTS.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (CONTACTS.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (CONTACTS.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (CONTACTS.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (CONTACTS.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (CONTACTS.create_dt)
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


  /** Set the field level Fetch value for field: ChgDt (CONTACTS.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (CONTACTS.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (CONTACTS.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (CONTACTS.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (CONTACTS.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (CONTACTS.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (CONTACTS.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (CONTACTS.chg_dt)
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


  /** Set the field level Fetch value for field: ChgWho (CONTACTS.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (CONTACTS.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (CONTACTS.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (CONTACTS.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (CONTACTS.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (CONTACTS.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (CONTACTS.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (CONTACTS.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (CONTACTS.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (CONTACTS.chg_who)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getChgWhoFilter () {
    return this.ChgWho;
  }

  /**
   * Retrieves the ChgWhoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgWhoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWhoFilter field
   */
  public String[] getChgWhoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgWhoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgWhoFilter filter value from a formatted string
   *
   * @param _value the ChgWhoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgWhoFilter filter field
   */
  public void setChgWhoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgWhoFilterFromFormattedString");
    try {
      this.setChgWhoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NamePrefix (CONTACTS.name_prefix)
   * @param fetch whether to fetch this field or not
   */
  public void setNamePrefixFetch (boolean fetch) {
    this.NamePrefixFetch = fetch;
  }
  /** Retrieve Fetch value for field: NamePrefix (CONTACTS.name_prefix)
   * @return boolean the Fetch value for this field
   */
  public boolean getNamePrefixFetch () {
    return this.NamePrefixFetch;
  }
  /** Set the SortOrder for field: NamePrefix (CONTACTS.name_prefix)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNamePrefixSortOrder (Integer value) {
    this.NamePrefixSort = value;
  }
  /** Retrieve SortOrder for field: NamePrefix (CONTACTS.name_prefix)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNamePrefixSortOrder () {
    return this.NamePrefixSort;
  }
  /** Set the sort direction for field: NamePrefix (CONTACTS.name_prefix)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNamePrefixSortDirection (boolean ascending) {
    this.NamePrefixSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NamePrefix (CONTACTS.name_prefix)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNamePrefixSortDirection () {
    return this.NamePrefixSortAscending;
  }
  /** Set the case insensitive for field: NamePrefix (CONTACTS.name_prefix)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setNamePrefixCaseInsensitive (boolean ascending) {
    this.NamePrefixCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: NamePrefix (CONTACTS.name_prefix)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getNamePrefixCaseInsensitive () {
    return this.NamePrefixCaseInsensitive;
  }
  /** Set the field level filters for field: NamePrefix (CONTACTS.name_prefix)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNamePrefixFilter (StringFilter[] value) throws ServiceException {
    this.NamePrefix = value;
  }
  /** Retrieve filter for field: NamePrefix (CONTACTS.name_prefix)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getNamePrefixFilter () {
    return this.NamePrefix;
  }

  /**
   * Retrieves the NamePrefixFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NamePrefixFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NamePrefixFilter field
   */
  public String[] getNamePrefixFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamePrefixFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNamePrefixFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNamePrefixFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NamePrefixFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNamePrefixFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NamePrefixFilter filter value from a formatted string
   *
   * @param _value the NamePrefixFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NamePrefixFilter filter field
   */
  public void setNamePrefixFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNamePrefixFilterFromFormattedString");
    try {
      this.setNamePrefixFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NamePrefixFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNamePrefixFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNamePrefixFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FirstName (CONTACTS.first_name)
   * @param fetch whether to fetch this field or not
   */
  public void setFirstNameFetch (boolean fetch) {
    this.FirstNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: FirstName (CONTACTS.first_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getFirstNameFetch () {
    return this.FirstNameFetch;
  }
  /** Set the SortOrder for field: FirstName (CONTACTS.first_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFirstNameSortOrder (Integer value) {
    this.FirstNameSort = value;
  }
  /** Retrieve SortOrder for field: FirstName (CONTACTS.first_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFirstNameSortOrder () {
    return this.FirstNameSort;
  }
  /** Set the sort direction for field: FirstName (CONTACTS.first_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFirstNameSortDirection (boolean ascending) {
    this.FirstNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FirstName (CONTACTS.first_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFirstNameSortDirection () {
    return this.FirstNameSortAscending;
  }
  /** Set the case insensitive for field: FirstName (CONTACTS.first_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFirstNameCaseInsensitive (boolean ascending) {
    this.FirstNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FirstName (CONTACTS.first_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFirstNameCaseInsensitive () {
    return this.FirstNameCaseInsensitive;
  }
  /** Set the field level filters for field: FirstName (CONTACTS.first_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFirstNameFilter (StringFilter[] value) throws ServiceException {
    this.FirstName = value;
  }
  /** Retrieve filter for field: FirstName (CONTACTS.first_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFirstNameFilter () {
    return this.FirstName;
  }

  /**
   * Retrieves the FirstNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FirstNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FirstNameFilter field
   */
  public String[] getFirstNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFirstNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFirstNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFirstNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FirstNameFilter filter value from a formatted string
   *
   * @param _value the FirstNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FirstNameFilter filter field
   */
  public void setFirstNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFirstNameFilterFromFormattedString");
    try {
      this.setFirstNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFirstNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFirstNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MiddleName (CONTACTS.middle_name)
   * @param fetch whether to fetch this field or not
   */
  public void setMiddleNameFetch (boolean fetch) {
    this.MiddleNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: MiddleName (CONTACTS.middle_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getMiddleNameFetch () {
    return this.MiddleNameFetch;
  }
  /** Set the SortOrder for field: MiddleName (CONTACTS.middle_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMiddleNameSortOrder (Integer value) {
    this.MiddleNameSort = value;
  }
  /** Retrieve SortOrder for field: MiddleName (CONTACTS.middle_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMiddleNameSortOrder () {
    return this.MiddleNameSort;
  }
  /** Set the sort direction for field: MiddleName (CONTACTS.middle_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMiddleNameSortDirection (boolean ascending) {
    this.MiddleNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MiddleName (CONTACTS.middle_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMiddleNameSortDirection () {
    return this.MiddleNameSortAscending;
  }
  /** Set the case insensitive for field: MiddleName (CONTACTS.middle_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMiddleNameCaseInsensitive (boolean ascending) {
    this.MiddleNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MiddleName (CONTACTS.middle_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMiddleNameCaseInsensitive () {
    return this.MiddleNameCaseInsensitive;
  }
  /** Set the field level filters for field: MiddleName (CONTACTS.middle_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMiddleNameFilter (StringFilter[] value) throws ServiceException {
    this.MiddleName = value;
  }
  /** Retrieve filter for field: MiddleName (CONTACTS.middle_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMiddleNameFilter () {
    return this.MiddleName;
  }

  /**
   * Retrieves the MiddleNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MiddleNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiddleNameFilter field
   */
  public String[] getMiddleNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiddleNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMiddleNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiddleNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiddleNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiddleNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MiddleNameFilter filter value from a formatted string
   *
   * @param _value the MiddleNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MiddleNameFilter filter field
   */
  public void setMiddleNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMiddleNameFilterFromFormattedString");
    try {
      this.setMiddleNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiddleNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiddleNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiddleNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LastName (CONTACTS.last_name)
   * @param fetch whether to fetch this field or not
   */
  public void setLastNameFetch (boolean fetch) {
    this.LastNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: LastName (CONTACTS.last_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getLastNameFetch () {
    return this.LastNameFetch;
  }
  /** Set the SortOrder for field: LastName (CONTACTS.last_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLastNameSortOrder (Integer value) {
    this.LastNameSort = value;
  }
  /** Retrieve SortOrder for field: LastName (CONTACTS.last_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLastNameSortOrder () {
    return this.LastNameSort;
  }
  /** Set the sort direction for field: LastName (CONTACTS.last_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLastNameSortDirection (boolean ascending) {
    this.LastNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LastName (CONTACTS.last_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLastNameSortDirection () {
    return this.LastNameSortAscending;
  }
  /** Set the case insensitive for field: LastName (CONTACTS.last_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setLastNameCaseInsensitive (boolean ascending) {
    this.LastNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: LastName (CONTACTS.last_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getLastNameCaseInsensitive () {
    return this.LastNameCaseInsensitive;
  }
  /** Set the field level filters for field: LastName (CONTACTS.last_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLastNameFilter (StringFilter[] value) throws ServiceException {
    this.LastName = value;
  }
  /** Retrieve filter for field: LastName (CONTACTS.last_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getLastNameFilter () {
    return this.LastName;
  }

  /**
   * Retrieves the LastNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LastNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastNameFilter field
   */
  public String[] getLastNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLastNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LastNameFilter filter value from a formatted string
   *
   * @param _value the LastNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LastNameFilter filter field
   */
  public void setLastNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLastNameFilterFromFormattedString");
    try {
      this.setLastNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Generation (CONTACTS.generation)
   * @param fetch whether to fetch this field or not
   */
  public void setGenerationFetch (boolean fetch) {
    this.GenerationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Generation (CONTACTS.generation)
   * @return boolean the Fetch value for this field
   */
  public boolean getGenerationFetch () {
    return this.GenerationFetch;
  }
  /** Set the SortOrder for field: Generation (CONTACTS.generation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGenerationSortOrder (Integer value) {
    this.GenerationSort = value;
  }
  /** Retrieve SortOrder for field: Generation (CONTACTS.generation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGenerationSortOrder () {
    return this.GenerationSort;
  }
  /** Set the sort direction for field: Generation (CONTACTS.generation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGenerationSortDirection (boolean ascending) {
    this.GenerationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Generation (CONTACTS.generation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGenerationSortDirection () {
    return this.GenerationSortAscending;
  }
  /** Set the case insensitive for field: Generation (CONTACTS.generation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGenerationCaseInsensitive (boolean ascending) {
    this.GenerationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Generation (CONTACTS.generation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGenerationCaseInsensitive () {
    return this.GenerationCaseInsensitive;
  }
  /** Set the field level filters for field: Generation (CONTACTS.generation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGenerationFilter (StringFilter[] value) throws ServiceException {
    this.Generation = value;
  }
  /** Retrieve filter for field: Generation (CONTACTS.generation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGenerationFilter () {
    return this.Generation;
  }

  /**
   * Retrieves the GenerationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GenerationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GenerationFilter field
   */
  public String[] getGenerationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenerationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGenerationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGenerationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GenerationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGenerationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GenerationFilter filter value from a formatted string
   *
   * @param _value the GenerationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GenerationFilter filter field
   */
  public void setGenerationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGenerationFilterFromFormattedString");
    try {
      this.setGenerationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GenerationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGenerationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGenerationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Title (CONTACTS.title)
   * @param fetch whether to fetch this field or not
   */
  public void setTitleFetch (boolean fetch) {
    this.TitleFetch = fetch;
  }
  /** Retrieve Fetch value for field: Title (CONTACTS.title)
   * @return boolean the Fetch value for this field
   */
  public boolean getTitleFetch () {
    return this.TitleFetch;
  }
  /** Set the SortOrder for field: Title (CONTACTS.title)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTitleSortOrder (Integer value) {
    this.TitleSort = value;
  }
  /** Retrieve SortOrder for field: Title (CONTACTS.title)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTitleSortOrder () {
    return this.TitleSort;
  }
  /** Set the sort direction for field: Title (CONTACTS.title)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTitleSortDirection (boolean ascending) {
    this.TitleSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Title (CONTACTS.title)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTitleSortDirection () {
    return this.TitleSortAscending;
  }
  /** Set the case insensitive for field: Title (CONTACTS.title)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTitleCaseInsensitive (boolean ascending) {
    this.TitleCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Title (CONTACTS.title)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTitleCaseInsensitive () {
    return this.TitleCaseInsensitive;
  }
  /** Set the field level filters for field: Title (CONTACTS.title)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTitleFilter (StringFilter[] value) throws ServiceException {
    this.Title = value;
  }
  /** Retrieve filter for field: Title (CONTACTS.title)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTitleFilter () {
    return this.Title;
  }

  /**
   * Retrieves the TitleFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TitleFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TitleFilter field
   */
  public String[] getTitleFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTitleFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTitleFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTitleFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTitleFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TitleFilter filter value from a formatted string
   *
   * @param _value the TitleFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TitleFilter filter field
   */
  public void setTitleFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTitleFilterFromFormattedString");
    try {
      this.setTitleFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTitleFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTitleFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Company (CONTACTS.company)
   * @param fetch whether to fetch this field or not
   */
  public void setCompanyFetch (boolean fetch) {
    this.CompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: Company (CONTACTS.company)
   * @return boolean the Fetch value for this field
   */
  public boolean getCompanyFetch () {
    return this.CompanyFetch;
  }
  /** Set the SortOrder for field: Company (CONTACTS.company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCompanySortOrder (Integer value) {
    this.CompanySort = value;
  }
  /** Retrieve SortOrder for field: Company (CONTACTS.company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCompanySortOrder () {
    return this.CompanySort;
  }
  /** Set the sort direction for field: Company (CONTACTS.company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCompanySortDirection (boolean ascending) {
    this.CompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Company (CONTACTS.company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCompanySortDirection () {
    return this.CompanySortAscending;
  }
  /** Set the case insensitive for field: Company (CONTACTS.company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCompanyCaseInsensitive (boolean ascending) {
    this.CompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Company (CONTACTS.company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCompanyCaseInsensitive () {
    return this.CompanyCaseInsensitive;
  }
  /** Set the field level filters for field: Company (CONTACTS.company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCompanyFilter (StringFilter[] value) throws ServiceException {
    this.Company = value;
  }
  /** Retrieve filter for field: Company (CONTACTS.company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCompanyFilter () {
    return this.Company;
  }

  /**
   * Retrieves the CompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CompanyFilter field
   */
  public String[] getCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CompanyFilter filter value from a formatted string
   *
   * @param _value the CompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CompanyFilter filter field
   */
  public void setCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCompanyFilterFromFormattedString");
    try {
      this.setCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddressId (CONTACTS.address_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressIdFetch (boolean fetch) {
    this.AddressIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressId (CONTACTS.address_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressIdFetch () {
    return this.AddressIdFetch;
  }
  /** Set the SortOrder for field: AddressId (CONTACTS.address_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressIdSortOrder (Integer value) {
    this.AddressIdSort = value;
  }
  /** Retrieve SortOrder for field: AddressId (CONTACTS.address_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressIdSortOrder () {
    return this.AddressIdSort;
  }
  /** Set the sort direction for field: AddressId (CONTACTS.address_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressIdSortDirection (boolean ascending) {
    this.AddressIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressId (CONTACTS.address_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressIdSortDirection () {
    return this.AddressIdSortAscending;
  }
  /** Set the field level filters for field: AddressId (CONTACTS.address_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AddressId = value;
  }
  /** Retrieve filter for field: AddressId (CONTACTS.address_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAddressIdFilter () {
    return this.AddressId;
  }

  /**
   * Retrieves the AddressIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressIdFilter field
   */
  public String[] getAddressIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressIdFilter filter value from a formatted string
   *
   * @param _value the AddressIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressIdFilter filter field
   */
  public void setAddressIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressIdFilterFromFormattedString");
    try {
      this.setAddressIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltLname (CONTACTS.alt_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setAltLnameFetch (boolean fetch) {
    this.AltLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltLname (CONTACTS.alt_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltLnameFetch () {
    return this.AltLnameFetch;
  }
  /** Set the SortOrder for field: AltLname (CONTACTS.alt_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltLnameSortOrder (Integer value) {
    this.AltLnameSort = value;
  }
  /** Retrieve SortOrder for field: AltLname (CONTACTS.alt_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltLnameSortOrder () {
    return this.AltLnameSort;
  }
  /** Set the sort direction for field: AltLname (CONTACTS.alt_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltLnameSortDirection (boolean ascending) {
    this.AltLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltLname (CONTACTS.alt_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltLnameSortDirection () {
    return this.AltLnameSortAscending;
  }
  /** Set the case insensitive for field: AltLname (CONTACTS.alt_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltLnameCaseInsensitive (boolean ascending) {
    this.AltLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltLname (CONTACTS.alt_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltLnameCaseInsensitive () {
    return this.AltLnameCaseInsensitive;
  }
  /** Set the field level filters for field: AltLname (CONTACTS.alt_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltLnameFilter (StringFilter[] value) throws ServiceException {
    this.AltLname = value;
  }
  /** Retrieve filter for field: AltLname (CONTACTS.alt_lname)
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

  /** Set the field level Fetch value for field: AltFname (CONTACTS.alt_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setAltFnameFetch (boolean fetch) {
    this.AltFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltFname (CONTACTS.alt_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltFnameFetch () {
    return this.AltFnameFetch;
  }
  /** Set the SortOrder for field: AltFname (CONTACTS.alt_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltFnameSortOrder (Integer value) {
    this.AltFnameSort = value;
  }
  /** Retrieve SortOrder for field: AltFname (CONTACTS.alt_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltFnameSortOrder () {
    return this.AltFnameSort;
  }
  /** Set the sort direction for field: AltFname (CONTACTS.alt_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltFnameSortDirection (boolean ascending) {
    this.AltFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltFname (CONTACTS.alt_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltFnameSortDirection () {
    return this.AltFnameSortAscending;
  }
  /** Set the case insensitive for field: AltFname (CONTACTS.alt_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltFnameCaseInsensitive (boolean ascending) {
    this.AltFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltFname (CONTACTS.alt_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltFnameCaseInsensitive () {
    return this.AltFnameCaseInsensitive;
  }
  /** Set the field level filters for field: AltFname (CONTACTS.alt_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltFnameFilter (StringFilter[] value) throws ServiceException {
    this.AltFname = value;
  }
  /** Retrieve filter for field: AltFname (CONTACTS.alt_fname)
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

  /** Set the field level Fetch value for field: AltCompany (CONTACTS.alt_company)
   * @param fetch whether to fetch this field or not
   */
  public void setAltCompanyFetch (boolean fetch) {
    this.AltCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltCompany (CONTACTS.alt_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltCompanyFetch () {
    return this.AltCompanyFetch;
  }
  /** Set the SortOrder for field: AltCompany (CONTACTS.alt_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltCompanySortOrder (Integer value) {
    this.AltCompanySort = value;
  }
  /** Retrieve SortOrder for field: AltCompany (CONTACTS.alt_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltCompanySortOrder () {
    return this.AltCompanySort;
  }
  /** Set the sort direction for field: AltCompany (CONTACTS.alt_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltCompanySortDirection (boolean ascending) {
    this.AltCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltCompany (CONTACTS.alt_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltCompanySortDirection () {
    return this.AltCompanySortAscending;
  }
  /** Set the case insensitive for field: AltCompany (CONTACTS.alt_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltCompanyCaseInsensitive (boolean ascending) {
    this.AltCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltCompany (CONTACTS.alt_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltCompanyCaseInsensitive () {
    return this.AltCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: AltCompany (CONTACTS.alt_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltCompanyFilter (StringFilter[] value) throws ServiceException {
    this.AltCompany = value;
  }
  /** Retrieve filter for field: AltCompany (CONTACTS.alt_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltCompanyFilter () {
    return this.AltCompany;
  }

  /**
   * Retrieves the AltCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCompanyFilter field
   */
  public String[] getAltCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltCompanyFilter filter value from a formatted string
   *
   * @param _value the AltCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltCompanyFilter filter field
   */
  public void setAltCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltCompanyFilterFromFormattedString");
    try {
      this.setAltCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Gender (CONTACTS.gender)
   * @param fetch whether to fetch this field or not
   */
  public void setGenderFetch (boolean fetch) {
    this.GenderFetch = fetch;
  }
  /** Retrieve Fetch value for field: Gender (CONTACTS.gender)
   * @return boolean the Fetch value for this field
   */
  public boolean getGenderFetch () {
    return this.GenderFetch;
  }
  /** Set the SortOrder for field: Gender (CONTACTS.gender)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGenderSortOrder (Integer value) {
    this.GenderSort = value;
  }
  /** Retrieve SortOrder for field: Gender (CONTACTS.gender)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGenderSortOrder () {
    return this.GenderSort;
  }
  /** Set the sort direction for field: Gender (CONTACTS.gender)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGenderSortDirection (boolean ascending) {
    this.GenderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Gender (CONTACTS.gender)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGenderSortDirection () {
    return this.GenderSortAscending;
  }
  /** Set the field level filters for field: Gender (CONTACTS.gender)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGenderFilter (IntegerFilter[] value) throws ServiceException {
    this.Gender = value;
  }
  /** Retrieve filter for field: Gender (CONTACTS.gender)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGenderFilter () {
    return this.Gender;
  }

  /**
   * Retrieves the GenderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GenderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GenderFilter field
   */
  public String[] getGenderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGenderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GenderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGenderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GenderFilter filter value from a formatted string
   *
   * @param _value the GenderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GenderFilter filter field
   */
  public void setGenderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGenderFilterFromFormattedString");
    try {
      this.setGenderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GenderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGenderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGenderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Dept (CONTACTS.dept)
   * @param fetch whether to fetch this field or not
   */
  public void setDeptFetch (boolean fetch) {
    this.DeptFetch = fetch;
  }
  /** Retrieve Fetch value for field: Dept (CONTACTS.dept)
   * @return boolean the Fetch value for this field
   */
  public boolean getDeptFetch () {
    return this.DeptFetch;
  }
  /** Set the SortOrder for field: Dept (CONTACTS.dept)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDeptSortOrder (Integer value) {
    this.DeptSort = value;
  }
  /** Retrieve SortOrder for field: Dept (CONTACTS.dept)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDeptSortOrder () {
    return this.DeptSort;
  }
  /** Set the sort direction for field: Dept (CONTACTS.dept)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDeptSortDirection (boolean ascending) {
    this.DeptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Dept (CONTACTS.dept)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDeptSortDirection () {
    return this.DeptSortAscending;
  }
  /** Set the case insensitive for field: Dept (CONTACTS.dept)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDeptCaseInsensitive (boolean ascending) {
    this.DeptCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Dept (CONTACTS.dept)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDeptCaseInsensitive () {
    return this.DeptCaseInsensitive;
  }
  /** Set the field level filters for field: Dept (CONTACTS.dept)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDeptFilter (StringFilter[] value) throws ServiceException {
    this.Dept = value;
  }
  /** Retrieve filter for field: Dept (CONTACTS.dept)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDeptFilter () {
    return this.Dept;
  }

  /**
   * Retrieves the DeptFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DeptFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DeptFilter field
   */
  public String[] getDeptFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeptFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDeptFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeptFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeptFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DeptFilter filter value from a formatted string
   *
   * @param _value the DeptFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DeptFilter filter field
   */
  public void setDeptFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDeptFilterFromFormattedString");
    try {
      this.setDeptFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeptFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeptFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DateActive (ADDRESS.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch) {
    this.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (ADDRESS.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch () {
    return this.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (ADDRESS.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value) {
    this.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (ADDRESS.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder () {
    return this.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (ADDRESS.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending) {
    this.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (ADDRESS.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection () {
    return this.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (ADDRESS.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (ADDRESS.date_active)
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


  /** Set the field level Fetch value for field: DateInactive (ADDRESS.date_inactive)
   * @param fetch whether to fetch this field or not
   */
  public void setDateInactiveFetch (boolean fetch) {
    this.DateInactiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateInactive (ADDRESS.date_inactive)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateInactiveFetch () {
    return this.DateInactiveFetch;
  }
  /** Set the SortOrder for field: DateInactive (ADDRESS.date_inactive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateInactiveSortOrder (Integer value) {
    this.DateInactiveSort = value;
  }
  /** Retrieve SortOrder for field: DateInactive (ADDRESS.date_inactive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateInactiveSortOrder () {
    return this.DateInactiveSort;
  }
  /** Set the sort direction for field: DateInactive (ADDRESS.date_inactive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateInactiveSortDirection (boolean ascending) {
    this.DateInactiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateInactive (ADDRESS.date_inactive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateInactiveSortDirection () {
    return this.DateInactiveSortAscending;
  }
  /** Set the field level filters for field: DateInactive (ADDRESS.date_inactive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateInactiveFilter (DateFilter[] value) throws ServiceException {
    this.DateInactive = value;
  }
  /** Retrieve filter for field: DateInactive (ADDRESS.date_inactive)
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


  /** Set the field level Fetch value for field: AddressLine1 (ADDRESS.address_line1)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressLine1Fetch (boolean fetch) {
    this.AddressLine1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressLine1 (ADDRESS.address_line1)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressLine1Fetch () {
    return this.AddressLine1Fetch;
  }
  /** Set the SortOrder for field: AddressLine1 (ADDRESS.address_line1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressLine1SortOrder (Integer value) {
    this.AddressLine1Sort = value;
  }
  /** Retrieve SortOrder for field: AddressLine1 (ADDRESS.address_line1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressLine1SortOrder () {
    return this.AddressLine1Sort;
  }
  /** Set the sort direction for field: AddressLine1 (ADDRESS.address_line1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressLine1SortDirection (boolean ascending) {
    this.AddressLine1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressLine1 (ADDRESS.address_line1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressLine1SortDirection () {
    return this.AddressLine1SortAscending;
  }
  /** Set the case insensitive for field: AddressLine1 (ADDRESS.address_line1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAddressLine1CaseInsensitive (boolean ascending) {
    this.AddressLine1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AddressLine1 (ADDRESS.address_line1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAddressLine1CaseInsensitive () {
    return this.AddressLine1CaseInsensitive;
  }
  /** Set the field level filters for field: AddressLine1 (ADDRESS.address_line1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressLine1Filter (StringFilter[] value) throws ServiceException {
    this.AddressLine1 = value;
  }
  /** Retrieve filter for field: AddressLine1 (ADDRESS.address_line1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAddressLine1Filter () {
    return this.AddressLine1;
  }

  /**
   * Retrieves the AddressLine1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressLine1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine1Filter field
   */
  public String[] getAddressLine1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressLine1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressLine1Filter filter value from a formatted string
   *
   * @param _value the AddressLine1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressLine1Filter filter field
   */
  public void setAddressLine1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressLine1FilterFromFormattedString");
    try {
      this.setAddressLine1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddressLine2 (ADDRESS.address_line2)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressLine2Fetch (boolean fetch) {
    this.AddressLine2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressLine2 (ADDRESS.address_line2)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressLine2Fetch () {
    return this.AddressLine2Fetch;
  }
  /** Set the SortOrder for field: AddressLine2 (ADDRESS.address_line2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressLine2SortOrder (Integer value) {
    this.AddressLine2Sort = value;
  }
  /** Retrieve SortOrder for field: AddressLine2 (ADDRESS.address_line2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressLine2SortOrder () {
    return this.AddressLine2Sort;
  }
  /** Set the sort direction for field: AddressLine2 (ADDRESS.address_line2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressLine2SortDirection (boolean ascending) {
    this.AddressLine2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressLine2 (ADDRESS.address_line2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressLine2SortDirection () {
    return this.AddressLine2SortAscending;
  }
  /** Set the case insensitive for field: AddressLine2 (ADDRESS.address_line2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAddressLine2CaseInsensitive (boolean ascending) {
    this.AddressLine2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AddressLine2 (ADDRESS.address_line2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAddressLine2CaseInsensitive () {
    return this.AddressLine2CaseInsensitive;
  }
  /** Set the field level filters for field: AddressLine2 (ADDRESS.address_line2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressLine2Filter (StringFilter[] value) throws ServiceException {
    this.AddressLine2 = value;
  }
  /** Retrieve filter for field: AddressLine2 (ADDRESS.address_line2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAddressLine2Filter () {
    return this.AddressLine2;
  }

  /**
   * Retrieves the AddressLine2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressLine2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine2Filter field
   */
  public String[] getAddressLine2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressLine2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressLine2Filter filter value from a formatted string
   *
   * @param _value the AddressLine2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressLine2Filter filter field
   */
  public void setAddressLine2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressLine2FilterFromFormattedString");
    try {
      this.setAddressLine2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddressLine3 (ADDRESS.address_line3)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressLine3Fetch (boolean fetch) {
    this.AddressLine3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressLine3 (ADDRESS.address_line3)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressLine3Fetch () {
    return this.AddressLine3Fetch;
  }
  /** Set the SortOrder for field: AddressLine3 (ADDRESS.address_line3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressLine3SortOrder (Integer value) {
    this.AddressLine3Sort = value;
  }
  /** Retrieve SortOrder for field: AddressLine3 (ADDRESS.address_line3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressLine3SortOrder () {
    return this.AddressLine3Sort;
  }
  /** Set the sort direction for field: AddressLine3 (ADDRESS.address_line3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressLine3SortDirection (boolean ascending) {
    this.AddressLine3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressLine3 (ADDRESS.address_line3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressLine3SortDirection () {
    return this.AddressLine3SortAscending;
  }
  /** Set the case insensitive for field: AddressLine3 (ADDRESS.address_line3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAddressLine3CaseInsensitive (boolean ascending) {
    this.AddressLine3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AddressLine3 (ADDRESS.address_line3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAddressLine3CaseInsensitive () {
    return this.AddressLine3CaseInsensitive;
  }
  /** Set the field level filters for field: AddressLine3 (ADDRESS.address_line3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressLine3Filter (StringFilter[] value) throws ServiceException {
    this.AddressLine3 = value;
  }
  /** Retrieve filter for field: AddressLine3 (ADDRESS.address_line3)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAddressLine3Filter () {
    return this.AddressLine3;
  }

  /**
   * Retrieves the AddressLine3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressLine3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine3Filter field
   */
  public String[] getAddressLine3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressLine3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressLine3Filter filter value from a formatted string
   *
   * @param _value the AddressLine3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressLine3Filter filter field
   */
  public void setAddressLine3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressLine3FilterFromFormattedString");
    try {
      this.setAddressLine3Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddressLine4 (ADDRESS.address_line4)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressLine4Fetch (boolean fetch) {
    this.AddressLine4Fetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressLine4 (ADDRESS.address_line4)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressLine4Fetch () {
    return this.AddressLine4Fetch;
  }
  /** Set the SortOrder for field: AddressLine4 (ADDRESS.address_line4)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressLine4SortOrder (Integer value) {
    this.AddressLine4Sort = value;
  }
  /** Retrieve SortOrder for field: AddressLine4 (ADDRESS.address_line4)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressLine4SortOrder () {
    return this.AddressLine4Sort;
  }
  /** Set the sort direction for field: AddressLine4 (ADDRESS.address_line4)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressLine4SortDirection (boolean ascending) {
    this.AddressLine4SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressLine4 (ADDRESS.address_line4)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressLine4SortDirection () {
    return this.AddressLine4SortAscending;
  }
  /** Set the case insensitive for field: AddressLine4 (ADDRESS.address_line4)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAddressLine4CaseInsensitive (boolean ascending) {
    this.AddressLine4CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AddressLine4 (ADDRESS.address_line4)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAddressLine4CaseInsensitive () {
    return this.AddressLine4CaseInsensitive;
  }
  /** Set the field level filters for field: AddressLine4 (ADDRESS.address_line4)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressLine4Filter (StringFilter[] value) throws ServiceException {
    this.AddressLine4 = value;
  }
  /** Retrieve filter for field: AddressLine4 (ADDRESS.address_line4)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAddressLine4Filter () {
    return this.AddressLine4;
  }

  /**
   * Retrieves the AddressLine4Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressLine4Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine4Filter field
   */
  public String[] getAddressLine4FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine4FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressLine4Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine4FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine4Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine4FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressLine4Filter filter value from a formatted string
   *
   * @param _value the AddressLine4Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressLine4Filter filter field
   */
  public void setAddressLine4FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressLine4FilterFromFormattedString");
    try {
      this.setAddressLine4Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressLine4Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine4FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine4FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: City (ADDRESS.city)
   * @param fetch whether to fetch this field or not
   */
  public void setCityFetch (boolean fetch) {
    this.CityFetch = fetch;
  }
  /** Retrieve Fetch value for field: City (ADDRESS.city)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityFetch () {
    return this.CityFetch;
  }
  /** Set the SortOrder for field: City (ADDRESS.city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCitySortOrder (Integer value) {
    this.CitySort = value;
  }
  /** Retrieve SortOrder for field: City (ADDRESS.city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCitySortOrder () {
    return this.CitySort;
  }
  /** Set the sort direction for field: City (ADDRESS.city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCitySortDirection (boolean ascending) {
    this.CitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: City (ADDRESS.city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCitySortDirection () {
    return this.CitySortAscending;
  }
  /** Set the case insensitive for field: City (ADDRESS.city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCityCaseInsensitive (boolean ascending) {
    this.CityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: City (ADDRESS.city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCityCaseInsensitive () {
    return this.CityCaseInsensitive;
  }
  /** Set the field level filters for field: City (ADDRESS.city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityFilter (StringFilter[] value) throws ServiceException {
    this.City = value;
  }
  /** Retrieve filter for field: City (ADDRESS.city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCityFilter () {
    return this.City;
  }

  /**
   * Retrieves the CityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityFilter field
   */
  public String[] getCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CityFilter filter value from a formatted string
   *
   * @param _value the CityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CityFilter filter field
   */
  public void setCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityFilterFromFormattedString");
    try {
      this.setCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: State (ADDRESS.state)
   * @param fetch whether to fetch this field or not
   */
  public void setStateFetch (boolean fetch) {
    this.StateFetch = fetch;
  }
  /** Retrieve Fetch value for field: State (ADDRESS.state)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateFetch () {
    return this.StateFetch;
  }
  /** Set the SortOrder for field: State (ADDRESS.state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateSortOrder (Integer value) {
    this.StateSort = value;
  }
  /** Retrieve SortOrder for field: State (ADDRESS.state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateSortOrder () {
    return this.StateSort;
  }
  /** Set the sort direction for field: State (ADDRESS.state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateSortDirection (boolean ascending) {
    this.StateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: State (ADDRESS.state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateSortDirection () {
    return this.StateSortAscending;
  }
  /** Set the case insensitive for field: State (ADDRESS.state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStateCaseInsensitive (boolean ascending) {
    this.StateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: State (ADDRESS.state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStateCaseInsensitive () {
    return this.StateCaseInsensitive;
  }
  /** Set the field level filters for field: State (ADDRESS.state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateFilter (StringFilter[] value) throws ServiceException {
    this.State = value;
  }
  /** Retrieve filter for field: State (ADDRESS.state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStateFilter () {
    return this.State;
  }

  /**
   * Retrieves the StateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateFilter field
   */
  public String[] getStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StateFilter filter value from a formatted string
   *
   * @param _value the StateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateFilter filter field
   */
  public void setStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateFilterFromFormattedString");
    try {
      this.setStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PostalCode (ADDRESS.postal_code)
   * @param fetch whether to fetch this field or not
   */
  public void setPostalCodeFetch (boolean fetch) {
    this.PostalCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PostalCode (ADDRESS.postal_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getPostalCodeFetch () {
    return this.PostalCodeFetch;
  }
  /** Set the SortOrder for field: PostalCode (ADDRESS.postal_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPostalCodeSortOrder (Integer value) {
    this.PostalCodeSort = value;
  }
  /** Retrieve SortOrder for field: PostalCode (ADDRESS.postal_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPostalCodeSortOrder () {
    return this.PostalCodeSort;
  }
  /** Set the sort direction for field: PostalCode (ADDRESS.postal_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPostalCodeSortDirection (boolean ascending) {
    this.PostalCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PostalCode (ADDRESS.postal_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPostalCodeSortDirection () {
    return this.PostalCodeSortAscending;
  }
  /** Set the case insensitive for field: PostalCode (ADDRESS.postal_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPostalCodeCaseInsensitive (boolean ascending) {
    this.PostalCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PostalCode (ADDRESS.postal_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPostalCodeCaseInsensitive () {
    return this.PostalCodeCaseInsensitive;
  }
  /** Set the field level filters for field: PostalCode (ADDRESS.postal_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPostalCodeFilter (StringFilter[] value) throws ServiceException {
    this.PostalCode = value;
  }
  /** Retrieve filter for field: PostalCode (ADDRESS.postal_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPostalCodeFilter () {
    return this.PostalCode;
  }

  /**
   * Retrieves the PostalCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PostalCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostalCodeFilter field
   */
  public String[] getPostalCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostalCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPostalCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostalCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostalCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostalCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PostalCodeFilter filter value from a formatted string
   *
   * @param _value the PostalCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PostalCodeFilter filter field
   */
  public void setPostalCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPostalCodeFilterFromFormattedString");
    try {
      this.setPostalCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostalCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostalCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostalCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountryCode (ADDRESS.country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeFetch (boolean fetch) {
    this.CountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCode (ADDRESS.country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeFetch () {
    return this.CountryCodeFetch;
  }
  /** Set the SortOrder for field: CountryCode (ADDRESS.country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeSortOrder (Integer value) {
    this.CountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountryCode (ADDRESS.country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeSortOrder () {
    return this.CountryCodeSort;
  }
  /** Set the sort direction for field: CountryCode (ADDRESS.country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeSortDirection (boolean ascending) {
    this.CountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCode (ADDRESS.country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeSortDirection () {
    return this.CountryCodeSortAscending;
  }
  /** Set the field level filters for field: CountryCode (ADDRESS.country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CountryCode = value;
  }
  /** Retrieve filter for field: CountryCode (ADDRESS.country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountryCodeFilter () {
    return this.CountryCode;
  }

  /**
   * Retrieves the CountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeFilter field
   */
  public String[] getCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountryCodeFilter filter value from a formatted string
   *
   * @param _value the CountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeFilter filter field
   */
  public void setCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeFilterFromFormattedString");
    try {
      this.setCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFranchiseTaxCodeFetch (boolean fetch) {
    this.FranchiseTaxCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFranchiseTaxCodeFetch () {
    return this.FranchiseTaxCodeFetch;
  }
  /** Set the SortOrder for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFranchiseTaxCodeSortOrder (Integer value) {
    this.FranchiseTaxCodeSort = value;
  }
  /** Retrieve SortOrder for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFranchiseTaxCodeSortOrder () {
    return this.FranchiseTaxCodeSort;
  }
  /** Set the sort direction for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFranchiseTaxCodeSortDirection (boolean ascending) {
    this.FranchiseTaxCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFranchiseTaxCodeSortDirection () {
    return this.FranchiseTaxCodeSortAscending;
  }
  /** Set the field level filters for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFranchiseTaxCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.FranchiseTaxCode = value;
  }
  /** Retrieve filter for field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFranchiseTaxCodeFilter () {
    return this.FranchiseTaxCode;
  }

  /**
   * Retrieves the FranchiseTaxCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FranchiseTaxCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseTaxCodeFilter field
   */
  public String[] getFranchiseTaxCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseTaxCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFranchiseTaxCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseTaxCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseTaxCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FranchiseTaxCodeFilter filter value from a formatted string
   *
   * @param _value the FranchiseTaxCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FranchiseTaxCodeFilter filter field
   */
  public void setFranchiseTaxCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFranchiseTaxCodeFilterFromFormattedString");
    try {
      this.setFranchiseTaxCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseTaxCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseTaxCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Geocode (ADDRESS.geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setGeocodeFetch (boolean fetch) {
    this.GeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Geocode (ADDRESS.geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeocodeFetch () {
    return this.GeocodeFetch;
  }
  /** Set the SortOrder for field: Geocode (ADDRESS.geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeocodeSortOrder (Integer value) {
    this.GeocodeSort = value;
  }
  /** Retrieve SortOrder for field: Geocode (ADDRESS.geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeocodeSortOrder () {
    return this.GeocodeSort;
  }
  /** Set the sort direction for field: Geocode (ADDRESS.geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeocodeSortDirection (boolean ascending) {
    this.GeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Geocode (ADDRESS.geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeocodeSortDirection () {
    return this.GeocodeSortAscending;
  }
  /** Set the case insensitive for field: Geocode (ADDRESS.geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeocodeCaseInsensitive (boolean ascending) {
    this.GeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Geocode (ADDRESS.geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGeocodeCaseInsensitive () {
    return this.GeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: Geocode (ADDRESS.geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.Geocode = value;
  }
  /** Retrieve filter for field: Geocode (ADDRESS.geocode)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeocodeFilter () {
    return this.Geocode;
  }

  /**
   * Retrieves the GeocodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GeocodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GeocodeFilter field
   */
  public String[] getGeocodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGeocodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeocodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GeocodeFilter filter value from a formatted string
   *
   * @param _value the GeocodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GeocodeFilter filter field
   */
  public void setGeocodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGeocodeFilterFromFormattedString");
    try {
      this.setGeocodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeocodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeocodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: County (ADDRESS.county)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyFetch (boolean fetch) {
    this.CountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: County (ADDRESS.county)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyFetch () {
    return this.CountyFetch;
  }
  /** Set the SortOrder for field: County (ADDRESS.county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountySortOrder (Integer value) {
    this.CountySort = value;
  }
  /** Retrieve SortOrder for field: County (ADDRESS.county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountySortOrder () {
    return this.CountySort;
  }
  /** Set the sort direction for field: County (ADDRESS.county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountySortDirection (boolean ascending) {
    this.CountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: County (ADDRESS.county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountySortDirection () {
    return this.CountySortAscending;
  }
  /** Set the case insensitive for field: County (ADDRESS.county)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCountyCaseInsensitive (boolean ascending) {
    this.CountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: County (ADDRESS.county)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCountyCaseInsensitive () {
    return this.CountyCaseInsensitive;
  }
  /** Set the field level filters for field: County (ADDRESS.county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyFilter (StringFilter[] value) throws ServiceException {
    this.County = value;
  }
  /** Retrieve filter for field: County (ADDRESS.county)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCountyFilter () {
    return this.County;
  }

  /**
   * Retrieves the CountyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyFilter field
   */
  public String[] getCountyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountyFilter filter value from a formatted string
   *
   * @param _value the CountyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountyFilter filter field
   */
  public void setCountyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyFilterFromFormattedString");
    try {
      this.setCountyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyFilterFromFormattedString");
  }

  public String toString() {
    return ContactObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ContactObjectHelper.toMap(this, null);
  }
}
