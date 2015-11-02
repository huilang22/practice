/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityRoleObjectKeyFilter.java
 * Definition File: Admin/SecurityRole.xml
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

/** Key Filter for SecurityRoleObject object. */
public class SecurityRoleObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: SEC_FX_ROLE_VALUES.frv_role_id) */
  public    BigIntegerFilter[] FrvRoleId  = null;
  protected boolean FrvRoleIdFetch = false;
  protected boolean FrvRoleIdSortAscending = true;
  protected Integer FrvRoleIdSort = null;
  /** raw field for: SEC_FX_ROLE_VALUES.frv_language_code) */
  public    IntegerFilter[] FrvLanguageCode  = null;
  protected boolean FrvLanguageCodeFetch = false;
  protected boolean FrvLanguageCodeSortAscending = true;
  protected Integer FrvLanguageCodeSort = null;
  private String _objName = "SecurityRoleObjectKeyFilter";
  /** default constructor */
  public SecurityRoleObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public SecurityRoleObjectKeyFilter (SecurityRoleObjectKeyFilter other)
  {
    if (other == null) return;
    this.FrvRoleId = other.FrvRoleId;
    this.FrvRoleIdFetch = other.FrvRoleIdFetch;
    this.FrvRoleIdSort = other.FrvRoleIdSort;
    this.FrvRoleIdSortAscending = other.FrvRoleIdSortAscending;
    this.FrvLanguageCode = other.FrvLanguageCode;
    this.FrvLanguageCodeFetch = other.FrvLanguageCodeFetch;
    this.FrvLanguageCodeSort = other.FrvLanguageCodeSort;
    this.FrvLanguageCodeSortAscending = other.FrvLanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvRoleIdFetch (boolean fetch) {
    this.FrvRoleIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvRoleIdFetch () {
    return this.FrvRoleIdFetch;
  }
  /** Set the SortOrder for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvRoleIdSortOrder (Integer value) {
    this.FrvRoleIdSort = value;
  }
  /** Retrieve SortOrder for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvRoleIdSortOrder () {
    return this.FrvRoleIdSort;
  }
  /** Set the sort direction for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvRoleIdSortDirection (boolean ascending) {
    this.FrvRoleIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvRoleIdSortDirection () {
    return this.FrvRoleIdSortAscending;
  }
  /** Set the field level filters for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvRoleIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FrvRoleId = value;
  }
  /** Retrieve filter for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFrvRoleIdFilter () {
    return this.FrvRoleId;
  }

  /**
   * Retrieves the FrvRoleIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvRoleIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvRoleIdFilter field
   */
  public String[] getFrvRoleIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvRoleIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvRoleIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvRoleIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvRoleIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvRoleIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvRoleIdFilter filter value from a formatted string
   *
   * @param _value the FrvRoleIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvRoleIdFilter filter field
   */
  public void setFrvRoleIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvRoleIdFilterFromFormattedString");
    try {
      this.setFrvRoleIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvRoleIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvRoleIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvRoleIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvLanguageCodeFetch (boolean fetch) {
    this.FrvLanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvLanguageCodeFetch () {
    return this.FrvLanguageCodeFetch;
  }
  /** Set the SortOrder for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvLanguageCodeSortOrder (Integer value) {
    this.FrvLanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvLanguageCodeSortOrder () {
    return this.FrvLanguageCodeSort;
  }
  /** Set the sort direction for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvLanguageCodeSortDirection (boolean ascending) {
    this.FrvLanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvLanguageCodeSortDirection () {
    return this.FrvLanguageCodeSortAscending;
  }
  /** Set the field level filters for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.FrvLanguageCode = value;
  }
  /** Retrieve filter for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFrvLanguageCodeFilter () {
    return this.FrvLanguageCode;
  }

  /**
   * Retrieves the FrvLanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvLanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvLanguageCodeFilter field
   */
  public String[] getFrvLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvLanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvLanguageCodeFilter filter value from a formatted string
   *
   * @param _value the FrvLanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvLanguageCodeFilter filter field
   */
  public void setFrvLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvLanguageCodeFilterFromFormattedString");
    try {
      this.setFrvLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvLanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvLanguageCodeFilterFromFormattedString");
  }

  public String toString() {
    return SecurityRoleObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityRoleObjectKeyHelper.toMap(this, null);
  }
}
