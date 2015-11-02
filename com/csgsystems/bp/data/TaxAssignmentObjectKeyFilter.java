/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAssignmentObjectKeyFilter.java
 * Definition File: Admin/TaxAssignment.xml
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

/** Key Filter for TaxAssignmentObject object. */
public class TaxAssignmentObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: TAX_ASSIGNMENTS.account_category) */
  public    IntegerFilter[] AccountCategory  = null;
  protected boolean AccountCategoryFetch = false;
  protected boolean AccountCategorySortAscending = true;
  protected Integer AccountCategorySort = null;
  /** raw field for: TAX_ASSIGNMENTS.brand_id) */
  public    IntegerFilter[] BrandId  = null;
  protected boolean BrandIdFetch = false;
  protected boolean BrandIdSortAscending = true;
  protected Integer BrandIdSort = null;
  /** raw field for: TAX_ASSIGNMENTS.country_code) */
  public    IntegerFilter[] CountryCode  = null;
  protected boolean CountryCodeFetch = false;
  protected boolean CountryCodeSortAscending = true;
  protected Integer CountryCodeSort = null;
  /** raw field for: TAX_ASSIGNMENTS.state_code) */
  public    IntegerFilter[] StateCode  = null;
  protected boolean StateCodeFetch = false;
  protected boolean StateCodeSortAscending = true;
  protected Integer StateCodeSort = null;
  /** raw field for: TAX_ASSIGNMENTS.county_code) */
  public    IntegerFilter[] CountyCode  = null;
  protected boolean CountyCodeFetch = false;
  protected boolean CountyCodeSortAscending = true;
  protected Integer CountyCodeSort = null;
  /** raw field for: TAX_ASSIGNMENTS.city_code) */
  public    IntegerFilter[] CityCode  = null;
  protected boolean CityCodeFetch = false;
  protected boolean CityCodeSortAscending = true;
  protected Integer CityCodeSort = null;
  /** raw field for: TAX_ASSIGNMENTS.franchise_code) */
  public    IntegerFilter[] FranchiseCode  = null;
  protected boolean FranchiseCodeFetch = false;
  protected boolean FranchiseCodeSortAscending = true;
  protected Integer FranchiseCodeSort = null;
  /** raw field for: TAX_ASSIGNMENTS.charge_elt_type) */
  public    IntegerFilter[] ChargeEltType  = null;
  protected boolean ChargeEltTypeFetch = false;
  protected boolean ChargeEltTypeSortAscending = true;
  protected Integer ChargeEltTypeSort = null;
  /** raw field for: TAX_ASSIGNMENTS.charge_elt_id) */
  public    IntegerFilter[] ChargeEltId  = null;
  protected boolean ChargeEltIdFetch = false;
  protected boolean ChargeEltIdSortAscending = true;
  protected Integer ChargeEltIdSort = null;
  /** raw field for: TAX_ASSIGNMENTS.tax_pkg_inst_id) */
  public    IntegerFilter[] TaxPkgInstId  = null;
  protected boolean TaxPkgInstIdFetch = false;
  protected boolean TaxPkgInstIdSortAscending = true;
  protected Integer TaxPkgInstIdSort = null;
  private String _objName = "TaxAssignmentObjectKeyFilter";
  /** default constructor */
  public TaxAssignmentObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public TaxAssignmentObjectKeyFilter (TaxAssignmentObjectKeyFilter other)
  {
    if (other == null) return;
    this.AccountCategory = other.AccountCategory;
    this.AccountCategoryFetch = other.AccountCategoryFetch;
    this.AccountCategorySort = other.AccountCategorySort;
    this.AccountCategorySortAscending = other.AccountCategorySortAscending;
    this.BrandId = other.BrandId;
    this.BrandIdFetch = other.BrandIdFetch;
    this.BrandIdSort = other.BrandIdSort;
    this.BrandIdSortAscending = other.BrandIdSortAscending;
    this.CountryCode = other.CountryCode;
    this.CountryCodeFetch = other.CountryCodeFetch;
    this.CountryCodeSort = other.CountryCodeSort;
    this.CountryCodeSortAscending = other.CountryCodeSortAscending;
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
    this.FranchiseCode = other.FranchiseCode;
    this.FranchiseCodeFetch = other.FranchiseCodeFetch;
    this.FranchiseCodeSort = other.FranchiseCodeSort;
    this.FranchiseCodeSortAscending = other.FranchiseCodeSortAscending;
    this.ChargeEltType = other.ChargeEltType;
    this.ChargeEltTypeFetch = other.ChargeEltTypeFetch;
    this.ChargeEltTypeSort = other.ChargeEltTypeSort;
    this.ChargeEltTypeSortAscending = other.ChargeEltTypeSortAscending;
    this.ChargeEltId = other.ChargeEltId;
    this.ChargeEltIdFetch = other.ChargeEltIdFetch;
    this.ChargeEltIdSort = other.ChargeEltIdSort;
    this.ChargeEltIdSortAscending = other.ChargeEltIdSortAscending;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this.TaxPkgInstIdFetch = other.TaxPkgInstIdFetch;
    this.TaxPkgInstIdSort = other.TaxPkgInstIdSort;
    this.TaxPkgInstIdSortAscending = other.TaxPkgInstIdSortAscending;
  }
  /** Set the field level Fetch value for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountCategoryFetch (boolean fetch) {
    this.AccountCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountCategoryFetch () {
    return this.AccountCategoryFetch;
  }
  /** Set the SortOrder for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountCategorySortOrder (Integer value) {
    this.AccountCategorySort = value;
  }
  /** Retrieve SortOrder for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountCategorySortOrder () {
    return this.AccountCategorySort;
  }
  /** Set the sort direction for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountCategorySortDirection (boolean ascending) {
    this.AccountCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountCategorySortDirection () {
    return this.AccountCategorySortAscending;
  }
  /** Set the field level filters for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountCategory = value;
  }
  /** Retrieve filter for field: AccountCategory (TAX_ASSIGNMENTS.account_category)
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

  /** Set the field level Fetch value for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBrandIdFetch (boolean fetch) {
    this.BrandIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBrandIdFetch () {
    return this.BrandIdFetch;
  }
  /** Set the SortOrder for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBrandIdSortOrder (Integer value) {
    this.BrandIdSort = value;
  }
  /** Retrieve SortOrder for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBrandIdSortOrder () {
    return this.BrandIdSort;
  }
  /** Set the sort direction for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBrandIdSortDirection (boolean ascending) {
    this.BrandIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBrandIdSortDirection () {
    return this.BrandIdSortAscending;
  }
  /** Set the field level filters for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBrandIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BrandId = value;
  }
  /** Retrieve filter for field: BrandId (TAX_ASSIGNMENTS.brand_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBrandIdFilter () {
    return this.BrandId;
  }

  /**
   * Retrieves the BrandIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BrandIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BrandIdFilter field
   */
  public String[] getBrandIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBrandIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBrandIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBrandIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BrandIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBrandIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BrandIdFilter filter value from a formatted string
   *
   * @param _value the BrandIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BrandIdFilter filter field
   */
  public void setBrandIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBrandIdFilterFromFormattedString");
    try {
      this.setBrandIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BrandIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBrandIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBrandIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeFetch (boolean fetch) {
    this.CountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeFetch () {
    return this.CountryCodeFetch;
  }
  /** Set the SortOrder for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeSortOrder (Integer value) {
    this.CountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeSortOrder () {
    return this.CountryCodeSort;
  }
  /** Set the sort direction for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeSortDirection (boolean ascending) {
    this.CountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeSortDirection () {
    return this.CountryCodeSortAscending;
  }
  /** Set the field level filters for field: CountryCode (TAX_ASSIGNMENTS.country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CountryCode = value;
  }
  /** Retrieve filter for field: CountryCode (TAX_ASSIGNMENTS.country_code)
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

  /** Set the field level Fetch value for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @param fetch whether to fetch this field or not
   */
  public void setStateCodeFetch (boolean fetch) {
    this.StateCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateCodeFetch () {
    return this.StateCodeFetch;
  }
  /** Set the SortOrder for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateCodeSortOrder (Integer value) {
    this.StateCodeSort = value;
  }
  /** Retrieve SortOrder for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateCodeSortOrder () {
    return this.StateCodeSort;
  }
  /** Set the sort direction for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateCodeSortDirection (boolean ascending) {
    this.StateCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateCodeSortDirection () {
    return this.StateCodeSortAscending;
  }
  /** Set the field level filters for field: StateCode (TAX_ASSIGNMENTS.state_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.StateCode = value;
  }
  /** Retrieve filter for field: StateCode (TAX_ASSIGNMENTS.state_code)
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

  /** Set the field level Fetch value for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyCodeFetch (boolean fetch) {
    this.CountyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyCodeFetch () {
    return this.CountyCodeFetch;
  }
  /** Set the SortOrder for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyCodeSortOrder (Integer value) {
    this.CountyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyCodeSortOrder () {
    return this.CountyCodeSort;
  }
  /** Set the sort direction for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyCodeSortDirection (boolean ascending) {
    this.CountyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyCodeSortDirection () {
    return this.CountyCodeSortAscending;
  }
  /** Set the field level filters for field: CountyCode (TAX_ASSIGNMENTS.county_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CountyCode = value;
  }
  /** Retrieve filter for field: CountyCode (TAX_ASSIGNMENTS.county_code)
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

  /** Set the field level Fetch value for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCityCodeFetch (boolean fetch) {
    this.CityCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityCodeFetch () {
    return this.CityCodeFetch;
  }
  /** Set the SortOrder for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityCodeSortOrder (Integer value) {
    this.CityCodeSort = value;
  }
  /** Retrieve SortOrder for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityCodeSortOrder () {
    return this.CityCodeSort;
  }
  /** Set the sort direction for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityCodeSortDirection (boolean ascending) {
    this.CityCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityCodeSortDirection () {
    return this.CityCodeSortAscending;
  }
  /** Set the field level filters for field: CityCode (TAX_ASSIGNMENTS.city_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CityCode = value;
  }
  /** Retrieve filter for field: CityCode (TAX_ASSIGNMENTS.city_code)
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

  /** Set the field level Fetch value for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFranchiseCodeFetch (boolean fetch) {
    this.FranchiseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFranchiseCodeFetch () {
    return this.FranchiseCodeFetch;
  }
  /** Set the SortOrder for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFranchiseCodeSortOrder (Integer value) {
    this.FranchiseCodeSort = value;
  }
  /** Retrieve SortOrder for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFranchiseCodeSortOrder () {
    return this.FranchiseCodeSort;
  }
  /** Set the sort direction for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFranchiseCodeSortDirection (boolean ascending) {
    this.FranchiseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFranchiseCodeSortDirection () {
    return this.FranchiseCodeSortAscending;
  }
  /** Set the field level filters for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFranchiseCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.FranchiseCode = value;
  }
  /** Retrieve filter for field: FranchiseCode (TAX_ASSIGNMENTS.franchise_code)
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

  /** Set the field level Fetch value for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeEltTypeFetch (boolean fetch) {
    this.ChargeEltTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeEltTypeFetch () {
    return this.ChargeEltTypeFetch;
  }
  /** Set the SortOrder for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeEltTypeSortOrder (Integer value) {
    this.ChargeEltTypeSort = value;
  }
  /** Retrieve SortOrder for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeEltTypeSortOrder () {
    return this.ChargeEltTypeSort;
  }
  /** Set the sort direction for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeEltTypeSortDirection (boolean ascending) {
    this.ChargeEltTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeEltTypeSortDirection () {
    return this.ChargeEltTypeSortAscending;
  }
  /** Set the field level filters for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeEltTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ChargeEltType = value;
  }
  /** Retrieve filter for field: ChargeEltType (TAX_ASSIGNMENTS.charge_elt_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeEltTypeFilter () {
    return this.ChargeEltType;
  }

  /**
   * Retrieves the ChargeEltTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeEltTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeEltTypeFilter field
   */
  public String[] getChargeEltTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeEltTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChargeEltTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeEltTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeEltTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeEltTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeEltTypeFilter filter value from a formatted string
   *
   * @param _value the ChargeEltTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChargeEltTypeFilter filter field
   */
  public void setChargeEltTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeEltTypeFilterFromFormattedString");
    try {
      this.setChargeEltTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeEltTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeEltTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeEltTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeEltIdFetch (boolean fetch) {
    this.ChargeEltIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeEltIdFetch () {
    return this.ChargeEltIdFetch;
  }
  /** Set the SortOrder for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeEltIdSortOrder (Integer value) {
    this.ChargeEltIdSort = value;
  }
  /** Retrieve SortOrder for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeEltIdSortOrder () {
    return this.ChargeEltIdSort;
  }
  /** Set the sort direction for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeEltIdSortDirection (boolean ascending) {
    this.ChargeEltIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeEltIdSortDirection () {
    return this.ChargeEltIdSortAscending;
  }
  /** Set the field level filters for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeEltIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ChargeEltId = value;
  }
  /** Retrieve filter for field: ChargeEltId (TAX_ASSIGNMENTS.charge_elt_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChargeEltIdFilter () {
    return this.ChargeEltId;
  }

  /**
   * Retrieves the ChargeEltIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeEltIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeEltIdFilter field
   */
  public String[] getChargeEltIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeEltIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChargeEltIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeEltIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeEltIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeEltIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeEltIdFilter filter value from a formatted string
   *
   * @param _value the ChargeEltIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChargeEltIdFilter filter field
   */
  public void setChargeEltIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeEltIdFilterFromFormattedString");
    try {
      this.setChargeEltIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeEltIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeEltIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeEltIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch) {
    this.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch () {
    return this.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value) {
    this.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder () {
    return this.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending) {
    this.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection () {
    return this.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (TAX_ASSIGNMENTS.tax_pkg_inst_id)
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

  public String toString() {
    return TaxAssignmentObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TaxAssignmentObjectKeyHelper.toMap(this, null);
  }
}
