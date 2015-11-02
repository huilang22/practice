/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxExemptionObjectFilter.java
 * Definition File: Customer/TaxExemption.xml
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
public class TaxExemptionObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public TaxExemptionObjectKeyFilter Key = null;
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
  /** raw field for: CMF_EXEMPT.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CMF_EXEMPT.tax_pkg_inst_id) */
  public    IntegerFilter[] TaxPkgInstId  = null;
  protected boolean TaxPkgInstIdFetch = false;
  protected boolean TaxPkgInstIdSortAscending = true;
  protected Integer TaxPkgInstIdSort = null;
  /** raw field for: CMF_EXEMPT.tax_status) */
  public    IntegerFilter[] TaxStatus  = null;
  protected boolean TaxStatusFetch = false;
  protected boolean TaxStatusSortAscending = true;
  protected Integer TaxStatusSort = null;
  /** raw field for: CMF_EXEMPT.certificate) */
  public    StringFilter[] Certificate  = null;
  protected boolean CertificateFetch = false;
  protected boolean CertificateSortAscending = true;
  protected boolean CertificateCaseInsensitive = false;
  protected Integer CertificateSort = null;
  /** raw field for: CMF_EXEMPT.date_active) */
  public    DateFilter[] ActiveDate  = null;
  protected boolean ActiveDateFetch = false;
  protected boolean ActiveDateSortAscending = true;
  protected Integer ActiveDateSort = null;
  /** raw field for: CMF_EXEMPT.date_expiration) */
  public    DateFilter[] DateExpiration  = null;
  protected boolean DateExpirationFetch = false;
  protected boolean DateExpirationSortAscending = true;
  protected Integer DateExpirationSort = null;
  /** raw field for: CMF_EXEMPT.exempt_federal) */
  public    BooleanFilter[] ExemptFederal  = null;
  protected boolean ExemptFederalFetch = false;
  protected boolean ExemptFederalSortAscending = true;
  protected Integer ExemptFederalSort = null;
  /** raw field for: CMF_EXEMPT.exempt_state) */
  public    BooleanFilter[] ExemptState  = null;
  protected boolean ExemptStateFetch = false;
  protected boolean ExemptStateSortAscending = true;
  protected Integer ExemptStateSort = null;
  /** raw field for: CMF_EXEMPT.exempt_county) */
  public    BooleanFilter[] ExemptCounty  = null;
  protected boolean ExemptCountyFetch = false;
  protected boolean ExemptCountySortAscending = true;
  protected Integer ExemptCountySort = null;
  /** raw field for: CMF_EXEMPT.exempt_city) */
  public    BooleanFilter[] ExemptCity  = null;
  protected boolean ExemptCityFetch = false;
  protected boolean ExemptCitySortAscending = true;
  protected Integer ExemptCitySort = null;
  /** raw field for: CMF_EXEMPT.exempt_other) */
  public    BooleanFilter[] ExemptOther  = null;
  protected boolean ExemptOtherFetch = false;
  protected boolean ExemptOtherSortAscending = true;
  protected Integer ExemptOtherSort = null;
  /** raw field for: CMF_EXEMPT.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  /** raw field for: CMF_EXEMPT.country_code) */
  public    IntegerFilter[] CountryCode  = null;
  protected boolean CountryCodeFetch = false;
  protected boolean CountryCodeSortAscending = true;
  protected Integer CountryCodeSort = null;
  /** raw field for: CMF_EXEMPT.franchise_code) */
  public    IntegerFilter[] FranchiseCode  = null;
  protected boolean FranchiseCodeFetch = false;
  protected boolean FranchiseCodeSortAscending = true;
  protected Integer FranchiseCodeSort = null;
  /** raw field for: CMF_EXEMPT.state_code) */
  public    IntegerFilter[] StateCode  = null;
  protected boolean StateCodeFetch = false;
  protected boolean StateCodeSortAscending = true;
  protected Integer StateCodeSort = null;
  /** raw field for: CMF_EXEMPT.county_code) */
  public    IntegerFilter[] CountyCode  = null;
  protected boolean CountyCodeFetch = false;
  protected boolean CountyCodeSortAscending = true;
  protected Integer CountyCodeSort = null;
  /** raw field for: CMF_EXEMPT.city_code) */
  public    IntegerFilter[] CityCode  = null;
  protected boolean CityCodeFetch = false;
  protected boolean CityCodeSortAscending = true;
  protected Integer CityCodeSort = null;
  /** raw field for: CMF_EXEMPT.state) */
  public    StringFilter[] State  = null;
  protected boolean StateFetch = false;
  protected boolean StateSortAscending = true;
  protected boolean StateCaseInsensitive = false;
  protected Integer StateSort = null;
  /** raw field for: CMF_EXEMPT.county) */
  public    StringFilter[] County  = null;
  protected boolean CountyFetch = false;
  protected boolean CountySortAscending = true;
  protected boolean CountyCaseInsensitive = false;
  protected Integer CountySort = null;
  /** raw field for: CMF_EXEMPT.city) */
  public    StringFilter[] City  = null;
  protected boolean CityFetch = false;
  protected boolean CitySortAscending = true;
  protected boolean CityCaseInsensitive = false;
  protected Integer CitySort = null;
  private String _objName = "TaxExemptionObjectFilter";
  /** default constructor */
  public TaxExemptionObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public TaxExemptionObjectFilter (TaxExemptionObjectFilter other)
  {
    if (other == null) return;
    this.Key = new TaxExemptionObjectKeyFilter (other.Key);
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
    this.TaxPkgInstId = other.TaxPkgInstId;
    this.TaxPkgInstIdFetch = other.TaxPkgInstIdFetch;
    this.TaxPkgInstIdSort = other.TaxPkgInstIdSort;
    this.TaxPkgInstIdSortAscending = other.TaxPkgInstIdSortAscending;
    this.TaxStatus = other.TaxStatus;
    this.TaxStatusFetch = other.TaxStatusFetch;
    this.TaxStatusSort = other.TaxStatusSort;
    this.TaxStatusSortAscending = other.TaxStatusSortAscending;
    this.Certificate = other.Certificate;
    this.CertificateFetch = other.CertificateFetch;
    this.CertificateSort = other.CertificateSort;
    this.CertificateCaseInsensitive = other.CertificateCaseInsensitive;
    this.CertificateSortAscending = other.CertificateSortAscending;
    this.ActiveDate = other.ActiveDate;
    this.ActiveDateFetch = other.ActiveDateFetch;
    this.ActiveDateSort = other.ActiveDateSort;
    this.ActiveDateSortAscending = other.ActiveDateSortAscending;
    this.DateExpiration = other.DateExpiration;
    this.DateExpirationFetch = other.DateExpirationFetch;
    this.DateExpirationSort = other.DateExpirationSort;
    this.DateExpirationSortAscending = other.DateExpirationSortAscending;
    this.ExemptFederal = other.ExemptFederal;
    this.ExemptFederalFetch = other.ExemptFederalFetch;
    this.ExemptFederalSort = other.ExemptFederalSort;
    this.ExemptFederalSortAscending = other.ExemptFederalSortAscending;
    this.ExemptState = other.ExemptState;
    this.ExemptStateFetch = other.ExemptStateFetch;
    this.ExemptStateSort = other.ExemptStateSort;
    this.ExemptStateSortAscending = other.ExemptStateSortAscending;
    this.ExemptCounty = other.ExemptCounty;
    this.ExemptCountyFetch = other.ExemptCountyFetch;
    this.ExemptCountySort = other.ExemptCountySort;
    this.ExemptCountySortAscending = other.ExemptCountySortAscending;
    this.ExemptCity = other.ExemptCity;
    this.ExemptCityFetch = other.ExemptCityFetch;
    this.ExemptCitySort = other.ExemptCitySort;
    this.ExemptCitySortAscending = other.ExemptCitySortAscending;
    this.ExemptOther = other.ExemptOther;
    this.ExemptOtherFetch = other.ExemptOtherFetch;
    this.ExemptOtherSort = other.ExemptOtherSort;
    this.ExemptOtherSortAscending = other.ExemptOtherSortAscending;
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;
    this.CountryCode = other.CountryCode;
    this.CountryCodeFetch = other.CountryCodeFetch;
    this.CountryCodeSort = other.CountryCodeSort;
    this.CountryCodeSortAscending = other.CountryCodeSortAscending;
    this.FranchiseCode = other.FranchiseCode;
    this.FranchiseCodeFetch = other.FranchiseCodeFetch;
    this.FranchiseCodeSort = other.FranchiseCodeSort;
    this.FranchiseCodeSortAscending = other.FranchiseCodeSortAscending;
    this.StateCode = other.StateCode;
    this.StateCodeFetch = other.StateCodeFetch;
    this.StateCodeSort = other.StateCodeSort;
    this.StateCodeSortAscending = other.StateCodeSortAscending;
    this.CountyCode = other.CountyCode;
    this.CountyCodeFetch = other.CountyCodeFetch;
    this.CountyCodeSort = other.CountyCodeSort;
    this.CountyCodeSortAscending = other.CountyCodeSortAscending;
    this.CityCode = other.CityCode;
    this.CityCodeFetch = other.CityCodeFetch;
    this.CityCodeSort = other.CityCodeSort;
    this.CityCodeSortAscending = other.CityCodeSortAscending;
    this.State = other.State;
    this.StateFetch = other.StateFetch;
    this.StateSort = other.StateSort;
    this.StateCaseInsensitive = other.StateCaseInsensitive;
    this.StateSortAscending = other.StateSortAscending;
    this.County = other.County;
    this.CountyFetch = other.CountyFetch;
    this.CountySort = other.CountySort;
    this.CountyCaseInsensitive = other.CountyCaseInsensitive;
    this.CountySortAscending = other.CountySortAscending;
    this.City = other.City;
    this.CityFetch = other.CityFetch;
    this.CitySort = other.CitySort;
    this.CityCaseInsensitive = other.CityCaseInsensitive;
    this.CitySortAscending = other.CitySortAscending;  }
  /** get the filter for this object's key
   * @return TaxExemptionObjectKeyFilter
   */
  public TaxExemptionObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (TaxExemptionObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (CMF_EXEMPT.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (CMF_EXEMPT.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (CMF_EXEMPT.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (CMF_EXEMPT.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (CMF_EXEMPT.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (CMF_EXEMPT.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (CMF_EXEMPT.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (CMF_EXEMPT.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
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


  /** Set the field level Fetch value for field: AccountInternalId (CMF_EXEMPT.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_EXEMPT.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_EXEMPT.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_EXEMPT.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_EXEMPT.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_EXEMPT.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_EXEMPT.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_EXEMPT.account_no)
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

  /** Set the field level Fetch value for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch) {
    this.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch () {
    return this.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value) {
    this.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder () {
    return this.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending) {
    this.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection () {
    return this.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter () {
    return this.TaxPkgInstId;
  }

  /**
   * Retrieves the TaxPkgInstIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPkgInstIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstIdFilter field
   */
  public String[] getTaxPkgInstIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxPkgInstIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPkgInstIdFilter filter value from a formatted string
   *
   * @param _value the TaxPkgInstIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPkgInstIdFilter filter field
   */
  public void setTaxPkgInstIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
    try {
      this.setTaxPkgInstIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxStatus (CMF_EXEMPT.tax_status)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxStatusFetch (boolean fetch) {
    this.TaxStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxStatus (CMF_EXEMPT.tax_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxStatusFetch () {
    return this.TaxStatusFetch;
  }
  /** Set the SortOrder for field: TaxStatus (CMF_EXEMPT.tax_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxStatusSortOrder (Integer value) {
    this.TaxStatusSort = value;
  }
  /** Retrieve SortOrder for field: TaxStatus (CMF_EXEMPT.tax_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxStatusSortOrder () {
    return this.TaxStatusSort;
  }
  /** Set the sort direction for field: TaxStatus (CMF_EXEMPT.tax_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxStatusSortDirection (boolean ascending) {
    this.TaxStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxStatus (CMF_EXEMPT.tax_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxStatusSortDirection () {
    return this.TaxStatusSortAscending;
  }
  /** Set the field level filters for field: TaxStatus (CMF_EXEMPT.tax_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxStatus = value;
  }
  /** Retrieve filter for field: TaxStatus (CMF_EXEMPT.tax_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxStatusFilter () {
    return this.TaxStatus;
  }

  /**
   * Retrieves the TaxStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxStatusFilter field
   */
  public String[] getTaxStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxStatusFilter filter value from a formatted string
   *
   * @param _value the TaxStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxStatusFilter filter field
   */
  public void setTaxStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxStatusFilterFromFormattedString");
    try {
      this.setTaxStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Certificate (CMF_EXEMPT.certificate)
   * @param fetch whether to fetch this field or not
   */
  public void setCertificateFetch (boolean fetch) {
    this.CertificateFetch = fetch;
  }
  /** Retrieve Fetch value for field: Certificate (CMF_EXEMPT.certificate)
   * @return boolean the Fetch value for this field
   */
  public boolean getCertificateFetch () {
    return this.CertificateFetch;
  }
  /** Set the SortOrder for field: Certificate (CMF_EXEMPT.certificate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCertificateSortOrder (Integer value) {
    this.CertificateSort = value;
  }
  /** Retrieve SortOrder for field: Certificate (CMF_EXEMPT.certificate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCertificateSortOrder () {
    return this.CertificateSort;
  }
  /** Set the sort direction for field: Certificate (CMF_EXEMPT.certificate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCertificateSortDirection (boolean ascending) {
    this.CertificateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Certificate (CMF_EXEMPT.certificate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCertificateSortDirection () {
    return this.CertificateSortAscending;
  }
  /** Set the case insensitive for field: Certificate (CMF_EXEMPT.certificate)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCertificateCaseInsensitive (boolean ascending) {
    this.CertificateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Certificate (CMF_EXEMPT.certificate)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCertificateCaseInsensitive () {
    return this.CertificateCaseInsensitive;
  }
  /** Set the field level filters for field: Certificate (CMF_EXEMPT.certificate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCertificateFilter (StringFilter[] value) throws ServiceException {
    this.Certificate = value;
  }
  /** Retrieve filter for field: Certificate (CMF_EXEMPT.certificate)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCertificateFilter () {
    return this.Certificate;
  }

  /**
   * Retrieves the CertificateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CertificateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CertificateFilter field
   */
  public String[] getCertificateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCertificateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCertificateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCertificateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CertificateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCertificateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CertificateFilter filter value from a formatted string
   *
   * @param _value the CertificateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CertificateFilter filter field
   */
  public void setCertificateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCertificateFilterFromFormattedString");
    try {
      this.setCertificateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CertificateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCertificateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCertificateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDate (CMF_EXEMPT.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch) {
    this.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (CMF_EXEMPT.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch () {
    return this.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (CMF_EXEMPT.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value) {
    this.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (CMF_EXEMPT.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder () {
    return this.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (CMF_EXEMPT.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending) {
    this.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (CMF_EXEMPT.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection () {
    return this.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (CMF_EXEMPT.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (CMF_EXEMPT.date_active)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter () {
    return this.ActiveDate;
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * @param fetch whether to fetch this field or not
   */
  public void setDateExpirationFetch (boolean fetch) {
    this.DateExpirationFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateExpirationFetch () {
    return this.DateExpirationFetch;
  }
  /** Set the SortOrder for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateExpirationSortOrder (Integer value) {
    this.DateExpirationSort = value;
  }
  /** Retrieve SortOrder for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateExpirationSortOrder () {
    return this.DateExpirationSort;
  }
  /** Set the sort direction for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateExpirationSortDirection (boolean ascending) {
    this.DateExpirationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateExpirationSortDirection () {
    return this.DateExpirationSortAscending;
  }
  /** Set the field level filters for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateExpirationFilter (DateFilter[] value) throws ServiceException {
    this.DateExpiration = value;
  }
  /** Retrieve filter for field: DateExpiration (CMF_EXEMPT.date_expiration)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateExpirationFilter () {
    return this.DateExpiration;
  }

  /**
   * Retrieves the DateExpirationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateExpirationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateExpirationFilter field
   */
  public String[] getDateExpirationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateExpirationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateExpirationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateExpirationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateExpirationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateExpirationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateExpirationFilter filter value from a formatted string
   *
   * @param _value the DateExpirationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateExpirationFilter filter field
   */
  public void setDateExpirationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateExpirationFilterFromFormattedString");
    try {
      this.setDateExpirationFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateExpirationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateExpirationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateExpirationFilterFromFormattedString");
  }

  /**
   * Retrieves the DateExpirationFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateExpirationFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateExpirationFilter field
   */
  public String[] getDateExpirationFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateExpirationFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateExpirationFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateExpirationFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateExpirationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateExpirationFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateExpirationFilter filter value from a formatted string
   *
   * @param _value the DateExpirationFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateExpirationFilter filter field
   */
  public void setDateExpirationFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateExpirationFilterFromFormattedDateTimeString");
    try {
      this.setDateExpirationFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateExpirationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateExpirationFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateExpirationFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @param fetch whether to fetch this field or not
   */
  public void setExemptFederalFetch (boolean fetch) {
    this.ExemptFederalFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @return boolean the Fetch value for this field
   */
  public boolean getExemptFederalFetch () {
    return this.ExemptFederalFetch;
  }
  /** Set the SortOrder for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExemptFederalSortOrder (Integer value) {
    this.ExemptFederalSort = value;
  }
  /** Retrieve SortOrder for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExemptFederalSortOrder () {
    return this.ExemptFederalSort;
  }
  /** Set the sort direction for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExemptFederalSortDirection (boolean ascending) {
    this.ExemptFederalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExemptFederalSortDirection () {
    return this.ExemptFederalSortAscending;
  }
  /** Set the field level filters for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExemptFederalFilter (BooleanFilter[] value) throws ServiceException {
    this.ExemptFederal = value;
  }
  /** Retrieve filter for field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getExemptFederalFilter () {
    return this.ExemptFederal;
  }

  /**
   * Retrieves the ExemptFederalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExemptFederalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptFederalFilter field
   */
  public String[] getExemptFederalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptFederalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExemptFederalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptFederalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptFederalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptFederalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExemptFederalFilter filter value from a formatted string
   *
   * @param _value the ExemptFederalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExemptFederalFilter filter field
   */
  public void setExemptFederalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExemptFederalFilterFromFormattedString");
    try {
      this.setExemptFederalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptFederalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptFederalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptFederalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExemptState (CMF_EXEMPT.exempt_state)
   * @param fetch whether to fetch this field or not
   */
  public void setExemptStateFetch (boolean fetch) {
    this.ExemptStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExemptState (CMF_EXEMPT.exempt_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getExemptStateFetch () {
    return this.ExemptStateFetch;
  }
  /** Set the SortOrder for field: ExemptState (CMF_EXEMPT.exempt_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExemptStateSortOrder (Integer value) {
    this.ExemptStateSort = value;
  }
  /** Retrieve SortOrder for field: ExemptState (CMF_EXEMPT.exempt_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExemptStateSortOrder () {
    return this.ExemptStateSort;
  }
  /** Set the sort direction for field: ExemptState (CMF_EXEMPT.exempt_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExemptStateSortDirection (boolean ascending) {
    this.ExemptStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExemptState (CMF_EXEMPT.exempt_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExemptStateSortDirection () {
    return this.ExemptStateSortAscending;
  }
  /** Set the field level filters for field: ExemptState (CMF_EXEMPT.exempt_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExemptStateFilter (BooleanFilter[] value) throws ServiceException {
    this.ExemptState = value;
  }
  /** Retrieve filter for field: ExemptState (CMF_EXEMPT.exempt_state)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getExemptStateFilter () {
    return this.ExemptState;
  }

  /**
   * Retrieves the ExemptStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExemptStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptStateFilter field
   */
  public String[] getExemptStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExemptStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExemptStateFilter filter value from a formatted string
   *
   * @param _value the ExemptStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExemptStateFilter filter field
   */
  public void setExemptStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExemptStateFilterFromFormattedString");
    try {
      this.setExemptStateFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptStateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @param fetch whether to fetch this field or not
   */
  public void setExemptCountyFetch (boolean fetch) {
    this.ExemptCountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @return boolean the Fetch value for this field
   */
  public boolean getExemptCountyFetch () {
    return this.ExemptCountyFetch;
  }
  /** Set the SortOrder for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExemptCountySortOrder (Integer value) {
    this.ExemptCountySort = value;
  }
  /** Retrieve SortOrder for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExemptCountySortOrder () {
    return this.ExemptCountySort;
  }
  /** Set the sort direction for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExemptCountySortDirection (boolean ascending) {
    this.ExemptCountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExemptCountySortDirection () {
    return this.ExemptCountySortAscending;
  }
  /** Set the field level filters for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExemptCountyFilter (BooleanFilter[] value) throws ServiceException {
    this.ExemptCounty = value;
  }
  /** Retrieve filter for field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getExemptCountyFilter () {
    return this.ExemptCounty;
  }

  /**
   * Retrieves the ExemptCountyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExemptCountyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptCountyFilter field
   */
  public String[] getExemptCountyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptCountyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExemptCountyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptCountyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptCountyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExemptCountyFilter filter value from a formatted string
   *
   * @param _value the ExemptCountyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExemptCountyFilter filter field
   */
  public void setExemptCountyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExemptCountyFilterFromFormattedString");
    try {
      this.setExemptCountyFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptCountyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptCountyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * @param fetch whether to fetch this field or not
   */
  public void setExemptCityFetch (boolean fetch) {
    this.ExemptCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getExemptCityFetch () {
    return this.ExemptCityFetch;
  }
  /** Set the SortOrder for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExemptCitySortOrder (Integer value) {
    this.ExemptCitySort = value;
  }
  /** Retrieve SortOrder for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExemptCitySortOrder () {
    return this.ExemptCitySort;
  }
  /** Set the sort direction for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExemptCitySortDirection (boolean ascending) {
    this.ExemptCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExemptCitySortDirection () {
    return this.ExemptCitySortAscending;
  }
  /** Set the field level filters for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExemptCityFilter (BooleanFilter[] value) throws ServiceException {
    this.ExemptCity = value;
  }
  /** Retrieve filter for field: ExemptCity (CMF_EXEMPT.exempt_city)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getExemptCityFilter () {
    return this.ExemptCity;
  }

  /**
   * Retrieves the ExemptCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExemptCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptCityFilter field
   */
  public String[] getExemptCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExemptCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExemptCityFilter filter value from a formatted string
   *
   * @param _value the ExemptCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExemptCityFilter filter field
   */
  public void setExemptCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExemptCityFilterFromFormattedString");
    try {
      this.setExemptCityFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * @param fetch whether to fetch this field or not
   */
  public void setExemptOtherFetch (boolean fetch) {
    this.ExemptOtherFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * @return boolean the Fetch value for this field
   */
  public boolean getExemptOtherFetch () {
    return this.ExemptOtherFetch;
  }
  /** Set the SortOrder for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExemptOtherSortOrder (Integer value) {
    this.ExemptOtherSort = value;
  }
  /** Retrieve SortOrder for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExemptOtherSortOrder () {
    return this.ExemptOtherSort;
  }
  /** Set the sort direction for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExemptOtherSortDirection (boolean ascending) {
    this.ExemptOtherSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExemptOtherSortDirection () {
    return this.ExemptOtherSortAscending;
  }
  /** Set the field level filters for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExemptOtherFilter (BooleanFilter[] value) throws ServiceException {
    this.ExemptOther = value;
  }
  /** Retrieve filter for field: ExemptOther (CMF_EXEMPT.exempt_other)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getExemptOtherFilter () {
    return this.ExemptOther;
  }

  /**
   * Retrieves the ExemptOtherFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExemptOtherFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptOtherFilter field
   */
  public String[] getExemptOtherFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptOtherFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExemptOtherFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptOtherFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptOtherFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptOtherFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExemptOtherFilter filter value from a formatted string
   *
   * @param _value the ExemptOtherFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExemptOtherFilter filter field
   */
  public void setExemptOtherFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExemptOtherFilterFromFormattedString");
    try {
      this.setExemptOtherFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExemptOtherFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptOtherFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptOtherFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxTypeCodeFilter () {
    return this.TaxTypeCode;
  }

  /**
   * Retrieves the TaxTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeCodeFilter field
   */
  public String[] getTaxTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxTypeCodeFilter filter value from a formatted string
   *
   * @param _value the TaxTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxTypeCodeFilter filter field
   */
  public void setTaxTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
    try {
      this.setTaxTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountryCode (CMF_EXEMPT.country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeFetch (boolean fetch) {
    this.CountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCode (CMF_EXEMPT.country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeFetch () {
    return this.CountryCodeFetch;
  }
  /** Set the SortOrder for field: CountryCode (CMF_EXEMPT.country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeSortOrder (Integer value) {
    this.CountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountryCode (CMF_EXEMPT.country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeSortOrder () {
    return this.CountryCodeSort;
  }
  /** Set the sort direction for field: CountryCode (CMF_EXEMPT.country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeSortDirection (boolean ascending) {
    this.CountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCode (CMF_EXEMPT.country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeSortDirection () {
    return this.CountryCodeSortAscending;
  }
  /** Set the field level filters for field: CountryCode (CMF_EXEMPT.country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CountryCode = value;
  }
  /** Retrieve filter for field: CountryCode (CMF_EXEMPT.country_code)
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

  /** Set the field level Fetch value for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFranchiseCodeFetch (boolean fetch) {
    this.FranchiseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFranchiseCodeFetch () {
    return this.FranchiseCodeFetch;
  }
  /** Set the SortOrder for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFranchiseCodeSortOrder (Integer value) {
    this.FranchiseCodeSort = value;
  }
  /** Retrieve SortOrder for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFranchiseCodeSortOrder () {
    return this.FranchiseCodeSort;
  }
  /** Set the sort direction for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFranchiseCodeSortDirection (boolean ascending) {
    this.FranchiseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFranchiseCodeSortDirection () {
    return this.FranchiseCodeSortAscending;
  }
  /** Set the field level filters for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFranchiseCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.FranchiseCode = value;
  }
  /** Retrieve filter for field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFranchiseCodeFilter () {
    return this.FranchiseCode;
  }

  /**
   * Retrieves the FranchiseCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FranchiseCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseCodeFilter field
   */
  public String[] getFranchiseCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFranchiseCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FranchiseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FranchiseCodeFilter filter value from a formatted string
   *
   * @param _value the FranchiseCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FranchiseCodeFilter filter field
   */
  public void setFranchiseCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFranchiseCodeFilterFromFormattedString");
    try {
      this.setFranchiseCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FranchiseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StateCode (CMF_EXEMPT.state_code)
   * @param fetch whether to fetch this field or not
   */
  public void setStateCodeFetch (boolean fetch) {
    this.StateCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateCode (CMF_EXEMPT.state_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateCodeFetch () {
    return this.StateCodeFetch;
  }
  /** Set the SortOrder for field: StateCode (CMF_EXEMPT.state_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateCodeSortOrder (Integer value) {
    this.StateCodeSort = value;
  }
  /** Retrieve SortOrder for field: StateCode (CMF_EXEMPT.state_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateCodeSortOrder () {
    return this.StateCodeSort;
  }
  /** Set the sort direction for field: StateCode (CMF_EXEMPT.state_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateCodeSortDirection (boolean ascending) {
    this.StateCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateCode (CMF_EXEMPT.state_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateCodeSortDirection () {
    return this.StateCodeSortAscending;
  }
  /** Set the field level filters for field: StateCode (CMF_EXEMPT.state_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.StateCode = value;
  }
  /** Retrieve filter for field: StateCode (CMF_EXEMPT.state_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStateCodeFilter () {
    return this.StateCode;
  }

  /**
   * Retrieves the StateCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateCodeFilter field
   */
  public String[] getStateCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StateCodeFilter filter value from a formatted string
   *
   * @param _value the StateCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateCodeFilter filter field
   */
  public void setStateCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateCodeFilterFromFormattedString");
    try {
      this.setStateCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountyCode (CMF_EXEMPT.county_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyCodeFetch (boolean fetch) {
    this.CountyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyCode (CMF_EXEMPT.county_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyCodeFetch () {
    return this.CountyCodeFetch;
  }
  /** Set the SortOrder for field: CountyCode (CMF_EXEMPT.county_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyCodeSortOrder (Integer value) {
    this.CountyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountyCode (CMF_EXEMPT.county_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyCodeSortOrder () {
    return this.CountyCodeSort;
  }
  /** Set the sort direction for field: CountyCode (CMF_EXEMPT.county_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyCodeSortDirection (boolean ascending) {
    this.CountyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyCode (CMF_EXEMPT.county_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyCodeSortDirection () {
    return this.CountyCodeSortAscending;
  }
  /** Set the field level filters for field: CountyCode (CMF_EXEMPT.county_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CountyCode = value;
  }
  /** Retrieve filter for field: CountyCode (CMF_EXEMPT.county_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountyCodeFilter () {
    return this.CountyCode;
  }

  /**
   * Retrieves the CountyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyCodeFilter field
   */
  public String[] getCountyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountyCodeFilter filter value from a formatted string
   *
   * @param _value the CountyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountyCodeFilter filter field
   */
  public void setCountyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyCodeFilterFromFormattedString");
    try {
      this.setCountyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CityCode (CMF_EXEMPT.city_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCityCodeFetch (boolean fetch) {
    this.CityCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityCode (CMF_EXEMPT.city_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityCodeFetch () {
    return this.CityCodeFetch;
  }
  /** Set the SortOrder for field: CityCode (CMF_EXEMPT.city_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityCodeSortOrder (Integer value) {
    this.CityCodeSort = value;
  }
  /** Retrieve SortOrder for field: CityCode (CMF_EXEMPT.city_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityCodeSortOrder () {
    return this.CityCodeSort;
  }
  /** Set the sort direction for field: CityCode (CMF_EXEMPT.city_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityCodeSortDirection (boolean ascending) {
    this.CityCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityCode (CMF_EXEMPT.city_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityCodeSortDirection () {
    return this.CityCodeSortAscending;
  }
  /** Set the field level filters for field: CityCode (CMF_EXEMPT.city_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CityCode = value;
  }
  /** Retrieve filter for field: CityCode (CMF_EXEMPT.city_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCityCodeFilter () {
    return this.CityCode;
  }

  /**
   * Retrieves the CityCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityCodeFilter field
   */
  public String[] getCityCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCityCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CityCodeFilter filter value from a formatted string
   *
   * @param _value the CityCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CityCodeFilter filter field
   */
  public void setCityCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityCodeFilterFromFormattedString");
    try {
      this.setCityCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: State (CMF_EXEMPT.state)
   * @param fetch whether to fetch this field or not
   */
  public void setStateFetch (boolean fetch) {
    this.StateFetch = fetch;
  }
  /** Retrieve Fetch value for field: State (CMF_EXEMPT.state)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateFetch () {
    return this.StateFetch;
  }
  /** Set the SortOrder for field: State (CMF_EXEMPT.state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateSortOrder (Integer value) {
    this.StateSort = value;
  }
  /** Retrieve SortOrder for field: State (CMF_EXEMPT.state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateSortOrder () {
    return this.StateSort;
  }
  /** Set the sort direction for field: State (CMF_EXEMPT.state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateSortDirection (boolean ascending) {
    this.StateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: State (CMF_EXEMPT.state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateSortDirection () {
    return this.StateSortAscending;
  }
  /** Set the case insensitive for field: State (CMF_EXEMPT.state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStateCaseInsensitive (boolean ascending) {
    this.StateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: State (CMF_EXEMPT.state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStateCaseInsensitive () {
    return this.StateCaseInsensitive;
  }
  /** Set the field level filters for field: State (CMF_EXEMPT.state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateFilter (StringFilter[] value) throws ServiceException {
    this.State = value;
  }
  /** Retrieve filter for field: State (CMF_EXEMPT.state)
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

  /** Set the field level Fetch value for field: County (CMF_EXEMPT.county)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyFetch (boolean fetch) {
    this.CountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: County (CMF_EXEMPT.county)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyFetch () {
    return this.CountyFetch;
  }
  /** Set the SortOrder for field: County (CMF_EXEMPT.county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountySortOrder (Integer value) {
    this.CountySort = value;
  }
  /** Retrieve SortOrder for field: County (CMF_EXEMPT.county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountySortOrder () {
    return this.CountySort;
  }
  /** Set the sort direction for field: County (CMF_EXEMPT.county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountySortDirection (boolean ascending) {
    this.CountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: County (CMF_EXEMPT.county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountySortDirection () {
    return this.CountySortAscending;
  }
  /** Set the case insensitive for field: County (CMF_EXEMPT.county)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCountyCaseInsensitive (boolean ascending) {
    this.CountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: County (CMF_EXEMPT.county)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCountyCaseInsensitive () {
    return this.CountyCaseInsensitive;
  }
  /** Set the field level filters for field: County (CMF_EXEMPT.county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyFilter (StringFilter[] value) throws ServiceException {
    this.County = value;
  }
  /** Retrieve filter for field: County (CMF_EXEMPT.county)
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

  /** Set the field level Fetch value for field: City (CMF_EXEMPT.city)
   * @param fetch whether to fetch this field or not
   */
  public void setCityFetch (boolean fetch) {
    this.CityFetch = fetch;
  }
  /** Retrieve Fetch value for field: City (CMF_EXEMPT.city)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityFetch () {
    return this.CityFetch;
  }
  /** Set the SortOrder for field: City (CMF_EXEMPT.city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCitySortOrder (Integer value) {
    this.CitySort = value;
  }
  /** Retrieve SortOrder for field: City (CMF_EXEMPT.city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCitySortOrder () {
    return this.CitySort;
  }
  /** Set the sort direction for field: City (CMF_EXEMPT.city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCitySortDirection (boolean ascending) {
    this.CitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: City (CMF_EXEMPT.city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCitySortDirection () {
    return this.CitySortAscending;
  }
  /** Set the case insensitive for field: City (CMF_EXEMPT.city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCityCaseInsensitive (boolean ascending) {
    this.CityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: City (CMF_EXEMPT.city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCityCaseInsensitive () {
    return this.CityCaseInsensitive;
  }
  /** Set the field level filters for field: City (CMF_EXEMPT.city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityFilter (StringFilter[] value) throws ServiceException {
    this.City = value;
  }
  /** Retrieve filter for field: City (CMF_EXEMPT.city)
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

  public String toString() {
    return TaxExemptionObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TaxExemptionObjectHelper.toMap(this, null);
  }
}
