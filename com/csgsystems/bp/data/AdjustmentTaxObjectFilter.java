/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTaxObjectFilter.java
 * Definition File: Customer/AdjustmentTax.xml
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
public class AdjustmentTaxObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AdjustmentTaxObjectKeyFilter Key = null;
  /** raw field for: ADJ_TAX.tracking_id_counter) */
  public    IntegerFilter[] TrackingIdCounter  = null;
  protected boolean TrackingIdCounterFetch = false;
  protected boolean TrackingIdCounterSortAscending = true;
  protected Integer TrackingIdCounterSort = null;
  /** raw field for: ADJ_TAX.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  /** raw field for: ADJ_TAX.tax_rate) */
  public    IntegerFilter[] TaxRate  = null;
  protected boolean TaxRateFetch = false;
  protected boolean TaxRateSortAscending = true;
  protected Integer TaxRateSort = null;
  /** raw field for: ADJ_TAX.federal_tax) */
  public    BigIntegerFilter[] FederalTax  = null;
  protected boolean FederalTaxFetch = false;
  protected boolean FederalTaxSortAscending = true;
  protected Integer FederalTaxSort = null;
  /** raw field for: ADJ_TAX.state_tax) */
  public    BigIntegerFilter[] StateTax  = null;
  protected boolean StateTaxFetch = false;
  protected boolean StateTaxSortAscending = true;
  protected Integer StateTaxSort = null;
  /** raw field for: ADJ_TAX.county_tax) */
  public    BigIntegerFilter[] CountyTax  = null;
  protected boolean CountyTaxFetch = false;
  protected boolean CountyTaxSortAscending = true;
  protected Integer CountyTaxSort = null;
  /** raw field for: ADJ_TAX.city_tax) */
  public    BigIntegerFilter[] CityTax  = null;
  protected boolean CityTaxFetch = false;
  protected boolean CityTaxSortAscending = true;
  protected Integer CityTaxSort = null;
  /** raw field for: ADJ_TAX.other_tax) */
  public    BigIntegerFilter[] OtherTax  = null;
  protected boolean OtherTaxFetch = false;
  protected boolean OtherTaxSortAscending = true;
  protected Integer OtherTaxSort = null;
  /** raw field for: ADJ_TAX.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: ADJ_TAX.aux_tax_info) */
  public    StringFilter[] AuxTaxInfo  = null;
  protected boolean AuxTaxInfoFetch = false;
  protected boolean AuxTaxInfoSortAscending = true;
  protected boolean AuxTaxInfoCaseInsensitive = false;
  protected Integer AuxTaxInfoSort = null;
  /** raw field for: ADJ_TAX.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  private String _objName = "AdjustmentTaxObjectFilter";
  /** default constructor */
  public AdjustmentTaxObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AdjustmentTaxObjectFilter (AdjustmentTaxObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AdjustmentTaxObjectKeyFilter (other.Key);
    this.TrackingIdCounter = other.TrackingIdCounter;
    this.TrackingIdCounterFetch = other.TrackingIdCounterFetch;
    this.TrackingIdCounterSort = other.TrackingIdCounterSort;
    this.TrackingIdCounterSortAscending = other.TrackingIdCounterSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
    this.TaxRate = other.TaxRate;
    this.TaxRateFetch = other.TaxRateFetch;
    this.TaxRateSort = other.TaxRateSort;
    this.TaxRateSortAscending = other.TaxRateSortAscending;
    this.FederalTax = other.FederalTax;
    this.FederalTaxFetch = other.FederalTaxFetch;
    this.FederalTaxSort = other.FederalTaxSort;
    this.FederalTaxSortAscending = other.FederalTaxSortAscending;
    this.StateTax = other.StateTax;
    this.StateTaxFetch = other.StateTaxFetch;
    this.StateTaxSort = other.StateTaxSort;
    this.StateTaxSortAscending = other.StateTaxSortAscending;
    this.CountyTax = other.CountyTax;
    this.CountyTaxFetch = other.CountyTaxFetch;
    this.CountyTaxSort = other.CountyTaxSort;
    this.CountyTaxSortAscending = other.CountyTaxSortAscending;
    this.CityTax = other.CityTax;
    this.CityTaxFetch = other.CityTaxFetch;
    this.CityTaxSort = other.CityTaxSort;
    this.CityTaxSortAscending = other.CityTaxSortAscending;
    this.OtherTax = other.OtherTax;
    this.OtherTaxFetch = other.OtherTaxFetch;
    this.OtherTaxSort = other.OtherTaxSort;
    this.OtherTaxSortAscending = other.OtherTaxSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.AuxTaxInfo = other.AuxTaxInfo;
    this.AuxTaxInfoFetch = other.AuxTaxInfoFetch;
    this.AuxTaxInfoSort = other.AuxTaxInfoSort;
    this.AuxTaxInfoCaseInsensitive = other.AuxTaxInfoCaseInsensitive;
    this.AuxTaxInfoSortAscending = other.AuxTaxInfoSortAscending;
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;  }
  /** get the filter for this object's key
   * @return AdjustmentTaxObjectKeyFilter
   */
  public AdjustmentTaxObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AdjustmentTaxObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (ADJ_TAX.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (ADJ_TAX.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (ADJ_TAX.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (ADJ_TAX.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (ADJ_TAX.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (ADJ_TAX.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (ADJ_TAX.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (ADJ_TAX.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Set the field level Fetch value for field: Geocode (ADJ_TAX.geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setGeocodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.GeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Geocode (ADJ_TAX.geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeocodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GeocodeFetch;
  }
  /** Set the SortOrder for field: Geocode (ADJ_TAX.geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeocodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.GeocodeSort = value;
  }
  /** Retrieve SortOrder for field: Geocode (ADJ_TAX.geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeocodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GeocodeSort;
  }
  /** Set the sort direction for field: Geocode (ADJ_TAX.geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeocodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.GeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Geocode (ADJ_TAX.geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeocodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GeocodeSortAscending;
  }
  /** Set the case insensitive for field: Geocode (ADJ_TAX.geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeocodeCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.GeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: Geocode (ADJ_TAX.geocode)
   * @return boolean whether the field is case insensitive
   */
  public boolean getGeocodeCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.GeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: Geocode (ADJ_TAX.geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeocodeFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyFilter ();
    this.Key.Geocode = value;
  }
  /** Retrieve filter for field: Geocode (ADJ_TAX.geocode)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeocodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Geocode;
  }
  /** Set the field level Fetch value for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdCounterFetch (boolean fetch) {
    this.TrackingIdCounterFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdCounterFetch () {
    return this.TrackingIdCounterFetch;
  }
  /** Set the SortOrder for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdCounterSortOrder (Integer value) {
    this.TrackingIdCounterSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdCounterSortOrder () {
    return this.TrackingIdCounterSort;
  }
  /** Set the sort direction for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdCounterSortDirection (boolean ascending) {
    this.TrackingIdCounterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdCounterSortDirection () {
    return this.TrackingIdCounterSortAscending;
  }
  /** Set the field level filters for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdCounterFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdCounter = value;
  }
  /** Retrieve filter for field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdCounterFilter () {
    return this.TrackingIdCounter;
  }

  /**
   * Retrieves the TrackingIdCounterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdCounterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdCounterFilter field
   */
  public String[] getTrackingIdCounterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdCounterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdCounterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdCounterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdCounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdCounterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdCounterFilter filter value from a formatted string
   *
   * @param _value the TrackingIdCounterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdCounterFilter filter field
   */
  public void setTrackingIdCounterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdCounterFilterFromFormattedString");
    try {
      this.setTrackingIdCounterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdCounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdCounterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdCounterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoBill (ADJ_TAX.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (ADJ_TAX.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (ADJ_TAX.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (ADJ_TAX.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (ADJ_TAX.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (ADJ_TAX.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (ADJ_TAX.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (BooleanFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (ADJ_TAX.no_bill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getNoBillFilter () {
    return this.NoBill;
  }

  /**
   * Retrieves the NoBillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoBillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBillFilter field
   */
  public String[] getNoBillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoBillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoBillFilter filter value from a formatted string
   *
   * @param _value the NoBillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoBillFilter filter field
   */
  public void setNoBillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoBillFilterFromFormattedString");
    try {
      this.setNoBillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxRate (ADJ_TAX.tax_rate)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxRateFetch (boolean fetch) {
    this.TaxRateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxRate (ADJ_TAX.tax_rate)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxRateFetch () {
    return this.TaxRateFetch;
  }
  /** Set the SortOrder for field: TaxRate (ADJ_TAX.tax_rate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxRateSortOrder (Integer value) {
    this.TaxRateSort = value;
  }
  /** Retrieve SortOrder for field: TaxRate (ADJ_TAX.tax_rate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxRateSortOrder () {
    return this.TaxRateSort;
  }
  /** Set the sort direction for field: TaxRate (ADJ_TAX.tax_rate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxRateSortDirection (boolean ascending) {
    this.TaxRateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxRate (ADJ_TAX.tax_rate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxRateSortDirection () {
    return this.TaxRateSortAscending;
  }
  /** Set the field level filters for field: TaxRate (ADJ_TAX.tax_rate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxRateFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxRate = value;
  }
  /** Retrieve filter for field: TaxRate (ADJ_TAX.tax_rate)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxRateFilter () {
    return this.TaxRate;
  }

  /**
   * Retrieves the TaxRateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateFilter field
   */
  public String[] getTaxRateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxRateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateFilter filter value from a formatted string
   *
   * @param _value the TaxRateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxRateFilter filter field
   */
  public void setTaxRateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateFilterFromFormattedString");
    try {
      this.setTaxRateFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FederalTax (ADJ_TAX.federal_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setFederalTaxFetch (boolean fetch) {
    this.FederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: FederalTax (ADJ_TAX.federal_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getFederalTaxFetch () {
    return this.FederalTaxFetch;
  }
  /** Set the SortOrder for field: FederalTax (ADJ_TAX.federal_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFederalTaxSortOrder (Integer value) {
    this.FederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: FederalTax (ADJ_TAX.federal_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFederalTaxSortOrder () {
    return this.FederalTaxSort;
  }
  /** Set the sort direction for field: FederalTax (ADJ_TAX.federal_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFederalTaxSortDirection (boolean ascending) {
    this.FederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FederalTax (ADJ_TAX.federal_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFederalTaxSortDirection () {
    return this.FederalTaxSortAscending;
  }
  /** Set the field level filters for field: FederalTax (ADJ_TAX.federal_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FederalTax = value;
  }
  /** Retrieve filter for field: FederalTax (ADJ_TAX.federal_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFederalTaxFilter () {
    return this.FederalTax;
  }

  /**
   * Retrieves the FederalTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTaxFilter field
   */
  public String[] getFederalTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFederalTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FederalTaxFilter filter value from a formatted string
   *
   * @param _value the FederalTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FederalTaxFilter filter field
   */
  public void setFederalTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFilterFromFormattedString");
    try {
      this.setFederalTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFilterFromFormattedString");
  }

  /**
   * Sets the FederalTaxFilter filter value from a formatted string
   *
   * @param _value the FederalTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FederalTaxFilter filter field
   */
  public void setFederalTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFilterFromFormattedCurrencyString");
    try {
      this.setFederalTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the FederalTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTaxFilter field
   */

  public String[] getFederalTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFederalTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: StateTax (ADJ_TAX.state_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setStateTaxFetch (boolean fetch) {
    this.StateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateTax (ADJ_TAX.state_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateTaxFetch () {
    return this.StateTaxFetch;
  }
  /** Set the SortOrder for field: StateTax (ADJ_TAX.state_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateTaxSortOrder (Integer value) {
    this.StateTaxSort = value;
  }
  /** Retrieve SortOrder for field: StateTax (ADJ_TAX.state_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateTaxSortOrder () {
    return this.StateTaxSort;
  }
  /** Set the sort direction for field: StateTax (ADJ_TAX.state_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateTaxSortDirection (boolean ascending) {
    this.StateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateTax (ADJ_TAX.state_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateTaxSortDirection () {
    return this.StateTaxSortAscending;
  }
  /** Set the field level filters for field: StateTax (ADJ_TAX.state_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StateTax = value;
  }
  /** Retrieve filter for field: StateTax (ADJ_TAX.state_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStateTaxFilter () {
    return this.StateTax;
  }

  /**
   * Retrieves the StateTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTaxFilter field
   */
  public String[] getStateTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StateTaxFilter filter value from a formatted string
   *
   * @param _value the StateTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateTaxFilter filter field
   */
  public void setStateTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFilterFromFormattedString");
    try {
      this.setStateTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFilterFromFormattedString");
  }

  /**
   * Sets the StateTaxFilter filter value from a formatted string
   *
   * @param _value the StateTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateTaxFilter filter field
   */
  public void setStateTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFilterFromFormattedCurrencyString");
    try {
      this.setStateTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the StateTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTaxFilter field
   */

  public String[] getStateTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CountyTax (ADJ_TAX.county_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyTaxFetch (boolean fetch) {
    this.CountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyTax (ADJ_TAX.county_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyTaxFetch () {
    return this.CountyTaxFetch;
  }
  /** Set the SortOrder for field: CountyTax (ADJ_TAX.county_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyTaxSortOrder (Integer value) {
    this.CountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: CountyTax (ADJ_TAX.county_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyTaxSortOrder () {
    return this.CountyTaxSort;
  }
  /** Set the sort direction for field: CountyTax (ADJ_TAX.county_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyTaxSortDirection (boolean ascending) {
    this.CountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyTax (ADJ_TAX.county_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyTaxSortDirection () {
    return this.CountyTaxSortAscending;
  }
  /** Set the field level filters for field: CountyTax (ADJ_TAX.county_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CountyTax = value;
  }
  /** Retrieve filter for field: CountyTax (ADJ_TAX.county_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCountyTaxFilter () {
    return this.CountyTax;
  }

  /**
   * Retrieves the CountyTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTaxFilter field
   */
  public String[] getCountyTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountyTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountyTaxFilter filter value from a formatted string
   *
   * @param _value the CountyTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountyTaxFilter filter field
   */
  public void setCountyTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFilterFromFormattedString");
    try {
      this.setCountyTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFilterFromFormattedString");
  }

  /**
   * Sets the CountyTaxFilter filter value from a formatted string
   *
   * @param _value the CountyTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountyTaxFilter filter field
   */
  public void setCountyTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFilterFromFormattedCurrencyString");
    try {
      this.setCountyTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CountyTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTaxFilter field
   */

  public String[] getCountyTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountyTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CityTax (ADJ_TAX.city_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCityTaxFetch (boolean fetch) {
    this.CityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityTax (ADJ_TAX.city_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityTaxFetch () {
    return this.CityTaxFetch;
  }
  /** Set the SortOrder for field: CityTax (ADJ_TAX.city_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityTaxSortOrder (Integer value) {
    this.CityTaxSort = value;
  }
  /** Retrieve SortOrder for field: CityTax (ADJ_TAX.city_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityTaxSortOrder () {
    return this.CityTaxSort;
  }
  /** Set the sort direction for field: CityTax (ADJ_TAX.city_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityTaxSortDirection (boolean ascending) {
    this.CityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityTax (ADJ_TAX.city_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityTaxSortDirection () {
    return this.CityTaxSortAscending;
  }
  /** Set the field level filters for field: CityTax (ADJ_TAX.city_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CityTax = value;
  }
  /** Retrieve filter for field: CityTax (ADJ_TAX.city_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCityTaxFilter () {
    return this.CityTax;
  }

  /**
   * Retrieves the CityTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTaxFilter field
   */
  public String[] getCityTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCityTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CityTaxFilter filter value from a formatted string
   *
   * @param _value the CityTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CityTaxFilter filter field
   */
  public void setCityTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFilterFromFormattedString");
    try {
      this.setCityTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFilterFromFormattedString");
  }

  /**
   * Sets the CityTaxFilter filter value from a formatted string
   *
   * @param _value the CityTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CityTaxFilter filter field
   */
  public void setCityTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFilterFromFormattedCurrencyString");
    try {
      this.setCityTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CityTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTaxFilter field
   */

  public String[] getCityTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCityTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: OtherTax (ADJ_TAX.other_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setOtherTaxFetch (boolean fetch) {
    this.OtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: OtherTax (ADJ_TAX.other_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getOtherTaxFetch () {
    return this.OtherTaxFetch;
  }
  /** Set the SortOrder for field: OtherTax (ADJ_TAX.other_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOtherTaxSortOrder (Integer value) {
    this.OtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: OtherTax (ADJ_TAX.other_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOtherTaxSortOrder () {
    return this.OtherTaxSort;
  }
  /** Set the sort direction for field: OtherTax (ADJ_TAX.other_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOtherTaxSortDirection (boolean ascending) {
    this.OtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OtherTax (ADJ_TAX.other_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOtherTaxSortDirection () {
    return this.OtherTaxSortAscending;
  }
  /** Set the field level filters for field: OtherTax (ADJ_TAX.other_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OtherTax = value;
  }
  /** Retrieve filter for field: OtherTax (ADJ_TAX.other_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOtherTaxFilter () {
    return this.OtherTax;
  }

  /**
   * Retrieves the OtherTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTaxFilter field
   */
  public String[] getOtherTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOtherTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OtherTaxFilter filter value from a formatted string
   *
   * @param _value the OtherTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OtherTaxFilter filter field
   */
  public void setOtherTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFilterFromFormattedString");
    try {
      this.setOtherTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFilterFromFormattedString");
  }

  /**
   * Sets the OtherTaxFilter filter value from a formatted string
   *
   * @param _value the OtherTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OtherTaxFilter filter field
   */
  public void setOtherTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFilterFromFormattedCurrencyString");
    try {
      this.setOtherTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the OtherTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTaxFilter field
   */

  public String[] getOtherTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOtherTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: ArchFlag (ADJ_TAX.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (ADJ_TAX.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (ADJ_TAX.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (ADJ_TAX.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (ADJ_TAX.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (ADJ_TAX.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (ADJ_TAX.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (ADJ_TAX.arch_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getArchFlagFilter () {
    return this.ArchFlag;
  }

  /**
   * Retrieves the ArchFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ArchFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlagFilter field
   */
  public String[] getArchFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getArchFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ArchFlagFilter filter value from a formatted string
   *
   * @param _value the ArchFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ArchFlagFilter filter field
   */
  public void setArchFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setArchFlagFilterFromFormattedString");
    try {
      this.setArchFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @param fetch whether to fetch this field or not
   */
  public void setAuxTaxInfoFetch (boolean fetch) {
    this.AuxTaxInfoFetch = fetch;
  }
  /** Retrieve Fetch value for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @return boolean the Fetch value for this field
   */
  public boolean getAuxTaxInfoFetch () {
    return this.AuxTaxInfoFetch;
  }
  /** Set the SortOrder for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAuxTaxInfoSortOrder (Integer value) {
    this.AuxTaxInfoSort = value;
  }
  /** Retrieve SortOrder for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAuxTaxInfoSortOrder () {
    return this.AuxTaxInfoSort;
  }
  /** Set the sort direction for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAuxTaxInfoSortDirection (boolean ascending) {
    this.AuxTaxInfoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAuxTaxInfoSortDirection () {
    return this.AuxTaxInfoSortAscending;
  }
  /** Set the case insensitive for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAuxTaxInfoCaseInsensitive (boolean ascending) {
    this.AuxTaxInfoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAuxTaxInfoCaseInsensitive () {
    return this.AuxTaxInfoCaseInsensitive;
  }
  /** Set the field level filters for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAuxTaxInfoFilter (StringFilter[] value) throws ServiceException {
    this.AuxTaxInfo = value;
  }
  /** Retrieve filter for field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAuxTaxInfoFilter () {
    return this.AuxTaxInfo;
  }

  /**
   * Retrieves the AuxTaxInfoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AuxTaxInfoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AuxTaxInfoFilter field
   */
  public String[] getAuxTaxInfoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAuxTaxInfoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAuxTaxInfoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AuxTaxInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAuxTaxInfoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AuxTaxInfoFilter filter value from a formatted string
   *
   * @param _value the AuxTaxInfoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AuxTaxInfoFilter filter field
   */
  public void setAuxTaxInfoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAuxTaxInfoFilterFromFormattedString");
    try {
      this.setAuxTaxInfoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AuxTaxInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAuxTaxInfoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAuxTaxInfoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (ADJ_TAX.tax_type_code)
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

  public String toString() {
    return AdjustmentTaxObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AdjustmentTaxObjectHelper.toMap(this, null);
  }
}
