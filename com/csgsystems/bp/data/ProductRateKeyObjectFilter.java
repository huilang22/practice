/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRateKeyObjectFilter.java
 * Definition File: Customer/ProductRateKey.xml
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
public class ProductRateKeyObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ProductRateKeyObjectKeyFilter Key = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_jurisdiction) */
  public    BooleanFilter[] RateJurisdiction  = null;
  protected boolean RateJurisdictionFetch = false;
  protected boolean RateJurisdictionSortAscending = true;
  protected Integer RateJurisdictionSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_units) */
  public    BooleanFilter[] RateUnits  = null;
  protected boolean RateUnitsFetch = false;
  protected boolean RateUnitsSortAscending = true;
  protected Integer RateUnitsSort = null;
  /** raw field for: PRODUCT_RATE_KEY.origin_location_code) */
  public    IntegerFilter[] OriginLocationCode  = null;
  protected boolean OriginLocationCodeFetch = false;
  protected boolean OriginLocationCodeSortAscending = true;
  protected Integer OriginLocationCodeSort = null;
  /** raw field for: PRODUCT_RATE_KEY.target_location_code) */
  public    IntegerFilter[] TargetLocationCode  = null;
  protected boolean TargetLocationCodeFetch = false;
  protected boolean TargetLocationCodeSortAscending = true;
  protected Integer TargetLocationCodeSort = null;
  /** raw field for: PRODUCT_RATE_KEY.jurisdiction) */
  public    IntegerFilter[] Jurisdiction  = null;
  protected boolean JurisdictionFetch = false;
  protected boolean JurisdictionSortAscending = true;
  protected Integer JurisdictionSort = null;
  /** raw field for: PRODUCT_RATE_KEY.units) */
  public    IntegerFilter[] Units  = null;
  protected boolean UnitsFetch = false;
  protected boolean UnitsSortAscending = true;
  protected Integer UnitsSort = null;
  /** raw field for: PRODUCT_RATE_KEY.units_type) */
  public    IntegerFilter[] UnitsType  = null;
  protected boolean UnitsTypeFetch = false;
  protected boolean UnitsTypeSortAscending = true;
  protected Integer UnitsTypeSort = null;
  /** raw field for: PRODUCT_RATE_KEY.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: PRODUCT_RATE_KEY.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: PRODUCT_RATE_KEY.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: PRODUCT_RATE_KEY.cost) */
  public    BigIntegerFilter[] Cost  = null;
  protected boolean CostFetch = false;
  protected boolean CostSortAscending = true;
  protected Integer CostSort = null;
  private String _objName = "ProductRateKeyObjectFilter";
  /** default constructor */
  public ProductRateKeyObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ProductRateKeyObjectFilter (ProductRateKeyObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ProductRateKeyObjectKeyFilter (other.Key);
    this.RateJurisdiction = other.RateJurisdiction;
    this.RateJurisdictionFetch = other.RateJurisdictionFetch;
    this.RateJurisdictionSort = other.RateJurisdictionSort;
    this.RateJurisdictionSortAscending = other.RateJurisdictionSortAscending;
    this.RateUnits = other.RateUnits;
    this.RateUnitsFetch = other.RateUnitsFetch;
    this.RateUnitsSort = other.RateUnitsSort;
    this.RateUnitsSortAscending = other.RateUnitsSortAscending;
    this.OriginLocationCode = other.OriginLocationCode;
    this.OriginLocationCodeFetch = other.OriginLocationCodeFetch;
    this.OriginLocationCodeSort = other.OriginLocationCodeSort;
    this.OriginLocationCodeSortAscending = other.OriginLocationCodeSortAscending;
    this.TargetLocationCode = other.TargetLocationCode;
    this.TargetLocationCodeFetch = other.TargetLocationCodeFetch;
    this.TargetLocationCodeSort = other.TargetLocationCodeSort;
    this.TargetLocationCodeSortAscending = other.TargetLocationCodeSortAscending;
    this.Jurisdiction = other.Jurisdiction;
    this.JurisdictionFetch = other.JurisdictionFetch;
    this.JurisdictionSort = other.JurisdictionSort;
    this.JurisdictionSortAscending = other.JurisdictionSortAscending;
    this.Units = other.Units;
    this.UnitsFetch = other.UnitsFetch;
    this.UnitsSort = other.UnitsSort;
    this.UnitsSortAscending = other.UnitsSortAscending;
    this.UnitsType = other.UnitsType;
    this.UnitsTypeFetch = other.UnitsTypeFetch;
    this.UnitsTypeSort = other.UnitsTypeSort;
    this.UnitsTypeSortAscending = other.UnitsTypeSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.Cost = other.Cost;
    this.CostFetch = other.CostFetch;
    this.CostSort = other.CostSort;
    this.CostSortAscending = other.CostSortAscending;  }
  /** get the filter for this object's key
   * @return ProductRateKeyObjectKeyFilter
   */
  public ProductRateKeyObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ProductRateKeyObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyFilter ();
    this.Key.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDtFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDt;
  }
  /** Set the field level Fetch value for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setRateJurisdictionFetch (boolean fetch) {
    this.RateJurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateJurisdictionFetch () {
    return this.RateJurisdictionFetch;
  }
  /** Set the SortOrder for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateJurisdictionSortOrder (Integer value) {
    this.RateJurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateJurisdictionSortOrder () {
    return this.RateJurisdictionSort;
  }
  /** Set the sort direction for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateJurisdictionSortDirection (boolean ascending) {
    this.RateJurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateJurisdictionSortDirection () {
    return this.RateJurisdictionSortAscending;
  }
  /** Set the field level filters for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateJurisdictionFilter (BooleanFilter[] value) throws ServiceException {
    this.RateJurisdiction = value;
  }
  /** Retrieve filter for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateJurisdictionFilter () {
    return this.RateJurisdiction;
  }

  /**
   * Retrieves the RateJurisdictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateJurisdictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateJurisdictionFilter field
   */
  public String[] getRateJurisdictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateJurisdictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateJurisdictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateJurisdictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateJurisdictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateJurisdictionFilter filter value from a formatted string
   *
   * @param _value the RateJurisdictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateJurisdictionFilter filter field
   */
  public void setRateJurisdictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateJurisdictionFilterFromFormattedString");
    try {
      this.setRateJurisdictionFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateJurisdictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateJurisdictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @param fetch whether to fetch this field or not
   */
  public void setRateUnitsFetch (boolean fetch) {
    this.RateUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateUnitsFetch () {
    return this.RateUnitsFetch;
  }
  /** Set the SortOrder for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateUnitsSortOrder (Integer value) {
    this.RateUnitsSort = value;
  }
  /** Retrieve SortOrder for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateUnitsSortOrder () {
    return this.RateUnitsSort;
  }
  /** Set the sort direction for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateUnitsSortDirection (boolean ascending) {
    this.RateUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateUnitsSortDirection () {
    return this.RateUnitsSortAscending;
  }
  /** Set the field level filters for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateUnitsFilter (BooleanFilter[] value) throws ServiceException {
    this.RateUnits = value;
  }
  /** Retrieve filter for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateUnitsFilter () {
    return this.RateUnits;
  }

  /**
   * Retrieves the RateUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateUnitsFilter field
   */
  public String[] getRateUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateUnitsFilter filter value from a formatted string
   *
   * @param _value the RateUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateUnitsFilter filter field
   */
  public void setRateUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateUnitsFilterFromFormattedString");
    try {
      this.setRateUnitsFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @param fetch whether to fetch this field or not
   */
  public void setOriginLocationCodeFetch (boolean fetch) {
    this.OriginLocationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getOriginLocationCodeFetch () {
    return this.OriginLocationCodeFetch;
  }
  /** Set the SortOrder for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOriginLocationCodeSortOrder (Integer value) {
    this.OriginLocationCodeSort = value;
  }
  /** Retrieve SortOrder for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOriginLocationCodeSortOrder () {
    return this.OriginLocationCodeSort;
  }
  /** Set the sort direction for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOriginLocationCodeSortDirection (boolean ascending) {
    this.OriginLocationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOriginLocationCodeSortDirection () {
    return this.OriginLocationCodeSortAscending;
  }
  /** Set the field level filters for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOriginLocationCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.OriginLocationCode = value;
  }
  /** Retrieve filter for field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOriginLocationCodeFilter () {
    return this.OriginLocationCode;
  }

  /**
   * Retrieves the OriginLocationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OriginLocationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginLocationCodeFilter field
   */
  public String[] getOriginLocationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginLocationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOriginLocationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginLocationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginLocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginLocationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OriginLocationCodeFilter filter value from a formatted string
   *
   * @param _value the OriginLocationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OriginLocationCodeFilter filter field
   */
  public void setOriginLocationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOriginLocationCodeFilterFromFormattedString");
    try {
      this.setOriginLocationCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginLocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginLocationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginLocationCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTargetLocationCodeFetch (boolean fetch) {
    this.TargetLocationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTargetLocationCodeFetch () {
    return this.TargetLocationCodeFetch;
  }
  /** Set the SortOrder for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTargetLocationCodeSortOrder (Integer value) {
    this.TargetLocationCodeSort = value;
  }
  /** Retrieve SortOrder for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTargetLocationCodeSortOrder () {
    return this.TargetLocationCodeSort;
  }
  /** Set the sort direction for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTargetLocationCodeSortDirection (boolean ascending) {
    this.TargetLocationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTargetLocationCodeSortDirection () {
    return this.TargetLocationCodeSortAscending;
  }
  /** Set the field level filters for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTargetLocationCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TargetLocationCode = value;
  }
  /** Retrieve filter for field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTargetLocationCodeFilter () {
    return this.TargetLocationCode;
  }

  /**
   * Retrieves the TargetLocationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TargetLocationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetLocationCodeFilter field
   */
  public String[] getTargetLocationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetLocationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTargetLocationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetLocationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetLocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetLocationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TargetLocationCodeFilter filter value from a formatted string
   *
   * @param _value the TargetLocationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TargetLocationCodeFilter filter field
   */
  public void setTargetLocationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTargetLocationCodeFilterFromFormattedString");
    try {
      this.setTargetLocationCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TargetLocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetLocationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetLocationCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setJurisdictionFetch (boolean fetch) {
    this.JurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getJurisdictionFetch () {
    return this.JurisdictionFetch;
  }
  /** Set the SortOrder for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setJurisdictionSortOrder (Integer value) {
    this.JurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getJurisdictionSortOrder () {
    return this.JurisdictionSort;
  }
  /** Set the sort direction for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setJurisdictionSortDirection (boolean ascending) {
    this.JurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getJurisdictionSortDirection () {
    return this.JurisdictionSortAscending;
  }
  /** Set the field level filters for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setJurisdictionFilter (IntegerFilter[] value) throws ServiceException {
    this.Jurisdiction = value;
  }
  /** Retrieve filter for field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getJurisdictionFilter () {
    return this.Jurisdiction;
  }

  /**
   * Retrieves the JurisdictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The JurisdictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the JurisdictionFilter field
   */
  public String[] getJurisdictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getJurisdictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the JurisdictionFilter filter value from a formatted string
   *
   * @param _value the JurisdictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the JurisdictionFilter filter field
   */
  public void setJurisdictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFilterFromFormattedString");
    try {
      this.setJurisdictionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJurisdictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Units (PRODUCT_RATE_KEY.units)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsFetch (boolean fetch) {
    this.UnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: Units (PRODUCT_RATE_KEY.units)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsFetch () {
    return this.UnitsFetch;
  }
  /** Set the SortOrder for field: Units (PRODUCT_RATE_KEY.units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsSortOrder (Integer value) {
    this.UnitsSort = value;
  }
  /** Retrieve SortOrder for field: Units (PRODUCT_RATE_KEY.units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsSortOrder () {
    return this.UnitsSort;
  }
  /** Set the sort direction for field: Units (PRODUCT_RATE_KEY.units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsSortDirection (boolean ascending) {
    this.UnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Units (PRODUCT_RATE_KEY.units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsSortDirection () {
    return this.UnitsSortAscending;
  }
  /** Set the field level filters for field: Units (PRODUCT_RATE_KEY.units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.Units = value;
  }
  /** Retrieve filter for field: Units (PRODUCT_RATE_KEY.units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsFilter () {
    return this.Units;
  }

  /**
   * Retrieves the UnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsFilter field
   */
  public String[] getUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsFilter filter value from a formatted string
   *
   * @param _value the UnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsFilter filter field
   */
  public void setUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsFilterFromFormattedString");
    try {
      this.setUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsTypeFetch (boolean fetch) {
    this.UnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsTypeFetch () {
    return this.UnitsTypeFetch;
  }
  /** Set the SortOrder for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsTypeSortOrder (Integer value) {
    this.UnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsTypeSortOrder () {
    return this.UnitsTypeSort;
  }
  /** Set the sort direction for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsTypeSortDirection (boolean ascending) {
    this.UnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsTypeSortDirection () {
    return this.UnitsTypeSortAscending;
  }
  /** Set the field level filters for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitsType = value;
  }
  /** Retrieve filter for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsTypeFilter () {
    return this.UnitsType;
  }

  /**
   * Retrieves the UnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsTypeFilter field
   */
  public String[] getUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsTypeFilter filter value from a formatted string
   *
   * @param _value the UnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsTypeFilter filter field
   */
  public void setUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsTypeFilterFromFormattedString");
    try {
      this.setUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (PRODUCT_RATE_KEY.chg_who)
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

  /** Set the field level Fetch value for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDtFilter () {
    return this.InactiveDt;
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: Cost (PRODUCT_RATE_KEY.cost)
   * @param fetch whether to fetch this field or not
   */
  public void setCostFetch (boolean fetch) {
    this.CostFetch = fetch;
  }
  /** Retrieve Fetch value for field: Cost (PRODUCT_RATE_KEY.cost)
   * @return boolean the Fetch value for this field
   */
  public boolean getCostFetch () {
    return this.CostFetch;
  }
  /** Set the SortOrder for field: Cost (PRODUCT_RATE_KEY.cost)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCostSortOrder (Integer value) {
    this.CostSort = value;
  }
  /** Retrieve SortOrder for field: Cost (PRODUCT_RATE_KEY.cost)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCostSortOrder () {
    return this.CostSort;
  }
  /** Set the sort direction for field: Cost (PRODUCT_RATE_KEY.cost)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCostSortDirection (boolean ascending) {
    this.CostSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Cost (PRODUCT_RATE_KEY.cost)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCostSortDirection () {
    return this.CostSortAscending;
  }
  /** Set the field level filters for field: Cost (PRODUCT_RATE_KEY.cost)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCostFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Cost = value;
  }
  /** Retrieve filter for field: Cost (PRODUCT_RATE_KEY.cost)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCostFilter () {
    return this.Cost;
  }

  /**
   * Retrieves the CostFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CostFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CostFilter field
   */
  public String[] getCostFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCostFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCostFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCostFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CostFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCostFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CostFilter filter value from a formatted string
   *
   * @param _value the CostFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CostFilter filter field
   */
  public void setCostFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCostFilterFromFormattedString");
    try {
      this.setCostFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CostFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCostFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCostFilterFromFormattedString");
  }

  /**
   * Sets the CostFilter filter value from a formatted string
   *
   * @param _value the CostFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CostFilter filter field
   */
  public void setCostFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCostFilterFromFormattedCurrencyString");
    try {
      this.setCostFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CostFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCostFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCostFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CostFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CostFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CostFilter field
   */

  public String[] getCostFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCostFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCostFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCostFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CostFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCostFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  public String toString() {
    return ProductRateKeyObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ProductRateKeyObjectHelper.toMap(this, null);
  }
}
