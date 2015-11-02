/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupObjectKeyFilter.java
 * Definition File: Admin/BillInsertGroup.xml
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

/** Key Filter for BillInsertGroupObject object. */
public class BillInsertGroupObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: INSERT_GRP_ID_VALUES.insert_grp_id) */
  public    IntegerFilter[] InsertGrpId  = null;
  protected boolean InsertGrpIdFetch = false;
  protected boolean InsertGrpIdSortAscending = true;
  protected Integer InsertGrpIdSort = null;
  /** raw field for: INSERT_GRP_ID_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "BillInsertGroupObjectKeyFilter";
  /** default constructor */
  public BillInsertGroupObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public BillInsertGroupObjectKeyFilter (BillInsertGroupObjectKeyFilter other)
  {
    if (other == null) return;
    this.InsertGrpId = other.InsertGrpId;
    this.InsertGrpIdFetch = other.InsertGrpIdFetch;
    this.InsertGrpIdSort = other.InsertGrpIdSort;
    this.InsertGrpIdSortAscending = other.InsertGrpIdSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertGrpIdFetch (boolean fetch) {
    this.InsertGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertGrpIdFetch () {
    return this.InsertGrpIdFetch;
  }
  /** Set the SortOrder for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertGrpIdSortOrder (Integer value) {
    this.InsertGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertGrpIdSortOrder () {
    return this.InsertGrpIdSort;
  }
  /** Set the sort direction for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertGrpIdSortDirection (boolean ascending) {
    this.InsertGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertGrpIdSortDirection () {
    return this.InsertGrpIdSortAscending;
  }
  /** Set the field level filters for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertGrpId = value;
  }
  /** Retrieve filter for field: InsertGrpId (INSERT_GRP_ID_VALUES.insert_grp_id)
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

  /** Set the field level Fetch value for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (INSERT_GRP_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  public String toString() {
    return BillInsertGroupObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillInsertGroupObjectKeyHelper.toMap(this, null);
  }
}
