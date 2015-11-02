/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CRBOObjectFilter.java
 * Definition File: Admin/CorridorRateBandOverride.xml
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
public class CRBOObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CRBOObjectKeyFilter Key = null;
  /** raw field for: RATE_USAGE_BANDS_OVERRIDES.unit_rate) */
  public    IntegerFilter[] UnitRate  = null;
  protected boolean UnitRateFetch = false;
  protected boolean UnitRateSortAscending = true;
  protected Integer UnitRateSort = null;
  /** raw field for: RATE_USAGE_BANDS_OVERRIDES.num_units) */
  public    BigIntegerFilter[] NumUnits  = null;
  protected boolean NumUnitsFetch = false;
  protected boolean NumUnitsSortAscending = true;
  protected Integer NumUnitsSort = null;
  /** raw field for: RATE_USAGE_BANDS_OVERRIDES.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "CRBOObjectFilter";
  /** default constructor */
  public CRBOObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CRBOObjectFilter (CRBOObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CRBOObjectKeyFilter (other.Key);
    this.UnitRate = other.UnitRate;
    this.UnitRateFetch = other.UnitRateFetch;
    this.UnitRateSort = other.UnitRateSort;
    this.UnitRateSortAscending = other.UnitRateSortAscending;
    this.NumUnits = other.NumUnits;
    this.NumUnitsFetch = other.NumUnitsFetch;
    this.NumUnitsSort = other.NumUnitsSort;
    this.NumUnitsSortAscending = other.NumUnitsSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return CRBOObjectKeyFilter
   */
  public CRBOObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CRBOObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @param fetch whether to fetch this field or not
   */
  public void setSeqnumFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.SeqnumFetch = fetch;
  }
  /** Retrieve Fetch value for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return boolean the Fetch value for this field
   */
  public boolean getSeqnumFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SeqnumFetch;
  }
  /** Set the SortOrder for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSeqnumSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.SeqnumSort = value;
  }
  /** Retrieve SortOrder for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSeqnumSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SeqnumSort;
  }
  /** Set the sort direction for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSeqnumSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.SeqnumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSeqnumSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SeqnumSortAscending;
  }
  /** Set the field level filters for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSeqnumFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.Seqnum = value;
  }
  /** Retrieve filter for field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSeqnumFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Seqnum;
  }
  /** Set the field level Fetch value for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @param fetch whether to fetch this field or not
   */
  public void setRatebandFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.RatebandFetch = fetch;
  }
  /** Retrieve Fetch value for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatebandFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RatebandFetch;
  }
  /** Set the SortOrder for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatebandSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.RatebandSort = value;
  }
  /** Retrieve SortOrder for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatebandSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RatebandSort;
  }
  /** Set the sort direction for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatebandSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.RatebandSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatebandSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RatebandSortAscending;
  }
  /** Set the field level filters for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatebandFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CRBOObjectKeyFilter ();
    this.Key.Rateband = value;
  }
  /** Retrieve filter for field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRatebandFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Rateband;
  }
  /** Set the field level Fetch value for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitRateFetch (boolean fetch) {
    this.UnitRateFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitRateFetch () {
    return this.UnitRateFetch;
  }
  /** Set the SortOrder for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitRateSortOrder (Integer value) {
    this.UnitRateSort = value;
  }
  /** Retrieve SortOrder for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitRateSortOrder () {
    return this.UnitRateSort;
  }
  /** Set the sort direction for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitRateSortDirection (boolean ascending) {
    this.UnitRateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitRateSortDirection () {
    return this.UnitRateSortAscending;
  }
  /** Set the field level filters for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitRateFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitRate = value;
  }
  /** Retrieve filter for field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitRateFilter () {
    return this.UnitRate;
  }

  /**
   * Retrieves the UnitRateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitRateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitRateFilter field
   */
  public String[] getUnitRateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitRateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitRateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitRateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitRateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitRateFilter filter value from a formatted string
   *
   * @param _value the UnitRateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitRateFilter filter field
   */
  public void setUnitRateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitRateFilterFromFormattedString");
    try {
      this.setUnitRateFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitRateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitRateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @param fetch whether to fetch this field or not
   */
  public void setNumUnitsFetch (boolean fetch) {
    this.NumUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getNumUnitsFetch () {
    return this.NumUnitsFetch;
  }
  /** Set the SortOrder for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNumUnitsSortOrder (Integer value) {
    this.NumUnitsSort = value;
  }
  /** Retrieve SortOrder for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNumUnitsSortOrder () {
    return this.NumUnitsSort;
  }
  /** Set the sort direction for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNumUnitsSortDirection (boolean ascending) {
    this.NumUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNumUnitsSortDirection () {
    return this.NumUnitsSortAscending;
  }
  /** Set the field level filters for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNumUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.NumUnits = value;
  }
  /** Retrieve filter for field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNumUnitsFilter () {
    return this.NumUnits;
  }

  /**
   * Retrieves the NumUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NumUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumUnitsFilter field
   */
  public String[] getNumUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNumUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NumUnitsFilter filter value from a formatted string
   *
   * @param _value the NumUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NumUnitsFilter filter field
   */
  public void setNumUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNumUnitsFilterFromFormattedString");
    try {
      this.setNumUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
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
    return CRBOObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CRBOObjectHelper.toMap(this, null);
  }
}
