/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailQueryObjectFilter.java
 * Definition File: Customer/InvoiceDetail.xml
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

import com.csgsystems.bp.data.*;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class InvoiceDetailQueryObjectFilter extends InvoiceDetailObjectFilter  implements Serializable
{
  /** raw field */
  public    StringFilter[] ApiQueryName  = null;
  protected boolean ApiQueryNameFetch = false;
  protected boolean ApiQueryNameSortAscending = true;
  protected boolean ApiQueryNameCaseInsensitive = false;
  protected Integer ApiQueryNameSort = null;
  /** raw field */
  public    BooleanFilter[] LatestInvoice  = null;
  protected boolean LatestInvoiceFetch = false;
  protected boolean LatestInvoiceSortAscending = true;
  protected Integer LatestInvoiceSort = null;
  /** raw field */
  public    BooleanFilter[] ShowZeroRatedCharges  = null;
  protected boolean ShowZeroRatedChargesFetch = false;
  protected boolean ShowZeroRatedChargesSortAscending = true;
  protected Integer ShowZeroRatedChargesSort = null;
  /** raw field */
  public    BigIntegerFilter[] BPCurrencyAttribute  = null;
  protected boolean BPCurrencyAttributeFetch = false;
  protected boolean BPCurrencyAttributeSortAscending = true;
  protected Integer BPCurrencyAttributeSort = null;
  /** raw field for: CMF.hierarchy_id) */
  public    IntegerFilter[] HierarchyId  = null;
  protected boolean HierarchyIdFetch = false;
  protected boolean HierarchyIdSortAscending = true;
  protected Integer HierarchyIdSort = null;
  /** raw field for: CMF.bill_city) */
  public    StringFilter[] BillCity  = null;
  protected boolean BillCityFetch = false;
  protected boolean BillCitySortAscending = true;
  protected boolean BillCityCaseInsensitive = false;
  protected Integer BillCitySort = null;
  /** raw field for: CMF.bill_state) */
  public    StringFilter[] BillState  = null;
  protected boolean BillStateFetch = false;
  protected boolean BillStateSortAscending = true;
  protected boolean BillStateCaseInsensitive = false;
  protected Integer BillStateSort = null;
  /** raw field for: CMF.bill_country_code) */
  public    IntegerFilter[] BillCountryCode  = null;
  protected boolean BillCountryCodeFetch = false;
  protected boolean BillCountryCodeSortAscending = true;
  protected Integer BillCountryCodeSort = null;
  /** raw field for: CMF.bill_zip) */
  public    StringFilter[] BillZip  = null;
  protected boolean BillZipFetch = false;
  protected boolean BillZipSortAscending = true;
  protected boolean BillZipCaseInsensitive = false;
  protected Integer BillZipSort = null;
  /** raw field for: NRC_TRANS_DESCR.type_id_nrc) */
  public    IntegerFilter[] TypeIdNrc  = null;
  protected boolean TypeIdNrcFetch = false;
  protected boolean TypeIdNrcSortAscending = true;
  protected Integer TypeIdNrcSort = null;
  private String _objName = "InvoiceDetailQueryObjectFilter";
  /** default constructor */
  public InvoiceDetailQueryObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public InvoiceDetailQueryObjectFilter (InvoiceDetailQueryObjectFilter other)
  {
    super (other);
    if (other == null) return;
    this.ApiQueryName = other.ApiQueryName;
    this.ApiQueryNameFetch = other.ApiQueryNameFetch;
    this.ApiQueryNameSort = other.ApiQueryNameSort;
    this.ApiQueryNameCaseInsensitive = other.ApiQueryNameCaseInsensitive;
    this.ApiQueryNameSortAscending = other.ApiQueryNameSortAscending;
    this.LatestInvoice = other.LatestInvoice;
    this.LatestInvoiceFetch = other.LatestInvoiceFetch;
    this.LatestInvoiceSort = other.LatestInvoiceSort;
    this.LatestInvoiceSortAscending = other.LatestInvoiceSortAscending;
    this.ShowZeroRatedCharges = other.ShowZeroRatedCharges;
    this.ShowZeroRatedChargesFetch = other.ShowZeroRatedChargesFetch;
    this.ShowZeroRatedChargesSort = other.ShowZeroRatedChargesSort;
    this.ShowZeroRatedChargesSortAscending = other.ShowZeroRatedChargesSortAscending;
    this.BPCurrencyAttribute = other.BPCurrencyAttribute;
    this.BPCurrencyAttributeFetch = other.BPCurrencyAttributeFetch;
    this.BPCurrencyAttributeSort = other.BPCurrencyAttributeSort;
    this.BPCurrencyAttributeSortAscending = other.BPCurrencyAttributeSortAscending;
    this.HierarchyId = other.HierarchyId;
    this.HierarchyIdFetch = other.HierarchyIdFetch;
    this.HierarchyIdSort = other.HierarchyIdSort;
    this.HierarchyIdSortAscending = other.HierarchyIdSortAscending;
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
    this.BillCountryCode = other.BillCountryCode;
    this.BillCountryCodeFetch = other.BillCountryCodeFetch;
    this.BillCountryCodeSort = other.BillCountryCodeSort;
    this.BillCountryCodeSortAscending = other.BillCountryCodeSortAscending;
    this.BillZip = other.BillZip;
    this.BillZipFetch = other.BillZipFetch;
    this.BillZipSort = other.BillZipSort;
    this.BillZipCaseInsensitive = other.BillZipCaseInsensitive;
    this.BillZipSortAscending = other.BillZipSortAscending;
    this.TypeIdNrc = other.TypeIdNrc;
    this.TypeIdNrcFetch = other.TypeIdNrcFetch;
    this.TypeIdNrcSort = other.TypeIdNrcSort;
    this.TypeIdNrcSortAscending = other.TypeIdNrcSortAscending;  }
  /** Set the field level Fetch value for field: ApiQueryName
   * @param fetch whether to fetch this field or not
   */
  public void setApiQueryNameFetch (boolean fetch)
  {
    this.ApiQueryNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ApiQueryName
   * @return boolean the Fetch value for this field
   */
  public boolean getApiQueryNameFetch ()
  {
    return this.ApiQueryNameFetch;
  }
  /** Set the SortOrder for field: ApiQueryName
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setApiQueryNameSortOrder (Integer value)
  {
    this.ApiQueryNameSort = value;
  }
  /** Retrieve SortOrder for field: ApiQueryName
   * @return Integer the sort order, if set, for the field
   */
  public Integer getApiQueryNameSortOrder ()
  {
    return this.ApiQueryNameSort;
  }
  /** Set the sort direction for field: ApiQueryName
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setApiQueryNameSortDirection (boolean ascending)
  {
    this.ApiQueryNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ApiQueryName
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getApiQueryNameSortDirection ()
  {
    return this.ApiQueryNameSortAscending;
  }
  /** Set the case insensitive for field: ApiQueryName
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setApiQueryNameCaseInsensitive (boolean ascending)
  {
    this.ApiQueryNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ApiQueryName
   * @return boolean whether the field is case insensitive
   */
  public boolean getApiQueryNameCaseInsensitive ()
  {
    return this.ApiQueryNameCaseInsensitive;
  }
  /** Set the field level filters for field: ApiQueryName
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setApiQueryNameFilter (StringFilter[] value) throws ServiceException
  {
    this.ApiQueryName = value;
  }
  /** Retrieve filter for field: ApiQueryName
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getApiQueryNameFilter ()
  {
    return this.ApiQueryName;
  }
  /** Set the field level Fetch value for field: LatestInvoice
   * @param fetch whether to fetch this field or not
   */
  public void setLatestInvoiceFetch (boolean fetch)
  {
    this.LatestInvoiceFetch = fetch;
  }
  /** Retrieve Fetch value for field: LatestInvoice
   * @return boolean the Fetch value for this field
   */
  public boolean getLatestInvoiceFetch ()
  {
    return this.LatestInvoiceFetch;
  }
  /** Set the SortOrder for field: LatestInvoice
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLatestInvoiceSortOrder (Integer value)
  {
    this.LatestInvoiceSort = value;
  }
  /** Retrieve SortOrder for field: LatestInvoice
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLatestInvoiceSortOrder ()
  {
    return this.LatestInvoiceSort;
  }
  /** Set the sort direction for field: LatestInvoice
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLatestInvoiceSortDirection (boolean ascending)
  {
    this.LatestInvoiceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LatestInvoice
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLatestInvoiceSortDirection ()
  {
    return this.LatestInvoiceSortAscending;
  }
  /** Set the field level filters for field: LatestInvoice
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLatestInvoiceFilter (BooleanFilter[] value) throws ServiceException
  {
    this.LatestInvoice = value;
  }
  /** Retrieve filter for field: LatestInvoice
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getLatestInvoiceFilter ()
  {
    return this.LatestInvoice;
  }
  /** Set the field level Fetch value for field: ShowZeroRatedCharges
   * @param fetch whether to fetch this field or not
   */
  public void setShowZeroRatedChargesFetch (boolean fetch)
  {
    this.ShowZeroRatedChargesFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShowZeroRatedCharges
   * @return boolean the Fetch value for this field
   */
  public boolean getShowZeroRatedChargesFetch ()
  {
    return this.ShowZeroRatedChargesFetch;
  }
  /** Set the SortOrder for field: ShowZeroRatedCharges
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShowZeroRatedChargesSortOrder (Integer value)
  {
    this.ShowZeroRatedChargesSort = value;
  }
  /** Retrieve SortOrder for field: ShowZeroRatedCharges
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShowZeroRatedChargesSortOrder ()
  {
    return this.ShowZeroRatedChargesSort;
  }
  /** Set the sort direction for field: ShowZeroRatedCharges
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShowZeroRatedChargesSortDirection (boolean ascending)
  {
    this.ShowZeroRatedChargesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShowZeroRatedCharges
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShowZeroRatedChargesSortDirection ()
  {
    return this.ShowZeroRatedChargesSortAscending;
  }
  /** Set the field level filters for field: ShowZeroRatedCharges
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShowZeroRatedChargesFilter (BooleanFilter[] value) throws ServiceException
  {
    this.ShowZeroRatedCharges = value;
  }
  /** Retrieve filter for field: ShowZeroRatedCharges
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getShowZeroRatedChargesFilter ()
  {
    return this.ShowZeroRatedCharges;
  }
  /** Set the field level Fetch value for field: BPCurrencyAttribute
   * @param fetch whether to fetch this field or not
   */
  public void setBPCurrencyAttributeFetch (boolean fetch)
  {
    this.BPCurrencyAttributeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BPCurrencyAttribute
   * @return boolean the Fetch value for this field
   */
  public boolean getBPCurrencyAttributeFetch ()
  {
    return this.BPCurrencyAttributeFetch;
  }
  /** Set the SortOrder for field: BPCurrencyAttribute
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBPCurrencyAttributeSortOrder (Integer value)
  {
    this.BPCurrencyAttributeSort = value;
  }
  /** Retrieve SortOrder for field: BPCurrencyAttribute
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBPCurrencyAttributeSortOrder ()
  {
    return this.BPCurrencyAttributeSort;
  }
  /** Set the sort direction for field: BPCurrencyAttribute
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBPCurrencyAttributeSortDirection (boolean ascending)
  {
    this.BPCurrencyAttributeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BPCurrencyAttribute
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBPCurrencyAttributeSortDirection ()
  {
    return this.BPCurrencyAttributeSortAscending;
  }
  /** Set the field level filters for field: BPCurrencyAttribute
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBPCurrencyAttributeFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.BPCurrencyAttribute = value;
  }
  /** Retrieve filter for field: BPCurrencyAttribute
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBPCurrencyAttributeFilter ()
  {
    return this.BPCurrencyAttribute;
  }
  /** Set the field level Fetch value for field: HierarchyId (CMF.hierarchy_id)
   * @param fetch whether to fetch this field or not
   */
  public void setHierarchyIdFetch (boolean fetch) {
    this.HierarchyIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: HierarchyId (CMF.hierarchy_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getHierarchyIdFetch () {
    return this.HierarchyIdFetch;
  }
  /** Set the SortOrder for field: HierarchyId (CMF.hierarchy_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHierarchyIdSortOrder (Integer value) {
    this.HierarchyIdSort = value;
  }
  /** Retrieve SortOrder for field: HierarchyId (CMF.hierarchy_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHierarchyIdSortOrder () {
    return this.HierarchyIdSort;
  }
  /** Set the sort direction for field: HierarchyId (CMF.hierarchy_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHierarchyIdSortDirection (boolean ascending) {
    this.HierarchyIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HierarchyId (CMF.hierarchy_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHierarchyIdSortDirection () {
    return this.HierarchyIdSortAscending;
  }
  /** Set the field level filters for field: HierarchyId (CMF.hierarchy_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHierarchyIdFilter (IntegerFilter[] value) throws ServiceException {
    this.HierarchyId = value;
  }
  /** Retrieve filter for field: HierarchyId (CMF.hierarchy_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHierarchyIdFilter () {
    return this.HierarchyId;
  }

  /**
   * Retrieves the HierarchyIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The HierarchyIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyIdFilter field
   */
  public String[] getHierarchyIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getHierarchyIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the HierarchyIdFilter filter value from a formatted string
   *
   * @param _value the HierarchyIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the HierarchyIdFilter filter field
   */
  public void setHierarchyIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyIdFilterFromFormattedString");
    try {
      this.setHierarchyIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCity (CMF.bill_city)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCityFetch (boolean fetch) {
    this.BillCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCity (CMF.bill_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCityFetch () {
    return this.BillCityFetch;
  }
  /** Set the SortOrder for field: BillCity (CMF.bill_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCitySortOrder (Integer value) {
    this.BillCitySort = value;
  }
  /** Retrieve SortOrder for field: BillCity (CMF.bill_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCitySortOrder () {
    return this.BillCitySort;
  }
  /** Set the sort direction for field: BillCity (CMF.bill_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCitySortDirection (boolean ascending) {
    this.BillCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCity (CMF.bill_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCitySortDirection () {
    return this.BillCitySortAscending;
  }
  /** Set the case insensitive for field: BillCity (CMF.bill_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCityCaseInsensitive (boolean ascending) {
    this.BillCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCity (CMF.bill_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCityCaseInsensitive () {
    return this.BillCityCaseInsensitive;
  }
  /** Set the field level filters for field: BillCity (CMF.bill_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCityFilter (StringFilter[] value) throws ServiceException {
    this.BillCity = value;
  }
  /** Retrieve filter for field: BillCity (CMF.bill_city)
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

  /** Set the field level Fetch value for field: BillState (CMF.bill_state)
   * @param fetch whether to fetch this field or not
   */
  public void setBillStateFetch (boolean fetch) {
    this.BillStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillState (CMF.bill_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillStateFetch () {
    return this.BillStateFetch;
  }
  /** Set the SortOrder for field: BillState (CMF.bill_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillStateSortOrder (Integer value) {
    this.BillStateSort = value;
  }
  /** Retrieve SortOrder for field: BillState (CMF.bill_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillStateSortOrder () {
    return this.BillStateSort;
  }
  /** Set the sort direction for field: BillState (CMF.bill_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillStateSortDirection (boolean ascending) {
    this.BillStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillState (CMF.bill_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillStateSortDirection () {
    return this.BillStateSortAscending;
  }
  /** Set the case insensitive for field: BillState (CMF.bill_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillStateCaseInsensitive (boolean ascending) {
    this.BillStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillState (CMF.bill_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillStateCaseInsensitive () {
    return this.BillStateCaseInsensitive;
  }
  /** Set the field level filters for field: BillState (CMF.bill_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillStateFilter (StringFilter[] value) throws ServiceException {
    this.BillState = value;
  }
  /** Retrieve filter for field: BillState (CMF.bill_state)
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


  /** Set the field level Fetch value for field: BillCountryCode (CMF.bill_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCountryCodeFetch (boolean fetch) {
    this.BillCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCountryCode (CMF.bill_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCountryCodeFetch () {
    return this.BillCountryCodeFetch;
  }
  /** Set the SortOrder for field: BillCountryCode (CMF.bill_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCountryCodeSortOrder (Integer value) {
    this.BillCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: BillCountryCode (CMF.bill_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCountryCodeSortOrder () {
    return this.BillCountryCodeSort;
  }
  /** Set the sort direction for field: BillCountryCode (CMF.bill_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCountryCodeSortDirection (boolean ascending) {
    this.BillCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCountryCode (CMF.bill_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCountryCodeSortDirection () {
    return this.BillCountryCodeSortAscending;
  }
  /** Set the field level filters for field: BillCountryCode (CMF.bill_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillCountryCode = value;
  }
  /** Retrieve filter for field: BillCountryCode (CMF.bill_country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillCountryCodeFilter () {
    return this.BillCountryCode;
  }

  /**
   * Retrieves the BillCountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCountryCodeFilter field
   */
  public String[] getBillCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCountryCodeFilter filter value from a formatted string
   *
   * @param _value the BillCountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCountryCodeFilter filter field
   */
  public void setBillCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFilterFromFormattedString");
    try {
      this.setBillCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountryCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillCountryCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillCountryCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCodeFilter filter field
   */
  public String[] getBillCountryCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillCountryCodeFilter(), "CountryCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillCountryCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCountryCodeFilter filter field
   */
  public void setBillCountryCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillCountryCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountryCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillZip (CMF.bill_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setBillZipFetch (boolean fetch) {
    this.BillZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillZip (CMF.bill_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillZipFetch () {
    return this.BillZipFetch;
  }
  /** Set the SortOrder for field: BillZip (CMF.bill_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillZipSortOrder (Integer value) {
    this.BillZipSort = value;
  }
  /** Retrieve SortOrder for field: BillZip (CMF.bill_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillZipSortOrder () {
    return this.BillZipSort;
  }
  /** Set the sort direction for field: BillZip (CMF.bill_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillZipSortDirection (boolean ascending) {
    this.BillZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillZip (CMF.bill_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillZipSortDirection () {
    return this.BillZipSortAscending;
  }
  /** Set the case insensitive for field: BillZip (CMF.bill_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillZipCaseInsensitive (boolean ascending) {
    this.BillZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillZip (CMF.bill_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillZipCaseInsensitive () {
    return this.BillZipCaseInsensitive;
  }
  /** Set the field level filters for field: BillZip (CMF.bill_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillZipFilter (StringFilter[] value) throws ServiceException {
    this.BillZip = value;
  }
  /** Retrieve filter for field: BillZip (CMF.bill_zip)
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

  /** Set the field level Fetch value for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setTypeIdNrcFetch (boolean fetch) {
    this.TypeIdNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getTypeIdNrcFetch () {
    return this.TypeIdNrcFetch;
  }
  /** Set the SortOrder for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTypeIdNrcSortOrder (Integer value) {
    this.TypeIdNrcSort = value;
  }
  /** Retrieve SortOrder for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTypeIdNrcSortOrder () {
    return this.TypeIdNrcSort;
  }
  /** Set the sort direction for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTypeIdNrcSortDirection (boolean ascending) {
    this.TypeIdNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTypeIdNrcSortDirection () {
    return this.TypeIdNrcSortAscending;
  }
  /** Set the field level filters for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTypeIdNrcFilter (IntegerFilter[] value) throws ServiceException {
    this.TypeIdNrc = value;
  }
  /** Retrieve filter for field: TypeIdNrc (NRC_TRANS_DESCR.type_id_nrc)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTypeIdNrcFilter () {
    return this.TypeIdNrc;
  }

  /**
   * Retrieves the TypeIdNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TypeIdNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdNrcFilter field
   */
  public String[] getTypeIdNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTypeIdNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TypeIdNrcFilter filter value from a formatted string
   *
   * @param _value the TypeIdNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TypeIdNrcFilter filter field
   */
  public void setTypeIdNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdNrcFilterFromFormattedString");
    try {
      this.setTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdNrcFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated TypeIdNrcFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TypeIdNrcFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TypeIdNrcFilter filter field
   */
  public String[] getTypeIdNrcFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTypeIdNrcFilter(), "ChargeType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdNrcFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdNrcFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TypeIdNrcFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TypeIdNrcFilter filter field
   */
  public void setTypeIdNrcFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdNrcFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "TypeIdNrc", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdNrcFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdNrcFilterFromDisplayValue");
  }


  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public InvoiceDetailQueryObjectFilter (InvoiceDetailObjectFilter other)
  {
    super (other);

  }

  public String toString() {
    return InvoiceDetailQueryObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return InvoiceDetailQueryObjectHelper.toMap(this, null);
  }
}
