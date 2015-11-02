/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqContractUnitCrObjectFilter.java
 * Definition File: Catalog/HqContractUnitCr.xml
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
public class HqContractUnitCrObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HqContractUnitCrObjectKeyFilter Key = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.total_units) */
  public    IntegerFilter[] TotalUnits  = null;
  protected boolean TotalUnitsFetch = false;
  protected boolean TotalUnitsSortAscending = true;
  protected Integer TotalUnitsSort = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.avail_units) */
  public    IntegerFilter[] AvailUnits  = null;
  protected boolean AvailUnitsFetch = false;
  protected boolean AvailUnitsSortAscending = true;
  protected Integer AvailUnitsSort = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.total_amount) */
  public    IntegerFilter[] TotalAmount  = null;
  protected boolean TotalAmountFetch = false;
  protected boolean TotalAmountSortAscending = true;
  protected Integer TotalAmountSort = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.avail_amount) */
  public    IntegerFilter[] AvailAmount  = null;
  protected boolean AvailAmountFetch = false;
  protected boolean AvailAmountSortAscending = true;
  protected Integer AvailAmountSort = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: HQ_CONTRACT_UNIT_CR.no_bill) */
  public    IntegerFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  private String _objName = "HqContractUnitCrObjectFilter";
  /** default constructor */
  public HqContractUnitCrObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HqContractUnitCrObjectFilter (HqContractUnitCrObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HqContractUnitCrObjectKeyFilter (other.Key);
    this.TotalUnits = other.TotalUnits;
    this.TotalUnitsFetch = other.TotalUnitsFetch;
    this.TotalUnitsSort = other.TotalUnitsSort;
    this.TotalUnitsSortAscending = other.TotalUnitsSortAscending;
    this.AvailUnits = other.AvailUnits;
    this.AvailUnitsFetch = other.AvailUnitsFetch;
    this.AvailUnitsSort = other.AvailUnitsSort;
    this.AvailUnitsSortAscending = other.AvailUnitsSortAscending;
    this.TotalAmount = other.TotalAmount;
    this.TotalAmountFetch = other.TotalAmountFetch;
    this.TotalAmountSort = other.TotalAmountSort;
    this.TotalAmountSortAscending = other.TotalAmountSortAscending;
    this.AvailAmount = other.AvailAmount;
    this.AvailAmountFetch = other.AvailAmountFetch;
    this.AvailAmountSort = other.AvailAmountSort;
    this.AvailAmountSortAscending = other.AvailAmountSortAscending;
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;  }
  /** get the filter for this object's key
   * @return HqContractUnitCrObjectKeyFilter
   */
  public HqContractUnitCrObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HqContractUnitCrObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitCrIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.UnitCrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitCrIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.UnitCrIdFetch;
  }
  /** Set the SortOrder for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitCrIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.UnitCrIdSort = value;
  }
  /** Retrieve SortOrder for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitCrIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.UnitCrIdSort;
  }
  /** Set the sort direction for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitCrIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.UnitCrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitCrIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.UnitCrIdSortAscending;
  }
  /** Set the field level filters for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitCrIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HqContractUnitCrObjectKeyFilter ();
    this.Key.UnitCrId = value;
  }
  /** Retrieve filter for field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitCrIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.UnitCrId;
  }
  /** Set the field level Fetch value for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalUnitsFetch (boolean fetch) {
    this.TotalUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalUnitsFetch () {
    return this.TotalUnitsFetch;
  }
  /** Set the SortOrder for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalUnitsSortOrder (Integer value) {
    this.TotalUnitsSort = value;
  }
  /** Retrieve SortOrder for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalUnitsSortOrder () {
    return this.TotalUnitsSort;
  }
  /** Set the sort direction for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalUnitsSortDirection (boolean ascending) {
    this.TotalUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalUnitsSortDirection () {
    return this.TotalUnitsSortAscending;
  }
  /** Set the field level filters for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.TotalUnits = value;
  }
  /** Retrieve filter for field: TotalUnits (HQ_CONTRACT_UNIT_CR.total_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTotalUnitsFilter () {
    return this.TotalUnits;
  }

  /**
   * Retrieves the TotalUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalUnitsFilter field
   */
  public String[] getTotalUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalUnitsFilter filter value from a formatted string
   *
   * @param _value the TotalUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalUnitsFilter filter field
   */
  public void setTotalUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalUnitsFilterFromFormattedString");
    try {
      this.setTotalUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @param fetch whether to fetch this field or not
   */
  public void setAvailUnitsFetch (boolean fetch) {
    this.AvailUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getAvailUnitsFetch () {
    return this.AvailUnitsFetch;
  }
  /** Set the SortOrder for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAvailUnitsSortOrder (Integer value) {
    this.AvailUnitsSort = value;
  }
  /** Retrieve SortOrder for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAvailUnitsSortOrder () {
    return this.AvailUnitsSort;
  }
  /** Set the sort direction for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAvailUnitsSortDirection (boolean ascending) {
    this.AvailUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAvailUnitsSortDirection () {
    return this.AvailUnitsSortAscending;
  }
  /** Set the field level filters for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAvailUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.AvailUnits = value;
  }
  /** Retrieve filter for field: AvailUnits (HQ_CONTRACT_UNIT_CR.avail_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAvailUnitsFilter () {
    return this.AvailUnits;
  }

  /**
   * Retrieves the AvailUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AvailUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvailUnitsFilter field
   */
  public String[] getAvailUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAvailUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvailUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvailUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvailUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AvailUnitsFilter filter value from a formatted string
   *
   * @param _value the AvailUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AvailUnitsFilter filter field
   */
  public void setAvailUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAvailUnitsFilterFromFormattedString");
    try {
      this.setAvailUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvailUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvailUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvailUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalAmountFetch (boolean fetch) {
    this.TotalAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalAmountFetch () {
    return this.TotalAmountFetch;
  }
  /** Set the SortOrder for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalAmountSortOrder (Integer value) {
    this.TotalAmountSort = value;
  }
  /** Retrieve SortOrder for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalAmountSortOrder () {
    return this.TotalAmountSort;
  }
  /** Set the sort direction for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalAmountSortDirection (boolean ascending) {
    this.TotalAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalAmountSortDirection () {
    return this.TotalAmountSortAscending;
  }
  /** Set the field level filters for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalAmountFilter (IntegerFilter[] value) throws ServiceException {
    this.TotalAmount = value;
  }
  /** Retrieve filter for field: TotalAmount (HQ_CONTRACT_UNIT_CR.total_amount)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTotalAmountFilter () {
    return this.TotalAmount;
  }

  /**
   * Retrieves the TotalAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmountFilter field
   */
  public String[] getTotalAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAmountFilter filter value from a formatted string
   *
   * @param _value the TotalAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAmountFilter filter field
   */
  public void setTotalAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAmountFilterFromFormattedString");
    try {
      this.setTotalAmountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAvailAmountFetch (boolean fetch) {
    this.AvailAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAvailAmountFetch () {
    return this.AvailAmountFetch;
  }
  /** Set the SortOrder for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAvailAmountSortOrder (Integer value) {
    this.AvailAmountSort = value;
  }
  /** Retrieve SortOrder for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAvailAmountSortOrder () {
    return this.AvailAmountSort;
  }
  /** Set the sort direction for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAvailAmountSortDirection (boolean ascending) {
    this.AvailAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAvailAmountSortDirection () {
    return this.AvailAmountSortAscending;
  }
  /** Set the field level filters for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAvailAmountFilter (IntegerFilter[] value) throws ServiceException {
    this.AvailAmount = value;
  }
  /** Retrieve filter for field: AvailAmount (HQ_CONTRACT_UNIT_CR.avail_amount)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAvailAmountFilter () {
    return this.AvailAmount;
  }

  /**
   * Retrieves the AvailAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AvailAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvailAmountFilter field
   */
  public String[] getAvailAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAvailAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvailAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvailAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvailAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AvailAmountFilter filter value from a formatted string
   *
   * @param _value the AvailAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AvailAmountFilter filter field
   */
  public void setAvailAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAvailAmountFilterFromFormattedString");
    try {
      this.setAvailAmountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvailAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvailAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvailAmountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (HQ_CONTRACT_UNIT_CR.create_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (HQ_CONTRACT_UNIT_CR.inactive_dt)
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


  /** Set the field level Fetch value for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (HQ_CONTRACT_UNIT_CR.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (IntegerFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (HQ_CONTRACT_UNIT_CR.no_bill)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNoBillFilter () {
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
      this.setNoBillFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFilterFromFormattedString");
  }

  public String toString() {
    return HqContractUnitCrObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HqContractUnitCrObjectHelper.toMap(this, null);
  }
}
