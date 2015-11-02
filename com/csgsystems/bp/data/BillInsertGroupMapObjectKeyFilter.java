/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupMapObjectKeyFilter.java
 * Definition File: Admin/BillInsertGroupMap.xml
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

/** Key Filter for BillInsertGroupMapObject object. */
public class BillInsertGroupMapObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: BILL_INSERT_GROUPS.insert_grp_id) */
  public    IntegerFilter[] InsertGrpId  = null;
  protected boolean InsertGrpIdFetch = false;
  protected boolean InsertGrpIdSortAscending = true;
  protected Integer InsertGrpIdSort = null;
  /** raw field for: BILL_INSERT_GROUPS.insert_id) */
  public    IntegerFilter[] InsertId  = null;
  protected boolean InsertIdFetch = false;
  protected boolean InsertIdSortAscending = true;
  protected Integer InsertIdSort = null;
  /** raw field for: BILL_INSERT_GROUPS.geo_key) */
  public    StringFilter[] GeoKey  = null;
  protected boolean GeoKeyFetch = false;
  protected boolean GeoKeySortAscending = true;
  protected boolean GeoKeyCaseInsensitive = false;
  protected Integer GeoKeySort = null;
  /** raw field for: BILL_INSERT_GROUPS.mkt_code) */
  public    IntegerFilter[] MktCode  = null;
  protected boolean MktCodeFetch = false;
  protected boolean MktCodeSortAscending = true;
  protected Integer MktCodeSort = null;
  private String _objName = "BillInsertGroupMapObjectKeyFilter";
  /** default constructor */
  public BillInsertGroupMapObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public BillInsertGroupMapObjectKeyFilter (BillInsertGroupMapObjectKeyFilter other)
  {
    if (other == null) return;
    this.InsertGrpId = other.InsertGrpId;
    this.InsertGrpIdFetch = other.InsertGrpIdFetch;
    this.InsertGrpIdSort = other.InsertGrpIdSort;
    this.InsertGrpIdSortAscending = other.InsertGrpIdSortAscending;
    this.InsertId = other.InsertId;
    this.InsertIdFetch = other.InsertIdFetch;
    this.InsertIdSort = other.InsertIdSort;
    this.InsertIdSortAscending = other.InsertIdSortAscending;
    this.GeoKey = other.GeoKey;
    this.GeoKeyFetch = other.GeoKeyFetch;
    this.GeoKeySort = other.GeoKeySort;
    this.GeoKeyCaseInsensitive = other.GeoKeyCaseInsensitive;
    this.GeoKeySortAscending = other.GeoKeySortAscending;
    this.MktCode = other.MktCode;
    this.MktCodeFetch = other.MktCodeFetch;
    this.MktCodeSort = other.MktCodeSort;
    this.MktCodeSortAscending = other.MktCodeSortAscending;
  }
  /** Set the field level Fetch value for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertGrpIdFetch (boolean fetch) {
    this.InsertGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertGrpIdFetch () {
    return this.InsertGrpIdFetch;
  }
  /** Set the SortOrder for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertGrpIdSortOrder (Integer value) {
    this.InsertGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertGrpIdSortOrder () {
    return this.InsertGrpIdSort;
  }
  /** Set the sort direction for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertGrpIdSortDirection (boolean ascending) {
    this.InsertGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertGrpIdSortDirection () {
    return this.InsertGrpIdSortAscending;
  }
  /** Set the field level filters for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertGrpId = value;
  }
  /** Retrieve filter for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertGrpIdFilter () {
    return this.InsertGrpId;
  }

  /**
   * Retrieves the InsertGrpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InsertGrpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertGrpIdFilter field
   */
  public String[] getInsertGrpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInsertGrpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InsertGrpIdFilter filter value from a formatted string
   *
   * @param _value the InsertGrpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertGrpIdFilter filter field
   */
  public void setInsertGrpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
    try {
      this.setInsertGrpIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertIdFetch (boolean fetch) {
    this.InsertIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertIdFetch () {
    return this.InsertIdFetch;
  }
  /** Set the SortOrder for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertIdSortOrder (Integer value) {
    this.InsertIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertIdSortOrder () {
    return this.InsertIdSort;
  }
  /** Set the sort direction for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertIdSortDirection (boolean ascending) {
    this.InsertIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertIdSortDirection () {
    return this.InsertIdSortAscending;
  }
  /** Set the field level filters for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertIdFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertId = value;
  }
  /** Retrieve filter for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertIdFilter () {
    return this.InsertId;
  }

  /**
   * Retrieves the InsertIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InsertIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertIdFilter field
   */
  public String[] getInsertIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInsertIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InsertIdFilter filter value from a formatted string
   *
   * @param _value the InsertIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertIdFilter filter field
   */
  public void setInsertIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertIdFilterFromFormattedString");
    try {
      this.setInsertIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param fetch whether to fetch this field or not
   */
  public void setGeoKeyFetch (boolean fetch) {
    this.GeoKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeoKeyFetch () {
    return this.GeoKeyFetch;
  }
  /** Set the SortOrder for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeoKeySortOrder (Integer value) {
    this.GeoKeySort = value;
  }
  /** Retrieve SortOrder for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeoKeySortOrder () {
    return this.GeoKeySort;
  }
  /** Set the sort direction for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeoKeySortDirection (boolean ascending) {
    this.GeoKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeoKeySortDirection () {
    return this.GeoKeySortAscending;
  }
  /** Set the case insensitive for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeoKeyCaseInsensitive (boolean ascending) {
    this.GeoKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGeoKeyCaseInsensitive () {
    return this.GeoKeyCaseInsensitive;
  }
  /** Set the field level filters for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeoKeyFilter (StringFilter[] value) throws ServiceException {
    this.GeoKey = value;
  }
  /** Retrieve filter for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeoKeyFilter () {
    return this.GeoKey;
  }

  /**
   * Retrieves the GeoKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GeoKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GeoKeyFilter field
   */
  public String[] getGeoKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGeoKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeoKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeoKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeoKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GeoKeyFilter filter value from a formatted string
   *
   * @param _value the GeoKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GeoKeyFilter filter field
   */
  public void setGeoKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGeoKeyFilterFromFormattedString");
    try {
      this.setGeoKeyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeoKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeoKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeoKeyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch) {
    this.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch () {
    return this.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value) {
    this.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder () {
    return this.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending) {
    this.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection () {
    return this.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter () {
    return this.MktCode;
  }

  /**
   * Retrieves the MktCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MktCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCodeFilter field
   */
  public String[] getMktCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMktCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MktCodeFilter filter value from a formatted string
   *
   * @param _value the MktCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MktCodeFilter filter field
   */
  public void setMktCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFilterFromFormattedString");
    try {
      this.setMktCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFilterFromFormattedString");
  }

  public String toString() {
    return BillInsertGroupMapObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillInsertGroupMapObjectKeyHelper.toMap(this, null);
  }
}
