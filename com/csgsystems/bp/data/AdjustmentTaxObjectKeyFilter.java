/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTaxObjectKeyFilter.java
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

/** Key Filter for AdjustmentTaxObject object. */
public class AdjustmentTaxObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: ADJ_TAX.tracking_id) */
  public    IntegerFilter[] TrackingId  = null;
  protected boolean TrackingIdFetch = false;
  protected boolean TrackingIdSortAscending = true;
  protected Integer TrackingIdSort = null;
  /** raw field for: ADJ_TAX.tracking_id_serv) */
  public    IntegerFilter[] TrackingIdServ  = null;
  protected boolean TrackingIdServFetch = false;
  protected boolean TrackingIdServSortAscending = true;
  protected Integer TrackingIdServSort = null;
  /** raw field for: ADJ_TAX.tax_pkg_inst_id) */
  public    IntegerFilter[] TaxPkgInstId  = null;
  protected boolean TaxPkgInstIdFetch = false;
  protected boolean TaxPkgInstIdSortAscending = true;
  protected Integer TaxPkgInstIdSort = null;
  /** raw field for: ADJ_TAX.geocode) */
  public    StringFilter[] Geocode  = null;
  protected boolean GeocodeFetch = false;
  protected boolean GeocodeSortAscending = true;
  protected boolean GeocodeCaseInsensitive = false;
  protected Integer GeocodeSort = null;
  private String _objName = "AdjustmentTaxObjectKeyFilter";
  /** default constructor */
  public AdjustmentTaxObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public AdjustmentTaxObjectKeyFilter (AdjustmentTaxObjectKeyFilter other)
  {
    if (other == null) return;
    this.TrackingId = other.TrackingId;
    this.TrackingIdFetch = other.TrackingIdFetch;
    this.TrackingIdSort = other.TrackingIdSort;
    this.TrackingIdSortAscending = other.TrackingIdSortAscending;
    this.TrackingIdServ = other.TrackingIdServ;
    this.TrackingIdServFetch = other.TrackingIdServFetch;
    this.TrackingIdServSort = other.TrackingIdServSort;
    this.TrackingIdServSortAscending = other.TrackingIdServSortAscending;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this.TaxPkgInstIdFetch = other.TaxPkgInstIdFetch;
    this.TaxPkgInstIdSort = other.TaxPkgInstIdSort;
    this.TaxPkgInstIdSortAscending = other.TaxPkgInstIdSortAscending;
    this.Geocode = other.Geocode;
    this.GeocodeFetch = other.GeocodeFetch;
    this.GeocodeSort = other.GeocodeSort;
    this.GeocodeCaseInsensitive = other.GeocodeCaseInsensitive;
    this.GeocodeSortAscending = other.GeocodeSortAscending;
  }
  /** Set the field level Fetch value for field: TrackingId (ADJ_TAX.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch) {
    this.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (ADJ_TAX.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch () {
    return this.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (ADJ_TAX.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value) {
    this.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (ADJ_TAX.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder () {
    return this.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (ADJ_TAX.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending) {
    this.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (ADJ_TAX.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection () {
    return this.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (ADJ_TAX.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (ADJ_TAX.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter () {
    return this.TrackingId;
  }

  /**
   * Retrieves the TrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdFilter field
   */
  public String[] getTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdFilter filter value from a formatted string
   *
   * @param _value the TrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdFilter filter field
   */
  public void setTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdFilterFromFormattedString");
    try {
      this.setTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch) {
    this.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch () {
    return this.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value) {
    this.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder () {
    return this.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending) {
    this.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection () {
    return this.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter () {
    return this.TrackingIdServ;
  }

  /**
   * Retrieves the TrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServFilter field
   */
  public String[] getTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdServFilter filter value from a formatted string
   *
   * @param _value the TrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdServFilter filter field
   */
  public void setTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdServFilterFromFormattedString");
    try {
      this.setTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch) {
    this.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch () {
    return this.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value) {
    this.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder () {
    return this.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending) {
    this.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection () {
    return this.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
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

  /** Set the field level Fetch value for field: Geocode (ADJ_TAX.geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setGeocodeFetch (boolean fetch) {
    this.GeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Geocode (ADJ_TAX.geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeocodeFetch () {
    return this.GeocodeFetch;
  }
  /** Set the SortOrder for field: Geocode (ADJ_TAX.geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeocodeSortOrder (Integer value) {
    this.GeocodeSort = value;
  }
  /** Retrieve SortOrder for field: Geocode (ADJ_TAX.geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeocodeSortOrder () {
    return this.GeocodeSort;
  }
  /** Set the sort direction for field: Geocode (ADJ_TAX.geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeocodeSortDirection (boolean ascending) {
    this.GeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Geocode (ADJ_TAX.geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeocodeSortDirection () {
    return this.GeocodeSortAscending;
  }
  /** Set the case insensitive for field: Geocode (ADJ_TAX.geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeocodeCaseInsensitive (boolean ascending) {
    this.GeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Geocode (ADJ_TAX.geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGeocodeCaseInsensitive () {
    return this.GeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: Geocode (ADJ_TAX.geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.Geocode = value;
  }
  /** Retrieve filter for field: Geocode (ADJ_TAX.geocode)
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

  public String toString() {
    return AdjustmentTaxObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AdjustmentTaxObjectKeyHelper.toMap(this, null);
  }
}
